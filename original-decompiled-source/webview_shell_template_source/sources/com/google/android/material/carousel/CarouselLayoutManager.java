package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.camera.core.processing.p;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.j;
import com.google.android.material.carousel.b;
import com.htmltoapk.template.R;
import d4.d;
import d4.e;
import d4.f;
import d4.g;
import d4.h;
import d4.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class CarouselLayoutManager extends RecyclerView.m implements RecyclerView.w.b {
    public int A;
    public int B;
    public final int C;

    /* renamed from: p, reason: collision with root package name */
    public int f12137p;

    /* renamed from: q, reason: collision with root package name */
    public int f12138q;

    /* renamed from: r, reason: collision with root package name */
    public int f12139r;
    public final a s;

    /* renamed from: t, reason: collision with root package name */
    public final i f12140t;

    /* renamed from: u, reason: collision with root package name */
    public c f12141u;

    /* renamed from: v, reason: collision with root package name */
    public com.google.android.material.carousel.b f12142v;

    /* renamed from: w, reason: collision with root package name */
    public int f12143w;

    /* renamed from: x, reason: collision with root package name */
    public HashMap f12144x;

    /* renamed from: y, reason: collision with root package name */
    public f f12145y;

    /* renamed from: z, reason: collision with root package name */
    public final View.OnLayoutChangeListener f12146z;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a extends RecyclerView.l {

        /* renamed from: a, reason: collision with root package name */
        public final Paint f12147a;

        /* renamed from: b, reason: collision with root package name */
        public List<b.C0034b> f12148b;

        public a() {
            Paint paint = new Paint();
            this.f12147a = paint;
            this.f12148b = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        public final void d(Canvas canvas, RecyclerView recyclerView) throws Resources.NotFoundException {
            Canvas canvas2;
            float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
            Paint paint = this.f12147a;
            paint.setStrokeWidth(dimension);
            for (b.C0034b c0034b : this.f12148b) {
                float f6 = c0034b.f12167c;
                ThreadLocal<double[]> threadLocal = m0.a.f13852a;
                float f7 = 1.0f - f6;
                paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * f6) + (Color.alpha(-65281) * f7)), (int) ((Color.red(-16776961) * f6) + (Color.red(-65281) * f7)), (int) ((Color.green(-16776961) * f6) + (Color.green(-65281) * f7)), (int) ((Color.blue(-16776961) * f6) + (Color.blue(-65281) * f7))));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).P0()) {
                    canvas2 = canvas;
                    canvas2.drawLine(c0034b.f12166b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f12145y.g(), c0034b.f12166b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f12145y.c(), paint);
                } else {
                    float fD = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f12145y.d();
                    float f8 = c0034b.f12166b;
                    float fE = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f12145y.e();
                    float f9 = c0034b.f12166b;
                    canvas2 = canvas;
                    canvas2.drawLine(fD, f8, fE, f9, paint);
                }
                canvas = canvas2;
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final b.C0034b f12149a;

        /* renamed from: b, reason: collision with root package name */
        public final b.C0034b f12150b;

        public b(b.C0034b c0034b, b.C0034b c0034b2) {
            j.b(c0034b.f12165a <= c0034b2.f12165a);
            this.f12149a = c0034b;
            this.f12150b = c0034b2;
        }
    }

    public CarouselLayoutManager() {
        i iVar = new i();
        this.s = new a();
        this.f12143w = 0;
        this.f12146z = new View.OnLayoutChangeListener() { // from class: d4.b
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
                if (i8 - i6 == i12 - i10 && i9 - i7 == i13 - i11) {
                    return;
                }
                view.post(new p(7, this.f12729a));
            }
        };
        this.B = -1;
        this.C = 0;
        this.f12140t = iVar;
        V0();
        X0(0);
    }

    public static b O0(List<b.C0034b> list, float f6, boolean z6) {
        float f7 = Float.MAX_VALUE;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        float f8 = -3.4028235E38f;
        float f9 = Float.MAX_VALUE;
        float f10 = Float.MAX_VALUE;
        for (int i10 = 0; i10 < list.size(); i10++) {
            b.C0034b c0034b = list.get(i10);
            float f11 = z6 ? c0034b.f12166b : c0034b.f12165a;
            float fAbs = Math.abs(f11 - f6);
            if (f11 <= f6 && fAbs <= f7) {
                i6 = i10;
                f7 = fAbs;
            }
            if (f11 > f6 && fAbs <= f9) {
                i8 = i10;
                f9 = fAbs;
            }
            if (f11 <= f10) {
                i7 = i10;
                f10 = f11;
            }
            if (f11 > f8) {
                i9 = i10;
                f8 = f11;
            }
        }
        if (i6 == -1) {
            i6 = i7;
        }
        if (i8 == -1) {
            i8 = i9;
        }
        return new b(list.get(i6), list.get(i8));
    }

    public final float C0(float f6, float f7) {
        return Q0() ? f6 - f7 : f6 + f7;
    }

    public final void D0(RecyclerView.s sVar, int i6, int i7) {
        if (i6 < 0 || i6 >= B()) {
            return;
        }
        float fH0 = H0(i6);
        View viewD = sVar.d(i6);
        T0(viewD);
        float fC0 = C0(fH0, this.f12142v.f12151a / 2.0f);
        b bVarO0 = O0(this.f12142v.f12153c, fC0, false);
        float fG0 = G0(fC0, bVarO0);
        float f6 = this.f12142v.f12151a / 2.0f;
        b(viewD, i7, false);
        T0(viewD);
        this.f12145y.h(viewD, (int) (fG0 - f6), (int) (fG0 + f6));
        Y0(viewD, fC0, bVarO0);
    }

    public final void E0(int i6, RecyclerView.s sVar, RecyclerView.x xVar) {
        float fH0 = H0(i6);
        while (i6 < xVar.b()) {
            float fC0 = C0(fH0, this.f12142v.f12151a / 2.0f);
            b bVarO0 = O0(this.f12142v.f12153c, fC0, false);
            float fG0 = G0(fC0, bVarO0);
            if (R0(fG0, bVarO0)) {
                return;
            }
            fH0 = C0(fH0, this.f12142v.f12151a);
            if (!S0(fG0, bVarO0)) {
                View viewD = sVar.d(i6);
                float f6 = this.f12142v.f12151a / 2.0f;
                b(viewD, -1, false);
                T0(viewD);
                this.f12145y.h(viewD, (int) (fG0 - f6), (int) (fG0 + f6));
                Y0(viewD, fC0, bVarO0);
            }
            i6++;
        }
    }

    public final void F0(RecyclerView.s sVar, int i6) {
        float fH0 = H0(i6);
        while (i6 >= 0) {
            float fC0 = C0(fH0, this.f12142v.f12151a / 2.0f);
            b bVarO0 = O0(this.f12142v.f12153c, fC0, false);
            float fG0 = G0(fC0, bVarO0);
            if (S0(fG0, bVarO0)) {
                return;
            }
            float f6 = this.f12142v.f12151a;
            fH0 = Q0() ? fH0 + f6 : fH0 - f6;
            if (!R0(fG0, bVarO0)) {
                View viewD = sVar.d(i6);
                float f7 = this.f12142v.f12151a / 2.0f;
                b(viewD, 0, false);
                T0(viewD);
                this.f12145y.h(viewD, (int) (fG0 - f7), (int) (fG0 + f7));
                Y0(viewD, fC0, bVarO0);
            }
            i6--;
        }
    }

    public final float G0(float f6, b bVar) {
        b.C0034b c0034b = bVar.f12149a;
        float f7 = c0034b.f12166b;
        b.C0034b c0034b2 = bVar.f12150b;
        float f8 = c0034b2.f12166b;
        float f9 = c0034b.f12165a;
        float f10 = c0034b2.f12165a;
        float fB = x3.a.b(f7, f8, f9, f10, f6);
        if (c0034b2 != this.f12142v.b() && c0034b != this.f12142v.d()) {
            return fB;
        }
        return ((1.0f - c0034b2.f12167c) * (f6 - f10)) + fB;
    }

    public final float H0(int i6) {
        return C0(this.f12145y.f() - this.f12137p, this.f12142v.f12151a * i6);
    }

    public final void I0(RecyclerView.s sVar, RecyclerView.x xVar) {
        while (v() > 0) {
            View viewU = u(0);
            float fK0 = K0(viewU);
            if (!S0(fK0, O0(this.f12142v.f12153c, fK0, true))) {
                break;
            } else {
                k0(viewU, sVar);
            }
        }
        while (v() - 1 >= 0) {
            View viewU2 = u(v() - 1);
            float fK02 = K0(viewU2);
            if (!R0(fK02, O0(this.f12142v.f12153c, fK02, true))) {
                break;
            } else {
                k0(viewU2, sVar);
            }
        }
        if (v() == 0) {
            F0(sVar, this.f12143w - 1);
            E0(this.f12143w, sVar, xVar);
        } else {
            int iH = RecyclerView.m.H(u(0));
            int iH2 = RecyclerView.m.H(u(v() - 1));
            F0(sVar, iH - 1);
            E0(iH2 + 1, sVar, xVar);
        }
    }

    public final int J0() {
        return P0() ? this.f1484n : this.f1485o;
    }

    public final float K0(View view) {
        super.y(view, new Rect());
        return P0() ? r0.centerX() : r0.centerY();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean L() {
        return true;
    }

    public final com.google.android.material.carousel.b L0(int i6) {
        com.google.android.material.carousel.b bVar;
        HashMap map = this.f12144x;
        return (map == null || (bVar = (com.google.android.material.carousel.b) map.get(Integer.valueOf(e5.i.b(i6, 0, Math.max(0, B() + (-1)))))) == null) ? this.f12141u.f12172a : bVar;
    }

    public final int M0(int i6, com.google.android.material.carousel.b bVar) {
        if (!Q0()) {
            return (int) ((bVar.f12151a / 2.0f) + ((i6 * bVar.f12151a) - bVar.a().f12165a));
        }
        float fJ0 = J0() - bVar.c().f12165a;
        float f6 = bVar.f12151a;
        return (int) ((fJ0 - (i6 * f6)) - (f6 / 2.0f));
    }

    public final int N0(int i6, com.google.android.material.carousel.b bVar) {
        int i7 = Integer.MAX_VALUE;
        for (b.C0034b c0034b : bVar.f12153c.subList(bVar.f12154d, bVar.f12155e + 1)) {
            float f6 = bVar.f12151a;
            float f7 = (f6 / 2.0f) + (i6 * f6);
            int iJ0 = (Q0() ? (int) ((J0() - c0034b.f12165a) - f7) : (int) (f7 - c0034b.f12165a)) - this.f12137p;
            if (Math.abs(i7) > Math.abs(iJ0)) {
                i7 = iJ0;
            }
        }
        return i7;
    }

    public final boolean P0() {
        return this.f12145y.f12733a == 0;
    }

    public final boolean Q0() {
        return P0() && C() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void R(RecyclerView recyclerView) throws Resources.NotFoundException {
        Context context = recyclerView.getContext();
        i iVar = this.f12140t;
        float dimension = iVar.f12734a;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        iVar.f12734a = dimension;
        float dimension2 = iVar.f12735b;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        iVar.f12735b = dimension2;
        V0();
        recyclerView.addOnLayoutChangeListener(this.f12146z);
    }

    public final boolean R0(float f6, b bVar) {
        b.C0034b c0034b = bVar.f12149a;
        float f7 = c0034b.f12168d;
        b.C0034b c0034b2 = bVar.f12150b;
        float fB = x3.a.b(f7, c0034b2.f12168d, c0034b.f12166b, c0034b2.f12166b, f6) / 2.0f;
        float f8 = Q0() ? f6 + fB : f6 - fB;
        return Q0() ? f8 < 0.0f : f8 > ((float) J0());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void S(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f12146z);
    }

    public final boolean S0(float f6, b bVar) {
        b.C0034b c0034b = bVar.f12149a;
        float f7 = c0034b.f12168d;
        b.C0034b c0034b2 = bVar.f12150b;
        float fC0 = C0(f6, x3.a.b(f7, c0034b2.f12168d, c0034b.f12166b, c0034b2.f12166b, f6) / 2.0f);
        return Q0() ? fC0 > ((float) J0()) : fC0 < 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    @Override // androidx.recyclerview.widget.RecyclerView.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T(View view, int i6, RecyclerView.s sVar, RecyclerView.x xVar) {
        char c7;
        if (v() == 0) {
            return null;
        }
        int i7 = this.f12145y.f12733a;
        if (i6 == 1) {
            c7 = 65535;
        } else if (i6 == 2) {
            c7 = 1;
        } else if (i6 == 17) {
            if (i7 == 0) {
                if (Q0()) {
                }
            }
            c7 = 0;
        } else if (i6 != 33) {
            if (i6 != 66) {
                if (i6 != 130) {
                    Log.d("CarouselLayoutManager", "Unknown focus request:" + i6);
                } else if (i7 == 1) {
                }
                c7 = 0;
            } else {
                if (i7 == 0) {
                    if (Q0()) {
                    }
                }
                c7 = 0;
            }
        } else if (i7 != 1) {
            c7 = 0;
        }
        if (c7 == 0) {
            return null;
        }
        if (c7 == 65535) {
            if (RecyclerView.m.H(view) == 0) {
                return null;
            }
            D0(sVar, RecyclerView.m.H(u(0)) - 1, 0);
            return u(Q0() ? v() - 1 : 0);
        }
        if (RecyclerView.m.H(view) == B() - 1) {
            return null;
        }
        D0(sVar, RecyclerView.m.H(u(v() - 1)) + 1, -1);
        return u(Q0() ? 0 : v() - 1);
    }

    public final void T0(View view) {
        if (!(view instanceof h)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        Rect rect = new Rect();
        RecyclerView recyclerView = this.f1473b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.N(view));
        }
        int i6 = rect.left + rect.right;
        int i7 = rect.top + rect.bottom;
        c cVar = this.f12141u;
        view.measure(RecyclerView.m.w(P0(), this.f1484n, this.f1482l, F() + E() + ((ViewGroup.MarginLayoutParams) nVar).leftMargin + ((ViewGroup.MarginLayoutParams) nVar).rightMargin + i6, (int) ((cVar == null || this.f12145y.f12733a != 0) ? ((ViewGroup.MarginLayoutParams) nVar).width : cVar.f12172a.f12151a)), RecyclerView.m.w(e(), this.f1485o, this.f1483m, D() + G() + ((ViewGroup.MarginLayoutParams) nVar).topMargin + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin + i7, (int) ((cVar == null || this.f12145y.f12733a != 1) ? ((ViewGroup.MarginLayoutParams) nVar).height : cVar.f12172a.f12151a)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(RecyclerView.m.H(u(0)));
            accessibilityEvent.setToIndex(RecyclerView.m.H(u(v() - 1)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x05e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U0(RecyclerView.s sVar) {
        View view;
        int i6;
        int[] iArr;
        int i7;
        com.google.android.material.carousel.b bVarD;
        int i8;
        int i9;
        int i10;
        com.google.android.material.carousel.b bVar;
        float f6;
        boolean z6;
        List<b.C0034b> list;
        int i11;
        b.C0034b c0034b;
        b.C0034b c0034b2;
        int i12;
        int i13;
        float f7;
        View viewD = sVar.d(0);
        T0(viewD);
        i iVar = this.f12140t;
        iVar.getClass();
        int i14 = this.f1485o;
        if (P0()) {
            i14 = this.f1484n;
        }
        RecyclerView.n nVar = (RecyclerView.n) viewD.getLayoutParams();
        float f8 = ((ViewGroup.MarginLayoutParams) nVar).topMargin + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin;
        float measuredHeight = viewD.getMeasuredHeight();
        if (P0()) {
            f8 = ((ViewGroup.MarginLayoutParams) nVar).leftMargin + ((ViewGroup.MarginLayoutParams) nVar).rightMargin;
            measuredHeight = viewD.getMeasuredWidth();
        }
        float f9 = iVar.f12734a + f8;
        float fMax = Math.max(iVar.f12735b + f8, f9);
        float f10 = i14;
        float fMin = Math.min(measuredHeight + f8, f10);
        float fA = e5.i.a((measuredHeight / 3.0f) + f8, f9 + f8, fMax + f8);
        float f11 = (fMin + fA) / 2.0f;
        float f12 = f9 * 2.0f;
        int[] iArr2 = f10 <= f12 ? new int[]{0} : i.f12736d;
        int i15 = this.C;
        int[] iArr3 = i.f12737e;
        if (i15 == 1) {
            int length = iArr2.length;
            i6 = 1;
            int[] iArr4 = new int[length];
            view = viewD;
            for (int i16 = 0; i16 < length; i16++) {
                iArr4[i16] = iArr2[i16] * 2;
            }
            int[] iArr5 = new int[2];
            for (int i17 = 0; i17 < 2; i17++) {
                iArr5[i17] = iArr3[i17] * 2;
            }
            iArr2 = iArr4;
            iArr = iArr5;
        } else {
            view = viewD;
            i6 = 1;
            iArr = iArr3;
        }
        int length2 = iArr.length;
        int i18 = Integer.MIN_VALUE;
        int i19 = 0;
        while (i19 < length2) {
            int i20 = length2;
            int i21 = iArr[i19];
            if (i21 > i18) {
                i18 = i21;
            }
            i19++;
            length2 = i20;
        }
        float f13 = f10 - (i18 * f11);
        int length3 = iArr2.length;
        int i22 = 0;
        int i23 = Integer.MIN_VALUE;
        while (i22 < length3) {
            int i24 = i22;
            int i25 = iArr2[i24];
            if (i25 > i23) {
                i23 = i25;
            }
            i22 = i24 + 1;
        }
        int iMax = (int) Math.max(1.0d, Math.floor((f13 - (i23 * fMax)) / fMin));
        int iCeil = (int) Math.ceil(f10 / fMin);
        int i26 = (iCeil - iMax) + 1;
        int[] iArr6 = new int[i26];
        for (int i27 = 0; i27 < i26; i27++) {
            iArr6[i27] = iCeil - i27;
        }
        int i28 = i6;
        d4.a aVarA = d4.a.a(f10, fA, f9, fMax, iArr2, f11, iArr, fMin, iArr6);
        int i29 = aVarA.f12724c;
        int i30 = aVarA.f12728g;
        iVar.f12738c = i29 + aVarA.f12725d + i30;
        int iB = B();
        int i31 = aVarA.f12724c;
        int i32 = aVarA.f12725d;
        int i33 = ((i31 + i32) + i30) - iB;
        int i34 = (i33 <= 0 || (i31 <= 0 && i32 <= i28)) ? 0 : i28;
        while (i33 > 0) {
            int i35 = aVarA.f12724c;
            if (i35 > 0) {
                aVarA.f12724c = i35 - 1;
            } else {
                int i36 = aVarA.f12725d;
                if (i36 > i28) {
                    aVarA.f12725d = i36 - 1;
                }
            }
            i33--;
        }
        int i37 = aVarA.f12725d;
        if (i37 == 0 && aVarA.f12724c == 0 && f10 > f12) {
            aVarA.f12724c = i28;
            i34 = i28;
        }
        if (i34 != 0) {
            aVarA = d4.a.a(f10, fA, f9, fMax, new int[]{aVarA.f12724c}, f11, new int[]{i37}, fMin, new int[]{i30});
        }
        Context context = view.getContext();
        if (this.C == i28) {
            float fMin2 = Math.min(context.getResources().getDimension(R.dimen.m3_carousel_gone_size) + f8, aVarA.f12727f);
            float f14 = fMin2 / 2.0f;
            float f15 = 0.0f - f14;
            float fB = com.google.android.material.carousel.a.b(0.0f, aVarA.f12723b, aVarA.f12724c);
            float fC = com.google.android.material.carousel.a.c(0.0f, com.google.android.material.carousel.a.a(fB, aVarA.f12723b, (int) Math.floor(aVarA.f12724c / 2.0f)), aVarA.f12723b, aVarA.f12724c);
            float fB2 = com.google.android.material.carousel.a.b(fC, aVarA.f12726e, aVarA.f12725d);
            float fC2 = com.google.android.material.carousel.a.c(fC, com.google.android.material.carousel.a.a(fB2, aVarA.f12726e, (int) Math.floor(aVarA.f12725d / 2.0f)), aVarA.f12726e, aVarA.f12725d);
            float f16 = aVarA.f12727f;
            int i38 = aVarA.f12728g;
            float fB3 = com.google.android.material.carousel.a.b(fC2, f16, i38);
            i7 = i28;
            float fC3 = com.google.android.material.carousel.a.c(fC2, com.google.android.material.carousel.a.a(fB3, aVarA.f12727f, i38), aVarA.f12727f, i38);
            float fB4 = com.google.android.material.carousel.a.b(fC3, aVarA.f12726e, aVarA.f12725d);
            float fB5 = com.google.android.material.carousel.a.b(com.google.android.material.carousel.a.c(fC3, com.google.android.material.carousel.a.a(fB4, aVarA.f12726e, (int) Math.ceil(aVarA.f12725d / 2.0f)), aVarA.f12726e, aVarA.f12725d), aVarA.f12723b, aVarA.f12724c);
            float f17 = f10 + f14;
            float fA2 = g.a(fMin2, aVarA.f12727f, f8);
            float fA3 = g.a(aVarA.f12723b, aVarA.f12727f, f8);
            float fA4 = g.a(aVarA.f12726e, aVarA.f12727f, f8);
            b.a aVar = new b.a(aVarA.f12727f, i14);
            aVar.a(f15, fA2, fMin2, false, true);
            if (aVarA.f12724c > 0) {
                aVar.c(fB, fA3, aVarA.f12723b, (int) Math.floor(r9 / 2.0f), false);
            }
            if (aVarA.f12725d > 0) {
                aVar.c(fB2, fA4, aVarA.f12726e, (int) Math.floor(r9 / 2.0f), false);
                f7 = fA4;
            } else {
                f7 = fA4;
            }
            aVar.c(fB3, 0.0f, aVarA.f12727f, aVarA.f12728g, true);
            if (aVarA.f12725d > 0) {
                aVar.c(fB4, f7, aVarA.f12726e, (int) Math.ceil(r4 / 2.0f), false);
            }
            if (aVarA.f12724c > 0) {
                aVar.c(fB5, fA3, aVarA.f12723b, (int) Math.ceil(r2 / 2.0f), false);
            }
            aVar.a(f17, fA2, fMin2, false, true);
            bVarD = aVar.d();
        } else {
            i7 = i28;
            float fMin3 = Math.min(context.getResources().getDimension(R.dimen.m3_carousel_gone_size) + f8, aVarA.f12727f);
            float f18 = fMin3 / 2.0f;
            float f19 = 0.0f - f18;
            float f20 = aVarA.f12727f;
            int i39 = aVarA.f12728g;
            float fB6 = com.google.android.material.carousel.a.b(0.0f, f20, i39);
            float fC4 = com.google.android.material.carousel.a.c(0.0f, com.google.android.material.carousel.a.a(fB6, aVarA.f12727f, i39), aVarA.f12727f, i39);
            float fB7 = com.google.android.material.carousel.a.b(fC4, aVarA.f12726e, aVarA.f12725d);
            float fB8 = com.google.android.material.carousel.a.b(com.google.android.material.carousel.a.c(fC4, fB7, aVarA.f12726e, aVarA.f12725d), aVarA.f12723b, aVarA.f12724c);
            float f21 = f10 + f18;
            float fA5 = g.a(fMin3, aVarA.f12727f, f8);
            float fA6 = g.a(aVarA.f12723b, aVarA.f12727f, f8);
            float fA7 = g.a(aVarA.f12726e, aVarA.f12727f, f8);
            b.a aVar2 = new b.a(aVarA.f12727f, i14);
            aVar2.a(f19, fA5, fMin3, false, true);
            aVar2.c(fB6, 0.0f, aVarA.f12727f, aVarA.f12728g, true);
            if (aVarA.f12725d > 0) {
                aVar2.a(fB7, fA7, aVarA.f12726e, false, false);
            }
            int i40 = aVarA.f12724c;
            if (i40 > 0) {
                aVar2.c(fB8, fA6, aVarA.f12723b, i40, false);
            }
            aVar2.a(f21, fA5, fMin3, false, true);
            bVarD = aVar2.d();
        }
        if (Q0()) {
            int iJ0 = J0();
            b.a aVar3 = new b.a(bVarD.f12151a, iJ0);
            float f22 = (iJ0 - bVarD.d().f12166b) - (bVarD.d().f12168d / 2.0f);
            List<b.C0034b> list2 = bVarD.f12153c;
            int size = list2.size() - 1;
            while (size >= 0) {
                b.C0034b c0034b3 = list2.get(size);
                float f23 = c0034b3.f12168d;
                aVar3.a((f23 / 2.0f) + f22, c0034b3.f12167c, f23, (size < bVarD.f12154d || size > bVarD.f12155e) ? 0 : i7, c0034b3.f12169e);
                f22 += c0034b3.f12168d;
                size--;
            }
            bVarD = aVar3.d();
        }
        com.google.android.material.carousel.b bVar2 = bVarD;
        List<b.C0034b> list3 = bVar2.f12153c;
        if (v() > 0) {
            RecyclerView.n nVar2 = (RecyclerView.n) u(0).getLayoutParams();
            if (this.f12145y.f12733a == 0) {
                i12 = ((ViewGroup.MarginLayoutParams) nVar2).leftMargin;
                i13 = ((ViewGroup.MarginLayoutParams) nVar2).rightMargin;
            } else {
                i12 = ((ViewGroup.MarginLayoutParams) nVar2).topMargin;
                i13 = ((ViewGroup.MarginLayoutParams) nVar2).bottomMargin;
            }
            i8 = i13 + i12;
        } else {
            i8 = 0;
        }
        float f24 = i8;
        RecyclerView recyclerView = this.f1473b;
        float fG = ((recyclerView == null || !recyclerView.f1432z) ? 0 : i7) != 0 ? 0 : this.f12145y.f12733a == i7 ? G() : E();
        RecyclerView recyclerView2 = this.f1473b;
        float fD = recyclerView2 != null && recyclerView2.f1432z ? 0 : this.f12145y.f12733a == 1 ? D() : F();
        this.f12140t.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar2);
        int i41 = 0;
        while (true) {
            i9 = bVar2.f12155e;
            i10 = bVar2.f12154d;
            if (i41 >= list3.size()) {
                i41 = -1;
                break;
            } else if (!list3.get(i41).f12169e) {
                break;
            } else {
                i41++;
            }
        }
        int i42 = P0() ? this.f1484n : this.f1485o;
        if (bVar2.a().f12166b - (bVar2.a().f12168d / 2.0f) >= 0.0f) {
            b.C0034b c0034bA = bVar2.a();
            int i43 = 0;
            while (true) {
                if (i43 >= list3.size()) {
                    c0034b2 = null;
                    break;
                }
                c0034b2 = list3.get(i43);
                if (!c0034b2.f12169e) {
                    break;
                } else {
                    i43++;
                }
            }
            if (c0034bA == c0034b2) {
                if (fG > 0.0f) {
                    arrayList.add(c.f(bVar2, fG, i42, true, f24));
                }
            } else if (i41 != -1) {
                int i44 = i10 - i41;
                float f25 = bVar2.b().f12166b - (bVar2.b().f12168d / 2.0f);
                if (i44 > 0 || bVar2.a().f12170f <= 0.0f) {
                    float f26 = 0.0f;
                    int i45 = 0;
                    while (i45 < i44) {
                        int i46 = i41;
                        com.google.android.material.carousel.b bVar3 = (com.google.android.material.carousel.b) arrayList.get(arrayList.size() - 1);
                        int i47 = i44;
                        int i48 = i46 + i45;
                        int size2 = list3.size() - 1;
                        f26 += list3.get(i48).f12170f;
                        int i49 = i48 - 1;
                        if (i49 >= 0) {
                            float f27 = list3.get(i49).f12167c;
                            int i50 = bVar3.f12155e;
                            List<b.C0034b> list4 = bVar3.f12153c;
                            bVar = bVar3;
                            f6 = f25;
                            int i51 = i50;
                            while (true) {
                                if (i51 >= list4.size()) {
                                    int size3 = list4.size();
                                    z6 = true;
                                    i51 = size3 - 1;
                                    break;
                                } else {
                                    if (f27 == list4.get(i51).f12167c) {
                                        z6 = true;
                                        break;
                                    }
                                    i51++;
                                }
                            }
                            size2 = i51 - 1;
                        } else {
                            bVar = bVar3;
                            f6 = f25;
                            z6 = true;
                        }
                        com.google.android.material.carousel.b bVarE = c.e(bVar, i46, size2, f6 + f26, (i10 - i45) - 1, (i9 - i45) - 1, i42);
                        if (i45 == i47 - 1 && fG > 0.0f) {
                            bVarE = c.f(bVarE, fG, i42, z6, f24);
                        }
                        arrayList.add(bVarE);
                        i45++;
                        i41 = i46;
                        i44 = i47;
                        f25 = f6;
                    }
                } else {
                    arrayList.add(c.e(bVar2, 0, 0, f25 + bVar2.a().f12170f + fG, bVar2.f12154d, bVar2.f12155e, i42));
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(bVar2);
        int size4 = list3.size() - 1;
        while (true) {
            if (size4 < 0) {
                size4 = -1;
                break;
            } else if (!list3.get(size4).f12169e) {
                break;
            } else {
                size4--;
            }
        }
        int i52 = P0() ? this.f1484n : this.f1485o;
        int i53 = this.f1485o;
        if (P0()) {
            i53 = this.f1484n;
        }
        if ((bVar2.c().f12168d / 2.0f) + bVar2.c().f12166b <= i53) {
            b.C0034b c0034bC = bVar2.c();
            int size5 = list3.size() - 1;
            while (true) {
                if (size5 < 0) {
                    c0034b = null;
                    break;
                }
                c0034b = list3.get(size5);
                if (!c0034b.f12169e) {
                    break;
                } else {
                    size5--;
                }
            }
            if (c0034bC == c0034b) {
                if (fD > 0.0f) {
                    arrayList2.add(c.f(bVar2, fD, i52, false, f24));
                }
            } else if (size4 != -1) {
                int i54 = size4 - i9;
                float f28 = bVar2.b().f12166b - (bVar2.b().f12168d / 2.0f);
                if (i54 > 0 || bVar2.c().f12170f <= 0.0f) {
                    int i55 = 0;
                    float f29 = 0.0f;
                    while (i55 < i54) {
                        int i56 = i54;
                        com.google.android.material.carousel.b bVar4 = (com.google.android.material.carousel.b) arrayList2.get(arrayList2.size() - 1);
                        float f30 = f28;
                        int i57 = size4 - i55;
                        f29 += list3.get(i57).f12170f;
                        int i58 = i57 + 1;
                        int i59 = size4;
                        if (i58 < list3.size()) {
                            float f31 = list3.get(i58).f12167c;
                            int i60 = bVar4.f12154d - 1;
                            while (true) {
                                if (i60 < 0) {
                                    list = list3;
                                    i60 = 0;
                                    break;
                                } else {
                                    list = list3;
                                    if (f31 == bVar4.f12153c.get(i60).f12167c) {
                                        break;
                                    }
                                    i60--;
                                    list3 = list;
                                }
                            }
                            i11 = i60 + 1;
                        } else {
                            list = list3;
                            i11 = 0;
                        }
                        com.google.android.material.carousel.b bVarE2 = c.e(bVar4, i59, i11, f30 - f29, i10 + i55 + 1, i9 + i55 + 1, i52);
                        if (i55 == i56 - 1 && fD > 0.0f) {
                            bVarE2 = c.f(bVarE2, fD, i52, false, f24);
                        }
                        arrayList2.add(bVarE2);
                        i55++;
                        i54 = i56;
                        size4 = i59;
                        f28 = f30;
                        list3 = list;
                    }
                } else {
                    arrayList2.add(c.e(bVar2, 0, 0, (f28 - bVar2.c().f12170f) - fD, bVar2.f12154d, bVar2.f12155e, i52));
                }
            }
        }
        this.f12141u = new c(bVar2, arrayList, arrayList2);
    }

    public final void V0() {
        this.f12141u = null;
        n0();
    }

    public final int W0(int i6, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (v() != 0 && i6 != 0) {
            if (this.f12141u == null) {
                U0(sVar);
            }
            int iB = B();
            c cVar = this.f12141u;
            if (iB > (Q0() ? cVar.a() : cVar.c()).f12152b) {
                int i7 = this.f12137p;
                int i8 = this.f12138q;
                int i9 = this.f12139r;
                int i10 = i7 + i6;
                if (i10 < i8) {
                    i6 = i8 - i7;
                } else if (i10 > i9) {
                    i6 = i9 - i7;
                }
                this.f12137p = i7 + i6;
                Z0(this.f12141u);
                float f6 = this.f12142v.f12151a / 2.0f;
                float fH0 = H0(RecyclerView.m.H(u(0)));
                Rect rect = new Rect();
                float f7 = Q0() ? this.f12142v.c().f12166b : this.f12142v.a().f12166b;
                float f8 = Float.MAX_VALUE;
                for (int i11 = 0; i11 < v(); i11++) {
                    View viewU = u(i11);
                    float fC0 = C0(fH0, f6);
                    b bVarO0 = O0(this.f12142v.f12153c, fC0, false);
                    float fG0 = G0(fC0, bVarO0);
                    super.y(viewU, rect);
                    Y0(viewU, fC0, bVarO0);
                    this.f12145y.j(viewU, rect, f6, fG0);
                    float fAbs = Math.abs(f7 - fG0);
                    if (fAbs < f8) {
                        this.B = RecyclerView.m.H(viewU);
                        f8 = fAbs;
                    }
                    fH0 = C0(fH0, this.f12142v.f12151a);
                }
                I0(sVar, xVar);
                return i6;
            }
        }
        return 0;
    }

    public final void X0(int i6) {
        f eVar;
        if (i6 != 0 && i6 != 1) {
            throw new IllegalArgumentException(androidx.camera.camera2.internal.compat.workaround.c.d(i6, "invalid orientation:"));
        }
        c(null);
        f fVar = this.f12145y;
        if (fVar == null || i6 != fVar.f12733a) {
            if (i6 == 0) {
                eVar = new e(this);
            } else {
                if (i6 != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                eVar = new d(this);
            }
            this.f12145y = eVar;
            V0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void Y(int i6, int i7) {
        a1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Y0(View view, float f6, b bVar) {
        if (view instanceof h) {
            b.C0034b c0034b = bVar.f12149a;
            float f7 = c0034b.f12167c;
            b.C0034b c0034b2 = bVar.f12150b;
            float fB = x3.a.b(f7, c0034b2.f12167c, c0034b.f12165a, c0034b2.f12165a, f6);
            float height = view.getHeight();
            float width = view.getWidth();
            RectF rectFB = this.f12145y.b(height, width, x3.a.b(0.0f, height / 2.0f, 0.0f, 1.0f, fB), x3.a.b(0.0f, width / 2.0f, 0.0f, 1.0f, fB));
            float fG0 = G0(f6, bVar);
            RectF rectF = new RectF(fG0 - (rectFB.width() / 2.0f), fG0 - (rectFB.height() / 2.0f), (rectFB.width() / 2.0f) + fG0, (rectFB.height() / 2.0f) + fG0);
            RectF rectF2 = new RectF(this.f12145y.d(), this.f12145y.g(), this.f12145y.e(), this.f12145y.c());
            this.f12140t.getClass();
            this.f12145y.a(rectFB, rectF, rectF2);
            this.f12145y.i(rectFB, rectF, rectF2);
            ((h) view).a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void Z() {
        a1();
    }

    public final void Z0(c cVar) {
        int i6 = this.f12139r;
        int i7 = this.f12138q;
        if (i6 <= i7) {
            this.f12142v = Q0() ? cVar.a() : cVar.c();
        } else {
            this.f12142v = cVar.b(this.f12137p, i7, i6);
        }
        List<b.C0034b> list = this.f12142v.f12153c;
        a aVar = this.s;
        aVar.getClass();
        aVar.f12148b = Collections.unmodifiableList(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.w.b
    public final PointF a(int i6) {
        if (this.f12141u == null) {
            return null;
        }
        int iM0 = M0(i6, L0(i6)) - this.f12137p;
        return P0() ? new PointF(iM0, 0.0f) : new PointF(0.0f, iM0);
    }

    public final void a1() {
        int iB = B();
        int i6 = this.A;
        if (iB == i6 || this.f12141u == null) {
            return;
        }
        i iVar = this.f12140t;
        if ((i6 < iVar.f12738c && B() >= iVar.f12738c) || (i6 >= iVar.f12738c && B() < iVar.f12738c)) {
            V0();
        }
        this.A = iB;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void b0(int i6, int i7) {
        a1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean d() {
        return P0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void d0(RecyclerView.s sVar, RecyclerView.x xVar) {
        if (xVar.b() <= 0 || J0() <= 0.0f) {
            i0(sVar);
            this.f12143w = 0;
            return;
        }
        boolean zQ0 = Q0();
        c cVar = this.f12141u;
        int i6 = 1;
        boolean z6 = cVar == null;
        if (z6 || cVar.f12172a.f12156f != J0()) {
            U0(sVar);
        }
        c cVar2 = this.f12141u;
        boolean zQ02 = Q0();
        com.google.android.material.carousel.b bVarA = zQ02 ? cVar2.a() : cVar2.c();
        float f6 = (zQ02 ? bVarA.c() : bVarA.a()).f12165a;
        float f7 = bVarA.f12151a / 2.0f;
        int iF = (int) (this.f12145y.f() - (Q0() ? f6 + f7 : f6 - f7));
        c cVar3 = this.f12141u;
        boolean zQ03 = Q0();
        com.google.android.material.carousel.b bVarC = zQ03 ? cVar3.c() : cVar3.a();
        b.C0034b c0034bA = zQ03 ? bVarC.a() : bVarC.c();
        int iB = (int) ((((zQ03 ? -1 : 1) * c0034bA.f12168d) / 2.0f) + ((((xVar.b() - 1) * bVarC.f12151a) * (zQ03 ? -1.0f : 1.0f)) - (c0034bA.f12165a - this.f12145y.f())));
        int iMin = zQ03 ? Math.min(0, iB) : Math.max(0, iB);
        this.f12138q = zQ0 ? iMin : iF;
        if (zQ0) {
            iMin = iF;
        }
        this.f12139r = iMin;
        if (z6) {
            this.f12137p = iF;
            c cVar4 = this.f12141u;
            int iB2 = B();
            int i7 = this.f12138q;
            int i8 = this.f12139r;
            boolean zQ04 = Q0();
            List<com.google.android.material.carousel.b> list = cVar4.f12173b;
            List<com.google.android.material.carousel.b> list2 = cVar4.f12174c;
            float f8 = cVar4.f12172a.f12151a;
            HashMap map = new HashMap();
            int i9 = 0;
            int i10 = 0;
            while (i9 < iB2) {
                int i11 = zQ04 ? (iB2 - i9) - i6 : i9;
                int i12 = i6;
                if (i11 * f8 * (zQ04 ? -1 : i12) > i8 - cVar4.f12178g || i9 >= iB2 - list2.size()) {
                    map.put(Integer.valueOf(i11), list2.get(e5.i.b(i10, 0, list2.size() - 1)));
                    i10++;
                }
                i9++;
                i6 = i12;
            }
            int i13 = i6;
            int i14 = 0;
            for (int i15 = iB2 - 1; i15 >= 0; i15--) {
                int i16 = zQ04 ? (iB2 - i15) - 1 : i15;
                if (i16 * f8 * (zQ04 ? -1 : i13) < i7 + cVar4.f12177f || i15 < list.size()) {
                    map.put(Integer.valueOf(i16), list.get(e5.i.b(i14, 0, list.size() - 1)));
                    i14++;
                }
            }
            this.f12144x = map;
            int i17 = this.B;
            if (i17 != -1) {
                this.f12137p = M0(i17, L0(i17));
            }
        }
        int i18 = this.f12137p;
        int i19 = this.f12138q;
        int i20 = this.f12139r;
        this.f12137p = (i18 < i19 ? i19 - i18 : i18 > i20 ? i20 - i18 : 0) + i18;
        this.f12143w = e5.i.b(this.f12143w, 0, xVar.b());
        Z0(this.f12141u);
        p(sVar);
        I0(sVar, xVar);
        this.A = B();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean e() {
        return !P0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void e0(RecyclerView.x xVar) {
        if (v() == 0) {
            this.f12143w = 0;
        } else {
            this.f12143w = RecyclerView.m.H(u(0));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int j(RecyclerView.x xVar) {
        if (v() == 0 || this.f12141u == null || B() <= 1) {
            return 0;
        }
        return (int) (this.f1484n * (this.f12141u.f12172a.f12151a / l(xVar)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int k(RecyclerView.x xVar) {
        return this.f12137p;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int l(RecyclerView.x xVar) {
        return this.f12139r - this.f12138q;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int m(RecyclerView.x xVar) {
        if (v() == 0 || this.f12141u == null || B() <= 1) {
            return 0;
        }
        return (int) (this.f1485o * (this.f12141u.f12172a.f12151a / o(xVar)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean m0(RecyclerView recyclerView, View view, Rect rect, boolean z6, boolean z7) {
        int iN0;
        if (this.f12141u == null || (iN0 = N0(RecyclerView.m.H(view), L0(RecyclerView.m.H(view)))) == 0) {
            return false;
        }
        int i6 = this.f12137p;
        int i7 = this.f12138q;
        int i8 = this.f12139r;
        int i9 = i6 + iN0;
        if (i9 < i7) {
            iN0 = i7 - i6;
        } else if (i9 > i8) {
            iN0 = i8 - i6;
        }
        int iN02 = N0(RecyclerView.m.H(view), this.f12141u.b(i6 + iN0, i7, i8));
        if (P0()) {
            recyclerView.scrollBy(iN02, 0);
            return true;
        }
        recyclerView.scrollBy(0, iN02);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int n(RecyclerView.x xVar) {
        return this.f12137p;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int o(RecyclerView.x xVar) {
        return this.f12139r - this.f12138q;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int o0(int i6, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (P0()) {
            return W0(i6, sVar, xVar);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void p0(int i6) {
        this.B = i6;
        if (this.f12141u == null) {
            return;
        }
        this.f12137p = M0(i6, L0(i6));
        this.f12143w = e5.i.b(i6, 0, Math.max(0, B() - 1));
        Z0(this.f12141u);
        n0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int q0(int i6, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (e()) {
            return W0(i6, sVar, xVar);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n r() {
        return new RecyclerView.n(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void y(View view, Rect rect) {
        super.y(view, rect);
        float fCenterY = rect.centerY();
        if (P0()) {
            fCenterY = rect.centerX();
        }
        b bVarO0 = O0(this.f12142v.f12153c, fCenterY, true);
        b.C0034b c0034b = bVarO0.f12149a;
        float f6 = c0034b.f12168d;
        b.C0034b c0034b2 = bVarO0.f12150b;
        float fB = x3.a.b(f6, c0034b2.f12168d, c0034b.f12166b, c0034b2.f12166b, fCenterY);
        float fWidth = P0() ? (rect.width() - fB) / 2.0f : 0.0f;
        float fHeight = P0() ? 0.0f : (rect.height() - fB) / 2.0f;
        rect.set((int) (rect.left + fWidth), (int) (rect.top + fHeight), (int) (rect.right - fWidth), (int) (rect.bottom - fHeight));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void z0(RecyclerView recyclerView, int i6) {
        d4.c cVar = new d4.c(this, recyclerView.getContext());
        cVar.f1512a = i6;
        A0(cVar);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i6, int i7) {
        this.s = new a();
        this.f12143w = 0;
        this.f12146z = new View.OnLayoutChangeListener() { // from class: d4.b
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i62, int i72, int i8, int i9, int i10, int i11, int i12, int i13) {
                if (i8 - i62 == i12 - i10 && i9 - i72 == i13 - i11) {
                    return;
                }
                view.post(new p(7, this.f12729a));
            }
        };
        this.B = -1;
        this.C = 0;
        this.f12140t = new i();
        V0();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w3.a.f15063c);
            this.C = typedArrayObtainStyledAttributes.getInt(0, 0);
            V0();
            X0(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
