package g7;

import ph.p0;
import ph.z0;

@vg.e(c = "coil3.RealImageLoader$execute$2", f = "RealImageLoader.kt", l = {87}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class v extends vg.i implements eh.p<ph.i0, tg.e<? super w7.i>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f11538a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f11539b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w7.f f11540c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f11541d;

    @vg.e(c = "coil3.RealImageLoader$execute$2$job$1", f = "RealImageLoader.kt", l = {83}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super w7.i>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11542a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t f11543b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ w7.f f11544c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t tVar, tg.e eVar, w7.f fVar) {
            super(2, eVar);
            this.f11543b = tVar;
            this.f11544c = fVar;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f11543b, eVar, this.f11544c);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super w7.i> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f11542a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                return obj;
            }
            pg.q.b(obj);
            this.f11542a = 1;
            int i11 = t.f11524f;
            Object objB = this.f11543b.b(this.f11544c, 1, this);
            return objB == aVar ? aVar : objB;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(t tVar, tg.e eVar, w7.f fVar) {
        super(2, eVar);
        this.f11540c = fVar;
        this.f11541d = tVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        v vVar = new v(this.f11541d, eVar, this.f11540c);
        vVar.f11539b = obj;
        return vVar;
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super w7.i> eVar) {
        return ((v) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f11538a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            return obj;
        }
        pg.q.b(obj);
        ph.i0 i0Var = (ph.i0) this.f11539b;
        wh.c cVar = z0.f21632a;
        qh.g gVarH0 = uh.o.f29764a.H0();
        t tVar = this.f11541d;
        w7.f fVar = this.f11540c;
        p0<w7.i> p0VarA = d0.a(fVar, ph.h.a(i0Var, gVarH0, new a(tVar, null, fVar), 2)).a();
        this.f11538a = 1;
        Object objAwait = p0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
