package n;

import c5.p;

/* loaded from: classes.dex */
public final class b extends p {

    /* renamed from: b, reason: collision with root package name */
    public static volatile b f18283b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f18284c = new a();

    /* renamed from: a, reason: collision with root package name */
    public final c f18285a = new c();

    public static b b0() {
        if (f18283b != null) {
            return f18283b;
        }
        synchronized (b.class) {
            try {
                if (f18283b == null) {
                    f18283b = new b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f18283b;
    }
}
