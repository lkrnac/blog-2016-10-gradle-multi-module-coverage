package net.lkrnac.blog.gradlecoverage;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by: Lubos Krnac
 * Date: 2016-10-16.
 */
public class CommonServiceTest {
    @Test
    public void testPerformCommonJob(){
        // GIVEN
        CommonService commonService = new CommonService();

        // WHEN
        String result = commonService.performCommonJob("Jobs performed: ");

        // THEN
        Assert.assertEquals("Jobs performed: Common", result);
    }
}
