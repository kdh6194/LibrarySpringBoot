package honeybee.spring.libraryspringboot.controller;

import honeybee.spring.libraryspringboot.model.Library;
import honeybee.spring.libraryspringboot.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/lib")
public class LibraryController {

    @Autowired
    private LibraryService lbsrv;

    @GetMapping("/list")
    public ModelAndView list(Integer cpg) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("liblist");
        if (cpg == null || cpg == 0) cpg = 1;

        mv.addObject("lb", lbsrv.showLibrary(cpg));
        mv.addObject("cpg", cpg);
        mv.addObject("stpg", ((cpg - 1) / 10) * 10 + 1);
        mv.addObject("cntpg", lbsrv.countLibrary());
        return mv;
    }
    @GetMapping("/add")
    public String write() {
        return "libadd";
    }

    @PostMapping("/add")
    public String writeok(Library lb) {
        String view = "error";

        if (lbsrv.newLibrary(lb)) {
            view = "redirect:/list?cpg=1";
        }

        return view;
    }
    @GetMapping("/view")
    public ModelAndView view(int lbno) {

        ModelAndView mv = new ModelAndView();
        mv.addObject("lb", lbsrv.readOneLibrary(lbno));
        mv.setViewName("library");

        return mv;


    }
}
