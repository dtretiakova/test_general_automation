package objectsInnerNestedClasses;

public class Eurasia {
   private String[] countries = {"Germany", "France", "Ukraine", "Poland", "Bulgaria"};

   public String[] getCountries(){
       return countries;
   }

public void print(){
    for (String country : countries) {
        System.out.println(country);
    }
}

}
