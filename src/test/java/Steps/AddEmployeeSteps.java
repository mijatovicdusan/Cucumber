package Steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;
import utils.Constants;
import utils.ExcelReader;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AddEmployeeSteps extends CommonMethods {

    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {

        //  WebElement pimOption= driver.findElement(By.id("menu_pim_viewPimModule"));
        // pimOption.click();
        click(dashboard.pimOption);


    }


    @When("user clicks on Add employee button")
    public void user_clicks_on_add_employee_button() {

        // WebElement addEmployeeOption= driver.findElement(By.id("menu_pim_addEmployee"));
        //addEmployeeOption.click();
        click(dashboard.addEmployeeOption);

    }

    @When("user enter first name and last name")
    public void user_enter_first_name_and_last_name() {


        // WebElement FirstName=driver.findElement(By.id("firstName"));
        // FirstName.sendKeys("Dusan");
        sendText(addEmployee.firstNameField, "Dusan");

        //WebElement LastName=driver.findElement(By.id("lastName"));
        //LastName.sendKeys("Mijatovic");
        sendText(addEmployee.lastNameField, "Mijatovic");

    }

    @When("user clicks on save button")
    public void user_clicks_on_save_button() {


        // WebElement saveBtn=driver.findElement(By.id("btnSave"));
        //saveBtn.click();
        click(addEmployee.saveButton);
    }

    @Then("employee is added successfully")
    public void employee_is_added_successfully() {

        System.out.println("Employee added");
    }

    @When("user enter {string} and {string}")
    public void user_enter_and(String firstName, String lastName) {

        sendText(addEmployee.firstNameField, firstName);
        sendText(addEmployee.lastNameField, lastName);

    }


    @When("user  enter {string} and {string} for adding multiple employees")
    public void user_enter_and_for_adding_multiple_employees(String firstNameValue, String lastNameValue) {

        sendText(addEmployee.firstNameField, firstNameValue);
        sendText(addEmployee.lastNameField, lastNameValue);
    }

    @When("user adds multiple employees and verify that they are added")
    public void user_adds_multiple_employees_and_verify_that_they_are_added(DataTable dataTable) throws InterruptedException {

        List<Map<String,String>> employeeNames=dataTable.asMaps();
//getting the map from list of maps
        for (Map<String,String>employee:employeeNames
             ) {
            //getting the keys and values from every map
           String firstNameValue=employee.get("firstName");
           String middleNameValue=employee.get("middleName");
            String lastNameValue=employee.get("lastName");

            sendText(addEmployee.firstNameField, firstNameValue);
            sendText(addEmployee.lastNameField, lastNameValue);
            sendText(addEmployee.middleNameField, middleNameValue);

            click(addEmployee.saveButton);
            Thread.sleep(2000);

            //verify that employee is added
            click(dashboard.addEmployeeOption);
            Thread.sleep(2000);



        }

    }
    @When("user adds multiple employees from excel using {string} and verify it")
    public void user_adds_multiple_employees_from_excel_using_and_verify_it(String sheetName) throws InterruptedException {

        List<Map<String,String>> empFromExcel= ExcelReader.excelListIntoMap(Constants.TESTDATA_FILEPATH,sheetName);
//it returns one map from list of maps
        Iterator<Map<String,String>> itr=empFromExcel.iterator();
        while (itr.hasNext()){

 // it returns the key and value for employee from excel
            Map<String,String> mapNewEmp=itr.next();

            sendText(addEmployee.firstNameField,mapNewEmp.get("firstName"));
            sendText(addEmployee.middleNameField,mapNewEmp.get("middleName"));
            sendText(addEmployee.lastNameField,mapNewEmp.get("lastName"));

            String empIdValue = addEmployee.empIdLocator.getAttribute("value");


            sendText(addEmployee.photograph,mapNewEmp.get("photograph"));


            if(!addEmployee.checkbox.isSelected()){

                click(addEmployee.checkbox);

            }
            sendText(addEmployee.createusernameField,mapNewEmp.get("username"));

            sendText(addEmployee.createpasswordField,mapNewEmp.get("password"));

            sendText(addEmployee.confirmpasswordField,mapNewEmp.get("confirmPassword"));




            click(addEmployee.saveButton);
            System.out.println("Click taken on save button");
            Thread.sleep(3000);


            click(dashboard.empListOption);
            Thread.sleep(2000);
            System.out.println("Click taken on emp list option ");

            //to search employee we use empId that we capture from attribute
            sendText(employeeList.empSearchIdField,empIdValue);
            click(employeeList.searchButton);

            //verifying the employee added from the excel file

            List<WebElement> rowData=driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr"));

            for(int i=0; i<rowData.size(); i++){

                System.out.println("I am inside loop");

//getting the text of every element from here and storing it into string
              String rowText=rowData.get(i).getText();
                System.out.println(rowText);


                String expectedData=empIdValue+" "+mapNewEmp.get("firstName")+" "+mapNewEmp.get("middleName")+" "+
                        mapNewEmp.get("lastName");

                //verifying exact details of the employee
                Assert.assertEquals(expectedData,rowText);
            }




            click(dashboard.addEmployeeOption);
            Thread.sleep(2000);


        }
        }
        }


