package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class x<S> extends e0<S> {

    /* renamed from: m0, reason: collision with root package name */
    public int f12299m0;

    /* renamed from: n0, reason: collision with root package name */
    public d<S> f12300n0;

    /* renamed from: o0, reason: collision with root package name */
    public com.google.android.material.datepicker.a f12301o0;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a extends d0<S> {
        public a() {
        }

        @Override // com.google.android.material.datepicker.d0
        public final void a(S s) {
            Iterator<d0<S>> it = x.this.f12253l0.iterator();
            while (it.hasNext()) {
                it.next().a(s);
            }
        }
    }

    @Override // androidx.fragment.app.k
    public final void o(Bundle bundle) {
        super.o(bundle);
        if (bundle == null) {
            bundle = this.f1197x;
        }
        this.f12299m0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f12300n0 = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f12301o0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.k
    public final View p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(d(), this.f12299m0));
        d<S> dVar = this.f12300n0;
        new a();
        return dVar.k();
    }

    @Override // androidx.fragment.app.k
    public final void t(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f12299m0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f12300n0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f12301o0);
    }
}
