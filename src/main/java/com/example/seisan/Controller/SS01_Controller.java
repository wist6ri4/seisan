package com.example.seisan.Controller;

import com.example.seisan.Const.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * SS01イベントタグ一覧画面のコントローラークラス
 */
@Controller
@RequestMapping("/SS01")
public class SS01_Controller {
    @Autowired Const Const;

    /**
     * 画面初期表示
     * @return 画面ModelAndView
     */
    @GetMapping
    public ModelAndView loadView() {
        ModelAndView mav = new ModelAndView();

        mav.setViewName(Const.SS01V);
        return mav;
    }

    /**
     * SM05V初期表示
     * @return 画面ModelAndView
     */
    private ModelAndView loadSM05V() {
        ModelAndView mav = new ModelAndView();

        mav.setViewName(Const.SM05V);
        return mav;
    }

    /**
     * SM06V初期表示
     * @return 画面ModelAndView
     */
    private ModelAndView loadSM06V() {
        ModelAndView mav = new ModelAndView();

        mav.setViewName(Const.SM06V);
        return mav;
    }
}
