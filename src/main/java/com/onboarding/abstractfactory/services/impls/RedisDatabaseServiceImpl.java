package com.onboarding.abstractfactory.services.impls;

import com.onboarding.abstractfactory.services.DatabaseService;
import com.onboarding.crud.entity.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Description;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Service;

@Description(value = "FirstProduct implementation.")
@Service
public class RedisDatabaseServiceImpl implements DatabaseService {

	private static final String KEY = "producto";
	private RedisTemplate<String, Object> redisTemplate;
	private HashOperations<String, Integer, Producto> hashOperations;

	@Autowired
	private RedisDatabaseServiceImpl(RedisTemplate<String, Object> redisTemplate){
		this.redisTemplate = redisTemplate;
	}

	@PostConstruct
	private void initializeHashOperations() {
		hashOperations = redisTemplate.opsForHash();
	}
	
	@Override
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculateSomething() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Producto> list() {
		Map<Integer, Producto> map = hashOperations.entries(KEY);
		List<Producto> list = new ArrayList<Producto>(map.values());
		return list;
	}

	@Override
	public void save(Producto producto) {
		// TODO Auto-generated method stub
		hashOperations.put(KEY, producto.getId(), producto);
		
		
	}

	@Override
	public void delete(int id) {
		hashOperations.delete(KEY, id);
		
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
