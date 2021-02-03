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
        List<Dress> listAllDress = dressRepository.findAll();
        return listAllDress;
    }

    @Override
    public Dress getDressById(int id) {
        Dress dress = dressRepository.getOne(id);
        return dress;
    }
}
