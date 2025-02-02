public class Exception2 {
    
    public static void main(String[] args) {
        String MyName=null;
        int[] marks = new int[3];
        marks[0] = 77;
        marks[1] = 86;
        marks[2] = 93;
        try{
            System.out.println("No.of Letter in my My name are :" +MyName.length());
        }
        catch (NullPointerException e){
            System.out.println("Name is not in Initialized  "  +e);

        }
        try{
            System.out.println("Marks for the Fourth subject is :" +marks[3]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Data doesnot contains marks of the fourth subject " +e);
        }
        finally {
            System.out.println("..........................................................................................");
        }
    }
}
