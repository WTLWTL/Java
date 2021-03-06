# 第六章——Java面向对象程序设计

> @wtl
>
> 2019.09.29

*面向对象程序设计（Object Oriented Programming, OOP）是一种新的程序设计方法。通过面向对象编程，能创建更加可靠，更容易理解，更容易被复用的程序。Java是一种完全面向对象的程序设计语言。*

## 面向对象程序设计思想

### 面向对象的基本概念

1. 对象

   对象是现实世界中事物的抽象表示

2. 类

   类是具有相同或相似性质的对象的抽象

3. 封装性

   封装性是指将描述某种实体的数据和基于这些数据的操作集合到一起，形成一个封装体。在封装体类，数据受到保护，通过与外界的接口实现信息交流。。在面向对象程序设计中，对象是封装的最基本单位，封装防止了程序的相互依赖而带来的影响。

4. 继承性

5. 多态性

   多态性反映客观事物的动态特性（行为）可以作用于多种不同的其他客观事物（对象），而处理的方法和获得的结果不尽相同。

## 面向对象设计

面向对象程序设计借助特定的计算机语言（如Java）实现从现实世界问题域中的实物对象到计算机世界中的数字“对象”的映射表达，为了便于区分现实世界中的实物对象和计算机世界中的数字对象，人们常将前者称为“实物对象”或“实体”，后者则简称为“对象”。

![](D:\桌面\Java\Java\第六章——Java面向对象程序设计\实体，对象与类之间的关系.jpg)

## 类和对象

### 类的定义

在面向对象的程序设计中，类是对象的抽象与归纳。它是一种复杂的数据类型，**不但包含数据，而且还包含对数据进行操作的方法（Method）**。通常人们将类中的数据称为成员变量，而操作数据的方法称为成员方法，二者统称为类的成员。

Java类的定义包括类声明和类主体两个部分，格式如下

```java
<类声明>//定义该类的名称，访问权限，与其他类的关系以及实现的接口等
{
<类主体>//类主体定义该类的成员变量，构造方法和成员方法。其中构造方法的作用是在使用new关键字创建类的实例的时候被调用来对成员变量进行初始化
}
```

#### 1. 类的声明

格式如下

```
[<修饰符>] class <类名> [extends<父类名>][implements<接口名列表>]
```

注：

- class 是定义类的关键字

- <类名><父类名><接口名>都应该是合法的Java标识符

- 在类的声明中必须包括关键字class和自定义的类名
- 方括号[ ]中的内容为可选项

```java
class C_Date

class C_Thermometer

class C_Patient

class C_Doctor

public class chapter6_1 //public是一个修饰符，它是用来限定这个类可以被其他所有的类访问
```

一个Java源文件中可以声明多个类，但用public修饰的类最多只有一个，**而且其源程序名必须与该类名相同**，修饰符缺省时表示这个类只允许本类以及同一个包中的其他类访问。如C_Date、C_Thermometer、C_Patient等类的声明。用于类声明的修饰符除public外，还有abstract和final。

#### 2. 类主体

类主体是用`{}`将类的成员变量和方法封装在一起形成一个程序块。

基本结构

```java
{
<成员变量的声明>
<构造方法的声明与实现>
<成员方法的声明及实现>
}
```

```java
class C_Date{
	//定义成员变量
    private int year;
   	private int month=1;
    private int day = 1;
    //定义构造方法
    public C_Date(int y,int m,int d)
    {
        year = y;
        month =m;
        day = d;
    }
    //定义成员方法
    public void setDate(int year, int month,int day){
        this.year=year;
        this.month=month;
        this.day=day;
    }
}
```



### 成员变量

成员变量与普通变量（局部变量）不同，它的声明必须放在类主体中，不能放在方法体内。

格式如下

`[修饰符][static][final] 数据类型 成员变量名1[,成员变量2，…]`

- 方括号[ ]中的内容为可选项
- 修饰符的作用：限定成员变量的可访问权限，主要又public , private,  protected,  以及缺省等四种情况
- static用于声明静态成员变量，final用于声明常量

### 成员方法

Java中的成员方法类似于C语言中的函数，**是可以执行调用执行并返回值的，能实现特定功能的程序段**。

Java语言的成员方法被封装在类主体中，用来改变对象的状态，及与其它类的实例进行交互。

成员方法由方法声明和方法体两部分组成，格式如下：

```java
[修饰符][abstract][static][final]  返回值类型 方法名([参数列表])[throws 异常类]//方法声明
    //abstract:抽象方法；static：静态方法；final：最终方法
{
	方法体
}
```

`public static void main(String args[])`

- 一般情况下，成员方法执行后都会向调用者返回数据操作的结果，返回值的类型就是用于声明该成员方法返回的结果的数据类型。可以是基本数据类型，也可以是引用类型。若成员方法不返回任何值，则返回类型用void标记，不能缺省。
- 参数列表又叫形参表。形参表主要用于声明该成员方法在被调用时需要调用者提供的、与数据操作相关的**参数的个数与数据类型**
- 如果方法体的返回类型不是void，则方法体应该包含return语句，且每个return语句都必须带与返回值类型相容的表达式；反之，如果返回值是void，则方法体中既可以包含return语句，也可以不包含return语句，且每个return语句都不能带表达式

### 方法的重载

方法声明中方法名和形参表统称为方法签名。一个类内不能定义两个相同方法签名的方法，否则将会导致编译错误。但是，一个类内可以定义几个**方法名相同而形参不同的方法**，这种机制被称为方法重载。

Java中，方法的重载既可以是成员方法，也可以是构造方法。重载的多个方法之间必须能通过参数列表相区别，且满足以下两个条件

1. 参数列表必须不同
2. 返回值类型可以相同，也可以不同

例：Math.abs()方法声明有四种

```java
static int abs(int a)
static long abs(long a)
static float abs(float a)
static double abs(double a)
```

### 构造方法

类的定义只是完成了同类对象的属性和行为方法的抽象描述，相当于对象的模板，而实际数据的处理却是由对象在其活动过程中完成的。在Java语言中，由一个类可以创建多个对象，这个过程称为对象的实例化。对象的实例化将自动从系统中获取包括对象成员变量在内对象活动所需的内存空间，并完成**对象及其成员变量的初始化**。这种自动初始化工作是通过调用类中一种特殊的方法来完成的，即类的构造方法（Constructor），又称构造器或者构造函数。其声明格式如下：

```java
[<修饰符>]<类名称>(<参数列表>)
{
    初始化的程序代码块
}
```

- 与成员方法不同，构造方法没有返回值类型，且只能通过new运算符调用
- 构造方法的修饰符一般采用public，以便于在其他位置根据需要实例化该类的对象

![](D:\桌面\Java\Java\第六章——Java面向对象程序设计\Java变量的默认初始值.jpg)

```java
public C_Date()//构造方法（无参数）
public C_Date(int y,int m,int d);//构造方法重载
```

其中date参数可以使用`new C_Date(year,month,day)`的形式完成实参的实例化。

### this引用

在Java类的方法体内，允许局部变量于类的成员变量同名。为了在方法体内区分成员变量于局部变量，Java提供了关键字this来表示指向当前对象的一个引用型变量。语法格式如下：

```java
this.成员变量
this.成员方法([参数列表])
```

注：在构造方法中，用this（）调用已声明的构方法时，必须放在第一行。

### 对象的创建与使用

#### 对象的创建

创建对象时，一般先定义一个对象变量，再用new运算符实例化一个对象，并把实例化对象的引用赋给对象变量。

创建格式如下：

`类名 对象名;//声明对象变量`

`对象名 = new 类名([实参列表]);//实例化对象`

例如

```java
C_Date aday;
aday = new C_Date;
//或者
类名 对象名 = new 类名([实参列表]);//声明对象变量的同时初始化对象
//如：
C_Date aday = new C_Date();
```

####  对象的使用

对象名获得一个对象实例后，在程序中就可以直接引用对象中的成员变量，调用成员方法，语法格式如下：

```java
对象名.成员变量
对象名.成员方法([实参列表])
//例如
aday.year = 2009;
aday.setDate(2009,10,29);
```

其中，对象名与成员变量或者成员方法之间使用点运算符“.”分隔。方法调用时给出的参数称为实参。实参可以是常量、变量、表达式或方法的调用，实参的个数与数据类型及排列次序一定要与类定义中该方法声明的形参保持一致（或者相容），且多个实参之间用逗号分隔。当调用方法时，系统按照实参与形参一一对应的关系将实参的值或引用传递给对应的形参。方法后的圆括号（）是必需的，即便该方法没有声明形式参数也不能缺省。

如果成员方法有返回值，则方法调用可以出现在表达式中，相当于它的返回值参加表达式运算。

如：`System. out. println("性别"+pa.getSex())`

Java语言中的类是引用数据类型，两个变量之间的赋值是引用赋值，对象变量也可被赋值为null。

### 类成员与实例成员

#### 实例成员变量和类成员变量

没有static修饰的成员变量称为实例成员变量。在创建对象实例时，系统会为每一个对象分配不同的内存单元，对象内部又会为自己的实例成员变量分配内存单元，也就是说不同的实例成员变量都有属于自己的内存单元。

对于类成员变量，系统在加载类时会为每一个类成员变量分配一个存储单元，所有该类的对象实例就同一个类成员变量都共享这个存储单元

例如：

​		`C_Patient p1 = new C_Patient("张鹰","男",new C_Date(1972,10,14));`

​		`C_Patient p2 = new C_Patient("李文","女",new C_Date(1965,2,10))`

#### 实例成员方法和类成员方法

 类的成员方法有两种：实例成员方法和类成员方法。

**没有static修饰的方法称为实例成员方法**。实例成员方法中既可以访问类成员变量和调用类成员方法，也可以访问实例成员变量和调用实例成员方法。实例成员方法的使用只能通过对象实例来调用。

类成员方法体中只能访问类成员变量或调用类成员方法，不能访问实例成员变量或调用实例成员方法。比如，常用的main方法是类成员方法，在他的方法体里面不能直接访问所在类的实例成员变量。但是类成员方法可以通过对象实例来调用，也可以通过类名来来调用。

```java
public class classA{
	public int i=1;	//实例变量
	public static int ii=10;//类变量
	public String Omethod(){	//实例方法
		return "Omethod";
	}
	public static String Smethod(){	//类方法
		return "Smethod";
	}
	public static void main(String[] args){	//main是类方法
		classA a = new classA();
		System. out. println(a.ii);	//类方法中允许访问类变量，允许
		System. out. println(classA.ii);//类方法中访问类变量，允许
		System. out. println(a.Smethod());//类方法中调用类方法，允许
		System. out. println(classA.Smethod());//类方法中调用类方法，允许
		
		
		//System. out. println(i);	//类方法中直接访问实例变量，不允许
		//System. out. println(Omethod());//类方法中直接调用实例方法，不允许
		
		System. out. println(a.i);//通过实例访问实例变量，允许
		System. out. println(a.Omethod());//通过实例调用实例方法，允许
		
	}
}
```

### 对象数组

Java语言中的数组属于引用数据类型，而数组元素既可以是基本数据类型，也可以是引用数据类型。若数组元素为引用数据类型，如字符串，数组或者类对象，则称该数组为对象数组。对象数组是Java语言用于保存多个同类对象引用的重要手段，其定义格式与普通数组类似，只是对象名替代数据类型而已。值得注意的是对象数组的元素并不是对象，而是指向对象的引用。

对象数组的初始化也需要使用new运算符获得数组元素的存储空间，用于存储数组元素（对象）的引用，对于每一个数组元素还需要使用new运算符实现对象的实例化。例如：

```java
C_Date dates[ ] = new C_Date[3];//定义并初始化对象数组
Date[0] = new C_Date;			//数组元素（对象）的实例化
Date[1] = new C_Date(1949,10,1);
Date[2] = new C_Date(2009,11,20);
```

![](D:\桌面\Java\Java\第六章——Java面向对象程序设计\对象数组的引用模型.jpg)

## 类的封装性

### 封装的概念

含义：

1. 将数据和对数据的操作组合起来构成类，类是一个不可分割的独立单位
2. 类中既要提供与外部联系的方法，同时又要尽可能隐藏类的实现细节和保护自身数据安全的安全性

### 访问权限修饰符

根据封装的原则，一般要求在类的设计中既能让使用者可以访问类中的部分方法，又不能直接访问类中的成员变量

| 权限修饰符     | 同一类 | 同一包 | 不同包的子类 | 所有类 |
| -------------- | :----: | :----: | :----------: | :----: |
| public         |   √    |   √    |      √       |   √    |
| protected      |   √    |   √    |      √       |        |
| 默认的（缺省） |   √    |   √    |              |        |
| private        |   √    |        |              |        |

### 类之间的组合关系

与类中基本数据类型的成员变量不同，一个类组合中包含的其它类的对象需要使用new运算符显式创建，编译器不会自动完成这个操作，这也是为了避免一些不必要的资源开销

## 类的继承性

### 继承的概念

继承性在父类和子类之间建立起了联系，子类自动拥有父类的全部成员，包括成员变量和成员方法，从而使父类成员得以传承和延续。子类可以更改父类的成员，使之适应或满足新的需求；子类也可以增加属于自己的新的成员。但是子类不能删除父类的成员。

Java中是单重继承。即一子一父，一父可多子。

基本原则：

1. 子类可以继承父类的实例成员变量和类成员变量
2. 子类可以继承父类的实例成员方法和类成员方法
3. 子类不能继承父类的构造方法，因为父类的构造方法创建的是父类的对象，子类必须声明自己的构造方法，创建自己的对象
4. 子类可以增加自己的成员变量与成员方法。如果子类声明了和父类同名的成员，则子类的成员隐藏了父类的成员。
5. 子类不能删除父类成员，但可以重新定义父类成员
6. 子类能够继承父类的析构方法

### 子类的定义

在类的声明中，通过使用关键字extends来定义一个类的子类。声明格式如下：

```java
[<修饰符>] class <子类名> extends <父类名> [implements<接口名>]
```

例如：

```java
class C_Surgen extends C_Doctor
{
	……
}
```

#### 子类与父类之间的赋值相容性

“即是”性质：子类对象即是父类对象，父类对象不是它的子类对象。

使用对象运算符`instanceof`可以判定一个对象是否属于指定类及其子类如：

```java
//C_Surgen是C_Doctor的子类
C_Doctor d1 = new C_Doctor("张鹰","男");
C_Surgen s1 = new C_Surgen("李文","女");
d1 instanceof C_Doctor; //true
s1 instanceof C_Surgen; //true
s1 instanceof C_Doctor; //true
d1 instanceof C_Surgen; //false 父类对象不是子类对象
```

继承性的即是性质表现为父类与子类之间具有赋值相容性，即父类对象名能够被赋值为子类对象的引用，反之则不行

例如

```java
C_Doctor d1 = new C_Surgen("李文","女");//赋值相容
C_Surgen s1 = new C_Doctor("张鹰","男");//错误，赋值不相容
```

#### 子类对象对父类对象的访问权限

1. 子类对父类中定义为private的私有成员没有访问权限
2. 子类可以访问父类中定义为public和protected的成员
3. 对父类中的缺省成员：同一包中的父类缺省成员可以访问，不同包的不能访问

#### 子类重定义从父类继承来的成员

1. 子类隐藏父类的成员变量
2. 子类覆盖父类的成员方法。注：此时，子类的方法声明必须与父类被覆盖方法的声明保持一致，且子类不能覆盖父类中声明为final的方法
3. 子类继承并重载父类的成员方法

### super引用

super和this有些类似，它是指向父类对象的一个引用型变量，或者说super表示的是当前对象的直接父类对象的引用。super引用有以下两种方法

#### 调用父类的构造方法

子类不能继承父类的构造方法，但是可以通过super调用父类的构造方法，语法格式如下：

super([参数列表])

与this的使用一样，在构造方法中，super（）引用必须是第一行语句

#### 引用父类同名成员

子类访问父类同名成员变量和成员方法的语法格式如下：

`super.成员变量`

`super.成员方法(参数列表)`

### 抽象类与最终类

当定义一个类时，除了声明类的访问权限外，有时还需要声明类的继承特性，即声明一个类是否为抽象类或最终类。在Java语言中，使用abstract关键字声明抽象类，使用final关键字声明最终类。

抽象类通常包含抽象方法，抽象方法只有方法声明，而没有方法体。

最终类是指不能被继承得类，即，最终类不能有子类。

### 内部类

类与类之间还有嵌套关系，即一个类的声明可以包含另一个类。

```java
public C_Patient{
	Protected class CIn_Date{//内部成员类
        private int year;
        private int month=1;
        private int day=1;
    }
    public static int patientCount;
    String name;
    String sex;
    private CIn_Date birthday;
    double temperature;
    String prescription;
}
```

## 类的多态性

#### 编译时多态性

对于同名方法，如果在编译时能够确定执行同名方法中的哪一个，则称为编译时多态性。方法的重载都属于编译时多态性。对于重载的多个方法，系统编译时根据实际参数的类型和数量，能够确定执行哪个方法。

#### 运行时多态性：

三个条件：

1. 有继承关系存在
2. 子类覆盖了父类的方法
3. 父类的引用指向子类的对象

```java
class Doctor{
	String name;
	Doctor(String name)
	{
		this.name=name;
	}
	public void treatPatient(String P){
		System. out. println("医生"+this.name+"治好"+P);
	}
}

class Surgeon extends Doctor{
	Surgeon(String name)
	{ 
		super(name);	//调用父类的构造方法
	}
		public void treatPatient(String P){
			System. out. println("外科医生"+this.name+"治疗"+P);
		} 
		public void treatPatient(int T)
		{
			System. out. println("外科医生"+this.name+"治好"+T+"人");
		}
}
public class ploymorphism{
	public static void main(String[] args){
		Doctor d=new Doctor("张仲景");
		Surgeon s = new Surgeon("白求恩");
		d.treatPatient("王华");
		s.treatPatient("王华");
		s.treatPatient(2);
		d=s;
		d.treatPatient("王华");
	}
}
```

Surgeon类继承于Doctor类，Surgeon 类中的treatPatient(String P)方法覆盖了父类的对应方法,'d=s;'，使父类Doctor的引用指向了子类Surgeon的对象，所以当执行'd.treatPatient("王华");'时存在运行时多态，调用的不是父类的'treatPatient(String P)'方法，而是子类的'treatPatient(String P)'方法。

注：此时父类对象名并不能执行所有子类的方法，只能执行那些在父类中声明，在子类中被覆盖的方法。

## 接口

### 接口的概念

接口主要用于描述某一行为功能所包含的行为方法的基本概况，即方法的名称、返回值的类型以及形式参数列表等。

### 声明接口

接口的声明类似于类的声明，由接口声明与接口体两部分组成。语法格式如下

```java
[<修饰符>] interface <接口名> [extends <父接口列表>]
{
	声明常量1;
	声明常量2；
	……
	声明方法1;
	声明方法2;
	……
}
```

修饰符：public 或 省略

常量：即符号常量，全部隐含为final和static

### 实现接口

与类不同，接口不能用new运算符来直接创建一个实例，但是可以利用接口的特性来构造新的类，这个过程称为接口的实现。

接口的实现类似与类的继承，只是不用extends，而是保留字implements声明一个类将实现一个或者多个接口，具体语法格式如下：

[<修饰符>] class <类名> [extends <父类名>] [implements<接口列表>]

### 接口变量

接口是引用数据类型，Java语言中虽然不能直接创建接口的实例，但却可以声明接口变量，且接口变量能够获得实现该接口的类的对象实例的应用。

```java
//定义接口AddI
interface AddI{int add(int a,int b);};
//定义接口SubI
interface SubI{int sub(int a,int b);};

//实现了AddI和SubI两个接口
public class InterfaceVariable implements AddI,SubI{
	//实现接口AddI的方法
	public int add(int a,int b){
		return a+b;
	}
	//实现接口SubI的方法
	public int sub(int a,int b){
		return a-b;
	}
	//非实现接口的方法
	public int mul(int a,int b){
		return a*b;
	}
	public static void main(String args[]){
		AddI p=new InterfaceVariable();	//AddI类型的p指向InterfaceVariabled对象
		System. out. println("20+10="+p.add(20,10));//AddI 中有add方法，允许
		//System. out. println("20+10="+p.sub(20,10));//AddI中没有sub方法，出错
		//System. out. println("20+10="+p.mul(20,10));//AddI中没有mul方法，出错

		System. out. println("20+10="+((InterfaceVariable)p).sub(20,10));
		System. out. println("20x10="+((InterfaceVariable)p).mul(20,10));
	}
}
```

## Java的常用类

### Object类

| 方法声明                          | 方法功能                                                     |
| --------------------------------- | ------------------------------------------------------------ |
| public boolean equals(Object obj) | 指定其他某个对象是否与此对象相等                             |
| protected Object clone()          | 创建并返回此对象的一个副本                                   |
| protected void finalize()         | 当垃圾回收器确定不存在该对象的更多引用时，由对象的垃圾回收器调用此方法 |
| public String toSting()           | 返回该对象的字符串表示                                       |
| public final Class getClass()     | 返回此Object的运行时类                                       |

equal方法在Object的派生类中被用来对实例进行比较，而不是对引用变量进行比较，后者可以用“==”进行比较。一般来说，equal方法和执行“==”执行的结果不一定相同。

### Class类

#### 1.如何得到Class的对象

1. 调用类的getClass()方法来得到Class对象

   ```java
   MyClass x;//MyClass 必须是接口或者类的名字
   Class c1 = x.getClass();
   ```

2. 使用Class类中的静态forName()方法获得与字符串对应的Class对象。 

   ```java
   Class c2 = Class forName("MyClass");
   ```

   

 3. `T.class;`

    ```java
    Class c11 = MyClass.class;
    Class c12 = int.class;
    Class c13 = Double[].class;
    ```

#### 2.Class类的方法

![](D:\桌面\Java\Java\第六章——Java面向对象程序设计\Class类的方法.jpg)

| 方法声明                            | 方法功能                                                     |
| ----------------------------------- | ------------------------------------------------------------ |
| public String getName()             | 以String的形式返回此Class对象所表示的实体（类、接口、数组类、基本类型或void）名称 |
| public T newInstance()              | 创建此Class对象所表示的类的一个新实例                        |
| public ClassLoader getClassLoader() | 返回该类的类加载器                                           |
| public Class <super T>              | 返回此Class所表示的实体                                      |
| getSuperclass()                     | 超类的Class，如果此Class表示一个Object类、一个接口，一个基本类型或void，则返回null，如果此对象表示一个数组类，则返回该Object类的Class对象 |
| public boolean isArray()            | 判定此Class对象是否表示一个数组类                            |

### Math类

![](D:\桌面\Java\Java\第六章——Java面向对象程序设计\Math类的常用方法.jpg)

### Random类

Random类中实现的随机是伪随机，也就是有规则地随机。

在进行随机时，随机算法的起源数字称为种子数

#### Random类的构造方法

| 方法声明                   | 方法功能                                 |
| -------------------------- | ---------------------------------------- |
| 'public Random()'          | 创建一个新的随机数生成器                 |
| 'public Random(long seed)' | 使用单个long种子创建一个新的随机数生成器 |

#### Random类的常用成员方法

| 方法声明                       | 方法功能                                     |
| ------------------------------ | -------------------------------------------- |
| public boolean nextBoolean     | 返回一个随机的boolean值                      |
| public double nextDouble       | 返回一个随机的double值，数值介于[0,1.0）之间 |
| public int nextInt()           | 返回一个随机的int值，该值介于int的区间       |
| public int nextInt(int n)      | 返回一个随机的int值，该值介于[0,n)的区间     |
| public void setSeed(long seed) | 重新设置Random对象的种子数                   |

```java
Random r = new Random();//创建一个Random类的对象
double d1 = r.nextDouble;//生成[0,1.0)区间的小数
double d2 = r.nextDouble*5;//生成[0,5.0)区间的小数
double d3 = r.nextDouble*1.5 + 1;//生成[1，2.5)区间的小数
int n1 = r.nextInt();//生成任意整数
int n2 = r.nextInt(10);//生成[0,10)区间的整数
n2 = Math.abs(r.nextInt()%10);//生成[0,10)区间的整数
```

### 基本类型的包装类

在Java语言中，每种基本类型都有一个相应的包装类，这些类都在java.lang包中。8个基本数据类型所对应的包装类如下表所示

| 基本数据类型 | 包装类    |
| ------------ | --------- |
| byte         | Byte      |
| int          | Integer   |
| float        | Float     |
| char         | Character |
| short        | Short     |
| long         | Long      |
| double       | Double    |
| boolean      | Boolean   |

所有的包装类都有以下共性

1. 每个包装类被声明为final，即这些类都不能有子类
2. 每个包装类有一个构造方法，可以通过一个相应的基本类型值生成实例
3. 除了Character，其他包装类都有一个构造方法，可以通过一个相应的基本类型值的字符串生成实例
4. 每个包装类都有一个实例方法'xxxValue()',这里的xxx是相应的基本类型名。该方法返回实例所包装的基本类型值
5. 除了Character，其他包装类都有一个静态方法'valueOf(String s)'。该方法可以根据字符串s生成对应包装类的实例

| 方法声明                                          | 方法功能                                                     |
| ------------------------------------------------- | ------------------------------------------------------------ |
| Integer(int value)                                | 构造一个新分配的Integer对象，它表示指定的int值               |
| Integer(String s)                                 | 构造一个新分配的Integer对象，他表示String参数所指示的int值   |
| public int Value()                                | 以int类型返回该Integer的值                                   |
| public String toString()                          | 返回一个表示该Integer值得String对象                          |
| public static String toString(int i)              | 返回一个表示指定整数得String对象                             |
| public static String toString(int i,int radix)    | 返回用第二个参数指定基数表示的第一个参数的字符串表示形式     |
| public static Integer valueOf(String s)           | 返回指定的String值得Integer对象                              |
| public static Integer valueOf(String s,int radix) | 返回一个Integer对象，该对象保存了用第二个参数提供的基数进行解析时从指定的String中提取的值 |
| public static int parseInt(String s)              | 将字符串参数作为有符号的十进制整数进行分析                   |
| public int parseInt(String s, int radix )         | 使用第二个参数指定的基数，将字符串参数解析为有符号的整数     |

```java
Integer I1 = new Integer(10);//创建一个值为10的Integer对象
Integer I2 = new Integer("20");//创建一个值为20的Integer对象
int i1 = I1. int Value();//返回10
String s1 = I2. toString();//返回"20"
String s2 = Integer. toString(30);//返回"30"
String s3 = Integer. toString(30,8);//返回"36"  返回用第二个参数指定基数表示的第一个参数的字符串表示形式
Integer I3 = Integer. valueOf("40");//返回一个值为40的Integer对象
Integer I4 = Integer. valueOf("40",16);//返回一个值为64的Integer对象
int i2 = Integer.parseInt("50");//返回50
int i3 = Integer.parseInt("50",8);//返回40
```



































# 附：长案例程序6-1

**用面向对象的方法模拟医生为病人诊疗的过程**

本案例通过对病人的就诊模型的分析和简化，抽象出包括日期，体温计，病人以及医生等四个主要的类，并利用医生类的接诊、开处方、诊疗等实例成员方法将这些类联系起来，重现病人就诊时医生用体温计测量病人体温，给病人诊疗并开具处方的过程。

```java
//在面向对象的程序设计中，类是对象的抽象与归纳。它是一种复杂的数据类型，不但包含数据，而且还包含对数据进行操作的方法（Method）。
class C_Date	
{
	private int year;//年
	private int month = 1;//月
	private int day = 1;//天
	public C_Date()				//构造方法，无参数
	{
			year=1900;
	}
	public C_Date(int y,int m,int d);//构造方法的重载
	{
		year = y;
		month = m;
		day = d;
	}
	public void setDate(int year,int month,int day){	//设置日期的年-月-日
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public int getYaar(){
		return year;
	}
	public int getMonth(){
		return month;
	}
	public int getDay(){
		return day;
	}
}
//温度计类
class C_Thermometer{
	private double vaule;	//温度计显示的值（摄氏度）
	public C_Thermometer(){	//构造方法
		vaule = 25.0;
	}
	public void reSet{	//温度计复位
		value = 30.0;
	}
	public double measure{	//测量体温
		value = 36 + (Math.random()*100%7);	//使用随机函数仿真被测量者体温值	
		return value;
	}
	public void measure(C_Patient pa){	//测量体温方法重载
		pa.setTemperature(measure());
	}
	public double getValue(){	
		return value;	//读取温度计值
	}
}
```







