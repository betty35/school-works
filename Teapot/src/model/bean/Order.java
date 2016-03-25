package model.bean;
import java.sql.Date;

public class Order 
{
	private Integer userId;
	private Integer orderId;
	private String orderCode;
	private Date orderDate;
	private Integer orderStatus;
	private String deliveryWay;
	private String paymentWay;
	private String deliveryCode;
	private Integer addressId;
	private Date finishDate;
	private String memo;
	private Integer honestyStar;
	private Integer serviceStar;
	private Integer deliveryStar;
	private Float totalPrice;

	
	public Float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Float totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Integer getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getDeliveryWay() {
		return deliveryWay;
	}
	public void setDeliveryWay(String deliveryWay) {
		this.deliveryWay = deliveryWay;
	}
	public String getPaymentWay() {
		return paymentWay;
	}
	public void setPaymentWay(String paymentWay) {
		this.paymentWay = paymentWay;
	}
	public String getDeliveryCode() {
		return deliveryCode;
	}
	public void setDeliveryCode(String deliveryCode) {
		this.deliveryCode = deliveryCode;
	}
	
	public Date getFinishDate() {
		return finishDate;
	}
	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public Integer getHonestyStar() {
		return honestyStar;
	}
	public void setHonestyStar(Integer honestyStar) {
		this.honestyStar = honestyStar;
	}
	public Integer getServiceStar() {
		return serviceStar;
	}
	public void setServiceStar(Integer serviceStar) {
		this.serviceStar = serviceStar;
	}
	public Integer getDeliveryStar() {
		return deliveryStar;
	}
	public void setDeliveryStar(Integer deliveryStar) {
		this.deliveryStar = deliveryStar;
	}

	
}
