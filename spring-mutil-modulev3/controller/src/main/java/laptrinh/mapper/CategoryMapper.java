package laptrinh.mapper;


import com.laptrinh.entities.Category;
import laptrinh.dto.CategoryDTO;

public class CategoryMapper {
    public static CategoryDTO toDTO(Category category) {
        if (category == null) {
            return null;
        }
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setId(category.getId());
        categoryDTO.setName(category.getName());
        categoryDTO.setNameVN(category.getNameVN());
        return categoryDTO;
    }
}
