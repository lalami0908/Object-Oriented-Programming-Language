package hw2;

/**
 * program to predict the size of the green crud population under the Fibonacci sequence
 * @author b06705048
 *
 */
public class GreenCrud {
    /**
     * method to calculate the population size 
     * @param ini_size (initial size of the green crud population)
     * @param days (after "days" day)
     * @return result (an integer shows the size after days day)
     */
    public static int calPopulation(int ini_size, int days){
         
        int population = 0;
        int t1 = 0;
        int t2 = ini_size;
        int n = days/5; //grows every five days
         
        // F_1: No more than five days, return initial size
        if(n == 0) { 
            return ini_size;
        }
         
        for(int i = 0; i < n; i++){
            population = t1 + t2; //F_i+2 = F_i + F_i+1, for i >= 1 
            t1 = t2;
            t2 = population;
        }
        return population;
         
    }
 
}
