package com.bridgelabz.greetingApp.service;

import com.bridgelabz.greetingApp.model.*;
import com.bridgelabz.greetingApp.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public abstract class GreetingService implements IGreetingService{
    private static final String template = "Hello, %s!";

    @Autowired
    private GreetingAppRepository greetingRepository;


    public Greeting addGreeting(User user) {
        String message = String.format(template, (user.toString().isEmpty()) ? "Hello World" : user.toString());
        return greetingRepository.save(new Greeting(message));
    }


    public Optional<Greeting> findById(int id) {
        return greetingRepository.findById(id);
    }

    public List<Greeting> getAll() {
        return greetingRepository.findAll();
    }


    public Optional<Greeting> editGreetingById(int id, String name) {
        Optional<Greeting> particularGreeting = greetingRepository.findById(id);
        particularGreeting.get().setMessage(name);
        return particularGreeting;
    }


    public void delete(int id) {
        greetingRepository.deleteById(id);
    }
}