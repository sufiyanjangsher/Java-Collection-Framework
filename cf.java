//1.ArrayList
//add() & remove()
// import java.util.*;
// class cf{
//     public static void main(String arg[]){
//         ArrayList<Integer> l1=new ArrayList<>();
//         l1.add(10);
//         l1.add(20);
//         l1.add(30);
//         l1.add(1,50); 
//         System.out.println(l1);
//     }
// }


//get() & set()
// import java.util.*;
// class cf{
//     public static void main(String arg[]){
//         ArrayList<Integer> l1=new ArrayList<>();
//         l1.add(10);
//         l1.add(20);
//         l1.add(30);
        
//         System.out.println(l1.get(0));
//         l1.set(0,23);
//         System.out.println(l1);  
//     }
// }


//contains()
// import java.util.*;
// class cf{
//     public static void main(String arg[]){
//         ArrayList<Integer> l1=new ArrayList<>();
//         l1.add(10);
//         l1.add(20);
//         l1.add(30);
        
//         System.out.println(l1.contains(30));
        
//     }
// }




//2.Linkedlist
//addFirst() & addLast()
// import java.util.*;
// class cf{
//     public static void main(String arg[]){
//         LinkedList<Integer> l1=new LinkedList<>();
//         l1.add(10);
//         l1.add(20);
//         l1.add(30);
        
//         System.out.println(l1);
//         l1.addFirst(100);
//         System.out.println(l1);
//         l1.addLast(200);
//         System.out.println(l1);
        
//     }
// }



//removeFirst()  & removeLast()
// import java.util.*;
// class cf{
//     public static void main(String arg[]){
//         LinkedList<Integer> l1=new LinkedList<>();
//         l1.add(10);
//         l1.add(20);
//         l1.add(30);
        
//         System.out.println(l1);
//         l1.removeFirst();
//         System.out.println(l1);
//         l1.removeLast();
//         System.out.println(l1);
        
//     }
// }



//3.Vector
// import java.util.*;
// class cf{
//     public static void main(String arg[]){
//         Vector<Integer> l1=new Vector<>();
//         l1.add(10);
//         l1.add(20);
//         l1.add(30);
        
//         System.out.println(l1);
       
        
//     }
// }




//4.Stack
// import java.util.*;
// class cf{
//     public static void main(String arg[]){
//         Stack<Integer> l1=new Stack<>();
//         l1.push(10);
//         l1.push(20);
//         l1.push(30);
        
//         System.out.println(l1);
       
//         System.out.println(l1.peek());
        
//         System.out.println(l1.pop());

       
        
//     }
// }





//5.HastSet
// import java.util.*;
// class cf{
//     public static void main(String arg[]){
//         HashSet<Integer> l1=new HashSet<>();
//         l1.add(10);
//         l1.add(20);
//         l1.add(20);
        
//         System.out.println(l1);
       
        

       
        
//     }
// }




//6.LinkedHashSet
// import java.util.*;
// class cf{
//     public static void main(String arg[]){
//         LinkedHashSet<Integer> l1=new LinkedHashSet<>();
//         l1.add(10);
//         l1.add(20);
//         l1.add(20);
        
//         System.out.println(l1);
       
        

       
        
//     }
// }



//7.TreeSet
// import java.util.*;
// class cf{
//     public static void main(String arg[]){
//         TreeSet<Integer> l1=new TreeSet<>();
//         l1.add(10);
//         l1.add(5);
//         l1.add(20);
//         l1.add(20);
        
//         System.out.println(l1);
       
        

       
        
//     }
// }


//8.Queue
// import java.util.*;
// class cf{
//     public static void main(String arg[]){
//         Queue<Integer> l1=new LinkedList<>();
//         l1.add(10);
//         l1.add(20);
//         l1.add(30);
      
        
//         System.out.println(l1);
//         System.out.println(l1.peek());
//         System.out.println(l1.remove());
       
        

       
        
//     }
// }







//9.PriorityQueue
// import java.util.*;
// class cf{
//     public static void main(String arg[]){
//         PriorityQueue<Integer> l1=new PriorityQueue<>();
//         l1.add(10);
//         l1.add(5);
//         l1.add(6);
      
        
//         System.out.println(l1.remove());
        
       
        

       
        
//     }
// }




//10.HashMap
// import java.util.*;
// class cf{
//     public static void main(String arg[]){
//         HashMap<Integer, String> h1=new HashMap<>();
//         h1.put(101,"sufiyan");
//         h1.put(102,"tony");
//         System.out.println(h1);
//         System.out.println(h1.get(101));

//     }
// }





//11.Collection class
import java.util.*;
class cf{
    public static void main(String arg[]){
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(10);
        l1.add(5);
        l1.add(6);
      
         System.out.println(l1);
        Collections.sort(l1);  //sorting
        System.out.println(l1);
        Collections.reverse(l1); //reverse
        System.out.println(l1);
          // maximum
         System.out.println(Collections.max(l1));
          //minimum
          System.out.println( Collections.min(l1));
       
        
    }
}

