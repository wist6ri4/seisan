package com.example.seisan.Controller;

import com.example.seisan.Const.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * ST02清算画面のコントローラークラス
 */
@Controller
@RequestMapping("ST02")
public class ST02_Controller {
    @Autowired Const Const;

    /**
     * 画面初期表示
     * @return 画面ModelAndView
     */
    @GetMapping
    public ModelAndView loadView() {
        ModelAndView mav = new ModelAndView();

        mav.setViewName(Const.ST02V);
        return mav;
    }

    /**
     * SM03V初期表示
     * @return 画面ModelAndView
     */
    private ModelAndView loadSM03V() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName(Const.SM03V);
        return mav;
    }

    /**
     * SM04V初期表示
     * @return 画面ModelAndView
     */
    private ModelAndView loadSM04V() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName(Const.SM04V);
        return mav;
    }
}
