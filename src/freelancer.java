public class freelancer {
    private String freelancerName;
    private String freelancerID;
    private int freelancerBankAcc;
    private float rating;
    private int availableSlot;

    // setter
    public void setFreelancerName(String newName) {
        this.freelancerName = newName;
    };

    public void setFreelancerID(String newID) {
        this.freelancerID = newID;
    }

    public void setFreelancerBankAcc(int newBankAcc) {
        this.freelancerBankAcc = newBankAcc;
    }

    public void setFreelancerRating(float newRating) {
        this.rating = newRating;
    }

    public void setFreelanceNewSlot(int newAvailableSlot) {
        this.availableSlot = newAvailableSlot;
    }

    // getter
    public String getFreelancerName() {
        return this.freelancerName;
    }

    public String getFreelanceID() {
        return this.freelancerID;
    }

    public Integer getFreelancerBank() {
        return this.freelancerBankAcc;
    }

    public Float getFreelanceFloat() {
        return this.rating;
    }

    public Integer getFreeAvailableSlot() {
        return this.availableSlot;
    }

    

}
