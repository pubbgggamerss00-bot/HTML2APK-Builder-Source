package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.sh;
import com.google.android.gms.internal.ads.th;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class zzed extends sh implements zzee {
    public zzed() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        if (i6 == 1) {
            zzi();
        } else if (i6 == 2) {
            zzh();
        } else if (i6 == 3) {
            zzg();
        } else if (i6 == 4) {
            zze();
        } else {
            if (i6 != 5) {
                return false;
            }
            boolean zF = th.f(parcel);
            th.b(parcel);
            zzf(zF);
        }
        parcel2.writeNoException();
        return true;
    }
}
