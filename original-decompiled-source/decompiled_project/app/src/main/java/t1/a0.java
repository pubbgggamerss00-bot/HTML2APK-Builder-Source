package t1;

import android.os.Build;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f27629a;

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.r.d(lowerCase, "toLowerCase(...)");
        f27629a = lowerCase.equals("robolectric");
    }
}
