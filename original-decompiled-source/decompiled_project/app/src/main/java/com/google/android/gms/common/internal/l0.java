package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;

/* loaded from: classes2.dex */
public abstract class l0 extends t0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f6162d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f6163e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b f6164f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(b bVar, int i10, Bundle bundle) {
        super(bVar);
        this.f6164f = bVar;
        this.f6162d = i10;
        this.f6163e = bundle;
    }

    @Override // com.google.android.gms.common.internal.t0
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        b bVar = this.f6164f;
        int i10 = this.f6162d;
        if (i10 != 0) {
            bVar.zzp(1, null);
            Bundle bundle = this.f6163e;
            c(new pa.a(i10, bundle != null ? (PendingIntent) bundle.getParcelable(b.KEY_PENDING_INTENT) : null));
        } else {
            if (d()) {
                return;
            }
            bVar.zzp(1, null);
            c(new pa.a(8, null));
        }
    }

    public abstract void c(pa.a aVar);

    public abstract boolean d();
}
