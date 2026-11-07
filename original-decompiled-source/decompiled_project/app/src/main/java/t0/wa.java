package t0;

@vg.e(c = "androidx.compose.material3.SelectableChipElevation$animateElevation$2$1", f = "Chip.kt", l = {2380, 2382}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class wa extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f27294a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s.b<f3.h, s.o> f27295b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f27296c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f27297d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x.k f27298e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0.n1<x.k> f27299f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa(s.b<f3.h, s.o> bVar, float f10, boolean z10, x.k kVar, x0.n1<x.k> n1Var, tg.e<? super wa> eVar) {
        super(2, eVar);
        this.f27295b = bVar;
        this.f27296c = f10;
        this.f27297d = z10;
        this.f27298e = kVar;
        this.f27299f = n1Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new wa(this.f27295b, this.f27296c, this.f27297d, this.f27298e, this.f27299f, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((wa) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (r8.f(r1, r7) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (u0.g0.a(r8, r6, r1, r2, r7) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f27294a;
        x.k kVar = this.f27298e;
        x0.n1<x.k> n1Var = this.f27299f;
        if (i10 == 0) {
            pg.q.b(obj);
            s.b<f3.h, s.o> bVar = this.f27295b;
            float f10 = ((f3.h) bVar.f23656e.getValue()).f8817a;
            float f11 = this.f27296c;
            if (!f3.h.a(f10, f11)) {
                if (this.f27297d) {
                    x.k value = n1Var.getValue();
                    this.f27294a = 2;
                } else {
                    f3.h hVar = new f3.h(f11);
                    this.f27294a = 1;
                }
            }
            return pg.f0.f21461a;
        }
        if (i10 != 1 && i10 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pg.q.b(obj);
        n1Var.setValue(kVar);
        return pg.f0.f21461a;
    }
}
