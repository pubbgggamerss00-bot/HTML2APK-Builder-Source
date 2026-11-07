package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.core.impl.ImageFormatConstants;
import b0.d;
import b0.e;
import b0.h;
import b0.i;
import b0.j;
import b0.k;
import c0.b;
import c0.l;
import c0.n;
import c0.p;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.ads.dn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static e0.e H;
    public int A;
    public d B;
    public e0.a C;
    public int D;
    public HashMap<String, Integer> E;
    public final SparseArray<b0.e> F;
    public final b G;
    public final SparseArray<View> s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList<c> f742t;

    /* renamed from: u, reason: collision with root package name */
    public final b0.f f743u;

    /* renamed from: v, reason: collision with root package name */
    public int f744v;

    /* renamed from: w, reason: collision with root package name */
    public int f745w;

    /* renamed from: x, reason: collision with root package name */
    public int f746x;

    /* renamed from: y, reason: collision with root package name */
    public int f747y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f748z;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class b implements b.InterfaceC0025b {

        /* renamed from: a, reason: collision with root package name */
        public final ConstraintLayout f790a;

        /* renamed from: b, reason: collision with root package name */
        public int f791b;

        /* renamed from: c, reason: collision with root package name */
        public int f792c;

        /* renamed from: d, reason: collision with root package name */
        public int f793d;

        /* renamed from: e, reason: collision with root package name */
        public int f794e;

        /* renamed from: f, reason: collision with root package name */
        public int f795f;

        /* renamed from: g, reason: collision with root package name */
        public int f796g;

        public b(ConstraintLayout constraintLayout) {
            this.f790a = constraintLayout;
        }

        public static boolean a(int i6, int i7, int i8) {
            if (i6 == i7) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i6);
            int mode2 = View.MeasureSpec.getMode(i7);
            int size = View.MeasureSpec.getSize(i7);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i8 == size;
            }
            return false;
        }

        @SuppressLint({"WrongCall"})
        public final void b(b0.e eVar, b.a aVar) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int iMax;
            boolean z6;
            int measuredWidth;
            int baseline;
            int i6;
            if (eVar == null) {
                return;
            }
            b0.d dVar = eVar.L;
            b0.d dVar2 = eVar.J;
            if (eVar.f1909i0 == 8 && !eVar.F) {
                aVar.f2066e = 0;
                aVar.f2067f = 0;
                aVar.f2068g = 0;
                return;
            }
            if (eVar.V == null) {
                return;
            }
            e0.e eVar2 = ConstraintLayout.H;
            e.a aVar2 = aVar.f2062a;
            e.a aVar3 = aVar.f2063b;
            int i7 = aVar.f2064c;
            int i8 = aVar.f2065d;
            int i9 = this.f791b + this.f792c;
            int i10 = this.f793d;
            View view = eVar.f1907h0;
            int iOrdinal = aVar2.ordinal();
            if (iOrdinal == 0) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
            } else if (iOrdinal == 1) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f795f, i10, -2);
            } else if (iOrdinal == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f795f, i10, -2);
                boolean z7 = eVar.f1925r == 1;
                int i11 = aVar.f2070j;
                if (i11 == 1 || i11 == 2) {
                    boolean z8 = view.getMeasuredHeight() == eVar.k();
                    if (aVar.f2070j == 2 || !z7 || ((z7 && z8) || (view instanceof f) || eVar.A())) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(eVar.q(), 1073741824);
                    }
                }
            } else if (iOrdinal != 3) {
                iMakeMeasureSpec = 0;
            } else {
                int i12 = this.f795f;
                int i13 = dVar2 != null ? dVar2.f1884g : 0;
                if (dVar != null) {
                    i13 += dVar.f1884g;
                }
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i12, i10 + i13, -1);
            }
            int iOrdinal2 = aVar3.ordinal();
            if (iOrdinal2 == 0) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
            } else if (iOrdinal2 == 1) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f796g, i9, -2);
            } else if (iOrdinal2 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f796g, i9, -2);
                boolean z9 = eVar.s == 1;
                int i14 = aVar.f2070j;
                if (i14 == 1 || i14 == 2) {
                    boolean z10 = view.getMeasuredWidth() == eVar.q();
                    if (aVar.f2070j == 2 || !z9 || ((z9 && z10) || (view instanceof f) || eVar.B())) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.k(), 1073741824);
                    }
                }
            } else if (iOrdinal2 != 3) {
                iMakeMeasureSpec2 = 0;
            } else {
                int i15 = this.f796g;
                int i16 = dVar2 != null ? eVar.K.f1884g : 0;
                if (dVar != null) {
                    i16 += eVar.M.f1884g;
                }
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i15, i9 + i16, -1);
            }
            b0.f fVar = (b0.f) eVar.V;
            ConstraintLayout constraintLayout = ConstraintLayout.this;
            if (fVar != null && j.b(constraintLayout.A, 256) && view.getMeasuredWidth() == eVar.q() && view.getMeasuredWidth() < fVar.q() && view.getMeasuredHeight() == eVar.k() && view.getMeasuredHeight() < fVar.k() && view.getBaseline() == eVar.f1898c0 && !eVar.z() && a(eVar.H, iMakeMeasureSpec, eVar.q()) && a(eVar.I, iMakeMeasureSpec2, eVar.k())) {
                aVar.f2066e = eVar.q();
                aVar.f2067f = eVar.k();
                aVar.f2068g = eVar.f1898c0;
                return;
            }
            e.a aVar4 = e.a.f1934u;
            boolean z11 = aVar2 == aVar4;
            boolean z12 = aVar3 == aVar4;
            e.a aVar5 = e.a.s;
            e.a aVar6 = e.a.f1935v;
            boolean z13 = aVar3 == aVar6 || aVar3 == aVar5;
            boolean z14 = aVar2 == aVar6 || aVar2 == aVar5;
            boolean z15 = z11 && eVar.Y > 0.0f;
            boolean z16 = z12 && eVar.Y > 0.0f;
            if (view == null) {
                return;
            }
            a aVar7 = (a) view.getLayoutParams();
            int i17 = aVar.f2070j;
            if (i17 != 1 && i17 != 2 && z11 && eVar.f1925r == 0 && z12 && eVar.s == 0) {
                z6 = false;
                measuredWidth = 0;
                baseline = 0;
                i6 = -1;
                iMax = 0;
            } else {
                if ((view instanceof e0.f) && (eVar instanceof k)) {
                    ((e0.f) view).j((k) eVar, iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                eVar.H = iMakeMeasureSpec;
                eVar.I = iMakeMeasureSpec2;
                eVar.f1905g = false;
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                int baseline2 = view.getBaseline();
                int i18 = eVar.f1927u;
                int iMax2 = i18 > 0 ? Math.max(i18, measuredWidth2) : measuredWidth2;
                int i19 = eVar.f1928v;
                if (i19 > 0) {
                    iMax2 = Math.min(i19, iMax2);
                }
                int i20 = eVar.f1930x;
                iMax = i20 > 0 ? Math.max(i20, measuredHeight) : measuredHeight;
                int i21 = iMakeMeasureSpec2;
                int i22 = eVar.f1931y;
                if (i22 > 0) {
                    iMax = Math.min(i22, iMax);
                }
                if (!j.b(constraintLayout.A, 1)) {
                    if (z15 && z13) {
                        iMax2 = (int) ((iMax * eVar.Y) + 0.5f);
                    } else if (z16 && z14) {
                        iMax = (int) ((iMax2 / eVar.Y) + 0.5f);
                    }
                }
                if (measuredWidth2 == iMax2 && measuredHeight == iMax) {
                    baseline = baseline2;
                    measuredWidth = iMax2;
                    z6 = false;
                } else {
                    if (measuredWidth2 != iMax2) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                    }
                    int iMakeMeasureSpec3 = measuredHeight != iMax ? View.MeasureSpec.makeMeasureSpec(iMax, 1073741824) : i21;
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                    eVar.H = iMakeMeasureSpec;
                    eVar.I = iMakeMeasureSpec3;
                    z6 = false;
                    eVar.f1905g = false;
                    measuredWidth = view.getMeasuredWidth();
                    int measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    iMax = measuredHeight2;
                }
                i6 = -1;
            }
            boolean z17 = baseline != i6 ? true : z6;
            aVar.f2069i = (measuredWidth == aVar.f2064c && iMax == aVar.f2065d) ? z6 : true;
            boolean z18 = aVar7.f754c0 ? true : z17;
            if (z18 && baseline != -1 && eVar.f1898c0 != baseline) {
                aVar.f2069i = true;
            }
            aVar.f2066e = measuredWidth;
            aVar.f2067f = iMax;
            aVar.h = z18;
            aVar.f2068g = baseline;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.s = new SparseArray<>();
        this.f742t = new ArrayList<>(4);
        this.f743u = new b0.f();
        this.f744v = 0;
        this.f745w = 0;
        this.f746x = Integer.MAX_VALUE;
        this.f747y = Integer.MAX_VALUE;
        this.f748z = true;
        this.A = 257;
        this.B = null;
        this.C = null;
        this.D = -1;
        this.E = new HashMap<>();
        this.F = new SparseArray<>();
        this.G = new b(this);
        c(attributeSet, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static e0.e getSharedValues() {
        if (H == null) {
            e0.e eVar = new e0.e();
            new SparseIntArray();
            new HashMap();
            H = eVar;
        }
        return H;
    }

    public final b0.e b(View view) {
        if (view == this) {
            return this.f743u;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof a) {
            return ((a) view.getLayoutParams()).f780q0;
        }
        view.setLayoutParams(new a(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof a) {
            return ((a) view.getLayoutParams()).f780q0;
        }
        return null;
    }

    public final void c(AttributeSet attributeSet, int i6) {
        b0.f fVar = this.f743u;
        fVar.f1907h0 = this;
        b bVar = this.G;
        fVar.f1940v0 = bVar;
        fVar.f1938t0.f2078f = bVar;
        this.s.put(getId(), this);
        this.B = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e0.d.f12765b, i6, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == 16) {
                    this.f744v = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f744v);
                } else if (index == 17) {
                    this.f745w = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f745w);
                } else if (index == 14) {
                    this.f746x = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f746x);
                } else if (index == 15) {
                    this.f747y = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f747y);
                } else if (index == 113) {
                    this.A = typedArrayObtainStyledAttributes.getInt(index, this.A);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            e(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.C = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        d dVar = new d();
                        this.B = dVar;
                        dVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.B = null;
                    }
                    this.D = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        fVar.E0 = this.A;
        z.c.f15392q = fVar.W(AdRequest.MAX_CONTENT_URL_LENGTH);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final boolean d() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) throws NumberFormatException {
        Object tag;
        int size;
        ArrayList<c> arrayList = this.f742t;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                arrayList.get(i6).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i8 = Integer.parseInt(strArrSplit[0]);
                        int i9 = Integer.parseInt(strArrSplit[1]);
                        int i10 = Integer.parseInt(strArrSplit[2]);
                        int i11 = (int) ((i8 / 1080.0f) * width);
                        int i12 = (int) ((i9 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f6 = i11;
                        float f7 = i12;
                        float f8 = i11 + ((int) ((i10 / 1080.0f) * width));
                        canvas.drawLine(f6, f7, f8, f7, paint);
                        float f9 = i12 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f8, f7, f8, f9, paint);
                        canvas.drawLine(f8, f9, f6, f9, paint);
                        canvas.drawLine(f6, f9, f6, f7, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f6, f7, f8, f9, paint);
                        canvas.drawLine(f6, f9, f8, f7, paint);
                    }
                }
            }
        }
    }

    public void e(int i6) {
        this.C = new e0.a(getContext(), this, i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01dc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01de A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(b0.f fVar, int i6, int i7, int i8) {
        int iMax;
        int i9;
        e.a aVar;
        int i10;
        int iMax2;
        int i11;
        e.a aVar2;
        int iQ;
        c0.e eVar;
        int i12;
        int i13;
        boolean z6;
        int i14;
        boolean z7;
        boolean z8;
        boolean z9;
        b0.f fVar2;
        ArrayList<b0.e> arrayList;
        b.InterfaceC0025b interfaceC0025b;
        e.a aVar3;
        e.a aVar4;
        int i15;
        boolean zU;
        int size;
        int i16;
        d.a aVar5;
        d.a aVar6;
        int i17;
        int i18;
        int i19;
        boolean z10;
        int i20;
        boolean z11;
        b.InterfaceC0025b interfaceC0025b2;
        int i21;
        boolean z12;
        l lVar;
        n nVar;
        boolean z13;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean z14;
        boolean z15;
        int mode = View.MeasureSpec.getMode(i7);
        int size2 = View.MeasureSpec.getSize(i7);
        int mode2 = View.MeasureSpec.getMode(i8);
        int size3 = View.MeasureSpec.getSize(i8);
        int iMax3 = Math.max(0, getPaddingTop());
        int iMax4 = Math.max(0, getPaddingBottom());
        int i27 = iMax3 + iMax4;
        int paddingWidth = getPaddingWidth();
        b bVar = this.G;
        bVar.f791b = iMax3;
        bVar.f792c = iMax4;
        bVar.f793d = paddingWidth;
        bVar.f794e = i27;
        bVar.f795f = i7;
        bVar.f796g = i8;
        int iMax5 = Math.max(0, getPaddingStart());
        int iMax6 = Math.max(0, getPaddingEnd());
        if (iMax5 <= 0 && iMax6 <= 0) {
            iMax5 = Math.max(0, getPaddingLeft());
        } else if (d()) {
            iMax5 = iMax6;
        }
        int i28 = size2 - paddingWidth;
        int i29 = size3 - i27;
        int i30 = bVar.f794e;
        int i31 = bVar.f793d;
        int childCount = getChildCount();
        e.a aVar7 = e.a.f1933t;
        e.a aVar8 = e.a.s;
        if (mode == Integer.MIN_VALUE) {
            iMax = childCount == 0 ? Math.max(0, this.f744v) : i28;
        } else {
            if (mode != 0) {
                if (mode != 1073741824) {
                    i9 = i30;
                    iMax = 0;
                } else {
                    iMax = Math.min(this.f746x - i31, i28);
                    i9 = i30;
                }
                i10 = Integer.MIN_VALUE;
                aVar = aVar8;
                if (mode2 != i10) {
                    if (mode2 != 0) {
                        if (mode2 != 1073741824) {
                            i11 = i31;
                            aVar2 = aVar8;
                            iMax2 = 0;
                        } else {
                            iMax2 = Math.min(this.f747y - i9, i29);
                            i11 = i31;
                            aVar2 = aVar8;
                        }
                    } else if (childCount == 0) {
                        i11 = i31;
                        aVar2 = aVar7;
                        iMax2 = Math.max(0, this.f745w);
                    } else {
                        iMax2 = 0;
                    }
                    iQ = fVar.q();
                    eVar = fVar.f1938t0;
                    int[] iArr = fVar.C;
                    if (iMax == iQ || iMax2 != fVar.k()) {
                        eVar.f2075c = true;
                    }
                    fVar.f1894a0 = 0;
                    fVar.f1896b0 = 0;
                    iArr[0] = this.f746x - i11;
                    iArr[1] = this.f747y - i9;
                    fVar.f1900d0 = 0;
                    fVar.f1902e0 = 0;
                    fVar.M(aVar);
                    fVar.O(iMax);
                    fVar.N(aVar2);
                    fVar.L(iMax2);
                    i12 = this.f744v - i11;
                    if (i12 >= 0) {
                        fVar.f1900d0 = 0;
                    } else {
                        fVar.f1900d0 = i12;
                    }
                    i13 = this.f745w - i9;
                    if (i13 >= 0) {
                        fVar.f1902e0 = 0;
                    } else {
                        fVar.f1902e0 = i13;
                    }
                    fVar.f1943y0 = iMax5;
                    fVar.f1944z0 = iMax3;
                    c0.b bVar2 = fVar.f1937s0;
                    b0.f fVar3 = bVar2.f2061c;
                    ArrayList<b0.e> arrayList2 = bVar2.f2059a;
                    b.InterfaceC0025b interfaceC0025b3 = fVar.f1940v0;
                    int size4 = fVar.f1981r0.size();
                    int iQ2 = fVar.q();
                    int iK = fVar.k();
                    boolean zB = j.b(i6, 128);
                    z6 = !zB || j.b(i6, 64);
                    e.a aVar9 = e.a.f1934u;
                    boolean z16 = z6;
                    if (!z6) {
                        int i32 = 0;
                        while (true) {
                            i14 = size4;
                            if (i32 >= size4) {
                                break;
                            }
                            b0.e eVar2 = fVar.f1981r0.get(i32);
                            int i33 = i32;
                            e.a[] aVarArr = eVar2.U;
                            boolean z17 = (aVarArr[0] == aVar9) && (aVarArr[1] == aVar9) && eVar2.Y > 0.0f;
                            if ((eVar2.x() && z17) || ((eVar2.y() && z17) || (eVar2 instanceof k) || eVar2.x() || eVar2.y())) {
                                break;
                            }
                            i32 = i33 + 1;
                            size4 = i14;
                        }
                        z7 = false;
                        z8 = z7 & ((mode == 1073741824 && mode2 == 1073741824) || zB);
                        if (z8) {
                            int iMin = Math.min(iArr[0], i28);
                            int iMin2 = Math.min(iArr[1], i29);
                            int i34 = 1073741824;
                            if (mode == 1073741824) {
                                if (fVar.q() != iMin) {
                                    fVar.O(iMin);
                                    z13 = true;
                                    eVar.f2074b = true;
                                } else {
                                    z13 = true;
                                }
                                i34 = 1073741824;
                            } else {
                                z13 = true;
                            }
                            if (mode2 == i34) {
                                if (fVar.k() != iMin2) {
                                    fVar.L(iMin2);
                                    eVar.f2074b = z13;
                                }
                                i34 = 1073741824;
                            }
                            if (mode == i34 && mode2 == i34) {
                                ArrayList<p> arrayList3 = eVar.f2077e;
                                b0.f fVar4 = eVar.f2073a;
                                if (eVar.f2074b || eVar.f2075c) {
                                    ArrayList<b0.e> arrayList4 = fVar4.f1981r0;
                                    z9 = z8;
                                    int size5 = arrayList4.size();
                                    interfaceC0025b = interfaceC0025b3;
                                    int i35 = 0;
                                    while (i35 < size5) {
                                        int i36 = size5;
                                        b0.e eVar3 = arrayList4.get(i35);
                                        eVar3.h();
                                        eVar3.f1893a = false;
                                        eVar3.f1899d.n();
                                        eVar3.f1901e.m();
                                        i35++;
                                        size5 = i36;
                                    }
                                    fVar4.h();
                                    i24 = 0;
                                    fVar4.f1893a = false;
                                    fVar4.f1899d.n();
                                    fVar4.f1901e.m();
                                    eVar.f2075c = false;
                                } else {
                                    z9 = z8;
                                    interfaceC0025b = interfaceC0025b3;
                                    i24 = 0;
                                }
                                eVar.b(eVar.f2076d);
                                fVar4.f1894a0 = i24;
                                e.a[] aVarArr2 = fVar4.U;
                                fVar4.f1896b0 = i24;
                                e.a aVarJ = fVar4.j(i24);
                                e.a aVarJ2 = fVar4.j(1);
                                if (eVar.f2074b) {
                                    eVar.c();
                                }
                                int iR = fVar4.r();
                                arrayList = arrayList2;
                                int iS = fVar4.s();
                                fVar2 = fVar3;
                                fVar4.f1899d.h.d(iR);
                                fVar4.f1901e.h.d(iS);
                                eVar.g();
                                if (aVarJ == aVar7 || aVarJ2 == aVar7) {
                                    i25 = iS;
                                    if (zB) {
                                        int size6 = arrayList3.size();
                                        i26 = iR;
                                        int i37 = 0;
                                        while (true) {
                                            if (i37 >= size6) {
                                                break;
                                            }
                                            p pVar = arrayList3.get(i37);
                                            i37++;
                                            if (!pVar.k()) {
                                                zB = false;
                                                break;
                                            }
                                        }
                                    } else {
                                        i26 = iR;
                                    }
                                    if (zB && aVarJ == aVar7) {
                                        aVar3 = aVar8;
                                        fVar4.M(aVar3);
                                        z14 = zB;
                                        fVar4.O(eVar.d(fVar4, 0));
                                        fVar4.f1899d.f2115e.d(fVar4.q());
                                    } else {
                                        aVar3 = aVar8;
                                        z14 = zB;
                                    }
                                    if (z14 && aVarJ2 == aVar7) {
                                        fVar4.N(aVar3);
                                        fVar4.L(eVar.d(fVar4, 1));
                                        fVar4.f1901e.f2115e.d(fVar4.k());
                                    }
                                } else {
                                    i25 = iS;
                                    i26 = iR;
                                    aVar3 = aVar8;
                                }
                                e.a aVar10 = aVarArr2[0];
                                e.a aVar11 = e.a.f1935v;
                                if (aVar10 == aVar3 || aVar10 == aVar11) {
                                    int iQ3 = fVar4.q() + i26;
                                    aVar4 = aVar7;
                                    fVar4.f1899d.f2118i.d(iQ3);
                                    fVar4.f1899d.f2115e.d(iQ3 - i26);
                                    eVar.g();
                                    e.a aVar12 = aVarArr2[1];
                                    if (aVar12 == aVar3 || aVar12 == aVar11) {
                                        int iK2 = fVar4.k() + i25;
                                        fVar4.f1901e.f2118i.d(iK2);
                                        fVar4.f1901e.f2115e.d(iK2 - i25);
                                    }
                                    eVar.g();
                                    z15 = true;
                                } else {
                                    aVar4 = aVar7;
                                    z15 = false;
                                }
                                int size7 = arrayList3.size();
                                int i38 = 0;
                                while (i38 < size7) {
                                    p pVar2 = arrayList3.get(i38);
                                    i38++;
                                    p pVar3 = pVar2;
                                    boolean z18 = z15;
                                    if (pVar3.f2112b != fVar4 || pVar3.f2117g) {
                                        pVar3.e();
                                    }
                                    z15 = z18;
                                }
                                boolean z19 = z15;
                                int size8 = arrayList3.size();
                                int i39 = 0;
                                while (i39 < size8) {
                                    p pVar4 = arrayList3.get(i39);
                                    i39++;
                                    p pVar5 = pVar4;
                                    if (z19 || pVar5.f2112b != fVar4) {
                                        if (!pVar5.h.f2088j || ((!pVar5.f2118i.f2088j && !(pVar5 instanceof c0.j)) || (!pVar5.f2115e.f2088j && !(pVar5 instanceof c0.c) && !(pVar5 instanceof c0.j)))) {
                                            zU = false;
                                            break;
                                        }
                                    }
                                }
                                zU = true;
                                fVar4.M(aVarJ);
                                fVar4.N(aVarJ2);
                                i15 = 2;
                                i23 = 1073741824;
                            } else {
                                z9 = z8;
                                fVar2 = fVar3;
                                arrayList = arrayList2;
                                interfaceC0025b = interfaceC0025b3;
                                aVar3 = aVar8;
                                aVar4 = aVar7;
                                b0.f fVar5 = eVar.f2073a;
                                if (eVar.f2074b) {
                                    ArrayList<b0.e> arrayList5 = fVar5.f1981r0;
                                    int i40 = 0;
                                    for (int size9 = arrayList5.size(); i40 < size9; size9 = size9) {
                                        b0.e eVar4 = arrayList5.get(i40);
                                        i40++;
                                        b0.e eVar5 = eVar4;
                                        eVar5.h();
                                        eVar5.f1893a = false;
                                        ArrayList<b0.e> arrayList6 = arrayList5;
                                        l lVar2 = eVar5.f1899d;
                                        lVar2.f2115e.f2088j = false;
                                        lVar2.f2117g = false;
                                        lVar2.n();
                                        n nVar2 = eVar5.f1901e;
                                        nVar2.f2115e.f2088j = false;
                                        nVar2.f2117g = false;
                                        nVar2.m();
                                        arrayList5 = arrayList6;
                                    }
                                    i22 = 0;
                                    fVar5.h();
                                    fVar5.f1893a = false;
                                    l lVar3 = fVar5.f1899d;
                                    lVar3.f2115e.f2088j = false;
                                    lVar3.f2117g = false;
                                    lVar3.n();
                                    n nVar3 = fVar5.f1901e;
                                    nVar3.f2115e.f2088j = false;
                                    nVar3.f2117g = false;
                                    nVar3.m();
                                    eVar.c();
                                } else {
                                    i22 = 0;
                                }
                                eVar.b(eVar.f2076d);
                                fVar5.f1894a0 = i22;
                                fVar5.f1896b0 = i22;
                                fVar5.f1899d.h.d(i22);
                                fVar5.f1901e.h.d(i22);
                                i23 = 1073741824;
                                if (mode == 1073741824) {
                                    zU = fVar.U(i22, zB);
                                    i15 = 1;
                                } else {
                                    i15 = 0;
                                    zU = true;
                                }
                                if (mode2 == 1073741824) {
                                    zU &= fVar.U(1, zB);
                                    i15++;
                                }
                            }
                            if (zU) {
                                fVar.P(mode == i23, mode2 == i23);
                            }
                        } else {
                            z9 = z8;
                            fVar2 = fVar3;
                            arrayList = arrayList2;
                            interfaceC0025b = interfaceC0025b3;
                            aVar3 = aVar8;
                            aVar4 = aVar7;
                            i15 = 0;
                            zU = false;
                        }
                        if (zU || i15 != 2) {
                            int i41 = fVar.E0;
                            if (i14 > 0) {
                                int size10 = fVar.f1981r0.size();
                                boolean zW = fVar.W(64);
                                b.InterfaceC0025b interfaceC0025b4 = fVar.f1940v0;
                                for (int i42 = 0; i42 < size10; i42++) {
                                    b0.e eVar6 = fVar.f1981r0.get(i42);
                                    if (!(eVar6 instanceof h) && !(eVar6 instanceof b0.a) && !eVar6.G && (!zW || (lVar = eVar6.f1899d) == null || (nVar = eVar6.f1901e) == null || !lVar.f2115e.f2088j || !nVar.f2115e.f2088j)) {
                                        e.a aVarJ3 = eVar6.j(0);
                                        e.a aVarJ4 = eVar6.j(1);
                                        boolean z20 = aVarJ3 == aVar9 && eVar6.f1925r != 1 && aVarJ4 == aVar9 && eVar6.s != 1;
                                        if (!z20 && fVar.W(1) && !(eVar6 instanceof k)) {
                                            if (aVarJ3 == aVar9 && eVar6.f1925r == 0 && aVarJ4 != aVar9 && !eVar6.x()) {
                                                z20 = true;
                                            }
                                            if (aVarJ4 == aVar9 && eVar6.s == 0 && aVarJ3 != aVar9 && !eVar6.x()) {
                                                z20 = true;
                                            }
                                            if ((aVarJ3 == aVar9 || aVarJ4 == aVar9) && eVar6.Y > 0.0f) {
                                                z20 = true;
                                            }
                                        }
                                        if (!z20) {
                                            bVar2.a(0, eVar6, interfaceC0025b4);
                                        }
                                    }
                                }
                                ConstraintLayout constraintLayout = ((b) interfaceC0025b4).f790a;
                                int childCount2 = constraintLayout.getChildCount();
                                ArrayList<c> arrayList7 = constraintLayout.f742t;
                                for (int i43 = 0; i43 < childCount2; i43++) {
                                    View childAt = constraintLayout.getChildAt(i43);
                                    if (childAt instanceof f) {
                                        f fVar6 = (f) childAt;
                                        if (fVar6.f915t != null) {
                                            a aVar13 = (a) fVar6.getLayoutParams();
                                            a aVar14 = (a) fVar6.f915t.getLayoutParams();
                                            b0.e eVar7 = aVar14.f780q0;
                                            eVar7.f1909i0 = 0;
                                            b0.e eVar8 = aVar13.f780q0;
                                            if (eVar8.U[0] != aVar3) {
                                                eVar8.O(eVar7.q());
                                            }
                                            b0.e eVar9 = aVar13.f780q0;
                                            if (eVar9.U[1] != aVar3) {
                                                eVar9.L(aVar14.f780q0.k());
                                            }
                                            aVar14.f780q0.f1909i0 = 8;
                                        }
                                    }
                                }
                                int size11 = arrayList7.size();
                                if (size11 > 0) {
                                    for (int i44 = 0; i44 < size11; i44++) {
                                        arrayList7.get(i44).getClass();
                                    }
                                }
                            }
                            bVar2.c(fVar);
                            size = arrayList.size();
                            if (i14 > 0) {
                                bVar2.b(fVar, 0, iQ2, iK);
                            }
                            if (size > 0) {
                                e.a[] aVarArr3 = fVar.U;
                                e.a aVar15 = aVar4;
                                boolean z21 = aVarArr3[0] == aVar15;
                                boolean z22 = aVarArr3[1] == aVar15;
                                b0.f fVar7 = fVar2;
                                int iMax7 = Math.max(fVar.q(), fVar7.f1900d0);
                                int iMax8 = Math.max(fVar.k(), fVar7.f1902e0);
                                int i45 = 0;
                                boolean z23 = false;
                                while (true) {
                                    aVar5 = d.a.f1888v;
                                    aVar6 = d.a.f1887u;
                                    if (i45 >= size) {
                                        break;
                                    }
                                    ArrayList<b0.e> arrayList8 = arrayList;
                                    b0.e eVar10 = arrayList8.get(i45);
                                    boolean z24 = z21;
                                    if (eVar10 instanceof k) {
                                        int iQ4 = eVar10.q();
                                        i20 = i45;
                                        int iK3 = eVar10.k();
                                        z11 = z22;
                                        interfaceC0025b2 = interfaceC0025b;
                                        boolean zA = z23 | bVar2.a(1, eVar10, interfaceC0025b2);
                                        int iQ5 = eVar10.q();
                                        i21 = i41;
                                        int iK4 = eVar10.k();
                                        if (iQ5 != iQ4) {
                                            eVar10.O(iQ5);
                                            if (z24 && eVar10.r() + eVar10.W > iMax7) {
                                                iMax7 = Math.max(iMax7, eVar10.i(aVar6).e() + eVar10.r() + eVar10.W);
                                            }
                                            z12 = true;
                                        } else {
                                            z12 = zA;
                                        }
                                        if (iK4 != iK3) {
                                            eVar10.L(iK4);
                                            if (z11 && eVar10.s() + eVar10.X > iMax8) {
                                                iMax8 = Math.max(iMax8, eVar10.i(aVar5).e() + eVar10.s() + eVar10.X);
                                            }
                                            z12 = true;
                                        }
                                        z23 = ((k) eVar10).f1980z0 | z12;
                                    } else {
                                        i21 = i41;
                                        i20 = i45;
                                        z11 = z22;
                                        interfaceC0025b2 = interfaceC0025b;
                                    }
                                    i45 = i20 + 1;
                                    z21 = z24;
                                    interfaceC0025b = interfaceC0025b2;
                                    arrayList = arrayList8;
                                    z22 = z11;
                                    i41 = i21;
                                }
                                int i46 = i41;
                                boolean z25 = z21;
                                boolean z26 = z22;
                                boolean z27 = z23;
                                b.InterfaceC0025b interfaceC0025b5 = interfaceC0025b;
                                ArrayList<b0.e> arrayList9 = arrayList;
                                int i47 = 0;
                                while (i47 < 2) {
                                    int i48 = 0;
                                    while (i48 < size) {
                                        b0.e eVar11 = arrayList9.get(i48);
                                        if ((!(eVar11 instanceof i) || (eVar11 instanceof k)) && !(eVar11 instanceof h)) {
                                            if (eVar11.f1909i0 != 8 && ((!z9 || !eVar11.f1899d.f2115e.f2088j || !eVar11.f1901e.f2115e.f2088j) && !(eVar11 instanceof k))) {
                                                int iQ6 = eVar11.q();
                                                int iK5 = eVar11.k();
                                                i17 = size;
                                                int i49 = eVar11.f1898c0;
                                                i18 = i48;
                                                boolean zA2 = z27 | bVar2.a(i47 == 1 ? 2 : 1, eVar11, interfaceC0025b5);
                                                i19 = i47;
                                                int iQ7 = eVar11.q();
                                                boolean z28 = zA2;
                                                int iK6 = eVar11.k();
                                                if (iQ7 != iQ6) {
                                                    eVar11.O(iQ7);
                                                    if (z25 && eVar11.r() + eVar11.W > iMax7) {
                                                        iMax7 = Math.max(iMax7, eVar11.i(aVar6).e() + eVar11.r() + eVar11.W);
                                                    }
                                                    z28 = true;
                                                }
                                                if (iK6 != iK5) {
                                                    eVar11.L(iK6);
                                                    if (z26 && eVar11.s() + eVar11.X > iMax8) {
                                                        iMax8 = Math.max(iMax8, eVar11.i(aVar5).e() + eVar11.s() + eVar11.X);
                                                    }
                                                    z10 = true;
                                                } else {
                                                    z10 = z28;
                                                }
                                                z27 = (!eVar11.E || i49 == eVar11.f1898c0) ? z10 : true;
                                            }
                                            i48 = i18 + 1;
                                            size = i17;
                                            i47 = i19;
                                        }
                                        i17 = size;
                                        i19 = i47;
                                        i18 = i48;
                                        i48 = i18 + 1;
                                        size = i17;
                                        i47 = i19;
                                    }
                                    int i50 = size;
                                    int i51 = i47;
                                    if (!z27) {
                                        break;
                                    }
                                    i47 = i51 + 1;
                                    bVar2.b(fVar, i47, iQ2, iK);
                                    size = i50;
                                    z27 = false;
                                }
                                i16 = i46;
                            } else {
                                i16 = i41;
                            }
                            fVar.E0 = i16;
                            z.c.f15392q = fVar.W(AdRequest.MAX_CONTENT_URL_LENGTH);
                        }
                        return;
                    }
                    i14 = size4;
                    z7 = z16;
                    z8 = z7 & ((mode == 1073741824 && mode2 == 1073741824) || zB);
                    if (z8) {
                    }
                    if (zU) {
                    }
                    int i412 = fVar.E0;
                    if (i14 > 0) {
                    }
                    bVar2.c(fVar);
                    size = arrayList.size();
                    if (i14 > 0) {
                    }
                    if (size > 0) {
                    }
                    fVar.E0 = i16;
                    z.c.f15392q = fVar.W(AdRequest.MAX_CONTENT_URL_LENGTH);
                }
                iMax2 = childCount == 0 ? Math.max(0, this.f745w) : i29;
                i11 = i31;
                aVar2 = aVar7;
                iQ = fVar.q();
                eVar = fVar.f1938t0;
                int[] iArr2 = fVar.C;
                if (iMax == iQ) {
                    eVar.f2075c = true;
                }
                fVar.f1894a0 = 0;
                fVar.f1896b0 = 0;
                iArr2[0] = this.f746x - i11;
                iArr2[1] = this.f747y - i9;
                fVar.f1900d0 = 0;
                fVar.f1902e0 = 0;
                fVar.M(aVar);
                fVar.O(iMax);
                fVar.N(aVar2);
                fVar.L(iMax2);
                i12 = this.f744v - i11;
                if (i12 >= 0) {
                }
                i13 = this.f745w - i9;
                if (i13 >= 0) {
                }
                fVar.f1943y0 = iMax5;
                fVar.f1944z0 = iMax3;
                c0.b bVar22 = fVar.f1937s0;
                b0.f fVar32 = bVar22.f2061c;
                ArrayList<b0.e> arrayList22 = bVar22.f2059a;
                b.InterfaceC0025b interfaceC0025b32 = fVar.f1940v0;
                int size42 = fVar.f1981r0.size();
                int iQ22 = fVar.q();
                int iK7 = fVar.k();
                boolean zB2 = j.b(i6, 128);
                if (zB2) {
                }
                e.a aVar92 = e.a.f1934u;
                boolean z162 = z6;
                if (!z6) {
                }
                z7 = z162;
                z8 = z7 & ((mode == 1073741824 && mode2 == 1073741824) || zB2);
                if (z8) {
                }
                if (zU) {
                }
                int i4122 = fVar.E0;
                if (i14 > 0) {
                }
                bVar22.c(fVar);
                size = arrayList.size();
                if (i14 > 0) {
                }
                if (size > 0) {
                }
                fVar.E0 = i16;
                z.c.f15392q = fVar.W(AdRequest.MAX_CONTENT_URL_LENGTH);
            }
            if (childCount == 0) {
                i9 = i30;
                aVar = aVar7;
                iMax = Math.max(0, this.f744v);
                i10 = Integer.MIN_VALUE;
                if (mode2 != i10) {
                }
                i11 = i31;
                aVar2 = aVar7;
                iQ = fVar.q();
                eVar = fVar.f1938t0;
                int[] iArr22 = fVar.C;
                if (iMax == iQ) {
                }
                fVar.f1894a0 = 0;
                fVar.f1896b0 = 0;
                iArr22[0] = this.f746x - i11;
                iArr22[1] = this.f747y - i9;
                fVar.f1900d0 = 0;
                fVar.f1902e0 = 0;
                fVar.M(aVar);
                fVar.O(iMax);
                fVar.N(aVar2);
                fVar.L(iMax2);
                i12 = this.f744v - i11;
                if (i12 >= 0) {
                }
                i13 = this.f745w - i9;
                if (i13 >= 0) {
                }
                fVar.f1943y0 = iMax5;
                fVar.f1944z0 = iMax3;
                c0.b bVar222 = fVar.f1937s0;
                b0.f fVar322 = bVar222.f2061c;
                ArrayList<b0.e> arrayList222 = bVar222.f2059a;
                b.InterfaceC0025b interfaceC0025b322 = fVar.f1940v0;
                int size422 = fVar.f1981r0.size();
                int iQ222 = fVar.q();
                int iK72 = fVar.k();
                boolean zB22 = j.b(i6, 128);
                if (zB22) {
                }
                e.a aVar922 = e.a.f1934u;
                boolean z1622 = z6;
                if (!z6) {
                }
                z7 = z1622;
                z8 = z7 & ((mode == 1073741824 && mode2 == 1073741824) || zB22);
                if (z8) {
                }
                if (zU) {
                }
                int i41222 = fVar.E0;
                if (i14 > 0) {
                }
                bVar222.c(fVar);
                size = arrayList.size();
                if (i14 > 0) {
                }
                if (size > 0) {
                }
                fVar.E0 = i16;
                z.c.f15392q = fVar.W(AdRequest.MAX_CONTENT_URL_LENGTH);
            }
            iMax = 0;
        }
        i9 = i30;
        aVar = aVar7;
        i10 = Integer.MIN_VALUE;
        if (mode2 != i10) {
        }
        i11 = i31;
        aVar2 = aVar7;
        iQ = fVar.q();
        eVar = fVar.f1938t0;
        int[] iArr222 = fVar.C;
        if (iMax == iQ) {
        }
        fVar.f1894a0 = 0;
        fVar.f1896b0 = 0;
        iArr222[0] = this.f746x - i11;
        iArr222[1] = this.f747y - i9;
        fVar.f1900d0 = 0;
        fVar.f1902e0 = 0;
        fVar.M(aVar);
        fVar.O(iMax);
        fVar.N(aVar2);
        fVar.L(iMax2);
        i12 = this.f744v - i11;
        if (i12 >= 0) {
        }
        i13 = this.f745w - i9;
        if (i13 >= 0) {
        }
        fVar.f1943y0 = iMax5;
        fVar.f1944z0 = iMax3;
        c0.b bVar2222 = fVar.f1937s0;
        b0.f fVar3222 = bVar2222.f2061c;
        ArrayList<b0.e> arrayList2222 = bVar2222.f2059a;
        b.InterfaceC0025b interfaceC0025b3222 = fVar.f1940v0;
        int size4222 = fVar.f1981r0.size();
        int iQ2222 = fVar.q();
        int iK722 = fVar.k();
        boolean zB222 = j.b(i6, 128);
        if (zB222) {
        }
        e.a aVar9222 = e.a.f1934u;
        boolean z16222 = z6;
        if (!z6) {
        }
        z7 = z16222;
        z8 = z7 & ((mode == 1073741824 && mode2 == 1073741824) || zB222);
        if (z8) {
        }
        if (zU) {
        }
        int i412222 = fVar.E0;
        if (i14 > 0) {
        }
        bVar2222.c(fVar);
        size = arrayList.size();
        if (i14 > 0) {
        }
        if (size > 0) {
        }
        fVar.E0 = i16;
        z.c.f15392q = fVar.W(AdRequest.MAX_CONTENT_URL_LENGTH);
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f748z = true;
        super.forceLayout();
    }

    public final void g(b0.e eVar, a aVar, SparseArray<b0.e> sparseArray, int i6, d.a aVar2) {
        View view = this.s.get(i6);
        b0.e eVar2 = sparseArray.get(i6);
        if (eVar2 == null || view == null || !(view.getLayoutParams() instanceof a)) {
            return;
        }
        aVar.f754c0 = true;
        d.a aVar3 = d.a.f1889w;
        if (aVar2 == aVar3) {
            a aVar4 = (a) view.getLayoutParams();
            aVar4.f754c0 = true;
            aVar4.f780q0.E = true;
        }
        eVar.i(aVar3).b(eVar2.i(aVar2), aVar.D, aVar.C, true);
        eVar.E = true;
        eVar.i(d.a.f1886t).j();
        eVar.i(d.a.f1888v).j();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.f747y;
    }

    public int getMaxWidth() {
        return this.f746x;
    }

    public int getMinHeight() {
        return this.f745w;
    }

    public int getMinWidth() {
        return this.f744v;
    }

    public int getOptimizationLevel() {
        return this.f743u.E0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        b0.f fVar = this.f743u;
        if (fVar.f1910j == null) {
            int id2 = getId();
            if (id2 != -1) {
                fVar.f1910j = getContext().getResources().getResourceEntryName(id2);
            } else {
                fVar.f1910j = "parent";
            }
        }
        if (fVar.f1911j0 == null) {
            fVar.f1911j0 = fVar.f1910j;
            Log.v("ConstraintLayout", " setDebugName " + fVar.f1911j0);
        }
        ArrayList<b0.e> arrayList = fVar.f1981r0;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            b0.e eVar = arrayList.get(i6);
            i6++;
            b0.e eVar2 = eVar;
            View view = eVar2.f1907h0;
            if (view != null) {
                if (eVar2.f1910j == null && (id = view.getId()) != -1) {
                    eVar2.f1910j = getContext().getResources().getResourceEntryName(id);
                }
                if (eVar2.f1911j0 == null) {
                    eVar2.f1911j0 = eVar2.f1910j;
                    Log.v("ConstraintLayout", " setDebugName " + eVar2.f1911j0);
                }
            }
        }
        fVar.n(sb);
        return sb.toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            a aVar = (a) childAt.getLayoutParams();
            b0.e eVar = aVar.f780q0;
            if ((childAt.getVisibility() != 8 || aVar.f756d0 || aVar.f758e0 || zIsInEditMode) && !aVar.f760f0) {
                int iR = eVar.r();
                int iS = eVar.s();
                int iQ = eVar.q() + iR;
                int iK = eVar.k() + iS;
                childAt.layout(iR, iS, iQ, iK);
                if ((childAt instanceof f) && (content = ((f) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iR, iS, iQ, iK);
                }
            }
        }
        ArrayList<c> arrayList = this.f742t;
        int size = arrayList.size();
        if (size > 0) {
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.get(i11).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x05ae  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i6, int i7) throws Resources.NotFoundException, NumberFormatException {
        boolean z6;
        int i8;
        boolean z7;
        b0.e eVar;
        d.a aVar;
        b0.e eVar2;
        d.a aVar2;
        d.a aVar3;
        d.a aVar4;
        b0.e eVar3;
        d.a aVar5;
        int i9;
        int i10;
        d.a aVar6;
        d.a aVar7;
        b0.e eVar4;
        int i11;
        d.a aVar8;
        b0.e eVar5;
        a aVar9;
        int i12;
        b0.e eVar6;
        d.a aVar10;
        float f6;
        d.a aVar11;
        SparseArray<b0.e> sparseArray;
        boolean z8;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        float fAbs;
        int i18;
        char c7;
        SparseArray<View> sparseArray2;
        ArrayList<c> arrayList;
        ArrayList<c> arrayList2;
        SparseArray<View> sparseArray3;
        String str;
        int iF;
        boolean z9;
        b0.e eVar7;
        ConstraintLayout constraintLayout = this;
        boolean z10 = constraintLayout.f748z;
        constraintLayout.f748z = z10;
        boolean z11 = true;
        int i19 = 0;
        if (!z10) {
            int childCount = constraintLayout.getChildCount();
            int i20 = 0;
            while (true) {
                if (i20 >= childCount) {
                    break;
                }
                if (constraintLayout.getChildAt(i20).isLayoutRequested()) {
                    constraintLayout.f748z = true;
                    break;
                }
                i20++;
            }
        }
        boolean zD = constraintLayout.d();
        b0.f fVar = constraintLayout.f743u;
        fVar.f1941w0 = zD;
        if (constraintLayout.f748z) {
            constraintLayout.f748z = false;
            int childCount2 = constraintLayout.getChildCount();
            int i21 = 0;
            while (true) {
                if (i21 >= childCount2) {
                    z6 = false;
                    break;
                } else {
                    if (constraintLayout.getChildAt(i21).isLayoutRequested()) {
                        z6 = true;
                        break;
                    }
                    i21++;
                }
            }
            if (z6) {
                boolean zIsInEditMode = constraintLayout.isInEditMode();
                int childCount3 = constraintLayout.getChildCount();
                for (int i22 = 0; i22 < childCount3; i22++) {
                    b0.e eVarB = constraintLayout.b(constraintLayout.getChildAt(i22));
                    if (eVarB != null) {
                        eVarB.C();
                    }
                }
                SparseArray<View> sparseArray4 = constraintLayout.s;
                if (zIsInEditMode) {
                    int i23 = 0;
                    while (i23 < childCount3) {
                        View childAt = constraintLayout.getChildAt(i23);
                        try {
                            String resourceName = constraintLayout.getResources().getResourceName(childAt.getId());
                            Integer numValueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                z9 = z11;
                                try {
                                    if (constraintLayout.E == null) {
                                        constraintLayout.E = new HashMap<>();
                                    }
                                    int iIndexOf = resourceName.indexOf("/");
                                    constraintLayout.E.put(iIndexOf != -1 ? resourceName.substring(iIndexOf + 1) : resourceName, numValueOf);
                                } catch (Resources.NotFoundException unused) {
                                }
                            } else {
                                z9 = z11;
                            }
                            int iIndexOf2 = resourceName.indexOf(47);
                            if (iIndexOf2 != -1) {
                                resourceName = resourceName.substring(iIndexOf2 + 1);
                            }
                            int id = childAt.getId();
                            if (id != 0) {
                                View viewFindViewById = sparseArray4.get(id);
                                if (viewFindViewById == null && (viewFindViewById = constraintLayout.findViewById(id)) != null && viewFindViewById != constraintLayout && viewFindViewById.getParent() == constraintLayout) {
                                    constraintLayout.onViewAdded(viewFindViewById);
                                }
                                if (viewFindViewById == constraintLayout) {
                                    eVar7 = fVar;
                                    eVar7.f1911j0 = resourceName;
                                } else {
                                    eVar7 = viewFindViewById == null ? null : ((a) viewFindViewById.getLayoutParams()).f780q0;
                                    eVar7.f1911j0 = resourceName;
                                }
                            } else {
                                eVar7 = fVar;
                                eVar7.f1911j0 = resourceName;
                            }
                        } catch (Resources.NotFoundException unused2) {
                            z9 = z11;
                        }
                        i23++;
                        z11 = z9;
                    }
                }
                boolean z12 = z11;
                if (constraintLayout.D != -1) {
                    for (int i24 = 0; i24 < childCount3; i24++) {
                        View childAt2 = constraintLayout.getChildAt(i24);
                        if (childAt2.getId() == constraintLayout.D && (childAt2 instanceof e)) {
                            constraintLayout.B = ((e) childAt2).getConstraintSet();
                        }
                    }
                }
                d dVar = constraintLayout.B;
                if (dVar != null) {
                    dVar.a(constraintLayout);
                }
                fVar.f1981r0.clear();
                ArrayList<c> arrayList3 = constraintLayout.f742t;
                int size = arrayList3.size();
                if (size > 0) {
                    int i25 = 0;
                    while (i25 < size) {
                        c cVar = arrayList3.get(i25);
                        HashMap<Integer, String> map = cVar.f817z;
                        if (cVar.isInEditMode()) {
                            cVar.setIds(cVar.f814w);
                        }
                        i iVar = cVar.f813v;
                        if (iVar == null) {
                            sparseArray2 = sparseArray4;
                            arrayList = arrayList3;
                        } else {
                            iVar.f1972s0 = i19;
                            Arrays.fill(iVar.f1971r0, (Object) null);
                            int i26 = 0;
                            while (i26 < cVar.f811t) {
                                int i27 = cVar.s[i26];
                                View view = sparseArray4.get(i27);
                                if (view != null || (iF = cVar.f(constraintLayout, (str = map.get(Integer.valueOf(i27))))) == 0) {
                                    arrayList2 = arrayList3;
                                } else {
                                    arrayList2 = arrayList3;
                                    cVar.s[i26] = iF;
                                    map.put(Integer.valueOf(iF), str);
                                    view = sparseArray4.get(iF);
                                }
                                View view2 = view;
                                if (view2 != null) {
                                    i iVar2 = cVar.f813v;
                                    b0.e eVarB2 = constraintLayout.b(view2);
                                    iVar2.getClass();
                                    if (eVarB2 == iVar2 || eVarB2 == null) {
                                        sparseArray3 = sparseArray4;
                                    } else {
                                        int i28 = iVar2.f1972s0 + 1;
                                        sparseArray3 = sparseArray4;
                                        b0.e[] eVarArr = iVar2.f1971r0;
                                        if (i28 > eVarArr.length) {
                                            iVar2.f1971r0 = (b0.e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
                                        }
                                        b0.e[] eVarArr2 = iVar2.f1971r0;
                                        int i29 = iVar2.f1972s0;
                                        eVarArr2[i29] = eVarB2;
                                        iVar2.f1972s0 = i29 + 1;
                                    }
                                }
                                i26++;
                                sparseArray4 = sparseArray3;
                                arrayList3 = arrayList2;
                            }
                            sparseArray2 = sparseArray4;
                            arrayList = arrayList3;
                            cVar.f813v.S();
                        }
                        i25++;
                        sparseArray4 = sparseArray2;
                        arrayList3 = arrayList;
                        i19 = 0;
                    }
                }
                int i30 = 2;
                int i31 = 0;
                while (i31 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i31);
                    if (childAt3 instanceof f) {
                        f fVar2 = (f) childAt3;
                        if (fVar2.s == -1 && !fVar2.isInEditMode()) {
                            fVar2.setVisibility(fVar2.f916u);
                        }
                        View viewFindViewById2 = constraintLayout.findViewById(fVar2.s);
                        fVar2.f915t = viewFindViewById2;
                        if (viewFindViewById2 != null) {
                            ((a) viewFindViewById2.getLayoutParams()).f760f0 = z12;
                            fVar2.f915t.setVisibility(0);
                            fVar2.setVisibility(0);
                        }
                    }
                    i31++;
                    z12 = true;
                }
                SparseArray<b0.e> sparseArray5 = constraintLayout.F;
                sparseArray5.clear();
                sparseArray5.put(0, fVar);
                sparseArray5.put(constraintLayout.getId(), fVar);
                for (int i32 = 0; i32 < childCount3; i32++) {
                    View childAt4 = constraintLayout.getChildAt(i32);
                    sparseArray5.put(childAt4.getId(), constraintLayout.b(childAt4));
                }
                int i33 = 0;
                while (i33 < childCount3) {
                    View childAt5 = constraintLayout.getChildAt(i33);
                    b0.e eVarB3 = constraintLayout.b(childAt5);
                    if (eVarB3 == null) {
                        sparseArray = sparseArray5;
                        i8 = i33;
                        z7 = z6;
                        z8 = zIsInEditMode;
                        i13 = childCount3;
                        i15 = i30;
                    } else {
                        a aVar12 = (a) childAt5.getLayoutParams();
                        fVar.f1981r0.add(eVarB3);
                        b0.e eVar8 = eVarB3.V;
                        if (eVar8 != null) {
                            ((b0.l) eVar8).f1981r0.remove(eVarB3);
                            eVarB3.C();
                        }
                        eVarB3.V = fVar;
                        aVar12.a();
                        eVarB3.f1909i0 = childAt5.getVisibility();
                        if (aVar12.f760f0) {
                            eVarB3.F = true;
                            eVarB3.f1909i0 = 8;
                        }
                        eVarB3.f1907h0 = childAt5;
                        if (childAt5 instanceof c) {
                            ((c) childAt5).h(eVarB3, fVar.f1941w0);
                        }
                        if (aVar12.f756d0) {
                            h hVar = (h) eVarB3;
                            int i34 = aVar12.f775n0;
                            int i35 = aVar12.f777o0;
                            float f7 = aVar12.p0;
                            if (f7 != -1.0f) {
                                if (f7 > -1.0f) {
                                    hVar.f1965r0 = f7;
                                    c7 = 65535;
                                    hVar.f1966s0 = -1;
                                    hVar.f1967t0 = -1;
                                    sparseArray = sparseArray5;
                                    i8 = i33;
                                    z7 = z6;
                                    z8 = zIsInEditMode;
                                    i13 = childCount3;
                                    i15 = i30;
                                }
                                sparseArray = sparseArray5;
                                i8 = i33;
                                z7 = z6;
                                z8 = zIsInEditMode;
                                i13 = childCount3;
                                i15 = i30;
                            } else {
                                c7 = 65535;
                                if (i34 != -1) {
                                    if (i34 > -1) {
                                        hVar.f1965r0 = -1.0f;
                                        hVar.f1966s0 = i34;
                                        hVar.f1967t0 = -1;
                                    }
                                } else if (i35 != -1 && i35 > -1) {
                                    hVar.f1965r0 = -1.0f;
                                    hVar.f1966s0 = -1;
                                    hVar.f1967t0 = i35;
                                    sparseArray = sparseArray5;
                                    i8 = i33;
                                    z7 = z6;
                                    z8 = zIsInEditMode;
                                    i13 = childCount3;
                                    i15 = i30;
                                }
                                sparseArray = sparseArray5;
                                i8 = i33;
                                z7 = z6;
                                z8 = zIsInEditMode;
                                i13 = childCount3;
                                i15 = i30;
                            }
                        } else {
                            int i36 = aVar12.f762g0;
                            int i37 = aVar12.f763h0;
                            int i38 = aVar12.f765i0;
                            int i39 = aVar12.f767j0;
                            int i40 = aVar12.f769k0;
                            int i41 = aVar12.f771l0;
                            i8 = i33;
                            float f8 = aVar12.f773m0;
                            int i42 = aVar12.f778p;
                            d.a aVar13 = d.a.f1887u;
                            d.a aVar14 = d.a.s;
                            z7 = z6;
                            d.a aVar15 = d.a.f1888v;
                            d.a aVar16 = d.a.f1886t;
                            if (i42 != -1) {
                                b0.e eVar9 = sparseArray5.get(i42);
                                if (eVar9 != null) {
                                    float f9 = aVar12.f781r;
                                    int i43 = aVar12.f779q;
                                    d.a aVar17 = d.a.f1890x;
                                    eVarB3.v(aVar17, eVar9, aVar17, i43, 0);
                                    eVarB3.D = f9;
                                }
                                constraintLayout = this;
                                eVar6 = eVarB3;
                                aVar9 = aVar12;
                                aVar5 = aVar13;
                                aVar4 = aVar14;
                                aVar10 = aVar15;
                                aVar8 = aVar16;
                            } else {
                                if (i36 != -1) {
                                    b0.e eVar10 = sparseArray5.get(i36);
                                    if (eVar10 != null) {
                                        eVar = eVarB3;
                                        aVar = aVar14;
                                        eVar.v(aVar, eVar10, aVar14, ((ViewGroup.MarginLayoutParams) aVar12).leftMargin, i40);
                                    } else {
                                        eVar = eVarB3;
                                        aVar = aVar14;
                                    }
                                } else {
                                    eVar = eVarB3;
                                    aVar = aVar14;
                                    if (i37 != -1 && (eVar2 = sparseArray5.get(i37)) != null) {
                                        eVar.v(aVar, eVar2, aVar13, ((ViewGroup.MarginLayoutParams) aVar12).leftMargin, i40);
                                        aVar2 = aVar;
                                        aVar3 = aVar13;
                                    }
                                    if (i38 == -1) {
                                        b0.e eVar11 = sparseArray5.get(i38);
                                        if (eVar11 != null) {
                                            eVar.v(aVar3, eVar11, aVar2, ((ViewGroup.MarginLayoutParams) aVar12).rightMargin, i41);
                                        }
                                        aVar4 = aVar2;
                                    } else {
                                        aVar4 = aVar2;
                                        if (i39 != -1 && (eVar3 = sparseArray5.get(i39)) != null) {
                                            eVar.v(aVar3, eVar3, aVar3, ((ViewGroup.MarginLayoutParams) aVar12).rightMargin, i41);
                                        }
                                    }
                                    aVar5 = aVar3;
                                    i9 = aVar12.f764i;
                                    if (i9 == -1) {
                                        b0.e eVar12 = sparseArray5.get(i9);
                                        if (eVar12 != null) {
                                            aVar11 = aVar16;
                                            eVar.v(aVar11, eVar12, aVar16, ((ViewGroup.MarginLayoutParams) aVar12).topMargin, aVar12.f786x);
                                        } else {
                                            aVar11 = aVar16;
                                        }
                                        aVar6 = aVar11;
                                        aVar7 = aVar15;
                                        i10 = -1;
                                    } else {
                                        int i44 = aVar12.f766j;
                                        i10 = -1;
                                        if (i44 == -1 || (eVar4 = sparseArray5.get(i44)) == null) {
                                            aVar6 = aVar16;
                                            aVar7 = aVar15;
                                        } else {
                                            eVar.v(aVar16, eVar4, aVar15, ((ViewGroup.MarginLayoutParams) aVar12).topMargin, aVar12.f786x);
                                            aVar6 = aVar16;
                                            aVar7 = aVar15;
                                        }
                                    }
                                    i11 = aVar12.f768k;
                                    if (i11 == i10) {
                                        b0.e eVar13 = sparseArray5.get(i11);
                                        if (eVar13 != null) {
                                            d.a aVar18 = aVar6;
                                            eVar.v(aVar7, eVar13, aVar18, ((ViewGroup.MarginLayoutParams) aVar12).bottomMargin, aVar12.f788z);
                                            aVar8 = aVar18;
                                        } else {
                                            aVar8 = aVar6;
                                        }
                                    } else {
                                        aVar8 = aVar6;
                                        int i45 = aVar12.f770l;
                                        if (i45 != i10 && (eVar5 = sparseArray5.get(i45)) != null) {
                                            eVar.v(aVar7, eVar5, aVar7, ((ViewGroup.MarginLayoutParams) aVar12).bottomMargin, aVar12.f788z);
                                        }
                                    }
                                    aVar9 = aVar12;
                                    i12 = aVar9.f772m;
                                    if (i12 == -1) {
                                        constraintLayout = this;
                                        eVar6 = eVar;
                                        constraintLayout.g(eVar6, aVar9, sparseArray5, i12, d.a.f1889w);
                                    } else {
                                        int i46 = aVar9.f774n;
                                        if (i46 != -1) {
                                            constraintLayout = this;
                                            eVar6 = eVar;
                                            constraintLayout.g(eVar6, aVar9, sparseArray5, i46, aVar8);
                                        } else {
                                            int i47 = aVar9.f776o;
                                            constraintLayout = this;
                                            eVar6 = eVar;
                                            aVar10 = aVar7;
                                            if (i47 != -1) {
                                                constraintLayout.g(eVar6, aVar9, sparseArray5, i47, aVar10);
                                            }
                                            if (f8 >= 0.0f) {
                                                eVar6.f1904f0 = f8;
                                            }
                                            f6 = aVar9.F;
                                            if (f6 >= 0.0f) {
                                                eVar6.f1906g0 = f6;
                                            }
                                        }
                                    }
                                    aVar10 = aVar7;
                                    if (f8 >= 0.0f) {
                                    }
                                    f6 = aVar9.F;
                                    if (f6 >= 0.0f) {
                                    }
                                }
                                aVar2 = aVar;
                                aVar3 = aVar13;
                                if (i38 == -1) {
                                }
                                aVar5 = aVar3;
                                i9 = aVar12.f764i;
                                if (i9 == -1) {
                                }
                                i11 = aVar12.f768k;
                                if (i11 == i10) {
                                }
                                aVar9 = aVar12;
                                i12 = aVar9.f772m;
                                if (i12 == -1) {
                                }
                                aVar10 = aVar7;
                                if (f8 >= 0.0f) {
                                }
                                f6 = aVar9.F;
                                if (f6 >= 0.0f) {
                                }
                            }
                            if (zIsInEditMode && ((i18 = aVar9.T) != -1 || aVar9.U != -1)) {
                                int i48 = aVar9.U;
                                eVar6.f1894a0 = i18;
                                eVar6.f1896b0 = i48;
                            }
                            boolean z13 = aVar9.f750a0;
                            e.a aVar19 = e.a.f1933t;
                            e.a aVar20 = e.a.s;
                            sparseArray = sparseArray5;
                            e.a aVar21 = e.a.f1935v;
                            e.a aVar22 = e.a.f1934u;
                            if (z13) {
                                z8 = zIsInEditMode;
                                i13 = childCount3;
                                eVar6.M(aVar20);
                                eVar6.O(((ViewGroup.MarginLayoutParams) aVar9).width);
                                if (((ViewGroup.MarginLayoutParams) aVar9).width == -2) {
                                    eVar6.M(aVar19);
                                }
                            } else {
                                z8 = zIsInEditMode;
                                i13 = childCount3;
                                if (((ViewGroup.MarginLayoutParams) aVar9).width == -1) {
                                    if (aVar9.W) {
                                        eVar6.M(aVar22);
                                    } else {
                                        eVar6.M(aVar21);
                                    }
                                    eVar6.i(aVar4).f1884g = ((ViewGroup.MarginLayoutParams) aVar9).leftMargin;
                                    eVar6.i(aVar5).f1884g = ((ViewGroup.MarginLayoutParams) aVar9).rightMargin;
                                } else {
                                    eVar6.M(aVar22);
                                    eVar6.O(0);
                                }
                            }
                            if (aVar9.f752b0) {
                                i14 = -1;
                                eVar6.N(aVar20);
                                eVar6.L(((ViewGroup.MarginLayoutParams) aVar9).height);
                                if (((ViewGroup.MarginLayoutParams) aVar9).height == -2) {
                                    eVar6.N(aVar19);
                                }
                            } else {
                                i14 = -1;
                                if (((ViewGroup.MarginLayoutParams) aVar9).height == -1) {
                                    if (aVar9.X) {
                                        eVar6.N(aVar22);
                                    } else {
                                        eVar6.N(aVar21);
                                    }
                                    eVar6.i(aVar8).f1884g = ((ViewGroup.MarginLayoutParams) aVar9).topMargin;
                                    eVar6.i(aVar10).f1884g = ((ViewGroup.MarginLayoutParams) aVar9).bottomMargin;
                                } else {
                                    eVar6.N(aVar22);
                                    eVar6.L(0);
                                }
                            }
                            String str2 = aVar9.G;
                            if (str2 == null || str2.length() == 0) {
                                eVar6.Y = 0.0f;
                            } else {
                                int length = str2.length();
                                int iIndexOf3 = str2.indexOf(44);
                                if (iIndexOf3 <= 0 || iIndexOf3 >= length - 1) {
                                    i16 = i14;
                                    i17 = 0;
                                } else {
                                    String strSubstring = str2.substring(0, iIndexOf3);
                                    i16 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : i14;
                                    i17 = iIndexOf3 + 1;
                                }
                                int iIndexOf4 = str2.indexOf(58);
                                if (iIndexOf4 < 0 || iIndexOf4 >= length - 1) {
                                    String strSubstring2 = str2.substring(i17);
                                    fAbs = strSubstring2.length() > 0 ? Float.parseFloat(strSubstring2) : 0.0f;
                                    if (fAbs > 0.0f) {
                                        eVar6.Y = fAbs;
                                        eVar6.Z = i16;
                                    }
                                } else {
                                    String strSubstring3 = str2.substring(i17, iIndexOf4);
                                    String strSubstring4 = str2.substring(iIndexOf4 + 1);
                                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                                        try {
                                            float f10 = Float.parseFloat(strSubstring3);
                                            float f11 = Float.parseFloat(strSubstring4);
                                            if (f10 > 0.0f && f11 > 0.0f) {
                                                fAbs = i16 == 1 ? Math.abs(f11 / f10) : Math.abs(f10 / f11);
                                            }
                                        } catch (NumberFormatException unused3) {
                                        }
                                        if (fAbs > 0.0f) {
                                        }
                                    }
                                }
                            }
                            float f12 = aVar9.H;
                            float[] fArr = eVar6.f1917m0;
                            fArr[0] = f12;
                            fArr[1] = aVar9.I;
                            eVar6.f1913k0 = aVar9.J;
                            eVar6.f1915l0 = aVar9.K;
                            int i49 = aVar9.Z;
                            if (i49 >= 0 && i49 <= 3) {
                                eVar6.f1923q = i49;
                            }
                            int i50 = aVar9.L;
                            int i51 = aVar9.N;
                            int i52 = aVar9.P;
                            float f13 = aVar9.R;
                            eVar6.f1925r = i50;
                            eVar6.f1927u = i51;
                            if (i52 == Integer.MAX_VALUE) {
                                i52 = 0;
                            }
                            eVar6.f1928v = i52;
                            eVar6.f1929w = f13;
                            if (f13 > 0.0f && f13 < 1.0f && i50 == 0) {
                                eVar6.f1925r = i30;
                            }
                            int i53 = aVar9.M;
                            int i54 = aVar9.O;
                            int i55 = aVar9.Q;
                            float f14 = aVar9.S;
                            eVar6.s = i53;
                            eVar6.f1930x = i54;
                            eVar6.f1931y = i55 == Integer.MAX_VALUE ? 0 : i55;
                            eVar6.f1932z = f14;
                            if (f14 <= 0.0f || f14 >= 1.0f || i53 != 0) {
                                i15 = 2;
                            } else {
                                i15 = 2;
                                eVar6.s = 2;
                            }
                        }
                    }
                    i33 = i8 + 1;
                    i30 = i15;
                    sparseArray5 = sparseArray;
                    zIsInEditMode = z8;
                    childCount3 = i13;
                    z6 = z7;
                }
            }
            if (z6) {
                fVar.f1937s0.c(fVar);
            }
        }
        fVar.f1942x0.getClass();
        constraintLayout.f(fVar, constraintLayout.A, i6, i7);
        int iQ = fVar.q();
        int iK = fVar.k();
        boolean z14 = fVar.F0;
        boolean z15 = fVar.G0;
        b bVar = constraintLayout.G;
        int i56 = bVar.f794e;
        int iResolveSizeAndState = View.resolveSizeAndState(iQ + bVar.f793d, i6, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(iK + i56, i7, 0) & 16777215;
        int iMin = Math.min(constraintLayout.f746x, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(constraintLayout.f747y, iResolveSizeAndState2);
        if (z14) {
            iMin |= 16777216;
        }
        if (z15) {
            iMin2 |= 16777216;
        }
        constraintLayout.setMeasuredDimension(iMin, iMin2);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        b0.e eVarB = b(view);
        if ((view instanceof Guideline) && !(eVarB instanceof h)) {
            a aVar = (a) view.getLayoutParams();
            h hVar = new h();
            aVar.f780q0 = hVar;
            aVar.f756d0 = true;
            hVar.S(aVar.V);
        }
        if (view instanceof c) {
            c cVar = (c) view;
            cVar.i();
            ((a) view.getLayoutParams()).f758e0 = true;
            ArrayList<c> arrayList = this.f742t;
            if (!arrayList.contains(cVar)) {
                arrayList.add(cVar);
            }
        }
        this.s.put(view.getId(), view);
        this.f748z = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.s.remove(view.getId());
        b0.e eVarB = b(view);
        this.f743u.f1981r0.remove(eVarB);
        eVarB.C();
        this.f742t.remove(view);
        this.f748z = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f748z = true;
        super.requestLayout();
    }

    public void setConstraintSet(d dVar) {
        this.B = dVar;
    }

    @Override // android.view.View
    public void setId(int i6) {
        int id = getId();
        SparseArray<View> sparseArray = this.s;
        sparseArray.remove(id);
        super.setId(i6);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i6) {
        if (i6 == this.f747y) {
            return;
        }
        this.f747y = i6;
        requestLayout();
    }

    public void setMaxWidth(int i6) {
        if (i6 == this.f746x) {
            return;
        }
        this.f746x = i6;
        requestLayout();
    }

    public void setMinHeight(int i6) {
        if (i6 == this.f745w) {
            return;
        }
        this.f745w = i6;
        requestLayout();
    }

    public void setMinWidth(int i6) {
        if (i6 == this.f744v) {
            return;
        }
        this.f744v = i6;
        requestLayout();
    }

    public void setOnConstraintsChanged(e0.b bVar) {
        e0.a aVar = this.C;
        if (aVar != null) {
            aVar.getClass();
        }
    }

    public void setOptimizationLevel(int i6) {
        this.A = i6;
        b0.f fVar = this.f743u;
        fVar.E0 = i6;
        z.c.f15392q = fVar.W(AdRequest.MAX_CONTENT_URL_LENGTH);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.s = new SparseArray<>();
        this.f742t = new ArrayList<>(4);
        this.f743u = new b0.f();
        this.f744v = 0;
        this.f745w = 0;
        this.f746x = Integer.MAX_VALUE;
        this.f747y = Integer.MAX_VALUE;
        this.f748z = true;
        this.A = 257;
        this.B = null;
        this.C = null;
        this.D = -1;
        this.E = new HashMap<>();
        this.F = new SparseArray<>();
        this.G = new b(this);
        c(attributeSet, i6);
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public final int C;
        public final int D;
        public float E;
        public float F;
        public String G;
        public float H;
        public float I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public float R;
        public float S;
        public int T;
        public int U;
        public int V;
        public boolean W;
        public boolean X;
        public String Y;
        public int Z;

        /* renamed from: a, reason: collision with root package name */
        public int f749a;

        /* renamed from: a0, reason: collision with root package name */
        public boolean f750a0;

        /* renamed from: b, reason: collision with root package name */
        public int f751b;

        /* renamed from: b0, reason: collision with root package name */
        public boolean f752b0;

        /* renamed from: c, reason: collision with root package name */
        public float f753c;

        /* renamed from: c0, reason: collision with root package name */
        public boolean f754c0;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f755d;

        /* renamed from: d0, reason: collision with root package name */
        public boolean f756d0;

        /* renamed from: e, reason: collision with root package name */
        public int f757e;

        /* renamed from: e0, reason: collision with root package name */
        public boolean f758e0;

        /* renamed from: f, reason: collision with root package name */
        public int f759f;

        /* renamed from: f0, reason: collision with root package name */
        public boolean f760f0;

        /* renamed from: g, reason: collision with root package name */
        public int f761g;

        /* renamed from: g0, reason: collision with root package name */
        public int f762g0;
        public int h;

        /* renamed from: h0, reason: collision with root package name */
        public int f763h0;

        /* renamed from: i, reason: collision with root package name */
        public int f764i;

        /* renamed from: i0, reason: collision with root package name */
        public int f765i0;

        /* renamed from: j, reason: collision with root package name */
        public int f766j;

        /* renamed from: j0, reason: collision with root package name */
        public int f767j0;

        /* renamed from: k, reason: collision with root package name */
        public int f768k;

        /* renamed from: k0, reason: collision with root package name */
        public int f769k0;

        /* renamed from: l, reason: collision with root package name */
        public int f770l;

        /* renamed from: l0, reason: collision with root package name */
        public int f771l0;

        /* renamed from: m, reason: collision with root package name */
        public int f772m;

        /* renamed from: m0, reason: collision with root package name */
        public float f773m0;

        /* renamed from: n, reason: collision with root package name */
        public int f774n;

        /* renamed from: n0, reason: collision with root package name */
        public int f775n0;

        /* renamed from: o, reason: collision with root package name */
        public int f776o;

        /* renamed from: o0, reason: collision with root package name */
        public int f777o0;

        /* renamed from: p, reason: collision with root package name */
        public int f778p;
        public float p0;

        /* renamed from: q, reason: collision with root package name */
        public int f779q;

        /* renamed from: q0, reason: collision with root package name */
        public b0.e f780q0;

        /* renamed from: r, reason: collision with root package name */
        public float f781r;
        public int s;

        /* renamed from: t, reason: collision with root package name */
        public int f782t;

        /* renamed from: u, reason: collision with root package name */
        public int f783u;

        /* renamed from: v, reason: collision with root package name */
        public int f784v;

        /* renamed from: w, reason: collision with root package name */
        public final int f785w;

        /* renamed from: x, reason: collision with root package name */
        public int f786x;

        /* renamed from: y, reason: collision with root package name */
        public final int f787y;

        /* renamed from: z, reason: collision with root package name */
        public int f788z;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a, reason: collision with other inner class name */
        public static class C0010a {

            /* renamed from: a, reason: collision with root package name */
            public static final SparseIntArray f789a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f789a = sparseIntArray;
                sparseIntArray.append(98, 64);
                sparseIntArray.append(75, 65);
                sparseIntArray.append(84, 8);
                sparseIntArray.append(85, 9);
                sparseIntArray.append(87, 10);
                sparseIntArray.append(88, 11);
                sparseIntArray.append(94, 12);
                sparseIntArray.append(93, 13);
                sparseIntArray.append(65, 14);
                sparseIntArray.append(64, 15);
                sparseIntArray.append(60, 16);
                sparseIntArray.append(62, 52);
                sparseIntArray.append(61, 53);
                sparseIntArray.append(66, 2);
                sparseIntArray.append(68, 3);
                sparseIntArray.append(67, 4);
                sparseIntArray.append(103, 49);
                sparseIntArray.append(104, 50);
                sparseIntArray.append(72, 5);
                sparseIntArray.append(73, 6);
                sparseIntArray.append(74, 7);
                sparseIntArray.append(55, 67);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(89, 17);
                sparseIntArray.append(90, 18);
                sparseIntArray.append(71, 19);
                sparseIntArray.append(70, 20);
                sparseIntArray.append(108, 21);
                sparseIntArray.append(111, 22);
                sparseIntArray.append(109, 23);
                sparseIntArray.append(106, 24);
                sparseIntArray.append(110, 25);
                sparseIntArray.append(107, 26);
                sparseIntArray.append(105, 55);
                sparseIntArray.append(112, 54);
                sparseIntArray.append(80, 29);
                sparseIntArray.append(95, 30);
                sparseIntArray.append(69, 44);
                sparseIntArray.append(82, 45);
                sparseIntArray.append(97, 46);
                sparseIntArray.append(81, 47);
                sparseIntArray.append(96, 48);
                sparseIntArray.append(58, 27);
                sparseIntArray.append(57, 28);
                sparseIntArray.append(99, 31);
                sparseIntArray.append(76, 32);
                sparseIntArray.append(101, 33);
                sparseIntArray.append(100, 34);
                sparseIntArray.append(102, 35);
                sparseIntArray.append(78, 36);
                sparseIntArray.append(77, 37);
                sparseIntArray.append(79, 38);
                sparseIntArray.append(83, 39);
                sparseIntArray.append(92, 40);
                sparseIntArray.append(86, 41);
                sparseIntArray.append(63, 42);
                sparseIntArray.append(59, 43);
                sparseIntArray.append(91, 51);
                sparseIntArray.append(114, 66);
            }
        }

        @SuppressLint({"ClassVerificationFailure"})
        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f749a = -1;
            this.f751b = -1;
            this.f753c = -1.0f;
            this.f755d = true;
            this.f757e = -1;
            this.f759f = -1;
            this.f761g = -1;
            this.h = -1;
            this.f764i = -1;
            this.f766j = -1;
            this.f768k = -1;
            this.f770l = -1;
            this.f772m = -1;
            this.f774n = -1;
            this.f776o = -1;
            this.f778p = -1;
            this.f779q = 0;
            this.f781r = 0.0f;
            this.s = -1;
            this.f782t = -1;
            this.f783u = -1;
            this.f784v = -1;
            this.f785w = Integer.MIN_VALUE;
            this.f786x = Integer.MIN_VALUE;
            this.f787y = Integer.MIN_VALUE;
            this.f788z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.f750a0 = true;
            this.f752b0 = true;
            this.f754c0 = false;
            this.f756d0 = false;
            this.f758e0 = false;
            this.f760f0 = false;
            this.f762g0 = -1;
            this.f763h0 = -1;
            this.f765i0 = -1;
            this.f767j0 = -1;
            this.f769k0 = Integer.MIN_VALUE;
            this.f771l0 = Integer.MIN_VALUE;
            this.f773m0 = 0.5f;
            this.f780q0 = new b0.e();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
                ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
                ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
                ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
                setMarginStart(marginLayoutParams.getMarginStart());
                setMarginEnd(marginLayoutParams.getMarginEnd());
            }
            if (layoutParams instanceof a) {
                a aVar = (a) layoutParams;
                this.f749a = aVar.f749a;
                this.f751b = aVar.f751b;
                this.f753c = aVar.f753c;
                this.f755d = aVar.f755d;
                this.f757e = aVar.f757e;
                this.f759f = aVar.f759f;
                this.f761g = aVar.f761g;
                this.h = aVar.h;
                this.f764i = aVar.f764i;
                this.f766j = aVar.f766j;
                this.f768k = aVar.f768k;
                this.f770l = aVar.f770l;
                this.f772m = aVar.f772m;
                this.f774n = aVar.f774n;
                this.f776o = aVar.f776o;
                this.f778p = aVar.f778p;
                this.f779q = aVar.f779q;
                this.f781r = aVar.f781r;
                this.s = aVar.s;
                this.f782t = aVar.f782t;
                this.f783u = aVar.f783u;
                this.f784v = aVar.f784v;
                this.f785w = aVar.f785w;
                this.f786x = aVar.f786x;
                this.f787y = aVar.f787y;
                this.f788z = aVar.f788z;
                this.A = aVar.A;
                this.B = aVar.B;
                this.C = aVar.C;
                this.D = aVar.D;
                this.E = aVar.E;
                this.F = aVar.F;
                this.G = aVar.G;
                this.H = aVar.H;
                this.I = aVar.I;
                this.J = aVar.J;
                this.K = aVar.K;
                this.W = aVar.W;
                this.X = aVar.X;
                this.L = aVar.L;
                this.M = aVar.M;
                this.N = aVar.N;
                this.P = aVar.P;
                this.O = aVar.O;
                this.Q = aVar.Q;
                this.R = aVar.R;
                this.S = aVar.S;
                this.T = aVar.T;
                this.U = aVar.U;
                this.V = aVar.V;
                this.f750a0 = aVar.f750a0;
                this.f752b0 = aVar.f752b0;
                this.f754c0 = aVar.f754c0;
                this.f756d0 = aVar.f756d0;
                this.f762g0 = aVar.f762g0;
                this.f763h0 = aVar.f763h0;
                this.f765i0 = aVar.f765i0;
                this.f767j0 = aVar.f767j0;
                this.f769k0 = aVar.f769k0;
                this.f771l0 = aVar.f771l0;
                this.f773m0 = aVar.f773m0;
                this.Y = aVar.Y;
                this.Z = aVar.Z;
                this.f780q0 = aVar.f780q0;
            }
        }

        public final void a() {
            this.f756d0 = false;
            this.f750a0 = true;
            this.f752b0 = true;
            int i6 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i6 == -2 && this.W) {
                this.f750a0 = false;
                if (this.L == 0) {
                    this.L = 1;
                }
            }
            int i7 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i7 == -2 && this.X) {
                this.f752b0 = false;
                if (this.M == 0) {
                    this.M = 1;
                }
            }
            if (i6 == 0 || i6 == -1) {
                this.f750a0 = false;
                if (i6 == 0 && this.L == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.W = true;
                }
            }
            if (i7 == 0 || i7 == -1) {
                this.f752b0 = false;
                if (i7 == 0 && this.M == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.X = true;
                }
            }
            if (this.f753c == -1.0f && this.f749a == -1 && this.f751b == -1) {
                return;
            }
            this.f756d0 = true;
            this.f750a0 = true;
            this.f752b0 = true;
            if (!(this.f780q0 instanceof h)) {
                this.f780q0 = new h();
            }
            ((h) this.f780q0).S(this.V);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void resolveLayoutDirection(int i6) {
            int i7;
            int i8;
            int i9;
            int i10;
            int i11 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i12 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i6);
            boolean z6 = false;
            boolean z7 = 1 == getLayoutDirection();
            this.f765i0 = -1;
            this.f767j0 = -1;
            this.f762g0 = -1;
            this.f763h0 = -1;
            this.f769k0 = this.f785w;
            this.f771l0 = this.f787y;
            float f6 = this.E;
            this.f773m0 = f6;
            int i13 = this.f749a;
            this.f775n0 = i13;
            int i14 = this.f751b;
            this.f777o0 = i14;
            float f7 = this.f753c;
            this.p0 = f7;
            if (z7) {
                int i15 = this.s;
                if (i15 != -1) {
                    this.f765i0 = i15;
                } else {
                    int i16 = this.f782t;
                    if (i16 != -1) {
                        this.f767j0 = i16;
                    }
                    i7 = this.f783u;
                    if (i7 != -1) {
                        this.f763h0 = i7;
                        z6 = true;
                    }
                    i8 = this.f784v;
                    if (i8 != -1) {
                        this.f762g0 = i8;
                        z6 = true;
                    }
                    i9 = this.A;
                    if (i9 != Integer.MIN_VALUE) {
                        this.f771l0 = i9;
                    }
                    i10 = this.B;
                    if (i10 != Integer.MIN_VALUE) {
                        this.f769k0 = i10;
                    }
                    if (z6) {
                        this.f773m0 = 1.0f - f6;
                    }
                    if (this.f756d0 && this.V == 1 && this.f755d) {
                        if (f7 == -1.0f) {
                            this.p0 = 1.0f - f7;
                            this.f775n0 = -1;
                            this.f777o0 = -1;
                        } else if (i13 != -1) {
                            this.f777o0 = i13;
                            this.f775n0 = -1;
                            this.p0 = -1.0f;
                        } else if (i14 != -1) {
                            this.f775n0 = i14;
                            this.f777o0 = -1;
                            this.p0 = -1.0f;
                        }
                    }
                }
                z6 = true;
                i7 = this.f783u;
                if (i7 != -1) {
                }
                i8 = this.f784v;
                if (i8 != -1) {
                }
                i9 = this.A;
                if (i9 != Integer.MIN_VALUE) {
                }
                i10 = this.B;
                if (i10 != Integer.MIN_VALUE) {
                }
                if (z6) {
                }
                if (this.f756d0) {
                    if (f7 == -1.0f) {
                    }
                }
            } else {
                int i17 = this.s;
                if (i17 != -1) {
                    this.f763h0 = i17;
                }
                int i18 = this.f782t;
                if (i18 != -1) {
                    this.f762g0 = i18;
                }
                int i19 = this.f783u;
                if (i19 != -1) {
                    this.f765i0 = i19;
                }
                int i20 = this.f784v;
                if (i20 != -1) {
                    this.f767j0 = i20;
                }
                int i21 = this.A;
                if (i21 != Integer.MIN_VALUE) {
                    this.f769k0 = i21;
                }
                int i22 = this.B;
                if (i22 != Integer.MIN_VALUE) {
                    this.f771l0 = i22;
                }
            }
            if (this.f783u == -1 && this.f784v == -1 && this.f782t == -1 && this.s == -1) {
                int i23 = this.f761g;
                if (i23 != -1) {
                    this.f765i0 = i23;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i12 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i12;
                    }
                } else {
                    int i24 = this.h;
                    if (i24 != -1) {
                        this.f767j0 = i24;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i12 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i12;
                        }
                    }
                }
                int i25 = this.f757e;
                if (i25 != -1) {
                    this.f762g0 = i25;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i11 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i11;
                    return;
                }
                int i26 = this.f759f;
                if (i26 != -1) {
                    this.f763h0 = i26;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i11 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i11;
                }
            }
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f749a = -1;
            this.f751b = -1;
            this.f753c = -1.0f;
            this.f755d = true;
            this.f757e = -1;
            this.f759f = -1;
            this.f761g = -1;
            this.h = -1;
            this.f764i = -1;
            this.f766j = -1;
            this.f768k = -1;
            this.f770l = -1;
            this.f772m = -1;
            this.f774n = -1;
            this.f776o = -1;
            this.f778p = -1;
            this.f779q = 0;
            this.f781r = 0.0f;
            this.s = -1;
            this.f782t = -1;
            this.f783u = -1;
            this.f784v = -1;
            this.f785w = Integer.MIN_VALUE;
            this.f786x = Integer.MIN_VALUE;
            this.f787y = Integer.MIN_VALUE;
            this.f788z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.f750a0 = true;
            this.f752b0 = true;
            this.f754c0 = false;
            this.f756d0 = false;
            this.f758e0 = false;
            this.f760f0 = false;
            this.f762g0 = -1;
            this.f763h0 = -1;
            this.f765i0 = -1;
            this.f767j0 = -1;
            this.f769k0 = Integer.MIN_VALUE;
            this.f771l0 = Integer.MIN_VALUE;
            this.f773m0 = 0.5f;
            this.f780q0 = new b0.e();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e0.d.f12765b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i6);
                int i7 = C0010a.f789a.get(index);
                switch (i7) {
                    case 1:
                        this.V = typedArrayObtainStyledAttributes.getInt(index, this.V);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f778p);
                        this.f778p = resourceId;
                        if (resourceId == -1) {
                            this.f778p = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f779q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f779q);
                        break;
                    case 4:
                        float f6 = typedArrayObtainStyledAttributes.getFloat(index, this.f781r) % 360.0f;
                        this.f781r = f6;
                        if (f6 < 0.0f) {
                            this.f781r = (360.0f - f6) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f749a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f749a);
                        break;
                    case 6:
                        this.f751b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f751b);
                        break;
                    case 7:
                        this.f753c = typedArrayObtainStyledAttributes.getFloat(index, this.f753c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f757e);
                        this.f757e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f757e = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f759f);
                        this.f759f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f759f = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f761g);
                        this.f761g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f761g = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.h);
                        this.h = resourceId5;
                        if (resourceId5 == -1) {
                            this.h = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f764i);
                        this.f764i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f764i = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f766j);
                        this.f766j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f766j = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f768k);
                        this.f768k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f768k = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f770l);
                        this.f770l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f770l = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f772m);
                        this.f772m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f772m = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.s);
                        this.s = resourceId11;
                        if (resourceId11 == -1) {
                            this.s = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f782t);
                        this.f782t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f782t = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f783u);
                        this.f783u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f783u = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f784v);
                        this.f784v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f784v = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case dn.zzm /* 21 */:
                        this.f785w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f785w);
                        break;
                    case 22:
                        this.f786x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f786x);
                        break;
                    case 23:
                        this.f787y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f787y);
                        break;
                    case 24:
                        this.f788z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f788z);
                        break;
                    case 25:
                        this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 26:
                        this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case 27:
                        this.W = typedArrayObtainStyledAttributes.getBoolean(index, this.W);
                        break;
                    case 28:
                        this.X = typedArrayObtainStyledAttributes.getBoolean(index, this.X);
                        break;
                    case 29:
                        this.E = typedArrayObtainStyledAttributes.getFloat(index, this.E);
                        break;
                    case 30:
                        this.F = typedArrayObtainStyledAttributes.getFloat(index, this.F);
                        break;
                    case 31:
                        int i8 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.L = i8;
                        if (i8 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i9 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.M = i9;
                        if (i9 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case ImageFormatConstants.INTERNAL_DEFINED_IMAGE_FORMAT_JPEG /* 33 */:
                        try {
                            this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.N) == -2) {
                                this.N = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case ImageFormatConstants.INTERNAL_DEFINED_IMAGE_FORMAT_PRIVATE /* 34 */:
                        try {
                            this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                            break;
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.P) == -2) {
                                this.P = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.R));
                        this.L = 2;
                        break;
                    case 36:
                        try {
                            this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            break;
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.O) == -2) {
                                this.O = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                            break;
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.Q) == -2) {
                                this.Q = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.S));
                        this.M = 2;
                        break;
                    default:
                        switch (i7) {
                            case 44:
                                d.h(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.H = typedArrayObtainStyledAttributes.getFloat(index, this.H);
                                break;
                            case 46:
                                this.I = typedArrayObtainStyledAttributes.getFloat(index, this.I);
                                break;
                            case 47:
                                this.J = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.K = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.T);
                                break;
                            case 50:
                                this.U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.U);
                                break;
                            case 51:
                                this.Y = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.f774n);
                                this.f774n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f774n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.f776o);
                                this.f776o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f776o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                break;
                            case 55:
                                this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            default:
                                switch (i7) {
                                    case 64:
                                        d.g(this, typedArrayObtainStyledAttributes, index, 0);
                                        break;
                                    case 65:
                                        d.g(this, typedArrayObtainStyledAttributes, index, 1);
                                        break;
                                    case 66:
                                        this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                                        break;
                                    case 67:
                                        this.f755d = typedArrayObtainStyledAttributes.getBoolean(index, this.f755d);
                                        break;
                                }
                        }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            a();
        }

        public a() {
            super(-2, -2);
            this.f749a = -1;
            this.f751b = -1;
            this.f753c = -1.0f;
            this.f755d = true;
            this.f757e = -1;
            this.f759f = -1;
            this.f761g = -1;
            this.h = -1;
            this.f764i = -1;
            this.f766j = -1;
            this.f768k = -1;
            this.f770l = -1;
            this.f772m = -1;
            this.f774n = -1;
            this.f776o = -1;
            this.f778p = -1;
            this.f779q = 0;
            this.f781r = 0.0f;
            this.s = -1;
            this.f782t = -1;
            this.f783u = -1;
            this.f784v = -1;
            this.f785w = Integer.MIN_VALUE;
            this.f786x = Integer.MIN_VALUE;
            this.f787y = Integer.MIN_VALUE;
            this.f788z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.f750a0 = true;
            this.f752b0 = true;
            this.f754c0 = false;
            this.f756d0 = false;
            this.f758e0 = false;
            this.f760f0 = false;
            this.f762g0 = -1;
            this.f763h0 = -1;
            this.f765i0 = -1;
            this.f767j0 = -1;
            this.f769k0 = Integer.MIN_VALUE;
            this.f771l0 = Integer.MIN_VALUE;
            this.f773m0 = 0.5f;
            this.f780q0 = new b0.e();
        }
    }
}
