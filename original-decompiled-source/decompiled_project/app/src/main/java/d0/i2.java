package d0;

import android.os.Build;
import d0.e2;
import java.util.Locale;

/* loaded from: classes.dex */
public final class i2 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f7153a;

    public static final class a implements h2 {
        @Override // d0.h2
        public final void a(e2.a aVar) {
        }
    }

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.r.d(lowerCase, "toLowerCase(...)");
        f7153a = lowerCase.equals("robolectric") ? new a() : null;
    }
}
