package j3;

import android.content.Context;
import i3.g;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static Context f13491a;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f13492b;

    /* renamed from: c, reason: collision with root package name */
    public static b f13493c;

    public static final boolean a(char c7, char c8, boolean z6) {
        if (c7 == c8) {
            return true;
        }
        if (!z6) {
            return false;
        }
        char upperCase = Character.toUpperCase(c7);
        char upperCase2 = Character.toUpperCase(c8);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static synchronized boolean b(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f13491a;
        if (context2 != null && (bool = f13492b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f13492b = null;
        if (g.a()) {
            f13492b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f13492b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f13492b = Boolean.FALSE;
            }
        }
        f13491a = applicationContext;
        return f13492b.booleanValue();
    }

    public static final String c(Reader reader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i6 = reader.read(cArr);
        while (i6 >= 0) {
            stringWriter.write(cArr, 0, i6);
            i6 = reader.read(cArr);
        }
        String string = stringWriter.toString();
        j.d("toString(...)", string);
        return string;
    }

    public static Set d(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        j.d("singleton(...)", setSingleton);
        return setSingleton;
    }
}
