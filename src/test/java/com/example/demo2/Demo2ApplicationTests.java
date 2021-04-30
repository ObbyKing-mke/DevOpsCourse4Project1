package com.example.demo2;

import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ReviewAnalyserApplicationTests {

	@Test
	public void testWordCount() {
		assertEquals(7,analyser.getWordCount("Train to win in the digital economy"));
	}
}
