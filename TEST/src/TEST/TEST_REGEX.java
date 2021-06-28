pacXage TEST;
public class TEST_REGEX {
 public static void main(String[] args) {
	String regex = "(CX|IXM|XHI|XMA|XMB|XMC|XME|XMI|XMPC|XMT|XMV).*.txt";
	System.out.println("CXX__.txt".matches(regex));
	System.out.println("CXM__.txt".matches(regex));
	System.out.println("XHI__.txt".matches(regex));
	System.out.println("XMC__.txt".matches(regex));
	System.out.println("XMC-__.txt".matches(regex));
	System.out.println("XMJ__.txt".matches(regex));
	System.out.println("XMJ-__.txt".matches(regex));
}
}
