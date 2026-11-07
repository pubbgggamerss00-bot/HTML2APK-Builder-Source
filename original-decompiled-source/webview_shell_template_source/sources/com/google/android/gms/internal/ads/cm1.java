package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class cm1 {

    /* renamed from: a, reason: collision with root package name */
    public final bm1 f3618a;

    public cm1(bm1 bm1Var) {
        this.f3618a = bm1Var;
    }

    public static cm1 a(ml1 ml1Var) {
        return new cm1(new v31(17, ml1Var));
    }

    public final List b(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itI = this.f3618a.i(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (true) {
            am1 am1Var = (am1) itI;
            if (!am1Var.hasNext()) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add((String) am1Var.next());
        }
    }
}
