import java.util.Date;

public class Assignment {
    private int serial_number;
    private String student_name;
    private String subject;
    private String assignment_category;
    private String date_of_submission;
    private int points;

    public int getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(int serial_number) {
        this.serial_number = serial_number;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAssignment_category() {
        return assignment_category;
    }

    public void setAssignment_category(String assignment_category) {
        this.assignment_category = assignment_category;
    }

    public String getDate_of_submission() {
        return date_of_submission;
    }

    public void setDate_of_submission(String date_of_submission) {
        this.date_of_submission = date_of_submission;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Assignment(int serial_number, String student_name, String subject, String assignment_category, String date_of_submission, int points) {
        this.serial_number = serial_number;
        this.student_name = student_name;
        this.subject = subject;
        this.assignment_category = assignment_category;
        this.date_of_submission = date_of_submission;
        this.points = points;
    }
}
