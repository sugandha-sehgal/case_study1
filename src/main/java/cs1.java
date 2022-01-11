import java.util.*;


public class cs1 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String student = sc.next();
        studentDetails(student);

    }

    public static List<Score> studentDetails(String student) {
        HashMap<String, Distributions> map1 = new HashMap<>();//Creating HashMap
        map1.put("test", new Distributions("test", 40));  //Put elements in Map
        map1.put("quiz", new Distributions("quiz", 20));
        map1.put("lab", new Distributions("lab work", 10));
        map1.put("project", new Distributions("project", 30));

        HashMap<String, Assignment> map = new HashMap<>();
        map.put("1", new Assignment(1, "Ananth", "Electro Fields", "test_1", "21-Jul-16", 100));
        map.put("2", new Assignment(2, "Bhagath", "Electro Fields", "test_1", "21-Jul-16", 78));
        map.put("3", new Assignment(3, "Chaya", "Electro Fields", "test_1", "21-Jul-16", 68));
        map.put("4", new Assignment(4, "Esharath", "Electro Fields", "test_1", "21-Jul-16", 87));
        map.put("5", new Assignment(5, "Bhagath", "Electro Fields", "quiz_1", "22-Jul-16", 20));
        map.put("6", new Assignment(6, "Chaya", "Electro Fields", "lab_1", "23-Jul-16", 10));
        map.put("7", new Assignment(7, "Ananth", "Electro Fields", "project_1", "24-Jul-16", 100));
        map.put("8", new Assignment(8, "Davanth", "Electro Fields", "project_1", "24-Jul-16", 100));
        map.put("9", new Assignment(9, "Bhagath", "Electro Fields", "quiz_2", "25-Jul-16", 50));
        map.put("10", new Assignment(10, "Ananth", "Electro Fields", "quiz_1", "26-Jul-16", 100));
        map.put("11", new Assignment(11, "Bhagath", "Electro Fields", "lab_1", "27-Jul-16", 10));
        map.put("12", new Assignment(12, "Chaya", "Electro Fields", "project_1", "28-Jul-16", 100));
        map.put("13", new Assignment(13, "Bhagath", "Electro Fields", "project_1", "28-Jul-16", 100));
        map.put("14", new Assignment(14, "Ananth", "Computing Technlogies", "test_1", "29-Jul-16", 86));
        map.put("15", new Assignment(15, "Ananth", "Electro Fields", "quiz_2", "29-Jul-16", 100));
        map.put("16", new Assignment(16, "Bhagath", "Computing Technologies", "project_1", "30-Jul-16", 100));
        map.put("17", new Assignment(16, "Ananth", "Electro Fields", "lab_1", "330-Jul-16", 100));
        map.put("18", new Assignment(18, "Chaya", "Computing Technologies", "quiz_1", "31-Jul-16", 20));
        map.put("19", new Assignment(19, "Ananth", "Electro Fields", "test_2", "1-Aug-16", 100));
        map.put("20", new Assignment(20, "Chaya", "Electro Fields", "test_2", "1-Aug-16", 92));

        HashMap<String, List<Assignment>> map2 = new HashMap<>();
        for (Map.Entry<String, Assignment> entry1 : map.entrySet()) {
            if (map2.containsKey(entry1.getValue().getStudent_name())) {
                map2.get(entry1.getValue().getStudent_name()).add(entry1.getValue());
            } else {
                List<Assignment> temp = new ArrayList<>();
                temp.add(entry1.getValue());
                map2.put(entry1.getValue().getStudent_name(), temp);
            }
        }
        HashMap<String, List<Score>> map3 = new HashMap<>();
        for (Map.Entry<String, List<Assignment>> entry1 : map2.entrySet()) {
            if (entry1.getKey().equals(student)) {
                double quiz_score = 0;
                double test_score = 0;
                double lab_score = 0;
                double project_score = 0.0;
                int flag = 0;
                List<Assignment> temp = entry1.getValue();
                for (Assignment assignment : temp) {
                    List<Score> tmp;
                    if (map3.containsKey(student)) {
                        tmp = map3.get(student);
                        int weightage = map1.get(assignment.getAssignment_category().split("_")[0]).getWeight();
                        String subject_name = assignment.getSubject();
                        Score s1;
                        for (Score s : tmp) {
                            if (s.getSubject_name().equals(subject_name)) {
                                flag = 0;
                                if (assignment.getAssignment_category().split("_")[0].equals("test")) {
                                    test_score = Double.parseDouble(s.getTest_score());
                                    test_score = test_score + assignment.getPoints() * weightage / 100.0;
                                    s.setTest_score(Double.toString(test_score));
                                    s.setCount_test_score(s.getCount_test_score() + 1);
                                }
                                if (assignment.getAssignment_category().split("_")[0].equals("quiz")) {
                                    quiz_score = quiz_score + assignment.getPoints() * weightage / 100.0;
                                    s.setQuiz_score(Double.toString(quiz_score));
                                    s.setCount_quiz_score(s.getCount_quiz_score() + 1);
                                }
                                if (assignment.getAssignment_category().split("_")[0].equals("lab")) {
                                    lab_score = lab_score + (assignment.getPoints() * weightage) / 100.0;
                                    s.setLab_score(Double.toString(lab_score));
                                    s.setCount_lab_score(s.getCount_lab_score() + 1);
                                }

                                if (assignment.getAssignment_category().split("_")[0].equals("project")) {
                                    project_score = project_score + (assignment.getPoints() * weightage) / 100.0;
                                    s.setProject_score(Double.toString(project_score));
                                    s.setCount_project_score(s.getCount_project_score() + 1);
                                }

                                break;

                            } else {
                                flag = 1;
                            }
                        }
                        if (flag == 1) {
                            s1 = new Score();
                            s1.setSubject_name(subject_name);
                            if (assignment.getAssignment_category().split("_")[0].equals("test")) {
                                test_score = assignment.getPoints() * weightage / 100.0;
                                s1.setTest_score(Double.toString(test_score));
                                s1.setCount_test_score(s1.getCount_test_score() + 1);
                            }
                            if (assignment.getAssignment_category().split("_")[0].equals("quiz")) {
                                quiz_score = assignment.getPoints() * weightage / 100.0;
                                s1.setQuiz_score(Double.toString(quiz_score));
                                s1.setCount_quiz_score(s1.getCount_quiz_score() + 1);
                            }
                            if (assignment.getAssignment_category().split("_")[0].equals("lab")) {
                                lab_score = assignment.getPoints() * weightage / 100.0;
                                s1.setLab_score(Double.toString(lab_score));
                                s1.setCount_lab_score(s1.getCount_lab_score() + 1);
                            }

                            if (assignment.getAssignment_category().split("_")[0].equals("project")) {
                                project_score = project_score + (assignment.getPoints() * weightage) / 100.0;
                                s1.setProject_score(Double.toString(project_score));
                                s1.setCount_project_score(s1.getCount_project_score() + 1);
                            }


                            tmp.add(s1);
                        }
                        map3.put(student, tmp);
                    } else {
                        tmp = new ArrayList<>();
                        int weightage = map1.get(assignment.getAssignment_category().split("_")[0]).getWeight();
                        String subject_name = assignment.getSubject();
                        Score s1 = new Score();
                        s1.setSubject_name(subject_name);
                        if (assignment.getAssignment_category().split("_")[0].equals("test")) {
                            test_score = (assignment.getPoints() * weightage) / 100.0;
                            s1.setTest_score(Double.toString(test_score));
                            s1.setCount_test_score(s1.getCount_test_score() + 1);
                        }
                        if (assignment.getAssignment_category().split("_")[0].equals("quiz")) {
                            quiz_score = (assignment.getPoints() * weightage) / 100.0;
                            s1.setQuiz_score(Double.toString(quiz_score));
                            s1.setCount_quiz_score(s1.getCount_quiz_score() + 1);
                        }
                        if (assignment.getAssignment_category().split("_")[0].equals("lab")) {
                            lab_score = (assignment.getPoints() * weightage) / 100.0;
                            s1.setLab_score(Double.toString(lab_score));
                            s1.setCount_lab_score(s1.getCount_lab_score() + 1);
                        }
                        tmp.add(s1);
                        map3.put(student, tmp);
                    }
                }
            }
        }
        List<Score> s3 = map3.get(student);

        for (Score s4 : s3) {
            double lab = 0.0;
            double test = 0.0;
            double quiz = 0.0;
            double project = 0.0;

            if (s4.getLab_score().equals("0.0")) {
                lab = 0.0;
            } else lab = Double.parseDouble(s4.getLab_score()) / s4.getCount_lab_score();
            if (s4.getTest_score().equals("0.0")) {
                test = 0.0;
            } else test = Double.parseDouble(s4.getTest_score()) / s4.getCount_test_score();
            if (s4.getQuiz_score().equals("0.0")) {
                quiz = 0.0;
            } else quiz = Double.parseDouble(s4.getQuiz_score()) / s4.getCount_quiz_score();
            if (s4.getProject_score().equals("0.0")) {
                project = 0.0;
            } else project = Double.parseDouble(s4.getProject_score()) / s4.getCount_project_score();
            Double overall_rating = lab + test + quiz + project;

            s4.setOverall_rating(Double.toString(overall_rating));
//            System.out.print(s4.getSubject_name()+" ");
//            if(s4.getTest_score().equals("0.0"))
//            {
//                s4.setTest_score("NA");
//            }
//            if(s4.getQuiz_score().equals("0.0"))
//            {
//                s4.setQuiz_score("NA");
//            }
//            if(s4.getLab_score().equals("0.0"))
//            {
//                s4.setLab_score("NA");
//            }

            System.out.println(s4.getSubject_name() + " " + Double.parseDouble(s4.getLab_score()) / s4.getCount_lab_score() + " " + Double.parseDouble(s4.getTest_score()) / s4.getCount_test_score() + " " + Double.parseDouble(s4.getQuiz_score()) / s4.getCount_quiz_score() + " " + Double.parseDouble(s4.getProject_score()) / s4.getCount_project_score() + " " + overall_rating);

        }
        return s3;
    }
}

