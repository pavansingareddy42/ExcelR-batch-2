import java.util.HashSet;

public class Demo031 {
    public static void main(String[] args) {
      
        HashSet<String> fruits = new HashSet<>();

        
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

    
        System.out.println("Initial HashSet: " + fruits);

       
        fruits.remove("Banana");
        System.out.println("HashSet after removing Banana: " + fruits);

    
        if (fruits.contains("Apple")) {
            System.out.println("HashSet contains Apple");
        } else {
            System.out.println("HashSet does not contain Apple");
        }


        System.out.println("Iterating through HashSet:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

  
        fruits.clear();
        System.out.println("HashSet after clearing: " + fruits);
    }
}
