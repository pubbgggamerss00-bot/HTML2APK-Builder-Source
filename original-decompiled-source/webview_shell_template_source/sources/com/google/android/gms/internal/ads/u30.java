package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.util.Locale;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class u30 {

    /* renamed from: a, reason: collision with root package name */
    public int f9439a;

    /* renamed from: b, reason: collision with root package name */
    public int f9440b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9441c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9442d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9443e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f9444f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f9445g;
    public final boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final String f9446i;

    /* renamed from: j, reason: collision with root package name */
    public final String f9447j;

    /* renamed from: k, reason: collision with root package name */
    public final float f9448k;

    /* renamed from: l, reason: collision with root package name */
    public final int f9449l;

    /* renamed from: m, reason: collision with root package name */
    public final int f9450m;

    /* renamed from: n, reason: collision with root package name */
    public final String f9451n;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u30(Context context) {
        ActivityInfo activityInfo;
        PackageInfo packageInfoB;
        String str;
        DisplayMetrics displayMetrics;
        PackageManager packageManager = context.getPackageManager();
        zn.a(context);
        c(context);
        e(context);
        d(context);
        Locale locale = Locale.getDefault();
        this.f9441c = b(packageManager, "geo:0,0?q=donuts") != null;
        this.f9442d = b(packageManager, "http://www.google.com") != null;
        this.f9443e = locale.getCountry();
        zzv.zzq();
        zzbc.zzb();
        this.f9444f = zzf.zzr();
        this.f9445g = i3.d.a(context);
        this.h = i3.d.c(context);
        this.f9446i = locale.getLanguage();
        ResolveInfo resolveInfoB = b(packageManager, "market://details?id=com.google.android.gms.ads");
        String str2 = null;
        if (resolveInfoB != null && (activityInfo = resolveInfoB.activityInfo) != null) {
            try {
                packageInfoB = j3.d.a(context).b(0, activityInfo.packageName);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (packageInfoB != null) {
                str = packageInfoB.versionCode + "." + activityInfo.packageName;
            } else {
                str = null;
            }
        }
        this.f9447j = str;
        try {
            PackageInfo packageInfoB2 = j3.d.a(context).b(128, "com.android.vending");
            if (packageInfoB2 != null) {
                str2 = packageInfoB2.versionCode + "." + packageInfoB2.packageName;
            }
        } catch (Exception unused2) {
        }
        this.f9451n = str2;
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return;
        }
        this.f9448k = displayMetrics.density;
        this.f9449l = displayMetrics.widthPixels;
        this.f9450m = displayMetrics.heightPixels;
    }

    public static ResolveInfo b(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            zzv.zzp().h("DeviceInfo.getResolveInfo", th);
            return null;
        }
    }

    public final v30 a() {
        return new v30(this.f9441c, this.f9442d, this.f9443e, this.f9444f, this.f9445g, this.h, this.f9446i, this.f9447j, this.f9451n, this.f9439a, this.f9440b, this.f9448k, this.f9449l, this.f9450m);
    }

    public final void c(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                audioManager.getMode();
                audioManager.isMusicActive();
                audioManager.isSpeakerphoneOn();
                audioManager.getStreamVolume(3);
                audioManager.getRingerMode();
                audioManager.getStreamVolume(2);
            } catch (Throwable th) {
                zzv.zzp().h("DeviceInfo.gatherAudioInfo", th);
            }
        }
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final void d(Context context) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent intentRegisterReceiver = (!((Boolean) zzbe.zzc().a(zn.Ra)).booleanValue() || Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
        if (intentRegisterReceiver != null) {
            intentRegisterReceiver.getIntExtra("status", -1);
            intentRegisterReceiver.getIntExtra("level", -1);
            intentRegisterReceiver.getIntExtra("scale", -1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Context context) {
        int networkType;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        telephonyManager.getNetworkOperator();
        if (i3.g.b()) {
            networkType = ((Boolean) zzbe.zzc().a(zn.y8)).booleanValue() ? 0 : telephonyManager.getNetworkType();
        }
        this.f9440b = networkType;
        telephonyManager.getPhoneType();
        this.f9439a = -2;
        zzv.zzq();
        if (zzs.zzB(context, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.f9439a = activeNetworkInfo.getType();
                activeNetworkInfo.getDetailedState().ordinal();
            } else {
                this.f9439a = -1;
            }
            connectivityManager.isActiveNetworkMetered();
        }
    }

    public u30(Context context, v30 v30Var) {
        zn.a(context);
        c(context);
        e(context);
        d(context);
        String str = Build.FINGERPRINT;
        String str2 = Build.DEVICE;
        xo.a(context);
        this.f9441c = v30Var.f9689a;
        this.f9442d = v30Var.f9690b;
        this.f9443e = v30Var.f9691c;
        this.f9444f = v30Var.f9692d;
        this.f9445g = v30Var.f9693e;
        this.h = v30Var.f9694f;
        this.f9446i = v30Var.f9695g;
        this.f9447j = v30Var.h;
        this.f9451n = v30Var.f9696i;
        this.f9448k = v30Var.f9699l;
        this.f9449l = v30Var.f9700m;
        this.f9450m = v30Var.f9701n;
    }
}
