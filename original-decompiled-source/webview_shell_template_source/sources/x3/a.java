package x3;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f15144a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final j1.b f15145b = new j1.b();

    /* renamed from: c, reason: collision with root package name */
    public static final j1.a f15146c = new j1.a();

    /* renamed from: d, reason: collision with root package name */
    public static final j1.c f15147d = new j1.c(j1.c.f13445c);

    /* renamed from: e, reason: collision with root package name */
    public static final DecelerateInterpolator f15148e = new DecelerateInterpolator();

    public static float a(float f6, float f7, float f8) {
        return ((f7 - f6) * f8) + f6;
    }

    public static float b(float f6, float f7, float f8, float f9, float f10) {
        return f10 <= f8 ? f6 : f10 >= f9 ? f7 : a(f6, f7, (f10 - f8) / (f9 - f8));
    }

    public static int c(float f6, int i6, int i7) {
        return Math.round(f6 * (i7 - i6)) + i6;
    }
}
