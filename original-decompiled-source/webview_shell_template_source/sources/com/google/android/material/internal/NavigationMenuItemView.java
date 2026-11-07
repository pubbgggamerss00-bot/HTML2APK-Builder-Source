package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.b;
import l.e1;
import l0.f;
import n4.e;
import u0.f0;
import v0.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class NavigationMenuItemView extends e implements k.a {

    /* renamed from: b0, reason: collision with root package name */
    public static final int[] f12394b0 = {R.attr.state_checked};
    public int N;
    public boolean O;
    public boolean P;
    public final boolean Q;
    public final CheckedTextView R;
    public FrameLayout S;
    public h T;
    public ColorStateList U;
    public boolean V;
    public Drawable W;

    /* renamed from: a0, reason: collision with root package name */
    public final a f12395a0;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a extends u0.a {
        public a() {
        }

        @Override // u0.a
        public final void d(View view, b bVar) throws Resources.NotFoundException {
            AccessibilityNodeInfo accessibilityNodeInfo = bVar.f14729a;
            this.f14446a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            NavigationMenuItemView navigationMenuItemView = NavigationMenuItemView.this;
            accessibilityNodeInfo.setCheckable(navigationMenuItemView.P);
            accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", navigationMenuItemView.getResources().getString(com.htmltoapk.template.R.string.item_view_role_description));
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.Q = true;
        a aVar = new a();
        this.f12395a0 = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.htmltoapk.template.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.htmltoapk.template.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.htmltoapk.template.R.id.design_menu_item_text);
        this.R = checkedTextView;
        f0.m(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.S == null) {
                this.S = (FrameLayout) ((ViewStub) findViewById(com.htmltoapk.template.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.S.removeAllViews();
            this.S.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public final void c(h hVar) throws Resources.NotFoundException {
        StateListDrawable stateListDrawable;
        this.T = hVar;
        int i6 = hVar.f194a;
        if (i6 > 0) {
            setId(i6);
        }
        setVisibility(hVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.htmltoapk.template.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f12394b0, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(hVar.isCheckable());
        setChecked(hVar.isChecked());
        setEnabled(hVar.isEnabled());
        setTitle(hVar.f198e);
        setIcon(hVar.getIcon());
        setActionView(hVar.getActionView());
        setContentDescription(hVar.f209q);
        e1.a(this, hVar.f210r);
        h hVar2 = this.T;
        CharSequence charSequence = hVar2.f198e;
        CheckedTextView checkedTextView = this.R;
        if (charSequence == null && hVar2.getIcon() == null && this.T.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.S;
            if (frameLayout != null) {
                b.a aVar = (b.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.S.setLayoutParams(aVar);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.S;
        if (frameLayout2 != null) {
            b.a aVar2 = (b.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.S.setLayoutParams(aVar2);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.T;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i6) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i6 + 1);
        h hVar = this.T;
        if (hVar != null && hVar.isCheckable() && this.T.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f12394b0);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z6) {
        refreshDrawableState();
        if (this.P != z6) {
            this.P = z6;
            this.f12395a0.h(this.R, 2048);
        }
    }

    public void setChecked(boolean z6) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.R;
        checkedTextView.setChecked(z6);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z6 && this.Q) ? 1 : 0);
    }

    public void setHorizontalPadding(int i6) {
        setPadding(i6, getPaddingTop(), i6, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) throws Resources.NotFoundException {
        if (drawable != null) {
            if (this.V) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.U);
            }
            int i6 = this.N;
            drawable.setBounds(0, 0, i6, i6);
        } else if (this.O) {
            if (this.W == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = f.f13795a;
                Drawable drawable2 = resources.getDrawable(com.htmltoapk.template.R.drawable.navigation_empty_icon, theme);
                this.W = drawable2;
                if (drawable2 != null) {
                    int i7 = this.N;
                    drawable2.setBounds(0, 0, i7, i7);
                }
            }
            drawable = this.W;
        }
        this.R.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i6) {
        this.R.setCompoundDrawablePadding(i6);
    }

    public void setIconSize(int i6) {
        this.N = i6;
    }

    public void setIconTintList(ColorStateList colorStateList) throws Resources.NotFoundException {
        this.U = colorStateList;
        this.V = colorStateList != null;
        h hVar = this.T;
        if (hVar != null) {
            setIcon(hVar.getIcon());
        }
    }

    public void setMaxLines(int i6) {
        this.R.setMaxLines(i6);
    }

    public void setNeedsEmptyIcon(boolean z6) {
        this.O = z6;
    }

    public void setTextAppearance(int i6) {
        this.R.setTextAppearance(i6);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.R.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.R.setText(charSequence);
    }
}
