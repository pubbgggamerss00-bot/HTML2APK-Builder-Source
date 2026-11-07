package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.StrictMode;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xn implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: g, reason: collision with root package name */
    public Context f10636g;

    /* renamed from: a, reason: collision with root package name */
    public final Object f10630a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ConditionVariable f10631b = new ConditionVariable();

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f10632c = false;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f10633d = false;

    /* renamed from: e, reason: collision with root package name */
    public SharedPreferences f10634e = null;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f10635f = new Bundle();
    public JSONObject h = new JSONObject();

    /* renamed from: i, reason: collision with root package name */
    public boolean f10637i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f10638j = false;

    public final Object a(tn tnVar) {
        if (!this.f10631b.block(5000L)) {
            synchronized (this.f10630a) {
                try {
                    if (!this.f10633d) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } finally {
                }
            }
        }
        if (!this.f10632c || this.f10634e == null || this.f10638j) {
            synchronized (this.f10630a) {
                if (this.f10632c && this.f10634e != null && !this.f10638j) {
                }
                return tnVar.h();
            }
        }
        int i6 = tnVar.f9348a;
        if (i6 == 2) {
            Bundle bundle = this.f10635f;
            return bundle == null ? tnVar.h() : tnVar.b(bundle);
        }
        if (i6 == 1 && this.h.has(tnVar.f9349b)) {
            return tnVar.a(this.h);
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return tnVar.c(this.f10634e);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final Object b(tn tnVar) {
        return (this.f10632c || this.f10633d) ? a(tnVar) : tnVar.h();
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (!"flag_configuration".equals(str) || sharedPreferences == null) {
            return;
        }
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                String string = sharedPreferences.getString("flag_configuration", "{}");
                StrictMode.setThreadPolicy(threadPolicy);
                this.h = new JSONObject(string);
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th;
            }
        } catch (JSONException unused) {
        }
    }
}
