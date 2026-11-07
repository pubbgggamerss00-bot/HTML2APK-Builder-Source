package s4;

@vg.e(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2", f = "DataStoreImpl.kt", l = {330, 331, 337}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class c0 extends vg.i implements eh.l<tg.e<Object>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public Object f24200a;

    /* renamed from: b, reason: collision with root package name */
    public int f24201b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m<Object> f24202c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tg.h f24203d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vg.i f24204e;

    @vg.e(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1", f = "DataStoreImpl.kt", l = {331}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<Object>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f24205a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ vg.i f24206b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d<Object> f24207c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(eh.p<Object, ? super tg.e<Object>, ? extends Object> pVar, d<Object> dVar, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f24206b = (vg.i) pVar;
            this.f24207c = dVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [eh.p, vg.i] */
        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f24206b, this.f24207c, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<Object> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [eh.p, vg.i] */
        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f24205a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                return obj;
            }
            pg.q.b(obj);
            Object obj2 = this.f24207c.f24211b;
            this.f24205a = 1;
            Object objInvoke = this.f24206b.invoke(obj2, this);
            return objInvoke == aVar ? aVar : objInvoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c0(m<Object> mVar, tg.h hVar, eh.p<Object, ? super tg.e<Object>, ? extends Object> pVar, tg.e<? super c0> eVar) {
        super(1, eVar);
        this.f24202c = mVar;
        this.f24203d = hVar;
        this.f24204e = (vg.i) pVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [eh.p, vg.i] */
    @Override // vg.a
    public final tg.e<pg.f0> create(tg.e<?> eVar) {
        return new c0(this.f24202c, this.f24203d, this.f24204e, eVar);
    }

    @Override // eh.l
    public final Object invoke(tg.e<Object> eVar) {
        return ((c0) create(eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Type inference failed for: r6v0, types: [eh.p, vg.i] */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        d dVar;
        T t3;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f24201b;
        m<Object> mVar = this.f24202c;
        if (i10 == 0) {
            pg.q.b(obj);
            this.f24201b = 1;
            obj = m.f(mVar, true, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj2 = this.f24200a;
                pg.q.b(obj);
                return obj2;
            }
            dVar = (d) this.f24200a;
            pg.q.b(obj);
            t3 = dVar.f24211b;
            if ((t3 == 0 ? t3.hashCode() : 0) == dVar.f24212c) {
                throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
            }
            if (!kotlin.jvm.internal.r.a(dVar.f24211b, obj)) {
                this.f24200a = obj;
                this.f24201b = 3;
                if (mVar.j(obj, true, this) == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
        pg.q.b(obj);
        dVar = (d) obj;
        a aVar2 = new a(this.f24204e, dVar, null);
        this.f24200a = dVar;
        this.f24201b = 2;
        obj = ph.h.e(this.f24203d, aVar2, this);
        if (obj != aVar) {
            t3 = dVar.f24211b;
            if ((t3 == 0 ? t3.hashCode() : 0) == dVar.f24212c) {
            }
        }
        return aVar;
    }
}
