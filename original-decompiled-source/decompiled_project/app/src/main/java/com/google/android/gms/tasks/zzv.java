package com.google.android.gms.tasks;

import android.app.Activity;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.common.api.internal.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
final class zzv extends j {
    private final List zza;

    private zzv(k kVar) {
        super(kVar);
        this.zza = new ArrayList();
        this.mLifecycleFragment.a("TaskOnStopCallback", this);
    }

    public static zzv zza(Activity activity) {
        zzv zzvVar;
        k fragment = j.getFragment(activity);
        synchronized (fragment) {
            try {
                zzvVar = (zzv) fragment.b(zzv.class, "TaskOnStopCallback");
                if (zzvVar == null) {
                    zzvVar = new zzv(fragment);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzvVar;
    }

    @Override // com.google.android.gms.common.api.internal.j
    public final void onStop() {
        synchronized (this.zza) {
            try {
                Iterator it = this.zza.iterator();
                while (it.hasNext()) {
                    zzq zzqVar = (zzq) ((WeakReference) it.next()).get();
                    if (zzqVar != null) {
                        zzqVar.zzc();
                    }
                }
                this.zza.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzb(zzq zzqVar) {
        synchronized (this.zza) {
            this.zza.add(new WeakReference(zzqVar));
        }
    }
}
