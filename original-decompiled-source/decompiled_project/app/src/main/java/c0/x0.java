package c0;

import d0.l1;

@vg.e(c = "androidx.compose.foundation.lazy.grid.LazyGridState$animateScrollToItem$2", f = "LazyGridState.kt", l = {492}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class x0 extends vg.i implements eh.p<v.b1, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f4529a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4530b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0 f4531c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4532d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(w0 w0Var, int i10, tg.e eVar) {
        super(2, eVar);
        this.f4531c = w0Var;
        this.f4532d = i10;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        x0 x0Var = new x0(this.f4531c, this.f4532d, eVar);
        x0Var.f4530b = obj;
        return x0Var;
    }

    @Override // eh.p
    public final Object invoke(v.b1 b1Var, tg.e<? super pg.f0> eVar) {
        return ((x0) create(b1Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f4529a;
        if (i10 == 0) {
            pg.q.b(obj);
            v.b1 b1Var = (v.b1) this.f4530b;
            w0 w0Var = this.f4531c;
            r0 r0Var = new r0(b1Var, w0Var);
            g1.n nVar = w0.f4504w;
            int i11 = ((l0) w0Var.f4509e.getValue()).f4422j * 100;
            f3.d dVar = ((l0) w0Var.f4509e.getValue()).f4421i;
            this.f4529a = 1;
            if (l1.b(r0Var, this.f4532d, 0, i11, dVar, this) == aVar) {
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
