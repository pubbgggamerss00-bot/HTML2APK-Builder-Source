package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zp0 implements View.OnClickListener {
    public final gs0 s;

    /* renamed from: t, reason: collision with root package name */
    public final i3.a f11550t;

    /* renamed from: u, reason: collision with root package name */
    public ss f11551u;

    /* renamed from: v, reason: collision with root package name */
    public yp0 f11552v;

    /* renamed from: w, reason: collision with root package name */
    public String f11553w;

    /* renamed from: x, reason: collision with root package name */
    public Long f11554x;

    /* renamed from: y, reason: collision with root package name */
    public WeakReference f11555y;

    public zp0(gs0 gs0Var, i3.a aVar) {
        this.s = gs0Var;
        this.f11550t = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2;
        WeakReference weakReference = this.f11555y;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.f11553w != null && this.f11554x != null) {
            HashMap map = new HashMap();
            map.put("id", this.f11553w);
            map.put("time_interval", String.valueOf(this.f11550t.a() - this.f11554x.longValue()));
            map.put("messageType", "onePointFiveClick");
            this.s.b(map);
        }
        this.f11553w = null;
        this.f11554x = null;
        WeakReference weakReference2 = this.f11555y;
        if (weakReference2 == null || (view2 = (View) weakReference2.get()) == null) {
            return;
        }
        view2.setClickable(false);
        view2.setOnClickListener(null);
        this.f11555y = null;
    }
}
