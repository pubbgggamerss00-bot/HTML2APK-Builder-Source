package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ly1 {

    /* renamed from: a, reason: collision with root package name */
    public final Class f6879a;

    /* renamed from: d, reason: collision with root package name */
    public my1 f6882d;

    /* renamed from: b, reason: collision with root package name */
    public HashMap f6880b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f6881c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public jx1 f6883e = jx1.f6188b;

    public /* synthetic */ ly1(Class cls) {
        this.f6879a = cls;
    }

    public final void a(Object obj, b22 b22Var, boolean z6) {
        byte[] bArrB;
        if (this.f6880b == null) {
            throw new IllegalStateException("addEntry cannot be called after build");
        }
        if (obj == null) {
            throw new NullPointerException("`fullPrimitive` must not be null");
        }
        if (b22Var.J() != 3) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        int iOrdinal = b22Var.E().ordinal();
        if (iOrdinal == 1) {
            bArrB = xx1.b(b22Var.B()).b();
        } else if (iOrdinal == 2) {
            bArrB = xx1.a(b22Var.B()).b();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrB = xx1.a(b22Var.B()).b();
        } else {
            bArrB = fo.F;
        }
        r32 r32VarA = r32.a(bArrB);
        my1 my1Var = new my1(obj, r32VarA, b22Var.J(), b22Var.E(), b22Var.B(), b22Var.C().F());
        HashMap map = this.f6880b;
        ArrayList arrayList = new ArrayList();
        arrayList.add(my1Var);
        List list = (List) map.put(r32VarA, Collections.unmodifiableList(arrayList));
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list);
            arrayList2.add(my1Var);
            map.put(r32VarA, Collections.unmodifiableList(arrayList2));
        }
        this.f6881c.add(my1Var);
        if (z6) {
            if (this.f6882d != null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.f6882d = my1Var;
        }
    }
}
