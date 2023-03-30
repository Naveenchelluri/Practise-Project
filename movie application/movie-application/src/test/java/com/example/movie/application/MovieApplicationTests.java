package com.example.movie.application;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MovieApplicationTests {

	@Test
	void contextLoads() {
	}
	
	
	 @Test
	    public void findallTest() {
		   
		   Movie m1 = new Movie(1,"kushi","pawan kalyan","sj");
		   Movie m2 = new Movie(2,"kushi2","pawan kalyann","sjj");
		   
		   List<Movie> list1 = new ArrayList<>();
		   list1.add(m1);
		   list1.add(m2);
		   
		   when(movieRepository.findAll()).thenReturn(list1);
		   assertEquals(movieService.findAll().size(),2);

}
