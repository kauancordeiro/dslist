package com.cordeiro.dslist.services;

import com.cordeiro.dslist.dto.GameMinDTO;
import com.cordeiro.dslist.entities.Game;
import com.cordeiro.dslist.repositories.GameRepository;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServices {

    @Autowired
    private GameRepository gameRepository;
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}
