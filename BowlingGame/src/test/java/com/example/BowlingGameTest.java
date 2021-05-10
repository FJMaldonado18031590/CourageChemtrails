package com.example;

import com.example.BowlingGame.BowlingGame;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingGameTest {
    @Test
    public void testGutterGame() throws Exception {
        BowlingGame bowlingGame = new BowlingGame();
        for (int i = 0; i < 20; i++) {
            bowlingGame.roll(0);
            assertEquals(0, bowlingGame.score());
        }
    }
}
