package TestNG_registration_student;

import TestNG_sample_01.student_marks;
import org.testng.Assert;
import org.testng.annotations.Test;

public class normal {

    student_marks app1=new student_marks();

    @Test
    public void validate_registerStudent(){
        String actual_value=app1.registerStudent("thulakshana",55);
        Assert.assertEquals(actual_value,"Registration successful");
    }


}
