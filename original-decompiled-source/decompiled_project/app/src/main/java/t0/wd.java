package t0;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import g2.g1;
import java.util.List;

/* loaded from: classes.dex */
public final class wd extends d.c implements i2.b0 {

    /* renamed from: q, reason: collision with root package name */
    public x0.r3<? extends List<ie>> f27320q;

    /* renamed from: r, reason: collision with root package name */
    public int f27321r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f27322s;

    /* renamed from: t, reason: collision with root package name */
    public s.b<f3.h, s.o> f27323t;

    /* renamed from: v, reason: collision with root package name */
    public s.b<f3.h, s.o> f27324v;

    /* renamed from: w, reason: collision with root package name */
    public f3.h f27325w;

    /* renamed from: x, reason: collision with root package name */
    public f3.h f27326x;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f27327a = new a(1);

        @Override // eh.l
        public final /* bridge */ /* synthetic */ pg.f0 invoke(g1.a aVar) {
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "androidx.compose.material3.TabIndicatorOffsetNode$measure$2", f = "TabRow.kt", l = {901}, m = "invokeSuspend")
    public static final class b extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f27328a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s.b<f3.h, s.o> f27329b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f27330c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(s.b<f3.h, s.o> bVar, float f10, tg.e<? super b> eVar) {
            super(2, eVar);
            this.f27329b = bVar;
            this.f27330c = f10;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new b(this.f27329b, this.f27330c, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f27328a;
            if (i10 == 0) {
                pg.q.b(obj);
                f3.h hVar = new f3.h(this.f27330c);
                s.m2 m2Var = af.f25499a;
                this.f27328a = 1;
                if (s.b.c(this.f27329b, hVar, m2Var, null, this, 12) == aVar) {
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

    @vg.e(c = "androidx.compose.material3.TabIndicatorOffsetNode$measure$3", f = "TabRow.kt", l = {917}, m = "invokeSuspend")
    public static final class c extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f27331a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s.b<f3.h, s.o> f27332b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f27333c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(s.b<f3.h, s.o> bVar, float f10, tg.e<? super c> eVar) {
            super(2, eVar);
            this.f27332b = bVar;
            this.f27333c = f10;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new c(this.f27332b, this.f27333c, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f27331a;
            if (i10 == 0) {
                pg.q.b(obj);
                f3.h hVar = new f3.h(this.f27333c);
                s.m2 m2Var = af.f25499a;
                this.f27331a = 1;
                if (s.b.c(this.f27332b, hVar, m2Var, null, this, 12) == aVar) {
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

    public static final class d extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f27334a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g2.o0 f27335b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f27336c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(g2.g1 g1Var, g2.o0 o0Var, float f10) {
            super(1);
            this.f27334a = g1Var;
            this.f27335b = o0Var;
            this.f27336c = f10;
        }

        @Override // eh.l
        public final pg.f0 invoke(g1.a aVar) {
            aVar.d(this.f27334a, this.f27335b.b1(this.f27336c), 0, CropImageView.DEFAULT_ASPECT_RATIO);
            return pg.f0.f21461a;
        }
    }

    public wd() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i2.b0
    public final g2.m0 m(g2.o0 o0Var, g2.k0 k0Var, long j10) {
        boolean zIsEmpty = this.f27320q.getValue().isEmpty();
        qg.a0 a0Var = qg.a0.f22708a;
        if (zIsEmpty) {
            return o0Var.i0(0, 0, a0Var, a.f27327a);
        }
        float f10 = this.f27322s ? this.f27320q.getValue().get(this.f27321r).f26120c : this.f27320q.getValue().get(this.f27321r).f26119b;
        f3.h hVar = this.f27326x;
        if (hVar != null) {
            s.b<f3.h, s.o> bVar = this.f27324v;
            if (bVar == null) {
                bVar = new s.b<>(hVar, s.p2.f23870c, null, 12);
                this.f27324v = bVar;
            }
            if (!f3.h.a(f10, ((f3.h) bVar.f23656e.getValue()).f8817a)) {
                ph.h.c(H1(), null, null, new b(bVar, f10, null), 3);
            }
        } else {
            this.f27326x = new f3.h(f10);
        }
        float f11 = this.f27320q.getValue().get(this.f27321r).f26118a;
        f3.h hVar2 = this.f27325w;
        if (hVar2 != null) {
            s.b<f3.h, s.o> bVar2 = this.f27323t;
            if (bVar2 == null) {
                bVar2 = new s.b<>(hVar2, s.p2.f23870c, null, 12);
                this.f27323t = bVar2;
            }
            if (!f3.h.a(f11, ((f3.h) bVar2.f23656e.getValue()).f8817a)) {
                ph.h.c(H1(), null, null, new c(bVar2, f11, null), 3);
            }
        } else {
            this.f27325w = new f3.h(f11);
        }
        if (o0Var.getLayoutDirection() == f3.r.f8828a) {
            s.b<f3.h, s.o> bVar3 = this.f27323t;
            if (bVar3 != null) {
                f11 = bVar3.d().f8817a;
            }
        } else {
            s.b<f3.h, s.o> bVar4 = this.f27323t;
            if (bVar4 != null) {
                f11 = bVar4.d().f8817a;
            }
            f11 = -f11;
        }
        s.b<f3.h, s.o> bVar5 = this.f27324v;
        if (bVar5 != null) {
            f10 = bVar5.d().f8817a;
        }
        g2.g1 g1VarP = k0Var.P(f3.b.b(j10, o0Var.b1(f10), o0Var.b1(f10), 0, 0, 12));
        return o0Var.i0(g1VarP.f11382a, g1VarP.f11383b, a0Var, new d(g1VarP, o0Var, f11));
    }
}
