package sample;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Patient {
    //    String firstName;
    //    String lastName;
    //   int ssnArray[] = new int[9];
    private SimpleStringProperty firstName;
    private SimpleStringProperty lastName;
    private SimpleDoubleProperty balance;
    private SimpleIntegerProperty ssn;

    public Patient(String firstName, String lastName, double balance, int ssn) {
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName =  new SimpleStringProperty(lastName);
        this.balance =  new SimpleDoubleProperty(balance);
        this.ssn =  new SimpleIntegerProperty(ssn);
    }

    public String getFirstName() {
        return firstName.get();
    }

    public String getLastName() {
        return lastName.get();
    }

    public double getBalance() {
        return balance.get();
    }

    public int getSsn() {
        return ssn.get();
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public void setBalance(double balance) {
        this.balance.set(balance);
    }

    public void setSsn(int ssn) {
        this.ssn.set(ssn);
    }
}
