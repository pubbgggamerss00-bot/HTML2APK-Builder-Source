package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class q8 {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f8246a;

    /* renamed from: b, reason: collision with root package name */
    public final List f8247b;

    /* renamed from: c, reason: collision with root package name */
    public final bo1 f8248c;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
    }

    public /* synthetic */ q8(Uri uri, bo1 bo1Var) {
        List list = Collections.EMPTY_LIST;
        this.f8246a = uri;
        ArrayList arrayList = bk.f3208a;
        this.f8247b = list;
        this.f8248c = bo1Var;
        yn1 yn1Var = new yn1();
        if (bo1Var.size() <= 0) {
            yn1Var.t();
        } else {
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8)) {
            return false;
        }
        q8 q8Var = (q8) obj;
        if (this.f8246a.equals(q8Var.f8246a) && this.f8247b.equals(q8Var.f8247b) && this.f8248c.equals(q8Var.f8248c)) {
            Object obj2 = -9223372036854775807L;
            if (obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) ((((this.f8248c.hashCode() + ((this.f8247b.hashCode() + (this.f8246a.hashCode() * 923521)) * 961)) * 31) * 31) - Long.MAX_VALUE);
    }
}
