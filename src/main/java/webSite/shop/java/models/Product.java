package webSite.shop.java.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="product")
public class Product extends Model {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2361829432293191046L;
	
	
	
	@Column(name="title", length= 100)
	private String title;
	
	@Column(name="count")
	private int count;
	
	@Column(name="description", length= 1024)
	private String description;
	
	@Column(name="price")
	private BigDecimal price;
	
	
	@ManyToOne
	@JoinColumn(name="product_category_id")
	private ProductCategory productCategory;
	
	public Product(){
		super();
	}
	
public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public ProductCategory getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}

public Product(Long id){
		super(id);
	}

}
