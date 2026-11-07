package a9;

/* loaded from: classes.dex */
public final /* synthetic */ class z1 implements eh.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b2 f388a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t1 f389b;

    public /* synthetic */ z1(b2 b2Var, t1 t1Var) {
        this.f388a = b2Var;
        this.f389b = t1Var;
    }

    @Override // eh.p
    public final Object invoke(Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        String msg = (String) obj2;
        kotlin.jvm.internal.r.e(msg, "msg");
        l5.a aVarA = androidx.lifecycle.x0.a(this.f388a);
        wh.c cVar = ph.z0.f21632a;
        ph.h.c(aVarA, uh.o.f29764a, null, new a2(this.f389b, zBooleanValue, msg, null), 2);
        return pg.f0.f21461a;
    }
}
