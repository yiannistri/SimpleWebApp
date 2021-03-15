package com.develogical.app;

public class QueryProcessor {
    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.toLowerCase().contains("orwell")) {
            return "George Orwell (25 June 1903 - 21 January 1950) was an " +
                    "English novelist, essayist, journalist and critic. His work is characterised by lucid " +
                    "prose, biting social criticism, opposition to totalitarianism, and outspoken support of " +
                    "democratic socialism.";
        }
        return "";
    }
}
