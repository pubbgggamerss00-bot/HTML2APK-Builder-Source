package com.basitce.htmltoapk.data.local.dao;

import p5.k0;
import p5.o0;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5712a;

    public /* synthetic */ e(int i10) {
        this.f5712a = i10;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f5712a) {
            case 0:
                return FolderDao_Impl.lambda$count$5((h6.b) obj);
            default:
                k0 destination = (k0) obj;
                kotlin.jvm.internal.r.e(destination, "destination");
                o0 o0Var = destination.f21236c;
                if (o0Var == null || o0Var.f21253f.f24519c != destination.f21235b.f24511d) {
                    return null;
                }
                return o0Var;
        }
    }
}
