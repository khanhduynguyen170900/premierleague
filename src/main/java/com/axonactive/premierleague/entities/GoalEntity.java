package com.axonactive.premierleague.entities;

import com.axonactive.premierleague.enums.StyleEnum;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "goal")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GoalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "match_id")
    @NotNull
    private MatchEntity matchEntity;

    @ManyToOne
    @JoinColumn(name = "player_score_id")
    @NotNull
    private PlayerEntity playerScoreEntity;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "style")
    private StyleEnum styleEnum;

    @ManyToOne
    @JoinColumn(name = "player_assist_id")
    private PlayerEntity playerAssistEntity;

    private int minTime;
}
