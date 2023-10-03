package com.cordeiro.dslist.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.Delegate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "tb_game_list")
public class GameList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;


}
