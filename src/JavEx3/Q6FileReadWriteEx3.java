package JavEx3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



    public class FileReadWriteEx3 {
        public static void main(String[] args) throws IOException
        {
            String Test = "C:\\CAT\\exercise4.txt"; //Specify the file path

            File FC = new File(Test); //creating a File object and passing the path.
            FC.createNewFile(); //This would create a new text file

            FileWriter file1 = new FileWriter(Test);//Create object of FileWriter class to edit the file
            BufferedWriter file2 = new BufferedWriter(file1);//Create object of BufferedWriter
            class
            file2.write("Never eat silk worms"); //Writing In To File.
            file2.newLine();//To write next string on new line.
            file2.write("Every dog has its own day"); //Writing In To File.
            file2.newLine();//To write next string on new line.
            file2.write("Experience is the teacher of all things"); //Writing In To File.
            file2.close();

            FileReader file3 = new FileReader(Test); //Create Object of FileReader to read the file
            BufferedReader file4 = new BufferedReader(file3);//Create Object of BufferedReader
            String Content = "empty1"; //To make the variable not null
            //Loop to read all lines one by one from file and print It.
            while((Content = file4.readLine()) != null) {
                System.out.println(Content);
            }
            file4.close();

        }


    }

