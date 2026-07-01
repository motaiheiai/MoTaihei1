package com.system;
//定义一个类用来记录学生学号，姓名，成绩
public class system1 {
//        学号（String）：不能为空，不能与已有学号重复
//        姓名（String）：不能为空
//        Java 成绩（double）：范围 0～100
//        MySQL 成绩（double）：范围 0～100
//        Spring 成绩（double）：范围 0～100
        private String id;
        private String name;
        private double javaScore;
        private double mysqlScore;
        private double springScore;

        public system1() {
        }

        public system1(String id, String name, double javaScore, double mysqlScore, double springScore) {
            this.id = id;
            this.name = name;
            this.javaScore = javaScore;
            this.mysqlScore = mysqlScore;
            this.springScore = springScore;
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

//根据id删除某个学生
        public static void deleteStudent(String id,system1[] students,int number){ }

        //查看所有学生信息
        public void showInfo( ){
            System.out.println(id+"\t\t"+name+"\t"+javaScore+"\t\t"+mysqlScore+"\t\t"+springScore);
        }






}
