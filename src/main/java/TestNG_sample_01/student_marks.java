package TestNG_sample_01;

public class student_marks {
    public String registerStudent(String name, int age) {

        if (name == null || name.isEmpty()) {
            return "Invalid name";
        }

        if (age < 18) {
            return "Student must be 18 or older";
        }

        return "Registration successful";
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////


    public boolean isPassed(int marks) {

        if (marks >= 50) {
            return true;
        }

        return false;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////

    public String getGrade(int marks) {

        if (marks >= 75) {
            return "A";
        } else if (marks >= 65) {
            return "B";
        } else if (marks >= 55) {
            return "C";
        } else if (marks >= 50) {
            return "S";
        } else {
            return "F";
        }
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////

    public boolean isEligibleForScholarship(int marks, int attendance) {

        if (marks >= 75 && attendance >= 80) {
            return true;
        }

        return false;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////

    public double calculateAverage(int mark1, int mark2, int mark3) {

        return (mark1 + mark2 + mark3) / 3.0;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////

    public boolean isValidStudentId(String studentId) {

        if (studentId == null) {
            return false;
        }

        return studentId.matches("STU-[0-9]{4}");
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////
}
