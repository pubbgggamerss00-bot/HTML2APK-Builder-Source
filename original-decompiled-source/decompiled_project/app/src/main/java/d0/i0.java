package d0;

import g2.u1;
import java.util.Iterator;
import p.k0;

/* loaded from: classes.dex */
public final class i0 implements g2.u1 {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f7138a;

    /* renamed from: b, reason: collision with root package name */
    public final p.f0<Object> f7139b = p.p0.a();

    public i0(c0 c0Var) {
        this.f7138a = c0Var;
    }

    @Override // g2.u1
    public final void a(u1.a aVar) {
        p.f0<Object> f0Var = this.f7139b;
        f0Var.a();
        Iterator<Object> it = aVar.iterator();
        while (true) {
            k0.a aVar2 = (k0.a) it;
            if (!aVar2.hasNext()) {
                return;
            }
            Object next = aVar2.next();
            Object objB = this.f7138a.b(next);
            int iD = f0Var.d(objB);
            int i10 = iD >= 0 ? f0Var.f20617c[iD] : 0;
            if (i10 == 7) {
                aVar.remove(next);
            } else {
                f0Var.h(i10 + 1, objB);
            }
        }
    }

    @Override // g2.u1
    public final boolean b(Object obj, Object obj2) {
        c0 c0Var = this.f7138a;
        return kotlin.jvm.internal.r.a(c0Var.b(obj), c0Var.b(obj2));
    }
}
