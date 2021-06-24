package kodlamaio.northwind.entities.dtos;



public class ProductWithCategoryDto {
	
	private String productName;
	private int id;
	private String CategoryName;
	
	
	public ProductWithCategoryDto(String productName, int id, String categoryName) {
		super();
		this.productName = productName;
		this.id = id;
		CategoryName = categoryName;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCategoryName() {
		return CategoryName;
	}


	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}

}
