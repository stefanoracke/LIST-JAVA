import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the super heroes party!");
        //No ordena los elementos
        Set<String> superHeroes = new HashSet<>();
        //Ordena los elementos alfabeticamente si no le damos un orden nosotros.
        // Set<String> superHeroes = new TreeSet()<>(); 

        // Prioriza el orden de agregado
        // Set<String> superHeroes = new LinkedHashSet()<>();

        superHeroes.add("Spiderman");
        superHeroes.add("Ironman");
        superHeroes.add("Hulk");
        superHeroes.add("Wolverine");
        superHeroes.add("Shehulk");
        superHeroes.add("Captain Marvel");

        if(superHeroes.contains("Spiderman")){
            System.out.println("Spidy is on the party");
        }
        
        superHeroes.remove("Hulk");
        
        if(!superHeroes.contains("Hulk")){
            System.out.println("Hulk leaves the party.");
        }


        //Duplicate set? 
        superHeroes.add("Ironman");

        if(superHeroes.isEmpty()){
            System.out.println("The party is ended. ");
        }else{
            System.out.println("The party is going on. There are " + superHeroes.size() + " heroes");
        }

        System.out.println(superHeroes);

        // Iterate Set
        System.out.println("Who is on the party?");
        for (String superhero: superHeroes){
            System.out.println(superhero);
        }

    }
}
