package pl.slowacki.Vapor.controller;

import org.springframework.web.bind.annotation.*;
import pl.slowacki.Vapor.dto.Game;

import java.util.HashMap;
import java.util.Map;

@RestController
public class GameController {
    private Map<String, Game> games = new HashMap<>();

    @PostMapping("/games/add")
    public String addGame (@RequestBody Game game){
        if (games.containsKey(game.getName())) {
            return "Game " + game.getName() + " is already added.";
        }
        else {
            games.put(game.getName(), game);
            return "Added game " + game.getName();
        }
    }

    @GetMapping("/games")
    public Map<String, Game> getGames(){
        return games;
    }

    @DeleteMapping("/games/{name}")
    public String deleteGame(@PathVariable String name){
        if (games.containsKey(name)) {
            games.remove(name);
            return "Removed game " + name;
        }
        else {
            return "There is no such game as " + name + "!";
        }
    }
}
