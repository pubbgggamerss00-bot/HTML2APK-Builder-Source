package s4;

import s4.w0;

@vg.e(c = "androidx.datastore.core.DataStoreImpl$writeActor$3", f = "DataStoreImpl.kt", l = {207}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class f0 extends vg.i implements eh.p<w0.a<Object>, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f24225a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24226b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m<Object> f24227c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(m<Object> mVar, tg.e<? super f0> eVar) {
        super(2, eVar);
        this.f24227c = mVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        f0 f0Var = new f0(this.f24227c, eVar);
        f0Var.f24226b = obj;
        return f0Var;
    }

    @Override // eh.p
    public final Object invoke(w0.a<Object> aVar, tg.e<? super pg.f0> eVar) {
        return ((f0) create(aVar, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f24225a;
        if (i10 == 0) {
            pg.q.b(obj);
            w0.a aVar2 = (w0.a) this.f24226b;
            this.f24225a = 1;
            if (m.c(this.f24227c, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        return pg.f0.f21461a;
    }
}
