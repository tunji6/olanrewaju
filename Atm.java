package test;
 import java.util.Scanner;

public class Atm {
    /*This is a program to run an atm
     lnr_e atm
    Enjoy from my world

     */
    //the private static void is to create a method which runs in the program
    private static Scanner atm;
    private  static int balance = 3000000;
    private static int anotherTransaction;
    private static int password;
    private static int input;
    public static void main(String[] args) {
       // collect input from the user
        Scanner atm = new Scanner(System.in);

        System.out.println("Welcome to Lanre's bank  ");
    // priavte void method is called in the main method
        password();
        input();
    }
    //private method is called
    private static void password() {
        Scanner atm = new Scanner(System.in);
       boolean value;
        do {
            System.out.print("Input password : ");
           if (atm.hasNextInt()) {
               password = atm.nextInt();
               value = true;
               if (password == 1111) {


                   //next declaration of variable
                   System.out.println("Select your choice");
                   System.out.println(" 1. WITHDRAWAL          2. TRANSFER \n" + " 3. MOBILE RECHARGE     4. QUICKTELLER \n" + " 5. LANRE ONLINE   " +
                           "     6. ACCOUNT BALANCE \n");
                   // Create a choice of selection between 1 - 8
               } else {
                   System.out.println("THIS PASSWORD IS INCORRECT " + password + " RE-enter PASSWORD");
               }
             input();
           }
           else {
            System.out.println("INVALID INPUT");
            value = false;

            password();
                }

        }
        while (!(value));
        System.out.println(password);
    }


            private static void input() {
                Scanner atm = new Scanner(System.in);
                System.out.print(" Input : \n");
                int input;
                boolean xp;
                do {
                    if (atm.hasNextInt()) {

                        input = atm.nextInt(); //make a choice between 1- 8
                        xp = true;


                        switch (input) {
                            case 1:
                                int amount;
                                boolean next;
                                System.out.println("INPUT AMOUNT :");
                                do {
                                    if (atm.hasNextInt()) {
                                        next = true;
                                        amount = atm.nextInt();
                                        {
                                            if (amount > balance) {
                                                System.out.println("Insufficient funds");
                                            } else {
                                                balance = balance - amount;
                                                System.out.println("YOU HAVE WITHDRAWN " + " " + amount);
                                            }
                                            anotherTransaction();

                                        }
                                    } else {
                                        System.out.println("INVALID INPUT ");
                                        next = false;
                                        anotherTransaction();
                                    }
                                }
                                while (!(next));
                                anotherTransaction();
                                break;

                            case 2:
                                int accountNumber [] = new int[10];
                                int  transferAmount;
                                boolean yes, ed;
                                do{
                               System.out.println("PLEASE INPUT YOUR 10 DIGIT NUMBER");
                                System.out.print("Input account Number : ");
                                if(atm.hasNextInt()) {
                                    yes = true;

                                    for (int i = 0; i < 11;  i++) {
                                        accountNumber[i] = atm.nextInt();


                                    do {
                                        System.out.println("Input transfer amount  ");
                                        if (atm.hasNextInt()) {
                                            ed = true;
                                            transferAmount = atm.nextInt();
                                            if(transferAmount > balance ) {
                                                System.out.println("   INSUFFICIENT FUNDS"  );
                                                anotherTransaction();

                                            }
                                            else {
                                                System.out.println("Transfer successful   " + "\n");
                                            }
                                        } else {
                                            System.out.println("INVALID INPUT");
                                            ed = false;
                                            anotherTransaction();
                                        }

                                    }
                                    while (!(ed));
                                    anotherTransaction();
                                    anotherTransaction();
                                }    }


                                       else {
                                    System.out.println("INVALID INPUT");
                                    yes = false;
                                    anotherTransaction();
                            }
                                }
                                        while(!(yes));
                                        anotherTransaction();
                                break;

                            case 3:
                                int Rechargeamount;
                                boolean last;
                               do{ System.out.print("Input amount to recharge : ");
                               if(atm.hasNextInt()) {
                                   last = true;
                                   Rechargeamount = atm.nextInt();
                                   if (Rechargeamount > balance) {
                                       System.out.println("INSUFFICIENT FUNDS");
                                       anotherTransaction();
                                   } else {
                                       System.out.println("Recharge successful : " + "\n");
                                  anotherTransaction();
                                   }
                                }
                               else {
                                   System.out.println("INVALID INPUT ");
                                   last = false;
                                   anotherTransaction();
                                   }
                               }
                               while(!(last));
                               anotherTransaction();

                                break;
                            case 4:
                                System.out.println("No quickteller rights thank you for bsnking with us " + "\n");
                                anotherTransaction();
                                break;
                            case 5:
                                System.out.println("Switch on your mobile wifi to connect LANRE's bank hotspot\n Eligible to only bank users" + "\n");
                                anotherTransaction();
                                break;
                            case 6:
                                System.out.println("Your account balance is " + balance + "\n");
                                anotherTransaction();
                                break;
                            default:
                                System.out.println("invalid option " + "\n");
                                anotherTransaction();
                                break;
                        }


                    } else {
                        System.out.println("INVALID INPUT ");
                        xp = false;
                        input();
                    }
                }
                while (!(xp));
            }
    private static void anotherTransaction() {
        Scanner atm = new Scanner(System.in);
        System.out.println("To do you wish to perform another Transaction\n\n 1. To perform Transaction \n 2. To cancel press ");

        boolean alpha;
        do {
            if (atm.hasNextInt()) {
                anotherTransaction = atm.nextInt();
                alpha = true;
                if (anotherTransaction == 1) {
                    password();
                } else if (anotherTransaction == 2) {
                    System.out.println(" Thank you for banking with us");
                } else {
                    System.out.println("Input error ");
                }


            } else {
                System.out.println(" VALUE IS INVALID");
                alpha = false;
                anotherTransaction();
            }
        }
        while (!(alpha));


    }
}


