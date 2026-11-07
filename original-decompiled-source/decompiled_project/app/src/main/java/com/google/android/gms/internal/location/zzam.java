package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.h;
import com.google.android.gms.location.LocationAvailability;
import hb.c;
import hb.e;
import hb.i;
import hb.k0;
import hb.l;

/* loaded from: classes2.dex */
public interface zzam extends IInterface {
    void zzd(e eVar, PendingIntent pendingIntent, zzak zzakVar) throws RemoteException;

    void zze(PendingIntent pendingIntent, zzak zzakVar, String str) throws RemoteException;

    void zzf(String[] strArr, zzak zzakVar, String str) throws RemoteException;

    void zzg(k0 k0Var, zzak zzakVar) throws RemoteException;

    void zzh(long j10, boolean z10, PendingIntent pendingIntent) throws RemoteException;

    void zzi(c cVar, PendingIntent pendingIntent, h hVar) throws RemoteException;

    void zzj(PendingIntent pendingIntent, h hVar) throws RemoteException;

    void zzk(PendingIntent pendingIntent) throws RemoteException;

    void zzl(PendingIntent pendingIntent, h hVar) throws RemoteException;

    @Deprecated
    Location zzm() throws RemoteException;

    Location zzn(String str) throws RemoteException;

    void zzo(zzbc zzbcVar) throws RemoteException;

    void zzp(boolean z10) throws RemoteException;

    void zzq(Location location) throws RemoteException;

    void zzr(zzai zzaiVar) throws RemoteException;

    LocationAvailability zzs(String str) throws RemoteException;

    void zzt(i iVar, zzao zzaoVar, String str) throws RemoteException;

    void zzu(zzl zzlVar) throws RemoteException;

    void zzv(PendingIntent pendingIntent, l lVar, h hVar) throws RemoteException;
}
