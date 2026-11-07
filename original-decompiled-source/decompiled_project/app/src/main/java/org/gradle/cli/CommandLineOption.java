package org.gradle.cli;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: HTML-to-APK-Builder_v1.32_zfix2.apk:assets/android_project_template_root/gradle/wrapper/gradle-wrapper.jar:org/gradle/cli/CommandLineOption.class */
public final class CommandLineOption {
    public String description;
    public final HashSet options = new HashSet();
    public Class argumentType = Void.TYPE;
    public final HashSet groupWith = new HashSet();

    public CommandLineOption(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.options.add((String) it.next());
        }
    }

    public final HashSet getOptions() {
        return this.options;
    }
}
