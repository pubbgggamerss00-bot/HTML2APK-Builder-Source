package u3;

import android.os.Build;
import android.os.ext.SdkExtensions;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f29243a = 0;

    public static final class a {
        public static void a(int i10) {
            SdkExtensions.getExtensionVersion(i10);
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            a.a(30);
        }
        if (i10 >= 30) {
            a.a(31);
        }
        if (i10 >= 30) {
            a.a(33);
        }
        if (i10 >= 30) {
            a.a(1000000);
        }
    }
}
