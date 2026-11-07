package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.android.gms.common.internal.p;
import com.google.firebase.auth.FirebaseAuth;
import id.e;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import rd.n;
import sa.a;

/* loaded from: classes2.dex */
public final class zzaeh extends AsyncTask<Void, Void, zzaek> {
    private static final a zza = new a("FirebaseAuth", "GetAuthDomainTask");
    private final String zzb;
    private final String zzc;
    private final WeakReference<zzaej> zzd;
    private final Uri.Builder zze;
    private final String zzf;
    private final e zzg;

    public zzaeh(String str, String str2, Intent intent, e eVar, zzaej zzaejVar) {
        p.d(str);
        this.zzb = str;
        p.f(eVar);
        this.zzg = eVar;
        p.d(str2);
        p.f(intent);
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        p.d(stringExtra);
        Uri.Builder builderBuildUpon = Uri.parse(zzaejVar.zza(stringExtra)).buildUpon();
        Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendPath("getProjectConfig").appendQueryParameter("key", stringExtra).appendQueryParameter("androidPackageName", str);
        p.f(str2);
        builderAppendQueryParameter.appendQueryParameter("sha1Cert", str2);
        this.zzc = builderBuildUpon.build().toString();
        this.zzd = new WeakReference<>(zzaejVar);
        this.zze = zzaejVar.zza(intent, str, str2);
        this.zzf = intent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzaek doInBackground(Void... voidArr) throws IOException {
        try {
            URL url = new URL(this.zzc);
            zzaej zzaejVar = this.zzd.get();
            HttpURLConnection httpURLConnectionZza = zzaejVar.zza(url);
            httpURLConnectionZza.addRequestProperty("Content-Type", "application/json; charset=UTF-8");
            httpURLConnectionZza.setConnectTimeout(60000);
            new zzaew(zzaejVar.zza(), this.zzg, zzaeu.zza().zzb()).zza(httpURLConnectionZza);
            int responseCode = httpURLConnectionZza.getResponseCode();
            if (responseCode != 200) {
                String strZza = zza(httpURLConnectionZza);
                zza.c("Error getting project config. Failed with " + strZza + " " + responseCode, new Object[0]);
                return zzaek.zzb(strZza);
            }
            zzahi zzahiVar = new zzahi();
            zzahiVar.zza(new String(zza(httpURLConnectionZza.getInputStream(), 128)));
            if (!TextUtils.isEmpty(this.zzf)) {
                return !zzahiVar.zza().contains(this.zzf) ? zzaek.zzb("UNAUTHORIZED_DOMAIN") : zzaek.zza(this.zzf);
            }
            for (String str : zzahiVar.zza()) {
                if (zza(str)) {
                    return zzaek.zza(str);
                }
            }
            return null;
        } catch (zzaci e10) {
            zza.c(m3.a.a("ConversionException encountered: ", e10.getMessage()), new Object[0]);
            return null;
        } catch (IOException e11) {
            zza.c(m3.a.a("IOException occurred: ", e11.getMessage()), new Object[0]);
            return null;
        } catch (NullPointerException e12) {
            zza.c(m3.a.a("Null pointer encountered: ", e12.getMessage()), new Object[0]);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onCancelled(zzaek zzaekVar) {
        onPostExecute((zzaek) null);
    }

    private static String zza(HttpURLConnection httpURLConnection) throws zzaci {
        try {
            if (httpURLConnection.getResponseCode() < 400) {
                return null;
            }
            InputStream errorStream = httpURLConnection.getErrorStream();
            if (errorStream == null) {
                return "WEB_INTERNAL_ERROR:Could not retrieve the authDomain for this project but did not receive an error response from the network request. Please try again.";
            }
            return (String) zzaep.zza(new String(zza(errorStream, 128)), String.class);
        } catch (IOException e10) {
            zza.f("Error parsing error message from response body in getErrorMessageFromBody. ".concat(String.valueOf(e10)), new Object[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final void onPostExecute(zzaek zzaekVar) {
        String strZza;
        String strZzb;
        Uri.Builder builder;
        zzaej zzaejVar = this.zzd.get();
        if (zzaekVar != null) {
            strZza = zzaekVar.zza();
            strZzb = zzaekVar.zzb();
        } else {
            strZza = null;
            strZzb = null;
        }
        if (zzaejVar == null) {
            zza.c("An error has occurred: the handler reference has returned null.", new Object[0]);
        } else if (!TextUtils.isEmpty(strZza) && (builder = this.zze) != null) {
            builder.authority(strZza);
            zzaejVar.zza(this.zze.build(), this.zzb, FirebaseAuth.getInstance(this.zzg).f6842p);
        } else {
            zzaejVar.zza(this.zzb, n.a(strZzb));
        }
    }

    private static boolean zza(String str) {
        try {
            String host = new URI("https://" + str).getHost();
            if (host != null) {
                if (host.endsWith("firebaseapp.com")) {
                    return true;
                }
                if (host.endsWith("web.app")) {
                    return true;
                }
            }
        } catch (URISyntaxException e10) {
            zza.c(b6.a.b("Error parsing URL for auth domain check: ", str, ". ", e10.getMessage()), new Object[0]);
        }
        return false;
    }

    private static byte[] zza(InputStream inputStream, int i10) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[128];
            while (true) {
                int i11 = inputStream.read(bArr);
                if (i11 != -1) {
                    byteArrayOutputStream.write(bArr, 0, i11);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
            }
        } catch (Throwable th2) {
            byteArrayOutputStream.close();
            throw th2;
        }
    }
}
