import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // Initialise semua freelancer
        freelancer fr1 = new freelancer();
        fr1.setFreelancerName("Freelancer 1");
        fr1.setFreelancerID("1");
        fr1.setFreelancerBankAcc(21312342);
        fr1.setFreelancerRating(3.3f);
        fr1.setFreelanceNewSlot(3);

        freelancer fr2 = new freelancer();
        fr2.setFreelancerName("Freelancer 2");
        fr2.setFreelancerID("2");
        fr2.setFreelancerBankAcc(2341243);
        fr2.setFreelancerRating(4.3f);
        fr2.setFreelanceNewSlot(2);

        freelancer fr3 = new freelancer();
        fr3.setFreelancerName("Freelancer 3");
        fr3.setFreelancerID("3");
        fr3.setFreelancerBankAcc(4234113);
        fr3.setFreelancerRating(3.5f);
        fr3.setFreelanceNewSlot(10);

        freelancer fr4 = new freelancer();
        fr4.setFreelancerName("Freelancer 4");
        fr4.setFreelancerID("4");
        fr4.setFreelancerBankAcc(42422555);
        fr4.setFreelancerRating(4.8f);
        fr4.setFreelanceNewSlot(1);

        freelancer fr5 = new freelancer();
        fr5.setFreelancerName("Freelancer 5");
        fr5.setFreelancerID("5");
        fr5.setFreelancerBankAcc(52345677);
        fr5.setFreelancerRating(4.0f);
        fr5.setFreelanceNewSlot(6);

        Scanner userInput = new Scanner(System.in);

        // dapatkan commmissioner name
        String _commissionerName;
        System.out.println("Please enter your name: ");
        _commissionerName = userInput.nextLine();

        // dapatkan commisioner ID
        String _commisionerID;
        System.out.println("Please enter your ID: ");
        _commisionerID = userInput.nextLine();

        // dapatkan bank acc
        int _commisionerBank;
        System.out.println("Enter your bank account : (Enter digits only)");
        _commisionerBank = userInput.nextInt();

        // masukkan var di atas ke setter class commissioner
        commissioner newCommissioner = new commissioner();
        newCommissioner.setCommissioner(_commissionerName, _commisionerID, _commisionerBank);

        // tunjuk details user
        System.out.flush();
        System.out.println("---");
        System.out.println("Your details is: " + "\n" + "Name: " + newCommissioner.getCustomerName() + "\n" + "ID: "
                + newCommissioner.getCustomerID() + "\n" + "Bank Account Number: " + newCommissioner.getBankAcc());
        System.out.println("---");


         // set details untuk semua freelancer
        System.out.println("Please choose number freelancer to see more details (1-5)");
        // tunjuk list freelancer
        System.out.println("1: " + fr1.getFreelancerName());
        System.out.println("2: " + fr2.getFreelancerName());
        System.out.println("3: " + fr3.getFreelancerName());
        System.out.println("4: " + fr4.getFreelancerName());
        System.out.println("5: " + fr5.getFreelancerName());

        String _choose;
        Scanner freeLanceInput = new Scanner(System.in);
        _choose = freeLanceInput.nextLine();


        if(_choose.equals("1")){
            //user pilih no 1
            System.out.println("Details of " + fr1.getFreelancerName() + ": ");
            System.out.println("Name: " + fr1.getFreelancerName());
            System.out.println("ID: "+ fr1.getFreelanceID());
            System.out.println("Bank Account: " +fr1.getFreelancerBank());
            System.out.println("Rating: " +fr1.getFreelanceFloat());
            System.out.println("Available: "+fr1.getFreeAvailableSlot());
            System.out.println("Do you want to select this Freelancer? (Y/N)");
            } else if(_choose.equals("2")){
                System.out.println("Details of " + fr2.getFreelancerName() + ": ");
                System.out.println("Name: " + fr2.getFreelancerName());
                System.out.println("ID: "+ fr2.getFreelanceID());
                System.out.println("Bank Account: " +fr2.getFreelancerBank());
                System.out.println("Rating: " +fr2.getFreelanceFloat());
                System.out.println("Available: "+fr2.getFreeAvailableSlot());
                System.out.println("Do you want to select this Freelancer? (Y/N)");
            }
        
        // close!!
        userInput.close();
        freeLanceInput.close();
   
    }

}