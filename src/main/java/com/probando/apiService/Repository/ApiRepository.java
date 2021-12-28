package com.probando.apiService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.probando.apiService.modelo.Tarea;



public interface ApiRepository extends JpaRepository<Tarea,Long> {

}
