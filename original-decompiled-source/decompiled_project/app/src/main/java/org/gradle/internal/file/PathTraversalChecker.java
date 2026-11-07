package org.gradle.internal.file;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: HTML-to-APK-Builder_v1.32_zfix2.apk:assets/android_project_template_root/gradle/wrapper/gradle-wrapper.jar:org/gradle/internal/file/PathTraversalChecker.class */
public abstract class PathTraversalChecker {
    public static final boolean IS_WINDOWS = System.getProperty("os.name").toLowerCase(Locale.US).contains("windows");

    public static String safePathName(String str) {
        String strReplace;
        if (!str.isEmpty() && ((!IS_WINDOWS || !str.contains(":")) && !str.startsWith("/") && !str.startsWith("\\"))) {
            char c10 = File.separatorChar;
            if (c10 == '\\') {
                strReplace = str.replace('/', c10);
            } else {
                if (c10 != '/') {
                    throw new IllegalStateException("Unknown file separator: " + c10);
                }
                strReplace = str.replace('\\', c10);
            }
            Path path = new File(strReplace).toPath();
            ArrayList arrayList = new ArrayList(path.getNameCount());
            Iterator<Path> it = path.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toString());
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                if (str2.equals("..") || (IS_WINDOWS && !str2.equals(".") && str2.endsWith("."))) {
                }
            }
            return str;
        }
        throw new IllegalArgumentException(String.format("'%s' is not a safe archive entry or path name.", str));
    }
}
