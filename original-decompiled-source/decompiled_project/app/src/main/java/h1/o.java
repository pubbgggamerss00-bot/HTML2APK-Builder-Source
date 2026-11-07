package h1;

import m0.r1;

/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.s implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12176a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12177b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(eh.l lVar) {
        super(1);
        this.f12177b = (kotlin.jvm.internal.s) lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [eh.l, kotlin.jvm.internal.s] */
    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f12176a) {
            case 0:
                h hVar = (h) ((kotlin.jvm.internal.s) this.f12177b).invoke((l) obj);
                synchronized (n.f12160c) {
                    n.f12161d = n.f12161d.i(hVar.g());
                    pg.f0 f0Var = pg.f0.f21461a;
                }
                return hVar;
            default:
                g2.v vVar = (g2.v) obj;
                r1 r1Var = (r1) this.f12177b;
                r1Var.f17479k = vVar;
                if (((Boolean) r1Var.f17477i.getValue()).booleanValue() && r1Var.e() != null) {
                    p1.c cVar = vVar != null ? new p1.c(vVar.B(0L)) : null;
                    if (!kotlin.jvm.internal.r.a(r1Var.f17478j, cVar)) {
                        r1Var.f17478j = cVar;
                        r1Var.o();
                        r1Var.q();
                    }
                }
                return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r1 r1Var) {
        super(1);
        this.f12177b = r1Var;
    }
}
