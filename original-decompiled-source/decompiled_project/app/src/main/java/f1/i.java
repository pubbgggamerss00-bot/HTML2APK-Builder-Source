package f1;

import androidx.datastore.preferences.protobuf.u1;
import java.util.concurrent.atomic.AtomicReference;
import pg.f0;

/* loaded from: classes.dex */
public final class i<T> {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference<k> f8802a = new AtomicReference<>(j.f8805a);

    /* renamed from: b, reason: collision with root package name */
    public final Object f8803b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public T f8804c;

    public final T a() {
        long jA = u1.a();
        if (jA == l.f8809a) {
            return this.f8804c;
        }
        k kVar = this.f8802a.get();
        int iA = kVar.a(jA);
        if (iA >= 0) {
            return (T) kVar.f8808c[iA];
        }
        return null;
    }

    public final void b(T t3) {
        long jA = u1.a();
        if (jA == l.f8809a) {
            this.f8804c = t3;
            return;
        }
        synchronized (this.f8803b) {
            k kVar = this.f8802a.get();
            int iA = kVar.a(jA);
            if (iA >= 0) {
                kVar.f8808c[iA] = t3;
            } else {
                this.f8802a.set(kVar.b(t3, jA));
                f0 f0Var = f0.f21461a;
            }
        }
    }
}
