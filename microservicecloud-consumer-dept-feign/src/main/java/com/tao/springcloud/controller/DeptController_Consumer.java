package com.tao.springcloud.controller;

import com.tao.springcloud.entities.Dept;
import com.tao.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName DeptController_Consumer
 * @Description
 * @Author tyq
 * @Date 2020/5/12 7:53
 * @Version V1.0
 **/
@RestController
public class DeptController_Consumer {

    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping(value = "/consumer/dept/add")
    public boolean add (Dept dept) {
        return deptClientService.add(dept);
    }

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get (@PathVariable("id") Long id) {
        return deptClientService.get(id);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list () {
        return deptClientService.list();
    }

}
