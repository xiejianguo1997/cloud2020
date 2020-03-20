package com.xie.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xie.entity.Payment;
import com.xie.service.IPaymentservice;

import come.xie.dao.paymentDao;
@Service
public class PaymentService implements IPaymentservice {
  @Autowired
  private paymentDao paymentDao;
	@Override
	public int insert(Payment payment) {
		return paymentDao.insert(payment);

	}

	@Override
	public Payment selectByPrimaryKey(long id) {
		return paymentDao.selectByPrimaryKey(id);
	}

	@Override
	public void updateByPrimaryKey(Payment payment) {
		paymentDao.updateByPrimaryKey(payment);
	}

	@Override
	public void deleteByPrimaryKey(long id) {
		paymentDao.deleteByPrimaryKey(id);
	}

}
