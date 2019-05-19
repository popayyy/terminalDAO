package ua.mamedov.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "card")
public class Card {
    @Id
    @Getter
    @Setter
    @Column(name = "ID")
    @GeneratedValue
    private Long id;

    @Getter
    @Setter
    @Column(name = "cardnumber")
    private String cardnumber;

    @Getter
    @Setter
    @Column(name = "pin")
    private String pin;

    @Getter
    @Setter
    @Column(name = "balance")
    private Long balance;


    public Card() {

    }

    public Card(String cardnumber, String pin, Long balance) {
        this.cardnumber = cardnumber;
        this.pin = pin;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", cardnumber='" + cardnumber + '\'' +
                ", pin='" + pin + '\'' +
                ", balance=" + balance +
                '}';
    }
}