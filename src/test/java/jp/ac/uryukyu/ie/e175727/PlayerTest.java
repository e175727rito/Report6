package jp.ac.uryukyu.ie.e175727;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {


    @Test
    void getName(){
        Player player = new Player();
        player.setName("私");
        assertEquals("私",player.getName());
    }
}