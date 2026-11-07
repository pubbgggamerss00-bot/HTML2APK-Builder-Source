package n3;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c extends com.google.android.gms.common.internal.f<e> {
    @Override // com.google.android.gms.common.internal.b
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return iInterfaceQueryLocalInterface instanceof e ? (e) iInterfaceQueryLocalInterface : new e(iBinder);
    }

    @Override // com.google.android.gms.common.internal.b
    public final c3.d[] getApiFeatures() {
        return z2.g.f15433b;
    }

    @Override // com.google.android.gms.common.internal.b
    public final int getMinApkVersion() {
        return 212800000;
    }

    @Override // com.google.android.gms.common.internal.b
    public final String getServiceDescriptor() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // com.google.android.gms.common.internal.b
    public final String getStartServiceAction() {
        return "com.google.android.gms.appset.service.START";
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
