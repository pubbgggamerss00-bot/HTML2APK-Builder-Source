package x8;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel$onRatingDismissed$1", f = "HomeViewModel.kt", l = {283, 284}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class k7 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f32877a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j6 f32878b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(j6 j6Var, tg.e<? super k7> eVar) {
        super(2, eVar);
        this.f32878b = j6Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new k7(this.f32878b, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((k7) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        if (r6 == r1) goto L18;
     */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        n8.m1 m1Var = this.f32878b.f32777d;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f32877a;
        if (i10 == 0) {
            pg.q.b(obj);
            n8.i1 i1Var = m1Var.f18532h;
            this.f32877a = 1;
            obj = gg.a.f(i1Var, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            return pg.f0.f21461a;
        }
        pg.q.b(obj);
        int iIntValue = ((Number) obj).intValue();
        this.f32877a = 2;
        Object objA = v4.g.a(m1Var.f18526b, new n8.y(iIntValue, null), this);
        if (objA != aVar) {
            objA = pg.f0.f21461a;
        }
    }
}
