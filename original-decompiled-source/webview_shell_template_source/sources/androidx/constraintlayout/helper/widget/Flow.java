package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import b0.e;
import b0.g;
import b0.k;
import e0.d;
import e0.f;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class Flow extends f {
    public g C;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // e0.f, androidx.constraintlayout.widget.c
    public final void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        this.C = new g();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.f12765b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i6);
                if (index == 0) {
                    this.C.W0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    g gVar = this.C;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar.f1974t0 = dimensionPixelSize;
                    gVar.f1975u0 = dimensionPixelSize;
                    gVar.f1976v0 = dimensionPixelSize;
                    gVar.f1977w0 = dimensionPixelSize;
                } else if (index == 18) {
                    g gVar2 = this.C;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar2.f1976v0 = dimensionPixelSize2;
                    gVar2.f1978x0 = dimensionPixelSize2;
                    gVar2.f1979y0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.C.f1977w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.C.f1978x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.C.f1974t0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.C.f1979y0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.C.f1975u0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.C.U0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.C.E0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.C.F0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.C.G0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.C.I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.C.H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.C.J0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.C.K0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.C.M0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.C.O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.C.N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.C.P0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.C.L0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.C.S0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.C.T0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.C.Q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.C.R0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.C.V0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f813v = this.C;
        i();
    }

    @Override // androidx.constraintlayout.widget.c
    public final void h(e eVar, boolean z6) {
        g gVar = this.C;
        int i6 = gVar.f1976v0;
        if (i6 > 0 || gVar.f1977w0 > 0) {
            if (z6) {
                gVar.f1978x0 = gVar.f1977w0;
                gVar.f1979y0 = i6;
            } else {
                gVar.f1978x0 = i6;
                gVar.f1979y0 = gVar.f1977w0;
            }
        }
    }

    @Override // e0.f
    public final void j(k kVar, int i6, int i7) {
        int mode = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i6);
        int mode2 = View.MeasureSpec.getMode(i7);
        int size2 = View.MeasureSpec.getSize(i7);
        if (kVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            kVar.T(mode, size, mode2, size2);
            setMeasuredDimension(kVar.A0, kVar.B0);
        }
    }

    @Override // androidx.constraintlayout.widget.c, android.view.View
    @SuppressLint({"WrongCall"})
    public final void onMeasure(int i6, int i7) {
        j(this.C, i6, i7);
    }

    public void setFirstHorizontalBias(float f6) {
        this.C.M0 = f6;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i6) {
        this.C.G0 = i6;
        requestLayout();
    }

    public void setFirstVerticalBias(float f6) {
        this.C.N0 = f6;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i6) {
        this.C.H0 = i6;
        requestLayout();
    }

    public void setHorizontalAlign(int i6) {
        this.C.S0 = i6;
        requestLayout();
    }

    public void setHorizontalBias(float f6) {
        this.C.K0 = f6;
        requestLayout();
    }

    public void setHorizontalGap(int i6) {
        this.C.Q0 = i6;
        requestLayout();
    }

    public void setHorizontalStyle(int i6) {
        this.C.E0 = i6;
        requestLayout();
    }

    public void setLastHorizontalBias(float f6) {
        this.C.O0 = f6;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i6) {
        this.C.I0 = i6;
        requestLayout();
    }

    public void setLastVerticalBias(float f6) {
        this.C.P0 = f6;
        requestLayout();
    }

    public void setLastVerticalStyle(int i6) {
        this.C.J0 = i6;
        requestLayout();
    }

    public void setMaxElementsWrap(int i6) {
        this.C.V0 = i6;
        requestLayout();
    }

    public void setOrientation(int i6) {
        this.C.W0 = i6;
        requestLayout();
    }

    public void setPadding(int i6) {
        g gVar = this.C;
        gVar.f1974t0 = i6;
        gVar.f1975u0 = i6;
        gVar.f1976v0 = i6;
        gVar.f1977w0 = i6;
        requestLayout();
    }

    public void setPaddingBottom(int i6) {
        this.C.f1975u0 = i6;
        requestLayout();
    }

    public void setPaddingLeft(int i6) {
        this.C.f1978x0 = i6;
        requestLayout();
    }

    public void setPaddingRight(int i6) {
        this.C.f1979y0 = i6;
        requestLayout();
    }

    public void setPaddingTop(int i6) {
        this.C.f1974t0 = i6;
        requestLayout();
    }

    public void setVerticalAlign(int i6) {
        this.C.T0 = i6;
        requestLayout();
    }

    public void setVerticalBias(float f6) {
        this.C.L0 = f6;
        requestLayout();
    }

    public void setVerticalGap(int i6) {
        this.C.R0 = i6;
        requestLayout();
    }

    public void setVerticalStyle(int i6) {
        this.C.F0 = i6;
        requestLayout();
    }

    public void setWrapMode(int i6) {
        this.C.U0 = i6;
        requestLayout();
    }
}
