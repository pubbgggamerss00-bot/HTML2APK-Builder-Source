package t;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import x.o;

/* loaded from: classes.dex */
public final class f0 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final f0 f25216a = new f0();

    public static final class a extends d.c implements i2.r {

        /* renamed from: q, reason: collision with root package name */
        public final x.l f25217q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f25218r;

        /* renamed from: s, reason: collision with root package name */
        public boolean f25219s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f25220t;

        @vg.e(c = "androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1", f = "Indication.kt", l = {228}, m = "invokeSuspend")
        /* renamed from: t.f0$a$a, reason: collision with other inner class name */
        public static final class C0280a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f25221a;

            /* renamed from: t.f0$a$a$a, reason: collision with other inner class name */
            public static final class C0281a<T> implements sh.g {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlin.jvm.internal.e0 f25223a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ kotlin.jvm.internal.e0 f25224b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ kotlin.jvm.internal.e0 f25225c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ a f25226d;

                public C0281a(kotlin.jvm.internal.e0 e0Var, kotlin.jvm.internal.e0 e0Var2, kotlin.jvm.internal.e0 e0Var3, a aVar) {
                    this.f25223a = e0Var;
                    this.f25224b = e0Var2;
                    this.f25225c = e0Var3;
                    this.f25226d = aVar;
                }

                @Override // sh.g
                public final Object c(Object obj, tg.e eVar) {
                    x.k kVar = (x.k) obj;
                    boolean z10 = kVar instanceof o.b;
                    kotlin.jvm.internal.e0 e0Var = this.f25225c;
                    kotlin.jvm.internal.e0 e0Var2 = this.f25224b;
                    kotlin.jvm.internal.e0 e0Var3 = this.f25223a;
                    boolean z11 = true;
                    if (z10) {
                        e0Var3.f16324a++;
                    } else if ((kVar instanceof o.c) || (kVar instanceof o.a)) {
                        e0Var3.f16324a--;
                    } else if (kVar instanceof x.i) {
                        e0Var2.f16324a++;
                    } else if (kVar instanceof x.j) {
                        e0Var2.f16324a--;
                    } else if (kVar instanceof x.e) {
                        e0Var.f16324a++;
                    } else if (kVar instanceof x.f) {
                        e0Var.f16324a--;
                    }
                    boolean z12 = false;
                    boolean z13 = e0Var3.f16324a > 0;
                    boolean z14 = e0Var2.f16324a > 0;
                    boolean z15 = e0Var.f16324a > 0;
                    a aVar = this.f25226d;
                    if (aVar.f25218r != z13) {
                        aVar.f25218r = z13;
                        z12 = true;
                    }
                    if (aVar.f25219s != z14) {
                        aVar.f25219s = z14;
                        z12 = true;
                    }
                    if (aVar.f25220t != z15) {
                        aVar.f25220t = z15;
                    } else {
                        z11 = z12;
                    }
                    if (z11) {
                        i2.s.a(aVar);
                    }
                    return pg.f0.f21461a;
                }
            }

            public C0280a(tg.e<? super C0280a> eVar) {
                super(2, eVar);
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                return a.this.new C0280a(eVar);
            }

            @Override // eh.p
            public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
                return ((C0280a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                ug.a aVar = ug.a.f29706a;
                int i10 = this.f25221a;
                if (i10 == 0) {
                    pg.q.b(obj);
                    kotlin.jvm.internal.e0 e0Var = new kotlin.jvm.internal.e0();
                    kotlin.jvm.internal.e0 e0Var2 = new kotlin.jvm.internal.e0();
                    kotlin.jvm.internal.e0 e0Var3 = new kotlin.jvm.internal.e0();
                    a aVar2 = a.this;
                    sh.f<x.k> fVarB = aVar2.f25217q.b();
                    C0281a c0281a = new C0281a(e0Var, e0Var2, e0Var3, aVar2);
                    this.f25221a = 1;
                    if (fVarB.b(c0281a, this) == aVar) {
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

        public a(x.l lVar) {
            this.f25217q = lVar;
        }

        @Override // androidx.compose.ui.d.c
        public final void L1() {
            ph.h.c(H1(), null, null, new C0280a(null), 3);
        }

        @Override // i2.r
        public final void z(i2.h0 h0Var) {
            s1.a aVar = h0Var.f13901a;
            h0Var.z1();
            if (this.f25218r) {
                s1.e.X0(h0Var, q1.b1.c(0.3f, q1.b1.f21648b), 0L, aVar.i(), CropImageView.DEFAULT_ASPECT_RATIO, null, 122);
            } else if (this.f25219s || this.f25220t) {
                s1.e.X0(h0Var, q1.b1.c(0.1f, q1.b1.f21648b), 0L, aVar.i(), CropImageView.DEFAULT_ASPECT_RATIO, null, 122);
            }
        }
    }

    @Override // t.y0
    public final i2.j a(x.l lVar) {
        return new a(lVar);
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // t.y0
    public final int hashCode() {
        return -1;
    }
}
