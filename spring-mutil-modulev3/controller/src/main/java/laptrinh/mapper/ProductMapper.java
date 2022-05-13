package laptrinh.mapper;


import com.laptrinh.entities.Product;
import laptrinh.dto.ProductDTO;

public class ProductMapper {
    public static ProductDTO toDTO(Product product) {
        if (product == null) {
            return null;
        }
        ProductDTO ProductDTO = new ProductDTO();
        ProductDTO.setId(product.getId());
        ProductDTO.setName(product.getName());
        ProductDTO.setProductDate(product.getProductDate());
        ProductDTO.setAvailable(product.getAvailable());
        ProductDTO.setDescription(product.getDescription());
        ProductDTO.setDiscount(product.getDiscount());
        ProductDTO.setCategoryID(product.getCategoryID());
        ProductDTO.setImage(product.getImage());
        ProductDTO.setQuantity(product.getQuantity());
        ProductDTO.setUnitPrice(product.getUnitPrice());
        ProductDTO.setViewCount(product.getViewCount());
        return ProductDTO;
    }
}
