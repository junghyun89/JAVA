package reference;

public class Subject {

    String subjectName;
    int score;

    public Subject(String name) {
        subjectName = name;
    }
    public int getScore() {
        return score;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}
