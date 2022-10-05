package org.launchcode.techjobs.oo.test;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();

        assertNotEquals(job1, job2);
    }

    // tests constructor is assigning class and value correctly
    @Test
    public void testJobConstructorSetsAllFields() {
        Job test_job = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertTrue(test_job.getName() instanceof String);
        assertEquals("Product tester", test_job.getName());

        assertTrue(test_job.getEmployer() instanceof Employer);
        assertEquals("ACME", test_job.getEmployer().getValue());

        assertTrue(test_job.getLocation() instanceof Location);
        assertEquals("Desert", test_job.getLocation().getValue());

        assertTrue(test_job.getPositionType() instanceof PositionType);
        assertEquals("Quality control", test_job.getPositionType().getValue());

        assertTrue(test_job.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", test_job.getCoreCompetency().getValue());

    }

    //tests if 2 jobs are same is ID same
    @Test
    public void testJobsForEquality() {
        Job test_job = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        Job test_job2 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertFalse(test_job.equals(test_job2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job test_job = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        String strTest_job = test_job.toString();
        assertEquals('\n', strTest_job.charAt(0));
        assertEquals('\n', strTest_job.charAt(strTest_job.length() - 1));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job test_job = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        //System.out.println(test_job.toString());

//        String test_string = test_job.toString();
//       //System.out.println(test_string);
//
//        //this tests the labels are correct (6 labels)
//        assertThat(test_string, CoreMatchers.containsString("ID:"));
//        assertThat(test_string, CoreMatchers.containsString("Name:"));
//        assertThat(test_string, CoreMatchers.containsString("Employer:"));
//        assertThat(test_string, CoreMatchers.containsString("Location:"));
//        assertThat(test_string, CoreMatchers.containsString("Position Type:"));
//        assertThat(test_string, CoreMatchers.containsString("Core Competency:"));
//
//        //this tests the data is correct (5 data strings)
//        assertThat(test_string, CoreMatchers.containsString("Product tester"));
//        assertThat(test_string, CoreMatchers.containsString("ACME"));
//        assertThat(test_string, CoreMatchers.containsString("Desert"));
//        assertThat(test_string, CoreMatchers.containsString("Quality control"));
//        assertThat(test_string, CoreMatchers.containsString("Persistence"));

        assertEquals("\nID: " + test_job.getId() + "\nName: Product tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Persistence\n", test_job.toString());

    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job test_job4 = new Job("", new Employer(""),
                new Location("Desert"), new PositionType(""),
                new CoreCompetency("Persistence"));

        assertEquals("\nID: " + test_job4.getId() + "\nName: Data not available\nEmployer: Data not available\nLocation: Desert\nPosition Type: Data not available\nCore Competency: Persistence\n", test_job4.toString());

    }

}
