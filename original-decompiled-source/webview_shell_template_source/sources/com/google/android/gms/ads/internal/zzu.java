package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.activity.m;
import androidx.camera.camera2.internal.v0;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbi;
import com.google.android.gms.ads.internal.client.zzbl;
import com.google.android.gms.ads.internal.client.zzbo;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.ads.internal.client.zzcc;
import com.google.android.gms.ads.internal.client.zzcm;
import com.google.android.gms.ads.internal.client.zzcq;
import com.google.android.gms.ads.internal.client.zzct;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzef;
import com.google.android.gms.ads.internal.client.zzga;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.client.zzy;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzad;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.internal.ads.a20;
import com.google.android.gms.internal.ads.c20;
import com.google.android.gms.internal.ads.f40;
import com.google.android.gms.internal.ads.fp;
import com.google.android.gms.internal.ads.i70;
import com.google.android.gms.internal.ads.kj;
import com.google.android.gms.internal.ads.mf;
import com.google.android.gms.internal.ads.nf;
import com.google.android.gms.internal.ads.to;
import java.util.TreeMap;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzu extends zzbx {
    private final VersionInfoParcel zza;
    private final zzs zzb;
    private final Future zzc = i70.f5586a.u(new c(this));
    private final Context zzd;
    private final e zze;
    private WebView zzf;
    private zzbl zzg;
    private mf zzh;
    private AsyncTask zzi;

    public zzu(Context context, zzs zzsVar, String str, VersionInfoParcel versionInfoParcel) {
        this.zzd = context;
        this.zza = versionInfoParcel;
        this.zzb = zzsVar;
        this.zzf = new WebView(context);
        this.zze = new e(context, str);
        zzV(0);
        this.zzf.setVerticalScrollBarEnabled(false);
        this.zzf.getSettings().setJavaScriptEnabled(true);
        this.zzf.setWebViewClient(new a(this));
        this.zzf.setOnTouchListener(new b(this));
    }

    public static /* bridge */ /* synthetic */ String zzo(zzu zzuVar, String str) {
        if (zzuVar.zzh == null) {
            return str;
        }
        Uri uriA = Uri.parse(str);
        try {
            uriA = zzuVar.zzh.a(uriA, zzuVar.zzd, null, null);
        } catch (nf e6) {
            zzo.zzk("Unable to process ad data", e6);
        }
        return uriA.toString();
    }

    public static /* bridge */ /* synthetic */ void zzw(zzu zzuVar, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        zzuVar.zzd.startActivity(intent);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzA() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzB() {
        l.d("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzC(zzbi zzbiVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzD(zzbl zzblVar) {
        this.zzg = zzblVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzE(zzcc zzccVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzF(zzs zzsVar) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzG(zzcm zzcmVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzH(kj kjVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzI(zzy zzyVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzK(zzef zzefVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzL(boolean z6) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzM(a20 a20Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzO(to toVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzQ(c20 c20Var, String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzR(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzS(f40 f40Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzT(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzU(zzga zzgaVar) {
        throw new IllegalStateException("Unused method");
    }

    public final void zzV(int i6) {
        if (this.zzf == null) {
            return;
        }
        this.zzf.setLayoutParams(new ViewGroup.LayoutParams(-1, i6));
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzX() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzY() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzZ() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzaa() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzab(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        l.g("This Search Ad has already been torn down", this.zzf);
        VersionInfoParcel versionInfoParcel = this.zza;
        e eVar = this.zze;
        TreeMap treeMap = eVar.f2325c;
        eVar.f2326d = zzmVar.zzj.zza;
        Bundle bundle = zzmVar.zzm;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 != null) {
            String str = (String) fp.f4746c.c();
            for (String str2 : bundle2.keySet()) {
                if (str.equals(str2)) {
                    eVar.f2327e = bundle2.getString(str2);
                } else if (str2.startsWith("csa_")) {
                    treeMap.put(str2.substring(4), bundle2.getString(str2));
                }
            }
            treeMap.put("SDKVersion", versionInfoParcel.afmaVersion);
            if (((Boolean) fp.f4744a.c()).booleanValue()) {
                Bundle bundleZzb = zzad.zzb(eVar.f2323a, (String) fp.f4745b.c());
                for (String str3 : bundleZzb.keySet()) {
                    treeMap.put(str3, bundleZzb.get(str3).toString());
                }
            }
        }
        this.zzi = new d(this).execute(new Void[0]);
        return true;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzac(zzcq zzcqVar) {
        throw new IllegalStateException("Unused method");
    }

    public final int zzb(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            zzbc.zzb();
            return com.google.android.gms.ads.internal.util.client.zzf.zzx(this.zzd, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final Bundle zzd() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzs zzg() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzbl zzi() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzcm zzj() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzdy zzk() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzeb zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final k3.a zzn() {
        l.d("getAdFrame must be called on the main UI thread.");
        return new k3.b(this.zzf);
    }

    public final String zzp() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) fp.f4747d.c());
        builder.appendQueryParameter("query", this.zze.f2326d);
        builder.appendQueryParameter("pubId", this.zze.f2324b);
        builder.appendQueryParameter("mappver", this.zze.f2328f);
        TreeMap treeMap = this.zze.f2325c;
        for (String str : treeMap.keySet()) {
            builder.appendQueryParameter(str, (String) treeMap.get(str));
        }
        Uri uriBuild = builder.build();
        mf mfVar = this.zzh;
        if (mfVar != null) {
            try {
                uriBuild = mf.d(uriBuild, mfVar.f7110b.zzf(this.zzd));
            } catch (nf e6) {
                zzo.zzk("Unable to process ad data", e6);
            }
        }
        return m.d(zzq(), "#", uriBuild.getEncodedQuery());
    }

    public final String zzq() {
        String str = this.zze.f2327e;
        if (true == TextUtils.isEmpty(str)) {
            str = "www.google.com";
        }
        return v0.b("https://", str, (String) fp.f4747d.c());
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final String zzr() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final String zzs() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final String zzt() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzx() {
        l.d("destroy must be called on the main UI thread.");
        this.zzi.cancel(true);
        this.zzc.cancel(false);
        this.zzf.destroy();
        this.zzf = null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzz() {
        l.d("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzJ(zzct zzctVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzN(boolean z6) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzP(zzdr zzdrVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzW(k3.a aVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzy(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbo zzboVar) {
    }
}
