package projectUser;

public class BillingInformation {
    private String name;
    public String recieversPhoneNumber;

    public BillingInformation(String name, String recieversPhoneNumber, String cardInformation, String deliveryAddress){
        this.name = name;
        this.recieversPhoneNumber = recieversPhoneNumber;
        this.cardInformation = cardInformation;
        this.deliveryAddress = deliveryAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRecieversPhoneNumber() {
        return recieversPhoneNumber;
    }

    public void setRecieversPhoneNumber(String recieversPhoneNumber) {
        this.recieversPhoneNumber = recieversPhoneNumber;
    }

    public String getCardInformation() {
        return cardInformation;
    }

    public void setCardInformation(String cardInformation) {
        this.cardInformation = "Master Card";
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = "23 Baba Egbe, Baba Egbe bus stop, Abulegba Lagos state";
    }

    public String cardInformation;
    public String deliveryAddress;


}
