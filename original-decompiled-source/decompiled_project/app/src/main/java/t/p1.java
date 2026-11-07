package t;

/* loaded from: classes.dex */
public final class p1 extends kotlin.jvm.internal.s implements eh.l<q2.d0, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f25314a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jh.d f25315b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f25316c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(float f10, int i10, jh.d dVar) {
        super(1);
        this.f25314a = f10;
        this.f25315b = dVar;
        this.f25316c = i10;
    }

    @Override // eh.l
    public final pg.f0 invoke(q2.d0 d0Var) {
        Float fValueOf = Float.valueOf(this.f25314a);
        jh.d dVar = this.f25315b;
        q2.h hVar = new q2.h(((Number) jh.j.o(fValueOf, dVar)).floatValue(), this.f25316c, dVar);
        kh.i<Object>[] iVarArr = q2.a0.f21754a;
        q2.c0<q2.h> c0Var = q2.w.f21822c;
        kh.i<Object> iVar = q2.a0.f21754a[1];
        c0Var.getClass();
        d0Var.c(c0Var, hVar);
        return pg.f0.f21461a;
    }
}
