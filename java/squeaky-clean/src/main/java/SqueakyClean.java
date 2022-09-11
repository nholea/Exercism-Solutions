import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.Collections.replaceAll;

class SqueakyClean {
    static String clean(String identifier) {
        String replacedIdentifier = "";
        if (!identifier.isEmpty()){
        replacedIdentifier = identifier.replaceAll("\s", "_")
                .replaceAll("\\p{Cntrl}", "CTRL")
                .replaceAll("-.", String.valueOf(identifier.charAt(identifier.indexOf("-") + 1)).toUpperCase())
                .replaceAll("[α-ω]", "")
                .replaceAll("[^\\p{L}\\p{P}\\p{Z}]", "")
        ;}
        return replacedIdentifier;
    }

    public static void main(String[] args){
        System.out.println(clean(" my   Id   "));
    }
}
