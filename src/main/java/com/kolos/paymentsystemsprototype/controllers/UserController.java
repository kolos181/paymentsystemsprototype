package com.kolos.paymentsystemsprototype.controllers;

import com.kolos.paymentsystemsprototype.entity.User;
import com.kolos.paymentsystemsprototype.services.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable(value = "id") Long id) {
        return userService.getOne(id);
    }

    @PutMapping
    public User editUser(@RequestBody User user) {
        return userService.save(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable(value = "id") Long id) {
        userService.deleteById(id);
    }
}
