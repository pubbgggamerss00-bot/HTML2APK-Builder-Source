package b9;

import java.util.Iterator;
import p5.x;

/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3957a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3958b;

    public /* synthetic */ o0(Object obj, int i10) {
        this.f3957a = i10;
        this.f3958b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        int i10;
        switch (this.f3957a) {
            case 0:
                ((x0.n1) this.f3958b).setValue(Boolean.TRUE);
                return pg.f0.f21461a;
            default:
                p5.x xVar = (p5.x) this.f3958b;
                x.c cVar = xVar.f21308f;
                boolean z10 = false;
                if (xVar.f21309g) {
                    qg.l<p5.s> lVar = xVar.f21304b.f24484f;
                    if (lVar == null || !lVar.isEmpty()) {
                        Iterator<p5.s> it = lVar.iterator();
                        i10 = 0;
                        while (it.hasNext()) {
                            if (!(it.next().f21269b instanceof p5.o0) && (i10 = i10 + 1) < 0) {
                                qg.p.n();
                                throw null;
                            }
                        }
                    } else {
                        i10 = 0;
                    }
                    if (i10 > 1) {
                        z10 = true;
                    }
                }
                cVar.f(z10);
                return pg.f0.f21461a;
        }
    }
}
