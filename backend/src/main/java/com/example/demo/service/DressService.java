package com.example.demo.service;

import com.example.demo.dao.DressRepository;
import com.example.demo.entity.Dress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DressService implements DressServiceImpl{

    @Autowired
    private DressRepository dressRepository;

    @Override
    public List<Dress> getAllDress() {
        return dressRepository.findAll();
    }

    @Override
    public Dress getDressById(int id) {
        return dressRepository.getOne(id);
    }

    @Override
    public List<Dress> getDressByColor(String[] color) {
        return dressRepository.getDressesByColorIn(color);
    }
}
