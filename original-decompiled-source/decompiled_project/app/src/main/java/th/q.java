package th;

import org.bouncycastle.asn1.eac.EACTags;
import pg.f0;
import ph.i0;

@vg.e(c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", f = "FlowCoroutine.kt", l = {EACTags.PIN_USAGE_POLICY}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class q extends vg.i implements eh.p<i0, tg.e<? super f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f28842a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f28843b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sh.k f28844c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sh.g<Object> f28845d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(sh.k kVar, sh.g gVar, tg.e eVar) {
        super(2, eVar);
        this.f28844c = kVar;
        this.f28845d = gVar;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        q qVar = new q(this.f28844c, this.f28845d, eVar);
        qVar.f28843b = obj;
        return qVar;
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
        return ((q) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f28842a;
        if (i10 == 0) {
            pg.q.b(obj);
            i0 i0Var = (i0) this.f28843b;
            this.f28842a = 1;
            if (this.f28844c.b(i0Var, this.f28845d, this) == aVar) {
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
