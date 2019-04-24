package com.example.demo.dao;


import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Student;
import com.example.demo.entity.University;

//import javax.persistence.criteria.CriteriaUpdate;

public interface StudentDao extends JpaRepository<Student, Integer>
{
   public List<Student> findByReg(int reg);
   public List<Student> findByUniUnid(int unid);
}
