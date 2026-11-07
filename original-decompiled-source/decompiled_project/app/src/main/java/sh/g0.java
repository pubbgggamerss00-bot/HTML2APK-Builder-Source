package sh;

@vg.e(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", l = {29, 29}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class g0 extends vg.i implements eh.q<g<Object>, Object[], tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f24981a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ g f24982b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f24983c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg.i f24984d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g0(eh.q<Object, Object, ? super tg.e<Object>, ? extends Object> qVar, tg.e<? super g0> eVar) {
        super(3, eVar);
        this.f24984d = (vg.i) qVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [eh.q, vg.i] */
    @Override // eh.q
    public final Object b(g<Object> gVar, Object[] objArr, tg.e<? super pg.f0> eVar) {
        g0 g0Var = new g0(this.f24984d, eVar);
        g0Var.f24982b = gVar;
        g0Var.f24983c = objArr;
        return g0Var.invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r1.c(r6, r5) == r0) goto L15;
     */
    /* JADX WARN: Type inference failed for: r3v1, types: [eh.q, vg.i] */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        g gVar;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f24981a;
        if (i10 == 0) {
            pg.q.b(obj);
            gVar = this.f24982b;
            Object[] objArr = this.f24983c;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            this.f24982b = gVar;
            this.f24981a = 1;
            obj = this.f24984d.b(obj2, obj3, this);
            if (obj != aVar) {
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
        gVar = this.f24982b;
        pg.q.b(obj);
        this.f24982b = null;
        this.f24981a = 2;
    }
}
