package studentlist;

import java.util.Scanner;

/**
 * This class +++Insert Description Here+++
 *
 * @author Paul Bonenfant
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // First we do the word example
        
        System.out.println("Please enter a word");
        
        Scanner input = new Scanner(System.in);
        
        String word = input.nextLine();
        
        char[] wordArray = new char[word.length()];
        
        for (int i = 0; i < wordArray.length; i++) {            
            wordArray[i] = word.charAt(i);
        }

        // print out the char array
        for (char character: wordArray) {
            System.out.print(character);
        }
        
        // add a blank line
        System.out.println();
        
        // now print in reverse
        for(int i = wordArray.length - 1; i >= 0; i-- ) {
            System.out.print(wordArray[i]);
        }
        
        // add a blank line
        System.out.println();
        
        System.out.println("Now we create our Students");
        
        Student[] students = new Student[3];
        
        for(int i = 0; i < 3; i++) {
            System.out.println("Enter Student Name");    
            String name = input.nextLine();
            Student student = new Student(name);
            students[i] = student;
        }
        
        System.out.println("Let's print them back");
        
        for(Student student: students) {
            System.out.println(student.getName());
        }
        
    }

}

