package ya;

import android.content.Context;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final d f34357b;

    /* renamed from: a, reason: collision with root package name */
    public c f34358a;

    static {
        d dVar = new d();
        dVar.f34358a = null;
        f34357b = dVar;
    }

    public static c a(Context context) {
        c cVar;
        d dVar = f34357b;
        synchronized (dVar) {
            try {
                if (dVar.f34358a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    dVar.f34358a = new c(context);
                }
                cVar = dVar.f34358a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }
}
