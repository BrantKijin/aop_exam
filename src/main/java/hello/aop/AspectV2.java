package hello.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Aspect
public class AspectV2 {


	@Around("execution(* hello.aop.order..*(..))")
	public void allOrder(){}


}
