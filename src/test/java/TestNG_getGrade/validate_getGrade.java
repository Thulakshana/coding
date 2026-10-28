package TestNG_getGrade;

import TestNG_sample_01.student_marks;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class validate_getGrade {
    student_marks app1=new student_marks();
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
    @Test(dataProvider = "marks")
    public void validation_getgrade(int marks,String result){
        String actual_result=app1.getGrade(marks);
        Assert.assertEquals(actual_result,result);
    }
}
