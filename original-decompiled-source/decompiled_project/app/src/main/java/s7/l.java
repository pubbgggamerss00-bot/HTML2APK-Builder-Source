package s7;

import pg.f0;

@vg.e(c = "coil3.network.NetworkFetcher$executeNetworkRequest$2", f = "NetworkFetcher.kt", l = {205}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class l extends vg.i implements eh.p<r, tg.e<Object>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f24563a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24564b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vg.i f24565c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(eh.p<? super r, ? super tg.e<Object>, ? extends Object> pVar, tg.e<? super l> eVar) {
        super(2, eVar);
        this.f24565c = (vg.i) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [eh.p, vg.i] */
    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        l lVar = new l(this.f24565c, eVar);
        lVar.f24564b = obj;
        return lVar;
    }

    @Override // eh.p
    public final Object invoke(r rVar, tg.e<Object> eVar) {
        return ((l) create(rVar, eVar)).invokeSuspend(f0.f21461a);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [eh.p, vg.i] */
    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f24563a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            return obj;
        }
        pg.q.b(obj);
        r rVar = (r) this.f24564b;
        int i11 = rVar.f24585a;
        if ((200 > i11 || i11 >= 300) && i11 != 304) {
            throw new g("HTTP " + rVar.f24585a);
        }
        this.f24563a = 1;
        Object objInvoke = this.f24565c.invoke(rVar, this);
        return objInvoke == aVar ? aVar : objInvoke;
    }
}
