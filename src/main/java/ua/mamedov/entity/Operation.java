package ua.mamedov.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "operation")
public class Operation {
    @Id
    @Getter
    @Setter
    @Column(name = "ID")
    @GeneratedValue
    private Long id;

    @Getter
    @Setter
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "card")
    private Card card;

    @Getter
    @Setter
    @Column(name = "account")
    private String account;

    @Getter
    @Setter
    @Column(name = "sum_comm")
    private Long sumComm;

    @Getter
    @Setter
    @Column(name = "sum_in")
    private Long sumIn;

    @Getter
    @Setter
    @Column(name = "sum_out")
    private Long sumOut;

    @Getter
    @Setter
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "service")
    private Service service;

    @Getter
    @Setter
    @Column(name = "date_add")
    private Date dateAdd;


    public Operation() {

    }

    public Operation(Card card, String account, Long sumComm, Long sumIn, Long sumOut, Service service, Date dateAdd) {
        this.card = card;
        this.account = account;
        this.sumComm = sumComm;
        this.sumIn = sumIn;
        this.sumOut = sumOut;
        this.service = service;
        this.dateAdd = dateAdd;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "id=" + id +
                ", card=" + card +
                ", account='" + account + '\'' +
                ", sumComm=" + sumComm +
                ", sumIn=" + sumIn +
                ", sumOut=" + sumOut +
                ", service=" + service +
                ", dateAdd=" + dateAdd +
                '}';
    }
}