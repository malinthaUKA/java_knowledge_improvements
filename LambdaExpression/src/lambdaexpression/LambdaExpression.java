package lambdaexpression;

/**
 *
 * @author malin
 */

@FunctionalInterface
interface ExampleInterface{ // Functional interface can have only one method, (but it can have methods of the object class because every class in java extends object class)
    void show();
//    int add(); // functional interface can have only one method
    
    String toString(); // this can be used,what happens is because every class in java extends object class, object class have many mehtods , toString is the one of them
}


//// implement interface
//class ImplementIn implements ExampleInterface{
//    
//    public void show(){
//        System.out.println("Hi I am Malintha");
//    }
//}



public class LambdaExpression {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        ImplementIn implementIn = new ImplementIn();
//        implementIn.show();

//---


//        ExampleInterface obj = new ExampleInterface(){// here the same thin happen in 'class ImplementIn implements ExampleInterface{', but using anonymous inner class  // interface cant create object but we can implement class itself this concept called 'Anonymous inner class', anonymous mean we create a class without a name and inner class mean we create a class indside a class(here we create inner class(anonymous class) inside a class 'LambdaExpression' ) 
//            public void show(){
//                System.out.println("hi in show");
//            };
//        };
//        
//        obj.show();
//    }


// Labmda expression 1 step (mehidee interface eke tyenne eka method eka nam apita meka thawaa sarala krnn puluwan)

//        ExampleInterface obj = new ExampleInterface(){// here the same thing happen in 'class ImplementIn implements ExampleInterface{', but using anonymous inner class  // interface cant create object but we can implement class itself this concept called 'Anonymous inner class', anonymous mean we create a class without a name and inner class mean we create a class indside a class(here we create inner class(anonymous class) inside a class 'LambdaExpression' ) 
//            public void show(){
//                System.out.println("hi in show");
//            };
//        };
//        
//        obj.show();

// Lambda expression 2 step

//        ExampleInterface obj = () -> { // The two braces here are both the braces of the show method in interface
//                System.out.println("hi in show");
//            };
//        
//        
//        obj.show();

// Lambda expression 3 step - if we have one statement in that case we can simply remove curly brackets

        ExampleInterface obj = () ->  System.out.println("hi in show");
        obj.show();
    }
    
}

