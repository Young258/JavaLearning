package package1;

public class StringConstantPool {
	public static void main(String[] args) {
		//String str = new String("asd");
		//String str = "asd" + "zxc";
	}
}


/*  String str = new String("asd");
 *  字节码指令:
 *   7: ldc           #20  // String asd
 *   9: invokespecial #22 // Method java/lang/String."<init>":(Ljava/lang/String;)V
 * 创建2个对象。一个是常量池中;一个是new创建在Heap/堆中
 */


/*  String str = "asd" + "zxc";
 *  字节码指令:
 *  0: ldc           #16                 // String asdzxc	
 *  一个对象
 */
