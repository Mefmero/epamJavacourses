package ex7_1;

public class transactions {
    private Integer senderID;
    private Integer recipientID;
    private Double amount;

    public transactions(int senderID, int recipientID, double amount) {
        this.senderID = senderID;
        this.recipientID = recipientID;
        this.amount = amount;
    }

    public void transaction(RWL.Dict accounts){
        accounts.put(senderID,accounts.get(senderID) - amount);
        accounts.put(recipientID,accounts.get(recipientID) + amount);
    }
}
