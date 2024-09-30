package co.edu.uco.crosscutting.helpers;

public class TextHelper {
	
	private static final String EMPTY = "";
	
	private TextHelper() {
		
	}
	
	public static boolean isNull(final String string) {
		return ObjectHelper.isNull(string);
	}
	public static String getDefault(final String string, final String defaultValue) {
        return string == null ? EMPTY : string;
    }
	
	public static boolean isEmpty(final String string) {
		return EMPTY.equals(getDefault(string, EMPTY).intern());
	}
	public static boolean isEmptyAplyingTrim(final String string) {
		return isEmpty(applyTrim(string));
	}
	public static String applyTrim(final String string) {
		return getDefault(string, EMPTY).trim();
	}
	
	public static void main(String[] args) {
		String b = "              ";
		System.out.println(isEmpty(b));
		
	}

}
