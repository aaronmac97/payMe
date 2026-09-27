package zw.co.payme.payme.controller;


import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zw.co.payme.payme.entity.Payment;
import zw.co.payme.payme.service.PaymentService;

@RestController
@RequestMapping("v1/payments")
@RequiredArgsConstructor
@Tag(name ="Payments")
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping("/create")
    public Payment create(@RequestBody Payment payment) {
        return null;
    }

}
