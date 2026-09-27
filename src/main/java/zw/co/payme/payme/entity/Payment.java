package zw.co.payme.payme.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import zw.co.payme.payme.entity.enums.Currency;
import zw.co.payme.payme.entity.enums.PaymentStatus;

@Entity
@Data
@Getter
@Setter
public class Payment {
    @Id
    private int id;

    private String stripeSessionId;

    private String customerEmail;

    private float amount;

    //Enum package
    private Currency currency;

    private PaymentStatus status;
}
