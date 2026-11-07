package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.a;
import androidx.appcompat.widget.a;
import androidx.appcompat.widget.c;
import com.yalantis.ucrop.view.CropImageView;
import l.j;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public class b extends androidx.appcompat.widget.c implements a.InterfaceC0007a {

    /* renamed from: r, reason: collision with root package name */
    public androidx.appcompat.view.menu.a f679r;

    /* renamed from: s, reason: collision with root package name */
    public Context f680s;

    /* renamed from: t, reason: collision with root package name */
    public int f681t;

    /* renamed from: v, reason: collision with root package name */
    public androidx.appcompat.widget.a f682v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f683w;

    /* renamed from: x, reason: collision with root package name */
    public int f684x;

    public interface a {
        boolean a();

        boolean c();
    }

    /* renamed from: androidx.appcompat.widget.b$b, reason: collision with other inner class name */
    public static class C0010b implements j.a {
        @Override // l.j.a
        public final void b(androidx.appcompat.view.menu.a aVar, boolean z10) {
        }

        @Override // l.j.a
        public final boolean c(androidx.appcompat.view.menu.a aVar) {
            return false;
        }
    }

    public static class c extends c.a {

        /* renamed from: a, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f685a;

        /* renamed from: b, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f686b;

        /* renamed from: c, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f687c;

        /* renamed from: d, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f688d;

        /* renamed from: e, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f689e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f690f;
    }

    public class d {
        public d() {
        }
    }

    public interface e {
    }

    public static c g() {
        c cVar = new c(-2, -2);
        cVar.f685a = false;
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    public static c h(ViewGroup.LayoutParams layoutParams) {
        c cVar;
        if (layoutParams == null) {
            return g();
        }
        if (layoutParams instanceof c) {
            c cVar2 = (c) layoutParams;
            cVar = new c(cVar2);
            cVar.f685a = cVar2.f685a;
        } else {
            cVar = new c(layoutParams);
        }
        if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) cVar).gravity = 16;
        }
        return cVar;
    }

    @Override // androidx.appcompat.widget.c
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ c.a generateDefaultLayoutParams() {
        return g();
    }

    @Override // androidx.appcompat.widget.c, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // androidx.appcompat.widget.c
    /* renamed from: d */
    public final c.a generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.c
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ c.a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return h(layoutParams);
    }

    @Override // androidx.appcompat.widget.c, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // androidx.appcompat.widget.c, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return h(layoutParams);
    }

    public Menu getMenu() {
        if (this.f679r == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.a aVar = new androidx.appcompat.view.menu.a(context);
            this.f679r = aVar;
            aVar.f624e = new d();
            androidx.appcompat.widget.a aVar2 = new androidx.appcompat.widget.a(context);
            this.f682v = aVar2;
            aVar2.f659l = true;
            aVar2.f660m = true;
            aVar2.f16463e = new C0010b();
            this.f679r.b(aVar2, this.f680s);
            androidx.appcompat.widget.a aVar3 = this.f682v;
            aVar3.f16465g = this;
            this.f679r = aVar3.f16461c;
        }
        return this.f679r;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        androidx.appcompat.widget.a aVar = this.f682v;
        a.d dVar = aVar.f656h;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (aVar.f658k) {
            return aVar.f657j;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f681t;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean i(int i10) {
        boolean zA = false;
        if (i10 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i10 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof a)) {
            zA = ((a) childAt).a();
        }
        return (i10 <= 0 || !(childAt2 instanceof a)) ? zA : ((a) childAt2).c() | zA;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.a aVar = this.f682v;
        if (aVar != null) {
            aVar.g();
            a.e eVar = this.f682v.f666t;
            if (eVar == null || !eVar.b()) {
                return;
            }
            this.f682v.e();
            this.f682v.h();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.a aVar = this.f682v;
        if (aVar != null) {
            aVar.e();
            a.C0008a c0008a = aVar.f667v;
            if (c0008a == null || !c0008a.b()) {
                return;
            }
            c0008a.f16536i.dismiss();
        }
    }

    @Override // androidx.appcompat.widget.c, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int width;
        int paddingLeft;
        if (!this.f683w) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i14 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i15 = i12 - i10;
        int paddingRight = (i15 - getPaddingRight()) - getPaddingLeft();
        boolean z11 = getLayoutDirection() == 1;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f685a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (i(i18)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z11) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i19 = i14 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i19, width, measuredHeight + i19);
                    paddingRight -= measuredWidth;
                    i16 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    i(i18);
                    i17++;
                }
            }
        }
        if (childCount == 1 && i16 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i20 = (i15 / 2) - (measuredWidth2 / 2);
            int i21 = i14 - (measuredHeight2 / 2);
            childAt2.layout(i20, i21, measuredWidth2 + i20, measuredHeight2 + i21);
            return;
        }
        int i22 = i17 - (i16 ^ 1);
        int iMax = Math.max(0, i22 > 0 ? paddingRight / i22 : 0);
        if (z11) {
            int width2 = getWidth() - getPaddingRight();
            for (int i23 = 0; i23 < childCount; i23++) {
                View childAt3 = getChildAt(i23);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f685a) {
                    int i24 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i25 = i14 - (measuredHeight3 / 2);
                    childAt3.layout(i24 - measuredWidth3, i25, i24, measuredHeight3 + i25);
                    width2 = i24 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt4 = getChildAt(i26);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f685a) {
                int i27 = paddingLeft2 + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i28 = i14 - (measuredHeight4 / 2);
                childAt4.layout(i27, i28, i27 + measuredWidth4, measuredHeight4 + i28);
                paddingLeft2 = m.a.a(measuredWidth4, ((LinearLayout.LayoutParams) cVar3).rightMargin, iMax, i27);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v49 */
    @Override // androidx.appcompat.widget.c, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        long j10;
        boolean z10;
        ?? r62;
        int i13;
        int i14;
        int i15;
        androidx.appcompat.view.menu.a aVar;
        boolean z11 = this.f683w;
        boolean z12 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.f683w = z12;
        if (z11 != z12) {
            this.f684x = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.f683w && (aVar = this.f679r) != null && size != this.f684x) {
            this.f684x = size;
            aVar.o(true);
        }
        int childCount = getChildCount();
        if (!this.f683w || childCount <= 0) {
            for (int i16 = 0; i16 < childCount; i16++) {
                c cVar = (c) getChildAt(i16).getLayoutParams();
                ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
                ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
            }
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(i11);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
        int i17 = size2 - paddingRight;
        int i18 = i17 / 0;
        int i19 = i17 % 0;
        if (i18 == 0) {
            setMeasuredDimension(i17, 0);
            return;
        }
        int i20 = (i19 / i18) + 0;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i21 = 0;
        int iMax2 = 0;
        int i22 = 0;
        boolean z13 = false;
        int i23 = 0;
        long j11 = 0;
        while (i22 < childCount2) {
            View childAt = getChildAt(i22);
            int i24 = size3;
            if (childAt.getVisibility() == 8) {
                i13 = paddingBottom;
                i14 = i20;
            } else {
                boolean z14 = childAt instanceof ActionMenuItemView;
                i21++;
                if (z14) {
                    r62 = 0;
                    childAt.setPadding(0, 0, 0, 0);
                } else {
                    r62 = 0;
                }
                c cVar2 = (c) childAt.getLayoutParams();
                cVar2.f690f = r62;
                cVar2.f687c = r62;
                cVar2.f686b = r62;
                cVar2.f688d = r62;
                ((LinearLayout.LayoutParams) cVar2).leftMargin = r62;
                ((LinearLayout.LayoutParams) cVar2).rightMargin = r62;
                cVar2.f689e = z14 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i25 = cVar2.f685a ? 1 : i18;
                int i26 = i18;
                c cVar3 = (c) childAt.getLayoutParams();
                i13 = paddingBottom;
                i14 = i20;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i13, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z14 ? (ActionMenuItemView) childAt : null;
                boolean z15 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z16 = z15;
                if (i25 <= 0 || (z15 && i25 < 2)) {
                    i15 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i14 * i25, PKIFailureInfo.systemUnavail), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i15 = measuredWidth / i14;
                    if (measuredWidth % i14 != 0) {
                        i15++;
                    }
                    if (z16 && i15 < 2) {
                        i15 = 2;
                    }
                }
                cVar3.f688d = !cVar3.f685a && z16;
                cVar3.f686b = i15;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i15 * i14, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i15);
                if (cVar2.f688d) {
                    i23++;
                }
                if (cVar2.f685a) {
                    z13 = true;
                }
                i18 = i26 - i15;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i15 == 1) {
                    j11 |= 1 << i22;
                }
            }
            i22++;
            size3 = i24;
            i20 = i14;
            paddingBottom = i13;
        }
        int i27 = size3;
        int i28 = i18;
        int i29 = i20;
        boolean z17 = z13 && i21 == 2;
        int i30 = i28;
        boolean z18 = false;
        while (i23 > 0 && i30 > 0) {
            int i31 = Integer.MAX_VALUE;
            long j12 = 0;
            int i32 = 0;
            int i33 = 0;
            j10 = 1;
            while (i32 < childCount2) {
                c cVar4 = (c) getChildAt(i32).getLayoutParams();
                int i34 = iMax;
                if (cVar4.f688d) {
                    int i35 = cVar4.f686b;
                    if (i35 < i31) {
                        j12 = 1 << i32;
                        i31 = i35;
                        i33 = 1;
                    } else if (i35 == i31) {
                        j12 |= 1 << i32;
                        i33++;
                    }
                }
                i32++;
                iMax = i34;
            }
            i12 = iMax;
            j11 |= j12;
            if (i33 > i30) {
                break;
            }
            int i36 = i31 + 1;
            int i37 = 0;
            while (i37 < childCount2) {
                View childAt2 = getChildAt(i37);
                c cVar5 = (c) childAt2.getLayoutParams();
                int i38 = i37;
                boolean z19 = z17;
                long j13 = 1 << i37;
                if ((j12 & j13) != 0) {
                    if (!z19 || !cVar5.f689e) {
                        z10 = true;
                    } else if (i30 == 1) {
                        z10 = true;
                        childAt2.setPadding(0 + i29, 0, 0, 0);
                    } else {
                        z10 = true;
                    }
                    cVar5.f686b++;
                    cVar5.f690f = z10;
                    i30--;
                } else if (cVar5.f686b == i36) {
                    j11 |= j13;
                }
                i37 = i38 + 1;
                z17 = z19;
            }
            iMax = i12;
            z18 = true;
        }
        i12 = iMax;
        j10 = 1;
        boolean z20 = !z13 && i21 == 1;
        if (i30 > 0 && j11 != 0 && (i30 < i21 - 1 || z20 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j11);
            if (!z20) {
                if ((j11 & j10) != 0 && !((c) getChildAt(0).getLayoutParams()).f689e) {
                    fBitCount -= 0.5f;
                }
                int i39 = childCount2 - 1;
                if ((j11 & (1 << i39)) != 0 && !((c) getChildAt(i39).getLayoutParams()).f689e) {
                    fBitCount -= 0.5f;
                }
            }
            int i40 = fBitCount > CropImageView.DEFAULT_ASPECT_RATIO ? (int) ((i30 * i29) / fBitCount) : 0;
            boolean z21 = z18;
            for (int i41 = 0; i41 < childCount2; i41++) {
                if ((j11 & (1 << i41)) != 0) {
                    View childAt3 = getChildAt(i41);
                    c cVar6 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar6.f687c = i40;
                        cVar6.f690f = true;
                        if (i41 == 0 && !cVar6.f689e) {
                            ((LinearLayout.LayoutParams) cVar6).leftMargin = (-i40) / 2;
                        }
                        z21 = true;
                    } else if (cVar6.f685a) {
                        cVar6.f687c = i40;
                        cVar6.f690f = true;
                        ((LinearLayout.LayoutParams) cVar6).rightMargin = (-i40) / 2;
                        z21 = true;
                    } else {
                        if (i41 != 0) {
                            ((LinearLayout.LayoutParams) cVar6).leftMargin = i40 / 2;
                        }
                        if (i41 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) cVar6).rightMargin = i40 / 2;
                        }
                    }
                }
            }
            z18 = z21;
        }
        if (z18) {
            for (int i42 = 0; i42 < childCount2; i42++) {
                View childAt4 = getChildAt(i42);
                c cVar7 = (c) childAt4.getLayoutParams();
                if (cVar7.f690f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar7.f686b * i29) + cVar7.f687c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i17, mode != 1073741824 ? i12 : i27);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.f682v.f664r = z10;
    }

    public void setOnMenuItemClickListener(e eVar) {
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        androidx.appcompat.widget.a aVar = this.f682v;
        a.d dVar = aVar.f656h;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            aVar.f658k = true;
            aVar.f657j = drawable;
        }
    }

    public void setOverflowReserved(boolean z10) {
    }

    public void setPopupTheme(int i10) {
        if (this.f681t != i10) {
            this.f681t = i10;
            if (i10 == 0) {
                this.f680s = getContext();
            } else {
                this.f680s = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(androidx.appcompat.widget.a aVar) {
        this.f682v = aVar;
        aVar.f16465g = this;
        this.f679r = aVar.f16461c;
    }

    @Override // androidx.appcompat.widget.c, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }
}
