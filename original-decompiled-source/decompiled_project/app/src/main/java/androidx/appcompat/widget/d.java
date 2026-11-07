package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.ArrayList;
import java.util.Objects;
import m.j;
import m.t;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import y3.k;
import y3.o;

/* loaded from: classes.dex */
public class d extends ViewGroup implements k {

    /* renamed from: a, reason: collision with root package name */
    public Context f707a;

    /* renamed from: b, reason: collision with root package name */
    public int f708b;

    /* renamed from: c, reason: collision with root package name */
    public int f709c;

    /* renamed from: d, reason: collision with root package name */
    public int f710d;

    /* renamed from: e, reason: collision with root package name */
    public int f711e;

    /* renamed from: f, reason: collision with root package name */
    public int f712f;

    /* renamed from: g, reason: collision with root package name */
    public int f713g;

    /* renamed from: h, reason: collision with root package name */
    public int f714h;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f715j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f716k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f717l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f718m;

    /* renamed from: n, reason: collision with root package name */
    public OnBackInvokedCallback f719n;

    /* renamed from: p, reason: collision with root package name */
    public OnBackInvokedDispatcher f720p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f721q;

    public static class a {
        public static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: m.l0
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        public static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        public static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public static class b extends h.a {

        /* renamed from: b, reason: collision with root package name */
        public int f722b;
    }

    public interface c {
    }

    /* renamed from: androidx.appcompat.widget.d$d, reason: collision with other inner class name */
    public static class C0011d extends q4.a {
        public static final Parcelable.Creator<C0011d> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public int f723c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f724d;

        /* renamed from: androidx.appcompat.widget.d$d$a */
        public class a implements Parcelable.ClassLoaderCreator<C0011d> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final C0011d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0011d(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new C0011d[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new C0011d(parcel, null);
            }
        }

        public C0011d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f723c = parcel.readInt();
            this.f724d = parcel.readInt() != 0;
        }

        @Override // q4.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f723c);
            parcel.writeInt(this.f724d ? 1 : 0);
        }
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new k.a(getContext());
    }

    public final void a() {
        throw null;
    }

    @Override // y3.k
    public final void addMenuProvider(o oVar) {
        throw null;
    }

    public final void b(j jVar, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) jVar.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824) {
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(mode != 0 ? Math.min(View.MeasureSpec.getSize(childMeasureSpec2), 0) : 0, 1073741824);
        }
        jVar.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean c(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof b);
    }

    public final void d() {
        if (Build.VERSION.SDK_INT >= 33) {
            a.a(this);
            OnBackInvokedDispatcher onBackInvokedDispatcher = this.f720p;
            if (onBackInvokedDispatcher != null) {
                a.d(onBackInvokedDispatcher, this.f719n);
                this.f720p = null;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        b bVar = new b(-2, -2);
        bVar.f722b = 0;
        bVar.f12076a = 8388627;
        return bVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        b bVar = new b(context, attributeSet);
        bVar.f12076a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.a.f11242a);
        bVar.f12076a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        bVar.f722b = 0;
        return bVar;
    }

    public CharSequence getCollapseContentDescription() {
        throw null;
    }

    public Drawable getCollapseIcon() {
        throw null;
    }

    public int getContentInsetEnd() {
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f714h;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        return 0;
    }

    public int getContentInsetRight() {
        return 0;
    }

    public int getContentInsetStart() {
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f713g;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f713g, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        throw null;
    }

    public CharSequence getLogoDescription() {
        throw null;
    }

    public Menu getMenu() {
        a();
        throw null;
    }

    public View getNavButtonView() {
        return null;
    }

    public CharSequence getNavigationContentDescription() {
        throw null;
    }

    public Drawable getNavigationIcon() {
        throw null;
    }

    public androidx.appcompat.widget.a getOuterActionMenuPresenter() {
        return null;
    }

    public Drawable getOverflowIcon() {
        a();
        throw null;
    }

    public Context getPopupContext() {
        return this.f707a;
    }

    public int getPopupTheme() {
        return this.f708b;
    }

    public CharSequence getSubtitle() {
        return this.f716k;
    }

    public final TextView getSubtitleTextView() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f715j;
    }

    public int getTitleMarginBottom() {
        return this.f712f;
    }

    public int getTitleMarginEnd() {
        return this.f710d;
    }

    public int getTitleMarginStart() {
        return this.f709c;
    }

    public int getTitleMarginTop() {
        return this.f711e;
    }

    public final TextView getTitleTextView() {
        return null;
    }

    public t getWrapper() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(null);
        d();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f718m = false;
        }
        if (!this.f718m) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f718m = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f718m = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        getLayoutDirection();
        getWidth();
        getHeight();
        getPaddingLeft();
        getPaddingRight();
        getPaddingTop();
        getPaddingBottom();
        throw null;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        getLayoutDirection();
        if (c(null)) {
            b(null, i10, i11);
            throw null;
        }
        if (c(null)) {
            b(null, i10, i11);
            throw null;
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        Math.max(currentContentInsetStart, 0);
        Math.max(0, currentContentInsetStart - 0);
        throw null;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0011d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0011d c0011d = (C0011d) parcelable;
        super.onRestoreInstanceState(c0011d.f21914a);
        if (c0011d.f724d) {
            removeCallbacks(null);
            post(null);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        throw null;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        new C0011d(super.onSaveInstanceState());
        Object obj = null;
        obj.getClass();
        throw null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f717l = false;
        }
        if (!this.f717l) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f717l = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f717l = false;
        return true;
    }

    @Override // y3.k
    public final void removeMenuProvider(o oVar) {
        throw null;
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.f721q != z10) {
            this.f721q = z10;
            d();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(i.a.c(getContext(), i10));
    }

    public void setCollapsible(boolean z10) {
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = PKIFailureInfo.systemUnavail;
        }
        if (i10 != this.f714h) {
            this.f714h = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = PKIFailureInfo.systemUnavail;
        }
        if (i10 != this.f713g) {
            this.f713g = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(i.a.c(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(i.a.c(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        throw null;
    }

    public void setOnMenuItemClickListener(c cVar) {
    }

    public void setOverflowIcon(Drawable drawable) {
        a();
        throw null;
    }

    public void setPopupTheme(int i10) {
        if (this.f708b != i10) {
            this.f708b = i10;
            if (i10 == 0) {
                this.f707a = getContext();
            } else {
                this.f707a = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMarginBottom(int i10) {
        this.f712f = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f710d = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f709c = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f711e = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        TextUtils.isEmpty(charSequence);
        throw null;
    }

    public void setCollapseIcon(Drawable drawable) {
        drawable.getClass();
        throw null;
    }

    public void setLogo(Drawable drawable) {
        drawable.getClass();
        throw null;
    }

    public void setLogoDescription(CharSequence charSequence) {
        TextUtils.isEmpty(charSequence);
        throw null;
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        TextUtils.isEmpty(charSequence);
        throw null;
    }

    public void setNavigationIcon(Drawable drawable) {
        drawable.getClass();
        throw null;
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            throw null;
        }
        throw null;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            throw null;
        }
        throw null;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        throw null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof b) {
            b bVar = (b) layoutParams;
            b bVar2 = new b(bVar);
            bVar2.f722b = 0;
            bVar2.f722b = bVar.f722b;
            return bVar2;
        }
        if (layoutParams instanceof h.a) {
            b bVar3 = new b((h.a) layoutParams);
            bVar3.f722b = 0;
            return bVar3;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            b bVar4 = new b(marginLayoutParams);
            bVar4.f722b = 0;
            ((ViewGroup.MarginLayoutParams) bVar4).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) bVar4).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) bVar4).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) bVar4).bottomMargin = marginLayoutParams.bottomMargin;
            return bVar4;
        }
        b bVar5 = new b(layoutParams);
        bVar5.f722b = 0;
        return bVar5;
    }
}
