package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.material.datepicker.j;
import com.google.android.material.focus.FocusRingDrawable;
import java.util.Calendar;
import java.util.Iterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {
    public final Calendar s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f12218t;

    /* renamed from: u, reason: collision with root package name */
    public j.d f12219u;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.s = i0.e(null);
        if (v.G(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.htmltoapk.template.R.id.cancel_button);
            setNextFocusRightId(com.htmltoapk.template.R.id.confirm_button);
        }
        this.f12218t = v.G(getContext(), com.htmltoapk.template.R.attr.nestedScrollable);
        u0.f0.m(this, new q());
    }

    public static void a(MaterialCalendarGridView materialCalendarGridView) {
        z zVar = (z) super.getAdapter();
        Drawable selector = materialCalendarGridView.getSelector();
        if (selector instanceof FocusRingDrawable) {
            return;
        }
        Context context = materialCalendarGridView.getContext();
        ColorDrawable colorDrawable = FocusRingDrawable.H;
        if (q4.b.b(context.getTheme(), com.htmltoapk.template.R.attr.focusRingsEnabled, false)) {
            selector = new FocusRingDrawable(context, selector);
        }
        if (selector instanceof FocusRingDrawable) {
            FocusRingDrawable focusRingDrawable = (FocusRingDrawable) selector;
            c cVar = zVar.f12313v;
            if (cVar != null) {
                focusRingDrawable.G.f12382t = cVar.f12237a.f12235f;
            }
            materialCalendarGridView.setDrawSelectorOnTop(true);
            materialCalendarGridView.setSelector(focusRingDrawable);
        }
    }

    public final z b() {
        return (z) super.getAdapter();
    }

    public final View c(int i6) {
        return getChildAt(i6 - getFirstVisiblePosition());
    }

    public final boolean d(int i6, boolean z6) {
        j.d dVar;
        j.d dVar2;
        int iB = z6 ? ((z) super.getAdapter()).b(i6) : ((z) super.getAdapter()).c(i6);
        if (iB != -1) {
            setSelection(iB);
            return true;
        }
        if (!z6 && (dVar2 = this.f12219u) != null) {
            return j.D(j.this, false);
        }
        if (!z6 || (dVar = this.f12219u) == null) {
            return true;
        }
        return j.D(j.this, true);
    }

    public final boolean e(int i6) {
        z zVar = (z) super.getAdapter();
        if (!zVar.f(i6)) {
            long itemId = zVar.getItemId(i6);
            for (int i7 = 1; i7 < zVar.s.f12305v; i7++) {
                int i8 = i6 + i7;
                if ((i8 < z.f12310z && zVar.getItemId(i8) == itemId && zVar.f(i8)) || ((i8 = i6 - i7) >= 0 && zVar.getItemId(i8) == itemId && zVar.f(i8))) {
                    i6 = i8;
                    break;
                }
            }
            i6 = -1;
        }
        if (i6 == -1) {
            return false;
        }
        setSelection(i6);
        return true;
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (z) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((z) super.getAdapter()).notifyDataSetChanged();
        post(new Runnable() { // from class: com.google.android.material.datepicker.p
            @Override // java.lang.Runnable
            public final void run() {
                MaterialCalendarGridView.a(this.s);
            }
        });
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iD;
        int width;
        int iD2;
        int width2;
        int i6;
        int width3;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        z zVar = (z) super.getAdapter();
        d<?> dVar = zVar.f12311t;
        y yVar = zVar.s;
        c cVar = zVar.f12313v;
        int iMax = Math.max(zVar.d(), materialCalendarGridView.getFirstVisiblePosition());
        int iMin = Math.min(zVar.g(), materialCalendarGridView.getLastVisiblePosition());
        Long item = zVar.getItem(iMax);
        Long item2 = zVar.getItem(iMin);
        Iterator<t0.b<Long, Long>> it = dVar.c().iterator();
        while (it.hasNext()) {
            t0.b<Long, Long> next = it.next();
            Long l4 = next.f14401a;
            Long l6 = next.f14402b;
            if (l4 == null) {
                materialCalendarGridView = this;
            } else if (l6 != null) {
                Long l7 = l4;
                long jLongValue = l7.longValue();
                Long l8 = l6;
                long jLongValue2 = l8.longValue();
                if (item == null || item2 == null || l7.longValue() > item2.longValue() || l8.longValue() < item.longValue()) {
                    materialCalendarGridView = this;
                    yVar = yVar;
                    it = it;
                    zVar = zVar;
                } else {
                    boolean z6 = materialCalendarGridView.getLayoutDirection() == 1;
                    long jLongValue3 = item.longValue();
                    Calendar calendar = materialCalendarGridView.s;
                    if (jLongValue < jLongValue3) {
                        width = iMax % yVar.f12305v == 0 ? 0 : !z6 ? materialCalendarGridView.c(iMax - 1).getRight() : materialCalendarGridView.c(iMax - 1).getLeft();
                        iD = iMax;
                    } else {
                        calendar.setTimeInMillis(jLongValue);
                        iD = zVar.d() + (calendar.get(5) - 1);
                        View viewC = materialCalendarGridView.c(iD);
                        width = (viewC.getWidth() / 2) + viewC.getLeft();
                    }
                    if (jLongValue2 > item2.longValue()) {
                        width2 = (iMin + 1) % yVar.f12305v == 0 ? materialCalendarGridView.getWidth() : !z6 ? materialCalendarGridView.c(iMin).getRight() : materialCalendarGridView.c(iMin).getLeft();
                        iD2 = iMin;
                    } else {
                        calendar.setTimeInMillis(jLongValue2);
                        iD2 = zVar.d() + (calendar.get(5) - 1);
                        View viewC2 = materialCalendarGridView.c(iD2);
                        width2 = (viewC2.getWidth() / 2) + viewC2.getLeft();
                    }
                    int itemId = (int) zVar.getItemId(iD);
                    Iterator<t0.b<Long, Long>> it2 = it;
                    y yVar2 = yVar;
                    int itemId2 = (int) zVar.getItemId(iD2);
                    while (itemId <= itemId2) {
                        int numColumns = materialCalendarGridView.getNumColumns() * itemId;
                        z zVar2 = zVar;
                        int numColumns2 = (materialCalendarGridView.getNumColumns() + numColumns) - 1;
                        View viewC3 = materialCalendarGridView.c(numColumns);
                        int top = viewC3.getTop() + cVar.f12237a.f12230a.top;
                        int i7 = itemId2;
                        int bottom = viewC3.getBottom() - cVar.f12237a.f12230a.bottom;
                        if (z6) {
                            int i8 = iD2 > numColumns2 ? 0 : width2;
                            int width4 = numColumns > iD ? getWidth() : width;
                            i6 = i8;
                            width3 = width4;
                        } else {
                            i6 = numColumns > iD ? 0 : width;
                            width3 = iD2 > numColumns2 ? getWidth() : width2;
                        }
                        canvas.drawRect(i6, top, width3, bottom, cVar.h);
                        itemId++;
                        materialCalendarGridView = this;
                        zVar = zVar2;
                        itemId2 = i7;
                    }
                    materialCalendarGridView = this;
                    yVar = yVar2;
                    it = it2;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z6, int i6, Rect rect) {
        int iC;
        if (!z6) {
            super.onFocusChanged(false, i6, rect);
            return;
        }
        if (i6 == 33 || i6 == 1) {
            z zVar = (z) super.getAdapter();
            iC = zVar.c(zVar.g() + 1);
        } else if (i6 == 130 || i6 == 2) {
            z zVar2 = (z) super.getAdapter();
            iC = zVar2.b(zVar2.d() - 1);
        } else {
            iC = -1;
        }
        if (iC != -1) {
            setSelection(iC);
        } else {
            super.onFocusChanged(true, i6, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i6, KeyEvent keyEvent) {
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1) {
            return super.onKeyDown(i6, keyEvent);
        }
        boolean z6 = getLayoutDirection() == 1;
        if (i6 == 21) {
            return d(selectedItemPosition, z6);
        }
        if (i6 == 22) {
            return d(selectedItemPosition, !z6);
        }
        if (i6 == 61) {
            int iC = keyEvent.isShiftPressed() ? ((z) super.getAdapter()).c(selectedItemPosition) : ((z) super.getAdapter()).b(selectedItemPosition);
            if (iC == -1) {
                return false;
            }
            setSelection(iC);
            return true;
        }
        if (!super.onKeyDown(i6, keyEvent)) {
            return false;
        }
        z zVar = (z) super.getAdapter();
        int selectedItemPosition2 = getSelectedItemPosition();
        if (selectedItemPosition2 == -1 || zVar.f(selectedItemPosition2)) {
            return true;
        }
        z zVar2 = (z) super.getAdapter();
        if (!e(selectedItemPosition2)) {
            if (19 == i6) {
                int numColumns = getNumColumns();
                while (true) {
                    selectedItemPosition2 -= numColumns;
                    if (selectedItemPosition2 < zVar2.d()) {
                        break;
                    }
                    if (e(selectedItemPosition2)) {
                        break;
                    }
                    numColumns = getNumColumns();
                }
                return false;
            }
            if (i6 == 20) {
                int numColumns2 = getNumColumns();
                while (true) {
                    numColumns2 += selectedItemPosition2;
                    if (numColumns2 > zVar2.g()) {
                        break;
                    }
                    if (e(numColumns2)) {
                        break;
                    }
                    selectedItemPosition2 = getNumColumns();
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i6, int i7) {
        if (!this.f12218t) {
            super.onMeasure(i6, i7);
            return;
        }
        super.onMeasure(i6, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i6) {
        super.setSelection(Math.max(i6, ((z) super.getAdapter()).b(r0.d() - 1)));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (z) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof z)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), z.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
