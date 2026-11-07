package s;

import i0.e4;
import java.util.concurrent.CancellationException;

@vg.e(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", l = {305}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class a extends vg.i implements eh.l<tg.e<? super j<Object, s>>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public n f23638a;

    /* renamed from: b, reason: collision with root package name */
    public kotlin.jvm.internal.b0 f23639b;

    /* renamed from: c, reason: collision with root package name */
    public int f23640c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b<Object, s> f23641d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f23642e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x1 f23643f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f23644g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ eh.l<b<Object, s>, pg.f0> f23645h;

    /* renamed from: s.a$a, reason: collision with other inner class name */
    public static final class C0265a extends kotlin.jvm.internal.s implements eh.l<k<Object, s>, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b<Object, s> f23646a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n<Object, s> f23647b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ eh.l<b<Object, s>, pg.f0> f23648c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.b0 f23649d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0265a(b<Object, s> bVar, n<Object, s> nVar, eh.l<? super b<Object, s>, pg.f0> lVar, kotlin.jvm.internal.b0 b0Var) {
            super(1);
            this.f23646a = bVar;
            this.f23647b = nVar;
            this.f23648c = lVar;
            this.f23649d = b0Var;
        }

        @Override // eh.l
        public final pg.f0 invoke(k<Object, s> kVar) {
            k<Object, s> kVar2 = kVar;
            b<Object, s> bVar = this.f23646a;
            w1.i(kVar2, bVar.f23654c);
            x0.x1 x1Var = kVar2.f23791e;
            Object objA = b.a(bVar, x1Var.getValue());
            boolean zA = kotlin.jvm.internal.r.a(objA, x1Var.getValue());
            eh.l<b<Object, s>, pg.f0> lVar = this.f23648c;
            if (!zA) {
                bVar.f23654c.f23843b.setValue(objA);
                this.f23647b.f23843b.setValue(objA);
                if (lVar != null) {
                    lVar.invoke(bVar);
                }
                kVar2.a();
                this.f23649d.f16318a = true;
            } else if (lVar != null) {
                lVar.invoke(bVar);
            }
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Object obj, x1 x1Var, long j10, eh.l lVar, tg.e eVar) {
        super(1, eVar);
        this.f23641d = bVar;
        this.f23642e = obj;
        this.f23643f = x1Var;
        this.f23644g = j10;
        this.f23645h = lVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(tg.e<?> eVar) {
        return new a(this.f23641d, this.f23642e, this.f23643f, this.f23644g, this.f23645h, eVar);
    }

    @Override // eh.l
    public final Object invoke(tg.e<? super j<Object, s>> eVar) {
        return ((a) create(eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        n nVar;
        kotlin.jvm.internal.b0 b0Var;
        x1 x1Var = this.f23643f;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f23640c;
        b<Object, s> bVar = this.f23641d;
        try {
            if (i10 == 0) {
                pg.q.b(obj);
                bVar.f23654c.f23844c = (V) bVar.f23652a.a().invoke(this.f23642e);
                bVar.f23656e.setValue(x1Var.f23987c);
                bVar.f23655d.setValue(Boolean.TRUE);
                n<Object, V> nVar2 = bVar.f23654c;
                n nVar3 = new n(nVar2.f23842a, nVar2.f23843b.getValue(), e4.b(nVar2.f23844c), nVar2.f23845d, Long.MIN_VALUE, nVar2.f23847f);
                kotlin.jvm.internal.b0 b0Var2 = new kotlin.jvm.internal.b0();
                long j10 = this.f23644g;
                C0265a c0265a = new C0265a(bVar, nVar3, this.f23645h, b0Var2);
                this.f23638a = nVar3;
                this.f23639b = b0Var2;
                this.f23640c = 1;
                if (w1.b(nVar3, x1Var, j10, c0265a, this) == aVar) {
                    return aVar;
                }
                nVar = nVar3;
                b0Var = b0Var2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b0Var = this.f23639b;
                nVar = this.f23638a;
                pg.q.b(obj);
            }
            i iVar = b0Var.f16318a ? i.f23769a : i.f23770b;
            b.b(bVar);
            return new j(nVar, iVar);
        } catch (CancellationException e10) {
            b.b(bVar);
            throw e10;
        }
    }
}
