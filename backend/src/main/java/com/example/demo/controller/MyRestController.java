package com.example.demo.controller;

import com.example.demo.entity.Dress;
import com.example.demo.service.DressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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

}
