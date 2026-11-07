package org.gradle.cli;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: HTML-to-APK-Builder_v1.32_zfix2.apk:assets/android_project_template_root/gradle/wrapper/gradle-wrapper.jar:org/gradle/cli/ParsedCommandLine.class */
public final class ParsedCommandLine {
    public final HashMap optionsByString = new HashMap();
    public final HashSet presentOptions = new HashSet();
    public final HashSet removedOptions = new HashSet();
    public final ArrayList extraArguments = new ArrayList();

    public ParsedCommandLine(HashSet hashSet) {
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            CommandLineOption commandLineOption = (CommandLineOption) it.next();
            ParsedCommandLineOption parsedCommandLineOption = new ParsedCommandLineOption();
            Iterator it2 = commandLineOption.getOptions().iterator();
            while (it2.hasNext()) {
                this.optionsByString.put((String) it2.next(), parsedCommandLineOption);
            }
        }
    }

    public static String quoteAndJoin(AbstractCollection abstractCollection) {
        StringBuilder sb = new StringBuilder();
        boolean z10 = true;
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            boolean z11 = z10;
            String str = (String) it.next();
            if (!z11) {
                sb.append(", ");
            }
            sb.append("'");
            sb.append(str);
            sb.append("'");
            z10 = false;
        }
        return sb.toString();
    }

    public final String toString() {
        return String.format("options: %s, extraArguments: %s, removedOptions: %s", quoteAndJoin(this.presentOptions), quoteAndJoin(this.extraArguments), quoteAndJoin(this.removedOptions));
    }

    public final ParsedCommandLineOption option(String str) {
        ParsedCommandLineOption parsedCommandLineOption = (ParsedCommandLineOption) this.optionsByString.get(str);
        if (parsedCommandLineOption != null) {
            return parsedCommandLineOption;
        }
        throw new IllegalArgumentException(String.format("Option '%s' not defined.", str));
    }
}
