package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.basitce.htmltoapk.R;
import l.j;
import m.a0;

/* loaded from: classes.dex */
public final class m extends h implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f16540b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.appcompat.view.menu.a f16541c;

    /* renamed from: d, reason: collision with root package name */
    public final e f16542d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f16543e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16544f;

    /* renamed from: g, reason: collision with root package name */
    public final int f16545g;

    /* renamed from: h, reason: collision with root package name */
    public final a0 f16546h;

    /* renamed from: l, reason: collision with root package name */
    public PopupWindow.OnDismissListener f16549l;

    /* renamed from: m, reason: collision with root package name */
    public View f16550m;

    /* renamed from: n, reason: collision with root package name */
    public View f16551n;

    /* renamed from: p, reason: collision with root package name */
    public j.a f16552p;

    /* renamed from: q, reason: collision with root package name */
    public ViewTreeObserver f16553q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f16554r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f16555s;

    /* renamed from: t, reason: collision with root package name */
    public int f16556t;

    /* renamed from: w, reason: collision with root package name */
    public boolean f16558w;

    /* renamed from: j, reason: collision with root package name */
    public final a f16547j = new a();

    /* renamed from: k, reason: collision with root package name */
    public final b f16548k = new b();

    /* renamed from: v, reason: collision with root package name */
    public int f16557v = 0;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            m mVar = m.this;
            a0 a0Var = mVar.f16546h;
            if (!mVar.e() || a0Var.f17237x) {
                return;
            }
            View view = mVar.f16551n;
            if (view == null || !view.isShown()) {
                mVar.dismiss();
            } else {
                a0Var.a();
            }
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            m mVar = m.this;
            ViewTreeObserver viewTreeObserver = mVar.f16553q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    mVar.f16553q = view.getViewTreeObserver();
                }
                mVar.f16553q.removeGlobalOnLayoutListener(mVar.f16547j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public m(Context context, androidx.appcompat.view.menu.a aVar, View view, int i10, boolean z10) {
        this.f16540b = context;
        this.f16541c = aVar;
        this.f16543e = z10;
        this.f16542d = new e(aVar, LayoutInflater.from(context), z10, R.layout.abc_popup_menu_item_layout);
        this.f16545g = i10;
        Resources resources = context.getResources();
        this.f16544f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f16550m = view;
        this.f16546h = new a0(context, i10);
        aVar.b(this, context);
    }

    @Override // l.l
    public final void a() {
        View view;
        if (e()) {
            return;
        }
        if (this.f16554r || (view = this.f16550m) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f16551n = view;
        a0 a0Var = this.f16546h;
        m.m mVar = a0Var.f17238y;
        m.m mVar2 = a0Var.f17238y;
        mVar.setOnDismissListener(this);
        a0Var.f17229n = this;
        a0Var.f17237x = true;
        mVar2.setFocusable(true);
        View view2 = this.f16551n;
        boolean z10 = this.f16553q == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f16553q = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f16547j);
        }
        view2.addOnAttachStateChangeListener(this.f16548k);
        a0Var.f17228m = view2;
        a0Var.f17226k = this.f16557v;
        boolean z11 = this.f16555s;
        Context context = this.f16540b;
        e eVar = this.f16542d;
        if (!z11) {
            this.f16556t = h.m(eVar, context, this.f16544f);
            this.f16555s = true;
        }
        int i10 = this.f16556t;
        Rect rect = a0Var.f17235v;
        Drawable background = mVar2.getBackground();
        if (background != null) {
            background.getPadding(rect);
            a0Var.f17220d = rect.left + rect.right + i10;
        } else {
            a0Var.f17220d = i10;
        }
        mVar2.setInputMethodMode(2);
        Rect rect2 = this.f16527a;
        a0Var.f17236w = rect2 != null ? new Rect(rect2) : null;
        a0Var.a();
        a0.c cVar = a0Var.f17219c;
        cVar.setOnKeyListener(this);
        if (this.f16558w) {
            androidx.appcompat.view.menu.a aVar = this.f16541c;
            if (aVar.f631l != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) cVar, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(aVar.f631l);
                }
                frameLayout.setEnabled(false);
                cVar.addHeaderView(frameLayout, null, false);
            }
        }
        a0Var.d(eVar);
        a0Var.a();
    }

    @Override // l.j
    public final void b(androidx.appcompat.view.menu.a aVar, boolean z10) {
        if (aVar != this.f16541c) {
            return;
        }
        dismiss();
        j.a aVar2 = this.f16552p;
        if (aVar2 != null) {
            aVar2.b(aVar, z10);
        }
    }

    @Override // l.j
    public final boolean d() {
        return false;
    }

    @Override // l.l
    public final void dismiss() {
        if (e()) {
            this.f16546h.dismiss();
        }
    }

    @Override // l.l
    public final boolean e() {
        return !this.f16554r && this.f16546h.f17238y.isShowing();
    }

    @Override // l.j
    public final void g() {
        this.f16555s = false;
        e eVar = this.f16542d;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
    }

    @Override // l.l
    public final ListView h() {
        return this.f16546h.f17219c;
    }

    @Override // l.j
    public final void i(j.a aVar) {
        this.f16552p = aVar;
    }

    @Override // l.j
    public final boolean k(n nVar) {
        boolean z10;
        if (nVar.hasVisibleItems()) {
            i iVar = new i(this.f16540b, nVar, this.f16551n, this.f16543e, this.f16545g, 0);
            j.a aVar = this.f16552p;
            iVar.f16535h = aVar;
            h hVar = iVar.f16536i;
            if (hVar != null) {
                hVar.i(aVar);
            }
            int size = nVar.f625f.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    z10 = false;
                    break;
                }
                MenuItem item = nVar.getItem(i10);
                if (item.isVisible() && item.getIcon() != null) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            iVar.f16534g = z10;
            h hVar2 = iVar.f16536i;
            if (hVar2 != null) {
                hVar2.o(z10);
            }
            iVar.f16537j = this.f16549l;
            this.f16549l = null;
            this.f16541c.c(false);
            a0 a0Var = this.f16546h;
            int width = a0Var.f17221e;
            int i11 = !a0Var.f17223g ? 0 : a0Var.f17222f;
            if ((Gravity.getAbsoluteGravity(this.f16557v, this.f16550m.getLayoutDirection()) & 7) == 5) {
                width += this.f16550m.getWidth();
            }
            if (!iVar.b()) {
                if (iVar.f16532e != null) {
                    iVar.d(width, i11, true, true);
                }
            }
            j.a aVar2 = this.f16552p;
            if (aVar2 != null) {
                aVar2.c(nVar);
            }
            return true;
        }
        return false;
    }

    @Override // l.h
    public final void l(androidx.appcompat.view.menu.a aVar) {
    }

    @Override // l.h
    public final void n(View view) {
        this.f16550m = view;
    }

    @Override // l.h
    public final void o(boolean z10) {
        this.f16542d.f16500c = z10;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f16554r = true;
        this.f16541c.c(true);
        ViewTreeObserver viewTreeObserver = this.f16553q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f16553q = this.f16551n.getViewTreeObserver();
            }
            this.f16553q.removeGlobalOnLayoutListener(this.f16547j);
            this.f16553q = null;
        }
        this.f16551n.removeOnAttachStateChangeListener(this.f16548k);
        PopupWindow.OnDismissListener onDismissListener = this.f16549l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // l.h
    public final void p(int i10) {
        this.f16557v = i10;
    }

    @Override // l.h
    public final void q(int i10) {
        this.f16546h.f17221e = i10;
    }

    @Override // l.h
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f16549l = onDismissListener;
    }

    @Override // l.h
    public final void s(boolean z10) {
        this.f16558w = z10;
    }

    @Override // l.h
    public final void t(int i10) {
        a0 a0Var = this.f16546h;
        a0Var.f17222f = i10;
        a0Var.f17223g = true;
    }
}
