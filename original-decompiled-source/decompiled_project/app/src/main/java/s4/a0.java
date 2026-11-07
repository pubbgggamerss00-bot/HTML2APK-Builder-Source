package s4;

@vg.e(c = "androidx.datastore.core.DataStoreImpl$readState$2", f = "DataStoreImpl.kt", l = {218, 226}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class a0 extends vg.i implements eh.p<ph.i0, tg.e<? super i1<Object>>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f24195a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m<Object> f24196b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(m mVar, tg.e eVar) {
        super(2, eVar);
        this.f24196b = mVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new a0(this.f24196b, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super i1<Object>> eVar) {
        return ((a0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if (r7 == r2) goto L22;
     */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        m<Object> mVar = this.f24196b;
        i0<Object> i0Var = mVar.f24311h;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f24195a;
        try {
            if (i10 == 0) {
                pg.q.b(obj);
                if (i0Var.a() instanceof t0) {
                    return i0Var.a();
                }
                this.f24195a = 1;
                if (mVar.h(this) != aVar) {
                }
                return aVar;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                return (i1) obj;
            }
            pg.q.b(obj);
            this.f24195a = 2;
            obj = m.e(mVar, false, this);
        } catch (Throwable th2) {
            return new x0(-1, th2);
        }
    }
}
