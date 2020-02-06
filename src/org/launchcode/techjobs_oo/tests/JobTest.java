package org.launchcode.techjobs_oo.tests;

import org.junit.Assert;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

public class JobTest {

 Job job1=new Job();
 Job job2=new Job();
 Job job3=new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
 Job job4=new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
 Job job5=new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

 @Test
    public void testSettingJobId() {
        Assert.assertEquals(job1,job2);
        Assert.assertTrue(job1.equals(job1));
        Assert.assertFalse(!job1.equals(job2));


    }
    @Test
    public void testJobConstructorSetsAllFields(){
     Assert.assertEquals("Product tester",job3.getName());
        Assert.assertEquals("ACME",job3.getEmployer().getValue());
        Assert.assertEquals("Desert",job3.getLocation().toString());
        Assert.assertEquals("Quality control",job3.getPositionType().toString());
        Assert.assertEquals("Persistence",job3.getCoreCompetency().toString());
    }

    @Test
    public void testJobsForEquality(){
        Assert.assertEquals("Product tester",job3.getName());
        Assert.assertEquals("ACME",job3.getEmployer().getValue());
        Assert.assertEquals("Desert",job3.getLocation().toString());
        Assert.assertEquals("Quality control",job3.getPositionType().toString());
        Assert.assertEquals("Persistence",job3.getCoreCompetency().toString());
    }

   /* public String toString(Job job) {

        retunr
    }*/
}
