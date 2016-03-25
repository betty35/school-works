package dao;
import java.sql.SQLException;
import java.util.List;

import model.bean.*;
import dao.common.DbHelper;

public class ProductDao
{
	private DbHelper ct;
	public ProductDao() throws SQLException{ 
		ct = new DbHelper();
	}
	
	public int insertProductSpec(String specName,Integer productId,float price,String brand,String imagePath,Integer stock){
		//������Ʒ��ɫ�����������ķ����Ʒ��
		String sql="INSERT INTO Product(specName,productId,price,brand,imagePath,stock) VALUES (?,?,?,?,?,?)";
		try {
			return ct.insertAndReturnKey(sql, specName,productId,price,brand,imagePath,stock);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public int insertProduct(String productName,Integer secondCategoryId,String detail)
	{//������Ʒ��
		String sql="INSERT INTO Productlist(productName,secondCategoryId,detail) VALUES (?,?,?)";
		try {
			return ct.insertAndReturnKey(sql,productName,secondCategoryId,detail);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public int checkStock(Integer specId)
	{//��specID����
		String sql="SELECT * FROM Product WHERE specId=?";
		Integer stock;
		try {
			stock = ct.getInt(sql, "stock", specId);
			return stock;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
		
	}
	
	public int stockDecrease(Integer specId,Integer amount) throws SQLException
	{//���˶������붩�������󣬸���stock�ã��Բ�ƷspecId������ѯ��amount���۳���
		//�����ǲ�Ҫ�˵ġ��������ţ���һ��ѯ�ֳ������ٻ�ԭ����������
		//String sql = "SELECT * FROM Product,Productlist WHERE Product.productId=Productlist.id AND specId=?";
		//Product product=ct.get(Product.class,sql,DbHelper.parseSmap(Product.class, "productId", "productName", "specId","specName","secondCategoryId","categoryName","detail", "brand", "price","stock","imagePath"),specId);
		//Integer remain=product.getStock()-amount;
		Integer remain=checkStock(specId)-amount;
		
		String sql="UPDATE Product SET stock = ? WHERE specId = ?";
		return ct.updatePrepareSQL(sql, remain,specId);
	}
	
	public int stockIncrease(Integer specId,Integer amount) throws SQLException
	{//����������stock�ã��Բ�ƷspecId������ѯ,amount�ǽ�����
		
		//�����ǲ�Ҫ�˵ġ��������ţ���һ��ѯ�ֳ������ٻ�ԭ����������
		//String sql = "SELECT * FROM Product,Productlist WHERE Product.productId=Productlist.id AND specId=?";
		//Product product=ct.get(Product.class,sql,DbHelper.parseSmap(Product.class, "productId", "productName", "specId","specName","secondCategoryId","categoryName","detail", "brand", "price","stock","imagePath"),specId);
		//Integer remain=product.getStock()-amount;
		Integer remain=checkStock(specId)+amount;
		
		String sql="UPDATE Product SET stock = ? WHERE specId = ?";
		return ct.updatePrepareSQL(sql, remain,specId);
	}
	
	public int updateProductSpec(Integer specId,String specName,String brand,float price,String imagePath)
	{
		String sql="UPDATE Product SET specName=?,price=?,brand=?,imagePath=? WHERE specId=?";
		try {
			return ct.updatePrepareSQL(sql, specName,price,brand,imagePath,specId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public int updateProduct(Integer ID,String productName,Integer secondId,String detail)
	{
		String sql="UPDATE Productlist SET productName=?,secondCategoryId=?,detail=? WHERE id=?";
		try {
			return ct.updatePrepareSQL(sql, productName,secondId,detail,ID);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public void delete(Product item){
		
	}
	
	public int new1stCategory(String name)
	{//�����µĵ�һ������
		try {
			return ct.insertAndReturnKey("INSERT INTO Firstcategory(categoryName) VALUES (?)", name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	
	public int new2ndCategory(Integer firstId,String name)
	{//�����µĵ�һ������
		try {
			return ct.insertAndReturnKey("INSERT INTO Secondcategory(firstId,categoryName) VALUES (?)",firstId,name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public List<Product> queryProductByCategory(Integer secondId){
		//��ȡһ���ڶ����ȫ����Ʒ���б�~��ʾĳһ��ȫ����Ʒ��
		String sql = "SELECT * FROM Product a, Productlist b WHERE a.productId=b.id AND b.secondCategoryId=? GROUP BY productName";
		try {
			return ct.find(sql,Product.class,DbHelper.parseSmap(Product.class, "productId", "productName", "specId","specName","secondCategoryId","detail", "brand", "price","stock","imagePath"),secondId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Product> ProductSearch(String search){
		//ģ����ѯ��������ר��
		String sql = "SELECT * FROM Product a, Productlist b WHERE a.productId=b.id AND (b.productName LIKE ? OR a.specName LIKE ?) GROUP BY productName";
		try {
			return ct.find(sql,Product.class,DbHelper.parseSmap(Product.class, "productId", "productName", "specId","specName","secondCategoryId","detail", "brand", "price","stock","imagePath"),"%"+search+"%","%"+search+"%");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Product> queryProductById(Integer productId){
		//��ȡһ����Ʒ���л�ɫ�����������ķ����Ʒ������һ����Ʒ����ʾҳ��
		String sql = "SELECT * FROM Product a, Productlist b WHERE a.productId=b.id AND b.id=?";
		try {
			return ct.find(sql,Product.class,DbHelper.parseSmap(Product.class, "productId", "productName", "specId","specName","secondCategoryId","detail", "brand", "price","stock","imagePath"),productId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public Product getSpecProductBySpecId(Integer specId)
	{
		String sql="SELECT * FROM Product a, Productlist b WHERE a.productId=b.id AND a.specId=?";
		try {
			return ct.find(sql,Product.class,DbHelper.parseSmap(Product.class, "productId", "productName", "specId","specName","secondCategoryId","detail", "brand", "price","stock","imagePath"),specId).get(0);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public List<FirstCategory> showFirstCategory()
	{//�������е�һ����
		String sql="SELECT * FROM Firstcategory";
		try {
			return ct.find(sql,FirstCategory.class,DbHelper.parseSmap(FirstCategory.class,"id","categorName"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public List<SecondCategory> showSecondCategory(Integer firstId)
	{//����һ���෵�����еڶ�����
		String sql="SELECT * FROM Secondcategory WHERE firstId=?";
		try {
			return ct.find(sql,SecondCategory.class,DbHelper.parseSmap(SecondCategory.class,"id","firstId","categoryName"),firstId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public List<ProductList> showProductListByCategory(Integer secId)
	{
		String sql="SELECT * FROM Productlist WHERE secondCategoryId=?";
		try {
			return ct.find(sql, ProductList.class, DbHelper.parseSmap(ProductList.class, "id","productName","secondCategoryId","detail"), secId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	
}
