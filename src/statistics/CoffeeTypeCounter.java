package statistics;

public class CoffeeTypeCounter {
    private  int americanos = 0;
    private  int espressos = 0;
    private  int teas = 0;
    private  int croissants= 0;
    private  int baguettes= 0;

    public  void oneAmericanoSold(){
       this.americanos++;
    }
    public  void oneEspressoSold(){
        this.espressos++;
    }
    public  void oneTeaSold(){
       this.teas++;
    }
    public  void oneCroissantSold(){
        this.croissants++;
    }
    public void oneBaguetteSold(){
        this.baguettes++;
    }

    public int howManyCoffeesSold(){
        return  americanos + espressos;
    }

    public int howManyFoodsSold(){
        return baguettes + croissants;
    }

    public int howManySoldInTotal(){
        return howManyCoffeesSold() + howManyFoodsSold() + teas;
    }

}
