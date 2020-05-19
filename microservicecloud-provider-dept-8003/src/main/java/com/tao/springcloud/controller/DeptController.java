package com.tao.springcloud.controller;

import com.tao.springcloud.entities.Dept;
import com.tao.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName DeptController
 * @Description
 * @Author tyq
 * @Date 2020/5/12 1:06
 * @Version V1.0
 **/
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add (@RequestBody Dept dept) {
       return deptService.add(dept);
    }

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get (@PathVariable("id") Long id) {
        System.out.println("----------------"+id);
        return deptService.get(id);
    }

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list(){
        return deptService.list();
    }
}
