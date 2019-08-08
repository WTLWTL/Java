# Java学习进程

> 汪童乐

> 2019年7月26日
>
> 教材：Java程序设计案例教程（第二版）

## 第二章：Java开发环境配置及常用开发工具介绍

### JDK的下载与安装

##### 常用工具：

- javac： Java编译器

- java ：   启动 JVM运行.class文件

- jar    ：      Java打包发布程序工具

###设置环境变量

控制面板-系统-系统属性-高级-环境变量-

新建环境变量JAVA_HOME（JDK安装位置）

新建环境变量path（JDK安装位置中bin的位置）

####运行第一个java程序

用记事本新建Hellojava.java文件(在C盘的根目录)

代码

```java
public class Hellojava
{
public static void main(String[] args)
{
	System. out. println("Hello world!");
}	
}
```

用cmd命令窗口运行java文件

```
cd c:\
javac Hellojava.java//编译
java Hellojava.java//运行
```

### 用UltraEdit编写java程序

代码

```java
public class Helloworld
{
public static void main(String[] args)
{
	System. out. println("************************");
	System. out. println("**   你好Java!");
	System. out. println("**   Java: 你好世界!");
	System. out. println("*************************");
}	
}
```

----

> > 2019.07.31

## 第三章：Java语言基础

- 3.1.1标识符

标识符是标识常量、变量、方法、类、对象等元素的有效字符序列

组成：

​		英文字母，数字，下划线（_）美元符号（$）

​		第一个字符不能是数字

注：

常量名：全部是大写字母

变量名、对象名、方法名、包名全部采用小写字母

多个单词构成：首字母小写，其后单词首字母大写

类名首字母大写

- 3.1.4注释

文档注释：以”/**开始，以”*/“结束

- 3.3引用数据类型

引用数据类型就是指变量中存储的不是数值而是一个内存中的地址的数据类型。调用变量时通过引用地址而得到真正的值。

Java的数据类型必须使用new语句才算是分配了数据空间

Java中有三种引用数据类型：类，接口，数组

   类：具有相同属性及相同行为的一组对象称为类。

下面是一个医生类的定义与创建

```java
public class C_Doctor(...)//医生类的定义
    ...
C_Doctor d1 = new C_Doctor("扁鹊","男");  //实体对象类的创建
```

   接口：

```java
public interface I_Surgery(...)//定义
    ...
I_Surgery i1 = new C_BoneSurgery("白求恩""男");  //创建实例
```

   数组

```java
String section[];
section = new String[6];
```

- 3.4常量和变量

常量声明：

```java
final [修饰符] dataType constantName = vaule;
```

修饰符是可选项，如public，private，static

常量名：通常全部大写

变量声明：

```
[修饰符] dataType variableName = value
```

变量名通常全部使用小写字母，若由多个单词构成，则首字母小写，其后单词首字母大写，其余小写

程序：记录初诊患者的基本信息

```java
public class Diagnosis
{
	public static void main(String args[])
	{
	final String HOSPITALID="0015";//常量名通常全部使用大写字母，以便同变量相区分,final:该变量一旦被初始化便不可改变
	String suffererId="1503052";//变量名通常全部使用小写字母，如果有多个单词，则首字母小写，其后单词首字母大写，其余字母小写
	String suffererName="李明";
	String suffererBirthday="19581208";
	int suffererAge=51;
	boolean suffererMarry = true;
	char suffererSex='男';
	double suffererSalary=5265.5;
	System. out. println("医院代码:"+HOSPITALID);
	System. out. println("患者ID="+suffererId) ;
	System. out. println("姓名="+suffererName);
	System. out. println("出生日期="+suffererBirthday);
	System. out. println("年龄="+suffererAge);
	System. out. println("婚姻状况="+suffererMarry);
	System. out. println("性别="+suffererSex);
	System. out. println("月均收入="+suffererSalary);
		}	
}
//错误：中文括号错误：非法字符: '\uff08'
```

- 位运算符

  1. ~（按位取反运算符）：只对整数数据类型进行操作，取反（如输入0，则输出1）

     ~00101011 = 11010100

  2. &（按位与运算符）运算对象：两个整数数据类型，若两个数对应位都是1，则取1，否则取0

  3. |（按位或运算符）两“0”得“0”，否则为1

  4. ^(按位异或运算符)相同得“0”，相异得1

  5. <<（左移位运算符）:整数数据类型的2进制位左移相应的位数，高位左移后如果溢出，则舍弃，低位补零（不溢出的情况下相当于乘2）

     例：

     ```java
     int x=8,y;
     y=x<<2;//y的结果为32   (001000——100000） 
     ```

  6. 右移运算符（>>):舍弃移出位数，前面空出来的移入原来高位的值

  7. 无符号右移运算符（>>>)：右移指定位数，舍弃移出位数，前面空出来的补零

- 其他运算符

  1. ？（条件运算符）

     格式：表达式1？表达式2：表达式3

  2. instanceof(对象运算符)：判断一个对象是否是某一个类或者其子类的实例，是返回true，不是返回false

     ```java
     boolean x =MyObject instanceof Myclass;//判断MyObject 是否是类MyClass或者MyCLass子类的实例
     ```

  模拟患者诊疗过程
  
  ```java
  public class BloodPressure
  {
  	public static void main(String args[])
  	{
  		String suffererId = "1503012";
  		int 收缩压 = 160;
  		int 舒张压 = 92;
  		int 患者数 = 0;
  		患者数+=1;
  		char 诊断 = 'H';
  		double 单价1=26.5d;
  		String 药名1 = "艾司唑仑";
  		double 单价2 = 13.2d;
  		String 药名2 = "复方利血平";
  		int 数量1,数量2;
  		数量1=2;
  		数量2=6;
  		double 划价 = 单价1*数量1+单价2*数量2;
  		System. out. println("患者编号为："+suffererId);
  		System. out. println("患者收缩压为："+收缩压);
  		System. out. println("患者舒张为："+舒张压);
  		System. out. println("患者血压诊疗效果："+诊断);
  		System. out. println("所开药品及数量:"+药名1+数量1+";"+药名2+数量2);
  		System. out. println("药品总价为："+划价);
  		}
  	}
  ```
  
  ### 课后习题

```java
//已知一个单精度浮点型的变量x=12.34，分别求出它的整数部分和小数部分并显示出来
public class Test1
{
	public static void main(String args[])
	{
		float x = 12.34f;
		int integerPart = (int)x;
		float decimalPart = x-integerPart;
		System. out. println("整数部分为"+integerPart);
		System. out. println("小数部分为"+decimalPart);
	}
	}
```

```java
//求87，72，93的和与平均分
public class Score
{
	public static void main(String args[])
	{
		int chinese = 87,math = 72,english = 93;
		float total=chinese+math+english,aver;
		aver = total/3;
		System. out. println("总分为"+total);
		System. out. println("平均分为"+aver);
	}
}
```

```java
//已知摄氏温度转换为华氏温度的公式为：f=9/5c+32，病人体温为37.8，求为多少华氏度
public class Temperature
{
	public static void main(String args[])
	{
		float c=37.8f,f;
		f=9*c/5+32;
		System. out. println("体温为"+f);
	}
}
```

