package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.htmltoapk.template.R;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g extends BaseAdapter {

    /* renamed from: v, reason: collision with root package name */
    public static final int f12254v;
    public final Calendar s;

    /* renamed from: t, reason: collision with root package name */
    public final int f12255t;

    /* renamed from: u, reason: collision with root package name */
    public final int f12256u;

    static {
        f12254v = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public g() {
        Calendar calendarE = i0.e(null);
        this.s = calendarE;
        this.f12255t = calendarE.getMaximum(7);
        this.f12256u = calendarE.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f12255t;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i6) {
        int i7 = this.f12255t;
        if (i6 >= i7) {
            return null;
        }
        int i8 = i6 + this.f12256u;
        if (i8 > i7) {
            i8 -= i7;
        }
        return Integer.valueOf(i8);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i6) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public final View getView(int i6, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i7 = i6 + this.f12256u;
        int i8 = this.f12255t;
        if (i7 > i8) {
            i7 -= i8;
        }
        Calendar calendar = this.s;
        calendar.set(7, i7);
        textView.setText(calendar.getDisplayName(7, f12254v, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public g(int i6) {
        Calendar calendarE = i0.e(null);
        this.s = calendarE;
        this.f12255t = calendarE.getMaximum(7);
        this.f12256u = i6;
    }
}
