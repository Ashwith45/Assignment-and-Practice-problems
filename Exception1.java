import java.util.Scanner;

public class Exception1 {
    class Details{
       double[] cgpa;
       String place;
    }
    
    public static void main(String[] args) {
           
        String Name = "Ashwith";
        Details[] Ed = new Details [3];
        Details[] pd =new Details[2];
        
        int a,b;

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value of a : ");
       a=sc.nextInt();
       System.out.println("Enter the value of b : ");
       b=sc.nextInt();

       try{
      
        String NickName = Name.substring(a,b);
        System.out.println(NickName);
        System.out.println("This is my NickName");
       
        
       }
         catch (StringIndexOutOfBoundsException e) {
            
        System.out.println("Something went wrong .... Reason : "+e);
      }
       finally{
           System.out.println("But... You can call me as anything you want !! ");
       }
       try{
          
        System.out.println("cgpa of  graduation :" +Ed[0].cgpa[3] );
       }
         catch (NullPointerException e) {
         System.out.println("Update your CGPA List ...  Reason :" +e );
    }
}

}


       

        
        

    

    