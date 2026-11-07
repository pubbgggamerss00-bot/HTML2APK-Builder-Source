package b0;

import android.view.View;
import androidx.activity.m;
import androidx.camera.camera2.internal.p0;
import b0.d;
import c0.f;
import c0.n;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.yw;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class e {
    public int A;
    public float B;
    public final int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public final d J;
    public final d K;
    public final d L;
    public final d M;
    public final d N;
    public final d O;
    public final d P;
    public final d Q;
    public final d[] R;
    public final ArrayList<d> S;
    public final boolean[] T;
    public final a[] U;
    public e V;
    public int W;
    public int X;
    public float Y;
    public int Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f1894a0;

    /* renamed from: b, reason: collision with root package name */
    public c0.c f1895b;

    /* renamed from: b0, reason: collision with root package name */
    public int f1896b0;

    /* renamed from: c, reason: collision with root package name */
    public c0.c f1897c;

    /* renamed from: c0, reason: collision with root package name */
    public int f1898c0;

    /* renamed from: d0, reason: collision with root package name */
    public int f1900d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f1902e0;

    /* renamed from: f0, reason: collision with root package name */
    public float f1904f0;

    /* renamed from: g0, reason: collision with root package name */
    public float f1906g0;

    /* renamed from: h0, reason: collision with root package name */
    public View f1907h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f1909i0;

    /* renamed from: j, reason: collision with root package name */
    public String f1910j;

    /* renamed from: j0, reason: collision with root package name */
    public String f1911j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1912k;

    /* renamed from: k0, reason: collision with root package name */
    public int f1913k0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1914l;

    /* renamed from: l0, reason: collision with root package name */
    public int f1915l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1916m;

    /* renamed from: m0, reason: collision with root package name */
    public final float[] f1917m0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1918n;

    /* renamed from: n0, reason: collision with root package name */
    public final e[] f1919n0;

    /* renamed from: o, reason: collision with root package name */
    public int f1920o;

    /* renamed from: o0, reason: collision with root package name */
    public final e[] f1921o0;

    /* renamed from: p, reason: collision with root package name */
    public int f1922p;
    public int p0;

    /* renamed from: q, reason: collision with root package name */
    public int f1923q;

    /* renamed from: q0, reason: collision with root package name */
    public int f1924q0;

    /* renamed from: r, reason: collision with root package name */
    public int f1925r;
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f1926t;

    /* renamed from: u, reason: collision with root package name */
    public int f1927u;

    /* renamed from: v, reason: collision with root package name */
    public int f1928v;

    /* renamed from: w, reason: collision with root package name */
    public float f1929w;

    /* renamed from: x, reason: collision with root package name */
    public int f1930x;

    /* renamed from: y, reason: collision with root package name */
    public int f1931y;

    /* renamed from: z, reason: collision with root package name */
    public float f1932z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f1893a = false;

    /* renamed from: d, reason: collision with root package name */
    public c0.l f1899d = null;

    /* renamed from: e, reason: collision with root package name */
    public n f1901e = null;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f1903f = {true, true};

    /* renamed from: g, reason: collision with root package name */
    public boolean f1905g = true;
    public int h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f1908i = -1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a {
        public static final a s;

        /* renamed from: t, reason: collision with root package name */
        public static final a f1933t;

        /* renamed from: u, reason: collision with root package name */
        public static final a f1934u;

        /* renamed from: v, reason: collision with root package name */
        public static final a f1935v;

        /* renamed from: w, reason: collision with root package name */
        public static final /* synthetic */ a[] f1936w;

        static {
            a aVar = new a("FIXED", 0);
            s = aVar;
            a aVar2 = new a("WRAP_CONTENT", 1);
            f1933t = aVar2;
            a aVar3 = new a("MATCH_CONSTRAINT", 2);
            f1934u = aVar3;
            a aVar4 = new a("MATCH_PARENT", 3);
            f1935v = aVar4;
            f1936w = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f1936w.clone();
        }
    }

    public e() {
        new HashMap();
        this.f1912k = false;
        this.f1914l = false;
        this.f1916m = false;
        this.f1918n = false;
        this.f1920o = -1;
        this.f1922p = -1;
        this.f1923q = 0;
        this.f1925r = 0;
        this.s = 0;
        this.f1926t = new int[2];
        this.f1927u = 0;
        this.f1928v = 0;
        this.f1929w = 1.0f;
        this.f1930x = 0;
        this.f1931y = 0;
        this.f1932z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.D = Float.NaN;
        this.E = false;
        this.G = false;
        this.H = 0;
        this.I = 0;
        d dVar = new d(this, d.a.s);
        this.J = dVar;
        d dVar2 = new d(this, d.a.f1886t);
        this.K = dVar2;
        d dVar3 = new d(this, d.a.f1887u);
        this.L = dVar3;
        d dVar4 = new d(this, d.a.f1888v);
        this.M = dVar4;
        d dVar5 = new d(this, d.a.f1889w);
        this.N = dVar5;
        d dVar6 = new d(this, d.a.f1891y);
        this.O = dVar6;
        d dVar7 = new d(this, d.a.f1892z);
        this.P = dVar7;
        d dVar8 = new d(this, d.a.f1890x);
        this.Q = dVar8;
        this.R = new d[]{dVar, dVar3, dVar2, dVar4, dVar5, dVar8};
        ArrayList<d> arrayList = new ArrayList<>();
        this.S = arrayList;
        this.T = new boolean[2];
        a aVar = a.s;
        this.U = new a[]{aVar, aVar};
        this.V = null;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.f1894a0 = 0;
        this.f1896b0 = 0;
        this.f1898c0 = 0;
        this.f1904f0 = 0.5f;
        this.f1906g0 = 0.5f;
        this.f1909i0 = 0;
        this.f1911j0 = null;
        this.f1913k0 = 0;
        this.f1915l0 = 0;
        this.f1917m0 = new float[]{-1.0f, -1.0f};
        this.f1919n0 = new e[]{null, null};
        this.f1921o0 = new e[]{null, null};
        this.p0 = -1;
        this.f1924q0 = -1;
        arrayList.add(dVar);
        arrayList.add(dVar2);
        arrayList.add(dVar3);
        arrayList.add(dVar4);
        arrayList.add(dVar6);
        arrayList.add(dVar7);
        arrayList.add(dVar8);
        arrayList.add(dVar5);
    }

    public static void G(int i6, int i7, String str, StringBuilder sb) {
        if (i6 == i7) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i6);
        sb.append(",\n");
    }

    public static void H(StringBuilder sb, String str, float f6, float f7) {
        if (f6 == f7) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f6);
        sb.append(",\n");
    }

    public static void o(StringBuilder sb, String str, int i6, int i7, int i8, int i9, int i10, float f6, a aVar) {
        sb.append(str);
        sb.append(" :  {\n");
        String string = aVar.toString();
        if (!"FIXED".equals(string)) {
            sb.append("      behavior");
            sb.append(" :   ");
            sb.append(string);
            sb.append(",\n");
        }
        G(i6, 0, "      size", sb);
        G(i7, 0, "      min", sb);
        G(i8, Integer.MAX_VALUE, "      max", sb);
        G(i9, 0, "      matchMin", sb);
        G(i10, 0, "      matchDef", sb);
        H(sb, "      matchPercent", f6, 1.0f);
        sb.append("    },\n");
    }

    public static void p(StringBuilder sb, String str, d dVar) {
        if (dVar.f1883f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(dVar.f1883f);
        sb.append("'");
        if (dVar.h != Integer.MIN_VALUE || dVar.f1884g != 0) {
            sb.append(",");
            sb.append(dVar.f1884g);
            if (dVar.h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(dVar.h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public boolean A() {
        if (this.f1912k) {
            return true;
        }
        return this.J.f1880c && this.L.f1880c;
    }

    public boolean B() {
        if (this.f1914l) {
            return true;
        }
        return this.K.f1880c && this.M.f1880c;
    }

    public void C() {
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.Q.j();
        this.V = null;
        this.D = Float.NaN;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.f1894a0 = 0;
        this.f1896b0 = 0;
        this.f1898c0 = 0;
        this.f1900d0 = 0;
        this.f1902e0 = 0;
        this.f1904f0 = 0.5f;
        this.f1906g0 = 0.5f;
        a[] aVarArr = this.U;
        a aVar = a.s;
        aVarArr[0] = aVar;
        aVarArr[1] = aVar;
        this.f1907h0 = null;
        this.f1909i0 = 0;
        this.f1913k0 = 0;
        this.f1915l0 = 0;
        float[] fArr = this.f1917m0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f1920o = -1;
        this.f1922p = -1;
        int[] iArr = this.C;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f1925r = 0;
        this.s = 0;
        this.f1929w = 1.0f;
        this.f1932z = 1.0f;
        this.f1928v = Integer.MAX_VALUE;
        this.f1931y = Integer.MAX_VALUE;
        this.f1927u = 0;
        this.f1930x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f1903f;
        zArr[0] = true;
        zArr[1] = true;
        this.G = false;
        boolean[] zArr2 = this.T;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f1905g = true;
        int[] iArr2 = this.f1926t;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.h = -1;
        this.f1908i = -1;
    }

    public final void D() {
        e eVar = this.V;
        if (eVar != null && (eVar instanceof f)) {
            ((f) eVar).getClass();
        }
        ArrayList<d> arrayList = this.S;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            arrayList.get(i6).j();
        }
    }

    public final void E() {
        this.f1912k = false;
        this.f1914l = false;
        this.f1916m = false;
        this.f1918n = false;
        ArrayList<d> arrayList = this.S;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            d dVar = arrayList.get(i6);
            dVar.f1880c = false;
            dVar.f1879b = 0;
        }
    }

    public void F(yw ywVar) {
        this.J.k();
        this.K.k();
        this.L.k();
        this.M.k();
        this.N.k();
        this.Q.k();
        this.O.k();
        this.P.k();
    }

    public final void I(int i6) {
        this.f1898c0 = i6;
        this.E = i6 > 0;
    }

    public final void J(int i6, int i7) {
        if (this.f1912k) {
            return;
        }
        this.J.l(i6);
        this.L.l(i7);
        this.f1894a0 = i6;
        this.W = i7 - i6;
        this.f1912k = true;
    }

    public final void K(int i6, int i7) {
        if (this.f1914l) {
            return;
        }
        this.K.l(i6);
        this.M.l(i7);
        this.f1896b0 = i6;
        this.X = i7 - i6;
        if (this.E) {
            this.N.l(i6 + this.f1898c0);
        }
        this.f1914l = true;
    }

    public final void L(int i6) {
        this.X = i6;
        int i7 = this.f1902e0;
        if (i6 < i7) {
            this.X = i7;
        }
    }

    public final void M(a aVar) {
        this.U[0] = aVar;
    }

    public final void N(a aVar) {
        this.U[1] = aVar;
    }

    public final void O(int i6) {
        this.W = i6;
        int i7 = this.f1900d0;
        if (i6 < i7) {
            this.W = i7;
        }
    }

    public void P(boolean z6, boolean z7) {
        int i6;
        int i7;
        c0.l lVar = this.f1899d;
        boolean z8 = z6 & lVar.f2117g;
        n nVar = this.f1901e;
        boolean z9 = z7 & nVar.f2117g;
        int i8 = lVar.h.f2086g;
        int i9 = nVar.h.f2086g;
        int i10 = lVar.f2118i.f2086g;
        int i11 = nVar.f2118i.f2086g;
        int i12 = i11 - i9;
        if (i10 - i8 < 0 || i12 < 0 || i8 == Integer.MIN_VALUE || i8 == Integer.MAX_VALUE || i9 == Integer.MIN_VALUE || i9 == Integer.MAX_VALUE || i10 == Integer.MIN_VALUE || i10 == Integer.MAX_VALUE || i11 == Integer.MIN_VALUE || i11 == Integer.MAX_VALUE) {
            i10 = 0;
            i11 = 0;
            i8 = 0;
            i9 = 0;
        }
        int i13 = i10 - i8;
        int i14 = i11 - i9;
        if (z8) {
            this.f1894a0 = i8;
        }
        if (z9) {
            this.f1896b0 = i9;
        }
        if (this.f1909i0 == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        a aVar = a.s;
        a[] aVarArr = this.U;
        if (z8) {
            if (aVarArr[0] == aVar && i13 < (i7 = this.W)) {
                i13 = i7;
            }
            this.W = i13;
            int i15 = this.f1900d0;
            if (i13 < i15) {
                this.W = i15;
            }
        }
        if (z9) {
            if (aVarArr[1] == aVar && i14 < (i6 = this.X)) {
                i14 = i6;
            }
            this.X = i14;
            int i16 = this.f1902e0;
            if (i14 < i16) {
                this.X = i16;
            }
        }
    }

    public void Q(z.c cVar, boolean z6) {
        int i6;
        int i7;
        n nVar;
        c0.l lVar;
        cVar.getClass();
        int iN = z.c.n(this.J);
        int iN2 = z.c.n(this.K);
        int iN3 = z.c.n(this.L);
        int iN4 = z.c.n(this.M);
        if (z6 && (lVar = this.f1899d) != null) {
            c0.f fVar = lVar.h;
            if (fVar.f2088j) {
                c0.f fVar2 = lVar.f2118i;
                if (fVar2.f2088j) {
                    iN = fVar.f2086g;
                    iN3 = fVar2.f2086g;
                }
            }
        }
        if (z6 && (nVar = this.f1901e) != null) {
            c0.f fVar3 = nVar.h;
            if (fVar3.f2088j) {
                c0.f fVar4 = nVar.f2118i;
                if (fVar4.f2088j) {
                    iN2 = fVar3.f2086g;
                    iN4 = fVar4.f2086g;
                }
            }
        }
        int i8 = iN4 - iN2;
        if (iN3 - iN < 0 || i8 < 0 || iN == Integer.MIN_VALUE || iN == Integer.MAX_VALUE || iN2 == Integer.MIN_VALUE || iN2 == Integer.MAX_VALUE || iN3 == Integer.MIN_VALUE || iN3 == Integer.MAX_VALUE || iN4 == Integer.MIN_VALUE || iN4 == Integer.MAX_VALUE) {
            iN = 0;
            iN2 = 0;
            iN3 = 0;
            iN4 = 0;
        }
        int i9 = iN3 - iN;
        int i10 = iN4 - iN2;
        this.f1894a0 = iN;
        this.f1896b0 = iN2;
        if (this.f1909i0 == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        a[] aVarArr = this.U;
        a aVar = aVarArr[0];
        a aVar2 = a.s;
        if (aVar == aVar2 && i9 < (i7 = this.W)) {
            i9 = i7;
        }
        if (aVarArr[1] == aVar2 && i10 < (i6 = this.X)) {
            i10 = i6;
        }
        this.W = i9;
        this.X = i10;
        int i11 = this.f1902e0;
        if (i10 < i11) {
            this.X = i11;
        }
        int i12 = this.f1900d0;
        if (i9 < i12) {
            this.W = i12;
        }
        int i13 = this.f1928v;
        a aVar3 = a.f1934u;
        if (i13 > 0 && aVar == aVar3) {
            this.W = Math.min(this.W, i13);
        }
        int i14 = this.f1931y;
        if (i14 > 0 && aVarArr[1] == aVar3) {
            this.X = Math.min(this.X, i14);
        }
        int i15 = this.W;
        if (i9 != i15) {
            this.h = i15;
        }
        int i16 = this.X;
        if (i10 != i16) {
            this.f1908i = i16;
        }
    }

    public final void a(f fVar, z.c cVar, HashSet<e> hashSet, int i6, boolean z6) {
        if (z6) {
            if (!hashSet.contains(this)) {
                return;
            }
            j.a(fVar, cVar, this);
            hashSet.remove(this);
            b(cVar, fVar.W(64));
        }
        if (i6 == 0) {
            HashSet<d> hashSet2 = this.J.f1878a;
            if (hashSet2 != null) {
                Iterator<d> it = hashSet2.iterator();
                while (it.hasNext()) {
                    it.next().f1881d.a(fVar, cVar, hashSet, i6, true);
                }
            }
            HashSet<d> hashSet3 = this.L.f1878a;
            if (hashSet3 != null) {
                Iterator<d> it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    it2.next().f1881d.a(fVar, cVar, hashSet, i6, true);
                }
                return;
            }
            return;
        }
        HashSet<d> hashSet4 = this.K.f1878a;
        if (hashSet4 != null) {
            Iterator<d> it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                it3.next().f1881d.a(fVar, cVar, hashSet, i6, true);
            }
        }
        HashSet<d> hashSet5 = this.M.f1878a;
        if (hashSet5 != null) {
            Iterator<d> it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                it4.next().f1881d.a(fVar, cVar, hashSet, i6, true);
            }
        }
        HashSet<d> hashSet6 = this.N.f1878a;
        if (hashSet6 != null) {
            Iterator<d> it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                it5.next().f1881d.a(fVar, cVar, hashSet, i6, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0105  */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36, types: [int] */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r13v49, types: [b0.f] */
    /* JADX WARN: Type inference failed for: r18v14 */
    /* JADX WARN: Type inference failed for: r18v15 */
    /* JADX WARN: Type inference failed for: r18v18 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r20v13 */
    /* JADX WARN: Type inference failed for: r20v15 */
    /* JADX WARN: Type inference failed for: r20v16 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r27v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r27v9 */
    /* JADX WARN: Type inference failed for: r61v0, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r9v12, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(z.c cVar, boolean z6) {
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        ?? r20;
        ?? r18;
        int i6;
        boolean z11;
        boolean z12;
        e eVar;
        e eVar2;
        boolean[] zArr;
        d dVar;
        boolean[] zArr2;
        d dVar2;
        boolean z13;
        boolean z14;
        int i7;
        int i8;
        a[] aVarArr;
        float f6;
        z.e eVar3;
        z.e eVar4;
        boolean z15;
        int i9;
        int i10;
        boolean z16;
        int i11;
        boolean z17;
        d dVar3;
        int i12;
        int[] iArr;
        z.e eVar5;
        a aVar;
        z.e eVar6;
        d dVar4;
        int i13;
        int[] iArr2;
        boolean z18;
        a aVar2;
        d dVar5;
        d dVar6;
        z.e eVar7;
        z.e eVar8;
        z.e eVar9;
        boolean[] zArr3;
        boolean z19;
        boolean z20;
        z.e eVar10;
        z.e eVar11;
        z.e eVar12;
        int i14;
        int i15;
        int i16;
        int i17;
        z.e eVar13;
        z.e eVar14;
        n nVar;
        boolean z21;
        c0.l lVar;
        int i18;
        boolean zX;
        ?? r12;
        boolean zY;
        c0.l lVar2;
        n nVar2;
        boolean z22;
        z.c cVar2 = cVar;
        d dVar7 = this.J;
        z.e eVarK = cVar2.k(dVar7);
        d dVar8 = this.L;
        z.e eVarK2 = cVar2.k(dVar8);
        d dVar9 = this.K;
        z.e eVarK3 = cVar2.k(dVar9);
        d dVar10 = this.M;
        z.e eVarK4 = cVar2.k(dVar10);
        d dVar11 = this.N;
        z.e eVarK5 = cVar2.k(dVar11);
        e eVar15 = this.V;
        a aVar3 = a.f1933t;
        if (eVar15 != null) {
            a[] aVarArr2 = eVar15.U;
            r18 = 0;
            z8 = false;
            r18 = 0;
            z10 = aVarArr2[0] == aVar3;
            boolean z23 = aVarArr2[1] == aVar3;
            int i19 = this.f1923q;
            if (i19 != 1) {
                boolean z24 = true;
                if (i19 != 2) {
                    z7 = z24;
                    if (i19 != 3) {
                    }
                } else {
                    z10 = false;
                }
                z9 = z23;
                r20 = z24;
            } else {
                r20 = 1;
                z9 = false;
            }
            i6 = this.f1909i0;
            boolean z25 = z9;
            boolean[] zArr4 = this.T;
            if (i6 != 8) {
                ArrayList<d> arrayList = this.S;
                int size = arrayList.size();
                z11 = z10;
                int i20 = r18;
                while (true) {
                    if (i20 < size) {
                        int i21 = size;
                        HashSet<d> hashSet = arrayList.get(i20).f1878a;
                        if (hashSet != null && hashSet.size() > 0) {
                            break;
                        }
                        i20++;
                        size = i21;
                    } else if (!zArr4[r18] && !zArr4[r20]) {
                        return;
                    }
                }
            } else {
                z11 = z10;
            }
            z12 = this.f1912k;
            if (!z12 || this.f1914l) {
                if (z12) {
                    cVar2.d(eVarK, this.f1894a0);
                    cVar2.d(eVarK2, this.f1894a0 + this.W);
                    if (z11 && (eVar2 = this.V) != null) {
                        f fVar = (f) eVar2;
                        WeakReference<d> weakReference = fVar.I0;
                        if (weakReference == null || weakReference.get() == null || dVar7.d() > fVar.I0.get().d()) {
                            fVar.I0 = new WeakReference<>(dVar7);
                        }
                        WeakReference<d> weakReference2 = fVar.K0;
                        if (weakReference2 == null || weakReference2.get() == null || dVar8.d() > fVar.K0.get().d()) {
                            fVar.K0 = new WeakReference<>(dVar8);
                        }
                    }
                }
                if (this.f1914l) {
                    cVar2.d(eVarK3, this.f1896b0);
                    cVar2.d(eVarK4, this.f1896b0 + this.X);
                    HashSet<d> hashSet2 = dVar11.f1878a;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        cVar2.d(eVarK5, this.f1896b0 + this.f1898c0);
                    }
                    if (z25 && (eVar = this.V) != null) {
                        f fVar2 = (f) eVar;
                        WeakReference<d> weakReference3 = fVar2.H0;
                        if (weakReference3 == null || weakReference3.get() == null || dVar9.d() > fVar2.H0.get().d()) {
                            fVar2.H0 = new WeakReference<>(dVar9);
                        }
                        WeakReference<d> weakReference4 = fVar2.J0;
                        if (weakReference4 == null || weakReference4.get() == null || dVar10.d() > fVar2.J0.get().d()) {
                            fVar2.J0 = new WeakReference<>(dVar10);
                        }
                    }
                }
                if (this.f1912k && this.f1914l) {
                    boolean z26 = r18;
                    this.f1912k = z26;
                    this.f1914l = z26;
                    return;
                }
            }
            zArr = this.f1903f;
            if (z6 || (lVar2 = this.f1899d) == null || (nVar2 = this.f1901e) == null) {
                dVar = dVar11;
                zArr2 = zArr;
            } else {
                dVar = dVar11;
                c0.f fVar3 = lVar2.h;
                zArr2 = zArr;
                if (fVar3.f2088j && lVar2.f2118i.f2088j && nVar2.h.f2088j && nVar2.f2118i.f2088j) {
                    cVar2.d(eVarK, fVar3.f2086g);
                    cVar2.d(eVarK2, this.f1899d.f2118i.f2086g);
                    cVar2.d(eVarK3, this.f1901e.h.f2086g);
                    cVar2.d(eVarK4, this.f1901e.f2118i.f2086g);
                    cVar2.d(eVarK5, this.f1901e.f2103k.f2086g);
                    if (this.V == null) {
                        z22 = false;
                    } else {
                        if (z11 && zArr2[0] && !x()) {
                            cVar2.f(cVar2.k(this.V.L), eVarK2, 0, 8);
                        }
                        if (z25 && zArr2[r20] && !y()) {
                            z22 = false;
                            cVar2.f(cVar2.k(this.V.M), eVarK4, 0, 8);
                        }
                    }
                    this.f1912k = z22;
                    this.f1914l = z22;
                    return;
                }
            }
            if (this.V == null) {
                if (w(0)) {
                    ((f) this.V).S(this, 0);
                    zX = r20;
                    r12 = zX;
                } else {
                    zX = x();
                    r12 = r20;
                }
                if (w(r12)) {
                    ((f) this.V).S(this, r12);
                    zY = true;
                } else {
                    zY = y();
                }
                if (!zX && z11 && this.f1909i0 != 8 && dVar7.f1883f == null && dVar8.f1883f == null) {
                    dVar2 = dVar7;
                    cVar2.f(cVar2.k(this.V.L), eVarK2, 0, 1);
                } else {
                    dVar2 = dVar7;
                }
                if (!zY && z25 && this.f1909i0 != 8 && dVar9.f1883f == null && dVar10.f1883f == null && dVar == null) {
                    cVar2.f(cVar2.k(this.V.M), eVarK4, 0, 1);
                }
                z13 = zY;
                z14 = zX;
            } else {
                dVar2 = dVar7;
                z13 = false;
                z14 = false;
            }
            i7 = this.W;
            i8 = this.f1900d0;
            if (i7 >= i8) {
                i8 = i7;
            }
            int i22 = this.X;
            boolean z27 = z13;
            int i23 = this.f1902e0;
            int i24 = i22 >= i23 ? i23 : i22;
            aVarArr = this.U;
            a aVar4 = aVarArr[0];
            a aVar5 = a.f1934u;
            boolean z28 = aVar4 == aVar5;
            a aVar6 = aVarArr[1];
            boolean z29 = aVar6 == aVar5;
            int i25 = this.Z;
            this.A = i25;
            f6 = this.Y;
            this.B = f6;
            int i26 = this.f1925r;
            int i27 = this.s;
            if (f6 <= 0.0f) {
                eVar3 = eVarK4;
                if (this.f1909i0 != 8) {
                    i9 = (aVar4 == aVar5 && i26 == 0) ? 3 : i26;
                    int i28 = (aVar6 == aVar5 && i27 == 0) ? 3 : i27;
                    if (aVar4 == aVar5 && aVar6 == aVar5) {
                        eVar4 = eVarK5;
                        if (i9 == 3 && i28 == 3) {
                            if (i25 == -1) {
                                if (z28 && !z29) {
                                    this.A = 0;
                                } else if (!z28 && z29) {
                                    this.A = 1;
                                    if (i25 == -1) {
                                        this.B = 1.0f / f6;
                                    }
                                }
                            }
                            if (this.A == 0 && (!dVar9.h() || !dVar10.h())) {
                                this.A = 1;
                            } else if (this.A == 1 && (!dVar2.h() || !dVar8.h())) {
                                this.A = 0;
                            }
                            if (this.A == -1 && (!dVar9.h() || !dVar10.h() || !dVar2.h() || !dVar8.h())) {
                                if (dVar9.h() && dVar10.h()) {
                                    this.A = 0;
                                } else if (dVar2.h() && dVar8.h()) {
                                    this.B = 1.0f / this.B;
                                    this.A = 1;
                                }
                            }
                            if (this.A == -1) {
                                int i29 = this.f1927u;
                                if (i29 > 0 && this.f1930x == 0) {
                                    this.A = 0;
                                } else if (i29 == 0 && this.f1930x > 0) {
                                    this.B = 1.0f / this.B;
                                    this.A = 1;
                                }
                            }
                        }
                        z15 = z11;
                        z16 = true;
                        i10 = i28;
                        int[] iArr3 = this.f1926t;
                        iArr3[0] = i9;
                        iArr3[1] = i10;
                        if (!z16) {
                            int i30 = this.A;
                            i11 = -1;
                            boolean z30 = i30 == 0 || i30 == -1;
                            boolean z31 = z16 && ((i18 = this.A) == 1 || i18 == i11);
                            z17 = aVarArr[0] == aVar3 && (this instanceof f);
                            if (z17) {
                                i8 = 0;
                            }
                            dVar3 = this.Q;
                            boolean z32 = !dVar3.h();
                            boolean z33 = zArr4[0];
                            boolean z34 = zArr4[1];
                            i12 = this.f1920o;
                            iArr = this.C;
                            if (i12 != 2 && !this.f1912k) {
                                if (!z6 || (lVar = this.f1899d) == null) {
                                    z21 = z15;
                                } else {
                                    c0.f fVar4 = lVar.h;
                                    z21 = z15;
                                    if (fVar4.f2088j && lVar.f2118i.f2088j) {
                                        if (z6) {
                                            cVar2.d(eVarK, fVar4.f2086g);
                                            cVar2.d(eVarK2, this.f1899d.f2118i.f2086g);
                                            if (this.V != null && z21 && zArr2[0] && !x()) {
                                                cVar2.f(cVar2.k(this.V.L), eVarK2, 0, 8);
                                            }
                                        }
                                        eVar5 = eVarK;
                                        aVar = aVar5;
                                        eVar6 = eVarK2;
                                        dVar4 = dVar3;
                                        i13 = i9;
                                        iArr2 = iArr;
                                        z18 = z14;
                                        aVar2 = aVar3;
                                        dVar5 = dVar;
                                        z15 = z21;
                                    }
                                }
                                e eVar16 = this.V;
                                z.e eVarK6 = eVar16 != null ? cVar2.k(eVar16.L) : null;
                                e eVar17 = this.V;
                                z.e eVarK7 = eVar17 != null ? cVar2.k(eVar17.J) : null;
                                i13 = i9;
                                boolean z35 = z14;
                                boolean z36 = z32;
                                dVar4 = dVar3;
                                iArr2 = iArr;
                                eVar5 = eVarK;
                                aVar = aVar5;
                                dVar5 = dVar;
                                boolean z37 = z21;
                                eVar9 = eVarK3;
                                dVar6 = dVar10;
                                eVar6 = eVarK2;
                                aVar2 = aVar3;
                                eVar8 = eVar3;
                                eVar7 = eVar4;
                                zArr3 = zArr2;
                                cVar2 = cVar;
                                d(cVar2, true, z37, z25, zArr2[0], eVarK7, eVarK6, aVarArr[0], z17, this.J, this.L, this.f1894a0, i8, this.f1900d0, iArr[0], this.f1904f0, z30, aVarArr[1] == aVar5, z35, z27, z33, i13, i10, this.f1927u, this.f1928v, this.f1929w, z36);
                                z15 = z37;
                                z20 = z27;
                                z18 = z35;
                                z25 = z25;
                                z19 = z36;
                                if (z6 || (nVar = this.f1901e) == null) {
                                    eVar10 = eVar9;
                                    eVar11 = eVar8;
                                    eVar12 = eVar7;
                                    i14 = 0;
                                    i15 = 8;
                                    i16 = 1;
                                    i17 = 1;
                                } else {
                                    c0.f fVar5 = nVar.h;
                                    if (fVar5.f2088j && nVar.f2118i.f2088j) {
                                        int i31 = fVar5.f2086g;
                                        eVar10 = eVar9;
                                        cVar2.d(eVar10, i31);
                                        eVar11 = eVar8;
                                        cVar2.d(eVar11, this.f1901e.f2118i.f2086g);
                                        eVar12 = eVar7;
                                        cVar2.d(eVar12, this.f1901e.f2103k.f2086g);
                                        e eVar18 = this.V;
                                        if (eVar18 == null || z20 || !z25) {
                                            i14 = 0;
                                            i15 = 8;
                                            i16 = 1;
                                        } else {
                                            i16 = 1;
                                            if (zArr3[1]) {
                                                i14 = 0;
                                                i15 = 8;
                                                cVar2.f(cVar2.k(eVar18.M), eVar11, 0, 8);
                                            } else {
                                                i14 = 0;
                                                i15 = 8;
                                            }
                                        }
                                        i17 = i14;
                                    }
                                }
                                if ((this.f1922p != 2 ? i14 : i17) != 0 || this.f1914l) {
                                    eVar13 = eVar10;
                                    eVar14 = eVar11;
                                } else {
                                    int i32 = (aVarArr[i16] == aVar2 && (this instanceof f)) ? i16 : i14;
                                    int i33 = i32 != 0 ? i14 : i24;
                                    e eVar19 = this.V;
                                    z.e eVarK8 = eVar19 != null ? cVar2.k(eVar19.M) : null;
                                    e eVar20 = this.V;
                                    z.e eVarK9 = eVar20 != null ? cVar2.k(eVar20.K) : null;
                                    int i34 = this.f1898c0;
                                    if (i34 <= 0) {
                                        ?? r27 = z19;
                                        if (this.f1909i0 == i15) {
                                            d dVar12 = dVar5;
                                            if (dVar12.f1883f != null) {
                                                cVar2.e(eVar12, eVar10, i34, i15);
                                                cVar2.e(eVar12, cVar2.k(dVar12.f1883f), dVar12.e(), i15);
                                                if (z25) {
                                                    cVar2.f(eVarK8, cVar2.k(dVar6), i14, 5);
                                                }
                                                r27 = i14;
                                            } else if (this.f1909i0 == i15) {
                                                cVar2.e(eVar12, eVar10, dVar12.e(), i15);
                                                r27 = z19;
                                            } else {
                                                cVar2.e(eVar12, eVar10, i34, i15);
                                                r27 = z19;
                                            }
                                        }
                                        int i35 = i14;
                                        eVar13 = eVar10;
                                        eVar14 = eVar11;
                                        cVar2 = cVar;
                                        d(cVar2, false, z25, z15, zArr3[i16], eVarK9, eVarK8, aVarArr[i16], i32, this.K, this.M, this.f1896b0, i33, this.f1902e0, iArr2[i16], this.f1906g0, z31, aVarArr[i35] == aVar ? 1 : i35, z20, z18, z34, i10, i13, this.f1930x, this.f1931y, this.f1932z, r27);
                                    }
                                }
                                if (z16) {
                                    if (this.A == 1) {
                                        float f7 = this.B;
                                        z.b bVarL = cVar2.l();
                                        bVarL.f15390d.f(eVar14, -1.0f);
                                        bVarL.f15390d.f(eVar13, 1.0f);
                                        bVarL.f15390d.f(eVar6, f7);
                                        bVarL.f15390d.f(eVar5, -f7);
                                        cVar2.c(bVarL);
                                    } else {
                                        float f8 = this.B;
                                        z.b bVarL2 = cVar2.l();
                                        bVarL2.f15390d.f(eVar6, -1.0f);
                                        bVarL2.f15390d.f(eVar5, 1.0f);
                                        bVarL2.f15390d.f(eVar14, f8);
                                        bVarL2.f15390d.f(eVar13, -f8);
                                        cVar2.c(bVarL2);
                                    }
                                }
                                if (dVar4.h()) {
                                    d dVar13 = dVar4;
                                    e eVar21 = dVar13.f1883f.f1881d;
                                    float radians = (float) Math.toRadians(this.D + 90.0f);
                                    int iE = dVar13.e();
                                    d.a aVar7 = d.a.s;
                                    z.e eVarK10 = cVar2.k(i(aVar7));
                                    d.a aVar8 = d.a.f1886t;
                                    z.e eVarK11 = cVar2.k(i(aVar8));
                                    d.a aVar9 = d.a.f1887u;
                                    z.e eVarK12 = cVar2.k(i(aVar9));
                                    d.a aVar10 = d.a.f1888v;
                                    z.e eVarK13 = cVar2.k(i(aVar10));
                                    z.e eVarK14 = cVar2.k(eVar21.i(aVar7));
                                    z.e eVarK15 = cVar2.k(eVar21.i(aVar8));
                                    z.e eVarK16 = cVar2.k(eVar21.i(aVar9));
                                    z.e eVarK17 = cVar2.k(eVar21.i(aVar10));
                                    z.b bVarL3 = cVar2.l();
                                    double d7 = radians;
                                    double dSin = Math.sin(d7);
                                    double d8 = iE;
                                    bVarL3.f15390d.f(eVarK15, 0.5f);
                                    bVarL3.f15390d.f(eVarK17, 0.5f);
                                    bVarL3.f15390d.f(eVarK11, -0.5f);
                                    bVarL3.f15390d.f(eVarK13, -0.5f);
                                    bVarL3.f15388b = -((float) (dSin * d8));
                                    cVar2.c(bVarL3);
                                    z.b bVarL4 = cVar2.l();
                                    float fCos = (float) (Math.cos(d7) * d8);
                                    bVarL4.f15390d.f(eVarK14, 0.5f);
                                    bVarL4.f15390d.f(eVarK16, 0.5f);
                                    bVarL4.f15390d.f(eVarK10, -0.5f);
                                    bVarL4.f15390d.f(eVarK12, -0.5f);
                                    bVarL4.f15388b = -fCos;
                                    cVar2.c(bVarL4);
                                }
                                this.f1912k = false;
                                this.f1914l = false;
                            }
                            eVar5 = eVarK;
                            aVar = aVar5;
                            eVar6 = eVarK2;
                            dVar4 = dVar3;
                            i13 = i9;
                            iArr2 = iArr;
                            z18 = z14;
                            aVar2 = aVar3;
                            dVar5 = dVar;
                            z20 = z27;
                            eVar9 = eVarK3;
                            dVar6 = dVar10;
                            eVar8 = eVar3;
                            eVar7 = eVar4;
                            z19 = z32;
                            zArr3 = zArr2;
                            if (z6) {
                                eVar10 = eVar9;
                                eVar11 = eVar8;
                                eVar12 = eVar7;
                                i14 = 0;
                                i15 = 8;
                                i16 = 1;
                                i17 = 1;
                            }
                            if ((this.f1922p != 2 ? i14 : i17) != 0) {
                                eVar13 = eVar10;
                                eVar14 = eVar11;
                            }
                            if (z16) {
                            }
                            if (dVar4.h()) {
                            }
                            this.f1912k = false;
                            this.f1914l = false;
                        }
                        i11 = -1;
                        if (z16) {
                        }
                        if (aVarArr[0] == aVar3) {
                        }
                        if (z17) {
                        }
                        dVar3 = this.Q;
                        boolean z322 = !dVar3.h();
                        boolean z332 = zArr4[0];
                        boolean z342 = zArr4[1];
                        i12 = this.f1920o;
                        iArr = this.C;
                        if (i12 != 2) {
                            eVar5 = eVarK;
                            aVar = aVar5;
                            eVar6 = eVarK2;
                            dVar4 = dVar3;
                            i13 = i9;
                            iArr2 = iArr;
                            z18 = z14;
                            aVar2 = aVar3;
                            dVar5 = dVar;
                            z20 = z27;
                            eVar9 = eVarK3;
                            dVar6 = dVar10;
                            eVar8 = eVar3;
                            eVar7 = eVar4;
                            z19 = z322;
                            zArr3 = zArr2;
                        }
                        if (z6) {
                        }
                        if ((this.f1922p != 2 ? i14 : i17) != 0) {
                        }
                        if (z16) {
                        }
                        if (dVar4.h()) {
                        }
                        this.f1912k = false;
                        this.f1914l = false;
                    }
                    eVar4 = eVarK5;
                    if (aVar4 == aVar5 && i9 == 3) {
                        this.A = 0;
                        i8 = (int) (i22 * f6);
                        z15 = z11;
                        if (aVar6 != aVar5) {
                            i9 = 4;
                            z16 = false;
                        } else {
                            z16 = true;
                        }
                        i10 = i28;
                        int[] iArr32 = this.f1926t;
                        iArr32[0] = i9;
                        iArr32[1] = i10;
                        if (!z16) {
                        }
                        if (z16) {
                        }
                        if (aVarArr[0] == aVar3) {
                        }
                        if (z17) {
                        }
                        dVar3 = this.Q;
                        boolean z3222 = !dVar3.h();
                        boolean z3322 = zArr4[0];
                        boolean z3422 = zArr4[1];
                        i12 = this.f1920o;
                        iArr = this.C;
                        if (i12 != 2) {
                        }
                        if (z6) {
                        }
                        if ((this.f1922p != 2 ? i14 : i17) != 0) {
                        }
                        if (z16) {
                        }
                        if (dVar4.h()) {
                        }
                        this.f1912k = false;
                        this.f1914l = false;
                    }
                    if (aVar6 == aVar5 && i28 == 3) {
                        this.A = 1;
                        if (i25 == -1) {
                            this.B = 1.0f / f6;
                        }
                        i24 = (int) (this.B * i7);
                        if (aVar4 != aVar5) {
                            z15 = z11;
                            i10 = 4;
                        }
                    }
                    z15 = z11;
                    z16 = true;
                    i10 = i28;
                    int[] iArr322 = this.f1926t;
                    iArr322[0] = i9;
                    iArr322[1] = i10;
                    if (!z16) {
                    }
                    if (z16) {
                    }
                    if (aVarArr[0] == aVar3) {
                    }
                    if (z17) {
                    }
                    dVar3 = this.Q;
                    boolean z32222 = !dVar3.h();
                    boolean z33222 = zArr4[0];
                    boolean z34222 = zArr4[1];
                    i12 = this.f1920o;
                    iArr = this.C;
                    if (i12 != 2) {
                    }
                    if (z6) {
                    }
                    if ((this.f1922p != 2 ? i14 : i17) != 0) {
                    }
                    if (z16) {
                    }
                    if (dVar4.h()) {
                    }
                    this.f1912k = false;
                    this.f1914l = false;
                }
                z16 = false;
                int[] iArr3222 = this.f1926t;
                iArr3222[0] = i9;
                iArr3222[1] = i10;
                if (!z16) {
                }
                if (z16) {
                }
                if (aVarArr[0] == aVar3) {
                }
                if (z17) {
                }
                dVar3 = this.Q;
                boolean z322222 = !dVar3.h();
                boolean z332222 = zArr4[0];
                boolean z342222 = zArr4[1];
                i12 = this.f1920o;
                iArr = this.C;
                if (i12 != 2) {
                }
                if (z6) {
                }
                if ((this.f1922p != 2 ? i14 : i17) != 0) {
                }
                if (z16) {
                }
                if (dVar4.h()) {
                }
                this.f1912k = false;
                this.f1914l = false;
            }
            eVar3 = eVarK4;
            eVar4 = eVarK5;
            z15 = z11;
            i9 = i26;
            i10 = i27;
            z16 = false;
            int[] iArr32222 = this.f1926t;
            iArr32222[0] = i9;
            iArr32222[1] = i10;
            if (!z16) {
            }
            if (z16) {
            }
            if (aVarArr[0] == aVar3) {
            }
            if (z17) {
            }
            dVar3 = this.Q;
            boolean z3222222 = !dVar3.h();
            boolean z3322222 = zArr4[0];
            boolean z3422222 = zArr4[1];
            i12 = this.f1920o;
            iArr = this.C;
            if (i12 != 2) {
            }
            if (z6) {
            }
            if ((this.f1922p != 2 ? i14 : i17) != 0) {
            }
            if (z16) {
            }
            if (dVar4.h()) {
            }
            this.f1912k = false;
            this.f1914l = false;
        }
        z7 = true;
        z8 = false;
        z9 = z8 ? 1 : 0;
        z10 = z9;
        r18 = z8;
        r20 = z7;
        i6 = this.f1909i0;
        boolean z252 = z9;
        boolean[] zArr42 = this.T;
        if (i6 != 8) {
        }
        z12 = this.f1912k;
        if (!z12) {
            if (z12) {
            }
            if (this.f1914l) {
            }
            if (this.f1912k) {
                boolean z262 = r18;
                this.f1912k = z262;
                this.f1914l = z262;
                return;
            }
        }
        zArr = this.f1903f;
        if (z6) {
            dVar = dVar11;
            zArr2 = zArr;
        }
        if (this.V == null) {
        }
        i7 = this.W;
        i8 = this.f1900d0;
        if (i7 >= i8) {
        }
        int i222 = this.X;
        boolean z272 = z13;
        int i232 = this.f1902e0;
        if (i222 >= i232) {
        }
        aVarArr = this.U;
        a aVar42 = aVarArr[0];
        a aVar52 = a.f1934u;
        if (aVar42 == aVar52) {
        }
        a aVar62 = aVarArr[1];
        if (aVar62 == aVar52) {
        }
        int i252 = this.Z;
        this.A = i252;
        f6 = this.Y;
        this.B = f6;
        int i262 = this.f1925r;
        int i272 = this.s;
        if (f6 <= 0.0f) {
        }
        eVar4 = eVarK5;
        z15 = z11;
        i9 = i262;
        i10 = i272;
        z16 = false;
        int[] iArr322222 = this.f1926t;
        iArr322222[0] = i9;
        iArr322222[1] = i10;
        if (!z16) {
        }
        if (z16) {
        }
        if (aVarArr[0] == aVar3) {
        }
        if (z17) {
        }
        dVar3 = this.Q;
        boolean z32222222 = !dVar3.h();
        boolean z33222222 = zArr42[0];
        boolean z34222222 = zArr42[1];
        i12 = this.f1920o;
        iArr = this.C;
        if (i12 != 2) {
        }
        if (z6) {
        }
        if ((this.f1922p != 2 ? i14 : i17) != 0) {
        }
        if (z16) {
        }
        if (dVar4.h()) {
        }
        this.f1912k = false;
        this.f1914l = false;
    }

    public boolean c() {
        return this.f1909i0 != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:217:0x03b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x048e A[PHI: r3
      0x048e: PHI (r3v17 int) = (r3v16 int), (r3v21 int), (r3v21 int), (r3v21 int) binds: [B:280:0x047e, B:282:0x0484, B:283:0x0486, B:285:0x048a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x04cf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:337:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:345:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(z.c cVar, boolean z6, boolean z7, boolean z8, boolean z9, z.e eVar, z.e eVar2, a aVar, boolean z10, d dVar, d dVar2, int i6, int i7, int i8, int i9, float f6, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i10, int i11, int i12, int i13, float f7, boolean z16) {
        int iMin;
        boolean z17;
        int i14;
        int i15;
        boolean z18;
        z.e eVarK;
        z.e eVarK2;
        d dVar3;
        z.e eVar3;
        boolean z19;
        int i16;
        z.e eVar4;
        z.e eVar5;
        z.e eVar6;
        z.e eVar7;
        int i17;
        int i18;
        int i19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        e eVar8;
        int i20;
        int i21;
        d dVar4;
        boolean z24;
        int iMin2;
        boolean z25;
        int i22;
        HashSet<d> hashSet;
        boolean z26;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z27;
        boolean z28;
        int i29;
        z.c cVar2 = cVar;
        int i30 = i12;
        int i31 = i13;
        z.e eVarK3 = cVar2.k(dVar);
        z.e eVarK4 = cVar2.k(dVar2);
        z.e eVarK5 = cVar2.k(dVar.f1883f);
        z.e eVarK6 = cVar2.k(dVar2.f1883f);
        boolean zH = dVar.h();
        boolean zH2 = dVar2.h();
        boolean zH3 = this.Q.h();
        int i32 = zH2 ? (zH ? 1 : 0) + 1 : zH ? 1 : 0;
        if (zH3) {
            i32++;
        }
        int i33 = i32;
        int i34 = z11 ? 3 : i10;
        int iOrdinal = aVar.ordinal();
        boolean z29 = (iOrdinal == 0 || iOrdinal == 1 || iOrdinal != 2 || i34 == 4) ? false : true;
        int i35 = this.h;
        if (i35 != -1 && z6) {
            this.h = -1;
            i7 = i35;
            z29 = false;
        }
        int i36 = this.f1908i;
        if (i36 == -1 || z6) {
            i36 = i7;
        } else {
            this.f1908i = -1;
            z29 = false;
        }
        int i37 = i36;
        if (this.f1909i0 == 8) {
            z29 = false;
            iMin = 0;
        } else {
            iMin = i37;
        }
        if (z16) {
            if (!zH && !zH2 && !zH3) {
                cVar2.d(eVarK3, i6);
            } else if (zH && !zH2) {
                z17 = z29;
                i14 = 8;
                cVar2.e(eVarK3, eVarK5, dVar.e(), 8);
            }
            z17 = z29;
            i14 = 8;
        } else {
            z17 = z29;
            i14 = 8;
        }
        if (z17) {
            if (i33 == 2 || z11 || !(i34 == 1 || i34 == 0)) {
                if (i30 == -2) {
                    i30 = iMin;
                }
                if (i31 == -2) {
                    i31 = iMin;
                }
                if (iMin > 0 && i34 != 1) {
                    iMin = 0;
                }
                if (i30 > 0) {
                    cVar2.f(eVarK4, eVarK3, i30, 8);
                    iMin = Math.max(iMin, i30);
                }
                if (i31 > 0) {
                    if (!z7 || i34 != 1) {
                        cVar2.g(eVarK4, eVarK3, i31, 8);
                    }
                    iMin = Math.min(iMin, i31);
                }
                if (i34 == 1) {
                    if (z7) {
                        cVar2.e(eVarK4, eVarK3, iMin, 8);
                    } else if (z13) {
                        cVar2.e(eVarK4, eVarK3, iMin, 5);
                        cVar2.g(eVarK4, eVarK3, iMin, 8);
                    } else {
                        cVar2.e(eVarK4, eVarK3, iMin, 5);
                        cVar2.g(eVarK4, eVarK3, iMin, 8);
                    }
                } else if (i34 == 2) {
                    d.a aVar2 = dVar.f1882e;
                    d.a aVar3 = d.a.f1888v;
                    d.a aVar4 = d.a.f1886t;
                    if (aVar2 == aVar4 || aVar2 == aVar3) {
                        eVarK = cVar2.k(this.V.i(aVar4));
                        eVarK2 = cVar2.k(this.V.i(aVar3));
                    } else {
                        eVarK = cVar2.k(this.V.i(d.a.s));
                        eVarK2 = cVar2.k(this.V.i(d.a.f1887u));
                    }
                    z.b bVarL = cVar2.l();
                    int i38 = i30;
                    bVarL.f15390d.f(eVarK4, -1.0f);
                    bVarL.f15390d.f(eVarK3, 1.0f);
                    bVarL.f15390d.f(eVarK2, f7);
                    bVarL.f15390d.f(eVarK, -f7);
                    cVar2.c(bVarL);
                    if (z7) {
                        z17 = false;
                    }
                    z18 = z9;
                    i15 = i38;
                } else {
                    i15 = i30;
                    z18 = true;
                }
            } else {
                int iMax = Math.max(i30, iMin);
                if (i31 > 0) {
                    iMax = Math.min(i31, iMax);
                }
                cVar2.e(eVarK4, eVarK3, iMax, 8);
                z18 = z9;
                i15 = i30;
                z17 = false;
            }
            if (z16 || z13) {
                boolean z30 = z18;
                if (i33 >= 2 && z7 && z30) {
                    cVar2.f(eVarK3, eVar, 0, 8);
                    d dVar5 = this.N;
                    boolean z31 = z6 || dVar5.f1883f == null;
                    if (!z6 && (dVar3 = dVar5.f1883f) != null) {
                        e eVar9 = dVar3.f1881d;
                        if (eVar9.Y != 0.0f) {
                            a[] aVarArr = eVar9.U;
                            a aVar5 = aVarArr[0];
                            a aVar6 = a.f1934u;
                            z31 = aVar5 == aVar6 && aVarArr[1] == aVar6;
                        }
                    }
                    if (z31) {
                        cVar2.f(eVar2, eVarK4, 0, 8);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!zH && !zH2 && !zH3) {
                dVar4 = dVar2;
                eVar6 = eVarK4;
                z19 = z18;
                eVar3 = eVarK6;
            } else if (!zH || zH2) {
                if (zH || !zH2) {
                    eVar3 = eVarK6;
                    if (zH && zH2) {
                        e eVar10 = dVar.f1883f.f1881d;
                        e eVar11 = dVar2.f1883f.f1881d;
                        z19 = z18;
                        e eVar12 = this.V;
                        int i39 = 6;
                        if (z17) {
                            if (i34 == 0) {
                                if (i31 != 0 || i15 != 0) {
                                    i27 = 5;
                                    i28 = 5;
                                    z27 = true;
                                    z28 = false;
                                    z21 = true;
                                } else if (eVarK5.f15417x && eVar3.f15417x) {
                                    cVar2.e(eVarK3, eVarK5, dVar.e(), 8);
                                    cVar2.e(eVarK4, eVar3, -dVar2.e(), 8);
                                    return;
                                } else {
                                    i27 = 8;
                                    i28 = 8;
                                    z27 = false;
                                    z28 = true;
                                    z21 = false;
                                }
                                if ((eVar10 instanceof b0.a) || (eVar11 instanceof b0.a)) {
                                    i18 = i27;
                                    eVar7 = eVarK5;
                                    cVar2 = cVar;
                                    i16 = i34;
                                    eVar5 = eVarK3;
                                    eVar6 = eVarK4;
                                    i17 = 6;
                                    z22 = z28;
                                    eVar4 = eVar2;
                                    z20 = z27;
                                    i19 = 4;
                                    if (z21 || eVar7 != eVar3 || eVar10 == eVar12) {
                                        z23 = true;
                                    } else {
                                        z21 = false;
                                        z23 = false;
                                    }
                                    if (z20) {
                                        eVar8 = eVar11;
                                        i20 = i15;
                                        i21 = i16;
                                        dVar4 = dVar2;
                                        z24 = z7;
                                    } else {
                                        if (z17 || z12 || z14 || eVar7 != eVar || eVar3 != eVar4) {
                                            z24 = z7;
                                            z26 = z23;
                                            i23 = i18;
                                            i24 = i17;
                                        } else {
                                            i24 = 8;
                                            z24 = false;
                                            i23 = 8;
                                            z26 = false;
                                        }
                                        z.e eVar13 = eVar7;
                                        i20 = i15;
                                        i21 = i16;
                                        eVar8 = eVar11;
                                        dVar4 = dVar2;
                                        cVar2.b(eVar5, eVar13, dVar.e(), f6, eVar3, eVar6, dVar2.e(), i24);
                                        eVar7 = eVar13;
                                        i18 = i23;
                                        z23 = z26;
                                    }
                                    if (this.f1909i0 != 8 && ((hashSet = dVar4.f1878a) == null || hashSet.size() <= 0)) {
                                        return;
                                    }
                                    if (z21) {
                                        if (z24 && eVar7 != eVar3 && !z17 && ((eVar10 instanceof b0.a) || (eVar8 instanceof b0.a))) {
                                            i18 = 6;
                                        }
                                        cVar2.f(eVar5, eVar7, dVar.e(), i18);
                                        cVar2.g(eVar6, eVar3, -dVar4.e(), i18);
                                    }
                                    if (z24 || !z15 || (eVar10 instanceof b0.a) || (eVar8 instanceof b0.a) || eVar8 == eVar12) {
                                        iMin2 = i19;
                                        z25 = z23;
                                    } else {
                                        iMin2 = 6;
                                        i18 = 6;
                                        z25 = true;
                                    }
                                    if (z25) {
                                        if (z22 && (!z14 || z8)) {
                                            if (eVar10 != eVar12 && eVar8 != eVar12) {
                                                i39 = iMin2;
                                            }
                                            if ((eVar10 instanceof h) || (eVar8 instanceof h)) {
                                                i39 = 5;
                                            }
                                            if ((eVar10 instanceof b0.a) || (eVar8 instanceof b0.a)) {
                                                i39 = 5;
                                            }
                                            iMin2 = Math.max(z14 ? 5 : i39, iMin2);
                                        }
                                        if (z24) {
                                            iMin2 = Math.min(i18, iMin2);
                                            int i40 = (z11 && !z14 && (eVar10 == eVar12 || eVar8 == eVar12)) ? 4 : iMin2;
                                            cVar2.e(eVar5, eVar7, dVar.e(), i40);
                                            cVar2.e(eVar6, eVar3, -dVar4.e(), i40);
                                        }
                                    }
                                    if (z24) {
                                        int iE = eVar == eVar7 ? dVar.e() : 0;
                                        if (eVar7 != eVar) {
                                            cVar2.f(eVar5, eVar, iE, 5);
                                        }
                                    }
                                    if (z24 || !z17 || i8 != 0 || i20 != 0) {
                                        i22 = 5;
                                        i29 = i22;
                                    } else if (z17 && i21 == 3) {
                                        cVar2.f(eVar6, eVar5, 0, 8);
                                        i22 = 5;
                                        i29 = i22;
                                    } else {
                                        i22 = 5;
                                        cVar2.f(eVar6, eVar5, 0, 5);
                                        i29 = i22;
                                    }
                                } else {
                                    i18 = i27;
                                    eVar7 = eVarK5;
                                    cVar2 = cVar;
                                    eVar5 = eVarK3;
                                    eVar6 = eVarK4;
                                    i17 = 6;
                                    z22 = z28;
                                    z20 = z27;
                                    i19 = i28;
                                    i16 = i34;
                                    eVar4 = eVar2;
                                    if (z21) {
                                        z23 = true;
                                        if (z20) {
                                        }
                                        if (this.f1909i0 != 8) {
                                        }
                                        if (z21) {
                                        }
                                        if (z24) {
                                            iMin2 = i19;
                                            z25 = z23;
                                            if (z25) {
                                            }
                                            if (z24) {
                                            }
                                            if (z24) {
                                                i22 = 5;
                                                i29 = i22;
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (i34 == 2) {
                                    if ((eVar10 instanceof b0.a) || (eVar11 instanceof b0.a)) {
                                        cVar2 = cVar;
                                        i16 = i34;
                                        eVar5 = eVarK3;
                                        eVar6 = eVarK4;
                                        eVar7 = eVarK5;
                                        i17 = 6;
                                        i18 = 5;
                                    } else {
                                        cVar2 = cVar;
                                        i16 = i34;
                                        eVar5 = eVarK3;
                                        eVar6 = eVarK4;
                                        eVar7 = eVarK5;
                                        i17 = 6;
                                        i18 = 5;
                                        i19 = 5;
                                        z20 = true;
                                        z21 = true;
                                        z22 = false;
                                        eVar4 = eVar2;
                                        if (z21) {
                                        }
                                    }
                                } else if (i34 == 1) {
                                    cVar2 = cVar;
                                    i16 = i34;
                                    eVar5 = eVarK3;
                                    eVar6 = eVarK4;
                                    eVar7 = eVarK5;
                                    i17 = 6;
                                    i18 = 8;
                                } else if (i34 == 3) {
                                    i16 = i34;
                                    if (this.A == -1) {
                                        if (z14) {
                                            cVar2 = cVar;
                                            eVar4 = eVar2;
                                            eVar5 = eVarK3;
                                            eVar6 = eVarK4;
                                            eVar7 = eVarK5;
                                            i17 = z7 ? 5 : 4;
                                        } else {
                                            cVar2 = cVar;
                                            eVar4 = eVar2;
                                            eVar5 = eVarK3;
                                            eVar6 = eVarK4;
                                            eVar7 = eVarK5;
                                            i17 = 8;
                                        }
                                        i18 = 8;
                                    } else {
                                        if (z11) {
                                            if (i11 == 2 || i11 == 1) {
                                                i25 = 5;
                                                i26 = 4;
                                            } else {
                                                i25 = 8;
                                                i26 = 5;
                                            }
                                            i19 = i26;
                                            eVar5 = eVarK3;
                                            eVar6 = eVarK4;
                                            eVar7 = eVarK5;
                                            i17 = 6;
                                            z20 = true;
                                            z21 = true;
                                            z22 = true;
                                            eVar4 = eVar2;
                                        } else if (i31 > 0) {
                                            cVar2 = cVar;
                                            eVar4 = eVar2;
                                            eVar5 = eVarK3;
                                            eVar6 = eVarK4;
                                            eVar7 = eVarK5;
                                            i17 = 6;
                                            i18 = 5;
                                        } else {
                                            if (i31 != 0 || i15 != 0) {
                                                cVar2 = cVar;
                                                eVar4 = eVar2;
                                                eVar5 = eVarK3;
                                                eVar6 = eVarK4;
                                                eVar7 = eVarK5;
                                                i17 = 6;
                                                i18 = 5;
                                                i19 = 4;
                                            } else if (z14) {
                                                i25 = (eVar10 == eVar12 || eVar11 == eVar12) ? 5 : 4;
                                                eVar4 = eVar2;
                                                eVar5 = eVarK3;
                                                eVar6 = eVarK4;
                                                eVar7 = eVarK5;
                                                i17 = 6;
                                                i19 = 4;
                                                z20 = true;
                                                z21 = true;
                                                z22 = true;
                                            } else {
                                                cVar2 = cVar;
                                                eVar4 = eVar2;
                                                eVar5 = eVarK3;
                                                eVar6 = eVarK4;
                                                eVar7 = eVarK5;
                                                i17 = 6;
                                                i18 = 5;
                                                i19 = 8;
                                            }
                                            z20 = true;
                                            z21 = true;
                                            z22 = true;
                                            if (z21) {
                                            }
                                        }
                                        i18 = i25;
                                        cVar2 = cVar;
                                        if (z21) {
                                        }
                                    }
                                    i19 = 5;
                                    z20 = true;
                                    z21 = true;
                                    z22 = true;
                                    if (z21) {
                                    }
                                } else {
                                    i16 = i34;
                                    cVar2 = cVar;
                                    eVar4 = eVar2;
                                    eVar5 = eVarK3;
                                    eVar6 = eVarK4;
                                    eVar7 = eVarK5;
                                    i17 = 6;
                                    i18 = 5;
                                    i19 = 4;
                                    z20 = false;
                                    z21 = false;
                                }
                                i19 = 4;
                                z20 = true;
                                z21 = true;
                                z22 = false;
                                eVar4 = eVar2;
                                if (z21) {
                                }
                            }
                            if (z24 && z19) {
                                int iE2 = dVar4.f1883f != null ? dVar4.e() : 0;
                                if (eVar3 != eVar2) {
                                    cVar2.f(eVar2, eVar6, iE2, i29);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        i16 = i34;
                        if (eVarK5.f15417x && eVar3.f15417x) {
                            cVar.b(eVarK3, eVarK5, dVar.e(), f6, eVar3, eVarK4, dVar2.e(), 8);
                            if (z7 && z19) {
                                int iE3 = dVar2.f1883f != null ? dVar2.e() : 0;
                                if (eVar3 != eVar2) {
                                    cVar.f(eVar2, eVarK4, iE3, 5);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        cVar2 = cVar;
                        eVar4 = eVar2;
                        eVar5 = eVarK3;
                        eVar6 = eVarK4;
                        eVar7 = eVarK5;
                        i17 = 6;
                        i18 = 5;
                        i19 = 4;
                        z20 = true;
                        z21 = true;
                        z22 = false;
                        if (z21) {
                        }
                        if (z24) {
                            return;
                        } else {
                            return;
                        }
                    }
                } else {
                    eVar3 = eVarK6;
                    cVar2.e(eVarK4, eVar3, -dVar2.e(), 8);
                    if (z7) {
                        cVar2.f(eVarK3, eVar, 0, 5);
                        dVar4 = dVar2;
                        i22 = 5;
                        eVar6 = eVarK4;
                        z19 = z18;
                        z24 = z7;
                        i29 = i22;
                        if (z24) {
                        }
                    }
                }
                dVar4 = dVar2;
                eVar6 = eVarK4;
                z19 = z18;
            } else {
                dVar4 = dVar2;
                eVar6 = eVarK4;
                z19 = z18;
                eVar3 = eVarK6;
                z24 = z7;
                i29 = (z7 && (dVar.f1883f.f1881d instanceof b0.a)) ? 8 : 5;
                if (z24) {
                }
            }
            i22 = 5;
            z24 = z7;
            i29 = i22;
            if (z24) {
            }
        } else if (z10) {
            cVar2.e(eVarK4, eVarK3, 0, 3);
            if (i8 > 0) {
                cVar2.f(eVarK4, eVarK3, i8, i14);
            }
            if (i9 < Integer.MAX_VALUE) {
                cVar2.g(eVarK4, eVarK3, i9, i14);
            }
        } else {
            cVar2.e(eVarK4, eVarK3, iMin, i14);
        }
        z18 = z9;
        i15 = i30;
        if (z16) {
        }
        boolean z302 = z18;
        if (i33 >= 2) {
        }
    }

    public final void e(d.a aVar, e eVar, d.a aVar2, int i6) {
        boolean z6;
        d.a aVar3 = d.a.f1892z;
        d.a aVar4 = d.a.f1891y;
        d.a aVar5 = d.a.s;
        d.a aVar6 = d.a.f1886t;
        d.a aVar7 = d.a.f1887u;
        d.a aVar8 = d.a.f1888v;
        d.a aVar9 = d.a.f1890x;
        if (aVar == aVar9) {
            if (aVar2 != aVar9) {
                if (aVar2 == aVar5 || aVar2 == aVar7) {
                    e(aVar5, eVar, aVar2, 0);
                    e(aVar7, eVar, aVar2, 0);
                    i(aVar9).a(eVar.i(aVar2), 0);
                    return;
                } else {
                    if (aVar2 == aVar6 || aVar2 == aVar8) {
                        e(aVar6, eVar, aVar2, 0);
                        e(aVar8, eVar, aVar2, 0);
                        i(aVar9).a(eVar.i(aVar2), 0);
                        return;
                    }
                    return;
                }
            }
            d dVarI = i(aVar5);
            d dVarI2 = i(aVar7);
            d dVarI3 = i(aVar6);
            d dVarI4 = i(aVar8);
            boolean z7 = true;
            if ((dVarI == null || !dVarI.h()) && (dVarI2 == null || !dVarI2.h())) {
                e(aVar5, eVar, aVar5, 0);
                e(aVar7, eVar, aVar7, 0);
                z6 = true;
            } else {
                z6 = false;
            }
            if ((dVarI3 == null || !dVarI3.h()) && (dVarI4 == null || !dVarI4.h())) {
                e(aVar6, eVar, aVar6, 0);
                e(aVar8, eVar, aVar8, 0);
            } else {
                z7 = false;
            }
            if (z6 && z7) {
                i(aVar9).a(eVar.i(aVar9), 0);
                return;
            } else if (z6) {
                i(aVar4).a(eVar.i(aVar4), 0);
                return;
            } else {
                if (z7) {
                    i(aVar3).a(eVar.i(aVar3), 0);
                    return;
                }
                return;
            }
        }
        if (aVar == aVar4 && (aVar2 == aVar5 || aVar2 == aVar7)) {
            d dVarI5 = i(aVar5);
            d dVarI6 = eVar.i(aVar2);
            d dVarI7 = i(aVar7);
            dVarI5.a(dVarI6, 0);
            dVarI7.a(dVarI6, 0);
            i(aVar4).a(dVarI6, 0);
            return;
        }
        if (aVar == aVar3 && (aVar2 == aVar6 || aVar2 == aVar8)) {
            d dVarI8 = eVar.i(aVar2);
            i(aVar6).a(dVarI8, 0);
            i(aVar8).a(dVarI8, 0);
            i(aVar3).a(dVarI8, 0);
            return;
        }
        if (aVar == aVar4 && aVar2 == aVar4) {
            i(aVar5).a(eVar.i(aVar5), 0);
            i(aVar7).a(eVar.i(aVar7), 0);
            i(aVar4).a(eVar.i(aVar2), 0);
            return;
        }
        if (aVar == aVar3 && aVar2 == aVar3) {
            i(aVar6).a(eVar.i(aVar6), 0);
            i(aVar8).a(eVar.i(aVar8), 0);
            i(aVar3).a(eVar.i(aVar2), 0);
            return;
        }
        d dVarI9 = i(aVar);
        d dVarI10 = eVar.i(aVar2);
        if (dVarI9.i(dVarI10)) {
            d.a aVar10 = d.a.f1889w;
            if (aVar == aVar10) {
                d dVarI11 = i(aVar6);
                d dVarI12 = i(aVar8);
                if (dVarI11 != null) {
                    dVarI11.j();
                }
                if (dVarI12 != null) {
                    dVarI12.j();
                }
            } else if (aVar == aVar6 || aVar == aVar8) {
                d dVarI13 = i(aVar10);
                if (dVarI13 != null) {
                    dVarI13.j();
                }
                d dVarI14 = i(aVar9);
                if (dVarI14.f1883f != dVarI10) {
                    dVarI14.j();
                }
                d dVarF = i(aVar).f();
                d dVarI15 = i(aVar3);
                if (dVarI15.h()) {
                    dVarF.j();
                    dVarI15.j();
                }
            } else if (aVar == aVar5 || aVar == aVar7) {
                d dVarI16 = i(aVar9);
                if (dVarI16.f1883f != dVarI10) {
                    dVarI16.j();
                }
                d dVarF2 = i(aVar).f();
                d dVarI17 = i(aVar4);
                if (dVarI17.h()) {
                    dVarF2.j();
                    dVarI17.j();
                }
            }
            dVarI9.a(dVarI10, i6);
        }
    }

    public final void f(d dVar, d dVar2, int i6) {
        if (dVar.f1881d == this) {
            e(dVar.f1882e, dVar2.f1881d, dVar2.f1882e, i6);
        }
    }

    public final void g(z.c cVar) {
        cVar.k(this.J);
        cVar.k(this.K);
        cVar.k(this.L);
        cVar.k(this.M);
        if (this.f1898c0 > 0) {
            cVar.k(this.N);
        }
    }

    public final void h() {
        if (this.f1899d == null) {
            c0.l lVar = new c0.l(this);
            lVar.h.f2084e = f.a.f2093v;
            lVar.f2118i.f2084e = f.a.f2094w;
            lVar.f2116f = 0;
            this.f1899d = lVar;
        }
        if (this.f1901e == null) {
            n nVar = new n(this);
            c0.f fVar = new c0.f(nVar);
            nVar.f2103k = fVar;
            nVar.f2104l = null;
            nVar.h.f2084e = f.a.f2095x;
            nVar.f2118i.f2084e = f.a.f2096y;
            fVar.f2084e = f.a.f2097z;
            nVar.f2116f = 1;
            this.f1901e = nVar;
        }
    }

    public d i(d.a aVar) {
        switch (aVar.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.J;
            case 2:
                return this.K;
            case 3:
                return this.L;
            case 4:
                return this.M;
            case 5:
                return this.N;
            case 6:
                return this.Q;
            case 7:
                return this.O;
            case 8:
                return this.P;
            default:
                throw new AssertionError(aVar.name());
        }
    }

    public final a j(int i6) {
        a[] aVarArr = this.U;
        if (i6 == 0) {
            return aVarArr[0];
        }
        if (i6 == 1) {
            return aVarArr[1];
        }
        return null;
    }

    public final int k() {
        if (this.f1909i0 == 8) {
            return 0;
        }
        return this.X;
    }

    public final e l(int i6) {
        d dVar;
        d dVar2;
        if (i6 != 0) {
            if (i6 == 1 && (dVar2 = (dVar = this.M).f1883f) != null && dVar2.f1883f == dVar) {
                return dVar2.f1881d;
            }
            return null;
        }
        d dVar3 = this.L;
        d dVar4 = dVar3.f1883f;
        if (dVar4 == null || dVar4.f1883f != dVar3) {
            return null;
        }
        return dVar4.f1881d;
    }

    public final e m(int i6) {
        d dVar;
        d dVar2;
        if (i6 != 0) {
            if (i6 == 1 && (dVar2 = (dVar = this.K).f1883f) != null && dVar2.f1883f == dVar) {
                return dVar2.f1881d;
            }
            return null;
        }
        d dVar3 = this.J;
        d dVar4 = dVar3.f1883f;
        if (dVar4 == null || dVar4.f1883f != dVar3) {
            return null;
        }
        return dVar4.f1881d;
    }

    public void n(StringBuilder sb) {
        sb.append("  " + this.f1910j + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.W);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.X);
        sb.append("\n");
        sb.append("    actualLeft:" + this.f1894a0);
        sb.append("\n");
        sb.append("    actualTop:" + this.f1896b0);
        sb.append("\n");
        p(sb, "left", this.J);
        p(sb, "top", this.K);
        p(sb, "right", this.L);
        p(sb, "bottom", this.M);
        p(sb, "baseline", this.N);
        p(sb, "centerX", this.O);
        p(sb, "centerY", this.P);
        int i6 = this.W;
        int i7 = this.f1900d0;
        int[] iArr = this.C;
        int i8 = iArr[0];
        int i9 = this.f1927u;
        int i10 = this.f1925r;
        float f6 = this.f1929w;
        a[] aVarArr = this.U;
        a aVar = aVarArr[0];
        float[] fArr = this.f1917m0;
        float f7 = fArr[0];
        o(sb, "    width", i6, i7, i8, i9, i10, f6, aVar);
        int i11 = this.X;
        int i12 = this.f1902e0;
        int i13 = iArr[1];
        int i14 = this.f1930x;
        int i15 = this.s;
        float f8 = this.f1932z;
        a aVar2 = aVarArr[1];
        float f9 = fArr[1];
        o(sb, "    height", i11, i12, i13, i14, i15, f8, aVar2);
        float f10 = this.Y;
        int i16 = this.Z;
        if (f10 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f10);
            sb.append(",");
            sb.append(i16);
            sb.append(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            sb.append("],\n");
        }
        H(sb, "    horizontalBias", this.f1904f0, 0.5f);
        H(sb, "    verticalBias", this.f1906g0, 0.5f);
        G(this.f1913k0, 0, "    horizontalChainStyle", sb);
        G(this.f1915l0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public final int q() {
        if (this.f1909i0 == 8) {
            return 0;
        }
        return this.W;
    }

    public final int r() {
        e eVar = this.V;
        return (eVar == null || !(eVar instanceof f)) ? this.f1894a0 : ((f) eVar).f1943y0 + this.f1894a0;
    }

    public final int s() {
        e eVar = this.V;
        return (eVar == null || !(eVar instanceof f)) ? this.f1896b0 : ((f) eVar).f1944z0 + this.f1896b0;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t(int i6) {
        if (i6 == 0) {
            return (this.J.f1883f != null ? 1 : 0) + (this.L.f1883f != null ? 1 : 0) < 2;
        }
        if ((this.K.f1883f != null ? 1 : 0) + (this.M.f1883f != null ? 1 : 0) + (this.N.f1883f != null ? 1 : 0) < 2) {
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String strE = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        sb.append(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        if (this.f1911j0 != null) {
            strE = m.e(new StringBuilder("id: "), this.f1911j0, " ");
        }
        sb.append(strE);
        sb.append("(");
        sb.append(this.f1894a0);
        sb.append(", ");
        sb.append(this.f1896b0);
        sb.append(") - (");
        sb.append(this.W);
        sb.append(" x ");
        return p0.a(sb, this.X, ")");
    }

    public final boolean u(int i6, int i7) {
        d dVar;
        d dVar2;
        d dVar3;
        d dVar4;
        if (i6 == 0) {
            d dVar5 = this.J;
            d dVar6 = dVar5.f1883f;
            if (dVar6 == null || !dVar6.f1880c || (dVar4 = (dVar3 = this.L).f1883f) == null || !dVar4.f1880c) {
                return false;
            }
            return (dVar4.d() - dVar3.e()) - (dVar5.e() + dVar5.f1883f.d()) >= i7;
        }
        d dVar7 = this.K;
        d dVar8 = dVar7.f1883f;
        if (dVar8 == null || !dVar8.f1880c || (dVar2 = (dVar = this.M).f1883f) == null || !dVar2.f1880c) {
            return false;
        }
        return (dVar2.d() - dVar.e()) - (dVar7.e() + dVar7.f1883f.d()) >= i7;
    }

    public final void v(d.a aVar, e eVar, d.a aVar2, int i6, int i7) {
        i(aVar).b(eVar.i(aVar2), i6, i7, true);
    }

    public final boolean w(int i6) {
        d dVar;
        d dVar2;
        int i7 = i6 * 2;
        d[] dVarArr = this.R;
        d dVar3 = dVarArr[i7];
        d dVar4 = dVar3.f1883f;
        return (dVar4 == null || dVar4.f1883f == dVar3 || (dVar2 = (dVar = dVarArr[i7 + 1]).f1883f) == null || dVar2.f1883f != dVar) ? false : true;
    }

    public final boolean x() {
        d dVar = this.J;
        d dVar2 = dVar.f1883f;
        if (dVar2 != null && dVar2.f1883f == dVar) {
            return true;
        }
        d dVar3 = this.L;
        d dVar4 = dVar3.f1883f;
        return dVar4 != null && dVar4.f1883f == dVar3;
    }

    public final boolean y() {
        d dVar = this.K;
        d dVar2 = dVar.f1883f;
        if (dVar2 != null && dVar2.f1883f == dVar) {
            return true;
        }
        d dVar3 = this.M;
        d dVar4 = dVar3.f1883f;
        return dVar4 != null && dVar4.f1883f == dVar3;
    }

    public final boolean z() {
        return this.f1905g && this.f1909i0 != 8;
    }
}
