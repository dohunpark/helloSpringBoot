package kr.ac.hansung.cse.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4669709042363663882L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "category")
	private String category;
	
	@Column(name = "price")
	private int price;
	
	@Column(name = "manufacturer")
	private String manufacturer;
	
	@Column(name = "unit_In_Stock")
	private int unit_In_Stock;
	
	@Column(name = "description")
	private String description;
	
	public Product(String name, String category, int price, String manufacturer, int unit_In_Stock, String description) {
		this.name = name;
		this.category = category;
		this.price = price;
		this.manufacturer = manufacturer;
		this.unit_In_Stock = unit_In_Stock;
		this.description = description;
		
	}

}