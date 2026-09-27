package zw.co.payme.payme.dto;


import lombok.Data;

@Data
public class PaymentRequest {

    private Long amount;
    private String currency;
    private String customerEmail;
}
