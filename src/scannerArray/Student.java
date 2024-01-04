package scannerArray;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public String name;
    public List<String> schoolSubjects;
    public List<Integer> votes;

    public Student(String name){
        this.name = name;
        this.schoolSubjects = new ArrayList<>();
        this.votes = new ArrayList<>();
    }



    public double calculateAvg(){
        if (votes.isEmpty()){
            return 0.0;
        }
        int sum = 0;
        for (int vote : votes) {
            sum += vote;
        }
        return (double) sum /votes.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSchoolSubjects() {
        return schoolSubjects;
    }

    public void setSchoolSubjects(List<String> schoolSubjects) {
        this.schoolSubjects = schoolSubjects;
    }

    public List<Integer> getVotes() {
        return votes;
    }

    public void setVotes(List<Integer> votes) {
        this.votes = votes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", schoolSubjects=" + schoolSubjects +
                ", votes=" + votes +
                '}';
    }
}
