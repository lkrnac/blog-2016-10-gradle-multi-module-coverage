package net.lkrnac.blog.gradlecoverage;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by: Lubos Krnac
 * Date: 2016-10-16.
 */
public class Module1ServiceTest {
    @Test
    public void testPerformCommonJob(){
        // GIVEN
        Module1Service module1Service = new Module1Service();

        // WHEN
        String result = module1Service.performModule1Job("Jobs performed: ");

        // THEN
        Assert.assertEquals(result, "Jobs performed: Module1, Common");
    }
}
