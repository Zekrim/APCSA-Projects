/*
 * 1.1.4
 */
public class CompoundOperators
{
  static final double GRADE_YEAR = 13;
  public static void main(String[] args)
  {
    int numPeople = 0;  
    double totalYears = 0;

    double myYears   = 10.33;  // Third of the way through Sophomore Year
    double pRiley    = 11.33;  // Third of the way through Junior Year
    double wRichards = 13;     // Finished with school

    totalYears += myYears;    numPeople++;
    totalYears += pRiley;     numPeople++;
    totalYears += wRichards;  numPeople++;
    
    System.out.println("\t\t   Y̲E̲A̲R̲S̲\t\tY̲E̲A̲R̲S̲_L̲E̲F̲T̲");
    System.out.println("__________________________________________________");
    System.out.println("|Marshall Hamon : " + myYears   + ",\t\t|" + (GRADE_YEAR - myYears  )+"\t |");
    System.out.println("|Patrick Riley  : " + pRiley    + ",\t\t|" + (GRADE_YEAR - pRiley   )+"\t |");
    System.out.println("|Wyatt Richards : " + wRichards + ", \t\t|" + (GRADE_YEAR - wRichards)+"\t |");
    System.out.println(                                      );
    System.out.println("Average Years  : " + totalYears /  3 );
    System.out.println("Average Days   : " + totalYears * 60 );
    System.out.println("Total Days     : " + totalYears * 180);
  }
}