package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import ce.h;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import id.e;
import java.net.URLConnection;
import java.util.concurrent.ExecutionException;
import kd.c;
import m3.a;
import nd.b;

/* loaded from: classes2.dex */
public final class zzaew {
    private Context zza;
    private zzafp zzb;
    private String zzc;
    private final e zzd;
    private boolean zze;
    private String zzf;

    public zzaew(Context context, e eVar, String str) {
        this.zze = false;
        p.f(context);
        this.zza = context;
        p.f(eVar);
        this.zzd = eVar;
        this.zzc = a.a("Android/Fallback/", str);
    }

    private static String zza(e eVar) {
        b bVar = FirebaseAuth.getInstance(eVar).f6842p.get();
        if (bVar == null) {
            return null;
        }
        try {
            c cVar = (c) Tasks.await(bVar.a());
            if (cVar.a() != null) {
                Log.w("LocalRequestInterceptor", "Error getting App Check token; using placeholder token instead. Error: ".concat(String.valueOf(cVar.a())));
            }
            return cVar.b();
        } catch (InterruptedException e10) {
            e = e10;
            Log.e("LocalRequestInterceptor", "Unexpected error getting App Check token: " + e.getMessage());
            return null;
        } catch (ExecutionException e11) {
            e = e11;
            Log.e("LocalRequestInterceptor", "Unexpected error getting App Check token: " + e.getMessage());
            return null;
        }
    }

    private static String zzb(e eVar) {
        h hVar = FirebaseAuth.getInstance(eVar).f6843q.get();
        if (hVar != null) {
            try {
                return (String) Tasks.await(hVar.a());
            } catch (InterruptedException | ExecutionException e10) {
                Log.w("LocalRequestInterceptor", "Unable to get heartbeats: " + e10.getMessage());
            }
        }
        return null;
    }

    public final void zzb(String str) {
        this.zzf = str;
    }

    public final void zza(URLConnection uRLConnection) {
        String strA;
        if (this.zze) {
            strA = k3.a.a(this.zzc, "/FirebaseUI-Android");
        } else {
            strA = k3.a.a(this.zzc, "/FirebaseCore-Android");
        }
        if (this.zzb == null) {
            this.zzb = new zzafp(this.zza);
        }
        uRLConnection.setRequestProperty("X-Android-Package", this.zzb.zzb());
        uRLConnection.setRequestProperty("X-Android-Cert", this.zzb.zza());
        uRLConnection.setRequestProperty("Accept-Language", zzaev.zza());
        uRLConnection.setRequestProperty("X-Client-Version", strA);
        uRLConnection.setRequestProperty("X-Firebase-Locale", this.zzf);
        e eVar = this.zzd;
        eVar.a();
        uRLConnection.setRequestProperty("X-Firebase-GMPID", eVar.f14482c.f14493b);
        uRLConnection.setRequestProperty("X-Firebase-Client", zzb(this.zzd));
        String strZza = zza(this.zzd);
        if (!TextUtils.isEmpty(strZza)) {
            uRLConnection.setRequestProperty("X-Firebase-AppCheck", strZza);
        }
        this.zzf = null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zzaew(e eVar, String str) {
        this(eVar.f14480a, eVar, str);
        eVar.a();
    }

    public final void zza(String str) {
        this.zze = !TextUtils.isEmpty(str);
    }
}
