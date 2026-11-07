package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.v;
import com.yalantis.ucrop.view.CropImageView;
import java.lang.reflect.Field;
import java.util.Arrays;
import p.g0;
import y3.q0;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public final a K;
    public final Rect L;

    public static final class a extends c {
    }

    public static class b extends v.m {

        /* renamed from: e, reason: collision with root package name */
        public int f2422e;

        /* renamed from: f, reason: collision with root package name */
        public int f2423f;

        public b(int i10, int i11) {
            super(i10, i11);
            this.f2422e = -1;
            this.f2423f = 0;
        }
    }

    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public final SparseIntArray f2424a = new SparseIntArray();

        /* renamed from: b, reason: collision with root package name */
        public final SparseIntArray f2425b = new SparseIntArray();

        public static int a(int i10, int i11) {
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                i12++;
                if (i12 == i11) {
                    i13++;
                    i12 = 0;
                } else if (i12 > i11) {
                    i13++;
                    i12 = 1;
                }
            }
            return i12 + 1 > i11 ? i13 + 1 : i13;
        }

        public final void b() {
            this.f2424a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new a();
        this.L = new Rect();
        k1(v.l.I(context, attributeSet, i10, i11).f2758b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.v.l
    public final boolean A0() {
        return this.f2436z == null && !this.E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void B0(v.w wVar, LinearLayoutManager.c cVar, m.b bVar) {
        int i10;
        int i11 = this.F;
        for (int i12 = 0; i12 < this.F && (i10 = cVar.f2449d) >= 0 && i10 < wVar.b() && i11 > 0; i12++) {
            bVar.a(cVar.f2449d, Math.max(0, cVar.f2452g));
            this.K.getClass();
            i11--;
            cVar.f2449d += cVar.f2450e;
        }
    }

    @Override // androidx.recyclerview.widget.v.l
    public final int J(v.r rVar, v.w wVar) {
        if (this.f2426p == 0) {
            return this.F;
        }
        if (wVar.b() < 1) {
            return 0;
        }
        return g1(wVar.b() - 1, rVar, wVar) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View M0(v.r rVar, v.w wVar, boolean z10, boolean z11) {
        int i10;
        int iV;
        int iV2 = v();
        int i11 = 1;
        if (z11) {
            iV = v() - 1;
            i10 = -1;
            i11 = -1;
        } else {
            i10 = iV2;
            iV = 0;
        }
        int iB = wVar.b();
        G0();
        int iK = this.f2428r.k();
        int iG = this.f2428r.g();
        View view = null;
        View view2 = null;
        while (iV != i10) {
            View viewU = u(iV);
            int iH = v.l.H(viewU);
            if (iH >= 0 && iH < iB && h1(iH, rVar, wVar) == 0) {
                if (((v.m) viewU.getLayoutParams()).f2761a.g()) {
                    if (view2 == null) {
                        view2 = viewU;
                    }
                } else {
                    if (this.f2428r.e(viewU) < iG && this.f2428r.b(viewU) >= iK) {
                        return viewU;
                    }
                    if (view == null) {
                        view = viewU;
                    }
                }
            }
            iV += i11;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v34 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void S0(v.r rVar, v.w wVar, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i10;
        int i11;
        int i12;
        int iD;
        int iG;
        int iE;
        int iD2;
        int iW;
        int iW2;
        ?? r12;
        int i13;
        View viewB;
        int iJ = this.f2428r.j();
        boolean z10 = iJ != 1073741824;
        int i14 = v() > 0 ? this.G[this.F] : 0;
        if (z10) {
            l1();
        }
        boolean z11 = cVar.f2450e == 1;
        int iH1 = this.F;
        if (!z11) {
            iH1 = h1(cVar.f2449d, rVar, wVar) + i1(cVar.f2449d, rVar, wVar);
        }
        int i15 = 0;
        while (i15 < this.F && (i13 = cVar.f2449d) >= 0 && i13 < wVar.b() && iH1 > 0) {
            int i16 = cVar.f2449d;
            int iI1 = i1(i16, rVar, wVar);
            if (iI1 > this.F) {
                throw new IllegalArgumentException(x0.a.a(g0.a(i16, iI1, "Item at position ", " requires ", " spans but GridLayoutManager has only "), this.F, " spans."));
            }
            iH1 -= iI1;
            if (iH1 < 0 || (viewB = cVar.b(rVar)) == null) {
                break;
            }
            this.H[i15] = viewB;
            i15++;
        }
        if (i15 == 0) {
            bVar.f2443b = true;
            return;
        }
        if (z11) {
            i12 = 1;
            i11 = i15;
            i10 = 0;
        } else {
            i10 = i15 - 1;
            i11 = -1;
            i12 = -1;
        }
        int i17 = 0;
        while (i10 != i11) {
            View view = this.H[i10];
            b bVar2 = (b) view.getLayoutParams();
            int iI12 = i1(v.l.H(view), rVar, wVar);
            bVar2.f2423f = iI12;
            bVar2.f2422e = i17;
            i17 += iI12;
            i10 += i12;
        }
        float f10 = CropImageView.DEFAULT_ASPECT_RATIO;
        int i18 = 0;
        for (int i19 = 0; i19 < i15; i19++) {
            View view2 = this.H[i19];
            if (cVar.f2456k != null) {
                r12 = 0;
                r12 = 0;
                if (z11) {
                    b(view2, -1, true);
                } else {
                    b(view2, 0, true);
                }
            } else if (z11) {
                r12 = 0;
                b(view2, -1, false);
            } else {
                r12 = 0;
                b(view2, 0, false);
            }
            v vVar = this.f2741b;
            Rect rect = this.L;
            if (vVar == null) {
                rect.set(r12, r12, r12, r12);
            } else {
                rect.set(vVar.K(view2));
            }
            j1(view2, iJ, r12);
            int iC = this.f2428r.c(view2);
            if (iC > i18) {
                i18 = iC;
            }
            float fD = (this.f2428r.d(view2) * 1.0f) / ((b) view2.getLayoutParams()).f2423f;
            if (fD > f10) {
                f10 = fD;
            }
        }
        if (z10) {
            d1(Math.max(Math.round(f10 * this.F), i14));
            i18 = 0;
            for (int i20 = 0; i20 < i15; i20++) {
                View view3 = this.H[i20];
                j1(view3, 1073741824, true);
                int iC2 = this.f2428r.c(view3);
                if (iC2 > i18) {
                    i18 = iC2;
                }
            }
        }
        for (int i21 = 0; i21 < i15; i21++) {
            View view4 = this.H[i21];
            if (this.f2428r.c(view4) != i18) {
                b bVar3 = (b) view4.getLayoutParams();
                Rect rect2 = bVar3.f2762b;
                int i22 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) bVar3).topMargin + ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin;
                int i23 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) bVar3).leftMargin + ((ViewGroup.MarginLayoutParams) bVar3).rightMargin;
                int iF1 = f1(bVar3.f2422e, bVar3.f2423f);
                if (this.f2426p == 1) {
                    iW2 = v.l.w(false, iF1, 1073741824, i23, ((ViewGroup.MarginLayoutParams) bVar3).width);
                    iW = View.MeasureSpec.makeMeasureSpec(i18 - i22, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18 - i23, 1073741824);
                    iW = v.l.w(false, iF1, 1073741824, i22, ((ViewGroup.MarginLayoutParams) bVar3).height);
                    iW2 = iMakeMeasureSpec;
                }
                if (y0(view4, iW2, iW, (v.m) view4.getLayoutParams())) {
                    view4.measure(iW2, iW);
                }
            }
        }
        bVar.f2442a = i18;
        if (this.f2426p != 1) {
            if (cVar.f2451f == -1) {
                int i24 = cVar.f2447b;
                iE = i24 - i18;
                iG = 0;
                iD = i24;
            } else {
                int i25 = cVar.f2447b;
                iD = i25 + i18;
                iG = 0;
                iE = i25;
            }
            iD2 = iG;
        } else if (cVar.f2451f == -1) {
            iD2 = cVar.f2447b;
            iG = iD2 - i18;
            iE = 0;
            iD = 0;
        } else {
            int i26 = cVar.f2447b;
            iD = 0;
            iG = i26;
            iD2 = i26 + i18;
            iE = 0;
        }
        for (int i27 = 0; i27 < i15; i27++) {
            View view5 = this.H[i27];
            b bVar4 = (b) view5.getLayoutParams();
            if (this.f2426p != 1) {
                iG = G() + this.G[bVar4.f2422e];
                iD2 = this.f2428r.d(view5) + iG;
            } else if (R0()) {
                int iE2 = E() + this.G[this.F - bVar4.f2422e];
                iD = iE2;
                iE = iE2 - this.f2428r.d(view5);
            } else {
                iE = E() + this.G[bVar4.f2422e];
                iD = this.f2428r.d(view5) + iE;
            }
            v.l.N(view5, iE, iG, iD, iD2);
            if (bVar4.f2761a.g() || bVar4.f2761a.j()) {
                bVar.f2444c = true;
            }
            bVar.f2445d = view5.hasFocusable() | bVar.f2445d;
        }
        Arrays.fill(this.H, (Object) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e0, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0140, code lost:
    
        if (r16 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0142, code lost:
    
        return r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0143, code lost:
    
        return r17;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.v.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T(View view, int i10, v.r rVar, v.w wVar) {
        View viewB;
        int iV;
        int i11;
        int iV2;
        View view2;
        int i12;
        int i13;
        v.r rVar2 = rVar;
        v.w wVar2 = wVar;
        v vVar = this.f2741b;
        if (vVar == null || (viewB = vVar.B(view)) == null || this.f2740a.f2514c.contains(viewB)) {
            viewB = null;
        }
        if (viewB != null) {
            b bVar = (b) viewB.getLayoutParams();
            int i14 = bVar.f2422e;
            int i15 = bVar.f2423f + i14;
            if (super.T(view, i10, rVar, wVar) != null) {
                if ((F0(i10) == 1) != this.f2431u) {
                    iV2 = v() - 1;
                    iV = -1;
                    i11 = -1;
                } else {
                    iV = v();
                    i11 = 1;
                    iV2 = 0;
                }
                boolean z10 = this.f2426p == 1 && R0();
                int iG1 = g1(iV2, rVar2, wVar2);
                View view3 = null;
                int i16 = -1;
                int i17 = -1;
                int iMin = 0;
                int i18 = iV2;
                int iMin2 = 0;
                View view4 = null;
                while (true) {
                    View view5 = view4;
                    if (i18 == iV) {
                        break;
                    }
                    int iG12 = g1(i18, rVar2, wVar2);
                    View viewU = u(i18);
                    if (viewU == viewB) {
                        break;
                    }
                    if (!viewU.hasFocusable() || iG12 == iG1) {
                        b bVar2 = (b) viewU.getLayoutParams();
                        int i19 = bVar2.f2422e;
                        view2 = viewB;
                        int i20 = bVar2.f2423f + i19;
                        if (viewU.hasFocusable() && i19 == i14 && i20 == i15) {
                            return viewU;
                        }
                        if (!(viewU.hasFocusable() && view3 == null) && (viewU.hasFocusable() || view5 != null)) {
                            i12 = iV;
                            int iMin3 = Math.min(i20, i15) - Math.max(i19, i14);
                            if (viewU.hasFocusable()) {
                                if (iMin3 <= iMin) {
                                    if (iMin3 == iMin) {
                                    }
                                    i13 = iMin;
                                }
                                i13 = iMin;
                            } else if (view3 == null) {
                                i13 = iMin;
                                if (!this.f2742c.b(viewU) || !this.f2743d.b(viewU)) {
                                    if (iMin3 <= iMin2) {
                                        if (iMin3 == iMin2) {
                                            if (z10 == (i19 > i16)) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                i13 = iMin;
                            }
                            i18 += i11;
                            rVar2 = rVar;
                            wVar2 = wVar;
                            viewB = view2;
                            iV = i12;
                        } else {
                            i13 = iMin;
                            i12 = iV;
                        }
                        if (viewU.hasFocusable()) {
                            int i21 = bVar2.f2422e;
                            iMin = Math.min(i20, i15) - Math.max(i19, i14);
                            view3 = viewU;
                            i17 = i21;
                            view4 = view5;
                        } else {
                            int i22 = bVar2.f2422e;
                            view4 = viewU;
                            i16 = i22;
                            iMin = i13;
                            iMin2 = Math.min(i20, i15) - Math.max(i19, i14);
                        }
                        i18 += i11;
                        rVar2 = rVar;
                        wVar2 = wVar;
                        viewB = view2;
                        iV = i12;
                    } else {
                        if (view3 != null) {
                            break;
                        }
                        view2 = viewB;
                        i13 = iMin;
                        i12 = iV;
                    }
                    view4 = view5;
                    iMin = i13;
                    i18 += i11;
                    rVar2 = rVar;
                    wVar2 = wVar;
                    viewB = view2;
                    iV = i12;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void T0(v.r rVar, v.w wVar, LinearLayoutManager.a aVar, int i10) {
        l1();
        if (wVar.b() > 0 && !wVar.f2803g) {
            boolean z10 = i10 == 1;
            int iH1 = h1(aVar.f2438b, rVar, wVar);
            if (z10) {
                while (iH1 > 0) {
                    int i11 = aVar.f2438b;
                    if (i11 <= 0) {
                        break;
                    }
                    int i12 = i11 - 1;
                    aVar.f2438b = i12;
                    iH1 = h1(i12, rVar, wVar);
                }
            } else {
                int iB = wVar.b() - 1;
                int i13 = aVar.f2438b;
                while (i13 < iB) {
                    int i14 = i13 + 1;
                    int iH12 = h1(i14, rVar, wVar);
                    if (iH12 <= iH1) {
                        break;
                    }
                    i13 = i14;
                    iH1 = iH12;
                }
                aVar.f2438b = i13;
            }
        }
        e1();
    }

    @Override // androidx.recyclerview.widget.v.l
    public final void V(v.r rVar, v.w wVar, z3.j jVar) {
        super.V(rVar, wVar, jVar);
        jVar.g("android.widget.GridView");
    }

    @Override // androidx.recyclerview.widget.v.l
    public final void X(v.r rVar, v.w wVar, View view, z3.j jVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f34725a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            W(view, jVar);
            return;
        }
        b bVar = (b) layoutParams;
        int iG1 = g1(bVar.f2761a.b(), rVar, wVar);
        if (this.f2426p == 0) {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(bVar.f2422e, bVar.f2423f, iG1, 1, false, false));
        } else {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(iG1, 1, bVar.f2422e, bVar.f2423f, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.v.l
    public final void Y(int i10, int i11) {
        a aVar = this.K;
        aVar.b();
        aVar.f2425b.clear();
    }

    @Override // androidx.recyclerview.widget.v.l
    public final void Z() {
        a aVar = this.K;
        aVar.b();
        aVar.f2425b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void Z0(boolean z10) {
        if (z10) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.Z0(false);
    }

    @Override // androidx.recyclerview.widget.v.l
    public final void a0(int i10, int i11) {
        a aVar = this.K;
        aVar.b();
        aVar.f2425b.clear();
    }

    @Override // androidx.recyclerview.widget.v.l
    public final void b0(int i10, int i11) {
        a aVar = this.K;
        aVar.b();
        aVar.f2425b.clear();
    }

    @Override // androidx.recyclerview.widget.v.l
    public final void c0(int i10, int i11) {
        a aVar = this.K;
        aVar.b();
        aVar.f2425b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.v.l
    public final void d0(v.r rVar, v.w wVar) {
        boolean z10 = wVar.f2803g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z10) {
            int iV = v();
            for (int i10 = 0; i10 < iV; i10++) {
                b bVar = (b) u(i10).getLayoutParams();
                int iB = bVar.f2761a.b();
                sparseIntArray2.put(iB, bVar.f2423f);
                sparseIntArray.put(iB, bVar.f2422e);
            }
        }
        super.d0(rVar, wVar);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    public final void d1(int i10) {
        int i11;
        int[] iArr = this.G;
        int i12 = this.F;
        if (iArr == null || iArr.length != i12 + 1 || iArr[iArr.length - 1] != i10) {
            iArr = new int[i12 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i10 / i12;
        int i15 = i10 % i12;
        int i16 = 0;
        for (int i17 = 1; i17 <= i12; i17++) {
            i13 += i15;
            if (i13 <= 0 || i12 - i13 >= i15) {
                i11 = i14;
            } else {
                i11 = i14 + 1;
                i13 -= i12;
            }
            i16 += i11;
            iArr[i17] = i16;
        }
        this.G = iArr;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.v.l
    public final void e0(v.w wVar) {
        super.e0(wVar);
        this.E = false;
    }

    public final void e1() {
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    @Override // androidx.recyclerview.widget.v.l
    public final boolean f(v.m mVar) {
        return mVar instanceof b;
    }

    public final int f1(int i10, int i11) {
        if (this.f2426p != 1 || !R0()) {
            int[] iArr = this.G;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.G;
        int i12 = this.F;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    public final int g1(int i10, v.r rVar, v.w wVar) {
        boolean z10 = wVar.f2803g;
        a aVar = this.K;
        if (!z10) {
            int i11 = this.F;
            aVar.getClass();
            return c.a(i10, i11);
        }
        int iB = rVar.b(i10);
        if (iB != -1) {
            int i12 = this.F;
            aVar.getClass();
            return c.a(iB, i12);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
        return 0;
    }

    public final int h1(int i10, v.r rVar, v.w wVar) {
        boolean z10 = wVar.f2803g;
        a aVar = this.K;
        if (!z10) {
            int i11 = this.F;
            aVar.getClass();
            return i10 % i11;
        }
        int i12 = this.J.get(i10, -1);
        if (i12 != -1) {
            return i12;
        }
        int iB = rVar.b(i10);
        if (iB != -1) {
            int i13 = this.F;
            aVar.getClass();
            return iB % i13;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 0;
    }

    public final int i1(int i10, v.r rVar, v.w wVar) {
        boolean z10 = wVar.f2803g;
        a aVar = this.K;
        if (!z10) {
            aVar.getClass();
            return 1;
        }
        int i11 = this.I.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        if (rVar.b(i10) != -1) {
            aVar.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 1;
    }

    public final void j1(View view, int i10, boolean z10) {
        int iW;
        int iW2;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f2762b;
        int i11 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i12 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int iF1 = f1(bVar.f2422e, bVar.f2423f);
        if (this.f2426p == 1) {
            iW2 = v.l.w(false, iF1, i10, i12, ((ViewGroup.MarginLayoutParams) bVar).width);
            iW = v.l.w(true, this.f2428r.l(), this.f2752m, i11, ((ViewGroup.MarginLayoutParams) bVar).height);
        } else {
            int iW3 = v.l.w(false, iF1, i10, i11, ((ViewGroup.MarginLayoutParams) bVar).height);
            int iW4 = v.l.w(true, this.f2428r.l(), this.f2751l, i12, ((ViewGroup.MarginLayoutParams) bVar).width);
            iW = iW3;
            iW2 = iW4;
        }
        v.m mVar = (v.m) view.getLayoutParams();
        if (z10 ? y0(view, iW2, iW, mVar) : w0(view, iW2, iW, mVar)) {
            view.measure(iW2, iW);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.v.l
    public final int k(v.w wVar) {
        return D0(wVar);
    }

    public final void k1(int i10) {
        if (i10 == this.F) {
            return;
        }
        this.E = true;
        if (i10 < 1) {
            throw new IllegalArgumentException(j2.y.a(i10, "Span count should be at least 1. Provided "));
        }
        this.F = i10;
        this.K.b();
        n0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.v.l
    public final int l(v.w wVar) {
        return E0(wVar);
    }

    public final void l1() {
        int iD;
        int iG;
        if (this.f2426p == 1) {
            iD = this.f2753n - F();
            iG = E();
        } else {
            iD = this.f2754o - D();
            iG = G();
        }
        d1(iD - iG);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.v.l
    public final int n(v.w wVar) {
        return D0(wVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.v.l
    public final int o(v.w wVar) {
        return E0(wVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.v.l
    public final int o0(int i10, v.r rVar, v.w wVar) {
        l1();
        e1();
        return super.o0(i10, rVar, wVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.v.l
    public final int q0(int i10, v.r rVar, v.w wVar) {
        l1();
        e1();
        return super.q0(i10, rVar, wVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.v.l
    public final v.m r() {
        return this.f2426p == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.v.l
    public final v.m s(Context context, AttributeSet attributeSet) {
        b bVar = new b(context, attributeSet);
        bVar.f2422e = -1;
        bVar.f2423f = 0;
        return bVar;
    }

    @Override // androidx.recyclerview.widget.v.l
    public final v.m t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            b bVar = new b((ViewGroup.MarginLayoutParams) layoutParams);
            bVar.f2422e = -1;
            bVar.f2423f = 0;
            return bVar;
        }
        b bVar2 = new b(layoutParams);
        bVar2.f2422e = -1;
        bVar2.f2423f = 0;
        return bVar2;
    }

    @Override // androidx.recyclerview.widget.v.l
    public final void t0(Rect rect, int i10, int i11) {
        int iG;
        int iG2;
        if (this.G == null) {
            super.t0(rect, i10, i11);
        }
        int iF = F() + E();
        int iD = D() + G();
        if (this.f2426p == 1) {
            int iHeight = rect.height() + iD;
            v vVar = this.f2741b;
            Field field = q0.f33885a;
            iG2 = v.l.g(i11, iHeight, vVar.getMinimumHeight());
            int[] iArr = this.G;
            iG = v.l.g(i10, iArr[iArr.length - 1] + iF, this.f2741b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iF;
            v vVar2 = this.f2741b;
            Field field2 = q0.f33885a;
            iG = v.l.g(i10, iWidth, vVar2.getMinimumWidth());
            int[] iArr2 = this.G;
            iG2 = v.l.g(i11, iArr2[iArr2.length - 1] + iD, this.f2741b.getMinimumHeight());
        }
        this.f2741b.setMeasuredDimension(iG, iG2);
    }

    @Override // androidx.recyclerview.widget.v.l
    public final int x(v.r rVar, v.w wVar) {
        if (this.f2426p == 1) {
            return this.F;
        }
        if (wVar.b() < 1) {
            return 0;
        }
        return g1(wVar.b() - 1, rVar, wVar) + 1;
    }

    public GridLayoutManager(int i10) {
        super(1);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new a();
        this.L = new Rect();
        k1(i10);
    }
}
