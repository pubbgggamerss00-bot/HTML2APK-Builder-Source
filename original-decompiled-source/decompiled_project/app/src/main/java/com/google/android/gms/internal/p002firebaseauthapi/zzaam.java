package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.p;
import qd.d;
import qd.h0;
import qd.w0;
import rd.n;

/* loaded from: classes2.dex */
public final class zzaam {
    private final zzafl zza;

    public zzaam(zzafl zzaflVar) {
        p.f(zzaflVar);
        this.zza = zzaflVar;
    }

    public final void zzb(String str, String str2, zzaeg zzaegVar) {
        p.d(str);
        p.d(str2);
        p.f(zzaegVar);
        zza(str, new zzace(this, str2, zzaegVar));
    }

    public final void zzc(String str, String str2, zzaeg zzaegVar) {
        p.d(str);
        p.d(str2);
        p.f(zzaegVar);
        zza(str, new zzacd(this, str2, zzaegVar));
    }

    public final void zzd(String str, String str2, zzaeg zzaegVar) {
        p.d(str);
        p.f(zzaegVar);
        this.zza.zza(new zzahu(str, null, str2), new zzaav(this, zzaegVar));
    }

    public final void zze(String str, String str2, zzaeg zzaegVar) {
        p.d(str);
        p.f(zzaegVar);
        this.zza.zza(new zzagk(str, str2), new zzaat(this, zzaegVar));
    }

    public final void zzf(String str, zzaeg zzaegVar) {
        p.d(str);
        p.f(zzaegVar);
        zza(str, new zzabi(this, zzaegVar));
    }

    public static void zza(zzaam zzaamVar, zzaiv zzaivVar, zzaeg zzaegVar, zzafk zzafkVar) {
        Status statusA;
        if (zzaivVar.zzo()) {
            w0 w0VarZzb = zzaivVar.zzb();
            String strZzc = zzaivVar.zzc();
            String strZzj = zzaivVar.zzj();
            if (zzaivVar.zzm()) {
                statusA = new Status(17012, null, null, null);
            } else {
                statusA = n.a(zzaivVar.zzd());
            }
            zzaegVar.zza(new zzaak(statusA, w0VarZzb, strZzc, strZzj));
            return;
        }
        zzaamVar.zza(new zzahn(zzaivVar.zzi(), zzaivVar.zze(), Long.valueOf(zzaivVar.zza()), "Bearer"), zzaivVar.zzh(), zzaivVar.zzg(), Boolean.valueOf(zzaivVar.zzn()), zzaivVar.zzb(), zzaegVar, zzafkVar);
    }

    public final void zzf(String str, String str2, zzaeg zzaegVar) {
        p.d(str);
        p.d(str2);
        p.f(zzaegVar);
        zza(str2, new zzabh(this, str, zzaegVar));
    }

    private final void zzd(zzahe zzaheVar, zzaeg zzaegVar) {
        p.f(zzaheVar);
        p.f(zzaegVar);
        this.zza.zza(zzaheVar, new zzaca(this, zzaegVar));
    }

    public final void zzb(String str, zzaeg zzaegVar) {
        p.d(str);
        p.f(zzaegVar);
        this.zza.zza(new zzahb(str), new zzaal(this, zzaegVar));
    }

    public final void zzc(String str, zzaeg zzaegVar) {
        p.d(str);
        p.f(zzaegVar);
        zza(str, new zzabt(this, zzaegVar));
    }

    public final void zze(String str, zzaeg zzaegVar) {
        p.f(zzaegVar);
        this.zza.zza(new zzaie(str), new zzabz(this, zzaegVar));
    }

    public final void zzc(zzahe zzaheVar, zzaeg zzaegVar) {
        zzd(zzaheVar, zzaegVar);
    }

    public final void zzd(String str, zzaeg zzaegVar) {
        p.f(zzaegVar);
        this.zza.zza(str, new zzabx(this, zzaegVar));
    }

    public final void zzb(zzahe zzaheVar, zzaeg zzaegVar) {
        p.d(zzaheVar.zzc());
        p.f(zzaegVar);
        this.zza.zza(zzaheVar, new zzaaw(this, zzaegVar));
    }

    public final void zzb(String str, String str2, String str3, String str4, zzaeg zzaegVar) {
        p.d(str);
        p.d(str2);
        p.f(zzaegVar);
        this.zza.zza(new zzaiw(str, str2, str3, str4), new zzaan(this, zzaegVar));
    }

    public static /* synthetic */ void zza(zzaam zzaamVar, zzaeg zzaegVar, zzaie zzaieVar, zzafk zzafkVar) {
        p.f(zzaegVar);
        p.f(zzaieVar);
        p.f(zzafkVar);
        zzaamVar.zza.zza(zzaieVar, new zzabb(zzaamVar, zzaegVar, zzafkVar));
    }

    public static /* synthetic */ void zza(zzaam zzaamVar, zzaeg zzaegVar, zzahn zzahnVar, zzaid zzaidVar, zzafk zzafkVar) {
        p.f(zzaegVar);
        p.f(zzahnVar);
        p.f(zzaidVar);
        p.f(zzafkVar);
        zzaamVar.zza.zza(new zzaha(zzahnVar.zzc()), new zzaas(zzaamVar, zzafkVar, zzaegVar, zzahnVar, zzaidVar));
    }

    public static /* synthetic */ void zza(zzaam zzaamVar, zzaeg zzaegVar, zzahn zzahnVar, zzahc zzahcVar, zzaid zzaidVar, zzafk zzafkVar) {
        p.f(zzaegVar);
        p.f(zzahnVar);
        p.f(zzahcVar);
        p.f(zzaidVar);
        p.f(zzafkVar);
        zzaamVar.zza.zza(zzaidVar, new zzaar(zzaamVar, zzaidVar, zzahcVar, zzaegVar, zzahnVar, zzafkVar));
    }

    public final void zza(String str, String str2, zzaeg zzaegVar) {
        p.d(str);
        p.f(zzaegVar);
        zzaid zzaidVar = new zzaid();
        zzaidVar.zze(str);
        zzaidVar.zzh(str2);
        this.zza.zza(zzaidVar, new zzacg(this, zzaegVar));
    }

    public final void zza(zzahu zzahuVar, zzaeg zzaegVar) {
        p.d(zzahuVar.zzb());
        p.f(zzaegVar);
        this.zza.zza(zzahuVar, new zzaax(this, zzaegVar));
    }

    public final void zza(String str, String str2, String str3, String str4, zzaeg zzaegVar) {
        p.d(str);
        p.d(str2);
        p.f(zzaegVar);
        this.zza.zza(new zzaie(str, str2, null, str3, str4, null), new zzaao(this, zzaegVar));
    }

    public final void zza(String str, zzaeg zzaegVar) {
        p.d(str);
        p.f(zzaegVar);
        zza(str, new zzabv(this, zzaegVar));
    }

    private final void zza(String str, zzafn<zzahn> zzafnVar) {
        p.f(zzafnVar);
        p.d(str);
        zzahn zzahnVarZzb = zzahn.zzb(str);
        if (zzahnVarZzb.zzg()) {
            zzafnVar.zza((zzafn<zzahn>) zzahnVarZzb);
        } else {
            this.zza.zza(new zzahb(zzahnVarZzb.zzd()), new zzacf(this, zzafnVar));
        }
    }

    public final void zza(zzagr zzagrVar, String str, zzaeg zzaegVar) {
        p.f(zzagrVar);
        p.f(zzaegVar);
        zza(str, new zzabn(this, zzagrVar, zzaegVar));
    }

    public final void zza(zzagt zzagtVar, zzaeg zzaegVar) {
        p.f(zzagtVar);
        p.f(zzaegVar);
        this.zza.zza(zzagtVar, new zzabp(this, zzaegVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzagp zzagpVar, zzaeg zzaegVar) {
        p.f(zzagpVar);
        p.f(zzaegVar);
        this.zza.zza(zzagpVar, new zzaap(this, zzaegVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzahn zzahnVar, String str, String str2, Boolean bool, w0 w0Var, zzaeg zzaegVar, zzafk zzafkVar) {
        p.f(zzahnVar);
        p.f(zzafkVar);
        p.f(zzaegVar);
        this.zza.zza(new zzaha(zzahnVar.zzc()), new zzaau(this, zzafkVar, str2, str, bool, w0Var, zzaegVar, zzahnVar));
    }

    public final void zza(zzahg zzahgVar, zzaeg zzaegVar) {
        p.f(zzahgVar);
        p.f(zzaegVar);
        this.zza.zza(zzahgVar, new zzabu(this, zzaegVar));
    }

    public final void zza(zzahl zzahlVar, zzaeg zzaegVar) {
        p.f(zzahlVar);
        p.f(zzaegVar);
        this.zza.zza(zzahlVar, new zzabr(this, zzaegVar));
    }

    public final void zza(String str, String str2, String str3, String str4, String str5, zzaeg zzaegVar) {
        p.d(str);
        p.d(str2);
        p.d(str3);
        p.f(zzaegVar);
        zza(str3, new zzabc(this, str, str2, str4, str5, zzaegVar));
    }

    public final void zza(String str, zzait zzaitVar, zzaeg zzaegVar) {
        p.d(str);
        p.f(zzaitVar);
        p.f(zzaegVar);
        zza(str, new zzabg(this, zzaitVar, zzaegVar));
    }

    public final void zza(String str, zzaiy zzaiyVar, zzaeg zzaegVar) {
        p.d(str);
        p.f(zzaiyVar);
        p.f(zzaegVar);
        zza(str, new zzabe(this, zzaiyVar, zzaegVar));
    }

    public final void zza(zzahw zzahwVar, zzaeg zzaegVar) {
        this.zza.zza(zzahwVar, new zzacc(this, zzaegVar));
    }

    public final void zza(zzahe zzaheVar, zzaeg zzaegVar) {
        p.d(zzaheVar.zzd());
        p.f(zzaegVar);
        zzd(zzaheVar, zzaegVar);
    }

    public final void zza(zzaib zzaibVar, zzaeg zzaegVar) {
        p.d(zzaibVar.zzd());
        p.f(zzaegVar);
        this.zza.zza(zzaibVar, new zzaba(this, zzaegVar));
    }

    public final void zza(zzait zzaitVar, zzaeg zzaegVar) {
        p.f(zzaitVar);
        p.f(zzaegVar);
        zzaitVar.zzb(true);
        this.zza.zza(zzaitVar, new zzabl(this, zzaegVar));
    }

    public final void zza(zzaiu zzaiuVar, zzaeg zzaegVar) {
        p.f(zzaiuVar);
        p.f(zzaegVar);
        this.zza.zza(zzaiuVar, new zzaay(this, zzaegVar));
    }

    public final void zza(d dVar, String str, zzaeg zzaegVar) {
        p.f(dVar);
        p.f(zzaegVar);
        if (dVar.f22669e) {
            zza(dVar.f22668d, new zzaaq(this, dVar, str, zzaegVar));
        } else {
            zza(new zzagp(dVar, null, str), zzaegVar);
        }
    }

    public final void zza(zzaiy zzaiyVar, zzaeg zzaegVar) {
        p.f(zzaiyVar);
        p.f(zzaegVar);
        this.zza.zza(zzaiyVar, new zzaaz(this, zzaegVar));
    }

    public final void zza(zzaig zzaigVar, zzaeg zzaegVar) {
        p.f(zzaigVar);
        p.f(zzaegVar);
        this.zza.zza(zzaigVar, new zzabo(this, zzaigVar, zzaegVar));
    }

    public final void zza(zzaii zzaiiVar, zzaeg zzaegVar) {
        p.f(zzaiiVar);
        p.f(zzaegVar);
        this.zza.zza(zzaiiVar, new zzabs(this, zzaegVar));
    }

    public final void zza(String str, String str2, String str3, zzaeg zzaegVar) {
        p.d(str);
        p.d(str2);
        p.f(zzaegVar);
        zza(str, new zzabj(this, str2, str3, zzaegVar));
    }

    public final void zza(String str, h0 h0Var, zzaeg zzaegVar) {
        p.d(str);
        p.f(h0Var);
        p.f(zzaegVar);
        zza(str, new zzacb(this, h0Var, zzaegVar));
    }
}
