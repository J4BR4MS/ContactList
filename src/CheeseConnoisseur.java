



public class CheeseConnoisseur extends Person{
    private String cheeseJoke;

    public CheeseConnoisseur(String firstName, String lastName, String phoneNumber, String cheeseJoke){
        super(firstName, lastName, phoneNumber);
        this.cheeseJoke = cheeseJoke;
    }

    public String getCheeseJoke(){
        return cheeseJoke;
    }

    public String toString(){
        return super.toString() + " Joke: " + cheeseJoke;
    }
}
