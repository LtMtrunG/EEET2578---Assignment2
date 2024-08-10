package org.example;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BasicDataTest extends TestCase {

    BasicData basicData;
    ByteArrayOutputStream outContent;
    PrintStream originalOut;
    @Before
    public void setUp() throws Exception {
        basicData = new BasicData(7654324, "Student1", "p7654324#");
        // Arrange
        outContent = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        super.setUp();
    }

    @After
    public void tearDown() throws Exception {
        // Restore the original System.out
        System.setOut(originalOut);
    }

    @Test
    public void testGetID() {
    }

    @Test
    public void testTestGetName() {
    }

    @Test
    public void testGetPassword() {
    }

    @Test
    public void testSetID() {
    }

    @Test
    public void testTestSetName() {
    }

    @Test
    public void testSetPassword() {
    }

    @Test
    public void testPrint() {

        // Act
        basicData.print();

        // Assert
        String expectedOutput = String.format("\nID: %s\nName: %s\nPassword: %s",
                basicData.getID(),
                basicData.getName(),
                basicData.getPassword());

        assertEquals(expectedOutput, outContent.toString().trim());
    }
}