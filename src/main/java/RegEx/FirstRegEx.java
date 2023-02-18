package RegEx;

public class FirstRegEx {
    public static void main(String[] args) {
        String string = "(+1)416-545-6565";
        String st = string.replace("(", "").replace(")","").replace("-","");
        System.out.println(st);
    }
}
