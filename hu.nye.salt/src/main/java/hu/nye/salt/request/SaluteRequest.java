package hu.nye.salt.request;

import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class SaluteRequest {
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
