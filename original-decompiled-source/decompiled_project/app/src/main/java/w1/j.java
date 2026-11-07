package w1;

import pg.f0;
import w1.c;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public eh.l<? super j, f0> f31183a;

    public abstract void a(s1.e eVar);

    public eh.l<j, f0> b() {
        return this.f31183a;
    }

    public final void c() {
        eh.l<j, f0> lVarB = b();
        if (lVarB != null) {
            lVarB.invoke(this);
        }
    }

    public void d(c.a aVar) {
        this.f31183a = aVar;
    }
}
