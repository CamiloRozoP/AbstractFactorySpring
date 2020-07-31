package com.onboarding.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onboarding.crud.entity.Producto;

import java.util.Optional;

@Repository

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
Optional<Producto> findByNombre (String nombre);
boolean existsByNombre(String nombre);


}
