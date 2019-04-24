package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.demo.entity.University;

@Component
public interface UniversityDao extends JpaRepository<University, Integer>
{
  List<University> findByUnid(int unid);
}
