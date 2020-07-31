package com.onboarding.abstractfactory.builders;

import com.onboarding.abstractfactory.factory.AbstractDataBaseFactory;
import com.onboarding.abstractfactory.services.DatabaseService;


import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Component;

@Description(value = "Product builder component.")
@Component
public class ProductBuilder {

    public void buildProduct(AbstractDataBaseFactory productFactory)
    {
        DatabaseService productService = productFactory.createDatabase();
        productService.setTitle(" prueba");
        productService.calculateSomething();
        
        
    }

}
