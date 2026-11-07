package s0;

import pg.f0;
import ph.i0;
import x.o;

@vg.e(c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1$1", f = "Ripple.kt", l = {207}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class g extends vg.i implements eh.p<i0, tg.e<? super f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f24108a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24109b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x.l f24110c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f24111d;

    public static final class a<T> implements sh.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p f24112a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i0 f24113b;

        public a(p pVar, i0 i0Var) {
            this.f24112a = pVar;
            this.f24113b = i0Var;
        }

        @Override // sh.g
        public final Object c(Object obj, tg.e eVar) {
            x.k kVar = (x.k) obj;
            boolean z10 = kVar instanceof o.b;
            p pVar = this.f24112a;
            if (z10) {
                pVar.e((o.b) kVar);
            } else if ((kVar instanceof o.c) || (kVar instanceof o.a)) {
                pVar.f();
            } else {
                pVar.f24136b.b(kVar, this.f24113b);
            }
            return f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(x.l lVar, p pVar, tg.e<? super g> eVar) {
        super(2, eVar);
        this.f24110c = lVar;
        this.f24111d = pVar;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        g gVar = new g(this.f24110c, this.f24111d, eVar);
        gVar.f24109b = obj;
        return gVar;
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
        return ((g) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f24108a;
        if (i10 == 0) {
            pg.q.b(obj);
            i0 i0Var = (i0) this.f24109b;
            sh.f<x.k> fVarB = this.f24110c.b();
            a aVar2 = new a(this.f24111d, i0Var);
            this.f24108a = 1;
            if (fVarB.b(aVar2, this) == aVar) {
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
