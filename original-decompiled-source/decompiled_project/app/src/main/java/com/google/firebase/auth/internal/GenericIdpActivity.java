package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import c5.n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.internal.p002firebaseauthapi.zza;
import com.google.android.gms.internal.p002firebaseauthapi.zzaeh;
import com.google.android.gms.internal.p002firebaseauthapi.zzaej;
import com.google.android.gms.internal.p002firebaseauthapi.zzaem;
import com.google.android.gms.internal.p002firebaseauthapi.zzaga;
import com.google.android.gms.internal.p002firebaseauthapi.zzagd;
import com.google.android.gms.internal.p002firebaseauthapi.zzait;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import o5.a;
import org.json.JSONException;
import org.json.JSONObject;
import rd.d0;
import rd.t0;
import rd.v0;
import rd.x;
import rd.x0;
import rd.y;
import rd.y0;
import rd.z0;
import wa.c;

/* loaded from: classes2.dex */
public class GenericIdpActivity extends n implements zzaej {

    /* renamed from: g, reason: collision with root package name */
    public static long f6866g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f6867h = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6868f = false;

    static {
        v0 v0Var = v0.f23431b;
    }

    public final Uri.Builder h(Uri.Builder builder, Intent intent, String str, String str2) throws JSONException {
        String string;
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.KEY_PROVIDER_ID");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.KEY_TENANT_ID");
        String stringExtra4 = intent.getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME");
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("com.google.firebase.auth.KEY_PROVIDER_SCOPES");
        String strJoin = (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) ? null : TextUtils.join(",", stringArrayListExtra);
        Bundle bundleExtra = intent.getBundleExtra("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS");
        if (bundleExtra == null) {
            string = null;
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                for (String str3 : bundleExtra.keySet()) {
                    String string2 = bundleExtra.getString(str3);
                    if (!TextUtils.isEmpty(string2)) {
                        jSONObject.put(str3, string2);
                    }
                }
            } catch (JSONException unused) {
                Log.e("GenericIdpActivity", "Unexpected JSON exception when serializing developer specified custom params");
            }
            string = jSONObject.toString();
        }
        String string3 = UUID.randomUUID().toString();
        String strZza = zzaem.zza(this, UUID.randomUUID().toString());
        String action = intent.getAction();
        String stringExtra5 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        x0 x0Var = x0.f23435a;
        Context applicationContext = getApplicationContext();
        String str4 = string;
        String str5 = strJoin;
        synchronized (x0Var) {
            p.d(str);
            p.d(string3);
            p.d(strZza);
            p.d(stringExtra4);
            SharedPreferences sharedPreferencesA = x0.a(applicationContext, str);
            x0.b(sharedPreferencesA);
            SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
            editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + string3 + ".SESSION_ID", strZza);
            editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + string3 + ".OPERATION", action);
            editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + string3 + ".PROVIDER_ID", stringExtra2);
            editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + string3 + ".FIREBASE_APP_NAME", stringExtra4);
            editorEdit.putString("com.google.firebase.auth.api.gms.config.tenant.id", stringExtra3);
            editorEdit.apply();
        }
        String strA = y0.c(getApplicationContext(), e.e(stringExtra4).f()).a();
        if (TextUtils.isEmpty(strA)) {
            Log.e("GenericIdpActivity", "Could not generate an encryption key for Generic IDP - cancelling flow.");
            i(rd.n.a("Failed to generate/retrieve public encryption key for Generic IDP flow."));
            return null;
        }
        if (strZza == null) {
            return null;
        }
        builder.appendQueryParameter("eid", "p").appendQueryParameter("v", "X" + stringExtra5).appendQueryParameter("authType", "signInWithRedirect").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("providerId", stringExtra2).appendQueryParameter("sessionId", strZza).appendQueryParameter("eventId", string3).appendQueryParameter("apn", str).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", strA);
        if (!TextUtils.isEmpty(str5)) {
            builder.appendQueryParameter("scopes", str5);
        }
        if (!TextUtils.isEmpty(str4)) {
            builder.appendQueryParameter("customParameters", str4);
        }
        if (!TextUtils.isEmpty(stringExtra3)) {
            builder.appendQueryParameter("tid", stringExtra3);
        }
        return builder;
    }

    public final void i(Status status) {
        f6866g = 0L;
        this.f6868f = false;
        Intent intent = new Intent();
        HashMap map = t0.f23429a;
        Parcel parcelObtain = Parcel.obtain();
        status.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        intent.putExtra("com.google.firebase.auth.internal.STATUS", bArrMarshall);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        a.a(this).b(intent);
        d0.a(getApplicationContext(), status);
        finish();
    }

    public final void j() {
        f6866g = 0L;
        this.f6868f = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        a.a(this).b(intent);
        d0.a(this, rd.n.a("WEB_CONTEXT_CANCELED"));
        finish();
    }

    @Override // c5.n, b.k, o3.d, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e("GenericIdpActivity", "Could not do operation - unknown action: " + action);
            j();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - f6866g < 30000) {
            Log.e("GenericIdpActivity", "Could not start operation - already in progress");
            return;
        }
        f6866g = jCurrentTimeMillis;
        if (bundle != null) {
            this.f6868f = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
        }
    }

    @Override // b.k, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // c5.n, android.app.Activity
    public final void onResume() {
        z0 z0Var;
        super.onResume();
        if (!"android.intent.action.VIEW".equals(getIntent().getAction())) {
            if (this.f6868f) {
                j();
                return;
            }
            String packageName = getPackageName();
            try {
                String lowerCase = c.a(wa.a.a(this, packageName)).toLowerCase(Locale.US);
                e eVarE = e.e(getIntent().getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME"));
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(eVarE);
                if (zzagd.zza(eVarE)) {
                    eVarE.a();
                    zza(h(Uri.parse(zzagd.zza(eVarE.f14482c.f14492a)).buildUpon(), getIntent(), packageName, lowerCase).build(), packageName, firebaseAuth.f6842p);
                } else {
                    new zzaeh(packageName, lowerCase, getIntent(), eVarE, this).executeOnExecutor(firebaseAuth.f6845s, new Void[0]);
                }
            } catch (PackageManager.NameNotFoundException e10) {
                Log.e("GenericIdpActivity", "Could not get package signature: " + packageName + " " + String.valueOf(e10));
                zzaem.zzb(this, packageName);
            }
            this.f6868f = true;
            return;
        }
        Intent intent = getIntent();
        if (intent.hasExtra("firebaseError")) {
            i(t0.a(intent.getStringExtra("firebaseError")));
            return;
        }
        if (!intent.hasExtra("link") || !intent.hasExtra("eventId")) {
            j();
            return;
        }
        String stringExtra = intent.getStringExtra("link");
        String stringExtra2 = intent.getStringExtra("eventId");
        String packageName2 = getPackageName();
        boolean booleanExtra = intent.getBooleanExtra("encryptionEnabled", true);
        synchronized (x0.f23435a) {
            p.d(packageName2);
            p.d(stringExtra2);
            SharedPreferences sharedPreferencesA = x0.a(this, packageName2);
            String str = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".SESSION_ID";
            String str2 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".OPERATION";
            String str3 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".PROVIDER_ID";
            String str4 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".FIREBASE_APP_NAME";
            String string = sharedPreferencesA.getString(str, null);
            String string2 = sharedPreferencesA.getString(str2, null);
            String string3 = sharedPreferencesA.getString(str3, null);
            String string4 = sharedPreferencesA.getString("com.google.firebase.auth.api.gms.config.tenant.id", null);
            String string5 = sharedPreferencesA.getString(str4, null);
            SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
            editorEdit.remove(str);
            editorEdit.remove(str2);
            editorEdit.remove(str3);
            editorEdit.remove(str4);
            editorEdit.apply();
            z0Var = (string == null || string2 == null || string3 == null) ? null : new z0(string, string2, string3, string4, string5);
        }
        if (z0Var == null) {
            j();
        }
        if (booleanExtra) {
            stringExtra = y0.c(getApplicationContext(), e.e(z0Var.f23446e).f()).b(stringExtra);
        }
        zzait zzaitVar = new zzait(z0Var, stringExtra);
        String str5 = z0Var.f23445d;
        String str6 = z0Var.f23443b;
        zzaitVar.zzb(str5);
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(str6) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(str6) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(str6)) {
            Log.e("GenericIdpActivity", "unsupported operation: ".concat(str6));
            j();
            return;
        }
        f6866g = 0L;
        this.f6868f = false;
        Intent intent2 = new Intent();
        Parcel parcelObtain = Parcel.obtain();
        zzaitVar.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        intent2.putExtra("com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", bArrMarshall);
        intent2.putExtra("com.google.firebase.auth.internal.OPERATION", str6);
        intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        a.a(this).b(intent2);
        Context applicationContext = getApplicationContext();
        zzaj<String> zzajVar = d0.f23358a;
        SharedPreferences.Editor editorEdit2 = applicationContext.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        Parcel parcelObtain2 = Parcel.obtain();
        zzaitVar.writeToParcel(parcelObtain2, 0);
        byte[] bArrMarshall2 = parcelObtain2.marshall();
        parcelObtain2.recycle();
        editorEdit2.putString("verifyAssertionRequest", bArrMarshall2 != null ? Base64.encodeToString(bArrMarshall2, 10) : null);
        editorEdit2.putString("operation", str6);
        editorEdit2.putString("tenantId", str5);
        editorEdit2.putLong("timestamp", System.currentTimeMillis());
        editorEdit2.commit();
        finish();
    }

    @Override // b.k, o3.d, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.f6868f);
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
        Log.e("GenericIdpActivity", "Found hermetic configuration for identityToolkit URL: " + strZza);
        return strZza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final HttpURLConnection zza(URL url) {
        try {
            return (HttpURLConnection) zza.zza().zza(url, "client-firebase-auth-api");
        } catch (IOException unused) {
            Log.e("GenericIdpActivity", "Error generating URL connection");
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
            x xVar = new x();
            xVar.f23434a = uri;
            taskForResult = taskA.continueWith(xVar);
        } else {
            taskForResult = Tasks.forResult(uri);
        }
        y yVar = new y();
        yVar.f23436a = this;
        yVar.f23437b = str;
        taskForResult.addOnCompleteListener(yVar);
    }
}
