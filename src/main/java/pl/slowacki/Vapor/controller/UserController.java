package pl.slowacki.Vapor.controller;

import org.springframework.web.bind.annotation.*;
import pl.slowacki.Vapor.dto.User;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    private Map<String, User> users = new HashMap<>();

    @PostMapping("/users/add")
    public String addUser(@RequestBody User user) {
        users.put(user.getName(), user);
        return "Added user " + user.getName();
    }

    @GetMapping("/users")
    public Map<String, User> getUsers() {
        return users;
    }

    @DeleteMapping("/users/delete")
    public String deleteUser(@RequestParam String name) {
        users.remove(name);
        return "Removed user " + name;
    }

}
