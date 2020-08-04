

<h1 align = "center">学习 java</h1>

## 01 String对象/常量字符串连接: 深入理解加号(+)运算符的使用
      1. 问题:   (String对象/常量字符串)与(其他类对象/整数/浮点数/字符等数据类型)之间通过加号(+)连接起来时发生了什么事？怎么实现的?       
      2. 答案是: 涉及到StringBuilder实例对象的创建及方法append()与toString()等的调用。详细细节在TestString.java文件中      
      3. 关键词：字符串连接; StringBuilder类;  反编译工具javap;  Class文件;      
      
      
 ## 02  StringBuilder
     1. 存储: char[]数组
     2. 字段：char[] value;//存数据
              int count;//显示字符数
     3.方法: append(char/double/float/boolean/String) 追加字符


### 03 System
    1.特点: 不可实例化对象;标准输入输出; 输入/输出到/自控制台
    2.字段: in --> 类型BufferedInputStream  //标准输入
            out--> 类型PrintStream //标准输出
            err--> 类型PrintStream //标准错误输出
    3.继承关系: Object->OutputStream->FilterOutputStream->PrintStream
               Object->InputStream->FilterInputStream->BufferedInputStream
    4.看法: 可以把标准输入输出看出针对控制台的文本I/O

### 04 HashMap
    数组链表: 数组的每一个位置都是一个单链表的表头;hash相同的会放在同一个单链表中；当单链表节点数超过8时,链表转成红黑树存储
    确定key-value在数组中位置: key.hashCode() --> hash(hashcode) --> hash%length
    //由此可知对于同一个map, 键值对所存放位置仅仅取决于key这个对象所返回的hashcode,而这个的返回值又取决于key这个对象的字段成员的值
    //https://www.cnblogs.com/chengxiao/p/6059914.html

     
### 05 synchronized关键字
    02.synchronized关键字.md详细说明了关键字synchronized的几种用法
    




      
