package jasper;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Kohsuke Kawaguchi
 */
public class ReservedWords {
    public static final Set<String> WORDS = new HashSet<String>(Arrays.asList(
        "abstract","continue","for","new","switch",
        "assert","default","goto","package","synchronized",
        "boolean","do","if","private","this",
        "break","double","implements","protected","throw",
        "byte","else","import","public","throws",
        "case","enum","instanceof","return","transient",
        "catch","extends","int","short","try",
        "char","final","interface","static","void",
        "class","finally","long","strictfp","volatile",
        "const","float","native","super","while"
    ));

    /**
     * If the text is a reserved word, escape by a single quote.
     */
    public static String apos(String s) {
        if (WORDS.contains(s))
            return '\''+s+'\'';
        return s;
    }
}
