package com.example.demo.service;

import com.example.demo.entity.TestEntity;
import com.example.demo.repo.TestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class TestService {

    @Autowired
    private TestRepo repo;

    public List<TestEntity> get(){
        return repo.findAll();
    }

    @PostConstruct
    public void init(){
        TestEntity entity = new TestEntity();
        entity.setName("TEST");
        repo.save(entity);
    }
}
