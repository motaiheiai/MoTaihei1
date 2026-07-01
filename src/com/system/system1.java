package com.system;

import java.util.Scanner;

//定义一个类用来记录学生学号，姓名，成绩
public class system1 {
//        学号（String）：不能为空，不能与已有学号重复
//        姓名（String）：不能为空
//        Java 成绩（double）：范围 0～100
//        MySQL 成绩（double）：范围 0～100
//        Spring 成绩（double）：范围 0～100
    //    总分（double）
        private String id;
        private String name;
        private double javaScore;
        private double mysqlScore;
        private double springScore;
        private double totalScore;

        public system1() {
        }

        public system1(String id, String name, double javaScore, double mysqlScore, double springScore, double totalScore) {
            this.id = id;
            this.name = name;
            this.javaScore = javaScore;
            this.mysqlScore = mysqlScore;
            this.springScore = springScore;
            this.totalScore = totalScore;
        }

        public boolean setId(String string ) {
            //判断是否空 trim()的意思是去掉前后空格.isEmpty()的意思是判断是否为空字符串
            if (string == null||string.trim().isEmpty()){
                    System.out.println("不能为空");
                    return false;
            }else {
                id=string;
                return true;
            }
        }

        public String getId() {
            return id;
        }
//        姓名（String）：不能为空
        public boolean setName(String string ) {
            if (string == null||string.trim().isEmpty()){
                System.out.println("不能为空");
                return false;
            }else {
                name=string;
                return true;
            }
        }

        public String getName() {
            return name;
        }
//        Java 成绩（double）：范围 0～100
        public boolean setJavaScore(double score) {
            if (score<0||score>100){
                System.out.println("Java成绩范围0～100");
                return false;
            }else {
                javaScore=score;
                return true;
            }
        }

        public double getJavaScore() {
            return javaScore;
        }
//        MySQL 成绩（double）：范围 0～100
        public boolean setMysqlScore(double score) {
            if (score<0||score>100){
                System.out.println("MySQL成绩范围0～100");
                return false;
            }else {
                mysqlScore=score;
                return true;
            }
        }

        public double getMysqlScore() {
            return mysqlScore;
        }
//        Spring 成绩（double）：范围 0～100
        public boolean setSpringScore(double score) {
            if (score<0||score>100){
                System.out.println("Spring成绩范围0～100");
                return false;
            }else {
                springScore=score;
                return true;
            }
        }

        public double getSpringScore() {
            return springScore;
        }

        //总分（double）
        public static double setTotalScore(double javaScore, double mysqlScore, double springScore,double totalScore) {
            totalScore=javaScore+mysqlScore+springScore;
            return totalScore;
        }
        public void getTotalScore(double totalScore) {
              this.totalScore=totalScore;
        }

//根据id删除某个学生
        public static int deleteStudent(String id,int number,system1[] students){

            for (int i=0;i<number;i++){
                if (students[i].getId().equals(id)){
                    for (int j=i;j<number-1;j++){
                        students[j]=students[j+1];
                    }
                    students[number-1]=null;
                    System.out.println("删除成功！");
                    return number-1;
                }
            }
            System.out.println("没有该学生！");
            return number;
        }

        //查看所有学生信息
        public void showInfo( ){
            System.out.println(id+"\t\t"+name+"\t"+javaScore+"\t\t"+mysqlScore+"\t\t"+springScore+"\t\t"+totalScore);
        }

        //修改某个学生的成绩
        public static void updateStudent(String id,int number,system1[] students){
            Scanner sc = new Scanner(System.in);
            for (int i=0;i<number;i++){
                if (students[i].getId().equals(id)){
                    System.out.print("请输入修改后的Java成绩：");
                    double javaScore = sc.nextDouble();
                    students[i].setJavaScore(javaScore);
                    System.out.print("请输入修改后的MySQL成绩：");
                    double mysqlScore = sc.nextDouble();
                    students[i].setMysqlScore(mysqlScore);
                    System.out.print("请输入修改后的Spring成绩：");
                    double springScore = sc.nextDouble();
                    students[i].setSpringScore(springScore);
                    double totalScore = javaScore + mysqlScore + springScore;
                    students[i].getTotalScore(totalScore);
                    System.out.println("修改成功！");
                    return;
                }
            }
            System.out.println("没有该学生！");
        }





}
