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
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.m implements RecyclerView.w.b {
    public final a A;
    public final b B;
    public final int C;
    public final int[] D;

    /* renamed from: p, reason: collision with root package name */
    public int f1368p;

    /* renamed from: q, reason: collision with root package name */
    public c f1369q;

    /* renamed from: r, reason: collision with root package name */
    public s f1370r;
    public boolean s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f1371t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1372u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1373v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f1374w;

    /* renamed from: x, reason: collision with root package name */
    public int f1375x;

    /* renamed from: y, reason: collision with root package name */
    public int f1376y;

    /* renamed from: z, reason: collision with root package name */
    public d f1377z;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public s f1378a;

        /* renamed from: b, reason: collision with root package name */
        public int f1379b;

        /* renamed from: c, reason: collision with root package name */
        public int f1380c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f1381d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f1382e;

        public a() {
            d();
        }

        public final void a() {
            this.f1380c = this.f1381d ? this.f1378a.g() : this.f1378a.k();
        }

        public final void b(View view, int i6) {
            if (this.f1381d) {
                int iB = this.f1378a.b(view);
                s sVar = this.f1378a;
                this.f1380c = (Integer.MIN_VALUE == sVar.f1714b ? 0 : sVar.l() - sVar.f1714b) + iB;
            } else {
                this.f1380c = this.f1378a.e(view);
            }
            this.f1379b = i6;
        }

        public final void c(View view, int i6) {
            s sVar = this.f1378a;
            int iL = Integer.MIN_VALUE == sVar.f1714b ? 0 : sVar.l() - sVar.f1714b;
            if (iL >= 0) {
                b(view, i6);
                return;
            }
            this.f1379b = i6;
            if (!this.f1381d) {
                int iE = this.f1378a.e(view);
                int iK = iE - this.f1378a.k();
                this.f1380c = iE;
                if (iK > 0) {
                    int iG = (this.f1378a.g() - Math.min(0, (this.f1378a.g() - iL) - this.f1378a.b(view))) - (this.f1378a.c(view) + iE);
                    if (iG < 0) {
                        this.f1380c -= Math.min(iK, -iG);
                        return;
                    }
                    return;
                }
                return;
            }
            int iG2 = (this.f1378a.g() - iL) - this.f1378a.b(view);
            this.f1380c = this.f1378a.g() - iG2;
            if (iG2 > 0) {
                int iC = this.f1380c - this.f1378a.c(view);
                int iK2 = this.f1378a.k();
                int iMin = iC - (Math.min(this.f1378a.e(view) - iK2, 0) + iK2);
                if (iMin < 0) {
                    this.f1380c = Math.min(iG2, -iMin) + this.f1380c;
                }
            }
        }

        public final void d() {
            this.f1379b = -1;
            this.f1380c = Integer.MIN_VALUE;
            this.f1381d = false;
            this.f1382e = false;
        }

        public final String toString() {
            return "AnchorInfo{mPosition=" + this.f1379b + ", mCoordinate=" + this.f1380c + ", mLayoutFromEnd=" + this.f1381d + ", mValid=" + this.f1382e + '}';
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f1383a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f1384b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f1385c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f1386d;
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f1387a;

        /* renamed from: b, reason: collision with root package name */
        public int f1388b;

        /* renamed from: c, reason: collision with root package name */
        public int f1389c;

        /* renamed from: d, reason: collision with root package name */
        public int f1390d;

        /* renamed from: e, reason: collision with root package name */
        public int f1391e;

        /* renamed from: f, reason: collision with root package name */
        public int f1392f;

        /* renamed from: g, reason: collision with root package name */
        public int f1393g;
        public int h;

        /* renamed from: i, reason: collision with root package name */
        public int f1394i;

        /* renamed from: j, reason: collision with root package name */
        public int f1395j;

        /* renamed from: k, reason: collision with root package name */
        public List<RecyclerView.b0> f1396k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f1397l;

        public final void a(View view) {
            int iB;
            int size = this.f1396k.size();
            View view2 = null;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < size; i7++) {
                View view3 = this.f1396k.get(i7).f1441a;
                RecyclerView.n nVar = (RecyclerView.n) view3.getLayoutParams();
                if (view3 != view && !nVar.f1492a.h() && (iB = (nVar.f1492a.b() - this.f1390d) * this.f1391e) >= 0 && iB < i6) {
                    view2 = view3;
                    if (iB == 0) {
                        break;
                    } else {
                        i6 = iB;
                    }
                }
            }
            if (view2 == null) {
                this.f1390d = -1;
            } else {
                this.f1390d = ((RecyclerView.n) view2.getLayoutParams()).f1492a.b();
            }
        }

        public final View b(RecyclerView.s sVar) {
            List<RecyclerView.b0> list = this.f1396k;
            if (list == null) {
                View viewD = sVar.d(this.f1390d);
                this.f1390d += this.f1391e;
                return viewD;
            }
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                View view = this.f1396k.get(i6).f1441a;
                RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
                if (!nVar.f1492a.h() && this.f1390d == nVar.f1492a.b()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    @SuppressLint({"BanParcelableUsage"})
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();
        public int s;

        /* renamed from: t, reason: collision with root package name */
        public int f1398t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f1399u;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                d dVar = new d();
                dVar.s = parcel.readInt();
                dVar.f1398t = parcel.readInt();
                dVar.f1399u = parcel.readInt() == 1;
                return dVar;
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i6) {
                return new d[i6];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeInt(this.s);
            parcel.writeInt(this.f1398t);
            parcel.writeInt(this.f1399u ? 1 : 0);
        }
    }

    public LinearLayoutManager(int i6) {
        this.f1368p = 1;
        this.f1371t = false;
        this.f1372u = false;
        this.f1373v = false;
        this.f1374w = true;
        this.f1375x = -1;
        this.f1376y = Integer.MIN_VALUE;
        this.f1377z = null;
        this.A = new a();
        this.B = new b();
        this.C = 2;
        this.D = new int[2];
        c1(i6);
        c(null);
        if (this.f1371t) {
            this.f1371t = false;
            n0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean B0() {
        return this.f1377z == null && this.s == this.f1373v;
    }

    public void C0(RecyclerView.x xVar, int[] iArr) {
        int i6;
        int iL = xVar.f1526a != -1 ? this.f1370r.l() : 0;
        if (this.f1369q.f1392f == -1) {
            i6 = 0;
        } else {
            i6 = iL;
            iL = 0;
        }
        iArr[0] = iL;
        iArr[1] = i6;
    }

    public void D0(RecyclerView.x xVar, c cVar, m.b bVar) {
        int i6 = cVar.f1390d;
        if (i6 < 0 || i6 >= xVar.b()) {
            return;
        }
        bVar.a(i6, Math.max(0, cVar.f1393g));
    }

    public final int E0(RecyclerView.x xVar) {
        if (v() == 0) {
            return 0;
        }
        I0();
        s sVar = this.f1370r;
        boolean z6 = !this.f1374w;
        return y.a(xVar, sVar, L0(z6), K0(z6), this, this.f1374w);
    }

    public final int F0(RecyclerView.x xVar) {
        if (v() == 0) {
            return 0;
        }
        I0();
        s sVar = this.f1370r;
        boolean z6 = !this.f1374w;
        return y.b(xVar, sVar, L0(z6), K0(z6), this, this.f1374w, this.f1372u);
    }

    public final int G0(RecyclerView.x xVar) {
        if (v() == 0) {
            return 0;
        }
        I0();
        s sVar = this.f1370r;
        boolean z6 = !this.f1374w;
        return y.c(xVar, sVar, L0(z6), K0(z6), this, this.f1374w);
    }

    public final int H0(int i6) {
        return i6 != 1 ? i6 != 2 ? i6 != 17 ? i6 != 33 ? i6 != 66 ? (i6 == 130 && this.f1368p == 1) ? 1 : Integer.MIN_VALUE : this.f1368p == 0 ? 1 : Integer.MIN_VALUE : this.f1368p == 1 ? -1 : Integer.MIN_VALUE : this.f1368p == 0 ? -1 : Integer.MIN_VALUE : (this.f1368p != 1 && V0()) ? -1 : 1 : (this.f1368p != 1 && V0()) ? 1 : -1;
    }

    public final void I0() {
        if (this.f1369q == null) {
            c cVar = new c();
            cVar.f1387a = true;
            cVar.h = 0;
            cVar.f1394i = 0;
            cVar.f1396k = null;
            this.f1369q = cVar;
        }
    }

    public final int J0(RecyclerView.s sVar, c cVar, RecyclerView.x xVar, boolean z6) {
        int i6;
        int i7 = cVar.f1389c;
        int i8 = cVar.f1393g;
        if (i8 != Integer.MIN_VALUE) {
            if (i7 < 0) {
                cVar.f1393g = i8 + i7;
            }
            Y0(sVar, cVar);
        }
        int i9 = cVar.f1389c + cVar.h;
        while (true) {
            if ((!cVar.f1397l && i9 <= 0) || (i6 = cVar.f1390d) < 0 || i6 >= xVar.b()) {
                break;
            }
            b bVar = this.B;
            bVar.f1383a = 0;
            bVar.f1384b = false;
            bVar.f1385c = false;
            bVar.f1386d = false;
            W0(sVar, xVar, cVar, bVar);
            if (!bVar.f1384b) {
                int i10 = cVar.f1388b;
                int i11 = bVar.f1383a;
                cVar.f1388b = (cVar.f1392f * i11) + i10;
                if (!bVar.f1385c || cVar.f1396k != null || !xVar.f1532g) {
                    cVar.f1389c -= i11;
                    i9 -= i11;
                }
                int i12 = cVar.f1393g;
                if (i12 != Integer.MIN_VALUE) {
                    int i13 = i12 + i11;
                    cVar.f1393g = i13;
                    int i14 = cVar.f1389c;
                    if (i14 < 0) {
                        cVar.f1393g = i13 + i14;
                    }
                    Y0(sVar, cVar);
                }
                if (z6 && bVar.f1386d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i7 - cVar.f1389c;
    }

    public final View K0(boolean z6) {
        return this.f1372u ? P0(0, v(), z6) : P0(v() - 1, -1, z6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean L() {
        return true;
    }

    public final View L0(boolean z6) {
        return this.f1372u ? P0(v() - 1, -1, z6) : P0(0, v(), z6);
    }

    public final int M0() {
        View viewP0 = P0(0, v(), false);
        if (viewP0 == null) {
            return -1;
        }
        return RecyclerView.m.H(viewP0);
    }

    public final int N0() {
        View viewP0 = P0(v() - 1, -1, false);
        if (viewP0 == null) {
            return -1;
        }
        return RecyclerView.m.H(viewP0);
    }

    public final View O0(int i6, int i7) {
        int i8;
        int i9;
        I0();
        if (i7 <= i6 && i7 >= i6) {
            return u(i6);
        }
        if (this.f1370r.e(u(i6)) < this.f1370r.k()) {
            i8 = 16644;
            i9 = 16388;
        } else {
            i8 = 4161;
            i9 = 4097;
        }
        return this.f1368p == 0 ? this.f1474c.a(i6, i7, i8, i9) : this.f1475d.a(i6, i7, i8, i9);
    }

    public final View P0(int i6, int i7, boolean z6) {
        I0();
        int i8 = z6 ? 24579 : 320;
        return this.f1368p == 0 ? this.f1474c.a(i6, i7, i8, 320) : this.f1475d.a(i6, i7, i8, 320);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View Q0(RecyclerView.s sVar, RecyclerView.x xVar, boolean z6, boolean z7) {
        int i6;
        int iV;
        int i7;
        I0();
        int iV2 = v();
        if (z7) {
            iV = v() - 1;
            i6 = -1;
            i7 = -1;
        } else {
            i6 = iV2;
            iV = 0;
            i7 = 1;
        }
        int iB = xVar.b();
        int iK = this.f1370r.k();
        int iG = this.f1370r.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iV != i6) {
            View viewU = u(iV);
            int iH = RecyclerView.m.H(viewU);
            int iE = this.f1370r.e(viewU);
            int iB2 = this.f1370r.b(viewU);
            if (iH >= 0 && iH < iB) {
                if (!((RecyclerView.n) viewU.getLayoutParams()).f1492a.h()) {
                    boolean z8 = iB2 <= iK && iE < iK;
                    boolean z9 = iE >= iG && iB2 > iG;
                    if (!z8 && !z9) {
                        return viewU;
                    }
                    if (z6) {
                        if (z9) {
                            view2 = viewU;
                        } else if (view == null) {
                            view = viewU;
                        }
                    } else if (!z8) {
                        if (view == null) {
                        }
                    }
                } else if (view3 == null) {
                    view3 = viewU;
                }
            }
            iV += i7;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    public final int R0(int i6, RecyclerView.s sVar, RecyclerView.x xVar, boolean z6) {
        int iG;
        int iG2 = this.f1370r.g() - i6;
        if (iG2 <= 0) {
            return 0;
        }
        int i7 = -b1(-iG2, sVar, xVar);
        int i8 = i6 + i7;
        if (!z6 || (iG = this.f1370r.g() - i8) <= 0) {
            return i7;
        }
        this.f1370r.o(iG);
        return iG + i7;
    }

    public final int S0(int i6, RecyclerView.s sVar, RecyclerView.x xVar, boolean z6) {
        int iK;
        int iK2 = i6 - this.f1370r.k();
        if (iK2 <= 0) {
            return 0;
        }
        int i7 = -b1(iK2, sVar, xVar);
        int i8 = i6 + i7;
        if (!z6 || (iK = i8 - this.f1370r.k()) <= 0) {
            return i7;
        }
        this.f1370r.o(-iK);
        return i7 - iK;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public View T(View view, int i6, RecyclerView.s sVar, RecyclerView.x xVar) {
        int iH0;
        a1();
        if (v() != 0 && (iH0 = H0(i6)) != Integer.MIN_VALUE) {
            I0();
            e1(iH0, (int) (this.f1370r.l() * 0.33333334f), false, xVar);
            c cVar = this.f1369q;
            cVar.f1393g = Integer.MIN_VALUE;
            cVar.f1387a = false;
            J0(sVar, cVar, xVar, true);
            View viewO0 = iH0 == -1 ? this.f1372u ? O0(v() - 1, -1) : O0(0, v()) : this.f1372u ? O0(0, v()) : O0(v() - 1, -1);
            View viewU0 = iH0 == -1 ? U0() : T0();
            if (!viewU0.hasFocusable()) {
                return viewO0;
            }
            if (viewO0 != null) {
                return viewU0;
            }
        }
        return null;
    }

    public final View T0() {
        return u(this.f1372u ? 0 : v() - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(M0());
            accessibilityEvent.setToIndex(N0());
        }
    }

    public final View U0() {
        return u(this.f1372u ? v() - 1 : 0);
    }

    public final boolean V0() {
        return C() == 1;
    }

    public void W0(RecyclerView.s sVar, RecyclerView.x xVar, c cVar, b bVar) {
        int iE;
        int i6;
        int i7;
        int iD;
        View viewB = cVar.b(sVar);
        if (viewB == null) {
            bVar.f1384b = true;
            return;
        }
        RecyclerView.n nVar = (RecyclerView.n) viewB.getLayoutParams();
        if (cVar.f1396k == null) {
            if (this.f1372u == (cVar.f1392f == -1)) {
                b(viewB, -1, false);
            } else {
                b(viewB, 0, false);
            }
        } else {
            if (this.f1372u == (cVar.f1392f == -1)) {
                b(viewB, -1, true);
            } else {
                b(viewB, 0, true);
            }
        }
        RecyclerView.n nVar2 = (RecyclerView.n) viewB.getLayoutParams();
        Rect rectN = this.f1473b.N(viewB);
        int i8 = rectN.left + rectN.right;
        int i9 = rectN.top + rectN.bottom;
        int iW = RecyclerView.m.w(d(), this.f1484n, this.f1482l, F() + E() + ((ViewGroup.MarginLayoutParams) nVar2).leftMargin + ((ViewGroup.MarginLayoutParams) nVar2).rightMargin + i8, ((ViewGroup.MarginLayoutParams) nVar2).width);
        int iW2 = RecyclerView.m.w(e(), this.f1485o, this.f1483m, D() + G() + ((ViewGroup.MarginLayoutParams) nVar2).topMargin + ((ViewGroup.MarginLayoutParams) nVar2).bottomMargin + i9, ((ViewGroup.MarginLayoutParams) nVar2).height);
        if (w0(viewB, iW, iW2, nVar2)) {
            viewB.measure(iW, iW2);
        }
        bVar.f1383a = this.f1370r.c(viewB);
        if (this.f1368p == 1) {
            if (V0()) {
                iD = this.f1484n - F();
                iE = iD - this.f1370r.d(viewB);
            } else {
                iE = E();
                iD = this.f1370r.d(viewB) + iE;
            }
            if (cVar.f1392f == -1) {
                i6 = cVar.f1388b;
                i7 = i6 - bVar.f1383a;
            } else {
                i7 = cVar.f1388b;
                i6 = bVar.f1383a + i7;
            }
        } else {
            int iG = G();
            int iD2 = this.f1370r.d(viewB) + iG;
            if (cVar.f1392f == -1) {
                int i10 = cVar.f1388b;
                int i11 = i10 - bVar.f1383a;
                iD = i10;
                i6 = iD2;
                iE = i11;
                i7 = iG;
            } else {
                int i12 = cVar.f1388b;
                int i13 = bVar.f1383a + i12;
                iE = i12;
                i6 = iD2;
                i7 = iG;
                iD = i13;
            }
        }
        RecyclerView.m.N(viewB, iE, i7, iD, i6);
        if (nVar.f1492a.h() || nVar.f1492a.k()) {
            bVar.f1385c = true;
        }
        bVar.f1386d = viewB.hasFocusable();
    }

    public final void Y0(RecyclerView.s sVar, c cVar) {
        if (!cVar.f1387a || cVar.f1397l) {
            return;
        }
        int i6 = cVar.f1393g;
        int i7 = cVar.f1394i;
        if (cVar.f1392f == -1) {
            int iV = v();
            if (i6 < 0) {
                return;
            }
            int iF = (this.f1370r.f() - i6) + i7;
            if (this.f1372u) {
                for (int i8 = 0; i8 < iV; i8++) {
                    View viewU = u(i8);
                    if (this.f1370r.e(viewU) < iF || this.f1370r.n(viewU) < iF) {
                        Z0(sVar, 0, i8);
                        return;
                    }
                }
                return;
            }
            int i9 = iV - 1;
            for (int i10 = i9; i10 >= 0; i10--) {
                View viewU2 = u(i10);
                if (this.f1370r.e(viewU2) < iF || this.f1370r.n(viewU2) < iF) {
                    Z0(sVar, i9, i10);
                    return;
                }
            }
            return;
        }
        if (i6 < 0) {
            return;
        }
        int i11 = i6 - i7;
        int iV2 = v();
        if (!this.f1372u) {
            for (int i12 = 0; i12 < iV2; i12++) {
                View viewU3 = u(i12);
                if (this.f1370r.b(viewU3) > i11 || this.f1370r.m(viewU3) > i11) {
                    Z0(sVar, 0, i12);
                    return;
                }
            }
            return;
        }
        int i13 = iV2 - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View viewU4 = u(i14);
            if (this.f1370r.b(viewU4) > i11 || this.f1370r.m(viewU4) > i11) {
                Z0(sVar, i13, i14);
                return;
            }
        }
    }

    public final void Z0(RecyclerView.s sVar, int i6, int i7) {
        if (i6 == i7) {
            return;
        }
        if (i7 <= i6) {
            while (i6 > i7) {
                View viewU = u(i6);
                l0(i6);
                sVar.i(viewU);
                i6--;
            }
            return;
        }
        for (int i8 = i7 - 1; i8 >= i6; i8--) {
            View viewU2 = u(i8);
            l0(i8);
            sVar.i(viewU2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.w.b
    @SuppressLint({"UnknownNullness"})
    public final PointF a(int i6) {
        if (v() == 0) {
            return null;
        }
        int i7 = (i6 < RecyclerView.m.H(u(0))) != this.f1372u ? -1 : 1;
        return this.f1368p == 0 ? new PointF(i7, 0.0f) : new PointF(0.0f, i7);
    }

    public final void a1() {
        if (this.f1368p == 1 || !V0()) {
            this.f1372u = this.f1371t;
        } else {
            this.f1372u = !this.f1371t;
        }
    }

    public final int b1(int i6, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (v() != 0 && i6 != 0) {
            I0();
            this.f1369q.f1387a = true;
            int i7 = i6 > 0 ? 1 : -1;
            int iAbs = Math.abs(i6);
            e1(i7, iAbs, true, xVar);
            c cVar = this.f1369q;
            int iJ0 = J0(sVar, cVar, xVar, false) + cVar.f1393g;
            if (iJ0 >= 0) {
                if (iAbs > iJ0) {
                    i6 = i7 * iJ0;
                }
                this.f1370r.o(-i6);
                this.f1369q.f1395j = i6;
                return i6;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public final void c(String str) {
        if (this.f1377z == null) {
            super.c(str);
        }
    }

    public final void c1(int i6) {
        if (i6 != 0 && i6 != 1) {
            throw new IllegalArgumentException(androidx.camera.camera2.internal.compat.workaround.c.d(i6, "invalid orientation:"));
        }
        c(null);
        if (i6 != this.f1368p || this.f1370r == null) {
            s sVarA = s.a(this, i6);
            this.f1370r = sVarA;
            this.A.f1378a = sVarA;
            this.f1368p = i6;
            n0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean d() {
        return this.f1368p == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0192  */
    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d0(RecyclerView.s sVar, RecyclerView.x xVar) {
        View focusedChild;
        View focusedChild2;
        View viewQ0;
        int i6;
        int iE;
        int i7;
        int i8;
        List<RecyclerView.b0> list;
        int i9;
        int i10;
        int iR0;
        int i11;
        View viewQ;
        int iE2;
        int iG;
        int i12;
        int i13 = -1;
        if (!(this.f1377z == null && this.f1375x == -1) && xVar.b() == 0) {
            i0(sVar);
            return;
        }
        d dVar = this.f1377z;
        if (dVar != null && (i12 = dVar.s) >= 0) {
            this.f1375x = i12;
        }
        I0();
        this.f1369q.f1387a = false;
        a1();
        RecyclerView recyclerView = this.f1473b;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f1472a.f1590c.contains(focusedChild)) {
            focusedChild = null;
        }
        a aVar = this.A;
        if (!aVar.f1382e || this.f1375x != -1 || this.f1377z != null) {
            aVar.d();
            aVar.f1381d = this.f1372u ^ this.f1373v;
            if (xVar.f1532g || (i6 = this.f1375x) == -1) {
                if (v() != 0) {
                    RecyclerView recyclerView2 = this.f1473b;
                    if (recyclerView2 == null || (focusedChild2 = recyclerView2.getFocusedChild()) == null || this.f1472a.f1590c.contains(focusedChild2)) {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        RecyclerView.n nVar = (RecyclerView.n) focusedChild2.getLayoutParams();
                        if (nVar.f1492a.h() || nVar.f1492a.b() < 0 || nVar.f1492a.b() >= xVar.b()) {
                            boolean z6 = this.s;
                            boolean z7 = this.f1373v;
                            if (z6 == z7 && (viewQ0 = Q0(sVar, xVar, aVar.f1381d, z7)) != null) {
                                aVar.b(viewQ0, RecyclerView.m.H(viewQ0));
                                if (!xVar.f1532g && B0()) {
                                    int iE3 = this.f1370r.e(viewQ0);
                                    int iB = this.f1370r.b(viewQ0);
                                    int iK = this.f1370r.k();
                                    int iG2 = this.f1370r.g();
                                    boolean z8 = iB <= iK && iE3 < iK;
                                    boolean z9 = iE3 >= iG2 && iB > iG2;
                                    if (z8 || z9) {
                                        if (aVar.f1381d) {
                                            iK = iG2;
                                        }
                                        aVar.f1380c = iK;
                                    }
                                }
                            } else {
                                aVar.a();
                                aVar.f1379b = this.f1373v ? xVar.b() - 1 : 0;
                            }
                        } else {
                            aVar.c(focusedChild2, RecyclerView.m.H(focusedChild2));
                        }
                        aVar.f1382e = true;
                    }
                }
            } else if (i6 < 0 || i6 >= xVar.b()) {
                this.f1375x = -1;
                this.f1376y = Integer.MIN_VALUE;
                if (v() != 0) {
                }
            } else {
                int i14 = this.f1375x;
                aVar.f1379b = i14;
                d dVar2 = this.f1377z;
                if (dVar2 != null && dVar2.s >= 0) {
                    boolean z10 = dVar2.f1399u;
                    aVar.f1381d = z10;
                    if (z10) {
                        aVar.f1380c = this.f1370r.g() - this.f1377z.f1398t;
                    } else {
                        aVar.f1380c = this.f1370r.k() + this.f1377z.f1398t;
                    }
                } else if (this.f1376y == Integer.MIN_VALUE) {
                    View viewQ2 = q(i14);
                    if (viewQ2 == null) {
                        if (v() > 0) {
                            aVar.f1381d = (this.f1375x < RecyclerView.m.H(u(0))) == this.f1372u;
                        }
                        aVar.a();
                    } else if (this.f1370r.c(viewQ2) > this.f1370r.l()) {
                        aVar.a();
                    } else if (this.f1370r.e(viewQ2) - this.f1370r.k() < 0) {
                        aVar.f1380c = this.f1370r.k();
                        aVar.f1381d = false;
                    } else if (this.f1370r.g() - this.f1370r.b(viewQ2) < 0) {
                        aVar.f1380c = this.f1370r.g();
                        aVar.f1381d = true;
                    } else {
                        if (aVar.f1381d) {
                            int iB2 = this.f1370r.b(viewQ2);
                            s sVar2 = this.f1370r;
                            iE = (Integer.MIN_VALUE == sVar2.f1714b ? 0 : sVar2.l() - sVar2.f1714b) + iB2;
                        } else {
                            iE = this.f1370r.e(viewQ2);
                        }
                        aVar.f1380c = iE;
                    }
                } else {
                    boolean z11 = this.f1372u;
                    aVar.f1381d = z11;
                    if (z11) {
                        aVar.f1380c = this.f1370r.g() - this.f1376y;
                    } else {
                        aVar.f1380c = this.f1370r.k() + this.f1376y;
                    }
                }
                aVar.f1382e = true;
            }
        } else if (focusedChild != null && (this.f1370r.e(focusedChild) >= this.f1370r.g() || this.f1370r.b(focusedChild) <= this.f1370r.k())) {
            aVar.c(focusedChild, RecyclerView.m.H(focusedChild));
        }
        c cVar = this.f1369q;
        cVar.f1392f = cVar.f1395j >= 0 ? 1 : -1;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        C0(xVar, iArr);
        int iK2 = this.f1370r.k() + Math.max(0, iArr[0]);
        int iH = this.f1370r.h() + Math.max(0, iArr[1]);
        if (xVar.f1532g && (i11 = this.f1375x) != -1 && this.f1376y != Integer.MIN_VALUE && (viewQ = q(i11)) != null) {
            if (this.f1372u) {
                iG = this.f1370r.g() - this.f1370r.b(viewQ);
                iE2 = this.f1376y;
            } else {
                iE2 = this.f1370r.e(viewQ) - this.f1370r.k();
                iG = this.f1376y;
            }
            int i15 = iG - iE2;
            if (i15 > 0) {
                iK2 += i15;
            } else {
                iH -= i15;
            }
        }
        if (!aVar.f1381d ? !this.f1372u : this.f1372u) {
            i13 = 1;
        }
        X0(sVar, xVar, aVar, i13);
        p(sVar);
        this.f1369q.f1397l = this.f1370r.i() == 0 && this.f1370r.f() == 0;
        this.f1369q.getClass();
        this.f1369q.f1394i = 0;
        if (aVar.f1381d) {
            g1(aVar.f1379b, aVar.f1380c);
            c cVar2 = this.f1369q;
            cVar2.h = iK2;
            J0(sVar, cVar2, xVar, false);
            c cVar3 = this.f1369q;
            i8 = cVar3.f1388b;
            int i16 = cVar3.f1390d;
            int i17 = cVar3.f1389c;
            if (i17 > 0) {
                iH += i17;
            }
            f1(aVar.f1379b, aVar.f1380c);
            c cVar4 = this.f1369q;
            cVar4.h = iH;
            cVar4.f1390d += cVar4.f1391e;
            J0(sVar, cVar4, xVar, false);
            c cVar5 = this.f1369q;
            i7 = cVar5.f1388b;
            int i18 = cVar5.f1389c;
            if (i18 > 0) {
                g1(i16, i8);
                c cVar6 = this.f1369q;
                cVar6.h = i18;
                J0(sVar, cVar6, xVar, false);
                i8 = this.f1369q.f1388b;
            }
        } else {
            f1(aVar.f1379b, aVar.f1380c);
            c cVar7 = this.f1369q;
            cVar7.h = iH;
            J0(sVar, cVar7, xVar, false);
            c cVar8 = this.f1369q;
            i7 = cVar8.f1388b;
            int i19 = cVar8.f1390d;
            int i20 = cVar8.f1389c;
            if (i20 > 0) {
                iK2 += i20;
            }
            g1(aVar.f1379b, aVar.f1380c);
            c cVar9 = this.f1369q;
            cVar9.h = iK2;
            cVar9.f1390d += cVar9.f1391e;
            J0(sVar, cVar9, xVar, false);
            c cVar10 = this.f1369q;
            int i21 = cVar10.f1388b;
            int i22 = cVar10.f1389c;
            if (i22 > 0) {
                f1(i19, i7);
                c cVar11 = this.f1369q;
                cVar11.h = i22;
                J0(sVar, cVar11, xVar, false);
                i7 = this.f1369q.f1388b;
            }
            i8 = i21;
        }
        if (v() > 0) {
            if (this.f1372u ^ this.f1373v) {
                int iR02 = R0(i7, sVar, xVar, true);
                i9 = i8 + iR02;
                i10 = i7 + iR02;
                iR0 = S0(i9, sVar, xVar, false);
            } else {
                int iS0 = S0(i8, sVar, xVar, true);
                i9 = i8 + iS0;
                i10 = i7 + iS0;
                iR0 = R0(i10, sVar, xVar, false);
            }
            i8 = i9 + iR0;
            i7 = i10 + iR0;
        }
        if (xVar.f1535k && v() != 0 && !xVar.f1532g && B0()) {
            List<RecyclerView.b0> list2 = sVar.f1506d;
            int size = list2.size();
            int iH2 = RecyclerView.m.H(u(0));
            int iC = 0;
            int iC2 = 0;
            for (int i23 = 0; i23 < size; i23++) {
                RecyclerView.b0 b0Var = list2.get(i23);
                boolean zH = b0Var.h();
                View view = b0Var.f1441a;
                if (!zH) {
                    if ((b0Var.b() < iH2) != this.f1372u) {
                        iC += this.f1370r.c(view);
                    } else {
                        iC2 += this.f1370r.c(view);
                    }
                }
            }
            this.f1369q.f1396k = list2;
            if (iC > 0) {
                g1(RecyclerView.m.H(U0()), i8);
                c cVar12 = this.f1369q;
                cVar12.h = iC;
                cVar12.f1389c = 0;
                cVar12.a(null);
                J0(sVar, this.f1369q, xVar, false);
            }
            if (iC2 > 0) {
                f1(RecyclerView.m.H(T0()), i7);
                c cVar13 = this.f1369q;
                cVar13.h = iC2;
                cVar13.f1389c = 0;
                list = null;
                cVar13.a(null);
                J0(sVar, this.f1369q, xVar, false);
            } else {
                list = null;
            }
            this.f1369q.f1396k = list;
        }
        if (xVar.f1532g) {
            aVar.d();
        } else {
            s sVar3 = this.f1370r;
            sVar3.f1714b = sVar3.l();
        }
        this.s = this.f1373v;
    }

    public void d1(boolean z6) {
        c(null);
        if (this.f1373v == z6) {
            return;
        }
        this.f1373v = z6;
        n0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean e() {
        return this.f1368p == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public void e0(RecyclerView.x xVar) {
        this.f1377z = null;
        this.f1375x = -1;
        this.f1376y = Integer.MIN_VALUE;
        this.A.d();
    }

    public final void e1(int i6, int i7, boolean z6, RecyclerView.x xVar) {
        int iK;
        this.f1369q.f1397l = this.f1370r.i() == 0 && this.f1370r.f() == 0;
        this.f1369q.f1392f = i6;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        C0(xVar, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z7 = i6 == 1;
        c cVar = this.f1369q;
        int i8 = z7 ? iMax2 : iMax;
        cVar.h = i8;
        if (!z7) {
            iMax = iMax2;
        }
        cVar.f1394i = iMax;
        if (z7) {
            cVar.h = this.f1370r.h() + i8;
            View viewT0 = T0();
            c cVar2 = this.f1369q;
            cVar2.f1391e = this.f1372u ? -1 : 1;
            int iH = RecyclerView.m.H(viewT0);
            c cVar3 = this.f1369q;
            cVar2.f1390d = iH + cVar3.f1391e;
            cVar3.f1388b = this.f1370r.b(viewT0);
            iK = this.f1370r.b(viewT0) - this.f1370r.g();
        } else {
            View viewU0 = U0();
            c cVar4 = this.f1369q;
            cVar4.h = this.f1370r.k() + cVar4.h;
            c cVar5 = this.f1369q;
            cVar5.f1391e = this.f1372u ? 1 : -1;
            int iH2 = RecyclerView.m.H(viewU0);
            c cVar6 = this.f1369q;
            cVar5.f1390d = iH2 + cVar6.f1391e;
            cVar6.f1388b = this.f1370r.e(viewU0);
            iK = (-this.f1370r.e(viewU0)) + this.f1370r.k();
        }
        c cVar7 = this.f1369q;
        cVar7.f1389c = i7;
        if (z6) {
            cVar7.f1389c = i7 - iK;
        }
        cVar7.f1393g = iK;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public final void f0(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.f1377z = dVar;
            if (this.f1375x != -1) {
                dVar.s = -1;
            }
            n0();
        }
    }

    public final void f1(int i6, int i7) {
        this.f1369q.f1389c = this.f1370r.g() - i7;
        c cVar = this.f1369q;
        cVar.f1391e = this.f1372u ? -1 : 1;
        cVar.f1390d = i6;
        cVar.f1392f = 1;
        cVar.f1388b = i7;
        cVar.f1393g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public final Parcelable g0() {
        d dVar = this.f1377z;
        if (dVar != null) {
            d dVar2 = new d();
            dVar2.s = dVar.s;
            dVar2.f1398t = dVar.f1398t;
            dVar2.f1399u = dVar.f1399u;
            return dVar2;
        }
        d dVar3 = new d();
        if (v() <= 0) {
            dVar3.s = -1;
            return dVar3;
        }
        I0();
        boolean z6 = this.s ^ this.f1372u;
        dVar3.f1399u = z6;
        if (z6) {
            View viewT0 = T0();
            dVar3.f1398t = this.f1370r.g() - this.f1370r.b(viewT0);
            dVar3.s = RecyclerView.m.H(viewT0);
            return dVar3;
        }
        View viewU0 = U0();
        dVar3.s = RecyclerView.m.H(viewU0);
        dVar3.f1398t = this.f1370r.e(viewU0) - this.f1370r.k();
        return dVar3;
    }

    public final void g1(int i6, int i7) {
        this.f1369q.f1389c = i7 - this.f1370r.k();
        c cVar = this.f1369q;
        cVar.f1390d = i6;
        cVar.f1391e = this.f1372u ? 1 : -1;
        cVar.f1392f = -1;
        cVar.f1388b = i7;
        cVar.f1393g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public final void h(int i6, int i7, RecyclerView.x xVar, m.b bVar) {
        if (this.f1368p != 0) {
            i6 = i7;
        }
        if (v() == 0 || i6 == 0) {
            return;
        }
        I0();
        e1(i6 > 0 ? 1 : -1, Math.abs(i6), true, xVar);
        D0(xVar, this.f1369q, bVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public final void i(int i6, m.b bVar) {
        boolean z6;
        int i7;
        d dVar = this.f1377z;
        if (dVar == null || (i7 = dVar.s) < 0) {
            a1();
            z6 = this.f1372u;
            i7 = this.f1375x;
            if (i7 == -1) {
                i7 = z6 ? i6 - 1 : 0;
            }
        } else {
            z6 = dVar.f1399u;
        }
        int i8 = z6 ? -1 : 1;
        for (int i9 = 0; i9 < this.C && i7 >= 0 && i7 < i6; i9++) {
            bVar.a(i7, 0);
            i7 += i8;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public final int j(RecyclerView.x xVar) {
        return E0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public int k(RecyclerView.x xVar) {
        return F0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public int l(RecyclerView.x xVar) {
        return G0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public final int m(RecyclerView.x xVar) {
        return E0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public int n(RecyclerView.x xVar) {
        return F0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public int o(RecyclerView.x xVar) {
        return G0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public int o0(int i6, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (this.f1368p == 1) {
            return 0;
        }
        return b1(i6, sVar, xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void p0(int i6) {
        this.f1375x = i6;
        this.f1376y = Integer.MIN_VALUE;
        d dVar = this.f1377z;
        if (dVar != null) {
            dVar.s = -1;
        }
        n0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public final View q(int i6) {
        int iV = v();
        if (iV == 0) {
            return null;
        }
        int iH = i6 - RecyclerView.m.H(u(0));
        if (iH >= 0 && iH < iV) {
            View viewU = u(iH);
            if (RecyclerView.m.H(viewU) == i6) {
                return viewU;
            }
        }
        return super.q(i6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public int q0(int i6, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (this.f1368p == 0) {
            return 0;
        }
        return b1(i6, sVar, xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public RecyclerView.n r() {
        return new RecyclerView.n(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean x0() {
        if (this.f1483m != 1073741824 && this.f1482l != 1073741824) {
            int iV = v();
            for (int i6 = 0; i6 < iV; i6++) {
                ViewGroup.LayoutParams layoutParams = u(i6).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public void z0(RecyclerView recyclerView, int i6) {
        o oVar = new o(recyclerView.getContext());
        oVar.f1512a = i6;
        A0(oVar);
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i6, int i7) {
        this.f1368p = 1;
        this.f1371t = false;
        this.f1372u = false;
        this.f1373v = false;
        this.f1374w = true;
        this.f1375x = -1;
        this.f1376y = Integer.MIN_VALUE;
        this.f1377z = null;
        this.A = new a();
        this.B = new b();
        this.C = 2;
        this.D = new int[2];
        RecyclerView.m.c cVarI = RecyclerView.m.I(context, attributeSet, i6, i7);
        c1(cVarI.f1488a);
        boolean z6 = cVarI.f1490c;
        c(null);
        if (z6 != this.f1371t) {
            this.f1371t = z6;
            n0();
        }
        d1(cVarI.f1491d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public final void S(RecyclerView recyclerView) {
    }

    public void X0(RecyclerView.s sVar, RecyclerView.x xVar, a aVar, int i6) {
    }
}
