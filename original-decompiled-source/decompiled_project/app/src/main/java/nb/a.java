package nb;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import g5.b;
import g5.c;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f18655a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final DecelerateInterpolator f18656b;

    static {
        new b(b.f11472c);
        new g5.a();
        new c(c.f11473c);
        f18656b = new DecelerateInterpolator();
    }

    public static float a(float f10, float f11, float f12) {
        return org.bouncycastle.jcajce.provider.digest.c.a(f11, f10, f12, f10);
    }

    public static float b(float f10, float f11, float f12, float f13, float f14) {
        return f14 <= f12 ? f10 : f14 >= f13 ? f11 : a(f10, f11, (f14 - f12) / (f13 - f12));
    }
}
