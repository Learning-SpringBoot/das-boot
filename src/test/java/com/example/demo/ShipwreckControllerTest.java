package com.example.demo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.speed.mixer.das.boot.controller.ShipWreckController;
import com.speed.mixer.das.boot.model.Shipwreck;
import com.speed.mixer.das.boot.repository.ShipwreckRepository;



public class ShipwreckControllerTest {

	@InjectMocks
	private ShipWreckController shipwreckController;
	
	@Mock
	private ShipwreckRepository shipwreckRepository;
	
	@Before
	public void inti(){
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testShipwreckGet(){
		Shipwreck shipwreck = new Shipwreck();
		shipwreck.setId(1L);
		when(shipwreckRepository.findOne(1L)).thenReturn(shipwreck);
		
		Shipwreck wreck = shipwreckController.get(1L);		
		//assertEquals(1L, wreck.getId().longValue());
		assertThat(wreck.getId(), is(1L));
	}

}
