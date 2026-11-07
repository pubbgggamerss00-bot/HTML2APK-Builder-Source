package s4;

@vg.e(c = "androidx.datastore.core.DataStoreImpl$writeData$2", f = "DataStoreImpl.kt", l = {352, 353}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class h0 extends vg.i implements eh.p<p1<Object>, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.e0 f24255a;

    /* renamed from: b, reason: collision with root package name */
    public int f24256b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f24257c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f24258d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m<Object> f24259e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f24260f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f24261g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(kotlin.jvm.internal.e0 e0Var, m<Object> mVar, Object obj, boolean z10, tg.e<? super h0> eVar) {
        super(2, eVar);
        this.f24258d = e0Var;
        this.f24259e = mVar;
        this.f24260f = obj;
        this.f24261g = z10;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        h0 h0Var = new h0(this.f24258d, this.f24259e, this.f24260f, this.f24261g, eVar);
        h0Var.f24257c = obj;
        return h0Var;
    }

    @Override // eh.p
    public final Object invoke(p1<Object> p1Var, tg.e<? super pg.f0> eVar) {
        return ((h0) create(p1Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        if (r6.c(r2, r7) == r0) goto L16;
     */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        p1 p1Var;
        kotlin.jvm.internal.e0 e0Var;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f24256b;
        Object obj2 = this.f24260f;
        m<Object> mVar = this.f24259e;
        kotlin.jvm.internal.e0 e0Var2 = this.f24258d;
        if (i10 == 0) {
            pg.q.b(obj);
            p1 p1Var2 = (p1) this.f24257c;
            v0 v0VarG = mVar.g();
            this.f24257c = p1Var2;
            this.f24255a = e0Var2;
            this.f24256b = 1;
            Integer numC = v0VarG.c();
            if (numC != aVar) {
                p1Var = p1Var2;
                obj = numC;
                e0Var = e0Var2;
            }
            return aVar;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            if (this.f24261g) {
                mVar.f24311h.b(new d(obj2, obj2 != null ? obj2.hashCode() : 0, e0Var2.f16324a));
            }
            return pg.f0.f21461a;
        }
        e0Var = this.f24255a;
        p1Var = (p1) this.f24257c;
        pg.q.b(obj);
        e0Var.f16324a = ((Number) obj).intValue();
        this.f24257c = null;
        this.f24255a = null;
        this.f24256b = 2;
    }
}
