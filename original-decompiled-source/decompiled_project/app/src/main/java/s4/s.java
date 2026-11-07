package s4;

@vg.e(c = "androidx.datastore.core.DataStoreImpl$incrementCollector$2$1", f = "DataStoreImpl.kt", l = {134, 135}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class s extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f24390a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m<Object> f24391b;

    public static final class a<T> implements sh.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m<T> f24392a;

        public a(m<T> mVar) {
            this.f24392a = mVar;
        }

        @Override // sh.g
        public final Object c(Object obj, tg.e eVar) {
            Object objE;
            m<T> mVar = this.f24392a;
            return ((mVar.f24311h.a() instanceof t0) || (objE = m.e(mVar, true, eVar)) != ug.a.f29706a) ? pg.f0.f21461a : objE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(m<Object> mVar, tg.e<? super s> eVar) {
        super(2, eVar);
        this.f24391b = mVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new s(this.f24391b, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((s) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        if (r6.b(r1, r5) == r0) goto L18;
     */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f24390a;
        m<Object> mVar = this.f24391b;
        if (i10 == 0) {
            pg.q.b(obj);
            m<Object>.a aVar2 = mVar.f24312i;
            this.f24390a = 1;
            Object objK = aVar2.f24198b.k(this);
            if (objK != aVar) {
                objK = pg.f0.f21461a;
            }
            if (objK != aVar) {
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
        sh.f fVarB = gg.a.b(mVar.g().d(), -1);
        a aVar3 = new a(mVar);
        this.f24390a = 2;
    }
}
