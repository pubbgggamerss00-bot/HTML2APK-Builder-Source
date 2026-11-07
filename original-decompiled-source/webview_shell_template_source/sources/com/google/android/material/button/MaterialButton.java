package com.google.android.material.button;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.camera.core.x;
import androidx.fragment.app.p;
import com.google.android.material.button.MaterialButton;
import d1.f;
import java.util.Iterator;
import java.util.LinkedHashSet;
import n4.j;
import n4.n;
import u4.g;
import u4.k;
import u4.o;
import u4.q;
import u4.r;
import y5.b0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class MaterialButton extends l.e implements Checkable, o {

    /* renamed from: i0, reason: collision with root package name */
    public static final int[] f12105i0 = {R.attr.state_checkable};

    /* renamed from: j0, reason: collision with root package name */
    public static final int[] f12106j0 = {R.attr.state_checked};

    /* renamed from: k0, reason: collision with root package name */
    public static final a f12107k0 = new a();
    public Drawable A;
    public PorterDuff.Mode B;
    public ColorStateList C;
    public Drawable D;
    public boolean E;
    public String F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public int Q;
    public float R;
    public int S;
    public int T;
    public LinearLayout.LayoutParams U;
    public boolean V;
    public int W;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f12108a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f12109b0;

    /* renamed from: c0, reason: collision with root package name */
    public r f12110c0;

    /* renamed from: d0, reason: collision with root package name */
    public int f12111d0;

    /* renamed from: e0, reason: collision with root package name */
    public e f12112e0;

    /* renamed from: f0, reason: collision with root package name */
    public float f12113f0;

    /* renamed from: g0, reason: collision with root package name */
    public float f12114g0;

    /* renamed from: h0, reason: collision with root package name */
    public d1.e f12115h0;

    /* renamed from: v, reason: collision with root package name */
    public final c4.e f12116v;

    /* renamed from: w, reason: collision with root package name */
    public final LinkedHashSet<b> f12117w;

    /* renamed from: x, reason: collision with root package name */
    public c f12118x;

    /* renamed from: y, reason: collision with root package name */
    public PorterDuff.Mode f12119y;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f12120z;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a extends p {
        @Override // androidx.fragment.app.p
        public final float c(o oVar) {
            return ((MaterialButton) oVar).getDisplayedWidthIncrease();
        }

        @Override // androidx.fragment.app.p
        public final void h(o oVar, float f6) {
            ((MaterialButton) oVar).setDisplayedWidthIncrease(f6);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface b {
        void a();
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface c {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class d extends b1.a {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: u, reason: collision with root package name */
        public boolean f12121u;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public class a implements Parcelable.ClassLoaderCreator<d> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i6) {
                return new d[i6];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new d(parcel, null);
            }
        }

        public d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                d.class.getClassLoader();
            }
            this.f12121u = parcel.readInt() == 1;
        }

        @Override // b1.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeInt(this.f12121u ? 1 : 0);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class e {
        public static final e s;

        /* renamed from: t, reason: collision with root package name */
        public static final e f12122t;

        /* renamed from: u, reason: collision with root package name */
        public static final e f12123u;

        /* renamed from: v, reason: collision with root package name */
        public static final e f12124v;

        /* renamed from: w, reason: collision with root package name */
        public static final /* synthetic */ e[] f12125w;

        static {
            e eVar = new e("NONE", 0);
            s = eVar;
            e eVar2 = new e("START", 1);
            f12122t = eVar2;
            e eVar3 = new e("END", 2);
            f12123u = eVar3;
            e eVar4 = new e("BOTH", 3);
            f12124v = eVar4;
            f12125w = new e[]{eVar, eVar2, eVar3, eVar4};
        }

        public e() {
            throw null;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f12125w.clone();
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(a5.a.a(com.htmltoapk.template.R.attr.materialButtonStyle, com.htmltoapk.template.R.style.Widget_MaterialComponents_Button, context, attributeSet, new int[]{com.htmltoapk.template.R.attr.materialSizeOverlay}), attributeSet, com.htmltoapk.template.R.attr.materialButtonStyle);
        this.f12117w = new LinkedHashSet<>();
        this.M = false;
        this.N = false;
        this.Q = Integer.MIN_VALUE;
        this.R = -2.1474836E9f;
        this.S = Integer.MIN_VALUE;
        this.T = Integer.MIN_VALUE;
        this.f12109b0 = Integer.MIN_VALUE;
        this.f12112e0 = e.f12124v;
        Context context2 = getContext();
        TypedArray typedArrayD = j.d(context2, attributeSet, w3.a.f15071l, com.htmltoapk.template.R.attr.materialButtonStyle, com.htmltoapk.template.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.J = typedArrayD.getDimensionPixelSize(13, 0);
        int i6 = typedArrayD.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f12119y = n.a(i6, mode);
        this.f12120z = q4.c.a(getContext(), typedArrayD, 15);
        this.A = q4.c.c(getContext(), typedArrayD, 11);
        this.O = typedArrayD.getInteger(12, 1);
        this.G = typedArrayD.getDimensionPixelSize(14, 0);
        this.B = n.a(typedArrayD.getInt(22, -1), mode);
        this.C = typedArrayD.hasValue(21) ? q4.c.a(getContext(), typedArrayD, 21) : this.f12120z;
        this.P = typedArrayD.getInteger(20, 3);
        Drawable drawableC = q4.c.c(getContext(), typedArrayD, 19);
        this.D = drawableC;
        this.E = drawableC == null;
        u4.j jVarG = q.g(context2, typedArrayD, 23);
        jVarG = jVarG == null ? k.f(context2, attributeSet, com.htmltoapk.template.R.attr.materialButtonStyle, com.htmltoapk.template.R.style.Widget_MaterialComponents_Button).a() : jVarG;
        boolean z6 = typedArrayD.getBoolean(17, false);
        c4.e eVar = new c4.e(this, jVarG);
        this.f12116v = eVar;
        eVar.f2199e = typedArrayD.getDimensionPixelOffset(2, 0);
        eVar.f2200f = typedArrayD.getDimensionPixelOffset(3, 0);
        eVar.f2201g = typedArrayD.getDimensionPixelOffset(4, 0);
        eVar.h = typedArrayD.getDimensionPixelOffset(5, 0);
        if (typedArrayD.hasValue(9)) {
            int dimensionPixelSize = typedArrayD.getDimensionPixelSize(9, -1);
            eVar.f2202i = dimensionPixelSize;
            eVar.f2196b = eVar.f2196b.a(dimensionPixelSize);
            eVar.d();
            eVar.f2211r = true;
        }
        eVar.f2203j = typedArrayD.getDimensionPixelSize(26, 0);
        eVar.f2204k = n.a(typedArrayD.getInt(8, -1), mode);
        eVar.f2205l = q4.c.a(getContext(), typedArrayD, 7);
        eVar.f2206m = q4.c.a(getContext(), typedArrayD, 25);
        eVar.f2207n = q4.c.a(getContext(), typedArrayD, 18);
        eVar.s = typedArrayD.getBoolean(6, false);
        eVar.f2214v = typedArrayD.getDimensionPixelSize(10, 0);
        eVar.f2212t = typedArrayD.getBoolean(27, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayD.hasValue(0)) {
            eVar.f2210q = true;
            setSupportBackgroundTintList(eVar.f2205l);
            setSupportBackgroundTintMode(eVar.f2204k);
        } else {
            eVar.c();
        }
        setPaddingRelative(paddingStart + eVar.f2199e, paddingTop + eVar.f2201g, paddingEnd + eVar.f2200f, paddingBottom + eVar.h);
        setCheckedInternal(typedArrayD.getBoolean(1, false));
        if (jVarG instanceof q) {
            eVar.f2197c = f();
            if (eVar.f2196b instanceof q) {
                eVar.d();
            }
        }
        setOpticalCenterEnabled(z6);
        typedArrayD.recycle();
        setCompoundDrawablePadding(this.J);
        u(this.A != null);
        x(this.D != null);
    }

    public static /* synthetic */ void a(MaterialButton materialButton) {
        materialButton.W = materialButton.getOpticalCenterShift();
        materialButton.w();
        materialButton.invalidate();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.f12113f0;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        g gVarA;
        if (this.V && this.f12108a0 && (gVarA = this.f12116v.a(false)) != null) {
            return (int) (gVarA.i() * 0.11f);
        }
        return 0;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i6 = 0; i6 < lineCount; i6++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i6));
        }
        return (int) Math.ceil(fMax);
    }

    private void setCheckedInternal(boolean z6) {
        if (!k() || this.M == z6) {
            return;
        }
        this.M = z6;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z7 = this.M;
            if (!materialButtonToggleGroup.N) {
                materialButtonToggleGroup.n(getId(), z7);
            }
        }
        if (this.N) {
            return;
        }
        this.N = true;
        Iterator<b> it = this.f12117w.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.N = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f6) {
        if (this.f12113f0 != f6) {
            this.f12113f0 = f6;
            w();
            invalidate();
            if (getParent() instanceof com.google.android.material.button.a) {
                com.google.android.material.button.a aVar = (com.google.android.material.button.a) getParent();
                int i6 = (int) this.f12113f0;
                int iIndexOfChild = aVar.indexOfChild(this);
                if (iIndexOfChild < 0) {
                    return;
                }
                MaterialButton materialButtonH = aVar.h(iIndexOfChild);
                MaterialButton materialButtonG = aVar.g(iIndexOfChild);
                if (materialButtonH == null && materialButtonG == null) {
                    return;
                }
                if (materialButtonH == null) {
                    materialButtonG.setDisplayedWidthDecrease(i6);
                }
                if (materialButtonG == null) {
                    materialButtonH.setDisplayedWidthDecrease(i6);
                }
                if (materialButtonH == null || materialButtonG == null) {
                    return;
                }
                materialButtonH.setDisplayedWidthDecrease(i6 / 2);
                materialButtonG.setDisplayedWidthDecrease((i6 + 1) / 2);
            }
        }
    }

    public final boolean d() {
        if (m() && p()) {
            return true;
        }
        if (l() && o()) {
            return true;
        }
        return n() && q();
    }

    public final boolean e(int i6) {
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        return i6 == 1 || i6 == 3 || (i6 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i6 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE);
    }

    public final f f() {
        Context context = getContext();
        TypedValue typedValueA = q4.b.a(context.getTheme(), com.htmltoapk.template.R.attr.motionSpringFastSpatial);
        int[] iArr = w3.a.f15080v;
        TypedArray typedArrayObtainStyledAttributes = typedValueA == null ? context.obtainStyledAttributes(null, iArr, 0, com.htmltoapk.template.R.style.Motion_Material3_Spring_Standard_Fast_Spatial) : context.obtainStyledAttributes(typedValueA.resourceId, iArr);
        f fVar = new f();
        try {
            float f6 = typedArrayObtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f6 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f7 = typedArrayObtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f7 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            if (f6 <= 0.0f) {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
            fVar.f12698a = Math.sqrt(f6);
            fVar.f12700c = false;
            if (f7 < 0.0f) {
                throw new IllegalArgumentException("Damping ratio must be non-negative");
            }
            fVar.f12699b = f7;
            fVar.f12700c = false;
            typedArrayObtainStyledAttributes.recycle();
            return fVar;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final int g(int i6, int i7) {
        int intrinsicWidth;
        int intrinsicWidth2;
        Drawable drawable = this.A;
        if (drawable != null) {
            intrinsicWidth = this.G;
            if (intrinsicWidth == 0) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
        } else {
            intrinsicWidth = 0;
        }
        Drawable drawable2 = this.D;
        if (drawable2 != null) {
            intrinsicWidth2 = this.G;
            if (intrinsicWidth2 == 0) {
                intrinsicWidth2 = drawable2.getIntrinsicWidth();
            }
        } else {
            intrinsicWidth2 = 0;
        }
        int textLayoutWidth = (((((i6 - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - intrinsicWidth2) - this.J) - getPaddingStart();
        if (getActualTextAlignment() == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        return (getLayoutDirection() == 1) != (i7 == 4) ? -textLayoutWidth : textLayoutWidth;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.F)) {
            return (k() ? CompoundButton.class : Button.class).getName();
        }
        return this.F;
    }

    public int getAllowedWidthDecrease() {
        return this.f12109b0;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (r()) {
            return this.f12116v.f2202i;
        }
        return 0;
    }

    public f getCornerSpringForce() {
        return this.f12116v.f2197c;
    }

    public Drawable getIcon() {
        return this.A;
    }

    public int getIconGravity() {
        return this.O;
    }

    public int getIconPadding() {
        return this.J;
    }

    public int getIconSize() {
        return this.G;
    }

    public ColorStateList getIconTint() {
        return this.f12120z;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f12119y;
    }

    public int getInsetBottom() {
        return this.f12116v.h;
    }

    public int getInsetLeft() {
        return this.f12116v.f2199e;
    }

    public int getInsetRight() {
        return this.f12116v.f2200f;
    }

    public int getInsetTop() {
        return this.f12116v.f2201g;
    }

    public ColorStateList getRippleColor() {
        if (r()) {
            return this.f12116v.f2207n;
        }
        return null;
    }

    public Drawable getSecondaryIcon() {
        return this.D;
    }

    public int getSecondaryIconGravity() {
        return this.P;
    }

    public ColorStateList getSecondaryIconTint() {
        return this.C;
    }

    public PorterDuff.Mode getSecondaryIconTintMode() {
        return this.B;
    }

    public u4.j getShapeAppearance() {
        if (r()) {
            return this.f12116v.f2196b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearance from a MaterialButton which has an overwritten background.");
    }

    public k getShapeAppearanceModel() {
        if (r()) {
            return this.f12116v.f2196b.c();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (r()) {
            return this.f12116v.f2206m;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (r()) {
            return this.f12116v.f2203j;
        }
        return 0;
    }

    @Override // l.e
    public ColorStateList getSupportBackgroundTintList() {
        return r() ? this.f12116v.f2205l : super.getSupportBackgroundTintList();
    }

    @Override // l.e
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return r() ? this.f12116v.f2204k : super.getSupportBackgroundTintMode();
    }

    public final int h(int i6, int i7) {
        return Math.max(0, (((((i6 - getTextHeight()) - getPaddingTop()) - i7) - this.J) - getPaddingBottom()) / 2);
    }

    public final Drawable i(int i6) {
        if (i6 == 0) {
            if (this.D == null || !p()) {
                return null;
            }
            return this.D;
        }
        if (i6 == 1) {
            if (this.D == null || !q()) {
                return null;
            }
            return this.D;
        }
        if (i6 == 2 && this.D != null && o()) {
            return this.D;
        }
        return null;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.M;
    }

    public final Drawable j(int i6) {
        if (i6 == 0) {
            if (this.A == null || !m()) {
                return null;
            }
            return this.A;
        }
        if (i6 == 1) {
            if (this.A == null || !l()) {
                return null;
            }
            return this.A;
        }
        if (i6 == 2 && this.A != null && l()) {
            return this.A;
        }
        return null;
    }

    public final boolean k() {
        c4.e eVar = this.f12116v;
        return eVar != null && eVar.s;
    }

    public final boolean l() {
        int i6 = this.O;
        return i6 == 3 || i6 == 4;
    }

    public final boolean m() {
        int i6 = this.O;
        return i6 == 1 || i6 == 2;
    }

    public final boolean n() {
        int i6 = this.O;
        return i6 == 16 || i6 == 32;
    }

    public final boolean o() {
        int i6 = this.P;
        return i6 == 3 || i6 == 4;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (r()) {
            a1.a.g(this, this.f12116v.a(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i6) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i6 + 2);
        if (k()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f12105i0);
        }
        if (this.M) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f12106j0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // l.e, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.M);
    }

    @Override // l.e, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(k());
        accessibilityNodeInfo.setChecked(this.M);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // l.e, android.widget.TextView, android.view.View
    public final void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
        int i10;
        super.onLayout(z6, i6, i7, i8, i9);
        v(getMeasuredWidth(), getMeasuredHeight());
        y(getMeasuredWidth(), getMeasuredHeight());
        int i11 = getResources().getConfiguration().orientation;
        if (this.Q != i11) {
            this.Q = i11;
            this.R = -2.1474836E9f;
        }
        if (this.R == -2.1474836E9f) {
            this.R = getMeasuredWidth();
            if (this.U == null && (getParent() instanceof com.google.android.material.button.a) && ((com.google.android.material.button.a) getParent()).getButtonSizeChange() != null) {
                this.U = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.U);
                layoutParams.width = (int) this.R;
                setLayoutParams(layoutParams);
            }
        }
        boolean z7 = false;
        if (this.f12109b0 == Integer.MIN_VALUE) {
            if (this.A == null) {
                i10 = 0;
            } else {
                int iconPadding = getIconPadding();
                int intrinsicWidth = this.G;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.A.getIntrinsicWidth();
                }
                i10 = iconPadding + intrinsicWidth;
            }
            this.f12109b0 = (getMeasuredWidth() - getTextLayoutWidth()) - i10;
        }
        if (this.S == Integer.MIN_VALUE) {
            this.S = getPaddingStart();
        }
        if (this.T == Integer.MIN_VALUE) {
            this.T = getPaddingEnd();
        }
        if ((getParent() instanceof com.google.android.material.button.a) && ((com.google.android.material.button.a) getParent()).getOrientation() == 0) {
            z7 = true;
        }
        this.f12108a0 = z7;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.s);
        setChecked(dVar.f12121u);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f12121u = this.M;
        return dVar;
    }

    @Override // l.e, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
        super.onTextChanged(charSequence, i6, i7, i8);
        v(getMeasuredWidth(), getMeasuredHeight());
        y(getMeasuredWidth(), getMeasuredHeight());
    }

    public final boolean p() {
        int i6 = this.P;
        return i6 == 1 || i6 == 2;
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean z6;
        if (isEnabled() && this.f12116v.f2212t) {
            toggle();
            z6 = true;
        } else {
            z6 = false;
        }
        boolean zPerformClick = super.performClick();
        if (z6 && !zPerformClick) {
            playSoundEffect(0);
        }
        return zPerformClick;
    }

    public final boolean q() {
        int i6 = this.P;
        return i6 == 16 || i6 == 32;
    }

    public final boolean r() {
        c4.e eVar = this.f12116v;
        return (eVar == null || eVar.f2210q) ? false : true;
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.A != null) {
            if (this.A.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(boolean z6) {
        int i6;
        if (this.f12110c0 == null) {
            return;
        }
        if (this.f12115h0 == null) {
            d1.e eVar = new d1.e(this, f12107k0);
            this.f12115h0 = eVar;
            eVar.f12696q = f();
        }
        if (!this.f12108a0) {
            return;
        }
        int iOrdinal = this.f12112e0.ordinal();
        int i7 = 0;
        int i8 = (iOrdinal == 1 || iOrdinal == 2) ? this.f12111d0 / 2 : iOrdinal != 3 ? 0 : this.f12111d0;
        r rVar = this.f12110c0;
        int[] drawableState = getDrawableState();
        int[][] iArr = rVar.f14713c;
        int i9 = 0;
        while (true) {
            i6 = -1;
            if (i9 >= rVar.f14711a) {
                i9 = -1;
                break;
            } else if (StateSet.stateSetMatches(iArr[i9], drawableState)) {
                break;
            } else {
                i9++;
            }
        }
        if (i9 < 0) {
            int[] iArr2 = StateSet.WILD_CARD;
            int[][] iArr3 = rVar.f14713c;
            int i10 = 0;
            while (true) {
                if (i10 >= rVar.f14711a) {
                    break;
                }
                if (StateSet.stateSetMatches(iArr3[i10], iArr2)) {
                    i6 = i10;
                    break;
                }
                i10++;
            }
            i9 = i6;
        }
        r.b bVar = (i9 < 0 ? rVar.f14712b : rVar.f14714d[i9]).f14715a;
        int width = getWidth();
        float f6 = bVar.f14717b;
        r.c cVar = bVar.f14716a;
        if (cVar != r.c.s) {
            if (cVar == r.c.f14718t) {
            }
            this.f12115h0.d(Math.min(i8, i7));
            if (z6) {
                return;
            }
            this.f12115h0.e();
            return;
        }
        f6 *= width;
        i7 = (int) f6;
        this.f12115h0.d(Math.min(i8, i7));
        if (z6) {
        }
    }

    public void setA11yClassName(String str) {
        this.F = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i6) {
        if (!r()) {
            super.setBackgroundColor(i6);
            return;
        }
        c4.e eVar = this.f12116v;
        if (eVar.a(false) != null) {
            eVar.a(false).setTint(i6);
        }
    }

    @Override // l.e, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!r()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        c4.e eVar = this.f12116v;
        eVar.f2210q = true;
        MaterialButton materialButton = eVar.f2195a;
        materialButton.setSupportBackgroundTintList(eVar.f2205l);
        materialButton.setSupportBackgroundTintMode(eVar.f2204k);
        super.setBackgroundDrawable(drawable);
    }

    @Override // l.e, android.view.View
    public void setBackgroundResource(int i6) {
        setBackgroundDrawable(i6 != 0 ? b0.d(getContext(), i6) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z6) {
        if (r()) {
            this.f12116v.s = z6;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z6) {
        setCheckedInternal(z6);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablePadding(int i6) {
        if (getCompoundDrawablePadding() != i6) {
            this.R = -2.1474836E9f;
        }
        super.setCompoundDrawablePadding(i6);
    }

    public void setCornerRadius(int i6) {
        if (r()) {
            c4.e eVar = this.f12116v;
            if (eVar.f2211r && eVar.f2202i == i6) {
                return;
            }
            eVar.f2202i = i6;
            eVar.f2211r = true;
            eVar.f2196b = eVar.f2196b.a(i6);
            eVar.d();
        }
    }

    public void setCornerRadiusResource(int i6) {
        if (r()) {
            setCornerRadius(getResources().getDimensionPixelSize(i6));
        }
    }

    public void setCornerSpringForce(f fVar) {
        c4.e eVar = this.f12116v;
        eVar.f2197c = fVar;
        if (eVar.f2196b instanceof q) {
            eVar.d();
        }
    }

    public void setDisplayedWidthDecrease(int i6) {
        this.f12114g0 = Math.min(i6, this.f12109b0);
        w();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        if (r()) {
            this.f12116v.a(false).q(f6);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.A == drawable || t(new x(6, this, drawable))) {
            return;
        }
        this.R = -2.1474836E9f;
        this.A = drawable;
        u(true);
        v(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setIconGravity(int i6) {
        if (this.O != i6) {
            if (this.A != null && this.D != null && d()) {
                throw new IllegalArgumentException("iconGravity cannot have the same alignment as secondaryIconGravity");
            }
            this.O = i6;
            v(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i6) {
        if (this.J != i6) {
            this.J = i6;
            setCompoundDrawablePadding(i6);
        }
    }

    public void setIconResource(int i6) {
        setIcon(i6 != 0 ? b0.d(getContext(), i6) : null);
    }

    public void setIconSize(final int i6) {
        if (i6 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.G == i6 || t(new Runnable() { // from class: c4.a
            @Override // java.lang.Runnable
            public final void run() {
                int[] iArr = MaterialButton.f12105i0;
                this.s.setIconSize(i6);
            }
        })) {
            return;
        }
        this.R = -2.1474836E9f;
        this.G = i6;
        u(true);
        x(true);
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f12120z != colorStateList) {
            this.f12120z = colorStateList;
            u(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f12119y != mode) {
            this.f12119y = mode;
            u(false);
        }
    }

    public void setIconTintResource(int i6) {
        setIconTint(k0.a.b(getContext(), i6));
    }

    public void setInsetBottom(int i6) {
        c4.e eVar = this.f12116v;
        eVar.b(eVar.f2199e, eVar.f2201g, eVar.f2200f, i6);
    }

    public void setInsetLeft(int i6) {
        c4.e eVar = this.f12116v;
        eVar.b(i6, eVar.f2201g, eVar.f2200f, eVar.h);
    }

    public void setInsetRight(int i6) {
        c4.e eVar = this.f12116v;
        eVar.b(eVar.f2199e, eVar.f2201g, i6, eVar.h);
    }

    public void setInsetTop(int i6) {
        c4.e eVar = this.f12116v;
        eVar.b(eVar.f2199e, i6, eVar.f2200f, eVar.h);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(c cVar) {
        this.f12118x = cVar;
    }

    public void setOpticalCenterEnabled(boolean z6) {
        if (this.V != z6) {
            this.V = z6;
            c4.e eVar = this.f12116v;
            if (z6) {
                androidx.camera.core.streamsharing.c cVar = new androidx.camera.core.streamsharing.c(2, this);
                eVar.f2198d = cVar;
                g gVarA = eVar.a(false);
                if (gVarA != null) {
                    gVarA.W = cVar;
                }
            } else {
                eVar.f2198d = null;
                g gVarA2 = eVar.a(false);
                if (gVarA2 != null) {
                    gVarA2.W = null;
                }
            }
            post(new androidx.activity.j(3, this));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z6) {
        c cVar = this.f12118x;
        if (cVar != null) {
            com.google.android.material.button.a.this.invalidate();
        }
        super.setPressed(z6);
        s(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (r()) {
            c4.e eVar = this.f12116v;
            MaterialButton materialButton = eVar.f2195a;
            if (eVar.f2207n != colorStateList) {
                eVar.f2207n = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(r4.a.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i6) {
        if (r()) {
            setRippleColor(k0.a.b(getContext(), i6));
        }
    }

    public void setSecondaryIcon(Drawable drawable) {
        if (this.D == drawable || t(new androidx.camera.core.e(4, this, drawable))) {
            return;
        }
        this.R = -2.1474836E9f;
        this.D = drawable;
        this.E = false;
        x(true);
        y(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setSecondaryIconGravity(int i6) {
        if (this.P != i6) {
            if (this.D != null && this.A != null && d()) {
                throw new IllegalArgumentException("secondaryIconGravity cannot have the same alignment as iconGravity");
            }
            this.P = i6;
            y(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setSecondaryIconResource(int i6) {
        setSecondaryIcon(i6 != 0 ? b0.d(getContext(), i6) : null);
    }

    public void setSecondaryIconTint(ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            x(false);
        }
    }

    public void setSecondaryIconTintMode(PorterDuff.Mode mode) {
        if (this.B != mode) {
            this.B = mode;
            x(false);
        }
    }

    public void setSecondaryIconTintResource(int i6) {
        setSecondaryIconTint(k0.a.b(getContext(), i6));
    }

    public void setShapeAppearance(u4.j jVar) {
        if (!r()) {
            throw new IllegalStateException("Attempted to set ShapeAppearance on a MaterialButton which has an overwritten background.");
        }
        c4.e eVar = this.f12116v;
        if (eVar.f2197c == null && jVar.e()) {
            eVar.f2197c = f();
            if (eVar.f2196b instanceof q) {
                eVar.d();
            }
        }
        eVar.f2196b = jVar;
        eVar.d();
    }

    @Override // u4.o
    public void setShapeAppearanceModel(k kVar) {
        if (!r()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        c4.e eVar = this.f12116v;
        eVar.f2196b = kVar;
        eVar.d();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z6) {
        if (r()) {
            c4.e eVar = this.f12116v;
            eVar.f2209p = z6;
            eVar.e();
        }
    }

    public void setSizeChange(r rVar) {
        if (this.f12110c0 != rVar) {
            this.f12110c0 = rVar;
            s(true);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (r()) {
            c4.e eVar = this.f12116v;
            if (eVar.f2206m != colorStateList) {
                eVar.f2206m = colorStateList;
                eVar.e();
            }
        }
    }

    public void setStrokeColorResource(int i6) {
        if (r()) {
            setStrokeColor(k0.a.b(getContext(), i6));
        }
    }

    public void setStrokeWidth(int i6) {
        if (r()) {
            c4.e eVar = this.f12116v;
            if (eVar.f2203j != i6) {
                eVar.f2203j = i6;
                eVar.e();
            }
        }
    }

    public void setStrokeWidthResource(int i6) {
        if (r()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i6));
        }
    }

    @Override // l.e
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!r()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        c4.e eVar = this.f12116v;
        if (eVar.f2205l != colorStateList) {
            eVar.f2205l = colorStateList;
            if (eVar.a(false) != null) {
                eVar.a(false).setTintList(eVar.f2205l);
            }
        }
    }

    @Override // l.e
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!r()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        c4.e eVar = this.f12116v;
        if (eVar.f2204k != mode) {
            eVar.f2204k = mode;
            if (eVar.a(false) == null || eVar.f2204k == null) {
                return;
            }
            eVar.a(false).setTintMode(eVar.f2204k);
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.R = -2.1474836E9f;
        super.setText(charSequence, bufferType);
    }

    @Override // android.view.View
    public void setTextAlignment(int i6) {
        super.setTextAlignment(i6);
        v(getMeasuredWidth(), getMeasuredHeight());
        y(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // l.e, android.widget.TextView
    public final void setTextAppearance(Context context, int i6) {
        this.R = -2.1474836E9f;
        super.setTextAppearance(context, i6);
    }

    @Override // l.e, android.widget.TextView
    public final void setTextSize(int i6, float f6) {
        this.R = -2.1474836E9f;
        super.setTextSize(i6, f6);
    }

    public void setToggleCheckedStateOnClick(boolean z6) {
        this.f12116v.f2212t = z6;
    }

    @Override // android.widget.TextView
    public void setWidth(int i6) {
        this.R = -2.1474836E9f;
        super.setWidth(i6);
    }

    public void setWidthChangeDirection(e eVar) {
        if (this.f12112e0 != eVar) {
            this.f12112e0 = eVar;
            s(true);
        }
    }

    public void setWidthChangeMax(int i6) {
        if (this.f12111d0 != i6) {
            this.f12111d0 = i6;
            s(true);
        }
    }

    public final boolean t(Runnable runnable) {
        d1.e eVar = this.f12115h0;
        if (eVar == null || !eVar.f12689e) {
            return false;
        }
        post(new androidx.camera.core.j(2, this, runnable));
        return true;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.M);
    }

    public final void u(boolean z6) {
        Drawable drawable = this.A;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.A = drawableMutate;
            drawableMutate.setTintList(this.f12120z);
            PorterDuff.Mode mode = this.f12119y;
            if (mode != null) {
                this.A.setTintMode(mode);
            }
            int intrinsicWidth = this.G;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.A.getIntrinsicWidth();
            }
            int intrinsicHeight = this.G;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.A.getIntrinsicHeight();
            }
            Drawable drawable2 = this.A;
            int i6 = this.H;
            int i7 = this.I;
            drawable2.setBounds(i6, i7, intrinsicWidth + i6, intrinsicHeight + i7);
            this.A.setVisible(true, z6);
        }
        if (this.A != null && this.D != null && d()) {
            throw new IllegalArgumentException("iconGravity cannot have the same alignment as secondaryIconGravity");
        }
        if (this.A == null && this.D != null && d()) {
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z7 = (m() && compoundDrawablesRelative[0] != this.A) || (l() && compoundDrawablesRelative[2] != this.A) || (n() && compoundDrawablesRelative[1] != this.A);
        if (z6 || z7) {
            if (m()) {
                setCompoundDrawablesRelative(this.A, i(1), i(2), null);
            } else if (l()) {
                setCompoundDrawablesRelative(i(0), i(1), this.A, null);
            } else if (n()) {
                setCompoundDrawablesRelative(i(0), this.A, i(2), null);
            }
        }
    }

    public final void v(int i6, int i7) {
        if (this.A == null || getLayout() == null) {
            return;
        }
        if (m() || l()) {
            this.I = 0;
            if (e(this.O)) {
                this.H = 0;
                u(false);
                return;
            }
            int iG = g(i6, this.O);
            if (this.H != iG) {
                this.H = iG;
                u(false);
                return;
            }
            return;
        }
        if (n()) {
            this.H = 0;
            if (this.O == 16) {
                this.I = 0;
                u(false);
                return;
            }
            int intrinsicHeight = this.G;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.A.getIntrinsicHeight();
            }
            int iH = h(i7, intrinsicHeight);
            if (this.I != iH) {
                this.I = iH;
                u(false);
            }
        }
    }

    public final void w() {
        int i6 = (int) (this.f12113f0 - this.f12114g0);
        int i7 = (i6 / 2) + (getLayoutDirection() == 1 ? -this.W : this.W);
        if (getLayoutParams() != null) {
            getLayoutParams().width = (int) (this.R + i6);
        }
        setPaddingRelative(this.S + i7, getPaddingTop(), (this.T + i6) - i7, getPaddingBottom());
    }

    public final void x(boolean z6) {
        Drawable drawable = this.D;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.D = drawableMutate;
            drawableMutate.setTintList(this.C);
            PorterDuff.Mode mode = this.B;
            if (mode != null) {
                this.D.setTintMode(mode);
            }
            int intrinsicWidth = this.G;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.D.getIntrinsicWidth();
            }
            int intrinsicHeight = this.G;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.D.getIntrinsicHeight();
            }
            Drawable drawable2 = this.D;
            int i6 = this.K;
            int i7 = this.L;
            drawable2.setBounds(i6, i7, intrinsicWidth + i6, intrinsicHeight + i7);
            this.D.setVisible(true, z6);
        }
        if (this.D != null && this.A != null && d()) {
            throw new IllegalArgumentException("secondaryIconGravity cannot have the same alignment as iconGravity");
        }
        if (this.D == null) {
            if (this.E) {
                return;
            }
            if (this.A != null && d()) {
                return;
            }
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z7 = (p() && compoundDrawablesRelative[0] != this.D) || (o() && compoundDrawablesRelative[2] != this.D) || (q() && compoundDrawablesRelative[1] != this.D);
        if (z6 || z7) {
            if (p()) {
                setCompoundDrawablesRelative(this.D, j(1), j(2), null);
            } else if (o()) {
                setCompoundDrawablesRelative(j(0), j(1), this.D, null);
            } else if (q()) {
                setCompoundDrawablesRelative(j(0), this.D, j(2), null);
            }
        }
    }

    public final void y(int i6, int i7) {
        if (this.D == null || getLayout() == null) {
            return;
        }
        if (p() || o()) {
            this.L = 0;
            if (e(this.P)) {
                this.K = 0;
                x(false);
                return;
            }
            int iG = g(i6, this.P);
            if (this.K != iG) {
                this.K = iG;
                x(false);
                return;
            }
            return;
        }
        if (q()) {
            this.K = 0;
            if (this.P == 16) {
                this.L = 0;
                x(false);
                return;
            }
            int intrinsicHeight = this.G;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.D.getIntrinsicHeight();
            }
            int iH = h(i7, intrinsicHeight);
            if (this.L != iH) {
                this.L = iH;
                x(false);
            }
        }
    }
}
