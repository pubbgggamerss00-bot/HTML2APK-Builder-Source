package androidx.lifecycle;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final l5.d f2371a = new l5.d();

    public final void b(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        l5.d dVar = this.f2371a;
        if (dVar != null) {
            if (dVar.f16730d) {
                l5.d.a(autoCloseable);
                return;
            }
            synchronized (dVar.f16727a) {
                autoCloseable2 = (AutoCloseable) dVar.f16728b.put(str, autoCloseable);
            }
            l5.d.a(autoCloseable2);
        }
    }

    public final void c() {
        l5.d dVar = this.f2371a;
        if (dVar != null && !dVar.f16730d) {
            dVar.f16730d = true;
            synchronized (dVar.f16727a) {
                try {
                    Iterator it = dVar.f16728b.values().iterator();
                    while (it.hasNext()) {
                        l5.d.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = dVar.f16729c.iterator();
                    while (it2.hasNext()) {
                        l5.d.a((AutoCloseable) it2.next());
                    }
                    dVar.f16729c.clear();
                    pg.f0 f0Var = pg.f0.f21461a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        e();
    }

    public final <T extends AutoCloseable> T d(String str) {
        T t3;
        l5.d dVar = this.f2371a;
        if (dVar == null) {
            return null;
        }
        synchronized (dVar.f16727a) {
            t3 = (T) dVar.f16728b.get(str);
        }
        return t3;
    }

    public void e() {
    }
}
