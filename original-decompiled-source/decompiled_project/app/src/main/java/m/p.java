package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import c4.d;
import com.yalantis.ucrop.view.CropImageView;
import java.lang.ref.WeakReference;
import q3.g;
import y3.q0;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f17152a;

    /* renamed from: b, reason: collision with root package name */
    public h0 f17153b;

    /* renamed from: c, reason: collision with root package name */
    public h0 f17154c;

    /* renamed from: d, reason: collision with root package name */
    public h0 f17155d;

    /* renamed from: e, reason: collision with root package name */
    public h0 f17156e;

    /* renamed from: f, reason: collision with root package name */
    public h0 f17157f;

    /* renamed from: g, reason: collision with root package name */
    public h0 f17158g;

    /* renamed from: h, reason: collision with root package name */
    public h0 f17159h;

    /* renamed from: i, reason: collision with root package name */
    public final s f17160i;

    /* renamed from: j, reason: collision with root package name */
    public int f17161j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f17162k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f17163l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f17164m;

    public class a extends g.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f17165a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f17166b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ WeakReference f17167c;

        public a(int i10, int i11, WeakReference weakReference) {
            this.f17165a = i10;
            this.f17166b = i11;
            this.f17167c = weakReference;
        }

        @Override // q3.g.c
        public final void b(int i10) {
        }

        @Override // q3.g.c
        public final void c(Typeface typeface) {
            int i10 = this.f17165a;
            if (i10 != -1) {
                typeface = d.a(typeface, i10, (this.f17166b & 2) != 0);
            }
            p pVar = p.this;
            if (pVar.f17164m) {
                pVar.f17163l = typeface;
                TextView textView = (TextView) this.f17167c.get();
                if (textView != null) {
                    if (textView.isAttachedToWindow()) {
                        textView.post(new q(textView, typeface, pVar.f17161j));
                    } else {
                        textView.setTypeface(typeface, pVar.f17161j);
                    }
                }
            }
        }
    }

    public static class b {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        public static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    public static class c {
        public static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        public static void b(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        public static void c(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        public static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    public static class d {
        public static Typeface a(Typeface typeface, int i10, boolean z10) {
            return Typeface.create(typeface, i10, z10);
        }
    }

    public p(TextView textView) {
        this.f17152a = textView;
        this.f17160i = new s(textView);
    }

    public static h0 c(Context context, e eVar, int i10) {
        ColorStateList colorStateListF;
        synchronized (eVar) {
            colorStateListF = eVar.f17120a.f(context, i10);
        }
        if (colorStateListF == null) {
            return null;
        }
        h0 h0Var = new h0();
        h0Var.f17141d = true;
        h0Var.f17138a = colorStateListF;
        return h0Var;
    }

    public final void a(Drawable drawable, h0 h0Var) {
        if (drawable == null || h0Var == null) {
            return;
        }
        e.c(drawable, h0Var, this.f17152a.getDrawableState());
    }

    public final void b() {
        h0 h0Var = this.f17153b;
        TextView textView = this.f17152a;
        if (h0Var != null || this.f17154c != null || this.f17155d != null || this.f17156e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f17153b);
            a(compoundDrawables[1], this.f17154c);
            a(compoundDrawables[2], this.f17155d);
            a(compoundDrawables[3], this.f17156e);
        }
        if (this.f17157f == null && this.f17158g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f17157f);
        a(compoundDrawablesRelative[2], this.f17158g);
    }

    public final void d(AttributeSet attributeSet, int i10) throws Resources.NotFoundException {
        e eVar;
        String string;
        boolean z10;
        boolean z11;
        String string2;
        int i11;
        int i12;
        int i13;
        float dimensionPixelSize;
        ColorStateList colorStateList;
        int resourceId;
        int i14;
        int resourceId2;
        int[] iArr = g.a.f11246e;
        int[] iArr2 = g.a.f11256o;
        s sVar = this.f17160i;
        TextView textView = this.f17152a;
        Context context = textView.getContext();
        PorterDuff.Mode mode = e.f17118b;
        synchronized (e.class) {
            try {
                if (e.f17119c == null) {
                    e.b();
                }
                eVar = e.f17119c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int[] iArr3 = g.a.f11245d;
        j0 j0VarD = j0.d(context, attributeSet, iArr3, i10);
        TextView textView2 = this.f17152a;
        q0.g(textView2, textView2.getContext(), iArr3, attributeSet, j0VarD.f17144b, i10);
        TypedArray typedArray = j0VarD.f17144b;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f17153b = c(context, eVar, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f17154c = c(context, eVar, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f17155d = c(context, eVar, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f17156e = c(context, eVar, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f17157f = c(context, eVar, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f17158g = c(context, eVar, typedArray.getResourceId(6, 0));
        }
        j0VarD.e();
        boolean z12 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            j0 j0Var = new j0(context, typedArrayObtainStyledAttributes);
            if (z12 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z10 = false;
                z11 = false;
            } else {
                z11 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z10 = true;
            }
            f(context, j0Var);
            string2 = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            string = typedArrayObtainStyledAttributes.hasValue(13) ? typedArrayObtainStyledAttributes.getString(13) : null;
            j0Var.e();
        } else {
            string = null;
            z10 = false;
            z11 = false;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
        j0 j0Var2 = new j0(context, typedArrayObtainStyledAttributes2);
        if (!z12 && typedArrayObtainStyledAttributes2.hasValue(14)) {
            z11 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z10 = true;
        }
        boolean z13 = z11;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, CropImageView.DEFAULT_ASPECT_RATIO);
        }
        f(context, j0Var2);
        j0Var2.e();
        if (!z12 && z10) {
            this.f17152a.setAllCaps(z13);
        }
        Typeface typeface = this.f17163l;
        if (typeface != null) {
            if (this.f17162k == -1) {
                textView.setTypeface(typeface, this.f17161j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            c.d(textView, string);
        }
        if (string2 != null) {
            b.b(textView, b.a(string2));
        }
        Context context2 = sVar.f17182h;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        TextView textView3 = sVar.f17181g;
        q0.g(textView3, textView3.getContext(), iArr, attributeSet, typedArrayObtainStyledAttributes3, i10);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            sVar.f17175a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i15 = 0; i15 < length; i15++) {
                    iArr4[i15] = typedArrayObtainTypedArray.getDimensionPixelSize(i15, -1);
                }
                int[] iArrA = s.a(iArr4);
                sVar.f17179e = iArrA;
                boolean z14 = iArrA.length > 0;
                sVar.f17180f = z14;
                if (z14) {
                    sVar.f17175a = 1;
                    sVar.f17177c = iArrA[0];
                    sVar.f17178d = iArrA[r3 - 1];
                    sVar.f17176b = -1.0f;
                }
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (sVar.f17181g instanceof f) {
            sVar.f17175a = 0;
        } else if (sVar.f17175a == 1) {
            if (!sVar.f17180f) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i14 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i14 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i14, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                if (dimension2 <= CropImageView.DEFAULT_ASPECT_RATIO) {
                    throw new IllegalArgumentException("Minimum auto-size text size (" + dimension2 + "px) is less or equal to (0px)");
                }
                if (dimension3 <= dimension2) {
                    throw new IllegalArgumentException("Maximum auto-size text size (" + dimension3 + "px) is less or equal to minimum auto-size text size (" + dimension2 + "px)");
                }
                if (dimension <= CropImageView.DEFAULT_ASPECT_RATIO) {
                    throw new IllegalArgumentException("The auto-size step granularity (" + dimension + "px) is less or equal to (0px)");
                }
                sVar.f17175a = 1;
                sVar.f17177c = dimension2;
                sVar.f17178d = dimension3;
                sVar.f17176b = dimension;
                sVar.f17180f = false;
            }
            if (!(sVar.f17181g instanceof f) && sVar.f17175a == 1 && (!sVar.f17180f || sVar.f17179e.length == 0)) {
                int iFloor = ((int) Math.floor((sVar.f17178d - sVar.f17177c) / sVar.f17176b)) + 1;
                int[] iArr5 = new int[iFloor];
                for (int i16 = 0; i16 < iFloor; i16++) {
                    iArr5[i16] = Math.round((i16 * sVar.f17176b) + sVar.f17177c);
                }
                sVar.f17179e = s.a(iArr5);
            }
        }
        if (sVar.f17175a != 0) {
            int[] iArr6 = sVar.f17179e;
            if (iArr6.length > 0) {
                if (c.a(textView) != -1.0f) {
                    c.b(textView, Math.round(sVar.f17177c), Math.round(sVar.f17178d), Math.round(sVar.f17176b), 0);
                } else {
                    c.c(textView, iArr6, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableA = resourceId4 != -1 ? eVar.a(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableA2 = resourceId5 != -1 ? eVar.a(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableA3 = resourceId6 != -1 ? eVar.a(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableA4 = resourceId7 != -1 ? eVar.a(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableA5 = resourceId8 != -1 ? eVar.a(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableA6 = resourceId9 != -1 ? eVar.a(context, resourceId9) : null;
        if (drawableA5 != null || drawableA6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableA5 == null) {
                drawableA5 = compoundDrawablesRelative[0];
            }
            if (drawableA2 == null) {
                drawableA2 = compoundDrawablesRelative[1];
            }
            if (drawableA6 == null) {
                drawableA6 = compoundDrawablesRelative[2];
            }
            if (drawableA4 == null) {
                drawableA4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableA5, drawableA2, drawableA6, drawableA4);
        } else if (drawableA != null || drawableA2 != null || drawableA3 != null || drawableA4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableA == null) {
                    drawableA = compoundDrawables[0];
                }
                if (drawableA2 == null) {
                    drawableA2 = compoundDrawables[1];
                }
                if (drawableA3 == null) {
                    drawableA3 = compoundDrawables[2];
                }
                if (drawableA4 == null) {
                    drawableA4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableA, drawableA2, drawableA3, drawableA4);
            } else {
                if (drawableA2 == null) {
                    drawableA2 = compoundDrawablesRelative2[1];
                }
                if (drawableA4 == null) {
                    drawableA4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableA2, compoundDrawablesRelative2[2], drawableA4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = p3.b.getColorStateList(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            i11 = -1;
            textView.setCompoundDrawableTintMode(u.b(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
        } else {
            i11 = -1;
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, i11);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, i11);
        if (typedArrayObtainStyledAttributes4.hasValue(19)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(19);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                i12 = -1;
                dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
                i13 = -1;
            } else {
                int i17 = typedValuePeekValue.data;
                int i18 = i17 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i17);
                i13 = i18;
                i12 = -1;
            }
        } else {
            i12 = -1;
            i13 = -1;
            dimensionPixelSize = -1.0f;
        }
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != i12) {
            if (dimensionPixelSize2 < 0) {
                throw new IllegalArgumentException();
            }
            textView.setFirstBaselineToTopHeight(dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i12) {
            if (dimensionPixelSize3 < 0) {
                throw new IllegalArgumentException();
            }
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            int i19 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
            if (dimensionPixelSize3 > Math.abs(i19)) {
                textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), dimensionPixelSize3 - i19);
            }
        }
        if (dimensionPixelSize != -1.0f) {
            if (i13 == -1) {
                c4.d.a(textView, (int) dimensionPixelSize);
            } else if (Build.VERSION.SDK_INT >= 34) {
                d.a.a(textView, i13, dimensionPixelSize);
            } else {
                c4.d.a(textView, Math.round(TypedValue.applyDimension(i13, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    public final void e(Context context, int i10) throws Resources.NotFoundException {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, g.a.f11256o);
        j0 j0Var = new j0(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f17152a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, CropImageView.DEFAULT_ASPECT_RATIO);
        }
        f(context, j0Var);
        if (typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            c.d(textView, string);
        }
        j0Var.e();
        Typeface typeface = this.f17163l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f17161j);
        }
    }

    public final void f(Context context, j0 j0Var) {
        String string;
        int i10 = this.f17161j;
        TypedArray typedArray = j0Var.f17144b;
        this.f17161j = typedArray.getInt(2, i10);
        int i11 = typedArray.getInt(11, -1);
        this.f17162k = i11;
        if (i11 != -1) {
            this.f17161j &= 2;
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f17164m = false;
                int i12 = typedArray.getInt(1, 1);
                if (i12 == 1) {
                    this.f17163l = Typeface.SANS_SERIF;
                    return;
                } else if (i12 == 2) {
                    this.f17163l = Typeface.SERIF;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.f17163l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f17163l = null;
        int i13 = typedArray.hasValue(12) ? 12 : 10;
        int i14 = this.f17162k;
        int i15 = this.f17161j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceC = j0Var.c(i13, this.f17161j, new a(i14, i15, new WeakReference(this.f17152a)));
                if (typefaceC != null) {
                    if (this.f17162k != -1) {
                        this.f17163l = d.a(Typeface.create(typefaceC, 0), this.f17162k, (this.f17161j & 2) != 0);
                    } else {
                        this.f17163l = typefaceC;
                    }
                }
                this.f17164m = this.f17163l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f17163l != null || (string = typedArray.getString(i13)) == null) {
            return;
        }
        if (this.f17162k != -1) {
            this.f17163l = d.a(Typeface.create(string, 0), this.f17162k, (this.f17161j & 2) != 0);
        } else {
            this.f17163l = Typeface.create(string, this.f17161j);
        }
    }
}
