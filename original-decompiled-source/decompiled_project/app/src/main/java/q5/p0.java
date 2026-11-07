package q5;

import java.util.Iterator;
import java.util.List;
import x0.r3;

/* loaded from: classes.dex */
public final class p0 implements x0.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r3 f22033a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f22034b;

    public p0(r3 r3Var, e eVar) {
        this.f22033a = r3Var;
        this.f22034b = eVar;
    }

    @Override // x0.k0
    public final void a() {
        Iterator it = ((List) this.f22033a.getValue()).iterator();
        while (it.hasNext()) {
            this.f22034b.b().f((p5.s) it.next());
        }
    }
}
