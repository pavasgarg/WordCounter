package com.pg.mockito;

import java.util.Arrays;
import java.util.List;

import com.pg.api.TodoService;

public class TodoServiceStub implements TodoService {

	public List<String> getWords() {
		return Arrays.asList("coffee", "book", "flower", "blume", "flor", "chair", "pickle", "home", "dome");
	}
}
