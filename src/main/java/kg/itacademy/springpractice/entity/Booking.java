package kg.itacademy.springpractice.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "booking")
@Entity
@Getter
@Setter
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "bookRef")
    private String bookRef;

    @Column(name = "bookDate")
    private String bookDate;

    @Column(name = "totalAmount")
    private String totalAmount;


}
