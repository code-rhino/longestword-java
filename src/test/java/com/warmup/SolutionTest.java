package com.warmup;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void longestWordTest1(){
        Solution solution = new Solution();
        String input = "fun&!! time";
        String expected = "time";
        String actual = solution.longestWord(input);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void longestWordTest2(){
        Solution solution = new Solution();
        String input = "I love dogs";
        String expected = "love";
        String actual = solution.longestWord(input);
        Assert.assertEquals(expected,actual);
    }
}
