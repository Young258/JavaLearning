package package1;

/* Str.intern()
 *  若字符串常量池中没有str,则返回str的对象引用 且将该引用存入字符串常量池中
 *  若字符串常量池中   有str，则直接返回字符串常量池中的对象引用
 */



public class TestIntern {
	public static void main(String[] args) {
		
		String str1 = new String(new char[]{'a','b','c'});
		String str2 = new String(new char[]{'a','b','c'});
		
		
		System.out.println(str1.intern()==str1);//true
		// 字符串常量池中没有"abc", 所以str1.intern()返回的是str1的对象引用 所以结果true
		// 将str1的对象引用副本放入字符串常量池中
		
		System.out.println(str2.intern()==str2);//false
		// 字符串常量池中有字符串"abc",返回引用,这个引用就是上面存入的str1的对象引用
		System.out.println(str1.intern()==str1);//true
		// 字符串常量池中有字符串"abc",返回引用,这个引用就是上面存入的str1的对象引用
		System.out.println(str1.intern()==str2.intern());//true

	
		/* 先str1.intern(),所以是将str1的对象引用 存入字符串常量池中
		System.out.println(str1.intern()==str2.intern());//true
		System.out.println(str1.intern()==str1);//true
		System.out.println(str2.intern()==str2);//false
		*/
		
		/* 先str2.intern(),所以是将str2的对象引用 存入字符串常量池中
		System.out.println(str2.intern()==str1.intern());//true
		System.out.println(str1.intern()==str1);//false
		System.out.println(str2.intern()==str2);//true
		*/
	}
}