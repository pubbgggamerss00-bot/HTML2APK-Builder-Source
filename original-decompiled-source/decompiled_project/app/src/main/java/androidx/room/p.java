package androidx.room;

@vg.e(c = "androidx.room.InvalidationTracker$syncBlocking$1", f = "InvalidationTracker.android.kt", l = {155}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class p extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f3041a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f3042b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(m mVar, tg.e<? super p> eVar) {
        super(2, eVar);
        this.f3042b = mVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new p(this.f3042b, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((p) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f3041a;
        if (i10 == 0) {
            pg.q.b(obj);
            this.f3041a = 1;
            if (this.f3042b.a(this) == aVar) {
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
