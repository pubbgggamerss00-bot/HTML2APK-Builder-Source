package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class e0 extends l0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f2441d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f2442e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b f2443f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(b bVar, int i6, Bundle bundle) {
        super(bVar);
        this.f2443f = bVar;
        this.f2441d = i6;
        this.f2442e = bundle;
    }

    @Override // com.google.android.gms.common.internal.l0
    public final void a(Object obj) {
        b bVar = this.f2443f;
        int i6 = this.f2441d;
        if (i6 != 0) {
            bVar.zzd(1, null);
            Bundle bundle = this.f2442e;
            c(new c3.b(i6, bundle != null ? (PendingIntent) bundle.getParcelable(b.KEY_PENDING_INTENT) : null, null));
        } else {
            if (b()) {
                return;
            }
            bVar.zzd(1, null);
            c(new c3.b(8, null, null));
        }
    }

    public abstract boolean b();

    public abstract void c(c3.b bVar);
}
