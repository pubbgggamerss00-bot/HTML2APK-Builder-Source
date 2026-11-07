package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ot1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f7861a = 0;

    static {
        Logger.getLogger(ot1.class.getName());
        new ConcurrentHashMap();
        HashSet hashSet = new HashSet();
        hashSet.add(ys1.class);
        hashSet.add(zs1.class);
        hashSet.add(pt1.class);
        hashSet.add(bt1.class);
        hashSet.add(at1.class);
        hashSet.add(kt1.class);
        hashSet.add(e02.class);
        hashSet.add(mt1.class);
        hashSet.add(nt1.class);
        Collections.unmodifiableSet(hashSet);
    }

    public static Object a(v12 v12Var, Class cls) throws GeneralSecurityException {
        String strF = v12Var.F();
        g42 g42VarE = v12Var.E();
        ct1 ct1VarC = xw1.f10733d.c(strF);
        if (ct1VarC.zzb().equals(cls)) {
            return ct1VarC.b(g42VarE);
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(ct1VarC.getClass());
        String string = ct1VarC.zzb().toString();
        StringBuilder sbA = androidx.camera.camera2.internal.i0.a("Primitive type ", name, " not supported by key manager of type ", strValueOf, ", which only supports: ");
        sbA.append(string);
        throw new GeneralSecurityException(sbA.toString());
    }
}
