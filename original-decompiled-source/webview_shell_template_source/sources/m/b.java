package m;

import androidx.fragment.app.p;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b extends p {

    /* renamed from: t, reason: collision with root package name */
    public static volatile b f13847t;

    /* renamed from: u, reason: collision with root package name */
    public static final a f13848u = new a();
    public final c s = new c();

    public static b i() {
        if (f13847t != null) {
            return f13847t;
        }
        synchronized (b.class) {
            try {
                if (f13847t == null) {
                    f13847t = new b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f13847t;
    }
}
