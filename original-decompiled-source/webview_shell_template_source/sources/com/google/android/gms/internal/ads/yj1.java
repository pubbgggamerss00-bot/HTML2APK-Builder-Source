package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.IOException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class yj1 {

    /* renamed from: c, reason: collision with root package name */
    public static yj1 f11008c;

    /* renamed from: a, reason: collision with root package name */
    public final String f11009a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f11010b;

    public yj1(Context context) {
        this.f11009a = context.getPackageName();
        this.f11010b = context.getSharedPreferences("paid_storage_sp", 0);
    }

    public final void a(String str, Object obj) throws IOException {
        boolean zCommit;
        boolean z6 = obj instanceof String;
        String str2 = this.f11009a;
        SharedPreferences sharedPreferences = this.f11010b;
        if (z6) {
            zCommit = sharedPreferences.edit().putString(str, (String) obj).commit();
        } else if (obj instanceof Long) {
            zCommit = sharedPreferences.edit().putLong(str, ((Long) obj).longValue()).commit();
        } else if (obj instanceof Boolean) {
            zCommit = sharedPreferences.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
        } else {
            if (!(obj instanceof Integer)) {
                Log.e("GpidLifecycleSPHandler", "Unexpected object class " + String.valueOf(obj.getClass()) + " for app " + str2);
                throw new IOException("Failed to store " + str + " for app " + str2);
            }
            zCommit = sharedPreferences.edit().putInt(str, ((Integer) obj).intValue()).commit();
        }
        if (zCommit) {
            return;
        }
        throw new IOException("Failed to store " + str + " for app " + str2);
    }

    public final void b(String str) throws IOException {
        if (this.f11010b.edit().remove(str).commit()) {
            return;
        }
        throw new IOException("Failed to remove " + str + " for app " + this.f11009a);
    }
}
