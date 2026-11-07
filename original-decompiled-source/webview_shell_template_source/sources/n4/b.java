package n4;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b {
    public CharSequence B;
    public CharSequence C;
    public boolean D;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public int K;
    public int L;
    public int[] M;
    public boolean N;
    public final TextPaint O;
    public final TextPaint P;
    public TimeInterpolator Q;
    public TimeInterpolator R;
    public float S;
    public float T;
    public float U;
    public ColorStateList V;
    public float W;
    public float X;
    public float Y;
    public StaticLayout Z;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f13932a;

    /* renamed from: a0, reason: collision with root package name */
    public float f13933a0;

    /* renamed from: b, reason: collision with root package name */
    public float f13934b;

    /* renamed from: b0, reason: collision with root package name */
    public float f13935b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f13936c;

    /* renamed from: c0, reason: collision with root package name */
    public float f13937c0;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f13938d;

    /* renamed from: d0, reason: collision with root package name */
    public CharSequence f13939d0;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f13940e;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f13949j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f13951k;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f13952k0;

    /* renamed from: l, reason: collision with root package name */
    public int f13953l;

    /* renamed from: m, reason: collision with root package name */
    public float f13954m;

    /* renamed from: n, reason: collision with root package name */
    public float f13955n;

    /* renamed from: o, reason: collision with root package name */
    public float f13956o;

    /* renamed from: p, reason: collision with root package name */
    public float f13957p;

    /* renamed from: q, reason: collision with root package name */
    public float f13958q;

    /* renamed from: r, reason: collision with root package name */
    public float f13959r;
    public Typeface s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f13960t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f13961u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f13962v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f13963w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f13964x;

    /* renamed from: y, reason: collision with root package name */
    public Typeface f13965y;

    /* renamed from: z, reason: collision with root package name */
    public q4.a f13966z;

    /* renamed from: f, reason: collision with root package name */
    public int f13942f = 16;

    /* renamed from: g, reason: collision with root package name */
    public int f13944g = 16;
    public float h = 15.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f13947i = 15.0f;
    public final TextUtils.TruncateAt A = TextUtils.TruncateAt.END;
    public final boolean E = true;

    /* renamed from: e0, reason: collision with root package name */
    public int f13941e0 = 1;

    /* renamed from: f0, reason: collision with root package name */
    public int f13943f0 = 1;

    /* renamed from: g0, reason: collision with root package name */
    public final float f13945g0 = 1.0f;

    /* renamed from: h0, reason: collision with root package name */
    public final int f13946h0 = 1;

    /* renamed from: i0, reason: collision with root package name */
    public int f13948i0 = -1;

    /* renamed from: j0, reason: collision with root package name */
    public int f13950j0 = -1;

    public b(TextInputLayout textInputLayout) {
        this.f13932a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.O = textPaint;
        this.P = new TextPaint(textPaint);
        this.f13938d = new Rect();
        this.f13936c = new Rect();
        this.f13940e = new RectF();
        i(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(float f6, int i6, int i7) {
        float f7 = 1.0f - f6;
        return Color.argb(Math.round((Color.alpha(i7) * f6) + (Color.alpha(i6) * f7)), Math.round((Color.red(i7) * f6) + (Color.red(i6) * f7)), Math.round((Color.green(i7) * f6) + (Color.green(i6) * f7)), Math.round((Color.blue(i7) * f6) + (Color.blue(i6) * f7)));
    }

    public static float h(float f6, float f7, float f8, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f8 = timeInterpolator.getInterpolation(f8);
        }
        return x3.a.a(f6, f7, f8);
    }

    public final void b() {
        float f6 = this.f13934b;
        float f7 = this.f13936c.left;
        Rect rect = this.f13938d;
        float fH = h(f7, rect.left, f6, this.Q);
        RectF rectF = this.f13940e;
        rectF.left = fH;
        rectF.top = h(this.f13954m, this.f13955n, f6, this.Q);
        rectF.right = h(r1.right, rect.right, f6, this.Q);
        rectF.bottom = h(r1.bottom, rect.bottom, f6, this.Q);
        this.f13958q = h(this.f13956o, this.f13957p, f6, this.Q);
        this.f13959r = h(this.f13954m, this.f13955n, f6, this.Q);
        d(f6, false);
        TextInputLayout textInputLayout = this.f13932a;
        textInputLayout.postInvalidateOnAnimation();
        float f8 = this.W;
        float f9 = this.X;
        TextPaint textPaint = this.O;
        if (f8 != f9) {
            textPaint.setLetterSpacing(h(f9, f8, f6, x3.a.f15145b));
        } else {
            textPaint.setLetterSpacing(f8);
        }
        j1.b bVar = x3.a.f15145b;
        this.f13935b0 = 1.0f - h(0.0f, 1.0f, 1.0f - f6, bVar);
        textInputLayout.postInvalidateOnAnimation();
        this.f13937c0 = h(1.0f, 0.0f, f6, bVar);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f13951k;
        ColorStateList colorStateList2 = this.f13949j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(f6, g(colorStateList2), g(this.f13951k)));
        } else {
            textPaint.setColor(g(colorStateList));
        }
        this.H = x3.a.a(0.0f, this.S, f6);
        this.I = x3.a.a(0.0f, this.T, f6);
        this.J = x3.a.a(0.0f, this.U, f6);
        int iA = a(f6, 0, g(this.V));
        this.K = iA;
        textPaint.setShadowLayer(this.H, this.I, this.J, iA);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final boolean c(CharSequence charSequence) {
        boolean z6 = this.f13932a.getLayoutDirection() == 1;
        if (this.E) {
            return (z6 ? s0.c.f14328d : s0.c.f14327c).b(charSequence, charSequence.length());
        }
        return z6;
    }

    public final void d(float f6, boolean z6) {
        float f7;
        Typeface typeface;
        float f8;
        if (this.B == null) {
            return;
        }
        float fWidth = this.f13938d.width();
        float fWidth2 = this.f13936c.width();
        if (Math.abs(f6 - 1.0f) < 1.0E-5f) {
            f7 = o() ? this.f13947i : this.h;
            f8 = o() ? this.W : this.X;
            this.F = o() ? 1.0f : h(this.h, this.f13947i, f6, this.R) / this.h;
            if (!o()) {
                fWidth = fWidth2;
            }
            typeface = this.s;
            fWidth2 = fWidth;
        } else {
            f7 = this.h;
            float f9 = this.X;
            typeface = this.f13962v;
            if (Math.abs(f6 - 0.0f) < 1.0E-5f) {
                this.F = 1.0f;
            } else {
                this.F = h(this.h, this.f13947i, f6, this.R) / this.h;
            }
            float f10 = this.f13947i / this.h;
            float f11 = fWidth2 * f10;
            if (!z6 && f11 > fWidth && o()) {
                fWidth2 = Math.min(fWidth / f10, fWidth2);
            }
            f8 = f9;
        }
        int i6 = f6 < 0.5f ? this.f13941e0 : this.f13943f0;
        TextPaint textPaint = this.O;
        if (fWidth2 > 0.0f) {
            boolean z7 = this.G != f7;
            boolean z8 = this.Y != f8;
            boolean z9 = this.f13965y != typeface;
            StaticLayout staticLayout = this.Z;
            boolean z10 = z7 || z8 || (staticLayout != null && (fWidth2 > ((float) staticLayout.getWidth()) ? 1 : (fWidth2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z9 || (this.L != i6) || this.N;
            this.G = f7;
            this.Y = f8;
            this.f13965y = typeface;
            this.N = false;
            this.L = i6;
            textPaint.setLinearText(this.F != 1.0f);
            z = z10;
        }
        if (this.C == null || z) {
            textPaint.setTextSize(this.G);
            textPaint.setTypeface(this.f13965y);
            textPaint.setLetterSpacing(this.Y);
            boolean zC = c(this.B);
            this.D = zC;
            StaticLayout staticLayoutE = e(((this.f13941e0 > 1 || this.f13943f0 > 1) && !zC) ? i6 : 1, textPaint, this.B, fWidth2 * (o() ? 1.0f : this.F), this.D);
            this.Z = staticLayoutE;
            this.C = staticLayoutE.getText();
        }
    }

    public final StaticLayout e(int i6, TextPaint textPaint, CharSequence charSequence, float f6, boolean z6) {
        Layout.Alignment alignment;
        if (i6 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f13942f, this.D ? 1 : 0) & 7;
            alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.D ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.D ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
        }
        g gVar = new g(charSequence, textPaint, (int) f6);
        gVar.f13982l = this.A;
        gVar.f13981k = z6;
        gVar.f13976e = alignment;
        gVar.f13980j = false;
        gVar.f13977f = i6;
        float f7 = this.f13945g0;
        gVar.f13978g = 0.0f;
        gVar.h = f7;
        gVar.f13979i = this.f13946h0;
        gVar.f13983m = null;
        StaticLayout staticLayoutA = gVar.a();
        staticLayoutA.getClass();
        return staticLayoutA;
    }

    public final float f() {
        int i6 = this.f13948i0;
        if (i6 != -1) {
            return i6;
        }
        float f6 = this.f13947i;
        TextPaint textPaint = this.P;
        textPaint.setTextSize(f6);
        textPaint.setTypeface(this.s);
        textPaint.setLetterSpacing(this.W);
        return -textPaint.ascent();
    }

    public final int g(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.M;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void i(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f13961u;
            if (typeface != null) {
                this.f13960t = q4.f.a(configuration, typeface);
            }
            Typeface typeface2 = this.f13964x;
            if (typeface2 != null) {
                this.f13963w = q4.f.a(configuration, typeface2);
            }
            Typeface typeface3 = this.f13960t;
            if (typeface3 == null) {
                typeface3 = this.f13961u;
            }
            this.s = typeface3;
            Typeface typeface4 = this.f13963w;
            if (typeface4 == null) {
                typeface4 = this.f13964x;
            }
            this.f13962v = typeface4;
            j(true);
        }
    }

    public final void j(boolean z6) {
        float fMeasureText;
        TextInputLayout textInputLayout = this.f13932a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z6) {
            return;
        }
        d(1.0f, z6);
        CharSequence charSequence = this.C;
        TextPaint textPaint = this.O;
        if (charSequence != null && this.Z != null) {
            this.f13939d0 = o() ? TextUtils.ellipsize(this.C, textPaint, this.Z.getWidth(), this.A) : this.C;
        }
        CharSequence charSequence2 = this.f13939d0;
        if (charSequence2 != null) {
            this.f13933a0 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f13933a0 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f13944g, this.D ? 1 : 0);
        int i6 = absoluteGravity & 112;
        Rect rect = this.f13938d;
        if (i6 == 48) {
            this.f13955n = rect.top;
        } else if (i6 != 80) {
            this.f13955n = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f13955n = textPaint.ascent() + rect.bottom;
        }
        int i7 = absoluteGravity & 8388615;
        if (i7 == 1) {
            this.f13957p = rect.centerX() - (this.f13933a0 / 2.0f);
        } else if (i7 != 5) {
            this.f13957p = rect.left;
        } else {
            this.f13957p = rect.right - this.f13933a0;
        }
        if (this.f13933a0 <= rect.width()) {
            float f6 = this.f13957p;
            float fMax = Math.max(0.0f, rect.left - f6) + f6;
            this.f13957p = fMax;
            this.f13957p = Math.min(0.0f, rect.right - (this.f13933a0 + fMax)) + fMax;
        }
        float f7 = this.f13947i;
        TextPaint textPaint2 = this.P;
        textPaint2.setTextSize(f7);
        textPaint2.setTypeface(this.s);
        textPaint2.setLetterSpacing(this.W);
        if (textPaint2.descent() + (-textPaint2.ascent()) <= rect.height()) {
            float f8 = this.f13955n;
            float fMax2 = Math.max(0.0f, rect.top - f8) + f8;
            this.f13955n = fMax2;
            this.f13955n = Math.min(0.0f, rect.bottom - (f() + fMax2)) + fMax2;
        }
        d(0.0f, z6);
        float height = this.Z != null ? r15.getHeight() : 0.0f;
        StaticLayout staticLayout = this.Z;
        if (staticLayout == null || this.f13941e0 <= 1) {
            CharSequence charSequence3 = this.C;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout.getWidth();
        }
        StaticLayout staticLayout2 = this.Z;
        this.f13953l = staticLayout2 != null ? staticLayout2.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f13942f, this.D ? 1 : 0);
        int i8 = absoluteGravity2 & 112;
        Rect rect2 = this.f13936c;
        if (i8 == 48) {
            this.f13954m = rect2.top;
        } else if (i8 != 80) {
            this.f13954m = rect2.centerY() - (height / 2.0f);
        } else {
            this.f13954m = (rect2.bottom - height) + (this.f13952k0 ? textPaint.descent() : 0.0f);
        }
        int i9 = absoluteGravity2 & 8388615;
        if (i9 == 1) {
            this.f13956o = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i9 != 5) {
            this.f13956o = rect2.left;
        } else {
            this.f13956o = rect2.right - fMeasureText;
        }
        d(this.f13934b, false);
        textInputLayout.postInvalidateOnAnimation();
        b();
    }

    public final void k(ColorStateList colorStateList) {
        if (this.f13951k == colorStateList && this.f13949j == colorStateList) {
            return;
        }
        this.f13951k = colorStateList;
        this.f13949j = colorStateList;
        j(false);
    }

    public final boolean l(Typeface typeface) {
        q4.a aVar = this.f13966z;
        if (aVar != null) {
            aVar.f14195u = true;
        }
        if (this.f13961u == typeface) {
            return false;
        }
        this.f13961u = typeface;
        Typeface typefaceA = q4.f.a(this.f13932a.getContext().getResources().getConfiguration(), typeface);
        this.f13960t = typefaceA;
        if (typefaceA == null) {
            typefaceA = this.f13961u;
        }
        this.s = typefaceA;
        return true;
    }

    public final void m(float f6) {
        float fA = e5.i.a(f6, 0.0f, 1.0f);
        if (fA != this.f13934b) {
            this.f13934b = fA;
            b();
        }
    }

    public final void n(Typeface typeface) {
        boolean z6;
        boolean zL = l(typeface);
        if (this.f13964x != typeface) {
            this.f13964x = typeface;
            Typeface typefaceA = q4.f.a(this.f13932a.getContext().getResources().getConfiguration(), typeface);
            this.f13963w = typefaceA;
            if (typefaceA == null) {
                typefaceA = this.f13964x;
            }
            this.f13962v = typefaceA;
            z6 = true;
        } else {
            z6 = false;
        }
        if (zL || z6) {
            j(false);
        }
    }

    public final boolean o() {
        return this.f13943f0 == 1;
    }
}
