package na;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.auth_blockstore.zzab;
import kotlin.jvm.internal.r;
import na.d;

/* loaded from: classes2.dex */
public final class l extends com.google.android.gms.common.internal.g<d> {
    @Override // com.google.android.gms.common.internal.b
    public final IInterface createServiceInterface(IBinder binder) {
        r.e(binder, "binder");
        int i10 = d.a.f18647a;
        IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface("com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService");
        return iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new d.a.C0208a(binder, "com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService");
    }

    @Override // com.google.android.gms.common.internal.b
    public final pa.c[] getApiFeatures() {
        pa.c[] ALL_FEATURES = zzab.zzl;
        r.d(ALL_FEATURES, "ALL_FEATURES");
        return ALL_FEATURES;
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.b
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService";
    }

    @Override // com.google.android.gms.common.internal.b
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.blockstore.restorecredential.service.START_RESTORE_CRED";
    }

    @Override // com.google.android.gms.common.internal.b
    public final boolean getUseDynamicLookup() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.b
    public final boolean usesClientTelemetry() {
        return true;
    }
}
