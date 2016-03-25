package model.bean;

import java.util.HashMap;
import java.util.Iterator;

public class Cart {
	private HashMap<Integer, CartItem> items = null;

	private int itemsCount = 0;//�����������
	
	public Cart() {
		items = new HashMap<Integer, CartItem>();
	}

	/**
	 * �ڹ��ﳵ�����һ�����������ù������Ѵ��ڹ��ﳵ�У���ʲô������
	 * @param specId ��Ʒ��specId��ÿ�ֻ�ɫ��һ����Ʒ�������
	 * @param product ��Ʒ
	 */
	public synchronized void addItem(Integer specId,Product product,int amount) {
		if(!items.containsKey(specId)) {//���ﳵ��û�и���Ʒ��������Ӹ���Ʒ�����ﳵ��
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
	 * �޸��Ѿ�����õ���Ʒ����
	 * @param specId ��Ʒ��specId��ÿ�ֻ�ɫ��һ����Ʒ�������
	 * @param count �޸ĺ������
	 */
	public synchronized void updateProductCount(Integer specId,int count){
		if(count >= 1){
			if(items.containsKey(specId)){
				CartItem item = items.get(specId);//�������Id�ţ����õ�����
				item.setCount(count);//�޸��������
			}
		}
	}
	/**
	 * �ӹ��ﳵ��ɾ��һ��������
	 * @param specId ��Ʒ��specId��ÿ�ֻ�ɫ��һ����Ʒ�������
	 */
	public synchronized void deleteItem(Integer specId){
		if(items.containsKey(specId)){
			items.remove(specId);
			itemsCount--;
		}
	}
	/**
	 * ɾ�����ﳵ�е����й�����
	 */
	public synchronized void clear(){
		items.clear();
		itemsCount = 0;
	}
	/**
	 * �õ����ﳵ�е����й��������Ŀ
	 */
	public synchronized int getItemCount(){
		return itemsCount;
	}
	/**
	 * �õ����ﳵ�е����й�������ܼ۸�
	 */
	public synchronized float getTotalPrice(){
		float amount = 0.0f;
		//�õ�������
		Iterator<CartItem> it = items.values().iterator();
		while(it.hasNext()){
			CartItem item = it.next();
			amount+=item.getItemPrice();
		}
		return amount;
	}
	/**
	 * �õ����ﳵ�е�������Ʒ
	 */
	 public synchronized HashMap<Integer, CartItem> getItems(){
		 return items;
	 }
	 
	 
	 /**
	  * �ж���Ʒ�Ƿ��ڹ��ﳵ��
	  */
	 public synchronized boolean isExist(Integer specId){
		 if(items.containsKey(specId)){
			 return true;
		 }
		 return false;
	 }

	 /**
		 * �����Ѿ�����õ���Ʒ����
		 * @param specId ��Ʒ��specId��ÿ�ֻ�ɫ��һ����Ʒ�������
		 */
	 public synchronized void plus(Integer specId)
	 {
		 CartItem item=items.get(specId);
			int now=item.getCount();
			item.setCount(1+now);
	 }
	 
	 /**
		 * �����Ѿ�����õ���Ʒ����
		 * @param specId ��Ʒ��specId��ÿ�ֻ�ɫ��һ����Ʒ�������
		 */
	 public synchronized void minus(Integer specId)
	 {
		 CartItem item=items.get(specId);
			int now=item.getCount();
			if(now>=2)
			item.setCount(now-1);
	 }
}
