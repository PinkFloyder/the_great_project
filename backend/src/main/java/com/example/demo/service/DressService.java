package com.example.demo.service;

import com.example.demo.dao.DressRepository;
import com.example.demo.entity.Dress;
import com.example.demo.entity.Size;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

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
        for (int j : size) {
            List<Dress> dresses = dressRepository.findDressesBySizesContains(new Size(j));
            for (Dress dress : dresses) {
                if (!set.contains(dress.getCatalog_id())) {
                    set.add(dress.getCatalog_id());
                    allResults.add(dress);
                }
            }
        }
        return allResults;
    }

    @Override
    public List<Dress> getDressBySizeAndColor(int[] size, String[] color) {
        List<Dress> dressSize = getDressBySize(size);

        return dressSize.stream()
                .filter(x -> Arrays.stream(color)
                        .anyMatch(y -> x.getColor().equals(y)))
                .collect(Collectors.toList());
    }
}
