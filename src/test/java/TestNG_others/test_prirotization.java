package TestNG_others;

import TestNG_sample_01.student_marks;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test_prirotization {
    student_marks app1=new student_marks();

    @DataProvider(name="student_data")
    public Object[][]data(){
        return new Object[][]{
                {"thulakshana",55,"Registration successful"},
                {null,55,"Invalid name"},
                {"thulakshana",11,"Student must be 18 or older"}


        };
    }

    @Test(dataProvider = "student_data" ,priority = 0)
    public void validate_registerStudent(String name,int age,String result){
        String actual_result=app1.registerStudent(name,age);
        Assert.assertEquals(actual_result,result);
    }

    @DataProvider(name = "markss")
    public Object[][] markss() {
        return new Object[][] {
                {44, false},
                {50, true},
                {66, true}
        };
    }

    @Test(dataProvider = "markss" , priority = 1)
    public void test_ispassed(int marks,boolean result){
        Boolean actual_result=app1.isPassed(marks);
        Assert.assertTrue(actual_result);
    }

    @DataProvider(name="marks")
    public Object[][]marks(){
        return new Object[][]{
                {75,"A"},
                {78,"A"},
                {65,"B"},
                {68,"B"},
                {55,"C"},
                {58,"C"},
                {50,"S"},
                {51,"S"},
                {44,"F"}
        };
    }
    @Test(dataProvider = "marks" , priority = 2)
    public void validation_getgrade(int marks,String result){
        String actual_result=app1.getGrade(marks);
        Assert.assertEquals(actual_result,result);
    }
}
