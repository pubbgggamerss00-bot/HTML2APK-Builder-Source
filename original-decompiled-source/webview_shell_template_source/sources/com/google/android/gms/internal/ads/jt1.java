package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class jt1 {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList f6163a = new CopyOnWriteArrayList();

    public static it1 a(String str) throws GeneralSecurityException {
        Iterator it = f6163a.iterator();
        while (it.hasNext()) {
            it1 it1Var = (it1) it.next();
            if (it1Var.zza()) {
                return it1Var;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
