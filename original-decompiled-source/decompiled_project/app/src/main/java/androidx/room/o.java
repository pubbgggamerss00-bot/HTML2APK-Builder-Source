package androidx.room;

@vg.e(c = "androidx.room.InvalidationTracker$removeObserver$1", f = "InvalidationTracker.android.kt", l = {310}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class o extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f3036a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f3037b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(m mVar, tg.e<? super o> eVar) {
        super(2, eVar);
        this.f3037b = mVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new o(this.f3037b, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((o) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f3036a;
        if (i10 == 0) {
            pg.q.b(obj);
            a1 a1Var = this.f3037b.f3016c;
            this.f3036a = 1;
            if (a1Var.f(this) == aVar) {
                return aVar;
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
