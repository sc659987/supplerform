package com.namyata.rest;

import com.namyata.data.model.YogaTeacher;
import com.namyata.repo.YogaTeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/namyata/api/v1.0/supplier/")
public class NamyataSupplierRestController {

    @Autowired
    private YogaTeacherRepository yogaTeacherRepository;

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    List<YogaTeacher> getTeachersInfo() {
        return null;
    }

}
