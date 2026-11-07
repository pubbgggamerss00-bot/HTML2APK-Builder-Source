package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.util.zzau;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c extends RelativeLayout {
    public final zzau s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2329t;

    public c(Context context, String str, String str2, String str3) {
        super(context);
        zzau zzauVar = new zzau(context, str);
        this.s = zzauVar;
        zzauVar.zzo(str2);
        zzauVar.zzn(str3);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f2329t) {
            return false;
        }
        this.s.zzm(motionEvent);
        return false;
    }
}
