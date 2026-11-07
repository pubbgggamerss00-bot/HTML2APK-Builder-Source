package com.google.android.material.button;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.i;
import com.google.android.material.button.MaterialButton;
import com.htmltoapk.template.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import l.r0;
import org.xmlpull.v1.XmlPullParserException;
import u4.d;
import u4.j;
import u4.k;
import u4.p;
import u4.q;
import u4.r;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class a extends LinearLayout {
    public static final Object L = new Object();
    public r A;
    public boolean B;
    public final int C;
    public final boolean D;
    public final MaterialButton E;
    public final r0 F;
    public final HashMap G;
    public final HashMap H;
    public final ArrayList I;
    public final ArrayList J;
    public final ArrayList K;
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f12127t;

    /* renamed from: u, reason: collision with root package name */
    public final b f12128u;

    /* renamed from: v, reason: collision with root package name */
    public final c4.b f12129v;

    /* renamed from: w, reason: collision with root package name */
    public Integer[] f12130w;

    /* renamed from: x, reason: collision with root package name */
    public p f12131x;

    /* renamed from: y, reason: collision with root package name */
    public q f12132y;

    /* renamed from: z, reason: collision with root package name */
    public int f12133z;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: com.google.android.material.button.a$a, reason: collision with other inner class name */
    public static class C0033a extends LinearLayout.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public Drawable f12134a;

        /* renamed from: b, reason: collision with root package name */
        public CharSequence f12135b;

        public C0033a(int i6, int i7) {
            super(i6, i7);
            this.f12134a = null;
            this.f12135b = null;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class b implements MaterialButton.c {
        public b() {
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonGroupStyle);
    }

    public static LinearLayout.LayoutParams d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new C0033a(layoutParams.width, layoutParams.height);
    }

    public static C0033a f(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            C0033a c0033a = new C0033a((LinearLayout.LayoutParams) layoutParams);
            c0033a.f12134a = null;
            c0033a.f12135b = null;
            return c0033a;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C0033a c0033a2 = new C0033a((ViewGroup.MarginLayoutParams) layoutParams);
            c0033a2.f12134a = null;
            c0033a2.f12135b = null;
            return c0033a2;
        }
        C0033a c0033a3 = new C0033a(layoutParams);
        c0033a3.f12134a = null;
        c0033a3.f12135b = null;
        return c0033a3;
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            if (i(i6)) {
                return i6;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (i(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    public final void a() {
        int iMin;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i6 = firstVisibleChildIndex + 1; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            View childAt2 = getChildAt(i6 - 1);
            if ((childAt instanceof MaterialButton) && (childAt2 instanceof MaterialButton)) {
                MaterialButton materialButton = (MaterialButton) childAt;
                MaterialButton materialButton2 = (MaterialButton) childAt2;
                if (this.f12133z <= 0) {
                    iMin = Math.min(materialButton.getStrokeWidth(), materialButton2.getStrokeWidth());
                    materialButton.setShouldDrawSurfaceColorStroke(true);
                    materialButton2.setShouldDrawSurfaceColorStroke(true);
                } else {
                    materialButton.setShouldDrawSurfaceColorStroke(false);
                    materialButton2.setShouldDrawSurfaceColorStroke(false);
                    iMin = 0;
                }
            } else {
                iMin = 0;
            }
            LinearLayout.LayoutParams layoutParamsD = d(childAt);
            if (getOrientation() == 0) {
                layoutParamsD.setMarginEnd(0);
                layoutParamsD.setMarginStart(this.f12133z - iMin);
                layoutParamsD.topMargin = 0;
            } else {
                layoutParamsD.bottomMargin = 0;
                layoutParamsD.topMargin = this.f12133z - iMin;
                layoutParamsD.setMarginStart(0);
            }
            childAt.setLayoutParams(layoutParamsD);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParamsD2 = d((MaterialButton) getChildAt(firstVisibleChildIndex));
        if (getOrientation() == 1) {
            layoutParamsD2.topMargin = 0;
            layoutParamsD2.bottomMargin = 0;
        } else {
            layoutParamsD2.setMarginEnd(0);
            layoutParamsD2.setMarginStart(0);
            layoutParamsD2.leftMargin = 0;
            layoutParamsD2.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i6, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        k();
        this.B = true;
        int iIndexOfChild = indexOfChild(this.E);
        if (iIndexOfChild < 0 || i6 != -1) {
            super.addView(view, i6, layoutParams);
        } else {
            super.addView(view, iIndexOfChild, layoutParams);
        }
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.f12128u);
        this.f12127t.add(materialButton.getShapeAppearance());
        materialButton.setEnabled(isEnabled());
    }

    public final void b() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        if (firstVisibleChildIndex == -1 || this.A == null) {
            return;
        }
        if (this.s != 2) {
            c(firstVisibleChildIndex, lastVisibleChildIndex);
            return;
        }
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.K;
            if (i6 >= arrayList.size()) {
                return;
            }
            c(((Integer) arrayList.get(i6)).intValue(), (i6 == arrayList.size() + (-1) ? getChildCount() : ((Integer) arrayList.get(i6 + 1)).intValue()) - 1);
            i6++;
        }
    }

    public final void c(int i6, int i7) {
        float fMax;
        if (i6 == i7) {
            ((MaterialButton) getChildAt(i6)).setWidthChangeDirection(MaterialButton.e.s);
            return;
        }
        int iMin = Integer.MAX_VALUE;
        int i8 = i6;
        while (i8 <= i7) {
            if (i(i8)) {
                ((MaterialButton) getChildAt(i8)).setWidthChangeDirection(i8 == i6 ? MaterialButton.e.f12123u : i8 == i7 ? MaterialButton.e.f12122t : MaterialButton.e.f12124v);
                if (i(i8) && this.A != null) {
                    MaterialButton materialButton = (MaterialButton) getChildAt(i8);
                    r rVar = this.A;
                    int width = materialButton.getWidth();
                    int i9 = -width;
                    for (int i10 = 0; i10 < rVar.f14711a; i10++) {
                        r.b bVar = rVar.f14714d[i10].f14715a;
                        r.c cVar = bVar.f14716a;
                        float f6 = bVar.f14717b;
                        if (cVar == r.c.f14718t) {
                            fMax = Math.max(i9, f6);
                        } else if (cVar == r.c.s) {
                            fMax = Math.max(i9, width * f6);
                        }
                        i9 = (int) fMax;
                    }
                    int iMax = Math.max(0, i9);
                    MaterialButton materialButtonH = h(i8);
                    int allowedWidthDecrease = materialButtonH == null ? 0 : materialButtonH.getAllowedWidthDecrease();
                    MaterialButton materialButtonG = g(i8);
                    iMin = Math.min(iMax, allowedWidthDecrease + (materialButtonG != null ? materialButtonG.getAllowedWidthDecrease() : 0));
                }
                if (i8 != i6 && i8 != i7) {
                    iMin /= 2;
                }
                iMin = Math.min(iMin, iMin);
            }
            i8++;
        }
        while (i6 <= i7) {
            if (i(i6)) {
                MaterialButton materialButton2 = (MaterialButton) getChildAt(i6);
                materialButton2.setSizeChange(this.A);
                materialButton2.setWidthChangeMax(iMin * 2);
            }
            i6++;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0033a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f12129v);
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            treeMap.put((MaterialButton) getChildAt(i6), Integer.valueOf(i6));
        }
        this.f12130w = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final C0033a generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C0033a c0033a = new C0033a(context, attributeSet);
        c0033a.f12134a = null;
        c0033a.f12135b = null;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w3.a.f15073n);
        c0033a.f12134a = typedArrayObtainStyledAttributes.getDrawable(0);
        c0033a.f12135b = typedArrayObtainStyledAttributes.getText(1);
        typedArrayObtainStyledAttributes.recycle();
        return c0033a;
    }

    public final MaterialButton g(int i6) {
        int childCount = getChildCount();
        int i7 = i6 + 1;
        while (true) {
            if (i7 >= childCount) {
                i7 = -1;
                break;
            }
            if (i(i7)) {
                break;
            }
            i7++;
        }
        ArrayList arrayList = this.K;
        if (!arrayList.isEmpty()) {
            int i8 = 0;
            while (i8 < arrayList.size()) {
                int iIntValue = ((Integer) arrayList.get(i8)).intValue();
                int iIntValue2 = i8 == arrayList.size() + (-1) ? childCount - 1 : ((Integer) arrayList.get(i8 + 1)).intValue() - 1;
                if (i6 >= iIntValue && i6 <= iIntValue2 && (i7 < iIntValue || i7 > iIntValue2)) {
                    return null;
                }
                i8++;
            }
        }
        if (i7 == -1) {
            return null;
        }
        return (MaterialButton) getChildAt(i7);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0033a(-2, -2);
    }

    public r getButtonSizeChange() {
        return this.A;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i6, int i7) {
        Integer[] numArr = this.f12130w;
        if (numArr != null && i7 < numArr.length) {
            return numArr[i7].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i7;
    }

    public d getInnerCornerSize() {
        return this.f12131x.f14694b;
    }

    public p getInnerCornerSizeStateList() {
        return this.f12131x;
    }

    public Drawable getOverflowButtonIcon() {
        return this.E.getIcon();
    }

    public int getOverflowMode() {
        return this.s;
    }

    public k getShapeAppearance() {
        q qVar = this.f12132y;
        if (qVar == null) {
            return null;
        }
        return qVar.h();
    }

    public int getSpacing() {
        return this.f12133z;
    }

    public q getStateListShapeAppearance() {
        return this.f12132y;
    }

    public final MaterialButton h(int i6) {
        int childCount = getChildCount();
        int i7 = i6 - 1;
        while (true) {
            if (i7 < 0) {
                i7 = -1;
                break;
            }
            if (i(i7)) {
                break;
            }
            i7--;
        }
        ArrayList arrayList = this.K;
        if (!arrayList.isEmpty()) {
            int i8 = 0;
            while (i8 < arrayList.size()) {
                int iIntValue = ((Integer) arrayList.get(i8)).intValue();
                int iIntValue2 = i8 == arrayList.size() + (-1) ? childCount : ((Integer) arrayList.get(i8 + 1)).intValue();
                if (i6 >= iIntValue && i6 < iIntValue2 && (i7 < iIntValue || i7 >= iIntValue2)) {
                    return null;
                }
                i8++;
            }
        }
        if (i7 == -1) {
            return null;
        }
        return (MaterialButton) getChildAt(i7);
    }

    public final boolean i(int i6) {
        return getChildAt(i6).getVisibility() != 8;
    }

    public final int j(boolean z6, Button button, int i6, int i7) {
        int i8;
        int i9;
        measureChild(button, i6, i7);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        int measuredWidth = z6 ? button.getMeasuredWidth() : button.getMeasuredHeight();
        if (z6) {
            i8 = layoutParams.leftMargin;
            i9 = layoutParams.rightMargin;
        } else {
            i8 = layoutParams.topMargin;
            i9 = layoutParams.bottomMargin;
        }
        int i10 = i8 + i9;
        if (measuredWidth == 0) {
            measuredWidth = z6 ? button.getMinimumWidth() : button.getMinimumHeight();
        }
        return measuredWidth + i10;
    }

    public final void k() {
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i6);
            LinearLayout.LayoutParams layoutParams = materialButton.U;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.U = null;
                materialButton.R = -2.1474836E9f;
            }
        }
    }

    public final void l() {
        int i6;
        if (!(this.f12131x == null && this.f12132y == null) && this.B) {
            this.B = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i7 = 0;
            while (i7 < childCount) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i7);
                if (materialButton.getVisibility() != 8) {
                    boolean z6 = i7 == firstVisibleChildIndex;
                    boolean z7 = i7 == lastVisibleChildIndex;
                    Object obj = this.f12132y;
                    ArrayList arrayList = this.f12127t;
                    if (obj == null || (!z6 && !z7)) {
                        obj = (j) arrayList.get(i7);
                    }
                    q.a aVar = !(obj instanceof q) ? new q.a((k) arrayList.get(i7)) : ((q) obj).i();
                    boolean z8 = getOrientation() == 0;
                    boolean z9 = getLayoutDirection() == 1;
                    if (z8) {
                        i6 = z6 ? 5 : 0;
                        if (z7) {
                            i6 |= 10;
                        }
                        if (z9) {
                            i6 = ((i6 & 5) << 1) | ((i6 & 10) >> 1);
                        }
                    } else {
                        i6 = z6 ? 3 : 0;
                        if (z7) {
                            i6 |= 12;
                        }
                    }
                    int i8 = ~i6;
                    p pVar = this.f12131x;
                    if ((i8 | 1) == i8) {
                        aVar.f14708e = pVar;
                    }
                    if ((i8 | 2) == i8) {
                        aVar.f14709f = pVar;
                    }
                    if ((i8 | 4) == i8) {
                        aVar.f14710g = pVar;
                    }
                    if ((i8 | 8) == i8) {
                        aVar.h = pVar;
                    }
                    q qVarB = aVar.b();
                    boolean zE = qVarB.e();
                    k kVarH = qVarB;
                    if (!zE) {
                        kVarH = qVarB.h();
                    }
                    materialButton.setShapeAppearance(kVarH);
                }
                i7++;
            }
        }
    }

    public final void m() {
        for (Map.Entry entry : this.H.entrySet()) {
            Button button = (Button) entry.getKey();
            MenuItem menuItem = (MenuItem) entry.getValue();
            if (entry.getKey() instanceof MaterialButton) {
                MaterialButton materialButton = (MaterialButton) button;
                menuItem.setCheckable(materialButton.k());
                menuItem.setChecked(materialButton.M);
            }
            menuItem.setEnabled(button.isEnabled());
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
        super.onLayout(z6, i6, i7, i8, i9);
        if (z6) {
            k();
            b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0237  */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i6, int i7) {
        int paddingTop;
        HashMap map;
        h hVar;
        a();
        if (this.s != 2) {
            paddingTop = 0;
        } else {
            if (getOrientation() == 1) {
                throw new IllegalArgumentException("The wrap overflow mode is not compatible to the vertical orientation.");
            }
            if (View.MeasureSpec.getMode(i6) == Integer.MIN_VALUE) {
                throw new IllegalArgumentException("The wrap overflow mode is not compatible with wrap_content layout width.");
            }
            ArrayList arrayList = this.K;
            arrayList.clear();
            int size = View.MeasureSpec.getSize(i6);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i8 = 0;
            int iMax = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                if (i(i10)) {
                    View view = (MaterialButton) getChildAt(i10);
                    measureChild(view, i6, i7);
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    if (measuredWidth > 0) {
                        LinearLayout.LayoutParams layoutParamsD = d(view);
                        if (i8 + measuredWidth + (arrayList2.isEmpty() ? 0 : this.f12133z) > size || arrayList2.isEmpty()) {
                            if (!arrayList2.isEmpty()) {
                                arrayList3.add(Integer.valueOf(i8));
                            }
                            i9 += iMax + (arrayList.isEmpty() ? 0 : this.f12133z);
                            arrayList.add(Integer.valueOf(i10));
                            layoutParamsD.setMarginStart(-i8);
                            arrayList2.clear();
                            i8 = 0;
                            iMax = 0;
                        }
                        i8 += measuredWidth + (i8 == 0 ? 0 : this.f12133z);
                        iMax = Math.max(iMax, measuredHeight);
                        arrayList2.add(Integer.valueOf(i10));
                        layoutParamsD.topMargin += i9;
                        view.setLayoutParams(layoutParamsD);
                    }
                }
            }
            arrayList3.add(Integer.valueOf(i8));
            int iIntValue = ((Integer) Collections.max(arrayList3)).intValue();
            int i11 = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                int iIntValue2 = ((Integer) arrayList.get(i12)).intValue();
                int iIntValue3 = ((Integer) arrayList3.get(i12)).intValue();
                MaterialButton materialButton = (MaterialButton) getChildAt(iIntValue2);
                LinearLayout.LayoutParams layoutParamsD2 = d(materialButton);
                int i13 = layoutParamsD2.gravity & 8388615;
                int absoluteGravity = Gravity.getAbsoluteGravity(i13, getLayoutDirection());
                int i14 = iIntValue - iIntValue3;
                if (i13 != 8388611) {
                    if (absoluteGravity == 1) {
                        i14 /= 2;
                    }
                    layoutParamsD2.setMarginStart((layoutParamsD2.getMarginStart() + i14) - i11);
                    materialButton.setLayoutParams(layoutParamsD2);
                    i11 = i14;
                }
            }
            paddingTop = getPaddingTop() + i9 + iMax + getPaddingBottom();
        }
        if (this.D) {
            if (this.s != 1) {
                this.E.setVisibility(8);
            } else {
                boolean z6 = getOrientation() == 0;
                ArrayList arrayList4 = this.I;
                arrayList4.clear();
                int size2 = z6 ? View.MeasureSpec.getSize(i6) : View.MeasureSpec.getSize(i7);
                int iJ = j(z6, this.E, i6, i7);
                int i15 = 0;
                int iJ2 = 0;
                while (true) {
                    if (i15 >= getChildCount() - 1) {
                        this.E.setVisibility(8);
                        arrayList4.clear();
                        break;
                    }
                    MaterialButton materialButton2 = (MaterialButton) getChildAt(i15);
                    iJ2 += j(z6, materialButton2, i6, i7);
                    if (iJ2 + iJ > size2) {
                        arrayList4.add(materialButton2);
                    }
                    if (iJ2 > size2) {
                        for (int i16 = i15 + 1; i16 < getChildCount() - 1; i16++) {
                            arrayList4.add((MaterialButton) getChildAt(i16));
                        }
                        this.E.setVisibility(0);
                    } else {
                        i15++;
                    }
                }
                ArrayList arrayList5 = this.J;
                if (!arrayList4.equals(arrayList5)) {
                    int i17 = 0;
                    while (true) {
                        int childCount = getChildCount() - 1;
                        map = this.H;
                        if (i17 >= childCount) {
                            break;
                        }
                        MaterialButton materialButton3 = (MaterialButton) getChildAt(i17);
                        if (map.containsKey(materialButton3)) {
                            materialButton3.setVisibility(0);
                        }
                        i17++;
                    }
                    arrayList5.clear();
                    arrayList5.addAll(arrayList4);
                    f fVar = this.F.f13718a;
                    HashMap map2 = this.G;
                    map2.clear();
                    map.clear();
                    fVar.clear();
                    int size3 = arrayList5.size();
                    int i18 = 0;
                    while (i18 < size3) {
                        Object obj = arrayList5.get(i18);
                        i18++;
                        final Button button = (Button) obj;
                        if (button.getLayoutParams() instanceof C0033a) {
                            C0033a c0033a = (C0033a) button.getLayoutParams();
                            CharSequence text = c0033a.f12135b;
                            if (TextUtils.isEmpty(text)) {
                                if (button instanceof MaterialButton) {
                                    MaterialButton materialButton4 = (MaterialButton) button;
                                    text = !TextUtils.isEmpty(materialButton4.getText()) ? materialButton4.getText() : button.getContentDescription();
                                }
                            }
                            Drawable drawable = c0033a.f12134a;
                            h hVarA = fVar.a(0, 0, 0, text);
                            if (drawable != null) {
                                int i19 = this.C;
                                hVarA.setIcon(new InsetDrawable(drawable, i19, 0, i19, 0));
                            }
                            hVarA.f208p = new MenuItem.OnMenuItemClickListener() { // from class: c4.c
                                @Override // android.view.MenuItem.OnMenuItemClickListener
                                public final boolean onMenuItemClick(MenuItem menuItem) {
                                    Object obj2 = com.google.android.material.button.a.L;
                                    button.performClick();
                                    return true;
                                }
                            };
                            hVar = hVarA;
                        } else {
                            hVar = null;
                        }
                        if (hVar != null) {
                            map2.put(Integer.valueOf(hVar.f194a), button);
                            map.put(button, hVar);
                            button.setVisibility(8);
                        }
                    }
                    m();
                }
            }
        }
        l();
        super.onMeasure(i6, i7);
        if (this.s != 2 || paddingTop == getMeasuredHeight()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), paddingTop);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f12127t.remove(iIndexOfChild);
        }
        this.B = true;
        l();
        k();
        a();
    }

    public void setButtonSizeChange(r rVar) {
        if (this.A != rVar) {
            this.A = rVar;
            b();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z6) {
        super.setEnabled(z6);
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            ((MaterialButton) getChildAt(i6)).setEnabled(z6);
        }
    }

    public void setInnerCornerSize(d dVar) {
        this.f12131x = p.b(dVar);
        this.B = true;
        l();
        invalidate();
    }

    public void setInnerCornerSizeStateList(p pVar) {
        this.f12131x = pVar;
        this.B = true;
        l();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i6) {
        if (getOrientation() != i6) {
            this.B = true;
        }
        super.setOrientation(i6);
    }

    public void setOverflowButtonIcon(Drawable drawable) {
        this.E.setIcon(drawable);
    }

    public void setOverflowButtonIconResource(int i6) {
        this.E.setIconResource(i6);
    }

    public void setOverflowMode(int i6) {
        if (this.s != i6) {
            this.s = i6;
            requestLayout();
            invalidate();
        }
    }

    public void setShapeAppearance(k kVar) {
        this.f12132y = new q.a(kVar).b();
        this.B = true;
        l();
        invalidate();
    }

    public void setSpacing(int i6) {
        this.f12133z = i6;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(q qVar) {
        this.f12132y = qVar;
        this.B = true;
        l();
        invalidate();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [c4.b] */
    public a(Context context, AttributeSet attributeSet, int i6) throws Resources.NotFoundException {
        p pVarB;
        XmlResourceParser xml;
        int next;
        int next2;
        super(a5.a.b(context, attributeSet, i6, R.style.Widget_Material3_MaterialButtonGroup), attributeSet, i6);
        this.s = 0;
        this.f12127t = new ArrayList();
        this.f12128u = new b();
        this.f12129v = new Comparator() { // from class: c4.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                Object obj3 = com.google.android.material.button.a.L;
                com.google.android.material.button.a aVar = this.s;
                aVar.getClass();
                int iCompareTo = Boolean.valueOf(materialButton.M).compareTo(Boolean.valueOf(materialButton2.M));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                return iCompareTo2 != 0 ? iCompareTo2 : Integer.compare(aVar.indexOfChild(materialButton), aVar.indexOfChild(materialButton2));
            }
        };
        this.B = true;
        this.G = new HashMap();
        this.H = new HashMap();
        this.I = new ArrayList();
        this.J = new ArrayList();
        this.K = new ArrayList();
        Context context2 = getContext();
        TypedArray typedArrayD = n4.j.d(context2, attributeSet, w3.a.f15072m, i6, R.style.Widget_Material3_MaterialButtonGroup, new int[0]);
        if (typedArrayD.hasValue(2)) {
            int resourceId = typedArrayD.getResourceId(2, 0);
            r rVar = null;
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId);
                    try {
                        r rVar2 = new r();
                        rVar2.f14713c = new int[10][];
                        rVar2.f14714d = new r.a[10];
                        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                        do {
                            next2 = xml.next();
                            if (next2 == 2) {
                                break;
                            }
                        } while (next2 != 1);
                        if (next2 != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (xml.getName().equals("selector")) {
                            rVar2.a(context2, xml, attributeSetAsAttributeSet, context2.getTheme());
                        }
                        xml.close();
                        rVar = rVar2;
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                }
            }
            this.A = rVar;
        }
        if (typedArrayD.hasValue(6)) {
            q qVarG = q.g(context2, typedArrayD, 6);
            this.f12132y = qVarG;
            if (qVarG == null) {
                int resourceId2 = typedArrayD.getResourceId(6, 0);
                int resourceId3 = typedArrayD.getResourceId(7, 0);
                u4.a aVar = new u4.a(0);
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context2, resourceId2);
                if (resourceId3 != 0) {
                    contextThemeWrapper.getTheme().applyStyle(resourceId3, true);
                }
                this.f12132y = new q.a(k.g(contextThemeWrapper.obtainStyledAttributes(w3.a.B), aVar).a()).b();
            }
        }
        if (typedArrayD.hasValue(3)) {
            u4.a aVar2 = new u4.a(0.0f);
            int resourceId4 = typedArrayD.getResourceId(3, 0);
            if (resourceId4 != 0 && context2.getResources().getResourceTypeName(resourceId4).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId4);
                    try {
                        p pVar = new p();
                        AttributeSet attributeSetAsAttributeSet2 = Xml.asAttributeSet(xml);
                        do {
                            next = xml.next();
                            if (next == 2) {
                                break;
                            }
                        } while (next != 1);
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (xml.getName().equals("selector")) {
                            pVar.d(context2, xml, attributeSetAsAttributeSet2, context2.getTheme());
                        }
                        xml.close();
                        pVarB = pVar;
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    pVarB = p.b(aVar2);
                }
            } else {
                pVarB = p.b(k.h(typedArrayD, 3, aVar2));
            }
            this.f12131x = pVarB;
        }
        this.f12133z = typedArrayD.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayD.getBoolean(0, true));
        setOverflowMode(typedArrayD.getInt(5, 0));
        this.C = getResources().getDimensionPixelOffset(R.dimen.m3_btn_group_overflow_item_icon_horizontal_padding);
        if (!(this instanceof MaterialButtonToggleGroup)) {
            Drawable drawable = typedArrayD.getDrawable(4);
            MaterialButton materialButton = (MaterialButton) LayoutInflater.from(context2).inflate(R.layout.m3_button_group_overflow_button, (ViewGroup) this, false);
            this.E = materialButton;
            materialButton.setTag(L);
            setOverflowButtonIcon(drawable);
            if (this.E.getContentDescription() == null) {
                this.E.setContentDescription(getResources().getString(R.string.mtrl_button_overflow_icon_content_description));
            }
            this.E.setVisibility(8);
            r0 r0Var = new r0(getContext(), this.E, 0, q4.b.d(this, R.attr.materialButtonGroupPopupMenuStyle).data);
            this.F = r0Var;
            i iVar = r0Var.f13720c;
            iVar.h = true;
            k.d dVar = iVar.f227j;
            if (dVar != null) {
                dVar.o(true);
            }
            this.E.setOnClickListener(new c4.d(0, this));
            addView(this.E);
            this.D = true;
        }
        typedArrayD.recycle();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new C0033a(-2, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return f(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return f(layoutParams);
    }
}
