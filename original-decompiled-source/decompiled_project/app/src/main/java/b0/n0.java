package b0;

import d0.l1;
import v.b1;

@vg.e(c = "androidx.compose.foundation.lazy.LazyListState$animateScrollToItem$2", f = "LazyListState.kt", l = {481}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class n0 extends vg.i implements eh.p<b1, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f3406a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3407b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m0 f3408c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3409d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3410e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(m0 m0Var, int i10, int i11, tg.e<? super n0> eVar) {
        super(2, eVar);
        this.f3408c = m0Var;
        this.f3409d = i10;
        this.f3410e = i11;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        n0 n0Var = new n0(this.f3408c, this.f3409d, this.f3410e, eVar);
        n0Var.f3407b = obj;
        return n0Var;
    }

    @Override // eh.p
    public final Object invoke(b1 b1Var, tg.e<? super pg.f0> eVar) {
        return ((n0) create(b1Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f3406a;
        if (i10 == 0) {
            pg.q.b(obj);
            b1 b1Var = (b1) this.f3407b;
            m0 m0Var = this.f3408c;
            l0 l0Var = new l0(b1Var, m0Var);
            f3.d dVar = ((f0) m0Var.f3386e.getValue()).f3327i;
            this.f3406a = 1;
            if (l1.b(l0Var, this.f3409d, this.f3410e, 100, dVar, this) == aVar) {
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
