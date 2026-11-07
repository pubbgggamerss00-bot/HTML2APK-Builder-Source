package com.google.android.gms.ads.internal.util.client;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzs {
    public static Context zza(Context context) {
        return zzc(context).f2520a;
    }

    public static Object zzb(Context context, String str, zzq zzqVar) throws zzr {
        try {
            return zzqVar.zza(zzc(context).b(str));
        } catch (Exception e6) {
            throw new zzr(e6);
        }
    }

    private static DynamiteModule zzc(Context context) throws zzr {
        try {
            return DynamiteModule.c(context, DynamiteModule.f2509b, ModuleDescriptor.MODULE_ID);
        } catch (Exception e6) {
            throw new zzr(e6);
        }
    }
}
