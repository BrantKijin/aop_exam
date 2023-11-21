package hello.aop.exam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import hello.aop.exam.aop.TraceAspect;

@Import(TraceAspect.class)
@SpringBootTest
class ExamServiceTest {

	@Autowired
	ExamService examService;

	@Test
	void test(){
		examService.request("data ");
		// for(int i =0; i< 5; i++) {
		// 	examService.request("data " + i);
		// }
	}

}