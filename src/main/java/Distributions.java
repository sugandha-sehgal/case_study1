public class Distributions {
    private String assignment_category;

    public Distributions(String assignment_category, int weight) {
        this.assignment_category = assignment_category;
        this.weight = weight;
    }

    private int weight;

    public String getAssignment_category() {
        return assignment_category;
    }

    public void setAssignment_category(String assignment_category) {
        this.assignment_category = assignment_category;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
