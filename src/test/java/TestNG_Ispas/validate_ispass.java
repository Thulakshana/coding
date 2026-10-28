
package TestNG_Ispas;

import TestNG_sample_01.student_marks;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class validate_ispass {

    student_marks app1 = new student_marks();

    @DataProvider(name = "marks")
    public Object[][] marks() {
        return new Object[][] {
                {44, false},
                {50, true},
                {66, true}
        };
    }

    @Test(dataProvider = "marks")
    public void test_ispassed(int marks,boolean result){
        Boolean actual_result=app1.isPassed(marks);
        Assert.assertTrue(actual_result);
    }
}
