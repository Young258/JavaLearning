package package1;

class MyString1{
	int a = 233;
	double b = 6.66;
	char c = '��';
	
	@Override
	public String toString(){
		return "MyString1: " + a+ b +c;
	}
}

class MyString2{
	int a = 5555;
	double b = 8.88;
	char c = '��';
	
	@Override
	public String toString(){
		return "  MyString2: " + a+ b +c;
	}
}

//���ڲ��� �ַ���String�������"+"��ϸ��
//�ο���https://www.zhihu.com/question/57105649/answer/195300498
// cmd�� ������ javap -v ����.class �Ϳ��Կ��� �Լ���дjava������ֽ����ļ��� �ڲ���ϸ��
// �������漰�� .class�ļ�(�ֽ����ļ�) �����ֽ����ļ�����֪ʶ�ο���https://blog.csdn.net/brave2211/category_9262236.html ���ߡ��������java�������

public class TestString {
	public static void main(String[] args) {		
		/*
		 0  // String��ʼ��  �ַ���������ֵ  ���ù��캯��
		  String str1 = "oooo";// ldc ���س�String����
		  String str2 = new String("8888"); // new һ��String����
		  
		1  //�ַ�������+�ַ�������
		String str1 = "aaa" + "bbb";
		
		//ldc ����+���� "aaa" + "bbb" �γ�String����
		
		
		2  //�ַ�������+ String����
		String str1 = "aaaa";
		String str2 = "cccc" + str1;		
		// "cccc" ͨ��ldc �γ�string���� str
		//  obj = new StringBuilder(str);
		//   obj.append(str1)
		// obj.toString
		 
		
		3  //�ַ�������+ String����
		String str1 = "aaaa";
		String str2 = str1 +"cccc";	
		//obj = new StringBuilder(String.valueOf(str1))
		// ldc ����"cccc"  String���� str2
		// obj.append(str2)
		// obj.toString()
		
		
		4  //String���� + String����
		String str1 = "aaaa";
		String str2 = "ddddd";
		String str3 = str1 + str2;
		//  obj = new StringBuilder(String.valueOf(str1));
		// obj.append(str2);
		// obj.toString()
		
		
		5  //�ַ������� + ����/������/�ַ�
		String  str = "qqqq" + 2333;
		str = "qqqq" + 2.333;
		str = "qqqq" + 'r';
		// ldc ����
		
		
		
		6 //String����  + ����/������/�ַ�
		String str1 = "www";
		String str2 = str1 + 4444; --> new StringBuilder(String.valueOf(str1)) .append(I)  .toString()
		       str2 = str1 + 4.444;--> new StringBuilder(String.valueOf(str1)) .append(D)  .toString()
		       str2 = str1 + 'u';  --> new StringBuilder(String.valueOf(str1)) .append(C)  .toString()
		// �������+ ÿ�ζ�Ҫ new StringBuilder() 
		
	    String str2 = "www";
		       str2 = str2+ 4444;  // ��Ҫnew StringBuilder����
		       str2 = str2 + 4.444; //��Ҫnew StringBuilder����
		       str2 = str2 + 'u';//��Ҫnew StringBuilder����
		      // �������Ҳ�� 
		
		
		7  //String���� +  ����/������/�ַ� + �ַ�������
		String str1 = "8888";
		String str2 = str1 + 4.5 + 666 +'t' + "young";
		// new  һ��StringBuilder����
		// ����� .append(4.5) .append(666) .append('t') .append("young")  
		
		
		8 // String���������һ�ѳ����м� 
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
		  
		 
		 
		//  String���� + �Զ��������
		MyString1 m1 = new MyString1();
		MyString2 m2 = new MyString2();
		
		String str;
		str = "String + " + m1 +m2;//ldc "String: " ��String����str --> obj = new StringBuilder(str) -->  obj.append(m1) --> obj.append(m2)
		 																								//�������m1.toString()  m2.toString()
		System.out.println(str);
		*/
		
	}
}
