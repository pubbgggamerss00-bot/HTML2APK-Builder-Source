package d0;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import d0.d;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c extends androidx.constraintlayout.widget.c implements d.c {
    public boolean A;
    public boolean B;
    public float C;
    public View[] D;

    @Override // androidx.constraintlayout.widget.c
    public final void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e0.d.h);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i6);
                if (index == 1) {
                    this.A = typedArrayObtainStyledAttributes.getBoolean(index, this.A);
                } else if (index == 0) {
                    this.B = typedArrayObtainStyledAttributes.getBoolean(index, this.B);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public float getProgress() {
        return this.C;
    }

    public void setProgress(float f6) {
        this.C = f6;
        int i6 = 0;
        if (this.f811t <= 0) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            int childCount = viewGroup.getChildCount();
            while (i6 < childCount) {
                viewGroup.getChildAt(i6);
                i6++;
            }
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        View[] viewArr = this.f816y;
        if (viewArr == null || viewArr.length != this.f811t) {
            this.f816y = new View[this.f811t];
        }
        for (int i7 = 0; i7 < this.f811t; i7++) {
            this.f816y[i7] = constraintLayout.s.get(this.s[i7]);
        }
        this.D = this.f816y;
        while (i6 < this.f811t) {
            View view = this.D[i6];
            i6++;
        }
    }
}
