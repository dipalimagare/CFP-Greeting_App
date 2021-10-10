package com.bridgelabz.greetingApp.controller;

import com.bridgelabz.greetingApp.model.*;
import com.bridgelabz.greetingApp.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RequestMapping
@RestController
public class GreetingAppController {
    // CRUD
    //read
    //creating
    //updating
    //deleting

    private static final String template = "Hello, %s!";

    @Autowired
    private IGreetingService iGreetingService;

    @GetMapping(value = {"/home"})
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        User user = new User();
        user.setFirstName(name);
        return iGreetingService.addGreeting(user);
    }

    @PostMapping("/fullName")
    public Greeting sayWow(@RequestBody User user) {
        return iGreetingService.addGreeting(user);
    }

    @GetMapping("/all")
    public List<Greeting> getAll() {
        return iGreetingService.getAll();
    }

    @PutMapping("/editGreeting/{id}")
    public Optional<Greeting> editGreetingById(@PathVariable("id") int id, @RequestParam(value = "name") String name) {
        return iGreetingService.editGreetingById(id, name);
    }

    @DeleteMapping("/delete")
    public void deleteByID(@RequestParam(name = "id") int id) {
        iGreetingService.delete(id);
    }
}