package TestNG_others;

import TestNG_sample_01.student_marks;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paramiter_datapass {
    student_marks app1=new student_marks();

    @Test
    @Parameters({"val1","val2"})
    public void test_studentRegister(String st_name,int age){
        String actual=app1.registerStudent(st_name,age);
        Assert.assertEquals(actual,"Registration successful");
    }


}
