package com.melvault.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.melvault.Entity.Employee;

@Repository
public interface Emprepository extends JpaRepository<Employee, Integer> {

}
