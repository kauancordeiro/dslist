package com.cordeiro.dslist.repositories;

import com.cordeiro.dslist.entities.Game;
import com.cordeiro.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList,Long> {
}
