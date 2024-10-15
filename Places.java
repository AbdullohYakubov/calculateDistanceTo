import java.util.Scanner;

public class Places {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the x-coordinate of the first person: ");
        double xcoord_1 = src.nextDouble(); 
        System.out.println("Enter the y-coordinate of the first person: ");
        double ycoord_1 = src.nextDouble(); 
        System.out.println("Enter the x-coordinate of the second person: ");
        double xcoord_2 = src.nextDouble(); 
        System.out.println("Enter the y-coordinate of the second person: ");
        double ycoord_2 = src.nextDouble(); 

        Person student = new Person("Abdullokh Yokubov", 19, xcoord_1, ycoord_1);
        Person professor = new Person("Ahmed Ibrahim", 50, xcoord_2, ycoord_2);
        // System.out.println(student);
        // System.out.println(professor);
        // System.out.println(student.getXcoord());
        // System.out.println(professor.getYcoord());
        System.out.println(student.distanceTo(professor));
    }
}
