package com.example.demo.controller;

import com.example.demo.dao.DressRepository;
import com.example.demo.entity.Dress;
import com.example.demo.service.DressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestController {

    @Autowired
    private DressServiceImpl dressService;

    @RequestMapping("/getAll")
    private List<Dress> getAllDress() {
        List<Dress> dressList = dressService.getAllDress();
        return dressList;
    }

    @RequestMapping("/getById")
    private Dress getById(int id) {
        Dress dress = dressService.getDressById(id);
        return dress;
    }

    @RequestMapping("/getByColor")
    private List<Dress> getDressByColors(@RequestParam("color") String[] color) {
        List<Dress> dressList = dressService.getDressByColor(color);
        return dressList;
    }
}
