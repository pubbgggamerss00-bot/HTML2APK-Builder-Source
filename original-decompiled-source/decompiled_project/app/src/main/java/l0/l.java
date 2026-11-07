package l0;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import f3.b;
import g2.g1;
import g2.k0;
import g2.m0;
import g2.o0;
import g2.p;
import i0.a3;
import i2.b0;
import i2.k2;
import i2.r;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.s;
import org.bouncycastle.asn1.cmc.BodyPartID;
import pg.f0;
import q1.b1;
import q1.e1;
import q1.e2;
import q1.u0;
import q1.w0;
import q2.a0;
import q2.c0;
import q2.d0;
import q2.w;
import qg.z;
import r.o2;
import t2.g0;
import t2.h0;
import t2.l0;
import t2.m;
import t2.q;
import x2.f;

/* loaded from: classes.dex */
public final class l extends d.c implements b0, r, k2 {
    public l0.f A;
    public b B;
    public a C;

    /* renamed from: q, reason: collision with root package name */
    public String f16629q;

    /* renamed from: r, reason: collision with root package name */
    public l0 f16630r;

    /* renamed from: s, reason: collision with root package name */
    public f.a f16631s;

    /* renamed from: t, reason: collision with root package name */
    public int f16632t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f16633v;

    /* renamed from: w, reason: collision with root package name */
    public int f16634w;

    /* renamed from: x, reason: collision with root package name */
    public int f16635x;

    /* renamed from: y, reason: collision with root package name */
    public e1 f16636y;

    /* renamed from: z, reason: collision with root package name */
    public HashMap f16637z;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f16638a;

        /* renamed from: b, reason: collision with root package name */
        public String f16639b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f16640c = false;

        /* renamed from: d, reason: collision with root package name */
        public l0.f f16641d = null;

        public a(String str, String str2) {
            this.f16638a = str;
            this.f16639b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.r.a(this.f16638a, aVar.f16638a) && kotlin.jvm.internal.r.a(this.f16639b, aVar.f16639b) && this.f16640c == aVar.f16640c && kotlin.jvm.internal.r.a(this.f16641d, aVar.f16641d);
        }

        public final int hashCode() {
            int iA = o2.a(k.a(this.f16638a.hashCode() * 31, 31, this.f16639b), 31, this.f16640c);
            l0.f fVar = this.f16641d;
            return iA + (fVar == null ? 0 : fVar.hashCode());
        }

        public final String toString() {
            return "TextSubstitution(layoutCache=" + this.f16641d + ", isShowingSubstitution=" + this.f16640c + ')';
        }
    }

    public static final class b extends s implements eh.l<List<h0>, Boolean> {
        public b() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
        @Override // eh.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Boolean invoke(List<h0> list) {
            f3.d dVar;
            h0 h0Var;
            List<h0> list2 = list;
            l lVar = l.this;
            l0.f fVarU1 = lVar.U1();
            l0 l0Var = lVar.f16630r;
            e1 e1Var = lVar.f16636y;
            l0 l0VarE = l0.e(l0Var, e1Var != null ? e1Var.a() : b1.f21654h, 0L, null, null, 0L, 0, 0L, 16777214);
            f3.r rVar = fVarU1.f16605o;
            h0 h0Var2 = null;
            if (rVar != null && (dVar = fVarU1.f16599i) != null) {
                t2.b bVar = new t2.b(fVarU1.f16591a);
                if (fVarU1.f16600j == null || fVarU1.f16604n == null) {
                    h0Var = null;
                } else {
                    long j10 = fVarU1.f16606p & (-8589934589L);
                    int i10 = fVarU1.f16596f;
                    boolean z10 = fVarU1.f16595e;
                    int i11 = fVarU1.f16594d;
                    f.a aVar = fVarU1.f16593c;
                    z zVar = z.f22752a;
                    h0Var = new h0(new g0(bVar, l0VarE, zVar, i10, z10, i11, dVar, rVar, aVar, j10), new t2.l(new m(bVar, l0VarE, zVar, dVar, aVar), j10, fVarU1.f16596f, fVarU1.f16594d), fVarU1.f16602l);
                }
            }
            if (h0Var != null) {
                list2.add(h0Var);
                h0Var2 = h0Var;
            }
            return Boolean.valueOf(h0Var2 != null);
        }
    }

    public static final class c extends s implements eh.l<t2.b, Boolean> {
        public c() {
            super(1);
        }

        @Override // eh.l
        public final Boolean invoke(t2.b bVar) {
            String str = bVar.f27761b;
            l lVar = l.this;
            a aVar = lVar.C;
            if (aVar == null) {
                a aVar2 = new a(lVar.f16629q, str);
                l0.f fVar = new l0.f(str, lVar.f16630r, lVar.f16631s, lVar.f16632t, lVar.f16633v, lVar.f16634w, lVar.f16635x);
                fVar.c(lVar.U1().f16599i);
                aVar2.f16641d = fVar;
                lVar.C = aVar2;
            } else if (!kotlin.jvm.internal.r.a(str, aVar.f16639b)) {
                aVar.f16639b = str;
                l0.f fVar2 = aVar.f16641d;
                if (fVar2 != null) {
                    l0 l0Var = lVar.f16630r;
                    f.a aVar3 = lVar.f16631s;
                    int i10 = lVar.f16632t;
                    boolean z10 = lVar.f16633v;
                    int i11 = lVar.f16634w;
                    int i12 = lVar.f16635x;
                    fVar2.f16591a = str;
                    fVar2.f16592b = l0Var;
                    fVar2.f16593c = aVar3;
                    fVar2.f16594d = i10;
                    fVar2.f16595e = z10;
                    fVar2.f16596f = i11;
                    fVar2.f16597g = i12;
                    fVar2.b();
                    f0 f0Var = f0.f21461a;
                }
            }
            l.T1(lVar);
            return Boolean.TRUE;
        }
    }

    public static final class d extends s implements eh.l<Boolean, Boolean> {
        public d() {
            super(1);
        }

        @Override // eh.l
        public final Boolean invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            l lVar = l.this;
            a aVar = lVar.C;
            if (aVar == null) {
                return Boolean.FALSE;
            }
            aVar.f16640c = zBooleanValue;
            l.T1(lVar);
            return Boolean.TRUE;
        }
    }

    public static final class e extends s implements eh.a<Boolean> {
        public e() {
            super(0);
        }

        @Override // eh.a
        public final Boolean invoke() {
            l lVar = l.this;
            lVar.C = null;
            l.T1(lVar);
            return Boolean.TRUE;
        }
    }

    public static final class f extends s implements eh.l<g1.a, f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g1 f16646a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(g1 g1Var) {
            super(1);
            this.f16646a = g1Var;
        }

        @Override // eh.l
        public final f0 invoke(g1.a aVar) {
            aVar.d(this.f16646a, 0, 0, CropImageView.DEFAULT_ASPECT_RATIO);
            return f0.f21461a;
        }
    }

    public static final void T1(l lVar) {
        i2.k.f(lVar).P();
        i2.k.f(lVar).O();
        i2.s.a(lVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // i2.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int F(i2.l0 l0Var, p pVar, int i10) {
        l0.f fVarU1;
        a aVar = this.C;
        if (aVar == null) {
            fVarU1 = U1();
        } else {
            if (!aVar.f16640c) {
                aVar = null;
            }
            if (aVar == null || (fVarU1 = aVar.f16641d) == null) {
            }
        }
        fVarU1.c(l0Var);
        return a3.a(fVarU1.d(l0Var.getLayoutDirection()).c());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // i2.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int G(i2.l0 l0Var, p pVar, int i10) {
        l0.f fVarU1;
        a aVar = this.C;
        if (aVar == null) {
            fVarU1 = U1();
        } else {
            if (!aVar.f16640c) {
                aVar = null;
            }
            if (aVar == null || (fVarU1 = aVar.f16641d) == null) {
            }
        }
        fVarU1.c(l0Var);
        return a3.a(fVarU1.d(l0Var.getLayoutDirection()).b());
    }

    @Override // androidx.compose.ui.d.c
    public final boolean I1() {
        return false;
    }

    public final l0.f U1() {
        if (this.A == null) {
            this.A = new l0.f(this.f16629q, this.f16630r, this.f16631s, this.f16632t, this.f16633v, this.f16634w, this.f16635x);
        }
        l0.f fVar = this.A;
        kotlin.jvm.internal.r.b(fVar);
        return fVar;
    }

    @Override // i2.k2
    public final void X(d0 d0Var) {
        b bVar = this.B;
        if (bVar == null) {
            bVar = new b();
            this.B = bVar;
        }
        t2.b bVar2 = new t2.b(this.f16629q);
        kh.i<Object>[] iVarArr = a0.f21754a;
        d0Var.c(w.f21845z, c0.g0.c(bVar2));
        a aVar = this.C;
        if (aVar != null) {
            boolean z10 = aVar.f16640c;
            c0<Boolean> c0Var = w.B;
            kh.i<Object>[] iVarArr2 = a0.f21754a;
            kh.i<Object> iVar = iVarArr2[15];
            Boolean boolValueOf = Boolean.valueOf(z10);
            c0Var.getClass();
            d0Var.c(c0Var, boolValueOf);
            t2.b bVar3 = new t2.b(aVar.f16639b);
            c0<t2.b> c0Var2 = w.A;
            kh.i<Object> iVar2 = iVarArr2[14];
            c0Var2.getClass();
            d0Var.c(c0Var2, bVar3);
        }
        d0Var.c(q2.k.f21783k, new q2.a(null, new c()));
        d0Var.c(q2.k.f21784l, new q2.a(null, new d()));
        d0Var.c(q2.k.f21785m, new q2.a(null, new e()));
        a0.c(d0Var, bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017f  */
    @Override // i2.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m0 m(o0 o0Var, k0 k0Var, long j10) {
        l0.f fVarU1;
        q qVar;
        long j11;
        char c10;
        q qVar2;
        a aVar = this.C;
        if (aVar == null) {
            fVarU1 = U1();
        } else {
            if (!aVar.f16640c) {
                aVar = null;
            }
            if (aVar == null || (fVarU1 = aVar.f16641d) == null) {
            }
        }
        fVarU1.c(o0Var);
        f3.r layoutDirection = o0Var.getLayoutDirection();
        boolean z10 = true;
        long jE = fVarU1.f16597g > 1 ? l0.f.e(fVarU1, j10, layoutDirection) : j10;
        t2.a aVar2 = fVarU1.f16600j;
        if (aVar2 != null && (qVar = fVarU1.f16604n) != null && !qVar.a() && layoutDirection == fVarU1.f16605o) {
            if (f3.b.c(jE, fVarU1.f16606p)) {
                j11 = BodyPartID.bodyIdMax;
            } else {
                int i10 = f3.b.i(jE);
                j11 = BodyPartID.bodyIdMax;
                if (i10 != f3.b.i(fVarU1.f16606p) || f3.b.k(jE) != f3.b.k(fVarU1.f16606p) || f3.b.h(jE) < aVar2.d() || aVar2.f27747d.f29204d) {
                    c10 = ' ';
                }
            }
            if (f3.b.c(jE, fVarU1.f16606p)) {
                c10 = ' ';
            } else {
                t2.a aVar3 = fVarU1.f16600j;
                kotlin.jvm.internal.r.b(aVar3);
                c10 = ' ';
                fVarU1.f16602l = f3.c.d(jE, (a3.a(Math.min(aVar3.f27744a.f3544i.c(), aVar3.i())) << 32) | (a3.a(aVar3.d()) & j11));
                if (fVarU1.f16594d == 3 || (((int) (r10 >> 32)) >= aVar3.i() && ((int) (r10 & j11)) >= aVar3.d())) {
                    z10 = false;
                }
                fVarU1.f16601k = z10;
                fVarU1.f16606p = jE;
            }
            z10 = false;
            qVar2 = fVarU1.f16604n;
            if (qVar2 != null) {
                qVar2.a();
            }
            f0 f0Var = f0.f21461a;
            t2.a aVar4 = fVarU1.f16600j;
            kotlin.jvm.internal.r.b(aVar4);
            long j12 = fVarU1.f16602l;
            if (z10) {
                i2.k.d(this, 2).x1();
                HashMap map = this.f16637z;
                if (map == null) {
                    map = new HashMap(2);
                    this.f16637z = map;
                }
                map.put(g2.b.f11314a, Integer.valueOf(Math.round(aVar4.c())));
                map.put(g2.b.f11315b, Integer.valueOf(Math.round(aVar4.f())));
            }
            int i11 = (int) (j12 >> c10);
            int i12 = (int) (j12 & j11);
            g1 g1VarP = k0Var.P(b.a.b(i11, i11, i12, i12));
            HashMap map2 = this.f16637z;
            kotlin.jvm.internal.r.b(map2);
            return o0Var.i0(i11, i12, map2, new f(g1VarP));
        }
        c10 = ' ';
        j11 = BodyPartID.bodyIdMax;
        q qVarD = fVarU1.d(layoutDirection);
        long jA = l0.b.a(jE, fVarU1.f16595e, fVarU1.f16594d, qVarD.c());
        boolean z11 = fVarU1.f16595e;
        int i13 = fVarU1.f16594d;
        int i14 = fVarU1.f16596f;
        t2.a aVar5 = new t2.a((b3.c) qVarD, ((z11 || !(i13 == 2 || i13 == 4 || i13 == 5)) && i14 >= 1) ? i14 : 1, i13, jA);
        fVarU1.f16606p = jE;
        long jD = f3.c.d(jE, (a3.a(aVar5.i()) << c10) | (a3.a(aVar5.d()) & j11));
        fVarU1.f16602l = jD;
        fVarU1.f16601k = fVarU1.f16594d != 3 && (((float) ((int) (jD >> c10))) < aVar5.i() || ((float) ((int) (jD & j11))) < aVar5.d());
        fVarU1.f16600j = aVar5;
        qVar2 = fVarU1.f16604n;
        if (qVar2 != null) {
        }
        f0 f0Var2 = f0.f21461a;
        t2.a aVar42 = fVarU1.f16600j;
        kotlin.jvm.internal.r.b(aVar42);
        long j122 = fVarU1.f16602l;
        if (z10) {
        }
        int i112 = (int) (j122 >> c10);
        int i122 = (int) (j122 & j11);
        g1 g1VarP2 = k0Var.P(b.a.b(i112, i112, i122, i122));
        HashMap map22 = this.f16637z;
        kotlin.jvm.internal.r.b(map22);
        return o0Var.i0(i112, i122, map22, new f(g1VarP2));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // i2.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int r(i2.l0 l0Var, p pVar, int i10) {
        l0.f fVarU1;
        a aVar = this.C;
        if (aVar == null) {
            fVarU1 = U1();
        } else {
            if (!aVar.f16640c) {
                aVar = null;
            }
            if (aVar == null || (fVarU1 = aVar.f16641d) == null) {
            }
        }
        fVarU1.c(l0Var);
        return fVarU1.a(i10, l0Var.getLayoutDirection());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // i2.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int w(i2.l0 l0Var, p pVar, int i10) {
        l0.f fVarU1;
        a aVar = this.C;
        if (aVar == null) {
            fVarU1 = U1();
        } else {
            if (!aVar.f16640c) {
                aVar = null;
            }
            if (aVar == null || (fVarU1 = aVar.f16641d) == null) {
            }
        }
        fVarU1.c(l0Var);
        return fVarU1.a(i10, l0Var.getLayoutDirection());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0016  */
    @Override // i2.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(i2.h0 h0Var) {
        l0.f fVarU1;
        if (this.f1157p) {
            a aVar = this.C;
            if (aVar == null) {
                fVarU1 = U1();
            } else {
                if (!aVar.f16640c) {
                    aVar = null;
                }
                if (aVar == null || (fVarU1 = aVar.f16641d) == null) {
                }
            }
            t2.a aVar2 = fVarU1.f16600j;
            if (aVar2 == null) {
                y.c.b("no paragraph (layoutCache=" + this.A + ", textSubstitution=" + this.C + ')');
                throw new pg.g();
            }
            w0 w0VarA = h0Var.f13901a.f24173b.a();
            boolean z10 = fVarU1.f16601k;
            if (z10) {
                float f10 = (int) (fVarU1.f16602l & BodyPartID.bodyIdMax);
                w0VarA.d();
                w0VarA.m(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, (int) (r3 >> 32), f10, 1);
            }
            try {
                t2.b0 b0Var = this.f16630r.f27852a;
                e3.i iVar = b0Var.f27787m;
                if (iVar == null) {
                    iVar = e3.i.f8364b;
                }
                e3.i iVar2 = iVar;
                e2 e2Var = b0Var.f27788n;
                if (e2Var == null) {
                    e2Var = e2.f21687d;
                }
                e2 e2Var2 = e2Var;
                s1.f fVar = b0Var.f27790p;
                if (fVar == null) {
                    fVar = s1.h.f24186a;
                }
                s1.f fVar2 = fVar;
                u0 u0VarL = b0Var.f27775a.l();
                if (u0VarL != null) {
                    aVar2.l(w0VarA, u0VarL, this.f16630r.f27852a.f27775a.i(), e2Var2, iVar2, fVar2);
                } else {
                    e1 e1Var = this.f16636y;
                    long jA = e1Var != null ? e1Var.a() : b1.f21654h;
                    if (jA == 16) {
                        jA = this.f16630r.b() != 16 ? this.f16630r.b() : b1.f21648b;
                    }
                    aVar2.k(w0VarA, jA, e2Var2, iVar2, fVar2);
                }
                if (z10) {
                    w0VarA.o();
                }
            } catch (Throwable th2) {
                if (z10) {
                    w0VarA.o();
                }
                throw th2;
            }
        }
    }
}
