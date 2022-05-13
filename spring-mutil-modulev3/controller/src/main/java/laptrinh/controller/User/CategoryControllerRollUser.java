package laptrinh.controller.User;


import com.laptrinh.entities.Category;
import com.laptrinh.service.impl.ImplCategoryService;

import laptrinh.dto.CategoryDTO;
import laptrinh.mapper.CategoryMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/category")
public class CategoryControllerRollUser {

    ImplCategoryService implCategoryService;
    @GetMapping("/getall")
    public ResponseEntity<CategoryDTO[]> getAllCategory(){

        List<Category> categoryList = implCategoryService.findAll();

        List<CategoryDTO> categoryDTOList = categoryList.stream().map(CategoryMapper::toDTO).collect(Collectors.toList());

        return ResponseEntity.ok().body(categoryDTOList.stream().toArray(CategoryDTO[]::new));
    }
    @GetMapping("")
    public String test(){
        return "hello";
    }

}
