package com.myportfolio.api_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myportfolio.api_rest.entity.techno;

@Repository
public interface technoRepository extends JpaRepository<techno,Integer>{

}
