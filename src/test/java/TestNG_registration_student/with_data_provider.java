package TestNG_registration_student;

import TestNG_sample_01.student_marks;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class with_data_provider {
    student_marks app1=new student_marks();

    @DataProvider(name="student_data")
    public Object[][]data(){
        return new Object[][]{
                {"thulakshana",55,"Registration successful"},
                {null,55,"Invalid name"},
                {"thulakshana",11,"Student must be 18 or older"}


        };
    }

    @Test(dataProvider = "student_data")
    public void validate_registerStudent(String name,int age,String result){
        String actual_result=app1.registerStudent(name,age);
        Assert.assertEquals(actual_result,result);
    }

}
