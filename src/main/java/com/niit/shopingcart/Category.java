package com.niit.shopingcart;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table
//@Table(name="Category") --> if table name is differ then use it.
//If table name and domain class name is same, no need to specify name here.
public class Category {
// id,name,description are the fields in the table 
	@Id // Specify Primary Key
		private String id;
	@Column(name = "name")//if column name is differ then use it.
		private String categoryName;
		private String description;
		
		//@Transient
		//private String createdBy; //this field are not Store in DB.
		
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return categoryName;
		}
		public void setName(String categoryName) {
			this.categoryName = categoryName;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		
		
}
