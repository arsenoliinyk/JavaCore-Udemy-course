package com.udemy.course.readingFilesWithFileReader;

import java.io.*;

public class App {

    public static void main(String[] args) {

        File file = new File("text.txt");
        BufferedReader br = null;
        
        try {
            FileReader fr = new FileReader(file);
            br = new BufferedReader(fr);

            String line;

            //in this case we wil have outputted only first line, so we shold do while loop to output each line
            /*
            line = br.readLine();
            System.out.println(line);
            */

            while( (line = br.readLine()) != null){
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            ///Can't open the file
            System.out.println("File not found: " + file.toString());
        } catch (IOException e) {
            ///It could opent the file, but for some reason it's not able to read it
            System.out.println("Unable to read file: " + file.toString());
        }

        finally {
            try {
                br.close();
            } catch(IOException e){
                System.out.println("Unable close file: " + file.toString());
            } catch (NullPointerException ex){
                ///File was probably never opened
            }
        }

    }

}
