/**
Policy class is an insurance policy holders details, including their 
personal infomation, health metrics and calculation for BMI and policy price  
*/
public class Policy {
   // private attribute to prevent unauthorized access
   private int policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStat;
   private double height; // in  inches
   private double weight;// in pounds
   
   public Policy() {
      // no-arg constuctor initializes default values for fields 
      this.policyNumber = 0;
      this.providerName = "";
      this.firstName = "";
      this.lastName = "";
      this.age = 0;
      this.smokingStat = "";
      this.height = 0;
      this.weight = 0;
   }
   /**
    * constructor that accepts all arguments 
   
    * @param policyNumber
    * @Param providerName
    * @Param firstName
    * @Param lastName
    * @Param age
    * @Param smokingStats
    * @Param height 
    * @Param weight
   */
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
   /**
    * Sets the policy number.
    *
    * @param policyNumber the policy number
    */
  
   public void setPolicyNumber(int policyNumber) {
      this.policyNumber = policyNumber;
   }
    /**
    * Sets the provider name.
    *
    * @param providerName the name of the insurance provider
    */
   public void setProviderName(String providerName) {
      this.providerName = providerName;
   }
   /**
    * Sets the first name of the policyholder.
    *
    * @param firstName the first name of the policyholder
    */
   public void setFirstName(String firstName) {
      this.firstName = firstName; 
   }
    /**
    * Sets the last name of the policyholder.
    *
    * @param lastName the last name of the policyholder
    */
   public void setLastName(String lastName) {
      this.lastName = lastName;
   }
   /**
    * Sets the age of the policyholder.
    *
    * @param age the age of the policyholder
    */
   public void setAge(int age) {
      this.age = age;
   }
   /**
    * Sets the smoking status of the policyholder.
    *
    * @param smokingStat the smoking status ("smoker" or "non-smoker")
    */
   public void setSmokingStat(String smokingStat) {
      this.smokingStat = smokingStat;
   }
    /**
    * Sets the height of the policyholder.
    *
    * @param height the height in inches
    */
   public void setHeight(double height) {
      this.height = height;
   }
   /**
    * Sets the weight of the policyholder.
    * @param weight the weight in pounds
    */
   public void setWeight(double weight) {
      this.weight = weight;
   }
   /**
    * mutator(setter methods) allows controlled updates
    
    * @return policyNumber 
    */ 
   public int getPolicyNumber() {
      return policyNumber;
   }
   /**
    * @return providerName
    */
   public String getProviderName() {
      return providerName;
   }
   /**
   @return firstName
   */
   public String getFirstName() {
      return firstName; 
   }
   /**
    * @return lastName
    */
   public String getLastName() {
      return lastName;
   }
   /**
    * @return age
    */
   public int getAge() {
      return age;
   }
   /**
    * @return smokingStat
    */
   public  String getSmokingStat() {
      return smokingStat;
   }
   /**
    * @return height
    */
   public double getHeight() {
      return height;
   }
   /**
    * @ return weight 
    */
   public double getWeight() {
      return  weight;
   }
   // a method that calculates the BMI of the policyholder
   public double calculateBMI() {
      double bmi = (weight * 703)/ (height * height);
      return bmi;
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