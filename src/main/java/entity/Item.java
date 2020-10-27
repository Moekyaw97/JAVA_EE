package entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity

public class Item implements Serializable {

	@Id
	private int id;
	private int price;
	private String name;
	
	@OneToMany(mappedBy = "item")
	private List<Orderdetail> orderdetails;
	private static final long serialVersionUID = 1L;

	public Item() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
