package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.b;
import com.htmltoapk.template.R;
import java.util.WeakHashMap;
import u0.f0;
import u0.n0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class AlertDialogLayout extends b {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static int j(View view) {
        WeakHashMap<View, n0> weakHashMap = f0.f14480a;
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return j(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    @Override // androidx.appcompat.widget.b, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
        int i10;
        int i11;
        int i12;
        int paddingLeft = getPaddingLeft();
        int i13 = i8 - i6;
        int paddingRight = i13 - getPaddingRight();
        int paddingRight2 = (i13 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i14 = gravity & 112;
        int i15 = gravity & 8388615;
        int paddingTop = i14 != 16 ? i14 != 80 ? getPaddingTop() : ((getPaddingTop() + i9) - i7) - measuredHeight : (((i9 - i7) - measuredHeight) / 2) + getPaddingTop();
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                b.a aVar = (b.a) childAt.getLayoutParams();
                int i17 = ((LinearLayout.LayoutParams) aVar).gravity;
                if (i17 < 0) {
                    i17 = i15;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i17, getLayoutDirection()) & 7;
                if (absoluteGravity == 1) {
                    i10 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) aVar).leftMargin;
                    i11 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                } else if (absoluteGravity != 5) {
                    i12 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                    if (i(i16)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i18 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                    childAt.layout(i12, i18, measuredWidth + i12, i18 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) aVar).bottomMargin + i18;
                } else {
                    i10 = paddingRight - measuredWidth;
                    i11 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                }
                i12 = i10 - i11;
                if (i(i16)) {
                }
                int i182 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                childAt.layout(i12, i182, measuredWidth + i12, i182 + measuredHeight2);
                paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) aVar).bottomMargin + i182;
            }
        }
    }

    @Override // androidx.appcompat.widget.b, android.view.View
    public final void onMeasure(int i6, int i7) {
        int iCombineMeasuredStates;
        int iJ;
        int measuredHeight;
        int measuredHeight2;
        AlertDialogLayout alertDialogLayout = this;
        int childCount = alertDialogLayout.getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = alertDialogLayout.getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == R.id.topPanel) {
                    view = childAt;
                } else if (id == R.id.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id != R.id.contentPanel && id != R.id.customPanel) || view3 != null) {
                        super.onMeasure(i6, i7);
                        return;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int mode2 = View.MeasureSpec.getMode(i6);
        int paddingBottom = alertDialogLayout.getPaddingBottom() + alertDialogLayout.getPaddingTop();
        if (view != null) {
            view.measure(i6, 0);
            paddingBottom += view.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i6, 0);
            iJ = j(view2);
            measuredHeight = view2.getMeasuredHeight() - iJ;
            paddingBottom += iJ;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            iJ = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i6, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingBottom += measuredHeight2;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i9 = size - paddingBottom;
        if (view2 != null) {
            int i10 = paddingBottom - iJ;
            int iMin = Math.min(i9, measuredHeight);
            if (iMin > 0) {
                i9 -= iMin;
                iJ += iMin;
            }
            view2.measure(i6, View.MeasureSpec.makeMeasureSpec(iJ, 1073741824));
            paddingBottom = i10 + view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i9 > 0) {
            view3.measure(i6, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i9, mode));
            paddingBottom = (paddingBottom - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = alertDialogLayout.getChildAt(i11);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        int i12 = i7;
        alertDialogLayout.setMeasuredDimension(View.resolveSizeAndState(alertDialogLayout.getPaddingRight() + alertDialogLayout.getPaddingLeft() + iMax, i6, iCombineMeasuredStates), View.resolveSizeAndState(paddingBottom, i12, 0));
        if (mode2 != 1073741824) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(alertDialogLayout.getMeasuredWidth(), 1073741824);
            int i13 = 0;
            while (i13 < childCount) {
                View childAt3 = alertDialogLayout.getChildAt(i13);
                if (childAt3.getVisibility() != 8) {
                    b.a aVar = (b.a) childAt3.getLayoutParams();
                    if (((LinearLayout.LayoutParams) aVar).width == -1) {
                        int i14 = ((LinearLayout.LayoutParams) aVar).height;
                        ((LinearLayout.LayoutParams) aVar).height = childAt3.getMeasuredHeight();
                        alertDialogLayout.measureChildWithMargins(childAt3, iMakeMeasureSpec, 0, i12, 0);
                        ((LinearLayout.LayoutParams) aVar).height = i14;
                    }
                }
                i13++;
                alertDialogLayout = this;
                i12 = i7;
            }
        }
    }
}
