package q0;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: q0.a$a, reason: collision with other inner class name */
    public static final class C0086a {
        public static void a(int i6) {
            SdkExtensions.getExtensionVersion(i6);
        }
    }

    static {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 30) {
            C0086a.a(30);
        }
        if (i6 >= 30) {
            C0086a.a(31);
        }
        if (i6 >= 30) {
            C0086a.a(33);
        }
        if (i6 >= 30) {
            C0086a.a(1000000);
        }
    }

    public static final boolean a() {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 31) {
            return true;
        }
        if (i6 >= 30) {
            String str = Build.VERSION.CODENAME;
            kotlin.jvm.internal.j.d("CODENAME", str);
            if (!"REL".equals(str)) {
                Locale locale = Locale.ROOT;
                String upperCase = str.toUpperCase(locale);
                kotlin.jvm.internal.j.d("this as java.lang.String).toUpperCase(Locale.ROOT)", upperCase);
                Integer num = upperCase.equals("BAKLAVA") ? num : null;
                String upperCase2 = "S".toUpperCase(locale);
                kotlin.jvm.internal.j.d("this as java.lang.String).toUpperCase(Locale.ROOT)", upperCase2);
                num = upperCase2.equals("BAKLAVA") ? 0 : null;
                if (num == null || num == null) {
                    if (num == null && num == null) {
                        String upperCase3 = str.toUpperCase(locale);
                        kotlin.jvm.internal.j.d("this as java.lang.String).toUpperCase(Locale.ROOT)", upperCase3);
                        String upperCase4 = "S".toUpperCase(locale);
                        kotlin.jvm.internal.j.d("this as java.lang.String).toUpperCase(Locale.ROOT)", upperCase4);
                        if (upperCase3.compareTo(upperCase4) >= 0) {
                            return true;
                        }
                    } else if (num != null) {
                        return true;
                    }
                } else if (num.intValue() >= num.intValue()) {
                    return true;
                }
            }
        }
        return false;
    }
}
