package net.lkrnac.blog.gradlecoverage;

/**
 * Created by: Lubos Krnac
 * Date: 2016-10-16.
 */
public class GradleCoverageApplication {
    private Module1Service module1Service = new Module1Service();
    private Module2Service module2Service = new Module2Service();

    public static void main(String... args) {
        GradleCoverageApplication application = new GradleCoverageApplication();
        System.out.print(application.performJobs("Jobs Performed"));
    }

    String performJobs(String parameter){
        return module2Service.performModule2Job(module1Service.performModule1Job(parameter) + ", ");
    }
}
