package net.lkrnac.blog.gradlecoverage;

import org.junit.Assert;
import org.junit.Test;

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
        Assert.assertEquals("Jobs performed: Module1, Common, Module2, Common", result);
    }
}
