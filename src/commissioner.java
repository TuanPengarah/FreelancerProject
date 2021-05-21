public class commissioner {
    String customerName;
    String customerID;
    int bankAccountNo;

    //setter
    public void setCommissioner(String name, String id, int bankAcc ){
        this.customerName = name;
        this.customerID = id;
        this.bankAccountNo = bankAcc;
    }

    //getter
    public String getCustomerName(){
        return this.customerName;
    }
    public String getCustomerID(){
        return this.customerID;
    }
    public Integer getBankAcc(){
        return this.bankAccountNo;
    }
}
