package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class fk implements b.InterfaceC0030b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ak f4714a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gk f4715b;

    public fk(gk gkVar, ak akVar) {
        this.f4714a = akVar;
        this.f4715b = gkVar;
    }

    @Override // com.google.android.gms.common.internal.b.InterfaceC0030b
    public final void r(c3.b bVar) {
        synchronized (this.f4715b.f5082c) {
            this.f4714a.b(new RuntimeException("Connection failed."));
        }
    }
}
