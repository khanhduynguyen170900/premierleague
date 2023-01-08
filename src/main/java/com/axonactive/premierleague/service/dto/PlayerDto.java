package com.axonactive.premierleague.service.dto;

import com.axonactive.premierleague.enums.FootednessEnum;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class PlayerDto {
    private Long id;
    private String name;
    private LocalDate dob;
    private int height;
    private int weight;
    private FootednessEnum footedness;
}
