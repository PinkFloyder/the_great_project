package com.example.demo.dao;

import com.example.demo.entity.Dress;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DressRepository extends JpaRepository<Dress, Integer> {

    public List<Dress> getDressesByColorIn(String[] color);

}
