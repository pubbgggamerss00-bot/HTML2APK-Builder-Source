package l;

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
import com.htmltoapk.template.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class i0 extends ListView {
    public final boolean A;
    public boolean B;
    public y0.c C;
    public f D;
    public final Rect s;

    /* renamed from: t, reason: collision with root package name */
    public int f13656t;

    /* renamed from: u, reason: collision with root package name */
    public int f13657u;

    /* renamed from: v, reason: collision with root package name */
    public int f13658v;

    /* renamed from: w, reason: collision with root package name */
    public int f13659w;

    /* renamed from: x, reason: collision with root package name */
    public int f13660x;

    /* renamed from: y, reason: collision with root package name */
    public d f13661y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f13662z;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {
        public static void a(View view, float f6, float f7) {
            view.drawableHotspotChanged(f6, f7);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final Method f13663a;

        /* renamed from: b, reason: collision with root package name */
        public static final Method f13664b;

        /* renamed from: c, reason: collision with root package name */
        public static final Method f13665c;

        /* renamed from: d, reason: collision with root package name */
        public static final boolean f13666d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Boolean.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
                f13663a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f13664b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f13665c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f13666d = true;
            } catch (NoSuchMethodException e6) {
                e6.printStackTrace();
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class c {
        public static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        public static void b(AbsListView absListView, boolean z6) {
            absListView.setSelectedChildViewEnabled(z6);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class d extends i.a {

        /* renamed from: t, reason: collision with root package name */
        public boolean f13667t;

        @Override // i.a, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            if (this.f13667t) {
                super.draw(canvas);
            }
        }

        @Override // i.a, android.graphics.drawable.Drawable
        public final void setHotspot(float f6, float f7) {
            if (this.f13667t) {
                super.setHotspot(f6, f7);
            }
        }

        @Override // i.a, android.graphics.drawable.Drawable
        public final void setHotspotBounds(int i6, int i7, int i8, int i9) {
            if (this.f13667t) {
                super.setHotspotBounds(i6, i7, i8, i9);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public final boolean setState(int[] iArr) {
            if (this.f13667t) {
                return this.s.setState(iArr);
            }
            return false;
        }

        @Override // i.a, android.graphics.drawable.Drawable
        public final boolean setVisible(boolean z6, boolean z7) {
            if (this.f13667t) {
                return super.setVisible(z6, z7);
            }
            return false;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public static final Field f13668a;

        static {
            Field declaredField = null;
            try {
                declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e6) {
                e6.printStackTrace();
            }
            f13668a = declaredField;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            i0 i0Var = i0.this;
            i0Var.D = null;
            i0Var.drawableStateChanged();
        }
    }

    public i0(Context context, boolean z6) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.s = new Rect();
        this.f13656t = 0;
        this.f13657u = 0;
        this.f13658v = 0;
        this.f13659w = 0;
        this.A = z6;
        setCacheColorHint(0);
    }

    private void setSelectorEnabled(boolean z6) {
        d dVar = this.f13661y;
        if (dVar != null) {
            dVar.f13667t = z6;
        }
    }

    public final int a(int i6, int i7) {
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
        int i8 = 0;
        View view = null;
        for (int i9 = 0; i9 < count; i9++) {
            int itemViewType = adapter.getItemViewType(i9);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            view = adapter.getView(i9, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i10 = layoutParams.height;
            view.measure(i6, i10 > 0 ? View.MeasureSpec.makeMeasureSpec(i10, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i9 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i7) {
                return i7;
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
    public final boolean b(MotionEvent motionEvent, int i6) throws IllegalAccessException, IllegalArgumentException {
        boolean z6;
        boolean zA;
        boolean z7;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z8 = false;
        if (actionMasked == 1) {
            z6 = false;
        } else {
            if (actionMasked != 2) {
                z6 = actionMasked != 3;
                if (z6 || z8) {
                    this.B = false;
                    setPressed(false);
                    drawableStateChanged();
                    childAt2 = getChildAt(this.f13660x - getFirstVisiblePosition());
                    if (childAt2 != null) {
                        childAt2.setPressed(false);
                    }
                }
                if (z6) {
                    y0.c cVar = this.C;
                    if (cVar != null) {
                        if (cVar.H) {
                            cVar.d();
                        }
                        cVar.H = false;
                    }
                } else {
                    if (this.C == null) {
                        this.C = new y0.c(this);
                    }
                    y0.c cVar2 = this.C;
                    boolean z9 = cVar2.H;
                    cVar2.H = true;
                    cVar2.onTouch(this, motionEvent);
                }
                return z6;
            }
            z6 = true;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i6);
        if (iFindPointerIndex >= 0) {
            int x6 = (int) motionEvent.getX(iFindPointerIndex);
            int y2 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x6, y2);
            if (iPointToPosition == -1) {
                z8 = true;
            } else {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f6 = x6;
                float f7 = y2;
                this.B = true;
                int i7 = Build.VERSION.SDK_INT;
                a.a(this, f6, f7);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i8 = this.f13660x;
                if (i8 != -1 && (childAt = getChildAt(i8 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f13660x = iPointToPosition;
                a.a(childAt3, f6 - childAt3.getLeft(), f7 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z10 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z10) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.s;
                rect.set(left, top, right, bottom);
                rect.left -= this.f13656t;
                rect.top -= this.f13657u;
                rect.right += this.f13658v;
                rect.bottom += this.f13659w;
                if (i7 >= 33) {
                    zA = c.a(this);
                } else {
                    Field field = e.f13668a;
                    if (field != null) {
                        try {
                            zA = field.getBoolean(this);
                        } catch (IllegalAccessException e6) {
                            e6.printStackTrace();
                        }
                    } else {
                        zA = false;
                    }
                }
                if (childAt3.isEnabled() != zA) {
                    boolean z11 = !zA;
                    if (Build.VERSION.SDK_INT >= 33) {
                        c.b(this, z11);
                    } else {
                        Field field2 = e.f13668a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z11));
                            } catch (IllegalAccessException e7) {
                                e7.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z10) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    z7 = false;
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(fExactCenterX, fExactCenterY);
                } else {
                    z7 = false;
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    selector2.setHotspot(f6, f7);
                }
                setSelectorEnabled(z7);
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z6 = true;
                z8 = false;
            }
        }
        if (z6) {
            this.B = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f13660x - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
        }
        if (z6) {
        }
        return z6;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.s;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.D != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        Drawable selector = getSelector();
        if (selector != null && this.B && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.A || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.A || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.A || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.A && this.f13662z) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.D = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.D == null) {
            f fVar = new f();
            this.D = fVar;
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
                if (i6 < 30 || !b.f13666d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        b.f13663a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        b.f13664b.invoke(this, Integer.valueOf(iPointToPosition));
                        b.f13665c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e6) {
                        e6.printStackTrace();
                    } catch (InvocationTargetException e7) {
                        e7.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.B && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f13660x = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.D;
        if (fVar != null) {
            i0 i0Var = i0.this;
            i0Var.D = null;
            i0Var.removeCallbacks(fVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z6) {
        this.f13662z = z6;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar;
        if (drawable != null) {
            dVar = new d();
            Drawable drawable2 = dVar.s;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            dVar.s = drawable;
            if (drawable != null) {
                drawable.setCallback(dVar);
            }
            dVar.f13667t = true;
        } else {
            dVar = null;
        }
        this.f13661y = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f13656t = rect.left;
        this.f13657u = rect.top;
        this.f13658v = rect.right;
        this.f13659w = rect.bottom;
    }
}
