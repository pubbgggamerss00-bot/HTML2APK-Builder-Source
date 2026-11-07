package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e extends ViewGroup {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a extends ConstraintLayout.a {
        public float A0;
        public float B0;
        public float C0;
        public float D0;

        /* renamed from: r0, reason: collision with root package name */
        public float f906r0;

        /* renamed from: s0, reason: collision with root package name */
        public boolean f907s0;

        /* renamed from: t0, reason: collision with root package name */
        public float f908t0;

        /* renamed from: u0, reason: collision with root package name */
        public float f909u0;

        /* renamed from: v0, reason: collision with root package name */
        public float f910v0;

        /* renamed from: w0, reason: collision with root package name */
        public float f911w0;

        /* renamed from: x0, reason: collision with root package name */
        public float f912x0;

        /* renamed from: y0, reason: collision with root package name */
        public float f913y0;

        /* renamed from: z0, reason: collision with root package name */
        public float f914z0;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        a aVar = new a();
        aVar.f906r0 = 1.0f;
        aVar.f907s0 = false;
        aVar.f908t0 = 0.0f;
        aVar.f909u0 = 0.0f;
        aVar.f910v0 = 0.0f;
        aVar.f911w0 = 0.0f;
        aVar.f912x0 = 1.0f;
        aVar.f913y0 = 1.0f;
        aVar.f914z0 = 0.0f;
        aVar.A0 = 0.0f;
        aVar.B0 = 0.0f;
        aVar.C0 = 0.0f;
        aVar.D0 = 0.0f;
        return aVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        a aVar = new a(context, attributeSet);
        aVar.f906r0 = 1.0f;
        aVar.f907s0 = false;
        aVar.f908t0 = 0.0f;
        aVar.f909u0 = 0.0f;
        aVar.f910v0 = 0.0f;
        aVar.f911w0 = 0.0f;
        aVar.f912x0 = 1.0f;
        aVar.f913y0 = 1.0f;
        aVar.f914z0 = 0.0f;
        aVar.A0 = 0.0f;
        aVar.B0 = 0.0f;
        aVar.C0 = 0.0f;
        aVar.D0 = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e0.d.f12767d);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i6 = 0; i6 < indexCount; i6++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i6);
            if (index == 15) {
                aVar.f906r0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f906r0);
            } else if (index == 28) {
                aVar.f908t0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f908t0);
                aVar.f907s0 = true;
            } else if (index == 23) {
                aVar.f910v0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f910v0);
            } else if (index == 24) {
                aVar.f911w0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f911w0);
            } else if (index == 22) {
                aVar.f909u0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f909u0);
            } else if (index == 20) {
                aVar.f912x0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f912x0);
            } else if (index == 21) {
                aVar.f913y0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f913y0);
            } else if (index == 16) {
                aVar.f914z0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f914z0);
            } else if (index == 17) {
                aVar.A0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.A0);
            } else if (index == 18) {
                aVar.B0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.B0);
            } else if (index == 19) {
                aVar.C0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.C0);
            } else if (index == 27) {
                aVar.D0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.D0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    public d getConstraintSet() {
        getChildCount();
        throw null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.a(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
    }
}
