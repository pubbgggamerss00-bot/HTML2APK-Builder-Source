package m;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import m.a0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public class y implements l.l {
    public static final Method A;

    /* renamed from: z, reason: collision with root package name */
    public static final Method f17216z;

    /* renamed from: a, reason: collision with root package name */
    public final Context f17217a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f17218b;

    /* renamed from: c, reason: collision with root package name */
    public a0.c f17219c;

    /* renamed from: e, reason: collision with root package name */
    public int f17221e;

    /* renamed from: f, reason: collision with root package name */
    public int f17222f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17223g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17224h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f17225j;

    /* renamed from: l, reason: collision with root package name */
    public d f17227l;

    /* renamed from: m, reason: collision with root package name */
    public View f17228m;

    /* renamed from: n, reason: collision with root package name */
    public l.h f17229n;

    /* renamed from: t, reason: collision with root package name */
    public final Handler f17234t;

    /* renamed from: w, reason: collision with root package name */
    public Rect f17236w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f17237x;

    /* renamed from: y, reason: collision with root package name */
    public final m f17238y;

    /* renamed from: d, reason: collision with root package name */
    public int f17220d = -2;

    /* renamed from: k, reason: collision with root package name */
    public int f17226k = 0;

    /* renamed from: p, reason: collision with root package name */
    public final g f17230p = new g();

    /* renamed from: q, reason: collision with root package name */
    public final f f17231q = new f();

    /* renamed from: r, reason: collision with root package name */
    public final e f17232r = new e();

    /* renamed from: s, reason: collision with root package name */
    public final c f17233s = new c();

    /* renamed from: v, reason: collision with root package name */
    public final Rect f17235v = new Rect();

    public static class a {
        public static int a(PopupWindow popupWindow, View view, int i10, boolean z10) {
            return popupWindow.getMaxAvailableHeight(view, i10, z10);
        }
    }

    public static class b {
        public static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        public static void b(PopupWindow popupWindow, boolean z10) {
            popupWindow.setIsClippedToScreen(z10);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a0.c cVar = y.this.f17219c;
            if (cVar != null) {
                cVar.setListSelectionHidden(true);
                cVar.requestLayout();
            }
        }
    }

    public class d extends DataSetObserver {
        public d() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            y yVar = y.this;
            if (yVar.f17238y.isShowing()) {
                yVar.a();
            }
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            y.this.dismiss();
        }
    }

    public class e implements AbsListView.OnScrollListener {
        public e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i10) {
            y yVar = y.this;
            g gVar = yVar.f17230p;
            m mVar = yVar.f17238y;
            if (i10 != 1 || mVar.getInputMethodMode() == 2 || mVar.getContentView() == null) {
                return;
            }
            yVar.f17234t.removeCallbacks(gVar);
            gVar.run();
        }
    }

    public class f implements View.OnTouchListener {
        public f() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            y yVar = y.this;
            g gVar = yVar.f17230p;
            Handler handler = yVar.f17234t;
            m mVar = yVar.f17238y;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (action == 0 && mVar != null && mVar.isShowing() && x10 >= 0 && x10 < mVar.getWidth() && y10 >= 0 && y10 < mVar.getHeight()) {
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

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            y yVar = y.this;
            a0.c cVar = yVar.f17219c;
            if (cVar == null || !cVar.isAttachedToWindow() || yVar.f17219c.getCount() <= yVar.f17219c.getChildCount() || yVar.f17219c.getChildCount() > Integer.MAX_VALUE) {
                return;
            }
            yVar.f17238y.setInputMethodMode(2);
            yVar.a();
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f17216z = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                A = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public y(Context context, int i10) {
        int resourceId;
        this.f17217a = context;
        this.f17234t = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, g.a.f11250i, i10, 0);
        this.f17221e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f17222f = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f17223g = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        m mVar = new m(context, null, i10, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(null, g.a.f11254m, i10, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            mVar.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        mVar.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : i.a.c(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f17238y = mVar;
        mVar.setInputMethodMode(1);
    }

    @Override // l.l
    public final void a() {
        int i10;
        a0.c cVar;
        a0.c cVar2 = this.f17219c;
        Context context = this.f17217a;
        m mVar = this.f17238y;
        if (cVar2 == null) {
            a0.c cVar3 = new a0.c(context, !this.f17237x);
            cVar3.setHoverListener((a0) this);
            this.f17219c = cVar3;
            cVar3.setAdapter(this.f17218b);
            this.f17219c.setOnItemClickListener(this.f17229n);
            this.f17219c.setFocusable(true);
            this.f17219c.setFocusableInTouchMode(true);
            this.f17219c.setOnItemSelectedListener(new x(this));
            this.f17219c.setOnScrollListener(this.f17232r);
            mVar.setContentView(this.f17219c);
        }
        Drawable background = mVar.getBackground();
        Rect rect = this.f17235v;
        if (background != null) {
            background.getPadding(rect);
            int i11 = rect.top;
            i10 = rect.bottom + i11;
            if (!this.f17223g) {
                this.f17222f = -i11;
            }
        } else {
            rect.setEmpty();
            i10 = 0;
        }
        int iA = a.a(mVar, this.f17228m, this.f17222f, mVar.getInputMethodMode() == 2);
        int i12 = this.f17220d;
        int iA2 = this.f17219c.a(i12 != -2 ? i12 != -1 ? View.MeasureSpec.makeMeasureSpec(i12, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), PKIFailureInfo.systemUnavail), iA);
        int paddingBottom = iA2 + (iA2 > 0 ? this.f17219c.getPaddingBottom() + this.f17219c.getPaddingTop() + i10 : 0);
        mVar.getInputMethodMode();
        mVar.setWindowLayoutType(1002);
        if (mVar.isShowing()) {
            if (this.f17228m.isAttachedToWindow()) {
                int width = this.f17220d;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f17228m.getWidth();
                }
                mVar.setOutsideTouchable(true);
                mVar.update(this.f17228m, this.f17221e, this.f17222f, width < 0 ? -1 : width, paddingBottom < 0 ? -1 : paddingBottom);
                return;
            }
            return;
        }
        int width2 = this.f17220d;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f17228m.getWidth();
        }
        mVar.setWidth(width2);
        mVar.setHeight(paddingBottom);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f17216z;
            if (method != null) {
                try {
                    method.invoke(mVar, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            b.b(mVar, true);
        }
        mVar.setOutsideTouchable(true);
        mVar.setTouchInterceptor(this.f17231q);
        if (this.f17225j) {
            mVar.setOverlapAnchor(this.f17224h);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = A;
            if (method2 != null) {
                try {
                    method2.invoke(mVar, this.f17236w);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            b.a(mVar, this.f17236w);
        }
        mVar.showAsDropDown(this.f17228m, this.f17221e, this.f17222f, this.f17226k);
        this.f17219c.setSelection(-1);
        if ((!this.f17237x || this.f17219c.isInTouchMode()) && (cVar = this.f17219c) != null) {
            cVar.setListSelectionHidden(true);
            cVar.requestLayout();
        }
        if (this.f17237x) {
            return;
        }
        this.f17234t.post(this.f17233s);
    }

    public final void d(ListAdapter listAdapter) {
        d dVar = this.f17227l;
        if (dVar == null) {
            this.f17227l = new d();
        } else {
            ListAdapter listAdapter2 = this.f17218b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dVar);
            }
        }
        this.f17218b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f17227l);
        }
        a0.c cVar = this.f17219c;
        if (cVar != null) {
            cVar.setAdapter(this.f17218b);
        }
    }

    @Override // l.l
    public final void dismiss() {
        m mVar = this.f17238y;
        mVar.dismiss();
        mVar.setContentView(null);
        this.f17219c = null;
        this.f17234t.removeCallbacks(this.f17230p);
    }

    @Override // l.l
    public final boolean e() {
        return this.f17238y.isShowing();
    }

    @Override // l.l
    public final ListView h() {
        return this.f17219c;
    }
}
