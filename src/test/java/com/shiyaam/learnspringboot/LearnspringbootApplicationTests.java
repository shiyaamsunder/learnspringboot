package com.shiyaam.learnspringboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class LearnspringbootApplicationTests {

	Calculator underTest = new Calculator();


	@Test
	void isShouldAddNumbers(){
		//given
		int numberOne = 20;
		int numberTwo = 30;

		//when
		int result = underTest.add(numberOne, numberTwo);

		int expected = 50;
		assertThat(result).isEqualTo(expected);


	}

	class Calculator {
		int add(int a, int b){ return a + b;}
	}

}
