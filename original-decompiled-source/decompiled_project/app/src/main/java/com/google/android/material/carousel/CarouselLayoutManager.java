package com.google.android.material.carousel;

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
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.i;
import androidx.recyclerview.widget.v;
import c1.x;
import com.basitce.htmltoapk.R;
import com.google.android.material.carousel.b;
import com.yalantis.ucrop.view.CropImageView;
import j2.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import rb.d;
import rb.e;
import rb.f;
import rb.g;
import rb.h;

/* loaded from: classes2.dex */
public class CarouselLayoutManager extends v.l implements v.AbstractC0038v.b {
    public int A;
    public int B;
    public final int C;

    /* renamed from: p, reason: collision with root package name */
    public int f6370p;

    /* renamed from: q, reason: collision with root package name */
    public int f6371q;

    /* renamed from: r, reason: collision with root package name */
    public int f6372r;

    /* renamed from: s, reason: collision with root package name */
    public final a f6373s;

    /* renamed from: t, reason: collision with root package name */
    public final h f6374t;

    /* renamed from: u, reason: collision with root package name */
    public c f6375u;

    /* renamed from: v, reason: collision with root package name */
    public com.google.android.material.carousel.b f6376v;

    /* renamed from: w, reason: collision with root package name */
    public int f6377w;

    /* renamed from: x, reason: collision with root package name */
    public HashMap f6378x;

    /* renamed from: y, reason: collision with root package name */
    public e f6379y;

    /* renamed from: z, reason: collision with root package name */
    public final View.OnLayoutChangeListener f6380z;

    public static class a extends v.k {

        /* renamed from: a, reason: collision with root package name */
        public final Paint f6381a;

        /* renamed from: b, reason: collision with root package name */
        public List<b.C0071b> f6382b;

        public a() {
            Paint paint = new Paint();
            this.f6381a = paint;
            this.f6382b = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.v.k
        public final void c(Canvas canvas, v vVar) throws Resources.NotFoundException {
            Canvas canvas2;
            float dimension = vVar.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
            Paint paint = this.f6381a;
            paint.setStrokeWidth(dimension);
            for (b.C0071b c0071b : this.f6382b) {
                float f10 = c0071b.f6402c;
                int i10 = r3.a.f23161a;
                float f11 = 1.0f - f10;
                paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * f10) + (Color.alpha(-65281) * f11)), (int) ((Color.red(-16776961) * f10) + (Color.red(-65281) * f11)), (int) ((Color.green(-16776961) * f10) + (Color.green(-65281) * f11)), (int) ((Color.blue(-16776961) * f10) + (Color.blue(-65281) * f11))));
                if (((CarouselLayoutManager) vVar.getLayoutManager()).O0()) {
                    canvas2 = canvas;
                    canvas2.drawLine(c0071b.f6401b, ((CarouselLayoutManager) vVar.getLayoutManager()).f6379y.g(), c0071b.f6401b, ((CarouselLayoutManager) vVar.getLayoutManager()).f6379y.c(), paint);
                } else {
                    float fD = ((CarouselLayoutManager) vVar.getLayoutManager()).f6379y.d();
                    float f12 = c0071b.f6401b;
                    float fE = ((CarouselLayoutManager) vVar.getLayoutManager()).f6379y.e();
                    float f13 = c0071b.f6401b;
                    canvas2 = canvas;
                    canvas2.drawLine(fD, f12, fE, f13, paint);
                }
                canvas = canvas2;
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final b.C0071b f6383a;

        /* renamed from: b, reason: collision with root package name */
        public final b.C0071b f6384b;

        public b(b.C0071b c0071b, b.C0071b c0071b2) {
            if (c0071b.f6400a > c0071b2.f6400a) {
                throw new IllegalArgumentException();
            }
            this.f6383a = c0071b;
            this.f6384b = c0071b2;
        }
    }

    public CarouselLayoutManager() {
        h hVar = new h();
        this.f6373s = new a();
        this.f6377w = 0;
        this.f6380z = new View.OnLayoutChangeListener() { // from class: rb.b
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                if (i12 - i10 == i16 - i14 && i13 - i11 == i17 - i15) {
                    return;
                }
                view.post(new i(this.f23334a, 1));
            }
        };
        this.B = -1;
        this.C = 0;
        this.f6374t = hVar;
        U0();
        W0(0);
    }

    public static b N0(List<b.C0071b> list, float f10, boolean z10) {
        float f11 = Float.MAX_VALUE;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        float f12 = -3.4028235E38f;
        float f13 = Float.MAX_VALUE;
        float f14 = Float.MAX_VALUE;
        for (int i14 = 0; i14 < list.size(); i14++) {
            b.C0071b c0071b = list.get(i14);
            float f15 = z10 ? c0071b.f6401b : c0071b.f6400a;
            float fAbs = Math.abs(f15 - f10);
            if (f15 <= f10 && fAbs <= f11) {
                i10 = i14;
                f11 = fAbs;
            }
            if (f15 > f10 && fAbs <= f13) {
                i12 = i14;
                f13 = fAbs;
            }
            if (f15 <= f14) {
                i11 = i14;
                f14 = f15;
            }
            if (f15 > f12) {
                i13 = i14;
                f12 = f15;
            }
        }
        if (i10 == -1) {
            i10 = i11;
        }
        if (i12 == -1) {
            i12 = i13;
        }
        return new b(list.get(i10), list.get(i12));
    }

    public final float B0(float f10, float f11) {
        return P0() ? f10 - f11 : f10 + f11;
    }

    public final void C0(v.r rVar, int i10, int i11) {
        if (i10 < 0 || i10 >= B()) {
            return;
        }
        float fG0 = G0(i10);
        View viewD = rVar.d(i10);
        S0(viewD);
        float fB0 = B0(fG0, this.f6376v.f6385a / 2.0f);
        b bVarN0 = N0(this.f6376v.f6387c, fB0, false);
        float fF0 = F0(fB0, bVarN0);
        float f10 = this.f6376v.f6385a / 2.0f;
        b(viewD, i11, false);
        S0(viewD);
        this.f6379y.h(viewD, (int) (fF0 - f10), (int) (fF0 + f10));
        X0(viewD, fB0, bVarN0);
    }

    public final void D0(int i10, v.r rVar, v.w wVar) {
        float fG0 = G0(i10);
        while (i10 < wVar.b()) {
            float fB0 = B0(fG0, this.f6376v.f6385a / 2.0f);
            b bVarN0 = N0(this.f6376v.f6387c, fB0, false);
            float fF0 = F0(fB0, bVarN0);
            if (Q0(fF0, bVarN0)) {
                return;
            }
            fG0 = B0(fG0, this.f6376v.f6385a);
            if (!R0(fF0, bVarN0)) {
                View viewD = rVar.d(i10);
                float f10 = this.f6376v.f6385a / 2.0f;
                b(viewD, -1, false);
                S0(viewD);
                this.f6379y.h(viewD, (int) (fF0 - f10), (int) (fF0 + f10));
                X0(viewD, fB0, bVarN0);
            }
            i10++;
        }
    }

    public final void E0(v.r rVar, int i10) {
        float fG0 = G0(i10);
        while (i10 >= 0) {
            float fB0 = B0(fG0, this.f6376v.f6385a / 2.0f);
            b bVarN0 = N0(this.f6376v.f6387c, fB0, false);
            float fF0 = F0(fB0, bVarN0);
            if (R0(fF0, bVarN0)) {
                return;
            }
            float f10 = this.f6376v.f6385a;
            fG0 = P0() ? fG0 + f10 : fG0 - f10;
            if (!Q0(fF0, bVarN0)) {
                View viewD = rVar.d(i10);
                float f11 = this.f6376v.f6385a / 2.0f;
                b(viewD, 0, false);
                S0(viewD);
                this.f6379y.h(viewD, (int) (fF0 - f11), (int) (fF0 + f11));
                X0(viewD, fB0, bVarN0);
            }
            i10--;
        }
    }

    public final float F0(float f10, b bVar) {
        b.C0071b c0071b = bVar.f6383a;
        float f11 = c0071b.f6401b;
        b.C0071b c0071b2 = bVar.f6384b;
        float f12 = c0071b2.f6401b;
        float f13 = c0071b.f6400a;
        float f14 = c0071b2.f6400a;
        float fB = nb.a.b(f11, f12, f13, f14, f10);
        if (c0071b2 != this.f6376v.b() && c0071b != this.f6376v.d()) {
            return fB;
        }
        return org.bouncycastle.jcajce.provider.digest.c.a(1.0f, c0071b2.f6402c, f10 - f14, fB);
    }

    public final float G0(int i10) {
        return B0(this.f6379y.f() - this.f6370p, this.f6376v.f6385a * i10);
    }

    public final void H0(v.r rVar, v.w wVar) {
        while (v() > 0) {
            View viewU = u(0);
            float fJ0 = J0(viewU);
            if (!R0(fJ0, N0(this.f6376v.f6387c, fJ0, true))) {
                break;
            } else {
                k0(viewU, rVar);
            }
        }
        while (v() - 1 >= 0) {
            View viewU2 = u(v() - 1);
            float fJ02 = J0(viewU2);
            if (!Q0(fJ02, N0(this.f6376v.f6387c, fJ02, true))) {
                break;
            } else {
                k0(viewU2, rVar);
            }
        }
        if (v() == 0) {
            E0(rVar, this.f6377w - 1);
            D0(this.f6377w, rVar, wVar);
        } else {
            int iH = v.l.H(u(0));
            int iH2 = v.l.H(u(v() - 1));
            E0(rVar, iH - 1);
            D0(iH2 + 1, rVar, wVar);
        }
    }

    public final int I0() {
        return O0() ? this.f2753n : this.f2754o;
    }

    public final float J0(View view) {
        super.y(view, new Rect());
        return O0() ? r0.centerX() : r0.centerY();
    }

    public final com.google.android.material.carousel.b K0(int i10) {
        com.google.android.material.carousel.b bVar;
        HashMap map = this.f6378x;
        return (map == null || (bVar = (com.google.android.material.carousel.b) map.get(Integer.valueOf(x.e(i10, 0, Math.max(0, B() + (-1)))))) == null) ? this.f6375u.f6408a : bVar;
    }

    @Override // androidx.recyclerview.widget.v.l
    public final boolean L() {
        return true;
    }

    public final int L0(int i10, com.google.android.material.carousel.b bVar) {
        if (!P0()) {
            return (int) ((bVar.f6385a / 2.0f) + ((i10 * bVar.f6385a) - bVar.a().f6400a));
        }
        float fI0 = I0() - bVar.c().f6400a;
        float f10 = bVar.f6385a;
        return (int) ((fI0 - (i10 * f10)) - (f10 / 2.0f));
    }

    public final int M0(int i10, com.google.android.material.carousel.b bVar) {
        int i11 = Integer.MAX_VALUE;
        for (b.C0071b c0071b : bVar.f6387c.subList(bVar.f6388d, bVar.f6389e + 1)) {
            float f10 = bVar.f6385a;
            float f11 = (f10 / 2.0f) + (i10 * f10);
            int iI0 = (P0() ? (int) ((I0() - c0071b.f6400a) - f11) : (int) (f11 - c0071b.f6400a)) - this.f6370p;
            if (Math.abs(i11) > Math.abs(iI0)) {
                i11 = iI0;
            }
        }
        return i11;
    }

    public final boolean O0() {
        return this.f6379y.f23337a == 0;
    }

    public final boolean P0() {
        return O0() && C() == 1;
    }

    public final boolean Q0(float f10, b bVar) {
        b.C0071b c0071b = bVar.f6383a;
        float f11 = c0071b.f6403d;
        b.C0071b c0071b2 = bVar.f6384b;
        float fB = nb.a.b(f11, c0071b2.f6403d, c0071b.f6401b, c0071b2.f6401b, f10) / 2.0f;
        float f12 = P0() ? f10 + fB : f10 - fB;
        return P0() ? f12 < CropImageView.DEFAULT_ASPECT_RATIO : f12 > ((float) I0());
    }

    @Override // androidx.recyclerview.widget.v.l
    public final void R(v vVar) throws Resources.NotFoundException {
        Context context = vVar.getContext();
        h hVar = this.f6374t;
        float dimension = hVar.f23338a;
        if (dimension <= CropImageView.DEFAULT_ASPECT_RATIO) {
            dimension = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        hVar.f23338a = dimension;
        float dimension2 = hVar.f23339b;
        if (dimension2 <= CropImageView.DEFAULT_ASPECT_RATIO) {
            dimension2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        hVar.f23339b = dimension2;
        U0();
        vVar.addOnLayoutChangeListener(this.f6380z);
    }

    public final boolean R0(float f10, b bVar) {
        b.C0071b c0071b = bVar.f6383a;
        float f11 = c0071b.f6403d;
        b.C0071b c0071b2 = bVar.f6384b;
        float fB0 = B0(f10, nb.a.b(f11, c0071b2.f6403d, c0071b.f6401b, c0071b2.f6401b, f10) / 2.0f);
        return P0() ? fB0 > ((float) I0()) : fB0 < CropImageView.DEFAULT_ASPECT_RATIO;
    }

    @Override // androidx.recyclerview.widget.v.l
    public final void S(v vVar) {
        vVar.removeOnLayoutChangeListener(this.f6380z);
    }

    public final void S0(View view) {
        if (!(view instanceof g)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        v.m mVar = (v.m) view.getLayoutParams();
        Rect rect = new Rect();
        v vVar = this.f2741b;
        if (vVar == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(vVar.K(view));
        }
        int i10 = rect.left + rect.right;
        int i11 = rect.top + rect.bottom;
        c cVar = this.f6375u;
        view.measure(v.l.w(O0(), this.f2753n, this.f2751l, F() + E() + ((ViewGroup.MarginLayoutParams) mVar).leftMargin + ((ViewGroup.MarginLayoutParams) mVar).rightMargin + i10, (int) ((cVar == null || this.f6379y.f23337a != 0) ? ((ViewGroup.MarginLayoutParams) mVar).width : cVar.f6408a.f6385a)), v.l.w(e(), this.f2754o, this.f2752m, D() + G() + ((ViewGroup.MarginLayoutParams) mVar).topMargin + ((ViewGroup.MarginLayoutParams) mVar).bottomMargin + i11, (int) ((cVar == null || this.f6379y.f23337a != 1) ? ((ViewGroup.MarginLayoutParams) mVar).height : cVar.f6408a.f6385a)));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    @Override // androidx.recyclerview.widget.v.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T(View view, int i10, v.r rVar, v.w wVar) {
        char c10;
        if (v() == 0) {
            return null;
        }
        int i11 = this.f6379y.f23337a;
        if (i10 == 1) {
            c10 = 65535;
        } else if (i10 == 2) {
            c10 = 1;
        } else if (i10 == 17) {
            if (i11 == 0) {
                if (P0()) {
                }
            }
            c10 = 0;
        } else if (i10 != 33) {
            if (i10 != 66) {
                if (i10 != 130) {
                    a5.a.a(i10, "Unknown focus request:", "CarouselLayoutManager");
                } else if (i11 == 1) {
                }
                c10 = 0;
            } else {
                if (i11 == 0) {
                    if (P0()) {
                    }
                }
                c10 = 0;
            }
        } else if (i11 != 1) {
            c10 = 0;
        }
        if (c10 == 0) {
            return null;
        }
        if (c10 == 65535) {
            if (v.l.H(view) == 0) {
                return null;
            }
            C0(rVar, v.l.H(u(0)) - 1, 0);
            return u(P0() ? v() - 1 : 0);
        }
        if (v.l.H(view) == B() - 1) {
            return null;
        }
        C0(rVar, v.l.H(u(v() - 1)) + 1, -1);
        return u(P0() ? 0 : v() - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x05f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T0(v.r rVar) {
        View view;
        boolean z10;
        int[] iArr;
        h hVar;
        com.google.android.material.carousel.b bVarD;
        int i10;
        int i11;
        int i12;
        com.google.android.material.carousel.b bVar;
        float f10;
        boolean z11;
        List<b.C0071b> list;
        int i13;
        b.C0071b c0071b;
        b.C0071b c0071b2;
        int i14;
        int i15;
        float f11;
        View viewD = rVar.d(0);
        S0(viewD);
        h hVar2 = this.f6374t;
        hVar2.getClass();
        int i16 = this.f2754o;
        if (O0()) {
            i16 = this.f2753n;
        }
        v.m mVar = (v.m) viewD.getLayoutParams();
        float f12 = ((ViewGroup.MarginLayoutParams) mVar).topMargin + ((ViewGroup.MarginLayoutParams) mVar).bottomMargin;
        float measuredHeight = viewD.getMeasuredHeight();
        if (O0()) {
            f12 = ((ViewGroup.MarginLayoutParams) mVar).leftMargin + ((ViewGroup.MarginLayoutParams) mVar).rightMargin;
            measuredHeight = viewD.getMeasuredWidth();
        }
        float f13 = hVar2.f23338a + f12;
        float fMax = Math.max(hVar2.f23339b + f12, f13);
        float f14 = i16;
        float fMin = Math.min(measuredHeight + f12, f14);
        float f15 = (measuredHeight / 3.0f) + f12;
        float f16 = f13 + f12;
        float f17 = fMax + f12;
        if (f15 < f16) {
            f17 = f16;
        } else if (f15 <= f17) {
            f17 = f15;
        }
        float f18 = (fMin + f17) / 2.0f;
        float f19 = f13 * 2.0f;
        int[] iArr2 = f14 <= f19 ? new int[]{0} : h.f23340d;
        int i17 = this.C;
        int[] iArr3 = h.f23341e;
        if (i17 == 1) {
            z10 = true;
            int length = iArr2.length;
            int[] iArr4 = new int[length];
            view = viewD;
            for (int i18 = 0; i18 < length; i18++) {
                iArr4[i18] = iArr2[i18] * 2;
            }
            int[] iArr5 = new int[2];
            for (int i19 = 0; i19 < 2; i19++) {
                iArr5[i19] = iArr3[i19] * 2;
            }
            iArr = iArr5;
            iArr2 = iArr4;
        } else {
            view = viewD;
            z10 = true;
            iArr = iArr3;
        }
        int length2 = iArr.length;
        int i20 = 0;
        int i21 = PKIFailureInfo.systemUnavail;
        while (i20 < length2) {
            int i22 = length2;
            int i23 = iArr[i20];
            if (i23 > i21) {
                i21 = i23;
            }
            i20++;
            length2 = i22;
        }
        float f20 = f14 - (i21 * f18);
        int length3 = iArr2.length;
        int i24 = 0;
        int i25 = PKIFailureInfo.systemUnavail;
        while (i24 < length3) {
            int i26 = i24;
            int i27 = iArr2[i26];
            if (i27 > i25) {
                i25 = i27;
            }
            i24 = i26 + 1;
        }
        float f21 = f17;
        int iMax = (int) Math.max(1.0d, Math.floor((f20 - (i25 * fMax)) / fMin));
        int iCeil = (int) Math.ceil(f14 / fMin);
        int i28 = (iCeil - iMax) + 1;
        int[] iArr6 = new int[i28];
        for (int i29 = 0; i29 < i28; i29++) {
            iArr6[i29] = iCeil - i29;
        }
        rb.a aVarA = rb.a.a(f14, f21, f13, fMax, iArr2, f18, iArr, fMin, iArr6);
        int i30 = aVarA.f23328c;
        int i31 = aVarA.f23332g;
        hVar2.f23342c = i30 + aVarA.f23329d + i31;
        int iB = B();
        int i32 = aVarA.f23328c;
        int i33 = aVarA.f23329d;
        int i34 = ((i32 + i33) + i31) - iB;
        boolean z12 = i34 > 0 && (i32 > 0 || i33 > 1);
        while (i34 > 0) {
            int i35 = aVarA.f23328c;
            if (i35 > 0) {
                aVarA.f23328c = i35 - 1;
            } else {
                int i36 = aVarA.f23329d;
                if (i36 > 1) {
                    aVarA.f23329d = i36 - 1;
                }
            }
            i34--;
        }
        int i37 = aVarA.f23329d;
        if (i37 == 0 && aVarA.f23328c == 0 && f14 > f19) {
            aVarA.f23328c = 1;
            z12 = true;
        }
        if (z12) {
            aVarA = rb.a.a(f14, f21, f13, fMax, new int[]{aVarA.f23328c}, f18, new int[]{i37}, fMin, new int[]{i31});
        }
        Context context = view.getContext();
        if (i17 == 1) {
            float fMin2 = Math.min(context.getResources().getDimension(R.dimen.m3_carousel_gone_size) + f12, aVarA.f23331f);
            float f22 = fMin2 / 2.0f;
            float f23 = CropImageView.DEFAULT_ASPECT_RATIO - f22;
            float fB = com.google.android.material.carousel.a.b(CropImageView.DEFAULT_ASPECT_RATIO, aVarA.f23327b, aVarA.f23328c);
            float fC = com.google.android.material.carousel.a.c(CropImageView.DEFAULT_ASPECT_RATIO, com.google.android.material.carousel.a.a(fB, aVarA.f23327b, (int) Math.floor(aVarA.f23328c / 2.0f)), aVarA.f23327b, aVarA.f23328c);
            float fB2 = com.google.android.material.carousel.a.b(fC, aVarA.f23330e, aVarA.f23329d);
            float fC2 = com.google.android.material.carousel.a.c(fC, com.google.android.material.carousel.a.a(fB2, aVarA.f23330e, (int) Math.floor(aVarA.f23329d / 2.0f)), aVarA.f23330e, aVarA.f23329d);
            float f24 = aVarA.f23331f;
            int i38 = aVarA.f23332g;
            float fB3 = com.google.android.material.carousel.a.b(fC2, f24, i38);
            float fC3 = com.google.android.material.carousel.a.c(fC2, com.google.android.material.carousel.a.a(fB3, aVarA.f23331f, i38), aVarA.f23331f, i38);
            float fB4 = com.google.android.material.carousel.a.b(fC3, aVarA.f23330e, aVarA.f23329d);
            hVar = hVar2;
            float fB5 = com.google.android.material.carousel.a.b(com.google.android.material.carousel.a.c(fC3, com.google.android.material.carousel.a.a(fB4, aVarA.f23330e, (int) Math.ceil(aVarA.f23329d / 2.0f)), aVarA.f23330e, aVarA.f23329d), aVarA.f23327b, aVarA.f23328c);
            float f25 = f14 + f22;
            float fA = f.a(fMin2, aVarA.f23331f, f12);
            float fA2 = f.a(aVarA.f23327b, aVarA.f23331f, f12);
            float fA3 = f.a(aVarA.f23330e, aVarA.f23331f, f12);
            b.a aVar = new b.a(aVarA.f23331f, i16);
            aVar.a(f23, fA, fMin2, false, true);
            if (aVarA.f23328c > 0) {
                aVar.c(fB, fA2, aVarA.f23327b, (int) Math.floor(r6 / 2.0f), false);
            }
            if (aVarA.f23329d > 0) {
                aVar.c(fB2, fA3, aVarA.f23330e, (int) Math.floor(r5 / 2.0f), false);
                f11 = fA3;
            } else {
                f11 = fA3;
            }
            aVar.c(fB3, CropImageView.DEFAULT_ASPECT_RATIO, aVarA.f23331f, aVarA.f23332g, true);
            if (aVarA.f23329d > 0) {
                aVar.c(fB4, f11, aVarA.f23330e, (int) Math.ceil(r3 / 2.0f), false);
            }
            if (aVarA.f23328c > 0) {
                aVar.c(fB5, fA2, aVarA.f23327b, (int) Math.ceil(r2 / 2.0f), false);
            }
            aVar.a(f25, fA, fMin2, false, true);
            bVarD = aVar.d();
        } else {
            hVar = hVar2;
            float fMin3 = Math.min(context.getResources().getDimension(R.dimen.m3_carousel_gone_size) + f12, aVarA.f23331f);
            float f26 = fMin3 / 2.0f;
            float f27 = CropImageView.DEFAULT_ASPECT_RATIO - f26;
            float f28 = aVarA.f23331f;
            int i39 = aVarA.f23332g;
            float fB6 = com.google.android.material.carousel.a.b(CropImageView.DEFAULT_ASPECT_RATIO, f28, i39);
            float fC4 = com.google.android.material.carousel.a.c(CropImageView.DEFAULT_ASPECT_RATIO, com.google.android.material.carousel.a.a(fB6, aVarA.f23331f, i39), aVarA.f23331f, i39);
            float fB7 = com.google.android.material.carousel.a.b(fC4, aVarA.f23330e, aVarA.f23329d);
            float fB8 = com.google.android.material.carousel.a.b(com.google.android.material.carousel.a.c(fC4, fB7, aVarA.f23330e, aVarA.f23329d), aVarA.f23327b, aVarA.f23328c);
            float f29 = f14 + f26;
            float fA4 = f.a(fMin3, aVarA.f23331f, f12);
            float fA5 = f.a(aVarA.f23327b, aVarA.f23331f, f12);
            float fA6 = f.a(aVarA.f23330e, aVarA.f23331f, f12);
            b.a aVar2 = new b.a(aVarA.f23331f, i16);
            aVar2.a(f27, fA4, fMin3, false, true);
            aVar2.c(fB6, CropImageView.DEFAULT_ASPECT_RATIO, aVarA.f23331f, aVarA.f23332g, true);
            if (aVarA.f23329d > 0) {
                aVar2.a(fB7, fA6, aVarA.f23330e, false, false);
            }
            int i40 = aVarA.f23328c;
            if (i40 > 0) {
                aVar2.c(fB8, fA5, aVarA.f23327b, i40, false);
            }
            aVar2.a(f29, fA4, fMin3, false, true);
            bVarD = aVar2.d();
        }
        if (P0()) {
            int iI0 = I0();
            b.a aVar3 = new b.a(bVarD.f6385a, iI0);
            float f30 = (iI0 - bVarD.d().f6401b) - (bVarD.d().f6403d / 2.0f);
            List<b.C0071b> list2 = bVarD.f6387c;
            int size = list2.size() - 1;
            while (size >= 0) {
                b.C0071b c0071b3 = list2.get(size);
                float f31 = c0071b3.f6403d;
                aVar3.a((f31 / 2.0f) + f30, c0071b3.f6402c, f31, size >= bVarD.f6388d && size <= bVarD.f6389e, c0071b3.f6404e);
                f30 += c0071b3.f6403d;
                size--;
            }
            bVarD = aVar3.d();
        }
        com.google.android.material.carousel.b bVar2 = bVarD;
        List<b.C0071b> list3 = bVar2.f6387c;
        if (v() > 0) {
            v.m mVar2 = (v.m) u(0).getLayoutParams();
            if (this.f6379y.f23337a == 0) {
                i14 = ((ViewGroup.MarginLayoutParams) mVar2).leftMargin;
                i15 = ((ViewGroup.MarginLayoutParams) mVar2).rightMargin;
            } else {
                i14 = ((ViewGroup.MarginLayoutParams) mVar2).topMargin;
                i15 = ((ViewGroup.MarginLayoutParams) mVar2).bottomMargin;
            }
            i10 = i15 + i14;
        } else {
            i10 = 0;
        }
        float f32 = i10;
        v vVar = this.f2741b;
        float fG = vVar != null && vVar.f2671h ? 0 : this.f6379y.f23337a == 1 ? G() : E();
        v vVar2 = this.f2741b;
        float fD = vVar2 != null && vVar2.f2671h ? 0 : this.f6379y.f23337a == 1 ? D() : F();
        hVar.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar2);
        int i41 = 0;
        while (true) {
            i11 = bVar2.f6389e;
            i12 = bVar2.f6388d;
            if (i41 >= list3.size()) {
                i41 = -1;
                break;
            } else if (!list3.get(i41).f6404e) {
                break;
            } else {
                i41++;
            }
        }
        int i42 = O0() ? this.f2753n : this.f2754o;
        if (bVar2.a().f6401b - (bVar2.a().f6403d / 2.0f) >= CropImageView.DEFAULT_ASPECT_RATIO) {
            b.C0071b c0071bA = bVar2.a();
            int i43 = 0;
            while (true) {
                if (i43 >= list3.size()) {
                    c0071b2 = null;
                    break;
                }
                c0071b2 = list3.get(i43);
                if (!c0071b2.f6404e) {
                    break;
                } else {
                    i43++;
                }
            }
            if (c0071bA == c0071b2) {
                if (fG > CropImageView.DEFAULT_ASPECT_RATIO) {
                    arrayList.add(c.f(bVar2, fG, i42, true, f32));
                }
            } else if (i41 != -1) {
                int i44 = i12 - i41;
                float f33 = bVar2.b().f6401b - (bVar2.b().f6403d / 2.0f);
                if (i44 > 0 || bVar2.a().f6405f <= CropImageView.DEFAULT_ASPECT_RATIO) {
                    float f34 = CropImageView.DEFAULT_ASPECT_RATIO;
                    int i45 = 0;
                    while (i45 < i44) {
                        int i46 = i41;
                        com.google.android.material.carousel.b bVar3 = (com.google.android.material.carousel.b) l.b.b(arrayList, 1);
                        int i47 = i44;
                        int i48 = i46 + i45;
                        int size2 = list3.size() - 1;
                        f34 += list3.get(i48).f6405f;
                        int i49 = i48 - 1;
                        if (i49 >= 0) {
                            float f35 = list3.get(i49).f6402c;
                            int i50 = bVar3.f6389e;
                            List<b.C0071b> list4 = bVar3.f6387c;
                            bVar = bVar3;
                            f10 = f33;
                            int i51 = i50;
                            while (true) {
                                if (i51 >= list4.size()) {
                                    int size3 = list4.size();
                                    z11 = true;
                                    i51 = size3 - 1;
                                    break;
                                } else {
                                    if (f35 == list4.get(i51).f6402c) {
                                        z11 = true;
                                        break;
                                    }
                                    i51++;
                                }
                            }
                            size2 = i51 - 1;
                        } else {
                            bVar = bVar3;
                            f10 = f33;
                            z11 = true;
                        }
                        com.google.android.material.carousel.b bVarE = c.e(bVar, i46, size2, f10 + f34, (i12 - i45) - 1, (i11 - i45) - 1, i42);
                        if (i45 == i47 - 1 && fG > CropImageView.DEFAULT_ASPECT_RATIO) {
                            bVarE = c.f(bVarE, fG, i42, z11, f32);
                        }
                        arrayList.add(bVarE);
                        i45++;
                        i41 = i46;
                        i44 = i47;
                        f33 = f10;
                    }
                } else {
                    arrayList.add(c.e(bVar2, 0, 0, f33 + bVar2.a().f6405f + fG, bVar2.f6388d, bVar2.f6389e, i42));
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
            } else if (!list3.get(size4).f6404e) {
                break;
            } else {
                size4--;
            }
        }
        int i52 = O0() ? this.f2753n : this.f2754o;
        int i53 = this.f2754o;
        if (O0()) {
            i53 = this.f2753n;
        }
        if ((bVar2.c().f6403d / 2.0f) + bVar2.c().f6401b <= i53) {
            b.C0071b c0071bC = bVar2.c();
            int size5 = list3.size() - 1;
            while (true) {
                if (size5 < 0) {
                    c0071b = null;
                    break;
                }
                c0071b = list3.get(size5);
                if (!c0071b.f6404e) {
                    break;
                } else {
                    size5--;
                }
            }
            if (c0071bC == c0071b) {
                if (fD > CropImageView.DEFAULT_ASPECT_RATIO) {
                    arrayList2.add(c.f(bVar2, fD, i52, false, f32));
                }
            } else if (size4 != -1) {
                int i54 = size4 - i11;
                float f36 = bVar2.b().f6401b - (bVar2.b().f6403d / 2.0f);
                if (i54 > 0 || bVar2.c().f6405f <= CropImageView.DEFAULT_ASPECT_RATIO) {
                    int i55 = 0;
                    float f37 = CropImageView.DEFAULT_ASPECT_RATIO;
                    while (i55 < i54) {
                        int i56 = i54;
                        com.google.android.material.carousel.b bVar4 = (com.google.android.material.carousel.b) l.b.b(arrayList2, 1);
                        float f38 = f36;
                        int i57 = size4 - i55;
                        f37 += list3.get(i57).f6405f;
                        int i58 = i57 + 1;
                        int i59 = size4;
                        if (i58 < list3.size()) {
                            float f39 = list3.get(i58).f6402c;
                            int i60 = bVar4.f6388d - 1;
                            while (true) {
                                if (i60 < 0) {
                                    list = list3;
                                    i60 = 0;
                                    break;
                                } else {
                                    list = list3;
                                    if (f39 == bVar4.f6387c.get(i60).f6402c) {
                                        break;
                                    }
                                    i60--;
                                    list3 = list;
                                }
                            }
                            i13 = i60 + 1;
                        } else {
                            list = list3;
                            i13 = 0;
                        }
                        com.google.android.material.carousel.b bVarE2 = c.e(bVar4, i59, i13, f38 - f37, i12 + i55 + 1, i11 + i55 + 1, i52);
                        if (i55 == i56 - 1 && fD > CropImageView.DEFAULT_ASPECT_RATIO) {
                            bVarE2 = c.f(bVarE2, fD, i52, false, f32);
                        }
                        arrayList2.add(bVarE2);
                        i55++;
                        i54 = i56;
                        size4 = i59;
                        f36 = f38;
                        list3 = list;
                    }
                } else {
                    arrayList2.add(c.e(bVar2, 0, 0, (f36 - bVar2.c().f6405f) - fD, bVar2.f6388d, bVar2.f6389e, i52));
                }
            }
        }
        this.f6375u = new c(bVar2, arrayList, arrayList2);
    }

    @Override // androidx.recyclerview.widget.v.l
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(v.l.H(u(0)));
            accessibilityEvent.setToIndex(v.l.H(u(v() - 1)));
        }
    }

    public final void U0() {
        this.f6375u = null;
        n0();
    }

    public final int V0(int i10, v.r rVar, v.w wVar) {
        if (v() != 0 && i10 != 0) {
            if (this.f6375u == null) {
                T0(rVar);
            }
            int iB = B();
            c cVar = this.f6375u;
            if (iB > (P0() ? cVar.a() : cVar.c()).f6386b) {
                int i11 = this.f6370p;
                int i12 = this.f6371q;
                int i13 = this.f6372r;
                int i14 = i11 + i10;
                if (i14 < i12) {
                    i10 = i12 - i11;
                } else if (i14 > i13) {
                    i10 = i13 - i11;
                }
                this.f6370p = i11 + i10;
                Y0(this.f6375u);
                float f10 = this.f6376v.f6385a / 2.0f;
                float fG0 = G0(v.l.H(u(0)));
                Rect rect = new Rect();
                float f11 = P0() ? this.f6376v.c().f6401b : this.f6376v.a().f6401b;
                float f12 = Float.MAX_VALUE;
                for (int i15 = 0; i15 < v(); i15++) {
                    View viewU = u(i15);
                    float fB0 = B0(fG0, f10);
                    b bVarN0 = N0(this.f6376v.f6387c, fB0, false);
                    float fF0 = F0(fB0, bVarN0);
                    super.y(viewU, rect);
                    X0(viewU, fB0, bVarN0);
                    this.f6379y.j(viewU, rect, f10, fF0);
                    float fAbs = Math.abs(f11 - fF0);
                    if (fAbs < f12) {
                        this.B = v.l.H(viewU);
                        f12 = fAbs;
                    }
                    fG0 = B0(fG0, this.f6376v.f6385a);
                }
                H0(rVar, wVar);
                return i10;
            }
        }
        return 0;
    }

    public final void W0(int i10) {
        e dVar;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(y.a(i10, "invalid orientation:"));
        }
        c(null);
        e eVar = this.f6379y;
        if (eVar == null || i10 != eVar.f23337a) {
            if (i10 == 0) {
                dVar = new d(this);
            } else {
                if (i10 != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                dVar = new rb.c(this);
            }
            this.f6379y = dVar;
            U0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void X0(View view, float f10, b bVar) {
        if (view instanceof g) {
            b.C0071b c0071b = bVar.f6383a;
            float f11 = c0071b.f6402c;
            b.C0071b c0071b2 = bVar.f6384b;
            float fB = nb.a.b(f11, c0071b2.f6402c, c0071b.f6400a, c0071b2.f6400a, f10);
            float height = view.getHeight();
            float width = view.getWidth();
            RectF rectFB = this.f6379y.b(height, width, nb.a.b(CropImageView.DEFAULT_ASPECT_RATIO, height / 2.0f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, fB), nb.a.b(CropImageView.DEFAULT_ASPECT_RATIO, width / 2.0f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, fB));
            float fF0 = F0(f10, bVar);
            RectF rectF = new RectF(fF0 - (rectFB.width() / 2.0f), fF0 - (rectFB.height() / 2.0f), (rectFB.width() / 2.0f) + fF0, (rectFB.height() / 2.0f) + fF0);
            RectF rectF2 = new RectF(this.f6379y.d(), this.f6379y.g(), this.f6379y.e(), this.f6379y.c());
            this.f6374t.getClass();
            this.f6379y.a(rectFB, rectF, rectF2);
            this.f6379y.i(rectFB, rectF, rectF2);
            ((g) view).a();
        }
    }

    @Override // androidx.recyclerview.widget.v.l
    public final void Y(int i10, int i11) {
        Z0();
    }

    public final void Y0(c cVar) {
        int i10 = this.f6372r;
        int i11 = this.f6371q;
        if (i10 <= i11) {
            this.f6376v = P0() ? cVar.a() : cVar.c();
        } else {
            this.f6376v = cVar.b(this.f6370p, i11, i10);
        }
        List<b.C0071b> list = this.f6376v.f6387c;
        a aVar = this.f6373s;
        aVar.getClass();
        aVar.f6382b = Collections.unmodifiableList(list);
    }

    @Override // androidx.recyclerview.widget.v.l
    public final void Z() {
        Z0();
    }

    public final void Z0() {
        int iB = B();
        int i10 = this.A;
        if (iB == i10 || this.f6375u == null) {
            return;
        }
        h hVar = this.f6374t;
        if ((i10 < hVar.f23342c && B() >= hVar.f23342c) || (i10 >= hVar.f23342c && B() < hVar.f23342c)) {
            U0();
        }
        this.A = iB;
    }

    @Override // androidx.recyclerview.widget.v.AbstractC0038v.b
    public final PointF a(int i10) {
        if (this.f6375u == null) {
            return null;
        }
        int iL0 = L0(i10, K0(i10)) - this.f6370p;
        return O0() ? new PointF(iL0, CropImageView.DEFAULT_ASPECT_RATIO) : new PointF(CropImageView.DEFAULT_ASPECT_RATIO, iL0);
    }

    @Override // androidx.recyclerview.widget.v.l
    public final void b0(int i10, int i11) {
        Z0();
    }

    @Override // androidx.recyclerview.widget.v.l
    public final boolean d() {
        return O0();
    }

    @Override // androidx.recyclerview.widget.v.l
    public final void d0(v.r rVar, v.w wVar) {
        if (wVar.b() <= 0 || I0() <= CropImageView.DEFAULT_ASPECT_RATIO) {
            i0(rVar);
            this.f6377w = 0;
            return;
        }
        boolean zP0 = P0();
        c cVar = this.f6375u;
        int i10 = 1;
        boolean z10 = cVar == null;
        if (z10 || cVar.f6408a.f6390f != I0()) {
            T0(rVar);
        }
        c cVar2 = this.f6375u;
        boolean zP02 = P0();
        com.google.android.material.carousel.b bVarA = zP02 ? cVar2.a() : cVar2.c();
        float f10 = (zP02 ? bVarA.c() : bVarA.a()).f6400a;
        float f11 = bVarA.f6385a / 2.0f;
        int iF = (int) (this.f6379y.f() - (P0() ? f10 + f11 : f10 - f11));
        c cVar3 = this.f6375u;
        boolean zP03 = P0();
        com.google.android.material.carousel.b bVarC = zP03 ? cVar3.c() : cVar3.a();
        b.C0071b c0071bA = zP03 ? bVarC.a() : bVarC.c();
        int iB = (int) ((((zP03 ? -1 : 1) * c0071bA.f6403d) / 2.0f) + ((((wVar.b() - 1) * bVarC.f6385a) * (zP03 ? -1.0f : 1.0f)) - (c0071bA.f6400a - this.f6379y.f())));
        int iMin = zP03 ? Math.min(0, iB) : Math.max(0, iB);
        this.f6371q = zP0 ? iMin : iF;
        if (zP0) {
            iMin = iF;
        }
        this.f6372r = iMin;
        if (z10) {
            this.f6370p = iF;
            c cVar4 = this.f6375u;
            int iB2 = B();
            int i11 = this.f6371q;
            int i12 = this.f6372r;
            boolean zP04 = P0();
            List<com.google.android.material.carousel.b> list = cVar4.f6409b;
            List<com.google.android.material.carousel.b> list2 = cVar4.f6410c;
            float f12 = cVar4.f6408a.f6385a;
            HashMap map = new HashMap();
            int i13 = 0;
            int i14 = 0;
            while (i13 < iB2) {
                int i15 = zP04 ? (iB2 - i13) - i10 : i13;
                int i16 = i10;
                if (i15 * f12 * (zP04 ? -1 : i16) > i12 - cVar4.f6414g || i13 >= iB2 - list2.size()) {
                    map.put(Integer.valueOf(i15), list2.get(x.e(i14, 0, list2.size() - 1)));
                    i14++;
                }
                i13++;
                i10 = i16;
            }
            int i17 = i10;
            int i18 = 0;
            for (int i19 = iB2 - 1; i19 >= 0; i19--) {
                int i20 = zP04 ? (iB2 - i19) - 1 : i19;
                if (i20 * f12 * (zP04 ? -1 : i17) < i11 + cVar4.f6413f || i19 < list.size()) {
                    map.put(Integer.valueOf(i20), list.get(x.e(i18, 0, list.size() - 1)));
                    i18++;
                }
            }
            this.f6378x = map;
            int i21 = this.B;
            if (i21 != -1) {
                this.f6370p = L0(i21, K0(i21));
            }
        }
        int i22 = this.f6370p;
        int i23 = this.f6371q;
        int i24 = this.f6372r;
        this.f6370p = (i22 < i23 ? i23 - i22 : i22 > i24 ? i24 - i22 : 0) + i22;
        this.f6377w = x.e(this.f6377w, 0, wVar.b());
        Y0(this.f6375u);
        p(rVar);
        H0(rVar, wVar);
        this.A = B();
    }

    @Override // androidx.recyclerview.widget.v.l
    public final boolean e() {
        return !O0();
    }

    @Override // androidx.recyclerview.widget.v.l
    public final void e0(v.w wVar) {
        if (v() == 0) {
            this.f6377w = 0;
        } else {
            this.f6377w = v.l.H(u(0));
        }
    }

    @Override // androidx.recyclerview.widget.v.l
    public final int j(v.w wVar) {
        if (v() == 0 || this.f6375u == null || B() <= 1) {
            return 0;
        }
        return (int) (this.f2753n * (this.f6375u.f6408a.f6385a / l(wVar)));
    }

    @Override // androidx.recyclerview.widget.v.l
    public final int k(v.w wVar) {
        return this.f6370p;
    }

    @Override // androidx.recyclerview.widget.v.l
    public final int l(v.w wVar) {
        return this.f6372r - this.f6371q;
    }

    @Override // androidx.recyclerview.widget.v.l
    public final int m(v.w wVar) {
        if (v() == 0 || this.f6375u == null || B() <= 1) {
            return 0;
        }
        return (int) (this.f2754o * (this.f6375u.f6408a.f6385a / o(wVar)));
    }

    @Override // androidx.recyclerview.widget.v.l
    public final boolean m0(v vVar, View view, Rect rect, boolean z10, boolean z11) {
        int iM0;
        if (this.f6375u == null || (iM0 = M0(v.l.H(view), K0(v.l.H(view)))) == 0) {
            return false;
        }
        int i10 = this.f6370p;
        int i11 = this.f6371q;
        int i12 = this.f6372r;
        int i13 = i10 + iM0;
        if (i13 < i11) {
            iM0 = i11 - i10;
        } else if (i13 > i12) {
            iM0 = i12 - i10;
        }
        int iM02 = M0(v.l.H(view), this.f6375u.b(i10 + iM0, i11, i12));
        if (O0()) {
            vVar.scrollBy(iM02, 0);
            return true;
        }
        vVar.scrollBy(0, iM02);
        return true;
    }

    @Override // androidx.recyclerview.widget.v.l
    public final int n(v.w wVar) {
        return this.f6370p;
    }

    @Override // androidx.recyclerview.widget.v.l
    public final int o(v.w wVar) {
        return this.f6372r - this.f6371q;
    }

    @Override // androidx.recyclerview.widget.v.l
    public final int o0(int i10, v.r rVar, v.w wVar) {
        if (O0()) {
            return V0(i10, rVar, wVar);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.v.l
    public final void p0(int i10) {
        this.B = i10;
        if (this.f6375u == null) {
            return;
        }
        this.f6370p = L0(i10, K0(i10));
        this.f6377w = x.e(i10, 0, Math.max(0, B() - 1));
        Y0(this.f6375u);
        n0();
    }

    @Override // androidx.recyclerview.widget.v.l
    public final int q0(int i10, v.r rVar, v.w wVar) {
        if (e()) {
            return V0(i10, rVar, wVar);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.v.l
    public final v.m r() {
        return new v.m(-2, -2);
    }

    @Override // androidx.recyclerview.widget.v.l
    public final void y(View view, Rect rect) {
        super.y(view, rect);
        float fCenterY = rect.centerY();
        if (O0()) {
            fCenterY = rect.centerX();
        }
        b bVarN0 = N0(this.f6376v.f6387c, fCenterY, true);
        b.C0071b c0071b = bVarN0.f6383a;
        float f10 = c0071b.f6403d;
        b.C0071b c0071b2 = bVarN0.f6384b;
        float fB = nb.a.b(f10, c0071b2.f6403d, c0071b.f6401b, c0071b2.f6401b, fCenterY);
        boolean zO0 = O0();
        float fHeight = CropImageView.DEFAULT_ASPECT_RATIO;
        float fWidth = zO0 ? (rect.width() - fB) / 2.0f : 0.0f;
        if (!O0()) {
            fHeight = (rect.height() - fB) / 2.0f;
        }
        rect.set((int) (rect.left + fWidth), (int) (rect.top + fHeight), (int) (rect.right - fWidth), (int) (rect.bottom - fHeight));
    }

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f6373s = new a();
        this.f6377w = 0;
        this.f6380z = new View.OnLayoutChangeListener() { // from class: rb.b
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i102, int i112, int i12, int i13, int i14, int i15, int i16, int i17) {
                if (i12 - i102 == i16 - i14 && i13 - i112 == i17 - i15) {
                    return;
                }
                view.post(new i(this.f23334a, 1));
            }
        };
        this.B = -1;
        this.C = 0;
        this.f6374t = new h();
        U0();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mb.a.f18029c);
            this.C = typedArrayObtainStyledAttributes.getInt(0, 0);
            U0();
            W0(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
