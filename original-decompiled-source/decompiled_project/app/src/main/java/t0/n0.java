package t0;

import x.o;

@vg.e(c = "androidx.compose.material3.ButtonElevation$animateElevation$1$1", f = "Button.kt", l = {942}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class n0 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f26480a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x.l f26481b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h1.u<x.k> f26482c;

    public static final class a<T> implements sh.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h1.u<x.k> f26483a;

        public a(h1.u<x.k> uVar) {
            this.f26483a = uVar;
        }

        @Override // sh.g
        public final Object c(Object obj, tg.e eVar) {
            x.k kVar = (x.k) obj;
            boolean z10 = kVar instanceof x.i;
            h1.u<x.k> uVar = this.f26483a;
            if (z10) {
                uVar.add(kVar);
            } else if (kVar instanceof x.j) {
                uVar.remove(((x.j) kVar).f31596a);
            } else if (kVar instanceof x.e) {
                uVar.add(kVar);
            } else if (kVar instanceof x.f) {
                uVar.remove(((x.f) kVar).f31590a);
            } else if (kVar instanceof o.b) {
                uVar.add(kVar);
            } else if (kVar instanceof o.c) {
                uVar.remove(((o.c) kVar).f31600a);
            } else if (kVar instanceof o.a) {
                uVar.remove(((o.a) kVar).f31598a);
            }
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(x.l lVar, h1.u<x.k> uVar, tg.e<? super n0> eVar) {
        super(2, eVar);
        this.f26481b = lVar;
        this.f26482c = uVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new n0(this.f26481b, this.f26482c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((n0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f26480a;
        if (i10 == 0) {
            pg.q.b(obj);
            sh.f<x.k> fVarB = this.f26481b.b();
            a aVar2 = new a(this.f26482c);
            this.f26480a = 1;
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
