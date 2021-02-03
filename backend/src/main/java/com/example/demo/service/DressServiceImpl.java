package com.example.demo.service;

import com.example.demo.entity.Dress;

import java.util.List;

public interface DressServiceImpl {

    public List<Dress> getAllDress();

    public Dress getDressById(int id);

}
