package EX7_1;

import java.util.Scanner;

public class arithmetic {

        public static void main(String[] args){
            Scanner in=new Scanner(System.in);
            System.out.println("ENTER YOUR FIRST NUMBER:");
            int number1= in.nextInt();
            System.out.println("ENTER YOUR SECEND NUMBER:");
            int number2= in.nextInt();
            System.out.println("ENTER YOUR OPERATION:");
            String Operation= in.next();
            if (Operation.equals("+")){
                System.out.println(number1+number2);
            } else if (Operation.equals("-")) {
                System.out.println(number1-number2);

            } else if (Operation.equals("*")) {
                System.out.println(number1*number2);

            } else if (Operation.equals("%")) {
                System.out.println(number1%number2);

            }


        }

    }


