public class Student{
     private int stuNo;
     private String stuName;
     public Student(){}
     public Student(int stuNo,String stuName){
      this.stuNo = stuNo;
      this.stuName = stuName;
     }
     public void sayHello(){
         System.out.println("大家好，我的学号是："+stuNo+",我的姓名是："+stuName);
     }

}
