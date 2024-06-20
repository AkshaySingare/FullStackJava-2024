public class Demo { 

    public static void main(String[] args) 
    { 
        int dailywage = 4;   
        int number_of_days = 5;    
        int salary; 

        salary = number_of_days++ * --dailywage * dailywage++ * number_of_days--;
	  System.out.println(salary);
        salary = --dailywage; 
        System.out.println(dailywage + " " + number_of_days + " " + salary); 
    } 
} 
