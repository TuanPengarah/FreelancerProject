import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        //dapatkan commmissioner name
        String _commissionerName;
        System.out.println("Please enter your name: ");
        Scanner newName = new Scanner(System.in);
        _commissionerName = newName.nextLine();
        
        //dapatkan commisioner ID
        String _commisionerID;
        System.out.println("Please enter your ID: ");
        Scanner newId= new Scanner(System.in);
        _commisionerID = newId.nextLine();

        //dapatkan bank acc
        int _commisionerBank;
        System.out.println("Enter your bank account : (Enter digits only)");
        Scanner newBankAcc = new Scanner(System.in);
        _commisionerBank = newBankAcc.nextInt();

        //tunjuk details user
        commissioner newCommissioner = new commissioner(_commissionerName, _commisionerID,  _commisionerBank);
        System.out.flush();  
        System.out.println("---");
        System.out.println("Your details is: " + "\n"  + "Name: " + newCommissioner.customerName + "\n" + "ID: "+newCommissioner.customerID + "\n" + "Bank Account Number: " +newCommissioner.bankAccountNo );
        System.out.println("---");

        //Init semua freelance
        System.out.println("Please choose number freelancer to see more details (1-5)");
        freelancer fr1 = new freelancer("Freelancer 1 ", "1", 321123, 3.3f, 3);
        freelancer fr2 = new freelancer("Freelancer 2 ", "2", 342344, 4.3f, 2);
        freelancer fr3 = new freelancer("Freelancer 3 ", "3", 654642, 3.5f, 10);
        freelancer fr4 = new freelancer("Freelancer 4 ", "4", 253764, 4.8f, 1);
        freelancer fr5 = new freelancer("Freelancer 5 ", "5", 8756432, 4.0f, 6);

        //tunjuk list freelancer
        System.out.println(fr1.freelancerName);
        System.out.println(fr2.freelancerName);
        System.out.println(fr3.freelancerName);
        System.out.println(fr4.freelancerName);
        System.out.println(fr5.freelancerName);

        String _choose;
        Scanner chooseFL = new Scanner(System.in);
        _choose = chooseFL.nextLine();
        if(_choose.equals(fr1.freelancerID)){   
            System.out.println("yeyy");
        } else {
            System.out.println("emm");
        }

        
        //close!!
        newName.close();
        newId.close();
        newBankAcc.close();
        chooseFL.close();
    }

}