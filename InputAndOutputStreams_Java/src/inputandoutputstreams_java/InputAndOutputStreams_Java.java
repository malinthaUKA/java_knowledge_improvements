/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inputandoutputstreams_java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
/**
 *
 * @author malin
 */
public class InputAndOutputStreams_Java {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws IOException {
        
        /*
        There are two type of stram in input output stream
        1. byte stream
        2. charactor stream
        */
        
        
        // 1. Byte Stream
        
//        FileInputStream fileInputStream = null; // reading opration
//        FileOutputStream fileOutputStream = null; // writting operation
//        
//        try {
//            fileInputStream = new FileInputStream("E:\\Java\\java_knowledge_improvements\\InputAndOutputStreams_Java\\forInputTxt.txt"); // reading file/ source file
//            fileOutputStream = new FileOutputStream("E:\\Java\\java_knowledge_improvements\\InputAndOutputStreams_Java\\forOutputTxt.txt"); // writing file/ destination file
//            
//            // reads a byte at a time, if it reached end of the file, rerurns -1
//            int content;
//            while ((content = fileInputStream.read()) != -1) { 
//                
                /*
                int Return Type: Although FileInputStream reads data as bytes, the read() method returns an int rather than a byte. This is 
                because the int type can represent all possible byte values (0 to 255 for unsigned bytes) as well as a special 
                value (-1) that indicates the end of the stream.
                */
                
                /*
                
                1. Assignment First:

                The expression first evaluates fileInputStream.read().
                The result of this read() method (which is an int representing the next byte of data or -1 if the end of the stream is reached) is then assigned to the variable content.
                
                2. Comparison Next:

                After the assignment, the expression then compares the value of content to -1.
                If content is not equal to -1, the comparison returns true, allowing the loop to continue.
                If content is equal to -1, it means the end of the stream has been reached, and the comparison returns false, causing the loop to terminate.
                */
//                
//                fileOutputStream.write((byte)content);
//            }
                    
//        } finally {
//            if(fileInputStream != null){
//                fileInputStream.close();
//            }
//            if(fileOutputStream != null){
//                fileOutputStream.close();
//            }
//            
//            // we must close these two
//        }


        
        // 2. Charactor stream
        
        FileReader readerStream = null;
        FileWriter writerStream = null;
        
        try {
            readerStream = new FileReader("E:\\Java\\java_knowledge_improvements\\InputAndOutputStreams_Java\\charactorstTxtInput.txt");
            writerStream = new FileWriter("E:\\Java\\java_knowledge_improvements\\InputAndOutputStreams_Java\\charactorstTxtOutput.txt");
            
            // Reading source file and writing content to target file character by character
            int content;
            while((content = readerStream.read()) != -1){
                writerStream.append((char)content);
            }
        } finally {
            if(readerStream != null){
                readerStream.close();
            }
            if(writerStream != null){
                writerStream.close();
            }
        }
        
    }
    
}
