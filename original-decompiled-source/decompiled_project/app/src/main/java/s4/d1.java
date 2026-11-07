package s4;

import ph.v1;

@vg.e(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {121, 121}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class d1 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public f0 f24214a;

    /* renamed from: b, reason: collision with root package name */
    public int f24215b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e1<Object> f24216c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(e1<Object> e1Var, tg.e<? super d1> eVar) {
        super(2, eVar);
        this.f24216c = e1Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new d1(this.f24216c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((d1) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        if (r1.invoke(r7, r6) != r0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045 A[PHI: r1 r7
      0x0045: PHI (r1v1 s4.f0) = (r1v2 s4.f0), (r1v3 s4.f0) binds: [B:13:0x0042, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]
      0x0045: PHI (r7v5 java.lang.Object) = (r7v10 java.lang.Object), (r7v0 java.lang.Object) binds: [B:13:0x0042, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004e -> B:18:0x0051). Please report as a decompilation issue!!! */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        f0 f0Var;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f24215b;
        e1<Object> e1Var = this.f24216c;
        if (i10 == 0) {
            pg.q.b(obj);
            if (e1Var.f24221d.f24194a.get() <= 0) {
                throw new IllegalStateException("Check failed.");
            }
            v1.e(e1Var.f24218a.getCoroutineContext());
            f0Var = e1Var.f24219b;
            rh.c cVar = e1Var.f24220c;
            this.f24214a = f0Var;
            this.f24215b = 1;
            obj = cVar.b(this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            if (e1Var.f24221d.f24194a.decrementAndGet() == 0) {
                return pg.f0.f21461a;
            }
            v1.e(e1Var.f24218a.getCoroutineContext());
            f0Var = e1Var.f24219b;
            rh.c cVar2 = e1Var.f24220c;
            this.f24214a = f0Var;
            this.f24215b = 1;
            obj = cVar2.b(this);
            if (obj != aVar) {
                this.f24214a = null;
                this.f24215b = 2;
            }
            return aVar;
        }
        f0Var = this.f24214a;
        pg.q.b(obj);
        this.f24214a = null;
        this.f24215b = 2;
    }
}
