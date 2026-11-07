package androidx.constraintlayout.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a extends c {
    public int A;
    public int B;
    public b0.a C;

    @Override // androidx.constraintlayout.widget.c
    public final void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        this.C = new b0.a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e0.d.f12765b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i6);
                if (index == 26) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.C.f1859u0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.C.f1860v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f813v = this.C;
        i();
    }

    public boolean getAllowsGoneWidget() {
        return this.C.f1859u0;
    }

    public int getMargin() {
        return this.C.f1860v0;
    }

    public int getType() {
        return this.A;
    }

    @Override // androidx.constraintlayout.widget.c
    public final void h(b0.e eVar, boolean z6) {
        int i6 = this.A;
        this.B = i6;
        if (z6) {
            if (i6 == 5) {
                this.B = 1;
            } else if (i6 == 6) {
                this.B = 0;
            }
        } else if (i6 == 5) {
            this.B = 0;
        } else if (i6 == 6) {
            this.B = 1;
        }
        if (eVar instanceof b0.a) {
            ((b0.a) eVar).f1858t0 = this.B;
        }
    }

    public void setAllowsGoneWidget(boolean z6) {
        this.C.f1859u0 = z6;
    }

    public void setDpMargin(int i6) {
        this.C.f1860v0 = (int) ((i6 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i6) {
        this.C.f1860v0 = i6;
    }

    public void setType(int i6) {
        this.A = i6;
    }
}
