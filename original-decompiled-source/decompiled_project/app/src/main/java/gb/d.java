package gb;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.identity_credentials.zze;
import gb.b;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public final class d extends com.google.android.gms.common.internal.g<b> {
    @Override // com.google.android.gms.common.internal.b
    public final IInterface createServiceInterface(IBinder iBinder) {
        r.e(iBinder, "iBinder");
        int i10 = b.a.f11906a;
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        return iInterfaceQueryLocalInterface instanceof b ? (b) iInterfaceQueryLocalInterface : new b.a.C0106a(iBinder, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
    }

    @Override // com.google.android.gms.common.internal.b
    public final pa.c[] getApiFeatures() {
        pa.c[] ALL_FEATURES = zze.zzo;
        r.d(ALL_FEATURES, "ALL_FEATURES");
        return ALL_FEATURES;
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.b
    public final String getServiceDescriptor() {
        return "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService";
    }

    @Override // com.google.android.gms.common.internal.b
    public final String getStartServiceAction() {
        return "com.google.android.gms.identitycredentials.service.START";
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
