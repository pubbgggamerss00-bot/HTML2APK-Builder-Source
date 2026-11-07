package sh;

@vg.e(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", l = {213, 213}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class v extends vg.i implements eh.q<g<Object>, Object, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f25109a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ g f25110b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f25111c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg.i f25112d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v(eh.p<Object, ? super tg.e<Object>, ? extends Object> pVar, tg.e<? super v> eVar) {
        super(3, eVar);
        this.f25112d = (vg.i) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [eh.p, vg.i] */
    @Override // eh.q
    public final Object b(g<Object> gVar, Object obj, tg.e<? super pg.f0> eVar) {
        v vVar = new v(this.f25112d, eVar);
        vVar.f25110b = gVar;
        vVar.f25111c = obj;
        return vVar.invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r1.c(r5, r4) == r0) goto L15;
     */
    /* JADX WARN: Type inference failed for: r3v1, types: [eh.p, vg.i] */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        g gVar;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f25109a;
        if (i10 == 0) {
            pg.q.b(obj);
            gVar = this.f25110b;
            Object obj2 = this.f25111c;
            this.f25110b = gVar;
            this.f25109a = 1;
            obj = this.f25112d.invoke(obj2, this);
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
        gVar = this.f25110b;
        pg.q.b(obj);
        this.f25110b = null;
        this.f25109a = 2;
    }
}
