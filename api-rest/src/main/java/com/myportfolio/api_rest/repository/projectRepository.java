package com.myportfolio.api_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myportfolio.api_rest.entity.project;

@Repository
public interface projectRepository extends JpaRepository<project,Integer>{

    

}
