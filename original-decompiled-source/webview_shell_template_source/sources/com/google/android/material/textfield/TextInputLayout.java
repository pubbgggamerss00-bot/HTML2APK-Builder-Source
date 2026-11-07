package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.camera.camera2.internal.p0;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import l.b1;
import l.c0;
import l.h0;
import n4.j;
import s0.c;
import u0.f0;
import u4.g;
import u4.k;
import y4.e;
import y4.m;
import y4.n;
import y4.p;
import y4.s;
import y5.b0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] V0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public int A;
    public Drawable A0;
    public int B;
    public ColorStateList B0;
    public final n C;
    public ColorStateList C0;
    public boolean D;
    public int D0;
    public int E;
    public int E0;
    public boolean F;
    public int F0;
    public f G;
    public ColorStateList G0;
    public c0 H;
    public int H0;
    public int I;
    public int I0;
    public int J;
    public int J0;
    public CharSequence K;
    public int K0;
    public boolean L;
    public int L0;
    public c0 M;
    public int M0;
    public ColorStateList N;
    public boolean N0;
    public int O;
    public final n4.b O0;
    public e2.c P;
    public boolean P0;
    public e2.c Q;
    public boolean Q0;
    public ColorStateList R;
    public ValueAnimator R0;
    public ColorStateList S;
    public boolean S0;
    public ColorStateList T;
    public boolean T0;
    public ColorStateList U;
    public boolean U0;
    public boolean V;
    public CharSequence W;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f12451a0;

    /* renamed from: b0, reason: collision with root package name */
    public u4.g f12452b0;

    /* renamed from: c0, reason: collision with root package name */
    public u4.g f12453c0;

    /* renamed from: d0, reason: collision with root package name */
    public StateListDrawable f12454d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f12455e0;

    /* renamed from: f0, reason: collision with root package name */
    public u4.g f12456f0;

    /* renamed from: g0, reason: collision with root package name */
    public u4.g f12457g0;

    /* renamed from: h0, reason: collision with root package name */
    public k f12458h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f12459i0;

    /* renamed from: j0, reason: collision with root package name */
    public final int f12460j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f12461k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f12462l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f12463m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f12464n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f12465o0;
    public int p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f12466q0;

    /* renamed from: r0, reason: collision with root package name */
    public final Rect f12467r0;
    public final FrameLayout s;

    /* renamed from: s0, reason: collision with root package name */
    public final Rect f12468s0;

    /* renamed from: t, reason: collision with root package name */
    public final s f12469t;

    /* renamed from: t0, reason: collision with root package name */
    public final RectF f12470t0;

    /* renamed from: u, reason: collision with root package name */
    public final com.google.android.material.textfield.a f12471u;

    /* renamed from: u0, reason: collision with root package name */
    public Typeface f12472u0;

    /* renamed from: v, reason: collision with root package name */
    public final int f12473v;

    /* renamed from: v0, reason: collision with root package name */
    public ColorDrawable f12474v0;

    /* renamed from: w, reason: collision with root package name */
    public EditText f12475w;

    /* renamed from: w0, reason: collision with root package name */
    public int f12476w0;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f12477x;

    /* renamed from: x0, reason: collision with root package name */
    public final LinkedHashSet<g> f12478x0;

    /* renamed from: y, reason: collision with root package name */
    public int f12479y;

    /* renamed from: y0, reason: collision with root package name */
    public ColorDrawable f12480y0;

    /* renamed from: z, reason: collision with root package name */
    public int f12481z;

    /* renamed from: z0, reason: collision with root package name */
    public int f12482z0;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class b extends u0.a {
        @Override // u0.a
        public final void d(View view, v0.b bVar) {
            AccessibilityNodeInfo accessibilityNodeInfo = bVar.f14729a;
            this.f14446a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setVisibleToUser(false);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            CheckableImageButton checkableImageButton = TextInputLayout.this.f12471u.f12494y;
            checkableImageButton.performClick();
            checkableImageButton.jumpDrawablesToCurrentState();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.O0.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class e extends u0.a {

        /* renamed from: d, reason: collision with root package name */
        public final TextInputLayout f12486d;

        public e(TextInputLayout textInputLayout) {
            this.f12486d = textInputLayout;
        }

        @Override // u0.a
        public final void d(View view, v0.b bVar) {
            CharSequence charSequence;
            CharSequence charSequence2;
            AccessibilityNodeInfo accessibilityNodeInfo = bVar.f14729a;
            this.f14446a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            TextInputLayout textInputLayout = this.f12486d;
            EditText editText = textInputLayout.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = textInputLayout.getHint();
            CharSequence helperText = textInputLayout.getHelperText();
            CharSequence error = textInputLayout.getError();
            CharSequence placeholderText = textInputLayout.getPlaceholderText();
            int counterMaxLength = textInputLayout.getCounterMaxLength();
            CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean zIsEmpty2 = TextUtils.isEmpty(hint);
            boolean z6 = textInputLayout.N0;
            boolean zIsEmpty3 = TextUtils.isEmpty(error);
            boolean z7 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String string = !zIsEmpty2 ? hint.toString() : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            if (TextUtils.isEmpty(helperText)) {
                charSequence = error;
                charSequence2 = counterOverflowDescription;
            } else {
                n nVar = textInputLayout.C;
                charSequence = error;
                charSequence2 = counterOverflowDescription;
                if (nVar.f15287o == 2 && nVar.f15296y != null && !TextUtils.isEmpty(nVar.f15294w)) {
                    if (TextUtils.isEmpty(string)) {
                        string = helperText.toString();
                    } else {
                        string = string + ", " + ((Object) helperText);
                    }
                }
            }
            s sVar = textInputLayout.f12469t;
            c0 c0Var = sVar.f15312t;
            if (c0Var.getVisibility() == 0) {
                accessibilityNodeInfo.setLabelFor(c0Var);
                accessibilityNodeInfo.setTraversalAfter(c0Var);
            } else {
                accessibilityNodeInfo.setTraversalAfter(sVar.f15314v);
            }
            if (!zIsEmpty) {
                bVar.k(text);
            } else if (!TextUtils.isEmpty(string)) {
                bVar.k(string);
                if (!z6 && placeholderText != null) {
                    bVar.k(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                bVar.k(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 26) {
                    bVar.i(string);
                } else {
                    if (!zIsEmpty) {
                        string = ((Object) text) + ", " + string;
                    }
                    bVar.k(string);
                }
                if (i6 >= 26) {
                    accessibilityNodeInfo.setShowingHintText(zIsEmpty);
                } else {
                    bVar.g(4, zIsEmpty);
                }
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
            if (z7) {
                accessibilityNodeInfo.setError(!zIsEmpty3 ? charSequence : charSequence2);
            }
            textInputLayout.f12471u.b().m(bVar);
        }

        @Override // u0.a
        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            super.e(view, accessibilityEvent);
            this.f12486d.f12471u.b().n(accessibilityEvent);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface f {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface g {
        void a(TextInputLayout textInputLayout);
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface h {
        void a();
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class i extends b1.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: u, reason: collision with root package name */
        public CharSequence f12487u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f12488v;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public class a implements Parcelable.ClassLoaderCreator<i> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i6) {
                return new i[i6];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f12487u = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f12488v = parcel.readInt() == 1;
        }

        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f12487u) + "}";
        }

        @Override // b1.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            TextUtils.writeToParcel(this.f12487u, parcel, i6);
            parcel.writeInt(this.f12488v ? 1 : 0);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(a5.a.b(context, attributeSet, com.htmltoapk.template.R.attr.textInputStyle, com.htmltoapk.template.R.style.Widget_Design_TextInputLayout), attributeSet, com.htmltoapk.template.R.attr.textInputStyle);
        this.f12479y = -1;
        this.f12481z = -1;
        this.A = -1;
        this.B = -1;
        this.C = new n(this);
        this.G = new androidx.camera.view.g();
        this.f12467r0 = new Rect();
        this.f12468s0 = new Rect();
        this.f12470t0 = new RectF();
        this.f12478x0 = new LinkedHashSet<>();
        n4.b bVar = new n4.b(this);
        this.O0 = bVar;
        this.U0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.s = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = x3.a.f15144a;
        bVar.R = linearInterpolator;
        bVar.j(false);
        bVar.Q = linearInterpolator;
        bVar.j(false);
        if (bVar.f13944g != 8388659) {
            bVar.f13944g = 8388659;
            bVar.j(false);
        }
        j.a(context2, attributeSet, com.htmltoapk.template.R.attr.textInputStyle, com.htmltoapk.template.R.style.Widget_Design_TextInputLayout);
        int[] iArr = w3.a.G;
        j.b(context2, attributeSet, iArr, com.htmltoapk.template.R.attr.textInputStyle, com.htmltoapk.template.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 50);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.htmltoapk.template.R.attr.textInputStyle, com.htmltoapk.template.R.style.Widget_Design_TextInputLayout);
        b1 b1Var = new b1(context2, typedArrayObtainStyledAttributes);
        s sVar = new s(this, b1Var);
        this.f12469t = sVar;
        this.V = typedArrayObtainStyledAttributes.getBoolean(48, true);
        setHint(typedArrayObtainStyledAttributes.getText(4));
        this.Q0 = typedArrayObtainStyledAttributes.getBoolean(47, true);
        this.P0 = typedArrayObtainStyledAttributes.getBoolean(42, true);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setMinEms(typedArrayObtainStyledAttributes.getInt(6, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(3)) {
            setMinWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            setMaxEms(typedArrayObtainStyledAttributes.getInt(5, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(2)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.f12458h0 = k.f(context2, attributeSet, com.htmltoapk.template.R.attr.textInputStyle, com.htmltoapk.template.R.style.Widget_Design_TextInputLayout).a();
        this.f12460j0 = context2.getResources().getDimensionPixelOffset(com.htmltoapk.template.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f12462l0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f12473v = getResources().getDimensionPixelSize(com.htmltoapk.template.R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.f12464n0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.htmltoapk.template.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f12465o0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.htmltoapk.template.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f12463m0 = this.f12464n0;
        float dimension = typedArrayObtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(11, -1.0f);
        k.a aVarJ = this.f12458h0.j();
        if (dimension >= 0.0f) {
            aVarJ.f14650e = new u4.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            aVarJ.f14651f = new u4.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            aVarJ.f14652g = new u4.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            aVarJ.h = new u4.a(dimension4);
        }
        this.f12458h0 = aVarJ.a();
        ColorStateList colorStateListB = q4.c.b(context2, b1Var, 7);
        if (colorStateListB != null) {
            int defaultColor = colorStateListB.getDefaultColor();
            this.H0 = defaultColor;
            this.f12466q0 = defaultColor;
            if (colorStateListB.isStateful()) {
                this.I0 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                this.J0 = colorStateListB.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.K0 = colorStateListB.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.J0 = this.H0;
                ColorStateList colorStateListB2 = k0.a.b(context2, com.htmltoapk.template.R.color.mtrl_filled_background_color);
                this.I0 = colorStateListB2.getColorForState(new int[]{-16842910}, -1);
                this.K0 = colorStateListB2.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f12466q0 = 0;
            this.H0 = 0;
            this.I0 = 0;
            this.J0 = 0;
            this.K0 = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            ColorStateList colorStateListA = b1Var.a(1);
            this.C0 = colorStateListA;
            this.B0 = colorStateListA;
        }
        ColorStateList colorStateListB3 = q4.c.b(context2, b1Var, 14);
        this.F0 = typedArrayObtainStyledAttributes.getColor(14, 0);
        this.D0 = context2.getColor(com.htmltoapk.template.R.color.mtrl_textinput_default_box_stroke_color);
        this.L0 = context2.getColor(com.htmltoapk.template.R.color.mtrl_textinput_disabled_color);
        this.E0 = context2.getColor(com.htmltoapk.template.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListB3 != null) {
            setBoxStrokeColorStateList(colorStateListB3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(q4.c.b(context2, b1Var, 15));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(50, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(50, 0));
        }
        this.T = b1Var.a(24);
        this.U = b1Var.a(25);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(35);
        int i6 = typedArrayObtainStyledAttributes.getInt(34, 1);
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(45, 0);
        boolean z7 = typedArrayObtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(43);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(58, 0);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(57);
        boolean z8 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(typedArrayObtainStyledAttributes.getInt(19, -1));
        this.J = typedArrayObtainStyledAttributes.getResourceId(22, 0);
        this.I = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i6);
        setCounterOverflowTextAppearance(this.I);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.J);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArrayObtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(b1Var.a(41));
        }
        if (typedArrayObtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(b1Var.a(46));
        }
        if (typedArrayObtainStyledAttributes.hasValue(51)) {
            setHintTextColor(b1Var.a(51));
        }
        if (typedArrayObtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(b1Var.a(23));
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(b1Var.a(21));
        }
        if (typedArrayObtainStyledAttributes.hasValue(59)) {
            setPlaceholderTextColor(b1Var.a(59));
        }
        com.google.android.material.textfield.a aVar = new com.google.android.material.textfield.a(this, b1Var);
        this.f12471u = aVar;
        boolean z9 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        setHintMaxLines(typedArrayObtainStyledAttributes.getInt(49, 1));
        b1Var.f();
        setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
        frameLayout.addView(sVar);
        frameLayout.addView(aVar);
        addView(frameLayout);
        setEnabled(z9);
        setHelperTextEnabled(z7);
        setErrorEnabled(z6);
        setCounterEnabled(z8);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f12475w;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.f12452b0;
        }
        EditText editText2 = this.f12475w;
        int iJ = androidx.work.j.j(editText2.getContext(), q4.b.d(editText2, com.htmltoapk.template.R.attr.colorControlHighlight));
        int i6 = this.f12461k0;
        int[][] iArr = V0;
        if (i6 != 2) {
            if (i6 != 1) {
                return null;
            }
            u4.g gVar = this.f12452b0;
            int i7 = this.f12466q0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{androidx.work.j.i(0.1f, iJ, i7), i7}), gVar, gVar);
        }
        Context context = getContext();
        u4.g gVar2 = this.f12452b0;
        int iJ2 = androidx.work.j.j(context, q4.b.c(context, "TextInputLayout", com.htmltoapk.template.R.attr.colorSurface));
        u4.g gVar3 = new u4.g(gVar2.j());
        int i8 = androidx.work.j.i(0.1f, iJ, iJ2);
        gVar3.r(new ColorStateList(iArr, new int[]{i8, 0}));
        gVar3.setTint(iJ2);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{i8, iJ2});
        u4.g gVar4 = new u4.g(gVar2.j());
        gVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar3, gVar4), gVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f12454d0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f12454d0 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f12454d0.addState(new int[0], h(false));
        }
        return this.f12454d0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f12453c0 == null) {
            this.f12453c0 = h(true);
        }
        return this.f12453c0;
    }

    public static void m(ViewGroup viewGroup, boolean z6) {
        int childCount = viewGroup.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = viewGroup.getChildAt(i6);
            childAt.setEnabled(z6);
            if (childAt instanceof ViewGroup) {
                m((ViewGroup) childAt, z6);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f12475w != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f12475w = editText;
        int i6 = this.f12479y;
        if (i6 != -1) {
            setMinEms(i6);
        } else {
            setMinWidth(this.A);
        }
        int i7 = this.f12481z;
        if (i7 != -1) {
            setMaxEms(i7);
        } else {
            setMaxWidth(this.B);
        }
        this.f12455e0 = false;
        k();
        setTextInputAccessibilityDelegate(new e(this));
        Typeface typeface = this.f12475w.getTypeface();
        n4.b bVar = this.O0;
        bVar.n(typeface);
        float textSize = this.f12475w.getTextSize();
        if (bVar.h != textSize) {
            bVar.h = textSize;
            bVar.j(false);
        }
        float letterSpacing = this.f12475w.getLetterSpacing();
        if (bVar.X != letterSpacing) {
            bVar.X = letterSpacing;
            bVar.j(false);
        }
        int gravity = this.f12475w.getGravity();
        int i8 = (gravity & (-113)) | 48;
        if (bVar.f13944g != i8) {
            bVar.f13944g = i8;
            bVar.j(false);
        }
        if (bVar.f13942f != gravity) {
            bVar.f13942f = gravity;
            bVar.j(false);
        }
        this.M0 = editText.getMinimumHeight();
        this.f12475w.addTextChangedListener(new a(editText));
        if (this.B0 == null) {
            this.B0 = this.f12475w.getHintTextColors();
        }
        if (this.V) {
            if (TextUtils.isEmpty(this.W)) {
                CharSequence hint = this.f12475w.getHint();
                this.f12477x = hint;
                setHint(hint);
                this.f12475w.setHint((CharSequence) null);
            }
            this.f12451a0 = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        if (this.H != null) {
            p(this.f12475w.getText());
        }
        t();
        this.C.b();
        this.f12469t.bringToFront();
        com.google.android.material.textfield.a aVar = this.f12471u;
        aVar.bringToFront();
        Iterator<g> it = this.f12478x0.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
        aVar.n();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        w(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.W)) {
            return;
        }
        this.W = charSequence;
        n4.b bVar = this.O0;
        if (charSequence == null || !TextUtils.equals(bVar.B, charSequence)) {
            bVar.B = charSequence;
            bVar.C = null;
            bVar.j(false);
        }
        if (this.N0) {
            return;
        }
        l();
    }

    private void setPlaceholderTextEnabled(boolean z6) {
        if (this.L == z6) {
            return;
        }
        if (z6) {
            c0 c0Var = this.M;
            if (c0Var != null) {
                this.s.addView(c0Var);
                this.M.setVisibility(0);
            }
        } else {
            c0 c0Var2 = this.M;
            if (c0Var2 != null) {
                c0Var2.setVisibility(8);
            }
            this.M = null;
        }
        this.L = z6;
    }

    public final void a() {
        if (this.f12475w == null || this.f12461k0 != 1) {
            return;
        }
        if (getHintMaxLines() != 1) {
            EditText editText = this.f12475w;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.O0.f() + this.f12473v), this.f12475w.getPaddingEnd(), getResources().getDimensionPixelSize(com.htmltoapk.template.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        } else if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
            EditText editText2 = this.f12475w;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.htmltoapk.template.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f12475w.getPaddingEnd(), getResources().getDimensionPixelSize(com.htmltoapk.template.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (q4.c.d(getContext())) {
            EditText editText3 = this.f12475w;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(com.htmltoapk.template.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f12475w.getPaddingEnd(), getResources().getDimensionPixelSize(com.htmltoapk.template.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i6, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i6, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.s;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        v();
        setEditText((EditText) view);
    }

    public final void b(float f6) {
        n4.b bVar = this.O0;
        if (bVar.f13934b == f6) {
            return;
        }
        if (this.R0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.R0 = valueAnimator;
            valueAnimator.setInterpolator(o4.b.d(getContext(), com.htmltoapk.template.R.attr.motionEasingEmphasizedInterpolator, x3.a.f15145b));
            this.R0.setDuration(o4.b.c(getContext(), com.htmltoapk.template.R.attr.motionDurationMedium4, 167));
            this.R0.addUpdateListener(new d());
        }
        this.R0.setFloatValues(bVar.f13934b, f6);
        this.R0.start();
    }

    public final void c() {
        int i6;
        int i7;
        u4.g gVar = this.f12452b0;
        if (gVar == null) {
            return;
        }
        k kVarJ = gVar.j();
        k kVar = this.f12458h0;
        if (kVarJ != kVar) {
            this.f12452b0.setShapeAppearanceModel(kVar);
        }
        if (this.f12461k0 == 2 && (i6 = this.f12463m0) > -1 && (i7 = this.p0) != 0) {
            u4.g gVar2 = this.f12452b0;
            gVar2.f14610t.f14627j = i6;
            gVar2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i7);
            g.c cVar = gVar2.f14610t;
            if (cVar.f14622d != colorStateListValueOf) {
                cVar.f14622d = colorStateListValueOf;
                gVar2.onStateChange(gVar2.getState());
            }
        }
        int iC = this.f12466q0;
        if (this.f12461k0 == 1) {
            Integer numG = androidx.work.j.g(getContext(), com.htmltoapk.template.R.attr.colorSurface);
            iC = m0.a.c(this.f12466q0, numG != null ? numG.intValue() : 0);
        }
        this.f12466q0 = iC;
        this.f12452b0.r(ColorStateList.valueOf(iC));
        u4.g gVar3 = this.f12456f0;
        if (gVar3 != null && this.f12457g0 != null) {
            if (this.f12463m0 > -1 && this.p0 != 0) {
                gVar3.r(this.f12475w.isFocused() ? ColorStateList.valueOf(this.D0) : ColorStateList.valueOf(this.p0));
                this.f12457g0.r(ColorStateList.valueOf(this.p0));
            }
            invalidate();
        }
        u();
    }

    public final Rect d(Rect rect) {
        if (this.f12475w == null) {
            throw new IllegalStateException();
        }
        boolean z6 = getLayoutDirection() == 1;
        int i6 = rect.bottom;
        Rect rect2 = this.f12468s0;
        rect2.bottom = i6;
        int i7 = this.f12461k0;
        if (i7 == 1) {
            rect2.left = i(rect.left, z6);
            rect2.top = rect.top + this.f12462l0;
            rect2.right = j(rect.right, z6);
            return rect2;
        }
        if (i7 != 2) {
            rect2.left = i(rect.left, z6);
            rect2.top = getPaddingTop();
            rect2.right = j(rect.right, z6);
            return rect2;
        }
        rect2.left = this.f12475w.getPaddingLeft() + rect.left;
        rect2.top = rect.top - e();
        rect2.right = rect.right - this.f12475w.getPaddingRight();
        return rect2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i6) {
        EditText editText = this.f12475w;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i6);
            return;
        }
        if (this.f12477x != null) {
            boolean z6 = this.f12451a0;
            this.f12451a0 = false;
            CharSequence hint = editText.getHint();
            this.f12475w.setHint(this.f12477x);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i6);
                return;
            } finally {
                this.f12475w.setHint(hint);
                this.f12451a0 = z6;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i6);
        onProvideAutofillVirtualStructure(viewStructure, i6);
        FrameLayout frameLayout = this.s;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i7 = 0; i7 < frameLayout.getChildCount(); i7++) {
            View childAt = frameLayout.getChildAt(i7);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i7);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i6);
            if (childAt == this.f12475w) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.T0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.T0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        u4.g gVar;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z6 = this.V;
        n4.b bVar = this.O0;
        if (z6) {
            TextPaint textPaint = bVar.O;
            RectF rectF = bVar.f13940e;
            int iSave = canvas2.save();
            if (bVar.C != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(bVar.G);
                float f6 = bVar.f13958q;
                float f7 = bVar.f13959r;
                float f8 = bVar.F;
                if (f8 != 1.0f) {
                    canvas2.scale(f8, f8, f6, f7);
                }
                if ((bVar.f13941e0 > 1 || bVar.f13943f0 > 1) && !bVar.D && bVar.o()) {
                    float lineStart = bVar.f13958q - bVar.Z.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas2.translate(lineStart, f7);
                    float f9 = alpha;
                    textPaint.setAlpha((int) (bVar.f13937c0 * f9));
                    int i6 = Build.VERSION.SDK_INT;
                    if (i6 >= 31) {
                        float f10 = bVar.H;
                        float f11 = bVar.I;
                        float f12 = bVar.J;
                        int i7 = bVar.K;
                        textPaint.setShadowLayer(f10, f11, f12, m0.a.e(i7, (textPaint.getAlpha() * Color.alpha(i7)) / 255));
                    }
                    bVar.Z.draw(canvas2);
                    textPaint.setAlpha((int) (bVar.f13935b0 * f9));
                    if (i6 >= 31) {
                        float f13 = bVar.H;
                        float f14 = bVar.I;
                        float f15 = bVar.J;
                        int i8 = bVar.K;
                        textPaint.setShadowLayer(f13, f14, f15, m0.a.e(i8, (Color.alpha(i8) * textPaint.getAlpha()) / 255));
                    }
                    int lineBaseline = bVar.Z.getLineBaseline(0);
                    CharSequence charSequence = bVar.f13939d0;
                    float f16 = lineBaseline;
                    canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f16, textPaint);
                    if (i6 >= 31) {
                        textPaint.setShadowLayer(bVar.H, bVar.I, bVar.J, bVar.K);
                    }
                    String strTrim = bVar.f13939d0.toString().trim();
                    if (strTrim.endsWith("…")) {
                        strTrim = strTrim.substring(0, strTrim.length() - 1);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas2 = canvas;
                    canvas2.drawText(str, 0, Math.min(bVar.Z.getLineEnd(0), str.length()), 0.0f, f16, (Paint) textPaint);
                } else {
                    canvas2.translate(f6, f7);
                    bVar.Z.draw(canvas2);
                }
                canvas2.restoreToCount(iSave);
            }
        }
        if (this.f12457g0 == null || (gVar = this.f12456f0) == null) {
            return;
        }
        gVar.draw(canvas2);
        if (this.f12475w.isFocused()) {
            Rect bounds = this.f12457g0.getBounds();
            Rect bounds2 = this.f12456f0.getBounds();
            float f17 = bVar.f13934b;
            int iCenterX = bounds2.centerX();
            bounds.left = x3.a.c(f17, iCenterX, bounds2.left);
            bounds.right = x3.a.c(f17, iCenterX, bounds2.right);
            this.f12457g0.draw(canvas2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void drawableStateChanged() {
        boolean z6;
        ColorStateList colorStateList;
        if (this.S0) {
            return;
        }
        this.S0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        n4.b bVar = this.O0;
        if (bVar != null) {
            bVar.M = drawableState;
            ColorStateList colorStateList2 = bVar.f13951k;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = bVar.f13949j) == null || !colorStateList.isStateful())) {
                z6 = false;
            } else {
                bVar.j(false);
                z6 = true;
            }
        }
        if (this.f12475w != null) {
            w(isLaidOut() && isEnabled(), false);
        }
        t();
        z();
        if (z6) {
            invalidate();
        }
        this.S0 = false;
    }

    public final int e() {
        if (this.V) {
            int i6 = this.f12461k0;
            n4.b bVar = this.O0;
            if (i6 == 0) {
                return (int) bVar.f();
            }
            if (i6 == 2) {
                if (getHintMaxLines() == 1) {
                    return (int) (bVar.f() / 2.0f);
                }
                float f6 = bVar.f();
                TextPaint textPaint = bVar.P;
                textPaint.setTextSize(bVar.f13947i);
                textPaint.setTypeface(bVar.s);
                textPaint.setLetterSpacing(bVar.W);
                return Math.max(0, (int) (f6 - ((-textPaint.ascent()) / 2.0f)));
            }
        }
        return 0;
    }

    public final e2.c f() {
        e2.c cVar = new e2.c();
        cVar.f12791u = o4.b.c(getContext(), com.htmltoapk.template.R.attr.motionDurationShort2, 87);
        cVar.f12792v = o4.b.d(getContext(), com.htmltoapk.template.R.attr.motionEasingLinearInterpolator, x3.a.f15144a);
        return cVar;
    }

    public final boolean g() {
        return this.V && !TextUtils.isEmpty(this.W) && (this.f12452b0 instanceof y4.e);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f12475w;
        if (editText == null) {
            return super.getBaseline();
        }
        return e() + getPaddingTop() + editText.getBaseline();
    }

    public u4.g getBoxBackground() {
        int i6 = this.f12461k0;
        if (i6 == 1 || i6 == 2) {
            return this.f12452b0;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f12466q0;
    }

    public int getBoxBackgroundMode() {
        return this.f12461k0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f12462l0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f12470t0;
        return layoutDirection == 1 ? this.f12458h0.h.a(rectF) : this.f12458h0.f14641g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f12470t0;
        return layoutDirection == 1 ? this.f12458h0.f14641g.a(rectF) : this.f12458h0.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f12470t0;
        return layoutDirection == 1 ? this.f12458h0.f14639e.a(rectF) : this.f12458h0.f14640f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f12470t0;
        return layoutDirection == 1 ? this.f12458h0.f14640f.a(rectF) : this.f12458h0.f14639e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.F0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.G0;
    }

    public int getBoxStrokeWidth() {
        return this.f12464n0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f12465o0;
    }

    public int getCounterMaxLength() {
        return this.E;
    }

    public CharSequence getCounterOverflowDescription() {
        c0 c0Var;
        if (this.D && this.F && (c0Var = this.H) != null) {
            return c0Var.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.S;
    }

    public ColorStateList getCounterTextColor() {
        return this.R;
    }

    public ColorStateList getCursorColor() {
        return this.T;
    }

    public ColorStateList getCursorErrorColor() {
        return this.U;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.B0;
    }

    public EditText getEditText() {
        return this.f12475w;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f12471u.f12494y.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f12471u.f12494y.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f12471u.E;
    }

    public int getEndIconMode() {
        return this.f12471u.A;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f12471u.F;
    }

    public CheckableImageButton getEndIconView() {
        return this.f12471u.f12494y;
    }

    public CharSequence getError() {
        n nVar = this.C;
        if (nVar.f15289q) {
            return nVar.f15288p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.C.f15291t;
    }

    public CharSequence getErrorContentDescription() {
        return this.C.s;
    }

    public int getErrorCurrentTextColors() {
        c0 c0Var = this.C.f15290r;
        if (c0Var != null) {
            return c0Var.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f12471u.f12490u.getDrawable();
    }

    public CharSequence getHelperText() {
        n nVar = this.C;
        if (nVar.f15295x) {
            return nVar.f15294w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        c0 c0Var = this.C.f15296y;
        if (c0Var != null) {
            return c0Var.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.V) {
            return this.W;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.O0.f();
    }

    public final int getHintCurrentCollapsedTextColor() {
        n4.b bVar = this.O0;
        return bVar.g(bVar.f13951k);
    }

    public int getHintMaxLines() {
        return this.O0.f13941e0;
    }

    public ColorStateList getHintTextColor() {
        return this.C0;
    }

    public f getLengthCounter() {
        return this.G;
    }

    public int getMaxEms() {
        return this.f12481z;
    }

    public int getMaxWidth() {
        return this.B;
    }

    public int getMinEms() {
        return this.f12479y;
    }

    public int getMinWidth() {
        return this.A;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f12471u.f12494y.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f12471u.f12494y.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.L) {
            return this.K;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.O;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.N;
    }

    public CharSequence getPrefixText() {
        return this.f12469t.f15313u;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f12469t.f15312t.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f12469t.f15312t;
    }

    public k getShapeAppearanceModel() {
        return this.f12458h0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f12469t.f15314v.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f12469t.f15314v.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f12469t.f15317y;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f12469t.f15318z;
    }

    public CharSequence getSuffixText() {
        return this.f12471u.H;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f12471u.I.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f12471u.I;
    }

    public Typeface getTypeface() {
        return this.f12472u0;
    }

    public final u4.g h(boolean z6) throws Resources.NotFoundException {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.htmltoapk.template.R.dimen.mtrl_shape_corner_size_small_component);
        float f6 = z6 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f12475w;
        float popupElevation = editText instanceof p ? ((p) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.htmltoapk.template.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.htmltoapk.template.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        u4.i iVar = new u4.i();
        u4.i iVar2 = new u4.i();
        u4.i iVar3 = new u4.i();
        u4.i iVar4 = new u4.i();
        u4.f fVar = new u4.f();
        u4.f fVar2 = new u4.f();
        u4.f fVar3 = new u4.f();
        u4.f fVar4 = new u4.f();
        u4.a aVar = new u4.a(f6);
        u4.a aVar2 = new u4.a(f6);
        u4.a aVar3 = new u4.a(dimensionPixelOffset);
        u4.a aVar4 = new u4.a(dimensionPixelOffset);
        k kVar = new k();
        kVar.f14635a = iVar;
        kVar.f14636b = iVar2;
        kVar.f14637c = iVar3;
        kVar.f14638d = iVar4;
        kVar.f14639e = aVar;
        kVar.f14640f = aVar2;
        kVar.f14641g = aVar4;
        kVar.h = aVar3;
        kVar.f14642i = fVar;
        kVar.f14643j = fVar2;
        kVar.f14644k = fVar3;
        kVar.f14645l = fVar4;
        EditText editText2 = this.f12475w;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof p ? ((p) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = u4.g.X;
            dropDownBackgroundTintList = ColorStateList.valueOf(androidx.work.j.j(context, q4.b.c(context, u4.g.class.getSimpleName(), com.htmltoapk.template.R.attr.colorSurface)));
        }
        u4.g gVar = new u4.g();
        gVar.n(context);
        gVar.r(dropDownBackgroundTintList);
        gVar.q(popupElevation);
        gVar.setShapeAppearanceModel(kVar);
        g.c cVar = gVar.f14610t;
        if (cVar.f14625g == null) {
            cVar.f14625g = new Rect();
        }
        gVar.f14610t.f14625g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        gVar.invalidateSelf();
        return gVar;
    }

    public final int i(int i6, boolean z6) {
        return ((z6 || getPrefixText() == null) ? (!z6 || getSuffixText() == null) ? this.f12475w.getCompoundPaddingLeft() : this.f12471u.c() : this.f12469t.a()) + i6;
    }

    public final int j(int i6, boolean z6) {
        return i6 - ((z6 || getSuffixText() == null) ? (!z6 || getPrefixText() == null) ? this.f12475w.getCompoundPaddingRight() : this.f12469t.a() : this.f12471u.c());
    }

    public final void k() {
        int i6 = this.f12461k0;
        if (i6 == 0) {
            this.f12452b0 = null;
            this.f12456f0 = null;
            this.f12457g0 = null;
        } else if (i6 == 1) {
            this.f12452b0 = new u4.g(this.f12458h0);
            this.f12456f0 = new u4.g();
            this.f12457g0 = new u4.g();
        } else {
            if (i6 != 2) {
                throw new IllegalArgumentException(p0.a(new StringBuilder(), this.f12461k0, " is illegal; only @BoxBackgroundMode constants are supported."));
            }
            if (!this.V || (this.f12452b0 instanceof y4.e)) {
                this.f12452b0 = new u4.g(this.f12458h0);
            } else {
                k kVar = this.f12458h0;
                int i7 = y4.e.f15251a0;
                if (kVar == null) {
                    kVar = new k();
                }
                e.a aVar = new e.a(kVar, new RectF());
                e.b bVar = new e.b(aVar);
                bVar.Z = aVar;
                this.f12452b0 = bVar;
            }
            this.f12456f0 = null;
            this.f12457g0 = null;
        }
        u();
        z();
        if (this.f12461k0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f12462l0 = getResources().getDimensionPixelSize(com.htmltoapk.template.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (q4.c.d(getContext())) {
                this.f12462l0 = getResources().getDimensionPixelSize(com.htmltoapk.template.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        a();
        if (this.f12461k0 != 0) {
            v();
        }
        EditText editText = this.f12475w;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i8 = this.f12461k0;
                if (i8 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i8 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l() {
        float f6;
        float f7;
        float f8;
        RectF rectF;
        float f9;
        int i6;
        float f10;
        int i7;
        if (g()) {
            int width = this.f12475w.getWidth();
            int gravity = this.f12475w.getGravity();
            n4.b bVar = this.O0;
            boolean zC = bVar.c(bVar.B);
            bVar.D = zC;
            Rect rect = bVar.f13938d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zC) {
                        i7 = rect.left;
                        f8 = i7;
                    } else {
                        f6 = rect.right;
                        f7 = bVar.f13933a0;
                    }
                } else if (zC) {
                    f6 = rect.right;
                    f7 = bVar.f13933a0;
                } else {
                    i7 = rect.left;
                    f8 = i7;
                }
                float fMax = Math.max(f8, rect.left);
                rectF = this.f12470t0;
                rectF.left = fMax;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f9 = (width / 2.0f) + (bVar.f13933a0 / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (bVar.D) {
                        f10 = bVar.f13933a0;
                        f9 = f10 + fMax;
                    } else {
                        i6 = rect.right;
                        f9 = i6;
                    }
                } else if (bVar.D) {
                    i6 = rect.right;
                    f9 = i6;
                } else {
                    f10 = bVar.f13933a0;
                    f9 = f10 + fMax;
                }
                rectF.right = Math.min(f9, rect.right);
                rectF.bottom = bVar.f() + rect.top;
                if (bVar.Z != null && !bVar.o()) {
                    StaticLayout staticLayout = bVar.Z;
                    float lineWidth = (bVar.f13947i / bVar.h) * staticLayout.getLineWidth(staticLayout.getLineCount() - 1);
                    if (bVar.D) {
                        rectF.right = rectF.left + lineWidth;
                    } else {
                        rectF.left = rectF.right - lineWidth;
                    }
                }
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f11 = rectF.left;
                float f12 = this.f12460j0;
                rectF.left = f11 - f12;
                rectF.right += f12;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f12463m0);
                rectF.top = 0.0f;
                y4.e eVar = (y4.e) this.f12452b0;
                eVar.getClass();
                eVar.x(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f6 = width / 2.0f;
            f7 = bVar.f13933a0 / 2.0f;
            f8 = f6 - f7;
            float fMax2 = Math.max(f8, rect.left);
            rectF = this.f12470t0;
            rectF.left = fMax2;
            rectF.top = rect.top;
            if (gravity != 17) {
                f9 = (width / 2.0f) + (bVar.f13933a0 / 2.0f);
            }
            rectF.right = Math.min(f9, rect.right);
            rectF.bottom = bVar.f() + rect.top;
            if (bVar.Z != null) {
                StaticLayout staticLayout2 = bVar.Z;
                float lineWidth2 = (bVar.f13947i / bVar.h) * staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1);
                if (bVar.D) {
                }
            }
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void n(c0 c0Var, int i6) {
        try {
            c0Var.setTextAppearance(i6);
            if (c0Var.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        c0Var.setTextAppearance(com.htmltoapk.template.R.style.TextAppearance_AppCompat_Caption);
        c0Var.setTextColor(getContext().getColor(com.htmltoapk.template.R.color.design_error));
    }

    public final boolean o() {
        n nVar = this.C;
        return (nVar.f15287o != 1 || nVar.f15290r == null || TextUtils.isEmpty(nVar.f15288p)) ? false : true;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.O0.i(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        com.google.android.material.textfield.a aVar = this.f12471u;
        aVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z6 = false;
        this.U0 = false;
        if (this.f12475w != null && this.f12475w.getMeasuredHeight() < (iMax = Math.max(aVar.getMeasuredHeight(), this.f12469t.getMeasuredHeight()))) {
            this.f12475w.setMinimumHeight(iMax);
            z6 = true;
        }
        boolean zS = s();
        if (z6 || zS) {
            this.f12475w.post(new androidx.camera.lifecycle.a(8, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
        float fDescent;
        int i10;
        int compoundPaddingTop;
        super.onLayout(z6, i6, i7, i8, i9);
        EditText editText = this.f12475w;
        if (editText != null) {
            Rect rect = this.f12467r0;
            n4.c.a(this, editText, rect);
            u4.g gVar = this.f12456f0;
            if (gVar != null) {
                int i11 = rect.bottom;
                gVar.setBounds(rect.left, i11 - this.f12464n0, rect.right, i11);
            }
            u4.g gVar2 = this.f12457g0;
            if (gVar2 != null) {
                int i12 = rect.bottom;
                gVar2.setBounds(rect.left, i12 - this.f12465o0, rect.right, i12);
            }
            if (this.V) {
                float textSize = this.f12475w.getTextSize();
                n4.b bVar = this.O0;
                float f6 = bVar.h;
                TextPaint textPaint = bVar.P;
                if (f6 != textSize) {
                    bVar.h = textSize;
                    bVar.j(false);
                }
                int gravity = this.f12475w.getGravity();
                int i13 = (gravity & (-113)) | 48;
                if (bVar.f13944g != i13) {
                    bVar.f13944g = i13;
                    bVar.j(false);
                }
                if (bVar.f13942f != gravity) {
                    bVar.f13942f = gravity;
                    bVar.j(false);
                }
                Rect rectD = d(rect);
                int i14 = rectD.left;
                int i15 = rectD.top;
                int i16 = rectD.right;
                int i17 = rectD.bottom;
                Rect rect2 = bVar.f13938d;
                if (rect2.left != i14 || rect2.top != i15 || rect2.right != i16 || rect2.bottom != i17) {
                    rect2.set(i14, i15, i16, i17);
                    bVar.N = true;
                }
                if (this.f12475w == null) {
                    throw new IllegalStateException();
                }
                if (getHintMaxLines() == 1) {
                    textPaint.setTextSize(bVar.h);
                    textPaint.setTypeface(bVar.f13962v);
                    textPaint.setLetterSpacing(bVar.X);
                    fDescent = -textPaint.ascent();
                } else {
                    textPaint.setTextSize(bVar.h);
                    textPaint.setTypeface(bVar.f13962v);
                    textPaint.setLetterSpacing(bVar.X);
                    fDescent = bVar.f13953l * (textPaint.descent() + (-textPaint.ascent()));
                }
                int compoundPaddingLeft = this.f12475w.getCompoundPaddingLeft() + rect.left;
                Rect rect3 = this.f12468s0;
                rect3.left = compoundPaddingLeft;
                if (this.f12461k0 != 1 || this.f12475w.getMinLines() > 1) {
                    if (this.f12461k0 != 0 || getHintMaxLines() == 1) {
                        i10 = 0;
                    } else {
                        textPaint.setTextSize(bVar.h);
                        textPaint.setTypeface(bVar.f13962v);
                        textPaint.setLetterSpacing(bVar.X);
                        i10 = (int) ((-textPaint.ascent()) / 2.0f);
                    }
                    compoundPaddingTop = (this.f12475w.getCompoundPaddingTop() + rect.top) - i10;
                } else {
                    compoundPaddingTop = (int) (rect.centerY() - (fDescent / 2.0f));
                }
                rect3.top = compoundPaddingTop;
                rect3.right = rect.right - this.f12475w.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f12461k0 != 1 || this.f12475w.getMinLines() > 1) ? rect.bottom - this.f12475w.getCompoundPaddingBottom() : (int) (rect3.top + fDescent);
                rect3.bottom = compoundPaddingBottom;
                int i18 = rect3.left;
                int i19 = rect3.top;
                int i20 = rect3.right;
                Rect rect4 = bVar.f13936c;
                if (rect4.left != i18 || rect4.top != i19 || rect4.right != i20 || rect4.bottom != compoundPaddingBottom || true != bVar.f13952k0) {
                    rect4.set(i18, i19, i20, compoundPaddingBottom);
                    bVar.N = true;
                    bVar.f13952k0 = true;
                }
                bVar.j(false);
                if (!g() || this.N0) {
                    return;
                }
                l();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i6, int i7) {
        float f6;
        EditText editText;
        super.onMeasure(i6, i7);
        boolean z6 = this.U0;
        com.google.android.material.textfield.a aVar = this.f12471u;
        if (!z6) {
            aVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.U0 = true;
        }
        if (this.M != null && (editText = this.f12475w) != null) {
            this.M.setGravity(editText.getGravity());
            this.M.setPadding(this.f12475w.getCompoundPaddingLeft(), this.f12475w.getCompoundPaddingTop(), this.f12475w.getCompoundPaddingRight(), this.f12475w.getCompoundPaddingBottom());
        }
        aVar.n();
        if (getHintMaxLines() == 1) {
            return;
        }
        int measuredWidth = (this.f12475w.getMeasuredWidth() - this.f12475w.getCompoundPaddingLeft()) - this.f12475w.getCompoundPaddingRight();
        n4.b bVar = this.O0;
        TextPaint textPaint = bVar.P;
        textPaint.setTextSize(bVar.f13947i);
        textPaint.setTypeface(bVar.s);
        textPaint.setLetterSpacing(bVar.W);
        float f7 = measuredWidth;
        bVar.f13948i0 = bVar.e(bVar.f13943f0, textPaint, bVar.B, (bVar.f13947i / bVar.h) * f7, bVar.D).getHeight();
        textPaint.setTextSize(bVar.h);
        textPaint.setTypeface(bVar.f13962v);
        textPaint.setLetterSpacing(bVar.X);
        bVar.f13950j0 = bVar.e(bVar.f13941e0, textPaint, bVar.B, f7, bVar.D).getHeight();
        EditText editText2 = this.f12475w;
        Rect rect = this.f12467r0;
        n4.c.a(this, editText2, rect);
        Rect rectD = d(rect);
        int i8 = rectD.left;
        int i9 = rectD.top;
        int i10 = rectD.right;
        int i11 = rectD.bottom;
        Rect rect2 = bVar.f13938d;
        if (rect2.left != i8 || rect2.top != i9 || rect2.right != i10 || rect2.bottom != i11) {
            rect2.set(i8, i9, i10, i11);
            bVar.N = true;
        }
        v();
        a();
        if (this.f12475w == null) {
            return;
        }
        int i12 = bVar.f13950j0;
        if (i12 != -1) {
            f6 = i12;
        } else {
            TextPaint textPaint2 = bVar.P;
            textPaint2.setTextSize(bVar.h);
            textPaint2.setTypeface(bVar.f13962v);
            textPaint2.setLetterSpacing(bVar.X);
            f6 = -textPaint2.ascent();
        }
        if (this.K != null) {
            TextPaint textPaint3 = new TextPaint(129);
            textPaint3.set(this.M.getPaint());
            textPaint3.setTextSize(this.M.getTextSize());
            textPaint3.setTypeface(this.M.getTypeface());
            textPaint3.setLetterSpacing(this.M.getLetterSpacing());
            n4.g gVar = new n4.g(this.K, textPaint3, measuredWidth);
            gVar.f13981k = getLayoutDirection() == 1;
            gVar.f13980j = true;
            float lineSpacingExtra = this.M.getLineSpacingExtra();
            float lineSpacingMultiplier = this.M.getLineSpacingMultiplier();
            gVar.f13978g = lineSpacingExtra;
            gVar.h = lineSpacingMultiplier;
            gVar.f13983m = new androidx.camera.camera2.interop.b(this);
            f = (this.f12461k0 == 1 ? bVar.f() + this.f12462l0 + this.f12473v : 0.0f) + gVar.a().getHeight();
        }
        float fMax = Math.max(f6, f);
        if (this.f12475w.getMeasuredHeight() < fMax) {
            this.f12475w.setMinimumHeight(Math.round(fMax));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.s);
        setError(iVar.f12487u);
        if (iVar.f12488v) {
            post(new c());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i6) {
        super.onRtlPropertiesChanged(i6);
        boolean z6 = i6 == 1;
        if (z6 != this.f12459i0) {
            u4.d dVar = this.f12458h0.f14639e;
            RectF rectF = this.f12470t0;
            float fA = dVar.a(rectF);
            float fA2 = this.f12458h0.f14640f.a(rectF);
            float fA3 = this.f12458h0.h.a(rectF);
            float fA4 = this.f12458h0.f14641g.a(rectF);
            k kVar = this.f12458h0;
            androidx.activity.c0 c0Var = kVar.f14635a;
            androidx.activity.c0 c0Var2 = kVar.f14636b;
            androidx.activity.c0 c0Var3 = kVar.f14638d;
            androidx.activity.c0 c0Var4 = kVar.f14637c;
            new u4.i();
            new u4.i();
            new u4.i();
            new u4.i();
            u4.f fVar = new u4.f();
            u4.f fVar2 = new u4.f();
            u4.f fVar3 = new u4.f();
            u4.f fVar4 = new u4.f();
            u4.a aVar = new u4.a(fA2);
            u4.a aVar2 = new u4.a(fA);
            u4.a aVar3 = new u4.a(fA4);
            u4.a aVar4 = new u4.a(fA3);
            k kVar2 = new k();
            kVar2.f14635a = c0Var2;
            kVar2.f14636b = c0Var;
            kVar2.f14637c = c0Var3;
            kVar2.f14638d = c0Var4;
            kVar2.f14639e = aVar;
            kVar2.f14640f = aVar2;
            kVar2.f14641g = aVar4;
            kVar2.h = aVar3;
            kVar2.f14642i = fVar;
            kVar2.f14643j = fVar2;
            kVar2.f14644k = fVar3;
            kVar2.f14645l = fVar4;
            this.f12459i0 = z6;
            setShapeAppearanceModel(kVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        i iVar = new i(super.onSaveInstanceState());
        if (o()) {
            iVar.f12487u = getError();
        }
        com.google.android.material.textfield.a aVar = this.f12471u;
        iVar.f12488v = aVar.A != 0 && aVar.f12494y.f12389v;
        return iVar;
    }

    public final void p(Editable editable) {
        ((androidx.camera.view.g) this.G).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z6 = this.F;
        int i6 = this.E;
        if (i6 == -1) {
            this.H.setText(String.valueOf(length));
            this.H.setContentDescription(null);
            this.F = false;
        } else {
            this.F = length > i6;
            Context context = getContext();
            this.H.setContentDescription(context.getString(this.F ? com.htmltoapk.template.R.string.character_counter_overflowed_content_description : com.htmltoapk.template.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.E)));
            if (z6 != this.F) {
                q();
            }
            String str = s0.a.f14311b;
            s0.a aVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? s0.a.f14314e : s0.a.f14313d;
            c0 c0Var = this.H;
            String string = getContext().getString(com.htmltoapk.template.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.E));
            aVar.getClass();
            c.d dVar = s0.c.f14325a;
            c0Var.setText(string != null ? aVar.c(string).toString() : null);
        }
        if (this.f12475w == null || z6 == this.F) {
            return;
        }
        w(false, false);
        z();
        t();
    }

    public final void q() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        c0 c0Var = this.H;
        if (c0Var != null) {
            n(c0Var, this.F ? this.I : this.J);
            if (!this.F && (colorStateList2 = this.R) != null) {
                this.H.setTextColor(colorStateList2);
            }
            if (!this.F || (colorStateList = this.S) == null) {
                return;
            }
            this.H.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r() {
        ColorStateList colorStateList;
        ColorStateList colorStateListValueOf = this.T;
        if (colorStateListValueOf == null) {
            Context context = getContext();
            TypedValue typedValueA = q4.b.a(context.getTheme(), com.htmltoapk.template.R.attr.colorControlActivated);
            if (typedValueA != null) {
                int i6 = typedValueA.resourceId;
                if (i6 != 0) {
                    colorStateListValueOf = k0.a.b(context, i6);
                } else {
                    int i7 = typedValueA.data;
                    colorStateListValueOf = i7 != 0 ? ColorStateList.valueOf(i7) : null;
                }
            }
        }
        EditText editText = this.f12475w;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = this.f12475w.getTextCursorDrawable().mutate();
        if ((o() || (this.H != null && this.F)) && (colorStateList = this.U) != null) {
            colorStateListValueOf = colorStateList;
        }
        drawableMutate.setTintList(colorStateListValueOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s() {
        boolean z6;
        if (this.f12475w == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z7 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            s sVar = this.f12469t;
            if (sVar.getMeasuredWidth() > 0) {
                int iMax = Math.max(0, sVar.getMeasuredWidth() - this.f12475w.getPaddingLeft());
                if (this.f12474v0 == null || this.f12476w0 != iMax) {
                    ColorDrawable colorDrawable = new ColorDrawable();
                    this.f12474v0 = colorDrawable;
                    this.f12476w0 = iMax;
                    colorDrawable.setBounds(0, 0, iMax, 1);
                }
                Drawable[] compoundDrawablesRelative = this.f12475w.getCompoundDrawablesRelative();
                Drawable drawable = compoundDrawablesRelative[0];
                ColorDrawable colorDrawable2 = this.f12474v0;
                if (drawable != colorDrawable2) {
                    this.f12475w.setCompoundDrawablesRelative(colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                    z6 = true;
                }
                z6 = false;
            } else {
                if (this.f12474v0 != null) {
                    Drawable[] compoundDrawablesRelative2 = this.f12475w.getCompoundDrawablesRelative();
                    this.f12475w.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                    this.f12474v0 = null;
                    z6 = true;
                }
                z6 = false;
            }
        }
        com.google.android.material.textfield.a aVar = this.f12471u;
        if ((aVar.e() || ((aVar.A != 0 && aVar.d()) || aVar.H != null)) && aVar.getMeasuredWidth() > 0) {
            int measuredWidth = aVar.I.getMeasuredWidth() - this.f12475w.getPaddingRight();
            if (aVar.e()) {
                checkableImageButton = aVar.f12490u;
            } else if (aVar.A != 0 && aVar.d()) {
                checkableImageButton = aVar.f12494y;
            }
            if (checkableImageButton != null) {
                measuredWidth = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth;
            }
            int iMax2 = Math.max(0, measuredWidth);
            Drawable[] compoundDrawablesRelative3 = this.f12475w.getCompoundDrawablesRelative();
            ColorDrawable colorDrawable3 = this.f12480y0;
            if (colorDrawable3 != null && this.f12482z0 != iMax2) {
                this.f12482z0 = iMax2;
                colorDrawable3.setBounds(0, 0, iMax2, 1);
                this.f12475w.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f12480y0, compoundDrawablesRelative3[3]);
                return true;
            }
            if (colorDrawable3 == null) {
                ColorDrawable colorDrawable4 = new ColorDrawable();
                this.f12480y0 = colorDrawable4;
                this.f12482z0 = iMax2;
                colorDrawable4.setBounds(0, 0, iMax2, 1);
            }
            Drawable drawable2 = compoundDrawablesRelative3[2];
            ColorDrawable colorDrawable5 = this.f12480y0;
            if (drawable2 != colorDrawable5) {
                this.A0 = drawable2;
                this.f12475w.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], colorDrawable5, compoundDrawablesRelative3[3]);
                return true;
            }
        } else if (this.f12480y0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.f12475w.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.f12480y0) {
                this.f12475w.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.A0, compoundDrawablesRelative4[3]);
            } else {
                z7 = z6;
            }
            this.f12480y0 = null;
            return z7;
        }
        return z6;
    }

    public void setBoxBackgroundColor(int i6) {
        if (this.f12466q0 != i6) {
            this.f12466q0 = i6;
            this.H0 = i6;
            this.J0 = i6;
            this.K0 = i6;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i6) {
        setBoxBackgroundColor(getContext().getColor(i6));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.H0 = defaultColor;
        this.f12466q0 = defaultColor;
        this.I0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.J0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.K0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i6) {
        if (i6 == this.f12461k0) {
            return;
        }
        this.f12461k0 = i6;
        if (this.f12475w != null) {
            k();
        }
    }

    public void setBoxCollapsedPaddingTop(int i6) {
        this.f12462l0 = i6;
    }

    public void setBoxCornerFamily(int i6) {
        k.a aVarJ = this.f12458h0.j();
        u4.d dVar = this.f12458h0.f14639e;
        aVarJ.f14646a = a1.a.d(i6);
        aVarJ.f14650e = dVar;
        u4.d dVar2 = this.f12458h0.f14640f;
        aVarJ.f14647b = a1.a.d(i6);
        aVarJ.f14651f = dVar2;
        u4.d dVar3 = this.f12458h0.h;
        aVarJ.f14649d = a1.a.d(i6);
        aVarJ.h = dVar3;
        u4.d dVar4 = this.f12458h0.f14641g;
        aVarJ.f14648c = a1.a.d(i6);
        aVarJ.f14652g = dVar4;
        this.f12458h0 = aVarJ.a();
        c();
    }

    public void setBoxStrokeColor(int i6) {
        if (this.F0 != i6) {
            this.F0 = i6;
            z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.D0 = colorStateList.getDefaultColor();
            this.L0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.E0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.F0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.F0 != colorStateList.getDefaultColor()) {
            this.F0 = colorStateList.getDefaultColor();
        }
        z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.G0 != colorStateList) {
            this.G0 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i6) {
        this.f12464n0 = i6;
        z();
    }

    public void setBoxStrokeWidthFocused(int i6) {
        this.f12465o0 = i6;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(int i6) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i6));
    }

    public void setBoxStrokeWidthResource(int i6) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i6));
    }

    public void setCounterEnabled(boolean z6) {
        if (this.D != z6) {
            n nVar = this.C;
            if (z6) {
                c0 c0Var = new c0(getContext(), null);
                this.H = c0Var;
                c0Var.setId(com.htmltoapk.template.R.id.textinput_counter);
                Typeface typeface = this.f12472u0;
                if (typeface != null) {
                    this.H.setTypeface(typeface);
                }
                this.H.setMaxLines(1);
                nVar.a(this.H, 2);
                ((ViewGroup.MarginLayoutParams) this.H.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.htmltoapk.template.R.dimen.mtrl_textinput_counter_margin_start));
                q();
                if (this.H != null) {
                    EditText editText = this.f12475w;
                    p(editText != null ? editText.getText() : null);
                }
            } else {
                nVar.g(this.H, 2);
                this.H = null;
            }
            this.D = z6;
        }
    }

    public void setCounterMaxLength(int i6) {
        if (this.E != i6) {
            if (i6 > 0) {
                this.E = i6;
            } else {
                this.E = -1;
            }
            if (!this.D || this.H == null) {
                return;
            }
            EditText editText = this.f12475w;
            p(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i6) {
        if (this.I != i6) {
            this.I = i6;
            q();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.S != colorStateList) {
            this.S = colorStateList;
            q();
        }
    }

    public void setCounterTextAppearance(int i6) {
        if (this.J != i6) {
            this.J = i6;
            q();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.R != colorStateList) {
            this.R = colorStateList;
            q();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.T != colorStateList) {
            this.T = colorStateList;
            r();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.U != colorStateList) {
            this.U = colorStateList;
            if (o() || (this.H != null && this.F)) {
                r();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.B0 = colorStateList;
        this.C0 = colorStateList;
        if (this.f12475w != null) {
            w(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z6) {
        m(this, z6);
        super.setEnabled(z6);
    }

    public void setEndIconActivated(boolean z6) {
        this.f12471u.f12494y.setActivated(z6);
    }

    public void setEndIconCheckable(boolean z6) {
        this.f12471u.f12494y.setCheckable(z6);
    }

    public void setEndIconContentDescription(int i6) {
        com.google.android.material.textfield.a aVar = this.f12471u;
        aVar.g(i6 != 0 ? aVar.getResources().getText(i6) : null);
    }

    public void setEndIconDrawable(int i6) {
        com.google.android.material.textfield.a aVar = this.f12471u;
        Drawable drawableD = i6 != 0 ? b0.d(aVar.getContext(), i6) : null;
        TextInputLayout textInputLayout = aVar.s;
        CheckableImageButton checkableImageButton = aVar.f12494y;
        checkableImageButton.setImageDrawable(drawableD);
        if (drawableD != null) {
            m.a(textInputLayout, checkableImageButton, aVar.C, aVar.D);
            m.c(textInputLayout, checkableImageButton, aVar.C);
        }
    }

    public void setEndIconMinSize(int i6) {
        com.google.android.material.textfield.a aVar = this.f12471u;
        if (i6 < 0) {
            aVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i6 != aVar.E) {
            aVar.E = i6;
            CheckableImageButton checkableImageButton = aVar.f12494y;
            checkableImageButton.setMinimumWidth(i6);
            checkableImageButton.setMinimumHeight(i6);
            CheckableImageButton checkableImageButton2 = aVar.f12490u;
            checkableImageButton2.setMinimumWidth(i6);
            checkableImageButton2.setMinimumHeight(i6);
        }
    }

    public void setEndIconMode(int i6) {
        this.f12471u.h(i6);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        com.google.android.material.textfield.a aVar = this.f12471u;
        CheckableImageButton checkableImageButton = aVar.f12494y;
        View.OnLongClickListener onLongClickListener = aVar.G;
        checkableImageButton.setOnClickListener(onClickListener);
        m.d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        com.google.android.material.textfield.a aVar = this.f12471u;
        aVar.G = onLongClickListener;
        CheckableImageButton checkableImageButton = aVar.f12494y;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m.d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        com.google.android.material.textfield.a aVar = this.f12471u;
        aVar.F = scaleType;
        aVar.f12494y.setScaleType(scaleType);
        aVar.f12490u.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        com.google.android.material.textfield.a aVar = this.f12471u;
        if (aVar.C != colorStateList) {
            aVar.C = colorStateList;
            m.a(aVar.s, aVar.f12494y, colorStateList, aVar.D);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        com.google.android.material.textfield.a aVar = this.f12471u;
        if (aVar.D != mode) {
            aVar.D = mode;
            m.a(aVar.s, aVar.f12494y, aVar.C, mode);
        }
    }

    public void setEndIconVisible(boolean z6) {
        this.f12471u.i(z6);
    }

    public void setError(CharSequence charSequence) {
        n nVar = this.C;
        if (!nVar.f15289q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            nVar.f();
            return;
        }
        nVar.c();
        nVar.f15288p = charSequence;
        nVar.f15290r.setText(charSequence);
        int i6 = nVar.f15286n;
        if (i6 != 1) {
            nVar.f15287o = 1;
        }
        nVar.i(i6, nVar.f15287o, nVar.h(nVar.f15290r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i6) {
        n nVar = this.C;
        nVar.f15291t = i6;
        c0 c0Var = nVar.f15290r;
        if (c0Var != null) {
            c0Var.setAccessibilityLiveRegion(i6);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        n nVar = this.C;
        nVar.s = charSequence;
        c0 c0Var = nVar.f15290r;
        if (c0Var != null) {
            c0Var.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z6) {
        n nVar = this.C;
        TextInputLayout textInputLayout = nVar.h;
        if (nVar.f15289q == z6) {
            return;
        }
        nVar.c();
        if (z6) {
            c0 c0Var = new c0(nVar.f15280g, null);
            nVar.f15290r = c0Var;
            c0Var.setId(com.htmltoapk.template.R.id.textinput_error);
            nVar.f15290r.setTextAlignment(5);
            Typeface typeface = nVar.B;
            if (typeface != null) {
                nVar.f15290r.setTypeface(typeface);
            }
            int i6 = nVar.f15292u;
            nVar.f15292u = i6;
            c0 c0Var2 = nVar.f15290r;
            if (c0Var2 != null) {
                nVar.h.n(c0Var2, i6);
            }
            ColorStateList colorStateList = nVar.f15293v;
            nVar.f15293v = colorStateList;
            c0 c0Var3 = nVar.f15290r;
            if (c0Var3 != null && colorStateList != null) {
                c0Var3.setTextColor(colorStateList);
            }
            CharSequence charSequence = nVar.s;
            nVar.s = charSequence;
            c0 c0Var4 = nVar.f15290r;
            if (c0Var4 != null) {
                c0Var4.setContentDescription(charSequence);
            }
            int i7 = nVar.f15291t;
            nVar.f15291t = i7;
            c0 c0Var5 = nVar.f15290r;
            if (c0Var5 != null) {
                c0Var5.setAccessibilityLiveRegion(i7);
            }
            nVar.f15290r.setVisibility(4);
            nVar.a(nVar.f15290r, 0);
        } else {
            nVar.f();
            nVar.g(nVar.f15290r, 0);
            nVar.f15290r = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        nVar.f15289q = z6;
    }

    public void setErrorIconDrawable(int i6) {
        com.google.android.material.textfield.a aVar = this.f12471u;
        aVar.j(i6 != 0 ? b0.d(aVar.getContext(), i6) : null);
        m.c(aVar.s, aVar.f12490u, aVar.f12491v);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        com.google.android.material.textfield.a aVar = this.f12471u;
        CheckableImageButton checkableImageButton = aVar.f12490u;
        View.OnLongClickListener onLongClickListener = aVar.f12493x;
        checkableImageButton.setOnClickListener(onClickListener);
        m.d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        com.google.android.material.textfield.a aVar = this.f12471u;
        aVar.f12493x = onLongClickListener;
        CheckableImageButton checkableImageButton = aVar.f12490u;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m.d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        com.google.android.material.textfield.a aVar = this.f12471u;
        if (aVar.f12491v != colorStateList) {
            aVar.f12491v = colorStateList;
            m.a(aVar.s, aVar.f12490u, colorStateList, aVar.f12492w);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        com.google.android.material.textfield.a aVar = this.f12471u;
        if (aVar.f12492w != mode) {
            aVar.f12492w = mode;
            m.a(aVar.s, aVar.f12490u, aVar.f12491v, mode);
        }
    }

    public void setErrorTextAppearance(int i6) {
        n nVar = this.C;
        nVar.f15292u = i6;
        c0 c0Var = nVar.f15290r;
        if (c0Var != null) {
            nVar.h.n(c0Var, i6);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        n nVar = this.C;
        nVar.f15293v = colorStateList;
        c0 c0Var = nVar.f15290r;
        if (c0Var == null || colorStateList == null) {
            return;
        }
        c0Var.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z6) {
        if (this.P0 != z6) {
            this.P0 = z6;
            w(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        n nVar = this.C;
        if (zIsEmpty) {
            if (nVar.f15295x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!nVar.f15295x) {
            setHelperTextEnabled(true);
        }
        nVar.c();
        nVar.f15294w = charSequence;
        nVar.f15296y.setText(charSequence);
        int i6 = nVar.f15286n;
        if (i6 != 2) {
            nVar.f15287o = 2;
        }
        nVar.i(i6, nVar.f15287o, nVar.h(nVar.f15296y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        n nVar = this.C;
        nVar.A = colorStateList;
        c0 c0Var = nVar.f15296y;
        if (c0Var == null || colorStateList == null) {
            return;
        }
        c0Var.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z6) {
        n nVar = this.C;
        TextInputLayout textInputLayout = nVar.h;
        if (nVar.f15295x == z6) {
            return;
        }
        nVar.c();
        if (z6) {
            c0 c0Var = new c0(nVar.f15280g, null);
            nVar.f15296y = c0Var;
            c0Var.setId(com.htmltoapk.template.R.id.textinput_helper_text);
            nVar.f15296y.setTextAlignment(5);
            Typeface typeface = nVar.B;
            if (typeface != null) {
                nVar.f15296y.setTypeface(typeface);
            }
            nVar.f15296y.setVisibility(4);
            nVar.f15296y.setImportantForAccessibility(2);
            int i6 = nVar.f15297z;
            nVar.f15297z = i6;
            c0 c0Var2 = nVar.f15296y;
            if (c0Var2 != null) {
                c0Var2.setTextAppearance(i6);
            }
            ColorStateList colorStateList = nVar.A;
            nVar.A = colorStateList;
            c0 c0Var3 = nVar.f15296y;
            if (c0Var3 != null && colorStateList != null) {
                c0Var3.setTextColor(colorStateList);
            }
            nVar.a(nVar.f15296y, 1);
        } else {
            nVar.c();
            int i7 = nVar.f15286n;
            if (i7 == 2) {
                nVar.f15287o = 0;
            }
            nVar.i(i7, nVar.f15287o, nVar.h(nVar.f15296y, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
            nVar.g(nVar.f15296y, 1);
            nVar.f15296y = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        nVar.f15295x = z6;
    }

    public void setHelperTextTextAppearance(int i6) {
        n nVar = this.C;
        nVar.f15297z = i6;
        c0 c0Var = nVar.f15296y;
        if (c0Var != null) {
            c0Var.setTextAppearance(i6);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.V) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z6) {
        this.Q0 = z6;
    }

    public void setHintEnabled(boolean z6) {
        if (z6 != this.V) {
            this.V = z6;
            if (z6) {
                CharSequence hint = this.f12475w.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.W)) {
                        setHint(hint);
                    }
                    this.f12475w.setHint((CharSequence) null);
                }
                this.f12451a0 = true;
            } else {
                this.f12451a0 = false;
                if (!TextUtils.isEmpty(this.W) && TextUtils.isEmpty(this.f12475w.getHint())) {
                    this.f12475w.setHint(this.W);
                }
                setHintInternal(null);
            }
            if (this.f12475w != null) {
                v();
            }
        }
    }

    public void setHintMaxLines(int i6) {
        n4.b bVar = this.O0;
        if (i6 != bVar.f13943f0) {
            bVar.f13943f0 = i6;
            bVar.j(false);
        }
        if (i6 != bVar.f13941e0) {
            bVar.f13941e0 = i6;
            bVar.j(false);
        }
        requestLayout();
    }

    public void setHintTextAppearance(int i6) {
        n4.b bVar = this.O0;
        TextInputLayout textInputLayout = bVar.f13932a;
        q4.d dVar = new q4.d(textInputLayout.getContext(), i6);
        ColorStateList colorStateList = dVar.f14205k;
        if (colorStateList != null) {
            bVar.f13951k = colorStateList;
        }
        float f6 = dVar.f14206l;
        if (f6 != 0.0f) {
            bVar.f13947i = f6;
        }
        ColorStateList colorStateList2 = dVar.f14196a;
        if (colorStateList2 != null) {
            bVar.V = colorStateList2;
        }
        bVar.T = dVar.f14201f;
        bVar.U = dVar.f14202g;
        bVar.S = dVar.h;
        bVar.W = dVar.f14204j;
        q4.a aVar = bVar.f13966z;
        if (aVar != null) {
            aVar.f14195u = true;
        }
        com.google.android.gms.ads.nonagon.signalgeneration.d dVar2 = new com.google.android.gms.ads.nonagon.signalgeneration.d(bVar);
        dVar.a();
        bVar.f13966z = new q4.a(dVar2, dVar.f14210p);
        dVar.b(textInputLayout.getContext(), bVar.f13966z);
        bVar.j(false);
        this.C0 = bVar.f13951k;
        if (this.f12475w != null) {
            w(false, false);
            v();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.C0 != colorStateList) {
            if (this.B0 == null) {
                n4.b bVar = this.O0;
                if (bVar.f13951k != colorStateList) {
                    bVar.f13951k = colorStateList;
                    bVar.j(false);
                }
            }
            this.C0 = colorStateList;
            if (this.f12475w != null) {
                w(false, false);
            }
        }
    }

    public void setLengthCounter(f fVar) {
        this.G = fVar;
    }

    public void setMaxEms(int i6) {
        this.f12481z = i6;
        EditText editText = this.f12475w;
        if (editText == null || i6 == -1) {
            return;
        }
        editText.setMaxEms(i6);
    }

    public void setMaxWidth(int i6) {
        this.B = i6;
        EditText editText = this.f12475w;
        if (editText == null || i6 == -1) {
            return;
        }
        editText.setMaxWidth(i6);
    }

    public void setMaxWidthResource(int i6) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i6));
    }

    public void setMinEms(int i6) {
        this.f12479y = i6;
        EditText editText = this.f12475w;
        if (editText == null || i6 == -1) {
            return;
        }
        editText.setMinEms(i6);
    }

    public void setMinWidth(int i6) {
        this.A = i6;
        EditText editText = this.f12475w;
        if (editText == null || i6 == -1) {
            return;
        }
        editText.setMinWidth(i6);
    }

    public void setMinWidthResource(int i6) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i6));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i6) {
        com.google.android.material.textfield.a aVar = this.f12471u;
        aVar.f12494y.setContentDescription(i6 != 0 ? aVar.getResources().getText(i6) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i6) {
        com.google.android.material.textfield.a aVar = this.f12471u;
        aVar.f12494y.setImageDrawable(i6 != 0 ? b0.d(aVar.getContext(), i6) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z6) {
        com.google.android.material.textfield.a aVar = this.f12471u;
        if (z6 && aVar.A != 1) {
            aVar.h(1);
        } else if (z6) {
            aVar.getClass();
        } else {
            aVar.h(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        com.google.android.material.textfield.a aVar = this.f12471u;
        aVar.C = colorStateList;
        m.a(aVar.s, aVar.f12494y, colorStateList, aVar.D);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        com.google.android.material.textfield.a aVar = this.f12471u;
        aVar.D = mode;
        m.a(aVar.s, aVar.f12494y, aVar.C, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.M == null) {
            c0 c0Var = new c0(getContext(), null);
            this.M = c0Var;
            c0Var.setId(com.htmltoapk.template.R.id.textinput_placeholder);
            this.M.setImportantForAccessibility(1);
            this.M.setAccessibilityLiveRegion(1);
            e2.c cVarF = f();
            this.P = cVarF;
            cVarF.f12790t = 67L;
            this.Q = f();
            setPlaceholderTextAppearance(this.O);
            setPlaceholderTextColor(this.N);
            f0.m(this.M, new b());
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.L) {
                setPlaceholderTextEnabled(true);
            }
            this.K = charSequence;
        }
        EditText editText = this.f12475w;
        x(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i6) {
        this.O = i6;
        c0 c0Var = this.M;
        if (c0Var != null) {
            c0Var.setTextAppearance(i6);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.N != colorStateList) {
            this.N = colorStateList;
            c0 c0Var = this.M;
            if (c0Var == null || colorStateList == null) {
                return;
            }
            c0Var.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        s sVar = this.f12469t;
        sVar.getClass();
        sVar.f15313u = TextUtils.isEmpty(charSequence) ? null : charSequence;
        sVar.f15312t.setText(charSequence);
        sVar.f();
    }

    public void setPrefixTextAppearance(int i6) {
        this.f12469t.f15312t.setTextAppearance(i6);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f12469t.f15312t.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(k kVar) {
        u4.g gVar = this.f12452b0;
        if (gVar == null || gVar.j() == kVar) {
            return;
        }
        this.f12458h0 = kVar;
        c();
    }

    public void setStartIconCheckable(boolean z6) {
        this.f12469t.f15314v.setCheckable(z6);
    }

    public void setStartIconContentDescription(int i6) {
        setStartIconContentDescription(i6 != 0 ? getResources().getText(i6) : null);
    }

    public void setStartIconDrawable(int i6) {
        setStartIconDrawable(i6 != 0 ? b0.d(getContext(), i6) : null);
    }

    public void setStartIconMinSize(int i6) {
        s sVar = this.f12469t;
        if (i6 < 0) {
            sVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i6 != sVar.f15317y) {
            sVar.f15317y = i6;
            CheckableImageButton checkableImageButton = sVar.f15314v;
            checkableImageButton.setMinimumWidth(i6);
            checkableImageButton.setMinimumHeight(i6);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        s sVar = this.f12469t;
        CheckableImageButton checkableImageButton = sVar.f15314v;
        View.OnLongClickListener onLongClickListener = sVar.A;
        checkableImageButton.setOnClickListener(onClickListener);
        m.d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        s sVar = this.f12469t;
        sVar.A = onLongClickListener;
        CheckableImageButton checkableImageButton = sVar.f15314v;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m.d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        s sVar = this.f12469t;
        sVar.f15318z = scaleType;
        sVar.f15314v.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        s sVar = this.f12469t;
        if (sVar.f15315w != colorStateList) {
            sVar.f15315w = colorStateList;
            m.a(sVar.s, sVar.f15314v, colorStateList, sVar.f15316x);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        s sVar = this.f12469t;
        if (sVar.f15316x != mode) {
            sVar.f15316x = mode;
            m.a(sVar.s, sVar.f15314v, sVar.f15315w, mode);
        }
    }

    public void setStartIconVisible(boolean z6) {
        this.f12469t.d(z6);
    }

    public void setSuffixText(CharSequence charSequence) {
        com.google.android.material.textfield.a aVar = this.f12471u;
        aVar.getClass();
        aVar.H = TextUtils.isEmpty(charSequence) ? null : charSequence;
        aVar.I.setText(charSequence);
        aVar.o();
    }

    public void setSuffixTextAppearance(int i6) {
        this.f12471u.I.setTextAppearance(i6);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f12471u.I.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f12475w;
        if (editText != null) {
            f0.m(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f12472u0) {
            this.f12472u0 = typeface;
            this.O0.n(typeface);
            n nVar = this.C;
            if (typeface != nVar.B) {
                nVar.B = typeface;
                c0 c0Var = nVar.f15290r;
                if (c0Var != null) {
                    c0Var.setTypeface(typeface);
                }
                c0 c0Var2 = nVar.f15296y;
                if (c0Var2 != null) {
                    c0Var2.setTypeface(typeface);
                }
            }
            c0 c0Var3 = this.H;
            if (c0Var3 != null) {
                c0Var3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        Drawable background;
        c0 c0Var;
        EditText editText = this.f12475w;
        if (editText == null || this.f12461k0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = h0.f13647a;
        Drawable drawableMutate = background.mutate();
        if (o()) {
            drawableMutate.setColorFilter(l.j.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.F && (c0Var = this.H) != null) {
            drawableMutate.setColorFilter(l.j.c(c0Var.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.f12475w.refreshDrawableState();
        }
    }

    public final void u() {
        EditText editText = this.f12475w;
        if (editText == null || this.f12452b0 == null) {
            return;
        }
        if ((this.f12455e0 || editText.getBackground() == null) && this.f12461k0 != 0) {
            this.f12475w.setBackground(getEditTextBoxBackground());
            this.f12455e0 = true;
        }
    }

    public final void v() {
        if (this.f12461k0 != 1) {
            FrameLayout frameLayout = this.s;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iE = e();
            if (iE != layoutParams.topMargin) {
                layoutParams.topMargin = iE;
                frameLayout.requestLayout();
            }
        }
    }

    public final void w(boolean z6, boolean z7) {
        ColorStateList colorStateList;
        c0 c0Var;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f12475w;
        boolean z8 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f12475w;
        boolean z9 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.B0;
        n4.b bVar = this.O0;
        if (colorStateList2 != null) {
            bVar.k(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.B0;
            bVar.k(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.L0) : this.L0));
        } else if (o()) {
            c0 c0Var2 = this.C.f15290r;
            bVar.k(c0Var2 != null ? c0Var2.getTextColors() : null);
        } else if (this.F && (c0Var = this.H) != null) {
            bVar.k(c0Var.getTextColors());
        } else if (z9 && (colorStateList = this.C0) != null && bVar.f13951k != colorStateList) {
            bVar.f13951k = colorStateList;
            bVar.j(false);
        }
        com.google.android.material.textfield.a aVar = this.f12471u;
        s sVar = this.f12469t;
        if (z8 || !this.P0 || (isEnabled() && z9)) {
            if (z7 || this.N0) {
                ValueAnimator valueAnimator = this.R0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.R0.cancel();
                }
                if (z6 && this.Q0) {
                    b(1.0f);
                } else {
                    bVar.m(1.0f);
                }
                this.N0 = false;
                if (g()) {
                    l();
                }
                EditText editText3 = this.f12475w;
                x(editText3 != null ? editText3.getText() : null);
                sVar.B = false;
                sVar.f();
                aVar.J = false;
                aVar.o();
                return;
            }
            return;
        }
        if (z7 || !this.N0) {
            ValueAnimator valueAnimator2 = this.R0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.R0.cancel();
            }
            if (z6 && this.Q0) {
                b(0.0f);
            } else {
                bVar.m(0.0f);
            }
            if (g() && !((y4.e) this.f12452b0).Z.f15252q.isEmpty() && g()) {
                ((y4.e) this.f12452b0).x(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.N0 = true;
            c0 c0Var3 = this.M;
            if (c0Var3 != null && this.L) {
                c0Var3.setText((CharSequence) null);
                e2.j.a(this.s, this.Q);
                this.M.setVisibility(4);
            }
            sVar.B = true;
            sVar.f();
            aVar.J = true;
            aVar.o();
        }
    }

    public final void x(Editable editable) {
        ((androidx.camera.view.g) this.G).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.s;
        if (length != 0 || this.N0) {
            c0 c0Var = this.M;
            if (c0Var == null || !this.L) {
                return;
            }
            c0Var.setText((CharSequence) null);
            e2.j.a(frameLayout, this.Q);
            this.M.setVisibility(4);
            return;
        }
        if (this.M == null || !this.L || TextUtils.isEmpty(this.K)) {
            return;
        }
        this.M.setText(this.K);
        e2.j.a(frameLayout, this.P);
        this.M.setVisibility(0);
        this.M.bringToFront();
    }

    public final void y(boolean z6, boolean z7) {
        int defaultColor = this.G0.getDefaultColor();
        int colorForState = this.G0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.G0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z6) {
            this.p0 = colorForState2;
        } else if (z7) {
            this.p0 = colorForState;
        } else {
            this.p0 = defaultColor;
        }
    }

    public final void z() {
        c0 c0Var;
        EditText editText;
        EditText editText2;
        if (this.f12452b0 == null || this.f12461k0 == 0) {
            return;
        }
        boolean z6 = isFocused() || ((editText2 = this.f12475w) != null && editText2.hasFocus());
        boolean z7 = isHovered() || ((editText = this.f12475w) != null && editText.isHovered());
        if (!isEnabled()) {
            this.p0 = this.L0;
        } else if (o()) {
            if (this.G0 != null) {
                y(z6, z7);
            } else {
                this.p0 = getErrorCurrentTextColors();
            }
        } else if (!this.F || (c0Var = this.H) == null) {
            if (z6) {
                this.p0 = this.F0;
            } else if (z7) {
                this.p0 = this.E0;
            } else {
                this.p0 = this.D0;
            }
        } else if (this.G0 != null) {
            y(z6, z7);
        } else {
            this.p0 = c0Var.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        com.google.android.material.textfield.a aVar = this.f12471u;
        TextInputLayout textInputLayout = aVar.s;
        CheckableImageButton checkableImageButton = aVar.f12494y;
        TextInputLayout textInputLayout2 = aVar.s;
        aVar.m();
        m.c(textInputLayout2, aVar.f12490u, aVar.f12491v);
        m.c(textInputLayout2, checkableImageButton, aVar.C);
        if (aVar.b() instanceof y4.k) {
            if (!textInputLayout.o() || checkableImageButton.getDrawable() == null) {
                m.a(textInputLayout, checkableImageButton, aVar.C, aVar.D);
            } else {
                Drawable drawableMutate = checkableImageButton.getDrawable().mutate();
                drawableMutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        s sVar = this.f12469t;
        m.c(sVar.s, sVar.f15314v, sVar.f15315w);
        if (this.f12461k0 == 2) {
            int i6 = this.f12463m0;
            if (z6 && isEnabled()) {
                this.f12463m0 = this.f12465o0;
            } else {
                this.f12463m0 = this.f12464n0;
            }
            if (this.f12463m0 != i6 && g() && !this.N0) {
                if (g()) {
                    ((y4.e) this.f12452b0).x(0.0f, 0.0f, 0.0f, 0.0f);
                }
                l();
            }
        }
        if (this.f12461k0 == 1) {
            if (!isEnabled()) {
                this.f12466q0 = this.I0;
            } else if (z7 && !z6) {
                this.f12466q0 = this.K0;
            } else if (z6) {
                this.f12466q0 = this.J0;
            } else {
                this.f12466q0 = this.H0;
            }
        }
        c();
        if (getEndIconMode() == 3) {
            EditText editText3 = this.f12475w;
            if ((editText3 instanceof AutoCompleteTextView) && editText3.getInputType() == 0) {
                getEndIconView().setFocusable(false);
                getEndIconView().setClickable(false);
            } else {
                getEndIconView().setFocusable(true);
                getEndIconView().setClickable(true);
            }
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f12469t.b(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f12469t.c(drawable);
    }

    public void setHint(int i6) {
        setHint(i6 != 0 ? getResources().getText(i6) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.f12471u.g(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f12471u.f12494y.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f12471u.f12494y.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f12471u.j(drawable);
    }

    public void setEndIconDrawable(Drawable drawable) {
        com.google.android.material.textfield.a aVar = this.f12471u;
        TextInputLayout textInputLayout = aVar.s;
        CheckableImageButton checkableImageButton = aVar.f12494y;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            m.a(textInputLayout, checkableImageButton, aVar.C, aVar.D);
            m.c(textInputLayout, checkableImageButton, aVar.C);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements TextWatcher {
        public int s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ EditText f12483t;

        public a(EditText editText) {
            this.f12483t = editText;
            this.s = editText.getLineCount();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.w(!textInputLayout.T0, false);
            if (textInputLayout.D) {
                textInputLayout.p(editable);
            }
            if (textInputLayout.L) {
                textInputLayout.x(editable);
            }
            EditText editText = this.f12483t;
            int lineCount = editText.getLineCount();
            int i6 = this.s;
            if (lineCount != i6) {
                if (lineCount < i6) {
                    int minimumHeight = editText.getMinimumHeight();
                    int i7 = textInputLayout.M0;
                    if (minimumHeight != i7) {
                        editText.setMinimumHeight(i7);
                    }
                }
                this.s = lineCount;
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
        }
    }
}
