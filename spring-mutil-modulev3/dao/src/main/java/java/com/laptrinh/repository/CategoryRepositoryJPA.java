package java.com.laptrinh.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import java.com.laptrinh.model.CategoryModel;

public interface CategoryRepositoryJPA extends JpaRepository<CategoryModel, Integer> {
}
