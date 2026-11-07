package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.htmltoapk.template.R;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class z extends BaseAdapter {

    /* renamed from: y, reason: collision with root package name */
    public static final int f12309y = i0.e(null).getMaximum(4);

    /* renamed from: z, reason: collision with root package name */
    public static final int f12310z = (i0.e(null).getMaximum(7) + i0.e(null).getMaximum(5)) - 1;
    public final y s;

    /* renamed from: t, reason: collision with root package name */
    public final d<?> f12311t;

    /* renamed from: u, reason: collision with root package name */
    public Collection<Long> f12312u;

    /* renamed from: v, reason: collision with root package name */
    public c f12313v;

    /* renamed from: w, reason: collision with root package name */
    public final a f12314w;

    /* renamed from: x, reason: collision with root package name */
    public final f f12315x;

    public z(y yVar, d<?> dVar, a aVar, f fVar) {
        this.s = yVar;
        this.f12311t = dVar;
        this.f12314w = aVar;
        this.f12315x = fVar;
        this.f12312u = dVar.i();
    }

    public final int b(int i6) {
        do {
            i6++;
            if (i6 > g()) {
                return -1;
            }
        } while (!f(i6));
        return i6;
    }

    public final int c(int i6) {
        do {
            i6--;
            if (i6 < d()) {
                return -1;
            }
        } while (!f(i6));
        return i6;
    }

    public final int d() {
        int firstDayOfWeek = this.f12314w.f12223w;
        y yVar = this.s;
        Calendar calendar = yVar.s;
        int i6 = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i7 = i6 - firstDayOfWeek;
        return i7 < 0 ? i7 + yVar.f12305v : i7;
    }

    @Override // android.widget.Adapter
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i6) {
        if (i6 < d() || i6 > g()) {
            return null;
        }
        int iD = (i6 - d()) + 1;
        Calendar calendarC = i0.c(this.s.s);
        calendarC.set(5, iD);
        return Long.valueOf(calendarC.getTimeInMillis());
    }

    public final boolean f(int i6) {
        Long item = getItem(i6);
        return item != null && this.f12314w.f12221u.f(item.longValue());
    }

    public final int g() {
        return (d() + this.s.f12306w) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f12310z;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i6) {
        return i6 / this.s.f12305v;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View getView(int i6, View view, ViewGroup viewGroup) {
        int i7;
        Context context = viewGroup.getContext();
        if (this.f12313v == null) {
            this.f12313v = new c(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int iD = i6 - d();
        if (iD >= 0) {
            y yVar = this.s;
            if (iD >= yVar.f12306w) {
                textView.setVisibility(8);
                textView.setEnabled(false);
                i7 = -1;
            } else {
                i7 = iD + 1;
                textView.setTag(yVar);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i7)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        }
        Long item = getItem(i6);
        if (item == null) {
            return textView;
        }
        h(textView, item.longValue(), i7);
        return textView;
    }

    public final void h(TextView textView, long j6, int i6) {
        boolean z6;
        boolean z7;
        b bVar;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        boolean z8 = true;
        boolean z9 = i0.d().getTimeInMillis() == j6;
        d<?> dVar = this.f12311t;
        Iterator<t0.b<Long, Long>> it = dVar.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                z6 = false;
                break;
            }
            Long l4 = it.next().f14401a;
            if (l4 != null && l4.longValue() == j6) {
                z6 = true;
                break;
            }
        }
        Iterator<t0.b<Long, Long>> it2 = dVar.c().iterator();
        while (true) {
            if (!it2.hasNext()) {
                z7 = false;
                break;
            }
            Long l6 = it2.next().f14402b;
            if (l6 != null && l6.longValue() == j6) {
                z7 = true;
                break;
            }
        }
        Calendar calendarD = i0.d();
        Calendar calendarE = i0.e(null);
        calendarE.setTimeInMillis(j6);
        String str = calendarD.get(1) == calendarE.get(1) ? i0.b("MMMMEEEEd", Locale.getDefault()).format(new Date(j6)) : i0.b("yMMMMEEEEd", Locale.getDefault()).format(new Date(j6));
        if (z9) {
            str = String.format(context.getString(R.string.mtrl_picker_today_description), str);
        }
        if (z6) {
            str = String.format(context.getString(R.string.mtrl_picker_start_date_description), str);
        } else if (z7) {
            str = String.format(context.getString(R.string.mtrl_picker_end_date_description), str);
        }
        textView.setContentDescription(str);
        if (this.f12314w.f12221u.f(j6)) {
            textView.setEnabled(true);
            Iterator<Long> it3 = dVar.i().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z8 = false;
                    break;
                } else {
                    if (i0.a(j6) == i0.a(it3.next().longValue())) {
                        break;
                    }
                }
            }
            textView.setSelected(z8);
            bVar = z8 ? this.f12313v.f12238b : i0.d().getTimeInMillis() == j6 ? this.f12313v.f12239c : this.f12313v.f12237a;
        } else {
            textView.setEnabled(false);
            bVar = this.f12313v.f12243g;
        }
        if (this.f12315x == null || i6 == -1) {
            bVar.b(textView);
            return;
        }
        int i7 = this.s.f12304u;
        bVar.b(textView);
        textView.setCompoundDrawables(null, null, null, null);
        textView.setContentDescription(str);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }

    public final void i(MaterialCalendarGridView materialCalendarGridView, long j6) {
        y yVarM = y.m(j6);
        y yVar = this.s;
        if (yVarM.equals(yVar)) {
            Calendar calendarC = i0.c(yVar.s);
            calendarC.setTimeInMillis(j6);
            int i6 = calendarC.get(5);
            h((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.b().d() + (i6 - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j6, i6);
        }
    }
}
