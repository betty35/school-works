package model.bean;

import java.util.HashMap;
import java.util.Iterator;

public class Cart {
	private HashMap<Integer, CartItem> items = null;

	private int itemsCount = 0;//购物项的数量
	
	public Cart() {
		items = new HashMap<Integer, CartItem>();
	}

	/**
	 * 在购物车中添加一个购物项，如果该购物项已存在购物车中，则什么都不做
	 * @param specId 商品的specId，每种花色算一种商品的种类号
	 * @param product 商品
	 */
	public synchronized void addItem(Integer specId,Product product,int amount) {
		if(!items.containsKey(specId)) {//购物车中没有该商品，可以添加该商品到购物车中
			CartItem item = new CartItem(product,amount);
			items.put(specId, item);
			itemsCount++;
		}
		else
		{CartItem item=items.get(specId);
		int now=item.getCount();
		item.setCount(amount+now);
		}
	}
	/**
	 * 修改已经购买好的商品数量
	 * @param specId 商品的specId，每种花色算一种商品的种类号
	 * @param count 修改后的数量
	 */
	public synchronized void updateProductCount(Integer specId,int count){
		if(count >= 1){
			if(items.containsKey(specId)){
				CartItem item = items.get(specId);//根据书的Id号，来得到此书
				item.setCount(count);//修改书的数量
			}
		}
	}
	/**
	 * 从购物车中删除一个购物项
	 * @param specId 商品的specId，每种花色算一种商品的种类号
	 */
	public synchronized void deleteItem(Integer specId){
		if(items.containsKey(specId)){
			items.remove(specId);
			itemsCount--;
		}
	}
	/**
	 * 删除购物车中的所有购物项
	 */
	public synchronized void clear(){
		items.clear();
		itemsCount = 0;
	}
	/**
	 * 得到购物车中的所有购物项的数目
	 */
	public synchronized int getItemCount(){
		return itemsCount;
	}
	/**
	 * 得到购物车中的所有购物项的总价格
	 */
	public synchronized float getTotalPrice(){
		float amount = 0.0f;
		//得到迭代器
		Iterator<CartItem> it = items.values().iterator();
		while(it.hasNext()){
			CartItem item = it.next();
			amount+=item.getItemPrice();
		}
		return amount;
	}
	/**
	 * 得到购物车中的所有商品
	 */
	 public synchronized HashMap<Integer, CartItem> getItems(){
		 return items;
	 }
	 
	 
	 /**
	  * 判断商品是否在购物车中
	  */
	 public synchronized boolean isExist(Integer specId){
		 if(items.containsKey(specId)){
			 return true;
		 }
		 return false;
	 }

	 /**
		 * 增加已经购买好的商品数量
		 * @param specId 商品的specId，每种花色算一种商品的种类号
		 */
	 public synchronized void plus(Integer specId)
	 {
		 CartItem item=items.get(specId);
			int now=item.getCount();
			item.setCount(1+now);
	 }
	 
	 /**
		 * 减少已经购买好的商品数量
		 * @param specId 商品的specId，每种花色算一种商品的种类号
		 */
	 public synchronized void minus(Integer specId)
	 {
		 CartItem item=items.get(specId);
			int now=item.getCount();
			if(now>=2)
			item.setCount(now-1);
	 }
}
