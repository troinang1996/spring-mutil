package com.laptrinh.config;

import com.laptrinh.dao.ICategoryDAO;
import com.laptrinh.dao.IGarenalDAO;
import com.laptrinh.dao.IProductDAO;
import com.laptrinh.service.ICategoryService;
import com.laptrinh.service.ICookieService;
import com.laptrinh.service.impl.ImplCategoryService;
import com.laptrinh.service.impl.ImplProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.com.laptrinh.dao.impl.ImplCategory;
import java.com.laptrinh.dao.impl.ImplGarenalDAO;
import java.com.laptrinh.repository.CategoryRepositoryJPA;
import java.com.laptrinh.repository.GarenalRepositoryJPA;

@Configuration
public class Config {
//    @Bean
//    public ImplProductService productService(IProductDAO productDAO, ICookieService cookieService){
//        return new ImplProductService(productDAO, cookieService);
//
//    }
//    @Bean
//    public IProductDAO productDAO(ProductRepositoryJPA productRepositoryJPA){
//        return new ImplProductDAO(productRepositoryJPA);
//
//    }
    @Bean
    public ICategoryDAO categoryDAO(CategoryRepositoryJPA categoryRepositoryJPA){
        return new ImplCategory(categoryRepositoryJPA);
    }
    @Bean
    public IGarenalDAO garenalDAO(GarenalRepositoryJPA garenalRepositoryJPA){
        return new ImplGarenalDAO(garenalRepositoryJPA);
    }
}
