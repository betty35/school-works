package model.bean;

public class Product 
{//ÿ����Ʒ��ÿ����ɫ�������Ⱦ���Ϊһ������
	private Integer specId;//product���ID
	private String specName;//��Ʒ���廨ɫ�������ȵķ��������硰��ɫ����  OrderItem�����kind
	private Integer productId;//productList���ID
	private String productName;//��Ʒ�����硰��˱�����
	private Integer secondCategoryId;//�ڶ�ϸ�ֺţ�productList
	private String detail;//��Ʒ����,��ӦproductList���detail
	private String brand;//����
	private Float price;
	private Integer stock;//���
	private String imagePath;//ͼ��·��
	
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
