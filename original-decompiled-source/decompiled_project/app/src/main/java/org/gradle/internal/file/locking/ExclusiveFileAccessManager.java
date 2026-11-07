package org.gradle.internal.file.locking;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: HTML-to-APK-Builder_v1.32_zfix2.apk:assets/android_project_template_root/gradle/wrapper/gradle-wrapper.jar:org/gradle/internal/file/locking/ExclusiveFileAccessManager.class */
public final class ExclusiveFileAccessManager {
    public static void maybeCloseQuietly(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }
}
