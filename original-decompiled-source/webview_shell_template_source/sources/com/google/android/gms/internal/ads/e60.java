package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e60 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final String f4132a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f60 f4133b;

    public e60(f60 f60Var, String str) {
        this.f4133b = f60Var;
        this.f4132a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f4133b) {
            try {
                ArrayList arrayList = this.f4133b.f4503b;
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    d60 d60Var = (d60) obj;
                    String str2 = this.f4132a;
                    f60 f60Var = d60Var.f3770a;
                    Map map = d60Var.f3771b;
                    f60Var.getClass();
                    if (map.containsKey(str2) && ((Set) map.get(str2)).contains(str)) {
                        r0 r0Var = f60Var.f4505d;
                        ((u50) r0Var.f8494t).a(-1, ((i3.a) r0Var.s).a());
                    }
                }
            } finally {
            }
        }
    }
}
