package com.brooksmckinley;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        Assertions.assertTrue(true);
    }

    @Test
    public void testExampleQuote() {
        String expected = "Obi-Wan Kenobi says, \"These aren't the droids you're looking for.\"";
        String actual = App.generateOutput("Obi-Wan Kenobi", "These aren't the droids you're looking for.");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testConfucius() {
        String expected = "Ninja says, \"I'm not seeing enough movement!\"";
        String actual = App.generateOutput("Ninja", "I'm not seeing enough movement!");
        Assertions.assertEquals(expected, actual);
    }
}