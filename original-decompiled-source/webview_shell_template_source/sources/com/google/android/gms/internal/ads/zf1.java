package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzft;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zf1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11276a;

    /* renamed from: b, reason: collision with root package name */
    public final VersionInfoParcel f11277b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f11278c;

    /* renamed from: d, reason: collision with root package name */
    public final ClientApi f11279d = new ClientApi();

    /* renamed from: e, reason: collision with root package name */
    public gy f11280e;

    /* renamed from: f, reason: collision with root package name */
    public final i3.a f11281f;

    public zf1(Context context, VersionInfoParcel versionInfoParcel, ScheduledExecutorService scheduledExecutorService, i3.a aVar) {
        this.f11276a = context;
        this.f11277b = versionInfoParcel;
        this.f11278c = scheduledExecutorService;
        this.f11281f = aVar;
    }

    public static gf1 b() {
        return new gf1(((Long) zzbe.zzc().a(zn.f11495w)).longValue(), ((Long) zzbe.zzc().a(zn.f11502x)).longValue());
    }

    public final yf1 a(zzft zzftVar, zzcf zzcfVar) {
        AdFormat adFormat = AdFormat.getAdFormat(zzftVar.zzb);
        if (adFormat == null) {
            return null;
        }
        int iOrdinal = adFormat.ordinal();
        Context context = this.f11276a;
        VersionInfoParcel versionInfoParcel = this.f11277b;
        if (iOrdinal == 1) {
            return new if1(this.f11279d, context, versionInfoParcel.clientJarVersion, this.f11280e, zzftVar, zzcfVar, this.f11278c, b(), this.f11281f, 0);
        }
        if (iOrdinal == 2) {
            return new if1(this.f11279d, context, versionInfoParcel.clientJarVersion, this.f11280e, zzftVar, zzcfVar, this.f11278c, b(), this.f11281f, 1);
        }
        if (iOrdinal != 5) {
            return null;
        }
        int i6 = versionInfoParcel.clientJarVersion;
        gy gyVar = this.f11280e;
        i3.a aVar = this.f11281f;
        return new ff1(this.f11279d, context, i6, gyVar, zzftVar, zzcfVar, this.f11278c, b(), aVar);
    }
}
