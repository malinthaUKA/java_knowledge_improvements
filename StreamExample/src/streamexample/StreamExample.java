/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package streamexample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author malin
 */
public class StreamExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(1, 2, 6, 4, 5);
        
        Stream<Integer> data = nums.stream(); // create a stream

//--
//        long count = data.count();
//        System.out.println(count);
//        data.forEach(n -> System.out.println(n)); // stream can only use once

//--
//        Stream<Integer> sortedData = data.sorted();
//        sortedData.forEach(n -> System.err.println(n));
//--

//        Stream<Integer> mappedData = data.map(n -> n* 2);
//        mappedData.forEach(n -> System.err.println(n));

//        nums.stream().map(n -> n*2).forEach(n -> System.out.println(n)); // ihata code line deka saha nums walin stream eka create karana eka mese eka code line ekakin liyanna puluwan
        
//        nums.stream()
//                .map(n -> n*2)
//                .forEach(n -> System.out.println(n)); // ihata line eka mese lassanata puluwan // mehidee stream thunak create wenwa, namuth memory eka use wenne na godak mkd, eka stream ekak use unama eka nathi wenw use krnn bary wenw aye eka 
    
        data.filter(n -> n%2 == 1)
                .sorted()
                .map(n -> n*2)
                .forEach(n -> System.err.println(n));
    }
    
}
