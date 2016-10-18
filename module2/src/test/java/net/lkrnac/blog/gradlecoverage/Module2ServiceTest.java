package net.lkrnac.blog.gradlecoverage;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by: Lubos Krnac
 * Date: 2016-10-16.
 */
public class Module2ServiceTest {
    @Test
    public void testPerformCommonJob(){
        // GIVEN
        Module2Service module2Service = new Module2Service();

        // WHEN
        String result = module2Service.performModule2Job("Jobs performed: ");

        // THEN
        Assert.assertEquals("Jobs performed: Module2, Common", result);
    }
}
