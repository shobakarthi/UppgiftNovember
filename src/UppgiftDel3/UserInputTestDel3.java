package UppgiftDel3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserInputTestDel3 {
    private UserInputLogicDel3 inputLogic;

    @Before
    public void createObject() {

        inputLogic = new UserInputLogicDel3();
    }

    @Test
    public void oneLineInputWithWordStop() {
        int expectedCharCount = 0;
        int expectedLineCount = 0;
        inputLogic.userInput("xxxx stop");
        Assert.assertEquals(expectedCharCount, inputLogic.charCount);
        Assert.assertEquals(expectedLineCount, inputLogic.lineCount);
    }

    @Test
    public void multipleLineInputWithWordStop() {
        int expectedCharCount = 18;
        int expectedLineCount = 2;
        inputLogic.userInput("Hello world");
        inputLogic.userInput("Welcome");
        inputLogic.userInput("xxx stop");
        Assert.assertEquals(expectedCharCount, inputLogic.charCount);
        Assert.assertEquals(expectedLineCount, inputLogic.lineCount);
    }

    @Test
    public void inputOnlyWithWordStop() {
        int expectedCharCount = 0;
        int expectedLineCount = 0;
        inputLogic.userInput("stop");
        Assert.assertEquals(expectedCharCount, inputLogic.charCount);
        Assert.assertEquals(expectedLineCount, inputLogic.lineCount);
    }

    @Test
    public void inputWordWithCharactersStop() {
        int expectedCharCount = 14;
        int expectedLineCount = 1;
        inputLogic.userInput("Am unstoppable");
        Assert.assertEquals(expectedCharCount, inputLogic.charCount);
        Assert.assertEquals(expectedLineCount, inputLogic.lineCount);
    }

    @Test
    public void inputWithCaseSensitiveStop() {
        int expectedCharCount = 16;
        int expectedLineCount = 2;
        inputLogic.userInput("HI.");
        inputLogic.userInput("How are YOU ?");
        inputLogic.userInput("STOP");
        Assert.assertEquals(expectedCharCount, inputLogic.charCount);
        Assert.assertEquals(expectedLineCount, inputLogic.lineCount);
    }

    @Test
    public void testWordCount() {
        int expectedCharCount = 17;
        int expectedLineCount = 2;
        inputLogic.userInput("Hi");
        inputLogic.userInput("I like drawing.");
        inputLogic.userInput("STOP");
        Assert.assertEquals(expectedCharCount, inputLogic.charCount);
        Assert.assertEquals(expectedLineCount, inputLogic.lineCount);
    }
    @Test
    public void testLongestWord() {
        int expectedCharCount = 15;
        int expectedLineCount = 1;
        inputLogic.userInput("Hi encyclopedia");
        inputLogic.userInput("stop");
        Assert.assertEquals(expectedCharCount, inputLogic.charCount);
        Assert.assertEquals(expectedLineCount, inputLogic.lineCount);
    }
}
