class Counter{
    static int count=0;               //will get memory only once and retains its value
    
    Counter(){
        count++;                     //incrementing value of static variable
        System.out.println(count);
    }
}

public class staticCounter{
    public static void main(String args[]){
        
        //Creating objects

        Counter c1=new Counter();
        Counter c2=new Counter();
        Counter c3=new Counter();
    }
}
