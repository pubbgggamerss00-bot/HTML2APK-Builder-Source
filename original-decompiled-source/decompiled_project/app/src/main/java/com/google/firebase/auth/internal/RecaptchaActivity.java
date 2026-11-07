package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import c5.n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.internal.p002firebaseauthapi.zza;
import com.google.android.gms.internal.p002firebaseauthapi.zzaeh;
import com.google.android.gms.internal.p002firebaseauthapi.zzaej;
import com.google.android.gms.internal.p002firebaseauthapi.zzaem;
import com.google.android.gms.internal.p002firebaseauthapi.zzaev;
import com.google.android.gms.internal.p002firebaseauthapi.zzaga;
import com.google.android.gms.internal.p002firebaseauthapi.zzagd;
import com.google.android.gms.internal.p002firebaseauthapi.zzaj;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import fe.b;
import id.e;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import o5.a;
import rd.d0;
import rd.f0;
import rd.h0;
import rd.t0;
import rd.v0;
import rd.x0;
import rd.y0;
import wa.c;

/* loaded from: classes2.dex */
public class RecaptchaActivity extends n implements zzaej {

    /* renamed from: g, reason: collision with root package name */
    public static long f6869g;

    /* renamed from: h, reason: collision with root package name */
    public static final v0 f6870h = v0.f23431b;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6871f = false;

    public final Uri.Builder h(Uri.Builder builder, Intent intent, String str, String str2) {
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String string = UUID.randomUUID().toString();
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        e eVarE = e.e(stringExtra3);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(eVarE);
        x0 x0Var = x0.f23435a;
        Context applicationContext = getApplicationContext();
        synchronized (x0Var) {
            p.d(str);
            p.d(string);
            SharedPreferences sharedPreferencesA = x0.a(applicationContext, str);
            x0.b(sharedPreferencesA);
            SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
            editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + string + ".OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + string + ".FIREBASE_APP_NAME", stringExtra3);
            editorEdit.apply();
        }
        String strA = y0.c(getApplicationContext(), eVarE.f()).a();
        String strZza = null;
        if (TextUtils.isEmpty(strA)) {
            Log.e("RecaptchaActivity", "Could not generate an encryption key for reCAPTCHA - cancelling flow.");
            i(rd.n.a("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
            return null;
        }
        synchronized (firebaseAuth.f6833g) {
        }
        if (TextUtils.isEmpty(null)) {
            strZza = zzaev.zza();
        }
        builder.appendQueryParameter("apiKey", stringExtra).appendQueryParameter("authType", "verifyApp").appendQueryParameter("apn", str).appendQueryParameter("hl", strZza).appendQueryParameter("eventId", string).appendQueryParameter("v", "X" + stringExtra2).appendQueryParameter("eid", "p").appendQueryParameter("appName", stringExtra3).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", strA);
        return builder;
    }

    public final void i(Status status) {
        f6869g = 0L;
        this.f6871f = false;
        Intent intent = new Intent();
        HashMap map = t0.f23429a;
        Parcel parcelObtain = Parcel.obtain();
        status.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        intent.putExtra("com.google.firebase.auth.internal.STATUS", bArrMarshall);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        a.a(this).b(intent);
        f6870h.f23432a.getClass();
        d0.b(getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        finish();
    }

    public final void j() {
        f6869g = 0L;
        this.f6871f = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        a.a(this).b(intent);
        f6870h.f23432a.getClass();
        d0.b(getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        finish();
    }

    @Override // c5.n, b.k, o3.d, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e("RecaptchaActivity", "Could not do operation - unknown action: " + action);
            j();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - f6869g < 30000) {
            Log.e("RecaptchaActivity", "Could not start operation - already in progress");
            return;
        }
        f6869g = jCurrentTimeMillis;
        if (bundle != null) {
            this.f6871f = bundle.getBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW");
        }
    }

    @Override // b.k, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // c5.n, android.app.Activity
    public final void onResume() {
        RecaptchaActivity recaptchaActivity;
        String str;
        super.onResume();
        if (!"android.intent.action.VIEW".equals(getIntent().getAction())) {
            if (this.f6871f) {
                j();
                return;
            }
            Intent intent = getIntent();
            String packageName = getPackageName();
            try {
                String lowerCase = c.a(wa.a.a(this, packageName)).toLowerCase(Locale.US);
                e eVarE = e.e(intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME"));
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(eVarE);
                if (zzagd.zza(eVarE)) {
                    recaptchaActivity = this;
                    eVarE.a();
                    zza(h(Uri.parse(zzagd.zza(eVarE.f14482c.f14492a)).buildUpon(), getIntent(), packageName, lowerCase).build(), packageName, firebaseAuth.f6842p);
                } else {
                    recaptchaActivity = this;
                    new zzaeh(packageName, lowerCase, intent, eVarE, recaptchaActivity).executeOnExecutor(firebaseAuth.f6845s, new Void[0]);
                }
            } catch (PackageManager.NameNotFoundException e10) {
                recaptchaActivity = this;
                Log.e("RecaptchaActivity", "Could not get package signature: " + packageName + " " + String.valueOf(e10));
                zzaem.zzb(this, packageName);
            }
            recaptchaActivity.f6871f = true;
            return;
        }
        Intent intent2 = getIntent();
        if (intent2.hasExtra("firebaseError")) {
            i(t0.a(intent2.getStringExtra("firebaseError")));
            return;
        }
        if (!intent2.hasExtra("link") || !intent2.hasExtra("eventId")) {
            j();
            return;
        }
        String stringExtra = intent2.getStringExtra("link");
        x0 x0Var = x0.f23435a;
        Context applicationContext = getApplicationContext();
        String packageName2 = getPackageName();
        String stringExtra2 = intent2.getStringExtra("eventId");
        synchronized (x0Var) {
            p.d(packageName2);
            p.d(stringExtra2);
            SharedPreferences sharedPreferencesA = x0.a(applicationContext, packageName2);
            String str2 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".OPERATION";
            str = null;
            String string = sharedPreferencesA.getString(str2, null);
            String str3 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".FIREBASE_APP_NAME";
            String string2 = sharedPreferencesA.getString(str3, null);
            SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
            editorEdit.remove(str2);
            editorEdit.remove(str3);
            editorEdit.apply();
            if (!TextUtils.isEmpty(string)) {
                str = string2;
            }
        }
        if (TextUtils.isEmpty(str)) {
            Log.e("RecaptchaActivity", "Failed to find registration for this event - failing to prevent session injection.");
            i(rd.n.a("Failed to find registration for this reCAPTCHA event"));
        }
        if (intent2.getBooleanExtra("encryptionEnabled", true)) {
            stringExtra = y0.c(getApplicationContext(), e.e(str).f()).b(stringExtra);
        }
        String queryParameter = Uri.parse(stringExtra).getQueryParameter("recaptchaToken");
        f6869g = 0L;
        this.f6871f = false;
        Intent intent3 = new Intent();
        intent3.putExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN", queryParameter);
        intent3.putExtra("com.google.firebase.auth.internal.OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        intent3.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        a.a(this).b(intent3);
        Context applicationContext2 = getApplicationContext();
        zzaj<String> zzajVar = d0.f23358a;
        SharedPreferences.Editor editorEdit2 = applicationContext2.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit2.putString("recaptchaToken", queryParameter);
        editorEdit2.putString("operation", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        editorEdit2.putLong("timestamp", System.currentTimeMillis());
        editorEdit2.commit();
        finish();
    }

    @Override // b.k, o3.d, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", this.f6871f);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final Uri.Builder zza(Intent intent, String str, String str2) {
        return h(new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler"), intent, str, str2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final String zza(String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String strZza = zzaga.zza("firebear.identityToolkit");
        if (TextUtils.isEmpty(strZza)) {
            return zzagd.zzb(str);
        }
        Log.e("RecaptchaActivity", "Found hermetic configuration for identityToolkit URL: " + strZza);
        return strZza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final HttpURLConnection zza(URL url) {
        try {
            return (HttpURLConnection) zza.zza().zza(url, "client-firebase-auth-api");
        } catch (IOException unused) {
            zzaej.zza.c("Error generating connection", new Object[0]);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(String str, Status status) {
        if (status == null) {
            j();
        } else {
            i(status);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(Uri uri, String str, b<nd.b> bVar) {
        Task taskForResult;
        nd.b bVar2 = bVar.get();
        if (bVar2 != null) {
            Task taskA = bVar2.a();
            h0 h0Var = new h0();
            h0Var.f23378a = uri;
            taskForResult = taskA.continueWith(h0Var);
        } else {
            taskForResult = Tasks.forResult(uri);
        }
        f0 f0Var = new f0();
        f0Var.f23363a = this;
        f0Var.f23364b = str;
        taskForResult.addOnCompleteListener(f0Var);
    }
}
