package Projects.Day2;

public class StudentGrade {
     static double average;
    static void calculateMarks(int sub1,int sub2,int sub3){
        int totalMarks=sub1+sub2+sub3;
         average=(double) totalMarks/3;
        System.out.println("Total Marks: "+totalMarks);
        System.out.println("Average : "+average);
    }
    static void calculateGrade(double average){
        if (average>=90){
            System.out.println("A Grade");
        } else if (average>=80) {
            System.out.println("B Grade");
        } else if (average>=70) {
            System.out.println("C Grade");
        } else if (average>=60) {
            System.out.println("D Grade");
        }else {
            System.out.println("Fail");
        }
    }
    static void findHighestMark(int sub1,int sub2,int sub3){
        if (sub1>sub2 && sub1>sub3){
            System.out.println("Highest Mark : "+sub1);
        } else if (sub2>sub3) {
            System.out.println("Highest Mark :"+sub2);
        }
        else {
            System.out.println("Highest Mark : "+sub3);
        }
    }

    static void findLowestMark(int sub1,int sub2,int sub3){
        if (sub1<sub2 && sub1<sub3){
            System.out.println("Lowest Mark : "+sub1);
        } else if (sub2<sub3) {
            System.out.println("Lowest Mark :"+sub2);
        }
        else {
            System.out.println("Lowest Mark : "+sub3);
        }
    }
    static void checkResult(int sub1,int sub2,int sub3){
        if (sub1>=35 && sub2>=35 && sub3>=35){
            System.out.println("Result : Pass");
        }else {
            System.out.println("Result :Fail");
        }
    }
    static void countPassedSubjects(int sub1,int sub2,int sub3){
        int count=0;
        if (sub1>=35)count++;
        if (sub2>=35)count++;
        if (sub3>=35)count++;
        System.out.println("Passed Subjects : "+count);

    }

    public static void main(String[] args) {
        calculateMarks(80,75,90);
        calculateGrade(average);
        findHighestMark(80,75,90);
        checkResult(80,30,90);
        findLowestMark(80,75,90);
        countPassedSubjects(80,30,90);
        countPassedSubjects(80,75,90);
        countPassedSubjects(20,30,25);
    }
}
