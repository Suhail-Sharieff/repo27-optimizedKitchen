import java.util.*;


/**
 * SuhailSharieff
 */
public class SuhailSharieff {

  public static int indexHavingLessTime(float time[]){
    int idx=0;
    float minTime=Float.MAX_VALUE;
    for (int i = 0; i < time.length; i++) {
      if (minTime>time[i]) {
        minTime=time[i];
        idx=i;
      }
    }
    return idx;
  }
  
  public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  
  System.out.println("Enter no of burners u have");
  int nOfBurners=sc.nextInt();

  System.out.println("Enter no of dishes u have to cook?");
  int noOfDishes=sc.nextInt();

  String dishes[]=new String[noOfDishes];
  float[]time=new float[noOfDishes];
  HashMap<String,Float>hs=new HashMap<>();

  for (int i = 0; i < noOfDishes; i++) {
    System.out.println("Enter name of "+(i+1)+ " th dish: ");
    dishes[i]=sc.next();
    System.out.println("Enter time taken to cook "+dishes[i]+" in minutes:");
    time[i]=sc.nextFloat();
    hs.put(dishes[i], time[i]);
  }

  float[]filler=new float[Math.min(noOfDishes, nOfBurners)];//used min so that it also handles if noOfBurners>noOfdishes
  List<String>burnerNameforDishes=new ArrayList<>();
  
  Arrays.sort(time);
  Arrays.sort(dishes,(a,b)->(int)(hs.get(a)-hs.get(b)));


  for (int i =time.length-1; i >=0; i--) {
    burnerNameforDishes.add("use burner numbered: "+(indexHavingLessTime(filler)+1)+" for the dish named "+dishes[i]+ " for "+hs.get(dishes[i])+" minutes\n");
    filler[indexHavingLessTime(filler)]+=time[i];
  }
  System.out.println(burnerNameforDishes);

  float maxTime=Integer.MIN_VALUE;
  for (float e : filler) {
    if (e>maxTime) {
      maxTime=e;
    }
  }
  System.out.println("You atleast need "+maxTime+" minutes to cook all your dishes");
  sc.close();

  }
}