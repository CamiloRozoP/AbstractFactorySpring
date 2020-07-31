package com.onboarding.abstractfactory.services.impls;

import com.onboarding.abstractfactory.services.DatabaseService;
import com.onboarding.crud.entity.Producto;
import com.onboarding.crud.repository.ProductoRepository;

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Service;

@Description(value = "SecondProduct service implementation.")

@Transactional
@Service
public class SqlDatabaseServiceImpl implements DatabaseService {
	 @Autowired //permite la inyeccion
	    ProductoRepository productoRepository;

    private final Logger logger = LoggerFactory.getLogger(SqlDatabaseServiceImpl.class);

    @Override
    public void setTitle(String title) {
        logger.info(title+"Esta es la base de datos MYSQL");
    }

    @Override
    public void calculateSomething() {
        logger.info("PRESENTE EN SQL");
    }

	@Override
	public List<Producto> list() {
		 return productoRepository.findAll();
	}

	public void save(Producto producto) {
		 productoRepository.save(producto);
		
	}

	@Override
	public void delete(int id) {
		 productoRepository.deleteById(id);
		
	}

	@Override
	public boolean existById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean existByNombre(String nombre) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Optional<Producto> getOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Producto> getByNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

}
