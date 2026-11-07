package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class cn1 extends AbstractCollection {
    public final /* synthetic */ an1 s;

    public cn1(an1 an1Var) {
        this.s = an1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.s.a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Iterator it = ((to1) this.s.zzs()).values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new km1(this.s);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.s.f2802w;
    }
}
