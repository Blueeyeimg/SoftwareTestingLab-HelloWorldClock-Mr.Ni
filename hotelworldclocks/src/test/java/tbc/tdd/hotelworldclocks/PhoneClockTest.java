package tbc.tdd.hotelworldclocks;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;

/**
 * PhoneClock Tester.
 *
 * @author <倪事通>
 * @version 1.0
 * @since <pre>十月 9, 2018</pre>
 */
public class PhoneClockTest {
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
     * Method: setTime(int time)
     */
    @Test
    public void the_time_of_the_phone_clock_should_be_set_correctly_after_its_setTime_method_is_invoked() {
        // Arrange
        // Act
        phoneClock.setTime(13);

        // Assert
        assertEquals(13, phoneClock.getTime());
    }

    @Test
    public void the_time_of_clock_London_should_be_5_after_the_phone_clock_is_set_to_13_Beijing_time() {
        // Arrange
        CityClock londonClock = new CityClock(0);
        hotelWorldClockSystem.attach(londonClock);

        // Act
        phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
        phoneClock.setTime(13);

        // Assert
        assertEquals(5, londonClock.getTime());
    }

    @Test
    public void the_time_of_clock_NewYork_should_be_0_after_the_phone_clock_is_set_to_13_Beijing_time() {
        // Arrange
        CityClock newYorkClock = new CityClock(-5);
        hotelWorldClockSystem.attach(newYorkClock);

        // Act
        phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
        phoneClock.setTime(13);

        // Assert
        assertEquals(0, newYorkClock.getTime());
    }

    @Test
    public void the_time_of_clock_Moscow_should_be_9_after_the_phone_clock_is_set_to_13_Beijing_time() {
        // Arrange
        CityClock moscowClock = new CityClock(4);
        hotelWorldClockSystem.attach(moscowClock);

        // Act
        phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
        phoneClock.setTime(13);

        // Assert
        assertEquals(9, moscowClock.getTime());
    }

} 
