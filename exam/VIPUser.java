package exam;

public class VIPUser extends User {

    private Integer vipCardNumber;

    public VIPUser(String name, String lastName, String email, int vipCardNumber) {
        super(name, lastName, email);
        if (checkCard(vipCardNumber)) {
            this.vipCardNumber = vipCardNumber;
        } else {
            this.vipCardNumber = null;
        }
    }

    private boolean checkCard(int newNumber) {
        if (newNumber > 999 && newNumber % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void setVipCardNumber(int newCardNumber) {
        if (checkCard(newCardNumber)) {
            this.vipCardNumber = newCardNumber;
        }else{
            this.vipCardNumber=null;
        }
    }

    public Integer getVipCardNumber(){
        return this.vipCardNumber;
    }

}
