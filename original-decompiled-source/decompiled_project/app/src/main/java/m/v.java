package m;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.basitce.htmltoapk.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class v extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f17185a;

    /* renamed from: b, reason: collision with root package name */
    public int f17186b;

    /* renamed from: c, reason: collision with root package name */
    public int f17187c;

    /* renamed from: d, reason: collision with root package name */
    public int f17188d;

    /* renamed from: e, reason: collision with root package name */
    public int f17189e;

    /* renamed from: f, reason: collision with root package name */
    public int f17190f;

    /* renamed from: g, reason: collision with root package name */
    public d f17191g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17192h;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f17193j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f17194k;

    /* renamed from: l, reason: collision with root package name */
    public c4.c f17195l;

    /* renamed from: m, reason: collision with root package name */
    public f f17196m;

    public static class a {
        public static void a(View view, float f10, float f11) {
            view.drawableHotspotChanged(f10, f11);
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final Method f17197a;

        /* renamed from: b, reason: collision with root package name */
        public static final Method f17198b;

        /* renamed from: c, reason: collision with root package name */
        public static final Method f17199c;

        /* renamed from: d, reason: collision with root package name */
        public static final boolean f17200d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Boolean.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
                f17197a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f17198b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f17199c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f17200d = true;
            } catch (NoSuchMethodException e10) {
                e10.printStackTrace();
            }
        }
    }

    public static class c {
        public static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        public static void b(AbsListView absListView, boolean z10) {
            absListView.setSelectedChildViewEnabled(z10);
        }
    }

    public static class d extends j.a {

        /* renamed from: b, reason: collision with root package name */
        public boolean f17201b;

        @Override // j.a, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            if (this.f17201b) {
                super.draw(canvas);
            }
        }

        @Override // j.a, android.graphics.drawable.Drawable
        public final void setHotspot(float f10, float f11) {
            if (this.f17201b) {
                super.setHotspot(f10, f11);
            }
        }

        @Override // j.a, android.graphics.drawable.Drawable
        public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
            if (this.f17201b) {
                super.setHotspotBounds(i10, i11, i12, i13);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public final boolean setState(int[] iArr) {
            if (this.f17201b) {
                return this.f14585a.setState(iArr);
            }
            return false;
        }

        @Override // j.a, android.graphics.drawable.Drawable
        public final boolean setVisible(boolean z10, boolean z11) {
            if (this.f17201b) {
                return super.setVisible(z10, z11);
            }
            return false;
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public static final Field f17202a;

        static {
            Field declaredField = null;
            try {
                declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                e10.printStackTrace();
            }
            f17202a = declaredField;
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            v vVar = v.this;
            vVar.f17196m = null;
            vVar.drawableStateChanged();
        }
    }

    public v(Context context, boolean z10) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f17185a = new Rect();
        this.f17186b = 0;
        this.f17187c = 0;
        this.f17188d = 0;
        this.f17189e = 0;
        this.f17193j = z10;
        setCacheColorHint(0);
    }

    private void setSelectorEnabled(boolean z10) {
        d dVar = this.f17191g;
        if (dVar != null) {
            dVar.f17201b = z10;
        }
    }

    public final int a(int i10, int i11) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i12 = 0;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = adapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            view = adapter.getView(i13, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i14 = layoutParams.height;
            view.measure(i10, i14 > 0 ? View.MeasureSpec.makeMeasureSpec(i14, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i13 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i11) {
                return i11;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(MotionEvent motionEvent, int i10) throws IllegalAccessException, IllegalArgumentException {
        boolean z10;
        boolean zA;
        boolean z11;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z12 = false;
        if (actionMasked == 1) {
            z10 = false;
        } else {
            if (actionMasked != 2) {
                z10 = actionMasked != 3;
                if (z10 || z12) {
                    this.f17194k = false;
                    setPressed(false);
                    drawableStateChanged();
                    childAt2 = getChildAt(this.f17190f - getFirstVisiblePosition());
                    if (childAt2 != null) {
                        childAt2.setPressed(false);
                    }
                }
                if (z10) {
                    c4.c cVar = this.f17195l;
                    if (cVar != null) {
                        if (cVar.f4748r) {
                            cVar.d();
                        }
                        cVar.f4748r = false;
                    }
                } else {
                    if (this.f17195l == null) {
                        this.f17195l = new c4.c(this);
                    }
                    c4.c cVar2 = this.f17195l;
                    boolean z13 = cVar2.f4748r;
                    cVar2.f4748r = true;
                    cVar2.onTouch(this, motionEvent);
                }
                return z10;
            }
            z10 = true;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i10);
        if (iFindPointerIndex >= 0) {
            int x10 = (int) motionEvent.getX(iFindPointerIndex);
            int y10 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x10, y10);
            if (iPointToPosition == -1) {
                z12 = true;
            } else {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f10 = x10;
                float f11 = y10;
                this.f17194k = true;
                int i11 = Build.VERSION.SDK_INT;
                a.a(this, f10, f11);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i12 = this.f17190f;
                if (i12 != -1 && (childAt = getChildAt(i12 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f17190f = iPointToPosition;
                a.a(childAt3, f10 - childAt3.getLeft(), f11 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z14 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z14) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f17185a;
                rect.set(left, top, right, bottom);
                rect.left -= this.f17186b;
                rect.top -= this.f17187c;
                rect.right += this.f17188d;
                rect.bottom += this.f17189e;
                if (i11 >= 33) {
                    zA = c.a(this);
                } else {
                    Field field = e.f17202a;
                    if (field != null) {
                        try {
                            zA = field.getBoolean(this);
                        } catch (IllegalAccessException e10) {
                            e10.printStackTrace();
                        }
                    } else {
                        zA = false;
                    }
                }
                if (childAt3.isEnabled() != zA) {
                    boolean z15 = !zA;
                    if (Build.VERSION.SDK_INT >= 33) {
                        c.b(this, z15);
                    } else {
                        Field field2 = e.f17202a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z15));
                            } catch (IllegalAccessException e11) {
                                e11.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z14) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    z11 = false;
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(fExactCenterX, fExactCenterY);
                } else {
                    z11 = false;
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    selector2.setHotspot(f10, f11);
                }
                setSelectorEnabled(z11);
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z10 = true;
                z12 = false;
            }
        }
        if (z10) {
            this.f17194k = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f17190f - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
        }
        if (z10) {
        }
        return z10;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f17185a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f17196m != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        Drawable selector = getSelector();
        if (selector != null && this.f17194k && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f17193j || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f17193j || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f17193j || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f17193j && this.f17192h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f17196m = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i10 = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f17196m == null) {
            f fVar = new f();
            this.f17196m = fVar;
            post(fVar);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i10 < 30 || !b.f17200d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        b.f17197a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        b.f17198b.invoke(this, Integer.valueOf(iPointToPosition));
                        b.f17199c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e10) {
                        e10.printStackTrace();
                    } catch (InvocationTargetException e11) {
                        e11.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f17194k && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f17190f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f17196m;
        if (fVar != null) {
            v vVar = v.this;
            vVar.f17196m = null;
            vVar.removeCallbacks(fVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z10) {
        this.f17192h = z10;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar = null;
        if (drawable != null) {
            d dVar2 = new d();
            Drawable drawable2 = dVar2.f14585a;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            dVar2.f14585a = drawable;
            drawable.setCallback(dVar2);
            dVar2.f17201b = true;
            dVar = dVar2;
        }
        this.f17191g = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f17186b = rect.left;
        this.f17187c = rect.top;
        this.f17188d = rect.right;
        this.f17189e = rect.bottom;
    }
}
