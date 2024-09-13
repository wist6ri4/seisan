package com.example.seisan.Service;

import org.springframework.stereotype.Service;

import com.example.seisan.Controller.Form.FM30_PaymentForm;

@Service
public interface SV03_PaymentService {

    /**
     * FM30_PaymentFormのinsert
     * @param form
     * @return resultPaymentForm
     */
    public FM30_PaymentForm insert_FM30_PaymentForm(FM30_PaymentForm form);

    /**
     * FM30_PaymentFormのupdate
     * @param form
     * @return resultPaymentForm
     */
    public FM30_PaymentForm update_FM30_PaymentForm(FM30_PaymentForm form);

    /**
     * FM30_PaymentFormのdelete
     * @param form
     * @return resultPaymentForm
     */
    public FM30_PaymentForm delete_FM30_PaymentForm(FM30_PaymentForm form);
}
