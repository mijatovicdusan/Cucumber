package Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.CommonMethods;

public class Hooks extends CommonMethods {

    //use io.cucumber.java ti import this hook
    @Before
    public void preCondition(){

        openBrowserAndLaunchApplication();

    }

    //here we use special class called Scenario class from cucumber
    //this class holds complete information of your execution
    @After
    public void postCondition(Scenario scenario){

       byte[] pic;

       if(scenario.isFailed()){
         pic= takeScreenshot("failed/"+scenario.getName());
       }else{

           pic=takeScreenshot("passed/"+scenario.getName());
       }

       //to attach screenshot in report
        scenario.attach(pic,"image/png", scenario.getName());


        closeBrowser();


    }
}
