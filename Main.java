import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int[] anArray = new int[10];
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Geef 10 getallen in stijgende volgorde, lijn per lijn.");
    for(int i = 0; i < 10; i++)
      anArray[i] = keyboard.nextInt();
    System.out.println();
    
    for(int i = 0; i < 10; i++)
      System.out.println("a[" + i + "]=" + anArray[i] + " ");
    System.out.println();
    System.out.println();
    
    ArraySearcher finder = new ArraySearcher(anArray);
    String ans;
    do
    {
      System.out.println("De waarde die je zoekt:");
      int target = keyboard.nextInt();
      int result = finder.find(target);
      if(result < 0)
        System.out.println("Niet gevonden");
      else
        System.out.println("Gevonden op plaats " +result);
      System.out.println("Nogmaals?");
      ans = keyboard.next();
    } while(ans.equalsIgnoreCase("ja"));
    System.out.println("Einde");
  }
}