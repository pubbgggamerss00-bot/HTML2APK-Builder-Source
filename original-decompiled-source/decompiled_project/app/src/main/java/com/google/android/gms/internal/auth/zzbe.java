package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.common.internal.x;
import ea.b;
import ea.c;

/* loaded from: classes2.dex */
public final class zzbe extends g {
    private final Bundle zze;

    public zzbe(Context context, Looper looper, d dVar, c cVar, f fVar, n nVar) {
        super(context, looper, 16, dVar, fVar, nVar);
        this.zze = cVar == null ? new Bundle() : new Bundle(cVar.f8634a);
    }

    @Override // com.google.android.gms.common.internal.b
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return iInterfaceQueryLocalInterface instanceof zzbh ? (zzbh) iInterfaceQueryLocalInterface : new zzbh(iBinder);
    }

    @Override // com.google.android.gms.common.internal.b
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.zze;
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.b
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // com.google.android.gms.common.internal.b
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final boolean requiresSignIn() {
        d clientSettings = getClientSettings();
        Account account = clientSettings.f6090a;
        if (TextUtils.isEmpty(account != null ? account.name : null)) {
            return false;
        }
        if (((x) clientSettings.f6093d.get(b.f8632a)) == null) {
            return !clientSettings.f6091b.isEmpty();
        }
        throw null;
    }

    @Override // com.google.android.gms.common.internal.b
    public final boolean usesClientTelemetry() {
        return true;
    }
}
