package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    void test1(){
        radio.setCurrentStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    void test2(){
        radio.setCurrentStation(7);
        radio.next();
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void test3(){

        radio.setCurrentStation(2);
        radio.prev();
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void test4(){
        radio.setCurrentStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void test5(){
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void  test6(){
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void test7(){
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void  test8(){
        radio.setCurrentVolume(20);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void  test9(){
        radio.setCurrentVolume(8);
        radio.increaseVolume();
        int expected = 9;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void  test10(){
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void  test11(){
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void  test12(){
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        int expected = 4;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
