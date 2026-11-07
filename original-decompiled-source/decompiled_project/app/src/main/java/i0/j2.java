package i0;

import x.o;

/* loaded from: classes.dex */
public final class j2<T> implements sh.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p.h0<x.k> f13378a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k2 f13379b;

    public j2(p.h0<x.k> h0Var, k2 k2Var) {
        this.f13378a = h0Var;
        this.f13379b = k2Var;
    }

    @Override // sh.g
    public final Object c(Object obj, tg.e eVar) {
        x.k kVar = (x.k) obj;
        boolean z10 = kVar instanceof x.i ? true : kVar instanceof x.e ? true : kVar instanceof o.b;
        p.h0<x.k> h0Var = this.f13378a;
        if (z10) {
            h0Var.g(kVar);
        } else if (kVar instanceof x.j) {
            h0Var.j(((x.j) kVar).f31596a);
        } else if (kVar instanceof x.f) {
            h0Var.j(((x.f) kVar).f31590a);
        } else if (kVar instanceof o.c) {
            h0Var.j(((o.c) kVar).f31600a);
        } else if (kVar instanceof o.a) {
            h0Var.j(((o.a) kVar).f31598a);
        }
        Object[] objArr = h0Var.f20706a;
        int i10 = h0Var.f20707b;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            k2 k2Var = this.f13379b;
            if (i11 >= i10) {
                k2Var.f13386b.f(i12);
                return pg.f0.f21461a;
            }
            x.k kVar2 = (x.k) objArr[i11];
            if (kVar2 instanceof x.i) {
                k2Var.getClass();
                i12 |= 2;
            } else if (kVar2 instanceof x.e) {
                k2Var.getClass();
                i12 |= 1;
            } else if (kVar2 instanceof o.b) {
                k2Var.getClass();
                i12 |= 4;
            }
            i11++;
        }
    }
}
