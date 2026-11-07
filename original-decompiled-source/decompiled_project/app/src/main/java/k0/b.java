package k0;

import android.os.Build;
import android.view.View;
import j2.x3;
import k0.m1;
import k0.n1;
import kotlin.jvm.internal.r;

@vg.e(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {125}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class b extends vg.i implements eh.p<x3, tg.e<?>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f15799a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f15800b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.l<p1, pg.f0> f15801c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f15802d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m1.a f15803e;

    @vg.e(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {149}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<?>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f15804a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f15805b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3 f15806c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ eh.l<p1, pg.f0> f15807d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ c f15808e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ m1.a f15809f;

        @vg.e(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {140, 141}, m = "invokeSuspend")
        /* renamed from: k0.b$a$a, reason: collision with other inner class name */
        public static final class C0154a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f15810a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f15811b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h1 f15812c;

            /* renamed from: k0.b$a$a$a, reason: collision with other inner class name */
            public static final class C0155a extends kotlin.jvm.internal.s implements eh.l<Long, pg.f0> {

                /* renamed from: a, reason: collision with root package name */
                public static final C0155a f15813a = new C0155a(1);

                @Override // eh.l
                public final /* bridge */ /* synthetic */ pg.f0 invoke(Long l10) {
                    l10.longValue();
                    return pg.f0.f21461a;
                }
            }

            /* renamed from: k0.b$a$a$b, reason: collision with other inner class name */
            public static final class C0156b<T> implements sh.g {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ h1 f15814a;

                public C0156b(h1 h1Var) {
                    this.f15814a = h1Var;
                }

                @Override // sh.g
                public final Object c(Object obj, tg.e eVar) {
                    if (Build.VERSION.SDK_INT >= 34) {
                        h1 h1Var = this.f15814a;
                        h1Var.a().startStylusHandwriting(h1Var.f15846a);
                    }
                    return pg.f0.f21461a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0154a(c cVar, h1 h1Var, tg.e eVar) {
                super(2, eVar);
                this.f15811b = cVar;
                this.f15812c = h1Var;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                return new C0154a(this.f15811b, this.f15812c, eVar);
            }

            @Override // eh.p
            public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
                return ((C0154a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                ug.a aVar = ug.a.f29706a;
                int i10 = this.f15810a;
                if (i10 == 0) {
                    pg.q.b(obj);
                    this.f15810a = 1;
                    if (x0.f1.b(C0155a.f15813a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        pg.q.b(obj);
                        throw new pg.g();
                    }
                    pg.q.b(obj);
                }
                sh.i0<pg.f0> i0VarK = this.f15811b.k();
                if (i0VarK == null) {
                    return pg.f0.f21461a;
                }
                C0156b c0156b = new C0156b(this.f15812c);
                this.f15810a = 2;
                sh.o0.l((sh.o0) i0VarK, c0156b, this);
                return aVar;
            }
        }

        /* renamed from: k0.b$a$b, reason: collision with other inner class name */
        public /* synthetic */ class C0157b extends kotlin.jvm.internal.p implements eh.l<q1.r1, pg.f0> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ m1.a f15815a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0157b(m1.a aVar) {
                super(1, r.a.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
                this.f15815a = aVar;
            }

            @Override // eh.l
            public final pg.f0 invoke(q1.r1 r1Var) {
                float[] fArr = r1Var.f21729a;
                g2.v vVarS = this.f15815a.S();
                if (vVarS != null) {
                    if (!vVarS.m()) {
                        vVarS = null;
                    }
                    if (vVarS != null) {
                        vVarS.I(fArr);
                    }
                }
                return pg.f0.f21461a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(x3 x3Var, eh.l<? super p1, pg.f0> lVar, c cVar, m1.a aVar, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f15806c = x3Var;
            this.f15807d = lVar;
            this.f15808e = cVar;
            this.f15809f = aVar;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            a aVar = new a(this.f15806c, this.f15807d, this.f15808e, this.f15809f, eVar);
            aVar.f15805b = obj;
            return aVar;
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<?> eVar) {
            ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            return ug.a.f29706a;
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f15804a;
            c cVar = this.f15808e;
            try {
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pg.q.b(obj);
                    throw new pg.g();
                }
                pg.q.b(obj);
                ph.i0 i0Var = (ph.i0) this.f15805b;
                n1.a aVar2 = n1.f15874a;
                x3 x3Var = this.f15806c;
                View viewA = x3Var.a();
                aVar2.getClass();
                h1 h1Var = new h1(viewA);
                p1 p1Var = new p1(x3Var.a(), new C0157b(this.f15809f), h1Var);
                if (j0.b.f14595a) {
                    ph.h.c(i0Var, null, null, new C0154a(cVar, h1Var, null), 3);
                }
                eh.l<p1, pg.f0> lVar = this.f15807d;
                if (lVar != null) {
                    lVar.invoke(p1Var);
                }
                cVar.f15817c = p1Var;
                this.f15804a = 1;
                x3Var.b(p1Var, this);
                return aVar;
            } catch (Throwable th2) {
                cVar.f15817c = null;
                throw th2;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(eh.l<? super p1, pg.f0> lVar, c cVar, m1.a aVar, tg.e<? super b> eVar) {
        super(2, eVar);
        this.f15801c = lVar;
        this.f15802d = cVar;
        this.f15803e = aVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        b bVar = new b(this.f15801c, this.f15802d, this.f15803e, eVar);
        bVar.f15800b = obj;
        return bVar;
    }

    @Override // eh.p
    public final Object invoke(x3 x3Var, tg.e<?> eVar) {
        ((b) create(x3Var, eVar)).invokeSuspend(pg.f0.f21461a);
        return ug.a.f29706a;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f15799a;
        if (i10 == 0) {
            pg.q.b(obj);
            a aVar2 = new a((x3) this.f15800b, this.f15801c, this.f15802d, this.f15803e, null);
            this.f15799a = 1;
            if (ph.j0.c(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        throw new pg.g();
    }
}
