package com.pg.junit;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.pg.mockito.TodoServiceStub;

class WordCounterTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetWordCount() {
		fail("Not yet implemented");
	}

	@Test
	void testAddWord() {
		TodoServiceStub todoSS = new TodoServiceStub();
		List<String> words = todoSS.getWords();
		for (String word : words) {
			System.out.println(word);
		}
	}
}
