package hu.nye.salt.repository;

import hu.nye.salt.model.Salute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class SaluteRepository {
    private final Salute salute;

    @Autowired
    public SaluteRepository(@Qualifier("createLoggedSalute")Salute salute) {
        this.salute = salute;
    }
    public Salute getLoggedSalute(){
        return salute;
    }

    public String getLoggedSaluteReport(){
        return salute.getTime();
    }
}