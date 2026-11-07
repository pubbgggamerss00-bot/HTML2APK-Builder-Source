package com.google.android.material.search;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.htmltoapk.template.R;
import n4.k;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class SearchBar extends Toolbar {

    /* renamed from: m0, reason: collision with root package name */
    public Drawable f12397m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f12398n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f12399o0;
    public boolean p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f12400q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f12401r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f12402s0;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a extends b1.a {
        public static final Parcelable.Creator<a> CREATOR = new C0037a();

        /* renamed from: u, reason: collision with root package name */
        public String f12404u;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        /* renamed from: com.google.android.material.search.SearchBar$a$a, reason: collision with other inner class name */
        public class C0037a implements Parcelable.ClassLoaderCreator<a> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i6) {
                return new a[i6];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new a(parcel, null);
            }
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f12404u = parcel.readString();
        }

        @Override // b1.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeString(this.f12404u);
        }
    }

    private void setNavigationIconDecorative(boolean z6) {
        ImageButton imageButtonA = k.a(this);
        if (imageButtonA == null) {
            return;
        }
        boolean z7 = !z6;
        imageButtonA.setClickable(z7);
        imageButtonA.setFocusable(z7);
        Drawable background = imageButtonA.getBackground();
        if (background != null) {
            this.f12397m0 = background;
        }
        imageButtonA.setBackgroundDrawable(z6 ? null : this.f12397m0);
        v();
    }

    public AppBarLayout getAppBarLayoutParentIfExists() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof AppBarLayout) {
                return (AppBarLayout) parent;
            }
        }
        return null;
    }

    public View getCenterView() {
        return null;
    }

    public float getCompatElevation() {
        return getElevation();
    }

    public float getCornerSize() {
        throw null;
    }

    public int getDefaultMarginVerticalResource() {
        return R.dimen.m3_searchbar_margin_vertical;
    }

    public int getDefaultNavigationIconResource() {
        return R.drawable.ic_search_black_24;
    }

    public int getEndSiblingViewId() {
        return this.f12402s0;
    }

    public CharSequence getHint() {
        throw null;
    }

    public int getMaxWidth() {
        return this.f12400q0;
    }

    public int getMenuResId() {
        return this.f12398n0;
    }

    public TextView getPlaceholderTextView() {
        return null;
    }

    public int getStartSiblingViewId() {
        return this.f12401r0;
    }

    public int getStrokeColor() {
        throw null;
    }

    public float getStrokeWidth() {
        throw null;
    }

    public CharSequence getText() {
        throw null;
    }

    public boolean getTextCentered() {
        return this.p0;
    }

    public TextView getTextView() {
        return null;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void m(int i6) {
        super.m(i6);
        this.f12398n0 = i6;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a1.a.g(this, null);
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (getAppBarLayoutParentIfExists() != null) {
            throw null;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        accessibilityNodeInfo.setEditable(isEnabled());
        CharSequence text = getText();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        if (Build.VERSION.SDK_INT >= 26) {
            accessibilityNodeInfo.setHintText(getHint());
            accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        }
        if (zIsEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
        super.onLayout(z6, i6, i7, i8, i9);
        v();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onMeasure(int i6, int i7) {
        int size = View.MeasureSpec.getSize(i6);
        int mode = View.MeasureSpec.getMode(i6);
        int i8 = this.f12400q0;
        if (i8 >= 0 && size > i8) {
            i6 = View.MeasureSpec.makeMeasureSpec(i8, mode);
        }
        super.onMeasure(i6, i7);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.s);
        setText(aVar.f12404u);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        CharSequence text = getText();
        aVar.f12404u = text == null ? null : text.toString();
        return aVar;
    }

    public void setCenterView(View view) {
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z6) {
        this.f12399o0 = z6;
        if (getLayoutParams() instanceof AppBarLayout.c) {
            AppBarLayout.c cVar = (AppBarLayout.c) getLayoutParams();
            if (this.f12399o0) {
                if (cVar.f11985a == 0) {
                    cVar.f11985a = 53;
                }
            } else if (cVar.f11985a == 53) {
                cVar.f11985a = 0;
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
    }

    public void setEndSiblingViewId(int i6) {
        this.f12402s0 = i6;
    }

    public void setHint(CharSequence charSequence) {
        throw null;
    }

    public void setLiftOnScroll(boolean z6) {
        if (z6) {
            getAppBarLayoutParentIfExists();
        } else if (getAppBarLayoutParentIfExists() != null) {
            throw null;
        }
    }

    public void setMaxWidth(int i6) {
        if (this.f12400q0 != i6) {
            this.f12400q0 = i6;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        super.setNavigationOnClickListener(onClickListener);
        setNavigationIconDecorative(onClickListener == null);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z6) {
        throw null;
    }

    public void setPlaceholderText(String str) {
        throw null;
    }

    public void setStartSiblingViewId(int i6) {
        this.f12401r0 = i6;
    }

    public void setStrokeColor(int i6) {
        if (getStrokeColor() == i6) {
            return;
        }
        ColorStateList.valueOf(i6);
        throw null;
    }

    public void setStrokeWidth(float f6) {
        if (getStrokeWidth() != f6) {
            throw null;
        }
    }

    public void setText(CharSequence charSequence) {
        throw null;
    }

    public void setTextCentered(boolean z6) {
        this.p0 = z6;
    }

    public final void v() {
        ActionMenuView actionMenuView;
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        int right = 0;
        boolean z6 = getLayoutDirection() == 1;
        ImageButton imageButtonA = k.a(this);
        int width = (imageButtonA == null || !imageButtonA.isClickable()) ? 0 : z6 ? getWidth() - imageButtonA.getLeft() : imageButtonA.getRight();
        int i6 = 0;
        while (true) {
            if (i6 >= getChildCount()) {
                actionMenuView = null;
                break;
            }
            View childAt = getChildAt(i6);
            if (childAt instanceof ActionMenuView) {
                actionMenuView = (ActionMenuView) childAt;
                break;
            }
            i6++;
        }
        if (actionMenuView != null) {
            right = z6 ? actionMenuView.getRight() : getWidth() - actionMenuView.getLeft();
        }
        float f6 = -(z6 ? right : width);
        if (!z6) {
            width = right;
        }
        setHandwritingBoundsOffsets(f6, 0.0f, -width, 0.0f);
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

        /* renamed from: g, reason: collision with root package name */
        public boolean f12403g;

        public ScrollingViewBehavior() {
            this.f12403g = false;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) throws Resources.NotFoundException {
            super.d(coordinatorLayout, view, view2);
            if (!this.f12403g && (view2 instanceof AppBarLayout)) {
                this.f12403g = true;
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                appBarLayout.setTouchscreenBlocksFocus(false);
                appBarLayout.setBackgroundColor(0);
                appBarLayout.setTargetElevation(0.0f);
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f12403g = false;
        }
    }

    public void setHint(int i6) {
        throw null;
    }

    public void setText(int i6) {
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }
}
