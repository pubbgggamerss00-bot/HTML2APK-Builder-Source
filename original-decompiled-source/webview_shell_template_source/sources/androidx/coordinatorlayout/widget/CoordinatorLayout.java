package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.camera.camera2.internal.k0;
import com.google.android.gms.internal.ads.ti;
import com.google.android.gms.internal.ads.y50;
import com.htmltoapk.template.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import u0.f0;
import u0.n0;
import u0.o;
import u0.p;
import u0.q;
import u0.r;
import u0.s0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements o, p {
    public static final String L;
    public static final Class<?>[] M;
    public static final ThreadLocal<Map<String, Constructor<c>>> N;
    public static final i O;
    public static final t0.c P;
    public final int[] A;
    public View B;
    public View C;
    public g D;
    public boolean E;
    public s0 F;
    public boolean G;
    public Drawable H;
    public ViewGroup.OnHierarchyChangeListener I;
    public a J;
    public final q K;
    public final ArrayList s;

    /* renamed from: t, reason: collision with root package name */
    public final y50 f917t;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f918u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f919v;

    /* renamed from: w, reason: collision with root package name */
    public final int[] f920w;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f921x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f922y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f923z;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements r {
        public a() {
        }

        @Override // u0.r
        public final s0 d(View view, s0 s0Var) {
            s0.l lVar = s0Var.f14553a;
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!Objects.equals(coordinatorLayout.F, s0Var)) {
                coordinatorLayout.F = s0Var;
                boolean z6 = s0Var.d() > 0;
                coordinatorLayout.G = z6;
                coordinatorLayout.setWillNotDraw(!z6 && coordinatorLayout.getBackground() == null);
                if (!lVar.n()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i6 = 0; i6 < childCount; i6++) {
                        View childAt = coordinatorLayout.getChildAt(i6);
                        WeakHashMap<View, n0> weakHashMap = f0.f14480a;
                        if (childAt.getFitsSystemWindows() && ((f) childAt.getLayoutParams()).f924a != null && lVar.n()) {
                            break;
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return s0Var;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface b {
        c getBehavior();
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class c<V extends View> {
        public c() {
        }

        public boolean a(View view) {
            return false;
        }

        public boolean b(View view, View view2) {
            return false;
        }

        public boolean d(CoordinatorLayout coordinatorLayout, V v2, View view) {
            return false;
        }

        public boolean g(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
            return false;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, V v2, int i6) {
            return false;
        }

        public boolean i(CoordinatorLayout coordinatorLayout, View view, int i6, int i7, int i8) {
            return false;
        }

        public boolean j(View view) {
            return false;
        }

        public void l(CoordinatorLayout coordinatorLayout, View view, int i6, int i7, int i8, int[] iArr) {
            iArr[0] = iArr[0] + i7;
            iArr[1] = iArr[1] + i8;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, V v2, Rect rect, boolean z6) {
            return false;
        }

        public Parcelable o(View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean p(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i6, int i7) {
            return false;
        }

        public boolean r(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
            return false;
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public void f() {
        }

        public void c(f fVar) {
        }

        public void e(CoordinatorLayout coordinatorLayout, View view) {
        }

        public void n(View view, Parcelable parcelable) {
        }

        public void q(CoordinatorLayout coordinatorLayout, V v2, View view, int i6) {
        }

        public void k(CoordinatorLayout coordinatorLayout, V v2, View view, int i6, int i7, int[] iArr, int i8) {
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface d {
        Class<? extends c> value();
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class e implements ViewGroup.OnHierarchyChangeListener {
        public e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.I;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            coordinatorLayout.j(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.I;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class g implements ViewTreeObserver.OnPreDrawListener {
        public g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            CoordinatorLayout.this.j(0);
            return true;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class h extends b1.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: u, reason: collision with root package name */
        public SparseArray<Parcelable> f939u;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public static class a implements Parcelable.ClassLoaderCreator<h> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i6) {
                return new h[i6];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i6 = parcel.readInt();
            int[] iArr = new int[i6];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f939u = new SparseArray<>(i6);
            for (int i7 = 0; i7 < i6; i7++) {
                this.f939u.append(iArr[i7], parcelableArray[i7]);
            }
        }

        @Override // b1.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            SparseArray<Parcelable> sparseArray = this.f939u;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i7 = 0; i7 < size; i7++) {
                iArr[i7] = this.f939u.keyAt(i7);
                parcelableArr[i7] = this.f939u.valueAt(i7);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i6);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class i implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            WeakHashMap<View, n0> weakHashMap = f0.f14480a;
            float f6 = f0.d.f(view);
            float f7 = f0.d.f(view2);
            if (f6 > f7) {
                return -1;
            }
            return f6 < f7 ? 1 : 0;
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        L = r02 != null ? r02.getName() : null;
        O = new i();
        M = new Class[]{Context.class, AttributeSet.class};
        N = new ThreadLocal<>();
        P = new t0.c();
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.s = new ArrayList();
        this.f917t = new y50(3);
        this.f918u = new ArrayList();
        this.f919v = new ArrayList();
        this.f920w = new int[2];
        this.f921x = new int[2];
        this.K = new q();
        int[] iArr = f0.a.f12958a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.A = intArray;
            float f6 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i6 = 0; i6 < length; i6++) {
                this.A[i6] = (int) (r1[i6] * f6);
            }
        }
        this.H = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        r();
        super.setOnHierarchyChangeListener(new e());
        WeakHashMap<View, n0> weakHashMap = f0.f14480a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect a() {
        Rect rect = (Rect) P.c();
        return rect == null ? new Rect() : rect;
    }

    public static void f(int i6, Rect rect, Rect rect2, f fVar, int i7, int i8) {
        int i9 = fVar.f926c;
        if (i9 == 0) {
            i9 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i9, i6);
        int i10 = fVar.f927d;
        if ((i10 & 7) == 0) {
            i10 |= 8388611;
        }
        if ((i10 & 112) == 0) {
            i10 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i10, i6);
        int i11 = absoluteGravity & 7;
        int i12 = absoluteGravity & 112;
        int i13 = absoluteGravity2 & 7;
        int i14 = absoluteGravity2 & 112;
        int iWidth = i13 != 1 ? i13 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i14 != 16 ? i14 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i11 == 1) {
            iWidth -= i7 / 2;
        } else if (i11 != 5) {
            iWidth -= i7;
        }
        if (i12 == 16) {
            iHeight -= i8 / 2;
        } else if (i12 != 80) {
            iHeight -= i8;
        }
        rect2.set(iWidth, iHeight, i7 + iWidth, i8 + iHeight);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f h(View view) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f925b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                c cVar = fVar.f924a;
                if (cVar != behavior) {
                    if (cVar != null) {
                        cVar.f();
                    }
                    fVar.f924a = behavior;
                    fVar.f925b = true;
                    if (behavior != null) {
                        behavior.c(fVar);
                    }
                }
                fVar.f925b = true;
                return fVar;
            }
            d dVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                dVar = (d) superclass.getAnnotation(d.class);
                if (dVar != null) {
                    break;
                }
            }
            if (dVar != null) {
                try {
                    c cVarNewInstance = dVar.value().getDeclaredConstructor(null).newInstance(null);
                    c cVar2 = fVar.f924a;
                    if (cVar2 != cVarNewInstance) {
                        if (cVar2 != null) {
                            cVar2.f();
                        }
                        fVar.f924a = cVarNewInstance;
                        fVar.f925b = true;
                        if (cVarNewInstance != null) {
                            cVarNewInstance.c(fVar);
                        }
                    }
                } catch (Exception e6) {
                    Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e6);
                }
            }
            fVar.f925b = true;
        }
        return fVar;
    }

    public static void p(View view, int i6) {
        f fVar = (f) view.getLayoutParams();
        int i7 = fVar.f931i;
        if (i7 != i6) {
            WeakHashMap<View, n0> weakHashMap = f0.f14480a;
            view.offsetLeftAndRight(i6 - i7);
            fVar.f931i = i6;
        }
    }

    public static void q(View view, int i6) {
        f fVar = (f) view.getLayoutParams();
        int i7 = fVar.f932j;
        if (i7 != i6) {
            WeakHashMap<View, n0> weakHashMap = f0.f14480a;
            view.offsetTopAndBottom(i6 - i7);
            fVar.f932j = i6;
        }
    }

    public final void b(f fVar, Rect rect, int i6, int i7) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i6) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i7) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(iMax, iMax2, i6 + iMax, i7 + iMax2);
    }

    public final void c(View view, Rect rect, boolean z6) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z6) {
            e(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    public final ArrayList d(View view) {
        w.g gVar = (w.g) this.f917t.f10860t;
        int i6 = gVar.f14850u;
        ArrayList arrayList = null;
        for (int i7 = 0; i7 < i6; i7++) {
            ArrayList arrayList2 = (ArrayList) gVar.i(i7);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(gVar.f(i7));
            }
        }
        ArrayList arrayList3 = this.f919v;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j6) {
        c cVar = ((f) view.getLayoutParams()).f924a;
        if (cVar != null) {
            cVar.getClass();
        }
        return super.drawChild(canvas, view, j6);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.H;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public final void e(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = g0.a.f13202a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = g0.a.f13202a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        g0.a.a(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = g0.a.f13203b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int g(int i6) {
        int[] iArr = this.A;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i6);
            return 0;
        }
        if (i6 >= 0 && i6 < iArr.length) {
            return iArr[i6];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i6 + " out of range for " + this);
        return 0;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        n();
        return Collections.unmodifiableList(this.s);
    }

    public final s0 getLastWindowInsets() {
        return this.F;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        q qVar = this.K;
        return qVar.f14523b | qVar.f14522a;
    }

    public Drawable getStatusBarBackground() {
        return this.H;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final boolean i(View view, int i6, int i7) {
        t0.c cVar = P;
        Rect rectA = a();
        e(view, rectA);
        try {
            return rectA.contains(i6, i7);
        } finally {
            rectA.setEmpty();
            cVar.d(rectA);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(int i6) {
        int i7;
        Rect rect;
        int i8;
        ArrayList arrayList;
        boolean zD;
        boolean z6;
        boolean z7;
        int width;
        int i9;
        int i10;
        int i11;
        int height;
        int i12;
        int i13;
        int i14;
        ArrayList arrayList2;
        f fVar;
        int i15;
        int i16;
        Rect rect2;
        int i17;
        View view;
        c cVar;
        WeakHashMap<View, n0> weakHashMap = f0.f14480a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList3 = this.s;
        int size = arrayList3.size();
        Rect rectA = a();
        Rect rectA2 = a();
        Rect rectA3 = a();
        int i18 = 0;
        while (true) {
            t0.c cVar2 = P;
            if (i18 >= size) {
                Rect rect3 = rectA3;
                rectA.setEmpty();
                cVar2.d(rectA);
                rectA2.setEmpty();
                cVar2.d(rectA2);
                rect3.setEmpty();
                cVar2.d(rect3);
                return;
            }
            View view2 = (View) arrayList3.get(i18);
            f fVar2 = (f) view2.getLayoutParams();
            if (i6 != 0 || view2.getVisibility() != 8) {
                int i19 = 0;
                while (i19 < i18) {
                    if (fVar2.f934l == ((View) arrayList3.get(i19))) {
                        f fVar3 = (f) view2.getLayoutParams();
                        if (fVar3.f933k != null) {
                            Rect rectA4 = a();
                            Rect rectA5 = a();
                            f fVar4 = fVar2;
                            Rect rectA6 = a();
                            e(fVar3.f933k, rectA4);
                            c(view2, rectA5, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            View view3 = view2;
                            int measuredHeight = view3.getMeasuredHeight();
                            arrayList2 = arrayList3;
                            fVar = fVar4;
                            i15 = i19;
                            layoutDirection = layoutDirection;
                            i17 = i18;
                            view = view3;
                            f(layoutDirection, rectA4, rectA6, fVar3, measuredWidth, measuredHeight);
                            i16 = size;
                            rect2 = rectA3;
                            boolean z8 = (rectA6.left == rectA5.left && rectA6.top == rectA5.top) ? false : true;
                            b(fVar3, rectA6, measuredWidth, measuredHeight);
                            int i20 = rectA6.left - rectA5.left;
                            int i21 = rectA6.top - rectA5.top;
                            if (i20 != 0) {
                                WeakHashMap<View, n0> weakHashMap2 = f0.f14480a;
                                view.offsetLeftAndRight(i20);
                            }
                            if (i21 != 0) {
                                WeakHashMap<View, n0> weakHashMap3 = f0.f14480a;
                                view.offsetTopAndBottom(i21);
                            }
                            if (z8 && (cVar = fVar3.f924a) != null) {
                                cVar.d(this, view, fVar3.f933k);
                            }
                            rectA4.setEmpty();
                            cVar2.d(rectA4);
                            rectA5.setEmpty();
                            cVar2.d(rectA5);
                            rectA6.setEmpty();
                            cVar2.d(rectA6);
                        } else {
                            arrayList2 = arrayList3;
                            fVar = fVar2;
                            i15 = i19;
                            i16 = size;
                            rect2 = rectA3;
                            i17 = i18;
                            view = view2;
                        }
                    }
                    i19 = i15 + 1;
                    fVar2 = fVar;
                    view2 = view;
                    arrayList3 = arrayList2;
                    size = i16;
                    i18 = i17;
                    rectA3 = rect2;
                }
                ArrayList arrayList4 = arrayList3;
                f fVar5 = fVar2;
                int i22 = size;
                Rect rect4 = rectA3;
                i7 = i18;
                View view4 = view2;
                c(view4, rectA2, true);
                if (fVar5.f930g != 0 && !rectA2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(fVar5.f930g, layoutDirection);
                    int i23 = absoluteGravity & 112;
                    if (i23 == 48) {
                        rectA.top = Math.max(rectA.top, rectA2.bottom);
                    } else if (i23 == 80) {
                        rectA.bottom = Math.max(rectA.bottom, getHeight() - rectA2.top);
                    }
                    int i24 = absoluteGravity & 7;
                    if (i24 == 3) {
                        rectA.left = Math.max(rectA.left, rectA2.right);
                    } else if (i24 == 5) {
                        rectA.right = Math.max(rectA.right, getWidth() - rectA2.left);
                    }
                }
                if (fVar5.h != 0 && view4.getVisibility() == 0) {
                    WeakHashMap<View, n0> weakHashMap4 = f0.f14480a;
                    if (view4.isLaidOut() && view4.getWidth() > 0 && view4.getHeight() > 0) {
                        f fVar6 = (f) view4.getLayoutParams();
                        c cVar3 = fVar6.f924a;
                        Rect rectA7 = a();
                        Rect rectA8 = a();
                        rectA8.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                        if (cVar3 == null || !cVar3.a(view4)) {
                            rectA7.set(rectA8);
                        } else if (!rectA8.contains(rectA7)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectA7.toShortString() + " | Bounds:" + rectA8.toShortString());
                        }
                        rectA8.setEmpty();
                        cVar2.d(rectA8);
                        if (rectA7.isEmpty()) {
                            rectA7.setEmpty();
                            cVar2.d(rectA7);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(fVar6.h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i13 = (rectA7.top - ((ViewGroup.MarginLayoutParams) fVar6).topMargin) - fVar6.f932j) >= (i14 = rectA.top)) {
                                z6 = false;
                            } else {
                                q(view4, i14 - i13);
                                z6 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectA7.bottom) - ((ViewGroup.MarginLayoutParams) fVar6).bottomMargin) + fVar6.f932j) < (i12 = rectA.bottom)) {
                                q(view4, height - i12);
                                z6 = true;
                            }
                            if (!z6) {
                                q(view4, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i10 = (rectA7.left - ((ViewGroup.MarginLayoutParams) fVar6).leftMargin) - fVar6.f931i) >= (i11 = rectA.left)) {
                                z7 = false;
                            } else {
                                p(view4, i11 - i10);
                                z7 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectA7.right) - ((ViewGroup.MarginLayoutParams) fVar6).rightMargin) + fVar6.f931i) < (i9 = rectA.right)) {
                                p(view4, width - i9);
                                z7 = true;
                            }
                            if (!z7) {
                                p(view4, 0);
                            }
                            rectA7.setEmpty();
                            cVar2.d(rectA7);
                        }
                    }
                }
                if (i6 != 2) {
                    rect = rect4;
                    rect.set(((f) view4.getLayoutParams()).f938p);
                    if (rect.equals(rectA2)) {
                        arrayList = arrayList4;
                        i8 = i22;
                    } else {
                        ((f) view4.getLayoutParams()).f938p.set(rectA2);
                    }
                } else {
                    rect = rect4;
                }
                int i25 = i7 + 1;
                i8 = i22;
                while (true) {
                    arrayList = arrayList4;
                    if (i25 >= i8) {
                        break;
                    }
                    View view5 = (View) arrayList.get(i25);
                    f fVar7 = (f) view5.getLayoutParams();
                    c cVar4 = fVar7.f924a;
                    if (cVar4 != null && cVar4.b(view5, view4)) {
                        if (i6 == 0 && fVar7.f937o) {
                            fVar7.f937o = false;
                        } else {
                            if (i6 != 2) {
                                zD = cVar4.d(this, view5, view4);
                            } else {
                                cVar4.e(this, view4);
                                zD = true;
                            }
                            if (i6 == 1) {
                                fVar7.f937o = zD;
                            }
                        }
                    }
                    i25++;
                    arrayList4 = arrayList;
                }
            } else {
                arrayList = arrayList3;
                i8 = size;
                rect = rectA3;
                i7 = i18;
            }
            i18 = i7 + 1;
            rectA3 = rect;
            size = i8;
            arrayList3 = arrayList;
        }
    }

    public final void k(View view, int i6) {
        Rect rectA;
        Rect rectA2;
        f fVar = (f) view.getLayoutParams();
        View view2 = fVar.f933k;
        if (view2 == null && fVar.f929f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        t0.c cVar = P;
        if (view2 != null) {
            rectA = a();
            rectA2 = a();
            try {
                e(view2, rectA);
                f fVar2 = (f) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                f(i6, rectA, rectA2, fVar2, measuredWidth, measuredHeight);
                b(fVar2, rectA2, measuredWidth, measuredHeight);
                view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
                return;
            } finally {
                rectA.setEmpty();
                cVar.d(rectA);
                rectA2.setEmpty();
                cVar.d(rectA2);
            }
        }
        int i7 = fVar.f928e;
        if (i7 < 0) {
            f fVar3 = (f) view.getLayoutParams();
            rectA = a();
            rectA.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar3).bottomMargin);
            if (this.F != null) {
                WeakHashMap<View, n0> weakHashMap = f0.f14480a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectA.left = this.F.b() + rectA.left;
                    rectA.top = this.F.d() + rectA.top;
                    rectA.right -= this.F.c();
                    rectA.bottom -= this.F.a();
                }
            }
            rectA2 = a();
            int i8 = fVar3.f926c;
            if ((i8 & 7) == 0) {
                i8 |= 8388611;
            }
            if ((i8 & 112) == 0) {
                i8 |= 48;
            }
            Gravity.apply(i8, view.getMeasuredWidth(), view.getMeasuredHeight(), rectA, rectA2, i6);
            view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
            return;
        }
        f fVar4 = (f) view.getLayoutParams();
        int i9 = fVar4.f926c;
        if (i9 == 0) {
            i9 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i9, i6);
        int i10 = absoluteGravity & 7;
        int i11 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i6 == 1) {
            i7 = width - i7;
        }
        int iG = g(i7) - measuredWidth2;
        if (i10 == 1) {
            iG += measuredWidth2 / 2;
        } else if (i10 == 5) {
            iG += measuredWidth2;
        }
        int i12 = i11 != 16 ? i11 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar4).leftMargin, Math.min(iG, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) fVar4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar4).topMargin, Math.min(i12, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) fVar4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    public final void l(View view, int i6, int i7, int i8) {
        measureChildWithMargins(view, i6, i7, i8, 0);
    }

    public final boolean m(MotionEvent motionEvent, int i6) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f918u;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i7 = childCount - 1; i7 >= 0; i7--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i7) : i7));
        }
        i iVar = O;
        if (iVar != null) {
            Collections.sort(arrayList, iVar);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zG = false;
        for (int i8 = 0; i8 < size; i8++) {
            View view = (View) arrayList.get(i8);
            c cVar = ((f) view.getLayoutParams()).f924a;
            if (zG && actionMasked != 0) {
                if (cVar != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i6 == 0) {
                        cVar.g(this, view, motionEventObtain);
                    } else if (i6 == 1) {
                        cVar.r(this, view, motionEventObtain);
                    }
                }
            } else if (!zG && cVar != null) {
                if (i6 == 0) {
                    zG = cVar.g(this, view, motionEvent);
                } else if (i6 == 1) {
                    zG = cVar.r(this, view, motionEvent);
                }
                if (zG) {
                    this.B = view;
                }
            }
        }
        arrayList.clear();
        return zG;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n() throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        View viewFindViewById;
        c cVar;
        ArrayList arrayList = this.s;
        arrayList.clear();
        y50 y50Var = this.f917t;
        w.g gVar = (w.g) y50Var.f10860t;
        ti tiVar = (ti) y50Var.s;
        w.g gVar2 = (w.g) y50Var.f10860t;
        int i6 = gVar.f14850u;
        for (int i7 = 0; i7 < i6; i7++) {
            ArrayList arrayList2 = (ArrayList) gVar.i(i7);
            if (arrayList2 != null) {
                arrayList2.clear();
                tiVar.d(arrayList2);
            }
        }
        gVar.clear();
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            f fVarH = h(childAt);
            int i9 = fVarH.f929f;
            if (i9 == -1) {
                fVarH.f934l = null;
                fVarH.f933k = null;
            } else {
                View view = fVarH.f933k;
                if (view == null || view.getId() != i9) {
                    viewFindViewById = findViewById(i9);
                    fVarH.f933k = viewFindViewById;
                    if (viewFindViewById != null) {
                        if (!isInEditMode()) {
                            throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(i9) + " to anchor view " + childAt);
                        }
                        fVarH.f934l = null;
                        fVarH.f933k = null;
                    } else if (viewFindViewById != this) {
                        for (ViewParent parent = viewFindViewById.getParent(); parent != this && parent != null; parent = parent.getParent()) {
                            if (parent != childAt) {
                                if (parent instanceof View) {
                                    viewFindViewById = parent;
                                }
                            } else {
                                if (!isInEditMode()) {
                                    throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                                }
                                fVarH.f934l = null;
                                fVarH.f933k = null;
                            }
                        }
                        fVarH.f934l = viewFindViewById;
                    } else {
                        if (!isInEditMode()) {
                            throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                        }
                        fVarH.f934l = null;
                        fVarH.f933k = null;
                    }
                } else {
                    View view2 = fVarH.f933k;
                    for (ViewParent parent2 = view2.getParent(); parent2 != this; parent2 = parent2.getParent()) {
                        if (parent2 == null || parent2 == childAt) {
                            fVarH.f934l = null;
                            fVarH.f933k = null;
                            viewFindViewById = findViewById(i9);
                            fVarH.f933k = viewFindViewById;
                            if (viewFindViewById != null) {
                            }
                        } else {
                            if (parent2 instanceof View) {
                                view2 = parent2;
                            }
                        }
                    }
                    fVarH.f934l = view2;
                }
            }
            if (!gVar2.containsKey(childAt)) {
                gVar2.put(childAt, null);
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                if (i10 != i8) {
                    View childAt2 = getChildAt(i10);
                    if (childAt2 != fVarH.f934l) {
                        WeakHashMap<View, n0> weakHashMap = f0.f14480a;
                        int layoutDirection = getLayoutDirection();
                        int absoluteGravity = Gravity.getAbsoluteGravity(((f) childAt2.getLayoutParams()).f930g, layoutDirection);
                        if ((absoluteGravity != 0 && (Gravity.getAbsoluteGravity(fVarH.h, layoutDirection) & absoluteGravity) == absoluteGravity) || ((cVar = fVarH.f924a) != null && cVar.b(childAt, childAt2))) {
                            if (!gVar2.containsKey(childAt2) && !gVar2.containsKey(childAt2)) {
                                gVar2.put(childAt2, null);
                            }
                            if (!gVar2.containsKey(childAt2) || !gVar2.containsKey(childAt)) {
                                throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
                            }
                            ArrayList arrayList3 = (ArrayList) gVar2.get(childAt2);
                            if (arrayList3 == null) {
                                arrayList3 = (ArrayList) tiVar.c();
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                gVar2.put(childAt2, arrayList3);
                            }
                            arrayList3.add(childAt);
                        }
                    }
                }
            }
        }
        ArrayList arrayList4 = (ArrayList) y50Var.f10861u;
        arrayList4.clear();
        HashSet hashSet = (HashSet) y50Var.f10862v;
        hashSet.clear();
        int i11 = gVar2.f14850u;
        for (int i12 = 0; i12 < i11; i12++) {
            y50Var.a(gVar2.f(i12), arrayList4, hashSet);
        }
        arrayList.addAll(arrayList4);
        Collections.reverse(arrayList);
    }

    public final void o(boolean z6) {
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            c cVar = ((f) childAt.getLayoutParams()).f924a;
            if (cVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z6) {
                    cVar.g(this, childAt, motionEventObtain);
                } else {
                    cVar.r(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            ((f) getChildAt(i7).getLayoutParams()).getClass();
        }
        this.B = null;
        this.f922y = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o(false);
        if (this.E) {
            if (this.D == null) {
                this.D = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.D);
        }
        if (this.F == null) {
            WeakHashMap<View, n0> weakHashMap = f0.f14480a;
            if (getFitsSystemWindows()) {
                f0.c.c(this);
            }
        }
        this.f923z = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o(false);
        if (this.E && this.D != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.D);
        }
        View view = this.C;
        if (view != null) {
            onStopNestedScroll(view, 0);
        }
        this.f923z = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.G || this.H == null) {
            return;
        }
        s0 s0Var = this.F;
        int iD = s0Var != null ? s0Var.d() : 0;
        if (iD > 0) {
            this.H.setBounds(0, 0, getWidth(), iD);
            this.H.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            o(true);
        }
        boolean zM = m(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zM;
        }
        o(true);
        return zM;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
        c cVar;
        WeakHashMap<View, n0> weakHashMap = f0.f14480a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = (View) arrayList.get(i10);
            if (view.getVisibility() != 8 && ((cVar = ((f) view.getLayoutParams()).f924a) == null || !cVar.h(this, view, layoutDirection))) {
                k(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i6, int i7) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        boolean z6;
        int i8;
        int i9;
        int i10;
        int i11;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        c cVar;
        int i12;
        int i13;
        boolean z7;
        int i14;
        int i15;
        ArrayList arrayList;
        int i16;
        int i17;
        View view;
        int i18;
        int iMax;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.n();
        int childCount = coordinatorLayout.getChildCount();
        int i19 = 0;
        loop0: while (true) {
            if (i19 >= childCount) {
                z6 = false;
                break;
            }
            View childAt = coordinatorLayout.getChildAt(i19);
            w.g gVar = (w.g) coordinatorLayout.f917t.f10860t;
            int i20 = gVar.f14850u;
            for (int i21 = 0; i21 < i20; i21++) {
                ArrayList arrayList2 = (ArrayList) gVar.i(i21);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z6 = true;
                    break loop0;
                }
            }
            i19++;
        }
        if (z6 != coordinatorLayout.E) {
            if (z6) {
                if (coordinatorLayout.f923z) {
                    if (coordinatorLayout.D == null) {
                        coordinatorLayout.D = coordinatorLayout.new g();
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.D);
                }
                coordinatorLayout.E = true;
            } else {
                if (coordinatorLayout.f923z && coordinatorLayout.D != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.D);
                }
                coordinatorLayout.E = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap<View, n0> weakHashMap = f0.f14480a;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z8 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i6);
        int mode2 = View.MeasureSpec.getMode(i7);
        int size2 = View.MeasureSpec.getSize(i7);
        int i22 = paddingLeft + paddingRight;
        int i23 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z9 = coordinatorLayout.F != null && coordinatorLayout.getFitsSystemWindows();
        ArrayList arrayList3 = coordinatorLayout.s;
        int size3 = arrayList3.size();
        int i24 = 0;
        int iCombineMeasuredStates = 0;
        while (i24 < size3) {
            View view2 = (View) arrayList3.get(i24);
            int i25 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i11 = size3;
                i18 = i24;
                i12 = paddingLeft;
                suggestedMinimumWidth = i25;
                z7 = false;
                i14 = paddingRight;
            } else {
                f fVar = (f) view2.getLayoutParams();
                int i26 = fVar.f928e;
                if (i26 < 0 || mode == 0) {
                    i8 = suggestedMinimumHeight;
                } else {
                    int iG = coordinatorLayout.g(i26);
                    int i27 = fVar.f926c;
                    if (i27 == 0) {
                        i27 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i27, layoutDirection) & 7;
                    i8 = suggestedMinimumHeight;
                    if ((absoluteGravity == 3 && !z8) || (absoluteGravity == 5 && z8)) {
                        iMax = Math.max(0, (size - paddingRight) - iG);
                    } else if ((absoluteGravity == 5 && !z8) || (absoluteGravity == 3 && z8)) {
                        iMax = Math.max(0, iG - paddingLeft);
                    }
                    int i28 = size3;
                    i10 = iMax;
                    i9 = i28;
                    if (z9 || view2.getFitsSystemWindows()) {
                        i11 = i9;
                        iMakeMeasureSpec = i6;
                        iMakeMeasureSpec2 = i7;
                    } else {
                        i11 = i9;
                        int iC = coordinatorLayout.F.c() + coordinatorLayout.F.b();
                        int iA = coordinatorLayout.F.a() + coordinatorLayout.F.d();
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iC, mode);
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iA, mode2);
                    }
                    cVar = fVar.f924a;
                    if (cVar == null) {
                        z7 = false;
                        i12 = paddingLeft;
                        i13 = i25;
                        i14 = paddingRight;
                        i15 = i8;
                        arrayList = arrayList3;
                        int i29 = iMakeMeasureSpec;
                        i18 = i24;
                        int i30 = iMakeMeasureSpec2;
                        boolean zI = cVar.i(this, view2, i29, i10, i30);
                        view = view2;
                        iMakeMeasureSpec = i29;
                        i16 = i10;
                        i17 = i30;
                        if (zI) {
                            coordinatorLayout = this;
                        }
                        int iMax2 = Math.max(i13, view.getMeasuredWidth() + i22 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                        int iMax3 = Math.max(i15, view.getMeasuredHeight() + i23 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax2;
                        suggestedMinimumHeight = iMax3;
                    } else {
                        i12 = paddingLeft;
                        i13 = i25;
                        z7 = false;
                        i14 = paddingRight;
                        i15 = i8;
                        arrayList = arrayList3;
                        i16 = i10;
                        i17 = iMakeMeasureSpec2;
                        view = view2;
                        i18 = i24;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i16, i17, 0);
                    int iMax22 = Math.max(i13, view.getMeasuredWidth() + i22 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                    int iMax32 = Math.max(i15, view.getMeasuredHeight() + i23 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax22;
                    suggestedMinimumHeight = iMax32;
                }
                i9 = size3;
                i10 = 0;
                if (z9) {
                    i11 = i9;
                    iMakeMeasureSpec = i6;
                    iMakeMeasureSpec2 = i7;
                    cVar = fVar.f924a;
                    if (cVar == null) {
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i16, i17, 0);
                    int iMax222 = Math.max(i13, view.getMeasuredWidth() + i22 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                    int iMax322 = Math.max(i15, view.getMeasuredHeight() + i23 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax222;
                    suggestedMinimumHeight = iMax322;
                }
            }
            i24 = i18 + 1;
            paddingLeft = i12;
            paddingRight = i14;
            size3 = i11;
            arrayList3 = arrayList;
        }
        int i31 = iCombineMeasuredStates;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i6, (-16777216) & i31), View.resolveSizeAndState(suggestedMinimumHeight, i7, i31 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f6, float f7, boolean z6) {
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0)) {
                    c cVar = fVar.f924a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f6, float f7) {
        c cVar;
        int childCount = getChildCount();
        boolean zJ = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0) && (cVar = fVar.f924a) != null) {
                    zJ |= cVar.j(view);
                }
            }
        }
        return zJ;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i6, int i7, int[] iArr) {
        onNestedPreScroll(view, i6, i7, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i6, int i7, int i8, int i9) {
        onNestedScroll(view, i6, i7, i8, i9, 0);
    }

    @Override // u0.o
    public final void onNestedScrollAccepted(View view, View view2, int i6, int i7) {
        q qVar = this.K;
        if (i7 == 1) {
            qVar.f14523b = i6;
        } else {
            qVar.f14522a = i6;
        }
        this.C = view2;
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            ((f) getChildAt(i8).getLayoutParams()).getClass();
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.s);
        SparseArray<Parcelable> sparseArray = hVar.f939u;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            int id = childAt.getId();
            c cVar = h(childAt).f924a;
            if (id != -1 && cVar != null && (parcelable2 = sparseArray.get(id)) != null) {
                cVar.n(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableO;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            int id = childAt.getId();
            c cVar = ((f) childAt.getLayoutParams()).f924a;
            if (id != -1 && cVar != null && (parcelableO = cVar.o(childAt)) != null) {
                sparseArray.append(id, parcelableO);
            }
        }
        hVar.f939u = sparseArray;
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i6) {
        return onStartNestedScroll(view, view2, i6, 0);
    }

    @Override // u0.o
    public final void onStopNestedScroll(View view, int i6) {
        q qVar = this.K;
        if (i6 == 1) {
            qVar.f14523b = 0;
        } else {
            qVar.f14522a = 0;
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.a(i6)) {
                c cVar = fVar.f924a;
                if (cVar != null) {
                    cVar.q(this, childAt, view, i6);
                }
                if (i6 == 0) {
                    fVar.f935m = false;
                } else if (i6 == 1) {
                    fVar.f936n = false;
                }
                fVar.f937o = false;
            }
        }
        this.C = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM;
        boolean zR;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.B == null) {
            zM = m(motionEvent, 1);
            if (!zM) {
                zR = false;
            }
            motionEventObtain = null;
            if (this.B != null) {
                zR |= super.onTouchEvent(motionEvent);
            } else if (zM) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return zR;
            }
            o(false);
            return zR;
        }
        zM = false;
        c cVar = ((f) this.B.getLayoutParams()).f924a;
        if (cVar != null) {
            zR = cVar.r(this, this.B, motionEvent);
        }
        motionEventObtain = null;
        if (this.B != null) {
        }
        if (motionEventObtain != null) {
        }
        if (actionMasked == 1) {
        }
        o(false);
        return zR;
    }

    public final void r() {
        WeakHashMap<View, n0> weakHashMap = f0.f14480a;
        if (!getFitsSystemWindows()) {
            f0.d.k(this, null);
            return;
        }
        if (this.J == null) {
            this.J = new a();
        }
        f0.d.k(this, this.J);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z6) {
        c cVar = ((f) view.getLayoutParams()).f924a;
        if (cVar == null || !cVar.m(this, view, rect, z6)) {
            return super.requestChildRectangleOnScreen(view, rect, z6);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z6) {
        super.requestDisallowInterceptTouchEvent(z6);
        if (!z6 || this.f922y) {
            return;
        }
        o(false);
        this.f922y = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z6) {
        super.setFitsSystemWindows(z6);
        r();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.I = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.H;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.H = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.H.setState(getDrawableState());
                }
                Drawable drawable3 = this.H;
                WeakHashMap<View, n0> weakHashMap = f0.f14480a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.H.setVisible(getVisibility() == 0, false);
                this.H.setCallback(this);
            }
            WeakHashMap<View, n0> weakHashMap2 = f0.f14480a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i6) {
        setStatusBarBackground(new ColorDrawable(i6));
    }

    public void setStatusBarBackgroundResource(int i6) {
        setStatusBarBackground(i6 != 0 ? getContext().getDrawable(i6) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i6) {
        super.setVisibility(i6);
        boolean z6 = i6 == 0;
        Drawable drawable = this.H;
        if (drawable == null || drawable.isVisible() == z6) {
            return;
        }
        this.H.setVisible(z6, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.H;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f ? new f((f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    @Override // u0.o
    public final void onNestedPreScroll(View view, int i6, int i7, int[] iArr, int i8) {
        c cVar;
        int childCount = getChildCount();
        boolean z6 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i8) && (cVar = fVar.f924a) != null) {
                    int[] iArr2 = this.f920w;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.k(this, childAt, view, i6, i7, iArr2, i8);
                    iMax = i6 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i7 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z6 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z6) {
            j(1);
        }
    }

    @Override // u0.o
    public final void onNestedScroll(View view, int i6, int i7, int i8, int i9, int i10) {
        onNestedScroll(view, i6, i7, i8, i9, 0, this.f921x);
    }

    @Override // u0.o
    public final boolean onStartNestedScroll(View view, View view2, int i6, int i7) {
        int childCount = getChildCount();
        boolean z6 = false;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVar = fVar.f924a;
                if (cVar != null) {
                    boolean zP = cVar.p(this, childAt, view, view2, i6, i7);
                    z6 |= zP;
                    if (i7 == 0) {
                        fVar.f935m = zP;
                    } else if (i7 == 1) {
                        fVar.f936n = zP;
                    }
                } else if (i7 == 0) {
                    fVar.f935m = false;
                } else if (i7 == 1) {
                    fVar.f936n = false;
                }
            }
        }
        return z6;
    }

    @Override // u0.p
    public final void onNestedScroll(View view, int i6, int i7, int i8, int i9, int i10, int[] iArr) {
        c cVar;
        int childCount = getChildCount();
        int iMin = 0;
        int iMin2 = 0;
        boolean z6 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i10) && (cVar = fVar.f924a) != null) {
                    int[] iArr2 = this.f920w;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.l(this, childAt, i7, i8, i9, iArr2);
                    if (i8 > 0) {
                        iMin = Math.max(iMin, iArr2[0]);
                    } else {
                        iMin = Math.min(iMin, iArr2[0]);
                    }
                    if (i9 > 0) {
                        iMin2 = Math.max(iMin2, iArr2[1]);
                    } else {
                        iMin2 = Math.min(iMin2, iArr2[1]);
                    }
                    z6 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMin;
        iArr[1] = iArr[1] + iMin2;
        if (z6) {
            j(1);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public c f924a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f925b;

        /* renamed from: c, reason: collision with root package name */
        public final int f926c;

        /* renamed from: d, reason: collision with root package name */
        public int f927d;

        /* renamed from: e, reason: collision with root package name */
        public final int f928e;

        /* renamed from: f, reason: collision with root package name */
        public final int f929f;

        /* renamed from: g, reason: collision with root package name */
        public final int f930g;
        public int h;

        /* renamed from: i, reason: collision with root package name */
        public int f931i;

        /* renamed from: j, reason: collision with root package name */
        public int f932j;

        /* renamed from: k, reason: collision with root package name */
        public View f933k;

        /* renamed from: l, reason: collision with root package name */
        public View f934l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f935m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f936n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f937o;

        /* renamed from: p, reason: collision with root package name */
        public final Rect f938p;

        public f() {
            super(-2, -2);
            this.f925b = false;
            this.f926c = 0;
            this.f927d = 0;
            this.f928e = -1;
            this.f929f = -1;
            this.f930g = 0;
            this.h = 0;
            this.f938p = new Rect();
        }

        public final boolean a(int i6) {
            if (i6 == 0) {
                return this.f935m;
            }
            if (i6 != 1) {
                return false;
            }
            return this.f936n;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f(Context context, AttributeSet attributeSet) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
            c cVarNewInstance;
            super(context, attributeSet);
            this.f925b = false;
            this.f926c = 0;
            this.f927d = 0;
            this.f928e = -1;
            this.f929f = -1;
            this.f930g = 0;
            this.h = 0;
            this.f938p = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f0.a.f12959b);
            this.f926c = typedArrayObtainStyledAttributes.getInteger(0, 0);
            this.f929f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            this.f927d = typedArrayObtainStyledAttributes.getInteger(2, 0);
            this.f928e = typedArrayObtainStyledAttributes.getInteger(6, -1);
            this.f930g = typedArrayObtainStyledAttributes.getInt(5, 0);
            this.h = typedArrayObtainStyledAttributes.getInt(4, 0);
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
            this.f925b = zHasValue;
            if (zHasValue) {
                String string = typedArrayObtainStyledAttributes.getString(3);
                String str = CoordinatorLayout.L;
                if (TextUtils.isEmpty(string)) {
                    cVarNewInstance = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.L;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<c>>> threadLocal = CoordinatorLayout.N;
                        Map<String, Constructor<c>> map = threadLocal.get();
                        if (map == null) {
                            map = new HashMap<>();
                            threadLocal.set(map);
                        }
                        Constructor<c> constructor = map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.M);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        cVarNewInstance = constructor.newInstance(context, attributeSet);
                    } catch (Exception e6) {
                        throw new RuntimeException(k0.a("Could not inflate Behavior subclass ", string), e6);
                    }
                }
                this.f924a = cVarNewInstance;
            }
            typedArrayObtainStyledAttributes.recycle();
            c cVar = this.f924a;
            if (cVar != null) {
                cVar.c(this);
            }
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f925b = false;
            this.f926c = 0;
            this.f927d = 0;
            this.f928e = -1;
            this.f929f = -1;
            this.f930g = 0;
            this.h = 0;
            this.f938p = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f925b = false;
            this.f926c = 0;
            this.f927d = 0;
            this.f928e = -1;
            this.f929f = -1;
            this.f930g = 0;
            this.h = 0;
            this.f938p = new Rect();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f925b = false;
            this.f926c = 0;
            this.f927d = 0;
            this.f928e = -1;
            this.f929f = -1;
            this.f930g = 0;
            this.h = 0;
            this.f938p = new Rect();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i6) {
        onNestedScrollAccepted(view, view2, i6, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }
}
