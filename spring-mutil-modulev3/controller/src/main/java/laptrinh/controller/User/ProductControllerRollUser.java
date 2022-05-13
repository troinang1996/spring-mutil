package laptrinh.controller.User;


import com.laptrinh.entities.Product;
import com.laptrinh.service.IProductService;

import laptrinh.dto.ProductDTO;
import laptrinh.mapper.ProductMapper;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/products")
public class ProductControllerRollUser {

    IProductService iProductService;

    @GetMapping("")
    public ResponseEntity<ProductDTO[]> getAllProduct(){
        List<Product> productLists = iProductService.findAll();

        List<ProductDTO> productDTOList = productLists.stream().map(ProductMapper::toDTO).collect(Collectors.toList());


        return ResponseEntity.ok().body(productDTOList.stream().toArray(ProductDTO[]::new));
    }
}
