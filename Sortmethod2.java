 


import java.util.Arrays;


/**
 * Write a description of sortmethod here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sortmethod2 {
    
    int[] array;
    String name = "";
    //int[] intArray={33,3,4,5,11,12,13,15,46,54,77,54,1,5,4,8};

    public static void main(String[] args){
        //System.out.println("Hello");
        int[] intArray={5,1,3,14,11,17,13,15,46,54,77,54,75,6,4,8};
        System.out.println("Unsorted array");
        System.out.println(Arrays.toString(intArray)) ; 
        
        //Sortmethod ob = new Sortmethod2(); 
        //ob.sorttest("testestsetset");
        //System.out.println(ob.name);
        
                
        Sortmethod2 oo = new Sortmethod2(); 
        oo.sort(intArray);
        System.out.println(Arrays.toString(oo.array));
        //int[] test = sortmethod.sort();
        //System.out.println(Arrays.toString(test));
        //xx = oc.sort;
        //xx.length;
    }
    
    
    public void sort(int[] array) {
        this.array = array;
        sort(0, array.length);
        System.out.println("Sorted array:");
    }
    
    public void sorttest(String name) {
        this.name = name;
    }    
    
    private void sort(int low, int n) {
        
        if (n > 1) {
            int mid = n >> 1;
            
            sort(low,mid);
            sort(low + mid, mid);
            
            combine(low, n, 1);
        }
    }
    
    private void combine(int low, int n, int st) {
        
        int m = st << 1;
        
        if (m < n) {
            combine(low, n, m);
            combine(low + st, n, m);
            
            for(int i = low + st; i + st < low + n; i+=m)
                compareAndSwap(i, i + st);
        } else
            compareAndSwap(low, low + st);
    }
    
    private void compareAndSwap(int i, int j) {
        if (array[i] > array[j])
            swap(i,j);
    }
    
    private void swap(int i, int j) {
        int h = array[i];
        array[i] = array[j];
        array[j] = h;
    }
    
    //public void tester(){
        //System.out.println("testing tester");
        //System.out.println(array);
        //int[] intArray={33,3,4,5,11,12,13,15,46,54,77,54,1,5,4,8};
        //System.out.println(Arrays.toString(intArray));
        //int[] x;
        //x = sort(intArray);
        //System.out.println(zz);
        //System.out.println(sort);
        //sort(intArray);
 
      //}

}




