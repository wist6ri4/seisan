package com.example.seisan.Controller;

import com.example.seisan.Const.ViewName;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * ST02清算画面のコントローラークラス
 */
@Controller
@RequestMapping("/ST02")
public class ST02_Controller {

    /**
     * 画面初期表示
     * @return 画面ModelAndView
     */
    @GetMapping("/{id}")
    public ModelAndView loadView(@PathVariable String id) {
        ModelAndView mav = new ModelAndView();

        mav.setViewName(ViewName.ST02V.getViewName());
        return mav;
    }

    /**
     * SM03V初期表示
     * @return 画面ModelAndView
     */
    @GetMapping("/SM03V")
    private ModelAndView loadSM03V() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName(ViewName.SM03V.getViewName());
        return mav;
    }

    /**
     * SM04V初期表示
     * @return 画面ModelAndView
     */
    @GetMapping("/SM04V")
    private ModelAndView loadSM04V() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName(ViewName.SM04V.getViewName());
        return mav;
    }
}
