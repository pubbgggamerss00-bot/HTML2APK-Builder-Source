package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import hb.f;
import hb.g;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzav {
    private final zzbg<zzam> zza;
    private final Context zzb;
    private boolean zzc = false;
    private final Map<l.a<g>, zzau> zzd = new HashMap();
    private final Map<l.a, zzas> zze = new HashMap();
    private final Map<l.a<f>, zzar> zzf = new HashMap();

    public zzav(Context context, zzbg<zzam> zzbgVar) {
        this.zzb = context;
        this.zza = zzbgVar;
    }

    public final Location zza(String str) throws RemoteException {
        ((zzh) this.zza).zza.checkConnected();
        return ((zzh) this.zza).zza().zzn(str);
    }

    @Deprecated
    public final Location zzb() throws RemoteException {
        ((zzh) this.zza).zza.checkConnected();
        return ((zzh) this.zza).zza().zzm();
    }

    public final LocationAvailability zzc() throws RemoteException {
        ((zzh) this.zza).zza.checkConnected();
        return ((zzh) this.zza).zza().zzs(this.zzb.getPackageName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzd(LocationRequest locationRequest, l<g> lVar, zzai zzaiVar) throws RemoteException {
        zzau zzauVar;
        zzau zzauVar2;
        ((zzh) this.zza).zza.checkConnected();
        l.a<g> aVar = lVar.f6011c;
        if (aVar == null) {
            zzauVar2 = null;
        } else {
            synchronized (this.zzd) {
                try {
                    zzauVar = this.zzd.get(aVar);
                    if (zzauVar == null) {
                        zzauVar = new zzau(lVar);
                    }
                    this.zzd.put(aVar, zzauVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            zzauVar2 = zzauVar;
        }
        if (zzauVar2 == null) {
            return;
        }
        ((zzh) this.zza).zza().zzo(new zzbc(1, zzba.zza(null, locationRequest), zzauVar2, null, null, zzaiVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zze(zzba zzbaVar, l<f> lVar, zzai zzaiVar) throws RemoteException {
        zzar zzarVar;
        ((zzh) this.zza).zza.checkConnected();
        l.a<f> aVar = lVar.f6011c;
        if (aVar == null) {
            zzarVar = null;
        } else {
            synchronized (this.zzf) {
                try {
                    zzar zzarVar2 = this.zzf.get(aVar);
                    if (zzarVar2 == null) {
                        zzarVar2 = new zzar(lVar);
                    }
                    zzarVar = zzarVar2;
                    this.zzf.put(aVar, zzarVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        zzar zzarVar3 = zzarVar;
        if (zzarVar3 == null) {
            return;
        }
        ((zzh) this.zza).zza().zzo(new zzbc(1, zzbaVar, null, null, zzarVar3, zzaiVar));
    }

    public final void zzf(zzba zzbaVar, PendingIntent pendingIntent, zzai zzaiVar) throws RemoteException {
        ((zzh) this.zza).zza.checkConnected();
        ((zzh) this.zza).zza().zzo(zzbc.zzb(zzbaVar, pendingIntent, zzaiVar));
    }

    public final void zzg(LocationRequest locationRequest, PendingIntent pendingIntent, zzai zzaiVar) throws RemoteException {
        ((zzh) this.zza).zza.checkConnected();
        ((zzh) this.zza).zza().zzo(zzbc.zzb(zzba.zza(null, locationRequest), pendingIntent, zzaiVar));
    }

    public final void zzh(l.a<g> aVar, zzai zzaiVar) throws RemoteException {
        ((zzh) this.zza).zza.checkConnected();
        p.g(aVar, "Invalid null listener key");
        synchronized (this.zzd) {
            try {
                zzau zzauVarRemove = this.zzd.remove(aVar);
                if (zzauVarRemove != null) {
                    zzauVarRemove.zzc();
                    ((zzh) this.zza).zza().zzo(zzbc.zza(zzauVarRemove, zzaiVar));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzi(l.a<f> aVar, zzai zzaiVar) throws RemoteException {
        ((zzh) this.zza).zza.checkConnected();
        p.g(aVar, "Invalid null listener key");
        synchronized (this.zzf) {
            try {
                zzar zzarVarRemove = this.zzf.remove(aVar);
                if (zzarVarRemove != null) {
                    zzarVarRemove.zzc();
                    ((zzh) this.zza).zza().zzo(zzbc.zzc(zzarVarRemove, zzaiVar));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzj(PendingIntent pendingIntent, zzai zzaiVar) throws RemoteException {
        ((zzh) this.zza).zza.checkConnected();
        ((zzh) this.zza).zza().zzo(new zzbc(2, null, null, pendingIntent, null, zzaiVar));
    }

    public final void zzk(boolean z10) throws RemoteException {
        ((zzh) this.zza).zza.checkConnected();
        ((zzh) this.zza).zza().zzp(z10);
        this.zzc = z10;
    }

    public final void zzl(Location location) throws RemoteException {
        ((zzh) this.zza).zza.checkConnected();
        ((zzh) this.zza).zza().zzq(location);
    }

    public final void zzm(zzai zzaiVar) throws RemoteException {
        ((zzh) this.zza).zza.checkConnected();
        ((zzh) this.zza).zza().zzr(zzaiVar);
    }

    public final void zzn() throws RemoteException {
        synchronized (this.zzd) {
            try {
                for (zzau zzauVar : this.zzd.values()) {
                    if (zzauVar != null) {
                        ((zzh) this.zza).zza().zzo(zzbc.zza(zzauVar, null));
                    }
                }
                this.zzd.clear();
            } finally {
            }
        }
        synchronized (this.zzf) {
            try {
                for (zzar zzarVar : this.zzf.values()) {
                    if (zzarVar != null) {
                        ((zzh) this.zza).zza().zzo(zzbc.zzc(zzarVar, null));
                    }
                }
                this.zzf.clear();
            } finally {
            }
        }
        synchronized (this.zze) {
            try {
                for (zzas zzasVar : this.zze.values()) {
                    if (zzasVar != null) {
                        ((zzh) this.zza).zza().zzu(new zzl(2, null, zzasVar, null));
                    }
                }
                this.zze.clear();
            } finally {
            }
        }
    }

    public final void zzo() throws RemoteException {
        if (this.zzc) {
            zzk(false);
        }
    }
}
