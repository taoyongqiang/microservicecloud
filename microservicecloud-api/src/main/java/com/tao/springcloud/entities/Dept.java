package com.tao.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @ClassName Dept
 * @Description
 *  @SuppressWarnings:spring的注解，该注解主要用在取消一些编译器产生的警告对代码左侧行列的遮挡，有时候这会挡住我们断点调试时打的断点
 *      --serial: 忽略在serializable类中没有声明serialVersionUID变量
 *  以下都是lombok的注解：
 *  @NoArgsConstructor：没有参数的构造函数
 *  @AllArgsConstructor：有全部参数的构造函数
 *  @Data：生成getter和setter方法
 *  @Accessors(chain=true)：生成getter和setter的方式
 *
 * @Author tyq
 * @Date 2020/5/11 22:07
 * @Version V1.0
 **/
@SuppressWarnings("")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable {
    // 主键
    private Long deptNo;
    // 部门名称
    private String deptName;
    // 来自哪个数据，因为微服务架构可以一个微服务对应一个数据库，同一个信息被存储到不同的数据库
    private String dbSource;
}
