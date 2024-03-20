package com.example.seisan.Controller.Form;

import lombok.Getter;
import lombok.Setter;

/**
 * db20_GlobalMemberのForm
 */
@Getter
@Setter
public class FM20_GlobalMemberForm extends FM00_CommonForm {
    // グローバルメンバー名
    private String name;
    // 姓
    private String familyName;
    // 名
    private String lastName;
}
