package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class v71 implements q81 {

    /* renamed from: a, reason: collision with root package name */
    public final ApplicationInfo f9745a;

    /* renamed from: b, reason: collision with root package name */
    public final PackageInfo f9746b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f9747c;

    public v71(ApplicationInfo applicationInfo, PackageInfo packageInfo, Context context) {
        this.f9745a = applicationInfo;
        this.f9746b = packageInfo;
        this.f9747c = context;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final int zza() {
        return 29;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    @Override // com.google.android.gms.internal.ads.q81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c5.a zzb() throws PackageManager.NameNotFoundException {
        String strValueOf;
        String str;
        String str2;
        String installingPackageName;
        InstallSourceInfo installSourceInfo;
        String initiatingPackageName;
        Context context = this.f9747c;
        String str3 = this.f9745a.packageName;
        String str4 = null;
        PackageInfo packageInfo = this.f9746b;
        Integer numValueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        String str5 = packageInfo == null ? null : packageInfo.versionName;
        try {
            uj1 uj1Var = zzs.zza;
            Context context2 = j3.d.a(context).f13494a;
            strValueOf = String.valueOf(context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(str3, 0)));
        } catch (PackageManager.NameNotFoundException unused) {
            strValueOf = null;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (((Boolean) zzbe.zzc().a(zn.Dc)).booleanValue()) {
                try {
                    installSourceInfo = context.getPackageManager().getInstallSourceInfo(str3);
                } catch (PackageManager.NameNotFoundException e6) {
                    e = e6;
                    installingPackageName = null;
                }
                if (installSourceInfo != null) {
                    installingPackageName = installSourceInfo.getInstallingPackageName();
                    try {
                        if (TextUtils.isEmpty(installingPackageName)) {
                            zze.zza("No installing package name found");
                            installingPackageName = null;
                        }
                        initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                    } catch (PackageManager.NameNotFoundException e7) {
                        e = e7;
                    }
                    try {
                    } catch (PackageManager.NameNotFoundException e8) {
                        e = e8;
                        str4 = initiatingPackageName;
                        zzv.zzp().h("PackageInfoSignalSource.getInstallSourceInfo", e);
                        str2 = str4;
                        str = installingPackageName;
                        return bs1.m(new w71(str3, numValueOf, str5, strValueOf, str, str2));
                    }
                    if (TextUtils.isEmpty(initiatingPackageName)) {
                        zze.zza("No initiating package name found");
                        str2 = str4;
                        str = installingPackageName;
                    } else {
                        str2 = initiatingPackageName;
                        str = installingPackageName;
                    }
                }
                str = null;
                str2 = null;
            } else {
                str = null;
                str2 = null;
            }
        }
        return bs1.m(new w71(str3, numValueOf, str5, strValueOf, str, str2));
    }
}
