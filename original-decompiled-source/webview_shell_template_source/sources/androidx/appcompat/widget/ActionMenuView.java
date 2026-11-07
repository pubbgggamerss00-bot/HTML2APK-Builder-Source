package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.a;
import androidx.appcompat.widget.b;
import java.util.Iterator;
import l.i1;
import u0.l;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class ActionMenuView extends androidx.appcompat.widget.b implements f.b, k {
    public f H;
    public Context I;
    public int J;
    public boolean K;
    public androidx.appcompat.widget.a L;
    public Toolbar.c M;
    public boolean N;
    public int O;
    public final int P;
    public final int Q;
    public e R;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface a {
        boolean a();

        boolean b();
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class c extends b.a {

        /* renamed from: a, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f253a;

        /* renamed from: b, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f254b;

        /* renamed from: c, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f255c;

        /* renamed from: d, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f256d;

        /* renamed from: e, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f257e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f258f;
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class d implements f.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean a(f fVar, MenuItem menuItem) {
            e eVar = ActionMenuView.this.R;
            if (eVar == null) {
                return false;
            }
            Iterator<l> it = Toolbar.this.f275b0.f14503b.iterator();
            while (it.hasNext()) {
                if (it.next().a(menuItem)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void b(f fVar) {
            Toolbar.c cVar = ActionMenuView.this.M;
            if (cVar != null) {
                cVar.b(fVar);
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface e {
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f6 = context.getResources().getDisplayMetrics().density;
        this.P = (int) (56.0f * f6);
        this.Q = (int) (f6 * 4.0f);
        this.I = context;
        this.J = 0;
    }

    public static c j() {
        c cVar = new c(-2, -2);
        cVar.f253a = false;
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    public static c k(ViewGroup.LayoutParams layoutParams) {
        c cVar;
        if (layoutParams == null) {
            return j();
        }
        if (layoutParams instanceof c) {
            c cVar2 = (c) layoutParams;
            cVar = new c(cVar2);
            cVar.f253a = cVar2.f253a;
        } else {
            cVar = new c(layoutParams);
        }
        if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) cVar).gravity = 16;
        }
        return cVar;
    }

    @Override // androidx.appcompat.view.menu.f.b
    public final boolean a(h hVar) {
        return this.H.q(hVar, null, 0);
    }

    @Override // androidx.appcompat.view.menu.k
    public final void b(f fVar) {
        this.H = fVar;
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.b
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ b.a generateDefaultLayoutParams() {
        return j();
    }

    @Override // androidx.appcompat.widget.b
    /* renamed from: g */
    public final b.a generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public Menu getMenu() {
        if (this.H == null) {
            Context context = getContext();
            f fVar = new f(context);
            this.H = fVar;
            fVar.f174e = new d();
            androidx.appcompat.widget.a aVar = new androidx.appcompat.widget.a(context);
            this.L = aVar;
            aVar.D = true;
            aVar.E = true;
            aVar.f141w = new b();
            this.H.b(aVar, this.I);
            androidx.appcompat.widget.a aVar2 = this.L;
            aVar2.f144z = this;
            this.H = aVar2.f139u;
        }
        return this.H;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        androidx.appcompat.widget.a aVar = this.L;
        a.d dVar = aVar.A;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (aVar.C) {
            return aVar.B;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.J;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.b
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ b.a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i6) {
        boolean zA = false;
        if (i6 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i6 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i6);
        if (i6 < getChildCount() && (childAt instanceof a)) {
            zA = ((a) childAt).a();
        }
        return (i6 <= 0 || !(childAt2 instanceof a)) ? zA : ((a) childAt2).b() | zA;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.a aVar = this.L;
        if (aVar != null) {
            aVar.h();
            if (this.L.i()) {
                this.L.f();
                this.L.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.a aVar = this.L;
        if (aVar != null) {
            aVar.f();
            a.C0007a c0007a = aVar.L;
            if (c0007a == null || !c0007a.b()) {
                return;
            }
            c0007a.f227j.dismiss();
        }
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
        int width;
        int paddingLeft;
        if (!this.N) {
            super.onLayout(z6, i6, i7, i8, i9);
            return;
        }
        int childCount = getChildCount();
        int i10 = (i9 - i7) / 2;
        int dividerWidth = getDividerWidth();
        int i11 = i8 - i6;
        int paddingRight = (i11 - getPaddingRight()) - getPaddingLeft();
        boolean z7 = i1.f13669a;
        boolean z8 = getLayoutDirection() == 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f253a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i14)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z8) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i15 = i10 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i15, width, measuredHeight + i15);
                    paddingRight -= measuredWidth;
                    i12 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    l(i14);
                    i13++;
                }
            }
        }
        if (childCount == 1 && i12 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i16 = (i11 / 2) - (measuredWidth2 / 2);
            int i17 = i10 - (measuredHeight2 / 2);
            childAt2.layout(i16, i17, measuredWidth2 + i16, measuredHeight2 + i17);
            return;
        }
        int i18 = i13 - (i12 ^ 1);
        int iMax = Math.max(0, i18 > 0 ? paddingRight / i18 : 0);
        if (z8) {
            int width2 = getWidth() - getPaddingRight();
            for (int i19 = 0; i19 < childCount; i19++) {
                View childAt3 = getChildAt(i19);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f253a) {
                    int i20 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i21 = i10 - (measuredHeight3 / 2);
                    childAt3.layout(i20 - measuredWidth3, i21, i20, measuredHeight3 + i21);
                    width2 = i20 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt4 = getChildAt(i22);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f253a) {
                int i23 = paddingLeft2 + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i24 = i10 - (measuredHeight4 / 2);
                childAt4.layout(i23, i24, i23 + measuredWidth4, measuredHeight4 + i24);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + iMax + i23;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // androidx.appcompat.widget.b, android.view.View
    public final void onMeasure(int i6, int i7) {
        int i8;
        int i9;
        ?? r11;
        int i10;
        int i11;
        f fVar;
        boolean z6 = this.N;
        boolean z7 = View.MeasureSpec.getMode(i6) == 1073741824;
        this.N = z7;
        if (z6 != z7) {
            this.O = 0;
        }
        int size = View.MeasureSpec.getSize(i6);
        if (this.N && (fVar = this.H) != null && size != this.O) {
            this.O = size;
            fVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.N || childCount <= 0) {
            for (int i12 = 0; i12 < childCount; i12++) {
                c cVar = (c) getChildAt(i12).getLayoutParams();
                ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
                ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
            }
            super.onMeasure(i6, i7);
            return;
        }
        int mode = View.MeasureSpec.getMode(i7);
        int size2 = View.MeasureSpec.getSize(i6);
        int size3 = View.MeasureSpec.getSize(i7);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, paddingBottom, -2);
        int i13 = size2 - paddingRight;
        int i14 = this.P;
        int i15 = i13 / i14;
        int i16 = i13 % i14;
        if (i15 == 0) {
            setMeasuredDimension(i13, 0);
            return;
        }
        int i17 = (i16 / i15) + i14;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i18 = 0;
        int iMax2 = 0;
        int i19 = 0;
        boolean z8 = false;
        int i20 = 0;
        long j6 = 0;
        while (true) {
            i8 = this.Q;
            if (i19 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i19);
            int i21 = size3;
            int i22 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i10 = i17;
            } else {
                boolean z9 = childAt instanceof ActionMenuItemView;
                i18++;
                if (z9) {
                    childAt.setPadding(i8, 0, i8, 0);
                }
                c cVar2 = (c) childAt.getLayoutParams();
                cVar2.f258f = false;
                cVar2.f255c = 0;
                cVar2.f254b = 0;
                cVar2.f256d = false;
                ((LinearLayout.LayoutParams) cVar2).leftMargin = 0;
                ((LinearLayout.LayoutParams) cVar2).rightMargin = 0;
                cVar2.f257e = z9 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i23 = cVar2.f253a ? 1 : i15;
                c cVar3 = (c) childAt.getLayoutParams();
                int i24 = i15;
                i10 = i17;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i22, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z9 ? (ActionMenuItemView) childAt : null;
                boolean z10 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z11 = z10;
                if (i23 <= 0 || (z10 && i23 < 2)) {
                    i11 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i10 * i23, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i11 = measuredWidth / i10;
                    if (measuredWidth % i10 != 0) {
                        i11++;
                    }
                    if (z11 && i11 < 2) {
                        i11 = 2;
                    }
                }
                cVar3.f256d = !cVar3.f253a && z11;
                cVar3.f254b = i11;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i11 * i10, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i11);
                if (cVar2.f256d) {
                    i20++;
                }
                if (cVar2.f253a) {
                    z8 = true;
                }
                i15 = i24 - i11;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i11 == 1) {
                    j6 |= 1 << i19;
                }
            }
            i19++;
            size3 = i21;
            paddingBottom = i22;
            i17 = i10;
        }
        int i25 = size3;
        int i26 = i15;
        int i27 = i17;
        boolean z12 = z8 && i18 == 2;
        int i28 = i26;
        boolean z13 = false;
        while (i20 > 0 && i28 > 0) {
            int i29 = Integer.MAX_VALUE;
            long j7 = 0;
            int i30 = 0;
            int i31 = 0;
            while (i31 < childCount2) {
                int i32 = iMax;
                c cVar4 = (c) getChildAt(i31).getLayoutParams();
                boolean z14 = z12;
                if (cVar4.f256d) {
                    int i33 = cVar4.f254b;
                    if (i33 < i29) {
                        j7 = 1 << i31;
                        i29 = i33;
                        i30 = 1;
                    } else if (i33 == i29) {
                        j7 |= 1 << i31;
                        i30++;
                    }
                }
                i31++;
                z12 = z14;
                iMax = i32;
            }
            i9 = iMax;
            boolean z15 = z12;
            j6 |= j7;
            if (i30 > i28) {
                break;
            }
            int i34 = i29 + 1;
            int i35 = 0;
            while (i35 < childCount2) {
                View childAt2 = getChildAt(i35);
                c cVar5 = (c) childAt2.getLayoutParams();
                boolean z16 = z8;
                long j8 = 1 << i35;
                if ((j7 & j8) != 0) {
                    if (z15 && cVar5.f257e) {
                        r11 = 1;
                        r11 = 1;
                        if (i28 == 1) {
                            childAt2.setPadding(i8 + i27, 0, i8, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    cVar5.f254b += r11;
                    cVar5.f258f = r11;
                    i28--;
                } else if (cVar5.f254b == i34) {
                    j6 |= j8;
                }
                i35++;
                z8 = z16;
            }
            z12 = z15;
            iMax = i9;
            z13 = true;
        }
        i9 = iMax;
        boolean z17 = !z8 && i18 == 1;
        if (i28 > 0 && j6 != 0 && (i28 < i18 - 1 || z17 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j6);
            if (!z17) {
                if ((j6 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f257e) {
                    fBitCount -= 0.5f;
                }
                int i36 = childCount2 - 1;
                if ((j6 & (1 << i36)) != 0 && !((c) getChildAt(i36).getLayoutParams()).f257e) {
                    fBitCount -= 0.5f;
                }
            }
            int i37 = fBitCount > 0.0f ? (int) ((i28 * i27) / fBitCount) : 0;
            boolean z18 = z13;
            for (int i38 = 0; i38 < childCount2; i38++) {
                if ((j6 & (1 << i38)) != 0) {
                    View childAt3 = getChildAt(i38);
                    c cVar6 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar6.f255c = i37;
                        cVar6.f258f = true;
                        if (i38 == 0 && !cVar6.f257e) {
                            ((LinearLayout.LayoutParams) cVar6).leftMargin = (-i37) / 2;
                        }
                        z18 = true;
                    } else if (cVar6.f253a) {
                        cVar6.f255c = i37;
                        cVar6.f258f = true;
                        ((LinearLayout.LayoutParams) cVar6).rightMargin = (-i37) / 2;
                        z18 = true;
                    } else {
                        if (i38 != 0) {
                            ((LinearLayout.LayoutParams) cVar6).leftMargin = i37 / 2;
                        }
                        if (i38 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) cVar6).rightMargin = i37 / 2;
                        }
                    }
                }
            }
            z13 = z18;
        }
        if (z13) {
            for (int i39 = 0; i39 < childCount2; i39++) {
                View childAt4 = getChildAt(i39);
                c cVar7 = (c) childAt4.getLayoutParams();
                if (cVar7.f258f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar7.f254b * i27) + cVar7.f255c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i13, mode != 1073741824 ? i9 : i25);
    }

    public void setExpandedActionViewsExclusive(boolean z6) {
        this.L.I = z6;
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.R = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        androidx.appcompat.widget.a aVar = this.L;
        a.d dVar = aVar.A;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            aVar.C = true;
            aVar.B = drawable;
        }
    }

    public void setOverflowReserved(boolean z6) {
        this.K = z6;
    }

    public void setPopupTheme(int i6) {
        if (this.J != i6) {
            this.J = i6;
            if (i6 == 0) {
                this.I = getContext();
            } else {
                this.I = new ContextThemeWrapper(getContext(), i6);
            }
        }
    }

    public void setPresenter(androidx.appcompat.widget.a aVar) {
        this.L = aVar;
        aVar.f144z = this;
        this.H = aVar.f139u;
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b implements j.a {
        @Override // androidx.appcompat.view.menu.j.a
        public final boolean c(f fVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void b(f fVar, boolean z6) {
        }
    }
}
