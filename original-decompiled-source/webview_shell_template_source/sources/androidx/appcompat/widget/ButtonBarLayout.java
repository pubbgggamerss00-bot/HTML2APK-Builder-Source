package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.htmltoapk.template.R;
import java.util.WeakHashMap;
import u0.f0;
import u0.n0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {
    public boolean s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f259t;

    /* renamed from: u, reason: collision with root package name */
    public int f260u;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f260u = -1;
        int[] iArr = f.a.f12943k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        f0.l(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        this.s = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.s);
        }
    }

    private void setStacked(boolean z6) {
        if (this.f259t != z6) {
            if (!z6 || this.s) {
                this.f259t = z6;
                setOrientation(z6 ? 1 : 0);
                setGravity(z6 ? 8388613 : 80);
                View viewFindViewById = findViewById(R.id.spacer);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z6 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i6, int i7) {
        int iMakeMeasureSpec;
        boolean z6;
        int i8;
        int size = View.MeasureSpec.getSize(i6);
        int paddingBottom = 0;
        if (this.s) {
            if (size > this.f260u && this.f259t) {
                setStacked(false);
            }
            this.f260u = size;
        }
        if (this.f259t || View.MeasureSpec.getMode(i6) != 1073741824) {
            iMakeMeasureSpec = i6;
            z6 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z6 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i7);
        if (this.s && !this.f259t && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z6 = true;
        }
        if (z6) {
            super.onMeasure(i6, i7);
        }
        int childCount = getChildCount();
        int i9 = 0;
        while (true) {
            i8 = -1;
            if (i9 >= childCount) {
                i9 = -1;
                break;
            } else if (getChildAt(i9).getVisibility() == 0) {
                break;
            } else {
                i9++;
            }
        }
        if (i9 >= 0) {
            View childAt = getChildAt(i9);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f259t) {
                int i10 = i9 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i10 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i10).getVisibility() == 0) {
                        i8 = i10;
                        break;
                    }
                    i10++;
                }
                paddingBottom = i8 >= 0 ? getChildAt(i8).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                paddingBottom = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap<View, n0> weakHashMap = f0.f14480a;
        if (getMinimumHeight() != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i7 == 0) {
                super.onMeasure(i6, i7);
            }
        }
    }

    public void setAllowStacking(boolean z6) {
        if (this.s != z6) {
            this.s = z6;
            if (!z6 && this.f259t) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
