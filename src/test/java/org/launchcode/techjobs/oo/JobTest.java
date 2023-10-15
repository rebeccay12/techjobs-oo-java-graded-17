package org.launchcode.techjobs.oo;
import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {

        JobTest jobOne = new JobTest();
        JobTest jobTwo = new JobTest();

        assert !jobOne.equals(jobTwo) : "jobOne should not be equal to jobTwo";
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job = new Job (
                "Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );
        assertEquals("Product tester", job.getName());
        assertEquals("ACME", job.getEmployer().getValue());
        assertEquals("Product tester", job.getName());
        assertEquals("Product tester", job.getName());
        assertEquals("Product tester", job.getName());


        assertTrue("Product tester" == job.getName());
        assertTrue("ACME" == job.getEmployer().getValue());
        assertTrue("Product tester" == job.getName());
        assertTrue("Product tester" == job.getName());
        assertTrue("Product tester" == job.getName());
    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job (
                "Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );
        Job job2 = new Job (
                "Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );
        assertNotEquals(job1, job2);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job = new Job (
                "Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );
        String jobString = job.toString();
//        String testString = "\nID:  _______\n" +
//                "Name: _______\n" +
//                "Employer: _______\n" +
//                "Location: _______\n" +
//                "Position Type: _______\n" +
//                "Core Competency: _______\n";

        assertTrue(jobString.startsWith("\n"));
        assertTrue(jobString.endsWith("\n"));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
//        String testString = "\nID:  _______\n" +
//                "Name: _______\n" +
//                "Employer: _______\n" +
//                "Location: _______\n" +
//                "Position Type: _______\n" +
//                "Core Competency: _______\n";
        Job job = new Job (
                "Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );
        String expected = "\nID: " + job.getId() +
                "\nName: Product tester" +
                "\nEmployer: ACME" +
                "\nLocation: Desert" +
                "\nPosition Type: Quality control" +
                "\nCore Competency: Persistence" + "\n";

        String actual = job.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job = new Job ("",
                new Employer(""),
                new Location(""),
                new PositionType(""),
                new CoreCompetency("")
        );
        String expected = "\nID: " + job.getId() +
                "\nName: Data not available" +
                "\nEmployer: Data not available" +
                "\nLocation: Data not available" +
                "\nPosition Type: Data not available" +
                "\nCore Competency: Data not available" + "\n";

        String actual = job.toString();

        assertEquals(expected, actual);
    }

}
