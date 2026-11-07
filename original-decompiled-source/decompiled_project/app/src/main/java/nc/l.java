package nc;

import java.util.Iterator;
import nc.j0;

/* loaded from: classes2.dex */
public final class l extends k<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f18718b;

    public l(c0 c0Var) {
        this.f18718b = c0Var;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        g0 g0Var = new g0(this.f18718b.iterator(), new a0());
        j0.b bVar = new j0.b();
        bVar.f18698b = j0.a.f18695d;
        bVar.f18699c = g0Var;
        return bVar;
    }
}
