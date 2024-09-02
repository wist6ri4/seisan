package com.example.seisan.Controller;

import com.example.seisan.Const.Const;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * ST01トップ画面のコントローラークラス
 */
@Controller
@RequestMapping("/ST01")
public class ST01_Controller {

    /**
     * 画面初期表示
     * @return 画面ModelAndView
     */
    @GetMapping
    public ModelAndView loadView() {
        ModelAndView mav = new ModelAndView();

        mav.setViewName(Const.ST01V);
        return mav;
    }

    /**
     * SM01V初期表示
     * @return 画面ModelAndView
     */
    private ModelAndView loadSM01V() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName(Const.SM01V);
        return mav;
    }

    /**
     * SM02V初期表示
     * @return 画面ModelAndView
     */
    private ModelAndView loadSM02V() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName(Const.SM02V);
        return mav;
    }
}
