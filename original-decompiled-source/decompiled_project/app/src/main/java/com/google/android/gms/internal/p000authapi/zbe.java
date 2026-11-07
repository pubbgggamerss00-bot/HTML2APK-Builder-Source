package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.g;
import ea.f;

/* loaded from: classes2.dex */
public final class zbe extends g {
    private final ea.g zba;

    public zbe(Context context, Looper looper, d dVar, ea.g gVar, h.a aVar, h.b bVar) {
        super(context, looper, 68, dVar, aVar, bVar);
        gVar = gVar == null ? ea.g.f8637c : gVar;
        f fVar = new f();
        fVar.f8635a = Boolean.FALSE;
        ea.g gVar2 = ea.g.f8637c;
        gVar.getClass();
        fVar.f8635a = Boolean.valueOf(gVar.f8638a);
        fVar.f8636b = gVar.f8639b;
        fVar.f8636b = zbat.zba();
        this.zba = new ea.g(fVar);
    }

    @Override // com.google.android.gms.common.internal.b
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof zbf ? (zbf) iInterfaceQueryLocalInterface : new zbf(iBinder);
    }

    @Override // com.google.android.gms.common.internal.b
    public final Bundle getGetServiceRequestExtraArgs() {
        ea.g gVar = this.zba;
        gVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", gVar.f8638a);
        bundle.putString("log_session_id", gVar.f8639b);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.b
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.b
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
