package com.onboarding.abstractfactory.factory.impls;

import com.onboarding.abstractfactory.factory.AbstractDataBaseFactory;
import com.onboarding.abstractfactory.services.DatabaseService;
import com.onboarding.abstractfactory.services.impls.RedisDatabaseServiceImpl;
import com.onboarding.crud.entity.Producto;

import org.springframework.context.annotation.Description;

import org.springframework.stereotype.Service;

@Description(value = "Concrete implementation of product factory.")
@Service
public class RedisDatabaseFactoryImpl implements AbstractDataBaseFactory {

    @Override
    public DatabaseService createDatabase() {


    	return null;
    }
}
