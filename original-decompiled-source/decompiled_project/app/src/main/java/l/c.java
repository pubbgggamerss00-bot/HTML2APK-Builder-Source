package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
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
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.basitce.htmltoapk.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import l.j;
import m.a0;
import m.z;

/* loaded from: classes.dex */
public final class c extends h implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public ViewTreeObserver A;
    public PopupWindow.OnDismissListener B;
    public boolean C;

    /* renamed from: b, reason: collision with root package name */
    public final Context f16466b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16467c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16468d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f16469e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f16470f;

    /* renamed from: p, reason: collision with root package name */
    public View f16478p;

    /* renamed from: q, reason: collision with root package name */
    public View f16479q;

    /* renamed from: r, reason: collision with root package name */
    public int f16480r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f16481s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f16482t;

    /* renamed from: v, reason: collision with root package name */
    public int f16483v;

    /* renamed from: w, reason: collision with root package name */
    public int f16484w;

    /* renamed from: y, reason: collision with root package name */
    public boolean f16486y;

    /* renamed from: z, reason: collision with root package name */
    public j.a f16487z;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f16471g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f16472h = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final a f16473j = new a();

    /* renamed from: k, reason: collision with root package name */
    public final b f16474k = new b();

    /* renamed from: l, reason: collision with root package name */
    public final C0165c f16475l = new C0165c();

    /* renamed from: m, reason: collision with root package name */
    public int f16476m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f16477n = 0;

    /* renamed from: x, reason: collision with root package name */
    public boolean f16485x = false;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            c cVar = c.this;
            ArrayList arrayList = cVar.f16472h;
            if (!cVar.e() || arrayList.size() <= 0) {
                return;
            }
            int i10 = 0;
            if (((d) arrayList.get(0)).f16491a.f17237x) {
                return;
            }
            View view = cVar.f16479q;
            if (view == null || !view.isShown()) {
                cVar.dismiss();
                return;
            }
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((d) obj).f16491a.a();
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
            c cVar = c.this;
            ViewTreeObserver viewTreeObserver = cVar.A;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    cVar.A = view.getViewTreeObserver();
                }
                cVar.A.removeGlobalOnLayoutListener(cVar.f16473j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: l.c$c, reason: collision with other inner class name */
    public class C0165c implements z {
        public C0165c() {
        }

        @Override // m.z
        public final void b(androidx.appcompat.view.menu.a aVar, MenuItem menuItem) {
            c.this.f16470f.removeCallbacksAndMessages(aVar);
        }

        @Override // m.z
        public final void c(androidx.appcompat.view.menu.a aVar, f fVar) {
            c cVar = c.this;
            Handler handler = cVar.f16470f;
            handler.removeCallbacksAndMessages(null);
            ArrayList arrayList = cVar.f16472h;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (aVar == ((d) arrayList.get(i10)).f16492b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            handler.postAtTime(new l.d(this, i11 < arrayList.size() ? (d) arrayList.get(i11) : null, fVar, aVar), aVar, SystemClock.uptimeMillis() + 200);
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final a0 f16491a;

        /* renamed from: b, reason: collision with root package name */
        public final androidx.appcompat.view.menu.a f16492b;

        /* renamed from: c, reason: collision with root package name */
        public final int f16493c;

        public d(a0 a0Var, androidx.appcompat.view.menu.a aVar, int i10) {
            this.f16491a = a0Var;
            this.f16492b = aVar;
            this.f16493c = i10;
        }
    }

    public c(Context context, View view, int i10, boolean z10) {
        this.f16466b = context;
        this.f16478p = view;
        this.f16468d = i10;
        this.f16469e = z10;
        this.f16480r = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f16467c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f16470f = new Handler();
    }

    @Override // l.l
    public final void a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (e()) {
            return;
        }
        ArrayList arrayList = this.f16471g;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            u((androidx.appcompat.view.menu.a) obj);
        }
        arrayList.clear();
        View view = this.f16478p;
        this.f16479q = view;
        if (view != null) {
            boolean z10 = this.A == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.A = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f16473j);
            }
            this.f16479q.addOnAttachStateChangeListener(this.f16474k);
        }
    }

    @Override // l.j
    public final void b(androidx.appcompat.view.menu.a aVar, boolean z10) {
        ArrayList arrayList = this.f16472h;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (aVar == ((d) arrayList.get(i10)).f16492b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 < 0) {
            return;
        }
        int i11 = i10 + 1;
        if (i11 < arrayList.size()) {
            ((d) arrayList.get(i11)).f16492b.c(false);
        }
        d dVar = (d) arrayList.remove(i10);
        androidx.appcompat.view.menu.a aVar2 = dVar.f16492b;
        a0 a0Var = dVar.f16491a;
        m.m mVar = a0Var.f17238y;
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = aVar2.f637r;
        Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null || jVar == this) {
                copyOnWriteArrayList.remove(next);
            }
        }
        if (this.C) {
            a0.a.b(mVar, null);
            mVar.setAnimationStyle(0);
        }
        a0Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f16480r = ((d) arrayList.get(size2 - 1)).f16493c;
        } else {
            this.f16480r = this.f16478p.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z10) {
                ((d) arrayList.get(0)).f16492b.c(false);
                return;
            }
            return;
        }
        dismiss();
        j.a aVar3 = this.f16487z;
        if (aVar3 != null) {
            aVar3.b(aVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.A;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.A.removeGlobalOnLayoutListener(this.f16473j);
            }
            this.A = null;
        }
        this.f16479q.removeOnAttachStateChangeListener(this.f16474k);
        this.B.onDismiss();
    }

    @Override // l.j
    public final boolean d() {
        return false;
    }

    @Override // l.l
    public final void dismiss() {
        ArrayList arrayList = this.f16472h;
        int size = arrayList.size();
        if (size > 0) {
            d[] dVarArr = (d[]) arrayList.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f16491a.f17238y.isShowing()) {
                    dVar.f16491a.dismiss();
                }
            }
        }
    }

    @Override // l.l
    public final boolean e() {
        ArrayList arrayList = this.f16472h;
        return arrayList.size() > 0 && ((d) arrayList.get(0)).f16491a.f17238y.isShowing();
    }

    @Override // l.j
    public final void g() {
        ArrayList arrayList = this.f16472h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ListAdapter adapter = ((d) obj).f16491a.f17219c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((e) adapter).notifyDataSetChanged();
        }
    }

    @Override // l.l
    public final ListView h() {
        ArrayList arrayList = this.f16472h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((d) l.b.b(arrayList, 1)).f16491a.f17219c;
    }

    @Override // l.j
    public final void i(j.a aVar) {
        this.f16487z = aVar;
    }

    @Override // l.j
    public final boolean k(n nVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ArrayList arrayList = this.f16472h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            d dVar = (d) obj;
            if (nVar == dVar.f16492b) {
                dVar.f16491a.f17219c.requestFocus();
                return true;
            }
        }
        if (!nVar.hasVisibleItems()) {
            return false;
        }
        l(nVar);
        j.a aVar = this.f16487z;
        if (aVar != null) {
            aVar.c(nVar);
        }
        return true;
    }

    @Override // l.h
    public final void l(androidx.appcompat.view.menu.a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        aVar.b(this, this.f16466b);
        if (e()) {
            u(aVar);
        } else {
            this.f16471g.add(aVar);
        }
    }

    @Override // l.h
    public final void n(View view) {
        if (this.f16478p != view) {
            this.f16478p = view;
            this.f16477n = Gravity.getAbsoluteGravity(this.f16476m, view.getLayoutDirection());
        }
    }

    @Override // l.h
    public final void o(boolean z10) {
        this.f16485x = z10;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        d dVar;
        ArrayList arrayList = this.f16472h;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) arrayList.get(i10);
            if (!dVar.f16491a.f17238y.isShowing()) {
                break;
            } else {
                i10++;
            }
        }
        if (dVar != null) {
            dVar.f16492b.c(false);
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
        if (this.f16476m != i10) {
            this.f16476m = i10;
            this.f16477n = Gravity.getAbsoluteGravity(i10, this.f16478p.getLayoutDirection());
        }
    }

    @Override // l.h
    public final void q(int i10) {
        this.f16481s = true;
        this.f16483v = i10;
    }

    @Override // l.h
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.B = onDismissListener;
    }

    @Override // l.h
    public final void s(boolean z10) {
        this.f16486y = z10;
    }

    @Override // l.h
    public final void t(int i10) {
        this.f16482t = true;
        this.f16484w = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(androidx.appcompat.view.menu.a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z10;
        int i10;
        View childAt;
        d dVar;
        int i11;
        int i12;
        MenuItem item;
        e eVar;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f16466b;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        e eVar2 = new e(aVar, layoutInflaterFrom, this.f16469e, R.layout.abc_cascading_menu_item_layout);
        int i13 = 1;
        if (!e() && this.f16485x) {
            eVar2.f16500c = true;
        } else if (e()) {
            int size = aVar.f625f.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size) {
                    z10 = false;
                    break;
                }
                MenuItem item2 = aVar.getItem(i14);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z10 = true;
                    break;
                }
                i14++;
            }
            eVar2.f16500c = z10;
        }
        int iM = h.m(eVar2, context, this.f16467c);
        a0 a0Var = new a0(context, this.f16468d);
        a0Var.B = this.f16475l;
        a0Var.f17229n = this;
        m.m mVar = a0Var.f17238y;
        mVar.setOnDismissListener(this);
        a0Var.f17228m = this.f16478p;
        a0Var.f17226k = this.f16477n;
        a0Var.f17237x = true;
        mVar.setFocusable(true);
        mVar.setInputMethodMode(2);
        a0Var.d(eVar2);
        Drawable background = mVar.getBackground();
        if (background != null) {
            Rect rect = a0Var.f17235v;
            background.getPadding(rect);
            a0Var.f17220d = rect.left + rect.right + iM;
        } else {
            a0Var.f17220d = iM;
        }
        a0Var.f17226k = this.f16477n;
        ArrayList arrayList = this.f16472h;
        if (arrayList.size() > 0) {
            dVar = (d) l.b.b(arrayList, 1);
            androidx.appcompat.view.menu.a aVar2 = dVar.f16492b;
            int size2 = aVar2.f625f.size();
            int i15 = 0;
            while (true) {
                if (i15 >= size2) {
                    i10 = i13;
                    item = null;
                    break;
                }
                item = aVar2.getItem(i15);
                if (item.hasSubMenu()) {
                    i10 = i13;
                    if (aVar == item.getSubMenu()) {
                        break;
                    }
                } else {
                    i10 = i13;
                }
                i15++;
                i13 = i10;
            }
            if (item == null) {
                childAt = null;
            } else {
                a0.c cVar = dVar.f16491a.f17219c;
                ListAdapter adapter = cVar.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    eVar = (e) headerViewListAdapter.getWrappedAdapter();
                } else {
                    eVar = (e) adapter;
                    headersCount = 0;
                }
                int count = eVar.getCount();
                int i16 = 0;
                while (true) {
                    if (i16 >= count) {
                        i16 = -1;
                        break;
                    } else if (item == eVar.getItem(i16)) {
                        break;
                    } else {
                        i16++;
                    }
                }
                if (i16 != -1 && (firstVisiblePosition = (i16 + headersCount) - cVar.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < cVar.getChildCount()) {
                    childAt = cVar.getChildAt(firstVisiblePosition);
                }
            }
        } else {
            i10 = 1;
            childAt = null;
            dVar = null;
        }
        if (childAt != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = a0.C;
                if (method != null) {
                    try {
                        method.invoke(mVar, Boolean.FALSE);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                a0.b.a(mVar, false);
            }
            a0.a.a(mVar, null);
            a0.c cVar2 = ((d) arrayList.get(arrayList.size() - 1)).f16491a.f17219c;
            int[] iArr = new int[2];
            cVar2.getLocationOnScreen(iArr);
            Rect rect2 = new Rect();
            this.f16479q.getWindowVisibleDisplayFrame(rect2);
            if (this.f16480r == i10) {
                i11 = (cVar2.getWidth() + iArr[0]) + iM > rect2.right ? 0 : 1;
                boolean z11 = i11 != 1;
                this.f16480r = i11;
                a0Var.f17228m = childAt;
                if ((this.f16477n & 5) == 5) {
                    i12 = 0;
                    iM = z11 ? childAt.getWidth() : 0 - iM;
                } else if (z11) {
                    i12 = 0;
                } else {
                    i12 = 0;
                    iM = 0 - childAt.getWidth();
                }
                a0Var.f17221e = iM;
                a0Var.f17225j = true;
                a0Var.f17224h = true;
                a0Var.f17222f = i12;
                a0Var.f17223g = true;
            } else {
                if (iArr[0] - iM >= 0) {
                    i11 = 0;
                }
                if (i11 != 1) {
                }
                this.f16480r = i11;
                a0Var.f17228m = childAt;
                if ((this.f16477n & 5) == 5) {
                }
                a0Var.f17221e = iM;
                a0Var.f17225j = true;
                a0Var.f17224h = true;
                a0Var.f17222f = i12;
                a0Var.f17223g = true;
            }
        } else {
            if (this.f16481s) {
                a0Var.f17221e = this.f16483v;
            }
            if (this.f16482t) {
                a0Var.f17222f = this.f16484w;
                a0Var.f17223g = true;
            }
            Rect rect3 = this.f16527a;
            a0Var.f17236w = rect3 != null ? new Rect(rect3) : null;
        }
        arrayList.add(new d(a0Var, aVar, this.f16480r));
        a0Var.a();
        a0.c cVar3 = a0Var.f17219c;
        cVar3.setOnKeyListener(this);
        if (dVar == null && this.f16486y && aVar.f631l != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) cVar3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(aVar.f631l);
            cVar3.addHeaderView(frameLayout, null, false);
            a0Var.a();
        }
    }
}
