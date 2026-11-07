package t;

@vg.e(c = "androidx.compose.foundation.ClickableNode$clickPointerInput$2", f = "Clickable.kt", l = {696}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class z extends vg.i implements eh.q<v.u0, p1.c, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f25409a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ v.u0 f25410b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ long f25411c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0 f25412d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(b0 b0Var, tg.e<? super z> eVar) {
        super(3, eVar);
        this.f25412d = b0Var;
    }

    @Override // eh.q
    public final Object b(v.u0 u0Var, p1.c cVar, tg.e<? super pg.f0> eVar) {
        long j10 = cVar.f21129a;
        z zVar = new z(this.f25412d, eVar);
        zVar.f25410b = u0Var;
        zVar.f25411c = j10;
        return zVar.invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        Object objC;
        Object obj2 = ug.a.f29706a;
        int i10 = this.f25409a;
        if (i10 == 0) {
            pg.q.b(obj);
            v.u0 u0Var = this.f25410b;
            long j10 = this.f25411c;
            b0 b0Var = this.f25412d;
            if (b0Var.f25146x) {
                this.f25409a = 1;
                x.m mVar = b0Var.f25142s;
                if (mVar == null || (objC = ph.j0.c(new d(u0Var, j10, mVar, b0Var, null), this)) != obj2) {
                    objC = pg.f0.f21461a;
                }
                if (objC == obj2) {
                    return obj2;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        return pg.f0.f21461a;
    }
}
