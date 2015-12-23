package webSite.shop.java.models;

import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="order")
public class Order extends Model{
	
	
	private static final long serialVersionUID = -3260255695601691264L;
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id", referencedColumnName = "id")
	private User user;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="product_id", referencedColumnName = "id")
	   private Product product;
	   
	   @Column(name="date")
	   private GregorianCalendar calendar;

	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(Long id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public GregorianCalendar getCalendar() {
		return calendar;
	}
	public void setCalendar(GregorianCalendar calendar) {
		this.calendar = calendar;
	}
	
}