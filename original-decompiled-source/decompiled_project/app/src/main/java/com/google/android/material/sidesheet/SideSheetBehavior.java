package com.google.android.material.sidesheet;

import ac.d;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import b.o;
import com.basitce.htmltoapk.R;
import com.google.android.material.sidesheet.SideSheetBehavior;
import j2.y;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedHashSet;
import m3.b;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import r4.a;
import y3.q0;
import z3.j;
import z3.l;
import zb.h;
import zb.m;

/* loaded from: classes2.dex */
public class SideSheetBehavior<V extends View> extends b.AbstractC0173b<V> {

    /* renamed from: a, reason: collision with root package name */
    public final h f6457a;

    /* renamed from: b, reason: collision with root package name */
    public final ColorStateList f6458b;

    /* renamed from: c, reason: collision with root package name */
    public final m f6459c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6460d;

    /* renamed from: e, reason: collision with root package name */
    public int f6461e;

    /* renamed from: f, reason: collision with root package name */
    public r4.a f6462f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6463g;

    /* renamed from: h, reason: collision with root package name */
    public WeakReference<V> f6464h;

    /* renamed from: i, reason: collision with root package name */
    public final WeakReference<View> f6465i;

    /* renamed from: j, reason: collision with root package name */
    public VelocityTracker f6466j;

    /* renamed from: k, reason: collision with root package name */
    public int f6467k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashSet f6468l;

    public class a extends a.c {
        public a() {
        }

        @Override // r4.a.c
        public final int a(View view, int i10) {
            throw null;
        }

        @Override // r4.a.c
        public final int b(View view, int i10) {
            return view.getTop();
        }

        @Override // r4.a.c
        public final int c(View view) {
            return 0;
        }

        @Override // r4.a.c
        public final void f(int i10) {
            if (i10 == 1) {
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                if (sideSheetBehavior.f6460d) {
                    sideSheetBehavior.j(1);
                }
            }
        }

        @Override // r4.a.c
        public final void g(View view, int i10, int i11) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference<View> weakReference = sideSheetBehavior.f6465i;
            View view2 = weakReference != null ? weakReference.get() : null;
            if (view2 == null || ((ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null) {
                if (!sideSheetBehavior.f6468l.isEmpty()) {
                    throw null;
                }
            } else {
                view.getLeft();
                view.getRight();
                throw null;
            }
        }

        @Override // r4.a.c
        public final void h(View view, float f10, float f11) {
            throw null;
        }

        @Override // r4.a.c
        public final boolean i(View view, int i10) {
            WeakReference<V> weakReference;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return (sideSheetBehavior.f6461e == 1 || (weakReference = sideSheetBehavior.f6464h) == null || weakReference.get() != view) ? false : true;
        }
    }

    public class c {

        /* renamed from: a, reason: collision with root package name */
        public int f6471a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f6472b;

        /* renamed from: c, reason: collision with root package name */
        public final d f6473c = new Runnable() { // from class: ac.d
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior.c cVar = this.f397a;
                cVar.f6472b = false;
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                r4.a aVar = sideSheetBehavior.f6462f;
                if (aVar == null || !aVar.f()) {
                    if (sideSheetBehavior.f6461e == 2) {
                        sideSheetBehavior.j(cVar.f6471a);
                        return;
                    }
                    return;
                }
                int i10 = cVar.f6471a;
                SideSheetBehavior sideSheetBehavior2 = SideSheetBehavior.this;
                Reference reference = sideSheetBehavior2.f6464h;
                if (reference == null || reference.get() == null) {
                    return;
                }
                cVar.f6471a = i10;
                if (cVar.f6472b) {
                    return;
                }
                ((View) sideSheetBehavior2.f6464h.get()).postOnAnimation(cVar.f6473c);
                cVar.f6472b = true;
            }
        };

        /* JADX WARN: Type inference failed for: r1v1, types: [ac.d] */
        public c() {
        }
    }

    public SideSheetBehavior() {
        new c();
        this.f6460d = true;
        this.f6461e = 5;
        this.f6468l = new LinkedHashSet();
        new a();
    }

    @Override // m3.b.AbstractC0173b
    public final void a(b.d dVar) {
        this.f6464h = null;
        this.f6462f = null;
    }

    @Override // m3.b.AbstractC0173b
    public final void b() {
        this.f6464h = null;
        this.f6462f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0012  */
    @Override // m3.b.AbstractC0173b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(m3.b bVar, V v10, MotionEvent motionEvent) {
        r4.a aVar;
        VelocityTracker velocityTracker;
        if (!v10.isShown()) {
            Field field = q0.f33885a;
            if (q0.f.a(v10) != null) {
                if (this.f6460d) {
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 0 && (velocityTracker = this.f6466j) != null) {
                        velocityTracker.recycle();
                        this.f6466j = null;
                    }
                    if (this.f6466j == null) {
                        this.f6466j = VelocityTracker.obtain();
                    }
                    this.f6466j.addMovement(motionEvent);
                    if (actionMasked == 0) {
                        this.f6467k = (int) motionEvent.getX();
                    } else if ((actionMasked == 1 || actionMasked == 3) && this.f6463g) {
                        this.f6463g = false;
                        return false;
                    }
                    return (this.f6463g || (aVar = this.f6462f) == null || !aVar.o(motionEvent)) ? false : true;
                }
            }
        }
        this.f6463g = true;
        return false;
    }

    @Override // m3.b.AbstractC0173b
    public final void f(View view, Parcelable parcelable) {
        int i10 = ((b) parcelable).f6470c;
        if (i10 == 1 || i10 == 2) {
            i10 = 5;
        }
        this.f6461e = i10;
    }

    @Override // m3.b.AbstractC0173b
    public final Parcelable g(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new b(this);
    }

    @Override // m3.b.AbstractC0173b
    public final void i(m3.b bVar, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (view.isShown()) {
            int actionMasked = motionEvent.getActionMasked();
            if (this.f6461e == 1 && actionMasked == 0) {
                return;
            }
            if (k()) {
                this.f6462f.i(motionEvent);
            }
            if (actionMasked == 0 && (velocityTracker = this.f6466j) != null) {
                velocityTracker.recycle();
                this.f6466j = null;
            }
            if (this.f6466j == null) {
                this.f6466j = VelocityTracker.obtain();
            }
            this.f6466j.addMovement(motionEvent);
            if (k() && actionMasked == 2 && !this.f6463g && k()) {
                float fAbs = Math.abs(this.f6467k - motionEvent.getX());
                r4.a aVar = this.f6462f;
                if (fAbs > aVar.f23187b) {
                    aVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
                }
            }
        }
    }

    public final void j(int i10) {
        V v10;
        V v11;
        if (this.f6461e == i10) {
            return;
        }
        this.f6461e = i10;
        WeakReference<V> weakReference = this.f6464h;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        final int i11 = 5;
        int i12 = this.f6461e == 5 ? 4 : 0;
        if (v10.getVisibility() != i12) {
            v10.setVisibility(i12);
        }
        Iterator it = this.f6468l.iterator();
        while (it.hasNext()) {
            ((ac.a) it.next()).a();
        }
        WeakReference<V> weakReference2 = this.f6464h;
        if (weakReference2 == null || (v11 = weakReference2.get()) == null) {
            return;
        }
        q0.e(v11, PKIFailureInfo.transactionIdInUse);
        q0.c(v11, 0);
        q0.e(v11, PKIFailureInfo.badCertTemplate);
        q0.c(v11, 0);
        if (this.f6461e != 5) {
            q0.f(v11, j.a.f34733j, new l() { // from class: ac.b
                @Override // z3.l
                public final boolean a(View view) {
                    final int i13 = i11;
                    if (i13 == 1 || i13 == 2) {
                        throw new IllegalArgumentException(o.a(new StringBuilder("STATE_"), i13 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    final SideSheetBehavior sideSheetBehavior = this.f393a;
                    Reference reference = sideSheetBehavior.f6464h;
                    if (reference == null || reference.get() == null) {
                        sideSheetBehavior.j(i13);
                        return true;
                    }
                    View view2 = (View) sideSheetBehavior.f6464h.get();
                    Runnable runnable = new Runnable() { // from class: ac.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            SideSheetBehavior sideSheetBehavior2 = sideSheetBehavior;
                            Reference reference2 = sideSheetBehavior2.f6464h;
                            if ((reference2 != null ? (View) reference2.get() : null) == null) {
                                return;
                            }
                            sideSheetBehavior2.getClass();
                            int i14 = i13;
                            if (i14 != 3 && i14 != 5) {
                                throw new IllegalArgumentException(y.a(i14, "Invalid state to get outer edge offset: "));
                            }
                            throw null;
                        }
                    };
                    ViewParent parent = view2.getParent();
                    if (parent != null && parent.isLayoutRequested() && view2.isAttachedToWindow()) {
                        view2.post(runnable);
                        return true;
                    }
                    runnable.run();
                    return true;
                }
            });
        }
        final int i13 = 3;
        if (this.f6461e != 3) {
            q0.f(v11, j.a.f34732i, new l() { // from class: ac.b
                @Override // z3.l
                public final boolean a(View view) {
                    final int i132 = i13;
                    if (i132 == 1 || i132 == 2) {
                        throw new IllegalArgumentException(o.a(new StringBuilder("STATE_"), i132 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    final SideSheetBehavior sideSheetBehavior = this.f393a;
                    Reference reference = sideSheetBehavior.f6464h;
                    if (reference == null || reference.get() == null) {
                        sideSheetBehavior.j(i132);
                        return true;
                    }
                    View view2 = (View) sideSheetBehavior.f6464h.get();
                    Runnable runnable = new Runnable() { // from class: ac.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            SideSheetBehavior sideSheetBehavior2 = sideSheetBehavior;
                            Reference reference2 = sideSheetBehavior2.f6464h;
                            if ((reference2 != null ? (View) reference2.get() : null) == null) {
                                return;
                            }
                            sideSheetBehavior2.getClass();
                            int i14 = i132;
                            if (i14 != 3 && i14 != 5) {
                                throw new IllegalArgumentException(y.a(i14, "Invalid state to get outer edge offset: "));
                            }
                            throw null;
                        }
                    };
                    ViewParent parent = view2.getParent();
                    if (parent != null && parent.isLayoutRequested() && view2.isAttachedToWindow()) {
                        view2.post(runnable);
                        return true;
                    }
                    runnable.run();
                    return true;
                }
            });
        }
    }

    public final boolean k() {
        if (this.f6462f != null) {
            return this.f6460d || this.f6461e == 1;
        }
        return false;
    }

    public static class b extends q4.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public final int f6470c;

        public class a implements Parcelable.ClassLoaderCreator<b> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new b[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6470c = parcel.readInt();
        }

        @Override // q4.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f6470c);
        }

        public b(SideSheetBehavior sideSheetBehavior) {
            super(AbsSavedState.EMPTY_STATE);
            this.f6470c = sideSheetBehavior.f6461e;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        int resourceId;
        ColorStateList colorStateList;
        super(context, attributeSet);
        new c();
        this.f6460d = true;
        this.f6461e = 5;
        this.f6468l = new LinkedHashSet();
        new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mb.a.f18036j);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f6458b = (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = p3.b.getColorStateList(context, resourceId)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(3) : colorStateList;
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f6459c = m.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            WeakReference<View> weakReference = this.f6465i;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f6465i = null;
            WeakReference<V> weakReference2 = this.f6464h;
            if (weakReference2 != null) {
                V v10 = weakReference2.get();
                if (resourceId2 != -1 && v10.isLaidOut()) {
                    v10.requestLayout();
                }
            }
        }
        m mVar = this.f6459c;
        if (mVar != null) {
            h hVar = new h(mVar);
            this.f6457a = hVar;
            hVar.f34886b.f34914b = new ub.a(context);
            hVar.n();
            ColorStateList colorStateList2 = this.f6458b;
            if (colorStateList2 != null) {
                this.f6457a.k(colorStateList2);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f6457a.setTint(typedValue.data);
            }
        }
        typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f6460d = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
