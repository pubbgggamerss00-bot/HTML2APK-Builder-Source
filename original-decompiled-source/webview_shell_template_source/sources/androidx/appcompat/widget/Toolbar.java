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
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionMenuView;
import androidx.camera.core.y;
import com.htmltoapk.template.R;
import g.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import l.b1;
import l.c0;
import l.d1;
import l.e1;
import l.g0;
import l.i1;
import l.m;
import l.o;
import l.u0;
import u0.f0;
import u0.j;
import u0.l;
import u0.n0;
import y5.b0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements u0.g {
    public View A;
    public Context B;
    public int C;
    public int D;
    public int E;
    public final int F;
    public final int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public u0 L;
    public int M;
    public int N;
    public final int O;
    public CharSequence P;
    public CharSequence Q;
    public ColorStateList R;
    public ColorStateList S;
    public boolean T;
    public boolean U;
    public final ArrayList<View> V;
    public final ArrayList<View> W;

    /* renamed from: a0, reason: collision with root package name */
    public final int[] f274a0;

    /* renamed from: b0, reason: collision with root package name */
    public final j f275b0;

    /* renamed from: c0, reason: collision with root package name */
    public ArrayList<MenuItem> f276c0;

    /* renamed from: d0, reason: collision with root package name */
    public final a f277d0;

    /* renamed from: e0, reason: collision with root package name */
    public androidx.appcompat.widget.d f278e0;

    /* renamed from: f0, reason: collision with root package name */
    public androidx.appcompat.widget.a f279f0;

    /* renamed from: g0, reason: collision with root package name */
    public f f280g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f281h0;

    /* renamed from: i0, reason: collision with root package name */
    public OnBackInvokedCallback f282i0;

    /* renamed from: j0, reason: collision with root package name */
    public OnBackInvokedDispatcher f283j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f284k0;

    /* renamed from: l0, reason: collision with root package name */
    public final b f285l0;
    public ActionMenuView s;

    /* renamed from: t, reason: collision with root package name */
    public c0 f286t;

    /* renamed from: u, reason: collision with root package name */
    public c0 f287u;

    /* renamed from: v, reason: collision with root package name */
    public m f288v;

    /* renamed from: w, reason: collision with root package name */
    public o f289w;

    /* renamed from: x, reason: collision with root package name */
    public final Drawable f290x;

    /* renamed from: y, reason: collision with root package name */
    public final CharSequence f291y;

    /* renamed from: z, reason: collision with root package name */
    public m f292z;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements ActionMenuView.e {
        public a() {
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            androidx.appcompat.widget.a aVar;
            ActionMenuView actionMenuView = Toolbar.this.s;
            if (actionMenuView == null || (aVar = actionMenuView.L) == null) {
                return;
            }
            aVar.l();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class c implements f.a {
        public c() {
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
            Toolbar.this.getClass();
            return false;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void b(androidx.appcompat.view.menu.f fVar) {
            Toolbar toolbar = Toolbar.this;
            androidx.appcompat.widget.a aVar = toolbar.s.L;
            if (aVar == null || !aVar.i()) {
                Iterator<l> it = toolbar.f275b0.f14503b.iterator();
                while (it.hasNext()) {
                    it.next().d(fVar);
                }
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            f fVar = Toolbar.this.f280g0;
            androidx.appcompat.view.menu.h hVar = fVar == null ? null : fVar.f294t;
            if (hVar != null) {
                hVar.collapseActionView();
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class e {
        public static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: l.c1
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

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class g extends a.C0061a {

        /* renamed from: b, reason: collision with root package name */
        public int f296b;
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface h {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class i extends b1.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: u, reason: collision with root package name */
        public int f297u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f298v;

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
            this.f297u = parcel.readInt();
            this.f298v = parcel.readInt() != 0;
        }

        @Override // b1.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeInt(this.f297u);
            parcel.writeInt(this.f298v ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i6 = 0; i6 < menu.size(); i6++) {
            arrayList.add(menu.getItem(i6));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new j.f(getContext());
    }

    public static g h() {
        g gVar = new g(-2, -2);
        gVar.f296b = 0;
        gVar.f13075a = 8388627;
        return gVar;
    }

    public static g i(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof g) {
            g gVar = (g) layoutParams;
            g gVar2 = new g(gVar);
            gVar2.f296b = 0;
            gVar2.f296b = gVar.f296b;
            return gVar2;
        }
        if (layoutParams instanceof a.C0061a) {
            g gVar3 = new g((a.C0061a) layoutParams);
            gVar3.f296b = 0;
            return gVar3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            g gVar4 = new g(layoutParams);
            gVar4.f296b = 0;
            return gVar4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        g gVar5 = new g(marginLayoutParams);
        gVar5.f296b = 0;
        ((ViewGroup.MarginLayoutParams) gVar5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) gVar5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) gVar5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) gVar5).bottomMargin = marginLayoutParams.bottomMargin;
        return gVar5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i6, ArrayList arrayList) {
        boolean z6 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i6, getLayoutDirection());
        arrayList.clear();
        if (!z6) {
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f296b == 0 && t(childAt)) {
                    int i8 = gVar.f13075a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i8, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i9 = childCount - 1; i9 >= 0; i9--) {
            View childAt2 = getChildAt(i9);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f296b == 0 && t(childAt2)) {
                int i10 = gVar2.f13075a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i10, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    @Override // u0.g
    public final void addMenuProvider(l lVar) {
        j jVar = this.f275b0;
        jVar.f14503b.add(lVar);
        jVar.f14502a.run();
    }

    public final void b(View view, boolean z6) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        g gVarH = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (g) layoutParams;
        gVarH.f296b = 1;
        if (!z6 || this.A == null) {
            addView(view, gVarH);
        } else {
            view.setLayoutParams(gVarH);
            this.W.add(view);
        }
    }

    public final void c() {
        if (this.f292z == null) {
            m mVar = new m(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f292z = mVar;
            mVar.setImageDrawable(this.f290x);
            this.f292z.setContentDescription(this.f291y);
            g gVarH = h();
            gVarH.f13075a = (this.F & 112) | 8388611;
            gVarH.f296b = 2;
            this.f292z.setLayoutParams(gVarH);
            this.f292z.setOnClickListener(new d());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    public final void d() {
        if (this.L == null) {
            u0 u0Var = new u0();
            u0Var.f13731a = 0;
            u0Var.f13732b = 0;
            u0Var.f13733c = Integer.MIN_VALUE;
            u0Var.f13734d = Integer.MIN_VALUE;
            u0Var.f13735e = 0;
            u0Var.f13736f = 0;
            u0Var.f13737g = false;
            u0Var.h = false;
            this.L = u0Var;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.s;
        if (actionMenuView.H == null) {
            androidx.appcompat.view.menu.f fVar = (androidx.appcompat.view.menu.f) actionMenuView.getMenu();
            if (this.f280g0 == null) {
                this.f280g0 = new f();
            }
            this.s.setExpandedActionViewsExclusive(true);
            fVar.b(this.f280g0, this.B);
            u();
        }
    }

    public final void f() {
        if (this.s == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.s = actionMenuView;
            actionMenuView.setPopupTheme(this.C);
            this.s.setOnMenuItemClickListener(this.f277d0);
            ActionMenuView actionMenuView2 = this.s;
            c cVar = new c();
            actionMenuView2.getClass();
            actionMenuView2.M = cVar;
            g gVarH = h();
            gVarH.f13075a = (this.F & 112) | 8388613;
            this.s.setLayoutParams(gVarH);
            b(this.s, false);
        }
    }

    public final void g() {
        if (this.f288v == null) {
            this.f288v = new m(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            g gVarH = h();
            gVarH.f13075a = (this.F & 112) | 8388611;
            this.f288v.setLayoutParams(gVarH);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        m mVar = this.f292z;
        if (mVar != null) {
            return mVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        m mVar = this.f292z;
        if (mVar != null) {
            return mVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        u0 u0Var = this.L;
        if (u0Var != null) {
            return u0Var.f13737g ? u0Var.f13731a : u0Var.f13732b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i6 = this.N;
        return i6 != Integer.MIN_VALUE ? i6 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        u0 u0Var = this.L;
        if (u0Var != null) {
            return u0Var.f13731a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        u0 u0Var = this.L;
        if (u0Var != null) {
            return u0Var.f13732b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        u0 u0Var = this.L;
        if (u0Var != null) {
            return u0Var.f13737g ? u0Var.f13732b : u0Var.f13731a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i6 = this.M;
        return i6 != Integer.MIN_VALUE ? i6 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.f fVar;
        ActionMenuView actionMenuView = this.s;
        return (actionMenuView == null || (fVar = actionMenuView.H) == null || !fVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.N, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.M, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        o oVar = this.f289w;
        if (oVar != null) {
            return oVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        o oVar = this.f289w;
        if (oVar != null) {
            return oVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.s.getMenu();
    }

    public View getNavButtonView() {
        return this.f288v;
    }

    public CharSequence getNavigationContentDescription() {
        m mVar = this.f288v;
        if (mVar != null) {
            return mVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        m mVar = this.f288v;
        if (mVar != null) {
            return mVar.getDrawable();
        }
        return null;
    }

    public androidx.appcompat.widget.a getOuterActionMenuPresenter() {
        return this.f279f0;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.s.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.B;
    }

    public int getPopupTheme() {
        return this.C;
    }

    public CharSequence getSubtitle() {
        return this.Q;
    }

    public final TextView getSubtitleTextView() {
        return this.f287u;
    }

    public CharSequence getTitle() {
        return this.P;
    }

    public int getTitleMarginBottom() {
        return this.K;
    }

    public int getTitleMarginEnd() {
        return this.I;
    }

    public int getTitleMarginStart() {
        return this.H;
    }

    public int getTitleMarginTop() {
        return this.J;
    }

    public final TextView getTitleTextView() {
        return this.f286t;
    }

    public g0 getWrapper() {
        Drawable drawable;
        if (this.f278e0 == null) {
            androidx.appcompat.widget.d dVar = new androidx.appcompat.widget.d();
            dVar.f326n = 0;
            dVar.f314a = this;
            dVar.h = getTitle();
            dVar.f321i = getSubtitle();
            dVar.f320g = dVar.h != null;
            dVar.f319f = getNavigationIcon();
            b1 b1VarE = b1.e(R.attr.actionBarStyle, 0, getContext(), null, f.a.f12934a);
            TypedArray typedArray = b1VarE.f13583b;
            dVar.f327o = b1VarE.b(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                dVar.f320g = true;
                dVar.h = text;
                if ((dVar.f315b & 8) != 0) {
                    setTitle(text);
                    if (dVar.f320g) {
                        f0.n(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                dVar.f321i = text2;
                if ((dVar.f315b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableB = b1VarE.b(20);
            if (drawableB != null) {
                dVar.f318e = drawableB;
                dVar.t();
            }
            Drawable drawableB2 = b1VarE.b(17);
            if (drawableB2 != null) {
                dVar.setIcon(drawableB2);
            }
            if (dVar.f319f == null && (drawable = dVar.f327o) != null) {
                dVar.f319f = drawable;
                if ((dVar.f315b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            dVar.j(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = dVar.f316c;
                if (view != null && (dVar.f315b & 16) != 0) {
                    removeView(view);
                }
                dVar.f316c = viewInflate;
                if (viewInflate != null && (dVar.f315b & 16) != 0) {
                    addView(viewInflate);
                }
                dVar.j(dVar.f315b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.L.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.D = resourceId2;
                c0 c0Var = this.f286t;
                if (c0Var != null) {
                    c0Var.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.E = resourceId3;
                c0 c0Var2 = this.f287u;
                if (c0Var2 != null) {
                    c0Var2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            b1VarE.f();
            if (R.string.abc_action_bar_up_description != dVar.f326n) {
                dVar.f326n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i6 = dVar.f326n;
                    dVar.f322j = i6 != 0 ? getContext().getString(i6) : null;
                    dVar.s();
                }
            }
            dVar.f322j = getNavigationContentDescription();
            setNavigationOnClickListener(new d1(dVar));
            this.f278e0 = dVar;
        }
        return this.f278e0;
    }

    public final int j(View view, int i6) {
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i7 = i6 > 0 ? (measuredHeight - i6) / 2 : 0;
        int i8 = gVar.f13075a & 112;
        if (i8 != 16 && i8 != 48 && i8 != 80) {
            i8 = this.O & 112;
        }
        if (i8 == 48) {
            return getPaddingTop() - i7;
        }
        if (i8 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i7;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i9 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        if (iMax < i9) {
            iMax = i9;
        } else {
            int i10 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i11 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            if (i10 < i11) {
                iMax = Math.max(0, iMax - (i11 - i10));
            }
        }
        return paddingTop + iMax;
    }

    public void m(int i6) {
        getMenuInflater().inflate(i6, getMenu());
    }

    public final void n() {
        ArrayList<MenuItem> arrayList = this.f276c0;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            MenuItem menuItem = arrayList.get(i6);
            i6++;
            getMenu().removeItem(menuItem.getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator<l> it = this.f275b0.f14503b.iterator();
        while (it.hasNext()) {
            it.next().c(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f276c0 = currentMenuItems2;
    }

    public final boolean o(View view) {
        return view.getParent() == this || this.W.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f285l0);
        u();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.U = false;
        }
        if (!this.U) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.U = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.U = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x028f A[LOOP:0: B:102:0x028d->B:103:0x028f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a7 A[LOOP:1: B:105:0x02a5->B:106:0x02a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c7 A[LOOP:2: B:108:0x02c5->B:109:0x02c7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x031a A[LOOP:3: B:117:0x0318->B:118:0x031a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0218  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
        int iP;
        int iQ;
        int iMax;
        boolean zT;
        boolean zT2;
        boolean z7;
        int measuredHeight;
        int i10;
        int paddingTop;
        int i11;
        int i12;
        int i13;
        int i14;
        int size;
        int iP2;
        int i15;
        int size2;
        int i16;
        int size3;
        int i17;
        int i18;
        int i19;
        int size4;
        boolean z8 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i20 = width - paddingRight;
        int[] iArr = this.f274a0;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap<View, n0> weakHashMap = f0.f14480a;
        int minimumHeight = getMinimumHeight();
        int iMin = minimumHeight >= 0 ? Math.min(minimumHeight, i9 - i7) : 0;
        if (!t(this.f288v)) {
            iP = paddingLeft;
        } else {
            if (z8) {
                iQ = q(this.f288v, i20, iMin, iArr);
                iP = paddingLeft;
                if (t(this.f292z)) {
                    if (z8) {
                        iQ = q(this.f292z, iQ, iMin, iArr);
                    } else {
                        iP = p(this.f292z, iP, iMin, iArr);
                    }
                }
                if (t(this.s)) {
                    if (z8) {
                        iP = p(this.s, iP, iMin, iArr);
                    } else {
                        iQ = q(this.s, iQ, iMin, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - iP);
                iArr[1] = Math.max(0, currentContentInsetRight - (i20 - iQ));
                iMax = Math.max(iP, currentContentInsetLeft);
                int iMin2 = Math.min(iQ, i20 - currentContentInsetRight);
                if (t(this.A)) {
                    if (z8) {
                        iMin2 = q(this.A, iMin2, iMin, iArr);
                    } else {
                        iMax = p(this.A, iMax, iMin, iArr);
                    }
                }
                if (t(this.f289w)) {
                    if (z8) {
                        iMin2 = q(this.f289w, iMin2, iMin, iArr);
                    } else {
                        iMax = p(this.f289w, iMax, iMin, iArr);
                    }
                }
                zT = t(this.f286t);
                zT2 = t(this.f287u);
                if (zT) {
                    z7 = z8;
                    measuredHeight = 0;
                } else {
                    g gVar = (g) this.f286t.getLayoutParams();
                    z7 = z8;
                    measuredHeight = this.f286t.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                }
                if (!zT2) {
                    g gVar2 = (g) this.f287u.getLayoutParams();
                    measuredHeight = this.f287u.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar2).topMargin + ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin + measuredHeight;
                }
                if (!zT || zT2) {
                    c0 c0Var = !zT ? this.f286t : this.f287u;
                    c0 c0Var2 = !zT2 ? this.f287u : this.f286t;
                    g gVar3 = (g) c0Var.getLayoutParams();
                    g gVar4 = (g) c0Var2.getLayoutParams();
                    int i21 = measuredHeight;
                    boolean z9 = (zT && this.f286t.getMeasuredWidth() > 0) || (zT2 && this.f287u.getMeasuredWidth() > 0);
                    i10 = this.O & 112;
                    int i22 = iMax;
                    if (i10 == 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar3).topMargin + this.J;
                    } else if (i10 != 80) {
                        int iMax2 = (((height - paddingTop2) - paddingBottom) - i21) / 2;
                        int i23 = ((ViewGroup.MarginLayoutParams) gVar3).topMargin + this.J;
                        if (iMax2 < i23) {
                            iMax2 = i23;
                        } else {
                            int i24 = (((height - paddingBottom) - i21) - iMax2) - paddingTop2;
                            int i25 = ((ViewGroup.MarginLayoutParams) gVar3).bottomMargin;
                            int i26 = this.K;
                            if (i24 < i25 + i26) {
                                iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) gVar4).bottomMargin + i26) - i24));
                            }
                        }
                        paddingTop = paddingTop2 + iMax2;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar4).bottomMargin) - this.K) - i21;
                    }
                    if (z7) {
                        int i27 = (z9 ? this.H : 0) - iArr[1];
                        iMin2 -= Math.max(0, i27);
                        iArr[1] = Math.max(0, -i27);
                        if (zT) {
                            g gVar5 = (g) this.f286t.getLayoutParams();
                            int measuredWidth = iMin2 - this.f286t.getMeasuredWidth();
                            int measuredHeight2 = this.f286t.getMeasuredHeight() + paddingTop;
                            this.f286t.layout(measuredWidth, paddingTop, iMin2, measuredHeight2);
                            i13 = measuredWidth - this.I;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) gVar5).bottomMargin;
                        } else {
                            i13 = iMin2;
                        }
                        if (zT2) {
                            int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f287u.getLayoutParams())).topMargin;
                            this.f287u.layout(iMin2 - this.f287u.getMeasuredWidth(), i28, iMin2, this.f287u.getMeasuredHeight() + i28);
                            i14 = iMin2 - this.I;
                        } else {
                            i14 = iMin2;
                        }
                        if (z9) {
                            iMin2 = Math.min(i13, i14);
                        }
                        iMax = i22;
                    } else {
                        int i29 = (z9 ? this.H : 0) - iArr[0];
                        iMax = Math.max(0, i29) + i22;
                        iArr[0] = Math.max(0, -i29);
                        if (zT) {
                            g gVar6 = (g) this.f286t.getLayoutParams();
                            int measuredWidth2 = this.f286t.getMeasuredWidth() + iMax;
                            int measuredHeight3 = this.f286t.getMeasuredHeight() + paddingTop;
                            this.f286t.layout(iMax, paddingTop, measuredWidth2, measuredHeight3);
                            i11 = measuredWidth2 + this.I;
                            paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) gVar6).bottomMargin;
                        } else {
                            i11 = iMax;
                        }
                        if (zT2) {
                            int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f287u.getLayoutParams())).topMargin;
                            int measuredWidth3 = this.f287u.getMeasuredWidth() + iMax;
                            this.f287u.layout(iMax, i30, measuredWidth3, this.f287u.getMeasuredHeight() + i30);
                            i12 = measuredWidth3 + this.I;
                        } else {
                            i12 = iMax;
                        }
                        if (z9) {
                            iMax = Math.max(i11, i12);
                        }
                    }
                }
                ArrayList<View> arrayList = this.V;
                a(3, arrayList);
                size = arrayList.size();
                iP2 = iMax;
                for (i15 = 0; i15 < size; i15++) {
                    iP2 = p(arrayList.get(i15), iP2, iMin, iArr);
                }
                a(5, arrayList);
                size2 = arrayList.size();
                for (i16 = 0; i16 < size2; i16++) {
                    iMin2 = q(arrayList.get(i16), iMin2, iMin, iArr);
                }
                a(1, arrayList);
                int i31 = iArr[0];
                int i32 = iArr[1];
                size3 = arrayList.size();
                int i33 = i31;
                i17 = 0;
                int measuredWidth4 = 0;
                while (i17 < size3) {
                    View view = arrayList.get(i17);
                    g gVar7 = (g) view.getLayoutParams();
                    int i34 = i32;
                    int i35 = ((ViewGroup.MarginLayoutParams) gVar7).leftMargin - i33;
                    int i36 = ((ViewGroup.MarginLayoutParams) gVar7).rightMargin - i34;
                    int iMax3 = Math.max(0, i35);
                    int iMax4 = Math.max(0, i36);
                    int iMax5 = Math.max(0, -i35);
                    int iMax6 = Math.max(0, -i36);
                    measuredWidth4 += view.getMeasuredWidth() + iMax3 + iMax4;
                    i17++;
                    i33 = iMax5;
                    i32 = iMax6;
                }
                i19 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth4 / 2);
                int i37 = measuredWidth4 + i19;
                if (i19 >= iP2) {
                    iP2 = i37 > iMin2 ? i19 - (i37 - iMin2) : i19;
                }
                size4 = arrayList.size();
                for (i18 = 0; i18 < size4; i18++) {
                    iP2 = p(arrayList.get(i18), iP2, iMin, iArr);
                }
                arrayList.clear();
            }
            iP = p(this.f288v, paddingLeft, iMin, iArr);
        }
        iQ = i20;
        if (t(this.f292z)) {
        }
        if (t(this.s)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iP);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i20 - iQ));
        iMax = Math.max(iP, currentContentInsetLeft2);
        int iMin22 = Math.min(iQ, i20 - currentContentInsetRight2);
        if (t(this.A)) {
        }
        if (t(this.f289w)) {
        }
        zT = t(this.f286t);
        zT2 = t(this.f287u);
        if (zT) {
        }
        if (!zT2) {
        }
        if (!zT) {
            if (!zT) {
            }
            if (!zT2) {
            }
            g gVar32 = (g) c0Var.getLayoutParams();
            g gVar42 = (g) c0Var2.getLayoutParams();
            int i212 = measuredHeight;
            if (zT) {
                i10 = this.O & 112;
                int i222 = iMax;
                if (i10 == 48) {
                }
                if (z7) {
                }
            } else {
                i10 = this.O & 112;
                int i2222 = iMax;
                if (i10 == 48) {
                }
                if (z7) {
                }
            }
        }
        ArrayList<View> arrayList2 = this.V;
        a(3, arrayList2);
        size = arrayList2.size();
        iP2 = iMax;
        while (i15 < size) {
        }
        a(5, arrayList2);
        size2 = arrayList2.size();
        while (i16 < size2) {
        }
        a(1, arrayList2);
        int i312 = iArr[0];
        int i322 = iArr[1];
        size3 = arrayList2.size();
        int i332 = i312;
        i17 = 0;
        int measuredWidth42 = 0;
        while (i17 < size3) {
        }
        i19 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth42 / 2);
        int i372 = measuredWidth42 + i19;
        if (i19 >= iP2) {
        }
        size4 = arrayList2.size();
        while (i18 < size4) {
        }
        arrayList2.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public void onMeasure(int i6, int i7) {
        char c7;
        Object[] objArr;
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int iL;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z6 = i1.f13669a;
        int i8 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c7 = 0;
        } else {
            c7 = 1;
            objArr = false;
        }
        if (t(this.f288v)) {
            s(this.f288v, i6, 0, i7, this.G);
            iK = k(this.f288v) + this.f288v.getMeasuredWidth();
            iMax = Math.max(0, l(this.f288v) + this.f288v.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f288v.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (t(this.f292z)) {
            s(this.f292z, i6, 0, i7, this.G);
            iK = k(this.f292z) + this.f292z.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f292z) + this.f292z.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f292z.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        Object[] objArr2 = objArr;
        int[] iArr = this.f274a0;
        iArr[objArr2 == true ? 1 : 0] = iMax4;
        if (t(this.s)) {
            s(this.s, i6, iMax3, i7, this.G);
            iK2 = k(this.s) + this.s.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.s) + this.s.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.s.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iK2);
        iArr[c7] = Math.max(0, currentContentInsetEnd - iK2);
        if (t(this.A)) {
            iMax5 += r(this.A, i6, iMax5, i7, 0, iArr);
            iMax = Math.max(iMax, l(this.A) + this.A.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.A.getMeasuredState());
        }
        if (t(this.f289w)) {
            iMax5 += r(this.f289w, i6, iMax5, i7, 0, iArr);
            iMax = Math.max(iMax, l(this.f289w) + this.f289w.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f289w.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (((g) childAt.getLayoutParams()).f296b == 0 && t(childAt)) {
                iMax5 += r(childAt, i6, iMax5, i7, 0, iArr);
                int iMax6 = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i10 = iMax5;
        int i11 = this.J + this.K;
        int i12 = this.H + this.I;
        if (t(this.f286t)) {
            r(this.f286t, i6, i10 + i12, i7, i11, iArr);
            int iK3 = k(this.f286t) + this.f286t.getMeasuredWidth();
            iL = l(this.f286t) + this.f286t.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f286t.getMeasuredState());
            iMax2 = iK3;
        } else {
            iL = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (t(this.f287u)) {
            iMax2 = Math.max(iMax2, r(this.f287u, i6, i10 + i12, i7, i11 + iL, iArr));
            iL += l(this.f287u) + this.f287u.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f287u.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i10 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i6, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i7, iCombineMeasuredStates2 << 16);
        if (!this.f281h0) {
            i8 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            View childAt2 = getChildAt(i13);
            if (t(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i8 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i8);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.s);
        ActionMenuView actionMenuView = this.s;
        androidx.appcompat.view.menu.f fVar = actionMenuView != null ? actionMenuView.H : null;
        int i6 = iVar.f297u;
        if (i6 != 0 && this.f280g0 != null && fVar != null && (menuItemFindItem = fVar.findItem(i6)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (iVar.f298v) {
            b bVar = this.f285l0;
            removeCallbacks(bVar);
            post(bVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i6) {
        super.onRtlPropertiesChanged(i6);
        d();
        u0 u0Var = this.L;
        boolean z6 = i6 == 1;
        if (z6 == u0Var.f13737g) {
            return;
        }
        u0Var.f13737g = z6;
        if (!u0Var.h) {
            u0Var.f13731a = u0Var.f13735e;
            u0Var.f13732b = u0Var.f13736f;
            return;
        }
        if (z6) {
            int i7 = u0Var.f13734d;
            if (i7 == Integer.MIN_VALUE) {
                i7 = u0Var.f13735e;
            }
            u0Var.f13731a = i7;
            int i8 = u0Var.f13733c;
            if (i8 == Integer.MIN_VALUE) {
                i8 = u0Var.f13736f;
            }
            u0Var.f13732b = i8;
            return;
        }
        int i9 = u0Var.f13733c;
        if (i9 == Integer.MIN_VALUE) {
            i9 = u0Var.f13735e;
        }
        u0Var.f13731a = i9;
        int i10 = u0Var.f13734d;
        if (i10 == Integer.MIN_VALUE) {
            i10 = u0Var.f13736f;
        }
        u0Var.f13732b = i10;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.widget.a aVar;
        androidx.appcompat.view.menu.h hVar;
        i iVar = new i(super.onSaveInstanceState());
        f fVar = this.f280g0;
        if (fVar != null && (hVar = fVar.f294t) != null) {
            iVar.f297u = hVar.f194a;
        }
        ActionMenuView actionMenuView = this.s;
        iVar.f298v = (actionMenuView == null || (aVar = actionMenuView.L) == null || !aVar.i()) ? false : true;
        return iVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.T = false;
        }
        if (!this.T) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.T = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.T = false;
        return true;
    }

    public final int p(View view, int i6, int i7, int[] iArr) {
        g gVar = (g) view.getLayoutParams();
        int i8 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int iMax = Math.max(0, i8) + i6;
        iArr[0] = Math.max(0, -i8);
        int iJ = j(view, i7);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin + iMax;
    }

    public final int q(View view, int i6, int i7, int[] iArr) {
        g gVar = (g) view.getLayoutParams();
        int i8 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int iMax = i6 - Math.max(0, i8);
        iArr[1] = Math.max(0, -i8);
        int iJ = j(view, i7);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    public final int r(View view, int i6, int i7, int i8, int i9, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i10 = marginLayoutParams.leftMargin - iArr[0];
        int i11 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i11) + Math.max(0, i10);
        iArr[0] = Math.max(0, -i10);
        iArr[1] = Math.max(0, -i11);
        view.measure(ViewGroup.getChildMeasureSpec(i6, getPaddingRight() + getPaddingLeft() + iMax + i7, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i8, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i9, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    @Override // u0.g
    public final void removeMenuProvider(l lVar) {
        this.f275b0.a(lVar);
    }

    public final void s(View view, int i6, int i7, int i8, int i9) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i6, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i7, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i8, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i9 >= 0) {
            if (mode != 0) {
                i9 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i9);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setBackInvokedCallbackEnabled(boolean z6) {
        if (this.f284k0 != z6) {
            this.f284k0 = z6;
            u();
        }
    }

    public void setCollapseContentDescription(int i6) {
        setCollapseContentDescription(i6 != 0 ? getContext().getText(i6) : null);
    }

    public void setCollapseIcon(int i6) {
        setCollapseIcon(b0.d(getContext(), i6));
    }

    public void setCollapsible(boolean z6) {
        this.f281h0 = z6;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i6) {
        if (i6 < 0) {
            i6 = Integer.MIN_VALUE;
        }
        if (i6 != this.N) {
            this.N = i6;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i6) {
        if (i6 < 0) {
            i6 = Integer.MIN_VALUE;
        }
        if (i6 != this.M) {
            this.M = i6;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i6) {
        setLogo(b0.d(getContext(), i6));
    }

    public void setLogoDescription(int i6) {
        setLogoDescription(getContext().getText(i6));
    }

    public void setNavigationContentDescription(int i6) {
        setNavigationContentDescription(i6 != 0 ? getContext().getText(i6) : null);
    }

    public void setNavigationIcon(int i6) {
        setNavigationIcon(b0.d(getContext(), i6));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f288v.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.s.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i6) {
        if (this.C != i6) {
            this.C = i6;
            if (i6 == 0) {
                this.B = getContext();
            } else {
                this.B = new ContextThemeWrapper(getContext(), i6);
            }
        }
    }

    public void setSubtitle(int i6) {
        setSubtitle(getContext().getText(i6));
    }

    public void setSubtitleTextColor(int i6) {
        setSubtitleTextColor(ColorStateList.valueOf(i6));
    }

    public void setTitle(int i6) {
        setTitle(getContext().getText(i6));
    }

    public void setTitleMarginBottom(int i6) {
        this.K = i6;
        requestLayout();
    }

    public void setTitleMarginEnd(int i6) {
        this.I = i6;
        requestLayout();
    }

    public void setTitleMarginStart(int i6) {
        this.H = i6;
        requestLayout();
    }

    public void setTitleMarginTop(int i6) {
        this.J = i6;
        requestLayout();
    }

    public void setTitleTextColor(int i6) {
        setTitleTextColor(ColorStateList.valueOf(i6));
    }

    public final boolean t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final void u() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = e.a(this);
            f fVar = this.f280g0;
            boolean z6 = (fVar == null || fVar.f294t == null || onBackInvokedDispatcherA == null || !isAttachedToWindow() || !this.f284k0) ? false : true;
            if (z6 && this.f283j0 == null) {
                if (this.f282i0 == null) {
                    this.f282i0 = e.b(new y(6, this));
                }
                e.c(onBackInvokedDispatcherA, this.f282i0);
                this.f283j0 = onBackInvokedDispatcherA;
                return;
            }
            if (z6 || (onBackInvokedDispatcher = this.f283j0) == null) {
                return;
            }
            e.d(onBackInvokedDispatcher, this.f282i0);
            this.f283j0 = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.O = 8388627;
        this.V = new ArrayList<>();
        this.W = new ArrayList<>();
        this.f274a0 = new int[2];
        this.f275b0 = new j(new androidx.camera.camera2.interop.c(4, this));
        this.f276c0 = new ArrayList<>();
        this.f277d0 = new a();
        this.f285l0 = new b();
        Context context2 = getContext();
        int[] iArr = f.a.f12954w;
        b1 b1VarE = b1.e(R.attr.toolbarStyle, 0, context2, attributeSet, iArr);
        f0.l(this, context, iArr, attributeSet, b1VarE.f13583b, R.attr.toolbarStyle, 0);
        TypedArray typedArray = b1VarE.f13583b;
        this.D = typedArray.getResourceId(28, 0);
        this.E = typedArray.getResourceId(19, 0);
        this.O = typedArray.getInteger(0, 8388627);
        this.F = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.K = dimensionPixelOffset;
        this.J = dimensionPixelOffset;
        this.I = dimensionPixelOffset;
        this.H = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.H = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.I = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.J = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.K = dimensionPixelOffset5;
        }
        this.G = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        u0 u0Var = this.L;
        u0Var.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            u0Var.f13735e = dimensionPixelSize;
            u0Var.f13731a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            u0Var.f13736f = dimensionPixelSize2;
            u0Var.f13732b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            u0Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.M = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.N = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f290x = b1VarE.b(4);
        this.f291y = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.B = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableB = b1VarE.b(16);
        if (drawableB != null) {
            setNavigationIcon(drawableB);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableB2 = b1VarE.b(11);
        if (drawableB2 != null) {
            setLogo(drawableB2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(b1VarE.a(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(b1VarE.a(20));
        }
        if (typedArray.hasValue(14)) {
            m(typedArray.getResourceId(14, 0));
        }
        b1VarE.f();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        g gVar = new g(context, attributeSet);
        gVar.f13075a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f12935b);
        gVar.f13075a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        gVar.f296b = 0;
        return gVar;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        m mVar = this.f292z;
        if (mVar != null) {
            mVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f292z.setImageDrawable(drawable);
        } else {
            m mVar = this.f292z;
            if (mVar != null) {
                mVar.setImageDrawable(this.f290x);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f289w == null) {
                this.f289w = new o(getContext(), null, 0);
            }
            if (!o(this.f289w)) {
                b(this.f289w, true);
            }
        } else {
            o oVar = this.f289w;
            if (oVar != null && o(oVar)) {
                removeView(this.f289w);
                this.W.remove(this.f289w);
            }
        }
        o oVar2 = this.f289w;
        if (oVar2 != null) {
            oVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f289w == null) {
            this.f289w = new o(getContext(), null, 0);
        }
        o oVar = this.f289w;
        if (oVar != null) {
            oVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        m mVar = this.f288v;
        if (mVar != null) {
            mVar.setContentDescription(charSequence);
            e1.a(this.f288v, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.f288v)) {
                b(this.f288v, true);
            }
        } else {
            m mVar = this.f288v;
            if (mVar != null && o(mVar)) {
                removeView(this.f288v);
                this.W.remove(this.f288v);
            }
        }
        m mVar2 = this.f288v;
        if (mVar2 != null) {
            mVar2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            c0 c0Var = this.f287u;
            if (c0Var != null && o(c0Var)) {
                removeView(this.f287u);
                this.W.remove(this.f287u);
            }
        } else {
            if (this.f287u == null) {
                Context context = getContext();
                c0 c0Var2 = new c0(context, null);
                this.f287u = c0Var2;
                c0Var2.setSingleLine();
                this.f287u.setEllipsize(TextUtils.TruncateAt.END);
                int i6 = this.E;
                if (i6 != 0) {
                    this.f287u.setTextAppearance(context, i6);
                }
                ColorStateList colorStateList = this.S;
                if (colorStateList != null) {
                    this.f287u.setTextColor(colorStateList);
                }
            }
            if (!o(this.f287u)) {
                b(this.f287u, true);
            }
        }
        c0 c0Var3 = this.f287u;
        if (c0Var3 != null) {
            c0Var3.setText(charSequence);
        }
        this.Q = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.S = colorStateList;
        c0 c0Var = this.f287u;
        if (c0Var != null) {
            c0Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            c0 c0Var = this.f286t;
            if (c0Var != null && o(c0Var)) {
                removeView(this.f286t);
                this.W.remove(this.f286t);
            }
        } else {
            if (this.f286t == null) {
                Context context = getContext();
                c0 c0Var2 = new c0(context, null);
                this.f286t = c0Var2;
                c0Var2.setSingleLine();
                this.f286t.setEllipsize(TextUtils.TruncateAt.END);
                int i6 = this.D;
                if (i6 != 0) {
                    this.f286t.setTextAppearance(context, i6);
                }
                ColorStateList colorStateList = this.R;
                if (colorStateList != null) {
                    this.f286t.setTextColor(colorStateList);
                }
            }
            if (!o(this.f286t)) {
                b(this.f286t, true);
            }
        }
        c0 c0Var3 = this.f286t;
        if (c0Var3 != null) {
            c0Var3.setText(charSequence);
        }
        this.P = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.R = colorStateList;
        c0 c0Var = this.f286t;
        if (c0Var != null) {
            c0Var.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(h hVar) {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class f implements androidx.appcompat.view.menu.j {
        public androidx.appcompat.view.menu.f s;

        /* renamed from: t, reason: collision with root package name */
        public androidx.appcompat.view.menu.h f294t;

        public f() {
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean c() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean e(androidx.appcompat.view.menu.h hVar) {
            Toolbar toolbar = Toolbar.this;
            KeyEvent.Callback callback = toolbar.A;
            if (callback instanceof j.b) {
                ((j.b) callback).onActionViewCollapsed();
            }
            toolbar.removeView(toolbar.A);
            toolbar.removeView(toolbar.f292z);
            toolbar.A = null;
            ArrayList<View> arrayList = toolbar.W;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                toolbar.addView(arrayList.get(size));
            }
            arrayList.clear();
            this.f294t = null;
            toolbar.requestLayout();
            hVar.C = false;
            hVar.f206n.p(false);
            toolbar.u();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public final void g(Context context, androidx.appcompat.view.menu.f fVar) {
            androidx.appcompat.view.menu.h hVar;
            androidx.appcompat.view.menu.f fVar2 = this.s;
            if (fVar2 != null && (hVar = this.f294t) != null) {
                fVar2.d(hVar);
            }
            this.s = fVar;
        }

        @Override // androidx.appcompat.view.menu.j
        public final void h() {
            if (this.f294t != null) {
                androidx.appcompat.view.menu.f fVar = this.s;
                if (fVar != null) {
                    int size = fVar.f175f.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        if (this.s.getItem(i6) == this.f294t) {
                            return;
                        }
                    }
                }
                e(this.f294t);
            }
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean j(androidx.appcompat.view.menu.m mVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean k(androidx.appcompat.view.menu.h hVar) {
            Toolbar toolbar = Toolbar.this;
            toolbar.c();
            ViewParent parent = toolbar.f292z.getParent();
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f292z);
                }
                toolbar.addView(toolbar.f292z);
            }
            View actionView = hVar.getActionView();
            toolbar.A = actionView;
            this.f294t = hVar;
            ViewParent parent2 = actionView.getParent();
            if (parent2 != toolbar) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar.A);
                }
                g gVarH = Toolbar.h();
                gVarH.f13075a = (toolbar.F & 112) | 8388611;
                gVarH.f296b = 2;
                toolbar.A.setLayoutParams(gVarH);
                toolbar.addView(toolbar.A);
            }
            for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = toolbar.getChildAt(childCount);
                if (((g) childAt.getLayoutParams()).f296b != 2 && childAt != toolbar.s) {
                    toolbar.removeViewAt(childCount);
                    toolbar.W.add(childAt);
                }
            }
            toolbar.requestLayout();
            hVar.C = true;
            hVar.f206n.p(false);
            KeyEvent.Callback callback = toolbar.A;
            if (callback instanceof j.b) {
                ((j.b) callback).onActionViewExpanded();
            }
            toolbar.u();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public final void b(androidx.appcompat.view.menu.f fVar, boolean z6) {
        }
    }
}
