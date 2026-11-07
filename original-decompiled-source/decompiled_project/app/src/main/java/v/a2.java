package v;

@vg.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$launchAwaitingReset$1", f = "TapGestureDetector.kt", l = {502, 504}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class a2 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f29774a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f29775b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ph.s1 f29776c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg.i f29777d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a2(ph.s1 s1Var, eh.p<? super ph.i0, ? super tg.e<? super pg.f0>, ? extends Object> pVar, tg.e<? super a2> eVar) {
        super(2, eVar);
        this.f29776c = s1Var;
        this.f29777d = (vg.i) pVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [eh.p, vg.i] */
    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        a2 a2Var = new a2(this.f29776c, this.f29777d, eVar);
        a2Var.f29775b = obj;
        return a2Var;
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((a2) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r4.f29777d.invoke(r1, r4) == r0) goto L15;
     */
    /* JADX WARN: Type inference failed for: r5v5, types: [eh.p, vg.i] */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ph.i0 i0Var;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f29774a;
        if (i10 == 0) {
            pg.q.b(obj);
            i0Var = (ph.i0) this.f29775b;
            this.f29775b = i0Var;
            this.f29774a = 1;
            if (this.f29776c.join(this) != aVar) {
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
        i0Var = (ph.i0) this.f29775b;
        pg.q.b(obj);
        this.f29775b = null;
        this.f29774a = 2;
    }
}
