package com.java1234.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 客户退货单实体
 * @author 兰杰
 *
 */
@Entity
@Table(name="t_customerReturnList")
public class CustomerReturnList {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id; // 编号
	
	@Column(length=100)
	private String customerReturnNumber; // 客户退货单号
	
	@ManyToOne
	@JoinColumn(name="customerId")
	private Customer customer; // 供应商
	
	@Column(length=20)
	private String customerReturnDate; // 客户退货日期
	
	private float amountPayable; // 应退金额
	
	private float amountPaid; // 实退金额
	
	private Integer state; // 交易状态 1 已退 2 未退
	
	@ManyToOne
	@JoinColumn(name="userId")
	private User user; // 操作用户
	
	@Column(length=1000)
	private String remarks; // 备注

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCustomerReturnNumber() {
		return customerReturnNumber;
	}

	public void setCustomerReturnNumber(String customerReturnNumber) {
		this.customerReturnNumber = customerReturnNumber;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public String getCustomerReturnDate() {
		return customerReturnDate;
	}

	public void setCustomerReturnDate(String customerReturnDate) {
		this.customerReturnDate = customerReturnDate;
	}

	public float getAmountPayable() {
		return amountPayable;
	}

	public void setAmountPayable(float amountPayable) {
		this.amountPayable = amountPayable;
	}

	public float getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(float amountPaid) {
		this.amountPaid = amountPaid;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
