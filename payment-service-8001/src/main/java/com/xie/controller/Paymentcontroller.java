package com.xie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.xie.entity.CommonResult;
import com.xie.entity.Payment;
import com.xie.serviceimpl.PaymentService;

@RestController
public class Paymentcontroller {
	@Autowired
	private PaymentService paymentService;
	@Value("${server.port}")
	private String serverPort;

	@PostMapping("/paymentcreate/{payment}")
	public CommonResult create(@PathVariable("payment") Payment payment) {
		int i = paymentService.insert(payment);
		CommonResult commenResult = null;
		if (i > 0) {
			commenResult = new CommonResult(200, "成功！", i);
		} else {
			commenResult = new CommonResult(300, "失败！", null);
		}
		return commenResult;

	}

	@GetMapping(value = "/payment/get/{id}")
	public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
		Payment payment = paymentService.selectByPrimaryKey(id);

		if (payment != null) {
			return new CommonResult(200, "查询成功,serverPort:  " + serverPort, payment);
		} else {
			return new CommonResult(444, "没有对应记录,查询ID: " + id, null);
		}
	}

}
