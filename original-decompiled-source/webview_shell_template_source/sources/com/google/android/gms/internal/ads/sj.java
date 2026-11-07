package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class sj implements b.InterfaceC0030b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tj f8955a;

    public sj(tj tjVar) {
        this.f8955a = tjVar;
    }

    @Override // com.google.android.gms.common.internal.b.InterfaceC0030b
    public final void r(c3.b bVar) {
        synchronized (this.f8955a.f9301c) {
            try {
                tj tjVar = this.f8955a;
                tjVar.f9304f = null;
                if (tjVar.f9302d != null) {
                    tjVar.f9302d = null;
                }
                tjVar.f9301c.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
