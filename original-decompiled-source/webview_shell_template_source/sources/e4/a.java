package e4;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.activity.m;
import com.htmltoapk.template.R;
import f2.d;
import f2.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l.b1;
import l.f;
import n4.j;
import n4.n;
import y5.b0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a extends f {
    public static final int[] Q = {R.attr.state_indeterminate};
    public static final int[] R = {R.attr.state_error};
    public static final int[][] S = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    @SuppressLint({"DiscouragedApi"})
    public static final int T = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public boolean A;
    public boolean B;
    public CharSequence C;
    public Drawable D;
    public Drawable E;
    public boolean F;
    public ColorStateList G;
    public ColorStateList H;
    public PorterDuff.Mode I;
    public int J;
    public int[] K;
    public boolean L;
    public CharSequence M;
    public CompoundButton.OnCheckedChangeListener N;
    public final f2.d O;
    public final C0053a P;

    /* renamed from: w, reason: collision with root package name */
    public final LinkedHashSet<c> f12921w;

    /* renamed from: x, reason: collision with root package name */
    public final LinkedHashSet<b> f12922x;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f12923y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f12924z;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: e4.a$a, reason: collision with other inner class name */
    public class C0053a extends f2.c {
        public C0053a() {
        }

        @Override // f2.c
        public final void a(Drawable drawable) {
            ColorStateList colorStateList = a.this.G;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }

        @Override // f2.c
        public final void b(Drawable drawable) {
            a aVar = a.this;
            ColorStateList colorStateList = aVar.G;
            if (colorStateList != null) {
                drawable.setTint(colorStateList.getColorForState(aVar.K, colorStateList.getDefaultColor()));
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface b {
        void a();
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface c {
        void a();
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new C0054a();
        public int s;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        /* renamed from: e4.a$d$a, reason: collision with other inner class name */
        public class C0054a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                d dVar = new d(parcel);
                dVar.s = ((Integer) parcel.readValue(d.class.getClassLoader())).intValue();
                return dVar;
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i6) {
                return new d[i6];
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" CheckedState=");
            int i6 = this.s;
            return m.e(sb, i6 != 1 ? i6 != 2 ? "unchecked" : "indeterminate" : "checked", "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeValue(Integer.valueOf(this.s));
        }
    }

    public a(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(a5.a.b(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f12921w = new LinkedHashSet<>();
        this.f12922x = new LinkedHashSet<>();
        Context context2 = getContext();
        f2.d dVar = new f2.d(context2, 0);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal<TypedValue> threadLocal = l0.f.f13795a;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        dVar.s = drawable;
        drawable.setCallback(dVar.f12994x);
        new d.c(dVar.s.getConstantState());
        this.O = dVar;
        this.P = new C0053a();
        Context context3 = getContext();
        this.D = getButtonDrawable();
        this.G = getSuperButtonTintList();
        setSupportButtonTintList(null);
        j.a(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        int[] iArr = w3.a.f15077r;
        j.b(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        b1 b1Var = new b1(context3, typedArrayObtainStyledAttributes);
        this.E = b1Var.b(2);
        if (this.D != null && q4.b.b(context3.getTheme(), R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == T && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.D = b0.d(context3, R.drawable.mtrl_checkbox_button);
                this.F = true;
                if (this.E == null) {
                    this.E = b0.d(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.H = q4.c.b(context3, b1Var, 3);
        this.I = n.a(typedArrayObtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f12924z = typedArrayObtainStyledAttributes.getBoolean(11, false);
        this.A = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.B = typedArrayObtainStyledAttributes.getBoolean(9, false);
        this.C = typedArrayObtainStyledAttributes.getText(8);
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            setCheckedState(typedArrayObtainStyledAttributes.getInt(7, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(10)) {
            setRippleColor(q4.c.b(context3, b1Var, 10));
        }
        b1Var.f();
        b();
    }

    private String getButtonStateDescription() {
        int i6 = this.J;
        return i6 == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i6 == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f12923y == null) {
            int iJ = androidx.work.j.j(getContext(), q4.b.d(this, R.attr.colorControlActivated));
            int iJ2 = androidx.work.j.j(getContext(), q4.b.d(this, R.attr.colorError));
            int iJ3 = androidx.work.j.j(getContext(), q4.b.d(this, R.attr.colorSurface));
            int iJ4 = androidx.work.j.j(getContext(), q4.b.d(this, R.attr.colorOnSurface));
            this.f12923y = new ColorStateList(S, new int[]{androidx.work.j.i(1.0f, iJ3, iJ2), androidx.work.j.i(1.0f, iJ3, iJ), androidx.work.j.i(0.54f, iJ3, iJ4), androidx.work.j.i(0.38f, iJ3, iJ4), androidx.work.j.i(0.38f, iJ3, iJ4)});
        }
        return this.f12923y;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.G;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    private void setRippleColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof DrawableWrapper) {
            background = ((DrawableWrapper) background).getDrawable();
        }
        if (background instanceof RippleDrawable) {
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    public final void b() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        e eVar;
        Drawable drawableMutate = this.D;
        ColorStateList colorStateList3 = this.G;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (buttonTintMode != null) {
                drawableMutate.setTintMode(buttonTintMode);
            }
        }
        this.D = drawableMutate;
        Drawable drawableMutate2 = this.E;
        ColorStateList colorStateList4 = this.H;
        PorterDuff.Mode mode = this.I;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                drawableMutate2.setTintMode(mode);
            }
        }
        this.E = drawableMutate2;
        if (this.F) {
            f2.d dVar = this.O;
            if (dVar != null) {
                d.b bVar = dVar.f12990t;
                Drawable drawable = dVar.s;
                C0053a c0053a = this.P;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (c0053a.f12989a == null) {
                        c0053a.f12989a = new f2.b(c0053a);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(c0053a.f12989a);
                }
                ArrayList<f2.c> arrayList = dVar.f12993w;
                if (arrayList != null && c0053a != null) {
                    arrayList.remove(c0053a);
                    if (dVar.f12993w.size() == 0 && (eVar = dVar.f12992v) != null) {
                        bVar.f12996b.removeListener(eVar);
                        dVar.f12992v = null;
                    }
                }
                Drawable drawable2 = dVar.s;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (c0053a.f12989a == null) {
                        c0053a.f12989a = new f2.b(c0053a);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(c0053a.f12989a);
                } else if (c0053a != null) {
                    if (dVar.f12993w == null) {
                        dVar.f12993w = new ArrayList<>();
                    }
                    if (!dVar.f12993w.contains(c0053a)) {
                        dVar.f12993w.add(c0053a);
                        if (dVar.f12992v == null) {
                            dVar.f12992v = new e(0, dVar);
                        }
                        bVar.f12996b.addListener(dVar.f12992v);
                    }
                }
            }
            Drawable drawable3 = this.D;
            if ((drawable3 instanceof AnimatedStateListDrawable) && dVar != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, dVar, false);
                ((AnimatedStateListDrawable) this.D).addTransition(R.id.indeterminate, R.id.unchecked, dVar, false);
            }
        }
        Drawable drawable4 = this.D;
        if (drawable4 != null && (colorStateList2 = this.G) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.E;
        if (drawable5 != null && (colorStateList = this.H) != null) {
            drawable5.setTintList(colorStateList);
        }
        Drawable drawable6 = this.D;
        Drawable drawable7 = this.E;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f6 = intrinsicWidth / intrinsicHeight;
                if (f6 >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f6);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f6 * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.D;
    }

    public Drawable getButtonIconDrawable() {
        return this.E;
    }

    public ColorStateList getButtonIconTintList() {
        return this.H;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.I;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.G;
    }

    public int getCheckedState() {
        return this.J;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.C;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.J == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f12924z && this.G == null && this.H == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i6) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i6 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, Q);
        }
        if (this.B) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, R);
        }
        int i7 = 0;
        while (true) {
            if (i7 >= iArrOnCreateDrawableState.length) {
                iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
                iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
                break;
            }
            int i8 = iArrOnCreateDrawableState[i7];
            if (i8 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
                break;
            }
            if (i8 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i7] = 16842912;
                break;
            }
            i7++;
        }
        this.K = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.A || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (getLayoutDirection() == 1 ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.B) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.C));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        setCheckedState(dVar.s);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.s = getCheckedState();
        return dVar;
    }

    @Override // l.f, android.widget.CompoundButton
    public void setButtonDrawable(int i6) {
        setButtonDrawable(b0.d(getContext(), i6));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.E = drawable;
        b();
    }

    public void setButtonIconDrawableResource(int i6) {
        setButtonIconDrawable(b0.d(getContext(), i6));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.H == colorStateList) {
            return;
        }
        this.H = colorStateList;
        b();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.I == mode) {
            return;
        }
        this.I = mode;
        b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.G == colorStateList) {
            return;
        }
        this.G = colorStateList;
        b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        b();
    }

    public void setCenterIfNoTextEnabled(boolean z6) {
        this.A = z6;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z6) {
        setCheckedState(z6 ? 1 : 0);
    }

    public void setCheckedState(int i6) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.J != i6) {
            this.J = i6;
            super.setChecked(i6 == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.M == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.L) {
                return;
            }
            this.L = true;
            LinkedHashSet<b> linkedHashSet = this.f12922x;
            if (linkedHashSet != null) {
                Iterator<b> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
            if (this.J != 2 && (onCheckedChangeListener = this.N) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.L = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.C = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i6) {
        setErrorAccessibilityLabel(i6 != 0 ? getResources().getText(i6) : null);
    }

    public void setErrorShown(boolean z6) {
        if (this.B == z6) {
            return;
        }
        this.B = z6;
        refreshDrawableState();
        Iterator<c> it = this.f12921w.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.N = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.M = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z6) {
        this.f12924z = z6;
        if (z6) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // l.f, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.D = drawable;
        this.F = false;
        b();
    }
}
