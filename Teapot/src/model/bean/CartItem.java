package model.bean;

public class CartItem {
private Product product;
	
	private int count;//商品的数量
	
	public CartItem(Product product,int count){		
		this.product=product;
		this.count=count;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	//计算某一购物项的总价
	public float getItemPrice(){
		
		float price = product.getPrice()*count;
		return price;
	}
}
