package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.v;
import com.yalantis.ucrop.view.CropImageView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import y3.q0;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends v.l implements v.AbstractC0038v.b {
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
    public final int f2461p;

    /* renamed from: q, reason: collision with root package name */
    public final f[] f2462q;

    /* renamed from: r, reason: collision with root package name */
    public final s f2463r;

    /* renamed from: s, reason: collision with root package name */
    public final s f2464s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2465t;

    /* renamed from: u, reason: collision with root package name */
    public int f2466u;

    /* renamed from: v, reason: collision with root package name */
    public final n f2467v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2468w;

    /* renamed from: y, reason: collision with root package name */
    public final BitSet f2470y;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2469x = false;

    /* renamed from: z, reason: collision with root package name */
    public int f2471z = -1;
    public int A = PKIFailureInfo.systemUnavail;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            StaggeredGridLayoutManager.this.B0();
        }
    }

    public class b {

        /* renamed from: a, reason: collision with root package name */
        public int f2473a;

        /* renamed from: b, reason: collision with root package name */
        public int f2474b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f2475c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f2476d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f2477e;

        /* renamed from: f, reason: collision with root package name */
        public int[] f2478f;

        public b() {
            a();
        }

        public final void a() {
            this.f2473a = -1;
            this.f2474b = PKIFailureInfo.systemUnavail;
            this.f2475c = false;
            this.f2476d = false;
            this.f2477e = false;
            int[] iArr = this.f2478f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    public static class c extends v.m {

        /* renamed from: e, reason: collision with root package name */
        public f f2480e;
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public int[] f2481a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList f2482b;

        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0036a();

            /* renamed from: a, reason: collision with root package name */
            public int f2483a;

            /* renamed from: b, reason: collision with root package name */
            public int f2484b;

            /* renamed from: c, reason: collision with root package name */
            public int[] f2485c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f2486d;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            public class C0036a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                public final a createFromParcel(Parcel parcel) {
                    a aVar = new a();
                    aVar.f2483a = parcel.readInt();
                    aVar.f2484b = parcel.readInt();
                    aVar.f2486d = parcel.readInt() == 1;
                    int i10 = parcel.readInt();
                    if (i10 > 0) {
                        int[] iArr = new int[i10];
                        aVar.f2485c = iArr;
                        parcel.readIntArray(iArr);
                    }
                    return aVar;
                }

                @Override // android.os.Parcelable.Creator
                public final a[] newArray(int i10) {
                    return new a[i10];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                return "FullSpanItem{mPosition=" + this.f2483a + ", mGapDir=" + this.f2484b + ", mHasUnwantedGapAfter=" + this.f2486d + ", mGapPerSpan=" + Arrays.toString(this.f2485c) + '}';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f2483a);
                parcel.writeInt(this.f2484b);
                parcel.writeInt(this.f2486d ? 1 : 0);
                int[] iArr = this.f2485c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f2485c);
                }
            }
        }

        public final void a() {
            int[] iArr = this.f2481a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f2482b = null;
        }

        public final void b(int i10) {
            int[] iArr = this.f2481a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i10, 10) + 1];
                this.f2481a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int length = iArr.length;
                while (length <= i10) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f2481a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f2481a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public final void c(int i10, int i11) {
            int[] iArr = this.f2481a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            b(i12);
            int[] iArr2 = this.f2481a;
            System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
            Arrays.fill(this.f2481a, i10, i12, -1);
            ArrayList arrayList = this.f2482b;
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f2482b.get(size);
                int i13 = aVar.f2483a;
                if (i13 >= i10) {
                    aVar.f2483a = i13 + i11;
                }
            }
        }

        public final void d(int i10, int i11) {
            int[] iArr = this.f2481a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            b(i12);
            int[] iArr2 = this.f2481a;
            System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
            int[] iArr3 = this.f2481a;
            Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
            ArrayList arrayList = this.f2482b;
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f2482b.get(size);
                int i13 = aVar.f2483a;
                if (i13 >= i10) {
                    if (i13 < i12) {
                        this.f2482b.remove(size);
                    } else {
                        aVar.f2483a = i13 - i11;
                    }
                }
            }
        }
    }

    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f2487a;

        /* renamed from: b, reason: collision with root package name */
        public int f2488b;

        /* renamed from: c, reason: collision with root package name */
        public int f2489c;

        /* renamed from: d, reason: collision with root package name */
        public int[] f2490d;

        /* renamed from: e, reason: collision with root package name */
        public int f2491e;

        /* renamed from: f, reason: collision with root package name */
        public int[] f2492f;

        /* renamed from: g, reason: collision with root package name */
        public ArrayList f2493g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f2494h;

        /* renamed from: j, reason: collision with root package name */
        public boolean f2495j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f2496k;

        public class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public final e createFromParcel(Parcel parcel) {
                e eVar = new e();
                eVar.f2487a = parcel.readInt();
                eVar.f2488b = parcel.readInt();
                int i10 = parcel.readInt();
                eVar.f2489c = i10;
                if (i10 > 0) {
                    int[] iArr = new int[i10];
                    eVar.f2490d = iArr;
                    parcel.readIntArray(iArr);
                }
                int i11 = parcel.readInt();
                eVar.f2491e = i11;
                if (i11 > 0) {
                    int[] iArr2 = new int[i11];
                    eVar.f2492f = iArr2;
                    parcel.readIntArray(iArr2);
                }
                eVar.f2494h = parcel.readInt() == 1;
                eVar.f2495j = parcel.readInt() == 1;
                eVar.f2496k = parcel.readInt() == 1;
                eVar.f2493g = parcel.readArrayList(d.a.class.getClassLoader());
                return eVar;
            }

            @Override // android.os.Parcelable.Creator
            public final e[] newArray(int i10) {
                return new e[i10];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f2487a);
            parcel.writeInt(this.f2488b);
            parcel.writeInt(this.f2489c);
            if (this.f2489c > 0) {
                parcel.writeIntArray(this.f2490d);
            }
            parcel.writeInt(this.f2491e);
            if (this.f2491e > 0) {
                parcel.writeIntArray(this.f2492f);
            }
            parcel.writeInt(this.f2494h ? 1 : 0);
            parcel.writeInt(this.f2495j ? 1 : 0);
            parcel.writeInt(this.f2496k ? 1 : 0);
            parcel.writeList(this.f2493g);
        }
    }

    public class f {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList<View> f2497a = new ArrayList<>();

        /* renamed from: b, reason: collision with root package name */
        public int f2498b = PKIFailureInfo.systemUnavail;

        /* renamed from: c, reason: collision with root package name */
        public int f2499c = PKIFailureInfo.systemUnavail;

        /* renamed from: d, reason: collision with root package name */
        public int f2500d = 0;

        /* renamed from: e, reason: collision with root package name */
        public final int f2501e;

        public f(int i10) {
            this.f2501e = i10;
        }

        public final void a() {
            View view = (View) l.b.b(this.f2497a, 1);
            c cVar = (c) view.getLayoutParams();
            this.f2499c = StaggeredGridLayoutManager.this.f2463r.b(view);
            cVar.getClass();
        }

        public final void b() {
            this.f2497a.clear();
            this.f2498b = PKIFailureInfo.systemUnavail;
            this.f2499c = PKIFailureInfo.systemUnavail;
            this.f2500d = 0;
        }

        public final int c() {
            return StaggeredGridLayoutManager.this.f2468w ? e(r1.size() - 1, -1) : e(0, this.f2497a.size());
        }

        public final int d() {
            return StaggeredGridLayoutManager.this.f2468w ? e(0, this.f2497a.size()) : e(r1.size() - 1, -1);
        }

        public final int e(int i10, int i11) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            int iK = staggeredGridLayoutManager.f2463r.k();
            int iG = staggeredGridLayoutManager.f2463r.g();
            int i12 = i11 > i10 ? 1 : -1;
            while (i10 != i11) {
                View view = this.f2497a.get(i10);
                int iE = staggeredGridLayoutManager.f2463r.e(view);
                int iB = staggeredGridLayoutManager.f2463r.b(view);
                boolean z10 = iE <= iG;
                boolean z11 = iB >= iK;
                if (z10 && z11 && (iE < iK || iB > iG)) {
                    return v.l.H(view);
                }
                i10 += i12;
            }
            return -1;
        }

        public final int f(int i10) {
            int i11 = this.f2499c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f2497a.size() == 0) {
                return i10;
            }
            a();
            return this.f2499c;
        }

        public final View g(int i10, int i11) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            ArrayList<View> arrayList = this.f2497a;
            View view = null;
            if (i11 != -1) {
                int size = arrayList.size() - 1;
                while (size >= 0) {
                    View view2 = arrayList.get(size);
                    if ((staggeredGridLayoutManager.f2468w && v.l.H(view2) >= i10) || ((!staggeredGridLayoutManager.f2468w && v.l.H(view2) <= i10) || !view2.hasFocusable())) {
                        break;
                    }
                    size--;
                    view = view2;
                }
                return view;
            }
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                View view3 = arrayList.get(i12);
                if ((staggeredGridLayoutManager.f2468w && v.l.H(view3) <= i10) || ((!staggeredGridLayoutManager.f2468w && v.l.H(view3) >= i10) || !view3.hasFocusable())) {
                    break;
                }
                i12++;
                view = view3;
            }
            return view;
        }

        public final int h(int i10) {
            int i11 = this.f2498b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            ArrayList<View> arrayList = this.f2497a;
            if (arrayList.size() == 0) {
                return i10;
            }
            View view = arrayList.get(0);
            c cVar = (c) view.getLayoutParams();
            this.f2498b = StaggeredGridLayoutManager.this.f2463r.e(view);
            cVar.getClass();
            return this.f2498b;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f2461p = -1;
        this.f2468w = false;
        d dVar = new d();
        this.B = dVar;
        this.C = 2;
        this.G = new Rect();
        this.H = new b();
        this.I = true;
        this.K = new a();
        v.l.c cVarI = v.l.I(context, attributeSet, i10, i11);
        int i12 = cVarI.f2757a;
        if (i12 != 0 && i12 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i12 != this.f2465t) {
            this.f2465t = i12;
            s sVar = this.f2463r;
            this.f2463r = this.f2464s;
            this.f2464s = sVar;
            n0();
        }
        int i13 = cVarI.f2758b;
        c(null);
        if (i13 != this.f2461p) {
            dVar.a();
            n0();
            this.f2461p = i13;
            this.f2470y = new BitSet(this.f2461p);
            this.f2462q = new f[this.f2461p];
            for (int i14 = 0; i14 < this.f2461p; i14++) {
                this.f2462q[i14] = new f(i14);
            }
            n0();
        }
        boolean z10 = cVarI.f2759c;
        c(null);
        e eVar = this.F;
        if (eVar != null && eVar.f2494h != z10) {
            eVar.f2494h = z10;
        }
        this.f2468w = z10;
        n0();
        n nVar = new n();
        nVar.f2633a = true;
        nVar.f2638f = 0;
        nVar.f2639g = 0;
        this.f2467v = nVar;
        this.f2463r = s.a(this, this.f2465t);
        this.f2464s = s.a(this, 1 - this.f2465t);
    }

    public static int b1(int i10, int i11, int i12) {
        int mode;
        return (!(i11 == 0 && i12 == 0) && ((mode = View.MeasureSpec.getMode(i10)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode) : i10;
    }

    @Override // androidx.recyclerview.widget.v.l
    public final boolean A0() {
        return this.F == null;
    }

    public final boolean B0() {
        int iI0;
        if (v() != 0 && this.C != 0 && this.f2746g) {
            if (this.f2469x) {
                iI0 = J0();
                I0();
            } else {
                iI0 = I0();
                J0();
            }
            if (iI0 == 0 && N0() != null) {
                this.B.a();
                this.f2745f = true;
                n0();
                return true;
            }
        }
        return false;
    }

    public final int C0(v.w wVar) {
        if (v() == 0) {
            return 0;
        }
        boolean z10 = !this.I;
        return z.b(wVar, this.f2463r, F0(z10), E0(z10), this, this.I, this.f2469x);
    }

    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    public final int D0(v.r rVar, n nVar, v.w wVar) {
        f fVar;
        ?? r82;
        int iH;
        int iC;
        int iK;
        int iC2;
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 1;
        this.f2470y.set(0, this.f2461p, true);
        n nVar2 = this.f2467v;
        int i15 = nVar2.f2641i ? nVar.f2637e == 1 ? Integer.MAX_VALUE : PKIFailureInfo.systemUnavail : nVar.f2637e == 1 ? nVar.f2639g + nVar.f2634b : nVar.f2638f - nVar.f2634b;
        int i16 = nVar.f2637e;
        for (int i17 = 0; i17 < this.f2461p; i17++) {
            if (!this.f2462q[i17].f2497a.isEmpty()) {
                a1(this.f2462q[i17], i16, i15);
            }
        }
        int iG = this.f2469x ? this.f2463r.g() : this.f2463r.k();
        boolean z10 = false;
        while (true) {
            int i18 = nVar.f2635c;
            if (i18 < 0 || i18 >= wVar.b() || (!nVar2.f2641i && this.f2470y.isEmpty())) {
                break;
            }
            View viewD = rVar.d(nVar.f2635c);
            nVar.f2635c += nVar.f2636d;
            c cVar = (c) viewD.getLayoutParams();
            int iB = cVar.f2761a.b();
            d dVar = this.B;
            int[] iArr = dVar.f2481a;
            int i19 = (iArr == null || iB >= iArr.length) ? -1 : iArr[iB];
            if (i19 == -1) {
                if (R0(nVar.f2637e)) {
                    i12 = this.f2461p - i14;
                    i11 = -1;
                    i10 = -1;
                } else {
                    i10 = i14;
                    i11 = this.f2461p;
                    i12 = i13;
                }
                f fVar2 = null;
                if (nVar.f2637e == i14) {
                    int iK2 = this.f2463r.k();
                    int i20 = Integer.MAX_VALUE;
                    while (i12 != i11) {
                        f fVar3 = this.f2462q[i12];
                        int iF = fVar3.f(iK2);
                        if (iF < i20) {
                            i20 = iF;
                            fVar2 = fVar3;
                        }
                        i12 += i10;
                    }
                } else {
                    int iG2 = this.f2463r.g();
                    int i21 = PKIFailureInfo.systemUnavail;
                    while (i12 != i11) {
                        f fVar4 = this.f2462q[i12];
                        int iH2 = fVar4.h(iG2);
                        if (iH2 > i21) {
                            fVar2 = fVar4;
                            i21 = iH2;
                        }
                        i12 += i10;
                    }
                }
                fVar = fVar2;
                dVar.b(iB);
                dVar.f2481a[iB] = fVar.f2501e;
            } else {
                fVar = this.f2462q[i19];
            }
            cVar.f2480e = fVar;
            if (nVar.f2637e == 1) {
                r82 = 0;
                b(viewD, -1, false);
            } else {
                r82 = 0;
                b(viewD, 0, false);
            }
            if (this.f2465t == 1) {
                P0(viewD, v.l.w(r82, this.f2466u, this.f2751l, r82, ((ViewGroup.MarginLayoutParams) cVar).width), v.l.w(true, this.f2754o, this.f2752m, D() + G(), ((ViewGroup.MarginLayoutParams) cVar).height));
            } else {
                P0(viewD, v.l.w(true, this.f2753n, this.f2751l, F() + E(), ((ViewGroup.MarginLayoutParams) cVar).width), v.l.w(false, this.f2466u, this.f2752m, 0, ((ViewGroup.MarginLayoutParams) cVar).height));
            }
            if (nVar.f2637e == 1) {
                iC = fVar.f(iG);
                iH = this.f2463r.c(viewD) + iC;
            } else {
                iH = fVar.h(iG);
                iC = iH - this.f2463r.c(viewD);
            }
            if (nVar.f2637e == 1) {
                f fVar5 = cVar.f2480e;
                fVar5.getClass();
                c cVar2 = (c) viewD.getLayoutParams();
                cVar2.f2480e = fVar5;
                ArrayList<View> arrayList = fVar5.f2497a;
                arrayList.add(viewD);
                fVar5.f2499c = PKIFailureInfo.systemUnavail;
                if (arrayList.size() == 1) {
                    fVar5.f2498b = PKIFailureInfo.systemUnavail;
                }
                if (cVar2.f2761a.g() || cVar2.f2761a.j()) {
                    fVar5.f2500d = StaggeredGridLayoutManager.this.f2463r.c(viewD) + fVar5.f2500d;
                }
            } else {
                f fVar6 = cVar.f2480e;
                fVar6.getClass();
                c cVar3 = (c) viewD.getLayoutParams();
                cVar3.f2480e = fVar6;
                ArrayList<View> arrayList2 = fVar6.f2497a;
                arrayList2.add(0, viewD);
                fVar6.f2498b = PKIFailureInfo.systemUnavail;
                if (arrayList2.size() == 1) {
                    fVar6.f2499c = PKIFailureInfo.systemUnavail;
                }
                if (cVar3.f2761a.g() || cVar3.f2761a.j()) {
                    fVar6.f2500d = StaggeredGridLayoutManager.this.f2463r.c(viewD) + fVar6.f2500d;
                }
            }
            if (O0() && this.f2465t == 1) {
                iC2 = this.f2464s.g() - (((this.f2461p - 1) - fVar.f2501e) * this.f2466u);
                iK = iC2 - this.f2464s.c(viewD);
            } else {
                iK = this.f2464s.k() + (fVar.f2501e * this.f2466u);
                iC2 = this.f2464s.c(viewD) + iK;
            }
            if (this.f2465t == 1) {
                v.l.N(viewD, iK, iC, iC2, iH);
            } else {
                v.l.N(viewD, iC, iK, iH, iC2);
            }
            a1(fVar, nVar2.f2637e, i15);
            T0(rVar, nVar2);
            if (nVar2.f2640h && viewD.hasFocusable()) {
                this.f2470y.set(fVar.f2501e, false);
            }
            i14 = 1;
            z10 = true;
            i13 = 0;
        }
        if (!z10) {
            T0(rVar, nVar2);
        }
        int iK3 = nVar2.f2637e == -1 ? this.f2463r.k() - L0(this.f2463r.k()) : K0(this.f2463r.g()) - this.f2463r.g();
        if (iK3 > 0) {
            return Math.min(nVar.f2634b, iK3);
        }
        return 0;
    }

    public final View E0(boolean z10) {
        int iK = this.f2463r.k();
        int iG = this.f2463r.g();
        View view = null;
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            int iE = this.f2463r.e(viewU);
            int iB = this.f2463r.b(viewU);
            if (iB > iK && iE < iG) {
                if (iB <= iG || !z10) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    public final View F0(boolean z10) {
        int iK = this.f2463r.k();
        int iG = this.f2463r.g();
        int iV = v();
        View view = null;
        for (int i10 = 0; i10 < iV; i10++) {
            View viewU = u(i10);
            int iE = this.f2463r.e(viewU);
            if (this.f2463r.b(viewU) > iK && iE < iG) {
                if (iE >= iK || !z10) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    public final void G0(v.r rVar, v.w wVar, boolean z10) {
        int iG;
        int iK0 = K0(PKIFailureInfo.systemUnavail);
        if (iK0 != Integer.MIN_VALUE && (iG = this.f2463r.g() - iK0) > 0) {
            int i10 = iG - (-X0(-iG, rVar, wVar));
            if (!z10 || i10 <= 0) {
                return;
            }
            this.f2463r.o(i10);
        }
    }

    public final void H0(v.r rVar, v.w wVar, boolean z10) {
        int iK;
        int iL0 = L0(Integer.MAX_VALUE);
        if (iL0 != Integer.MAX_VALUE && (iK = iL0 - this.f2463r.k()) > 0) {
            int iX0 = iK - X0(iK, rVar, wVar);
            if (!z10 || iX0 <= 0) {
                return;
            }
            this.f2463r.o(-iX0);
        }
    }

    public final int I0() {
        if (v() == 0) {
            return 0;
        }
        return v.l.H(u(0));
    }

    public final int J0() {
        int iV = v();
        if (iV == 0) {
            return 0;
        }
        return v.l.H(u(iV - 1));
    }

    public final int K0(int i10) {
        int iF = this.f2462q[0].f(i10);
        for (int i11 = 1; i11 < this.f2461p; i11++) {
            int iF2 = this.f2462q[i11].f(i10);
            if (iF2 > iF) {
                iF = iF2;
            }
        }
        return iF;
    }

    @Override // androidx.recyclerview.widget.v.l
    public final boolean L() {
        return this.C != 0;
    }

    public final int L0(int i10) {
        int iH = this.f2462q[0].h(i10);
        for (int i11 = 1; i11 < this.f2461p; i11++) {
            int iH2 = this.f2462q[i11].h(i10);
            if (iH2 < iH) {
                iH = iH2;
            }
        }
        return iH;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M0(int i10, int i11, int i12) {
        int i13;
        int i14;
        d dVar;
        int[] iArr;
        ArrayList arrayList;
        d.a aVar;
        int i15;
        int iJ0 = this.f2469x ? J0() : I0();
        if (i12 != 8) {
            i13 = i10 + i11;
        } else {
            if (i10 >= i11) {
                i13 = i10 + 1;
                i14 = i11;
                dVar = this.B;
                iArr = dVar.f2481a;
                if (iArr != null && i14 < iArr.length) {
                    arrayList = dVar.f2482b;
                    if (arrayList != null) {
                        i15 = -1;
                        if (i15 != -1) {
                            int[] iArr2 = dVar.f2481a;
                            Arrays.fill(iArr2, i14, iArr2.length, -1);
                            int length = dVar.f2481a.length;
                        } else {
                            Arrays.fill(dVar.f2481a, i14, Math.min(i15 + 1, dVar.f2481a.length), -1);
                        }
                    } else {
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size < 0) {
                                aVar = null;
                                break;
                            }
                            aVar = (d.a) dVar.f2482b.get(size);
                            if (aVar.f2483a == i14) {
                                break;
                            } else {
                                size--;
                            }
                        }
                        if (aVar != null) {
                            dVar.f2482b.remove(aVar);
                        }
                        int size2 = dVar.f2482b.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 >= size2) {
                                i16 = -1;
                                break;
                            } else if (((d.a) dVar.f2482b.get(i16)).f2483a >= i14) {
                                break;
                            } else {
                                i16++;
                            }
                        }
                        if (i16 != -1) {
                            d.a aVar2 = (d.a) dVar.f2482b.get(i16);
                            dVar.f2482b.remove(i16);
                            i15 = aVar2.f2483a;
                        }
                        if (i15 != -1) {
                        }
                    }
                }
                if (i12 != 1) {
                    dVar.c(i10, i11);
                } else if (i12 == 2) {
                    dVar.d(i10, i11);
                } else if (i12 == 8) {
                    dVar.d(i10, 1);
                    dVar.c(i11, 1);
                }
                if (i13 > iJ0) {
                    return;
                }
                if (i14 <= (this.f2469x ? I0() : J0())) {
                    n0();
                    return;
                }
                return;
            }
            i13 = i11 + 1;
        }
        i14 = i10;
        dVar = this.B;
        iArr = dVar.f2481a;
        if (iArr != null) {
            arrayList = dVar.f2482b;
            if (arrayList != null) {
            }
        }
        if (i12 != 1) {
        }
        if (i13 > iJ0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x002c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View N0() {
        int iV = v();
        int i10 = iV - 1;
        BitSet bitSet = new BitSet(this.f2461p);
        bitSet.set(0, this.f2461p, true);
        char c10 = (this.f2465t == 1 && O0()) ? (char) 1 : (char) 65535;
        if (this.f2469x) {
            iV = -1;
        } else {
            i10 = 0;
        }
        int i11 = i10 < iV ? 1 : -1;
        while (i10 != iV) {
            View viewU = u(i10);
            c cVar = (c) viewU.getLayoutParams();
            if (bitSet.get(cVar.f2480e.f2501e)) {
                f fVar = cVar.f2480e;
                if (this.f2469x) {
                    int i12 = fVar.f2499c;
                    if (i12 == Integer.MIN_VALUE) {
                        fVar.a();
                        i12 = fVar.f2499c;
                    }
                    if (i12 < this.f2463r.g()) {
                        ((c) ((View) l.b.b(fVar.f2497a, 1)).getLayoutParams()).getClass();
                        return viewU;
                    }
                } else {
                    int i13 = fVar.f2498b;
                    ArrayList<View> arrayList = fVar.f2497a;
                    if (i13 == Integer.MIN_VALUE) {
                        View view = arrayList.get(0);
                        c cVar2 = (c) view.getLayoutParams();
                        fVar.f2498b = StaggeredGridLayoutManager.this.f2463r.e(view);
                        cVar2.getClass();
                        i13 = fVar.f2498b;
                    }
                    if (i13 > this.f2463r.k()) {
                        ((c) arrayList.get(0).getLayoutParams()).getClass();
                        return viewU;
                    }
                }
                bitSet.clear(cVar.f2480e.f2501e);
            }
            i10 += i11;
            if (i10 != iV) {
                View viewU2 = u(i10);
                if (this.f2469x) {
                    int iB = this.f2463r.b(viewU);
                    int iB2 = this.f2463r.b(viewU2);
                    if (iB < iB2) {
                        return viewU;
                    }
                    if (iB == iB2) {
                        if ((cVar.f2480e.f2501e - ((c) viewU2.getLayoutParams()).f2480e.f2501e >= 0) == (c10 >= 0)) {
                            return viewU;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int iE = this.f2463r.e(viewU);
                    int iE2 = this.f2463r.e(viewU2);
                    if (iE > iE2) {
                        return viewU;
                    }
                    if (iE == iE2) {
                        if ((cVar.f2480e.f2501e - ((c) viewU2.getLayoutParams()).f2480e.f2501e >= 0) == (c10 >= 0)) {
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.v.l
    public final void O(int i10) {
        super.O(i10);
        for (int i11 = 0; i11 < this.f2461p; i11++) {
            f fVar = this.f2462q[i11];
            int i12 = fVar.f2498b;
            if (i12 != Integer.MIN_VALUE) {
                fVar.f2498b = i12 + i10;
            }
            int i13 = fVar.f2499c;
            if (i13 != Integer.MIN_VALUE) {
                fVar.f2499c = i13 + i10;
            }
        }
    }

    public final boolean O0() {
        return C() == 1;
    }

    @Override // androidx.recyclerview.widget.v.l
    public final void P(int i10) {
        super.P(i10);
        for (int i11 = 0; i11 < this.f2461p; i11++) {
            f fVar = this.f2462q[i11];
            int i12 = fVar.f2498b;
            if (i12 != Integer.MIN_VALUE) {
                fVar.f2498b = i12 + i10;
            }
            int i13 = fVar.f2499c;
            if (i13 != Integer.MIN_VALUE) {
                fVar.f2499c = i13 + i10;
            }
        }
    }

    public final void P0(View view, int i10, int i11) {
        v vVar = this.f2741b;
        Rect rect = this.G;
        if (vVar == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(vVar.K(view));
        }
        c cVar = (c) view.getLayoutParams();
        int iB1 = b1(i10, ((ViewGroup.MarginLayoutParams) cVar).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int iB12 = b1(i11, ((ViewGroup.MarginLayoutParams) cVar).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect.bottom);
        if (w0(view, iB1, iB12, cVar)) {
            view.measure(iB1, iB12);
        }
    }

    @Override // androidx.recyclerview.widget.v.l
    public final void Q() {
        this.B.a();
        for (int i10 = 0; i10 < this.f2461p; i10++) {
            this.f2462q[i10].b();
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
    public final void Q0(v.r rVar, v.w wVar, boolean z10) {
        e eVar;
        int iH;
        int i10;
        boolean z11;
        e eVar2 = this.F;
        b bVar = this.H;
        if (!(eVar2 == null && this.f2471z == -1) && wVar.b() == 0) {
            i0(rVar);
            bVar.a();
            return;
        }
        boolean z12 = bVar.f2477e;
        StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
        boolean z13 = true;
        boolean z14 = (z12 && this.f2471z == -1 && this.F == null) ? false : true;
        d dVar = this.B;
        if (z14) {
            bVar.a();
            e eVar3 = this.F;
            if (eVar3 != null) {
                int i11 = eVar3.f2489c;
                if (i11 > 0) {
                    if (i11 == this.f2461p) {
                        for (int i12 = 0; i12 < this.f2461p; i12++) {
                            this.f2462q[i12].b();
                            e eVar4 = this.F;
                            int iG = eVar4.f2490d[i12];
                            if (iG != Integer.MIN_VALUE) {
                                iG += eVar4.f2495j ? this.f2463r.g() : this.f2463r.k();
                            }
                            f fVar = this.f2462q[i12];
                            fVar.f2498b = iG;
                            fVar.f2499c = iG;
                        }
                    } else {
                        eVar3.f2490d = null;
                        eVar3.f2489c = 0;
                        eVar3.f2491e = 0;
                        eVar3.f2492f = null;
                        eVar3.f2493g = null;
                        eVar3.f2487a = eVar3.f2488b;
                    }
                }
                e eVar5 = this.F;
                this.E = eVar5.f2496k;
                boolean z15 = eVar5.f2494h;
                c(null);
                e eVar6 = this.F;
                if (eVar6 != null && eVar6.f2494h != z15) {
                    eVar6.f2494h = z15;
                }
                this.f2468w = z15;
                n0();
                W0();
                e eVar7 = this.F;
                int i13 = eVar7.f2487a;
                if (i13 != -1) {
                    this.f2471z = i13;
                    bVar.f2475c = eVar7.f2495j;
                } else {
                    bVar.f2475c = this.f2469x;
                }
                if (eVar7.f2491e > 1) {
                    dVar.f2481a = eVar7.f2492f;
                    dVar.f2482b = eVar7.f2493g;
                }
            } else {
                W0();
                bVar.f2475c = this.f2469x;
            }
            if (wVar.f2803g || (i10 = this.f2471z) == -1) {
                if (this.D) {
                    int iB = wVar.b();
                    int iV = v();
                    for (int i14 = 0; i14 < iV; i14++) {
                        int iH2 = v.l.H(u(i14));
                        if (iH2 >= 0 && iH2 < iB) {
                            iH = iH2;
                            break;
                        }
                    }
                    iH = 0;
                    bVar.f2473a = iH;
                    bVar.f2474b = PKIFailureInfo.systemUnavail;
                    bVar.f2477e = true;
                } else {
                    int iB2 = wVar.b();
                    for (int iV2 = v() - 1; iV2 >= 0; iV2--) {
                        iH = v.l.H(u(iV2));
                        if (iH >= 0 && iH < iB2) {
                            break;
                        }
                    }
                    iH = 0;
                    bVar.f2473a = iH;
                    bVar.f2474b = PKIFailureInfo.systemUnavail;
                    bVar.f2477e = true;
                }
            } else if (i10 < 0 || i10 >= wVar.b()) {
                this.f2471z = -1;
                this.A = PKIFailureInfo.systemUnavail;
                if (this.D) {
                }
            } else {
                e eVar8 = this.F;
                if (eVar8 == null || eVar8.f2487a == -1 || eVar8.f2489c < 1) {
                    View viewQ = q(this.f2471z);
                    if (viewQ != null) {
                        bVar.f2473a = this.f2469x ? J0() : I0();
                        if (this.A != Integer.MIN_VALUE) {
                            if (bVar.f2475c) {
                                bVar.f2474b = (this.f2463r.g() - this.A) - this.f2463r.b(viewQ);
                            } else {
                                bVar.f2474b = (this.f2463r.k() + this.A) - this.f2463r.e(viewQ);
                            }
                        } else if (this.f2463r.c(viewQ) > this.f2463r.l()) {
                            bVar.f2474b = bVar.f2475c ? this.f2463r.g() : this.f2463r.k();
                        } else {
                            int iE = this.f2463r.e(viewQ) - this.f2463r.k();
                            if (iE < 0) {
                                bVar.f2474b = -iE;
                            } else {
                                int iG2 = this.f2463r.g() - this.f2463r.b(viewQ);
                                if (iG2 < 0) {
                                    bVar.f2474b = iG2;
                                } else {
                                    bVar.f2474b = PKIFailureInfo.systemUnavail;
                                }
                            }
                        }
                    } else {
                        int i15 = this.f2471z;
                        bVar.f2473a = i15;
                        int i16 = this.A;
                        if (i16 == Integer.MIN_VALUE) {
                            if (v() == 0) {
                                z11 = this.f2469x;
                            } else if ((i15 < I0()) != this.f2469x) {
                            }
                            bVar.f2475c = z11;
                            bVar.f2474b = z11 ? staggeredGridLayoutManager.f2463r.g() : staggeredGridLayoutManager.f2463r.k();
                        } else if (bVar.f2475c) {
                            bVar.f2474b = staggeredGridLayoutManager.f2463r.g() - i16;
                        } else {
                            bVar.f2474b = staggeredGridLayoutManager.f2463r.k() + i16;
                        }
                        bVar.f2476d = true;
                    }
                } else {
                    bVar.f2474b = PKIFailureInfo.systemUnavail;
                    bVar.f2473a = this.f2471z;
                }
                bVar.f2477e = true;
            }
        }
        if (this.F == null && this.f2471z == -1 && (bVar.f2475c != this.D || O0() != this.E)) {
            dVar.a();
            bVar.f2476d = true;
        }
        if (v() > 0 && ((eVar = this.F) == null || eVar.f2489c < 1)) {
            if (bVar.f2476d) {
                for (int i17 = 0; i17 < this.f2461p; i17++) {
                    this.f2462q[i17].b();
                    int i18 = bVar.f2474b;
                    if (i18 != Integer.MIN_VALUE) {
                        f fVar2 = this.f2462q[i17];
                        fVar2.f2498b = i18;
                        fVar2.f2499c = i18;
                    }
                }
            } else if (z14 || bVar.f2478f == null) {
                for (int i19 = 0; i19 < this.f2461p; i19++) {
                    f fVar3 = this.f2462q[i19];
                    boolean z16 = this.f2469x;
                    int i20 = bVar.f2474b;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    int iF = z16 ? fVar3.f(PKIFailureInfo.systemUnavail) : fVar3.h(PKIFailureInfo.systemUnavail);
                    fVar3.b();
                    if (iF != Integer.MIN_VALUE && ((!z16 || iF >= staggeredGridLayoutManager2.f2463r.g()) && (z16 || iF <= staggeredGridLayoutManager2.f2463r.k()))) {
                        if (i20 != Integer.MIN_VALUE) {
                            iF += i20;
                        }
                        fVar3.f2499c = iF;
                        fVar3.f2498b = iF;
                    }
                }
                f[] fVarArr = this.f2462q;
                int length = fVarArr.length;
                int[] iArr = bVar.f2478f;
                if (iArr == null || iArr.length < length) {
                    bVar.f2478f = new int[staggeredGridLayoutManager.f2462q.length];
                }
                for (int i21 = 0; i21 < length; i21++) {
                    bVar.f2478f[i21] = fVarArr[i21].h(PKIFailureInfo.systemUnavail);
                }
            } else {
                for (int i22 = 0; i22 < this.f2461p; i22++) {
                    f fVar4 = this.f2462q[i22];
                    fVar4.b();
                    int i23 = bVar.f2478f[i22];
                    fVar4.f2498b = i23;
                    fVar4.f2499c = i23;
                }
            }
        }
        p(rVar);
        n nVar = this.f2467v;
        nVar.f2633a = false;
        int iL = this.f2464s.l();
        this.f2466u = iL / this.f2461p;
        View.MeasureSpec.makeMeasureSpec(iL, this.f2464s.i());
        Z0(bVar.f2473a, wVar);
        if (bVar.f2475c) {
            Y0(-1);
            D0(rVar, nVar, wVar);
            Y0(1);
            nVar.f2635c = bVar.f2473a + nVar.f2636d;
            D0(rVar, nVar, wVar);
        } else {
            Y0(1);
            D0(rVar, nVar, wVar);
            Y0(-1);
            nVar.f2635c = bVar.f2473a + nVar.f2636d;
            D0(rVar, nVar, wVar);
        }
        if (this.f2464s.i() != 1073741824) {
            int iV3 = v();
            float fMax = CropImageView.DEFAULT_ASPECT_RATIO;
            for (int i24 = 0; i24 < iV3; i24++) {
                View viewU = u(i24);
                float fC = this.f2464s.c(viewU);
                if (fC >= fMax) {
                    ((c) viewU.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fC);
                }
            }
            int i25 = this.f2466u;
            int iRound = Math.round(fMax * this.f2461p);
            if (this.f2464s.i() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.f2464s.l());
            }
            this.f2466u = iRound / this.f2461p;
            View.MeasureSpec.makeMeasureSpec(iRound, this.f2464s.i());
            if (this.f2466u != i25) {
                for (int i26 = 0; i26 < iV3; i26++) {
                    View viewU2 = u(i26);
                    c cVar = (c) viewU2.getLayoutParams();
                    cVar.getClass();
                    if (O0() && this.f2465t == 1) {
                        int i27 = -((this.f2461p - 1) - cVar.f2480e.f2501e);
                        viewU2.offsetLeftAndRight((this.f2466u * i27) - (i27 * i25));
                    } else {
                        int i28 = cVar.f2480e.f2501e;
                        int i29 = this.f2466u * i28;
                        int i30 = i28 * i25;
                        if (this.f2465t == 1) {
                            viewU2.offsetLeftAndRight(i29 - i30);
                        } else {
                            viewU2.offsetTopAndBottom(i29 - i30);
                        }
                    }
                }
            }
        }
        if (v() > 0) {
            if (this.f2469x) {
                G0(rVar, wVar, true);
                H0(rVar, wVar, false);
            } else {
                H0(rVar, wVar, true);
                G0(rVar, wVar, false);
            }
        }
        if (!z10 || wVar.f2803g || this.C == 0 || v() <= 0 || N0() == null) {
            z13 = false;
        } else {
            v vVar = this.f2741b;
            if (vVar != null) {
                vVar.removeCallbacks(this.K);
            }
            if (!B0()) {
            }
        }
        if (wVar.f2803g) {
            bVar.a();
        }
        this.D = bVar.f2475c;
        this.E = O0();
        if (z13) {
            bVar.a();
            Q0(rVar, wVar, false);
        }
    }

    public final boolean R0(int i10) {
        if (this.f2465t == 0) {
            return (i10 == -1) != this.f2469x;
        }
        return ((i10 == -1) == this.f2469x) == O0();
    }

    @Override // androidx.recyclerview.widget.v.l
    public final void S(v vVar) {
        v vVar2 = this.f2741b;
        if (vVar2 != null) {
            vVar2.removeCallbacks(this.K);
        }
        for (int i10 = 0; i10 < this.f2461p; i10++) {
            this.f2462q[i10].b();
        }
        vVar.requestLayout();
    }

    public final void S0(int i10, v.w wVar) {
        int iI0;
        int i11;
        if (i10 > 0) {
            iI0 = J0();
            i11 = 1;
        } else {
            iI0 = I0();
            i11 = -1;
        }
        n nVar = this.f2467v;
        nVar.f2633a = true;
        Z0(iI0, wVar);
        Y0(i11);
        nVar.f2635c = iI0 + nVar.f2636d;
        nVar.f2634b = Math.abs(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0051  */
    @Override // androidx.recyclerview.widget.v.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T(View view, int i10, v.r rVar, v.w wVar) {
        View viewB;
        int i11;
        if (v() != 0) {
            v vVar = this.f2741b;
            if (vVar == null || (viewB = vVar.B(view)) == null || this.f2740a.f2514c.contains(viewB)) {
                viewB = null;
            }
            if (viewB != null) {
                W0();
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 17) {
                            if (i10 != 33) {
                                if (i10 == 66 ? this.f2465t == 0 : !(i10 != 130 || this.f2465t != 1)) {
                                    i11 = 1;
                                }
                            } else if (this.f2465t == 1) {
                                i11 = -1;
                            }
                            i11 = Integer.MIN_VALUE;
                        } else if (this.f2465t != 0) {
                            i11 = Integer.MIN_VALUE;
                        }
                    } else if (this.f2465t != 1 && O0()) {
                    }
                } else if (this.f2465t != 1 && O0()) {
                }
                if (i11 != Integer.MIN_VALUE) {
                    c cVar = (c) viewB.getLayoutParams();
                    cVar.getClass();
                    f fVar = cVar.f2480e;
                    int iJ0 = i11 == 1 ? J0() : I0();
                    Z0(iJ0, wVar);
                    Y0(i11);
                    n nVar = this.f2467v;
                    nVar.f2635c = nVar.f2636d + iJ0;
                    nVar.f2634b = (int) (this.f2463r.l() * 0.33333334f);
                    nVar.f2640h = true;
                    nVar.f2633a = false;
                    D0(rVar, nVar, wVar);
                    this.D = this.f2469x;
                    View viewG = fVar.g(iJ0, i11);
                    if (viewG != null && viewG != viewB) {
                        return viewG;
                    }
                    if (R0(i11)) {
                        for (int i12 = this.f2461p - 1; i12 >= 0; i12--) {
                            View viewG2 = this.f2462q[i12].g(iJ0, i11);
                            if (viewG2 != null && viewG2 != viewB) {
                                return viewG2;
                            }
                        }
                    } else {
                        for (int i13 = 0; i13 < this.f2461p; i13++) {
                            View viewG3 = this.f2462q[i13].g(iJ0, i11);
                            if (viewG3 != null && viewG3 != viewB) {
                                return viewG3;
                            }
                        }
                    }
                    boolean z10 = (this.f2468w ^ true) == (i11 == -1);
                    View viewQ = q(z10 ? fVar.c() : fVar.d());
                    if (viewQ != null && viewQ != viewB) {
                        return viewQ;
                    }
                    if (R0(i11)) {
                        for (int i14 = this.f2461p - 1; i14 >= 0; i14--) {
                            if (i14 != fVar.f2501e) {
                                View viewQ2 = q(z10 ? this.f2462q[i14].c() : this.f2462q[i14].d());
                                if (viewQ2 != null && viewQ2 != viewB) {
                                    return viewQ2;
                                }
                            }
                        }
                    } else {
                        for (int i15 = 0; i15 < this.f2461p; i15++) {
                            View viewQ3 = q(z10 ? this.f2462q[i15].c() : this.f2462q[i15].d());
                            if (viewQ3 != null && viewQ3 != viewB) {
                                return viewQ3;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final void T0(v.r rVar, n nVar) {
        if (!nVar.f2633a || nVar.f2641i) {
            return;
        }
        if (nVar.f2634b == 0) {
            if (nVar.f2637e == -1) {
                U0(rVar, nVar.f2639g);
                return;
            } else {
                V0(rVar, nVar.f2638f);
                return;
            }
        }
        int i10 = 1;
        if (nVar.f2637e == -1) {
            int i11 = nVar.f2638f;
            int iH = this.f2462q[0].h(i11);
            while (i10 < this.f2461p) {
                int iH2 = this.f2462q[i10].h(i11);
                if (iH2 > iH) {
                    iH = iH2;
                }
                i10++;
            }
            int i12 = i11 - iH;
            U0(rVar, i12 < 0 ? nVar.f2639g : nVar.f2639g - Math.min(i12, nVar.f2634b));
            return;
        }
        int i13 = nVar.f2639g;
        int iF = this.f2462q[0].f(i13);
        while (i10 < this.f2461p) {
            int iF2 = this.f2462q[i10].f(i13);
            if (iF2 < iF) {
                iF = iF2;
            }
            i10++;
        }
        int i14 = iF - nVar.f2639g;
        V0(rVar, i14 < 0 ? nVar.f2638f : Math.min(i14, nVar.f2634b) + nVar.f2638f);
    }

    @Override // androidx.recyclerview.widget.v.l
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View viewF0 = F0(false);
            View viewE0 = E0(false);
            if (viewF0 == null || viewE0 == null) {
                return;
            }
            int iH = v.l.H(viewF0);
            int iH2 = v.l.H(viewE0);
            if (iH < iH2) {
                accessibilityEvent.setFromIndex(iH);
                accessibilityEvent.setToIndex(iH2);
            } else {
                accessibilityEvent.setFromIndex(iH2);
                accessibilityEvent.setToIndex(iH);
            }
        }
    }

    public final void U0(v.r rVar, int i10) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            if (this.f2463r.e(viewU) < i10 || this.f2463r.n(viewU) < i10) {
                return;
            }
            c cVar = (c) viewU.getLayoutParams();
            cVar.getClass();
            if (cVar.f2480e.f2497a.size() == 1) {
                return;
            }
            f fVar = cVar.f2480e;
            ArrayList<View> arrayList = fVar.f2497a;
            int size = arrayList.size();
            View viewRemove = arrayList.remove(size - 1);
            c cVar2 = (c) viewRemove.getLayoutParams();
            cVar2.f2480e = null;
            if (cVar2.f2761a.g() || cVar2.f2761a.j()) {
                fVar.f2500d -= StaggeredGridLayoutManager.this.f2463r.c(viewRemove);
            }
            if (size == 1) {
                fVar.f2498b = PKIFailureInfo.systemUnavail;
            }
            fVar.f2499c = PKIFailureInfo.systemUnavail;
            k0(viewU, rVar);
        }
    }

    public final void V0(v.r rVar, int i10) {
        while (v() > 0) {
            View viewU = u(0);
            if (this.f2463r.b(viewU) > i10 || this.f2463r.m(viewU) > i10) {
                return;
            }
            c cVar = (c) viewU.getLayoutParams();
            cVar.getClass();
            if (cVar.f2480e.f2497a.size() == 1) {
                return;
            }
            f fVar = cVar.f2480e;
            ArrayList<View> arrayList = fVar.f2497a;
            View viewRemove = arrayList.remove(0);
            c cVar2 = (c) viewRemove.getLayoutParams();
            cVar2.f2480e = null;
            if (arrayList.size() == 0) {
                fVar.f2499c = PKIFailureInfo.systemUnavail;
            }
            if (cVar2.f2761a.g() || cVar2.f2761a.j()) {
                fVar.f2500d -= StaggeredGridLayoutManager.this.f2463r.c(viewRemove);
            }
            fVar.f2498b = PKIFailureInfo.systemUnavail;
            k0(viewU, rVar);
        }
    }

    public final void W0() {
        if (this.f2465t == 1 || !O0()) {
            this.f2469x = this.f2468w;
        } else {
            this.f2469x = !this.f2468w;
        }
    }

    public final int X0(int i10, v.r rVar, v.w wVar) {
        if (v() == 0 || i10 == 0) {
            return 0;
        }
        S0(i10, wVar);
        n nVar = this.f2467v;
        int iD0 = D0(rVar, nVar, wVar);
        if (nVar.f2634b >= iD0) {
            i10 = i10 < 0 ? -iD0 : iD0;
        }
        this.f2463r.o(-i10);
        this.D = this.f2469x;
        nVar.f2634b = 0;
        T0(rVar, nVar);
        return i10;
    }

    @Override // androidx.recyclerview.widget.v.l
    public final void Y(int i10, int i11) {
        M0(i10, i11, 1);
    }

    public final void Y0(int i10) {
        n nVar = this.f2467v;
        nVar.f2637e = i10;
        nVar.f2636d = this.f2469x != (i10 == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.v.l
    public final void Z() {
        this.B.a();
        n0();
    }

    public final void Z0(int i10, v.w wVar) {
        int iL;
        int iL2;
        int i11;
        n nVar = this.f2467v;
        boolean z10 = false;
        nVar.f2634b = 0;
        nVar.f2635c = i10;
        o oVar = this.f2744e;
        if (oVar == null || !oVar.f2786e || (i11 = wVar.f2797a) == -1) {
            iL = 0;
            iL2 = 0;
        } else {
            if (this.f2469x == (i11 < i10)) {
                iL = this.f2463r.l();
                iL2 = 0;
            } else {
                iL2 = this.f2463r.l();
                iL = 0;
            }
        }
        v vVar = this.f2741b;
        if (vVar == null || !vVar.f2671h) {
            nVar.f2639g = this.f2463r.f() + iL;
            nVar.f2638f = -iL2;
        } else {
            nVar.f2638f = this.f2463r.k() - iL2;
            nVar.f2639g = this.f2463r.g() + iL;
        }
        nVar.f2640h = false;
        nVar.f2633a = true;
        if (this.f2463r.i() == 0 && this.f2463r.f() == 0) {
            z10 = true;
        }
        nVar.f2641i = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    @Override // androidx.recyclerview.widget.v.AbstractC0038v.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PointF a(int i10) {
        int i11 = -1;
        if (v() != 0) {
            if ((i10 < I0()) == this.f2469x) {
            }
        } else if (this.f2469x) {
            i11 = 1;
        }
        PointF pointF = new PointF();
        if (i11 == 0) {
            return null;
        }
        if (this.f2465t == 0) {
            pointF.x = i11;
            pointF.y = CropImageView.DEFAULT_ASPECT_RATIO;
            return pointF;
        }
        pointF.x = CropImageView.DEFAULT_ASPECT_RATIO;
        pointF.y = i11;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.v.l
    public final void a0(int i10, int i11) {
        M0(i10, i11, 8);
    }

    public final void a1(f fVar, int i10, int i11) {
        int i12 = fVar.f2500d;
        int i13 = fVar.f2501e;
        if (i10 != -1) {
            int i14 = fVar.f2499c;
            if (i14 == Integer.MIN_VALUE) {
                fVar.a();
                i14 = fVar.f2499c;
            }
            if (i14 - i12 >= i11) {
                this.f2470y.set(i13, false);
                return;
            }
            return;
        }
        int i15 = fVar.f2498b;
        if (i15 == Integer.MIN_VALUE) {
            View view = fVar.f2497a.get(0);
            c cVar = (c) view.getLayoutParams();
            fVar.f2498b = StaggeredGridLayoutManager.this.f2463r.e(view);
            cVar.getClass();
            i15 = fVar.f2498b;
        }
        if (i15 + i12 <= i11) {
            this.f2470y.set(i13, false);
        }
    }

    @Override // androidx.recyclerview.widget.v.l
    public final void b0(int i10, int i11) {
        M0(i10, i11, 2);
    }

    @Override // androidx.recyclerview.widget.v.l
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    @Override // androidx.recyclerview.widget.v.l
    public final void c0(int i10, int i11) {
        M0(i10, i11, 4);
    }

    @Override // androidx.recyclerview.widget.v.l
    public final boolean d() {
        return this.f2465t == 0;
    }

    @Override // androidx.recyclerview.widget.v.l
    public final void d0(v.r rVar, v.w wVar) {
        Q0(rVar, wVar, true);
    }

    @Override // androidx.recyclerview.widget.v.l
    public final boolean e() {
        return this.f2465t == 1;
    }

    @Override // androidx.recyclerview.widget.v.l
    public final void e0(v.w wVar) {
        this.f2471z = -1;
        this.A = PKIFailureInfo.systemUnavail;
        this.F = null;
        this.H.a();
    }

    @Override // androidx.recyclerview.widget.v.l
    public final boolean f(v.m mVar) {
        return mVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.v.l
    public final void f0(Parcelable parcelable) {
        if (parcelable instanceof e) {
            e eVar = (e) parcelable;
            this.F = eVar;
            if (this.f2471z != -1) {
                eVar.f2487a = -1;
                eVar.f2488b = -1;
                eVar.f2490d = null;
                eVar.f2489c = 0;
                eVar.f2491e = 0;
                eVar.f2492f = null;
                eVar.f2493g = null;
            }
            n0();
        }
    }

    @Override // androidx.recyclerview.widget.v.l
    public final Parcelable g0() {
        int iH;
        int iK;
        int[] iArr;
        e eVar = this.F;
        if (eVar != null) {
            e eVar2 = new e();
            eVar2.f2489c = eVar.f2489c;
            eVar2.f2487a = eVar.f2487a;
            eVar2.f2488b = eVar.f2488b;
            eVar2.f2490d = eVar.f2490d;
            eVar2.f2491e = eVar.f2491e;
            eVar2.f2492f = eVar.f2492f;
            eVar2.f2494h = eVar.f2494h;
            eVar2.f2495j = eVar.f2495j;
            eVar2.f2496k = eVar.f2496k;
            eVar2.f2493g = eVar.f2493g;
            return eVar2;
        }
        e eVar3 = new e();
        eVar3.f2494h = this.f2468w;
        eVar3.f2495j = this.D;
        eVar3.f2496k = this.E;
        d dVar = this.B;
        if (dVar == null || (iArr = dVar.f2481a) == null) {
            eVar3.f2491e = 0;
        } else {
            eVar3.f2492f = iArr;
            eVar3.f2491e = iArr.length;
            eVar3.f2493g = dVar.f2482b;
        }
        if (v() <= 0) {
            eVar3.f2487a = -1;
            eVar3.f2488b = -1;
            eVar3.f2489c = 0;
            return eVar3;
        }
        eVar3.f2487a = this.D ? J0() : I0();
        View viewE0 = this.f2469x ? E0(true) : F0(true);
        eVar3.f2488b = viewE0 != null ? v.l.H(viewE0) : -1;
        int i10 = this.f2461p;
        eVar3.f2489c = i10;
        eVar3.f2490d = new int[i10];
        for (int i11 = 0; i11 < this.f2461p; i11++) {
            if (this.D) {
                iH = this.f2462q[i11].f(PKIFailureInfo.systemUnavail);
                if (iH != Integer.MIN_VALUE) {
                    iK = this.f2463r.g();
                    iH -= iK;
                }
            } else {
                iH = this.f2462q[i11].h(PKIFailureInfo.systemUnavail);
                if (iH != Integer.MIN_VALUE) {
                    iK = this.f2463r.k();
                    iH -= iK;
                }
            }
            eVar3.f2490d[i11] = iH;
        }
        return eVar3;
    }

    @Override // androidx.recyclerview.widget.v.l
    public final void h(int i10, int i11, v.w wVar, m.b bVar) {
        n nVar;
        int iF;
        int iH;
        if (this.f2465t != 0) {
            i10 = i11;
        }
        if (v() == 0 || i10 == 0) {
            return;
        }
        S0(i10, wVar);
        int[] iArr = this.J;
        if (iArr == null || iArr.length < this.f2461p) {
            this.J = new int[this.f2461p];
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = this.f2461p;
            nVar = this.f2467v;
            if (i12 >= i14) {
                break;
            }
            if (nVar.f2636d == -1) {
                iF = nVar.f2638f;
                iH = this.f2462q[i12].h(iF);
            } else {
                iF = this.f2462q[i12].f(nVar.f2639g);
                iH = nVar.f2639g;
            }
            int i15 = iF - iH;
            if (i15 >= 0) {
                this.J[i13] = i15;
                i13++;
            }
            i12++;
        }
        Arrays.sort(this.J, 0, i13);
        for (int i16 = 0; i16 < i13; i16++) {
            int i17 = nVar.f2635c;
            if (i17 < 0 || i17 >= wVar.b()) {
                return;
            }
            bVar.a(nVar.f2635c, this.J[i16]);
            nVar.f2635c += nVar.f2636d;
        }
    }

    @Override // androidx.recyclerview.widget.v.l
    public final void h0(int i10) {
        if (i10 == 0) {
            B0();
        }
    }

    @Override // androidx.recyclerview.widget.v.l
    public final int j(v.w wVar) {
        if (v() == 0) {
            return 0;
        }
        boolean z10 = !this.I;
        return z.a(wVar, this.f2463r, F0(z10), E0(z10), this, this.I);
    }

    @Override // androidx.recyclerview.widget.v.l
    public final int k(v.w wVar) {
        return C0(wVar);
    }

    @Override // androidx.recyclerview.widget.v.l
    public final int l(v.w wVar) {
        if (v() == 0) {
            return 0;
        }
        boolean z10 = !this.I;
        return z.c(wVar, this.f2463r, F0(z10), E0(z10), this, this.I);
    }

    @Override // androidx.recyclerview.widget.v.l
    public final int m(v.w wVar) {
        if (v() == 0) {
            return 0;
        }
        boolean z10 = !this.I;
        return z.a(wVar, this.f2463r, F0(z10), E0(z10), this, this.I);
    }

    @Override // androidx.recyclerview.widget.v.l
    public final int n(v.w wVar) {
        return C0(wVar);
    }

    @Override // androidx.recyclerview.widget.v.l
    public final int o(v.w wVar) {
        if (v() == 0) {
            return 0;
        }
        boolean z10 = !this.I;
        return z.c(wVar, this.f2463r, F0(z10), E0(z10), this, this.I);
    }

    @Override // androidx.recyclerview.widget.v.l
    public final int o0(int i10, v.r rVar, v.w wVar) {
        return X0(i10, rVar, wVar);
    }

    @Override // androidx.recyclerview.widget.v.l
    public final void p0(int i10) {
        e eVar = this.F;
        if (eVar != null && eVar.f2487a != i10) {
            eVar.f2490d = null;
            eVar.f2489c = 0;
            eVar.f2487a = -1;
            eVar.f2488b = -1;
        }
        this.f2471z = i10;
        this.A = PKIFailureInfo.systemUnavail;
        n0();
    }

    @Override // androidx.recyclerview.widget.v.l
    public final int q0(int i10, v.r rVar, v.w wVar) {
        return X0(i10, rVar, wVar);
    }

    @Override // androidx.recyclerview.widget.v.l
    public final v.m r() {
        return this.f2465t == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.v.l
    public final v.m s(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.v.l
    public final v.m t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.v.l
    public final void t0(Rect rect, int i10, int i11) {
        int iG;
        int iG2;
        int iF = F() + E();
        int iD = D() + G();
        int i12 = this.f2465t;
        int i13 = this.f2461p;
        if (i12 == 1) {
            int iHeight = rect.height() + iD;
            v vVar = this.f2741b;
            Field field = q0.f33885a;
            iG2 = v.l.g(i11, iHeight, vVar.getMinimumHeight());
            iG = v.l.g(i10, (this.f2466u * i13) + iF, this.f2741b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iF;
            v vVar2 = this.f2741b;
            Field field2 = q0.f33885a;
            iG = v.l.g(i10, iWidth, vVar2.getMinimumWidth());
            iG2 = v.l.g(i11, (this.f2466u * i13) + iD, this.f2741b.getMinimumHeight());
        }
        this.f2741b.setMeasuredDimension(iG, iG2);
    }
}
