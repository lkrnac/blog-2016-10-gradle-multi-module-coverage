package net.lkrnac.blog.gradlecoverage;

/**
 * Created by: Lubos Krnac
 * Date: 2016-10-16.
 */
class CommonService {
    String performCommonJob(String parameter) {
        if (parameter == null) { // this is forcibly not tested to decrease test coverage
            return null;
        }
        return parameter + "Common";
    }
}
