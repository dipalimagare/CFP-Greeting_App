package com.bridgelabz.greetingApp.service;

import com.bridgelabz.greetingApp.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;

public interface IGreetingService {
    @Autowired
    Greeting addGreeting(User user);

    //Optional<Greeting> findById(int id);

    List<Greeting> getAll();

    Optional<Greeting> editGreetingById(int id, String name);

    void delete(int id);
}