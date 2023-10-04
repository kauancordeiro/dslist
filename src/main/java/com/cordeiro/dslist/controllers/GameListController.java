package com.cordeiro.dslist.controllers;

import com.cordeiro.dslist.dto.GameDTO;
import com.cordeiro.dslist.dto.GameListDTO;
import com.cordeiro.dslist.dto.GameMinDTO;
import com.cordeiro.dslist.services.GameListServices;
import com.cordeiro.dslist.services.GameServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    @Autowired
    private GameListServices gameListServices;

    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListServices.findAll();
        return result;
    }

}
