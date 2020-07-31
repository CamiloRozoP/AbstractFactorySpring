package com.onboarding.abstractfactorycom;

import com.onboarding.abstractfactory.builders.ProductBuilder;
import com.onboarding.abstractfactory.factory.AbstractDataBaseFactory;
import com.onboarding.abstractfactory.factory.impls.RedisDatabaseFactoryImpl;
import com.onboarding.abstractfactory.factory.impls.SqlDatabaseFactoryImpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

public class FactorypatternApplication {

	private static String dataBaseType = "REDIS";

	public static void main(String[] args)
	{
		// run application...
		SpringApplication.run(FactorypatternApplication.class, args);

		// product builder instance
		ProductBuilder productBuilder = new ProductBuilder();

		// deciding which product implementation to use...
		AbstractDataBaseFactory abstractProductFactory;
		abstractProductFactory = new SqlDatabaseFactoryImpl();
		
		if (dataBaseType.contentEquals("REDIxs")) {
			abstractProductFactory = new RedisDatabaseFactoryImpl();
		}
		else {
			abstractProductFactory = new SqlDatabaseFactoryImpl();
		}

		// build product...
		productBuilder.buildProduct(abstractProductFactory);
	}
}
