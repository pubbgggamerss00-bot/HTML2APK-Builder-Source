package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.RecaptchaActivity;
import id.e;

/* loaded from: classes2.dex */
public final class zzafr {
    private final FirebaseAuth zza;
    private final Activity zzb;

    public zzafr(FirebaseAuth firebaseAuth, Activity activity) {
        this.zza = firebaseAuth;
        this.zzb = activity;
    }

    public final void zza() {
        String str;
        String str2;
        Intent intent = new Intent("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        intent.setClass(this.zzb, RecaptchaActivity.class);
        intent.setPackage(this.zzb.getPackageName());
        e eVar = this.zza.f6827a;
        eVar.a();
        intent.putExtra("com.google.firebase.auth.KEY_API_KEY", eVar.f14482c.f14492a);
        FirebaseAuth firebaseAuth = this.zza;
        synchronized (firebaseAuth.f6834h) {
            str = firebaseAuth.f6835i;
        }
        if (!TextUtils.isEmpty(str)) {
            FirebaseAuth firebaseAuth2 = this.zza;
            synchronized (firebaseAuth2.f6834h) {
                str2 = firebaseAuth2.f6835i;
            }
            intent.putExtra("com.google.firebase.auth.KEY_TENANT_ID", str2);
        }
        intent.putExtra("com.google.firebase.auth.internal.CLIENT_VERSION", zzaeu.zza().zzb());
        e eVar2 = this.zza.f6827a;
        eVar2.a();
        intent.putExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME", eVar2.f14481b);
        this.zza.getClass();
        intent.putExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN", (String) null);
        this.zzb.startActivity(intent);
    }
}
