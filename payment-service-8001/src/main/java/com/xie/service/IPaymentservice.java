package com.xie.service;

import org.apache.ibatis.annotations.Param;
import com.xie.entity.Payment;

public interface IPaymentservice {
	public int insert(Payment payment);
	public Payment selectByPrimaryKey(@Param("id")long id );
	public void updateByPrimaryKey(Payment payment);
	public void deleteByPrimaryKey(long id);

}
