package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import hb.f;
import hb.g;

/* loaded from: classes2.dex */
public final class zzz {
    public final i<Status> flushLocations(h hVar) {
        return hVar.b(new zzq(this, hVar));
    }

    public final Location getLastLocation(h hVar) {
        a<a.d.c> aVar = hb.h.f12940a;
        p.a("GoogleApiClient parameter is required.", hVar != null);
        hVar.getClass();
        throw new UnsupportedOperationException();
    }

    public final LocationAvailability getLocationAvailability(h hVar) {
        a<a.d.c> aVar = hb.h.f12940a;
        p.a("GoogleApiClient parameter is required.", hVar != null);
        hVar.getClass();
        throw new UnsupportedOperationException();
    }

    public final i<Status> removeLocationUpdates(h hVar, PendingIntent pendingIntent) {
        return hVar.b(new zzw(this, hVar, pendingIntent));
    }

    public final i<Status> requestLocationUpdates(h hVar, LocationRequest locationRequest, PendingIntent pendingIntent) {
        return hVar.b(new zzu(this, hVar, locationRequest, pendingIntent));
    }

    public final i<Status> setMockLocation(h hVar, Location location) {
        return hVar.b(new zzp(this, hVar, location));
    }

    public final i<Status> setMockMode(h hVar, boolean z10) {
        return hVar.b(new zzo(this, hVar, z10));
    }

    public final i<Status> removeLocationUpdates(h hVar, f fVar) {
        return hVar.b(new zzn(this, hVar, fVar));
    }

    public final i<Status> requestLocationUpdates(h hVar, LocationRequest locationRequest, f fVar, Looper looper) {
        return hVar.b(new zzt(this, hVar, locationRequest, fVar, looper));
    }

    public final i<Status> removeLocationUpdates(h hVar, g gVar) {
        return hVar.b(new zzv(this, hVar, gVar));
    }

    public final i<Status> requestLocationUpdates(h hVar, LocationRequest locationRequest, g gVar) {
        p.g(Looper.myLooper(), "Calling thread must be a prepared Looper thread.");
        return hVar.b(new zzr(this, hVar, locationRequest, gVar));
    }

    public final i<Status> requestLocationUpdates(h hVar, LocationRequest locationRequest, g gVar, Looper looper) {
        return hVar.b(new zzs(this, hVar, locationRequest, gVar, looper));
    }
}
