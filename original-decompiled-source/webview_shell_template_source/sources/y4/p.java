package y4;

import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import java.util.Locale;
import l.m0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class p extends l.c {
    public final int A;
    public final float B;
    public ColorStateList C;
    public int D;
    public ColorStateList E;

    /* renamed from: w, reason: collision with root package name */
    public final m0 f15303w;

    /* renamed from: x, reason: collision with root package name */
    public final AccessibilityManager f15304x;

    /* renamed from: y, reason: collision with root package name */
    public final int[] f15305y;

    /* renamed from: z, reason: collision with root package name */
    public final Rect f15306z;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a<T> extends ArrayAdapter<String> {
        public ColorStateList s;

        /* renamed from: t, reason: collision with root package name */
        public ColorStateList f15307t;

        public a(Context context, int i6, String[] strArr) {
            super(context, i6, strArr);
            b();
        }

        public final void b() {
            ColorStateList colorStateList;
            p pVar = p.this;
            ColorStateList colorStateList2 = pVar.E;
            ColorStateList colorStateList3 = null;
            if (colorStateList2 != null) {
                int[] iArr = {R.attr.state_pressed};
                colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
            } else {
                colorStateList = null;
            }
            this.f15307t = colorStateList;
            if (pVar.D != 0 && pVar.E != null) {
                int[] iArr2 = {R.attr.state_hovered, -16842919};
                int[] iArr3 = {R.attr.state_selected, -16842919};
                colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{m0.a.c(pVar.E.getColorForState(iArr3, 0), pVar.D), m0.a.c(pVar.E.getColorForState(iArr2, 0), pVar.D), pVar.D});
            }
            this.s = colorStateList3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final View getView(int i6, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i6, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                p pVar = p.this;
                ColorDrawable colorDrawable = null;
                if (pVar.getText().toString().contentEquals(textView.getText()) && pVar.D != 0) {
                    ColorDrawable colorDrawable2 = new ColorDrawable(pVar.D);
                    if (this.f15307t != null) {
                        colorDrawable2.setTintList(this.s);
                        RippleDrawable rippleDrawable = new RippleDrawable(this.f15307t, colorDrawable2, null);
                        FocusRingDrawable focusRingDrawableE = FocusRingDrawable.e(getContext(), rippleDrawable, null);
                        if (focusRingDrawableE != null) {
                            focusRingDrawableE.G.f12386x = pVar.f15305y;
                        }
                        colorDrawable = rippleDrawable;
                    } else {
                        colorDrawable = colorDrawable2;
                    }
                }
                textView.setBackground(colorDrawable);
            }
            return view2;
        }
    }

    public p(Context context, AttributeSet attributeSet) {
        super(a5.a.b(context, attributeSet, com.htmltoapk.template.R.attr.autoCompleteTextViewStyle, 0), attributeSet, 0);
        this.f15305y = new int[]{R.attr.state_selected};
        this.f15306z = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayD = n4.j.d(context2, attributeSet, w3.a.f15070k, com.htmltoapk.template.R.attr.autoCompleteTextViewStyle, com.htmltoapk.template.R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayD.hasValue(0) && typedArrayD.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.A = typedArrayD.getResourceId(3, com.htmltoapk.template.R.layout.mtrl_auto_complete_simple_item);
        this.B = typedArrayD.getDimensionPixelOffset(1, com.htmltoapk.template.R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (typedArrayD.hasValue(2)) {
            this.C = ColorStateList.valueOf(typedArrayD.getColor(2, 0));
        }
        this.D = typedArrayD.getColor(4, 0);
        this.E = q4.c.a(context2, typedArrayD, 5);
        this.f15304x = (AccessibilityManager) context2.getSystemService("accessibility");
        m0 m0Var = new m0(context2, null, com.htmltoapk.template.R.attr.listPopupWindowStyle, 0);
        this.f15303w = m0Var;
        m0Var.Q = true;
        m0Var.R.setFocusable(true);
        m0Var.G = this;
        m0Var.R.setInputMethodMode(2);
        m0Var.p(getAdapter());
        m0Var.H = new o(this);
        if (typedArrayD.hasValue(6)) {
            setSimpleItems(typedArrayD.getResourceId(6, 0));
        }
        typedArrayD.recycle();
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f15304x;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null) {
            return false;
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (c()) {
            this.f15303w.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.C;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutB = b();
        return (textInputLayoutB == null || !textInputLayoutB.f12451a0) ? super.getHint() : textInputLayoutB.getHint();
    }

    public float getPopupElevation() {
        return this.B;
    }

    public int getSimpleItemSelectedColor() {
        return this.D;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.E;
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean isPopupShowing() {
        m0 m0Var = this.f15303w;
        if (m0Var == null || !m0Var.R.isShowing()) {
            return super.isPopupShowing();
        }
        return true;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null && textInputLayoutB.f12451a0 && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("meizu")) {
                setHint(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f15303w.dismiss();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i6, KeyEvent keyEvent) {
        if (isPopupShowing()) {
            return super.onKeyDown(i6, keyEvent);
        }
        boolean z6 = i6 == 66 || i6 == 23;
        boolean z7 = i6 == 62;
        if (getKeyListener() == null ? !(z6 || z7) : !(z6 && getMaxLines() == 1)) {
            return super.onKeyDown(i6, keyEvent);
        }
        TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null) {
            textInputLayoutB.getEndIconView().performClick();
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i6, int i7) {
        super.onMeasure(i6, i7);
        if (View.MeasureSpec.getMode(i6) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutB = b();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutB != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                m0 m0Var = this.f15303w;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !m0Var.R.isShowing() ? -1 : m0Var.f13699u.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutB);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable background = m0Var.R.getBackground();
                if (background != null) {
                    Rect rect = this.f15306z;
                    background.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutB.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i6)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z6) {
        if (c()) {
            return;
        }
        super.onWindowFocusChanged(z6);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t6) {
        super.setAdapter(t6);
        this.f15303w.p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        m0 m0Var = this.f15303w;
        if (m0Var != null) {
            m0Var.k(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i6) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i6));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.C = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof u4.g) {
            ((u4.g) dropDownBackground).r(this.C);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f15303w.I = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i6) {
        super.setRawInputType(i6);
        TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null) {
            textInputLayoutB.u();
        }
    }

    public void setSimpleItemSelectedColor(int i6) {
        this.D = i6;
        if (getAdapter() instanceof a) {
            ((a) getAdapter()).b();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.E = colorStateList;
        if (getAdapter() instanceof a) {
            ((a) getAdapter()).b();
        }
    }

    public void setSimpleItems(int i6) {
        setSimpleItems(getResources().getStringArray(i6));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (c()) {
            this.f15303w.f();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new a(getContext(), this.A, strArr));
    }
}
