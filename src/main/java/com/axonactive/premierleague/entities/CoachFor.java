package com.axonactive.premierleague.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

class CoachForId implements Serializable {
    private CoachEntity coachEntity;

    private ClubEntity clubEntity;

    public CoachForId(CoachEntity coachEntity, ClubEntity clubEntity) {
        this.coachEntity = coachEntity;
        this.clubEntity = clubEntity;
    }
}

@Entity
@Table(name = "coach_for")
@IdClass(CoachForId.class)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CoachFor {
    @Id
    @OneToOne
    @JoinColumn(name = "coach_id")
    private CoachEntity coachEntity;

    @Id
    @ManyToOne
    @JoinColumn(name = "clud_id")
    private ClubEntity clubEntity;

    private Long salary;

    private LocalDate attendDate;
}
