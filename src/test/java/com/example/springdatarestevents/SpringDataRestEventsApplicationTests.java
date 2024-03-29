package com.example.springdatarestevents;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
class SpringDataRestEventsApplicationTests {

	@Autowired
	private MockMvc mvc;

	@Test
	public void getAllBooks() throws Exception {
		System.out.println("test mvc");
		mvc.perform(MockMvcRequestBuilders.get("/books").accept(MediaType.APPLICATION_JSON)).andDo(print())
				.andExpect(status().isOk());
	}

	@Test
	public void test() {
		assertTrue(true);
	}

}
