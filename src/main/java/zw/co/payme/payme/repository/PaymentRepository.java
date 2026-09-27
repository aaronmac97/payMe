package zw.co.payme.payme.repository;

import com.stripe.model.InvoicePayment;
import org.springframework.data.jpa.repository.JpaRepository;
import zw.co.payme.payme.entity.Payment;

import java.util.Optional;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

    Optional<Payment> findByStripeSessionId(String stripeSessionId);


}
