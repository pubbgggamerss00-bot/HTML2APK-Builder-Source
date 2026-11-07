package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.Toolbar.f;
import androidx.appcompat.widget.a;
import l.g0;
import u0.f0;
import u0.n0;
import y5.b0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f314a;

    /* renamed from: b, reason: collision with root package name */
    public int f315b;

    /* renamed from: c, reason: collision with root package name */
    public View f316c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f317d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f318e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f319f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f320g;
    public CharSequence h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f321i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f322j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f323k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f324l;

    /* renamed from: m, reason: collision with root package name */
    public androidx.appcompat.widget.a f325m;

    /* renamed from: n, reason: collision with root package name */
    public int f326n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f327o;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a extends f5.b {
        public boolean s = false;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f328t;

        public a(int i6) {
            this.f328t = i6;
        }

        @Override // u0.o0
        public final void a() {
            if (this.s) {
                return;
            }
            d.this.f314a.setVisibility(this.f328t);
        }

        @Override // f5.b, u0.o0
        public final void b() {
            d.this.f314a.setVisibility(0);
        }

        @Override // f5.b, u0.o0
        public final void c() {
            this.s = true;
        }
    }

    @Override // l.g0
    public final void a(Menu menu, j.a aVar) {
        Toolbar toolbar = this.f314a;
        if (this.f325m == null) {
            this.f325m = new androidx.appcompat.widget.a(toolbar.getContext());
        }
        androidx.appcompat.widget.a aVar2 = this.f325m;
        aVar2.f141w = aVar;
        f fVar = (f) menu;
        if (fVar == null && toolbar.s == null) {
            return;
        }
        toolbar.f();
        f fVar2 = toolbar.s.H;
        if (fVar2 == fVar) {
            return;
        }
        if (fVar2 != null) {
            fVar2.r(toolbar.f279f0);
            fVar2.r(toolbar.f280g0);
        }
        if (toolbar.f280g0 == null) {
            toolbar.f280g0 = toolbar.new f();
        }
        aVar2.I = true;
        if (fVar != null) {
            fVar.b(aVar2, toolbar.B);
            fVar.b(toolbar.f280g0, toolbar.B);
        } else {
            aVar2.g(toolbar.B, null);
            toolbar.f280g0.g(toolbar.B, null);
            aVar2.h();
            toolbar.f280g0.h();
        }
        toolbar.s.setPopupTheme(toolbar.C);
        toolbar.s.setPresenter(aVar2);
        toolbar.f279f0 = aVar2;
        toolbar.u();
    }

    @Override // l.g0
    public final boolean b() {
        androidx.appcompat.widget.a aVar;
        ActionMenuView actionMenuView = this.f314a.s;
        return (actionMenuView == null || (aVar = actionMenuView.L) == null || !aVar.i()) ? false : true;
    }

    @Override // l.g0
    public final void c() {
        this.f324l = true;
    }

    @Override // l.g0
    public final void collapseActionView() {
        Toolbar.f fVar = this.f314a.f280g0;
        h hVar = fVar == null ? null : fVar.f294t;
        if (hVar != null) {
            hVar.collapseActionView();
        }
    }

    @Override // l.g0
    public final boolean d() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.f314a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.s) != null && actionMenuView.K;
    }

    @Override // l.g0
    public final boolean e() {
        androidx.appcompat.widget.a aVar;
        ActionMenuView actionMenuView = this.f314a.s;
        if (actionMenuView == null || (aVar = actionMenuView.L) == null) {
            return false;
        }
        return aVar.M != null || aVar.i();
    }

    @Override // l.g0
    public final boolean f() {
        androidx.appcompat.widget.a aVar;
        ActionMenuView actionMenuView = this.f314a.s;
        return (actionMenuView == null || (aVar = actionMenuView.L) == null || !aVar.f()) ? false : true;
    }

    @Override // l.g0
    public final boolean g() {
        androidx.appcompat.widget.a aVar;
        ActionMenuView actionMenuView = this.f314a.s;
        return (actionMenuView == null || (aVar = actionMenuView.L) == null || !aVar.l()) ? false : true;
    }

    @Override // l.g0
    public final Context getContext() {
        return this.f314a.getContext();
    }

    @Override // l.g0
    public final CharSequence getTitle() {
        return this.f314a.getTitle();
    }

    @Override // l.g0
    public final void h() {
        androidx.appcompat.widget.a aVar;
        ActionMenuView actionMenuView = this.f314a.s;
        if (actionMenuView == null || (aVar = actionMenuView.L) == null) {
            return;
        }
        aVar.f();
        a.C0007a c0007a = aVar.L;
        if (c0007a == null || !c0007a.b()) {
            return;
        }
        c0007a.f227j.dismiss();
    }

    @Override // l.g0
    public final boolean i() {
        Toolbar.f fVar = this.f314a.f280g0;
        return (fVar == null || fVar.f294t == null) ? false : true;
    }

    @Override // l.g0
    public final void j(int i6) {
        View view;
        Toolbar toolbar = this.f314a;
        int i7 = this.f315b ^ i6;
        this.f315b = i6;
        if (i7 != 0) {
            if ((i7 & 4) != 0) {
                if ((i6 & 4) != 0) {
                    s();
                }
                if ((this.f315b & 4) != 0) {
                    Drawable drawable = this.f319f;
                    if (drawable == null) {
                        drawable = this.f327o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i7 & 3) != 0) {
                t();
            }
            if ((i7 & 8) != 0) {
                if ((i6 & 8) != 0) {
                    toolbar.setTitle(this.h);
                    toolbar.setSubtitle(this.f321i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i7 & 16) == 0 || (view = this.f316c) == null) {
                return;
            }
            if ((i6 & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    @Override // l.g0
    public final void l(int i6) {
        this.f318e = i6 != 0 ? b0.d(this.f314a.getContext(), i6) : null;
        t();
    }

    @Override // l.g0
    public final n0 m(int i6, long j6) {
        n0 n0VarA = f0.a(this.f314a);
        n0VarA.a(i6 == 0 ? 1.0f : 0.0f);
        n0VarA.c(j6);
        n0VarA.d(new a(i6));
        return n0VarA;
    }

    @Override // l.g0
    public final void n(int i6) {
        this.f314a.setVisibility(i6);
    }

    @Override // l.g0
    public final int o() {
        return this.f315b;
    }

    @Override // l.g0
    public final void p() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // l.g0
    public final void q() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // l.g0
    public final void r(boolean z6) {
        this.f314a.setCollapsible(z6);
    }

    public final void s() {
        Toolbar toolbar = this.f314a;
        if ((this.f315b & 4) != 0) {
            if (TextUtils.isEmpty(this.f322j)) {
                toolbar.setNavigationContentDescription(this.f326n);
            } else {
                toolbar.setNavigationContentDescription(this.f322j);
            }
        }
    }

    @Override // l.g0
    public final void setIcon(int i6) {
        setIcon(i6 != 0 ? b0.d(this.f314a.getContext(), i6) : null);
    }

    @Override // l.g0
    public final void setWindowCallback(Window.Callback callback) {
        this.f323k = callback;
    }

    @Override // l.g0
    public final void setWindowTitle(CharSequence charSequence) {
        if (this.f320g) {
            return;
        }
        Toolbar toolbar = this.f314a;
        this.h = charSequence;
        if ((this.f315b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (this.f320g) {
                f0.n(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final void t() {
        Drawable drawable;
        int i6 = this.f315b;
        if ((i6 & 2) == 0) {
            drawable = null;
        } else if ((i6 & 1) == 0 || (drawable = this.f318e) == null) {
            drawable = this.f317d;
        }
        this.f314a.setLogo(drawable);
    }

    @Override // l.g0
    public final void setIcon(Drawable drawable) {
        this.f317d = drawable;
        t();
    }

    @Override // l.g0
    public final void k() {
    }
}
