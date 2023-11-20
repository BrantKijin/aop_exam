package hello.aop;

import org.junit.jupiter.api.Test;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import hello.aop.order.OrderRepository;
import hello.aop.order.OrderService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class AppTest {

	@Autowired
	OrderService orderService;

	@Autowired
	OrderRepository orderRepository;

	@Test
	void anopInfo(){
		log.info("isAOpProxy, orderService={}", AopUtils.isAopProxy(orderService));
		log.info("isAopProxy, OrderRepository={}", AopUtils.isAopProxy(orderRepository));
	}

	@Test
	void success(){
		orderService.orderItem("itemA");
	}

	@Test
	void exception(){
	}

}
