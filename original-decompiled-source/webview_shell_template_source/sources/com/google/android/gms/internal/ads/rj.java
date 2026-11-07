package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class rj implements b.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tj f8650a;

    public rj(tj tjVar) {
        this.f8650a = tjVar;
    }

    @Override // com.google.android.gms.common.internal.b.a
    public final void n(int i6) {
        synchronized (this.f8650a.f9301c) {
            tj tjVar = this.f8650a;
            tjVar.f9304f = null;
            tjVar.f9301c.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.b.a
    public final void o(Bundle bundle) {
        tj tjVar;
        wj wjVar;
        synchronized (this.f8650a.f9301c) {
            try {
                tjVar = this.f8650a;
                wjVar = tjVar.f9302d;
            } catch (DeadObjectException e6) {
                zzo.zzh("Unable to obtain a cache service instance.", e6);
                tj.b(this.f8650a);
            }
            if (wjVar != null) {
                tjVar.f9304f = (zj) wjVar.getService();
                this.f8650a.f9301c.notifyAll();
            } else {
                this.f8650a.f9301c.notifyAll();
            }
        }
    }
}
