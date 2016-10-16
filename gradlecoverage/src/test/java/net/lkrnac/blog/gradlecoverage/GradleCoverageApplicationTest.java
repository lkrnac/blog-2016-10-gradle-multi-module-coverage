package net.lkrnac.blog.gradlecoverage;

import org.junit.Test;
import org.testng.Assert;

/**
 * Created by: Lubos Krnac
 * Date: 2016-10-16.
 */
public class GradleCoverageApplicationTest {
    @Test
    public void testPerformJobs() {
        // GIVEN
        GradleCoverageApplication application = new GradleCoverageApplication();

        // WHEN
        String result = application.performJobs("Jobs performed: ");

        // THEN
        Assert.assertEquals(result, "Jobs performed: Module1, Common, Module2, Common");
    }
}
