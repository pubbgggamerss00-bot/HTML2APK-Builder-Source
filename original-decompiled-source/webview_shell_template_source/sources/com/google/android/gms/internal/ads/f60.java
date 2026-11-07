package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f60 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4502a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4503b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final Context f4504c;

    /* renamed from: d, reason: collision with root package name */
    public final r0 f4505d;

    public f60(Context context, r0 r0Var) {
        this.f4504c = context;
        this.f4505d = r0Var;
    }

    public final synchronized void a(String str) {
        try {
            if (this.f4502a.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.f4504c) : this.f4504c.getSharedPreferences(str, 0);
            e60 e60Var = new e60(this, str);
            this.f4502a.put(str, e60Var);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(e60Var);
        } catch (Throwable th) {
            throw th;
        }
    }
}
