package org.example.feild_injection;

import org.example.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    //this is an example of f
    @Autowired
    private TestRepository repository;

    public void performService() {
        repository.doSomething();
    }
}