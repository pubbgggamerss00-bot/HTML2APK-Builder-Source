package com.google.android.gms.common.internal;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: b, reason: collision with root package name */
    public static q f6183b;

    /* renamed from: c, reason: collision with root package name */
    public static final r f6184c = new r(0, 0, 0, false, false);

    /* renamed from: a, reason: collision with root package name */
    public r f6185a;

    public static synchronized q a() {
        try {
            if (f6183b == null) {
                f6183b = new q();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f6183b;
    }
}
