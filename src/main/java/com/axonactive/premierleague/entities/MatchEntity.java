package com.axonactive.premierleague.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "match")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MatchEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "club1_id")
    @NotNull
    private ClubEntity club1Entity;

    @ManyToOne
    @JoinColumn(name = "club2_id")
    @NotNull
    private ClubEntity club2Entity;

    @NotNull
    @Column(nullable = false)
    private int numberGoalClub1;

    @NotNull
    @Column(nullable = false)
    private int numberGoalClub2;

    @ManyToOne
    @JoinColumn(name = "stadium_id")
    @NotNull
    private StadiumEntity stadiumEntity;
}
