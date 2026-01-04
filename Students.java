//Exercice1
import java.util.Arrays;
import java.util.Scanner;
public class Students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        double[] grades= new double[n];
        for(int i=0;i<n;i++){
            System.out.print("enter grade"   +(i+1));
            grades[i]= sc.nextDouble();
        }
        //Sort and display the list of grades
        Arrays.sort(grades);
        System.out.print("Sorted"+Arrays.toString(grades));
//average
        double sum=0;
        for (double g:grades){
            sum+=g;
        }
        double average=sum/ n;
        System.out.print("average garde:"+ average) ;
//Display the highest and lowest grades.
        System.out.print("Lowest grade: " + grades[0]);
        System.out.print("Highest grade: " + grades[n - 1]);
        //Display the number of students with a grade entered by the user.
        System.out.print("Enter a grade to search: ");
        double search = sc.nextDouble();

        int count = 0;
        for (double g : grades) {
            if (g == search) {
                count++;
            }
        }
        System.out.println("Number of students with this grade: " + count);
    }
}

