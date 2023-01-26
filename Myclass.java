import java.util.Scanner;
class Myclass{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("enter your name");
        String name = obj.nextLine();
        System.out.println("name is" +" "+ name);
    }
}