package com.cordeiro.dslist.dto;

import com.cordeiro.dslist.entities.GameList;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO(GameList gameList){
        id = gameList.getId();
        name = gameList.getName();
    }


}
