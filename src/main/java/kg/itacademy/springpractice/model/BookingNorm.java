package kg.itacademy.springpractice.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BookingNorm {
    private String bookRef;
    private String bookDate;
    private String totalAmount;
}

