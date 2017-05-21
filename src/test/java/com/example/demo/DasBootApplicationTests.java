package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.speed.mixer.das.boot.controller.HomeController;

/*@RunWith(SpringRunner.class)
@SpringBootTest*/
public class DasBootApplicationTests {

	/*@Test
	public void contextLoads() {
	}*/

	@Test
	public void homeControllerTest() {
		HomeController homeController =  new HomeController();
		String result = homeController.home();
		assertEquals(result, "Das Boot, reporting for Duty!");
	}
}
