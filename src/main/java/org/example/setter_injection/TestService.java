package org.example.constructor_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    //this is an example of constructor injection
    private final TestRepository repository;

    @Autowired
    public TestService(TestRepository  repository) {
        this.repository = repository;
    }

    public void performService() {
        repository.doSomething();
    }
}