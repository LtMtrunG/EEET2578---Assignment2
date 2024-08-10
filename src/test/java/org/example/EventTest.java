package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;


public class EventTest extends TestCase {

    Event event;
//    static ArrayList<BasicData> Admin;
//    static ArrayList<BasicData> Student;

    public void setUp() throws Exception {
        event = new Event();
        super.setUp();
    }

    public void tearDown() throws Exception {
    }

    public void testAdminLogin() {
    }

    public void testStudentLogin() {
    }

    public void testShowStudentEvents() {
    }

    public void testViewStudentDetails() {
    }

    public void testSearchStudentDetails() {
    }

    public void testRemoveStudent() {
        event.removeStudent(7654325);
        String filePath = "student.txt";
        String filePathTest = "student_test.txt";
        StringBuilder fileContent = new StringBuilder();
        StringBuilder fileContentTest = new StringBuilder();

        // Read the file content
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                fileContent.append(line).append(System.lineSeparator());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Read the file content
        try (BufferedReader reader = new BufferedReader(new FileReader(filePathTest))) {
            String line;
            while ((line = reader.readLine()) != null) {
                fileContentTest.append(line).append(System.lineSeparator());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Act & Assert
        assertTrue(fileContentTest.toString().trim().equals(fileContent.toString().trim()));
//        assertTrue("The files differ!", FileUtils.contentEquals(file1, file2));
    }

    public void testCountStudent() {
    }

    public void testRewriteStudentFile() {
    }

    public void testAddStudent() {
    }

    @Test
    public void testAdminRead() {
        List<BasicData> ADMIN = Collections.unmodifiableList(Arrays.asList(
                new BasicData(1, "Admin1", "pass1"),
                new BasicData(2, "Admin2", "pass2"),
                new BasicData(3, "Admin3", "pass3")
        ));
//
//        // Convert to ArrayList
//        ArrayList<BasicData> adminArrayList = new ArrayList<>(ADMIN);

        assertArrayEquals(ADMIN.toArray(), event.Admin.toArray());
    }
}