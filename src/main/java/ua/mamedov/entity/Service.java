package ua.mamedov.entity;


import lombok.Getter;
import lombok.Setter;
import ua.mamedov.OperationType;


import javax.persistence.*;

@Entity
@Table(name = "service")
public class Service {
    @Id
    @Getter
    @Setter
    @Column(name = "ID")
    @GeneratedValue
    private Long id;

    @Getter
    @Setter
    @Column(name = "name")
    private String name;

    @Getter
    @Setter
    @Column(name = "description")
    private String description;

    @Getter
    @Setter
    @Column(name = "comission")
    private Double comission;

    @Getter
    @Setter
    @Column(name = "regexp")
    private String regexp;

    @Getter
    @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "operation_type")
    private OperationType operationType;

    @Getter
    @Setter
    @Column(name = "multiplier")
    private int multiplier;


    public Service() {

    }


    public Service(String name, Double comission, String regexp) {
        this.name = name;
        this.comission = comission;
        this.regexp = regexp;
    }

    @Override
    public String toString() {
        return "Service{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", comission=" + comission +
                ", regexp='" + regexp + '\'' +
                '}';
    }
}