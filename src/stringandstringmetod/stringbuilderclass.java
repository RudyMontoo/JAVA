package stringandstringmetod;

public class stringbuilderclass {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<26;i++){
            char ch=(char)(i+'a');
            builder.append(ch);
        }
        System.out.println(builder.toString());
        builder.reverse();
        System.out.println(builder.toString());
    }
}
