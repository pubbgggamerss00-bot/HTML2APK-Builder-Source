package n4;

import android.view.View;
import android.view.ViewGroup;
import com.htmltoapk.template.R;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class d extends ViewGroup {
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public int f13969t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f13970u;

    /* renamed from: v, reason: collision with root package name */
    public int f13971v;

    public boolean a() {
        return this.f13970u;
    }

    public int getItemSpacing() {
        return this.f13969t;
    }

    public int getLineSpacing() {
        return this.s;
    }

    public int getRowCount() {
        return this.f13971v;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
        int marginEnd;
        int marginStart;
        boolean z7;
        int i10 = 0;
        if (getChildCount() == 0) {
            this.f13971v = 0;
            return;
        }
        boolean z8 = true;
        this.f13971v = 1;
        boolean z9 = getLayoutDirection() == 1;
        int paddingRight = z9 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z9 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i11 = 0;
        int measuredWidth = paddingRight;
        int i12 = paddingTop;
        while (i11 < getChildCount()) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
                z7 = z8;
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginStart = marginLayoutParams.getMarginStart();
                    marginEnd = marginLayoutParams.getMarginEnd();
                } else {
                    marginEnd = i10;
                    marginStart = marginEnd;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + measuredWidth + marginStart;
                int i13 = i8 - i6;
                z7 = z8;
                int i14 = i13 - paddingLeft;
                if (!this.f13970u && measuredWidth2 > i14) {
                    measuredWidth2 = childAt.getMeasuredWidth() + paddingRight + marginStart;
                    i12 = paddingTop + this.s;
                    this.f13971v++;
                    measuredWidth = paddingRight;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.f13971v - 1));
                int measuredHeight = childAt.getMeasuredHeight() + i12;
                if (z9) {
                    childAt.layout(i13 - measuredWidth2, i12, (i13 - measuredWidth) - marginStart, measuredHeight);
                } else {
                    childAt.layout(measuredWidth + marginStart, i12, measuredWidth2, measuredHeight);
                }
                measuredWidth += childAt.getMeasuredWidth() + marginStart + marginEnd + this.f13969t;
                paddingTop = measuredHeight;
            }
            i11++;
            z8 = z7;
            i10 = 0;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int size = View.MeasureSpec.getSize(i6);
        int mode = View.MeasureSpec.getMode(i6);
        int size2 = View.MeasureSpec.getSize(i7);
        int mode2 = View.MeasureSpec.getMode(i7);
        int i11 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i11 - getPaddingRight();
        int i12 = paddingTop;
        int i13 = 0;
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i6, i7);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i10 = marginLayoutParams.leftMargin;
                    i9 = marginLayoutParams.rightMargin;
                } else {
                    i9 = 0;
                    i10 = 0;
                }
                int i15 = i9;
                if (childAt.getMeasuredWidth() + paddingLeft + i10 > paddingRight && !a()) {
                    paddingLeft = getPaddingLeft();
                    i12 = paddingTop + this.s;
                }
                int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i10;
                int measuredHeight = childAt.getMeasuredHeight() + i12;
                if (measuredWidth > i13) {
                    i13 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i10 + i15 + this.f13969t + paddingLeft;
                if (i14 == getChildCount() - 1) {
                    i13 += i15;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        int paddingRight2 = getPaddingRight() + i13;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode != Integer.MIN_VALUE) {
            i8 = 1073741824;
            if (mode != 1073741824) {
                size = paddingRight2;
            }
        } else {
            i8 = 1073741824;
            size = Math.min(paddingRight2, size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(paddingBottom, size2);
        } else if (mode2 != i8) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    public void setItemSpacing(int i6) {
        this.f13969t = i6;
    }

    public void setLineSpacing(int i6) {
        this.s = i6;
    }

    public void setSingleLine(boolean z6) {
        this.f13970u = z6;
    }
}
