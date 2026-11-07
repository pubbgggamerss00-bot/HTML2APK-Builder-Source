package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.p;
import id.e;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import k3.b;

/* loaded from: classes2.dex */
public final class zzaet extends zzafl implements zzagf {
    private zzaen zza;
    private zzaeq zzb;
    private zzafq zzc;
    private final zzaeu zzd;
    private final e zze;
    private String zzf;
    private zzaew zzg;

    public zzaet(e eVar, zzaeu zzaeuVar) {
        this(eVar, zzaeuVar, null, null, null);
    }

    private final zzaew zzb() {
        if (this.zzg == null) {
            this.zzg = new zzaew(this.zze, this.zzd.zzb());
        }
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzagk zzagkVar, zzafn<zzagn> zzafnVar) throws IOException {
        p.f(zzagkVar);
        p.f(zzafnVar);
        zzaen zzaenVar = this.zza;
        zzafm.zza(zzaenVar.zza("/createAuthUri", this.zzf), zzagkVar, zzafnVar, zzagn.class, zzaenVar.zza);
    }

    private zzaet(e eVar, zzaeu zzaeuVar, zzafq zzafqVar, zzaen zzaenVar, zzaeq zzaeqVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.zze = eVar;
        eVar.a();
        this.zzf = eVar.f14482c.f14492a;
        p.f(zzaeuVar);
        this.zzd = zzaeuVar;
        zza(null, null, null);
        zzagd.zza(this.zzf, this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzagm zzagmVar, zzafn<Void> zzafnVar) throws IOException {
        p.f(zzagmVar);
        p.f(zzafnVar);
        zzaen zzaenVar = this.zza;
        zzafm.zza(zzaenVar.zza("/deleteAccount", this.zzf), zzagmVar, zzafnVar, Void.class, zzaenVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzagp zzagpVar, zzafn<zzago> zzafnVar) throws IOException {
        p.f(zzagpVar);
        p.f(zzafnVar);
        zzaen zzaenVar = this.zza;
        zzafm.zza(zzaenVar.zza("/emailLinkSignin", this.zzf), zzagpVar, zzafnVar, zzago.class, zzaenVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzagr zzagrVar, zzafn<zzagq> zzafnVar) throws IOException {
        p.f(zzagrVar);
        p.f(zzafnVar);
        zzaeq zzaeqVar = this.zzb;
        zzaeq.zza(zzaeqVar.zza("/accounts/mfaEnrollment:finalize", this.zzf), zzagrVar, zzafnVar, zzagq.class, zzaeqVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzagt zzagtVar, zzafn<zzags> zzafnVar) throws IOException {
        p.f(zzagtVar);
        p.f(zzafnVar);
        zzaeq zzaeqVar = this.zzb;
        zzaeq.zza(zzaeqVar.zza("/accounts/mfaSignIn:finalize", this.zzf), zzagtVar, zzafnVar, zzags.class, zzaeqVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzahb zzahbVar, zzafn<zzahn> zzafnVar) throws IOException {
        p.f(zzahbVar);
        p.f(zzafnVar);
        zzafq zzafqVar = this.zzc;
        zzafm.zza(zzafqVar.zza("/token", this.zzf), zzahbVar, zzafnVar, zzahn.class, zzafqVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzaha zzahaVar, zzafn<zzahd> zzafnVar) throws IOException {
        p.f(zzahaVar);
        p.f(zzafnVar);
        zzaen zzaenVar = this.zza;
        zzafm.zza(zzaenVar.zza("/getAccountInfo", this.zzf), zzahaVar, zzafnVar, zzahd.class, zzaenVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzahe zzaheVar, zzafn<zzahh> zzafnVar) throws IOException {
        p.f(zzaheVar);
        p.f(zzafnVar);
        if (zzaheVar.zzb() != null) {
            zzb().zzb(zzaheVar.zzb().f22652h);
        }
        zzaen zzaenVar = this.zza;
        zzafm.zza(zzaenVar.zza("/getOobConfirmationCode", this.zzf), zzaheVar, zzafnVar, zzahh.class, zzaenVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzahg zzahgVar, zzafn<zzahj> zzafnVar) {
        p.f(zzahgVar);
        p.f(zzafnVar);
        zzaen zzaenVar = this.zza;
        zzafm.zza(zzaenVar.zza("/getRecaptchaParam", this.zzf), zzafnVar, zzahj.class, zzaenVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzahl zzahlVar, zzafn<zzahk> zzafnVar) {
        p.f(zzahlVar);
        p.f(zzafnVar);
        zzaeq zzaeqVar = this.zzb;
        String strA = zzaeqVar.zza("/recaptchaConfig", this.zzf) + "&clientType=" + zzahlVar.zzb() + "&version=" + zzahlVar.zzc();
        if (!zzae.zzc(zzahlVar.zzd())) {
            strA = b.a(strA, "&tenantId=", zzahlVar.zzd());
        }
        zzafm.zza(strA, zzafnVar, zzahk.class, zzaeqVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagf
    public final void zza() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        zza(null, null, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzahu zzahuVar, zzafn<zzahx> zzafnVar) throws IOException {
        p.f(zzahuVar);
        p.f(zzafnVar);
        zzaen zzaenVar = this.zza;
        zzafm.zza(zzaenVar.zza("/resetPassword", this.zzf), zzahuVar, zzafnVar, zzahx.class, zzaenVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzahw zzahwVar, zzafn<zzahy> zzafnVar) throws IOException {
        p.f(zzahwVar);
        p.f(zzafnVar);
        zzaeq zzaeqVar = this.zzb;
        zzaeq.zza(zzaeqVar.zza("/accounts:revokeToken", this.zzf), zzahwVar, zzafnVar, zzahy.class, zzaeqVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzaib zzaibVar, zzafn<zzaia> zzafnVar) throws IOException {
        p.f(zzaibVar);
        p.f(zzafnVar);
        if (!TextUtils.isEmpty(zzaibVar.zzc())) {
            zzb().zzb(zzaibVar.zzc());
        }
        zzaen zzaenVar = this.zza;
        zzafm.zza(zzaenVar.zza("/sendVerificationCode", this.zzf), zzaibVar, zzafnVar, zzaia.class, zzaenVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzaid zzaidVar, zzafn<zzaic> zzafnVar) throws IOException {
        p.f(zzaidVar);
        p.f(zzafnVar);
        zzaen zzaenVar = this.zza;
        zzafm.zza(zzaenVar.zza("/setAccountInfo", this.zzf), zzaidVar, zzafnVar, zzaic.class, zzaenVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(String str, zzafn<Void> zzafnVar) {
        p.f(zzafnVar);
        zzb().zza(str);
        zzafnVar.zza((zzafn<Void>) null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzaie zzaieVar, zzafn<zzaih> zzafnVar) throws IOException {
        p.f(zzaieVar);
        p.f(zzafnVar);
        zzaen zzaenVar = this.zza;
        zzafm.zza(zzaenVar.zza("/signupNewUser", this.zzf), zzaieVar, zzafnVar, zzaih.class, zzaenVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzaig zzaigVar, zzafn<zzaij> zzafnVar) throws IOException {
        p.f(zzaigVar);
        p.f(zzafnVar);
        if (zzaigVar instanceof zzaik) {
            zzaik zzaikVar = (zzaik) zzaigVar;
            if (!TextUtils.isEmpty(zzaikVar.zzb())) {
                zzb().zzb(zzaikVar.zzb());
            }
        }
        zzaeq zzaeqVar = this.zzb;
        zzaeq.zza(zzaeqVar.zza("/accounts/mfaEnrollment:start", this.zzf), zzaigVar, zzafnVar, zzaij.class, zzaeqVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzaii zzaiiVar, zzafn<zzail> zzafnVar) throws IOException {
        p.f(zzaiiVar);
        p.f(zzafnVar);
        if (!TextUtils.isEmpty(zzaiiVar.zzb())) {
            zzb().zzb(zzaiiVar.zzb());
        }
        zzaeq zzaeqVar = this.zzb;
        zzaeq.zza(zzaeqVar.zza("/accounts/mfaSignIn:start", this.zzf), zzaiiVar, zzafnVar, zzail.class, zzaeqVar.zza);
    }

    private final void zza(zzafq zzafqVar, zzaen zzaenVar, zzaeq zzaeqVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        String strZza = zzaga.zza("firebear.secureToken");
        if (TextUtils.isEmpty(strZza)) {
            strZza = zzagd.zzd(this.zzf);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for secureToken URL: " + strZza);
        }
        if (this.zzc == null) {
            this.zzc = new zzafq(strZza, zzb());
        }
        String strZza2 = zzaga.zza("firebear.identityToolkit");
        if (TextUtils.isEmpty(strZza2)) {
            strZza2 = zzagd.zzb(this.zzf);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkit URL: " + strZza2);
        }
        if (this.zza == null) {
            this.zza = new zzaen(strZza2, zzb());
        }
        String strZza3 = zzaga.zza("firebear.identityToolkitV2");
        if (TextUtils.isEmpty(strZza3)) {
            strZza3 = zzagd.zzc(this.zzf);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkitV2 URL: " + strZza3);
        }
        if (this.zzb == null) {
            this.zzb = new zzaeq(strZza3, zzb());
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzait zzaitVar, zzafn<zzaiv> zzafnVar) throws IOException {
        p.f(zzaitVar);
        p.f(zzafnVar);
        zzaen zzaenVar = this.zza;
        zzafm.zza(zzaenVar.zza("/verifyAssertion", this.zzf), zzaitVar, zzafnVar, zzaiv.class, zzaenVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzaiu zzaiuVar, zzafn<zzaix> zzafnVar) throws IOException {
        p.f(zzaiuVar);
        p.f(zzafnVar);
        zzaen zzaenVar = this.zza;
        zzafm.zza(zzaenVar.zza("/verifyCustomToken", this.zzf), zzaiuVar, zzafnVar, zzaix.class, zzaenVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzaiw zzaiwVar, zzafn<zzaiz> zzafnVar) throws IOException {
        p.f(zzaiwVar);
        p.f(zzafnVar);
        zzaen zzaenVar = this.zza;
        zzafm.zza(zzaenVar.zza("/verifyPassword", this.zzf), zzaiwVar, zzafnVar, zzaiz.class, zzaenVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzaiy zzaiyVar, zzafn<zzajb> zzafnVar) throws IOException {
        p.f(zzaiyVar);
        p.f(zzafnVar);
        zzaen zzaenVar = this.zza;
        zzafm.zza(zzaenVar.zza("/verifyPhoneNumber", this.zzf), zzaiyVar, zzafnVar, zzajb.class, zzaenVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzaja zzajaVar, zzafn<zzajd> zzafnVar) throws IOException {
        p.f(zzajaVar);
        p.f(zzafnVar);
        zzaeq zzaeqVar = this.zzb;
        zzaeq.zza(zzaeqVar.zza("/accounts/mfaEnrollment:withdraw", this.zzf), zzajaVar, zzafnVar, zzajd.class, zzaeqVar.zza);
    }
}
