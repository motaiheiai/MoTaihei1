package com.system;
import java.awt.*;
import java.util.Scanner;
public class system {
    public static void main(String[] args) {
        //调用键盘输入
        Scanner sc = new Scanner(System.in);
        //创建管理所有学生的数组
        system1[] students = new system1[100];
        //定义有多少学生
        int number = 0;
        //选择菜单
        System.out.println("1. 添加学生");
        System.out.println("2. 查看所有学生");
        System.out.println("3. 删除学生");
        System.out.println("4. 修改成绩");
        System.out.println("5. 总分排名");
        System.out.println("6. 查询单科最高分");
        System.out.println("7. 退出系统");

        //创建菜单变量menu
        int menu= 0 ;

        //创建while循环等于7时结束循环
        while (menu != 7) {
            //定义自定义菜单变量menu
            System.out.print("请选择：");
            menu = sc.nextInt();
            //利用switch选择功能
            switch (menu) {
                //1. 添加学生信息
                case 1: {
                    System.out.println("【添加学生】");
                    system1 s = new system1();
                    String id ="";
                    String name ="";
                    double javaScore = 0;
                    double mysqlScore = 0;
                    double springScore = 0;
                    while (true){
                        System.out.print("请输入学生学号：");
                        id = sc.next();
                        if (s.setId(id)){
                            boolean flag = false;
                            for (int i=0;i<number;i++){
                                if (students[i].getId().equals(id)){
                                    flag = true;
                                    break;
                                }
                            }
                            if (flag){
                                 System.out.println("该学号已存在！");
                                 continue;
                            }
                            break;
                        }
                    }
                    while (true){
                        System.out.print("请输入学生姓名：");
                        name = sc.next();
                        if (s.setName(name)){
                            break;
                        }
                    }
                    while ( true){
                        System.out.print("请输入Java成绩：");
                        javaScore = sc.nextDouble();
                        if (s.setJavaScore(javaScore)){
                            break;
                        }
                    }
                    while ( true){
                        System.out.print("请输入MySQL成绩：");
                        mysqlScore = sc.nextDouble();
                        if (s.setMysqlScore(mysqlScore)){
                            break;
                        }
                    }
                    while ( true){
                        System.out.print("请输入Spring成绩：");
                        springScore = sc.nextDouble();
                        if (s.setSpringScore(springScore)){
                            break;
                        }
                    }
                    system1 a=new  system1(id, name, javaScore, mysqlScore, springScore);
                    students[number] = a;
                    number++;
                    System.out.println("添加成功！");

                    break;
                }
                case 2: {
                    //查看所有学生
                    System.out.println("学号"+"\t"+"姓名"+"\t"+"Java"+"\t\t"+"MySQL"+"\t\t"+"Spring");
                    for (int i=0;i<number;i++){
                            students[i].showInfo();
                    }
                    break;
                }
                case 3: {
                    //删除学生信息
                    System.out.print("请输入要删除学生的学号：");
                    String id = sc.next();
                    number = system1.deleteStudent(id, number, students);
                    break;
                }
                case 4: {
                    System.out.println("【修改成绩】");
                    break;
                }
                case 5: {
                    System.out.println("【总分排名】");
                    break;
                }
                case 6: {
                    System.out.println("【查询单科最高分】");
                    break;
                }
                default: System.out.println("请选择正确的菜单！");

            }
        }

        System.out.println("系统已退出！");
    }
}
