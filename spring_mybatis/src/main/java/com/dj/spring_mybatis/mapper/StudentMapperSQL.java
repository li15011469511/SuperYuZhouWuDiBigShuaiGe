package com.dj.spring_mybatis.mapper;

import com.dj.spring_mybatis.domain.Student;
import com.dj.spring_mybatis.domain.User;

/**
 * 学生持久层辅助类
 */
public class StudentMapperSQL {

    /**
     * 查询学生
     */
    public String readStudent(){
        return "select * from srudent";
    }

    public String addStudent(Student student){
        return "insert into student(name) VALUES(#{name})";
    }


    public String delStudent(Integer id){
        return "delete from student where id = " + id;
    }

    public String updateStudent(Student student){
        return "update student set name = #{name} where id = " + student.getId();
    }
}

