package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import com.htmltoapk.template.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import l.i0;
import l.n0;
import l.o0;
import l.q;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b extends k.d implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public View G;
    public View H;
    public int I;
    public boolean J;
    public boolean K;
    public int L;
    public int M;
    public boolean O;
    public j.a P;
    public ViewTreeObserver Q;
    public PopupWindow.OnDismissListener R;
    public boolean S;

    /* renamed from: t, reason: collision with root package name */
    public final Context f145t;

    /* renamed from: u, reason: collision with root package name */
    public final int f146u;

    /* renamed from: v, reason: collision with root package name */
    public final int f147v;

    /* renamed from: w, reason: collision with root package name */
    public final int f148w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f149x;

    /* renamed from: y, reason: collision with root package name */
    public final Handler f150y;

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f151z = new ArrayList();
    public final ArrayList A = new ArrayList();
    public final a B = new a();
    public final ViewOnAttachStateChangeListenerC0006b C = new ViewOnAttachStateChangeListenerC0006b();
    public final c D = new c();
    public int E = 0;
    public int F = 0;
    public boolean N = false;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            b bVar = b.this;
            ArrayList arrayList = bVar.A;
            if (!bVar.a() || arrayList.size() <= 0) {
                return;
            }
            int i6 = 0;
            if (((d) arrayList.get(0)).f152a.Q) {
                return;
            }
            View view = bVar.H;
            if (view == null || !view.isShown()) {
                bVar.dismiss();
                return;
            }
            int size = arrayList.size();
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6++;
                ((d) obj).f152a.f();
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class c implements n0 {
        public c() {
        }

        @Override // l.n0
        public final void c(f fVar, h hVar) {
            b bVar = b.this;
            Handler handler = bVar.f150y;
            handler.removeCallbacksAndMessages(null);
            ArrayList arrayList = bVar.A;
            int size = arrayList.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    i6 = -1;
                    break;
                } else if (fVar == ((d) arrayList.get(i6)).f153b) {
                    break;
                } else {
                    i6++;
                }
            }
            if (i6 == -1) {
                return;
            }
            int i7 = i6 + 1;
            handler.postAtTime(new androidx.appcompat.view.menu.c(this, i7 < arrayList.size() ? (d) arrayList.get(i7) : null, hVar, fVar), fVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // l.n0
        public final void g(f fVar, MenuItem menuItem) {
            b.this.f150y.removeCallbacksAndMessages(fVar);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final o0 f152a;

        /* renamed from: b, reason: collision with root package name */
        public final f f153b;

        /* renamed from: c, reason: collision with root package name */
        public final int f154c;

        public d(o0 o0Var, f fVar, int i6) {
            this.f152a = o0Var;
            this.f153b = fVar;
            this.f154c = i6;
        }
    }

    public b(Context context, View view, int i6, int i7, boolean z6) {
        this.f145t = context;
        this.G = view;
        this.f147v = i6;
        this.f148w = i7;
        this.f149x = z6;
        this.I = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f146u = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f150y = new Handler();
    }

    @Override // k.f
    public final boolean a() {
        ArrayList arrayList = this.A;
        return arrayList.size() > 0 && ((d) arrayList.get(0)).f152a.R.isShowing();
    }

    @Override // androidx.appcompat.view.menu.j
    public final void b(f fVar, boolean z6) {
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                i6 = -1;
                break;
            } else if (fVar == ((d) arrayList.get(i6)).f153b) {
                break;
            } else {
                i6++;
            }
        }
        if (i6 < 0) {
            return;
        }
        int i7 = i6 + 1;
        if (i7 < arrayList.size()) {
            ((d) arrayList.get(i7)).f153b.c(false);
        }
        d dVar = (d) arrayList.remove(i6);
        f fVar2 = dVar.f153b;
        o0 o0Var = dVar.f152a;
        q qVar = o0Var.R;
        fVar2.r(this);
        if (this.S) {
            o0.a.b(qVar, null);
            qVar.setAnimationStyle(0);
        }
        o0Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.I = ((d) arrayList.get(size2 - 1)).f154c;
        } else {
            this.I = this.G.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z6) {
                ((d) arrayList.get(0)).f153b.c(false);
                return;
            }
            return;
        }
        dismiss();
        j.a aVar = this.P;
        if (aVar != null) {
            aVar.b(fVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.Q;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.Q.removeGlobalOnLayoutListener(this.B);
            }
            this.Q = null;
        }
        this.H.removeOnAttachStateChangeListener(this.C);
        this.R.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void d(j.a aVar) {
        this.P = aVar;
    }

    @Override // k.f
    public final void dismiss() {
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        if (size > 0) {
            d[] dVarArr = (d[]) arrayList.toArray(new d[size]);
            for (int i6 = size - 1; i6 >= 0; i6--) {
                d dVar = dVarArr[i6];
                if (dVar.f152a.R.isShowing()) {
                    dVar.f152a.dismiss();
                }
            }
        }
    }

    @Override // k.f
    public final void f() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f151z;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            u((f) obj);
        }
        arrayList.clear();
        View view = this.G;
        this.H = view;
        if (view != null) {
            boolean z6 = this.Q == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.Q = viewTreeObserver;
            if (z6) {
                viewTreeObserver.addOnGlobalLayoutListener(this.B);
            }
            this.H.addOnAttachStateChangeListener(this.C);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void h() {
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            ListAdapter adapter = ((d) obj).f152a.f13699u.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((e) adapter).notifyDataSetChanged();
        }
    }

    @Override // k.f
    public final i0 i() {
        ArrayList arrayList = this.A;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((d) arrayList.get(arrayList.size() - 1)).f152a.f13699u;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean j(m mVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            d dVar = (d) obj;
            if (mVar == dVar.f153b) {
                dVar.f152a.f13699u.requestFocus();
                return true;
            }
        }
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        l(mVar);
        j.a aVar = this.P;
        if (aVar != null) {
            aVar.c(mVar);
        }
        return true;
    }

    @Override // k.d
    public final void l(f fVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        fVar.b(this, this.f145t);
        if (a()) {
            u(fVar);
        } else {
            this.f151z.add(fVar);
        }
    }

    @Override // k.d
    public final void n(View view) {
        if (this.G != view) {
            this.G = view;
            this.F = Gravity.getAbsoluteGravity(this.E, view.getLayoutDirection());
        }
    }

    @Override // k.d
    public final void o(boolean z6) {
        this.N = z6;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        d dVar;
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) arrayList.get(i6);
            if (!dVar.f152a.R.isShowing()) {
                break;
            } else {
                i6++;
            }
        }
        if (dVar != null) {
            dVar.f153b.c(false);
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
        if (this.E != i6) {
            this.E = i6;
            this.F = Gravity.getAbsoluteGravity(i6, this.G.getLayoutDirection());
        }
    }

    @Override // k.d
    public final void q(int i6) {
        this.J = true;
        this.L = i6;
    }

    @Override // k.d
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.R = onDismissListener;
    }

    @Override // k.d
    public final void s(boolean z6) {
        this.O = z6;
    }

    @Override // k.d
    public final void t(int i6) {
        this.K = true;
        this.M = i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(f fVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z6;
        int i6;
        d dVar;
        View childAt;
        int i7;
        int i8;
        int i9;
        int width;
        MenuItem item;
        e eVar;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f145t;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        e eVar2 = new e(fVar, layoutInflaterFrom, this.f149x, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.N) {
            eVar2.f165u = true;
        } else if (a()) {
            int size = fVar.f175f.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    z6 = false;
                    break;
                }
                MenuItem item2 = fVar.getItem(i10);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z6 = true;
                    break;
                }
                i10++;
            }
            eVar2.f165u = z6;
        }
        int iM = k.d.m(eVar2, context, this.f146u);
        o0 o0Var = new o0(context, null, this.f147v, this.f148w);
        o0Var.U = this.D;
        o0Var.H = this;
        o0Var.R.setOnDismissListener(this);
        o0Var.G = this.G;
        o0Var.D = this.F;
        o0Var.Q = true;
        o0Var.R.setFocusable(true);
        o0Var.R.setInputMethodMode(2);
        o0Var.p(eVar2);
        o0Var.r(iM);
        o0Var.D = this.F;
        ArrayList arrayList = this.A;
        if (arrayList.size() > 0) {
            dVar = (d) arrayList.get(arrayList.size() - 1);
            f fVar2 = dVar.f153b;
            int size2 = fVar2.f175f.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    item = null;
                    break;
                }
                item = fVar2.getItem(i11);
                if (item.hasSubMenu() && fVar == item.getSubMenu()) {
                    break;
                } else {
                    i11++;
                }
            }
            if (item == null) {
                i6 = 1;
                childAt = null;
            } else {
                i0 i0Var = dVar.f152a.f13699u;
                ListAdapter adapter = i0Var.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    eVar = (e) headerViewListAdapter.getWrappedAdapter();
                } else {
                    eVar = (e) adapter;
                    headersCount = 0;
                }
                int count = eVar.getCount();
                i6 = 1;
                int i12 = 0;
                while (true) {
                    if (i12 >= count) {
                        i12 = -1;
                        break;
                    } else if (item == eVar.getItem(i12)) {
                        break;
                    } else {
                        i12++;
                    }
                }
                if (i12 != -1 && (firstVisiblePosition = (i12 + headersCount) - i0Var.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < i0Var.getChildCount()) {
                    childAt = i0Var.getChildAt(firstVisiblePosition);
                }
            }
            if (childAt == null) {
                int i13 = Build.VERSION.SDK_INT;
                q qVar = o0Var.R;
                if (i13 <= 28) {
                    Method method = o0.V;
                    if (method != null) {
                        try {
                            method.invoke(qVar, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    o0.b.a(qVar, false);
                }
                o0.a.a(o0Var.R, null);
                i0 i0Var2 = ((d) arrayList.get(arrayList.size() - 1)).f152a.f13699u;
                int[] iArr = new int[2];
                i0Var2.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                this.H.getWindowVisibleDisplayFrame(rect);
                if (this.I == i6) {
                    i7 = (i0Var2.getWidth() + iArr[0]) + iM > rect.right ? 0 : 1;
                } else if (iArr[0] - iM < 0) {
                }
                boolean z7 = i7 == 1;
                this.I = i7;
                if (Build.VERSION.SDK_INT >= 26) {
                    o0Var.G = childAt;
                    i9 = 0;
                    i8 = 0;
                } else {
                    int[] iArr2 = new int[2];
                    this.G.getLocationOnScreen(iArr2);
                    int[] iArr3 = new int[2];
                    childAt.getLocationOnScreen(iArr3);
                    if ((this.F & 7) == 5) {
                        iArr2[0] = this.G.getWidth() + iArr2[0];
                        iArr3[0] = childAt.getWidth() + iArr3[0];
                    }
                    i8 = iArr3[0] - iArr2[0];
                    i9 = iArr3[1] - iArr2[1];
                }
                if ((this.F & 5) != 5) {
                    width = z7 ? i8 + childAt.getWidth() : i8 - iM;
                    o0Var.f13702x = width;
                    o0Var.C = true;
                    o0Var.B = true;
                    o0Var.l(i9);
                } else if (z7) {
                    width = i8 + iM;
                    o0Var.f13702x = width;
                    o0Var.C = true;
                    o0Var.B = true;
                    o0Var.l(i9);
                } else {
                    iM = childAt.getWidth();
                    o0Var.f13702x = width;
                    o0Var.C = true;
                    o0Var.B = true;
                    o0Var.l(i9);
                }
            } else {
                if (this.J) {
                    o0Var.f13702x = this.L;
                }
                if (this.K) {
                    o0Var.l(this.M);
                }
                Rect rect2 = this.s;
                o0Var.P = rect2 != null ? new Rect(rect2) : null;
            }
            arrayList.add(new d(o0Var, fVar, this.I));
            o0Var.f();
            i0 i0Var3 = o0Var.f13699u;
            i0Var3.setOnKeyListener(this);
            if (dVar == null || !this.O || fVar.f181m == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) i0Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(fVar.f181m);
            i0Var3.addHeaderView(frameLayout, null, false);
            o0Var.f();
            return;
        }
        i6 = 1;
        dVar = null;
        childAt = null;
        if (childAt == null) {
        }
        arrayList.add(new d(o0Var, fVar, this.I));
        o0Var.f();
        i0 i0Var32 = o0Var.f13699u;
        i0Var32.setOnKeyListener(this);
        if (dVar == null) {
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    public class ViewOnAttachStateChangeListenerC0006b implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC0006b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            b bVar = b.this;
            ViewTreeObserver viewTreeObserver = bVar.Q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    bVar.Q = view.getViewTreeObserver();
                }
                bVar.Q.removeGlobalOnLayoutListener(bVar.B);
            }
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }
}
