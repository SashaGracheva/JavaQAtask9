package ru.netology.radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {
    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationOutOfRange() {
        Radio radio = new Radio();

        radio.setCurrentStation(15);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToNextStation() {
        Radio radio = new Radio();
        radio.switchToNextStation();
        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToPrevStation() {
        Radio radio = new Radio();
        radio.switchToPrevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
