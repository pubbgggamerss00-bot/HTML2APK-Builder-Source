package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StatFs;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class i90 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5615a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5616b;

    public /* synthetic */ i90(int i6, Object obj) {
        this.f5615a = i6;
        this.f5616b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0247, code lost:
    
        if (r0.contains("banner") == false) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a8  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        long j6;
        JSONObject jSONObject;
        ActivityInfo activityInfo;
        PackageInfo packageInfoB;
        String str;
        int i6;
        boolean zEquals;
        boolean z6;
        String str2;
        String string;
        PackageInfo packageInfoB2;
        switch (this.f5615a) {
            case 0:
                j90 j90Var = (j90) this.f5616b;
                return Boolean.valueOf(j90Var.f5984b.r(j90Var.f5985c, j90Var.f5986d, j90Var));
            case 1:
                da0 da0Var = (da0) this.f5616b;
                da0Var.getClass();
                tj tjVarZzc = zzv.zzc();
                xj xjVar = da0Var.f3813m;
                synchronized (tjVarZzc.f9301c) {
                    try {
                        j6 = -2;
                        if (tjVarZzc.f9304f != null) {
                            if (tjVarZzc.f9302d.d()) {
                                try {
                                    zj zjVar = tjVarZzc.f9304f;
                                    Parcel parcelZza = zjVar.zza();
                                    th.c(parcelZza, xjVar);
                                    Parcel parcelZzcZ = zjVar.zzcZ(3, parcelZza);
                                    long j7 = parcelZzcZ.readLong();
                                    parcelZzcZ.recycle();
                                    j6 = j7;
                                } catch (RemoteException e6) {
                                    zzo.zzh("Unable to call into cache service.", e6);
                                }
                            }
                        }
                    } finally {
                    }
                }
                return Long.valueOf(j6);
            case 2:
                r61 r61Var = (r61) this.f5616b;
                nt0 nt0Var = r61Var.f8556b;
                String str3 = r61Var.f8558d.f4211f;
                String str4 = r61Var.f8557c;
                nt0Var.getClass();
                if (((Boolean) zzbe.zzc().a(zn.f11378d4)).booleanValue() && str3 != null && str4 != null) {
                    if (!nt0Var.f7507d) {
                        nt0Var.a();
                        if (((Boolean) zzbe.zzc().a(zn.f11386e4)).booleanValue() && !nt0Var.f7509f.getAndSet(true)) {
                            zzv.zzp().d().zzo(new b(14, nt0Var));
                        }
                    }
                    Map map = (Map) nt0Var.f7504a.get(str4);
                    if (map == null) {
                        jSONObject = null;
                    } else {
                        jSONObject = (JSONObject) map.get(str3);
                        if (jSONObject == null) {
                            String strK = ed0.k(nt0Var.f7508e, str3, str4);
                            if (strK != null) {
                                jSONObject = (JSONObject) map.get(strK);
                            }
                        }
                    }
                }
                return new s61(jSONObject, ((Boolean) zzbe.zzc().a(zn.f11393f4)).booleanValue() ? nt0Var.f7505b : null);
            case 3:
                r71 r71Var = (r71) this.f5616b;
                if (((Boolean) zzbe.zzc().a(zn.f11371c5)).booleanValue()) {
                    if (!((Boolean) zzbe.zzc().a(zn.n5)).booleanValue()) {
                        Set set = r71Var.f8571b;
                        if (!set.contains("rewarded")) {
                            if (!set.contains("interstitial")) {
                                if (!set.contains("native")) {
                                    break;
                                }
                            }
                        }
                    }
                    if (!((Boolean) zzbe.zzc().a(zn.f11452o5)).booleanValue()) {
                        return new g71(1, ((sz0) zzv.zzB()).c());
                    }
                    if (r71.f8569c == null) {
                        r71.f8569c = ((sz0) zzv.zzB()).c();
                    }
                    return new g71(1, r71.f8569c);
                }
                return new g71(1, null);
            case 4:
                k81 k81Var = (k81) this.f5616b;
                Context context = k81Var.f6282b;
                boolean zC = j3.d.a(context).c();
                zzv.zzq();
                boolean zZzF = zzs.zzF(context);
                String str5 = k81Var.f6283c.afmaVersion;
                zzv.zzq();
                boolean zZzG = zzs.zzG();
                zzv.zzq();
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                return new l81(zC, zZzF, str5, zZzG, applicationInfo == null ? 0 : applicationInfo.targetSdkVersion, DynamiteModule.d(context, ModuleDescriptor.MODULE_ID, false), DynamiteModule.a(context, ModuleDescriptor.MODULE_ID), k81Var.f6284d);
            case 5:
                Context context2 = ((y81) this.f5616b).f10893b;
                PackageManager packageManager = context2.getPackageManager();
                Locale locale = Locale.getDefault();
                ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=donuts")), 65536);
                ResolveInfo resolveInfoResolveActivity2 = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.google.com")), 65536);
                String country = locale.getCountry();
                zzv.zzq();
                zzbc.zzb();
                boolean zZzr = zzf.zzr();
                boolean zA = i3.d.a(context2);
                boolean zC2 = i3.d.c(context2);
                String language = locale.getLanguage();
                ArrayList arrayList = new ArrayList();
                LocaleList localeList = LocaleList.getDefault();
                for (int i7 = 0; i7 < localeList.size(); i7++) {
                    arrayList.add(localeList.get(i7).getLanguage());
                }
                ResolveInfo resolveInfoResolveActivity3 = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.android.gms.ads")), 65536);
                if (resolveInfoResolveActivity3 != null && (activityInfo = resolveInfoResolveActivity3.activityInfo) != null) {
                    try {
                        packageInfoB = j3.d.a(context2).b(0, activityInfo.packageName);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    str = packageInfoB != null ? packageInfoB.versionCode + "." + activityInfo.packageName : null;
                }
                try {
                    packageInfoB2 = j3.d.a(context2).b(128, "com.android.vending");
                } catch (Exception unused2) {
                }
                String str6 = packageInfoB2 != null ? packageInfoB2.versionCode + "." + packageInfoB2.packageName : null;
                String str7 = Build.FINGERPRINT;
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                ResolveInfo resolveInfoResolveActivity4 = packageManager.resolveActivity(intent, 0);
                List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
                if (listQueryIntentActivities == null || resolveInfoResolveActivity4 == null) {
                    i6 = 128;
                    zEquals = false;
                } else {
                    for (int i8 = 0; i8 < listQueryIntentActivities.size(); i8++) {
                        if (resolveInfoResolveActivity4.activityInfo.name.equals(listQueryIntentActivities.get(i8).activityInfo.name)) {
                            zEquals = resolveInfoResolveActivity4.activityInfo.packageName.equals(rj1.e(context2));
                            i6 = 128;
                        }
                    }
                    i6 = 128;
                    zEquals = false;
                }
                zzv.zzq();
                long availableBytes = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                if (((Boolean) zzbe.zzc().a(zn.jb)).booleanValue()) {
                    zzv.zzq();
                    z6 = zzs.zzC(context2);
                }
                if (((Boolean) zzbe.zzc().a(zn.nb)).booleanValue()) {
                    try {
                        Bundle bundle = j3.d.a(context2).a(i6, context2.getPackageName()).metaData;
                        if (bundle != null && bundle.containsKey("com.google.unity.ads.UNITY_VERSION")) {
                            string = bundle.getString("com.google.unity.ads.UNITY_VERSION");
                        }
                    } catch (PackageManager.NameNotFoundException unused3) {
                    }
                    str2 = null;
                    boolean z7 = resolveInfoResolveActivity2 == null;
                    boolean z8 = resolveInfoResolveActivity == null;
                    String str8 = Build.MODEL;
                    return new x81(z8, z7, country, zZzr, zA, zC2, language, arrayList, str, str6, zEquals, availableBytes, z6, str2, Build.VERSION.SDK_INT);
                }
                string = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                str2 = string;
                if (resolveInfoResolveActivity2 == null) {
                }
                if (resolveInfoResolveActivity == null) {
                }
                String str82 = Build.MODEL;
                return new x81(z8, z7, country, zZzr, zA, zC2, language, arrayList, str, str6, zEquals, availableBytes, z6, str2, Build.VERSION.SDK_INT);
            default:
                return new g71(2, ((o91) this.f5616b).f7656b);
        }
    }
}
