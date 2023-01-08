package com.axonactive.premierleague.entities;

import com.axonactive.premierleague.enums.PositionEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

class PlayForId implements Serializable {
    private PlayerEntity playerEntity;

    private ClubEntity clubEntity;

    public PlayForId(PlayerEntity playerEntity, ClubEntity clubEntity) {
        this.playerEntity = playerEntity;
        this.clubEntity = clubEntity;
    }
}

@Entity
@Table(name = "play_for")
@IdClass(PlayForId.class)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlayForEntity {
    @Id
    @OneToOne
    @JoinColumn(name = "player_id")
    private PlayerEntity playerEntity;

    @Id
    @ManyToOne
    @JoinColumn(name = "clud_id")
    private ClubEntity clubEntity;

    private int numberShirt;

    private Long salary;

    private LocalDate attendDate;

    private Long valueAtAttendDate;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "position")
    private PositionEnum positionEnum;
}
