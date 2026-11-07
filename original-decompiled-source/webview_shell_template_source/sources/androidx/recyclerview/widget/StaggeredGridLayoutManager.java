package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import u0.f0;
import u0.n0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.m implements RecyclerView.w.b {
    public final d B;
    public final int C;
    public boolean D;
    public boolean E;
    public e F;
    public final Rect G;
    public final b H;
    public final boolean I;
    public int[] J;
    public final a K;

    /* renamed from: p, reason: collision with root package name */
    public final int f1539p;

    /* renamed from: q, reason: collision with root package name */
    public final f[] f1540q;

    /* renamed from: r, reason: collision with root package name */
    public final s f1541r;
    public final s s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1542t;

    /* renamed from: u, reason: collision with root package name */
    public int f1543u;

    /* renamed from: v, reason: collision with root package name */
    public final n f1544v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1545w;

    /* renamed from: y, reason: collision with root package name */
    public final BitSet f1547y;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1546x = false;

    /* renamed from: z, reason: collision with root package name */
    public int f1548z = -1;
    public int A = Integer.MIN_VALUE;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            StaggeredGridLayoutManager.this.C0();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        public int f1549a;

        /* renamed from: b, reason: collision with root package name */
        public int f1550b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f1551c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f1552d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f1553e;

        /* renamed from: f, reason: collision with root package name */
        public int[] f1554f;

        public b() {
            a();
        }

        public final void a() {
            this.f1549a = -1;
            this.f1550b = Integer.MIN_VALUE;
            this.f1551c = false;
            this.f1552d = false;
            this.f1553e = false;
            int[] iArr = this.f1554f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class c extends RecyclerView.n {

        /* renamed from: e, reason: collision with root package name */
        public f f1556e;
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public int[] f1557a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList f1558b;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        @SuppressLint({"BanParcelableUsage"})
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0017a();
            public int s;

            /* renamed from: t, reason: collision with root package name */
            public int f1559t;

            /* renamed from: u, reason: collision with root package name */
            public int[] f1560u;

            /* renamed from: v, reason: collision with root package name */
            public boolean f1561v;

            /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            public class C0017a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                public final a createFromParcel(Parcel parcel) {
                    a aVar = new a();
                    aVar.s = parcel.readInt();
                    aVar.f1559t = parcel.readInt();
                    aVar.f1561v = parcel.readInt() == 1;
                    int i6 = parcel.readInt();
                    if (i6 > 0) {
                        int[] iArr = new int[i6];
                        aVar.f1560u = iArr;
                        parcel.readIntArray(iArr);
                    }
                    return aVar;
                }

                @Override // android.os.Parcelable.Creator
                public final a[] newArray(int i6) {
                    return new a[i6];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                return "FullSpanItem{mPosition=" + this.s + ", mGapDir=" + this.f1559t + ", mHasUnwantedGapAfter=" + this.f1561v + ", mGapPerSpan=" + Arrays.toString(this.f1560u) + '}';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i6) {
                parcel.writeInt(this.s);
                parcel.writeInt(this.f1559t);
                parcel.writeInt(this.f1561v ? 1 : 0);
                int[] iArr = this.f1560u;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f1560u);
                }
            }
        }

        public final void a() {
            int[] iArr = this.f1557a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f1558b = null;
        }

        public final void b(int i6) {
            int[] iArr = this.f1557a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i6, 10) + 1];
                this.f1557a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i6 >= iArr.length) {
                int length = iArr.length;
                while (length <= i6) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f1557a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f1557a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public final void c(int i6, int i7) {
            int[] iArr = this.f1557a;
            if (iArr == null || i6 >= iArr.length) {
                return;
            }
            int i8 = i6 + i7;
            b(i8);
            int[] iArr2 = this.f1557a;
            System.arraycopy(iArr2, i6, iArr2, i8, (iArr2.length - i6) - i7);
            Arrays.fill(this.f1557a, i6, i8, -1);
            ArrayList arrayList = this.f1558b;
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f1558b.get(size);
                int i9 = aVar.s;
                if (i9 >= i6) {
                    aVar.s = i9 + i7;
                }
            }
        }

        public final void d(int i6, int i7) {
            int[] iArr = this.f1557a;
            if (iArr == null || i6 >= iArr.length) {
                return;
            }
            int i8 = i6 + i7;
            b(i8);
            int[] iArr2 = this.f1557a;
            System.arraycopy(iArr2, i8, iArr2, i6, (iArr2.length - i6) - i7);
            int[] iArr3 = this.f1557a;
            Arrays.fill(iArr3, iArr3.length - i7, iArr3.length, -1);
            ArrayList arrayList = this.f1558b;
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f1558b.get(size);
                int i9 = aVar.s;
                if (i9 >= i6) {
                    if (i9 < i8) {
                        this.f1558b.remove(size);
                    } else {
                        aVar.s = i9 - i7;
                    }
                }
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    @SuppressLint({"BanParcelableUsage"})
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();
        public boolean A;
        public boolean B;
        public int s;

        /* renamed from: t, reason: collision with root package name */
        public int f1562t;

        /* renamed from: u, reason: collision with root package name */
        public int f1563u;

        /* renamed from: v, reason: collision with root package name */
        public int[] f1564v;

        /* renamed from: w, reason: collision with root package name */
        public int f1565w;

        /* renamed from: x, reason: collision with root package name */
        public int[] f1566x;

        /* renamed from: y, reason: collision with root package name */
        public ArrayList f1567y;

        /* renamed from: z, reason: collision with root package name */
        public boolean f1568z;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public final e createFromParcel(Parcel parcel) {
                e eVar = new e();
                eVar.s = parcel.readInt();
                eVar.f1562t = parcel.readInt();
                int i6 = parcel.readInt();
                eVar.f1563u = i6;
                if (i6 > 0) {
                    int[] iArr = new int[i6];
                    eVar.f1564v = iArr;
                    parcel.readIntArray(iArr);
                }
                int i7 = parcel.readInt();
                eVar.f1565w = i7;
                if (i7 > 0) {
                    int[] iArr2 = new int[i7];
                    eVar.f1566x = iArr2;
                    parcel.readIntArray(iArr2);
                }
                eVar.f1568z = parcel.readInt() == 1;
                eVar.A = parcel.readInt() == 1;
                eVar.B = parcel.readInt() == 1;
                eVar.f1567y = parcel.readArrayList(d.a.class.getClassLoader());
                return eVar;
            }

            @Override // android.os.Parcelable.Creator
            public final e[] newArray(int i6) {
                return new e[i6];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeInt(this.s);
            parcel.writeInt(this.f1562t);
            parcel.writeInt(this.f1563u);
            if (this.f1563u > 0) {
                parcel.writeIntArray(this.f1564v);
            }
            parcel.writeInt(this.f1565w);
            if (this.f1565w > 0) {
                parcel.writeIntArray(this.f1566x);
            }
            parcel.writeInt(this.f1568z ? 1 : 0);
            parcel.writeInt(this.A ? 1 : 0);
            parcel.writeInt(this.B ? 1 : 0);
            parcel.writeList(this.f1567y);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class f {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList<View> f1569a = new ArrayList<>();

        /* renamed from: b, reason: collision with root package name */
        public int f1570b = Integer.MIN_VALUE;

        /* renamed from: c, reason: collision with root package name */
        public int f1571c = Integer.MIN_VALUE;

        /* renamed from: d, reason: collision with root package name */
        public int f1572d = 0;

        /* renamed from: e, reason: collision with root package name */
        public final int f1573e;

        public f(int i6) {
            this.f1573e = i6;
        }

        public final void a() {
            View view = this.f1569a.get(r0.size() - 1);
            c cVar = (c) view.getLayoutParams();
            this.f1571c = StaggeredGridLayoutManager.this.f1541r.b(view);
            cVar.getClass();
        }

        public final void b() {
            this.f1569a.clear();
            this.f1570b = Integer.MIN_VALUE;
            this.f1571c = Integer.MIN_VALUE;
            this.f1572d = 0;
        }

        public final int c() {
            return StaggeredGridLayoutManager.this.f1545w ? e(r1.size() - 1, -1) : e(0, this.f1569a.size());
        }

        public final int d() {
            return StaggeredGridLayoutManager.this.f1545w ? e(0, this.f1569a.size()) : e(r1.size() - 1, -1);
        }

        public final int e(int i6, int i7) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            int iK = staggeredGridLayoutManager.f1541r.k();
            int iG = staggeredGridLayoutManager.f1541r.g();
            int i8 = i7 > i6 ? 1 : -1;
            while (i6 != i7) {
                View view = this.f1569a.get(i6);
                int iE = staggeredGridLayoutManager.f1541r.e(view);
                int iB = staggeredGridLayoutManager.f1541r.b(view);
                boolean z6 = iE <= iG;
                boolean z7 = iB >= iK;
                if (z6 && z7 && (iE < iK || iB > iG)) {
                    return RecyclerView.m.H(view);
                }
                i6 += i8;
            }
            return -1;
        }

        public final int f(int i6) {
            int i7 = this.f1571c;
            if (i7 != Integer.MIN_VALUE) {
                return i7;
            }
            if (this.f1569a.size() == 0) {
                return i6;
            }
            a();
            return this.f1571c;
        }

        public final View g(int i6, int i7) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            ArrayList<View> arrayList = this.f1569a;
            View view = null;
            if (i7 != -1) {
                int size = arrayList.size() - 1;
                while (size >= 0) {
                    View view2 = arrayList.get(size);
                    if ((staggeredGridLayoutManager.f1545w && RecyclerView.m.H(view2) >= i6) || ((!staggeredGridLayoutManager.f1545w && RecyclerView.m.H(view2) <= i6) || !view2.hasFocusable())) {
                        break;
                    }
                    size--;
                    view = view2;
                }
                return view;
            }
            int size2 = arrayList.size();
            int i8 = 0;
            while (i8 < size2) {
                View view3 = arrayList.get(i8);
                if ((staggeredGridLayoutManager.f1545w && RecyclerView.m.H(view3) <= i6) || ((!staggeredGridLayoutManager.f1545w && RecyclerView.m.H(view3) >= i6) || !view3.hasFocusable())) {
                    break;
                }
                i8++;
                view = view3;
            }
            return view;
        }

        public final int h(int i6) {
            int i7 = this.f1570b;
            if (i7 != Integer.MIN_VALUE) {
                return i7;
            }
            ArrayList<View> arrayList = this.f1569a;
            if (arrayList.size() == 0) {
                return i6;
            }
            View view = arrayList.get(0);
            c cVar = (c) view.getLayoutParams();
            this.f1570b = StaggeredGridLayoutManager.this.f1541r.e(view);
            cVar.getClass();
            return this.f1570b;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i6, int i7) {
        this.f1539p = -1;
        this.f1545w = false;
        d dVar = new d();
        this.B = dVar;
        this.C = 2;
        this.G = new Rect();
        this.H = new b();
        this.I = true;
        this.K = new a();
        RecyclerView.m.c cVarI = RecyclerView.m.I(context, attributeSet, i6, i7);
        int i8 = cVarI.f1488a;
        if (i8 != 0 && i8 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i8 != this.f1542t) {
            this.f1542t = i8;
            s sVar = this.f1541r;
            this.f1541r = this.s;
            this.s = sVar;
            n0();
        }
        int i9 = cVarI.f1489b;
        c(null);
        if (i9 != this.f1539p) {
            dVar.a();
            n0();
            this.f1539p = i9;
            this.f1547y = new BitSet(this.f1539p);
            this.f1540q = new f[this.f1539p];
            for (int i10 = 0; i10 < this.f1539p; i10++) {
                this.f1540q[i10] = new f(i10);
            }
            n0();
        }
        boolean z6 = cVarI.f1490c;
        c(null);
        e eVar = this.F;
        if (eVar != null && eVar.f1568z != z6) {
            eVar.f1568z = z6;
        }
        this.f1545w = z6;
        n0();
        n nVar = new n();
        nVar.f1696a = true;
        nVar.f1701f = 0;
        nVar.f1702g = 0;
        this.f1544v = nVar;
        this.f1541r = s.a(this, this.f1542t);
        this.s = s.a(this, 1 - this.f1542t);
    }

    public static int c1(int i6, int i7, int i8) {
        int mode;
        return (!(i7 == 0 && i8 == 0) && ((mode = View.MeasureSpec.getMode(i6)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i6) - i7) - i8), mode) : i6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean B0() {
        return this.F == null;
    }

    public final boolean C0() {
        int iJ0;
        if (v() != 0 && this.C != 0 && this.f1478g) {
            if (this.f1546x) {
                iJ0 = K0();
                J0();
            } else {
                iJ0 = J0();
                K0();
            }
            if (iJ0 == 0 && O0() != null) {
                this.B.a();
                this.f1477f = true;
                n0();
                return true;
            }
        }
        return false;
    }

    public final int D0(RecyclerView.x xVar) {
        if (v() == 0) {
            return 0;
        }
        boolean z6 = !this.I;
        return y.b(xVar, this.f1541r, G0(z6), F0(z6), this, this.I, this.f1546x);
    }

    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    public final int E0(RecyclerView.s sVar, n nVar, RecyclerView.x xVar) {
        f fVar;
        ?? r8;
        int iH;
        int iC;
        int iK;
        int iC2;
        int i6;
        int i7;
        int i8;
        int i9 = 0;
        int i10 = 1;
        this.f1547y.set(0, this.f1539p, true);
        n nVar2 = this.f1544v;
        int i11 = nVar2.f1703i ? nVar.f1700e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : nVar.f1700e == 1 ? nVar.f1702g + nVar.f1697b : nVar.f1701f - nVar.f1697b;
        int i12 = nVar.f1700e;
        for (int i13 = 0; i13 < this.f1539p; i13++) {
            if (!this.f1540q[i13].f1569a.isEmpty()) {
                b1(this.f1540q[i13], i12, i11);
            }
        }
        int iG = this.f1546x ? this.f1541r.g() : this.f1541r.k();
        boolean z6 = false;
        while (true) {
            int i14 = nVar.f1698c;
            if (i14 < 0 || i14 >= xVar.b() || (!nVar2.f1703i && this.f1547y.isEmpty())) {
                break;
            }
            View viewD = sVar.d(nVar.f1698c);
            nVar.f1698c += nVar.f1699d;
            c cVar = (c) viewD.getLayoutParams();
            int iB = cVar.f1492a.b();
            d dVar = this.B;
            int[] iArr = dVar.f1557a;
            int i15 = (iArr == null || iB >= iArr.length) ? -1 : iArr[iB];
            if (i15 == -1) {
                if (S0(nVar.f1700e)) {
                    i8 = this.f1539p - i10;
                    i7 = -1;
                    i6 = -1;
                } else {
                    i6 = i10;
                    i7 = this.f1539p;
                    i8 = i9;
                }
                f fVar2 = null;
                if (nVar.f1700e == i10) {
                    int iK2 = this.f1541r.k();
                    int i16 = Integer.MAX_VALUE;
                    while (i8 != i7) {
                        f fVar3 = this.f1540q[i8];
                        int iF = fVar3.f(iK2);
                        if (iF < i16) {
                            i16 = iF;
                            fVar2 = fVar3;
                        }
                        i8 += i6;
                    }
                } else {
                    int iG2 = this.f1541r.g();
                    int i17 = Integer.MIN_VALUE;
                    while (i8 != i7) {
                        f fVar4 = this.f1540q[i8];
                        int iH2 = fVar4.h(iG2);
                        if (iH2 > i17) {
                            fVar2 = fVar4;
                            i17 = iH2;
                        }
                        i8 += i6;
                    }
                }
                fVar = fVar2;
                dVar.b(iB);
                dVar.f1557a[iB] = fVar.f1573e;
            } else {
                fVar = this.f1540q[i15];
            }
            cVar.f1556e = fVar;
            if (nVar.f1700e == 1) {
                r8 = 0;
                b(viewD, -1, false);
            } else {
                r8 = 0;
                b(viewD, 0, false);
            }
            if (this.f1542t == 1) {
                Q0(viewD, RecyclerView.m.w(r8, this.f1543u, this.f1482l, r8, ((ViewGroup.MarginLayoutParams) cVar).width), RecyclerView.m.w(true, this.f1485o, this.f1483m, D() + G(), ((ViewGroup.MarginLayoutParams) cVar).height));
            } else {
                Q0(viewD, RecyclerView.m.w(true, this.f1484n, this.f1482l, F() + E(), ((ViewGroup.MarginLayoutParams) cVar).width), RecyclerView.m.w(false, this.f1543u, this.f1483m, 0, ((ViewGroup.MarginLayoutParams) cVar).height));
            }
            if (nVar.f1700e == 1) {
                iC = fVar.f(iG);
                iH = this.f1541r.c(viewD) + iC;
            } else {
                iH = fVar.h(iG);
                iC = iH - this.f1541r.c(viewD);
            }
            if (nVar.f1700e == 1) {
                f fVar5 = cVar.f1556e;
                fVar5.getClass();
                c cVar2 = (c) viewD.getLayoutParams();
                cVar2.f1556e = fVar5;
                ArrayList<View> arrayList = fVar5.f1569a;
                arrayList.add(viewD);
                fVar5.f1571c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    fVar5.f1570b = Integer.MIN_VALUE;
                }
                if (cVar2.f1492a.h() || cVar2.f1492a.k()) {
                    fVar5.f1572d = StaggeredGridLayoutManager.this.f1541r.c(viewD) + fVar5.f1572d;
                }
            } else {
                f fVar6 = cVar.f1556e;
                fVar6.getClass();
                c cVar3 = (c) viewD.getLayoutParams();
                cVar3.f1556e = fVar6;
                ArrayList<View> arrayList2 = fVar6.f1569a;
                arrayList2.add(0, viewD);
                fVar6.f1570b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    fVar6.f1571c = Integer.MIN_VALUE;
                }
                if (cVar3.f1492a.h() || cVar3.f1492a.k()) {
                    fVar6.f1572d = StaggeredGridLayoutManager.this.f1541r.c(viewD) + fVar6.f1572d;
                }
            }
            if (P0() && this.f1542t == 1) {
                iC2 = this.s.g() - (((this.f1539p - 1) - fVar.f1573e) * this.f1543u);
                iK = iC2 - this.s.c(viewD);
            } else {
                iK = this.s.k() + (fVar.f1573e * this.f1543u);
                iC2 = this.s.c(viewD) + iK;
            }
            if (this.f1542t == 1) {
                RecyclerView.m.N(viewD, iK, iC, iC2, iH);
            } else {
                RecyclerView.m.N(viewD, iC, iK, iH, iC2);
            }
            b1(fVar, nVar2.f1700e, i11);
            U0(sVar, nVar2);
            if (nVar2.h && viewD.hasFocusable()) {
                this.f1547y.set(fVar.f1573e, false);
            }
            i10 = 1;
            z6 = true;
            i9 = 0;
        }
        if (!z6) {
            U0(sVar, nVar2);
        }
        int iK3 = nVar2.f1700e == -1 ? this.f1541r.k() - M0(this.f1541r.k()) : L0(this.f1541r.g()) - this.f1541r.g();
        if (iK3 > 0) {
            return Math.min(nVar.f1697b, iK3);
        }
        return 0;
    }

    public final View F0(boolean z6) {
        int iK = this.f1541r.k();
        int iG = this.f1541r.g();
        View view = null;
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            int iE = this.f1541r.e(viewU);
            int iB = this.f1541r.b(viewU);
            if (iB > iK && iE < iG) {
                if (iB <= iG || !z6) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    public final View G0(boolean z6) {
        int iK = this.f1541r.k();
        int iG = this.f1541r.g();
        int iV = v();
        View view = null;
        for (int i6 = 0; i6 < iV; i6++) {
            View viewU = u(i6);
            int iE = this.f1541r.e(viewU);
            if (this.f1541r.b(viewU) > iK && iE < iG) {
                if (iE >= iK || !z6) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    public final void H0(RecyclerView.s sVar, RecyclerView.x xVar, boolean z6) {
        int iG;
        int iL0 = L0(Integer.MIN_VALUE);
        if (iL0 != Integer.MIN_VALUE && (iG = this.f1541r.g() - iL0) > 0) {
            int i6 = iG - (-Y0(-iG, sVar, xVar));
            if (!z6 || i6 <= 0) {
                return;
            }
            this.f1541r.o(i6);
        }
    }

    public final void I0(RecyclerView.s sVar, RecyclerView.x xVar, boolean z6) {
        int iK;
        int iM0 = M0(Integer.MAX_VALUE);
        if (iM0 != Integer.MAX_VALUE && (iK = iM0 - this.f1541r.k()) > 0) {
            int iY0 = iK - Y0(iK, sVar, xVar);
            if (!z6 || iY0 <= 0) {
                return;
            }
            this.f1541r.o(-iY0);
        }
    }

    public final int J0() {
        if (v() == 0) {
            return 0;
        }
        return RecyclerView.m.H(u(0));
    }

    public final int K0() {
        int iV = v();
        if (iV == 0) {
            return 0;
        }
        return RecyclerView.m.H(u(iV - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean L() {
        return this.C != 0;
    }

    public final int L0(int i6) {
        int iF = this.f1540q[0].f(i6);
        for (int i7 = 1; i7 < this.f1539p; i7++) {
            int iF2 = this.f1540q[i7].f(i6);
            if (iF2 > iF) {
                iF = iF2;
            }
        }
        return iF;
    }

    public final int M0(int i6) {
        int iH = this.f1540q[0].h(i6);
        for (int i7 = 1; i7 < this.f1539p; i7++) {
            int iH2 = this.f1540q[i7].h(i6);
            if (iH2 < iH) {
                iH = iH2;
            }
        }
        return iH;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x006e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N0(int i6, int i7, int i8) {
        int i9;
        int i10;
        d dVar;
        int[] iArr;
        ArrayList arrayList;
        d.a aVar;
        int size;
        int i11;
        int i12;
        int iK0 = this.f1546x ? K0() : J0();
        if (i8 != 8) {
            i9 = i6 + i7;
        } else {
            if (i6 >= i7) {
                i9 = i6 + 1;
                i10 = i7;
                dVar = this.B;
                iArr = dVar.f1557a;
                if (iArr != null && i10 < iArr.length) {
                    arrayList = dVar.f1558b;
                    if (arrayList != null) {
                        if (arrayList == null) {
                            aVar = null;
                            if (aVar != null) {
                                dVar.f1558b.remove(aVar);
                            }
                            size = dVar.f1558b.size();
                            i11 = 0;
                            while (true) {
                                if (i11 < size) {
                                    i11 = -1;
                                    break;
                                } else if (((d.a) dVar.f1558b.get(i11)).s >= i10) {
                                    break;
                                } else {
                                    i11++;
                                }
                            }
                            if (i11 == -1) {
                                d.a aVar2 = (d.a) dVar.f1558b.get(i11);
                                dVar.f1558b.remove(i11);
                                i12 = aVar2.s;
                            } else {
                                i12 = -1;
                            }
                            if (i12 != -1) {
                                int[] iArr2 = dVar.f1557a;
                                Arrays.fill(iArr2, i10, iArr2.length, -1);
                                int length = dVar.f1557a.length;
                            } else {
                                Arrays.fill(dVar.f1557a, i10, Math.min(i12 + 1, dVar.f1557a.length), -1);
                            }
                        } else {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                aVar = (d.a) dVar.f1558b.get(size2);
                                if (aVar.s == i10) {
                                    break;
                                }
                            }
                            aVar = null;
                            if (aVar != null) {
                            }
                            size = dVar.f1558b.size();
                            i11 = 0;
                            while (true) {
                                if (i11 < size) {
                                }
                                i11++;
                            }
                            if (i11 == -1) {
                            }
                            if (i12 != -1) {
                            }
                        }
                    }
                }
                if (i8 != 1) {
                    dVar.c(i6, i7);
                } else if (i8 == 2) {
                    dVar.d(i6, i7);
                } else if (i8 == 8) {
                    dVar.d(i6, 1);
                    dVar.c(i7, 1);
                }
                if (i9 > iK0) {
                    return;
                }
                if (i10 <= (this.f1546x ? J0() : K0())) {
                    n0();
                    return;
                }
                return;
            }
            i9 = i7 + 1;
        }
        i10 = i6;
        dVar = this.B;
        iArr = dVar.f1557a;
        if (iArr != null) {
            arrayList = dVar.f1558b;
            if (arrayList != null) {
            }
        }
        if (i8 != 1) {
        }
        if (i9 > iK0) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void O(int i6) {
        super.O(i6);
        for (int i7 = 0; i7 < this.f1539p; i7++) {
            f fVar = this.f1540q[i7];
            int i8 = fVar.f1570b;
            if (i8 != Integer.MIN_VALUE) {
                fVar.f1570b = i8 + i6;
            }
            int i9 = fVar.f1571c;
            if (i9 != Integer.MIN_VALUE) {
                fVar.f1571c = i9 + i6;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x002c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View O0() {
        int iV = v();
        int i6 = iV - 1;
        BitSet bitSet = new BitSet(this.f1539p);
        bitSet.set(0, this.f1539p, true);
        char c7 = (this.f1542t == 1 && P0()) ? (char) 1 : (char) 65535;
        if (this.f1546x) {
            iV = -1;
        } else {
            i6 = 0;
        }
        int i7 = i6 < iV ? 1 : -1;
        while (i6 != iV) {
            View viewU = u(i6);
            c cVar = (c) viewU.getLayoutParams();
            if (bitSet.get(cVar.f1556e.f1573e)) {
                f fVar = cVar.f1556e;
                if (this.f1546x) {
                    int i8 = fVar.f1571c;
                    if (i8 == Integer.MIN_VALUE) {
                        fVar.a();
                        i8 = fVar.f1571c;
                    }
                    if (i8 < this.f1541r.g()) {
                        ArrayList<View> arrayList = fVar.f1569a;
                        ((c) arrayList.get(arrayList.size() - 1).getLayoutParams()).getClass();
                        return viewU;
                    }
                } else {
                    int i9 = fVar.f1570b;
                    ArrayList<View> arrayList2 = fVar.f1569a;
                    if (i9 == Integer.MIN_VALUE) {
                        View view = arrayList2.get(0);
                        c cVar2 = (c) view.getLayoutParams();
                        fVar.f1570b = StaggeredGridLayoutManager.this.f1541r.e(view);
                        cVar2.getClass();
                        i9 = fVar.f1570b;
                    }
                    if (i9 > this.f1541r.k()) {
                        ((c) arrayList2.get(0).getLayoutParams()).getClass();
                        return viewU;
                    }
                }
                bitSet.clear(cVar.f1556e.f1573e);
            }
            i6 += i7;
            if (i6 != iV) {
                View viewU2 = u(i6);
                if (this.f1546x) {
                    int iB = this.f1541r.b(viewU);
                    int iB2 = this.f1541r.b(viewU2);
                    if (iB < iB2) {
                        return viewU;
                    }
                    if (iB == iB2) {
                        if ((cVar.f1556e.f1573e - ((c) viewU2.getLayoutParams()).f1556e.f1573e >= 0) == (c7 >= 0)) {
                            return viewU;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int iE = this.f1541r.e(viewU);
                    int iE2 = this.f1541r.e(viewU2);
                    if (iE > iE2) {
                        return viewU;
                    }
                    if (iE == iE2) {
                        if ((cVar.f1556e.f1573e - ((c) viewU2.getLayoutParams()).f1556e.f1573e >= 0) == (c7 >= 0)) {
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void P(int i6) {
        super.P(i6);
        for (int i7 = 0; i7 < this.f1539p; i7++) {
            f fVar = this.f1540q[i7];
            int i8 = fVar.f1570b;
            if (i8 != Integer.MIN_VALUE) {
                fVar.f1570b = i8 + i6;
            }
            int i9 = fVar.f1571c;
            if (i9 != Integer.MIN_VALUE) {
                fVar.f1571c = i9 + i6;
            }
        }
    }

    public final boolean P0() {
        return C() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void Q() {
        this.B.a();
        for (int i6 = 0; i6 < this.f1539p; i6++) {
            this.f1540q[i6].b();
        }
    }

    public final void Q0(View view, int i6, int i7) {
        RecyclerView recyclerView = this.f1473b;
        Rect rect = this.G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.N(view));
        }
        c cVar = (c) view.getLayoutParams();
        int iC1 = c1(i6, ((ViewGroup.MarginLayoutParams) cVar).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int iC12 = c1(i7, ((ViewGroup.MarginLayoutParams) cVar).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect.bottom);
        if (w0(view, iC1, iC12, cVar)) {
            view.measure(iC1, iC12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0417  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R0(RecyclerView.s sVar, RecyclerView.x xVar, boolean z6) {
        e eVar;
        int iH;
        int i6;
        boolean z7;
        e eVar2 = this.F;
        b bVar = this.H;
        if (!(eVar2 == null && this.f1548z == -1) && xVar.b() == 0) {
            i0(sVar);
            bVar.a();
            return;
        }
        boolean z8 = bVar.f1553e;
        StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
        boolean z9 = true;
        boolean z10 = (z8 && this.f1548z == -1 && this.F == null) ? false : true;
        d dVar = this.B;
        if (z10) {
            bVar.a();
            e eVar3 = this.F;
            if (eVar3 != null) {
                int i7 = eVar3.f1563u;
                if (i7 > 0) {
                    if (i7 == this.f1539p) {
                        for (int i8 = 0; i8 < this.f1539p; i8++) {
                            this.f1540q[i8].b();
                            e eVar4 = this.F;
                            int iG = eVar4.f1564v[i8];
                            if (iG != Integer.MIN_VALUE) {
                                iG += eVar4.A ? this.f1541r.g() : this.f1541r.k();
                            }
                            f fVar = this.f1540q[i8];
                            fVar.f1570b = iG;
                            fVar.f1571c = iG;
                        }
                    } else {
                        eVar3.f1564v = null;
                        eVar3.f1563u = 0;
                        eVar3.f1565w = 0;
                        eVar3.f1566x = null;
                        eVar3.f1567y = null;
                        eVar3.s = eVar3.f1562t;
                    }
                }
                e eVar5 = this.F;
                this.E = eVar5.B;
                boolean z11 = eVar5.f1568z;
                c(null);
                e eVar6 = this.F;
                if (eVar6 != null && eVar6.f1568z != z11) {
                    eVar6.f1568z = z11;
                }
                this.f1545w = z11;
                n0();
                X0();
                e eVar7 = this.F;
                int i9 = eVar7.s;
                if (i9 != -1) {
                    this.f1548z = i9;
                    bVar.f1551c = eVar7.A;
                } else {
                    bVar.f1551c = this.f1546x;
                }
                if (eVar7.f1565w > 1) {
                    dVar.f1557a = eVar7.f1566x;
                    dVar.f1558b = eVar7.f1567y;
                }
            } else {
                X0();
                bVar.f1551c = this.f1546x;
            }
            if (xVar.f1532g || (i6 = this.f1548z) == -1) {
                if (this.D) {
                    int iB = xVar.b();
                    int iV = v();
                    for (int i10 = 0; i10 < iV; i10++) {
                        int iH2 = RecyclerView.m.H(u(i10));
                        if (iH2 >= 0 && iH2 < iB) {
                            iH = iH2;
                            break;
                        }
                    }
                    iH = 0;
                    bVar.f1549a = iH;
                    bVar.f1550b = Integer.MIN_VALUE;
                    bVar.f1553e = true;
                } else {
                    int iB2 = xVar.b();
                    for (int iV2 = v() - 1; iV2 >= 0; iV2--) {
                        iH = RecyclerView.m.H(u(iV2));
                        if (iH >= 0 && iH < iB2) {
                            break;
                        }
                    }
                    iH = 0;
                    bVar.f1549a = iH;
                    bVar.f1550b = Integer.MIN_VALUE;
                    bVar.f1553e = true;
                }
            } else if (i6 < 0 || i6 >= xVar.b()) {
                this.f1548z = -1;
                this.A = Integer.MIN_VALUE;
                if (this.D) {
                }
            } else {
                e eVar8 = this.F;
                if (eVar8 == null || eVar8.s == -1 || eVar8.f1563u < 1) {
                    View viewQ = q(this.f1548z);
                    if (viewQ != null) {
                        bVar.f1549a = this.f1546x ? K0() : J0();
                        if (this.A != Integer.MIN_VALUE) {
                            if (bVar.f1551c) {
                                bVar.f1550b = (this.f1541r.g() - this.A) - this.f1541r.b(viewQ);
                            } else {
                                bVar.f1550b = (this.f1541r.k() + this.A) - this.f1541r.e(viewQ);
                            }
                        } else if (this.f1541r.c(viewQ) > this.f1541r.l()) {
                            bVar.f1550b = bVar.f1551c ? this.f1541r.g() : this.f1541r.k();
                        } else {
                            int iE = this.f1541r.e(viewQ) - this.f1541r.k();
                            if (iE < 0) {
                                bVar.f1550b = -iE;
                            } else {
                                int iG2 = this.f1541r.g() - this.f1541r.b(viewQ);
                                if (iG2 < 0) {
                                    bVar.f1550b = iG2;
                                } else {
                                    bVar.f1550b = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i11 = this.f1548z;
                        bVar.f1549a = i11;
                        int i12 = this.A;
                        if (i12 == Integer.MIN_VALUE) {
                            if (v() == 0) {
                                z7 = this.f1546x;
                            } else if ((i11 < J0()) != this.f1546x) {
                            }
                            bVar.f1551c = z7;
                            bVar.f1550b = z7 ? staggeredGridLayoutManager.f1541r.g() : staggeredGridLayoutManager.f1541r.k();
                        } else if (bVar.f1551c) {
                            bVar.f1550b = staggeredGridLayoutManager.f1541r.g() - i12;
                        } else {
                            bVar.f1550b = staggeredGridLayoutManager.f1541r.k() + i12;
                        }
                        bVar.f1552d = true;
                    }
                } else {
                    bVar.f1550b = Integer.MIN_VALUE;
                    bVar.f1549a = this.f1548z;
                }
                bVar.f1553e = true;
            }
        }
        if (this.F == null && this.f1548z == -1 && (bVar.f1551c != this.D || P0() != this.E)) {
            dVar.a();
            bVar.f1552d = true;
        }
        if (v() > 0 && ((eVar = this.F) == null || eVar.f1563u < 1)) {
            if (bVar.f1552d) {
                for (int i13 = 0; i13 < this.f1539p; i13++) {
                    this.f1540q[i13].b();
                    int i14 = bVar.f1550b;
                    if (i14 != Integer.MIN_VALUE) {
                        f fVar2 = this.f1540q[i13];
                        fVar2.f1570b = i14;
                        fVar2.f1571c = i14;
                    }
                }
            } else if (z10 || bVar.f1554f == null) {
                for (int i15 = 0; i15 < this.f1539p; i15++) {
                    f fVar3 = this.f1540q[i15];
                    boolean z12 = this.f1546x;
                    int i16 = bVar.f1550b;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    int iF = z12 ? fVar3.f(Integer.MIN_VALUE) : fVar3.h(Integer.MIN_VALUE);
                    fVar3.b();
                    if (iF != Integer.MIN_VALUE && ((!z12 || iF >= staggeredGridLayoutManager2.f1541r.g()) && (z12 || iF <= staggeredGridLayoutManager2.f1541r.k()))) {
                        if (i16 != Integer.MIN_VALUE) {
                            iF += i16;
                        }
                        fVar3.f1571c = iF;
                        fVar3.f1570b = iF;
                    }
                }
                f[] fVarArr = this.f1540q;
                int length = fVarArr.length;
                int[] iArr = bVar.f1554f;
                if (iArr == null || iArr.length < length) {
                    bVar.f1554f = new int[staggeredGridLayoutManager.f1540q.length];
                }
                for (int i17 = 0; i17 < length; i17++) {
                    bVar.f1554f[i17] = fVarArr[i17].h(Integer.MIN_VALUE);
                }
            } else {
                for (int i18 = 0; i18 < this.f1539p; i18++) {
                    f fVar4 = this.f1540q[i18];
                    fVar4.b();
                    int i19 = bVar.f1554f[i18];
                    fVar4.f1570b = i19;
                    fVar4.f1571c = i19;
                }
            }
        }
        p(sVar);
        n nVar = this.f1544v;
        nVar.f1696a = false;
        int iL = this.s.l();
        this.f1543u = iL / this.f1539p;
        View.MeasureSpec.makeMeasureSpec(iL, this.s.i());
        a1(bVar.f1549a, xVar);
        if (bVar.f1551c) {
            Z0(-1);
            E0(sVar, nVar, xVar);
            Z0(1);
            nVar.f1698c = bVar.f1549a + nVar.f1699d;
            E0(sVar, nVar, xVar);
        } else {
            Z0(1);
            E0(sVar, nVar, xVar);
            Z0(-1);
            nVar.f1698c = bVar.f1549a + nVar.f1699d;
            E0(sVar, nVar, xVar);
        }
        if (this.s.i() != 1073741824) {
            int iV3 = v();
            float fMax = 0.0f;
            for (int i20 = 0; i20 < iV3; i20++) {
                View viewU = u(i20);
                float fC = this.s.c(viewU);
                if (fC >= fMax) {
                    ((c) viewU.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fC);
                }
            }
            int i21 = this.f1543u;
            int iRound = Math.round(fMax * this.f1539p);
            if (this.s.i() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.s.l());
            }
            this.f1543u = iRound / this.f1539p;
            View.MeasureSpec.makeMeasureSpec(iRound, this.s.i());
            if (this.f1543u != i21) {
                for (int i22 = 0; i22 < iV3; i22++) {
                    View viewU2 = u(i22);
                    c cVar = (c) viewU2.getLayoutParams();
                    cVar.getClass();
                    if (P0() && this.f1542t == 1) {
                        int i23 = -((this.f1539p - 1) - cVar.f1556e.f1573e);
                        viewU2.offsetLeftAndRight((this.f1543u * i23) - (i23 * i21));
                    } else {
                        int i24 = cVar.f1556e.f1573e;
                        int i25 = this.f1543u * i24;
                        int i26 = i24 * i21;
                        if (this.f1542t == 1) {
                            viewU2.offsetLeftAndRight(i25 - i26);
                        } else {
                            viewU2.offsetTopAndBottom(i25 - i26);
                        }
                    }
                }
            }
        }
        if (v() > 0) {
            if (this.f1546x) {
                H0(sVar, xVar, true);
                I0(sVar, xVar, false);
            } else {
                I0(sVar, xVar, true);
                H0(sVar, xVar, false);
            }
        }
        if (!z6 || xVar.f1532g || this.C == 0 || v() <= 0 || O0() == null) {
            z9 = false;
        } else {
            RecyclerView recyclerView = this.f1473b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.K);
            }
            if (!C0()) {
            }
        }
        if (xVar.f1532g) {
            bVar.a();
        }
        this.D = bVar.f1551c;
        this.E = P0();
        if (z9) {
            bVar.a();
            R0(sVar, xVar, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void S(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f1473b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i6 = 0; i6 < this.f1539p; i6++) {
            this.f1540q[i6].b();
        }
        recyclerView.requestLayout();
    }

    public final boolean S0(int i6) {
        if (this.f1542t == 0) {
            return (i6 == -1) != this.f1546x;
        }
        return ((i6 == -1) == this.f1546x) == P0();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0051  */
    @Override // androidx.recyclerview.widget.RecyclerView.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T(View view, int i6, RecyclerView.s sVar, RecyclerView.x xVar) {
        View viewD;
        int i7;
        if (v() != 0) {
            RecyclerView recyclerView = this.f1473b;
            if (recyclerView == null || (viewD = recyclerView.D(view)) == null || this.f1472a.f1590c.contains(viewD)) {
                viewD = null;
            }
            if (viewD != null) {
                X0();
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 17) {
                            if (i6 != 33) {
                                if (i6 == 66 ? this.f1542t == 0 : !(i6 != 130 || this.f1542t != 1)) {
                                    i7 = 1;
                                }
                            } else if (this.f1542t == 1) {
                                i7 = -1;
                            }
                            i7 = Integer.MIN_VALUE;
                        } else if (this.f1542t != 0) {
                            i7 = Integer.MIN_VALUE;
                        }
                    } else if (this.f1542t != 1 && P0()) {
                    }
                } else if (this.f1542t != 1 && P0()) {
                }
                if (i7 != Integer.MIN_VALUE) {
                    c cVar = (c) viewD.getLayoutParams();
                    cVar.getClass();
                    f fVar = cVar.f1556e;
                    int iK0 = i7 == 1 ? K0() : J0();
                    a1(iK0, xVar);
                    Z0(i7);
                    n nVar = this.f1544v;
                    nVar.f1698c = nVar.f1699d + iK0;
                    nVar.f1697b = (int) (this.f1541r.l() * 0.33333334f);
                    nVar.h = true;
                    nVar.f1696a = false;
                    E0(sVar, nVar, xVar);
                    this.D = this.f1546x;
                    View viewG = fVar.g(iK0, i7);
                    if (viewG != null && viewG != viewD) {
                        return viewG;
                    }
                    if (S0(i7)) {
                        for (int i8 = this.f1539p - 1; i8 >= 0; i8--) {
                            View viewG2 = this.f1540q[i8].g(iK0, i7);
                            if (viewG2 != null && viewG2 != viewD) {
                                return viewG2;
                            }
                        }
                    } else {
                        for (int i9 = 0; i9 < this.f1539p; i9++) {
                            View viewG3 = this.f1540q[i9].g(iK0, i7);
                            if (viewG3 != null && viewG3 != viewD) {
                                return viewG3;
                            }
                        }
                    }
                    boolean z6 = (this.f1545w ^ true) == (i7 == -1);
                    View viewQ = q(z6 ? fVar.c() : fVar.d());
                    if (viewQ != null && viewQ != viewD) {
                        return viewQ;
                    }
                    if (S0(i7)) {
                        for (int i10 = this.f1539p - 1; i10 >= 0; i10--) {
                            if (i10 != fVar.f1573e) {
                                View viewQ2 = q(z6 ? this.f1540q[i10].c() : this.f1540q[i10].d());
                                if (viewQ2 != null && viewQ2 != viewD) {
                                    return viewQ2;
                                }
                            }
                        }
                    } else {
                        for (int i11 = 0; i11 < this.f1539p; i11++) {
                            View viewQ3 = q(z6 ? this.f1540q[i11].c() : this.f1540q[i11].d());
                            if (viewQ3 != null && viewQ3 != viewD) {
                                return viewQ3;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final void T0(int i6, RecyclerView.x xVar) {
        int iJ0;
        int i7;
        if (i6 > 0) {
            iJ0 = K0();
            i7 = 1;
        } else {
            iJ0 = J0();
            i7 = -1;
        }
        n nVar = this.f1544v;
        nVar.f1696a = true;
        a1(iJ0, xVar);
        Z0(i7);
        nVar.f1698c = iJ0 + nVar.f1699d;
        nVar.f1697b = Math.abs(i6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View viewG0 = G0(false);
            View viewF0 = F0(false);
            if (viewG0 == null || viewF0 == null) {
                return;
            }
            int iH = RecyclerView.m.H(viewG0);
            int iH2 = RecyclerView.m.H(viewF0);
            if (iH < iH2) {
                accessibilityEvent.setFromIndex(iH);
                accessibilityEvent.setToIndex(iH2);
            } else {
                accessibilityEvent.setFromIndex(iH2);
                accessibilityEvent.setToIndex(iH);
            }
        }
    }

    public final void U0(RecyclerView.s sVar, n nVar) {
        if (!nVar.f1696a || nVar.f1703i) {
            return;
        }
        if (nVar.f1697b == 0) {
            if (nVar.f1700e == -1) {
                V0(sVar, nVar.f1702g);
                return;
            } else {
                W0(sVar, nVar.f1701f);
                return;
            }
        }
        int i6 = 1;
        if (nVar.f1700e == -1) {
            int i7 = nVar.f1701f;
            int iH = this.f1540q[0].h(i7);
            while (i6 < this.f1539p) {
                int iH2 = this.f1540q[i6].h(i7);
                if (iH2 > iH) {
                    iH = iH2;
                }
                i6++;
            }
            int i8 = i7 - iH;
            V0(sVar, i8 < 0 ? nVar.f1702g : nVar.f1702g - Math.min(i8, nVar.f1697b));
            return;
        }
        int i9 = nVar.f1702g;
        int iF = this.f1540q[0].f(i9);
        while (i6 < this.f1539p) {
            int iF2 = this.f1540q[i6].f(i9);
            if (iF2 < iF) {
                iF = iF2;
            }
            i6++;
        }
        int i10 = iF - nVar.f1702g;
        W0(sVar, i10 < 0 ? nVar.f1701f : Math.min(i10, nVar.f1697b) + nVar.f1701f);
    }

    public final void V0(RecyclerView.s sVar, int i6) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            if (this.f1541r.e(viewU) < i6 || this.f1541r.n(viewU) < i6) {
                return;
            }
            c cVar = (c) viewU.getLayoutParams();
            cVar.getClass();
            if (cVar.f1556e.f1569a.size() == 1) {
                return;
            }
            f fVar = cVar.f1556e;
            ArrayList<View> arrayList = fVar.f1569a;
            int size = arrayList.size();
            View viewRemove = arrayList.remove(size - 1);
            c cVar2 = (c) viewRemove.getLayoutParams();
            cVar2.f1556e = null;
            if (cVar2.f1492a.h() || cVar2.f1492a.k()) {
                fVar.f1572d -= StaggeredGridLayoutManager.this.f1541r.c(viewRemove);
            }
            if (size == 1) {
                fVar.f1570b = Integer.MIN_VALUE;
            }
            fVar.f1571c = Integer.MIN_VALUE;
            k0(viewU, sVar);
        }
    }

    public final void W0(RecyclerView.s sVar, int i6) {
        while (v() > 0) {
            View viewU = u(0);
            if (this.f1541r.b(viewU) > i6 || this.f1541r.m(viewU) > i6) {
                return;
            }
            c cVar = (c) viewU.getLayoutParams();
            cVar.getClass();
            if (cVar.f1556e.f1569a.size() == 1) {
                return;
            }
            f fVar = cVar.f1556e;
            ArrayList<View> arrayList = fVar.f1569a;
            View viewRemove = arrayList.remove(0);
            c cVar2 = (c) viewRemove.getLayoutParams();
            cVar2.f1556e = null;
            if (arrayList.size() == 0) {
                fVar.f1571c = Integer.MIN_VALUE;
            }
            if (cVar2.f1492a.h() || cVar2.f1492a.k()) {
                fVar.f1572d -= StaggeredGridLayoutManager.this.f1541r.c(viewRemove);
            }
            fVar.f1570b = Integer.MIN_VALUE;
            k0(viewU, sVar);
        }
    }

    public final void X0() {
        if (this.f1542t == 1 || !P0()) {
            this.f1546x = this.f1545w;
        } else {
            this.f1546x = !this.f1545w;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void Y(int i6, int i7) {
        N0(i6, i7, 1);
    }

    public final int Y0(int i6, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (v() == 0 || i6 == 0) {
            return 0;
        }
        T0(i6, xVar);
        n nVar = this.f1544v;
        int iE0 = E0(sVar, nVar, xVar);
        if (nVar.f1697b >= iE0) {
            i6 = i6 < 0 ? -iE0 : iE0;
        }
        this.f1541r.o(-i6);
        this.D = this.f1546x;
        nVar.f1697b = 0;
        U0(sVar, nVar);
        return i6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void Z() {
        this.B.a();
        n0();
    }

    public final void Z0(int i6) {
        n nVar = this.f1544v;
        nVar.f1700e = i6;
        nVar.f1699d = this.f1546x != (i6 == -1) ? -1 : 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    @Override // androidx.recyclerview.widget.RecyclerView.w.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PointF a(int i6) {
        int i7 = -1;
        if (v() != 0) {
            if ((i6 < J0()) == this.f1546x) {
            }
        } else if (this.f1546x) {
            i7 = 1;
        }
        PointF pointF = new PointF();
        if (i7 == 0) {
            return null;
        }
        if (this.f1542t == 0) {
            pointF.x = i7;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i7;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void a0(int i6, int i7) {
        N0(i6, i7, 8);
    }

    public final void a1(int i6, RecyclerView.x xVar) {
        int iL;
        int iL2;
        int i7;
        n nVar = this.f1544v;
        boolean z6 = false;
        nVar.f1697b = 0;
        nVar.f1698c = i6;
        o oVar = this.f1476e;
        if (oVar == null || !oVar.f1516e || (i7 = xVar.f1526a) == -1) {
            iL = 0;
            iL2 = 0;
        } else {
            if (this.f1546x == (i7 < i6)) {
                iL = this.f1541r.l();
                iL2 = 0;
            } else {
                iL2 = this.f1541r.l();
                iL = 0;
            }
        }
        RecyclerView recyclerView = this.f1473b;
        if (recyclerView == null || !recyclerView.f1432z) {
            nVar.f1702g = this.f1541r.f() + iL;
            nVar.f1701f = -iL2;
        } else {
            nVar.f1701f = this.f1541r.k() - iL2;
            nVar.f1702g = this.f1541r.g() + iL;
        }
        nVar.h = false;
        nVar.f1696a = true;
        if (this.f1541r.i() == 0 && this.f1541r.f() == 0) {
            z6 = true;
        }
        nVar.f1703i = z6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void b0(int i6, int i7) {
        N0(i6, i7, 2);
    }

    public final void b1(f fVar, int i6, int i7) {
        int i8 = fVar.f1572d;
        int i9 = fVar.f1573e;
        if (i6 != -1) {
            int i10 = fVar.f1571c;
            if (i10 == Integer.MIN_VALUE) {
                fVar.a();
                i10 = fVar.f1571c;
            }
            if (i10 - i8 >= i7) {
                this.f1547y.set(i9, false);
                return;
            }
            return;
        }
        int i11 = fVar.f1570b;
        if (i11 == Integer.MIN_VALUE) {
            View view = fVar.f1569a.get(0);
            c cVar = (c) view.getLayoutParams();
            fVar.f1570b = StaggeredGridLayoutManager.this.f1541r.e(view);
            cVar.getClass();
            i11 = fVar.f1570b;
        }
        if (i11 + i8 <= i7) {
            this.f1547y.set(i9, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void c0(int i6, int i7) {
        N0(i6, i7, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean d() {
        return this.f1542t == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void d0(RecyclerView.s sVar, RecyclerView.x xVar) {
        R0(sVar, xVar, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean e() {
        return this.f1542t == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void e0(RecyclerView.x xVar) {
        this.f1548z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean f(RecyclerView.n nVar) {
        return nVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void f0(Parcelable parcelable) {
        if (parcelable instanceof e) {
            e eVar = (e) parcelable;
            this.F = eVar;
            if (this.f1548z != -1) {
                eVar.s = -1;
                eVar.f1562t = -1;
                eVar.f1564v = null;
                eVar.f1563u = 0;
                eVar.f1565w = 0;
                eVar.f1566x = null;
                eVar.f1567y = null;
            }
            n0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final Parcelable g0() {
        int iH;
        int iK;
        int[] iArr;
        e eVar = this.F;
        if (eVar != null) {
            e eVar2 = new e();
            eVar2.f1563u = eVar.f1563u;
            eVar2.s = eVar.s;
            eVar2.f1562t = eVar.f1562t;
            eVar2.f1564v = eVar.f1564v;
            eVar2.f1565w = eVar.f1565w;
            eVar2.f1566x = eVar.f1566x;
            eVar2.f1568z = eVar.f1568z;
            eVar2.A = eVar.A;
            eVar2.B = eVar.B;
            eVar2.f1567y = eVar.f1567y;
            return eVar2;
        }
        e eVar3 = new e();
        eVar3.f1568z = this.f1545w;
        eVar3.A = this.D;
        eVar3.B = this.E;
        d dVar = this.B;
        if (dVar == null || (iArr = dVar.f1557a) == null) {
            eVar3.f1565w = 0;
        } else {
            eVar3.f1566x = iArr;
            eVar3.f1565w = iArr.length;
            eVar3.f1567y = dVar.f1558b;
        }
        if (v() <= 0) {
            eVar3.s = -1;
            eVar3.f1562t = -1;
            eVar3.f1563u = 0;
            return eVar3;
        }
        eVar3.s = this.D ? K0() : J0();
        View viewF0 = this.f1546x ? F0(true) : G0(true);
        eVar3.f1562t = viewF0 != null ? RecyclerView.m.H(viewF0) : -1;
        int i6 = this.f1539p;
        eVar3.f1563u = i6;
        eVar3.f1564v = new int[i6];
        for (int i7 = 0; i7 < this.f1539p; i7++) {
            if (this.D) {
                iH = this.f1540q[i7].f(Integer.MIN_VALUE);
                if (iH != Integer.MIN_VALUE) {
                    iK = this.f1541r.g();
                    iH -= iK;
                }
            } else {
                iH = this.f1540q[i7].h(Integer.MIN_VALUE);
                if (iH != Integer.MIN_VALUE) {
                    iK = this.f1541r.k();
                    iH -= iK;
                }
            }
            eVar3.f1564v[i7] = iH;
        }
        return eVar3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void h(int i6, int i7, RecyclerView.x xVar, m.b bVar) {
        n nVar;
        int iF;
        int iH;
        if (this.f1542t != 0) {
            i6 = i7;
        }
        if (v() == 0 || i6 == 0) {
            return;
        }
        T0(i6, xVar);
        int[] iArr = this.J;
        if (iArr == null || iArr.length < this.f1539p) {
            this.J = new int[this.f1539p];
        }
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int i10 = this.f1539p;
            nVar = this.f1544v;
            if (i8 >= i10) {
                break;
            }
            if (nVar.f1699d == -1) {
                iF = nVar.f1701f;
                iH = this.f1540q[i8].h(iF);
            } else {
                iF = this.f1540q[i8].f(nVar.f1702g);
                iH = nVar.f1702g;
            }
            int i11 = iF - iH;
            if (i11 >= 0) {
                this.J[i9] = i11;
                i9++;
            }
            i8++;
        }
        Arrays.sort(this.J, 0, i9);
        for (int i12 = 0; i12 < i9; i12++) {
            int i13 = nVar.f1698c;
            if (i13 < 0 || i13 >= xVar.b()) {
                return;
            }
            bVar.a(nVar.f1698c, this.J[i12]);
            nVar.f1698c += nVar.f1699d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void h0(int i6) {
        if (i6 == 0) {
            C0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int j(RecyclerView.x xVar) {
        if (v() == 0) {
            return 0;
        }
        boolean z6 = !this.I;
        return y.a(xVar, this.f1541r, G0(z6), F0(z6), this, this.I);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int k(RecyclerView.x xVar) {
        return D0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int l(RecyclerView.x xVar) {
        if (v() == 0) {
            return 0;
        }
        boolean z6 = !this.I;
        return y.c(xVar, this.f1541r, G0(z6), F0(z6), this, this.I);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int m(RecyclerView.x xVar) {
        if (v() == 0) {
            return 0;
        }
        boolean z6 = !this.I;
        return y.a(xVar, this.f1541r, G0(z6), F0(z6), this, this.I);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int n(RecyclerView.x xVar) {
        return D0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int o(RecyclerView.x xVar) {
        if (v() == 0) {
            return 0;
        }
        boolean z6 = !this.I;
        return y.c(xVar, this.f1541r, G0(z6), F0(z6), this, this.I);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int o0(int i6, RecyclerView.s sVar, RecyclerView.x xVar) {
        return Y0(i6, sVar, xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void p0(int i6) {
        e eVar = this.F;
        if (eVar != null && eVar.s != i6) {
            eVar.f1564v = null;
            eVar.f1563u = 0;
            eVar.s = -1;
            eVar.f1562t = -1;
        }
        this.f1548z = i6;
        this.A = Integer.MIN_VALUE;
        n0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int q0(int i6, RecyclerView.s sVar, RecyclerView.x xVar) {
        return Y0(i6, sVar, xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n r() {
        return this.f1542t == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n s(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void t0(Rect rect, int i6, int i7) {
        int iG;
        int iG2;
        int iF = F() + E();
        int iD = D() + G();
        int i8 = this.f1542t;
        int i9 = this.f1539p;
        if (i8 == 1) {
            int iHeight = rect.height() + iD;
            RecyclerView recyclerView = this.f1473b;
            WeakHashMap<View, n0> weakHashMap = f0.f14480a;
            iG2 = RecyclerView.m.g(i7, iHeight, recyclerView.getMinimumHeight());
            iG = RecyclerView.m.g(i6, (this.f1543u * i9) + iF, this.f1473b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iF;
            RecyclerView recyclerView2 = this.f1473b;
            WeakHashMap<View, n0> weakHashMap2 = f0.f14480a;
            iG = RecyclerView.m.g(i6, iWidth, recyclerView2.getMinimumWidth());
            iG2 = RecyclerView.m.g(i7, (this.f1543u * i9) + iD, this.f1473b.getMinimumHeight());
        }
        this.f1473b.setMeasuredDimension(iG, iG2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void z0(RecyclerView recyclerView, int i6) {
        o oVar = new o(recyclerView.getContext());
        oVar.f1512a = i6;
        A0(oVar);
    }
}
