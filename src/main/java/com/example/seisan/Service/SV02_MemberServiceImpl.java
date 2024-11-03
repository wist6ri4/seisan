package com.example.seisan.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.seisan.Const.Const;
import com.example.seisan.Controller.Form.FM20_GlobalMemberForm;
import com.example.seisan.Controller.Form.FM21_GlobalMemberTagForm;
import com.example.seisan.Controller.Form.FM22_GlobalMemberRelationForm;
import com.example.seisan.Controller.Form.FM23_MemberForm;
import com.example.seisan.Controller.Form.FM24_PayerForm;
import com.example.seisan.Controller.Form.FM25_PayeeForm;
import com.example.seisan.Repository.DB20_GlobalMemberRepository;
import com.example.seisan.Repository.DB21_GlobalMemberTagRepository;
import com.example.seisan.Repository.DB22_GlobalMemberRelationRepository;
import com.example.seisan.Repository.DB23_MemberRepository;
import com.example.seisan.Repository.DB24_PayerRepository;
import com.example.seisan.Repository.DB25_PayeeRepository;
import com.example.seisan.Repository.Entity.ET20_GlobalMember;
import com.example.seisan.Repository.Entity.ET21_GlobalMemberTag;
import com.example.seisan.Repository.Entity.ET22_GlobalMemberRelation;
import com.example.seisan.Repository.Entity.ET23_Member;
import com.example.seisan.Repository.Entity.ET24_Payer;
import com.example.seisan.Repository.Entity.ET25_Payee;
import com.example.seisan.Service.Mapper.MP20_GlobalMemberMapper;
import com.example.seisan.Service.Mapper.MP21_GlobalMemberTagMapper;
import com.example.seisan.Service.Mapper.MP22_GlobalMemberRelationMapper;
import com.example.seisan.Service.Mapper.MP23_MemberMapper;
import com.example.seisan.Service.Mapper.MP24_PayerMapper;
import com.example.seisan.Service.Mapper.MP25_PayeeMapper;

@Service
public class SV02_MemberServiceImpl implements SV02_MemberService {

    @Autowired DB20_GlobalMemberRepository db20_GlobalMemberRepository;
    @Autowired DB21_GlobalMemberTagRepository db21_GlobalMemberTagRepository;
    @Autowired DB22_GlobalMemberRelationRepository db22_GlobalMemberRelationRepository;
    @Autowired DB23_MemberRepository db23_MemberRepository;
    @Autowired DB24_PayerRepository db24_PayerRepository;
    @Autowired DB25_PayeeRepository db25_PayeeRepository;
    @Autowired MP20_GlobalMemberMapper mp20_GlobalMemberMapper;
    @Autowired MP21_GlobalMemberTagMapper mp21_GlobalMemberTagMapper;
    @Autowired MP22_GlobalMemberRelationMapper mp22_GlobalMemberRelationMapper;
    @Autowired MP23_MemberMapper mp23_MemberMapper;
    @Autowired MP24_PayerMapper mp24_PayerMapper;
    @Autowired MP25_PayeeMapper mp25_PayeeMapper;

    /**
     * FM20_GlobalMemberFormのinsert
     * @param form
     * @return resultGlobalMemberForm
     */
    @Override
    public FM20_GlobalMemberForm insert_FM20_GlobalMemberForm(FM20_GlobalMemberForm form) {
        ET20_GlobalMember entity = mp20_GlobalMemberMapper.setEntity(form);
        FM20_GlobalMemberForm resultGlobalMemberForm = mp20_GlobalMemberMapper.setForm(db20_GlobalMemberRepository.save(entity));
        return resultGlobalMemberForm;
    };

    /**
     * FM20_GlobalMemberFormのupdate
     * @param form
     * @return resultGlobalMemberForm
     */
    @Override
    public FM20_GlobalMemberForm update_FM20_GlobalMemberForm(FM20_GlobalMemberForm form) {
        ET20_GlobalMember entity = mp20_GlobalMemberMapper.setEntity(form);
        FM20_GlobalMemberForm resultGlobalMemberForm = mp20_GlobalMemberMapper.setForm(db20_GlobalMemberRepository.save(entity));
        return resultGlobalMemberForm;
    };

    /**
     * FM20_GlobalMemberFormのdelete
     * @param form
     * @return resultGlobalMemberForm
     */
    @Override
    public FM20_GlobalMemberForm delete_FM20_GlobalMemberForm(FM20_GlobalMemberForm form) {
        form.setIsDeleted(Const.IS_DELETED);
        ET20_GlobalMember entity = mp20_GlobalMemberMapper.setEntity(form);
        FM20_GlobalMemberForm resultGlobalMemberForm = mp20_GlobalMemberMapper.setForm(db20_GlobalMemberRepository.save(entity));
        return resultGlobalMemberForm;
    };

    /**
     * FM21_GlobalMemberTagFormのinsert
     * @param form
     * @return resultGlobalMemberTagForm
     */
    @Override
    public FM21_GlobalMemberTagForm insert_Fm21_GlobalMemberTagForm(FM21_GlobalMemberTagForm form) {
        ET21_GlobalMemberTag entity = mp21_GlobalMemberTagMapper.setEntity(form);
        FM21_GlobalMemberTagForm resultGlobalMemberTagForm = mp21_GlobalMemberTagMapper.setForm(db21_GlobalMemberTagRepository.save(entity));
        return resultGlobalMemberTagForm;
    };

    /**
     * FM21_GlobalMemberTagFormのupdate
     * @param form
     * @return resultGlobalMemberTagForm
     */
    @Override
    public FM21_GlobalMemberTagForm update_Fm21_GlobalMemberTagForm(FM21_GlobalMemberTagForm form) {
        ET21_GlobalMemberTag entity = mp21_GlobalMemberTagMapper.setEntity(form);
        FM21_GlobalMemberTagForm resultGlobalMemberTagForm = mp21_GlobalMemberTagMapper.setForm(db21_GlobalMemberTagRepository.save(entity));
        return resultGlobalMemberTagForm;
    };

    /**
     * FM21_GlobalMemberTagFormのdelete
     * @param form
     * @return resultGlobalMemberTagForm
     */
    @Override
    public FM21_GlobalMemberTagForm delete_Fm21_GlobalMemberTagForm(FM21_GlobalMemberTagForm form) {
        form.setIsDeleted(Const.IS_DELETED);
        ET21_GlobalMemberTag entity = mp21_GlobalMemberTagMapper.setEntity(form);
        FM21_GlobalMemberTagForm resultGlobalMemberTagForm = mp21_GlobalMemberTagMapper.setForm(db21_GlobalMemberTagRepository.save(entity));
        return resultGlobalMemberTagForm;
    };

    /**
     * FM22_GlobalMemberRelationFormのinsert
     * @param form
     * @return resultGlobalMemberRelationForm
     */
    @Override
    public FM22_GlobalMemberRelationForm insert_FM22_GlobalMemberRelationForm(FM22_GlobalMemberRelationForm form) {
        ET22_GlobalMemberRelation entity = mp22_GlobalMemberRelationMapper.setEntity(form);
        FM22_GlobalMemberRelationForm resultGlobalMemberRelationForm = mp22_GlobalMemberRelationMapper.setForm(db22_GlobalMemberRelationRepository.save(entity));
        return resultGlobalMemberRelationForm;
    };

    /**
     * FM22_GlobalMemberRelationFormのupdate
     * @param form
     * @return resultGlobalMemberRelationForm
     */
    @Override
    public FM22_GlobalMemberRelationForm update_FM22_GlobalMemberRelationForm(FM22_GlobalMemberRelationForm form) {
        ET22_GlobalMemberRelation entity = mp22_GlobalMemberRelationMapper.setEntity(form);
        FM22_GlobalMemberRelationForm resultGlobalMemberRelationForm = mp22_GlobalMemberRelationMapper.setForm(db22_GlobalMemberRelationRepository.save(entity));
        return resultGlobalMemberRelationForm;
    };

    /**
     * FM22_GlobalMemberRelationFormのdelete
     * @param form
     * @return resultGlobalMemberRelationForm
     */
    @Override
    public FM22_GlobalMemberRelationForm delete_FM22_GlobalMemberRelationForm(FM22_GlobalMemberRelationForm form) {
        form.setIsDeleted(Const.IS_DELETED);
        ET22_GlobalMemberRelation entity = mp22_GlobalMemberRelationMapper.setEntity(form);
        FM22_GlobalMemberRelationForm resultGlobalMemberRelationForm = mp22_GlobalMemberRelationMapper.setForm(db22_GlobalMemberRelationRepository.save(entity));
        return resultGlobalMemberRelationForm;
    };

    /**
     * FM23_MemberFormのinsert
     * @param form
     * @return resultMemberForm
     */
    @Override
    public FM23_MemberForm insert_FM23_MemberForm(FM23_MemberForm form) {
        ET23_Member entity = mp23_MemberMapper.setEntity(form);
        FM23_MemberForm resultMemberForm = mp23_MemberMapper.setForm(db23_MemberRepository.save(entity));
        return resultMemberForm;
    }

    /**
     * FM23_MemberFormのinsert
     * @param form
     * @return resultMemberForm
     */
    @Override
    public FM23_MemberForm update_FM23_MemberForm(FM23_MemberForm form) {
        ET23_Member entity = mp23_MemberMapper.setEntity(form);
        FM23_MemberForm resultMemberForm = mp23_MemberMapper.setForm(db23_MemberRepository.save(entity));
        return resultMemberForm;
    }

    /**
     * FM23_MemberFormのinsert
     * @param form
     * @return resultMemberForm
     */
    @Override
    public FM23_MemberForm delete_FM23_MemberForm(FM23_MemberForm form) {
        form.setIsDeleted(Const.IS_DELETED);
        ET23_Member entity = mp23_MemberMapper.setEntity(form);
        FM23_MemberForm resultMemberForm = mp23_MemberMapper.setForm(db23_MemberRepository.save(entity));
        return resultMemberForm;
    }

    /**
     * FM24_PayerFormのinsert
     * @param form
     * @return resultPayerForm
     */
    @Override
    public FM24_PayerForm insert_FM24_PayerForm(FM24_PayerForm form) {
        ET24_Payer entity = mp24_PayerMapper.setEntity(form);
        FM24_PayerForm resultPayerForm = mp24_PayerMapper.setForm(db24_PayerRepository.save(entity));
        return resultPayerForm;
    };

    /**
     * FM24_PayerFormのupdate
     * @param form
     * @return resultPayerForm
     */
    @Override
    public FM24_PayerForm update_FM24_PayerForm(FM24_PayerForm form) {
        ET24_Payer entity = mp24_PayerMapper.setEntity(form);
        FM24_PayerForm resultPayerForm = mp24_PayerMapper.setForm(db24_PayerRepository.save(entity));
        return resultPayerForm;
    };

    /**
     * FM24_PayerFormのdelete
     * @param form
     * @return resultPayerForm
     */
    @Override
    public FM24_PayerForm delete_FM24_PayerForm(FM24_PayerForm form) {
        form.setIsDeleted(Const.IS_DELETED);
        ET24_Payer entity = mp24_PayerMapper.setEntity(form);
        FM24_PayerForm resultPayerForm = mp24_PayerMapper.setForm(db24_PayerRepository.save(entity));
        return resultPayerForm;
    };

    /**
     * FM25_PayeeFormのinsert
     * @param form
     * @return resultPayeeForm
     */
    @Override
    public FM25_PayeeForm insert_FM25_PayeeForm(FM25_PayeeForm form) {
        ET25_Payee entity = mp25_PayeeMapper.setEntity(form);
        FM25_PayeeForm resultPayeeForm = mp25_PayeeMapper.setForms(db25_PayeeRepository.save(entity));
        return resultPayeeForm;
    };

    /**
     * FM25_PayeeFormのupdate
     * @param form
     * @return resultPayeeForm
     */
    @Override
    public FM25_PayeeForm update_FM25_PayeeForm(FM25_PayeeForm form) {
        ET25_Payee entity = mp25_PayeeMapper.setEntity(form);
        FM25_PayeeForm resultPayeeForm = mp25_PayeeMapper.setForms(db25_PayeeRepository.save(entity));
        return resultPayeeForm;
    };

    /**
     * FM25_PayeeFormのdelete
     * @param form
     * @return resultPayeeForm
     */
    @Override
    public FM25_PayeeForm delete_FM25_PayeeForm(FM25_PayeeForm form) {
        form.setIsDeleted(Const.IS_DELETED);
        ET25_Payee entity = mp25_PayeeMapper.setEntity(form);
        FM25_PayeeForm resultPayeeForm = mp25_PayeeMapper.setForms(db25_PayeeRepository.save(entity));
        return resultPayeeForm;
    };

    /**
     * event_idに紐づくmemberのカウント
     * @param eventId イベントID
     * @return memberCount:人数
     */
    @Override
    public Long countMembersById(Integer eventId) {
        Long memberCount = db23_MemberRepository.countByEventId(eventId);
        return memberCount;
    }
}
