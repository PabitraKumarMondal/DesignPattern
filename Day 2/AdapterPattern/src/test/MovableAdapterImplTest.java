package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import main.BugattiVeyron;
import main.Movable;
import main.MovableAdapter;
import main.MovableAdapterImpl;

public class MovableAdapterImplTest {
	
	Movable bugattiVeyron = new BugattiVeyron(); 
	MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron); 		
	
	@Test 
	public void whenConvertingMPHToKMPH_thenSuccessfullyConverted() { 
		assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001); 
	}
	
	@Test 
	public void whenConvertingUSDToEuro_thenSuccessfullyConverted() { 
		assertEquals(bugattiVeyronAdapter.getPrice(), 1.638, 0.00001); 
	}
}
