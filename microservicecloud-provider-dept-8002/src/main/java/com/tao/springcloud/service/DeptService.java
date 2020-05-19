package com.tao.springcloud.service;

import com.tao.springcloud.entities.Dept;

import java.util.List;

/**
 * @ClassName DeptService
 * @Description
 * @Author tyq
 * @Date 2020/5/12 1:00
 * @Version V1.0
 **/
public interface DeptService {
    public boolean add (Dept dept);

    public Dept get (Long id);

    public List<Dept> list ();
}
