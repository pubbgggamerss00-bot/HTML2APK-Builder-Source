package t0;

import x.o;

@vg.e(c = "androidx.compose.material3.SliderDefaults$Thumb$1$1", f = "Slider.kt", l = {954}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class lb extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f26386a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x.m f26387b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h1.u<x.k> f26388c;

    public static final class a<T> implements sh.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h1.u<x.k> f26389a;

        public a(h1.u<x.k> uVar) {
            this.f26389a = uVar;
        }

        @Override // sh.g
        public final Object c(Object obj, tg.e eVar) {
            x.k kVar = (x.k) obj;
            boolean z10 = kVar instanceof o.b;
            h1.u<x.k> uVar = this.f26389a;
            if (z10) {
                uVar.add(kVar);
            } else if (kVar instanceof o.c) {
                uVar.remove(((o.c) kVar).f31600a);
            } else if (kVar instanceof o.a) {
                uVar.remove(((o.a) kVar).f31598a);
            } else if (kVar instanceof x.b) {
                uVar.add(kVar);
            } else if (kVar instanceof x.c) {
                uVar.remove(((x.c) kVar).f31584a);
            } else if (kVar instanceof x.a) {
                uVar.remove(((x.a) kVar).f31583a);
            }
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb(x.m mVar, h1.u<x.k> uVar, tg.e<? super lb> eVar) {
        super(2, eVar);
        this.f26387b = mVar;
        this.f26388c = uVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new lb(this.f26387b, this.f26388c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((lb) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f26386a;
        if (i10 == 0) {
            pg.q.b(obj);
            sh.f<x.k> fVarB = this.f26387b.b();
            a aVar2 = new a(this.f26388c);
            this.f26386a = 1;
            if (fVarB.b(aVar2, this) == aVar) {
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
