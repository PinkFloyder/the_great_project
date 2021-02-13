package com.example.demo.service;

import com.example.demo.dao.DressRepository;
import com.example.demo.entity.Dress;
import com.example.demo.entity.Size;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    @Override
    public List<Dress> getDressBySize(int[] size) {
        Set<Integer> set = new HashSet<>();
        List<Dress> allResults = new ArrayList<>();
        for (int i = 0; i < size.length; i++) {
            List<Dress> dresses = dressRepository.findDressesBySizesContains(new Size(size[i]));
            for (Dress dress : dresses) {
                if (!set.contains(dress.getCatalog_id())) {
                    set.add(dress.getCatalog_id());
                    allResults.add(dress);
                }
            }
        }
        return allResults;
    }
}
