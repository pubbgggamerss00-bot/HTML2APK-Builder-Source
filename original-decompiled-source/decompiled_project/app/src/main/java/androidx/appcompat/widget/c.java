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
import com.yalantis.ucrop.view.CropImageView;
import m.j0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import y3.q0;

/* loaded from: classes.dex */
public class c extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public boolean f692a;

    /* renamed from: b, reason: collision with root package name */
    public int f693b;

    /* renamed from: c, reason: collision with root package name */
    public int f694c;

    /* renamed from: d, reason: collision with root package name */
    public int f695d;

    /* renamed from: e, reason: collision with root package name */
    public int f696e;

    /* renamed from: f, reason: collision with root package name */
    public int f697f;

    /* renamed from: g, reason: collision with root package name */
    public float f698g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f699h;

    /* renamed from: j, reason: collision with root package name */
    public int[] f700j;

    /* renamed from: k, reason: collision with root package name */
    public int[] f701k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f702l;

    /* renamed from: m, reason: collision with root package name */
    public int f703m;

    /* renamed from: n, reason: collision with root package name */
    public int f704n;

    /* renamed from: p, reason: collision with root package name */
    public int f705p;

    /* renamed from: q, reason: collision with root package name */
    public int f706q;

    public static class a extends LinearLayout.LayoutParams {
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f692a = true;
        this.f693b = -1;
        this.f694c = 0;
        this.f696e = 8388659;
        int[] iArr = g.a.f11249h;
        j0 j0VarD = j0.d(context, attributeSet, iArr, 0);
        q0.g(this, context, iArr, attributeSet, j0VarD.f17144b, 0);
        TypedArray typedArray = j0VarD.f17144b;
        int i10 = typedArray.getInt(1, -1);
        if (i10 >= 0) {
            setOrientation(i10);
        }
        int i11 = typedArray.getInt(0, -1);
        if (i11 >= 0) {
            setGravity(i11);
        }
        boolean z10 = typedArray.getBoolean(2, true);
        if (!z10) {
            setBaselineAligned(z10);
        }
        this.f698g = typedArray.getFloat(4, -1.0f);
        this.f693b = typedArray.getInt(3, -1);
        this.f699h = typedArray.getBoolean(7, false);
        setDividerDrawable(j0VarD.b(5));
        this.f705p = typedArray.getInt(8, 0);
        this.f706q = typedArray.getDimensionPixelSize(6, 0);
        j0VarD.e();
    }

    public final void a(Canvas canvas, int i10) {
        this.f702l.setBounds(getPaddingLeft() + this.f706q, i10, (getWidth() - getPaddingRight()) - this.f706q, this.f704n + i10);
        this.f702l.draw(canvas);
    }

    public final void b(Canvas canvas, int i10) {
        this.f702l.setBounds(i10, getPaddingTop() + this.f706q, this.f703m + i10, (getHeight() - getPaddingBottom()) - this.f706q);
        this.f702l.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i10 = this.f695d;
        if (i10 == 0) {
            return new a(-2, -2);
        }
        if (i10 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    @Override // android.view.ViewGroup
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a ? new a((a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new a((ViewGroup.MarginLayoutParams) layoutParams) : new a(layoutParams);
    }

    public final boolean f(int i10) {
        if (i10 == 0) {
            return (this.f705p & 1) != 0;
        }
        if (i10 == getChildCount()) {
            return (this.f705p & 4) != 0;
        }
        if ((this.f705p & 2) != 0) {
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                if (getChildAt(i11).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.f693b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f693b;
        if (childCount <= i11) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i11);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f693b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int iA = this.f694c;
        if (this.f695d == 1 && (i10 = this.f696e & 112) != 48) {
            if (i10 == 16) {
                iA = m.b.a(((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom(), this.f697f, 2, iA);
            } else if (i10 == 80) {
                iA = ((getBottom() - getTop()) - getPaddingBottom()) - this.f697f;
            }
        }
        return iA + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f693b;
    }

    public Drawable getDividerDrawable() {
        return this.f702l;
    }

    public int getDividerPadding() {
        return this.f706q;
    }

    public int getDividerWidth() {
        return this.f703m;
    }

    public int getGravity() {
        return this.f696e;
    }

    public int getOrientation() {
        return this.f695d;
    }

    public int getShowDividers() {
        return this.f705p;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f698g;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i10;
        if (this.f702l == null) {
            return;
        }
        int i11 = 0;
        if (this.f695d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i11 < virtualChildCount) {
                View childAt = getChildAt(i11);
                if (childAt != null && childAt.getVisibility() != 8 && f(i11)) {
                    a(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin) - this.f704n);
                }
                i11++;
            }
            if (f(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                a(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f704n : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((a) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z10 = getLayoutDirection() == 1;
        while (i11 < virtualChildCount2) {
            View childAt3 = getChildAt(i11);
            if (childAt3 != null && childAt3.getVisibility() != 8 && f(i11)) {
                a aVar = (a) childAt3.getLayoutParams();
                b(canvas, z10 ? childAt3.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f703m);
            }
            i11++;
        }
        if (f(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                a aVar2 = (a) childAt4.getLayoutParams();
                if (z10) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    i10 = this.f703m;
                    right = left - i10;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (z10) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i10 = this.f703m;
                right = left - i10;
            }
            b(canvas, right);
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

    /* JADX WARN: Removed duplicated region for block: B:62:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ab  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int iA;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int iA2;
        int i22 = 8;
        if (this.f695d == 1) {
            int paddingLeft = getPaddingLeft();
            int i23 = i12 - i10;
            int paddingRight = i23 - getPaddingRight();
            int paddingRight2 = (i23 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i24 = this.f696e;
            int i25 = i24 & 112;
            int i26 = 8388615 & i24;
            int paddingTop = i25 != 16 ? i25 != 80 ? getPaddingTop() : ((getPaddingTop() + i13) - i11) - this.f697f : m.b.a(i13 - i11, this.f697f, 2, getPaddingTop());
            int i27 = 0;
            while (i27 < virtualChildCount) {
                View childAt = getChildAt(i27);
                if (childAt != null && childAt.getVisibility() != i22) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    a aVar = (a) childAt.getLayoutParams();
                    int i28 = ((LinearLayout.LayoutParams) aVar).gravity;
                    if (i28 < 0) {
                        i28 = i26;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i28, getLayoutDirection()) & 7;
                    int iA3 = absoluteGravity != 1 ? absoluteGravity != 5 ? ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft : (paddingRight - measuredWidth) - ((LinearLayout.LayoutParams) aVar).rightMargin : (m.b.a(paddingRight2, measuredWidth, 2, paddingLeft) + ((LinearLayout.LayoutParams) aVar).leftMargin) - ((LinearLayout.LayoutParams) aVar).rightMargin;
                    if (f(i27)) {
                        paddingTop += this.f704n;
                    }
                    int i29 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                    childAt.layout(iA3, i29, measuredWidth + iA3, i29 + measuredHeight);
                    paddingTop = measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + i29;
                }
                i27++;
                i22 = 8;
            }
            return;
        }
        boolean z11 = getLayoutDirection() == 1;
        int paddingTop2 = getPaddingTop();
        int i30 = i13 - i11;
        int paddingBottom = i30 - getPaddingBottom();
        int paddingBottom2 = (i30 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i31 = this.f696e;
        int i32 = 8388615 & i31;
        int i33 = i31 & 112;
        boolean z12 = this.f692a;
        int[] iArr = this.f700j;
        int[] iArr2 = this.f701k;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i32, getLayoutDirection());
        if (absoluteGravity2 != 1) {
            iA = absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i12) - i10) - this.f697f;
            i14 = 1;
        } else {
            i14 = 1;
            iA = m.b.a(i12 - i10, this.f697f, 2, getPaddingLeft());
        }
        if (z11) {
            i16 = virtualChildCount2 - 1;
            i15 = -1;
        } else {
            i15 = i14;
            i16 = 0;
        }
        int i34 = 0;
        while (i34 < virtualChildCount2) {
            int i35 = (i15 * i34) + i16;
            View childAt2 = getChildAt(i35);
            if (childAt2 == null) {
                i17 = i16;
            } else {
                i17 = i16;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    int i36 = iA;
                    a aVar2 = (a) childAt2.getLayoutParams();
                    if (z12) {
                        i18 = i15;
                        int baseline = ((LinearLayout.LayoutParams) aVar2).height != -1 ? childAt2.getBaseline() : -1;
                        i19 = ((LinearLayout.LayoutParams) aVar2).gravity;
                        if (i19 < 0) {
                            i19 = i33;
                        }
                        i20 = i19 & 112;
                        i21 = i34;
                        if (i20 != 16) {
                            iA2 = (m.b.a(paddingBottom2, measuredHeight2, 2, paddingTop2) + ((LinearLayout.LayoutParams) aVar2).topMargin) - ((LinearLayout.LayoutParams) aVar2).bottomMargin;
                        } else if (i20 == 48) {
                            iA2 = ((LinearLayout.LayoutParams) aVar2).topMargin + paddingTop2;
                            if (baseline != -1) {
                                iA2 = (iArr[i14] - baseline) + iA2;
                            }
                        } else if (i20 != 80) {
                            iA2 = paddingTop2;
                        } else {
                            iA2 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) aVar2).bottomMargin;
                            if (baseline != -1) {
                                iA2 -= iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                            }
                        }
                        int i37 = (!f(i35) ? i36 + this.f703m : i36) + ((LinearLayout.LayoutParams) aVar2).leftMargin;
                        childAt2.layout(i37, iA2, i37 + measuredWidth2, measuredHeight2 + iA2);
                        iA = measuredWidth2 + ((LinearLayout.LayoutParams) aVar2).rightMargin + i37;
                        i34 = i21 + 1;
                        i15 = i18;
                        i16 = i17;
                    } else {
                        i18 = i15;
                    }
                    i19 = ((LinearLayout.LayoutParams) aVar2).gravity;
                    if (i19 < 0) {
                    }
                    i20 = i19 & 112;
                    i21 = i34;
                    if (i20 != 16) {
                    }
                    int i372 = (!f(i35) ? i36 + this.f703m : i36) + ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    childAt2.layout(i372, iA2, i372 + measuredWidth2, measuredHeight2 + iA2);
                    iA = measuredWidth2 + ((LinearLayout.LayoutParams) aVar2).rightMargin + i372;
                    i34 = i21 + 1;
                    i15 = i18;
                    i16 = i17;
                }
            }
            i18 = i15;
            i21 = i34;
            i34 = i21 + 1;
            i15 = i18;
            i16 = i17;
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
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int iMax;
        int i15;
        int i16;
        int baseline;
        int i17;
        int i18;
        int[] iArr;
        int i19;
        int i20;
        boolean z10;
        boolean z11;
        a aVar;
        int i21;
        int[] iArr2;
        int i22;
        View view;
        int i23;
        boolean z12;
        boolean z13;
        int iMax2;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        boolean z14;
        int i32;
        int i33;
        int i34;
        View view2;
        boolean z15;
        c cVar = this;
        int i35 = -2;
        int iMax3 = 0;
        int i36 = 1073741824;
        int i37 = 8;
        if (cVar.f695d == 1) {
            cVar.f697f = 0;
            int virtualChildCount = cVar.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int i38 = cVar.f693b;
            boolean z16 = cVar.f699h;
            int i39 = 0;
            int iMax4 = 0;
            int iMax5 = 0;
            boolean z17 = false;
            int i40 = 0;
            boolean z18 = false;
            boolean z19 = true;
            float f10 = CropImageView.DEFAULT_ASPECT_RATIO;
            int iMax6 = 0;
            while (i39 < virtualChildCount) {
                int i41 = mode;
                View childAt = cVar.getChildAt(i39);
                if (childAt == null) {
                    cVar.f697f = cVar.f697f;
                } else {
                    if (childAt.getVisibility() != i37) {
                        if (cVar.f(i39)) {
                            cVar.f697f += cVar.f704n;
                        }
                        a aVar2 = (a) childAt.getLayoutParams();
                        float f11 = ((LinearLayout.LayoutParams) aVar2).weight;
                        f10 += f11;
                        if (mode2 == i36 && ((LinearLayout.LayoutParams) aVar2).height == 0 && f11 > CropImageView.DEFAULT_ASPECT_RATIO) {
                            int i42 = cVar.f697f;
                            cVar.f697f = Math.max(i42, ((LinearLayout.LayoutParams) aVar2).topMargin + i42 + ((LinearLayout.LayoutParams) aVar2).bottomMargin);
                            view2 = childAt;
                            i31 = mode2;
                            i32 = i38;
                            z14 = z16;
                            i33 = i39;
                            z17 = true;
                            i34 = i41;
                        } else {
                            if (((LinearLayout.LayoutParams) aVar2).height != 0 || f11 <= CropImageView.DEFAULT_ASPECT_RATIO) {
                                i28 = PKIFailureInfo.systemUnavail;
                            } else {
                                ((LinearLayout.LayoutParams) aVar2).height = i35;
                                i28 = 0;
                            }
                            if (f10 == CropImageView.DEFAULT_ASPECT_RATIO) {
                                i29 = i39;
                                i30 = cVar.f697f;
                            } else {
                                i29 = i39;
                                i30 = 0;
                            }
                            i31 = mode2;
                            z14 = z16;
                            i32 = i38;
                            i33 = i29;
                            i34 = i41;
                            cVar.measureChildWithMargins(childAt, i10, 0, i11, i30);
                            if (i28 != Integer.MIN_VALUE) {
                                ((LinearLayout.LayoutParams) aVar2).height = i28;
                            }
                            int measuredHeight = childAt.getMeasuredHeight();
                            int i43 = cVar.f697f;
                            view2 = childAt;
                            cVar.f697f = Math.max(i43, i43 + measuredHeight + ((LinearLayout.LayoutParams) aVar2).topMargin + ((LinearLayout.LayoutParams) aVar2).bottomMargin);
                            if (z14) {
                                iMax6 = Math.max(measuredHeight, iMax6);
                            }
                        }
                        if (i32 >= 0 && i32 == i33 + 1) {
                            cVar.f694c = cVar.f697f;
                        }
                        if (i33 < i32 && ((LinearLayout.LayoutParams) aVar2).weight > CropImageView.DEFAULT_ASPECT_RATIO) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        if (i34 == 1073741824 || ((LinearLayout.LayoutParams) aVar2).width != -1) {
                            z15 = false;
                        } else {
                            z15 = true;
                            z18 = true;
                        }
                        int i44 = ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                        int measuredWidth = view2.getMeasuredWidth() + i44;
                        iMax3 = Math.max(iMax3, measuredWidth);
                        int measuredState = view2.getMeasuredState();
                        boolean z20 = z15;
                        int iCombineMeasuredStates = View.combineMeasuredStates(i40, measuredState);
                        if (z19) {
                            i40 = iCombineMeasuredStates;
                            boolean z21 = ((LinearLayout.LayoutParams) aVar2).width == -1;
                            if (((LinearLayout.LayoutParams) aVar2).weight <= CropImageView.DEFAULT_ASPECT_RATIO) {
                                if (!z20) {
                                    i44 = measuredWidth;
                                }
                                iMax5 = Math.max(iMax5, i44);
                            } else {
                                if (!z20) {
                                    i44 = measuredWidth;
                                }
                                iMax4 = Math.max(iMax4, i44);
                            }
                            z19 = z21;
                        } else {
                            i40 = iCombineMeasuredStates;
                        }
                        if (((LinearLayout.LayoutParams) aVar2).weight <= CropImageView.DEFAULT_ASPECT_RATIO) {
                        }
                        z19 = z21;
                    }
                    i39 = i33 + 1;
                    i38 = i32;
                    mode = i34;
                    z16 = z14;
                    mode2 = i31;
                    i35 = -2;
                    i36 = 1073741824;
                    i37 = 8;
                }
                i31 = mode2;
                i32 = i38;
                z14 = z16;
                i33 = i39;
                i34 = i41;
                i39 = i33 + 1;
                i38 = i32;
                mode = i34;
                z16 = z14;
                mode2 = i31;
                i35 = -2;
                i36 = 1073741824;
                i37 = 8;
            }
            int i45 = mode;
            int i46 = mode2;
            boolean z22 = z16;
            int i47 = i40;
            int i48 = i11;
            if (cVar.f697f > 0 && cVar.f(virtualChildCount)) {
                cVar.f697f += cVar.f704n;
            }
            if (z22 && (i46 == Integer.MIN_VALUE || i46 == 0)) {
                cVar.f697f = 0;
                for (int i49 = 0; i49 < virtualChildCount; i49++) {
                    View childAt2 = cVar.getChildAt(i49);
                    if (childAt2 == null) {
                        cVar.f697f = cVar.f697f;
                    } else if (childAt2.getVisibility() != 8) {
                        a aVar3 = (a) childAt2.getLayoutParams();
                        int i50 = cVar.f697f;
                        cVar.f697f = Math.max(i50, i50 + iMax6 + ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin);
                    }
                }
            }
            int paddingBottom = cVar.getPaddingBottom() + cVar.getPaddingTop() + cVar.f697f;
            cVar.f697f = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, cVar.getSuggestedMinimumHeight()), i48, 0);
            int i51 = (iResolveSizeAndState & 16777215) - cVar.f697f;
            if (z17 || (i51 != 0 && f10 > CropImageView.DEFAULT_ASPECT_RATIO)) {
                float f12 = cVar.f698g;
                if (f12 > CropImageView.DEFAULT_ASPECT_RATIO) {
                    f10 = f12;
                }
                cVar.f697f = 0;
                int iCombineMeasuredStates2 = i47;
                int i52 = 0;
                while (i52 < virtualChildCount) {
                    View childAt3 = cVar.getChildAt(i52);
                    if (childAt3.getVisibility() == 8) {
                        i25 = i52;
                    } else {
                        a aVar4 = (a) childAt3.getLayoutParams();
                        float f13 = ((LinearLayout.LayoutParams) aVar4).weight;
                        if (f13 > CropImageView.DEFAULT_ASPECT_RATIO) {
                            int i53 = (int) ((i51 * f13) / f10);
                            f10 -= f13;
                            i51 -= i53;
                            i25 = i52;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, cVar.getPaddingRight() + cVar.getPaddingLeft() + ((LinearLayout.LayoutParams) aVar4).leftMargin + ((LinearLayout.LayoutParams) aVar4).rightMargin, ((LinearLayout.LayoutParams) aVar4).width);
                            if (((LinearLayout.LayoutParams) aVar4).height == 0) {
                                i27 = 1073741824;
                                if (i46 == 1073741824) {
                                    if (i53 <= 0) {
                                        i53 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i53, 1073741824));
                                }
                                iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                            } else {
                                i27 = 1073741824;
                            }
                            int measuredHeight2 = childAt3.getMeasuredHeight() + i53;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i27));
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                        } else {
                            i25 = i52;
                        }
                        int i54 = ((LinearLayout.LayoutParams) aVar4).leftMargin + ((LinearLayout.LayoutParams) aVar4).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i54;
                        iMax3 = Math.max(iMax3, measuredWidth2);
                        if (i45 != 1073741824) {
                            i26 = -1;
                            if (((LinearLayout.LayoutParams) aVar4).width == -1) {
                                measuredWidth2 = i54;
                            }
                        } else {
                            i26 = -1;
                        }
                        iMax4 = Math.max(iMax4, measuredWidth2);
                        boolean z23 = z19 && ((LinearLayout.LayoutParams) aVar4).width == i26;
                        int i55 = cVar.f697f;
                        cVar.f697f = Math.max(i55, childAt3.getMeasuredHeight() + i55 + ((LinearLayout.LayoutParams) aVar4).topMargin + ((LinearLayout.LayoutParams) aVar4).bottomMargin);
                        z19 = z23;
                    }
                    i52 = i25 + 1;
                }
                cVar.f697f = cVar.getPaddingBottom() + cVar.getPaddingTop() + cVar.f697f;
                i47 = iCombineMeasuredStates2;
            } else {
                iMax4 = Math.max(iMax4, iMax5);
                if (z22 && i46 != 1073741824) {
                    for (int i56 = 0; i56 < virtualChildCount; i56++) {
                        View childAt4 = cVar.getChildAt(i56);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) childAt4.getLayoutParams())).weight > CropImageView.DEFAULT_ASPECT_RATIO) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(iMax6, 1073741824));
                        }
                    }
                }
            }
            if (z19 || i45 == 1073741824) {
                iMax4 = iMax3;
            }
            cVar.setMeasuredDimension(View.resolveSizeAndState(Math.max(cVar.getPaddingRight() + cVar.getPaddingLeft() + iMax4, cVar.getSuggestedMinimumWidth()), i10, i47), iResolveSizeAndState);
            if (z18) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(cVar.getMeasuredWidth(), 1073741824);
                int i57 = 0;
                while (i57 < virtualChildCount) {
                    View childAt5 = cVar.getChildAt(i57);
                    if (childAt5.getVisibility() != 8) {
                        a aVar5 = (a) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) aVar5).width == -1) {
                            int i58 = ((LinearLayout.LayoutParams) aVar5).height;
                            ((LinearLayout.LayoutParams) aVar5).height = childAt5.getMeasuredHeight();
                            cVar.measureChildWithMargins(childAt5, iMakeMeasureSpec, 0, i48, 0);
                            ((LinearLayout.LayoutParams) aVar5).height = i58;
                        }
                    }
                    i57++;
                    i48 = i11;
                }
                return;
            }
            return;
        }
        int i59 = i10;
        cVar.f697f = 0;
        int virtualChildCount2 = cVar.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i59);
        int mode4 = View.MeasureSpec.getMode(i11);
        if (cVar.f700j == null || cVar.f701k == null) {
            cVar.f700j = new int[4];
            cVar.f701k = new int[4];
        }
        int[] iArr3 = cVar.f700j;
        int[] iArr4 = cVar.f701k;
        iArr3[3] = -1;
        char c10 = 2;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z24 = cVar.f692a;
        boolean z25 = cVar.f699h;
        boolean z26 = mode3 == 1073741824;
        float f14 = 0.0f;
        boolean z27 = true;
        int i60 = 0;
        int i61 = 0;
        int i62 = 0;
        int iMax7 = 0;
        int iMax8 = 0;
        int iCombineMeasuredStates3 = 0;
        boolean z28 = false;
        boolean z29 = false;
        while (i60 < virtualChildCount2) {
            char c11 = c10;
            View childAt6 = cVar.getChildAt(i60);
            if (childAt6 == null) {
                cVar.f697f = cVar.f697f;
                i20 = i60;
                i24 = i62;
                iArr2 = iArr3;
                iArr = iArr4;
                z10 = z24;
                z11 = z25;
            } else {
                int i63 = i61;
                if (childAt6.getVisibility() == 8) {
                    i59 = i10;
                    i20 = i60;
                    i24 = i62;
                    iArr = iArr4;
                    z10 = z24;
                    z11 = z25;
                    i61 = i63;
                    iArr2 = iArr3;
                } else {
                    if (cVar.f(i60)) {
                        cVar.f697f += cVar.f703m;
                    }
                    a aVar6 = (a) childAt6.getLayoutParams();
                    float f15 = ((LinearLayout.LayoutParams) aVar6).weight;
                    f14 += f15;
                    int i64 = i60;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) aVar6).width == 0 && f15 > CropImageView.DEFAULT_ASPECT_RATIO) {
                        if (z26) {
                            cVar.f697f = ((LinearLayout.LayoutParams) aVar6).leftMargin + ((LinearLayout.LayoutParams) aVar6).rightMargin + cVar.f697f;
                        } else {
                            int i65 = cVar.f697f;
                            cVar.f697f = Math.max(i65, ((LinearLayout.LayoutParams) aVar6).leftMargin + i65 + ((LinearLayout.LayoutParams) aVar6).rightMargin);
                        }
                        if (z24) {
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
                            view = childAt6;
                            z10 = z24;
                            z11 = z25;
                            i21 = i63;
                            i20 = i64;
                            aVar = aVar6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i59 = i10;
                            i22 = i62;
                            i19 = iMax7;
                        } else {
                            view = childAt6;
                            z10 = z24;
                            z11 = z25;
                            z29 = true;
                            i21 = i63;
                            i20 = i64;
                            i23 = 1073741824;
                            aVar = aVar6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i59 = i10;
                            i22 = i62;
                            i19 = iMax7;
                            if (mode4 == i23 && ((LinearLayout.LayoutParams) aVar).height == -1) {
                                z12 = true;
                                z28 = true;
                            } else {
                                z12 = false;
                            }
                            int i66 = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                            int measuredHeight3 = view.getMeasuredHeight() + i66;
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                            if (z10) {
                                z13 = z12;
                            } else {
                                int baseline2 = view.getBaseline();
                                z13 = z12;
                                if (baseline2 != -1) {
                                    int i67 = ((LinearLayout.LayoutParams) aVar).gravity;
                                    if (i67 < 0) {
                                        i67 = cVar.f696e;
                                    }
                                    int i68 = (((i67 & 112) >> 4) & (-2)) >> 1;
                                    iArr2[i68] = Math.max(iArr2[i68], baseline2);
                                    iArr[i68] = Math.max(iArr[i68], measuredHeight3 - baseline2);
                                }
                            }
                            int iMax9 = Math.max(i21, measuredHeight3);
                            boolean z30 = !z27 && ((LinearLayout.LayoutParams) aVar).height == -1;
                            if (((LinearLayout.LayoutParams) aVar).weight <= CropImageView.DEFAULT_ASPECT_RATIO) {
                                if (!z13) {
                                    i66 = measuredHeight3;
                                }
                                iMax7 = Math.max(i19, i66);
                                iMax2 = i22;
                            } else {
                                if (!z13) {
                                    i66 = measuredHeight3;
                                }
                                iMax2 = Math.max(i22, i66);
                                iMax7 = i19;
                            }
                            int i69 = iMax2;
                            i61 = iMax9;
                            i24 = i69;
                            z27 = z30;
                        }
                    } else {
                        if (((LinearLayout.LayoutParams) aVar6).width != 0 || f15 <= CropImageView.DEFAULT_ASPECT_RATIO) {
                            i18 = PKIFailureInfo.systemUnavail;
                        } else {
                            ((LinearLayout.LayoutParams) aVar6).width = -2;
                            i18 = 0;
                        }
                        iArr = iArr4;
                        i19 = iMax7;
                        i20 = i64;
                        z10 = z24;
                        z11 = z25;
                        int i70 = i18;
                        aVar = aVar6;
                        i21 = i63;
                        i59 = i10;
                        iArr2 = iArr3;
                        i22 = i62;
                        cVar.measureChildWithMargins(childAt6, i59, f14 == CropImageView.DEFAULT_ASPECT_RATIO ? cVar.f697f : 0, i11, 0);
                        if (i70 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) aVar).width = i70;
                        }
                        int measuredWidth3 = childAt6.getMeasuredWidth();
                        if (z26) {
                            view = childAt6;
                            cVar.f697f = ((LinearLayout.LayoutParams) aVar).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) aVar).rightMargin + cVar.f697f;
                        } else {
                            view = childAt6;
                            int i71 = cVar.f697f;
                            cVar.f697f = Math.max(i71, i71 + measuredWidth3 + ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin);
                        }
                        if (z11) {
                            iMax8 = Math.max(measuredWidth3, iMax8);
                        }
                    }
                    i23 = 1073741824;
                    if (mode4 == i23) {
                        z12 = false;
                        int i662 = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                        int measuredHeight32 = view.getMeasuredHeight() + i662;
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                        if (z10) {
                        }
                        int iMax92 = Math.max(i21, measuredHeight32);
                        if (z27) {
                            if (((LinearLayout.LayoutParams) aVar).weight <= CropImageView.DEFAULT_ASPECT_RATIO) {
                            }
                            int i692 = iMax2;
                            i61 = iMax92;
                            i24 = i692;
                            z27 = z30;
                        }
                    }
                }
            }
            i62 = i24;
            i60 = i20 + 1;
            c10 = c11;
            iArr3 = iArr2;
            iArr4 = iArr;
            z24 = z10;
            z25 = z11;
        }
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c12 = c10;
        boolean z31 = z24;
        boolean z32 = z25;
        int i72 = i61;
        int i73 = i62;
        int i74 = iMax7;
        if (cVar.f697f > 0 && cVar.f(virtualChildCount2)) {
            cVar.f697f += cVar.f703m;
        }
        int i75 = iArr5[1];
        int iMax10 = (i75 == -1 && iArr5[0] == -1 && iArr5[c12] == -1 && iArr5[3] == -1) ? i72 : Math.max(i72, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c12]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i75, iArr5[c12]))));
        if (z32 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            cVar.f697f = 0;
            for (int i76 = 0; i76 < virtualChildCount2; i76++) {
                View childAt7 = cVar.getChildAt(i76);
                if (childAt7 == null) {
                    cVar.f697f = cVar.f697f;
                } else if (childAt7.getVisibility() != 8) {
                    a aVar7 = (a) childAt7.getLayoutParams();
                    if (z26) {
                        cVar.f697f = ((LinearLayout.LayoutParams) aVar7).leftMargin + iMax8 + ((LinearLayout.LayoutParams) aVar7).rightMargin + cVar.f697f;
                    } else {
                        int i77 = cVar.f697f;
                        cVar.f697f = Math.max(i77, i77 + iMax8 + ((LinearLayout.LayoutParams) aVar7).leftMargin + ((LinearLayout.LayoutParams) aVar7).rightMargin);
                    }
                }
            }
        }
        int paddingRight = cVar.getPaddingRight() + cVar.getPaddingLeft() + cVar.f697f;
        cVar.f697f = paddingRight;
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, cVar.getSuggestedMinimumWidth()), i59, 0);
        int i78 = (iResolveSizeAndState2 & 16777215) - cVar.f697f;
        if (z29 || (i78 != 0 && f14 > CropImageView.DEFAULT_ASPECT_RATIO)) {
            float f16 = cVar.f698g;
            if (f16 > CropImageView.DEFAULT_ASPECT_RATIO) {
                f14 = f16;
            }
            iArr5[3] = -1;
            iArr5[c12] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[c12] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            cVar.f697f = 0;
            iMax10 = -1;
            int i79 = 0;
            while (i79 < virtualChildCount2) {
                View childAt8 = cVar.getChildAt(i79);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    i15 = iResolveSizeAndState2;
                } else {
                    a aVar8 = (a) childAt8.getLayoutParams();
                    float f17 = ((LinearLayout.LayoutParams) aVar8).weight;
                    if (f17 > CropImageView.DEFAULT_ASPECT_RATIO) {
                        int i80 = (int) ((i78 * f17) / f14);
                        f14 -= f17;
                        i78 -= i80;
                        i15 = iResolveSizeAndState2;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, cVar.getPaddingBottom() + cVar.getPaddingTop() + ((LinearLayout.LayoutParams) aVar8).topMargin + ((LinearLayout.LayoutParams) aVar8).bottomMargin, ((LinearLayout.LayoutParams) aVar8).height);
                        if (((LinearLayout.LayoutParams) aVar8).width == 0) {
                            i17 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i80 <= 0) {
                                    i80 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i80, 1073741824), childMeasureSpec2);
                            }
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                        } else {
                            i17 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i80;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i17), childMeasureSpec2);
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                    } else {
                        i15 = iResolveSizeAndState2;
                    }
                    if (z26) {
                        cVar.f697f = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) aVar8).leftMargin + ((LinearLayout.LayoutParams) aVar8).rightMargin + cVar.f697f;
                    } else {
                        int i81 = cVar.f697f;
                        cVar.f697f = Math.max(i81, childAt8.getMeasuredWidth() + i81 + ((LinearLayout.LayoutParams) aVar8).leftMargin + ((LinearLayout.LayoutParams) aVar8).rightMargin);
                    }
                    boolean z33 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) aVar8).height == -1;
                    int i82 = ((LinearLayout.LayoutParams) aVar8).topMargin + ((LinearLayout.LayoutParams) aVar8).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i82;
                    iMax10 = Math.max(iMax10, measuredHeight4);
                    if (!z33) {
                        i82 = measuredHeight4;
                    }
                    int iMax11 = Math.max(i73, i82);
                    if (z27) {
                        i16 = -1;
                        boolean z34 = ((LinearLayout.LayoutParams) aVar8).height == -1;
                        if (!z31 && (baseline = childAt8.getBaseline()) != i16) {
                            int i83 = ((LinearLayout.LayoutParams) aVar8).gravity;
                            if (i83 < 0) {
                                i83 = cVar.f696e;
                            }
                            int i84 = (((i83 & 112) >> 4) & (-2)) >> 1;
                            iArr5[i84] = Math.max(iArr5[i84], baseline);
                            iArr6[i84] = Math.max(iArr6[i84], measuredHeight4 - baseline);
                        }
                        z27 = z34;
                        i73 = iMax11;
                    } else {
                        i16 = -1;
                    }
                    if (!z31) {
                        z27 = z34;
                        i73 = iMax11;
                    }
                }
                i79++;
                iResolveSizeAndState2 = i15;
            }
            i12 = iResolveSizeAndState2;
            i13 = -16777216;
            cVar.f697f = cVar.getPaddingRight() + cVar.getPaddingLeft() + cVar.f697f;
            int i85 = iArr5[1];
            if (i85 == -1 && iArr5[0] == -1 && iArr5[c12] == -1 && iArr5[3] == -1) {
                i14 = 0;
            } else {
                i14 = 0;
                iMax10 = Math.max(iMax10, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c12]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i85, iArr5[c12]))));
            }
            iMax = i73;
        } else {
            iMax = Math.max(i73, i74);
            if (z32 && mode3 != 1073741824) {
                for (int i86 = 0; i86 < virtualChildCount2; i86++) {
                    View childAt9 = cVar.getChildAt(i86);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) childAt9.getLayoutParams())).weight > CropImageView.DEFAULT_ASPECT_RATIO) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(iMax8, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i12 = iResolveSizeAndState2;
            i13 = -16777216;
            i14 = 0;
        }
        if (!z27 && mode4 != 1073741824) {
            iMax10 = iMax;
        }
        cVar.setMeasuredDimension(i12 | (iCombineMeasuredStates3 & i13), View.resolveSizeAndState(Math.max(cVar.getPaddingBottom() + cVar.getPaddingTop() + iMax10, cVar.getSuggestedMinimumHeight()), i11, iCombineMeasuredStates3 << 16));
        if (z28) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(cVar.getMeasuredHeight(), 1073741824);
            int i87 = i14;
            while (i87 < virtualChildCount2) {
                View childAt10 = cVar.getChildAt(i87);
                if (childAt10.getVisibility() != 8) {
                    a aVar9 = (a) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) aVar9).height == -1) {
                        int i88 = ((LinearLayout.LayoutParams) aVar9).width;
                        ((LinearLayout.LayoutParams) aVar9).width = childAt10.getMeasuredWidth();
                        cVar.measureChildWithMargins(childAt10, i59, 0, iMakeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) aVar9).width = i88;
                    }
                }
                i87++;
                cVar = this;
                i59 = i10;
            }
        }
    }

    public void setBaselineAligned(boolean z10) {
        this.f692a = z10;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.f693b = i10;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f702l) {
            return;
        }
        this.f702l = drawable;
        if (drawable != null) {
            this.f703m = drawable.getIntrinsicWidth();
            this.f704n = drawable.getIntrinsicHeight();
        } else {
            this.f703m = 0;
            this.f704n = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.f706q = i10;
    }

    public void setGravity(int i10) {
        if (this.f696e != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f696e = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.f696e;
        if ((8388615 & i12) != i11) {
            this.f696e = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f699h = z10;
    }

    public void setOrientation(int i10) {
        if (this.f695d != i10) {
            this.f695d = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.f705p) {
            requestLayout();
        }
        this.f705p = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.f696e;
        if ((i12 & 112) != i11) {
            this.f696e = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f698g = Math.max(CropImageView.DEFAULT_ASPECT_RATIO, f10);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
