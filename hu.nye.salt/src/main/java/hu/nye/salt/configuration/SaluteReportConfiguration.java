package hu.nye.salt.configuration;

import hu.nye.salt.model.Salute;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "application.properties")
@Slf4j
public class SaluteReportConfiguration {

    @org.springframework.beans.factory.annotation.Value("${salute.size}")
    private String size;

    @org.springframework.beans.factory.annotation.Value("${salute.activity}")
    private String activity;

    @org.springframework.beans.factory.annotation.Value("${salute.location}")
    private String location;

    @org.springframework.beans.factory.annotation.Value("${salute.unit}")
    private String unit;

    @org.springframework.beans.factory.annotation.Value("${salute.time}")
    private String time;

    @Value("${salute.equipment}")
    private String equipment;

    @Bean
    public Salute createLoggedSalute(){
        log.info("Logged salute: {} {} {} {} {} {}", size, activity, location, unit, time, equipment);
        return new Salute (size, activity, location, unit, time, equipment);
    }
}
