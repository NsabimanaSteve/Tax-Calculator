import java.util.Scanner;
public class TaxCalculation {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        double  grossMonthlySalary;
        System.out.println("Enter your gross monthly salary: ");
        grossMonthlySalary=keyboard.nextDouble();
        if (grossMonthlySalary< 402.00){
            double netMonthlySalary=grossMonthlySalary;
            System.out.println("Your net monthly salary after Tax is: GH¢" + netMonthlySalary);

        }
        else if (grossMonthlySalary<512){
            double balance=grossMonthlySalary-402.00;
            double taxPaidFor402=0;
            double remainingTax=balance*5/100;
            double taxObligation=taxPaidFor402 + remainingTax;
            double netMonthlySalary=grossMonthlySalary-taxObligation;
            System.out.println("Your net monthly salary after Tax is: GH¢" + netMonthlySalary);

            
        }
            else if (grossMonthlySalary<642.00){
                double balance=grossMonthlySalary-512.00;
                double taxPaidFor512=5.5;
                double remainingTax=balance*10/100;
                double taxObligation=taxPaidFor512 + remainingTax;
                double netMonthlySalary=grossMonthlySalary-taxObligation;
                System.out.println("Your net monthly salary after Tax is: GH¢" + netMonthlySalary);

              
            
        }
        else if (grossMonthlySalary<3642.00){
            double balance=grossMonthlySalary-642.00;
            double taxPaidFor642=18.5;
            double remainingTax=balance*17.5/100;
            double taxObligation=taxPaidFor642 + remainingTax;
            double netMonthlySalary=grossMonthlySalary-taxObligation;
            System.out.println("Your net monthly salary after Tax is: GH¢" + netMonthlySalary);

           
        }
        else if (grossMonthlySalary<20037.00){
            double balance=grossMonthlySalary-3642.00;
            double taxPaidFor3642=543.5;
            double remainingTax=balance*25/100;
            double taxObligation=taxPaidFor3642 + remainingTax;
            double netMonthlySalary=grossMonthlySalary-taxObligation;
            System.out.println("Your net monthly salary after Tax is: GH¢" + netMonthlySalary);

            
            
        }
        else if (grossMonthlySalary<50000){
            double balance=grossMonthlySalary-20037.00;
            double taxPaidFor20037=4642.25;
            double remainingTax=balance*30/100;
            double taxObligation=taxPaidFor20037 + remainingTax;
            double netMonthlySalary=grossMonthlySalary-taxObligation;
            System.out.println("Your net monthly salary after Tax is: GH¢" + netMonthlySalary);
          
        }
        else if(grossMonthlySalary>50000){
            double balance=grossMonthlySalary-50000.00;
            double taxPaidFor50000=13631.15;
            double remainingTax=balance*35/100;
            double taxObligation=taxPaidFor50000 + remainingTax;
            double netMonthlySalary=grossMonthlySalary-taxObligation;
            System.out.println("Your net monthly salary after Tax is: GH¢" + netMonthlySalary);


        }

        
    }


    
}