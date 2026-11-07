package n5;

import m5.a;
import n5.a;

/* loaded from: classes.dex */
public class b<D> {

    /* renamed from: a, reason: collision with root package name */
    public a.C0174a f18341a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f18342b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18343c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18344d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18345e;

    public final void a() {
        a aVar = (a) this;
        if (aVar.f18338g != null) {
            boolean z10 = aVar.f18342b;
            if (!z10) {
                if (z10) {
                    aVar.b();
                } else {
                    aVar.f18345e = true;
                }
            }
            if (aVar.f18339h != null) {
                aVar.f18338g.getClass();
                aVar.f18338g = null;
                return;
            }
            aVar.f18338g.getClass();
            a<D>.RunnableC0183a runnableC0183a = aVar.f18338g;
            runnableC0183a.f18349c.set(true);
            if (runnableC0183a.f18347a.cancel(false)) {
                aVar.f18339h = aVar.f18338g;
            }
            aVar.f18338g = null;
        }
    }

    public final void b() {
        a aVar = (a) this;
        aVar.a();
        aVar.f18338g = new a.RunnableC0183a();
        aVar.c();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        Class<?> cls = getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append(" id=0}");
        return sb.toString();
    }
}
