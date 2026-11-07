package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import com.htmltoapk.template.R;
import l.i0;
import l.o0;
import l.q;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l extends k.d implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final o0 A;
    public PopupWindow.OnDismissListener D;
    public View E;
    public View F;
    public j.a G;
    public ViewTreeObserver H;
    public boolean I;
    public boolean J;
    public int K;
    public boolean M;

    /* renamed from: t, reason: collision with root package name */
    public final Context f230t;

    /* renamed from: u, reason: collision with root package name */
    public final f f231u;

    /* renamed from: v, reason: collision with root package name */
    public final e f232v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f233w;

    /* renamed from: x, reason: collision with root package name */
    public final int f234x;

    /* renamed from: y, reason: collision with root package name */
    public final int f235y;

    /* renamed from: z, reason: collision with root package name */
    public final int f236z;
    public final a B = new a();
    public final b C = new b();
    public int L = 0;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            l lVar = l.this;
            o0 o0Var = lVar.A;
            if (!lVar.a() || o0Var.Q) {
                return;
            }
            View view = lVar.F;
            if (view == null || !view.isShown()) {
                lVar.dismiss();
            } else {
                o0Var.f();
            }
        }
    }

    public l(int i6, int i7, Context context, View view, f fVar, boolean z6) {
        this.f230t = context;
        this.f231u = fVar;
        this.f233w = z6;
        this.f232v = new e(fVar, LayoutInflater.from(context), z6, R.layout.abc_popup_menu_item_layout);
        this.f235y = i6;
        this.f236z = i7;
        Resources resources = context.getResources();
        this.f234x = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.E = view;
        this.A = new o0(context, null, i6, i7);
        fVar.b(this, context);
    }

    @Override // k.f
    public final boolean a() {
        return !this.I && this.A.R.isShowing();
    }

    @Override // androidx.appcompat.view.menu.j
    public final void b(f fVar, boolean z6) {
        if (fVar != this.f231u) {
            return;
        }
        dismiss();
        j.a aVar = this.G;
        if (aVar != null) {
            aVar.b(fVar, z6);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void d(j.a aVar) {
        this.G = aVar;
    }

    @Override // k.f
    public final void dismiss() {
        if (a()) {
            this.A.dismiss();
        }
    }

    @Override // k.f
    public final void f() {
        View view;
        if (a()) {
            return;
        }
        if (this.I || (view = this.E) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.F = view;
        o0 o0Var = this.A;
        q qVar = o0Var.R;
        q qVar2 = o0Var.R;
        qVar.setOnDismissListener(this);
        o0Var.H = this;
        o0Var.Q = true;
        qVar2.setFocusable(true);
        View view2 = this.F;
        boolean z6 = this.H == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.H = viewTreeObserver;
        if (z6) {
            viewTreeObserver.addOnGlobalLayoutListener(this.B);
        }
        view2.addOnAttachStateChangeListener(this.C);
        o0Var.G = view2;
        o0Var.D = this.L;
        boolean z7 = this.J;
        Context context = this.f230t;
        e eVar = this.f232v;
        if (!z7) {
            this.K = k.d.m(eVar, context, this.f234x);
            this.J = true;
        }
        o0Var.r(this.K);
        qVar2.setInputMethodMode(2);
        Rect rect = this.s;
        o0Var.P = rect != null ? new Rect(rect) : null;
        o0Var.f();
        i0 i0Var = o0Var.f13699u;
        i0Var.setOnKeyListener(this);
        if (this.M) {
            f fVar = this.f231u;
            if (fVar.f181m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) i0Var, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(fVar.f181m);
                }
                frameLayout.setEnabled(false);
                i0Var.addHeaderView(frameLayout, null, false);
            }
        }
        o0Var.p(eVar);
        o0Var.f();
    }

    @Override // androidx.appcompat.view.menu.j
    public final void h() {
        this.J = false;
        e eVar = this.f232v;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
    }

    @Override // k.f
    public final i0 i() {
        return this.A.f13699u;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean j(m mVar) {
        boolean z6;
        if (mVar.hasVisibleItems()) {
            i iVar = new i(this.f235y, this.f236z, this.f230t, this.F, mVar, this.f233w);
            j.a aVar = this.G;
            iVar.f226i = aVar;
            k.d dVar = iVar.f227j;
            if (dVar != null) {
                dVar.d(aVar);
            }
            int size = mVar.f175f.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    z6 = false;
                    break;
                }
                MenuItem item = mVar.getItem(i6);
                if (item.isVisible() && item.getIcon() != null) {
                    z6 = true;
                    break;
                }
                i6++;
            }
            iVar.h = z6;
            k.d dVar2 = iVar.f227j;
            if (dVar2 != null) {
                dVar2.o(z6);
            }
            iVar.f228k = this.D;
            this.D = null;
            this.f231u.c(false);
            o0 o0Var = this.A;
            int width = o0Var.f13702x;
            int iO = o0Var.o();
            if ((Gravity.getAbsoluteGravity(this.L, this.E.getLayoutDirection()) & 7) == 5) {
                width += this.E.getWidth();
            }
            if (!iVar.b()) {
                if (iVar.f224f != null) {
                    iVar.d(width, iO, true, true);
                }
            }
            j.a aVar2 = this.G;
            if (aVar2 != null) {
                aVar2.c(mVar);
            }
            return true;
        }
        return false;
    }

    @Override // k.d
    public final void n(View view) {
        this.E = view;
    }

    @Override // k.d
    public final void o(boolean z6) {
        this.f232v.f165u = z6;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.I = true;
        this.f231u.c(true);
        ViewTreeObserver viewTreeObserver = this.H;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.H = this.F.getViewTreeObserver();
            }
            this.H.removeGlobalOnLayoutListener(this.B);
            this.H = null;
        }
        this.F.removeOnAttachStateChangeListener(this.C);
        PopupWindow.OnDismissListener onDismissListener = this.D;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i6, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i6 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // k.d
    public final void p(int i6) {
        this.L = i6;
    }

    @Override // k.d
    public final void q(int i6) {
        this.A.f13702x = i6;
    }

    @Override // k.d
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.D = onDismissListener;
    }

    @Override // k.d
    public final void s(boolean z6) {
        this.M = z6;
    }

    @Override // k.d
    public final void t(int i6) {
        this.A.l(i6);
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            l lVar = l.this;
            ViewTreeObserver viewTreeObserver = lVar.H;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    lVar.H = view.getViewTreeObserver();
                }
                lVar.H.removeGlobalOnLayoutListener(lVar.B);
            }
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }

    @Override // k.d
    public final void l(f fVar) {
    }
}
