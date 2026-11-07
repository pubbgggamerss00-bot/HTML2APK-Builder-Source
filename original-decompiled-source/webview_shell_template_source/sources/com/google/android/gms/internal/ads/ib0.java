package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzn;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ib0 {
    public static final xa0 a(final Context context, final cc0 cc0Var, final String str, final boolean z6, final boolean z7, final mf mfVar, final cp cpVar, final VersionInfoParcel versionInfoParcel, final v31 v31Var, final zza zzaVar, final kk kkVar, final tb1 tb1Var, final vb1 vb1Var, final oz0 oz0Var, final fc1 fc1Var) {
        zn.a(context);
        try {
            em1 em1Var = new em1() { // from class: com.google.android.gms.internal.ads.fb0
                @Override // com.google.android.gms.internal.ads.em1
                /* renamed from: zza */
                public final Object mo7zza() {
                    cc0 cc0Var2 = cc0Var;
                    String str2 = str;
                    boolean z8 = z6;
                    kk kkVar2 = kkVar;
                    boolean z9 = z7;
                    mf mfVar2 = mfVar;
                    tb1 tb1Var2 = tb1Var;
                    cp cpVar2 = cpVar;
                    zzn zznVar = v31Var;
                    vb1 vb1Var2 = vb1Var;
                    Context context2 = context;
                    VersionInfoParcel versionInfoParcel2 = versionInfoParcel;
                    zza zzaVar2 = zzaVar;
                    fc1 fc1Var2 = fc1Var;
                    oz0 oz0Var2 = oz0Var;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i6 = mb0.f7041t0;
                        bc0 bc0Var = new bc0(context2);
                        bc0Var.setBaseContext(context2);
                        jb0 jb0Var = new jb0(new mb0(bc0Var, cc0Var2, str2, z8, mfVar2, cpVar2, versionInfoParcel2, zznVar, zzaVar2, kkVar2, tb1Var2, vb1Var2, fc1Var2));
                        jb0Var.setWebViewClient(zzv.zzr().zzc(jb0Var, kkVar2, z9, oz0Var2));
                        jb0Var.setWebChromeClient(new wa0(jb0Var));
                        return jb0Var;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                Object objMo7zza = em1Var.mo7zza();
                StrictMode.setThreadPolicy(threadPolicy);
                return (xa0) objMo7zza;
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th;
            }
        } catch (Throwable th2) {
            throw new hb0("Webview initialization failed.", th2);
        }
    }
}
