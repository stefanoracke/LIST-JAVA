import java.util.List;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the super heroes party!");
        //No ordena los elementos
        // List<String> superHeroes = new ArrayList<>();
        // Doblemente enlazado
        List<String> superHeroes = new LinkedList<>(); 

        // Para multithread
        // List<String> superHeroes = new Vector<>();

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
