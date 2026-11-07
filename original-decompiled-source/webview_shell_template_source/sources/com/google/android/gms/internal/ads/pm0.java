package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class pm0 {
    public final HashMap s = new HashMap();

    public pm0(Set set) {
        synchronized (this) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                kn0 kn0Var = (kn0) it.next();
                synchronized (this) {
                    l0(kn0Var.f6447a, kn0Var.f6448b);
                }
            }
        }
    }

    public final synchronized void l0(Object obj, Executor executor) {
        this.s.put(obj, executor);
    }

    public final synchronized void o0(om0 om0Var) {
        for (Map.Entry entry : this.s.entrySet()) {
            ((Executor) entry.getValue()).execute(new wx(4, om0Var, entry.getKey()));
        }
    }
}
