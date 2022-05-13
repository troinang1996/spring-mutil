package java.com.laptrinh.dao.impl;

import com.laptrinh.dao.ICategoryDAO;
import org.springframework.stereotype.Repository;


import java.com.laptrinh.model.CategoryModel;
import java.com.laptrinh.repository.CategoryRepositoryJPA;

@Repository
public class ImplCategory extends ImplGarenalDAO<CategoryModel, Integer> implements ICategoryDAO<CategoryModel, Integer> {

    CategoryRepositoryJPA categoryRepositoryJPA;

    public ImplCategory(CategoryRepositoryJPA categoryRepositoryJPA) {

        this.categoryRepositoryJPA = categoryRepositoryJPA;
    }
}
