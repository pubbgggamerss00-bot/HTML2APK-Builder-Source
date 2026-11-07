package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class x41 implements p81 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10356a;

    /* renamed from: b, reason: collision with root package name */
    public final zzs f10357b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f10358c;

    public x41(Context context, zzs zzsVar, ArrayList arrayList) {
        this.f10356a = context;
        this.f10357b = zzsVar;
        this.f10358c = arrayList;
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        ck0 ck0Var = (ck0) obj;
        if (((Boolean) up.f9592a.c()).booleanValue()) {
            Bundle bundle = new Bundle();
            zzv.zzq();
            String className = null;
            try {
                ActivityManager activityManager = (ActivityManager) this.f10356a.getSystemService("activity");
                if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null && runningTaskInfo.topActivity != null) {
                    className = runningTaskInfo.topActivity.getClassName();
                }
            } catch (Exception unused) {
            }
            bundle.putString("activity", className);
            Bundle bundle2 = new Bundle();
            zzs zzsVar = this.f10357b;
            bundle2.putInt("width", zzsVar.zze);
            bundle2.putInt("height", zzsVar.zzb);
            bundle.putBundle("size", bundle2);
            ArrayList arrayList = this.f10358c;
            if (!arrayList.isEmpty()) {
                bundle.putParcelableArray("parents", (Parcelable[]) arrayList.toArray(new Parcelable[arrayList.size()]));
            }
            ck0Var.f3610a.putBundle("view_hierarchy", bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* synthetic */ void zza(Object obj) {
    }
}
