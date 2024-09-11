package com.example.seisan.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.seisan.Controller.Form.FM23_MemberForm;
import com.example.seisan.Repository.DB23_MemberRepository;
import com.example.seisan.Repository.Entity.ET23_Member;
import com.example.seisan.Service.Mapper.MP23_MemberMapper;

@Service
public class SV02_MemberService {

    @Autowired
    DB23_MemberRepository memberRepository;

    @Autowired
    MP23_MemberMapper memberMapper;

    public FM23_MemberForm insert_FM23_MemberForm(FM23_MemberForm form) {
        ET23_Member entity = memberMapper.setEntity(form);
        FM23_MemberForm resultForm = memberMapper.setForm(memberRepository.save(entity));
        return resultForm;
    }

    public FM23_MemberForm update_FM23_MemberForm(FM23_MemberForm form) {
        ET23_Member entity = memberMapper.setEntity(form);
        FM23_MemberForm resultForm = memberMapper.setForm(memberRepository.save(entity));
        return resultForm;
    }

    public FM23_MemberForm delete_FM23_MemberForm(FM23_MemberForm form) {
        form.setIsDeleted(1);
        ET23_Member entity = memberMapper.setEntity(form);
        FM23_MemberForm resultForm = memberMapper.setForm(memberRepository.save(entity));
        return resultForm;
    }

    /**
     * event_idに紐づくmemberのカウント
     * @param eventId イベントID
     * @return memberCount:人数
     */
    public Long countMembersById(Integer eventId) {
        Long memberCount = memberRepository.countByEventId(eventId);
        return memberCount;
    }
}
