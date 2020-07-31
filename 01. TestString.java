package package1;

class MyString1{
	int a = 233;
	double b = 6.66;
	char c = '杨';
	
	@Override
	public String toString(){
		return "MyString1: " + a+ b +c;
	}
}

class MyString2{
	int a = 5555;
	double b = 8.88;
	char c = '贵';
	
	@Override
	public String toString(){
		return "  MyString2: " + a+ b +c;
	}
}

//用于测试 字符串String运算符号"+"的细节
//参考自https://www.zhihu.com/question/57105649/answer/195300498
// cmd中 敲命令 javap -v 类名.class 就可以看到 自己所写java编译成字节码文件后 内部的细节
// 这里面涉及到 .class文件(字节码文件) 关于字节码文件背景知识参考自https://blog.csdn.net/brave2211/category_9262236.html 或者《深入理解java虚拟机》

public class TestString {
	public static void main(String[] args) {		
		/*
		 0  // String初始化  字符串常量赋值  调用构造函数
		  String str1 = "oooo";// ldc 加载成String对象
		  String str2 = new String("8888"); // new 一个String对象
		  
		1  //字符串常量+字符串常量
		String str1 = "aaa" + "bbb";
		
		//ldc 加载+连接 "aaa" + "bbb" 形成String对象
		
		
		2  //字符串常量+ String对象
		String str1 = "aaaa";
		String str2 = "cccc" + str1;		
		// "cccc" 通过ldc 形成string对象 str
		//  obj = new StringBuilder(str);
		//   obj.append(str1)
		// obj.toString
		 
		
		3  //字符串常量+ String对象
		String str1 = "aaaa";
		String str2 = str1 +"cccc";	
		//obj = new StringBuilder(String.valueOf(str1))
		// ldc 加载"cccc"  String对象 str2
		// obj.append(str2)
		// obj.toString()
		
		
		4  //String对象 + String对象
		String str1 = "aaaa";
		String str2 = "ddddd";
		String str3 = str1 + str2;
		//  obj = new StringBuilder(String.valueOf(str1));
		// obj.append(str2);
		// obj.toString()
		
		
		5  //字符串常量 + 整数/浮点数/字符
		String  str = "qqqq" + 2333;
		str = "qqqq" + 2.333;
		str = "qqqq" + 'r';
		// ldc 连接
		
		
		
		6 //String对象  + 整数/浮点数/字符
		String str1 = "www";
		String str2 = str1 + 4444; --> new StringBuilder(String.valueOf(str1)) .append(I)  .toString()
		       str2 = str1 + 4.444;--> new StringBuilder(String.valueOf(str1)) .append(D)  .toString()
		       str2 = str1 + 'u';  --> new StringBuilder(String.valueOf(str1)) .append(C)  .toString()
		// 含对象的+ 每次都要 new StringBuilder() 
		
	    String str2 = "www";
		       str2 = str2+ 4444;  // 需要new StringBuilder对象
		       str2 = str2 + 4.444; //需要new StringBuilder对象
		       str2 = str2 + 'u';//需要new StringBuilder对象
		      // 这个操作也是 
		
		
		7  //String对象 +  整数/浮点数/字符 + 字符串常量
		String str1 = "8888";
		String str2 = str1 + 4.5 + 666 +'t' + "young";
		// new  一个StringBuilder对象
		// 后面的 .append(4.5) .append(666) .append('t') .append("young")  
		
		
		8 // String对象夹杂在一堆常量中间 
		String str1 = "asdfg";
		String str2;
		str2 = 444 + 4.5 + "888" + str1 + "yang";
		// 444+4.5 = 448.5
		// ldc 448.5 +"888"  -> 448.5888 -->str
		// obj = new StringBuilder(str)
		// obj.append(str1)
		// ldc "yang" -->  str2
		// obj.append(str2)
		// obj.toString()
		  
		 
		 
		//  String对象 + 自定义类对象
		MyString1 m1 = new MyString1();
		MyString2 m2 = new MyString2();
		
		String str;
		str = "String + " + m1 +m2;//ldc "String: " 成String对象str --> obj = new StringBuilder(str) -->  obj.append(m1) --> obj.append(m2)
		 																								//这里调用m1.toString()  m2.toString()
		System.out.println(str);
		*/
		
	}
}
