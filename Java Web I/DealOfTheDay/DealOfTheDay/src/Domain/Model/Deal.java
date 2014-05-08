package Model;

import java.util.Date;

public class Deal {
	
	private Integer id;
	private Double price;
	private String title;
	private String description;
	private String rules;
	private Date validation;
	private byte[] image;
	private Integer totalBuyed;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getRules() {
		return rules;
	}
	public void setRules(String rules) {
		this.rules = rules;
	}
	
	public Date getValidation() {
		return validation;
	}
	public void setValidation(Date validation) {
		this.validation = validation;
	}
	
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	
	public Integer getTotalBuyed() {
		return totalBuyed;
	}
	public void setTotalBuyed(Integer totalBuyed) {
		this.totalBuyed = totalBuyed;
	}
	
}
