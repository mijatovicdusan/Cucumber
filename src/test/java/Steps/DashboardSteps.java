package Steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.ArrayList;
import java.util.List;

public class DashboardSteps extends CommonMethods {

    @Then("user verify dashboard page")
    public void user_verify_dashboard_page() {

        System.out.println("Batch 14 is happy");

    }
    @Then("user verify all the dashboard tabs")
    public void user_verify_all_the_dashboard_tabs(DataTable dataTable) {

        List<String>expectedTabs=dataTable.asList();

        List<String>actualTab=new ArrayList<>();

        for (WebElement ele:dashboard.dashboardTabs
             ) {

            actualTab.add(ele.getText());

        }

        //printing the text for both feature file and from application
        System.out.println(expectedTabs);
        System.out.println(actualTab);

        //.equals is method that we use to compare 2 lists
        Assert.assertTrue(expectedTabs.equals(actualTab));

    }


}
