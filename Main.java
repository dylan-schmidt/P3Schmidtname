import java.util.*; 

  class Main {
     
  static String namecombiner(String name) {
   return (name + " Schmidt");
  }
  static int ratingaverage(int numberkid, int numberadult ) {
    System.out.println("Average rating: ");
    return (numberkid + numberadult)/2;
 
}
 public static void main(String[] args){
    Scanner user_input = new Scanner(System.in);
    System.out.println("What is your name? ");
    String adultname = user_input.nextLine();
    System.out.println("What is your child's name? ");
    String kidname = user_input.nextLine();
    System.out.println(namecombiner(adultname));
    System.out.println(namecombiner(kidname));
    System.out.println("how would you rate the adult name and how it sounds out of 10? ");
    int numberadult = user_input.nextInt();
    System.out.println("how would you rate the kid name and how it sounds out of 10? ");
    int numberkid = user_input.nextInt();
    System.out.println(ratingaverage(numberkid, numberadult));
   
  }
  }