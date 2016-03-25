package bll;
import java.sql.SQLException;
import java.util.List;

import dao.ProductDao;
import model.bean.FirstCategory;
import model.bean.Product;
import model.bean.ProductList;
import model.bean.SecondCategory;


public class ProductService 
{

	public int new1stCategory(String name)
	{//设置新的第一级分类
		try {
			return new ProductDao().new1stCategory(name);}
		catch (SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	
	public int new2ndCategory(Integer firstId,String name)
	{//设置新的第一级分类
		try {
			return new ProductDao().new2ndCategory(firstId,name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	
	
	
	public int showStock(Integer specId)
	{
		try {
			return new ProductDao().checkStock(specId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
	}
	
	public int newProduct(String productName,Integer secondCategoryId,String detail)
	{
		try {
			return new ProductDao().insertProduct(productName, secondCategoryId, detail);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public int newSpec(String specName,Integer productId,float price,String brand,String imagePath,Integer stock)
	{//插入新的商品分类
		try {
			return new ProductDao().insertProductSpec(specName,productId,price,brand,imagePath,stock);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public int sellOut(Integer specId,Integer amount)
	{//售出，更新库存
		try {
			return new ProductDao().stockDecrease(specId, amount);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public int replenish(Integer specId,Integer amount)
	{//进货，更新库存
		try {
			return new ProductDao().stockIncrease(specId, amount);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public int updateProduct(Integer ID,String productName,Integer secondId,String detail)
	{
		try {
			return new ProductDao().updateProduct(ID, productName, secondId, detail);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public int updateProductSpec(Integer specId,String specName,String brand,float price,String imagePath)
	{
		try {
			return new ProductDao().updateProductSpec(specId, specName, brand, price, imagePath);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}

	public List<FirstCategory> showFirstCategory()
	{
		try {
			return new ProductDao().showFirstCategory();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public List<SecondCategory> showSecondCategory(Integer firstId)
	{
		try {
			return new ProductDao().showSecondCategory(firstId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Product> showProductByCategory(Integer secId)
	{
		try {
			return new ProductDao().queryProductByCategory(secId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
	public List<Product> show(Integer productId)
	{
		try {
			return new ProductDao().queryProductById(productId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	
	public List<ProductList> showProductListByCategory(Integer secId)
	{
		try {
			return new ProductDao().showProductListByCategory(secId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Product> ProductSearch(String search)
	{
		try {
			return new ProductDao().ProductSearch(search);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public Product getSpecProductBySpecId(Integer specId)
	{
		try {
			return new ProductDao().getSpecProductBySpecId(specId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
