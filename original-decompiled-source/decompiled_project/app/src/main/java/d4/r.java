package d4;

/* loaded from: classes.dex */
public final class r implements t<y0, e4.o> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ph.m f7357a;

    public r(ph.m mVar) {
        this.f7357a = mVar;
    }

    @Override // d4.t
    public final void a(e4.o oVar) {
        e4.o e10 = oVar;
        kotlin.jvm.internal.r.e(e10, "e");
        ph.m mVar = this.f7357a;
        if (mVar.u()) {
            mVar.resumeWith(pg.q.a(e10));
        }
    }

    @Override // d4.t
    public final void onResult(y0 y0Var) {
        y0 result = y0Var;
        kotlin.jvm.internal.r.e(result, "result");
        ph.m mVar = this.f7357a;
        if (mVar.u()) {
            mVar.resumeWith(result);
        }
    }
}
