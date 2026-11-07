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
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;
import org.jf.dexlib2.dexbacked.raw.ItemType;

/* loaded from: classes.dex */
public class LinearLayoutManager extends v.l implements v.AbstractC0038v.b {
    public final a A;
    public final b B;
    public final int C;
    public final int[] D;

    /* renamed from: p, reason: collision with root package name */
    public int f2426p;

    /* renamed from: q, reason: collision with root package name */
    public c f2427q;

    /* renamed from: r, reason: collision with root package name */
    public s f2428r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2429s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f2430t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2431u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2432v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f2433w;

    /* renamed from: x, reason: collision with root package name */
    public int f2434x;

    /* renamed from: y, reason: collision with root package name */
    public int f2435y;

    /* renamed from: z, reason: collision with root package name */
    public d f2436z;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public s f2437a;

        /* renamed from: b, reason: collision with root package name */
        public int f2438b;

        /* renamed from: c, reason: collision with root package name */
        public int f2439c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f2440d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f2441e;

        public a() {
            d();
        }

        public final void a() {
            this.f2439c = this.f2440d ? this.f2437a.g() : this.f2437a.k();
        }

        public final void b(View view, int i10) {
            if (this.f2440d) {
                int iB = this.f2437a.b(view);
                s sVar = this.f2437a;
                this.f2439c = (Integer.MIN_VALUE == sVar.f2652b ? 0 : sVar.l() - sVar.f2652b) + iB;
            } else {
                this.f2439c = this.f2437a.e(view);
            }
            this.f2438b = i10;
        }

        public final void c(View view, int i10) {
            s sVar = this.f2437a;
            int iL = Integer.MIN_VALUE == sVar.f2652b ? 0 : sVar.l() - sVar.f2652b;
            if (iL >= 0) {
                b(view, i10);
                return;
            }
            this.f2438b = i10;
            if (!this.f2440d) {
                int iE = this.f2437a.e(view);
                int iK = iE - this.f2437a.k();
                this.f2439c = iE;
                if (iK > 0) {
                    int iG = (this.f2437a.g() - Math.min(0, (this.f2437a.g() - iL) - this.f2437a.b(view))) - (this.f2437a.c(view) + iE);
                    if (iG < 0) {
                        this.f2439c -= Math.min(iK, -iG);
                        return;
                    }
                    return;
                }
                return;
            }
            int iG2 = (this.f2437a.g() - iL) - this.f2437a.b(view);
            this.f2439c = this.f2437a.g() - iG2;
            if (iG2 > 0) {
                int iC = this.f2439c - this.f2437a.c(view);
                int iK2 = this.f2437a.k();
                int iMin = iC - (Math.min(this.f2437a.e(view) - iK2, 0) + iK2);
                if (iMin < 0) {
                    this.f2439c = Math.min(iG2, -iMin) + this.f2439c;
                }
            }
        }

        public final void d() {
            this.f2438b = -1;
            this.f2439c = PKIFailureInfo.systemUnavail;
            this.f2440d = false;
            this.f2441e = false;
        }

        public final String toString() {
            return "AnchorInfo{mPosition=" + this.f2438b + ", mCoordinate=" + this.f2439c + ", mLayoutFromEnd=" + this.f2440d + ", mValid=" + this.f2441e + '}';
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f2442a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f2443b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f2444c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f2445d;
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f2446a;

        /* renamed from: b, reason: collision with root package name */
        public int f2447b;

        /* renamed from: c, reason: collision with root package name */
        public int f2448c;

        /* renamed from: d, reason: collision with root package name */
        public int f2449d;

        /* renamed from: e, reason: collision with root package name */
        public int f2450e;

        /* renamed from: f, reason: collision with root package name */
        public int f2451f;

        /* renamed from: g, reason: collision with root package name */
        public int f2452g;

        /* renamed from: h, reason: collision with root package name */
        public int f2453h;

        /* renamed from: i, reason: collision with root package name */
        public int f2454i;

        /* renamed from: j, reason: collision with root package name */
        public int f2455j;

        /* renamed from: k, reason: collision with root package name */
        public List<v.a0> f2456k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f2457l;

        public final void a(View view) {
            int iB;
            int size = this.f2456k.size();
            View view2 = null;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = this.f2456k.get(i11).f2708a;
                v.m mVar = (v.m) view3.getLayoutParams();
                if (view3 != view && !mVar.f2761a.g() && (iB = (mVar.f2761a.b() - this.f2449d) * this.f2450e) >= 0 && iB < i10) {
                    view2 = view3;
                    if (iB == 0) {
                        break;
                    } else {
                        i10 = iB;
                    }
                }
            }
            if (view2 == null) {
                this.f2449d = -1;
            } else {
                this.f2449d = ((v.m) view2.getLayoutParams()).f2761a.b();
            }
        }

        public final View b(v.r rVar) {
            List<v.a0> list = this.f2456k;
            if (list == null) {
                View viewD = rVar.d(this.f2449d);
                this.f2449d += this.f2450e;
                return viewD;
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = this.f2456k.get(i10).f2708a;
                v.m mVar = (v.m) view.getLayoutParams();
                if (!mVar.f2761a.g() && this.f2449d == mVar.f2761a.b()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
    }

    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f2458a;

        /* renamed from: b, reason: collision with root package name */
        public int f2459b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f2460c;

        public class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                d dVar = new d();
                dVar.f2458a = parcel.readInt();
                dVar.f2459b = parcel.readInt();
                dVar.f2460c = parcel.readInt() == 1;
                return dVar;
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i10) {
                return new d[i10];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f2458a);
            parcel.writeInt(this.f2459b);
            parcel.writeInt(this.f2460c ? 1 : 0);
        }
    }

    public LinearLayoutManager(int i10) {
        this.f2426p = 1;
        this.f2430t = false;
        this.f2431u = false;
        this.f2432v = false;
        this.f2433w = true;
        this.f2434x = -1;
        this.f2435y = PKIFailureInfo.systemUnavail;
        this.f2436z = null;
        this.A = new a();
        this.B = new b();
        this.C = 2;
        this.D = new int[2];
        Y0(i10);
        c(null);
        if (this.f2430t) {
            this.f2430t = false;
            n0();
        }
    }

    @Override // androidx.recyclerview.widget.v.l
    public boolean A0() {
        return this.f2436z == null && this.f2429s == this.f2432v;
    }

    public void B0(v.w wVar, c cVar, m.b bVar) {
        int i10 = cVar.f2449d;
        if (i10 < 0 || i10 >= wVar.b()) {
            return;
        }
        bVar.a(i10, Math.max(0, cVar.f2452g));
    }

    public final int C0(v.w wVar) {
        if (v() == 0) {
            return 0;
        }
        G0();
        s sVar = this.f2428r;
        boolean z10 = !this.f2433w;
        return z.a(wVar, sVar, J0(z10), I0(z10), this, this.f2433w);
    }

    public final int D0(v.w wVar) {
        if (v() == 0) {
            return 0;
        }
        G0();
        s sVar = this.f2428r;
        boolean z10 = !this.f2433w;
        return z.b(wVar, sVar, J0(z10), I0(z10), this, this.f2433w, this.f2431u);
    }

    public final int E0(v.w wVar) {
        if (v() == 0) {
            return 0;
        }
        G0();
        s sVar = this.f2428r;
        boolean z10 = !this.f2433w;
        return z.c(wVar, sVar, J0(z10), I0(z10), this, this.f2433w);
    }

    public final int F0(int i10) {
        if (i10 == 1) {
            return (this.f2426p != 1 && R0()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.f2426p != 1 && R0()) ? -1 : 1;
        }
        if (i10 == 17) {
            if (this.f2426p == 0) {
                return -1;
            }
            return PKIFailureInfo.systemUnavail;
        }
        if (i10 == 33) {
            if (this.f2426p == 1) {
                return -1;
            }
            return PKIFailureInfo.systemUnavail;
        }
        if (i10 == 66) {
            if (this.f2426p == 0) {
                return 1;
            }
            return PKIFailureInfo.systemUnavail;
        }
        if (i10 == 130 && this.f2426p == 1) {
            return 1;
        }
        return PKIFailureInfo.systemUnavail;
    }

    public final void G0() {
        if (this.f2427q == null) {
            c cVar = new c();
            cVar.f2446a = true;
            cVar.f2453h = 0;
            cVar.f2454i = 0;
            cVar.f2456k = null;
            this.f2427q = cVar;
        }
    }

    public final int H0(v.r rVar, c cVar, v.w wVar, boolean z10) {
        int i10;
        int i11 = cVar.f2448c;
        int i12 = cVar.f2452g;
        if (i12 != Integer.MIN_VALUE) {
            if (i11 < 0) {
                cVar.f2452g = i12 + i11;
            }
            U0(rVar, cVar);
        }
        int i13 = cVar.f2448c + cVar.f2453h;
        while (true) {
            if ((!cVar.f2457l && i13 <= 0) || (i10 = cVar.f2449d) < 0 || i10 >= wVar.b()) {
                break;
            }
            b bVar = this.B;
            bVar.f2442a = 0;
            bVar.f2443b = false;
            bVar.f2444c = false;
            bVar.f2445d = false;
            S0(rVar, wVar, cVar, bVar);
            if (!bVar.f2443b) {
                int i14 = cVar.f2447b;
                int i15 = bVar.f2442a;
                cVar.f2447b = (cVar.f2451f * i15) + i14;
                if (!bVar.f2444c || cVar.f2456k != null || !wVar.f2803g) {
                    cVar.f2448c -= i15;
                    i13 -= i15;
                }
                int i16 = cVar.f2452g;
                if (i16 != Integer.MIN_VALUE) {
                    int i17 = i16 + i15;
                    cVar.f2452g = i17;
                    int i18 = cVar.f2448c;
                    if (i18 < 0) {
                        cVar.f2452g = i17 + i18;
                    }
                    U0(rVar, cVar);
                }
                if (z10 && bVar.f2445d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i11 - cVar.f2448c;
    }

    public final View I0(boolean z10) {
        return this.f2431u ? L0(0, v(), z10) : L0(v() - 1, -1, z10);
    }

    public final View J0(boolean z10) {
        return this.f2431u ? L0(v() - 1, -1, z10) : L0(0, v(), z10);
    }

    public final View K0(int i10, int i11) {
        int i12;
        int i13;
        G0();
        if (i11 <= i10 && i11 >= i10) {
            return u(i10);
        }
        if (this.f2428r.e(u(i10)) < this.f2428r.k()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = ItemType.TYPE_LIST;
        }
        return this.f2426p == 0 ? this.f2742c.a(i10, i11, i12, i13) : this.f2743d.a(i10, i11, i12, i13);
    }

    @Override // androidx.recyclerview.widget.v.l
    public final boolean L() {
        return true;
    }

    public final View L0(int i10, int i11, boolean z10) {
        G0();
        int i12 = z10 ? 24579 : 320;
        return this.f2426p == 0 ? this.f2742c.a(i10, i11, i12, DilithiumEngine.DilithiumPolyT1PackedBytes) : this.f2743d.a(i10, i11, i12, DilithiumEngine.DilithiumPolyT1PackedBytes);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View M0(v.r rVar, v.w wVar, boolean z10, boolean z11) {
        int i10;
        int iV;
        int i11;
        G0();
        int iV2 = v();
        if (z11) {
            iV = v() - 1;
            i10 = -1;
            i11 = -1;
        } else {
            i10 = iV2;
            iV = 0;
            i11 = 1;
        }
        int iB = wVar.b();
        int iK = this.f2428r.k();
        int iG = this.f2428r.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iV != i10) {
            View viewU = u(iV);
            int iH = v.l.H(viewU);
            int iE = this.f2428r.e(viewU);
            int iB2 = this.f2428r.b(viewU);
            if (iH >= 0 && iH < iB) {
                if (!((v.m) viewU.getLayoutParams()).f2761a.g()) {
                    boolean z12 = iB2 <= iK && iE < iK;
                    boolean z13 = iE >= iG && iB2 > iG;
                    if (!z12 && !z13) {
                        return viewU;
                    }
                    if (z10) {
                        if (z13) {
                            view2 = viewU;
                        } else if (view == null) {
                            view = viewU;
                        }
                    } else if (!z12) {
                        if (view == null) {
                        }
                    }
                } else if (view3 == null) {
                    view3 = viewU;
                }
            }
            iV += i11;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    public final int N0(int i10, v.r rVar, v.w wVar, boolean z10) {
        int iG;
        int iG2 = this.f2428r.g() - i10;
        if (iG2 <= 0) {
            return 0;
        }
        int i11 = -X0(-iG2, rVar, wVar);
        int i12 = i10 + i11;
        if (!z10 || (iG = this.f2428r.g() - i12) <= 0) {
            return i11;
        }
        this.f2428r.o(iG);
        return iG + i11;
    }

    public final int O0(int i10, v.r rVar, v.w wVar, boolean z10) {
        int iK;
        int iK2 = i10 - this.f2428r.k();
        if (iK2 <= 0) {
            return 0;
        }
        int i11 = -X0(iK2, rVar, wVar);
        int i12 = i10 + i11;
        if (!z10 || (iK = i12 - this.f2428r.k()) <= 0) {
            return i11;
        }
        this.f2428r.o(-iK);
        return i11 - iK;
    }

    public final View P0() {
        return u(this.f2431u ? 0 : v() - 1);
    }

    public final View Q0() {
        return u(this.f2431u ? v() - 1 : 0);
    }

    public final boolean R0() {
        return C() == 1;
    }

    @Override // androidx.recyclerview.widget.v.l
    public final void S(v vVar) {
    }

    public void S0(v.r rVar, v.w wVar, c cVar, b bVar) {
        int iE;
        int i10;
        int i11;
        int iD;
        View viewB = cVar.b(rVar);
        if (viewB == null) {
            bVar.f2443b = true;
            return;
        }
        v.m mVar = (v.m) viewB.getLayoutParams();
        if (cVar.f2456k == null) {
            if (this.f2431u == (cVar.f2451f == -1)) {
                b(viewB, -1, false);
            } else {
                b(viewB, 0, false);
            }
        } else {
            if (this.f2431u == (cVar.f2451f == -1)) {
                b(viewB, -1, true);
            } else {
                b(viewB, 0, true);
            }
        }
        v.m mVar2 = (v.m) viewB.getLayoutParams();
        Rect rectK = this.f2741b.K(viewB);
        int i12 = rectK.left + rectK.right;
        int i13 = rectK.top + rectK.bottom;
        int iW = v.l.w(d(), this.f2753n, this.f2751l, F() + E() + ((ViewGroup.MarginLayoutParams) mVar2).leftMargin + ((ViewGroup.MarginLayoutParams) mVar2).rightMargin + i12, ((ViewGroup.MarginLayoutParams) mVar2).width);
        int iW2 = v.l.w(e(), this.f2754o, this.f2752m, D() + G() + ((ViewGroup.MarginLayoutParams) mVar2).topMargin + ((ViewGroup.MarginLayoutParams) mVar2).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) mVar2).height);
        if (w0(viewB, iW, iW2, mVar2)) {
            viewB.measure(iW, iW2);
        }
        bVar.f2442a = this.f2428r.c(viewB);
        if (this.f2426p == 1) {
            if (R0()) {
                iD = this.f2753n - F();
                iE = iD - this.f2428r.d(viewB);
            } else {
                iE = E();
                iD = this.f2428r.d(viewB) + iE;
            }
            if (cVar.f2451f == -1) {
                i10 = cVar.f2447b;
                i11 = i10 - bVar.f2442a;
            } else {
                i11 = cVar.f2447b;
                i10 = bVar.f2442a + i11;
            }
        } else {
            int iG = G();
            int iD2 = this.f2428r.d(viewB) + iG;
            if (cVar.f2451f == -1) {
                int i14 = cVar.f2447b;
                int i15 = i14 - bVar.f2442a;
                iD = i14;
                i10 = iD2;
                iE = i15;
                i11 = iG;
            } else {
                int i16 = cVar.f2447b;
                int i17 = bVar.f2442a + i16;
                iE = i16;
                i10 = iD2;
                i11 = iG;
                iD = i17;
            }
        }
        v.l.N(viewB, iE, i11, iD, i10);
        if (mVar.f2761a.g() || mVar.f2761a.j()) {
            bVar.f2444c = true;
        }
        bVar.f2445d = viewB.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.v.l
    public View T(View view, int i10, v.r rVar, v.w wVar) {
        int iF0;
        W0();
        if (v() != 0 && (iF0 = F0(i10)) != Integer.MIN_VALUE) {
            G0();
            a1(iF0, (int) (this.f2428r.l() * 0.33333334f), false, wVar);
            c cVar = this.f2427q;
            cVar.f2452g = PKIFailureInfo.systemUnavail;
            cVar.f2446a = false;
            H0(rVar, cVar, wVar, true);
            View viewK0 = iF0 == -1 ? this.f2431u ? K0(v() - 1, -1) : K0(0, v()) : this.f2431u ? K0(0, v()) : K0(v() - 1, -1);
            View viewQ0 = iF0 == -1 ? Q0() : P0();
            if (!viewQ0.hasFocusable()) {
                return viewK0;
            }
            if (viewK0 != null) {
                return viewQ0;
            }
        }
        return null;
    }

    public void T0(v.r rVar, v.w wVar, a aVar, int i10) {
    }

    @Override // androidx.recyclerview.widget.v.l
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View viewL0 = L0(0, v(), false);
            accessibilityEvent.setFromIndex(viewL0 == null ? -1 : v.l.H(viewL0));
            View viewL02 = L0(v() - 1, -1, false);
            accessibilityEvent.setToIndex(viewL02 != null ? v.l.H(viewL02) : -1);
        }
    }

    public final void U0(v.r rVar, c cVar) {
        if (!cVar.f2446a || cVar.f2457l) {
            return;
        }
        int i10 = cVar.f2452g;
        int i11 = cVar.f2454i;
        if (cVar.f2451f == -1) {
            int iV = v();
            if (i10 < 0) {
                return;
            }
            int iF = (this.f2428r.f() - i10) + i11;
            if (this.f2431u) {
                for (int i12 = 0; i12 < iV; i12++) {
                    View viewU = u(i12);
                    if (this.f2428r.e(viewU) < iF || this.f2428r.n(viewU) < iF) {
                        V0(rVar, 0, i12);
                        return;
                    }
                }
                return;
            }
            int i13 = iV - 1;
            for (int i14 = i13; i14 >= 0; i14--) {
                View viewU2 = u(i14);
                if (this.f2428r.e(viewU2) < iF || this.f2428r.n(viewU2) < iF) {
                    V0(rVar, i13, i14);
                    return;
                }
            }
            return;
        }
        if (i10 < 0) {
            return;
        }
        int i15 = i10 - i11;
        int iV2 = v();
        if (!this.f2431u) {
            for (int i16 = 0; i16 < iV2; i16++) {
                View viewU3 = u(i16);
                if (this.f2428r.b(viewU3) > i15 || this.f2428r.m(viewU3) > i15) {
                    V0(rVar, 0, i16);
                    return;
                }
            }
            return;
        }
        int i17 = iV2 - 1;
        for (int i18 = i17; i18 >= 0; i18--) {
            View viewU4 = u(i18);
            if (this.f2428r.b(viewU4) > i15 || this.f2428r.m(viewU4) > i15) {
                V0(rVar, i17, i18);
                return;
            }
        }
    }

    public final void V0(v.r rVar, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                View viewU = u(i10);
                l0(i10);
                rVar.i(viewU);
                i10--;
            }
            return;
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            View viewU2 = u(i12);
            l0(i12);
            rVar.i(viewU2);
        }
    }

    public final void W0() {
        if (this.f2426p == 1 || !R0()) {
            this.f2431u = this.f2430t;
        } else {
            this.f2431u = !this.f2430t;
        }
    }

    public final int X0(int i10, v.r rVar, v.w wVar) {
        if (v() != 0 && i10 != 0) {
            G0();
            this.f2427q.f2446a = true;
            int i11 = i10 > 0 ? 1 : -1;
            int iAbs = Math.abs(i10);
            a1(i11, iAbs, true, wVar);
            c cVar = this.f2427q;
            int iH0 = H0(rVar, cVar, wVar, false) + cVar.f2452g;
            if (iH0 >= 0) {
                if (iAbs > iH0) {
                    i10 = i11 * iH0;
                }
                this.f2428r.o(-i10);
                this.f2427q.f2455j = i10;
                return i10;
            }
        }
        return 0;
    }

    public final void Y0(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(j2.y.a(i10, "invalid orientation:"));
        }
        c(null);
        if (i10 != this.f2426p || this.f2428r == null) {
            s sVarA = s.a(this, i10);
            this.f2428r = sVarA;
            this.A.f2437a = sVarA;
            this.f2426p = i10;
            n0();
        }
    }

    public void Z0(boolean z10) {
        c(null);
        if (this.f2432v == z10) {
            return;
        }
        this.f2432v = z10;
        n0();
    }

    @Override // androidx.recyclerview.widget.v.AbstractC0038v.b
    public final PointF a(int i10) {
        if (v() == 0) {
            return null;
        }
        int i11 = (i10 < v.l.H(u(0))) != this.f2431u ? -1 : 1;
        return this.f2426p == 0 ? new PointF(i11, CropImageView.DEFAULT_ASPECT_RATIO) : new PointF(CropImageView.DEFAULT_ASPECT_RATIO, i11);
    }

    public final void a1(int i10, int i11, boolean z10, v.w wVar) {
        int i12;
        int iK;
        this.f2427q.f2457l = this.f2428r.i() == 0 && this.f2428r.f() == 0;
        this.f2427q.f2451f = i10;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        int iL = wVar.f2797a != -1 ? this.f2428r.l() : 0;
        if (this.f2427q.f2451f == -1) {
            i12 = 0;
        } else {
            i12 = iL;
            iL = 0;
        }
        iArr[0] = iL;
        iArr[1] = i12;
        int iMax = Math.max(0, iL);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z11 = i10 == 1;
        c cVar = this.f2427q;
        int i13 = z11 ? iMax2 : iMax;
        cVar.f2453h = i13;
        if (!z11) {
            iMax = iMax2;
        }
        cVar.f2454i = iMax;
        if (z11) {
            cVar.f2453h = this.f2428r.h() + i13;
            View viewP0 = P0();
            c cVar2 = this.f2427q;
            cVar2.f2450e = this.f2431u ? -1 : 1;
            int iH = v.l.H(viewP0);
            c cVar3 = this.f2427q;
            cVar2.f2449d = iH + cVar3.f2450e;
            cVar3.f2447b = this.f2428r.b(viewP0);
            iK = this.f2428r.b(viewP0) - this.f2428r.g();
        } else {
            View viewQ0 = Q0();
            c cVar4 = this.f2427q;
            cVar4.f2453h = this.f2428r.k() + cVar4.f2453h;
            c cVar5 = this.f2427q;
            cVar5.f2450e = this.f2431u ? 1 : -1;
            int iH2 = v.l.H(viewQ0);
            c cVar6 = this.f2427q;
            cVar5.f2449d = iH2 + cVar6.f2450e;
            cVar6.f2447b = this.f2428r.e(viewQ0);
            iK = (-this.f2428r.e(viewQ0)) + this.f2428r.k();
        }
        c cVar7 = this.f2427q;
        cVar7.f2448c = i11;
        if (z10) {
            cVar7.f2448c = i11 - iK;
        }
        cVar7.f2452g = iK;
    }

    public final void b1(int i10, int i11) {
        this.f2427q.f2448c = this.f2428r.g() - i11;
        c cVar = this.f2427q;
        cVar.f2450e = this.f2431u ? -1 : 1;
        cVar.f2449d = i10;
        cVar.f2451f = 1;
        cVar.f2447b = i11;
        cVar.f2452g = PKIFailureInfo.systemUnavail;
    }

    @Override // androidx.recyclerview.widget.v.l
    public final void c(String str) {
        if (this.f2436z == null) {
            super.c(str);
        }
    }

    public final void c1(int i10, int i11) {
        this.f2427q.f2448c = i11 - this.f2428r.k();
        c cVar = this.f2427q;
        cVar.f2449d = i10;
        cVar.f2450e = this.f2431u ? 1 : -1;
        cVar.f2451f = -1;
        cVar.f2447b = i11;
        cVar.f2452g = PKIFailureInfo.systemUnavail;
    }

    @Override // androidx.recyclerview.widget.v.l
    public final boolean d() {
        return this.f2426p == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0192  */
    @Override // androidx.recyclerview.widget.v.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d0(v.r rVar, v.w wVar) {
        View focusedChild;
        View focusedChild2;
        View viewM0;
        int i10;
        int iE;
        int i11;
        int i12;
        int i13;
        List<v.a0> list;
        int i14;
        int i15;
        int iN0;
        int i16;
        View viewQ;
        int iE2;
        int iG;
        int i17;
        int i18 = -1;
        if (!(this.f2436z == null && this.f2434x == -1) && wVar.b() == 0) {
            i0(rVar);
            return;
        }
        d dVar = this.f2436z;
        if (dVar != null && (i17 = dVar.f2458a) >= 0) {
            this.f2434x = i17;
        }
        G0();
        this.f2427q.f2446a = false;
        W0();
        v vVar = this.f2741b;
        if (vVar == null || (focusedChild = vVar.getFocusedChild()) == null || this.f2740a.f2514c.contains(focusedChild)) {
            focusedChild = null;
        }
        a aVar = this.A;
        if (!aVar.f2441e || this.f2434x != -1 || this.f2436z != null) {
            aVar.d();
            aVar.f2440d = this.f2431u ^ this.f2432v;
            if (wVar.f2803g || (i10 = this.f2434x) == -1) {
                if (v() != 0) {
                    v vVar2 = this.f2741b;
                    if (vVar2 == null || (focusedChild2 = vVar2.getFocusedChild()) == null || this.f2740a.f2514c.contains(focusedChild2)) {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        v.m mVar = (v.m) focusedChild2.getLayoutParams();
                        if (mVar.f2761a.g() || mVar.f2761a.b() < 0 || mVar.f2761a.b() >= wVar.b()) {
                            boolean z10 = this.f2429s;
                            boolean z11 = this.f2432v;
                            if (z10 == z11 && (viewM0 = M0(rVar, wVar, aVar.f2440d, z11)) != null) {
                                aVar.b(viewM0, v.l.H(viewM0));
                                if (!wVar.f2803g && A0()) {
                                    int iE3 = this.f2428r.e(viewM0);
                                    int iB = this.f2428r.b(viewM0);
                                    int iK = this.f2428r.k();
                                    int iG2 = this.f2428r.g();
                                    boolean z12 = iB <= iK && iE3 < iK;
                                    boolean z13 = iE3 >= iG2 && iB > iG2;
                                    if (z12 || z13) {
                                        if (aVar.f2440d) {
                                            iK = iG2;
                                        }
                                        aVar.f2439c = iK;
                                    }
                                }
                            } else {
                                aVar.a();
                                aVar.f2438b = this.f2432v ? wVar.b() - 1 : 0;
                            }
                        } else {
                            aVar.c(focusedChild2, v.l.H(focusedChild2));
                        }
                        aVar.f2441e = true;
                    }
                }
            } else if (i10 < 0 || i10 >= wVar.b()) {
                this.f2434x = -1;
                this.f2435y = PKIFailureInfo.systemUnavail;
                if (v() != 0) {
                }
            } else {
                int i19 = this.f2434x;
                aVar.f2438b = i19;
                d dVar2 = this.f2436z;
                if (dVar2 != null && dVar2.f2458a >= 0) {
                    boolean z14 = dVar2.f2460c;
                    aVar.f2440d = z14;
                    if (z14) {
                        aVar.f2439c = this.f2428r.g() - this.f2436z.f2459b;
                    } else {
                        aVar.f2439c = this.f2428r.k() + this.f2436z.f2459b;
                    }
                } else if (this.f2435y == Integer.MIN_VALUE) {
                    View viewQ2 = q(i19);
                    if (viewQ2 == null) {
                        if (v() > 0) {
                            aVar.f2440d = (this.f2434x < v.l.H(u(0))) == this.f2431u;
                        }
                        aVar.a();
                    } else if (this.f2428r.c(viewQ2) > this.f2428r.l()) {
                        aVar.a();
                    } else if (this.f2428r.e(viewQ2) - this.f2428r.k() < 0) {
                        aVar.f2439c = this.f2428r.k();
                        aVar.f2440d = false;
                    } else if (this.f2428r.g() - this.f2428r.b(viewQ2) < 0) {
                        aVar.f2439c = this.f2428r.g();
                        aVar.f2440d = true;
                    } else {
                        if (aVar.f2440d) {
                            int iB2 = this.f2428r.b(viewQ2);
                            s sVar = this.f2428r;
                            iE = (Integer.MIN_VALUE == sVar.f2652b ? 0 : sVar.l() - sVar.f2652b) + iB2;
                        } else {
                            iE = this.f2428r.e(viewQ2);
                        }
                        aVar.f2439c = iE;
                    }
                } else {
                    boolean z15 = this.f2431u;
                    aVar.f2440d = z15;
                    if (z15) {
                        aVar.f2439c = this.f2428r.g() - this.f2435y;
                    } else {
                        aVar.f2439c = this.f2428r.k() + this.f2435y;
                    }
                }
                aVar.f2441e = true;
            }
        } else if (focusedChild != null && (this.f2428r.e(focusedChild) >= this.f2428r.g() || this.f2428r.b(focusedChild) <= this.f2428r.k())) {
            aVar.c(focusedChild, v.l.H(focusedChild));
        }
        c cVar = this.f2427q;
        cVar.f2451f = cVar.f2455j >= 0 ? 1 : -1;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        int iL = wVar.f2797a != -1 ? this.f2428r.l() : 0;
        if (this.f2427q.f2451f == -1) {
            i11 = 0;
        } else {
            i11 = iL;
            iL = 0;
        }
        iArr[0] = iL;
        iArr[1] = i11;
        int iK2 = this.f2428r.k() + Math.max(0, iL);
        int iH = this.f2428r.h() + Math.max(0, iArr[1]);
        if (wVar.f2803g && (i16 = this.f2434x) != -1 && this.f2435y != Integer.MIN_VALUE && (viewQ = q(i16)) != null) {
            if (this.f2431u) {
                iG = this.f2428r.g() - this.f2428r.b(viewQ);
                iE2 = this.f2435y;
            } else {
                iE2 = this.f2428r.e(viewQ) - this.f2428r.k();
                iG = this.f2435y;
            }
            int i20 = iG - iE2;
            if (i20 > 0) {
                iK2 += i20;
            } else {
                iH -= i20;
            }
        }
        if (!aVar.f2440d ? !this.f2431u : this.f2431u) {
            i18 = 1;
        }
        T0(rVar, wVar, aVar, i18);
        p(rVar);
        this.f2427q.f2457l = this.f2428r.i() == 0 && this.f2428r.f() == 0;
        this.f2427q.getClass();
        this.f2427q.f2454i = 0;
        if (aVar.f2440d) {
            c1(aVar.f2438b, aVar.f2439c);
            c cVar2 = this.f2427q;
            cVar2.f2453h = iK2;
            H0(rVar, cVar2, wVar, false);
            c cVar3 = this.f2427q;
            i13 = cVar3.f2447b;
            int i21 = cVar3.f2449d;
            int i22 = cVar3.f2448c;
            if (i22 > 0) {
                iH += i22;
            }
            b1(aVar.f2438b, aVar.f2439c);
            c cVar4 = this.f2427q;
            cVar4.f2453h = iH;
            cVar4.f2449d += cVar4.f2450e;
            H0(rVar, cVar4, wVar, false);
            c cVar5 = this.f2427q;
            i12 = cVar5.f2447b;
            int i23 = cVar5.f2448c;
            if (i23 > 0) {
                c1(i21, i13);
                c cVar6 = this.f2427q;
                cVar6.f2453h = i23;
                H0(rVar, cVar6, wVar, false);
                i13 = this.f2427q.f2447b;
            }
        } else {
            b1(aVar.f2438b, aVar.f2439c);
            c cVar7 = this.f2427q;
            cVar7.f2453h = iH;
            H0(rVar, cVar7, wVar, false);
            c cVar8 = this.f2427q;
            i12 = cVar8.f2447b;
            int i24 = cVar8.f2449d;
            int i25 = cVar8.f2448c;
            if (i25 > 0) {
                iK2 += i25;
            }
            c1(aVar.f2438b, aVar.f2439c);
            c cVar9 = this.f2427q;
            cVar9.f2453h = iK2;
            cVar9.f2449d += cVar9.f2450e;
            H0(rVar, cVar9, wVar, false);
            c cVar10 = this.f2427q;
            int i26 = cVar10.f2447b;
            int i27 = cVar10.f2448c;
            if (i27 > 0) {
                b1(i24, i12);
                c cVar11 = this.f2427q;
                cVar11.f2453h = i27;
                H0(rVar, cVar11, wVar, false);
                i12 = this.f2427q.f2447b;
            }
            i13 = i26;
        }
        if (v() > 0) {
            if (this.f2431u ^ this.f2432v) {
                int iN02 = N0(i12, rVar, wVar, true);
                i14 = i13 + iN02;
                i15 = i12 + iN02;
                iN0 = O0(i14, rVar, wVar, false);
            } else {
                int iO0 = O0(i13, rVar, wVar, true);
                i14 = i13 + iO0;
                i15 = i12 + iO0;
                iN0 = N0(i15, rVar, wVar, false);
            }
            i13 = i14 + iN0;
            i12 = i15 + iN0;
        }
        if (wVar.f2807k && v() != 0 && !wVar.f2803g && A0()) {
            List<v.a0> list2 = rVar.f2775d;
            int size = list2.size();
            int iH2 = v.l.H(u(0));
            int iC = 0;
            int iC2 = 0;
            for (int i28 = 0; i28 < size; i28++) {
                v.a0 a0Var = list2.get(i28);
                boolean zG = a0Var.g();
                View view = a0Var.f2708a;
                if (!zG) {
                    if ((a0Var.b() < iH2) != this.f2431u) {
                        iC += this.f2428r.c(view);
                    } else {
                        iC2 += this.f2428r.c(view);
                    }
                }
            }
            this.f2427q.f2456k = list2;
            if (iC > 0) {
                c1(v.l.H(Q0()), i13);
                c cVar12 = this.f2427q;
                cVar12.f2453h = iC;
                cVar12.f2448c = 0;
                cVar12.a(null);
                H0(rVar, this.f2427q, wVar, false);
            }
            if (iC2 > 0) {
                b1(v.l.H(P0()), i12);
                c cVar13 = this.f2427q;
                cVar13.f2453h = iC2;
                cVar13.f2448c = 0;
                list = null;
                cVar13.a(null);
                H0(rVar, this.f2427q, wVar, false);
            } else {
                list = null;
            }
            this.f2427q.f2456k = list;
        }
        if (wVar.f2803g) {
            aVar.d();
        } else {
            s sVar2 = this.f2428r;
            sVar2.f2652b = sVar2.l();
        }
        this.f2429s = this.f2432v;
    }

    @Override // androidx.recyclerview.widget.v.l
    public final boolean e() {
        return this.f2426p == 1;
    }

    @Override // androidx.recyclerview.widget.v.l
    public void e0(v.w wVar) {
        this.f2436z = null;
        this.f2434x = -1;
        this.f2435y = PKIFailureInfo.systemUnavail;
        this.A.d();
    }

    @Override // androidx.recyclerview.widget.v.l
    public final void f0(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.f2436z = dVar;
            if (this.f2434x != -1) {
                dVar.f2458a = -1;
            }
            n0();
        }
    }

    @Override // androidx.recyclerview.widget.v.l
    public final Parcelable g0() {
        d dVar = this.f2436z;
        if (dVar != null) {
            d dVar2 = new d();
            dVar2.f2458a = dVar.f2458a;
            dVar2.f2459b = dVar.f2459b;
            dVar2.f2460c = dVar.f2460c;
            return dVar2;
        }
        d dVar3 = new d();
        if (v() <= 0) {
            dVar3.f2458a = -1;
            return dVar3;
        }
        G0();
        boolean z10 = this.f2429s ^ this.f2431u;
        dVar3.f2460c = z10;
        if (z10) {
            View viewP0 = P0();
            dVar3.f2459b = this.f2428r.g() - this.f2428r.b(viewP0);
            dVar3.f2458a = v.l.H(viewP0);
            return dVar3;
        }
        View viewQ0 = Q0();
        dVar3.f2458a = v.l.H(viewQ0);
        dVar3.f2459b = this.f2428r.e(viewQ0) - this.f2428r.k();
        return dVar3;
    }

    @Override // androidx.recyclerview.widget.v.l
    public final void h(int i10, int i11, v.w wVar, m.b bVar) {
        if (this.f2426p != 0) {
            i10 = i11;
        }
        if (v() == 0 || i10 == 0) {
            return;
        }
        G0();
        a1(i10 > 0 ? 1 : -1, Math.abs(i10), true, wVar);
        B0(wVar, this.f2427q, bVar);
    }

    @Override // androidx.recyclerview.widget.v.l
    public final void i(int i10, m.b bVar) {
        boolean z10;
        int i11;
        d dVar = this.f2436z;
        if (dVar == null || (i11 = dVar.f2458a) < 0) {
            W0();
            z10 = this.f2431u;
            i11 = this.f2434x;
            if (i11 == -1) {
                i11 = z10 ? i10 - 1 : 0;
            }
        } else {
            z10 = dVar.f2460c;
        }
        int i12 = z10 ? -1 : 1;
        for (int i13 = 0; i13 < this.C && i11 >= 0 && i11 < i10; i13++) {
            bVar.a(i11, 0);
            i11 += i12;
        }
    }

    @Override // androidx.recyclerview.widget.v.l
    public final int j(v.w wVar) {
        return C0(wVar);
    }

    @Override // androidx.recyclerview.widget.v.l
    public int k(v.w wVar) {
        return D0(wVar);
    }

    @Override // androidx.recyclerview.widget.v.l
    public int l(v.w wVar) {
        return E0(wVar);
    }

    @Override // androidx.recyclerview.widget.v.l
    public final int m(v.w wVar) {
        return C0(wVar);
    }

    @Override // androidx.recyclerview.widget.v.l
    public int n(v.w wVar) {
        return D0(wVar);
    }

    @Override // androidx.recyclerview.widget.v.l
    public int o(v.w wVar) {
        return E0(wVar);
    }

    @Override // androidx.recyclerview.widget.v.l
    public int o0(int i10, v.r rVar, v.w wVar) {
        if (this.f2426p == 1) {
            return 0;
        }
        return X0(i10, rVar, wVar);
    }

    @Override // androidx.recyclerview.widget.v.l
    public final void p0(int i10) {
        this.f2434x = i10;
        this.f2435y = PKIFailureInfo.systemUnavail;
        d dVar = this.f2436z;
        if (dVar != null) {
            dVar.f2458a = -1;
        }
        n0();
    }

    @Override // androidx.recyclerview.widget.v.l
    public final View q(int i10) {
        int iV = v();
        if (iV == 0) {
            return null;
        }
        int iH = i10 - v.l.H(u(0));
        if (iH >= 0 && iH < iV) {
            View viewU = u(iH);
            if (v.l.H(viewU) == i10) {
                return viewU;
            }
        }
        return super.q(i10);
    }

    @Override // androidx.recyclerview.widget.v.l
    public int q0(int i10, v.r rVar, v.w wVar) {
        if (this.f2426p == 0) {
            return 0;
        }
        return X0(i10, rVar, wVar);
    }

    @Override // androidx.recyclerview.widget.v.l
    public v.m r() {
        return new v.m(-2, -2);
    }

    @Override // androidx.recyclerview.widget.v.l
    public final boolean x0() {
        if (this.f2752m != 1073741824 && this.f2751l != 1073741824) {
            int iV = v();
            for (int i10 = 0; i10 < iV; i10++) {
                ViewGroup.LayoutParams layoutParams = u(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f2426p = 1;
        this.f2430t = false;
        this.f2431u = false;
        this.f2432v = false;
        this.f2433w = true;
        this.f2434x = -1;
        this.f2435y = PKIFailureInfo.systemUnavail;
        this.f2436z = null;
        this.A = new a();
        this.B = new b();
        this.C = 2;
        this.D = new int[2];
        v.l.c cVarI = v.l.I(context, attributeSet, i10, i11);
        Y0(cVarI.f2757a);
        boolean z10 = cVarI.f2759c;
        c(null);
        if (z10 != this.f2430t) {
            this.f2430t = z10;
            n0();
        }
        Z0(cVarI.f2760d);
    }
}
