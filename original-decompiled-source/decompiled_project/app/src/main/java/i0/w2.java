package i0;

import t2.b;

/* loaded from: classes.dex */
public final class w2 extends kotlin.jvm.internal.s implements eh.l<b.c<? extends b.a>, b.c<? extends b.a>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.b0 f13656a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b.c<t2.i> f13657b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t2.b0 f13658c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(kotlin.jvm.internal.b0 b0Var, b.c<t2.i> cVar, t2.b0 b0Var2) {
        super(1);
        this.f13656a = b0Var;
        this.f13657b = cVar;
        this.f13658c = b0Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    @Override // eh.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b.c<? extends b.a> invoke(b.c<? extends b.a> cVar) {
        b.c<? extends b.a> cVar2;
        b.c<? extends b.a> cVar3 = cVar;
        kotlin.jvm.internal.b0 b0Var = this.f13656a;
        boolean z10 = b0Var.f16318a;
        b.c<t2.i> cVar4 = this.f13657b;
        if (z10) {
            T t3 = cVar3.f27771a;
            int i10 = cVar3.f27773c;
            int i11 = cVar3.f27772b;
            if ((t3 instanceof t2.b0) && i11 == cVar4.f27772b && i10 == cVar4.f27773c) {
                t2.b0 b0Var2 = this.f13658c;
                if (b0Var2 == null) {
                    b0Var2 = new t2.b0(0L, 0L, (x2.p) null, (x2.n) null, (x2.o) null, (x2.f) null, (String) null, 0L, (e3.a) null, (e3.m) null, (a3.c) null, 0L, (e3.i) null, (q1.e2) null, 65535);
                }
                cVar2 = new b.c<>(b0Var2, i11, i10);
            } else {
                cVar2 = cVar3;
            }
        }
        b0Var.f16318a = cVar4.equals(cVar3);
        return cVar2;
    }
}
