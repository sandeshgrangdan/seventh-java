public class samsung{
  public int firstapp(int a[]){
    int sum = 0;
    for (int x:a){
  sum += x;
    }
  return sum;
  }
   public int[] arr(){
     int[] array = {1,2,3,4,5};
     return array;
    }
   public static void object( Object[] a){
     System.out.println("Object Passed");
    }
    public static void object1(){
      Integer[] sample = {1,2,3,4};
      for(Integer data:sample){
        
        System.out.println("Value Of Object is "+ data);
      }
    }
    
//  public int firstapp(int a[]){
//    int sum = 0;
//    for (int x = a){
//    sum += x;
//    }
//    return sum;
//  }
  public static void main(String[] args){
    samsung mc = new samsung();
    int total= 0;
    int b[] = mc.arr();
    for (int y:b){
      total +=y;
    }
    int[] array = {1,2,3};
    Integer[] arra = {1,2,3,4};
    System.out.println(mc.firstapp(array));
    System.out.println(total);
    samsung.object(arra);
    samsung.object1();
  }
}
