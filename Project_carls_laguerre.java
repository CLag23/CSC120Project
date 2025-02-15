import java.util.Scanner;
public class Project_carls_laguerre {
   public static void main(String[] args) {
      Scanner scrn = new Scanner(System.in);
     
      // collects policyholder and providers info 
      System.out.print("Please enter the policy Number: ");
      int policyNumber = scrn.nextInt();
      scrn.nextLine();
      
      System.out.print("Please enter the Provider Name: ");
      String providerName = scrn.nextLine();
      
      
      System.out.print("Please enter the Policyholder's First Name: ");
      String firstName = scrn.nextLine();
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      String lastName = scrn.nextLine();
      
      System.out.print("Please enter the Policyholder's Age: ");
      int age = scrn.nextInt();
      scrn.nextLine();
      
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      String smokingStat = scrn.nextLine();
      
      
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      double height = scrn.nextDouble();
      scrn.nextLine();
      
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      double weight = scrn.nextDouble();
      scrn.nextLine();
      
      System.out.println("");
      // stores inputs in one object using the constructor  
      Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStat, height, weight);
      
      System.out.println("Policy Number: " + policy.getPolicyNumber());
      System.out.println("Provider Name: " + policy.getProviderName());
      System.out.println("Policyholder's First Name: " + policy.getFirstName());
      System.out.println("Policyholder's Last Name: " + policy.getLastName());
      System.out.println("Policyholder's Age: " + policy.getAge());
      System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStat());
      System.out.println("Policyholder's Height: " + policy.getHeight());
      System.out.println("Policyholder's Weight: " + policy.getWeight());
      
      // calls calaculateBMI() from Policy and prints with two decimal places 
      double BMI = policy.calculateBMI();
      System.out.printf("Policyholder's BMI: %.2f\n", BMI);
      
      // calls calculatPolicyPrice() and prints with commas and two decimal places
      double policyPrice = policy.calculatePolicyPrice(); 
      System.out.printf("Policyholder's Price: $%.2f", policy.calculatePolicyPrice());
      
      
   }
}