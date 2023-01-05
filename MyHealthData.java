package assignment01;

//22F CST8284
//Assignment 1: MyHealthData.java

//This system maintains important health information about a patient.
//Note: This class assumes values passed to the set methods are correct.
/**
 * This assignment is to facilitate the creation of patients' health
 * records during their first time of hospital visit. 
 * @author Lin
 * @version 1.2
 * @see java.lang.Object
 * @since openjdk version "11.0.15"
 *
 */


//TO DO 1: INCLUDE YOUR ATTRIBUTES HERE. REMEMBER TO CHECK THE UML CLASS DIAGRAM TO INCLUDE ALL ATTRIBUTES LISTED AND THEIR TYPES.

//START CODE
public class MyHealthData
{
 /**
 * the patients' first name to be displayed.
 */
  private String firstName;
 /**
  * the patients' last name to be displayed.
  */  
  private String lastName;
 /**
  * the patients' gender to be displayed.
  */
  private String gender;
 /**
  * the patients' birth year to be displayed.
  */
  private int birthYear;
 /**
  * the patients' current year to be displayed.
  */
  private int currentYear;
 /**
  * the patients' height to be displayed.
  */
  private double height;
 /**
  * the patients' weight to be displayed.
  */
  private double weight;
  
//END CODE


// TO DO 2: INCLUDE YOUR CONSTRUCTOR HERE 
//START CODE
 /** This MyHealthData constructor sets patients' health data
  * as passed.
   * @param firstName the firstname of this MyHealthData.
   * @param lastName the lastname of this MyHealthData.
   * @param gender the gender of this MyHealthData.
   * @param birthYear the birthYear of this MyHealthData.
   * @param currentYear the currentYear of this MyHealthData.
   * @param height the height of this MyHealthData.
   * @param weight the weight of this MyHealthData.
   */
  public MyHealthData(String firstName, String lastName, String gender, int birthYear, int currentYear, 
		  double height, double weight)
  {
	this.firstName = firstName;
	this.lastName = lastName;
	this.gender = gender;
	this.birthYear = birthYear;
	this.currentYear = currentYear;
	this.height = height;
	this.weight = weight;
	
  }
//END CODE



//TO DO 3: INCLUDE YOUR SET AND GET METHODS HERE. CHECK THE UML CLASS TO ENSURE ALL ARE COMPLETE. SOME ARE ALREADY PROVIDED FOR YOU BELOW.

    /**
	 * Returns the firstName for this MyHealthData.
	 * @return the firstName for this MyHealthData.
	 */
	public String getFirstName() 
	{
		return firstName;
	}
	/**
	 * Sets the firstName for this MyHealthData.
	 * @param firstName the firstName for this MyHealthData.
	 */
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	/**
	 * Returns the lastName for this MyHealthData.
	 * @return the lastName for this MyHealthData.
	 */
	public String getLastName() 
	{
		return lastName;
	}
	/**
	 * Sets the lastName for this MyHealthData.
	 * @param lastName the lastName for this MyHealthData.
	 */
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	/**
	 * Returns the gender for this MyHealthData.
	 * @return the gender for this MyHealthData.
	 */
	public String getGender() 
	{
		return gender;
	}
	/**
	 * Sets the gender for this MyHealthData.
	 * @param gender the gender for this MyHealthData.
	 */
	public void setGender(String gender) 
	{
		this.gender = gender;
	}
	/**
	 * Returns the birthYear for this MyHealthData.
	 * @return the birthYear for this MyHealthData.
	 */
	public int getBirthYear() 
	{
		return birthYear;
	}
	/**
	 * Sets the birthYear for this MyHealthData.
	 * @param birthYear The birthYear for this MyHealthData.
	 */
	public void setBirthYear(int birthYear) 
	{
		this.birthYear = birthYear;
	}
	/**
	 * Returns the currentYear for this MyHealthData.
	 * @return the currentYear for this MyHealthData.
	 */
	public int getCurrentYear() 
	{
		return currentYear;
	}
	/**
	 * Sets the currentYear for this MyHealthData.
	 * @param currentYear the currentYear for this MyHealthData.
	 */
	public void setCurrentYear(int currentYear) 
	{
		this.currentYear = currentYear;
	}
	/**
	 * Returns the height for this MyHealthData.
	 * @return the height for this MyHealthData.
	 */
	public double getHeight() 
	{
		return height;
	}
	/**
	 * Sets the height for this MyHealthData.
	 * @param height the height for this MyHealthData.
	 */
	public void setHeight(double height) 
	{
		this.height = height;
	}
	/**
	 * Returns the weight for this MyHealthData.
	 * @return the weight for this MyHealthData.
	 */
	public double getWeight() 
	{
		return weight;
	}
	/**
	 * Sets the weight for this MyHealthData.
	 * @param weight the weight for this MyHealthData.
	 */
	public void setWeight(double weight) 
	{
		this.weight = weight;
	}
	/**
	 * This method gets age for this MyHealthData.
	 * @return the age for this MyHealthData.
	 */
	public int getAge() 
	{
		int age = currentYear - birthYear;
		return age;
	}
	/**
	 * This method gets maximumHeartRate for this MyHealthData.
	 * @return the maximumHeartRate for this MyHealthData.
	 */
	public int getMaximumHeartRate() 
	{
		int maxiRate = 220-getAge();
		return maxiRate;
	}
	/**
	 * This method gets minimumTargetHeartRate for this MyHealthData.
	 * @return the minimumTargetHeartRate for this MyHealthData.
	 */
    public double getMinimumTargetHeartRate() 
    {
		double miniTargetRate = getMaximumHeartRate() * 0.5;
		return miniTargetRate;
	}
    /**
     * This method gets maximumTargetHeartRate for this MyHealthData.
     * @return the maximumTargetHeartRate for this MyHealthData.
     */
    public double getMaximumTargetHeartRate() 
    {
    	double maxiTargetRate = getMaximumHeartRate() * 0.85;
		return maxiTargetRate;
	}
	

// THIS RETURNS THE PATIENT'S Body Mass Index (BMI) AND IT IS PROVIDED HERE FOR YOU. DO NOT CHANGE THIS PIECE OF CODE!
   /**
    * This method gets BMI for this MyHealthData.
    * @return BMI for this MyHealthData.
    */
   public double getBMI() 
   {
   return (getWeight() * 703) / (getHeight() * getHeight());
   } 

// TO DO 4: THIS PORTION OF CODE SHOULD DISPLAY ALL THE PATIENT'S HEALTH DATA. DO NOT MISS ANY DATA / INFORMATION

   /**
    * This method displays the patients' data from input.
    */
   public void displayMyHealthData() 
   { 

//TO DO 5: HINT: YOU MUST USE System.out.printf TO SHOW ALL HEALTH DATA. DO NOT MISS ANY ITEM.
   
// START CODE
	System.out.println("The patient's health data ");
    System.out.printf("First name: %s %n",firstName);
    System.out.printf("Last name: %s %n",lastName);
    System.out.printf("Gender: %s %n",gender);
    System.out.printf("Date of birth: %d %n",birthYear);
    System.out.printf("Height: %.2f inches %n",height);
    System.out.printf("Weight: %.2f pounds %n",weight);
    System.out.printf("Patient's age: %d %n",getAge());
    System.out.printf("Body Mass Index(BMI): %.2f %n", getBMI());
    System.out.printf("Maximum heart rate: %d %n",getMaximumHeartRate());
    System.out.printf("Target heart rate range: %.2f and %.2f %n",
    		getMinimumTargetHeartRate(),getMaximumTargetHeartRate());
    System.out.println();
//END CODE
  
//DO NOT MODIFY THIS PROTION OF CODE. IT SHOULD PRINT AS IT IS - ALREADY PROVIDED FOR YOU!!

   System.out.println("BMI VALUES");
   System.out.println("Underweight: less than 18.5");
   System.out.println("Normal:      between 18.5 and 24.9");
   System.out.println("Overweight:  between 25 and 29.9");
   System.out.println("Obese:       30 or greater");   
   } 

} // end class MyHealthData



