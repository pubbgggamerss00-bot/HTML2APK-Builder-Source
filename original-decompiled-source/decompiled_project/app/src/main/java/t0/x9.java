package t0;

import com.yalantis.ucrop.view.CropImageView;
import g2.g1;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class x9 implements g2.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final eh.l<p1.h, pg.f0> f27382a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f27383b;

    /* renamed from: c, reason: collision with root package name */
    public final float f27384c;

    /* renamed from: d, reason: collision with root package name */
    public final z.f1 f27385d;

    public static final class a extends kotlin.jvm.internal.s implements eh.p<g2.p, Integer, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f27386a = new a(2);

        @Override // eh.p
        public final Integer invoke(g2.p pVar, Integer num) {
            return Integer.valueOf(pVar.z(num.intValue()));
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.p<g2.p, Integer, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f27387a = new b(2);

        @Override // eh.p
        public final Integer invoke(g2.p pVar, Integer num) {
            return Integer.valueOf(pVar.O(num.intValue()));
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f27388a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f27389b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f27390c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f27391d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f27392e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f27393f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f27394g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f27395h;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f27396j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f27397k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f27398l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ x9 f27399m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ g2.o0 f27400n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i10, int i11, g2.g1 g1Var, g2.g1 g1Var2, g2.g1 g1Var3, g2.g1 g1Var4, g2.g1 g1Var5, g2.g1 g1Var6, g2.g1 g1Var7, g2.g1 g1Var8, g2.g1 g1Var9, x9 x9Var, g2.o0 o0Var) {
            super(1);
            this.f27388a = i10;
            this.f27389b = i11;
            this.f27390c = g1Var;
            this.f27391d = g1Var2;
            this.f27392e = g1Var3;
            this.f27393f = g1Var4;
            this.f27394g = g1Var5;
            this.f27395h = g1Var6;
            this.f27396j = g1Var7;
            this.f27397k = g1Var8;
            this.f27398l = g1Var9;
            this.f27399m = x9Var;
            this.f27400n = o0Var;
        }

        @Override // eh.l
        public final pg.f0 invoke(g1.a aVar) {
            float f10;
            int iA;
            g1.a aVar2 = aVar;
            x9 x9Var = this.f27399m;
            float f11 = x9Var.f27384c;
            boolean z10 = x9Var.f27383b;
            g2.o0 o0Var = this.f27400n;
            float density = o0Var.getDensity();
            f3.r layoutDirection = o0Var.getLayoutDirection();
            z.f1 f1Var = x9Var.f27385d;
            float f12 = w9.f27292a;
            g1.a.f(aVar2, this.f27397k, 0L);
            float f13 = u0.t1.f29148b;
            g2.g1 g1Var = this.f27398l;
            int i10 = this.f27388a - (g1Var != null ? g1Var.f11383b : 0);
            int iB = gh.a.b(f1Var.c() * density);
            int iB2 = gh.a.b(androidx.compose.foundation.layout.f.f(f1Var, layoutDirection) * density);
            float f14 = u0.t1.f29149c * density;
            g2.g1 g1Var2 = this.f27390c;
            if (g1Var2 != null) {
                g1.a.g(aVar2, g1Var2, 0, org.bouncycastle.asn1.x509.a.a(1, CropImageView.DEFAULT_ASPECT_RATIO, (i10 - g1Var2.f11383b) / 2.0f));
            }
            g2.g1 g1Var3 = this.f27395h;
            if (g1Var3 != null) {
                if (z10) {
                    f10 = 2.0f;
                    iA = org.bouncycastle.asn1.x509.a.a(1, CropImageView.DEFAULT_ASPECT_RATIO, (i10 - g1Var3.f11383b) / 2.0f);
                } else {
                    f10 = 2.0f;
                    iA = iB;
                }
                g1.a.g(aVar2, g1Var3, gh.a.b(g1Var2 == null ? 0.0f : (1 - f11) * (g1Var2.f11382a - f14)) + iB2, h3.b.c(f11, iA, -(g1Var3.f11383b / 2)));
            } else {
                f10 = 2.0f;
            }
            g2.g1 g1Var4 = this.f27392e;
            if (g1Var4 != null) {
                g1.a.g(aVar2, g1Var4, g1Var2 != null ? g1Var2.f11382a : 0, w9.f(z10, i10, iB, g1Var3, g1Var4));
            }
            int i11 = (g1Var2 != null ? g1Var2.f11382a : 0) + (g1Var4 != null ? g1Var4.f11382a : 0);
            g2.g1 g1Var5 = this.f27394g;
            g1.a.g(aVar2, g1Var5, i11, w9.f(z10, i10, iB, g1Var3, g1Var5));
            g2.g1 g1Var6 = this.f27396j;
            if (g1Var6 != null) {
                g1.a.g(aVar2, g1Var6, i11, w9.f(z10, i10, iB, g1Var3, g1Var6));
            }
            int i12 = this.f27389b;
            g2.g1 g1Var7 = this.f27391d;
            g2.g1 g1Var8 = this.f27393f;
            if (g1Var8 != null) {
                g1.a.g(aVar2, g1Var8, (i12 - (g1Var7 != null ? g1Var7.f11382a : 0)) - g1Var8.f11382a, w9.f(z10, i10, iB, g1Var3, g1Var8));
            }
            if (g1Var7 != null) {
                g1.a.g(aVar2, g1Var7, i12 - g1Var7.f11382a, org.bouncycastle.asn1.x509.a.a(1, CropImageView.DEFAULT_ASPECT_RATIO, (i10 - g1Var7.f11383b) / f10));
            }
            if (g1Var != null) {
                g1.a.g(aVar2, g1Var, 0, i10);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class d extends kotlin.jvm.internal.s implements eh.p<g2.p, Integer, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f27401a = new d(2);

        @Override // eh.p
        public final Integer invoke(g2.p pVar, Integer num) {
            return Integer.valueOf(pVar.b0(num.intValue()));
        }
    }

    public static final class e extends kotlin.jvm.internal.s implements eh.p<g2.p, Integer, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f27402a = new e(2);

        @Override // eh.p
        public final Integer invoke(g2.p pVar, Integer num) {
            return Integer.valueOf(pVar.J(num.intValue()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x9(eh.l<? super p1.h, pg.f0> lVar, boolean z10, float f10, z.f1 f1Var) {
        this.f27382a = lVar;
        this.f27383b = z10;
        this.f27384c = f10;
        this.f27385d = f1Var;
    }

    public final int a(g2.q qVar, List<? extends g2.p> list, int i10, eh.p<? super g2.p, ? super Integer, Integer> pVar) {
        g2.p pVar2;
        int i11;
        int iIntValue;
        g2.p pVar3;
        int iIntValue2;
        g2.p pVar4;
        g2.p pVar5;
        int iIntValue3;
        g2.p pVar6;
        int i12;
        g2.p pVar7;
        g2.p pVar8;
        int size = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                pVar2 = null;
                break;
            }
            pVar2 = list.get(i13);
            if (kotlin.jvm.internal.r.a(u0.t1.d(pVar2), "Leading")) {
                break;
            }
            i13++;
        }
        g2.p pVar9 = pVar2;
        if (pVar9 != null) {
            int iO = pVar9.O(Integer.MAX_VALUE);
            float f10 = w9.f27292a;
            i11 = i10 == Integer.MAX_VALUE ? i10 : i10 - iO;
            iIntValue = pVar.invoke(pVar9, Integer.valueOf(i10)).intValue();
        } else {
            i11 = i10;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size2) {
                pVar3 = null;
                break;
            }
            pVar3 = list.get(i14);
            if (kotlin.jvm.internal.r.a(u0.t1.d(pVar3), "Trailing")) {
                break;
            }
            i14++;
        }
        g2.p pVar10 = pVar3;
        if (pVar10 != null) {
            int iO2 = pVar10.O(Integer.MAX_VALUE);
            float f11 = w9.f27292a;
            if (i11 != Integer.MAX_VALUE) {
                i11 -= iO2;
            }
            iIntValue2 = pVar.invoke(pVar10, Integer.valueOf(i10)).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size3) {
                pVar4 = null;
                break;
            }
            pVar4 = list.get(i15);
            if (kotlin.jvm.internal.r.a(u0.t1.d(pVar4), "Label")) {
                break;
            }
            i15++;
        }
        g2.p pVar11 = pVar4;
        int iIntValue4 = pVar11 != null ? pVar.invoke(pVar11, Integer.valueOf(h3.b.c(this.f27384c, i11, i10))).intValue() : 0;
        int size4 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size4) {
                pVar5 = null;
                break;
            }
            pVar5 = list.get(i16);
            if (kotlin.jvm.internal.r.a(u0.t1.d(pVar5), "Prefix")) {
                break;
            }
            i16++;
        }
        g2.p pVar12 = pVar5;
        if (pVar12 != null) {
            iIntValue3 = pVar.invoke(pVar12, Integer.valueOf(i11)).intValue();
            int iO3 = pVar12.O(Integer.MAX_VALUE);
            float f12 = w9.f27292a;
            if (i11 != Integer.MAX_VALUE) {
                i11 -= iO3;
            }
        } else {
            iIntValue3 = 0;
        }
        int size5 = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size5) {
                pVar6 = null;
                break;
            }
            pVar6 = list.get(i17);
            if (kotlin.jvm.internal.r.a(u0.t1.d(pVar6), "Suffix")) {
                break;
            }
            i17++;
        }
        g2.p pVar13 = pVar6;
        if (pVar13 != null) {
            int iIntValue5 = pVar.invoke(pVar13, Integer.valueOf(i11)).intValue();
            int iO4 = pVar13.O(Integer.MAX_VALUE);
            float f13 = w9.f27292a;
            if (i11 != Integer.MAX_VALUE) {
                i11 -= iO4;
            }
            i12 = iIntValue5;
        } else {
            i12 = 0;
        }
        int size6 = list.size();
        for (int i18 = 0; i18 < size6; i18++) {
            g2.p pVar14 = list.get(i18);
            if (kotlin.jvm.internal.r.a(u0.t1.d(pVar14), "TextField")) {
                int iIntValue6 = pVar.invoke(pVar14, Integer.valueOf(i11)).intValue();
                int size7 = list.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size7) {
                        pVar7 = null;
                        break;
                    }
                    pVar7 = list.get(i19);
                    if (kotlin.jvm.internal.r.a(u0.t1.d(pVar7), "Hint")) {
                        break;
                    }
                    i19++;
                }
                g2.p pVar15 = pVar7;
                int iIntValue7 = pVar15 != null ? pVar.invoke(pVar15, Integer.valueOf(i11)).intValue() : 0;
                int size8 = list.size();
                int i20 = 0;
                while (true) {
                    if (i20 >= size8) {
                        pVar8 = null;
                        break;
                    }
                    g2.p pVar16 = list.get(i20);
                    if (kotlin.jvm.internal.r.a(u0.t1.d(pVar16), "Supporting")) {
                        pVar8 = pVar16;
                        break;
                    }
                    i20++;
                }
                g2.p pVar17 = pVar8;
                return w9.d(iIntValue, iIntValue2, iIntValue3, i12, iIntValue6, iIntValue4, iIntValue7, pVar17 != null ? pVar.invoke(pVar17, Integer.valueOf(i10)).intValue() : 0, this.f27384c, u0.t1.f29147a, qVar.getDensity(), this.f27385d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final int b(g2.q qVar, List<? extends g2.p> list, int i10, eh.p<? super g2.p, ? super Integer, Integer> pVar) {
        g2.p pVar2;
        g2.p pVar3;
        g2.p pVar4;
        g2.p pVar5;
        g2.p pVar6;
        g2.p pVar7;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            g2.p pVar8 = list.get(i11);
            if (kotlin.jvm.internal.r.a(u0.t1.d(pVar8), "TextField")) {
                int iIntValue = pVar.invoke(pVar8, Integer.valueOf(i10)).intValue();
                int size2 = list.size();
                int i12 = 0;
                while (true) {
                    pVar2 = null;
                    if (i12 >= size2) {
                        pVar3 = null;
                        break;
                    }
                    pVar3 = list.get(i12);
                    if (kotlin.jvm.internal.r.a(u0.t1.d(pVar3), "Label")) {
                        break;
                    }
                    i12++;
                }
                g2.p pVar9 = pVar3;
                int iIntValue2 = pVar9 != null ? pVar.invoke(pVar9, Integer.valueOf(i10)).intValue() : 0;
                int size3 = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size3) {
                        pVar4 = null;
                        break;
                    }
                    pVar4 = list.get(i13);
                    if (kotlin.jvm.internal.r.a(u0.t1.d(pVar4), "Trailing")) {
                        break;
                    }
                    i13++;
                }
                g2.p pVar10 = pVar4;
                int iIntValue3 = pVar10 != null ? pVar.invoke(pVar10, Integer.valueOf(i10)).intValue() : 0;
                int size4 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size4) {
                        pVar5 = null;
                        break;
                    }
                    pVar5 = list.get(i14);
                    if (kotlin.jvm.internal.r.a(u0.t1.d(pVar5), "Leading")) {
                        break;
                    }
                    i14++;
                }
                g2.p pVar11 = pVar5;
                int iIntValue4 = pVar11 != null ? pVar.invoke(pVar11, Integer.valueOf(i10)).intValue() : 0;
                int size5 = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size5) {
                        pVar6 = null;
                        break;
                    }
                    pVar6 = list.get(i15);
                    if (kotlin.jvm.internal.r.a(u0.t1.d(pVar6), "Prefix")) {
                        break;
                    }
                    i15++;
                }
                g2.p pVar12 = pVar6;
                int iIntValue5 = pVar12 != null ? pVar.invoke(pVar12, Integer.valueOf(i10)).intValue() : 0;
                int size6 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size6) {
                        pVar7 = null;
                        break;
                    }
                    pVar7 = list.get(i16);
                    if (kotlin.jvm.internal.r.a(u0.t1.d(pVar7), "Suffix")) {
                        break;
                    }
                    i16++;
                }
                g2.p pVar13 = pVar7;
                int iIntValue6 = pVar13 != null ? pVar.invoke(pVar13, Integer.valueOf(i10)).intValue() : 0;
                int size7 = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size7) {
                        break;
                    }
                    g2.p pVar14 = list.get(i17);
                    if (kotlin.jvm.internal.r.a(u0.t1.d(pVar14), "Hint")) {
                        pVar2 = pVar14;
                        break;
                    }
                    i17++;
                }
                g2.p pVar15 = pVar2;
                return w9.e(iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, pVar15 != null ? pVar.invoke(pVar15, Integer.valueOf(i10)).intValue() : 0, this.f27384c, u0.t1.f29147a, qVar.getDensity(), this.f27385d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // g2.l0
    public final int c(g2.q qVar, List<? extends g2.p> list, int i10) {
        return b(qVar, list, i10, b.f27387a);
    }

    @Override // g2.l0
    public final int f(g2.q qVar, List<? extends g2.p> list, int i10) {
        return b(qVar, list, i10, e.f27402a);
    }

    @Override // g2.l0
    public final int g(g2.q qVar, List<? extends g2.p> list, int i10) {
        return a(qVar, list, i10, d.f27401a);
    }

    @Override // g2.l0
    public final g2.m0 h(g2.o0 o0Var, List<? extends g2.k0> list, long j10) {
        g2.k0 k0Var;
        g2.k0 k0Var2;
        g2.k0 k0Var3;
        g2.g1 g1Var;
        g2.g1 g1VarP;
        g2.k0 k0Var4;
        int i10;
        g2.g1 g1VarP2;
        int i11;
        g2.k0 k0Var5;
        g2.k0 k0Var6;
        g2.k0 k0Var7;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        x9 x9Var = this;
        List<? extends g2.k0> list2 = list;
        z.f1 f1Var = x9Var.f27385d;
        int iB1 = o0Var.b1(f1Var.a());
        long jB = f3.b.b(j10, 0, 0, 0, 0, 10);
        int size = list2.size();
        int i20 = 0;
        while (true) {
            if (i20 >= size) {
                k0Var = null;
                break;
            }
            k0Var = list2.get(i20);
            if (kotlin.jvm.internal.r.a(androidx.compose.ui.layout.a.a(k0Var), "Leading")) {
                break;
            }
            i20++;
        }
        g2.k0 k0Var8 = k0Var;
        g2.g1 g1VarP3 = k0Var8 != null ? k0Var8.P(jB) : null;
        float f10 = u0.t1.f29148b;
        int i21 = g1VarP3 != null ? g1VarP3.f11382a : 0;
        int iMax = Math.max(0, g1VarP3 != null ? g1VarP3.f11383b : 0);
        int size2 = list2.size();
        int i22 = 0;
        while (true) {
            if (i22 >= size2) {
                k0Var2 = null;
                break;
            }
            k0Var2 = list2.get(i22);
            if (kotlin.jvm.internal.r.a(androidx.compose.ui.layout.a.a(k0Var2), "Trailing")) {
                break;
            }
            i22++;
        }
        g2.k0 k0Var9 = k0Var2;
        g2.g1 g1VarP4 = k0Var9 != null ? k0Var9.P(f3.c.j(-i21, 0, 2, jB)) : null;
        int i23 = i21 + (g1VarP4 != null ? g1VarP4.f11382a : 0);
        int iMax2 = Math.max(iMax, g1VarP4 != null ? g1VarP4.f11383b : 0);
        int size3 = list2.size();
        int i24 = 0;
        while (true) {
            if (i24 >= size3) {
                k0Var3 = null;
                break;
            }
            k0Var3 = list2.get(i24);
            if (kotlin.jvm.internal.r.a(androidx.compose.ui.layout.a.a(k0Var3), "Prefix")) {
                break;
            }
            i24++;
        }
        g2.k0 k0Var10 = k0Var3;
        if (k0Var10 != null) {
            g1Var = g1VarP3;
            g1VarP = k0Var10.P(f3.c.j(-i23, 0, 2, jB));
        } else {
            g1Var = g1VarP3;
            g1VarP = null;
        }
        int i25 = i23 + (g1VarP != null ? g1VarP.f11382a : 0);
        int iMax3 = Math.max(iMax2, g1VarP != null ? g1VarP.f11383b : 0);
        int size4 = list2.size();
        int i26 = 0;
        while (true) {
            if (i26 >= size4) {
                k0Var4 = null;
                break;
            }
            k0Var4 = list2.get(i26);
            if (kotlin.jvm.internal.r.a(androidx.compose.ui.layout.a.a(k0Var4), "Suffix")) {
                break;
            }
            i26++;
        }
        g2.k0 k0Var11 = k0Var4;
        if (k0Var11 != null) {
            i10 = i25;
            g1VarP2 = k0Var11.P(f3.c.j(-i25, 0, 2, jB));
        } else {
            i10 = i25;
            g1VarP2 = null;
        }
        int i27 = i10 + (g1VarP2 != null ? g1VarP2.f11382a : 0);
        int iMax4 = Math.max(iMax3, g1VarP2 != null ? g1VarP2.f11383b : 0);
        int iB12 = o0Var.b1(f1Var.d(o0Var.getLayoutDirection())) + o0Var.b1(f1Var.b(o0Var.getLayoutDirection()));
        int i28 = -i27;
        int iC = h3.b.c(x9Var.f27384c, i28 - iB12, -iB12);
        int i29 = -iB1;
        long jI = f3.c.i(iC, i29, jB);
        int size5 = list2.size();
        int i30 = 0;
        while (true) {
            if (i30 >= size5) {
                i11 = iB1;
                k0Var5 = null;
                break;
            }
            k0Var5 = list2.get(i30);
            int i31 = i30;
            i11 = iB1;
            if (kotlin.jvm.internal.r.a(androidx.compose.ui.layout.a.a(k0Var5), "Label")) {
                break;
            }
            i30 = i31 + 1;
            iB1 = i11;
        }
        g2.k0 k0Var12 = k0Var5;
        g2.g1 g1VarP5 = k0Var12 != null ? k0Var12.P(jI) : null;
        x9Var.f27382a.invoke(new p1.h(g1VarP5 != null ? d0.h.a(g1VarP5.f11382a, g1VarP5.f11383b) : 0L));
        int size6 = list2.size();
        int i32 = 0;
        while (true) {
            if (i32 >= size6) {
                k0Var6 = null;
                break;
            }
            k0Var6 = list2.get(i32);
            int i33 = size6;
            if (kotlin.jvm.internal.r.a(androidx.compose.ui.layout.a.a(k0Var6), "Supporting")) {
                break;
            }
            i32++;
            size6 = i33;
        }
        g2.k0 k0Var13 = k0Var6;
        int iB0 = k0Var13 != null ? k0Var13.b0(f3.b.k(j10)) : 0;
        int iMax5 = Math.max((g1VarP5 != null ? g1VarP5.f11383b : 0) / 2, o0Var.b1(f1Var.c()));
        long jB2 = f3.b.b(f3.c.i(i28, (i29 - iMax5) - iB0, j10), 0, 0, 0, 0, 11);
        int size7 = list2.size();
        int i34 = 0;
        while (i34 < size7) {
            g2.k0 k0Var14 = list2.get(i34);
            int i35 = i34;
            int i36 = size7;
            if (kotlin.jvm.internal.r.a(androidx.compose.ui.layout.a.a(k0Var14), "TextField")) {
                g2.g1 g1VarP6 = k0Var14.P(jB2);
                long jB3 = f3.b.b(jB2, 0, 0, 0, 0, 14);
                int size8 = list2.size();
                int i37 = 0;
                while (true) {
                    if (i37 >= size8) {
                        k0Var7 = null;
                        break;
                    }
                    k0Var7 = list2.get(i37);
                    int i38 = size8;
                    int i39 = i37;
                    if (kotlin.jvm.internal.r.a(androidx.compose.ui.layout.a.a(k0Var7), "Hint")) {
                        break;
                    }
                    i37 = i39 + 1;
                    size8 = i38;
                }
                g2.k0 k0Var15 = k0Var7;
                g2.g1 g1VarP7 = k0Var15 != null ? k0Var15.P(jB3) : null;
                int iMax6 = Math.max(iMax4, Math.max(g1VarP6.f11383b, g1VarP7 != null ? g1VarP7.f11383b : 0) + iMax5 + i11);
                g2.g1 g1Var2 = g1Var;
                int i40 = g1Var != null ? g1Var2.f11382a : 0;
                int i41 = g1VarP4 != null ? g1VarP4.f11382a : 0;
                if (g1VarP != null) {
                    i12 = g1VarP.f11382a;
                    i40 = i40;
                } else {
                    i12 = 0;
                }
                if (g1VarP2 != null) {
                    i13 = i40;
                    i14 = g1VarP2.f11382a;
                } else {
                    i13 = i40;
                    i14 = 0;
                }
                int i42 = g1VarP6.f11382a;
                if (g1VarP5 != null) {
                    i17 = g1VarP5.f11382a;
                    i16 = i13;
                    i15 = i42;
                } else {
                    int i43 = i13;
                    i15 = i42;
                    i16 = i43;
                    i17 = 0;
                }
                if (g1VarP7 != null) {
                    i18 = g1VarP7.f11382a;
                    i16 = i16;
                } else {
                    i18 = 0;
                }
                int iE = w9.e(i16, i41, i12, i14, i15, i17, i18, x9Var.f27384c, j10, o0Var.getDensity(), x9Var.f27385d);
                int i44 = 0;
                int i45 = iE;
                g2.g1 g1VarP8 = k0Var13 != null ? k0Var13.P(f3.b.b(f3.c.j(0, -iMax6, 1, jB), 0, iE, 0, 0, 9)) : null;
                int i46 = g1VarP8 != null ? g1VarP8.f11383b : 0;
                int i47 = g1Var2 != null ? g1Var2.f11383b : 0;
                if (g1VarP4 != null) {
                    i19 = 0;
                    i44 = g1VarP4.f11383b;
                } else {
                    i19 = 0;
                }
                g2.g1 g1Var3 = g1VarP;
                g2.g1 g1Var4 = g1VarP5;
                int iD = w9.d(i47, i44, g1VarP != null ? g1VarP.f11383b : i19, g1VarP2 != null ? g1VarP2.f11383b : i19, g1VarP6.f11383b, g1VarP5 != null ? g1VarP5.f11383b : i19, g1VarP7 != null ? g1VarP7.f11383b : i19, g1VarP8 != null ? g1VarP8.f11383b : i19, x9Var.f27384c, j10, o0Var.getDensity(), x9Var.f27385d);
                int i48 = iD - i46;
                int size9 = list2.size();
                int i49 = i19;
                while (i49 < size9) {
                    g2.k0 k0Var16 = list2.get(i49);
                    if (kotlin.jvm.internal.r.a(androidx.compose.ui.layout.a.a(k0Var16), "Container")) {
                        g2.g1 g1VarP9 = k0Var16.P(f3.c.a(i45 != Integer.MAX_VALUE ? i45 : i19, i45, i48 != Integer.MAX_VALUE ? i48 : i19, i48));
                        g2.g1 g1Var5 = g1VarP6;
                        g2.g1 g1Var6 = g1VarP8;
                        int i50 = i45;
                        return o0Var.i0(i50, iD, qg.a0.f22708a, new c(iD, i50, g1Var2, g1VarP4, g1Var3, g1VarP2, g1Var5, g1Var4, g1VarP7, g1VarP9, g1Var6, x9Var, o0Var));
                    }
                    i49++;
                    i45 = i45;
                    g1VarP8 = g1VarP8;
                    g1VarP6 = g1VarP6;
                    g1Var3 = g1Var3;
                    g1VarP2 = g1VarP2;
                    g1Var2 = g1Var2;
                    x9Var = this;
                    list2 = list;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i34 = i35 + 1;
            x9Var = this;
            list2 = list;
            g1VarP2 = g1VarP2;
            size7 = i36;
            jB2 = jB2;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // g2.l0
    public final int i(g2.q qVar, List<? extends g2.p> list, int i10) {
        return a(qVar, list, i10, a.f27386a);
    }
}
