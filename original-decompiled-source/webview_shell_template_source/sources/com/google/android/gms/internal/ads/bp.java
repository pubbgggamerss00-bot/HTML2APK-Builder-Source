package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import com.google.android.gms.ads.nonagon.signalgeneration.zzo;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class bp implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final w92 f3237a;

    /* renamed from: b, reason: collision with root package name */
    public final w92 f3238b;

    /* renamed from: c, reason: collision with root package name */
    public final w92 f3239c;

    /* renamed from: d, reason: collision with root package name */
    public final w92 f3240d;

    public bp(w92 w92Var, w92 w92Var2, w92 w92Var3, w92 w92Var4) {
        this.f3237a = w92Var;
        this.f3238b = w92Var2;
        this.f3239c = w92Var3;
        this.f3240d = w92Var4;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ap zzb() {
        return new ap((ScheduledExecutorService) this.f3237a.zzb(), (zzo) this.f3238b.zzb(), (zzf) this.f3239c.zzb(), (fu0) this.f3240d.zzb());
    }
}
