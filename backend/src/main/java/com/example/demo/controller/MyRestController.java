package com.example.demo.controller;

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
        return dressService.getAllDress();
    }

    @RequestMapping("/getById")
    private Dress getById(int id) {
        return dressService.getDressById(id);
    }

    @RequestMapping("/getByColor")
    private List<Dress> getDressByColors(@RequestParam("color") String[] color) {
        return dressService.getDressByColor(color);
    }

    @RequestMapping("/getBySize")
    private List<Dress> getDressBySize(@RequestParam("size") int[] size) {
        return dressService.getDressBySize(size);
    }

    @RequestMapping("/getBySizeAndColor")
    private List<Dress> getDressBySizeAndColor(@RequestParam("size") int[] size,
                                               @RequestParam("color") String[] color) {
        return dressService.getDressBySizeAndColor(size, color);
    }

}
