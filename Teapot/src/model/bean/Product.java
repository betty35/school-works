package model.bean;

public class Product 
{//每种商品的每个花色、容量等均作为一个分类
	private Integer specId;//product表的ID
	private String specName;//商品具体花色、容量等的分类名（如“白色”）  OrderItem里叫做kind
	private Integer productId;//productList表的ID
	private String productName;//产品名（如“马克杯”）
	private Integer secondCategoryId;//第二细分号，productList
	private String detail;//商品描述,对应productList表的detail
	private String brand;//牌子
	private Float price;
	private Integer stock;//库存
	private String imagePath;//图像路径
	
	public Integer getSpecId() {
		return specId;
	}
	public void setSpecId(Integer specId) {
		this.specId = specId;
	}
	public String getSpecName() {
		return specName;
	}
	public void setSpecName(String specName) {
		this.specName = specName;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getSecondCategoryId() {
		return secondCategoryId;
	}
	public void setSecondCategoryId(Integer categoryId) {
		this.secondCategoryId = categoryId;
	}
	
	public String getDetail() {
		return detail;
	}
	public void setDetail(String description) {
		this.detail = description;
	}
	
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
}
