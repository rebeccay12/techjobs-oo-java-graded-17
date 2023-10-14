package org.launchcode.techjobs.oo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

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
        assertEquals(job1 != job2);
    }


}
