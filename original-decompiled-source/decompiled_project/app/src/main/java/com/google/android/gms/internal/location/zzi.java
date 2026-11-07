package com.google.android.gms.internal.location;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.g;
import hb.u0;
import pa.c;

/* loaded from: classes2.dex */
public class zzi extends g<zzam> {
    protected final zzbg<zzam> zze;
    private final String zzf;

    public zzi(Context context, Looper looper, h.a aVar, h.b bVar, String str, d dVar) {
        super(context, looper, 23, dVar, aVar, bVar);
        this.zze = new zzh(this);
        this.zzf = str;
    }

    @Override // com.google.android.gms.common.internal.b
    public final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof zzam ? (zzam) iInterfaceQueryLocalInterface : new zzal(iBinder);
    }

    @Override // com.google.android.gms.common.internal.b
    public final c[] getApiFeatures() {
        return u0.f12973b;
    }

    @Override // com.google.android.gms.common.internal.b
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.zzf);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 11717000;
    }

    @Override // com.google.android.gms.common.internal.b
    public final String getServiceDescriptor() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.b
    public final String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }
}
