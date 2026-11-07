package org.gradle.util.internal;

import java.util.AbstractMap;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Function;

/* loaded from: HTML-to-APK-Builder_v1.32_zfix2.apk:assets/android_project_template_root/gradle/wrapper/gradle-wrapper.jar:org/gradle/util/internal/WrapperCredentials.class */
public final class WrapperCredentials {
    public final String token;
    public final String basicUserInfo;

    public WrapperCredentials(String str, String str2) {
        this.token = str;
        this.basicUserInfo = str2;
    }

    public static String tryGetProperty(String str, String str2, Function function) {
        if (str != null) {
            String str3 = (String) function.apply("gradle." + str.replace('.', '_').toLowerCase(Locale.ROOT) + '.' + str2);
            if (str3 != null) {
                return str3;
            }
        }
        return (String) function.apply("gradle.".concat(str2));
    }

    public final boolean equals(Object obj) {
        if (obj == null || WrapperCredentials.class != obj.getClass()) {
            return false;
        }
        WrapperCredentials wrapperCredentials = (WrapperCredentials) obj;
        return Objects.equals(this.token, wrapperCredentials.token) && Objects.equals(this.basicUserInfo, wrapperCredentials.basicUserInfo);
    }

    public final int hashCode() {
        return Objects.hash(this.token, this.basicUserInfo);
    }

    public final String toString() {
        int iIndexOf;
        String string;
        StringBuilder sb = new StringBuilder("WrapperCredentials{");
        if (this.token != null) {
            string = "<TOKEN>";
        } else {
            StringBuilder sb2 = new StringBuilder("password for ");
            String str = this.basicUserInfo;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry = (str != null && (iIndexOf = str.indexOf(58)) >= 0) ? new AbstractMap.SimpleImmutableEntry(this.basicUserInfo.substring(0, iIndexOf), this.basicUserInfo.substring(iIndexOf + 1)) : null;
            string = sb2.append(simpleImmutableEntry != null ? (String) simpleImmutableEntry.getKey() : null).toString();
        }
        return sb.append(string).append('}').toString();
    }
}
