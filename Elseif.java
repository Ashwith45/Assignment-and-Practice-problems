import java.util.* ;
class Elseif {
    public static void main(String[] args){
        
        try (Scanner sc = new Scanner(System.in)){
        int cash = sc.nextInt();
    
    if(cash < 120){
        System.out.println("You can't even buy a chicken Biryani or starter");

    }
    else if(cash > 120 && cash < 250){
    System.out.println("You can buy either chicken biryani or a starter");
    }

    else {
    
        System.out.println("You can buy both chicken biryani and starter");
    }

}
finally{
    System.out.println(" !! ");
}

    }
} 