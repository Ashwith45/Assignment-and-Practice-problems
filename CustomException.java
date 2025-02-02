public class CustomException {
    public static void main(String[] args) {
        try{
            allRounder(5000,100);

        }
        catch (IsNotGreatAllounderException e) {
            System.out.println("He is not a Great Allrounder.....  Reason : "     +e);

        }
        
    }
    public static void allRounder(int runs, int wickets) throws IsNotGreatAllounderException{
        if(runs <= 1000 && wickets <=50 ){
            throw new IsNotGreatAllounderException("Minimum runs and wickets for a great allrounder are 1000 and 50 respectively");}
        else {
            System.out.println("He is a Great Allrounder!!");
        }

        }
    }
    

class IsNotGreatAllounderException extends Exception {
    public IsNotGreatAllounderException(String message){

    super(message);

  }
}
  
