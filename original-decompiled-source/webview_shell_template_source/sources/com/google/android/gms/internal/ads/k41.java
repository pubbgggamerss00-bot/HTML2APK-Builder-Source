package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k41 implements ul0 {
    public final AtomicReference s = new AtomicReference();

    @Override // com.google.android.gms.internal.ads.ul0
    public final void c(zzu zzuVar) {
        Object obj = this.s.get();
        if (obj == null) {
            return;
        }
        try {
            ((zzdr) obj).zze(zzuVar);
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        } catch (NullPointerException e7) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }
}
