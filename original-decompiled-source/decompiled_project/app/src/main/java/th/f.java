package th;

import pg.f0;

@vg.e(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class f extends vg.i implements eh.p<rh.u<Object>, tg.e<? super f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f28787a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f28788b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g<Object> f28789c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g<Object> gVar, tg.e<? super f> eVar) {
        super(2, eVar);
        this.f28789c = gVar;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        f fVar = new f(this.f28789c, eVar);
        fVar.f28788b = obj;
        return fVar;
    }

    @Override // eh.p
    public final Object invoke(rh.u<Object> uVar, tg.e<? super f0> eVar) {
        return ((f) create(uVar, eVar)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f28787a;
        if (i10 == 0) {
            pg.q.b(obj);
            rh.u<? super Object> uVar = (rh.u) this.f28788b;
            this.f28787a = 1;
            if (this.f28789c.e(uVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        return f0.f21461a;
    }
}
