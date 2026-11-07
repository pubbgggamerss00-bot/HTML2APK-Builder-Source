package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import l.b1;
import l.i1;
import u0.f0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class b extends ViewGroup {
    public int[] A;
    public int[] B;
    public Drawable C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean s;

    /* renamed from: t, reason: collision with root package name */
    public int f307t;

    /* renamed from: u, reason: collision with root package name */
    public int f308u;

    /* renamed from: v, reason: collision with root package name */
    public int f309v;

    /* renamed from: w, reason: collision with root package name */
    public int f310w;

    /* renamed from: x, reason: collision with root package name */
    public int f311x;

    /* renamed from: y, reason: collision with root package name */
    public float f312y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f313z;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a extends LinearLayout.LayoutParams {
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final void d(Canvas canvas, int i6) {
        this.C.setBounds(getPaddingLeft() + this.G, i6, (getWidth() - getPaddingRight()) - this.G, this.E + i6);
        this.C.draw(canvas);
    }

    public final void e(Canvas canvas, int i6) {
        this.C.setBounds(i6, getPaddingTop() + this.G, this.D + i6, (getHeight() - getPaddingBottom()) - this.G);
        this.C.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i6 = this.f309v;
        if (i6 == 0) {
            return new a(-2, -2);
        }
        if (i6 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i6;
        if (this.f307t < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i7 = this.f307t;
        if (childCount <= i7) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i7);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f307t == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f308u;
        if (this.f309v == 1 && (i6 = this.f310w & 112) != 48) {
            if (i6 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f311x) / 2;
            } else if (i6 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f311x;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f307t;
    }

    public Drawable getDividerDrawable() {
        return this.C;
    }

    public int getDividerPadding() {
        return this.G;
    }

    public int getDividerWidth() {
        return this.D;
    }

    public int getGravity() {
        return this.f310w;
    }

    public int getOrientation() {
        return this.f309v;
    }

    public int getShowDividers() {
        return this.F;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f312y;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a ? new a((a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new a((ViewGroup.MarginLayoutParams) layoutParams) : new a(layoutParams);
    }

    public final boolean i(int i6) {
        if (i6 == 0) {
            return (this.F & 1) != 0;
        }
        if (i6 == getChildCount()) {
            return (this.F & 4) != 0;
        }
        if ((this.F & 2) != 0) {
            for (int i7 = i6 - 1; i7 >= 0; i7--) {
                if (getChildAt(i7).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i6;
        if (this.C == null) {
            return;
        }
        int i7 = 0;
        if (this.f309v == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i7 < virtualChildCount) {
                View childAt = getChildAt(i7);
                if (childAt != null && childAt.getVisibility() != 8 && i(i7)) {
                    d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin) - this.E);
                }
                i7++;
            }
            if (i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                d(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.E : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((a) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z6 = i1.f13669a;
        boolean z7 = getLayoutDirection() == 1;
        while (i7 < virtualChildCount2) {
            View childAt3 = getChildAt(i7);
            if (childAt3 != null && childAt3.getVisibility() != 8 && i(i7)) {
                a aVar = (a) childAt3.getLayoutParams();
                e(canvas, z7 ? childAt3.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.D);
            }
            i7++;
        }
        if (i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                a aVar2 = (a) childAt4.getLayoutParams();
                if (z7) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    i6 = this.D;
                    right = left - i6;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (z7) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i6 = this.D;
                right = left - i6;
            }
            e(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a9  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int measuredHeight;
        char c7;
        int i17;
        int i18;
        int i19;
        int i20 = 8;
        char c8 = 2;
        if (this.f309v == 1) {
            int paddingLeft = getPaddingLeft();
            int i21 = i8 - i6;
            int paddingRight = i21 - getPaddingRight();
            int paddingRight2 = (i21 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i22 = this.f310w;
            int i23 = i22 & 112;
            int i24 = 8388615 & i22;
            int paddingTop = i23 != 16 ? i23 != 80 ? getPaddingTop() : ((getPaddingTop() + i9) - i7) - this.f311x : getPaddingTop() + (((i9 - i7) - this.f311x) / 2);
            int i25 = 0;
            while (i25 < virtualChildCount) {
                View childAt = getChildAt(i25);
                if (childAt == null || childAt.getVisibility() == i20) {
                    c7 = c8;
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    a aVar = (a) childAt.getLayoutParams();
                    c7 = c8;
                    int i26 = ((LinearLayout.LayoutParams) aVar).gravity;
                    if (i26 < 0) {
                        i26 = i24;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i26, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        i17 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) aVar).leftMargin;
                        i18 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                    } else if (absoluteGravity != 5) {
                        i19 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                        if (i(i25)) {
                            paddingTop += this.E;
                        }
                        int i27 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                        childAt.layout(i19, i27, measuredWidth + i19, i27 + measuredHeight2);
                        paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) aVar).bottomMargin + i27;
                    } else {
                        i17 = paddingRight - measuredWidth;
                        i18 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                    }
                    i19 = i17 - i18;
                    if (i(i25)) {
                    }
                    int i272 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                    childAt.layout(i19, i272, measuredWidth + i19, i272 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) aVar).bottomMargin + i272;
                }
                i25++;
                c8 = c7;
                i20 = 8;
            }
            return;
        }
        boolean z7 = i1.f13669a;
        boolean z8 = getLayoutDirection() == 1;
        int paddingTop2 = getPaddingTop();
        int i28 = i9 - i7;
        int paddingBottom = i28 - getPaddingBottom();
        int paddingBottom2 = (i28 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i29 = this.f310w;
        int i30 = 8388615 & i29;
        int i31 = i29 & 112;
        boolean z9 = this.s;
        int[] iArr = this.A;
        int[] iArr2 = this.B;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i30, getLayoutDirection());
        int paddingLeft2 = absoluteGravity2 != 1 ? absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i8) - i6) - this.f311x : getPaddingLeft() + (((i8 - i6) - this.f311x) / 2);
        if (z8) {
            i11 = virtualChildCount2 - 1;
            i10 = -1;
        } else {
            i10 = 1;
            i11 = 0;
        }
        int i32 = 0;
        while (i32 < virtualChildCount2) {
            int i33 = (i10 * i32) + i11;
            View childAt2 = getChildAt(i33);
            if (childAt2 == null) {
                i12 = i11;
            } else {
                i12 = i11;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight3 = childAt2.getMeasuredHeight();
                    a aVar2 = (a) childAt2.getLayoutParams();
                    int i34 = paddingLeft2;
                    if (z9) {
                        i13 = paddingTop2;
                        int baseline = ((LinearLayout.LayoutParams) aVar2).height != -1 ? childAt2.getBaseline() : -1;
                        i14 = ((LinearLayout.LayoutParams) aVar2).gravity;
                        if (i14 < 0) {
                            i14 = i31;
                        }
                        i15 = i14 & 112;
                        if (i15 == 16) {
                            if (i15 == 48) {
                                i16 = i13 + ((LinearLayout.LayoutParams) aVar2).topMargin;
                                if (baseline != -1) {
                                    i16 = (iArr[1] - baseline) + i16;
                                }
                            } else if (i15 != 80) {
                                i16 = i13;
                            } else {
                                i16 = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) aVar2).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                                }
                            }
                            int i35 = (i(i33) ? i34 + this.D : i34) + ((LinearLayout.LayoutParams) aVar2).leftMargin;
                            childAt2.layout(i35, i16, i35 + measuredWidth2, i16 + measuredHeight3);
                            paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) aVar2).rightMargin + i35;
                            i32++;
                            i11 = i12;
                            paddingTop2 = i13;
                        } else {
                            i16 = ((paddingBottom2 - measuredHeight3) / 2) + i13 + ((LinearLayout.LayoutParams) aVar2).topMargin;
                            measuredHeight = ((LinearLayout.LayoutParams) aVar2).bottomMargin;
                        }
                        i16 -= measuredHeight;
                        int i352 = (i(i33) ? i34 + this.D : i34) + ((LinearLayout.LayoutParams) aVar2).leftMargin;
                        childAt2.layout(i352, i16, i352 + measuredWidth2, i16 + measuredHeight3);
                        paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) aVar2).rightMargin + i352;
                        i32++;
                        i11 = i12;
                        paddingTop2 = i13;
                    } else {
                        i13 = paddingTop2;
                    }
                    i14 = ((LinearLayout.LayoutParams) aVar2).gravity;
                    if (i14 < 0) {
                    }
                    i15 = i14 & 112;
                    if (i15 == 16) {
                    }
                    i16 -= measuredHeight;
                    int i3522 = (i(i33) ? i34 + this.D : i34) + ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    childAt2.layout(i3522, i16, i3522 + measuredWidth2, i16 + measuredHeight3);
                    paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) aVar2).rightMargin + i3522;
                    i32++;
                    i11 = i12;
                    paddingTop2 = i13;
                }
            }
            i13 = paddingTop2;
            i32++;
            i11 = i12;
            paddingTop2 = i13;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int iMax;
        int i11;
        int i12;
        int baseline;
        int i13;
        int i14;
        int[] iArr;
        int i15;
        int i16;
        boolean z6;
        boolean z7;
        a aVar;
        int i17;
        int[] iArr2;
        int i18;
        View view;
        int i19;
        boolean z8;
        boolean z9;
        int iMax2;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z10;
        int i28;
        int i29;
        int i30;
        View view2;
        boolean z11;
        b bVar = this;
        int i31 = -2;
        int iMax3 = 0;
        int i32 = 1073741824;
        int i33 = 8;
        if (bVar.f309v == 1) {
            bVar.f311x = 0;
            int virtualChildCount = bVar.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i6);
            int mode2 = View.MeasureSpec.getMode(i7);
            int i34 = bVar.f307t;
            boolean z12 = bVar.f313z;
            int i35 = 0;
            int iMax4 = 0;
            int iMax5 = 0;
            boolean z13 = false;
            int i36 = 0;
            boolean z14 = false;
            boolean z15 = true;
            float f6 = 0.0f;
            int iMax6 = 0;
            while (i35 < virtualChildCount) {
                int i37 = mode;
                View childAt = bVar.getChildAt(i35);
                if (childAt == null) {
                    bVar.f311x = bVar.f311x;
                } else {
                    if (childAt.getVisibility() != i33) {
                        if (bVar.i(i35)) {
                            bVar.f311x += bVar.E;
                        }
                        a aVar2 = (a) childAt.getLayoutParams();
                        float f7 = ((LinearLayout.LayoutParams) aVar2).weight;
                        f6 += f7;
                        if (mode2 == i32 && ((LinearLayout.LayoutParams) aVar2).height == 0 && f7 > 0.0f) {
                            int i38 = bVar.f311x;
                            bVar.f311x = Math.max(i38, ((LinearLayout.LayoutParams) aVar2).topMargin + i38 + ((LinearLayout.LayoutParams) aVar2).bottomMargin);
                            view2 = childAt;
                            i27 = mode2;
                            i28 = i34;
                            z10 = z12;
                            i29 = i35;
                            z13 = true;
                            i30 = i37;
                        } else {
                            if (((LinearLayout.LayoutParams) aVar2).height != 0 || f7 <= 0.0f) {
                                i24 = Integer.MIN_VALUE;
                            } else {
                                ((LinearLayout.LayoutParams) aVar2).height = i31;
                                i24 = 0;
                            }
                            if (f6 == 0.0f) {
                                i25 = i35;
                                i26 = bVar.f311x;
                            } else {
                                i25 = i35;
                                i26 = 0;
                            }
                            i27 = mode2;
                            z10 = z12;
                            i28 = i34;
                            i29 = i25;
                            i30 = i37;
                            bVar.measureChildWithMargins(childAt, i6, 0, i7, i26);
                            if (i24 != Integer.MIN_VALUE) {
                                ((LinearLayout.LayoutParams) aVar2).height = i24;
                            }
                            int measuredHeight = childAt.getMeasuredHeight();
                            int i39 = bVar.f311x;
                            view2 = childAt;
                            bVar.f311x = Math.max(i39, i39 + measuredHeight + ((LinearLayout.LayoutParams) aVar2).topMargin + ((LinearLayout.LayoutParams) aVar2).bottomMargin);
                            if (z10) {
                                iMax6 = Math.max(measuredHeight, iMax6);
                            }
                        }
                        if (i28 >= 0 && i28 == i29 + 1) {
                            bVar.f308u = bVar.f311x;
                        }
                        if (i29 < i28 && ((LinearLayout.LayoutParams) aVar2).weight > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        if (i30 == 1073741824 || ((LinearLayout.LayoutParams) aVar2).width != -1) {
                            z11 = false;
                        } else {
                            z11 = true;
                            z14 = true;
                        }
                        int i40 = ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                        int measuredWidth = view2.getMeasuredWidth() + i40;
                        iMax3 = Math.max(iMax3, measuredWidth);
                        int measuredState = view2.getMeasuredState();
                        boolean z16 = z11;
                        int iCombineMeasuredStates = View.combineMeasuredStates(i36, measuredState);
                        if (z15) {
                            i36 = iCombineMeasuredStates;
                            boolean z17 = ((LinearLayout.LayoutParams) aVar2).width == -1;
                            if (((LinearLayout.LayoutParams) aVar2).weight <= 0.0f) {
                                if (!z16) {
                                    i40 = measuredWidth;
                                }
                                iMax5 = Math.max(iMax5, i40);
                            } else {
                                if (!z16) {
                                    i40 = measuredWidth;
                                }
                                iMax4 = Math.max(iMax4, i40);
                            }
                            z15 = z17;
                        } else {
                            i36 = iCombineMeasuredStates;
                        }
                        if (((LinearLayout.LayoutParams) aVar2).weight <= 0.0f) {
                        }
                        z15 = z17;
                    }
                    i35 = i29 + 1;
                    i34 = i28;
                    mode = i30;
                    z12 = z10;
                    mode2 = i27;
                    i31 = -2;
                    i32 = 1073741824;
                    i33 = 8;
                }
                i27 = mode2;
                i28 = i34;
                z10 = z12;
                i29 = i35;
                i30 = i37;
                i35 = i29 + 1;
                i34 = i28;
                mode = i30;
                z12 = z10;
                mode2 = i27;
                i31 = -2;
                i32 = 1073741824;
                i33 = 8;
            }
            int i41 = mode;
            int i42 = mode2;
            boolean z18 = z12;
            int i43 = i36;
            int i44 = i7;
            if (bVar.f311x > 0 && bVar.i(virtualChildCount)) {
                bVar.f311x += bVar.E;
            }
            if (z18 && (i42 == Integer.MIN_VALUE || i42 == 0)) {
                bVar.f311x = 0;
                for (int i45 = 0; i45 < virtualChildCount; i45++) {
                    View childAt2 = bVar.getChildAt(i45);
                    if (childAt2 == null) {
                        bVar.f311x = bVar.f311x;
                    } else if (childAt2.getVisibility() != 8) {
                        a aVar3 = (a) childAt2.getLayoutParams();
                        int i46 = bVar.f311x;
                        bVar.f311x = Math.max(i46, i46 + iMax6 + ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin);
                    }
                }
            }
            int paddingBottom = bVar.getPaddingBottom() + bVar.getPaddingTop() + bVar.f311x;
            bVar.f311x = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, bVar.getSuggestedMinimumHeight()), i44, 0);
            int i47 = (iResolveSizeAndState & 16777215) - bVar.f311x;
            if (z13 || (i47 != 0 && f6 > 0.0f)) {
                float f8 = bVar.f312y;
                if (f8 > 0.0f) {
                    f6 = f8;
                }
                bVar.f311x = 0;
                int iCombineMeasuredStates2 = i43;
                int i48 = 0;
                while (i48 < virtualChildCount) {
                    View childAt3 = bVar.getChildAt(i48);
                    if (childAt3.getVisibility() == 8) {
                        i21 = i48;
                    } else {
                        a aVar4 = (a) childAt3.getLayoutParams();
                        float f9 = ((LinearLayout.LayoutParams) aVar4).weight;
                        if (f9 > 0.0f) {
                            int i49 = (int) ((i47 * f9) / f6);
                            f6 -= f9;
                            i47 -= i49;
                            i21 = i48;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i6, bVar.getPaddingRight() + bVar.getPaddingLeft() + ((LinearLayout.LayoutParams) aVar4).leftMargin + ((LinearLayout.LayoutParams) aVar4).rightMargin, ((LinearLayout.LayoutParams) aVar4).width);
                            if (((LinearLayout.LayoutParams) aVar4).height == 0) {
                                i23 = 1073741824;
                                if (i42 == 1073741824) {
                                    if (i49 <= 0) {
                                        i49 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i49, 1073741824));
                                }
                                iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                            } else {
                                i23 = 1073741824;
                            }
                            int measuredHeight2 = childAt3.getMeasuredHeight() + i49;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i23));
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                        } else {
                            i21 = i48;
                        }
                        int i50 = ((LinearLayout.LayoutParams) aVar4).leftMargin + ((LinearLayout.LayoutParams) aVar4).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i50;
                        iMax3 = Math.max(iMax3, measuredWidth2);
                        if (i41 != 1073741824) {
                            i22 = -1;
                            if (((LinearLayout.LayoutParams) aVar4).width == -1) {
                                measuredWidth2 = i50;
                            }
                        } else {
                            i22 = -1;
                        }
                        iMax4 = Math.max(iMax4, measuredWidth2);
                        boolean z19 = z15 && ((LinearLayout.LayoutParams) aVar4).width == i22;
                        int i51 = bVar.f311x;
                        bVar.f311x = Math.max(i51, childAt3.getMeasuredHeight() + i51 + ((LinearLayout.LayoutParams) aVar4).topMargin + ((LinearLayout.LayoutParams) aVar4).bottomMargin);
                        z15 = z19;
                    }
                    i48 = i21 + 1;
                }
                bVar.f311x = bVar.getPaddingBottom() + bVar.getPaddingTop() + bVar.f311x;
                i43 = iCombineMeasuredStates2;
            } else {
                iMax4 = Math.max(iMax4, iMax5);
                if (z18 && i42 != 1073741824) {
                    for (int i52 = 0; i52 < virtualChildCount; i52++) {
                        View childAt4 = bVar.getChildAt(i52);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(iMax6, 1073741824));
                        }
                    }
                }
            }
            if (z15 || i41 == 1073741824) {
                iMax4 = iMax3;
            }
            bVar.setMeasuredDimension(View.resolveSizeAndState(Math.max(bVar.getPaddingRight() + bVar.getPaddingLeft() + iMax4, bVar.getSuggestedMinimumWidth()), i6, i43), iResolveSizeAndState);
            if (z14) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(bVar.getMeasuredWidth(), 1073741824);
                int i53 = 0;
                while (i53 < virtualChildCount) {
                    View childAt5 = bVar.getChildAt(i53);
                    if (childAt5.getVisibility() != 8) {
                        a aVar5 = (a) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) aVar5).width == -1) {
                            int i54 = ((LinearLayout.LayoutParams) aVar5).height;
                            ((LinearLayout.LayoutParams) aVar5).height = childAt5.getMeasuredHeight();
                            bVar.measureChildWithMargins(childAt5, iMakeMeasureSpec, 0, i44, 0);
                            ((LinearLayout.LayoutParams) aVar5).height = i54;
                        }
                    }
                    i53++;
                    i44 = i7;
                }
                return;
            }
            return;
        }
        int i55 = i6;
        bVar.f311x = 0;
        int virtualChildCount2 = bVar.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i55);
        int mode4 = View.MeasureSpec.getMode(i7);
        if (bVar.A == null || bVar.B == null) {
            bVar.A = new int[4];
            bVar.B = new int[4];
        }
        int[] iArr3 = bVar.A;
        int[] iArr4 = bVar.B;
        iArr3[3] = -1;
        char c7 = 2;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z20 = bVar.s;
        boolean z21 = bVar.f313z;
        boolean z22 = mode3 == 1073741824;
        float f10 = 0.0f;
        boolean z23 = true;
        int i56 = 0;
        int i57 = 0;
        int i58 = 0;
        int iMax7 = 0;
        int iMax8 = 0;
        int iCombineMeasuredStates3 = 0;
        boolean z24 = false;
        boolean z25 = false;
        while (i56 < virtualChildCount2) {
            char c8 = c7;
            View childAt6 = bVar.getChildAt(i56);
            if (childAt6 == null) {
                bVar.f311x = bVar.f311x;
                i16 = i56;
                i20 = i58;
                iArr2 = iArr3;
                iArr = iArr4;
                z6 = z20;
                z7 = z21;
            } else {
                int i59 = i57;
                if (childAt6.getVisibility() == 8) {
                    i55 = i6;
                    i16 = i56;
                    i20 = i58;
                    iArr = iArr4;
                    z6 = z20;
                    z7 = z21;
                    i57 = i59;
                    iArr2 = iArr3;
                } else {
                    if (bVar.i(i56)) {
                        bVar.f311x += bVar.D;
                    }
                    a aVar6 = (a) childAt6.getLayoutParams();
                    float f11 = ((LinearLayout.LayoutParams) aVar6).weight;
                    f10 += f11;
                    int i60 = i56;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) aVar6).width == 0 && f11 > 0.0f) {
                        if (z22) {
                            bVar.f311x = ((LinearLayout.LayoutParams) aVar6).leftMargin + ((LinearLayout.LayoutParams) aVar6).rightMargin + bVar.f311x;
                        } else {
                            int i61 = bVar.f311x;
                            bVar.f311x = Math.max(i61, ((LinearLayout.LayoutParams) aVar6).leftMargin + i61 + ((LinearLayout.LayoutParams) aVar6).rightMargin);
                        }
                        if (z20) {
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
                            view = childAt6;
                            z6 = z20;
                            z7 = z21;
                            i17 = i59;
                            i16 = i60;
                            aVar = aVar6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i55 = i6;
                            i18 = i58;
                            i15 = iMax7;
                        } else {
                            view = childAt6;
                            z6 = z20;
                            z7 = z21;
                            z25 = true;
                            i17 = i59;
                            i16 = i60;
                            i19 = 1073741824;
                            aVar = aVar6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i55 = i6;
                            i18 = i58;
                            i15 = iMax7;
                            if (mode4 == i19 && ((LinearLayout.LayoutParams) aVar).height == -1) {
                                z8 = true;
                                z24 = true;
                            } else {
                                z8 = false;
                            }
                            int i62 = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                            int measuredHeight3 = view.getMeasuredHeight() + i62;
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                            if (z6) {
                                z9 = z8;
                            } else {
                                int baseline2 = view.getBaseline();
                                z9 = z8;
                                if (baseline2 != -1) {
                                    int i63 = ((LinearLayout.LayoutParams) aVar).gravity;
                                    if (i63 < 0) {
                                        i63 = bVar.f310w;
                                    }
                                    int i64 = (((i63 & 112) >> 4) & (-2)) >> 1;
                                    iArr2[i64] = Math.max(iArr2[i64], baseline2);
                                    iArr[i64] = Math.max(iArr[i64], measuredHeight3 - baseline2);
                                }
                            }
                            int iMax9 = Math.max(i17, measuredHeight3);
                            boolean z26 = !z23 && ((LinearLayout.LayoutParams) aVar).height == -1;
                            if (((LinearLayout.LayoutParams) aVar).weight <= 0.0f) {
                                if (!z9) {
                                    i62 = measuredHeight3;
                                }
                                iMax7 = Math.max(i15, i62);
                                iMax2 = i18;
                            } else {
                                if (!z9) {
                                    i62 = measuredHeight3;
                                }
                                iMax2 = Math.max(i18, i62);
                                iMax7 = i15;
                            }
                            int i65 = iMax2;
                            i57 = iMax9;
                            i20 = i65;
                            z23 = z26;
                        }
                    } else {
                        if (((LinearLayout.LayoutParams) aVar6).width != 0 || f11 <= 0.0f) {
                            i14 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) aVar6).width = -2;
                            i14 = 0;
                        }
                        iArr = iArr4;
                        i15 = iMax7;
                        i16 = i60;
                        z6 = z20;
                        z7 = z21;
                        int i66 = i14;
                        aVar = aVar6;
                        i17 = i59;
                        i55 = i6;
                        iArr2 = iArr3;
                        i18 = i58;
                        bVar.measureChildWithMargins(childAt6, i55, f10 == 0.0f ? bVar.f311x : 0, i7, 0);
                        if (i66 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) aVar).width = i66;
                        }
                        int measuredWidth3 = childAt6.getMeasuredWidth();
                        if (z22) {
                            view = childAt6;
                            bVar.f311x = ((LinearLayout.LayoutParams) aVar).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) aVar).rightMargin + bVar.f311x;
                        } else {
                            view = childAt6;
                            int i67 = bVar.f311x;
                            bVar.f311x = Math.max(i67, i67 + measuredWidth3 + ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin);
                        }
                        if (z7) {
                            iMax8 = Math.max(measuredWidth3, iMax8);
                        }
                    }
                    i19 = 1073741824;
                    if (mode4 == i19) {
                        z8 = false;
                        int i622 = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                        int measuredHeight32 = view.getMeasuredHeight() + i622;
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                        if (z6) {
                        }
                        int iMax92 = Math.max(i17, measuredHeight32);
                        if (z23) {
                            if (((LinearLayout.LayoutParams) aVar).weight <= 0.0f) {
                            }
                            int i652 = iMax2;
                            i57 = iMax92;
                            i20 = i652;
                            z23 = z26;
                        }
                    }
                }
            }
            i58 = i20;
            i56 = i16 + 1;
            c7 = c8;
            iArr3 = iArr2;
            iArr4 = iArr;
            z20 = z6;
            z21 = z7;
        }
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c9 = c7;
        boolean z27 = z20;
        boolean z28 = z21;
        int i68 = i57;
        int i69 = i58;
        int i70 = iMax7;
        if (bVar.f311x > 0 && bVar.i(virtualChildCount2)) {
            bVar.f311x += bVar.D;
        }
        int i71 = iArr5[1];
        int iMax10 = (i71 == -1 && iArr5[0] == -1 && iArr5[c9] == -1 && iArr5[3] == -1) ? i68 : Math.max(i68, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c9]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i71, iArr5[c9]))));
        if (z28 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            bVar.f311x = 0;
            for (int i72 = 0; i72 < virtualChildCount2; i72++) {
                View childAt7 = bVar.getChildAt(i72);
                if (childAt7 == null) {
                    bVar.f311x = bVar.f311x;
                } else if (childAt7.getVisibility() != 8) {
                    a aVar7 = (a) childAt7.getLayoutParams();
                    if (z22) {
                        bVar.f311x = ((LinearLayout.LayoutParams) aVar7).leftMargin + iMax8 + ((LinearLayout.LayoutParams) aVar7).rightMargin + bVar.f311x;
                    } else {
                        int i73 = bVar.f311x;
                        bVar.f311x = Math.max(i73, i73 + iMax8 + ((LinearLayout.LayoutParams) aVar7).leftMargin + ((LinearLayout.LayoutParams) aVar7).rightMargin);
                    }
                }
            }
        }
        int paddingRight = bVar.getPaddingRight() + bVar.getPaddingLeft() + bVar.f311x;
        bVar.f311x = paddingRight;
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, bVar.getSuggestedMinimumWidth()), i55, 0);
        int i74 = (iResolveSizeAndState2 & 16777215) - bVar.f311x;
        if (z25 || (i74 != 0 && f10 > 0.0f)) {
            float f12 = bVar.f312y;
            if (f12 > 0.0f) {
                f10 = f12;
            }
            iArr5[3] = -1;
            iArr5[c9] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[c9] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            bVar.f311x = 0;
            iMax10 = -1;
            int i75 = 0;
            while (i75 < virtualChildCount2) {
                View childAt8 = bVar.getChildAt(i75);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    i11 = iResolveSizeAndState2;
                } else {
                    a aVar8 = (a) childAt8.getLayoutParams();
                    float f13 = ((LinearLayout.LayoutParams) aVar8).weight;
                    if (f13 > 0.0f) {
                        int i76 = (int) ((i74 * f13) / f10);
                        f10 -= f13;
                        i74 -= i76;
                        i11 = iResolveSizeAndState2;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i7, bVar.getPaddingBottom() + bVar.getPaddingTop() + ((LinearLayout.LayoutParams) aVar8).topMargin + ((LinearLayout.LayoutParams) aVar8).bottomMargin, ((LinearLayout.LayoutParams) aVar8).height);
                        if (((LinearLayout.LayoutParams) aVar8).width == 0) {
                            i13 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i76 <= 0) {
                                    i76 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i76, 1073741824), childMeasureSpec2);
                            }
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                        } else {
                            i13 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i76;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i13), childMeasureSpec2);
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                    } else {
                        i11 = iResolveSizeAndState2;
                    }
                    if (z22) {
                        bVar.f311x = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) aVar8).leftMargin + ((LinearLayout.LayoutParams) aVar8).rightMargin + bVar.f311x;
                    } else {
                        int i77 = bVar.f311x;
                        bVar.f311x = Math.max(i77, childAt8.getMeasuredWidth() + i77 + ((LinearLayout.LayoutParams) aVar8).leftMargin + ((LinearLayout.LayoutParams) aVar8).rightMargin);
                    }
                    boolean z29 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) aVar8).height == -1;
                    int i78 = ((LinearLayout.LayoutParams) aVar8).topMargin + ((LinearLayout.LayoutParams) aVar8).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i78;
                    iMax10 = Math.max(iMax10, measuredHeight4);
                    if (!z29) {
                        i78 = measuredHeight4;
                    }
                    int iMax11 = Math.max(i69, i78);
                    if (z23) {
                        i12 = -1;
                        boolean z30 = ((LinearLayout.LayoutParams) aVar8).height == -1;
                        if (!z27 && (baseline = childAt8.getBaseline()) != i12) {
                            int i79 = ((LinearLayout.LayoutParams) aVar8).gravity;
                            if (i79 < 0) {
                                i79 = bVar.f310w;
                            }
                            int i80 = (((i79 & 112) >> 4) & (-2)) >> 1;
                            iArr5[i80] = Math.max(iArr5[i80], baseline);
                            iArr6[i80] = Math.max(iArr6[i80], measuredHeight4 - baseline);
                        }
                        z23 = z30;
                        i69 = iMax11;
                    } else {
                        i12 = -1;
                    }
                    if (!z27) {
                        z23 = z30;
                        i69 = iMax11;
                    }
                }
                i75++;
                iResolveSizeAndState2 = i11;
            }
            i8 = iResolveSizeAndState2;
            i9 = -16777216;
            bVar.f311x = bVar.getPaddingRight() + bVar.getPaddingLeft() + bVar.f311x;
            int i81 = iArr5[1];
            if (i81 == -1 && iArr5[0] == -1 && iArr5[c9] == -1 && iArr5[3] == -1) {
                i10 = 0;
            } else {
                i10 = 0;
                iMax10 = Math.max(iMax10, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c9]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i81, iArr5[c9]))));
            }
            iMax = i69;
        } else {
            iMax = Math.max(i69, i70);
            if (z28 && mode3 != 1073741824) {
                for (int i82 = 0; i82 < virtualChildCount2; i82++) {
                    View childAt9 = bVar.getChildAt(i82);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) childAt9.getLayoutParams())).weight > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(iMax8, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i8 = iResolveSizeAndState2;
            i9 = -16777216;
            i10 = 0;
        }
        if (!z23 && mode4 != 1073741824) {
            iMax10 = iMax;
        }
        bVar.setMeasuredDimension(i8 | (iCombineMeasuredStates3 & i9), View.resolveSizeAndState(Math.max(bVar.getPaddingBottom() + bVar.getPaddingTop() + iMax10, bVar.getSuggestedMinimumHeight()), i7, iCombineMeasuredStates3 << 16));
        if (z24) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(bVar.getMeasuredHeight(), 1073741824);
            int i83 = i10;
            while (i83 < virtualChildCount2) {
                View childAt10 = bVar.getChildAt(i83);
                if (childAt10.getVisibility() != 8) {
                    a aVar9 = (a) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) aVar9).height == -1) {
                        int i84 = ((LinearLayout.LayoutParams) aVar9).width;
                        ((LinearLayout.LayoutParams) aVar9).width = childAt10.getMeasuredWidth();
                        bVar.measureChildWithMargins(childAt10, i55, 0, iMakeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) aVar9).width = i84;
                    }
                }
                i83++;
                bVar = this;
                i55 = i6;
            }
        }
    }

    public void setBaselineAligned(boolean z6) {
        this.s = z6;
    }

    public void setBaselineAlignedChildIndex(int i6) {
        if (i6 >= 0 && i6 < getChildCount()) {
            this.f307t = i6;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.C) {
            return;
        }
        this.C = drawable;
        if (drawable != null) {
            this.D = drawable.getIntrinsicWidth();
            this.E = drawable.getIntrinsicHeight();
        } else {
            this.D = 0;
            this.E = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i6) {
        this.G = i6;
    }

    public void setGravity(int i6) {
        if (this.f310w != i6) {
            if ((8388615 & i6) == 0) {
                i6 |= 8388611;
            }
            if ((i6 & 112) == 0) {
                i6 |= 48;
            }
            this.f310w = i6;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i6) {
        int i7 = i6 & 8388615;
        int i8 = this.f310w;
        if ((8388615 & i8) != i7) {
            this.f310w = i7 | ((-8388616) & i8);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z6) {
        this.f313z = z6;
    }

    public void setOrientation(int i6) {
        if (this.f309v != i6) {
            this.f309v = i6;
            requestLayout();
        }
    }

    public void setShowDividers(int i6) {
        if (i6 != this.F) {
            requestLayout();
        }
        this.F = i6;
    }

    public void setVerticalGravity(int i6) {
        int i7 = i6 & 112;
        int i8 = this.f310w;
        if ((i8 & 112) != i7) {
            this.f310w = i7 | (i8 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f6) {
        this.f312y = Math.max(0.0f, f6);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public b(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, 0);
        this.s = true;
        this.f307t = -1;
        this.f308u = 0;
        this.f310w = 8388659;
        int[] iArr = f.a.f12946n;
        b1 b1VarE = b1.e(0, 0, context, attributeSet, iArr);
        f0.l(this, context, iArr, attributeSet, b1VarE.f13583b, 0, 0);
        TypedArray typedArray = b1VarE.f13583b;
        int i7 = typedArray.getInt(1, -1);
        if (i7 >= 0) {
            setOrientation(i7);
        }
        int i8 = typedArray.getInt(0, -1);
        if (i8 >= 0) {
            setGravity(i8);
        }
        boolean z6 = typedArray.getBoolean(2, true);
        if (!z6) {
            setBaselineAligned(z6);
        }
        this.f312y = typedArray.getFloat(4, -1.0f);
        this.f307t = typedArray.getInt(3, -1);
        this.f313z = typedArray.getBoolean(7, false);
        setDividerDrawable(b1VarE.b(5));
        this.F = typedArray.getInt(8, 0);
        this.G = typedArray.getDimensionPixelSize(6, 0);
        b1VarE.f();
    }
}
