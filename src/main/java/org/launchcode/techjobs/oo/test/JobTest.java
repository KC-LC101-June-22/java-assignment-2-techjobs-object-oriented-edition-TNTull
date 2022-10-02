package org.launchcode.techjobs.oo.test;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import java.util.stream.Stream;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    Job test_job;

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();

        assertNotEquals(job1, job2);
    }

    @Before
    public void createJobObject() {
    test_job = new Job("Product tester", new Employer("ACME"),
            new Location("Desert"), new PositionType("Quality control"),
            new CoreCompetency("Persistence"));
    }

    // tests constructor is assigning class and value correctly
    @Test
    public void testJobConstructorSetsAllFields() {

        assertTrue(test_job instanceof Job);
        assertEquals(test_job.getName(), "Product tester");

        assertTrue(test_job.getEmployer() instanceof Employer);
        assertEquals(test_job.getEmployer().getValue(), "ACME");

        assertTrue(test_job.getLocation() instanceof Location);
        assertEquals(test_job.getLocation().getValue(), "Desert");

        assertTrue(test_job.getPositionType() instanceof PositionType);
        assertEquals(test_job.getPositionType().getValue(), "Quality control");

        assertTrue(test_job.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(test_job.getCoreCompetency().getValue(), "Persistence");

    }

    //tests if 2 jobs are same is ID same
    @Test
    public void testJobsForEquality() {
          Job test_job2 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertFalse(test_job.equals(test_job2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        String strTest_job = test_job.toString();
        assertEquals(strTest_job.charAt(0), '\n');
        assertEquals(strTest_job.charAt(strTest_job.length() - 1), '\n');
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        //System.out.println(test_job.toString());

        String test_string = test_job.toString();
       //System.out.println(test_string);

        //this tests the labels are correct (6 labels)
        assertThat(test_string, CoreMatchers.containsString("ID:"));
        assertThat(test_string, CoreMatchers.containsString("Name:"));
        assertThat(test_string, CoreMatchers.containsString("Employer:"));
        assertThat(test_string, CoreMatchers.containsString("Location:"));
        assertThat(test_string, CoreMatchers.containsString("Position Type:"));
        assertThat(test_string, CoreMatchers.containsString("Core Competency:"));

        //this tests the data is correct (5 data strings)
        assertThat(test_string, CoreMatchers.containsString("Product tester:"));
        assertThat(test_string, CoreMatchers.containsString("ACME:"));
        assertThat(test_string, CoreMatchers.containsString("Desert:"));
        assertThat(test_string, CoreMatchers.containsString("Quality control:"));
        assertThat(test_string, CoreMatchers.containsString("Persistence:"));

    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job test_job3 = new Job();

        String test_str = test_job3.toString();

        System.out.println(test_str);
    }

}
