package x0;

import java.util.Arrays;
import x0.j;

/* loaded from: classes.dex */
public final class y {

    public static final class a extends kotlin.jvm.internal.s implements eh.p<j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f2<?>[] f31962a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eh.p<j, Integer, pg.f0> f31963b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f31964c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(f2<?>[] f2VarArr, eh.p<? super j, ? super Integer, pg.f0> pVar, int i10) {
            super(2);
            this.f31962a = f2VarArr;
            this.f31963b = pVar;
            this.f31964c = i10;
        }

        @Override // eh.p
        public final pg.f0 invoke(j jVar, Integer num) {
            num.intValue();
            f2<?>[] f2VarArr = this.f31962a;
            f2[] f2VarArr2 = (f2[]) Arrays.copyOf(f2VarArr, f2VarArr.length);
            int iN = f3.i.n(this.f31964c | 1);
            y.b(f2VarArr2, this.f31963b, jVar, iN);
            return pg.f0.f21461a;
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.p<j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f2<?> f31965a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eh.p<j, Integer, pg.f0> f31966b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f31967c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(f2<?> f2Var, eh.p<? super j, ? super Integer, pg.f0> pVar, int i10) {
            super(2);
            this.f31965a = f2Var;
            this.f31966b = pVar;
            this.f31967c = i10;
        }

        @Override // eh.p
        public final pg.f0 invoke(j jVar, Integer num) {
            num.intValue();
            int iN = f3.i.n(this.f31967c | 1);
            y.a(this.f31965a, this.f31966b, jVar, iN);
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(f2<?> f2Var, eh.p<? super j, ? super Integer, pg.f0> pVar, j jVar, int i10) {
        v3 v3Var;
        boolean z10;
        h2 h2VarV;
        k kVarP = jVar.p(-1350970552);
        t0 t0Var = kVarP.f31750w;
        a2 a2VarP = kVarP.P();
        kVarP.s0(201, q.f31868b);
        Object objG = kVarP.g();
        if (kotlin.jvm.internal.r.a(objG, j.a.f31715a)) {
            v3Var = null;
        } else {
            kotlin.jvm.internal.r.c(objG, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            v3Var = (v3) objG;
        }
        e2 e2Var = f2Var.f31672a;
        v3 v3VarC = e2Var.c(f2Var, v3Var);
        boolean zEquals = v3VarC.equals(v3Var);
        if (!zEquals) {
            kVarP.C(v3VarC);
        }
        if (!kVarP.O) {
            z2 z2Var = kVarP.F;
            Object objB = z2Var.b(z2Var.f31991b, z2Var.f31996g);
            kotlin.jvm.internal.r.c(objB, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            a2 a2Var = (a2) objB;
            if (!(kVarP.s() && zEquals) && (f2Var.f31677f || !a2VarP.containsKey(e2Var))) {
                a2VarP = a2VarP.d(e2Var, v3VarC);
            } else if ((zEquals && !kVarP.f31749v) || !kVarP.f31749v) {
                a2VarP = a2Var;
            }
            if (kVarP.f31751x || a2Var != a2VarP) {
                z10 = true;
            }
            if (z10 && !kVarP.O) {
                kVarP.i0(a2VarP);
            }
            t0Var.c(kVarP.f31749v ? 1 : 0);
            kVarP.f31749v = z10;
            kVarP.J = a2VarP;
            kVarP.q0(q.f31869c, 202, 0, a2VarP);
            pVar.invoke(kVarP, Integer.valueOf((i10 >> 3) & 14));
            kVarP.T(false);
            kVarP.T(false);
            kVarP.f31749v = t0Var.b() != 0;
            kVarP.J = null;
            h2VarV = kVarP.V();
            if (h2VarV == null) {
                h2VarV.f31703d = new b(f2Var, pVar, i10);
                return;
            }
            return;
        }
        if (f2Var.f31677f || !a2VarP.containsKey(e2Var)) {
            a2VarP = a2VarP.d(e2Var, v3VarC);
        }
        kVarP.I = true;
        z10 = false;
        if (z10) {
            kVarP.i0(a2VarP);
        }
        t0Var.c(kVarP.f31749v ? 1 : 0);
        kVarP.f31749v = z10;
        kVarP.J = a2VarP;
        kVarP.q0(q.f31869c, 202, 0, a2VarP);
        pVar.invoke(kVarP, Integer.valueOf((i10 >> 3) & 14));
        kVarP.T(false);
        kVarP.T(false);
        kVarP.f31749v = t0Var.b() != 0;
        kVarP.J = null;
        h2VarV = kVarP.V();
        if (h2VarV == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [c1.f, f1.f$a] */
    /* JADX WARN: Type inference failed for: r1v10, types: [c1.f, f1.f$a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(f2<?>[] f2VarArr, eh.p<? super j, ? super Integer, pg.f0> pVar, j jVar, int i10) {
        a2 a2VarBuild;
        boolean z10;
        h2 h2VarV;
        k kVarP = jVar.p(-1390796515);
        t0 t0Var = kVarP.f31750w;
        a2 a2VarP = kVarP.P();
        kVarP.s0(201, q.f31868b);
        boolean z11 = kVarP.O;
        t1 t1Var = q.f31870d;
        if (z11) {
            a2 a2VarB = a0.b(f2VarArr, a2VarP, f1.f.f8790d);
            ?? Builder = a2VarP.builder();
            Builder.putAll(a2VarB);
            a2VarBuild = Builder.build();
            kVarP.s0(204, t1Var);
            kVarP.c0();
            kVarP.z0(a2VarBuild);
            kVarP.c0();
            kVarP.z0(a2VarB);
            kVarP.T(false);
            kVarP.I = true;
        } else {
            z2 z2Var = kVarP.F;
            Object objH = z2Var.h(z2Var.f31996g, 0);
            kotlin.jvm.internal.r.c(objH, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            a2 a2Var = (a2) objH;
            z2 z2Var2 = kVarP.F;
            Object objH2 = z2Var2.h(z2Var2.f31996g, 1);
            kotlin.jvm.internal.r.c(objH2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            a2 a2Var2 = (a2) objH2;
            a2 a2VarB2 = a0.b(f2VarArr, a2VarP, a2Var2);
            if (!kVarP.s() || kVarP.f31751x || !a2Var2.equals(a2VarB2)) {
                ?? Builder2 = a2VarP.builder();
                Builder2.putAll(a2VarB2);
                a2VarBuild = Builder2.build();
                kVarP.s0(204, t1Var);
                kVarP.c0();
                kVarP.z0(a2VarBuild);
                kVarP.c0();
                kVarP.z0(a2VarB2);
                kVarP.T(false);
                if (kVarP.f31751x || !kotlin.jvm.internal.r.a(a2VarBuild, a2Var)) {
                    z10 = true;
                }
                if (z10 && !kVarP.O) {
                    kVarP.i0(a2VarBuild);
                }
                t0Var.c(kVarP.f31749v ? 1 : 0);
                kVarP.f31749v = z10;
                kVarP.J = a2VarBuild;
                kVarP.q0(q.f31869c, 202, 0, a2VarBuild);
                pVar.invoke(kVarP, Integer.valueOf((i10 >> 3) & 14));
                kVarP.T(false);
                kVarP.T(false);
                kVarP.f31749v = t0Var.b() != 0;
                kVarP.J = null;
                h2VarV = kVarP.V();
                if (h2VarV == null) {
                    h2VarV.f31703d = new a(f2VarArr, pVar, i10);
                    return;
                }
                return;
            }
            kVarP.f31738k = kVarP.F.q() + kVarP.f31738k;
            a2VarBuild = a2Var;
        }
        z10 = false;
        if (z10) {
            kVarP.i0(a2VarBuild);
        }
        t0Var.c(kVarP.f31749v ? 1 : 0);
        kVarP.f31749v = z10;
        kVarP.J = a2VarBuild;
        kVarP.q0(q.f31869c, 202, 0, a2VarBuild);
        pVar.invoke(kVarP, Integer.valueOf((i10 >> 3) & 14));
        kVarP.T(false);
        kVarP.T(false);
        kVarP.f31749v = t0Var.b() != 0;
        kVarP.J = null;
        h2VarV = kVarP.V();
        if (h2VarV == null) {
        }
    }

    public static final s3 c(eh.a aVar) {
        return new s3(aVar);
    }
}
