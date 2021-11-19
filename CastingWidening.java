/* 
 * Activity 1.1.5
 */
public class FivePlanetTravel
{
  public static void main(String[] args)
  {
    // theplanets.org average distance from earth to the planets
    int mercury = 56974146 ;
    int venus   = 25724767 ;
    int mars    = 48678219 ;
    int jupiter = 390674710;
    int saturn  = 792248270;

    // number of planets to visit
    int numPlanets = 5;

    // speed of light and our speed
    int lightSpeed =  670616629;
    lightSpeed /= 10;

    // total travel time
    double total = 0;


    // This uses casting when I convert lightspeed to a double
    // This uses widening when I implicitly make mercuryTime a decimal by
    // dividing an integer (the planet) by a double (a casted lightspeed)
    // All rounding to two decimal places is truncation, not rounding
    double mercuryTime = mercury / (double) lightSpeed;   total += mercuryTime;
    double venusTime   = venus   / (double) lightSpeed;   total += venusTime  ;
    double marsTime    = mars    / (double) lightSpeed;   total += marsTime   ;
    double jupiterTime = jupiter / (double) lightSpeed;   total += jupiterTime;
    double saturnTime  = saturn  / (double) lightSpeed;   total += saturnTime ;
    
    double average = total / numPlanets;    
    
    //Print out planet travel times (decimal)
    System.out.println("TRAVEL TIMES (2 decimal)");
    System.out.println("Mercury Travel Time: " + (int) (mercuryTime * 100) / 100.0);
    System.out.println("Venus Travel Time  : " + (int) (venusTime   * 100) / 100.0);
    System.out.println("Mars Travel Time   : " + (int) (marsTime    * 100) / 100.0);
    System.out.println("Jupiter Travel Time: " + (int) (jupiterTime * 100) / 100.0);
    System.out.println("Saturn Travel  Time: " + (int) (saturnTime  * 100) / 100.0);
    System.out.println(); //newline
    
    //Print out planet travel times (rounded to nearest integer)
    System.out.println("TRAVEL TIMES (nearest hour)");
    System.out.println("Mercury Travel Time: " + (int) (mercuryTime + .5));
    System.out.println("Venus Travel Time  : " + (int) (venusTime + .5)  );
    System.out.println("Mars Travel Time   : " + (int) (marsTime + .5)   );
    System.out.println("Jupiter Travel Time: " + (int) (jupiterTime + .5));
    System.out.println("Saturn Travel Time : " + (int) (saturnTime + .5) );
    System.out.println(); //newline 
    
    //Print out total time (decimal)
    System.out.println("TOTAL TIME (2 decimal)    : " + (int) (total * 100) / 100.0);
    
    //Print out total time (nearest integer)
    System.out.println("TOTAL TIME (nearest int)  : " + (int) (total + .5));
    
    //Print out average time (decimal)
    System.out.println("AVERAGE TIME (2 decimal)  : " + (int) (average * 100) / 100.0);
    
    //Print out average time (nearest integer)
    System.out.println("AVERAGE TIME (nearest int): " + (int) (average + .5));
    
  }
}
