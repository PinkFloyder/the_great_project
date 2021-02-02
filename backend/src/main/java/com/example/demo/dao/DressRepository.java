package com.example.demo.dao;

import com.example.demo.entity.Dress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DressRepository extends JpaRepository<Dress, Integer> {

}
