import java.util.*;
public class VintageCar{
     private String make;
     private String model;
     private int year;
     private boolean originalBody;
     private String category;
     public VintageCar(String make, String model, int year, boolean originalBody)
     {
         this.make=make;
         this.model=model;
         this.year=year;
         this.originalBody=originalBody;
         setCategory();
     }
     
     public void setCategory()
     {
         if(year<1919)
         category = "Historic";
         else if (year>=1919 && year<=1930)
         category="Vintage";
         else if (year>=1931 && year<=1939)
         category="Postvintage";
         else category="Other";
     }
     
     public String getMake(){
     return make;
     }
     
     public String getModel(){
     return model;
     }
     
     public int getYear(){
     return year;
     }
     
     public boolean getOriginalBody(){
     return originalBody;
     }
     
     public String getCategory(){
     return category;
     }
     
     public void setOriginalBody(boolean originalBody){
     this.originalBody=originalBody;
     }
     
     public boolean isEligibleCar()
     {
         if (category=="Other")
         return false;
         else return true;
     }
     public int compareAge(VintageCar otherCar)
     {
         return (this.year - otherCar.year);
     }
     
     public boolean sameType(VintageCar otherCar)
     {
         if (this.make == otherCar.make && this.model == otherCar.model)
         return true;
         else return false;
     }
     
     public String toString()
     {
     return ("VintageCar[make:" +make + ", model:" + model +", year:" + year + ", originalBody:" + originalBody + 
     ", category:" +category + "]");
     }
}