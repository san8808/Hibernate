package hibernateCode;

import javax.persistence.*;


@Entity
@Table(name="product_det")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int product_id;
	@Column(name="product_name",length=20)
	private String product_name;
	@Column
	private int product_price;
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getProduct_price() {
		return product_price;
	}
	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}

}
