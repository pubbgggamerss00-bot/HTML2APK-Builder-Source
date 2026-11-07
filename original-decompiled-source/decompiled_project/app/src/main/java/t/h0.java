package t;

import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f25247a = ViewConfiguration.getScrollFriction();

    /* renamed from: b, reason: collision with root package name */
    public static final double f25248b;

    /* renamed from: c, reason: collision with root package name */
    public static final double f25249c;

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        f25248b = dLog;
        f25249c = dLog - 1.0d;
    }
}
