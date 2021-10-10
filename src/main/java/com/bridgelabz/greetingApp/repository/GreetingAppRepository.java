package com.bridgelabz.greetingApp.repository;

import com.bridgelabz.greetingApp.model.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface GreetingAppRepository extends JpaRepository<Greeting, Integer> {
}