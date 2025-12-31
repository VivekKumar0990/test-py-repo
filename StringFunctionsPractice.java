public class StringFunctionsPractice {

    public static void main(String[] args) {

        String name  = "Rajiv";
        String title = "Ranjan";

        System.out.println("Length of name: " + name.length());
        System.out.println("Length of title: " + title.length());

        System.out.println("CharAt name(0): " + name.charAt(0));
        System.out.println("CharAt title(2): " + title.charAt(2));

        System.out.println("Substring name(1,4): " + name.substring(1, 4));
        System.out.println("Substring title(0,3): " + title.substring(0, 3));

        System.out.println("Equals: " + name.equals(title));
        System.out.println("EqualsIgnoreCase: " + name.equalsIgnoreCase("rajiv"));

        System.out.println("Uppercase name: " + name.toUpperCase());
        System.out.println("Lowercase title: " + title.toLowerCase());

        String fullName = "   Rajiv Ranjan   ";
        System.out.println("Trimmed: '" + fullName.trim() + "'");
    }
}
