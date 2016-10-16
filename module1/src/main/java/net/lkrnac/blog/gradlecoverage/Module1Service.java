package net.lkrnac.blog.gradlecoverage;

/**
 * Created by: Lubos Krnac
 * Date: 2016-10-16.
 */
class Module1Service {
    private CommonService commonService = new CommonService();

    String performModule1Job(String parameter) {
        if (parameter == null) { // this is forcibly not tested to decrease test coverage
            return null;
        }
        return commonService.performCommonJob(parameter + "Module1, ");
    }
}
