package s4;

@vg.e(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4", f = "DataStoreImpl.kt", l = {306, 309}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class w extends vg.i implements eh.p<Boolean, tg.e<? super pg.n<? extends i1<Object>, ? extends Boolean>>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public Throwable f24408a;

    /* renamed from: b, reason: collision with root package name */
    public int f24409b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ boolean f24410c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m<Object> f24411d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f24412e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(m<Object> mVar, int i10, tg.e<? super w> eVar) {
        super(2, eVar);
        this.f24411d = mVar;
        this.f24412e = i10;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        w wVar = new w(this.f24411d, this.f24412e, eVar);
        wVar.f24410c = ((Boolean) obj).booleanValue();
        return wVar;
    }

    @Override // eh.p
    public final Object invoke(Boolean bool, tg.e<? super pg.n<? extends i1<Object>, ? extends Boolean>> eVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((w) create(bool2, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        Throwable th2;
        int iIntValue;
        boolean z10;
        i1 i1Var;
        boolean z11;
        ug.a aVar = ug.a.f29706a;
        boolean z12 = this.f24409b;
        m<Object> mVar = this.f24411d;
        try {
        } catch (Throwable th3) {
            if (z12 != 0) {
                v0 v0VarG = mVar.g();
                this.f24408a = th3;
                this.f24410c = z12;
                this.f24409b = 2;
                Integer version = v0VarG.getVersion();
                if (version != aVar) {
                    z10 = z12;
                    th2 = th3;
                    obj = version;
                }
            } else {
                boolean z13 = z12;
                th2 = th3;
                iIntValue = this.f24412e;
                z10 = z13;
            }
        }
        if (z12 == 0) {
            pg.q.b(obj);
            boolean z14 = this.f24410c;
            this.f24410c = z14;
            this.f24409b = 1;
            obj = m.f(mVar, z14, this);
            z12 = z14;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (z12 != 1) {
                if (z12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z10 = this.f24410c;
                th2 = this.f24408a;
                pg.q.b(obj);
                iIntValue = ((Number) obj).intValue();
                x0 x0Var = new x0(iIntValue, th2);
                z11 = z10;
                i1Var = x0Var;
                return new pg.n(i1Var, Boolean.valueOf(z11));
            }
            boolean z15 = this.f24410c;
            pg.q.b(obj);
            z12 = z15;
        }
        i1Var = (i1) obj;
        z11 = z12;
        return new pg.n(i1Var, Boolean.valueOf(z11));
    }
}
