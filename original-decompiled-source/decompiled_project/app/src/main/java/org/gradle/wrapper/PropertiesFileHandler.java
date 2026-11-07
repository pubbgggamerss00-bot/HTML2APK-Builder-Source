package org.gradle.wrapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* loaded from: HTML-to-APK-Builder_v1.32_zfix2.apk:assets/android_project_template_root/gradle/wrapper/gradle-wrapper.jar:org/gradle/wrapper/PropertiesFileHandler.class */
public abstract class PropertiesFileHandler {
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable, java.util.Properties] */
    public static Map getSystemProperties(File file) throws IOException {
        if (!file.isFile()) {
            return Collections.emptyMap();
        }
        ?? properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                HashMap map = new HashMap();
                for (Object obj : properties.keySet()) {
                    if (obj.toString().startsWith("systemProp.")) {
                        String strSubstring = obj.toString().substring(11);
                        if (strSubstring.length() > 0) {
                            map.put(strSubstring, properties.get(obj).toString());
                        }
                    }
                }
                return Collections.unmodifiableMap(map);
            } catch (Throwable th2) {
                th2.close();
                throw properties;
            }
        } catch (IOException e10) {
            throw new RuntimeException("Error when loading properties file=" + file, e10);
        }
    }
}
