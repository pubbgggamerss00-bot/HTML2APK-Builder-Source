package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class nb implements Runnable {
    public final /* synthetic */ String s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f7373t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ pb f7374u;

    public nb(pb pbVar, String str, long j6) {
        this.s = str;
        this.f7373t = j6;
        this.f7374u = pbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pb pbVar = this.f7374u;
        pbVar.zza.a(this.s, this.f7373t);
        pbVar.zza.b(pbVar.toString());
    }
}
