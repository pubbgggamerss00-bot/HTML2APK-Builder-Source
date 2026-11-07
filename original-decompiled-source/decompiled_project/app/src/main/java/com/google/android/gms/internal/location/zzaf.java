package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.p;
import hb.d;
import hb.e;
import hb.k0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzaf {
    @Deprecated
    public final i<Status> addGeofences(h hVar, List<d> list, PendingIntent pendingIntent) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            for (d dVar : list) {
                if (dVar != null) {
                    p.a("Geofence must be created using Geofence.Builder.", dVar instanceof zzbe);
                    arrayList.add((zzbe) dVar);
                }
            }
        }
        p.a("No geofence has been added to this request.", !arrayList.isEmpty());
        return hVar.b(new zzac(this, hVar, new e(arrayList, 5, "", null), pendingIntent));
    }

    public final i<Status> removeGeofences(h hVar, PendingIntent pendingIntent) {
        p.g(pendingIntent, "PendingIntent can not be null.");
        return zza(hVar, new k0(null, pendingIntent, ""));
    }

    public final i<Status> zza(h hVar, k0 k0Var) {
        return hVar.b(new zzad(this, hVar, k0Var));
    }

    public final i<Status> removeGeofences(h hVar, List<String> list) {
        p.g(list, "geofence can't be null.");
        p.a("Geofences must contains at least one id.", !list.isEmpty());
        return zza(hVar, new k0(list, null, ""));
    }

    public final i<Status> addGeofences(h hVar, e eVar, PendingIntent pendingIntent) {
        return hVar.b(new zzac(this, hVar, eVar, pendingIntent));
    }
}
