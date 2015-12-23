package webSite.shop.java.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="product_category")
public class ProductCategory extends Model{

	
	@Column(name="title", length=55)
	private String title;
	
	
	@OneToMany(mappedBy="productCategory", cascade= CascadeType.ALL, orphanRemoval=true)
	private Set<Product> products = new HashSet<>();
	
	
	public Set<Product> getProducts() {
		return products;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	private static final long serialVersionUID = 4714481623524894822L;
	public ProductCategory(){
		
		super();
	}
	
public ProductCategory(Long id){
		
		super();
	}

}
