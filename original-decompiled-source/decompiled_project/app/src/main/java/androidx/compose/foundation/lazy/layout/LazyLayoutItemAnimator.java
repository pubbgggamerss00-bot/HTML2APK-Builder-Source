package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.d;
import d0.j;
import d0.j0;
import d0.p;
import d0.q;
import d0.s0;
import d0.u;
import d0.v;
import d0.v0;
import d0.w;
import d0.y;
import f3.m;
import i2.a1;
import i2.h0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p.l0;
import p.m0;
import p.w0;
import p.y0;
import pg.f0;
import ph.h;
import ph.i0;
import q1.k1;
import qg.t;
import qg.x;
import s.e0;
import t1.f;

/* loaded from: classes.dex */
public final class LazyLayoutItemAnimator<T extends s0> {

    /* renamed from: b, reason: collision with root package name */
    public j0 f990b;

    /* renamed from: c, reason: collision with root package name */
    public int f991c;

    /* renamed from: j, reason: collision with root package name */
    public a f998j;

    /* renamed from: a, reason: collision with root package name */
    public final l0<Object, LazyLayoutItemAnimator<T>.b> f989a = w0.b();

    /* renamed from: d, reason: collision with root package name */
    public final m0<Object> f992d = y0.a();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f993e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f994f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f995g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f996h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f997i = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final d f999k = new DisplayingDisappearingItemsElement(this);

    public static final class DisplayingDisappearingItemsElement extends a1<a> {

        /* renamed from: b, reason: collision with root package name */
        public final LazyLayoutItemAnimator<?> f1000b;

        public DisplayingDisappearingItemsElement(LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            this.f1000b = lazyLayoutItemAnimator;
        }

        @Override // i2.a1
        public final d.c a() {
            a aVar = new a();
            aVar.f1001q = this.f1000b;
            return aVar;
        }

        @Override // i2.a1
        public final void b(d.c cVar) {
            a aVar = (a) cVar;
            LazyLayoutItemAnimator<?> lazyLayoutItemAnimator = aVar.f1001q;
            LazyLayoutItemAnimator<?> lazyLayoutItemAnimator2 = this.f1000b;
            if (r.a(lazyLayoutItemAnimator, lazyLayoutItemAnimator2) || !aVar.f1144a.f1157p) {
                return;
            }
            LazyLayoutItemAnimator<?> lazyLayoutItemAnimator3 = aVar.f1001q;
            lazyLayoutItemAnimator3.e();
            lazyLayoutItemAnimator3.f990b = null;
            lazyLayoutItemAnimator3.f991c = -1;
            lazyLayoutItemAnimator2.f998j = aVar;
            aVar.f1001q = lazyLayoutItemAnimator2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisplayingDisappearingItemsElement) && r.a(this.f1000b, ((DisplayingDisappearingItemsElement) obj).f1000b);
        }

        public final int hashCode() {
            return this.f1000b.hashCode();
        }

        public final String toString() {
            return "DisplayingDisappearingItemsElement(animator=" + this.f1000b + ')';
        }
    }

    public static final class a extends d.c implements i2.r {

        /* renamed from: q, reason: collision with root package name */
        public LazyLayoutItemAnimator<?> f1001q;

        public a() {
            throw null;
        }

        @Override // androidx.compose.ui.d.c
        public final void L1() {
            this.f1001q.f998j = this;
        }

        @Override // androidx.compose.ui.d.c
        public final void M1() {
            LazyLayoutItemAnimator<?> lazyLayoutItemAnimator = this.f1001q;
            lazyLayoutItemAnimator.e();
            lazyLayoutItemAnimator.f990b = null;
            lazyLayoutItemAnimator.f991c = -1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && r.a(this.f1001q, ((a) obj).f1001q);
        }

        public final int hashCode() {
            return this.f1001q.hashCode();
        }

        public final String toString() {
            return "DisplayingDisappearingItemsNode(animator=" + this.f1001q + ')';
        }

        @Override // i2.r
        public final void z(h0 h0Var) {
            s1.a aVar = h0Var.f13901a;
            ArrayList arrayList = this.f1001q.f997i;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                p pVar = (p) arrayList.get(i10);
                t1.d dVar = pVar.f7229n;
                if (dVar != null) {
                    long j10 = pVar.f7228m;
                    float f10 = (int) (j10 >> 32);
                    float f11 = (int) (j10 & BodyPartID.bodyIdMax);
                    long j11 = dVar.f27653t;
                    float f12 = f10 - ((int) (j11 >> 32));
                    float f13 = f11 - ((int) (j11 & BodyPartID.bodyIdMax));
                    aVar.f24173b.f24180a.f(f12, f13);
                    try {
                        f.a(h0Var, dVar);
                    } finally {
                        aVar.f24173b.f24180a.f(-f12, -f13);
                    }
                }
            }
            h0Var.z1();
        }
    }

    public final class b {

        /* renamed from: b, reason: collision with root package name */
        public f3.b f1003b;

        /* renamed from: c, reason: collision with root package name */
        public int f1004c;

        /* renamed from: d, reason: collision with root package name */
        public int f1005d;

        /* renamed from: f, reason: collision with root package name */
        public int f1007f;

        /* renamed from: g, reason: collision with root package name */
        public int f1008g;

        /* renamed from: a, reason: collision with root package name */
        public p[] f1002a = y.f7304a;

        /* renamed from: e, reason: collision with root package name */
        public int f1006e = 1;

        public static final class a extends s implements eh.a<f0> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ LazyLayoutItemAnimator<T> f1010a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(LazyLayoutItemAnimator<T> lazyLayoutItemAnimator) {
                super(0);
                this.f1010a = lazyLayoutItemAnimator;
            }

            @Override // eh.a
            public final f0 invoke() {
                a aVar = this.f1010a.f998j;
                if (aVar != null) {
                    i2.s.a(aVar);
                }
                return f0.f21461a;
            }
        }

        public b() {
        }

        public static void b(b bVar, s0 s0Var, i0 i0Var, k1 k1Var, int i10, int i11) {
            LazyLayoutItemAnimator.this.getClass();
            long j10 = s0Var.j(0);
            bVar.a(s0Var, i0Var, k1Var, i10, i11, (int) (!s0Var.h() ? j10 & BodyPartID.bodyIdMax : j10 >> 32));
        }

        public final void a(T t3, i0 i0Var, k1 k1Var, int i10, int i11, int i12) {
            p[] pVarArr = this.f1002a;
            int length = pVarArr.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    this.f1007f = i10;
                    this.f1008g = i11;
                    break;
                } else {
                    p pVar = pVarArr[i13];
                    if (pVar != null && pVar.f7222g) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
            int length2 = this.f1002a.length;
            for (int iB = t3.b(); iB < length2; iB++) {
                p pVar2 = this.f1002a[iB];
                if (pVar2 != null) {
                    pVar2.c();
                }
            }
            if (this.f1002a.length != t3.b()) {
                Object[] objArrCopyOf = Arrays.copyOf(this.f1002a, t3.b());
                r.d(objArrCopyOf, "copyOf(...)");
                this.f1002a = (p[]) objArrCopyOf;
            }
            this.f1003b = new f3.b(t3.c());
            this.f1004c = i12;
            this.f1005d = t3.k();
            this.f1006e = t3.e();
            int iB2 = t3.b();
            for (int i14 = 0; i14 < iB2; i14++) {
                Object objF = t3.f(i14);
                j jVar = objF instanceof j ? (j) objF : null;
                if (jVar == null) {
                    p pVar3 = this.f1002a[i14];
                    if (pVar3 != null) {
                        pVar3.c();
                    }
                    this.f1002a[i14] = null;
                } else {
                    p pVar4 = this.f1002a[i14];
                    if (pVar4 == null) {
                        pVar4 = new p(i0Var, k1Var, new a(LazyLayoutItemAnimator.this));
                        this.f1002a[i14] = pVar4;
                    }
                    pVar4.f7219d = jVar.f7154q;
                    pVar4.f7220e = jVar.f7155r;
                    pVar4.f7221f = jVar.f7156s;
                }
            }
        }
    }

    public static void c(s0 s0Var, int i10, b bVar) {
        int i11 = 0;
        long j10 = s0Var.j(0);
        long jA = s0Var.h() ? m.a(0, i10, 1, j10) : m.a(i10, 0, 2, j10);
        p[] pVarArr = bVar.f1002a;
        int length = pVarArr.length;
        int i12 = 0;
        while (i11 < length) {
            p pVar = pVarArr[i11];
            int i13 = i12 + 1;
            if (pVar != null) {
                pVar.f7227l = m.d(jA, m.c(s0Var.j(i12), j10));
            }
            i11++;
            i12 = i13;
        }
    }

    public static int h(int[] iArr, s0 s0Var) {
        int iK = s0Var.k();
        int iE = s0Var.e() + iK;
        int iMax = 0;
        while (iK < iE) {
            int iD = s0Var.d() + iArr[iK];
            iArr[iK] = iD;
            iMax = Math.max(iMax, iD);
            iK++;
        }
        return iMax;
    }

    public final p a(int i10, Object obj) {
        p[] pVarArr;
        LazyLayoutItemAnimator<T>.b bVarD = this.f989a.d(obj);
        if (bVarD == null || (pVarArr = bVarD.f1002a) == null) {
            return null;
        }
        return pVarArr[i10];
    }

    public final long b() {
        ArrayList arrayList = this.f997i;
        int size = arrayList.size();
        long jMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = (p) arrayList.get(i10);
            t1.d dVar = pVar.f7229n;
            if (dVar != null) {
                jMax = (Math.max((int) (jMax & BodyPartID.bodyIdMax), ((int) (pVar.f7227l & BodyPartID.bodyIdMax)) + ((int) (dVar.f27654u & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax) | (Math.max((int) (jMax >> 32), ((int) (pVar.f7227l >> 32)) + ((int) (dVar.f27654u >> 32))) << 32);
            }
        }
        return jMax;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d4  */
    /* JADX WARN: Type inference failed for: r11v27, types: [ph.k0, tg.e, tg.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i10, int i11, int i12, ArrayList arrayList, j0 j0Var, v0 v0Var, boolean z10, boolean z11, int i13, boolean z12, int i14, int i15, i0 i0Var, k1 k1Var) {
        l0<Object, LazyLayoutItemAnimator<T>.b> l0Var;
        Object obj;
        long j10;
        long j11;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int[] iArr;
        l0<Object, LazyLayoutItemAnimator<T>.b> l0Var2;
        m0<Object> m0Var;
        ArrayList arrayList5;
        ArrayList arrayList6;
        int i16;
        int i17;
        j0 j0Var2;
        int[] iArr2;
        l0<Object, LazyLayoutItemAnimator<T>.b> l0Var3;
        int iD;
        int i18;
        long[] jArr;
        int i19;
        long[] jArr2;
        m0<Object> m0Var2;
        l0<Object, LazyLayoutItemAnimator<T>.b> l0Var4;
        long j12;
        ArrayList arrayList7;
        l0<Object, LazyLayoutItemAnimator<T>.b> l0Var5;
        int i20;
        int i21;
        int i22;
        ArrayList arrayList8 = arrayList;
        int i23 = i13;
        j0 j0Var3 = this.f990b;
        this.f990b = j0Var;
        int size = arrayList8.size();
        int i24 = 0;
        loop0: while (true) {
            l0Var = this.f989a;
            if (i24 < size) {
                s0 s0Var = (s0) arrayList8.get(i24);
                int iB = s0Var.b();
                for (int i25 = 0; i25 < iB; i25++) {
                    obj = null;
                    Object objF = s0Var.f(i25);
                    if ((objF instanceof j ? (j) objF : null) != null) {
                        break loop0;
                    }
                }
                i24++;
            } else {
                obj = null;
                if (l0Var.e()) {
                    e();
                    return;
                }
            }
        }
        int i26 = this.f991c;
        s0 s0Var2 = (s0) x.D(arrayList8);
        this.f991c = s0Var2 != null ? s0Var2.getIndex() : 0;
        if (z10) {
            j10 = BodyPartID.bodyIdMax;
            j11 = (i10 & BodyPartID.bodyIdMax) | (0 << 32);
        } else {
            j10 = BodyPartID.bodyIdMax;
            j11 = (i10 << 32) | (0 & BodyPartID.bodyIdMax);
        }
        boolean z13 = z11 || !z12;
        Object[] objArr = l0Var.f20738b;
        long[] jArr3 = l0Var.f20737a;
        int length = jArr3.length - 2;
        m0<Object> m0Var3 = this.f992d;
        boolean z14 = z13;
        if (length >= 0) {
            int i27 = 0;
            while (true) {
                long j13 = jArr3[i27];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i28 = 8 - ((~(i27 - length)) >>> 31);
                    int i29 = 0;
                    while (i29 < i28) {
                        if ((j13 & 255) < 128) {
                            i22 = i29;
                            m0Var3.d(objArr[(i27 << 3) + i29]);
                        } else {
                            i22 = i29;
                        }
                        j13 >>= 8;
                        i29 = i22 + 1;
                    }
                    if (i28 != 8) {
                        break;
                    } else if (i27 == length) {
                        break;
                    } else {
                        i27++;
                    }
                }
            }
        }
        int size2 = arrayList8.size();
        int i30 = 0;
        while (true) {
            arrayList2 = this.f997i;
            arrayList3 = this.f994f;
            arrayList4 = this.f993e;
            if (i30 >= size2) {
                break;
            }
            s0 s0Var3 = (s0) arrayList8.get(i30);
            int i31 = size2;
            m0Var3.l(s0Var3.getKey());
            int iB2 = s0Var3.b();
            int i32 = i30;
            int i33 = 0;
            while (true) {
                if (i33 >= iB2) {
                    f(s0Var3.getKey());
                    break;
                }
                int i34 = iB2;
                Object objF2 = s0Var3.f(i33);
                int i35 = i33;
                if ((objF2 instanceof j ? (j) objF2 : obj) != null) {
                    LazyLayoutItemAnimator<T>.b bVarD = l0Var.d(s0Var3.getKey());
                    int iC = j0Var3 != null ? j0Var3.c(s0Var3.getKey()) : -1;
                    boolean z15 = iC == -1 && j0Var3 != null;
                    if (bVarD == null) {
                        LazyLayoutItemAnimator<T>.b bVar = new b();
                        b.b(bVar, s0Var3, i0Var, k1Var, i14, i15);
                        boolean z16 = z15;
                        l0Var.l(s0Var3.getKey(), bVar);
                        if (s0Var3.getIndex() == iC || iC == -1) {
                            long j14 = s0Var3.j(0);
                            c(s0Var3, (int) (s0Var3.h() ? j14 & j10 : j14 >> 32), bVar);
                            if (z16) {
                                p[] pVarArr = bVar.f1002a;
                                for (p pVar : pVarArr) {
                                    if (pVar != null) {
                                        pVar.a();
                                        f0 f0Var = f0.f21461a;
                                    }
                                }
                            }
                        } else if (iC < i26) {
                            arrayList4.add(s0Var3);
                        } else {
                            arrayList3.add(s0Var3);
                        }
                    } else {
                        boolean z17 = z15;
                        if (z14) {
                            b.b(bVarD, s0Var3, i0Var, k1Var, i14, i15);
                            p[] pVarArr2 = bVarD.f1002a;
                            int length2 = pVarArr2.length;
                            int i36 = 0;
                            while (i36 < length2) {
                                p[] pVarArr3 = pVarArr2;
                                p pVar2 = pVarArr3[i36];
                                int i37 = length2;
                                int i38 = i36;
                                if (pVar2 != null && !m.b(pVar2.f7227l, p.f7214s)) {
                                    pVar2.f7227l = m.d(pVar2.f7227l, j11);
                                }
                                i36 = i38 + 1;
                                pVarArr2 = pVarArr3;
                                length2 = i37;
                            }
                            if (z17) {
                                for (p pVar3 : bVarD.f1002a) {
                                    if (pVar3 != null) {
                                        if (pVar3.b()) {
                                            arrayList2.remove(pVar3);
                                            a aVar = this.f998j;
                                            if (aVar != null) {
                                                i2.s.a(aVar);
                                                f0 f0Var2 = f0.f21461a;
                                            }
                                        }
                                        pVar3.a();
                                    }
                                }
                            }
                            g(s0Var3, false);
                        }
                    }
                } else {
                    i33 = i35 + 1;
                    iB2 = i34;
                }
            }
            i30 = i32 + 1;
            arrayList8 = arrayList;
            size2 = i31;
        }
        int[] iArr3 = new int[i23];
        if (z14 && j0Var3 != null) {
            if (!arrayList4.isEmpty()) {
                if (arrayList4.size() > 1) {
                    t.v(arrayList4, new w(j0Var3, 0));
                }
                int size3 = arrayList4.size();
                for (int i39 = 0; i39 < size3; i39++) {
                    s0 s0Var4 = (s0) arrayList4.get(i39);
                    int iH = i14 - h(iArr3, s0Var4);
                    LazyLayoutItemAnimator<T>.b bVarD2 = l0Var.d(s0Var4.getKey());
                    r.b(bVarD2);
                    c(s0Var4, iH, bVarD2);
                    g(s0Var4, false);
                }
                Arrays.fill(iArr3, 0, i23, 0);
            }
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() > 1) {
                    t.v(arrayList3, new u(j0Var3));
                }
                int size4 = arrayList3.size();
                for (int i40 = 0; i40 < size4; i40++) {
                    s0 s0Var5 = (s0) arrayList3.get(i40);
                    int iH2 = (h(iArr3, s0Var5) + i15) - s0Var5.d();
                    LazyLayoutItemAnimator<T>.b bVarD3 = l0Var.d(s0Var5.getKey());
                    r.b(bVarD3);
                    c(s0Var5, iH2, bVarD3);
                    g(s0Var5, false);
                }
                Arrays.fill(iArr3, 0, i23, 0);
            }
        }
        Object[] objArr2 = m0Var3.f20753b;
        long[] jArr4 = m0Var3.f20752a;
        int length3 = jArr4.length - 2;
        ArrayList arrayList9 = this.f996h;
        ArrayList arrayList10 = this.f995g;
        if (length3 >= 0) {
            m0<Object> m0Var4 = m0Var3;
            arrayList5 = arrayList3;
            int i41 = 0;
            while (true) {
                long j15 = jArr4[i41];
                iArr = iArr3;
                Object[] objArr3 = objArr2;
                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i42 = 8 - ((~(i41 - length3)) >>> 31);
                    int i43 = 0;
                    while (i43 < i42) {
                        if ((j15 & 255) < 128) {
                            i19 = i43;
                            Object obj2 = objArr3[(i41 << 3) + i43];
                            jArr2 = jArr4;
                            LazyLayoutItemAnimator<T>.b bVarD4 = l0Var.d(obj2);
                            if (bVarD4 != 0) {
                                m0Var2 = m0Var4;
                                j12 = j15;
                                int iC2 = j0Var.c(obj2);
                                int iMin = Math.min(i23, bVarD4.f1006e);
                                bVarD4.f1006e = iMin;
                                arrayList7 = arrayList4;
                                bVarD4.f1005d = Math.min(i23 - iMin, bVarD4.f1005d);
                                if (iC2 == -1) {
                                    p[] pVarArr4 = bVarD4.f1002a;
                                    int length4 = pVarArr4.length;
                                    int i44 = 0;
                                    boolean z18 = false;
                                    int i45 = 0;
                                    while (i44 < length4) {
                                        p[] pVarArr5 = pVarArr4;
                                        p pVar4 = pVarArr5[i44];
                                        int i46 = i45 + 1;
                                        if (pVar4 != null) {
                                            if (pVar4.b()) {
                                                l0Var5 = l0Var;
                                                i20 = i44;
                                                i21 = length4;
                                            } else {
                                                i20 = i44;
                                                if (((Boolean) pVar4.f7226k.getValue()).booleanValue()) {
                                                    pVar4.c();
                                                    bVarD4.f1002a[i45] = obj;
                                                    arrayList2.remove(pVar4);
                                                    a aVar2 = this.f998j;
                                                    if (aVar2 != null) {
                                                        i2.s.a(aVar2);
                                                        f0 f0Var3 = f0.f21461a;
                                                    }
                                                    l0Var5 = l0Var;
                                                } else {
                                                    t1.d dVar = pVar4.f7229n;
                                                    if (dVar != null) {
                                                        i21 = length4;
                                                        e0<Float> e0Var = pVar4.f7221f;
                                                        if (pVar4.b() || e0Var == null) {
                                                            l0Var5 = l0Var;
                                                        } else {
                                                            pVar4.e(true);
                                                            l0Var5 = l0Var;
                                                            ?? r11 = obj;
                                                            h.c(pVar4.f7216a, r11, r11, new q(pVar4, e0Var, dVar, r11), 3);
                                                        }
                                                    } else {
                                                        l0Var5 = l0Var;
                                                        i21 = length4;
                                                    }
                                                    if (pVar4.b()) {
                                                        arrayList2.add(pVar4);
                                                        a aVar3 = this.f998j;
                                                        if (aVar3 != null) {
                                                            i2.s.a(aVar3);
                                                            f0 f0Var4 = f0.f21461a;
                                                        }
                                                        obj = null;
                                                    } else {
                                                        pVar4.c();
                                                        obj = null;
                                                        bVarD4.f1002a[i45] = null;
                                                        i44 = i20 + 1;
                                                        pVarArr4 = pVarArr5;
                                                        i45 = i46;
                                                        length4 = i21;
                                                        l0Var = l0Var5;
                                                    }
                                                }
                                            }
                                            z18 = true;
                                            i44 = i20 + 1;
                                            pVarArr4 = pVarArr5;
                                            i45 = i46;
                                            length4 = i21;
                                            l0Var = l0Var5;
                                        } else {
                                            l0Var5 = l0Var;
                                            i20 = i44;
                                        }
                                        i21 = length4;
                                        i44 = i20 + 1;
                                        pVarArr4 = pVarArr5;
                                        i45 = i46;
                                        length4 = i21;
                                        l0Var = l0Var5;
                                    }
                                    l0Var4 = l0Var;
                                    if (!z18) {
                                        f(obj2);
                                    }
                                } else {
                                    l0Var4 = l0Var;
                                    f3.b bVar2 = bVarD4.f1003b;
                                    r.b(bVar2);
                                    s0 s0VarA = v0Var.a(iC2, bVarD4.f1005d, bVarD4.f1006e, bVar2.f8811a);
                                    s0VarA.i();
                                    p[] pVarArr6 = bVarD4.f1002a;
                                    int length5 = pVarArr6.length;
                                    int i47 = 0;
                                    while (true) {
                                        if (i47 < length5) {
                                            p pVar5 = pVarArr6[i47];
                                            if (pVar5 != null && ((Boolean) pVar5.f7223h.getValue()).booleanValue()) {
                                                break;
                                            } else {
                                                i47++;
                                            }
                                        } else if (j0Var3 == null || iC2 != j0Var3.c(obj2)) {
                                            break;
                                        } else {
                                            f(obj2);
                                        }
                                    }
                                    bVarD4.a(s0VarA, i0Var, k1Var, i14, i15, bVarD4.f1004c);
                                    if (iC2 < this.f991c) {
                                        arrayList10.add(s0VarA);
                                    } else {
                                        arrayList9.add(s0VarA);
                                    }
                                }
                            }
                            j15 = j12 >> 8;
                            i23 = i13;
                            i43 = i19 + 1;
                            m0Var4 = m0Var2;
                            jArr4 = jArr2;
                            arrayList4 = arrayList7;
                            l0Var = l0Var4;
                        } else {
                            i19 = i43;
                            jArr2 = jArr4;
                        }
                        m0Var2 = m0Var4;
                        l0Var4 = l0Var;
                        j12 = j15;
                        arrayList7 = arrayList4;
                        j15 = j12 >> 8;
                        i23 = i13;
                        i43 = i19 + 1;
                        m0Var4 = m0Var2;
                        jArr4 = jArr2;
                        arrayList4 = arrayList7;
                        l0Var = l0Var4;
                    }
                    jArr = jArr4;
                    m0Var = m0Var4;
                    l0Var2 = l0Var;
                    arrayList6 = arrayList4;
                    if (i42 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                    m0Var = m0Var4;
                    l0Var2 = l0Var;
                    arrayList6 = arrayList4;
                }
                if (i41 == length3) {
                    break;
                }
                i41++;
                i23 = i13;
                iArr3 = iArr;
                objArr2 = objArr3;
                m0Var4 = m0Var;
                jArr4 = jArr;
                arrayList4 = arrayList6;
                l0Var = l0Var2;
            }
        } else {
            iArr = iArr3;
            l0Var2 = l0Var;
            m0Var = m0Var3;
            arrayList5 = arrayList3;
            arrayList6 = arrayList4;
        }
        if (arrayList10.isEmpty()) {
            i16 = i11;
            i17 = i12;
            j0Var2 = j0Var;
            iArr2 = iArr;
            l0Var3 = l0Var2;
        } else {
            if (arrayList10.size() > 1) {
                j0Var2 = j0Var;
                t.v(arrayList10, new d0.x(j0Var2));
            } else {
                j0Var2 = j0Var;
            }
            int size5 = arrayList10.size();
            int i48 = 0;
            while (i48 < size5) {
                s0 s0Var6 = (s0) arrayList10.get(i48);
                l0<Object, LazyLayoutItemAnimator<T>.b> l0Var6 = l0Var2;
                LazyLayoutItemAnimator<T>.b bVarD5 = l0Var6.d(s0Var6.getKey());
                r.b(bVarD5);
                LazyLayoutItemAnimator<T>.b bVar3 = bVarD5;
                int[] iArr4 = iArr;
                int iH3 = h(iArr4, s0Var6);
                if (z11) {
                    s0 s0Var7 = (s0) x.B(arrayList);
                    long j16 = s0Var7.j(0);
                    i18 = (int) (s0Var7.h() ? j16 & j10 : j16 >> 32);
                } else {
                    i18 = bVar3.f1007f;
                }
                s0Var6.n(i18 - iH3, bVar3.f1004c, i11, i12);
                if (z14) {
                    g(s0Var6, true);
                }
                i48++;
                l0Var2 = l0Var6;
                iArr = iArr4;
            }
            i16 = i11;
            i17 = i12;
            iArr2 = iArr;
            l0Var3 = l0Var2;
            Arrays.fill(iArr2, 0, i13, 0);
        }
        if (!arrayList9.isEmpty()) {
            if (arrayList9.size() > 1) {
                t.v(arrayList9, new v(j0Var2));
            }
            int size6 = arrayList9.size();
            for (int i49 = 0; i49 < size6; i49++) {
                s0 s0Var8 = (s0) arrayList9.get(i49);
                LazyLayoutItemAnimator<T>.b bVarD6 = l0Var3.d(s0Var8.getKey());
                r.b(bVarD6);
                LazyLayoutItemAnimator<T>.b bVar4 = bVarD6;
                int iH4 = h(iArr2, s0Var8);
                if (z11) {
                    s0 s0Var9 = (s0) x.J(arrayList);
                    long j17 = s0Var9.j(0);
                    iD = s0Var9.d() + ((int) (s0Var9.h() ? j17 & j10 : j17 >> 32));
                } else {
                    iD = bVar4.f1008g;
                }
                s0Var8.n((iD - s0Var8.d()) + iH4, bVar4.f1004c, i16, i17);
                if (z14) {
                    g(s0Var8, true);
                }
            }
        }
        Collections.reverse(arrayList10);
        f0 f0Var5 = f0.f21461a;
        arrayList.addAll(0, arrayList10);
        arrayList.addAll(arrayList9);
        arrayList6.clear();
        arrayList5.clear();
        arrayList10.clear();
        arrayList9.clear();
        m0Var.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        l0<Object, LazyLayoutItemAnimator<T>.b> l0Var = this.f989a;
        if (l0Var.f20741e != 0) {
            Object[] objArr = l0Var.f20739c;
            long[] jArr = l0Var.f20737a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j10) < 128) {
                                for (p pVar : ((b) objArr[(i10 << 3) + i12]).f1002a) {
                                    if (pVar != null) {
                                        pVar.c();
                                    }
                                }
                            }
                            j10 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        } else if (i10 == length) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
            l0Var.f();
        }
    }

    public final void f(Object obj) {
        p[] pVarArr;
        LazyLayoutItemAnimator<T>.b bVarJ = this.f989a.j(obj);
        if (bVarJ == null || (pVarArr = bVarJ.f1002a) == null) {
            return;
        }
        for (p pVar : pVarArr) {
            if (pVar != null) {
                pVar.c();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(T t3, boolean z10) {
        LazyLayoutItemAnimator<T>.b bVarD = this.f989a.d(t3.getKey());
        r.b(bVarD);
        p[] pVarArr = bVarD.f1002a;
        int length = pVarArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            p pVar = pVarArr[i10];
            int i12 = i11 + 1;
            if (pVar != null) {
                long j10 = t3.j(i11);
                long j11 = pVar.f7227l;
                if (!m.b(j11, p.f7214s) && !m.b(j11, j10)) {
                    long jC = m.c(j10, j11);
                    e0<m> e0Var = pVar.f7220e;
                    if (e0Var != null) {
                        long jC2 = m.c(((m) pVar.f7232q.getValue()).f8820a, jC);
                        pVar.g(jC2);
                        pVar.f(true);
                        pVar.f7222g = z10;
                        h.c(pVar.f7216a, null, null, new d0.r(pVar, e0Var, jC2, null), 3);
                    }
                }
                pVar.f7227l = j10;
            }
            i10++;
            i11 = i12;
        }
    }
}
