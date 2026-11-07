package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.g;
import da.e;
import da.f;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;
import pa.c;

/* loaded from: classes2.dex */
public final class zzam extends g {
    public zzam(Context context, Looper looper, d dVar, h.a aVar, h.b bVar) {
        super(context, looper, CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET, dVar, aVar, bVar);
    }

    @Override // com.google.android.gms.common.internal.b
    public final IInterface createServiceInterface(IBinder iBinder) {
        int i10 = e.f7670a;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
        return iInterfaceQueryLocalInterface instanceof f ? (f) iInterfaceQueryLocalInterface : new da.d(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    @Override // com.google.android.gms.common.internal.b
    public final c[] getApiFeatures() {
        return new c[]{ca.g.f5353d};
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.b
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.account.IWorkAccountService";
    }

    @Override // com.google.android.gms.common.internal.b
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.account.workaccount.START";
    }

    @Override // com.google.android.gms.common.internal.b
    public final boolean usesClientTelemetry() {
        return true;
    }
}
