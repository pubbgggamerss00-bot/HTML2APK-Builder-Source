package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ux1 {

    /* renamed from: b, reason: collision with root package name */
    public static final ux1 f9659b = new ux1();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f9660a = new HashMap();

    public final synchronized void a(String str, lt1 lt1Var) {
        try {
            if (!this.f9660a.containsKey(str)) {
                this.f9660a.put(str, lt1Var);
                return;
            }
            if (((lt1) this.f9660a.get(str)).equals(lt1Var)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + String.valueOf(this.f9660a.get(str)) + "), cannot insert " + String.valueOf(lt1Var));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            a((String) entry.getKey(), (lt1) entry.getValue());
        }
    }
}
