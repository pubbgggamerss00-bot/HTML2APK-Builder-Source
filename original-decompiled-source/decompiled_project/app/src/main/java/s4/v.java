package s4;

@vg.e(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3", f = "DataStoreImpl.kt", l = {298, 300}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class v extends vg.i implements eh.l<tg.e<? super pg.n<? extends i1<Object>, ? extends Boolean>>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public Throwable f24405a;

    /* renamed from: b, reason: collision with root package name */
    public int f24406b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m<Object> f24407c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(m<Object> mVar, tg.e<? super v> eVar) {
        super(1, eVar);
        this.f24407c = mVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(tg.e<?> eVar) {
        return new v(this.f24407c, eVar);
    }

    @Override // eh.l
    public final Object invoke(tg.e<? super pg.n<? extends i1<Object>, ? extends Boolean>> eVar) {
        return ((v) create(eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        Throwable th2;
        i1 x0Var;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f24406b;
        m<Object> mVar = this.f24407c;
        try {
        } catch (Throwable th3) {
            v0 v0VarG = mVar.g();
            this.f24405a = th3;
            this.f24406b = 2;
            Integer version = v0VarG.getVersion();
            if (version != aVar) {
                th2 = th3;
                obj = version;
            }
        }
        if (i10 == 0) {
            pg.q.b(obj);
            this.f24406b = 1;
            obj = m.f(mVar, true, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th2 = this.f24405a;
                pg.q.b(obj);
                x0Var = new x0(((Number) obj).intValue(), th2);
                return new pg.n(x0Var, Boolean.TRUE);
            }
            pg.q.b(obj);
        }
        x0Var = (i1) obj;
        return new pg.n(x0Var, Boolean.TRUE);
    }
}
