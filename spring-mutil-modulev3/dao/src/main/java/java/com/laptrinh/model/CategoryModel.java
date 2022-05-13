package java.com.laptrinh.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "Categories")
public class CategoryModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;

	String name;
	@NotBlank(message = "Không được bỏ trống tên loại sản phẩm Tiếng Việt")
	String nameVN;


//	@OneToMany(mappedBy = "categoryModel", fetch = FetchType.EAGER)
//	List<ProductModel> productsModel;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameVN() {
		return nameVN;
	}

	public void setNameVN(String nameVN) {
		this.nameVN = nameVN;
	}

//	public List<ProductModel> getProductsModel() {
//		return productsModel;
//	}
//
//	public void setProductsModel(List<ProductModel> productsModel) {
//		this.productsModel = productsModel;
//	}
}
