package myapp.core;

import java.io.Console;
import java.nio.file.AtomicMoveNotSupportedException;
import java.io.Console;


public class Main extends bank {
    

    public static void main(String[] args) {

      String input;
      String deposit;
      int amount;
      String withdrawal;

      bank bank = new bank();


      Console cons = System.console();
      input = cons.readLine("Deposit or Withdrawal: \n");
      
      String[] terms = input.split(" ");
      //System.out.printf("%s", terms[0].toUpperCase());
      //terms[0].toUpperCase();

      if(terms[0].equals("Deposit")){

        deposit = cons.readLine("How much: $\n");

        amount = Integer.parseInt(deposit);

             bank.getdeposit(amount);

        System.out.printf("%d", amount);









      }

      else if (terms[0].equals("Withdrawl")){

        withdrawal = cons.readLine("How much: $\n");
        amount = Integer.parseInt(withdrawal);


                


        System.out.printf("how much lool ");


      }






      






    }


    

  }