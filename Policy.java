public class Policy {
   // private attribute 
   private int policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStat;
   private double height; // in  inches
   private double weight;// in pounds
   
   public Policy() {
      // no-arg constuctor with default values for fields 
      this.policyNumber = 0;
      this.providerName = "";
      this.firstName = "";
      this.lastName = "";
      this.age = 0;
      this.smokingStat = "";
      this.height = 0;
      this.weight = 0;
   }
   // constructor that accepts all arguments  
   public Policy(int policyNumber, String providerName, String firstName, String lastName, int age, String smokingStat, double height, double weight) {
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.smokingStat = smokingStat;
      this.height = height;
      this.weight = weight;
   }
   // mutator(setter methods)
   public void setPolicyNumber(int policyNumber) {
      this.policyNumber = policyNumber;
   }
   public void setProviderName(String providerName) {
      this.providerName = providerName;
   }
   public void setFirstName(String firstName) {
      this.firstName = firstName; 
   }
   public void setLastName(String lastName) {
      this.lastName = lastName;
   }
   public void setAge(int age) {
      this.age = age;
   }
   public void setSmokingStat(String smokingStat) {
      this.smokingStat = smokingStat;
   }
   public void setHeight(double height) {
      this.height = height;
   }
   public void setWeight(double weight) {
      this.weight = weight;
   }
   // accessor(getter methods)
   public int getPolicyNumber() {
      return policyNumber;
   }
   public String getProviderName() {
      return providerName;
   }
   public String getFirstName() {
      return firstName; 
   }
   public String getLastName() {
      return lastName;
   }
   public int getAge() {
      return age;
   }
   public  String getSmokingStat() {
      return smokingStat;
   }
   public double getHeight() {
      return height;
   }
   public double getWeight() {
      return  weight;
   }
   // a method that calculates the BMI of the policyholder
   public double calculateBMI() {
      double dmi = (weight * 703)/ (height * height);
      return dmi;
   }
   // a method that calculates the total and returns it
   public double calculatePolicyPrice() {
      final double BASE_FEE = 600;
      double additionalFees = 0;
      double bmi = calculateBMI();
      if (age > 50) {
         additionalFees += 75;
      }
      if (smokingStat.equalsIgnoreCase("smoker")) {
         additionalFees += 100;
      }
      if (bmi > 35) {
         additionalFees += (bmi - 35) * 20;
      }
      
      return BASE_FEE + additionalFees;
      
   }

   
  
}