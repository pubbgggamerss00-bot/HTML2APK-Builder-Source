package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.p;
import qd.c;
import qd.x;
import rd.n;
import rd.t;

/* loaded from: classes2.dex */
final class zzaez implements zzaed {
    final /* synthetic */ zzaex zza;

    public zzaez(zzaex zzaexVar) {
        this.zza = zzaexVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final void zza(Status status) throws RemoteException {
        String str = status.f5911b;
        if (str != null) {
            if (str.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081, null, null, null);
            } else if (str.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082, null, null, null);
            } else if (str.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083, null, null, null);
            } else if (str.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084, null, null, null);
            } else if (str.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085, null, null, null);
            } else if (str.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086, null, null, null);
            } else if (str.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087, null, null, null);
            } else if (str.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088, null, null, null);
            } else if (str.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089, null, null, null);
            } else if (str.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090, null, null, null);
            }
        }
        zzaex zzaexVar = this.zza;
        if (zzaexVar.zza == 8) {
            zzaexVar.zzu = true;
            zza(new zzafc(this, status));
        } else {
            zzaex.zza(zzaexVar, status);
            this.zza.zza(status);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final void zzb(String str) throws RemoteException {
        int i10 = this.zza.zza;
        p.h("Unexpected response type " + i10, i10 == 8);
        zza(new zzafb(this, str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final void zzc(String str) throws RemoteException {
        int i10 = this.zza.zza;
        p.h("Unexpected response type " + i10, i10 == 7);
        zzaex.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final void zzb() throws RemoteException {
        int i10 = this.zza.zza;
        p.h("Unexpected response type " + i10, i10 == 6);
        zzaex.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final void zzc() throws RemoteException {
        int i10 = this.zza.zza;
        p.h("Unexpected response type " + i10, i10 == 9);
        zzaex.zza(this.zza);
    }

    private final void zza(zzafe zzafeVar) {
        this.zza.zzi.execute(new zzaff(this, zzafeVar));
    }

    private final void zza(Status status, c cVar, String str, String str2) {
        zzaex.zza(this.zza, status);
        zzaex zzaexVar = this.zza;
        zzaexVar.zzn = cVar;
        zzaexVar.zzo = str;
        zzaexVar.zzp = str2;
        t tVar = zzaexVar.zzf;
        if (tVar != null) {
            tVar.zza(status);
        }
        this.zza.zza(status);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final void zza(String str) throws RemoteException {
        int i10 = this.zza.zza;
        p.h("Unexpected response type " + i10, i10 == 8);
        this.zza.zzu = true;
        zza(new zzafd(this, str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final void zza(zzagn zzagnVar) throws RemoteException {
        int i10 = this.zza.zza;
        p.h("Unexpected response type " + i10, i10 == 3);
        zzaex zzaexVar = this.zza;
        zzaexVar.zzl = zzagnVar;
        zzaex.zza(zzaexVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final void zza() throws RemoteException {
        int i10 = this.zza.zza;
        p.h("Unexpected response type " + i10, i10 == 5);
        zzaex.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final void zza(zzaak zzaakVar) {
        zza(zzaakVar.zza(), zzaakVar.zzb(), zzaakVar.zzc(), zzaakVar.zzd());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final void zza(zzaaj zzaajVar) {
        zzaex zzaexVar = this.zza;
        zzaexVar.zzq = zzaajVar;
        zzaexVar.zza(n.a("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final void zza(Status status, x xVar) throws RemoteException {
        int i10 = this.zza.zza;
        p.h("Unexpected response type " + i10, i10 == 2);
        zza(status, xVar, null, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final void zza(zzahj zzahjVar) throws RemoteException {
        zzaex zzaexVar = this.zza;
        zzaexVar.zzs = zzahjVar;
        zzaex.zza(zzaexVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final void zza(zzahk zzahkVar) throws RemoteException {
        zzaex zzaexVar = this.zza;
        zzaexVar.zzr = zzahkVar;
        zzaex.zza(zzaexVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final void zza(zzahn zzahnVar, zzahc zzahcVar) throws RemoteException {
        int i10 = this.zza.zza;
        p.h("Unexpected response type: " + i10, i10 == 2);
        zzaex zzaexVar = this.zza;
        zzaexVar.zzj = zzahnVar;
        zzaexVar.zzk = zzahcVar;
        zzaex.zza(zzaexVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final void zza(zzahx zzahxVar) throws RemoteException {
        int i10 = this.zza.zza;
        p.h("Unexpected response type " + i10, i10 == 4);
        zzaex zzaexVar = this.zza;
        zzaexVar.zzm = zzahxVar;
        zzaex.zza(zzaexVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final void zza(zzahy zzahyVar) throws RemoteException {
        zzaex.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final void zza(zzaij zzaijVar) throws RemoteException {
        zzaex zzaexVar = this.zza;
        zzaexVar.zzt = zzaijVar;
        zzaex.zza(zzaexVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final void zza(zzahn zzahnVar) throws RemoteException {
        int i10 = this.zza.zza;
        p.h("Unexpected response type: " + i10, i10 == 1);
        zzaex zzaexVar = this.zza;
        zzaexVar.zzj = zzahnVar;
        zzaex.zza(zzaexVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final void zza(x xVar) throws RemoteException {
        int i10 = this.zza.zza;
        p.h("Unexpected response type " + i10, i10 == 8);
        this.zza.zzu = true;
        zza(new zzafa(this, xVar));
    }
}
