package org.gradle.wrapper;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: HTML-to-APK-Builder_v1.32_zfix2.apk:assets/android_project_template_root/gradle/wrapper/gradle-wrapper.jar:org/gradle/wrapper/BootstrapMainStarter$1.class */
public final class BootstrapMainStarter$1 implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.matches("gradle-launcher-.*\\.jar");
    }
}
