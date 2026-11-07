package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import hb.c;
import hb.f;
import hb.g;
import hb.i;
import hb.j;
import hb.k0;
import hb.u0;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzaz extends zzi {
    private final zzav zzf;

    public zzaz(Context context, Looper looper, h.a aVar, h.b bVar, String str, d dVar) {
        super(context, looper, aVar, bVar, str, dVar);
        this.zzf = new zzav(context, this.zze);
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final void disconnect() {
        synchronized (this.zzf) {
            if (isConnected()) {
                try {
                    this.zzf.zzn();
                    this.zzf.zzo();
                } catch (Exception e10) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e10);
                }
                super.disconnect();
            } else {
                super.disconnect();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.b
    public final boolean usesClientTelemetry() {
        return true;
    }

    public final LocationAvailability zzA() throws RemoteException {
        return this.zzf.zzc();
    }

    public final void zzB(zzba zzbaVar, l<f> lVar, zzai zzaiVar) throws RemoteException {
        synchronized (this.zzf) {
            this.zzf.zze(zzbaVar, lVar, zzaiVar);
        }
    }

    public final void zzC(LocationRequest locationRequest, l<g> lVar, zzai zzaiVar) throws RemoteException {
        synchronized (this.zzf) {
            this.zzf.zzd(locationRequest, lVar, zzaiVar);
        }
    }

    public final void zzD(zzba zzbaVar, PendingIntent pendingIntent, zzai zzaiVar) throws RemoteException {
        this.zzf.zzf(zzbaVar, pendingIntent, zzaiVar);
    }

    public final void zzE(LocationRequest locationRequest, PendingIntent pendingIntent, zzai zzaiVar) throws RemoteException {
        this.zzf.zzg(locationRequest, pendingIntent, zzaiVar);
    }

    public final void zzF(l.a<g> aVar, zzai zzaiVar) throws RemoteException {
        this.zzf.zzh(aVar, zzaiVar);
    }

    public final void zzG(PendingIntent pendingIntent, zzai zzaiVar) throws RemoteException {
        this.zzf.zzj(pendingIntent, zzaiVar);
    }

    public final void zzH(l.a<f> aVar, zzai zzaiVar) throws RemoteException {
        this.zzf.zzi(aVar, zzaiVar);
    }

    public final void zzI(boolean z10) throws RemoteException {
        this.zzf.zzk(z10);
    }

    public final void zzJ(Location location) throws RemoteException {
        this.zzf.zzl(location);
    }

    public final void zzK(zzai zzaiVar) throws RemoteException {
        this.zzf.zzm(zzaiVar);
    }

    public final void zzL(i iVar, e<j> eVar, String str) throws RemoteException {
        checkConnected();
        p.a("locationSettingsRequest can't be null nor empty.", iVar != null);
        p.a("listener can't be null.", eVar != null);
        ((zzam) getService()).zzt(iVar, new zzay(eVar), null);
    }

    public final void zzq(long j10, PendingIntent pendingIntent) throws RemoteException {
        checkConnected();
        p.f(pendingIntent);
        p.a("detectionIntervalMillis must be >= 0", j10 >= 0);
        ((zzam) getService()).zzh(j10, true, pendingIntent);
    }

    public final void zzr(c cVar, PendingIntent pendingIntent, e<Status> eVar) throws RemoteException {
        checkConnected();
        p.g(cVar, "activityTransitionRequest must be specified.");
        p.g(pendingIntent, "PendingIntent must be specified.");
        p.g(eVar, "ResultHolder not provided.");
        ((zzam) getService()).zzi(cVar, pendingIntent, new r(eVar));
    }

    public final void zzs(PendingIntent pendingIntent, e<Status> eVar) throws RemoteException {
        checkConnected();
        p.g(eVar, "ResultHolder not provided.");
        ((zzam) getService()).zzj(pendingIntent, new r(eVar));
    }

    public final void zzt(PendingIntent pendingIntent) throws RemoteException {
        checkConnected();
        p.f(pendingIntent);
        ((zzam) getService()).zzk(pendingIntent);
    }

    public final void zzu(PendingIntent pendingIntent, e<Status> eVar) throws RemoteException {
        checkConnected();
        p.g(pendingIntent, "PendingIntent must be specified.");
        p.g(eVar, "ResultHolder not provided.");
        ((zzam) getService()).zzl(pendingIntent, new r(eVar));
    }

    public final void zzv(hb.e eVar, PendingIntent pendingIntent, e<Status> eVar2) throws RemoteException {
        checkConnected();
        p.g(eVar, "geofencingRequest can't be null.");
        p.g(pendingIntent, "PendingIntent must be specified.");
        p.g(eVar2, "ResultHolder not provided.");
        ((zzam) getService()).zzd(eVar, pendingIntent, new zzaw(eVar2));
    }

    public final void zzw(k0 k0Var, e<Status> eVar) throws RemoteException {
        checkConnected();
        p.g(k0Var, "removeGeofencingRequest can't be null.");
        p.g(eVar, "ResultHolder not provided.");
        ((zzam) getService()).zzg(k0Var, new zzax(eVar));
    }

    public final void zzx(PendingIntent pendingIntent, e<Status> eVar) throws RemoteException {
        checkConnected();
        p.g(pendingIntent, "PendingIntent must be specified.");
        p.g(eVar, "ResultHolder not provided.");
        ((zzam) getService()).zze(pendingIntent, new zzax(eVar), getContext().getPackageName());
    }

    public final void zzy(List<String> list, e<Status> eVar) throws RemoteException {
        checkConnected();
        p.a("geofenceRequestIds can't be null nor empty.", list != null && list.size() > 0);
        p.g(eVar, "ResultHolder not provided.");
        ((zzam) getService()).zzf((String[]) list.toArray(new String[0]), new zzax(eVar), getContext().getPackageName());
    }

    public final Location zzz(String str) throws RemoteException {
        pa.c[] availableFeatures = getAvailableFeatures();
        pa.c cVar = u0.f12972a;
        int i10 = 0;
        int length = availableFeatures != null ? availableFeatures.length : 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (!o.a(availableFeatures[i10], cVar)) {
                i10++;
            } else if (i10 >= 0) {
                return this.zzf.zza(str);
            }
        }
        return this.zzf.zzb();
    }
}
