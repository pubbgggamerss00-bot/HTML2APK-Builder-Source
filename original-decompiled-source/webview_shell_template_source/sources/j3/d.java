package j3;

import android.content.Context;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final d f13495b;

    /* renamed from: a, reason: collision with root package name */
    public c f13496a;

    static {
        d dVar = new d();
        dVar.f13496a = null;
        f13495b = dVar;
    }

    public static c a(Context context) {
        c cVar;
        d dVar = f13495b;
        synchronized (dVar) {
            try {
                if (dVar.f13496a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    dVar.f13496a = new c(context);
                }
                cVar = dVar.f13496a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }
}
