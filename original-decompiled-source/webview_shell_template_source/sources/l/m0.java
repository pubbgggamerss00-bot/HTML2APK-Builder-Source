package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class m0 implements k.f {
    public static final Method S;
    public static final Method T;
    public boolean A;
    public boolean B;
    public boolean C;
    public d F;
    public View G;
    public AdapterView.OnItemClickListener H;
    public AdapterView.OnItemSelectedListener I;
    public final Handler N;
    public Rect P;
    public boolean Q;
    public final q R;
    public final Context s;

    /* renamed from: t, reason: collision with root package name */
    public ListAdapter f13698t;

    /* renamed from: u, reason: collision with root package name */
    public i0 f13699u;

    /* renamed from: x, reason: collision with root package name */
    public int f13702x;

    /* renamed from: y, reason: collision with root package name */
    public int f13703y;

    /* renamed from: v, reason: collision with root package name */
    public final int f13700v = -2;

    /* renamed from: w, reason: collision with root package name */
    public int f13701w = -2;

    /* renamed from: z, reason: collision with root package name */
    public final int f13704z = 1002;
    public int D = 0;
    public final int E = Integer.MAX_VALUE;
    public final g J = new g();
    public final f K = new f();
    public final e L = new e();
    public final c M = new c();
    public final Rect O = new Rect();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {
        public static int a(PopupWindow popupWindow, View view, int i6, boolean z6) {
            return popupWindow.getMaxAvailableHeight(view, i6, z6);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b {
        public static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        public static void b(PopupWindow popupWindow, boolean z6) {
            popupWindow.setIsClippedToScreen(z6);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            i0 i0Var = m0.this.f13699u;
            if (i0Var != null) {
                i0Var.setListSelectionHidden(true);
                i0Var.requestLayout();
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class d extends DataSetObserver {
        public d() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            m0 m0Var = m0.this;
            if (m0Var.R.isShowing()) {
                m0Var.f();
            }
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            m0.this.dismiss();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class f implements View.OnTouchListener {
        public f() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            m0 m0Var = m0.this;
            g gVar = m0Var.J;
            Handler handler = m0Var.N;
            q qVar = m0Var.R;
            int action = motionEvent.getAction();
            int x6 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (action == 0 && qVar != null && qVar.isShowing() && x6 >= 0 && x6 < qVar.getWidth() && y2 >= 0 && y2 < qVar.getHeight()) {
                handler.postDelayed(gVar, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            handler.removeCallbacks(gVar);
            return false;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            m0 m0Var = m0.this;
            i0 i0Var = m0Var.f13699u;
            if (i0Var == null || !i0Var.isAttachedToWindow() || m0Var.f13699u.getCount() <= m0Var.f13699u.getChildCount() || m0Var.f13699u.getChildCount() > m0Var.E) {
                return;
            }
            m0Var.R.setInputMethodMode(2);
            m0Var.f();
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                S = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                T = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public m0(Context context, AttributeSet attributeSet, int i6, int i7) {
        int resourceId;
        this.s = context;
        this.N = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f12947o, i6, i7);
        this.f13702x = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f13703y = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.A = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        q qVar = new q(context, attributeSet, i6, i7);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.s, i6, i7);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            qVar.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        qVar.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : y5.b0.d(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.R = qVar;
        qVar.setInputMethodMode(1);
    }

    @Override // k.f
    public final boolean a() {
        return this.R.isShowing();
    }

    public final int b() {
        return this.f13702x;
    }

    public final void d(int i6) {
        this.f13702x = i6;
    }

    @Override // k.f
    public final void dismiss() {
        q qVar = this.R;
        qVar.dismiss();
        qVar.setContentView(null);
        this.f13699u = null;
        this.N.removeCallbacks(this.J);
    }

    @Override // k.f
    public final void f() {
        int i6;
        int paddingBottom;
        i0 i0Var;
        i0 i0Var2 = this.f13699u;
        Context context = this.s;
        q qVar = this.R;
        if (i0Var2 == null) {
            i0 i0VarQ = q(context, !this.Q);
            this.f13699u = i0VarQ;
            i0VarQ.setAdapter(this.f13698t);
            this.f13699u.setOnItemClickListener(this.H);
            this.f13699u.setFocusable(true);
            this.f13699u.setFocusableInTouchMode(true);
            this.f13699u.setOnItemSelectedListener(new l0(this));
            this.f13699u.setOnScrollListener(this.L);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.I;
            if (onItemSelectedListener != null) {
                this.f13699u.setOnItemSelectedListener(onItemSelectedListener);
            }
            qVar.setContentView(this.f13699u);
        }
        Drawable background = qVar.getBackground();
        Rect rect = this.O;
        if (background != null) {
            background.getPadding(rect);
            int i7 = rect.top;
            i6 = rect.bottom + i7;
            if (!this.A) {
                this.f13703y = -i7;
            }
        } else {
            rect.setEmpty();
            i6 = 0;
        }
        int iA = a.a(qVar, this.G, this.f13703y, qVar.getInputMethodMode() == 2);
        int i8 = this.f13700v;
        if (i8 == -1) {
            paddingBottom = iA + i6;
        } else {
            int i9 = this.f13701w;
            int iA2 = this.f13699u.a(i9 != -2 ? i9 != -1 ? View.MeasureSpec.makeMeasureSpec(i9, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.f13699u.getPaddingBottom() + this.f13699u.getPaddingTop() + i6 : 0);
        }
        boolean z6 = qVar.getInputMethodMode() == 2;
        qVar.setWindowLayoutType(this.f13704z);
        if (qVar.isShowing()) {
            if (this.G.isAttachedToWindow()) {
                int width = this.f13701w;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.G.getWidth();
                }
                if (i8 == -1) {
                    i8 = z6 ? paddingBottom : -1;
                    if (z6) {
                        qVar.setWidth(this.f13701w == -1 ? -1 : 0);
                        qVar.setHeight(0);
                    } else {
                        qVar.setWidth(this.f13701w == -1 ? -1 : 0);
                        qVar.setHeight(-1);
                    }
                } else if (i8 == -2) {
                    i8 = paddingBottom;
                }
                qVar.setOutsideTouchable(true);
                int i10 = width;
                View view = this.G;
                int i11 = this.f13702x;
                int i12 = this.f13703y;
                int i13 = i10 < 0 ? -1 : i10;
                if (i8 < 0) {
                    i8 = -1;
                }
                qVar.update(view, i11, i12, i13, i8);
                return;
            }
            return;
        }
        int width2 = this.f13701w;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.G.getWidth();
        }
        if (i8 == -1) {
            i8 = -1;
        } else if (i8 == -2) {
            i8 = paddingBottom;
        }
        qVar.setWidth(width2);
        qVar.setHeight(i8);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = S;
            if (method != null) {
                try {
                    method.invoke(qVar, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            b.b(qVar, true);
        }
        qVar.setOutsideTouchable(true);
        qVar.setTouchInterceptor(this.K);
        if (this.C) {
            qVar.setOverlapAnchor(this.B);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = T;
            if (method2 != null) {
                try {
                    method2.invoke(qVar, this.P);
                } catch (Exception e6) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e6);
                }
            }
        } else {
            b.a(qVar, this.P);
        }
        qVar.showAsDropDown(this.G, this.f13702x, this.f13703y, this.D);
        this.f13699u.setSelection(-1);
        if ((!this.Q || this.f13699u.isInTouchMode()) && (i0Var = this.f13699u) != null) {
            i0Var.setListSelectionHidden(true);
            i0Var.requestLayout();
        }
        if (this.Q) {
            return;
        }
        this.N.post(this.M);
    }

    public final Drawable h() {
        return this.R.getBackground();
    }

    @Override // k.f
    public final i0 i() {
        return this.f13699u;
    }

    public final void k(Drawable drawable) {
        this.R.setBackgroundDrawable(drawable);
    }

    public final void l(int i6) {
        this.f13703y = i6;
        this.A = true;
    }

    public final int o() {
        if (this.A) {
            return this.f13703y;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        d dVar = this.F;
        if (dVar == null) {
            this.F = new d();
        } else {
            ListAdapter listAdapter2 = this.f13698t;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dVar);
            }
        }
        this.f13698t = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.F);
        }
        i0 i0Var = this.f13699u;
        if (i0Var != null) {
            i0Var.setAdapter(this.f13698t);
        }
    }

    public i0 q(Context context, boolean z6) {
        return new i0(context, z6);
    }

    public final void r(int i6) {
        Drawable background = this.R.getBackground();
        if (background == null) {
            this.f13701w = i6;
            return;
        }
        Rect rect = this.O;
        background.getPadding(rect);
        this.f13701w = rect.left + rect.right + i6;
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class e implements AbsListView.OnScrollListener {
        public e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i6) {
            m0 m0Var = m0.this;
            g gVar = m0Var.J;
            q qVar = m0Var.R;
            if (i6 != 1 || qVar.getInputMethodMode() == 2 || qVar.getContentView() == null) {
                return;
            }
            m0Var.N.removeCallbacks(gVar);
            gVar.run();
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i6, int i7, int i8) {
        }
    }
}
