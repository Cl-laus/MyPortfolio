package com.myportfolio.api_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myportfolio.api_rest.entity.Techno;

@Repository
public interface TechnoRepository extends JpaRepository<Techno,Integer>{

}
