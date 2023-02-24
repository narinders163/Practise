package methodReferencing;

interface parser{
    String parse(String str);
}
class StringParser{
    public static String convert(String str){
        if(str.length()<=3){
            str=str.toUpperCase();
        }else{
            str=str.toLowerCase();
        }
        return str;
    }
}
class name{
    public void logic(String str , parser p){
        str = p.parse(str);
        System.out.println(str);
    }
}
public class convertAString {
    public static void main(String[] args) {
        String str = "har";
        name n = new name();
//        parser p = (String str1) -> StringParser.convert(str1);
        n.logic(str,StringParser::convert);
    }
}
