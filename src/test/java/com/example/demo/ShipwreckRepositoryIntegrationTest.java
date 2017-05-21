package com.example.demo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.is;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.speed.mixer.das.boot.DasBootApplication;
import com.speed.mixer.das.boot.model.Shipwreck;
import com.speed.mixer.das.boot.repository.ShipwreckRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes={DasBootApplication.class})
public class ShipwreckRepositoryIntegrationTest {

	@Autowired
	private ShipwreckRepository shipwreckRepository;
	
	@Test
	public void testFindAll(){
		List<Shipwreck> wreck = shipwreckRepository.findAll();
		assertThat(wreck.size(), is(greaterThanOrEqualTo(0)));
	}
}
