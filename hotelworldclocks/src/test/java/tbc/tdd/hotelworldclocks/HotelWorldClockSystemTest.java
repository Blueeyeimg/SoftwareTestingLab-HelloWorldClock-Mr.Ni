package tbc.tdd.hotelworldclocks; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

import static org.junit.Assert.assertEquals;

/** 
* HotelWorldClockSystem Tester. 
* 
* @author <Authors name> 
* @since <pre>Ê®ÔÂ 7, 2018</pre> 
* @version 1.0 
*/ 
public class HotelWorldClockSystemTest {
    private HotelWorldClockSystem hotelWorldClockSystem;
    private PhoneClock phoneClock;
@Before
public void before() throws Exception {
    this.hotelWorldClockSystem = new HotelWorldClockSystem();
    this.phoneClock = new PhoneClock(8);
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: attach(CityClock cityClock) 
* 
*/ 
@Test
public void testAttach() throws Exception {


} 

/** 
* 
* Method: getClocks() 
* 
*/ 
@Test
public void testGetClocks() throws Exception { 
//TODO: Test goes here... 
} 


} 
