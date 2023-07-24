package lk.ijse.gdse.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("addedStudents")
public class AddedStudentController {

    @RequestMapping("addedStudent")
    public String setUi(Model model){
        return "addedStudent";
    }
}
