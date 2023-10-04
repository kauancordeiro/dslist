package com.cordeiro.dslist.services;

import com.cordeiro.dslist.dto.GameDTO;
import com.cordeiro.dslist.dto.GameListDTO;
import com.cordeiro.dslist.dto.GameMinDTO;
import com.cordeiro.dslist.entities.Game;
import com.cordeiro.dslist.entities.GameList;
import com.cordeiro.dslist.repositories.GameListRepository;
import com.cordeiro.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListServices {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
