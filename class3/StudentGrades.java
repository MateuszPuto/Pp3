import java.util.Arrays;
import java.util.Random;

public class StudentGrades { 
    String studentName; 
    double[] grades; 
    
    StudentGrades(String name, double[] grades) { 
        this.studentName = name;
        this.grades = grades; 
    }
    
    StudentGrades(String name, int numberOfGrades){
        Random rand = new Random();
        this.studentName = name;
        this.grades = new double[numberOfGrades];
        for(int i=0; i<numberOfGrades; i++){
            int randomInt = rand.nextInt(10);
            this.grades[i] = randomInt / 2.0;
        }
    }
    
    public double LowestGrade(){
        double lowest = 10;
        for(int i=0; i<grades.length; i++){
            if(grades[i] < lowest){
                lowest = grades[i];
            }
        }
        
        return lowest;
    }
    public double HighestGrade(){
        double highest = 0;
        for(int i=0; i<grades.length; i++){
            if(grades[i] > highest){
                highest = grades[i];
            }
        }
        
        return highest;
    }
    public int NumberOfGrades(){
        return grades.length;
    }
    public double GradeAverage(){
        double sum = 0;
        for(double g: grades){
            sum += g;
        }
        
        return sum / grades.length;
    }
    public void DisplayRecord(){
        System.out.print("Name: " + studentName + "\n");
        System.out.print("Grades: " + Arrays.toString(grades) + "\n");
        System.out.print("Number of grades: " + grades.length + "\n");
        System.out.print("Lowest grade: " + LowestGrade() + "\n");
        System.out.print("Highest grade: " + HighestGrade() + "\n");
        System.out.print("Average: " + GradeAverage() + "\n");
    }
}