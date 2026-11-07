package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ViewStubCompat extends View {
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public int f299t;

    /* renamed from: u, reason: collision with root package name */
    public WeakReference<View> f300u;

    /* renamed from: v, reason: collision with root package name */
    public LayoutInflater f301v;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface a {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.s = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f12957z, 0, 0);
        this.f299t = typedArrayObtainStyledAttributes.getResourceId(2, -1);
        this.s = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(0, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.s == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.f301v;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.s, viewGroup, false);
        int i6 = this.f299t;
        if (i6 != -1) {
            viewInflate.setId(i6);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.f300u = new WeakReference<>(viewInflate);
        return viewInflate;
    }

    public int getInflatedId() {
        return this.f299t;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f301v;
    }

    public int getLayoutResource() {
        return this.s;
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i7) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i6) {
        this.f299t = i6;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f301v = layoutInflater;
    }

    public void setLayoutResource(int i6) {
        this.s = i6;
    }

    @Override // android.view.View
    public void setVisibility(int i6) {
        WeakReference<View> weakReference = this.f300u;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i6);
            return;
        }
        super.setVisibility(i6);
        if (i6 == 0 || i6 == 4) {
            a();
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
    }

    public void setOnInflateListener(a aVar) {
    }
}
