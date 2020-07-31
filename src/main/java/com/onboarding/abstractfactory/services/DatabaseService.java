package com.onboarding.abstractfactory.services;

import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Description;

import com.onboarding.crud.entity.Producto;

@Description(value = "Definition of product methods.")
public interface DatabaseService {

    void setTitle(String title);
    void calculateSomething();
    List<Producto> list ();
	void save(Producto producto);
	void delete(int id);
	boolean existById(int id);
	boolean existByNombre(String nombre);
	Optional<Producto> getOne (int id);
	Optional<Producto> getByNombre(String nombre);

}
