# 学习 java

## 01 String对象/常量字符串 "+"号运算符的实现本质
      1. 问题:   String对象,常量字符串,其他类对象,整数，浮点数,字符等数据类型之间通过加号连接起来时会发生了什么事情？实际上是什么实现的? 
      2. 答案是: 涉及到StringBuilder的 创建及方法append()与toString()等等的调用。详细细节在TestString.java文件中
      3. 关键词：字符串连接; StringBuilder类;  反编译工具javap;  Class文件;
