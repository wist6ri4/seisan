package com.example.seisan.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.seisan.Const.Const;
import com.example.seisan.Controller.Form.FM30_PaymentForm;
import com.example.seisan.Repository.DB30_PaymentRepository;
import com.example.seisan.Repository.Entity.ET30_Payment;
import com.example.seisan.Service.Mapper.MP30_PaymentMapper;

public class SV03_PaymentServiceImpl implements SV03_PaymentService {

    @Autowired DB30_PaymentRepository db30_PaymentRepository;
    @Autowired MP30_PaymentMapper mp30_PaymentMapper;

    /**
     * FM30_PaymentFormのinsert
     * @param form
     * @return resultPaymentForm
     */
    @Override
    public FM30_PaymentForm insert_FM30_PaymentForm(FM30_PaymentForm form) {
        ET30_Payment entity = mp30_PaymentMapper.setEntity(form);
        FM30_PaymentForm resultPaymentForm = mp30_PaymentMapper.setForm(db30_PaymentRepository.save(entity));
        return resultPaymentForm;
    };

    /**
     * FM30_PaymentFormのupdate
     * @param form
     * @return resultPaymentForm
     */
    @Override
    public FM30_PaymentForm update_FM30_PaymentForm(FM30_PaymentForm form) {
        ET30_Payment entity = mp30_PaymentMapper.setEntity(form);
        FM30_PaymentForm resultPaymentForm = mp30_PaymentMapper.setForm(db30_PaymentRepository.save(entity));
        return resultPaymentForm;
    };

    /**
     * FM30_PaymentFormのdelete
     * @param form
     * @return resultPaymentForm
     */
    @Override
    public FM30_PaymentForm delete_FM30_PaymentForm(FM30_PaymentForm form) {
        form.setIsDeleted(Const.IS_DELETED);
        ET30_Payment entity = mp30_PaymentMapper.setEntity(form);
        FM30_PaymentForm resultPaymentForm = mp30_PaymentMapper.setForm(db30_PaymentRepository.save(entity));
        return resultPaymentForm;
    };
}
