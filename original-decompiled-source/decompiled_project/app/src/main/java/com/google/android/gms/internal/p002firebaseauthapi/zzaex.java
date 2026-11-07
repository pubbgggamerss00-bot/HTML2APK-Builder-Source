package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.common.api.internal.k;
import id.e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import qd.c;
import qd.p;
import qd.z;
import rd.t;

/* loaded from: classes2.dex */
abstract class zzaex<ResultT, CallbackT> implements zzafi<ResultT> {
    protected final int zza;
    protected e zzc;
    protected p zzd;
    protected CallbackT zze;
    protected t zzf;
    protected zzaey<ResultT> zzg;
    protected Executor zzi;
    protected zzahn zzj;
    protected zzahc zzk;
    protected zzagn zzl;
    protected zzahx zzm;
    protected c zzn;
    protected String zzo;
    protected String zzp;
    protected zzaaj zzq;
    protected zzahk zzr;
    protected zzahj zzs;
    protected zzaij zzt;
    private boolean zzu;
    protected final zzaez zzb = new zzaez(this);
    protected final List<z> zzh = new ArrayList();

    public static class zza extends j {
        private final List<z> zza;

        private zza(k kVar, List<z> list) {
            super(kVar);
            this.mLifecycleFragment.a("PhoneAuthActivityStopCallback", this);
            this.zza = list;
        }

        public static void zza(Activity activity, List<z> list) {
            k fragment = j.getFragment(activity);
            if (((zza) fragment.b(zza.class, "PhoneAuthActivityStopCallback")) == null) {
                new zza(fragment, list);
            }
        }

        @Override // com.google.android.gms.common.api.internal.j
        public void onStop() {
            synchronized (this.zza) {
                this.zza.clear();
            }
        }
    }

    public zzaex(int i10) {
        this.zza = i10;
    }

    public abstract void zzb();

    public final void zzb(ResultT resultt) {
        this.zzu = true;
        this.zzg.zza(resultt, null);
    }

    public final zzaex<ResultT, CallbackT> zza(CallbackT callbackt) {
        com.google.android.gms.common.internal.p.g(callbackt, "external callback cannot be null");
        this.zze = callbackt;
        return this;
    }

    public final zzaex<ResultT, CallbackT> zza(t tVar) {
        com.google.android.gms.common.internal.p.g(tVar, "external failure callback cannot be null");
        this.zzf = tVar;
        return this;
    }

    public final zzaex<ResultT, CallbackT> zza(e eVar) {
        com.google.android.gms.common.internal.p.g(eVar, "firebaseApp cannot be null");
        this.zzc = eVar;
        return this;
    }

    public final zzaex<ResultT, CallbackT> zza(p pVar) {
        com.google.android.gms.common.internal.p.g(pVar, "firebaseUser cannot be null");
        this.zzd = pVar;
        return this;
    }

    public final zzaex<ResultT, CallbackT> zza(z zVar, Activity activity, Executor executor, String str) {
        z zVarZza = zzaft.zza(str, zVar, this);
        synchronized (this.zzh) {
            List<z> list = this.zzh;
            com.google.android.gms.common.internal.p.f(zVarZza);
            list.add(zVarZza);
        }
        if (activity != null) {
            zza.zza(activity, this.zzh);
        }
        com.google.android.gms.common.internal.p.f(executor);
        this.zzi = executor;
        return this;
    }

    public static /* synthetic */ void zza(zzaex zzaexVar) {
        zzaexVar.zzb();
        com.google.android.gms.common.internal.p.h("no success or failure set on method implementation", zzaexVar.zzu);
    }

    public static /* synthetic */ void zza(zzaex zzaexVar, Status status) {
        t tVar = zzaexVar.zzf;
        if (tVar != null) {
            tVar.zza(status);
        }
    }

    public final void zza(Status status) {
        this.zzu = true;
        this.zzg.zza(null, status);
    }
}
