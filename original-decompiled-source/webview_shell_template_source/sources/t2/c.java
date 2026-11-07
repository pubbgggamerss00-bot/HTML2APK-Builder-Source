package t2;

import t2.a;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c<V> extends a<V> {
    public final boolean h(V v2) {
        if (v2 == null) {
            v2 = (V) a.f14408y;
        }
        if (!a.f14407x.b(this, null, v2)) {
            return false;
        }
        a.b(this);
        return true;
    }

    public final boolean i(Throwable th) {
        if (!a.f14407x.b(this, null, new a.c(th))) {
            return false;
        }
        a.b(this);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(c5.a<? extends V> aVar) {
        a.c cVar;
        aVar.getClass();
        Object obj = this.s;
        if (obj != null) {
            if (obj instanceof a.b) {
                aVar.cancel(((a.b) obj).f14413a);
            }
        } else if (aVar.isDone()) {
            if (a.f14407x.b(this, null, a.e(aVar))) {
                a.b(this);
                return true;
            }
        } else {
            a.f fVar = new a.f(this, aVar);
            if (a.f14407x.b(this, null, fVar)) {
                try {
                    aVar.addListener(fVar, b.s);
                    return true;
                } catch (Throwable th) {
                    try {
                        cVar = new a.c(th);
                    } catch (Throwable unused) {
                        cVar = a.c.f14415b;
                    }
                    a.f14407x.b(this, fVar, cVar);
                    return true;
                }
            }
            obj = this.s;
            if (obj instanceof a.b) {
            }
        }
        return false;
    }
}
