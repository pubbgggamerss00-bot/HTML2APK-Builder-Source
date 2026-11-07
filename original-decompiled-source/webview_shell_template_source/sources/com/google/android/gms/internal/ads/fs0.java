package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class fs0 implements yt {
    public final WeakReference s;

    /* renamed from: t, reason: collision with root package name */
    public final String f4773t;

    /* renamed from: u, reason: collision with root package name */
    public final yt f4774u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ gs0 f4775v;

    public /* synthetic */ fs0(gs0 gs0Var, WeakReference weakReference, String str, yt ytVar) {
        this.f4775v = gs0Var;
        this.s = weakReference;
        this.f4773t = str;
        this.f4774u = ytVar;
    }

    @Override // com.google.android.gms.internal.ads.yt
    public final void d(Object obj, Map map) {
        Object obj2 = this.s.get();
        if (obj2 == null) {
            this.f4775v.d(this.f4773t, this);
        } else {
            this.f4774u.d(obj2, map);
        }
    }
}
