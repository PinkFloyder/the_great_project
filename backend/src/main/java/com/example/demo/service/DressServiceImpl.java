package com.example.demo.service;

import com.example.demo.entity.Dress;

import java.util.List;

public interface DressServiceImpl {

    List<Dress> getAllDress();

    Dress getDressById(int id);

    List<Dress> getDressByColor(String[] color);

    List<Dress> getDressBySize(int[] size);

    List<Dress> getDressBySizeAndColor(int[] size, String[] color);

}
