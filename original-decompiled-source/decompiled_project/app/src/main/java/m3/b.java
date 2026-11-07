package m3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.yalantis.ucrop.view.CropImageView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import y3.i1;
import y3.q0;
import y3.r;
import y3.s;

/* loaded from: classes.dex */
public final class b extends ViewGroup implements r, s {

    /* renamed from: c, reason: collision with root package name */
    public static final String f17633c;

    /* renamed from: d, reason: collision with root package name */
    public static final Class<?>[] f17634d;

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal<Map<String, Constructor<AbstractC0173b>>> f17635e;

    /* renamed from: f, reason: collision with root package name */
    public static final x3.d f17636f;

    /* renamed from: a, reason: collision with root package name */
    public boolean f17637a;

    /* renamed from: b, reason: collision with root package name */
    public Drawable f17638b;

    public interface a {
        AbstractC0173b getBehavior();
    }

    /* renamed from: m3.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC0173b<V extends View> {
        public AbstractC0173b() {
        }

        public void a(d dVar) {
        }

        public void b() {
        }

        public boolean c(b bVar, V v10, MotionEvent motionEvent) {
            return false;
        }

        public boolean d(View view) {
            return false;
        }

        public boolean e(b bVar, View view, Rect rect) {
            return false;
        }

        public void f(View view, Parcelable parcelable) {
        }

        public Parcelable g(View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean h(b bVar, V v10, View view, View view2, int i10, int i11) {
            return false;
        }

        public void i(b bVar, View view, MotionEvent motionEvent) {
        }

        public AbstractC0173b(Context context, AttributeSet attributeSet) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface c {
        Class<? extends AbstractC0173b> value();
    }

    public static class d extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public AbstractC0173b f17639a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f17640b;

        /* renamed from: c, reason: collision with root package name */
        public int f17641c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f17642d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f17643e;

        public d() {
            super(-2, -2);
            this.f17640b = false;
            this.f17641c = 0;
            new Rect();
        }

        public final boolean a(int i10) {
            if (i10 == 0) {
                return this.f17642d;
            }
            if (i10 != 1) {
                return false;
            }
            return this.f17643e;
        }

        public final void b(AbstractC0173b abstractC0173b) {
            AbstractC0173b abstractC0173b2 = this.f17639a;
            if (abstractC0173b2 != abstractC0173b) {
                if (abstractC0173b2 != null) {
                    abstractC0173b2.b();
                }
                this.f17639a = abstractC0173b;
                this.f17640b = true;
                if (abstractC0173b != null) {
                    abstractC0173b.a(this);
                }
            }
        }
    }

    public static class e extends q4.a {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public SparseArray<Parcelable> f17644c;

        public static class a implements Parcelable.ClassLoaderCreator<e> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new e(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new e[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new e(parcel, null);
            }
        }

        public e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i10 = parcel.readInt();
            int[] iArr = new int[i10];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f17644c = new SparseArray<>(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                this.f17644c.append(iArr[i11], parcelableArray[i11]);
            }
        }

        @Override // q4.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            SparseArray<Parcelable> sparseArray = this.f17644c;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = this.f17644c.keyAt(i11);
                parcelableArr[i11] = this.f17644c.valueAt(i11);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }
    }

    public static class f implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            Field field = q0.f33885a;
            float z10 = view.getZ();
            float z11 = view2.getZ();
            if (z10 > z11) {
                return -1;
            }
            return z10 < z11 ? 1 : 0;
        }
    }

    static {
        Package r02 = b.class.getPackage();
        f17633c = r02 != null ? r02.getName() : null;
        f17634d = new Class[]{Context.class, AttributeSet.class};
        f17635e = new ThreadLocal<>();
        f17636f = new x3.d();
    }

    public final boolean a(View view, int i10, int i11) {
        x3.d dVar = f17636f;
        Rect rect = (Rect) dVar.a();
        if (rect == null) {
            rect = new Rect();
        }
        ThreadLocal<Matrix> threadLocal = m3.c.f17645a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = m3.c.f17645a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        m3.c.a(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = m3.c.f17646b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
        try {
            return rect.contains(i10, i11);
        } finally {
            rect.setEmpty();
            dVar.b(rect);
        }
    }

    @Override // y3.s
    public final void b(int[] iArr, int i10, int i11, int i12, int i13, int i14) {
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(i14) && dVar.f17639a != null) {
                    throw null;
                }
            }
        }
        iArr[0] = iArr[0];
        iArr[1] = iArr[1];
    }

    public final void c(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            AbstractC0173b abstractC0173b = ((d) childAt.getLayoutParams()).f17639a;
            if (abstractC0173b != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0);
                if (z10) {
                    abstractC0173b.c(this, childAt, motionEventObtain);
                } else {
                    abstractC0173b.i(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((d) getChildAt(i11).getLayoutParams()).getClass();
        }
        this.f17637a = false;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof d) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        AbstractC0173b abstractC0173b = ((d) view.getLayoutParams()).f17639a;
        if (abstractC0173b != null) {
            abstractC0173b.getClass();
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f17638b;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // y3.r
    public final void e(View view, int i10, int i11, int i12, int i13, int i14) {
        b(null, i10, i11, i12, i13, 0);
    }

    @Override // y3.r
    public final boolean f(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                AbstractC0173b abstractC0173b = dVar.f17639a;
                if (abstractC0173b != null) {
                    boolean zH = abstractC0173b.h(this, childAt, view, view2, i10, i11);
                    z10 |= zH;
                    if (i11 == 0) {
                        dVar.f17642d = zH;
                    } else if (i11 == 1) {
                        dVar.f17643e = zH;
                    }
                } else if (i11 == 0) {
                    dVar.f17642d = false;
                } else if (i11 == 1) {
                    dVar.f17643e = false;
                }
            }
        }
        return z10;
    }

    @Override // y3.r
    public final void g(View view, View view2, int i10, int i11) {
        throw null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        AbstractC0173b abstractC0173bNewInstance;
        Context context = getContext();
        d dVar = new d(context, attributeSet);
        dVar.f17640b = false;
        dVar.f17641c = 0;
        new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l3.a.f16699a);
        typedArrayObtainStyledAttributes.getInteger(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.getInteger(2, 0);
        typedArrayObtainStyledAttributes.getInteger(6, -1);
        typedArrayObtainStyledAttributes.getInt(5, 0);
        dVar.f17641c = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        dVar.f17640b = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            if (TextUtils.isEmpty(string)) {
                abstractC0173bNewInstance = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str = f17633c;
                    if (!TextUtils.isEmpty(str)) {
                        string = str + '.' + string;
                    }
                }
                try {
                    ThreadLocal<Map<String, Constructor<AbstractC0173b>>> threadLocal = f17635e;
                    Map<String, Constructor<AbstractC0173b>> map = threadLocal.get();
                    if (map == null) {
                        map = new HashMap<>();
                        threadLocal.set(map);
                    }
                    Constructor<AbstractC0173b> constructor = map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(f17634d);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC0173bNewInstance = constructor.newInstance(context, attributeSet);
                } catch (Exception e10) {
                    throw new RuntimeException(m3.a.a("Could not inflate Behavior subclass ", string), e10);
                }
            }
            dVar.f17639a = abstractC0173bNewInstance;
        }
        typedArrayObtainStyledAttributes.recycle();
        AbstractC0173b abstractC0173b = dVar.f17639a;
        if (abstractC0173b != null) {
            abstractC0173b.a(dVar);
        }
        return dVar;
    }

    public final List<View> getDependencySortedChildren() {
        throw null;
    }

    public final i1 getLastWindowInsets() {
        return null;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        throw null;
    }

    public Drawable getStatusBarBackground() {
        return this.f17638b;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // y3.r
    public final void h(View view, int i10) {
        throw null;
    }

    @Override // y3.r
    public final void i(int i10, int i11, int[] iArr, int i12) {
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(i12) && dVar.f17639a != null) {
                    throw null;
                }
            }
        }
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c(false);
        throw null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            c(true);
        }
        motionEvent.getActionMasked();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Field field = q0.f33885a;
        getLayoutDirection();
        throw null;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(0)) {
                    AbstractC0173b abstractC0173b = dVar.f17639a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        AbstractC0173b abstractC0173b;
        int childCount = getChildCount();
        boolean zD = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(0) && (abstractC0173b = dVar.f17639a) != null) {
                    zD |= abstractC0173b.d(view);
                }
            }
        }
        return zD;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        i(i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        e(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.f21914a);
        SparseArray<Parcelable> sparseArray = eVar.f17644c;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            d dVar = (d) childAt.getLayoutParams();
            if (!dVar.f17640b) {
                if (childAt instanceof a) {
                    AbstractC0173b behavior = ((a) childAt).getBehavior();
                    if (behavior == null) {
                        Log.e("CoordinatorLayout", "Attached behavior class is null");
                    }
                    dVar.b(behavior);
                    dVar.f17640b = true;
                } else {
                    c cVar = null;
                    for (Class<?> superclass = childAt.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                        cVar = (c) superclass.getAnnotation(c.class);
                        if (cVar != null) {
                            break;
                        }
                    }
                    if (cVar != null) {
                        try {
                            dVar.b(cVar.value().getDeclaredConstructor(null).newInstance(null));
                        } catch (Exception e10) {
                            Log.e("CoordinatorLayout", "Default behavior class " + cVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e10);
                        }
                    }
                    dVar.f17640b = true;
                }
            }
            AbstractC0173b abstractC0173b = dVar.f17639a;
            if (id2 != -1 && abstractC0173b != null && (parcelable2 = sparseArray.get(id2)) != null) {
                abstractC0173b.f(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableG;
        e eVar = new e(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            AbstractC0173b abstractC0173b = ((d) childAt.getLayoutParams()).f17639a;
            if (id2 != -1 && abstractC0173b != null && (parcelableG = abstractC0173b.g(childAt)) != null) {
                sparseArray.append(id2, parcelableG);
            }
        }
        eVar.f17644c = sparseArray;
        return eVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return f(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        throw null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getActionMasked();
        motionEvent.getActionMasked();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        AbstractC0173b abstractC0173b = ((d) view.getLayoutParams()).f17639a;
        if (abstractC0173b == null || !abstractC0173b.e(this, view, rect)) {
            return super.requestChildRectangleOnScreen(view, rect, z10);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (!z10 || this.f17637a) {
            return;
        }
        c(false);
        this.f17637a = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        Field field = q0.f33885a;
        if (!getFitsSystemWindows()) {
            q0.c.b(this, null);
        } else {
            q0.c.b(this, null);
            setSystemUiVisibility(1280);
        }
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f17638b;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f17638b = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f17638b.setState(getDrawableState());
                }
                Drawable drawable3 = this.f17638b;
                Field field = q0.f33885a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.f17638b.setVisible(getVisibility() == 0, false);
                this.f17638b.setCallback(this);
            }
            Field field2 = q0.f33885a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        setStatusBarBackground(i10 != 0 ? p3.b.getDrawable(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f17638b;
        if (drawable == null || drawable.isVisible() == z10) {
            return;
        }
        this.f17638b.setVisible(z10, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f17638b;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof d) {
            d dVar = new d((d) layoutParams);
            dVar.f17640b = false;
            dVar.f17641c = 0;
            new Rect();
            return dVar;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            d dVar2 = new d((ViewGroup.MarginLayoutParams) layoutParams);
            dVar2.f17640b = false;
            dVar2.f17641c = 0;
            new Rect();
            return dVar2;
        }
        d dVar3 = new d(layoutParams);
        dVar3.f17640b = false;
        dVar3.f17641c = 0;
        new Rect();
        return dVar3;
    }
}
