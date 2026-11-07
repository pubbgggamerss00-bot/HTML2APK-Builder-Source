package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xw1 {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f10732c = Logger.getLogger(xw1.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public static final xw1 f10733d = new xw1();

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f10734a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f10735b = new ConcurrentHashMap();

    public final synchronized void a(ct1 ct1Var) {
        b(ct1Var, 1);
    }

    public final synchronized void b(ct1 ct1Var, int i6) {
        if (!aa1.j(i6)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        d(ct1Var);
    }

    public final synchronized ct1 c(String str) {
        if (!this.f10734a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (ct1) this.f10734a.get(str);
    }

    public final synchronized void d(ct1 ct1Var) {
        try {
            String str = ((fx1) ct1Var).f4816a;
            if (this.f10735b.containsKey(str) && !((Boolean) this.f10735b.get(str)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
            }
            ct1 ct1Var2 = (ct1) this.f10734a.get(str);
            if (ct1Var2 != null && !ct1Var2.getClass().equals(ct1Var.getClass())) {
                f10732c.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + ct1Var2.getClass().getName() + ", cannot be re-registered with " + ct1Var.getClass().getName());
            }
            this.f10734a.putIfAbsent(str, ct1Var);
            this.f10735b.put(str, Boolean.TRUE);
        } catch (Throwable th) {
            throw th;
        }
    }
}
