import metadata.AccountStatus;
import metadata.Person;

import java.util.List;

public abstract class BasePlayer {
    private String id, password;
    private double balance;
    private AccountStatus status;
    private Person person;
    private List<Hand> hands;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountStatus getStatus() {
        return status;
    }
    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public Person getPerson() {
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }

    public List<Hand> getHands() {
        return hands;
    }
    public void setHands(List<Hand> hands) {
        this.hands = hands;
    }


    public void addHand(Hand hand) {
        hands.add(hand);
    }
    public void removeHand(Hand hand) {
        hands.remove(hand);
    }
}
