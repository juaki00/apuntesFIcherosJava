package org.example;

import javax.swing.text.html.HTMLDocument;
import java.io.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {



//        File f = new File("./archivo.txt");
//        try {
//            System.out.println(f.createNewFile());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        f.delete();
//
//        for(File file: f.listFiles()){
//            if(file.isDirectory()){
//                System.out.print("d ");
//            }
//            else{
//                System.out.print("f ");
//            }
//            System.out.print(file.length());
//            System.out.print("  -  " + new Date(file.lastModified()));
//            System.out.println("  -  " + file.getName());
//        }


//        try {
//            var fileReader = new FileReader("pom.xml");
//            int c, tam = 0;
//            while ((c = fileReader.read())!=-1){
//                System.out.print((char)c);
//                tam++;
//            }
//            fileReader.close();
//            System.out.println("Tamaño: " + tam);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


//        try(var br = new BufferedReader(new FileReader("pom.xml")) ;
//            BufferedWriter bw = new BufferedWriter(new FileWriter("pom2.xml"))){
//            String s;
//            while ((s = br.readLine()) != null){
//                System.out.println(s);
//                bw.write(s.toUpperCase());
//                bw.newLine();
//                bw.flush();
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("Error de fichero");
//        } catch (IOException e) {
//            System.out.println("Error de entrada salida");
//        }



//        List<String> todo = null;
//        try(var br = new BufferedReader(new FileReader("pom.xml"))){
//            todo = br.lines().toList();
//        } catch (FileNotFoundException e) {
//            System.out.println("Error de fichero");
//        } catch (IOException e) {
//            System.out.println("Error de entrada salida");
//        }
//        todo.forEach((s)->{
//            System.out.print(s.toUpperCase());
//            System.out.println(" "+s.trim().split(" ").length);
//        });



//        try {
//            Scanner sc = new Scanner(new File("pom.xml"));
//            while(sc.hasNext()){
//                System.out.println(sc.next());
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("Error de fichero");
//        }
//


                try {
            Scanner sc = new Scanner(new File("pom.xml"));
            while(sc.hasNext()){
                String caracter = sc.next();
                if(caracter.)
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error de fichero");
        }


    }
}