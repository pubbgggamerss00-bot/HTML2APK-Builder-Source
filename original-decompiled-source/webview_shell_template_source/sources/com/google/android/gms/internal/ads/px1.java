package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class px1 {

    /* renamed from: b, reason: collision with root package name */
    public static final px1 f8174b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f8175a = new HashMap();

    static {
        ju1 ju1Var = new ju1(2);
        px1 px1Var = new px1();
        try {
            px1Var.b(ju1Var, ix1.class);
            f8174b = px1Var;
        } catch (GeneralSecurityException e6) {
            throw new IllegalStateException("unexpected error.", e6);
        }
    }

    public final ih1 a(lt1 lt1Var, Integer num) {
        ih1 ih1VarA;
        synchronized (this) {
            nx1 nx1Var = (nx1) this.f8175a.get(lt1Var.getClass());
            if (nx1Var == null) {
                throw new GeneralSecurityException("Cannot create a new key for parameters " + lt1Var.toString() + ": no key creator for this class was registered.");
            }
            ih1VarA = nx1Var.a(lt1Var, num);
        }
        return ih1VarA;
    }

    public final synchronized void b(nx1 nx1Var, Class cls) {
        try {
            nx1 nx1Var2 = (nx1) this.f8175a.get(cls);
            if (nx1Var2 != null && !nx1Var2.equals(nx1Var)) {
                throw new GeneralSecurityException("Different key creator for parameters class " + cls.toString() + " already inserted");
            }
            this.f8175a.put(cls, nx1Var);
        } catch (Throwable th) {
            throw th;
        }
    }
}
