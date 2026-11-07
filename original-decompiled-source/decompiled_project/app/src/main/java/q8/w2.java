package q8;

@vg.e(c = "com.basitce.htmltoapk.ui.components.WalkingPixelCatKt$WalkingPixelCat$1$1$1", f = "WalkingPixelCat.kt", l = {121, 123}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class w2 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f22439a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f22440b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f22441c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.n1<k> f22442d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(boolean z10, x0.n1<k> n1Var, tg.e<? super w2> eVar) {
        super(2, eVar);
        this.f22441c = z10;
        this.f22442d = n1Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        w2 w2Var = new w2(this.f22441c, this.f22442d, eVar);
        w2Var.f22440b = obj;
        return w2Var;
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((w2) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (ph.t0.b(1200, r7) != r0) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x005a -> B:7:0x0015). Please report as a decompilation issue!!! */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ph.i0 i0Var;
        ph.i0 i0Var2;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f22439a;
        x0.n1<k> n1Var = this.f22442d;
        if (i10 == 0) {
            pg.q.b(obj);
            i0Var = (ph.i0) this.f22440b;
            if (this.f22441c) {
                if (ph.j0.d(i0Var)) {
                }
            }
            return pg.f0.f21461a;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i0Var2 = (ph.i0) this.f22440b;
            pg.q.b(obj);
            i0Var = i0Var2;
            if (ph.j0.d(i0Var)) {
                n1Var.setValue(k.f22269c);
                this.f22440b = i0Var;
                this.f22439a = 1;
                if (ph.t0.b(700L, this) != aVar) {
                    i0Var2 = i0Var;
                    n1Var.setValue(k.f22270d);
                    this.f22440b = i0Var2;
                    this.f22439a = 2;
                }
                return aVar;
            }
            return pg.f0.f21461a;
        }
        i0Var2 = (ph.i0) this.f22440b;
        pg.q.b(obj);
        n1Var.setValue(k.f22270d);
        this.f22440b = i0Var2;
        this.f22439a = 2;
    }
}
