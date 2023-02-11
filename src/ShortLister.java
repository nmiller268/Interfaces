
import java.io.File;

import java.io.FileNotFoundException;

import java.util.ArrayList;

import java.util.Scanner;

import javax.swing.JFileChooser;

    public class ShortLister {



        public static ArrayList<Object> collectAll(ArrayList<Object> objects, Filter f) {

//creating an array list to store the result

            ArrayList<Object> result = new ArrayList<Object>();

//looping through each object

            for (Object ob : objects) {

//if f accepts ob, adding ob to result

                if (f.accept(ob)) {

                    result.add(ob);

                }

            }

//returning result

            return result;

        }

        public static void main(String[] args) throws FileNotFoundException {

//creating a file chooser. you may pass a String containing current directory name

//inside '()' of JFileChooser() to set current directory

            JFileChooser chooser=new JFileChooser();

//displaying dialog box and checking if user selected a text

            if(chooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){

//fetching selected file

                File file=chooser.getSelectedFile();

//defining scanner to read from file

                Scanner scanner=new Scanner(file);

//creating an array list

                ArrayList<Object> words=new ArrayList<Object>();

//looping and adding each word to list

                while(scanner.hasNext()){

                    words.add(scanner.next());

                }

//closing file

                scanner.close();

//filtering words using collectAll method and a ShortWordFilter object

                words=collectAll(words, new ShortWordFilter());

//displaying filtered words

                System.out.println("Filtered words:");

                for(Object str:words){

                    System.out.println(str);

                }

            }

        }

    }



