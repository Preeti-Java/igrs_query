package com.cg.neel.igrs.query;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class IgrsQueryApplicationTests {
	
	Calculator c = new Calculator();

	@Test
	void contextLoads() {
	}

	@Test
	void testSum() {
		
		int expextedResult = 7;
		
		int actualResult = c.sum(1,6);
		
		assertThat(expextedResult).isEqualTo(actualResult);
		
	}
	
	@Test
	void testSum1() {
		
		int expextedResult = 17;
		
		int actualResult = c.sum(21,6);
		
		assertThat(expextedResult).isEqualTo(actualResult);
		
	}
}
