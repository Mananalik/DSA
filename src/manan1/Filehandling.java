package manan1;

import java.io.*;

public class Filehandling {
    public static void main(String[] args) {
        // create
        try {
            File fo = new File("new-file.txt");
            fo.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        // write in the file
        try {
            FileWriter fw = new FileWriter("new-file.txt");
            fw.write("सर्वधर्मान्परित्यज्य मामेकं शरणं व्रज, अहं त्वां सर्वपापेभ्यो मोक्षयिष्यामि मा शुच:");
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        // reading from a file
        try (BufferedReader br = new BufferedReader(new FileReader("new-file.txt"))) {
            while (br.ready()) {
                System.out.println(br.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // create
        try {
            File fo = new File("random.txt");
            fo.createNewFile();
            if(fo.delete()) {
                System.out.println(fo.getName());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
//        try(InputStreamReader isr = new InputStreamReader(System.in)){
//            System.out.println("Enter Some letters");
//            int letters = isr.read();
//            while(isr.ready()){
//                System.out.println((char) letters);
//                letters = isr.read();
//            }
//            isr.close();
//            System.out.println();
//        }catch(IOException e){
//            System.out.println(e.getMessage());
//        }
//        try (FileReader fr = new FileReader("")) {
//            int letters = fr.read();
//            while (fr.ready()) {
//                System.out.println((char) letters);
//                letters = fr.read();
//            }
////            isr.close();
//            System.out.println();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//            System.out.println("You typed: " + br.readLine());
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//
//        try (BufferedReader br = new BufferedReader(new FileReader("note.txt"))) {
//            while (br.ready()) {
//                System.out.println(br.readLine());
//            }
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//        static void output () {
//            // output
//            OutputStream os = System.out;
//            // os.write(😍); // range is exceeded
//            try (OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
//                osw.write("Hello World");
//                osw.write(97);
//                osw.write(10);
//                osw.write('A');
//                osw.write('\n');
//                char[] arr = "hello world".toCharArray();
//                osw.write(arr);
//                // osw.write(😍);
//            } catch (IOException e) {
//                System.out.println(e.getMessage());
//            }
//
//            try (FileWriter fw = new FileWriter("note.txt", true)) {
//                fw.write("this should be appended");
//            } catch (IOException e) {
//                System.out.println(e.getMessage());
//            }
//
//            try (BufferedWriter bw = new BufferedWriter(new FileWriter("note.txt"))) {
//                bw.write("Hare Krishna");
//            } catch (IOException e) {
//                System.out.println(e.getMessage());
//            }
//        }
    }
}
