package com.namyata.repo;

import com.namyata.data.model.YogaTeacher;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by sai on 22-01-2017.
 */
public interface YogaTeacherRepository extends CrudRepository<YogaTeacher, Long> {

    public List<YogaTeacher> findAll();

    public YogaTeacher findById(Long id);

    public void saveEmployee(YogaTeacher yogaTeacher);

}
