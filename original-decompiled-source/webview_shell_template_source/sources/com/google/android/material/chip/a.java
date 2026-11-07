package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.material.focus.FocusRingDrawable;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import n4.h;
import q4.d;
import u4.g;
import u4.k;
import u4.l;
import x3.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a extends g implements Drawable.Callback, h.b {

    /* renamed from: h1, reason: collision with root package name */
    public static final int[] f12184h1 = {R.attr.state_enabled};

    /* renamed from: i1, reason: collision with root package name */
    public static final ShapeDrawable f12185i1 = new ShapeDrawable(new OvalShape());
    public float A0;
    public float B0;
    public float C0;
    public float D0;
    public float E0;
    public float F0;
    public final Context G0;
    public final Paint H0;
    public final Paint.FontMetrics I0;
    public final RectF J0;
    public final PointF K0;
    public final Path L0;
    public final h M0;
    public int N0;
    public int O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public boolean T0;
    public int U0;
    public int V0;
    public ColorFilter W0;
    public PorterDuffColorFilter X0;
    public ColorStateList Y0;
    public ColorStateList Z;
    public PorterDuff.Mode Z0;

    /* renamed from: a0, reason: collision with root package name */
    public ColorStateList f12186a0;

    /* renamed from: a1, reason: collision with root package name */
    public int[] f12187a1;

    /* renamed from: b0, reason: collision with root package name */
    public float f12188b0;

    /* renamed from: b1, reason: collision with root package name */
    public ColorStateList f12189b1;

    /* renamed from: c0, reason: collision with root package name */
    public float f12190c0;

    /* renamed from: c1, reason: collision with root package name */
    public WeakReference<InterfaceC0035a> f12191c1;

    /* renamed from: d0, reason: collision with root package name */
    public ColorStateList f12192d0;

    /* renamed from: d1, reason: collision with root package name */
    public TextUtils.TruncateAt f12193d1;

    /* renamed from: e0, reason: collision with root package name */
    public float f12194e0;

    /* renamed from: e1, reason: collision with root package name */
    public boolean f12195e1;

    /* renamed from: f0, reason: collision with root package name */
    public ColorStateList f12196f0;

    /* renamed from: f1, reason: collision with root package name */
    public int f12197f1;

    /* renamed from: g0, reason: collision with root package name */
    public CharSequence f12198g0;

    /* renamed from: g1, reason: collision with root package name */
    public boolean f12199g1;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f12200h0;

    /* renamed from: i0, reason: collision with root package name */
    public Drawable f12201i0;

    /* renamed from: j0, reason: collision with root package name */
    public ColorStateList f12202j0;

    /* renamed from: k0, reason: collision with root package name */
    public float f12203k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f12204l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f12205m0;

    /* renamed from: n0, reason: collision with root package name */
    public Drawable f12206n0;

    /* renamed from: o0, reason: collision with root package name */
    public RippleDrawable f12207o0;
    public ColorStateList p0;

    /* renamed from: q0, reason: collision with root package name */
    public float f12208q0;

    /* renamed from: r0, reason: collision with root package name */
    public SpannableStringBuilder f12209r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f12210s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f12211t0;

    /* renamed from: u0, reason: collision with root package name */
    public Drawable f12212u0;

    /* renamed from: v0, reason: collision with root package name */
    public ColorStateList f12213v0;

    /* renamed from: w0, reason: collision with root package name */
    public b f12214w0;

    /* renamed from: x0, reason: collision with root package name */
    public b f12215x0;

    /* renamed from: y0, reason: collision with root package name */
    public float f12216y0;

    /* renamed from: z0, reason: collision with root package name */
    public float f12217z0;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    public interface InterfaceC0035a {
        void a();
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.htmltoapk.template.R.attr.chipStyle, com.htmltoapk.template.R.style.Widget_MaterialComponents_Chip_Action);
        this.f12190c0 = -1.0f;
        this.H0 = new Paint(1);
        this.I0 = new Paint.FontMetrics();
        this.J0 = new RectF();
        this.K0 = new PointF();
        this.L0 = new Path();
        this.V0 = 255;
        this.Z0 = PorterDuff.Mode.SRC_IN;
        this.f12191c1 = new WeakReference<>(null);
        n(context);
        this.G0 = context;
        h hVar = new h(this);
        this.M0 = hVar;
        this.f12198g0 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        hVar.f13984a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f12184h1;
        setState(iArr);
        V(iArr);
        this.f12195e1 = true;
        f12185i1.setTint(-1);
    }

    public static boolean C(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean D(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static void f0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public final float A() {
        if (e0()) {
            return this.D0 + this.f12208q0 + this.E0;
        }
        return 0.0f;
    }

    public final float B() {
        if (!this.f12199g1) {
            return this.f12190c0;
        }
        float[] fArr = this.U;
        return fArr != null ? fArr[3] : this.f14610t.f14619a.c().f14639e.a(h());
    }

    public final void E() {
        InterfaceC0035a interfaceC0035a = this.f12191c1.get();
        if (interfaceC0035a != null) {
            interfaceC0035a.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean F(int[] iArr, int[] iArr2) {
        int colorForState;
        boolean z6;
        boolean z7;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.Z;
        int iD = d(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.N0) : 0);
        boolean state = true;
        if (this.N0 != iD) {
            this.N0 = iD;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f12186a0;
        int iD2 = d(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.O0) : 0);
        if (this.O0 != iD2) {
            this.O0 = iD2;
            zOnStateChange = true;
        }
        int iC = m0.a.c(iD2, iD);
        if ((this.P0 != iC) | (this.f14610t.f14621c == null)) {
            this.P0 = iC;
            r(ColorStateList.valueOf(iC));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.f12192d0;
        int colorForState2 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.Q0) : 0;
        if (this.Q0 != colorForState2) {
            this.Q0 = colorForState2;
            zOnStateChange = true;
        }
        if (this.f12189b1 != null) {
            int[] iArr3 = r4.a.f14309a;
            boolean z8 = false;
            boolean z9 = false;
            for (int i6 : iArr) {
                if (i6 == 16842910) {
                    z8 = true;
                } else if (i6 == 16842908 || i6 == 16842919 || i6 == 16843623) {
                    z9 = true;
                }
            }
            colorForState = (z8 && z9) ? this.f12189b1.getColorForState(iArr, this.R0) : 0;
        }
        if (this.R0 != colorForState) {
            this.R0 = colorForState;
        }
        d dVar = this.M0.f13989f;
        int colorForState3 = (dVar == null || (colorStateList = dVar.f14205k) == null) ? 0 : colorStateList.getColorForState(iArr, this.S0);
        if (this.S0 != colorForState3) {
            this.S0 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 == null) {
            z6 = false;
        } else {
            int length = state2.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                }
                if (state2[i7] != 16842912) {
                    i7++;
                } else if (this.f12210s0) {
                    z6 = true;
                }
            }
            z6 = false;
        }
        if (this.T0 == z6 || this.f12212u0 == null) {
            z7 = false;
        } else {
            float fZ = z();
            this.T0 = z6;
            if (fZ != z()) {
                zOnStateChange = true;
                z7 = true;
            } else {
                z7 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.Y0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.U0) : 0;
        if (this.U0 != colorForState4) {
            this.U0 = colorForState4;
            ColorStateList colorStateList6 = this.Y0;
            PorterDuff.Mode mode = this.Z0;
            this.X0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (D(this.f12201i0)) {
            state |= this.f12201i0.setState(iArr);
        }
        if (D(this.f12212u0)) {
            state |= this.f12212u0.setState(iArr);
        }
        if (D(this.f12206n0)) {
            int[] iArr4 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr4, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr4, iArr.length, iArr2.length);
            state |= this.f12206n0.setState(iArr4);
        }
        if (D(this.f12207o0)) {
            state |= this.f12207o0.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z7) {
            E();
        }
        return state;
    }

    public final void G(boolean z6) {
        if (this.f12210s0 != z6) {
            this.f12210s0 = z6;
            float fZ = z();
            if (!z6 && this.T0) {
                this.T0 = false;
            }
            float fZ2 = z();
            invalidateSelf();
            if (fZ != fZ2) {
                E();
            }
        }
    }

    public final void H(Drawable drawable) {
        if (this.f12212u0 != drawable) {
            float fZ = z();
            this.f12212u0 = drawable;
            float fZ2 = z();
            f0(this.f12212u0);
            x(this.f12212u0);
            invalidateSelf();
            if (fZ != fZ2) {
                E();
            }
        }
    }

    public final void I(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f12213v0 != colorStateList) {
            this.f12213v0 = colorStateList;
            if (this.f12211t0 && (drawable = this.f12212u0) != null && this.f12210s0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void J(boolean z6) {
        if (this.f12211t0 != z6) {
            boolean zC0 = c0();
            this.f12211t0 = z6;
            boolean zC02 = c0();
            if (zC0 != zC02) {
                if (zC02) {
                    x(this.f12212u0);
                } else {
                    f0(this.f12212u0);
                }
                invalidateSelf();
                E();
            }
        }
    }

    @Deprecated
    public final void K(float f6) {
        if (this.f12190c0 != f6) {
            this.f12190c0 = f6;
            setShapeAppearanceModel(j().a(f6));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void L(Drawable drawable) {
        Drawable drawableB;
        Drawable drawable2 = this.f12201i0;
        if (drawable2 != 0) {
            boolean z6 = drawable2 instanceof n0.b;
            drawableB = drawable2;
            if (z6) {
                drawableB = ((n0.b) drawable2).b();
            }
        } else {
            drawableB = null;
        }
        if (drawableB != drawable) {
            float fZ = z();
            this.f12201i0 = drawable != null ? drawable.mutate() : null;
            float fZ2 = z();
            f0(drawableB);
            if (d0()) {
                x(this.f12201i0);
            }
            invalidateSelf();
            if (fZ != fZ2) {
                E();
            }
        }
    }

    public final void M(float f6) {
        if (this.f12203k0 != f6) {
            float fZ = z();
            this.f12203k0 = f6;
            float fZ2 = z();
            invalidateSelf();
            if (fZ != fZ2) {
                E();
            }
        }
    }

    public final void N(ColorStateList colorStateList) {
        this.f12204l0 = true;
        if (this.f12202j0 != colorStateList) {
            this.f12202j0 = colorStateList;
            if (d0()) {
                this.f12201i0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void O(boolean z6) {
        if (this.f12200h0 != z6) {
            boolean zD0 = d0();
            this.f12200h0 = z6;
            boolean zD02 = d0();
            if (zD0 != zD02) {
                if (zD02) {
                    x(this.f12201i0);
                } else {
                    f0(this.f12201i0);
                }
                invalidateSelf();
                E();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        if (this.f12192d0 != colorStateList) {
            this.f12192d0 = colorStateList;
            if (this.f12199g1) {
                g.c cVar = this.f14610t;
                if (cVar.f14622d != colorStateList) {
                    cVar.f14622d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void Q(float f6) {
        if (this.f12194e0 != f6) {
            this.f12194e0 = f6;
            this.H0.setStrokeWidth(f6);
            if (this.f12199g1) {
                this.f14610t.f14627j = f6;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void R(Drawable drawable) {
        Drawable drawableB;
        Drawable drawable2 = this.f12206n0;
        if (drawable2 != 0) {
            boolean z6 = drawable2 instanceof n0.b;
            drawableB = drawable2;
            if (z6) {
                drawableB = ((n0.b) drawable2).b();
            }
        } else {
            drawableB = null;
        }
        if (drawableB != drawable) {
            float fA = A();
            this.f12206n0 = drawable != null ? drawable.mutate() : null;
            RippleDrawable rippleDrawable = new RippleDrawable(r4.a.a(this.f12196f0), this.f12206n0, f12185i1);
            FocusRingDrawable.e(this.G0, rippleDrawable, null);
            this.f12207o0 = rippleDrawable;
            float fA2 = A();
            f0(drawableB);
            if (e0()) {
                x(this.f12206n0);
            }
            invalidateSelf();
            if (fA != fA2) {
                E();
            }
        }
    }

    public final void S(float f6) {
        if (this.E0 != f6) {
            this.E0 = f6;
            invalidateSelf();
            if (e0()) {
                E();
            }
        }
    }

    public final void T(float f6) {
        if (this.f12208q0 != f6) {
            this.f12208q0 = f6;
            invalidateSelf();
            if (e0()) {
                E();
            }
        }
    }

    public final void U(float f6) {
        if (this.D0 != f6) {
            this.D0 = f6;
            invalidateSelf();
            if (e0()) {
                E();
            }
        }
    }

    public final boolean V(int[] iArr) {
        if (Arrays.equals(this.f12187a1, iArr)) {
            return false;
        }
        this.f12187a1 = iArr;
        if (e0()) {
            return F(getState(), iArr);
        }
        return false;
    }

    public final void W(ColorStateList colorStateList) {
        if (this.p0 != colorStateList) {
            this.p0 = colorStateList;
            if (e0()) {
                this.f12206n0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void X(boolean z6) {
        if (this.f12205m0 != z6) {
            boolean zE0 = e0();
            this.f12205m0 = z6;
            boolean zE02 = e0();
            if (zE0 != zE02) {
                if (zE02) {
                    x(this.f12206n0);
                } else {
                    f0(this.f12206n0);
                }
                invalidateSelf();
                E();
            }
        }
    }

    public final void Y(float f6) {
        if (this.A0 != f6) {
            float fZ = z();
            this.A0 = f6;
            float fZ2 = z();
            invalidateSelf();
            if (fZ != fZ2) {
                E();
            }
        }
    }

    public final void Z(float f6) {
        if (this.f12217z0 != f6) {
            float fZ = z();
            this.f12217z0 = f6;
            float fZ2 = z();
            invalidateSelf();
            if (fZ != fZ2) {
                E();
            }
        }
    }

    @Override // n4.h.b
    public final void a() {
        E();
        invalidateSelf();
    }

    public final void a0(ColorStateList colorStateList) {
        if (this.f12196f0 != colorStateList) {
            this.f12196f0 = colorStateList;
            this.f12189b1 = null;
            onStateChange(getState());
        }
    }

    public final void b0(d dVar) {
        h hVar = this.M0;
        h.a aVar = hVar.f13985b;
        TextPaint textPaint = hVar.f13984a;
        if (hVar.f13989f != dVar) {
            hVar.f13989f = dVar;
            if (dVar != null) {
                Context context = this.G0;
                dVar.e(context, textPaint, aVar);
                h.b bVar = hVar.f13988e.get();
                if (bVar != null) {
                    textPaint.drawableState = bVar.getState();
                }
                dVar.d(context, textPaint, aVar);
                hVar.f13987d = true;
            }
            h.b bVar2 = hVar.f13988e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public final boolean c0() {
        return this.f12211t0 && this.f12212u0 != null && this.T0;
    }

    public final boolean d0() {
        return this.f12200h0 && this.f12201i0 != null;
    }

    @Override // u4.g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i6;
        Canvas canvas2;
        int iSaveLayerAlpha;
        float f6;
        int i7;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i6 = this.V0) == 0) {
            return;
        }
        if (i6 < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i6);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        boolean z6 = this.f12199g1;
        Paint paint = this.H0;
        RectF rectF = this.J0;
        if (!z6) {
            paint.setColor(this.N0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, B(), B(), paint);
        }
        if (!this.f12199g1) {
            paint.setColor(this.O0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.W0;
            if (colorFilter == null) {
                colorFilter = this.X0;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, B(), B(), paint);
        }
        if (this.f12199g1) {
            super.draw(canvas);
        }
        if (this.f12194e0 > 0.0f && !this.f12199g1) {
            paint.setColor(this.Q0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f12199g1) {
                ColorFilter colorFilter2 = this.W0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.X0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f7 = bounds.left;
            float f8 = this.f12194e0 / 2.0f;
            rectF.set(f7 + f8, bounds.top + f8, bounds.right - f8, bounds.bottom - f8);
            float f9 = this.f12190c0 - (this.f12194e0 / 2.0f);
            canvas2.drawRoundRect(rectF, f9, f9, paint);
        }
        paint.setColor(this.R0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.f12199g1) {
            RectF rectF2 = new RectF(bounds);
            k kVarC = this.f14610t.f14619a.c();
            float[] fArr = this.U;
            float f10 = this.f14610t.f14626i;
            g.b bVar = this.J;
            l lVar = this.K;
            f6 = 2.0f;
            Path path = this.L0;
            lVar.a(kVarC, fArr, f10, rectF2, bVar, path);
            f(canvas2, paint, path, this.f14610t.f14619a.c(), this.U, h());
        } else {
            canvas2.drawRoundRect(rectF, B(), B(), paint);
            f6 = 2.0f;
        }
        if (d0()) {
            y(bounds, rectF);
            float f11 = rectF.left;
            float f12 = rectF.top;
            canvas2.translate(f11, f12);
            this.f12201i0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f12201i0.draw(canvas2);
            canvas2.translate(-f11, -f12);
        }
        if (c0()) {
            y(bounds, rectF);
            float f13 = rectF.left;
            float f14 = rectF.top;
            canvas2.translate(f13, f14);
            this.f12212u0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f12212u0.draw(canvas2);
            canvas2.translate(-f13, -f14);
        }
        if (this.f12195e1 && this.f12198g0 != null) {
            PointF pointF = this.K0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f12198g0;
            h hVar = this.M0;
            if (charSequence != null) {
                float fZ = z() + this.f12216y0 + this.B0;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + fZ;
                } else {
                    pointF.x = bounds.right - fZ;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = hVar.f13984a;
                Paint.FontMetrics fontMetrics = this.I0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / f6);
            }
            rectF.setEmpty();
            if (this.f12198g0 != null) {
                float fZ2 = z() + this.f12216y0 + this.B0;
                float fA = A() + this.F0 + this.C0;
                if (getLayoutDirection() == 0) {
                    rectF.left = bounds.left + fZ2;
                    rectF.right = bounds.right - fA;
                } else {
                    rectF.left = bounds.left + fA;
                    rectF.right = bounds.right - fZ2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            d dVar = hVar.f13989f;
            TextPaint textPaint2 = hVar.f13984a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                hVar.f13989f.d(this.G0, textPaint2, hVar.f13985b);
            }
            textPaint2.setTextAlign(align);
            boolean z7 = Math.round(hVar.a(this.f12198g0.toString())) > Math.round(rectF.width());
            if (z7) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF);
                i7 = iSave;
            } else {
                i7 = 0;
            }
            CharSequence charSequenceEllipsize = this.f12198g0;
            if (z7 && this.f12193d1 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.f12193d1);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z7) {
                canvas2.restoreToCount(i7);
            }
        }
        if (e0()) {
            rectF.setEmpty();
            if (e0()) {
                float f15 = this.F0 + this.E0;
                if (getLayoutDirection() == 0) {
                    float f16 = bounds.right - f15;
                    rectF.right = f16;
                    rectF.left = f16 - this.f12208q0;
                } else {
                    float f17 = bounds.left + f15;
                    rectF.left = f17;
                    rectF.right = f17 + this.f12208q0;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f18 = this.f12208q0;
                float f19 = fExactCenterY - (f18 / f6);
                rectF.top = f19;
                rectF.bottom = f19 + f18;
            }
            float f20 = rectF.left;
            float f21 = rectF.top;
            canvas2.translate(f20, f21);
            this.f12206n0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f12207o0.setBounds(this.f12206n0.getBounds());
            this.f12207o0.jumpToCurrentState();
            this.f12207o0.draw(canvas2);
            canvas2.translate(-f20, -f21);
        }
        if (this.V0 < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    public final boolean e0() {
        return this.f12205m0 && this.f12206n0 != null;
    }

    @Override // u4.g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.V0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.W0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f12188b0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(A() + this.M0.a(this.f12198g0.toString()) + z() + this.f12216y0 + this.B0 + this.C0 + this.F0), this.f12197f1);
    }

    @Override // u4.g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // u4.g, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.f12199g1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f12188b0, this.f12190c0);
        } else {
            outline.setRoundRect(bounds, this.f12190c0);
            outline2 = outline;
        }
        outline2.setAlpha(this.V0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // u4.g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (C(this.Z) || C(this.f12186a0) || C(this.f12192d0)) {
            return true;
        }
        d dVar = this.M0.f13989f;
        if (dVar == null || (colorStateList = dVar.f14205k) == null || !colorStateList.isStateful()) {
            return (this.f12211t0 && this.f12212u0 != null && this.f12210s0) || D(this.f12201i0) || D(this.f12212u0) || C(this.Y0);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i6) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i6);
        if (d0()) {
            zOnLayoutDirectionChanged |= this.f12201i0.setLayoutDirection(i6);
        }
        if (c0()) {
            zOnLayoutDirectionChanged |= this.f12212u0.setLayoutDirection(i6);
        }
        if (e0()) {
            zOnLayoutDirectionChanged |= this.f12206n0.setLayoutDirection(i6);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i6) {
        boolean zOnLevelChange = super.onLevelChange(i6);
        if (d0()) {
            zOnLevelChange |= this.f12201i0.setLevel(i6);
        }
        if (c0()) {
            zOnLevelChange |= this.f12212u0.setLevel(i6);
        }
        if (e0()) {
            zOnLevelChange |= this.f12206n0.setLevel(i6);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // u4.g, android.graphics.drawable.Drawable, n4.h.b
    public final boolean onStateChange(int[] iArr) {
        if (this.f12199g1) {
            super.onStateChange(iArr);
        }
        return F(iArr, this.f12187a1);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j6) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j6);
        }
    }

    @Override // u4.g, android.graphics.drawable.Drawable
    public final void setAlpha(int i6) {
        if (this.V0 != i6) {
            this.V0 = i6;
            invalidateSelf();
        }
    }

    @Override // u4.g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.W0 != colorFilter) {
            this.W0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // u4.g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.Y0 != colorStateList) {
            this.Y0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // u4.g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.Z0 != mode) {
            this.Z0 = mode;
            ColorStateList colorStateList = this.Y0;
            this.X0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z6, boolean z7) {
        boolean visible = super.setVisible(z6, z7);
        if (d0()) {
            visible |= this.f12201i0.setVisible(z6, z7);
        }
        if (c0()) {
            visible |= this.f12212u0.setVisible(z6, z7);
        }
        if (e0()) {
            visible |= this.f12206n0.setVisible(z6, z7);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void x(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f12206n0) {
            drawable.setTintList(this.p0);
            if (drawable.isStateful()) {
                drawable.setState(this.f12187a1);
                return;
            }
            return;
        }
        Drawable drawable2 = this.f12201i0;
        if (drawable == drawable2 && this.f12204l0) {
            drawable2.setTintList(this.f12202j0);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void y(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (d0() || c0()) {
            float f6 = this.f12216y0 + this.f12217z0;
            Drawable drawable = this.T0 ? this.f12212u0 : this.f12201i0;
            float intrinsicWidth = this.f12203k0;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f7 = rect.left + f6;
                rectF.left = f7;
                rectF.right = f7 + intrinsicWidth;
            } else {
                float f8 = rect.right - f6;
                rectF.right = f8;
                rectF.left = f8 - intrinsicWidth;
            }
            Drawable drawable2 = this.T0 ? this.f12212u0 : this.f12201i0;
            float fCeil = this.f12203k0;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.G0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    public final float z() {
        if (!d0() && !c0()) {
            return 0.0f;
        }
        float f6 = this.f12217z0;
        Drawable drawable = this.T0 ? this.f12212u0 : this.f12201i0;
        float intrinsicWidth = this.f12203k0;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f6 + this.A0;
    }
}
