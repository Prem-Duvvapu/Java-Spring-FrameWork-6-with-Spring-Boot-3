package com.example.SpringBootWebDemo1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        System.out.println("home method called");
        return "index";
    }

//    @RequestMapping("/add")
//    public String add(HttpServletRequest req, HttpSession session)  {
//        int num1=Integer.parseInt(req.getParameter("num1"));
//        int num2=Integer.parseInt(req.getParameter("num2"));
//        int result=num1+num2;
//
//        session.setAttribute("result",result);
//
//        return "result.jsp";
//    }

//    @RequestMapping("/add")
//    public String add(@RequestParam("num1") int num, int num2, Model model)  {
//        int result=num+num2;
//
//        model.addAttribute("result",result);
//
//        return "result";
//    }

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("num1") int num, int num2, ModelAndView mv)  {
        int result=num+num2;

        mv.addObject("result",result);
        mv.setViewName("result");

        return mv;
    }

    @RequestMapping("/alien")
    public ModelAndView alienHome(ModelAndView mv) {
        mv.addObject("alien");
        return mv;
    }

//    @RequestMapping("/addAlien")
//    public ModelAndView addAlien(int aid,String aname,ModelAndView mv) {
////        System.out.println(aid+" "+aname);
//        Alien alien=new Alien();
//        alien.setAid(aid);
//        alien.setAname(aname);
//
//        mv.addObject("alien",alien);
//        mv.setViewName("alienResult");
//
//        return mv;
//    }

    @RequestMapping("/addAlien")
    public String addAlien(@ModelAttribute("alien1") Alien alien) {
        return "alienResult";
    }

    @ModelAttribute("course")
    public String getCourseName() {
        return "Java";
    }

}
