package com.namyata.rest;

import com.namyata.data.model.YogaTeacher;
import com.namyata.repo.YogaTeacherRepository;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/namyata/api/v1.0/supplier/")
public class NamyataSupplierRestController {

    @Autowired
    private YogaTeacherRepository repository;

    @ApiOperation(value = "saveYogaTeacher", nickname = "saveYogaTeacher")
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public List<YogaTeacher> getTeachersInfo() {
        return this.repository.findAll();
    }

    @ApiOperation(value = "saveYogaTeacher", nickname = "saveYogaTeacher")
    @RequestMapping(method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "yogaTeacher",
                    required = true,
                    dataType = "string", paramType = "query", defaultValue = "Niklas")
    })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = Void.class),
            @ApiResponse(code = 500, message = "Failure")})
    public void saveYogaTeacher(@RequestBody YogaTeacher yogaTeacher) {
        this.repository.save(yogaTeacher);
    }


}
