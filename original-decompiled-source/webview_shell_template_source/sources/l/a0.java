package l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import l0.f;
import w0.c;
import y0.d;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f13563a;

    /* renamed from: b, reason: collision with root package name */
    public z0 f13564b;

    /* renamed from: c, reason: collision with root package name */
    public z0 f13565c;

    /* renamed from: d, reason: collision with root package name */
    public z0 f13566d;

    /* renamed from: e, reason: collision with root package name */
    public z0 f13567e;

    /* renamed from: f, reason: collision with root package name */
    public z0 f13568f;

    /* renamed from: g, reason: collision with root package name */
    public z0 f13569g;
    public z0 h;

    /* renamed from: i, reason: collision with root package name */
    public final d0 f13570i;

    /* renamed from: j, reason: collision with root package name */
    public int f13571j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f13572k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f13573l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f13574m;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        public static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class c {
        public static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        public static void b(TextView textView, int i6, int i7, int i8, int i9) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i6, i7, i8, i9);
        }

        public static void c(TextView textView, int[] iArr, int i6) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i6);
        }

        public static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class d {
        public static Typeface a(Typeface typeface, int i6, boolean z6) {
            return Typeface.create(typeface, i6, z6);
        }
    }

    public a0(TextView textView) {
        this.f13563a = textView;
        this.f13570i = new d0(textView);
    }

    public static z0 c(Context context, j jVar, int i6) {
        ColorStateList colorStateListF;
        synchronized (jVar) {
            colorStateListF = jVar.f13674a.f(context, i6);
        }
        if (colorStateListF == null) {
            return null;
        }
        z0 z0Var = new z0();
        z0Var.f13768d = true;
        z0Var.f13765a = colorStateListF;
        return z0Var;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i6 >= 30) {
            c.a.a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i6 >= 30) {
            c.a.a(editorInfo, text);
            return;
        }
        int i7 = editorInfo.initialSelStart;
        int i8 = editorInfo.initialSelEnd;
        int i9 = i7 > i8 ? i8 : i7;
        if (i7 <= i8) {
            i7 = i8;
        }
        int length = text.length();
        if (i9 < 0 || i7 > length) {
            w0.c.a(editorInfo, null, 0, 0);
            return;
        }
        int i10 = editorInfo.inputType & 4095;
        if (i10 == 129 || i10 == 225 || i10 == 18) {
            w0.c.a(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            w0.c.a(editorInfo, text, i9, i7);
            return;
        }
        int i11 = i7 - i9;
        int i12 = i11 > 1024 ? 0 : i11;
        int i13 = 2048 - i12;
        int iMin = Math.min(text.length() - i7, i13 - Math.min(i9, (int) (i13 * 0.8d)));
        int iMin2 = Math.min(i9, i13 - iMin);
        int i14 = i9 - iMin2;
        if (Character.isLowSurrogate(text.charAt(i14))) {
            i14++;
            iMin2--;
        }
        if (Character.isHighSurrogate(text.charAt((i7 + iMin) - 1))) {
            iMin--;
        }
        int i15 = iMin2 + i12;
        w0.c.a(editorInfo, i12 != i11 ? TextUtils.concat(text.subSequence(i14, i14 + iMin2), text.subSequence(i7, iMin + i7)) : text.subSequence(i14, i15 + iMin + i14), iMin2, i15);
    }

    public final void a(Drawable drawable, z0 z0Var) {
        if (drawable == null || z0Var == null) {
            return;
        }
        j.e(drawable, z0Var, this.f13563a.getDrawableState());
    }

    public final void b() {
        z0 z0Var = this.f13564b;
        TextView textView = this.f13563a;
        if (z0Var != null || this.f13565c != null || this.f13566d != null || this.f13567e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f13564b);
            a(compoundDrawables[1], this.f13565c);
            a(compoundDrawables[2], this.f13566d);
            a(compoundDrawables[3], this.f13567e);
        }
        if (this.f13568f == null && this.f13569g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f13568f);
        a(compoundDrawablesRelative[2], this.f13569g);
    }

    public final ColorStateList d() {
        z0 z0Var = this.h;
        if (z0Var != null) {
            return z0Var.f13765a;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        z0 z0Var = this.h;
        if (z0Var != null) {
            return z0Var.f13766b;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:243:? A[RETURN, SYNTHETIC] */
    @SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(AttributeSet attributeSet, int i6) {
        boolean z6;
        boolean z7;
        String string;
        String string2;
        int i7;
        float dimensionPixelSize;
        int i8;
        ColorStateList colorStateList;
        int resourceId;
        int i9;
        int resourceId2;
        TextView textView = this.f13563a;
        Context context = textView.getContext();
        j jVarA = j.a();
        int[] iArr = f.a.h;
        b1 b1VarE = b1.e(i6, 0, context, attributeSet, iArr);
        u0.f0.l(textView, textView.getContext(), iArr, attributeSet, b1VarE.f13583b, i6, 0);
        TypedArray typedArray = b1VarE.f13583b;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f13564b = c(context, jVarA, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f13565c = c(context, jVarA, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f13566d = c(context, jVarA, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f13567e = c(context, jVarA, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f13568f = c(context, jVarA, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f13569g = c(context, jVarA, typedArray.getResourceId(6, 0));
        }
        b1VarE.f();
        boolean z8 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = f.a.f12953v;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            b1 b1Var = new b1(context, typedArrayObtainStyledAttributes);
            if (z8 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z6 = false;
                z7 = false;
            } else {
                z7 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z6 = true;
            }
            n(context, b1Var);
            int i10 = Build.VERSION.SDK_INT;
            string2 = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            string = (i10 < 26 || !typedArrayObtainStyledAttributes.hasValue(13)) ? null : typedArrayObtainStyledAttributes.getString(13);
            b1Var.f();
        } else {
            z6 = false;
            z7 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i6, 0);
        b1 b1Var2 = new b1(context, typedArrayObtainStyledAttributes2);
        if (!z8 && typedArrayObtainStyledAttributes2.hasValue(14)) {
            z7 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z6 = true;
        }
        boolean z9 = z7;
        int i11 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        if (i11 >= 26 && typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (i11 >= 28 && typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, b1Var2);
        b1Var2.f();
        if (!z8 && z6) {
            textView.setAllCaps(z9);
        }
        Typeface typeface = this.f13573l;
        if (typeface != null) {
            if (this.f13572k == -1) {
                textView.setTypeface(typeface, this.f13571j);
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
        d0 d0Var = this.f13570i;
        Context context2 = d0Var.f13614j;
        int[] iArr3 = f.a.f12941i;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i6, 0);
        TextView textView2 = d0Var.f13613i;
        u0.f0.l(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i6, 0);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            d0Var.f13606a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i12 = 0; i12 < length; i12++) {
                    iArr4[i12] = typedArrayObtainTypedArray.getDimensionPixelSize(i12, -1);
                }
                d0Var.f13611f = d0.b(iArr4);
                d0Var.i();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!d0Var.j()) {
            d0Var.f13606a = 0;
        } else if (d0Var.f13606a == 1) {
            if (!d0Var.f13612g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i9 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i9 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i9, 112.0f, displayMetrics);
                }
                float f6 = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                d0Var.k(dimension2, f6, dimension);
            }
            d0Var.h();
        }
        if (i1.f13671c && d0Var.f13606a != 0) {
            int[] iArr5 = d0Var.f13611f;
            if (iArr5.length > 0) {
                if (c.a(textView) != -1.0f) {
                    c.b(textView, Math.round(d0Var.f13609d), Math.round(d0Var.f13610e), Math.round(d0Var.f13608c), 0);
                } else {
                    c.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableB = resourceId4 != -1 ? jVarA.b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableB2 = resourceId5 != -1 ? jVarA.b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableB3 = resourceId6 != -1 ? jVarA.b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableB4 = resourceId7 != -1 ? jVarA.b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableB5 = resourceId8 != -1 ? jVarA.b(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableB6 = resourceId9 != -1 ? jVarA.b(context, resourceId9) : null;
        if (drawableB5 != null || drawableB6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableB5 == null) {
                drawableB5 = compoundDrawablesRelative[0];
            }
            if (drawableB2 == null) {
                drawableB2 = compoundDrawablesRelative[1];
            }
            if (drawableB6 == null) {
                drawableB6 = compoundDrawablesRelative[2];
            }
            if (drawableB4 == null) {
                drawableB4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableB5, drawableB2, drawableB6, drawableB4);
        } else if (drawableB != null || drawableB2 != null || drawableB3 != null || drawableB4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableB == null) {
                    drawableB = compoundDrawables[0];
                }
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawables[1];
                }
                if (drawableB3 == null) {
                    drawableB3 = compoundDrawables[2];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableB, drawableB2, drawableB3, drawableB4);
            } else {
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawablesRelative2[1];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableB2, compoundDrawablesRelative2[2], drawableB4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = k0.a.b(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            textView.setCompoundDrawableTintMode(h0.b(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (typedArrayObtainStyledAttributes4.hasValue(19)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(19);
            if (typedValuePeekValue != null && typedValuePeekValue.type == 5) {
                int i13 = typedValuePeekValue.data;
                int i14 = i13 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i13);
                i8 = i14;
                i7 = -1;
                typedArrayObtainStyledAttributes4.recycle();
                if (dimensionPixelSize2 != i7) {
                    y0.d.b(textView, dimensionPixelSize2);
                }
                if (dimensionPixelSize3 != i7) {
                    y0.d.c(textView, dimensionPixelSize3);
                }
                if (dimensionPixelSize == -1.0f) {
                    if (i8 == i7) {
                        y0.d.d(textView, (int) dimensionPixelSize);
                        return;
                    } else if (Build.VERSION.SDK_INT >= 34) {
                        d.b.a(textView, i8, dimensionPixelSize);
                        return;
                    } else {
                        y0.d.d(textView, Math.round(TypedValue.applyDimension(i8, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
                        return;
                    }
                }
                return;
            }
            i7 = -1;
            dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
        } else {
            i7 = -1;
            dimensionPixelSize = -1.0f;
        }
        i8 = i7;
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != i7) {
        }
        if (dimensionPixelSize3 != i7) {
        }
        if (dimensionPixelSize == -1.0f) {
        }
    }

    public final void g(Context context, int i6) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i6, f.a.f12953v);
        b1 b1Var = new b1(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f13563a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        int i7 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, b1Var);
        if (i7 >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            c.d(textView, string);
        }
        b1Var.f();
        Typeface typeface = this.f13573l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f13571j);
        }
    }

    public final void i(int i6, int i7, int i8, int i9) {
        d0 d0Var = this.f13570i;
        if (d0Var.j()) {
            DisplayMetrics displayMetrics = d0Var.f13614j.getResources().getDisplayMetrics();
            d0Var.k(TypedValue.applyDimension(i9, i6, displayMetrics), TypedValue.applyDimension(i9, i7, displayMetrics), TypedValue.applyDimension(i9, i8, displayMetrics));
            if (d0Var.h()) {
                d0Var.a();
            }
        }
    }

    public final void j(int[] iArr, int i6) {
        d0 d0Var = this.f13570i;
        if (d0Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i6 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = d0Var.f13614j.getResources().getDisplayMetrics();
                    for (int i7 = 0; i7 < length; i7++) {
                        iArrCopyOf[i7] = Math.round(TypedValue.applyDimension(i6, iArr[i7], displayMetrics));
                    }
                }
                d0Var.f13611f = d0.b(iArrCopyOf);
                if (!d0Var.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                d0Var.f13612g = false;
            }
            if (d0Var.h()) {
                d0Var.a();
            }
        }
    }

    public final void k(int i6) {
        d0 d0Var = this.f13570i;
        if (d0Var.j()) {
            if (i6 == 0) {
                d0Var.f13606a = 0;
                d0Var.f13609d = -1.0f;
                d0Var.f13610e = -1.0f;
                d0Var.f13608c = -1.0f;
                d0Var.f13611f = new int[0];
                d0Var.f13607b = false;
                return;
            }
            if (i6 != 1) {
                throw new IllegalArgumentException(androidx.camera.camera2.internal.compat.workaround.c.d(i6, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = d0Var.f13614j.getResources().getDisplayMetrics();
            d0Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (d0Var.h()) {
                d0Var.a();
            }
        }
    }

    public final void l(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new z0();
        }
        z0 z0Var = this.h;
        z0Var.f13765a = colorStateList;
        z0Var.f13768d = colorStateList != null;
        this.f13564b = z0Var;
        this.f13565c = z0Var;
        this.f13566d = z0Var;
        this.f13567e = z0Var;
        this.f13568f = z0Var;
        this.f13569g = z0Var;
    }

    public final void m(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new z0();
        }
        z0 z0Var = this.h;
        z0Var.f13766b = mode;
        z0Var.f13767c = mode != null;
        this.f13564b = z0Var;
        this.f13565c = z0Var;
        this.f13566d = z0Var;
        this.f13567e = z0Var;
        this.f13568f = z0Var;
        this.f13569g = z0Var;
    }

    public final void n(Context context, b1 b1Var) {
        String string;
        int i6 = this.f13571j;
        TypedArray typedArray = b1Var.f13583b;
        this.f13571j = typedArray.getInt(2, i6);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 28) {
            int i8 = typedArray.getInt(11, -1);
            this.f13572k = i8;
            if (i8 != -1) {
                this.f13571j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f13574m = false;
                int i9 = typedArray.getInt(1, 1);
                if (i9 == 1) {
                    this.f13573l = Typeface.SANS_SERIF;
                    return;
                } else if (i9 == 2) {
                    this.f13573l = Typeface.SERIF;
                    return;
                } else {
                    if (i9 != 3) {
                        return;
                    }
                    this.f13573l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f13573l = null;
        int i10 = typedArray.hasValue(12) ? 12 : 10;
        int i11 = this.f13572k;
        int i12 = this.f13571j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceD = b1Var.d(i10, this.f13571j, new a(i11, i12, new WeakReference(this.f13563a)));
                if (typefaceD != null) {
                    if (i7 < 28 || this.f13572k == -1) {
                        this.f13573l = typefaceD;
                    } else {
                        this.f13573l = d.a(Typeface.create(typefaceD, 0), this.f13572k, (this.f13571j & 2) != 0);
                    }
                }
                this.f13574m = this.f13573l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f13573l != null || (string = typedArray.getString(i10)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f13572k == -1) {
            this.f13573l = Typeface.create(string, this.f13571j);
        } else {
            this.f13573l = d.a(Typeface.create(string, 0), this.f13572k, (this.f13571j & 2) != 0);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a extends f.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f13575a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f13576b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ WeakReference f13577c;

        public a(int i6, int i7, WeakReference weakReference) {
            this.f13575a = i6;
            this.f13576b = i7;
            this.f13577c = weakReference;
        }

        @Override // l0.f.c
        public final void c(Typeface typeface) {
            int i6;
            if (Build.VERSION.SDK_INT >= 28 && (i6 = this.f13575a) != -1) {
                typeface = d.a(typeface, i6, (this.f13576b & 2) != 0);
            }
            a0 a0Var = a0.this;
            if (a0Var.f13574m) {
                a0Var.f13573l = typeface;
                TextView textView = (TextView) this.f13577c.get();
                if (textView != null) {
                    if (textView.isAttachedToWindow()) {
                        textView.post(new b0(textView, typeface, a0Var.f13571j));
                    } else {
                        textView.setTypeface(typeface, a0Var.f13571j);
                    }
                }
            }
        }

        @Override // l0.f.c
        public final void b(int i6) {
        }
    }
}
