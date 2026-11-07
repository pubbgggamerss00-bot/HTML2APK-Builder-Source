package de;

import android.content.Context;
import android.util.Log;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: c, reason: collision with root package name */
    public static r f7902c;

    /* renamed from: a, reason: collision with root package name */
    public Boolean f7903a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f7904b;

    public static synchronized r a() {
        try {
            if (f7902c == null) {
                r rVar = new r();
                rVar.f7903a = null;
                rVar.f7904b = null;
                f7902c = rVar;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f7902c;
    }

    public final boolean b(Context context) {
        if (this.f7904b == null) {
            this.f7904b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f7903a.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f7904b.booleanValue();
    }

    public final boolean c(Context context) {
        if (this.f7903a == null) {
            this.f7903a = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f7903a.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f7903a.booleanValue();
    }
}
