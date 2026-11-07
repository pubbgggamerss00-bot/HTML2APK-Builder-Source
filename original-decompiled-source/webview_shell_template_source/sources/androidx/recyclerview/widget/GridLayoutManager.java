package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.GridView;
import androidx.camera.camera2.internal.g0;
import androidx.camera.camera2.internal.p0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import java.util.Arrays;
import java.util.WeakHashMap;
import u0.f0;
import u0.n0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
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

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a extends c {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b extends RecyclerView.n {

        /* renamed from: e, reason: collision with root package name */
        public int f1364e;

        /* renamed from: f, reason: collision with root package name */
        public int f1365f;

        public b(int i6, int i7) {
            super(i6, i7);
            this.f1364e = -1;
            this.f1365f = 0;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public final SparseIntArray f1366a = new SparseIntArray();

        /* renamed from: b, reason: collision with root package name */
        public final SparseIntArray f1367b = new SparseIntArray();

        public static int a(int i6, int i7) {
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                i8++;
                if (i8 == i7) {
                    i9++;
                    i8 = 0;
                } else if (i8 > i7) {
                    i9++;
                    i8 = 1;
                }
            }
            return i8 + 1 > i7 ? i9 + 1 : i9;
        }

        public final void b() {
            this.f1366a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i6, int i7) {
        super(context, attributeSet, i6, i7);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new a();
        this.L = new Rect();
        o1(RecyclerView.m.I(context, attributeSet, i6, i7).f1489b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final boolean B0() {
        return this.f1377z == null && !this.E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void D0(RecyclerView.x xVar, LinearLayoutManager.c cVar, m.b bVar) {
        int i6;
        int i7 = this.F;
        for (int i8 = 0; i8 < this.F && (i6 = cVar.f1390d) >= 0 && i6 < xVar.b() && i7 > 0; i8++) {
            bVar.a(cVar.f1390d, Math.max(0, cVar.f1393g));
            this.K.getClass();
            i7--;
            cVar.f1390d += cVar.f1391e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int J(RecyclerView.s sVar, RecyclerView.x xVar) {
        if (this.f1368p == 0) {
            return this.F;
        }
        if (xVar.b() < 1) {
            return 0;
        }
        return k1(xVar.b() - 1, sVar, xVar) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View Q0(RecyclerView.s sVar, RecyclerView.x xVar, boolean z6, boolean z7) {
        int i6;
        int iV;
        int iV2 = v();
        int i7 = 1;
        if (z7) {
            iV = v() - 1;
            i6 = -1;
            i7 = -1;
        } else {
            i6 = iV2;
            iV = 0;
        }
        int iB = xVar.b();
        I0();
        int iK = this.f1370r.k();
        int iG = this.f1370r.g();
        View view = null;
        View view2 = null;
        while (iV != i6) {
            View viewU = u(iV);
            int iH = RecyclerView.m.H(viewU);
            if (iH >= 0 && iH < iB && l1(iH, sVar, xVar) == 0) {
                if (((RecyclerView.n) viewU.getLayoutParams()).f1492a.h()) {
                    if (view2 == null) {
                        view2 = viewU;
                    }
                } else {
                    if (this.f1370r.e(viewU) < iG && this.f1370r.b(viewU) >= iK) {
                        return viewU;
                    }
                    if (view == null) {
                        view = viewU;
                    }
                }
            }
            iV += i7;
        }
        return view != null ? view : view2;
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
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T(View view, int i6, RecyclerView.s sVar, RecyclerView.x xVar) {
        View viewD;
        int iV;
        int i7;
        int iV2;
        View view2;
        int i8;
        int i9;
        RecyclerView.s sVar2 = sVar;
        RecyclerView.x xVar2 = xVar;
        RecyclerView recyclerView = this.f1473b;
        if (recyclerView == null || (viewD = recyclerView.D(view)) == null || this.f1472a.f1590c.contains(viewD)) {
            viewD = null;
        }
        if (viewD != null) {
            b bVar = (b) viewD.getLayoutParams();
            int i10 = bVar.f1364e;
            int i11 = bVar.f1365f + i10;
            if (super.T(view, i6, sVar, xVar) != null) {
                if ((H0(i6) == 1) != this.f1372u) {
                    iV2 = v() - 1;
                    iV = -1;
                    i7 = -1;
                } else {
                    iV = v();
                    i7 = 1;
                    iV2 = 0;
                }
                boolean z6 = this.f1368p == 1 && V0();
                int iK1 = k1(iV2, sVar2, xVar2);
                View view3 = null;
                int i12 = -1;
                int i13 = -1;
                int iMin = 0;
                int i14 = iV2;
                int iMin2 = 0;
                View view4 = null;
                while (true) {
                    View view5 = view4;
                    if (i14 == iV) {
                        break;
                    }
                    int iK12 = k1(i14, sVar2, xVar2);
                    View viewU = u(i14);
                    if (viewU == viewD) {
                        break;
                    }
                    if (!viewU.hasFocusable() || iK12 == iK1) {
                        b bVar2 = (b) viewU.getLayoutParams();
                        int i15 = bVar2.f1364e;
                        view2 = viewD;
                        int i16 = bVar2.f1365f + i15;
                        if (viewU.hasFocusable() && i15 == i10 && i16 == i11) {
                            return viewU;
                        }
                        if (!(viewU.hasFocusable() && view3 == null) && (viewU.hasFocusable() || view5 != null)) {
                            i8 = iV;
                            int iMin3 = Math.min(i16, i11) - Math.max(i15, i10);
                            if (viewU.hasFocusable()) {
                                if (iMin3 <= iMin) {
                                    if (iMin3 == iMin) {
                                    }
                                    i9 = iMin;
                                }
                                i9 = iMin;
                            } else if (view3 == null) {
                                i9 = iMin;
                                if (!this.f1474c.b(viewU) || !this.f1475d.b(viewU)) {
                                    if (iMin3 <= iMin2) {
                                        if (iMin3 == iMin2) {
                                            if (z6 == (i15 > i12)) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                i9 = iMin;
                            }
                            i14 += i7;
                            sVar2 = sVar;
                            xVar2 = xVar;
                            viewD = view2;
                            iV = i8;
                        } else {
                            i9 = iMin;
                            i8 = iV;
                        }
                        if (viewU.hasFocusable()) {
                            int i17 = bVar2.f1364e;
                            iMin = Math.min(i16, i11) - Math.max(i15, i10);
                            view3 = viewU;
                            i13 = i17;
                            view4 = view5;
                        } else {
                            int i18 = bVar2.f1364e;
                            view4 = viewU;
                            i12 = i18;
                            iMin = i9;
                            iMin2 = Math.min(i16, i11) - Math.max(i15, i10);
                        }
                        i14 += i7;
                        sVar2 = sVar;
                        xVar2 = xVar;
                        viewD = view2;
                        iV = i8;
                    } else {
                        if (view3 != null) {
                            break;
                        }
                        view2 = viewD;
                        i9 = iMin;
                        i8 = iV;
                    }
                    view4 = view5;
                    iMin = i9;
                    i14 += i7;
                    sVar2 = sVar;
                    xVar2 = xVar;
                    viewD = view2;
                    iV = i8;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void V(RecyclerView.s sVar, RecyclerView.x xVar, v0.b bVar) {
        super.V(sVar, xVar, bVar);
        bVar.h(GridView.class.getName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v34 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void W0(RecyclerView.s sVar, RecyclerView.x xVar, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i6;
        int i7;
        int i8;
        int iD;
        int iG;
        int iE;
        int iD2;
        int iW;
        int iW2;
        ?? r12;
        int i9;
        View viewB;
        int iJ = this.f1370r.j();
        boolean z6 = iJ != 1073741824;
        int i10 = v() > 0 ? this.G[this.F] : 0;
        if (z6) {
            p1();
        }
        boolean z7 = cVar.f1391e == 1;
        int iL1 = this.F;
        if (!z7) {
            iL1 = l1(cVar.f1390d, sVar, xVar) + m1(cVar.f1390d, sVar, xVar);
        }
        int i11 = 0;
        while (i11 < this.F && (i9 = cVar.f1390d) >= 0 && i9 < xVar.b() && iL1 > 0) {
            int i12 = cVar.f1390d;
            int iM1 = m1(i12, sVar, xVar);
            if (iM1 > this.F) {
                throw new IllegalArgumentException(p0.a(g0.a("Item at position ", i12, " requires ", iM1, " spans but GridLayoutManager has only "), this.F, " spans."));
            }
            iL1 -= iM1;
            if (iL1 < 0 || (viewB = cVar.b(sVar)) == null) {
                break;
            }
            this.H[i11] = viewB;
            i11++;
        }
        if (i11 == 0) {
            bVar.f1384b = true;
            return;
        }
        if (z7) {
            i8 = 1;
            i7 = i11;
            i6 = 0;
        } else {
            i6 = i11 - 1;
            i7 = -1;
            i8 = -1;
        }
        int i13 = 0;
        while (i6 != i7) {
            View view = this.H[i6];
            b bVar2 = (b) view.getLayoutParams();
            int iM12 = m1(RecyclerView.m.H(view), sVar, xVar);
            bVar2.f1365f = iM12;
            bVar2.f1364e = i13;
            i13 += iM12;
            i6 += i8;
        }
        float f6 = 0.0f;
        int i14 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            View view2 = this.H[i15];
            if (cVar.f1396k != null) {
                r12 = 0;
                r12 = 0;
                if (z7) {
                    b(view2, -1, true);
                } else {
                    b(view2, 0, true);
                }
            } else if (z7) {
                r12 = 0;
                b(view2, -1, false);
            } else {
                r12 = 0;
                b(view2, 0, false);
            }
            RecyclerView recyclerView = this.f1473b;
            Rect rect = this.L;
            if (recyclerView == null) {
                rect.set(r12, r12, r12, r12);
            } else {
                rect.set(recyclerView.N(view2));
            }
            n1(view2, iJ, r12);
            int iC = this.f1370r.c(view2);
            if (iC > i14) {
                i14 = iC;
            }
            float fD = (this.f1370r.d(view2) * 1.0f) / ((b) view2.getLayoutParams()).f1365f;
            if (fD > f6) {
                f6 = fD;
            }
        }
        if (z6) {
            h1(Math.max(Math.round(f6 * this.F), i10));
            i14 = 0;
            for (int i16 = 0; i16 < i11; i16++) {
                View view3 = this.H[i16];
                n1(view3, 1073741824, true);
                int iC2 = this.f1370r.c(view3);
                if (iC2 > i14) {
                    i14 = iC2;
                }
            }
        }
        for (int i17 = 0; i17 < i11; i17++) {
            View view4 = this.H[i17];
            if (this.f1370r.c(view4) != i14) {
                b bVar3 = (b) view4.getLayoutParams();
                Rect rect2 = bVar3.f1493b;
                int i18 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) bVar3).topMargin + ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin;
                int i19 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) bVar3).leftMargin + ((ViewGroup.MarginLayoutParams) bVar3).rightMargin;
                int iJ1 = j1(bVar3.f1364e, bVar3.f1365f);
                if (this.f1368p == 1) {
                    iW2 = RecyclerView.m.w(false, iJ1, 1073741824, i19, ((ViewGroup.MarginLayoutParams) bVar3).width);
                    iW = View.MeasureSpec.makeMeasureSpec(i14 - i18, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14 - i19, 1073741824);
                    iW = RecyclerView.m.w(false, iJ1, 1073741824, i18, ((ViewGroup.MarginLayoutParams) bVar3).height);
                    iW2 = iMakeMeasureSpec;
                }
                if (y0(view4, iW2, iW, (RecyclerView.n) view4.getLayoutParams())) {
                    view4.measure(iW2, iW);
                }
            }
        }
        bVar.f1383a = i14;
        if (this.f1368p != 1) {
            if (cVar.f1392f == -1) {
                int i20 = cVar.f1388b;
                iE = i20 - i14;
                iG = 0;
                iD = i20;
            } else {
                int i21 = cVar.f1388b;
                iD = i21 + i14;
                iG = 0;
                iE = i21;
            }
            iD2 = iG;
        } else if (cVar.f1392f == -1) {
            iD2 = cVar.f1388b;
            iG = iD2 - i14;
            iE = 0;
            iD = 0;
        } else {
            int i22 = cVar.f1388b;
            iD = 0;
            iG = i22;
            iD2 = i22 + i14;
            iE = 0;
        }
        for (int i23 = 0; i23 < i11; i23++) {
            View view5 = this.H[i23];
            b bVar4 = (b) view5.getLayoutParams();
            if (this.f1368p != 1) {
                iG = G() + this.G[bVar4.f1364e];
                iD2 = this.f1370r.d(view5) + iG;
            } else if (V0()) {
                int iE2 = E() + this.G[this.F - bVar4.f1364e];
                iD = iE2;
                iE = iE2 - this.f1370r.d(view5);
            } else {
                iE = E() + this.G[bVar4.f1364e];
                iD = this.f1370r.d(view5) + iE;
            }
            RecyclerView.m.N(view5, iE, iG, iD, iD2);
            if (bVar4.f1492a.h() || bVar4.f1492a.k()) {
                bVar.f1385c = true;
            }
            bVar.f1386d = view5.hasFocusable() | bVar.f1386d;
        }
        Arrays.fill(this.H, (Object) null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void X(RecyclerView.s sVar, RecyclerView.x xVar, View view, v0.b bVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = bVar.f14729a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            W(view, bVar);
            return;
        }
        b bVar2 = (b) layoutParams;
        int iK1 = k1(bVar2.f1492a.b(), sVar, xVar);
        if (this.f1368p == 0) {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(bVar2.f1364e, bVar2.f1365f, iK1, 1, false, false));
        } else {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(iK1, 1, bVar2.f1364e, bVar2.f1365f, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void X0(RecyclerView.s sVar, RecyclerView.x xVar, LinearLayoutManager.a aVar, int i6) {
        p1();
        if (xVar.b() > 0 && !xVar.f1532g) {
            boolean z6 = i6 == 1;
            int iL1 = l1(aVar.f1379b, sVar, xVar);
            if (z6) {
                while (iL1 > 0) {
                    int i7 = aVar.f1379b;
                    if (i7 <= 0) {
                        break;
                    }
                    int i8 = i7 - 1;
                    aVar.f1379b = i8;
                    iL1 = l1(i8, sVar, xVar);
                }
            } else {
                int iB = xVar.b() - 1;
                int i9 = aVar.f1379b;
                while (i9 < iB) {
                    int i10 = i9 + 1;
                    int iL12 = l1(i10, sVar, xVar);
                    if (iL12 <= iL1) {
                        break;
                    }
                    i9 = i10;
                    iL1 = iL12;
                }
                aVar.f1379b = i9;
            }
        }
        i1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void Y(int i6, int i7) {
        a aVar = this.K;
        aVar.b();
        aVar.f1367b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void Z() {
        a aVar = this.K;
        aVar.b();
        aVar.f1367b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void a0(int i6, int i7) {
        a aVar = this.K;
        aVar.b();
        aVar.f1367b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void b0(int i6, int i7) {
        a aVar = this.K;
        aVar.b();
        aVar.f1367b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void c0(int i6, int i7) {
        a aVar = this.K;
        aVar.b();
        aVar.f1367b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final void d0(RecyclerView.s sVar, RecyclerView.x xVar) {
        boolean z6 = xVar.f1532g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z6) {
            int iV = v();
            for (int i6 = 0; i6 < iV; i6++) {
                b bVar = (b) u(i6).getLayoutParams();
                int iB = bVar.f1492a.b();
                sparseIntArray2.put(iB, bVar.f1365f);
                sparseIntArray.put(iB, bVar.f1364e);
            }
        }
        super.d0(sVar, xVar);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void d1(boolean z6) {
        if (z6) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.d1(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final void e0(RecyclerView.x xVar) {
        super.e0(xVar);
        this.E = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean f(RecyclerView.n nVar) {
        return nVar instanceof b;
    }

    public final void h1(int i6) {
        int i7;
        int[] iArr = this.G;
        int i8 = this.F;
        if (iArr == null || iArr.length != i8 + 1 || iArr[iArr.length - 1] != i6) {
            iArr = new int[i8 + 1];
        }
        int i9 = 0;
        iArr[0] = 0;
        int i10 = i6 / i8;
        int i11 = i6 % i8;
        int i12 = 0;
        for (int i13 = 1; i13 <= i8; i13++) {
            i9 += i11;
            if (i9 <= 0 || i8 - i9 >= i11) {
                i7 = i10;
            } else {
                i7 = i10 + 1;
                i9 -= i8;
            }
            i12 += i7;
            iArr[i13] = i12;
        }
        this.G = iArr;
    }

    public final void i1() {
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    public final int j1(int i6, int i7) {
        if (this.f1368p != 1 || !V0()) {
            int[] iArr = this.G;
            return iArr[i7 + i6] - iArr[i6];
        }
        int[] iArr2 = this.G;
        int i8 = this.F;
        return iArr2[i8 - i6] - iArr2[(i8 - i6) - i7];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int k(RecyclerView.x xVar) {
        return F0(xVar);
    }

    public final int k1(int i6, RecyclerView.s sVar, RecyclerView.x xVar) {
        boolean z6 = xVar.f1532g;
        a aVar = this.K;
        if (!z6) {
            int i7 = this.F;
            aVar.getClass();
            return c.a(i6, i7);
        }
        int iB = sVar.b(i6);
        if (iB != -1) {
            int i8 = this.F;
            aVar.getClass();
            return c.a(iB, i8);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i6);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int l(RecyclerView.x xVar) {
        return G0(xVar);
    }

    public final int l1(int i6, RecyclerView.s sVar, RecyclerView.x xVar) {
        boolean z6 = xVar.f1532g;
        a aVar = this.K;
        if (!z6) {
            int i7 = this.F;
            aVar.getClass();
            return i6 % i7;
        }
        int i8 = this.J.get(i6, -1);
        if (i8 != -1) {
            return i8;
        }
        int iB = sVar.b(i6);
        if (iB != -1) {
            int i9 = this.F;
            aVar.getClass();
            return iB % i9;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i6);
        return 0;
    }

    public final int m1(int i6, RecyclerView.s sVar, RecyclerView.x xVar) {
        boolean z6 = xVar.f1532g;
        a aVar = this.K;
        if (!z6) {
            aVar.getClass();
            return 1;
        }
        int i7 = this.I.get(i6, -1);
        if (i7 != -1) {
            return i7;
        }
        if (sVar.b(i6) != -1) {
            aVar.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i6);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int n(RecyclerView.x xVar) {
        return F0(xVar);
    }

    public final void n1(View view, int i6, boolean z6) {
        int iW;
        int iW2;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f1493b;
        int i7 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i8 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int iJ1 = j1(bVar.f1364e, bVar.f1365f);
        if (this.f1368p == 1) {
            iW2 = RecyclerView.m.w(false, iJ1, i6, i8, ((ViewGroup.MarginLayoutParams) bVar).width);
            iW = RecyclerView.m.w(true, this.f1370r.l(), this.f1483m, i7, ((ViewGroup.MarginLayoutParams) bVar).height);
        } else {
            int iW3 = RecyclerView.m.w(false, iJ1, i6, i7, ((ViewGroup.MarginLayoutParams) bVar).height);
            int iW4 = RecyclerView.m.w(true, this.f1370r.l(), this.f1482l, i8, ((ViewGroup.MarginLayoutParams) bVar).width);
            iW = iW3;
            iW2 = iW4;
        }
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        if (z6 ? y0(view, iW2, iW, nVar) : w0(view, iW2, iW, nVar)) {
            view.measure(iW2, iW);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int o(RecyclerView.x xVar) {
        return G0(xVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int o0(int i6, RecyclerView.s sVar, RecyclerView.x xVar) {
        p1();
        i1();
        return super.o0(i6, sVar, xVar);
    }

    public final void o1(int i6) {
        if (i6 == this.F) {
            return;
        }
        this.E = true;
        if (i6 < 1) {
            throw new IllegalArgumentException(androidx.camera.camera2.internal.compat.workaround.c.d(i6, "Span count should be at least 1. Provided "));
        }
        this.F = i6;
        this.K.b();
        n0();
    }

    public final void p1() {
        int iD;
        int iG;
        if (this.f1368p == 1) {
            iD = this.f1484n - F();
            iG = E();
        } else {
            iD = this.f1485o - D();
            iG = G();
        }
        h1(iD - iG);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int q0(int i6, RecyclerView.s sVar, RecyclerView.x xVar) {
        p1();
        i1();
        return super.q0(i6, sVar, xVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n r() {
        return this.f1368p == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n s(Context context, AttributeSet attributeSet) {
        b bVar = new b(context, attributeSet);
        bVar.f1364e = -1;
        bVar.f1365f = 0;
        return bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            b bVar = new b((ViewGroup.MarginLayoutParams) layoutParams);
            bVar.f1364e = -1;
            bVar.f1365f = 0;
            return bVar;
        }
        b bVar2 = new b(layoutParams);
        bVar2.f1364e = -1;
        bVar2.f1365f = 0;
        return bVar2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void t0(Rect rect, int i6, int i7) {
        int iG;
        int iG2;
        if (this.G == null) {
            super.t0(rect, i6, i7);
        }
        int iF = F() + E();
        int iD = D() + G();
        if (this.f1368p == 1) {
            int iHeight = rect.height() + iD;
            RecyclerView recyclerView = this.f1473b;
            WeakHashMap<View, n0> weakHashMap = f0.f14480a;
            iG2 = RecyclerView.m.g(i7, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.G;
            iG = RecyclerView.m.g(i6, iArr[iArr.length - 1] + iF, this.f1473b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iF;
            RecyclerView recyclerView2 = this.f1473b;
            WeakHashMap<View, n0> weakHashMap2 = f0.f14480a;
            iG = RecyclerView.m.g(i6, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.G;
            iG2 = RecyclerView.m.g(i7, iArr2[iArr2.length - 1] + iD, this.f1473b.getMinimumHeight());
        }
        this.f1473b.setMeasuredDimension(iG, iG2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int x(RecyclerView.s sVar, RecyclerView.x xVar) {
        if (this.f1368p == 1) {
            return this.F;
        }
        if (xVar.b() < 1) {
            return 0;
        }
        return k1(xVar.b() - 1, sVar, xVar) + 1;
    }

    public GridLayoutManager(int i6, int i7) {
        super(1);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new a();
        this.L = new Rect();
        o1(i6);
    }

    public GridLayoutManager(int i6) {
        super(1);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new a();
        this.L = new Rect();
        o1(i6);
    }
}
