package com.google.android.material.search;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.htmltoapk.template.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import u4.g;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class SearchView extends FrameLayout implements CoordinatorLayout.b {
    public SearchBar s;

    /* renamed from: t, reason: collision with root package name */
    public int f12405t;

    /* renamed from: u, reason: collision with root package name */
    public c f12406u;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class Behavior extends CoordinatorLayout.c<SearchView> {
        public Behavior() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            SearchView searchView = (SearchView) view;
            if (searchView.s != null || !(view2 instanceof SearchBar)) {
                return false;
            }
            searchView.setupWithSearchBar((SearchBar) view2);
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a extends b1.a {
        public static final Parcelable.Creator<a> CREATOR = new C0038a();

        /* renamed from: u, reason: collision with root package name */
        public final String f12407u;

        /* renamed from: v, reason: collision with root package name */
        public final int f12408v;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        /* renamed from: com.google.android.material.search.SearchView$a$a, reason: collision with other inner class name */
        public class C0038a implements Parcelable.ClassLoaderCreator<a> {
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
            this.f12407u = parcel.readString();
            this.f12408v = parcel.readInt();
        }

        @Override // b1.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeString(this.f12407u);
            parcel.writeInt(this.f12408v);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface b {
        void a();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class c {
        public static final c s;

        /* renamed from: t, reason: collision with root package name */
        public static final c f12409t;

        /* renamed from: u, reason: collision with root package name */
        public static final /* synthetic */ c[] f12410u;

        /* JADX INFO: Fake field, exist only in values array */
        c EF0;

        static {
            c cVar = new c("HIDING", 0);
            c cVar2 = new c("HIDDEN", 1);
            s = cVar2;
            c cVar3 = new c("SHOWING", 2);
            c cVar4 = new c("SHOWN", 3);
            f12409t = cVar4;
            f12410u = new c[]{cVar, cVar2, cVar3, cVar4};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f12410u.clone();
        }
    }

    private Window getActivityWindow() {
        Activity activity;
        Context context = getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            }
            if (context instanceof Activity) {
                activity = (Activity) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (activity == null) {
            return null;
        }
        return activity.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.s;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(R.dimen.m3_searchview_elevation);
    }

    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private void setStatusBarSpacerEnabledInternal(boolean z6) {
        throw null;
    }

    private void setUpHeaderLayout(int i6) {
        if (i6 == -1) {
            return;
        }
        LayoutInflater.from(getContext()).inflate(i6, (ViewGroup) null, false);
        throw null;
    }

    private void setUpStatusBarSpacer(int i6) {
        throw null;
    }

    public o4.a getBackHelper() {
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<SearchView> getBehavior() {
        return new Behavior();
    }

    public c getCurrentTransitionState() {
        return this.f12406u;
    }

    public int getDefaultNavigationIconResource() {
        return R.drawable.ic_arrow_back_black_24;
    }

    public EditText getEditText() {
        return null;
    }

    public CharSequence getHint() {
        throw null;
    }

    public View getSearchContainer() {
        return null;
    }

    public TextView getSearchPrefix() {
        return null;
    }

    public CharSequence getSearchPrefixText() {
        throw null;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.f12405t;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public Editable getText() {
        throw null;
    }

    public Toolbar getToolbar() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof g) {
            a1.a.g(this, (g) background);
        }
        c currentTransitionState = getCurrentTransitionState();
        if (currentTransitionState == c.f12409t) {
            setModalForAccessibility(true);
        } else if (currentTransitionState == c.s) {
            setModalForAccessibility(false);
        }
        getViewTreeObserver().addOnTouchModeChangeListener(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setModalForAccessibility(false);
        throw null;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.f12405t = activityWindow.getAttributes().softInputMode;
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.s);
        setText(aVar.f12407u);
        setVisible(aVar.f12408v == 0);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        if (super.onSaveInstanceState() == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        Editable text = getText();
        if (text != null) {
            text.toString();
        }
        throw null;
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        setUpBackgroundViewElevationOverlay(f6);
    }

    public void setHint(CharSequence charSequence) {
        throw null;
    }

    public void setModalForAccessibility(boolean z6) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z6) {
            new HashMap(viewGroup.getChildCount());
        }
        for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
            if (viewGroup.getChildAt(i6) != this) {
                throw null;
            }
        }
    }

    public void setOnMenuItemClickListener(Toolbar.h hVar) {
        throw null;
    }

    public void setSearchPrefixText(CharSequence charSequence) {
        throw null;
    }

    public void setStatusBarSpacerEnabled(boolean z6) {
        setStatusBarSpacerEnabledInternal(z6);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(CharSequence charSequence) {
        throw null;
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z6) {
        throw null;
    }

    public void setTransitionState(c cVar) {
        if (this.f12406u.equals(cVar)) {
            return;
        }
        c cVar2 = c.f12409t;
        c cVar3 = c.s;
        if (cVar == cVar2) {
            setModalForAccessibility(true);
        } else if (cVar == cVar3) {
            setModalForAccessibility(false);
        }
        this.f12406u = cVar;
        Iterator it = new LinkedHashSet((Collection) null).iterator();
        while (it.hasNext()) {
            ((b) it.next()).a();
        }
        SearchBar searchBar = this.s;
        if (searchBar == null || cVar != cVar3) {
            return;
        }
        searchBar.sendAccessibilityEvent(8);
    }

    public void setVisible(boolean z6) {
        throw null;
    }

    public void setupWithSearchBar(SearchBar searchBar) {
        this.s = searchBar;
        throw null;
    }

    public void setHint(int i6) {
        throw null;
    }

    public void setText(int i6) {
        throw null;
    }

    private void setUpBackgroundViewElevationOverlay(float f6) {
    }

    public void setAnimatedNavigationIcon(boolean z6) {
    }

    public void setAutoShowKeyboard(boolean z6) {
    }

    public void setMenuItemsAnimated(boolean z6) {
    }

    public void setUseWindowInsetsController(boolean z6) {
    }
}
