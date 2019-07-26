#Java学习进程

> 汪童乐

> 2019年7月26日
>
> 教材：Java程序设计案例教程（第二版）

##第二章：Java开发环境配置及常用开发工具介绍

###JDK的下载与安装

#####常用工具：

-javac： Java编译器

-java ：   启动JVM运行.class文件

-jar    ：      Java打包发布程序工具

###设置环境变量

控制面板-系统-系统属性-高级-环境变量-

新建环境变量JAVA_HOME（JDK安装位置）

新建环境变量path（JDK安装位置中bin的位置）

####运行第一个java程序

用记事本新建Hellojava.java文件(在C盘的根目录)

代码

```
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

###用UltraEdit编写java程序

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

