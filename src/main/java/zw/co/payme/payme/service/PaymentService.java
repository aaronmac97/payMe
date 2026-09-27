package zw.co.payme.payme.service;


import com.stripe.model.Invoice;
import com.stripe.model.billingportal.Session;
import com.stripe.param.checkout.SessionCreateParams;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import zw.co.payme.payme.entity.Payment;
import zw.co.payme.payme.repository.PaymentRepository;

@Service
@RequiredArgsConstructor
public class PaymentService {
private final PaymentRepository paymentRepository;


}
