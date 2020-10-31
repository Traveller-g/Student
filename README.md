# 学生选课模拟系统
### ___实验目的___
初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性及方法；  
掌握面向对象的来设计方法（属性、方法）；   
掌握类的继承用法，通过构造方法实例化对象；  
学会使用super()，用于实例化子类；<br>
掌握使用Object根类的toString()方法，应用相关对象的信息输出中。  
### ___业务要求___
说明：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。  
对象示例：
* 人员（编号、姓名、性别……）
* 教师（编号、姓名、性别、所授课程……）
* 学生（编号、课程名称、上课地点、时间、所授教师……）
### ___实验要求___
1.编写上述实体类以及测试主类（注意类之间继承关系的适用）  
2.在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师……）  
### ___实验UML图___
![UMl图](https://github.com/Traveller-g/Student/blob/main/img/uml.jpg) 
### ___实验流程图___
![流程图](https://github.com/Traveller-g/Student/blob/main/img/flowchart%20.jpg) 
### ___核心代码___
```
//Personnel.java 为父类添加属性并实现get/set方法
Personnel(int id,int age,String name,String sex){
		this.id=id;
		this.age=age;
		this.name=name;
		this.sex=sex;
	}
	

	//添加get/set方法
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
  ......
```
``` 
//Student.java 通过super();继承父类Personnel的属性
Student(int id, int age, String name, String sex) {
		super(id, age, name, sex);
	}
//Teacher.java 通过super();继承父类Personnel的属性
Teacher(int id, int age, String name, String sex) {
		super(id, age, name, sex);
		// TODO Auto-generated constructor stub
	}
```
```
//Course.java 中初始化属性并实现set/get方法
public Course(int couId,String couName,String couAddress,String couTime,String teacher){
		super();
		this.couId=couId;
		this.couName=couName;
		this.couAddress=couAddress;
		this.couTime=couTime;
		this.teacher=teacher;
	}

	public int getCouId() {
		return couId;
	}

	public void setCouId(int couId) {
		this.couId = couId;
	}
```
```
//Test.java
t1 = new Teacher(4087, 28, "耿忠祥", "男");   //为教师添加个人信息
st1 = new Student(3226, 22, "小白", "女");   //为学生添加个人信息
cou1 = new Course(10833216, "Java项目工程", "1#202", "2020/03/12","耿忠祥");   //为课程添加信息

//选课课表详情
System.out.println("  编号		    课程名	 教室	   时间		 教师");
System.out.println(cou1.getCouId()+"	"+cou1.getCouName()+"	"+cou1.getCouAddress()+"	"+cou1.getCouTime()+"	"+cou1.getTeacher());

//学生信息详情
System.out.println("学号	姓名	性别    年龄");
System.out.println(st1.getId()+"	"+st1.getName()+"	"+st1.getSex()+"	"+st1.getAge());

//Scanner来实现从键盘录入信息；通过if判断信息来进行选课，成功后提示选课成功！！！
int stu,tea,i,esc;
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n--------------------如需选课输入1，退课输入2！！！---------------------\n");
		i=scanner.nextInt();
		if(i==1) {
		System.out.println("\n请输入学生编号：");
		stu=scanner.nextInt();
		System.out.println("请输入教师编号：");
		tea=scanner.nextInt();
		if(stu==st1.getId()) {
			if(tea==cou1.getCouId()) {
				System.out.println("学号	姓名	性别      编号		   课程名        教室	   时间		 教师");
				System.out.println(st1.getId()+"	"+st1.getName()+"	"+st1.getSex()+"	"+cou1.getCouId()+"	"+cou1.getCouName()+"	"+cou1.getCouAddress()+"	"+cou1.getCouTime()+"	"+cou1.getTeacher());
			}else if(tea==cou2.getCouId()) {
				System.out.println("学号	姓名	性别      编号		   课程名        教室	   时间		 教师");
				System.out.println(st1.getId()+"	"+st1.getName()+"	"+st1.getSex()+"	"+cou2.getCouId()+"	"+cou2.getCouName()+"	"+cou2.getCouAddress()+"	"+cou2.getCouTime()+"	"+cou2.getTeacher());
			}else if(tea==cou3.getCouId()) {
				System.out.println("学号	姓名	性别      编号		   课程名        教室	   时间		 教师");
				System.out.println(st1.getId()+"	"+st1.getName()+"	"+st1.getSex()+"	"+cou3.getCouId()+"	"+cou3.getCouName()+"	"+cou3.getCouAddress()+"	"+cou3.getCouTime()+"	"+cou3.getTeacher());
			}
			System.out.println("\n--------------------选课成功！！！---------------------\n");
			
		}
    
//通过课程编号进行退课
System.out.println("请输入要退课的编号：");
			esc=scanner.nextInt();
			if(esc==cou1.getCouId() || esc==cou2.getCouId() || esc==cou3.getCouId()) {
				System.out.println("\n--------------------退课成功！！！---------------------\n");
```
### ___运行结果截图___
![运行结果](https://github.com/Traveller-g/Student/blob/main/img/true.jpg) 
![运行结果](https://github.com/Traveller-g/Student/blob/main/img/false.jpg)
### ___编程感想___
通过此次学生选课模拟系统的编写，感受到对知识的掌握不是很足够，不能很好的灵活应用，希望老师能给学生讲讲编写代码的时候，应当如何构思怎么进行！！！
