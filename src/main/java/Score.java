public class Score {
    private String subject_name;
    private String project_score;
    private String overall_rating;
    private String test_score;
    private String quiz_score;
    private int count_test_score;
    private int count_lab_score;
    private int count_quiz_score;
    private int count_project_score;
    private int count_overall_rating;

    public int getCount_project_score() {
        return count_project_score;
    }

    public void setCount_project_score(int count_project_score) {
        this.count_project_score = count_project_score;
    }

    public int getCount_overall_rating() {
        return count_overall_rating;
    }

    public void setCount_overall_rating(int count_overall_rating) {
        this.count_overall_rating = count_overall_rating;
    }

    public int getCount_test_score() {
        return count_test_score;
    }

    public void setCount_test_score(int count_test_score) {
        this.count_test_score = count_test_score;
    }

    public int getCount_lab_score() {
        return count_lab_score;
    }

    public void setCount_lab_score(int count_lab_score) {
        this.count_lab_score = count_lab_score;
    }

    public int getCount_quiz_score() {
        return count_quiz_score;
    }

    public void setCount_quiz_score(int count_quiz_score) {
        this.count_quiz_score = count_quiz_score;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

    public String getProject_score() {
        return project_score;
    }

    public void setProject_score(String project_score) {
        this.project_score = project_score;
    }

    public String getOverall_rating() {
        return overall_rating;
    }

    public void setOverall_rating(String overall_rating) {
        this.overall_rating = overall_rating;
    }

    public String getTest_score() {
        return test_score;
    }

    public void setTest_score(String test_score) {
        this.test_score = test_score;
    }

    public String getQuiz_score() {
        return quiz_score;
    }

    public void setQuiz_score(String quiz_score) {
        this.quiz_score = quiz_score;
    }

    public String getLab_score() {
        return lab_score;
    }

    public void setLab_score(String lab_score) {
        this.lab_score = lab_score;
    }

    public Score(String subject_name, String project_score, String overall_rating, String test_score, String quiz_score, String lab_score) {
        this.subject_name = subject_name;
        this.project_score = project_score;
        this.overall_rating = overall_rating;
        this.test_score = test_score;
        this.quiz_score = quiz_score;
        this.lab_score = lab_score;
    }

    private String lab_score;

    public Score() {
        count_lab_score=0;
        count_quiz_score=0;
        count_test_score=0;
        count_project_score=0;
        count_overall_rating=0;
        test_score = "0.0";
        quiz_score = "0.0";
        lab_score = "0.0";
        project_score = "0.0";
        overall_rating = "0.0";

    }
}
