package model.bean;
import java.util.Date;

public class OrderItem 
{private Integer id;

private Integer orderId;
private Integer productId;
private String productName;
private String kind;
private Float unitPrice;
private Integer quantity;
private Integer grade;//商品打分（好评：3，中评2，差评1，没有null）
private String comment;//商品评价
private Date commentTime;
private Integer anonymous;

public OrderItem(){}


public Date getCommentTime() {
	return commentTime;
}




public void setCommentTime(Date commentTime) {
	this.commentTime = commentTime;
}




public Integer getAnonymous() {
	return anonymous;
}




public void setAnonymous(Integer anonymous) {
	this.anonymous = anonymous;
}




public Integer getGrade() {
	return grade;
}



public void setGrade(Integer grade) {
	this.grade = grade;
}



public String getComment() {
	return comment;
}



public void setComment(String comment) {
	this.comment = comment;
}



public Integer getOrderId() {
	return orderId;
}

public void setOrderId(Integer orderId) {
	this.orderId = orderId;
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


public Integer getQuantity() {
	return quantity;
}

public void setQuantity(Integer quantity) {
	this.quantity = quantity;
}

public String getKind() {
	return kind;
}

public void setKind(String kind) {
	this.kind = kind;
}

public Integer getId() {
	return id;
}



public void setId(Integer id) {
	this.id = id;
}



public Float getUnitPrice() {
	return unitPrice;
}



public void setUnitPrice(Float unitPrice) {
	this.unitPrice = unitPrice;
}

}
