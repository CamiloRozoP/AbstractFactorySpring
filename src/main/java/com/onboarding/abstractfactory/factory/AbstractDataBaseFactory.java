package com.onboarding.abstractfactory.factory;

import org.springframework.context.annotation.Description;

import com.onboarding.abstractfactory.services.DatabaseService;

@Description(value = "Product Factory - Creational Factory.")
public interface AbstractDataBaseFactory {

    DatabaseService createDatabase();

}
