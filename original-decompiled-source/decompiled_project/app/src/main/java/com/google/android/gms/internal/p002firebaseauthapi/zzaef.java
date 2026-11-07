package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import com.google.android.gms.common.internal.p;
import id.e;
import java.util.concurrent.ScheduledExecutorService;
import qd.a0;
import qd.d0;
import qd.h0;
import qd.t;
import qd.x;
import sa.a;

/* loaded from: classes2.dex */
public final class zzaef {
    private static final a zza = new a("FirebaseAuth", "FirebaseAuthFallback:");
    private final zzaam zzb;
    private final zzafu zzc;

    public zzaef(e eVar, ScheduledExecutorService scheduledExecutorService) {
        p.f(eVar);
        eVar.a();
        Context context = eVar.f14480a;
        p.f(context);
        this.zzb = new zzaam(new zzaet(eVar, zzaeu.zza()));
        this.zzc = new zzafu(context, scheduledExecutorService);
    }

    public final void zza(String str, String str2, zzaed zzaedVar) {
        p.d(str);
        p.f(zzaedVar);
        this.zzb.zza(str, str2, new zzaeg(zzaedVar, zza));
    }

    public final void zzb(String str, String str2, zzaed zzaedVar) {
        p.d(str);
        p.d(str2);
        p.f(zzaedVar);
        this.zzb.zzb(str, str2, new zzaeg(zzaedVar, zza));
    }

    public final void zzc(String str, String str2, zzaed zzaedVar) {
        p.d(str);
        p.d(str2);
        p.f(zzaedVar);
        this.zzb.zzc(str, str2, new zzaeg(zzaedVar, zza));
    }

    public final void zzd(String str, String str2, zzaed zzaedVar) {
        p.d(str);
        p.f(zzaedVar);
        this.zzb.zzd(str, str2, new zzaeg(zzaedVar, zza));
    }

    public final void zze(String str, String str2, zzaed zzaedVar) {
        p.d(str);
        this.zzb.zze(str, str2, new zzaeg(zzaedVar, zza));
    }

    public final void zzf(String str, String str2, zzaed zzaedVar) {
        p.d(str);
        p.d(str2);
        p.f(zzaedVar);
        this.zzb.zzf(str, str2, new zzaeg(zzaedVar, zza));
    }

    public final void zze(String str, zzaed zzaedVar) {
        p.d(str);
        p.f(zzaedVar);
        this.zzb.zzf(str, new zzaeg(zzaedVar, zza));
    }

    public final void zza(zzahu zzahuVar, zzaed zzaedVar) {
        p.f(zzahuVar);
        p.d(zzahuVar.zzb());
        p.f(zzaedVar);
        this.zzb.zza(zzahuVar, new zzaeg(zzaedVar, zza));
    }

    public final void zzd(String str, zzaed zzaedVar) {
        p.f(zzaedVar);
        this.zzb.zze(str, new zzaeg(zzaedVar, zza));
    }

    public final void zzb(String str, zzaed zzaedVar) {
        p.d(str);
        p.f(zzaedVar);
        this.zzb.zzb(str, new zzaeg(zzaedVar, zza));
    }

    public final void zzc(String str, zzaed zzaedVar) {
        p.d(str);
        p.f(zzaedVar);
        this.zzb.zzc(str, new zzaeg(zzaedVar, zza));
    }

    public final void zza(String str, String str2, String str3, String str4, zzaed zzaedVar) {
        p.d(str);
        p.d(str2);
        p.f(zzaedVar);
        this.zzb.zza(str, str2, str3, str4, new zzaeg(zzaedVar, zza));
    }

    public final void zzb(zzahe zzaheVar, zzaed zzaedVar) {
        p.f(zzaheVar);
        p.d(zzaheVar.zzc());
        p.f(zzaedVar);
        this.zzb.zzb(zzaheVar, new zzaeg(zzaedVar, zza));
    }

    public final void zzc(zzahe zzaheVar, zzaed zzaedVar) {
        p.f(zzaheVar);
        this.zzb.zzc(zzaheVar, new zzaeg(zzaedVar, zza));
    }

    public final void zza(String str, zzaed zzaedVar) {
        p.d(str);
        p.f(zzaedVar);
        this.zzb.zza(str, new zzaeg(zzaedVar, zza));
    }

    public final void zzb(String str, String str2, String str3, String str4, zzaed zzaedVar) {
        p.d(str);
        p.d(str2);
        p.f(zzaedVar);
        this.zzb.zzb(str, str2, str3, str4, new zzaeg(zzaedVar, zza));
    }

    public final void zza(t tVar, String str, String str2, String str3, zzaed zzaedVar) {
        p.f(tVar);
        p.e(str, "cachedTokenState should not be empty.");
        p.f(zzaedVar);
        if (!(tVar instanceof a0)) {
            if (tVar instanceof d0) {
                p.f(null);
                throw null;
            }
            throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
        }
        throw null;
    }

    public final void zza(String str, t tVar, String str2, zzaed zzaedVar) {
        p.d(str);
        p.f(tVar);
        p.f(zzaedVar);
        if (!(tVar instanceof a0)) {
            if (tVar instanceof d0) {
                zzaam zzaamVar = this.zzb;
                p.d(null);
                p.d(null);
                zzaamVar.zza(zzagw.zza(str, null, str2, null), new zzaeg(zzaedVar, zza));
                return;
            }
            throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
        }
        throw null;
    }

    public final void zza(zzahg zzahgVar, zzaed zzaedVar) {
        p.f(zzahgVar);
        this.zzb.zza(zzahgVar, new zzaeg(zzaedVar, zza));
    }

    public final void zza(zzahl zzahlVar, zzaed zzaedVar) {
        p.f(zzahlVar);
        this.zzb.zza(zzahlVar, new zzaeg(zzaedVar, zza));
    }

    public final void zza(String str, String str2, String str3, String str4, String str5, zzaed zzaedVar) {
        p.d(str);
        p.d(str2);
        p.d(str3);
        p.f(zzaedVar);
        this.zzb.zza(str, str2, str3, str4, str5, new zzaeg(zzaedVar, zza));
    }

    public final void zza(String str, zzait zzaitVar, zzaed zzaedVar) {
        p.d(str);
        p.f(zzaitVar);
        p.f(zzaedVar);
        this.zzb.zza(str, zzaitVar, new zzaeg(zzaedVar, zza));
    }

    public final void zza(zzahr zzahrVar, zzaed zzaedVar) {
        p.f(zzaedVar);
        p.f(zzahrVar);
        String strZzb = zzahrVar.zzb();
        p.d(strZzb);
        this.zzb.zza(strZzb, zzahrVar.zza(), new zzaeg(zzaedVar, zza));
    }

    public final void zza(zzahw zzahwVar, zzaed zzaedVar) {
        p.f(zzahwVar);
        this.zzb.zza(zzahwVar, new zzaeg(zzaedVar, zza));
    }

    public final void zza(zzahe zzaheVar, zzaed zzaedVar) {
        p.f(zzaheVar);
        p.d(zzaheVar.zzd());
        p.f(zzaedVar);
        this.zzb.zza(zzaheVar, new zzaeg(zzaedVar, zza));
    }

    public final void zza(zzaib zzaibVar, zzaed zzaedVar) {
        p.f(zzaedVar);
        p.f(zzaibVar);
        String strZzd = zzaibVar.zzd();
        zzaeg zzaegVar = new zzaeg(zzaedVar, zza);
        if (this.zzc.zzc(strZzd)) {
            if (zzaibVar.zze()) {
                this.zzc.zzb(strZzd);
            } else {
                this.zzc.zzb(zzaegVar, strZzd);
                return;
            }
        }
        long jZzb = zzaibVar.zzb();
        boolean zZzf = zzaibVar.zzf();
        if (zza(jZzb, zZzf)) {
            zzaibVar.zza(new zzage(this.zzc.zzb()));
        }
        this.zzc.zza(strZzd, zzaegVar, jZzb, zZzf);
        this.zzb.zza(zzaibVar, this.zzc.zza(zzaegVar, strZzd));
    }

    public final void zza(zzaif zzaifVar, zzaed zzaedVar) {
        p.f(zzaifVar);
        p.f(zzaedVar);
        this.zzb.zzd(zzaifVar.zza(), new zzaeg(zzaedVar, zza));
    }

    public final void zza(zzait zzaitVar, zzaed zzaedVar) {
        p.f(zzaitVar);
        p.f(zzaedVar);
        this.zzb.zza(zzaitVar, new zzaeg(zzaedVar, zza));
    }

    public final void zza(zzaiu zzaiuVar, zzaed zzaedVar) {
        p.f(zzaiuVar);
        p.f(zzaedVar);
        this.zzb.zza(zzaiuVar, new zzaeg(zzaedVar, zza));
    }

    public final void zza(zzagp zzagpVar, zzaed zzaedVar) {
        p.f(zzaedVar);
        p.f(zzagpVar.zzb());
        this.zzb.zza(zzagpVar.zzb(), zzagpVar.zzc(), new zzaeg(zzaedVar, zza));
    }

    public final void zza(zzaai zzaaiVar, zzaed zzaedVar) {
        p.f(zzaedVar);
        p.f(zzaaiVar);
        x xVarZza = zzaaiVar.zza();
        p.f(xVarZza);
        this.zzb.zza(zzafo.zza(xVarZza), new zzaeg(zzaedVar, zza));
    }

    public final void zza(String str, String str2, String str3, long j10, boolean z10, boolean z11, String str4, String str5, String str6, boolean z12, zzaed zzaedVar) {
        p.e(str, "idToken should not be empty.");
        p.f(zzaedVar);
        zzaeg zzaegVar = new zzaeg(zzaedVar, zza);
        if (this.zzc.zzc(str2)) {
            if (z10) {
                this.zzc.zzb(str2);
            } else {
                this.zzc.zzb(zzaegVar, str2);
                return;
            }
        }
        zzaik zzaikVarZza = zzaik.zza(str, str2, str3, str4, str5, str6, null);
        if (zza(j10, z12)) {
            zzaikVarZza.zza(new zzage(this.zzc.zzb()));
        }
        this.zzc.zza(str2, zzaegVar, j10, z12);
        this.zzb.zza(zzaikVarZza, this.zzc.zza(zzaegVar, str2));
    }

    public final void zza(zzaah zzaahVar, zzaed zzaedVar) {
        p.f(zzaahVar);
        p.f(zzaedVar);
        String str = zzaahVar.zzb().f22662d;
        zzaeg zzaegVar = new zzaeg(zzaedVar, zza);
        if (this.zzc.zzc(str)) {
            if (zzaahVar.zzh()) {
                this.zzc.zzb(str);
            } else {
                this.zzc.zzb(zzaegVar, str);
                return;
            }
        }
        long jZza = zzaahVar.zza();
        boolean zZzi = zzaahVar.zzi();
        zzaii zzaiiVarZza = zzaii.zza(zzaahVar.zze(), zzaahVar.zzb().f22659a, zzaahVar.zzb().f22662d, zzaahVar.zzd(), zzaahVar.zzg(), zzaahVar.zzf(), zzaahVar.zzc());
        if (zza(jZza, zZzi)) {
            zzaiiVarZza.zza(new zzage(this.zzc.zzb()));
        }
        this.zzc.zza(str, zzaegVar, jZza, zZzi);
        this.zzb.zza(zzaiiVarZza, this.zzc.zza(zzaegVar, str));
    }

    public final void zza(zzaim zzaimVar, zzaed zzaedVar) {
        p.f(zzaedVar);
        this.zzb.zza(zzaimVar, new zzaeg(zzaedVar, zza));
    }

    public final void zza(String str, String str2, String str3, zzaed zzaedVar) {
        p.e(str, "cachedTokenState should not be empty.");
        p.e(str2, "uid should not be empty.");
        p.f(zzaedVar);
        this.zzb.zza(str, str2, str3, new zzaeg(zzaedVar, zza));
    }

    public final void zza(String str, h0 h0Var, zzaed zzaedVar) {
        p.d(str);
        p.f(h0Var);
        p.f(zzaedVar);
        this.zzb.zza(str, h0Var, new zzaeg(zzaedVar, zza));
    }

    private static boolean zza(long j10, boolean z10) {
        if (j10 > 0 && z10) {
            return true;
        }
        zza.f("App hash will not be appended to the request.", new Object[0]);
        return false;
    }
}
