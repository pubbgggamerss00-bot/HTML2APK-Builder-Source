package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Parcel;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.offline.buffering.zza;
import k3.a;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class m10 extends sh implements n10 {
    public static final /* synthetic */ int s = 0;

    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) throws Resources.NotFoundException {
        switch (i6) {
            case 1:
                Intent intent = (Intent) th.a(parcel, Intent.CREATOR);
                th.b(parcel);
                ((oz0) this).u(intent);
                break;
            case 2:
                k3.a aVarR = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                String string = parcel.readString();
                String string2 = parcel.readString();
                th.b(parcel);
                ((oz0) this).L0(aVarR, new zza(string, string2, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
                break;
            case 3:
                ((oz0) this).zzh();
                break;
            case 4:
                ((oz0) this).t(androidx.camera.core.c.c(parcel, parcel));
                break;
            case 5:
                ((oz0) this).X0(parcel.createStringArray(), parcel.createIntArray(), androidx.camera.core.c.c(parcel, parcel));
                break;
            case 6:
                k3.a aVarR2 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                zza zzaVar = (zza) th.a(parcel, zza.CREATOR);
                th.b(parcel);
                ((oz0) this).L0(aVarR2, zzaVar);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
