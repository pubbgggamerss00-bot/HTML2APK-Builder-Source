package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.basitce.htmltoapk.R;
import java.lang.reflect.Field;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import y3.q0;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f640a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f641b;

    /* renamed from: c, reason: collision with root package name */
    public int f642c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f642c = -1;
        int[] iArr = g.a.f11248g;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        q0.g(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        this.f640a = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f640a);
        }
    }

    private void setStacked(boolean z10) {
        if (this.f641b != z10) {
            if (!z10 || this.f640a) {
                this.f641b = z10;
                setOrientation(z10 ? 1 : 0);
                setGravity(z10 ? 8388613 : 80);
                View viewFindViewById = findViewById(R.id.spacer);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z10 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int iMakeMeasureSpec;
        boolean z10;
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int paddingBottom = 0;
        if (this.f640a) {
            if (size > this.f642c && this.f641b) {
                setStacked(false);
            }
            this.f642c = size;
        }
        if (this.f641b || View.MeasureSpec.getMode(i10) != 1073741824) {
            iMakeMeasureSpec = i10;
            z10 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, PKIFailureInfo.systemUnavail);
            z10 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i11);
        if (this.f640a && !this.f641b && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z10 = true;
        }
        if (z10) {
            super.onMeasure(i10, i11);
        }
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            i12 = -1;
            if (i13 >= childCount) {
                i13 = -1;
                break;
            } else if (getChildAt(i13).getVisibility() == 0) {
                break;
            } else {
                i13++;
            }
        }
        if (i13 >= 0) {
            View childAt = getChildAt(i13);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f641b) {
                int i14 = i13 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i14 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i14).getVisibility() == 0) {
                        i12 = i14;
                        break;
                    }
                    i14++;
                }
                paddingBottom = i12 >= 0 ? getChildAt(i12).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                paddingBottom = getPaddingBottom() + measuredHeight;
            }
        }
        Field field = q0.f33885a;
        if (getMinimumHeight() != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i11 == 0) {
                super.onMeasure(i10, i11);
            }
        }
    }

    public void setAllowStacking(boolean z10) {
        if (this.f640a != z10) {
            this.f640a = z10;
            if (!z10 && this.f641b) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
