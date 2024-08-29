/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package streamexample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
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
//        sortedData.forEach(n -> System.out.println(n));
//--

//        Stream<Integer> mappedData = data.map(n -> n* 2);
//        mappedData.forEach(n -> System.err.println(n));

//        nums.stream().map(n -> n*2).forEach(n -> System.out.println(n)); // ihata code line deka saha nums walin stream eka create karana eka mese eka code line ekakin liyanna puluwan
        
//        nums.stream()
//                .map(n -> n*2)
//                .forEach(n -> System.out.println(n)); // ihata line eka mese lassanata puluwan // mehidee stream thunak create wenwa, namuth memory eka use wenne na godak mkd, eka stream ekak use unama eka nathi wenw use krnn bary wenw aye eka 
  
   
// step 1
//  
//        Predicate<Integer> predi = new Predicate<Integer>(){ // predicate is a functional interface, that is, there is only one method, this predicate interface returns true and false according to the condition.
//            
//            /* 
//            
//                *Predicate<Integer> is a functional interface defined in the java.util.function package. It represents a predicate that takes an Integer argument and returns a boolean value.
//                *The test() method is the abstract method of the Predicate interface. It takes an Integer as input and returns true if the predicate is satisfied for that Integer, otherwise false.
//            */
//            
//            @Override
//            public boolean test(Integer n){
//                if(n%2 == 1)
//                    return true;
//                else
//                    return false;
//            }
//        };
//
//        data.filter(predi) // this method need to parse the true and false values given by the test method of the predicate interface
//                .sorted()
//                .map(n -> n*2)
//                .forEach(n -> System.err.println(n));


// step 2
//        Predicate<Integer> predi = n -> n%2 == 1;
//            
//        
//
//        data.filter(predi) // this method need to parse the true and false values given by the test method of the predicate interface
//                .sorted()
//                .map(n -> n*2)
//                .forEach(n -> System.err.println(n));


// step 3
        int result = data.filter(n -> n%2 == 1) // this method need to parse the true and false values given by the test method of the predicate interface
                .sorted()
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e); // if we want get addition of mapped data (2, 10), result is 12, here values are reduced 2 - 1
        
        /* 
        
            reduce() is a method used in functional programming to combine elements of a collection or stream into a single value. It takes two arguments:
        
            Identity: This is the initial value of the accumulator. It can be any value of the same type as the elements in the collection or stream.
            Accumulator function: This is a function that takes two arguments: the current accumulator value and the next element from the collection or stream. It returns the updated accumulator value.
            The reduce() method iterates over the elements of the collection or stream, applying the accumulator function to each element and the current accumulator value. The final result is the accumulated value after processing all elements.

            Example:
        
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

            int sum = numbers.stream()
                             .reduce(0, (accumulator, element) -> accumulator + element);

            System.out.println("Sum: " + sum); // Output: Sum: 15
        */
        
        System.out.println("Results are : " + result);
    }
    
}
