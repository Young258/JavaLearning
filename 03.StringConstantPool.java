package package1;

public class StringConstantPool {
	public static void main(String[] args) {
		//String str = new String("asd");
		//String str = "asd" + "zxc";
	}
}


/*  String str = new String("asd");
 *  �ֽ���ָ��:
 *   7: ldc           #20  // String asd
 *   9: invokespecial #22 // Method java/lang/String."<init>":(Ljava/lang/String;)V
 * ����2������һ���ǳ�������;һ����new������Heap/����
 */


/*  String str = "asd" + "zxc";
 *  �ֽ���ָ��:
 *  0: ldc           #16                 // String asdzxc	
 *  һ������
 */
