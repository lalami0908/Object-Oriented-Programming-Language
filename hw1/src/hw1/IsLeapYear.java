package hw1;


/**
 * Program to show whether the specified year is leap tear or not
 * @author lalami
 *
 */
public class IsLeapYear {
    /**
     * method to determine whether the input year is leap year or not 
     * @param year(int)
     * @return true/false(String)
     */
    public static String determine(int year) {
            if(year % 400 == 0) // divisible by 400
                return "true";
            else if(year % 4 == 0 && year % 100 != 0)//divisible by 4 but not by 100
                return "true";
            else
                return "false"; 
        }
}