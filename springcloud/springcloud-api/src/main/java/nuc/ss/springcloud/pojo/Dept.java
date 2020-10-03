package nuc.ss.springcloud.pojo;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {//实体类  orm 类表关系映射

    private long deptno;//主键
    private String dname;

    //这个数据存在那个数据库的字段，微服务，一个服务对应一个数据库，同一个信息可能存在不同的数据库
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }

    /*
    * 链式写法：
    * Dept dept = new Dept();
    *
    * dept.setDeptNo(11).setDname('ssss').setDb_source('db01')
    * */
}
