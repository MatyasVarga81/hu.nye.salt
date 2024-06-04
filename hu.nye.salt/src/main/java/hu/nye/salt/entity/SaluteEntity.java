package hu.nye.salt.entity;

import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import org.springframework.data.annotation.Id;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class SaluteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    private String size;

    @NotEmpty
    private String activity;

    @NotEmpty
    private String location;

    @NotEmpty
    private String unit;

    @NotEmpty
    private String time;

    @NotEmpty
    private String equipment;

    @JsonFormat(pattern = "hh:ss")
    private LocalTime registrationTime;
}
