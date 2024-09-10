package com.example.seisan.Controller.Form;

import lombok.Getter;
import lombok.Setter;

/**
 * db22_globals_members_relationsのForm
 */
@Getter
@Setter
public class FM22_GlobalMemberRelationForm extends FM00_CommonForm {
    // グローバルメンバーID
    private Integer globalMemberId;
    
    // グローバルメンバータグ
    private FM21_GlobalMemberTagForm globalMemberTagForm;
}
