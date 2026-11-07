package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class rx1 {

    /* renamed from: b, reason: collision with root package name */
    public static final rx1 f8732b = new rx1();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f8733a = new HashMap();

    public final synchronized void a(qx1 qx1Var, Class cls) {
        try {
            qx1 qx1Var2 = (qx1) this.f8733a.get(cls);
            if (qx1Var2 != null && !qx1Var2.equals(qx1Var)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            this.f8733a.put(cls, qx1Var);
        } catch (Throwable th) {
            throw th;
        }
    }
}
