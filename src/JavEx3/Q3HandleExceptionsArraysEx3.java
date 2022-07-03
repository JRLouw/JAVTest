package JavEx3;

public class Q3HandleExceptionsArraysEx3 {

    public static void main (String args[]) {
        String course [] = new String[4]; //declaring a one dimensional array


        //Assigning elements to the array

        course[0]="Java Training For Testers";
        course[1]="Certified Lead Pen Test";
        course[2]="ISTQB CTFL";
        course[3]="DevOps Foundation";


        try {

            for (int i = 0;i<5;i++) {
                System.out.println(course[i]);
            }

        }catch(Exception e) {
            System.out.println("Exception is"+e);
        }
    }
}
