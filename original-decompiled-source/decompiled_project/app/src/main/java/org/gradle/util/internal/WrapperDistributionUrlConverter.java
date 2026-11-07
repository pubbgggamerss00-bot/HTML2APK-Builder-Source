package org.gradle.util.internal;

import java.io.File;
import java.net.URI;

/* loaded from: HTML-to-APK-Builder_v1.32_zfix2.apk:assets/android_project_template_root/gradle/wrapper/gradle-wrapper.jar:org/gradle/util/internal/WrapperDistributionUrlConverter.class */
public abstract class WrapperDistributionUrlConverter {
    public static URI convertDistributionUrl(File file, String str) {
        URI uri = new URI(str);
        return uri.getScheme() == null ? new File(file, uri.getSchemeSpecificPart()).toURI() : uri;
    }
}
