package i0;

import androidx.compose.ui.d;
import j2.d5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import t2.b;
import t2.i;
import x0.j;

/* loaded from: classes.dex */
public final class n4 {

    /* renamed from: a, reason: collision with root package name */
    public final x0.x1 f13448a = bg.b.h(null);

    /* renamed from: b, reason: collision with root package name */
    public t2.b f13449b;

    /* renamed from: c, reason: collision with root package name */
    public final h1.u<eh.l<x2, pg.f0>> f13450c;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<b.c<? extends b.a>, List<? extends b.c<? extends b.a>>> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13451a = new a(1);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // eh.l
        public final List<? extends b.c<? extends b.a>> invoke(b.c<? extends b.a> cVar) {
            t2.i0 i0VarA;
            t2.b0 b0Var;
            b.c<? extends b.a> cVar2 = cVar;
            T t3 = cVar2.f27771a;
            if (!(t3 instanceof t2.i) || (i0VarA = ((t2.i) t3).a()) == null || (i0VarA.f27829a == null && i0VarA.f27830b == null && i0VarA.f27831c == null && i0VarA.f27832d == null)) {
                return qg.p.f(cVar2);
            }
            T t10 = cVar2.f27771a;
            kotlin.jvm.internal.r.c(t10, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation");
            t2.i0 i0VarA2 = ((t2.i) t10).a();
            if (i0VarA2 == null || (b0Var = i0VarA2.f27829a) == null) {
                b0Var = new t2.b0(0L, 0L, (x2.p) null, (x2.n) null, (x2.o) null, (x2.f) null, (String) null, 0L, (e3.a) null, (e3.m) null, (a3.c) null, 0L, (e3.i) null, (q1.e2) null, 65535);
            }
            return qg.p.f(cVar2, new b.c(b0Var, cVar2.f27772b, cVar2.f27773c));
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.l<q2.d0, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f13452a = new b(1);

        @Override // eh.l
        public final pg.f0 invoke(q2.d0 d0Var) {
            q2.c0<pg.f0> c0Var = q2.w.f21844y;
            pg.f0 f0Var = pg.f0.f21461a;
            d0Var.c(c0Var, f0Var);
            return f0Var;
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements eh.a<pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.c<t2.i> f13453a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d5 f13454b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(n4 n4Var, b.c<t2.i> cVar, d5 d5Var) {
            super(0);
            this.f13453a = cVar;
            this.f13454b = d5Var;
        }

        @Override // eh.a
        public final pg.f0 invoke() {
            t2.i iVar = this.f13453a.f27771a;
            d5 d5Var = this.f13454b;
            if (iVar instanceof i.b) {
                try {
                    d5Var.a(((i.b) iVar).f27827a);
                } catch (IllegalArgumentException unused) {
                }
            }
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "androidx.compose.foundation.text.TextLinkScope$LinksComposables$1$3$1", f = "TextLinkScope.kt", l = {247}, m = "invokeSuspend")
    public static final class d extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f13455a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k2 f13456b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(k2 k2Var, tg.e<? super d> eVar) {
            super(2, eVar);
            this.f13456b = k2Var;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new d(this.f13456b, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = ug.a.f29706a;
            int i10 = this.f13455a;
            if (i10 == 0) {
                pg.q.b(obj);
                this.f13455a = 1;
                k2 k2Var = this.f13456b;
                k2Var.getClass();
                Object objB = k2Var.f13385a.b().b(new j2(new p.h0((Object) null), k2Var), this);
                if (objB != obj2) {
                    objB = pg.f0.f21461a;
                }
                if (objB == obj2) {
                    return obj2;
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

    public static final class e extends kotlin.jvm.internal.s implements eh.l<x2, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.c<t2.i> f13457a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k2 f13458b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(n4 n4Var, b.c<t2.i> cVar, k2 k2Var) {
            super(1);
            this.f13457a = cVar;
            this.f13458b = k2Var;
        }

        @Override // eh.l
        public final pg.f0 invoke(x2 x2Var) {
            t2.i0 i0VarA;
            t2.i0 i0VarA2;
            t2.i0 i0VarA3;
            x2 x2Var2 = x2Var;
            x0.v1 v1Var = this.f13458b.f13386b;
            b.c<t2.i> cVar = this.f13457a;
            t2.i iVar = cVar.f27771a;
            t2.i0 i0VarA4 = iVar.a();
            t2.b0 b0VarC = null;
            t2.b0 b0Var = i0VarA4 != null ? i0VarA4.f27829a : null;
            t2.b0 b0VarC2 = ((v1Var.g() & 1) == 0 || (i0VarA3 = iVar.a()) == null) ? null : i0VarA3.f27830b;
            if (b0Var != null) {
                b0VarC2 = b0Var.c(b0VarC2);
            }
            t2.b0 b0VarC3 = ((v1Var.g() & 2) == 0 || (i0VarA2 = iVar.a()) == null) ? null : i0VarA2.f27831c;
            if (b0VarC2 != null) {
                b0VarC3 = b0VarC2.c(b0VarC3);
            }
            if ((v1Var.g() & 4) != 0 && (i0VarA = iVar.a()) != null) {
                b0VarC = i0VarA.f27832d;
            }
            if (b0VarC3 != null) {
                b0VarC = b0VarC3.c(b0VarC);
            }
            x2Var2.getClass();
            kotlin.jvm.internal.b0 b0Var2 = new kotlin.jvm.internal.b0();
            t2.b bVar = x2Var2.f13676a;
            w2 w2Var = new w2(b0Var2, cVar, b0VarC);
            bVar.getClass();
            b.C0288b c0288b = new b.C0288b(bVar);
            ArrayList arrayList = c0288b.f27766c;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                b.c<? extends b.a> cVarInvoke = w2Var.invoke(((b.C0288b.a) arrayList.get(i10)).a(PKIFailureInfo.systemUnavail));
                arrayList.set(i10, new b.C0288b.a(cVarInvoke.f27771a, cVarInvoke.f27772b, cVarInvoke.f27773c, cVarInvoke.f27774d));
            }
            x2Var2.f13677b = c0288b.e();
            return pg.f0.f21461a;
        }
    }

    public static final class f extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {
        public f(int i10) {
            super(2);
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            num.intValue();
            int iN = f3.i.n(1);
            n4.this.a(iN, jVar);
            return pg.f0.f21461a;
        }
    }

    public static final class g extends kotlin.jvm.internal.s implements eh.l<x0.l0, x0.k0> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eh.l<x2, pg.f0> f13461b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(eh.l<? super x2, pg.f0> lVar) {
            super(1);
            this.f13461b = lVar;
        }

        @Override // eh.l
        public final x0.k0 invoke(x0.l0 l0Var) {
            n4 n4Var = n4.this;
            h1.u<eh.l<x2, pg.f0>> uVar = n4Var.f13450c;
            eh.l<x2, pg.f0> lVar = this.f13461b;
            uVar.add(lVar);
            return new o4(n4Var, lVar);
        }
    }

    public static final class h extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object[] f13463b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ eh.l<x2, pg.f0> f13464c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f13465d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(Object[] objArr, eh.l<? super x2, pg.f0> lVar, int i10) {
            super(2);
            this.f13463b = objArr;
            this.f13464c = lVar;
            this.f13465d = i10;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            num.intValue();
            Object[] objArr = this.f13463b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            int iN = f3.i.n(this.f13465d | 1);
            n4.this.b(objArrCopyOf, this.f13464c, jVar, iN);
            return pg.f0.f21461a;
        }
    }

    public n4(t2.b bVar) {
        bVar.getClass();
        b.C0288b c0288b = new b.C0288b(bVar);
        ArrayList arrayList = c0288b.f27766c;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            List<? extends b.c<? extends b.a>> listInvoke = a.f13451a.invoke(((b.C0288b.a) arrayList.get(i10)).a(PKIFailureInfo.systemUnavail));
            ArrayList arrayList3 = new ArrayList(listInvoke.size());
            int size2 = listInvoke.size();
            for (int i11 = 0; i11 < size2; i11++) {
                b.c<? extends b.a> cVar = listInvoke.get(i11);
                arrayList3.add(new b.C0288b.a(cVar.f27771a, cVar.f27772b, cVar.f27773c, cVar.f27774d));
            }
            qg.t.p(arrayList3, arrayList2);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.f13449b = c0288b.e();
        this.f13450c = new h1.u<>();
    }

    public static b.c c(b.c cVar, t2.h0 h0Var) {
        int iC = h0Var.f27820b.c(r3.f27848f - 1, false);
        if (cVar.f27772b < iC) {
            return b.c.a(cVar, null, Math.min(cVar.f27773c, iC), 11);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i10, x0.j jVar) {
        char c10;
        x0.k kVarP = jVar.p(1154651354);
        char c11 = 2;
        int i11 = (kVarP.l(this) ? 4 : 2) | i10;
        if (kVarP.A(i11 & 1, (i11 & 3) != 2)) {
            d5 d5Var = (d5) kVarP.f(j2.j2.f14789r);
            t2.b bVar = this.f13449b;
            List listA = bVar.a(bVar.f27761b.length());
            int size = listA.size();
            int i12 = 0;
            while (i12 < size) {
                b.c cVar = (b.c) listA.get(i12);
                int i13 = cVar.f27772b;
                T t3 = cVar.f27771a;
                if (i13 != cVar.f27773c) {
                    kVarP.L(1386075176);
                    Object objG = kVarP.g();
                    j.a.C0321a c0321a = j.a.f31715a;
                    if (objG == c0321a) {
                        objG = new x.n();
                        kVarP.C(objG);
                    }
                    x.m mVar = (x.m) objG;
                    c10 = c11;
                    androidx.compose.ui.d dVarA = androidx.compose.foundation.d.a(q2.q.a(androidx.compose.ui.graphics.a.a(d.a.f1143b, new p4(this, cVar)), false, b.f13452a).h(new x4(new m4(this, cVar))), mVar);
                    c2.x.f4707a.getClass();
                    androidx.compose.ui.d dVarF = c2.y.f(dVarA, c2.a0.f4591b);
                    boolean zL = kVarP.l(this) | kVarP.K(cVar) | kVarP.l(d5Var);
                    Object objG2 = kVarP.g();
                    if (zL || objG2 == c0321a) {
                        objG2 = new c(this, cVar, d5Var);
                        kVarP.C(objG2);
                    }
                    z.g.a(androidx.compose.foundation.b.d(dVarF, mVar, (eh.a) objG2), kVarP, 0);
                    t2.i iVar = (t2.i) t3;
                    t2.i0 i0VarA = iVar.a();
                    if (i0VarA == null || (i0VarA.f27829a == null && i0VarA.f27830b == null && i0VarA.f27831c == null && i0VarA.f27832d == null)) {
                        kVarP.L(1388926990);
                        kVarP.T(false);
                    } else {
                        kVarP.L(1386898319);
                        Object objG3 = kVarP.g();
                        if (objG3 == c0321a) {
                            objG3 = new k2(mVar);
                            kVarP.C(objG3);
                        }
                        k2 k2Var = (k2) objG3;
                        pg.f0 f0Var = pg.f0.f21461a;
                        Object objG4 = kVarP.g();
                        if (objG4 == c0321a) {
                            objG4 = new d(k2Var, null);
                            kVarP.C(objG4);
                        }
                        x0.o0.d((eh.p) objG4, f0Var, kVarP);
                        x0.v1 v1Var = k2Var.f13386b;
                        x0.v1 v1Var2 = k2Var.f13386b;
                        Boolean boolValueOf = Boolean.valueOf((v1Var.g() & 2) != 0);
                        Boolean boolValueOf2 = Boolean.valueOf((v1Var2.g() & 1) != 0);
                        Boolean boolValueOf3 = Boolean.valueOf((v1Var2.g() & 4) != 0);
                        t2.i0 i0VarA2 = iVar.a();
                        t2.b0 b0Var = i0VarA2 != null ? i0VarA2.f27829a : null;
                        t2.i0 i0VarA3 = iVar.a();
                        t2.b0 b0Var2 = i0VarA3 != null ? i0VarA3.f27830b : null;
                        t2.i0 i0VarA4 = iVar.a();
                        t2.b0 b0Var3 = i0VarA4 != null ? i0VarA4.f27831c : null;
                        t2.i0 i0VarA5 = iVar.a();
                        Object[] objArr = {boolValueOf, boolValueOf2, boolValueOf3, b0Var, b0Var2, b0Var3, i0VarA5 != null ? i0VarA5.f27832d : null};
                        boolean zL2 = kVarP.l(this) | kVarP.K(cVar);
                        Object objG5 = kVarP.g();
                        if (zL2 || objG5 == c0321a) {
                            objG5 = new e(this, cVar, k2Var);
                            kVarP.C(objG5);
                        }
                        b(objArr, (eh.l) objG5, kVarP, (i11 << 6) & 896);
                        kVarP.T(false);
                    }
                    kVarP.T(false);
                } else {
                    c10 = c11;
                    kVarP.L(1388940878);
                    kVarP.T(false);
                }
                i12++;
                c11 = c10;
            }
        } else {
            kVarP.v();
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new f(i10);
        }
    }

    public final void b(Object[] objArr, eh.l<? super x2, pg.f0> lVar, x0.j jVar, int i10) {
        x0.k kVarP = jVar.p(-2083052099);
        int i11 = (i10 & 48) == 0 ? (kVarP.l(lVar) ? 32 : 16) | i10 : i10;
        if ((i10 & 384) == 0) {
            i11 |= kVarP.l(this) ? 256 : 128;
        }
        kVarP.q(-416604407, Integer.valueOf(objArr.length));
        for (Object obj : objArr) {
            i11 |= kVarP.l(obj) ? 4 : 0;
        }
        kVarP.T(false);
        if ((i11 & 14) == 0) {
            i11 |= 2;
        }
        if (kVarP.A(i11 & 1, (i11 & 147) != 146)) {
            kotlin.jvm.internal.k0 k0Var = new kotlin.jvm.internal.k0();
            ArrayList<Object> arrayList = k0Var.f16337a;
            arrayList.add(lVar);
            k0Var.a(objArr);
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean zL = kVarP.l(this) | ((i11 & 112) == 32);
            Object objG = kVarP.g();
            if (zL || objG == j.a.f31715a) {
                objG = new g(lVar);
                kVarP.C(objG);
            }
            x0.o0.c(array, (eh.l) objG, kVarP);
        } else {
            kVarP.v();
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new h(objArr, lVar, i10);
        }
    }
}
