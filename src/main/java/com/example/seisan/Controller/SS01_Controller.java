package com.example.seisan.Controller;

import com.example.seisan.Const.ViewName;
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

    /**
     * 画面初期表示
     * @return 画面ModelAndView
     */
    @GetMapping
    public ModelAndView loadView() {
        ModelAndView mav = new ModelAndView();

        mav.setViewName(ViewName.SS01V.getViewName());
        return mav;
    }

    /**
     * SM05V初期表示
     * @return 画面ModelAndView
     */
    @GetMapping("/SM05V")
    private ModelAndView loadSM05V() {
        ModelAndView mav = new ModelAndView();

        mav.setViewName(ViewName.SM05V.getViewName());
        return mav;
    }

    /**
     * SM06V初期表示
     * @return 画面ModelAndView
     */
    @GetMapping("/SM06V")
    private ModelAndView loadSM06V() {
        ModelAndView mav = new ModelAndView();

        mav.setViewName(ViewName.SM06V.getViewName());
        return mav;
    }
}
