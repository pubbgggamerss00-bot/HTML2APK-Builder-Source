package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.focus.FocusRingDrawable;
import com.htmltoapk.template.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k0 extends RecyclerView.e<a> {

    /* renamed from: d, reason: collision with root package name */
    public final j<?> f12278d;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a extends RecyclerView.b0 {

        /* renamed from: u, reason: collision with root package name */
        public final TextView f12279u;

        public a(TextView textView) {
            super(textView);
            this.f12279u = textView;
        }
    }

    public k0(j<?> jVar) {
        this.f12278d = jVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int a() {
        return this.f12278d.f12262o0.f12224x;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void c(RecyclerView.b0 b0Var, int i6) {
        j<?> jVar = this.f12278d;
        int i7 = jVar.f12262o0.s.f12304u + i6;
        TextView textView = ((a) b0Var).f12279u;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i7)));
        Context context = textView.getContext();
        textView.setContentDescription(i0.d().get(1) == i7 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i7)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i7)));
        c cVar = jVar.f12265s0;
        Calendar calendarD = i0.d();
        b bVar = calendarD.get(1) == i7 ? cVar.f12242f : cVar.f12240d;
        Iterator<Long> it = jVar.f12261n0.i().iterator();
        while (it.hasNext()) {
            calendarD.setTimeInMillis(it.next().longValue());
            if (calendarD.get(1) == i7) {
                bVar = cVar.f12241e;
            }
        }
        bVar.b(textView);
        if (!(textView.getForeground() instanceof FocusRingDrawable)) {
            Context context2 = textView.getContext();
            Drawable foreground = textView.getForeground();
            ColorDrawable colorDrawable = FocusRingDrawable.H;
            if (q4.b.b(context2.getTheme(), R.attr.focusRingsEnabled, false)) {
                foreground = new FocusRingDrawable(context2, foreground);
            }
            if (foreground instanceof FocusRingDrawable) {
                FocusRingDrawable focusRingDrawable = (FocusRingDrawable) foreground;
                u4.k kVar = bVar.f12235f;
                FocusRingDrawable.b bVar2 = focusRingDrawable.G;
                bVar2.f12382t = kVar;
                bVar2.f12379p = bVar.f12230a.top;
                textView.setForeground(focusRingDrawable);
            }
        }
        textView.setSelected(bVar == cVar.f12241e);
        textView.setOnClickListener(new j0(this, i7));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.b0 d(ViewGroup viewGroup) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
