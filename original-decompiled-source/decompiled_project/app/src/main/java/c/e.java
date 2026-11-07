package c;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.t;
import b.d0;
import b.i0;
import b.w;
import pg.f0;
import x0.h2;
import x0.j;
import x0.k0;
import x0.l0;
import x0.n1;
import x0.o0;

/* loaded from: classes.dex */
public final class e {

    public static final class a extends kotlin.jvm.internal.s implements eh.a<f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f4293a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f4294b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, boolean z10) {
            super(0);
            this.f4293a = dVar;
            this.f4294b = z10;
        }

        @Override // eh.a
        public final f0 invoke() {
            this.f4293a.f(this.f4294b);
            return f0.f21461a;
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.l<l0, k0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d0 f4295a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t f4296b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d f4297c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d0 d0Var, t tVar, d dVar) {
            super(1);
            this.f4295a = d0Var;
            this.f4296b = tVar;
            this.f4297c = dVar;
        }

        @Override // eh.l
        public final k0 invoke(l0 l0Var) {
            d0 d0Var = this.f4295a;
            t tVar = this.f4296b;
            d dVar = this.f4297c;
            d0Var.a(tVar, dVar);
            return new f(dVar);
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f4298a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eh.a<f0> f4299b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f4300c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f4301d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i10, int i11, eh.a aVar, boolean z10) {
            super(2);
            this.f4298a = z10;
            this.f4299b = aVar;
            this.f4300c = i10;
            this.f4301d = i11;
        }

        @Override // eh.p
        public final f0 invoke(x0.j jVar, Integer num) {
            num.intValue();
            e.a(f3.i.n(this.f4300c | 1), this.f4301d, this.f4299b, jVar, this.f4298a);
            return f0.f21461a;
        }
    }

    public static final class d extends w {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n1 f4302d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(n1 n1Var, boolean z10) {
            super(z10);
            this.f4302d = n1Var;
        }

        @Override // b.w
        public final void b() {
            ((eh.a) this.f4302d.getValue()).invoke();
        }
    }

    public static final void a(int i10, int i11, eh.a aVar, x0.j jVar, boolean z10) {
        int i12;
        x0.k kVarP = jVar.p(-361453782);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (kVarP.c(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= kVarP.l(aVar) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && kVarP.s()) {
            kVarP.v();
        } else {
            if (i13 != 0) {
                z10 = true;
            }
            n1 n1VarK = bg.b.k(aVar, kVarP);
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                objG = new d(n1VarK, z10);
                kVarP.C(objG);
            }
            d dVar = (d) objG;
            boolean z11 = (i12 & 14) == 4;
            Object objG2 = kVarP.g();
            if (z11 || objG2 == c0321a) {
                objG2 = new a(dVar, z10);
                kVarP.C(objG2);
            }
            l0 l0Var = o0.f31834a;
            kVarP.u((eh.a) objG2);
            i0 i0VarA = j.a(kVarP);
            if (i0VarA == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            d0 onBackPressedDispatcher = i0VarA.getOnBackPressedDispatcher();
            t tVar = (t) kVarP.f(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean zL = kVarP.l(onBackPressedDispatcher) | kVarP.l(tVar);
            Object objG3 = kVarP.g();
            if (zL || objG3 == c0321a) {
                objG3 = new b(onBackPressedDispatcher, tVar, dVar);
                kVarP.C(objG3);
            }
            o0.b(tVar, onBackPressedDispatcher, (eh.l) objG3, kVarP);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new c(i10, i11, aVar, z10);
        }
    }
}
