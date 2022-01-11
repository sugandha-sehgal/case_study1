import java.util.List;

public class test_script {
    public static void main (String Args[]) {
        String student = "Ananth";
        List<Score> s3 = cs1.studentDetails(student);
        assert(s3.get(0).getSubject_name().equals("Computing Technlogies")):"test case failed";
    }
}
