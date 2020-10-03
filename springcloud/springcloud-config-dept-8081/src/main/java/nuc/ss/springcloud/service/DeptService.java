package nuc.ss.springcloud.service;

import nuc.ss.springcloud.pojo.Dept;

import java.util.List;


public interface DeptService {
    boolean addDept(Dept dept);

    Dept queryById(long id);

    List<Dept> queryAll();
}
