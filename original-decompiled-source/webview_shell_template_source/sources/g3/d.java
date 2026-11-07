package g3;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.f;
import com.google.android.gms.common.internal.p;
import e3.r;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d extends f<a> {

    /* renamed from: c, reason: collision with root package name */
    public final p f13265c;

    public d(Context context, Looper looper, com.google.android.gms.common.internal.c cVar, p pVar, r rVar, r rVar2) {
        super(context, looper, 270, cVar, rVar, rVar2);
        this.f13265c = pVar;
    }

    @Override // com.google.android.gms.common.internal.b
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    @Override // com.google.android.gms.common.internal.b
    public final c3.d[] getApiFeatures() {
        return o3.d.f14015b;
    }

    @Override // com.google.android.gms.common.internal.b
    public final Bundle getGetServiceRequestExtraArgs() {
        this.f13265c.getClass();
        return new Bundle();
    }

    @Override // com.google.android.gms.common.internal.b
    public final int getMinApkVersion() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.b
    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.b
    public final String getStartServiceAction() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.b
    public final boolean getUseDynamicLookup() {
        return true;
    }
}
