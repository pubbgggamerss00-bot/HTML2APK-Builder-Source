package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class l implements v1 {

    /* renamed from: a, reason: collision with root package name */
    public final k f6726a;

    public l(k kVar) {
        y.a(kVar, "output");
        this.f6726a = kVar;
        kVar.f6722a = this;
    }

    public final void a(int i10, h hVar) throws IOException {
        this.f6726a.W(i10, hVar);
    }

    public final void b(int i10, Object obj, g1 g1Var) throws IOException {
        k kVar = this.f6726a;
        kVar.h0(i10, 3);
        g1Var.d((p0) obj, kVar.f6722a);
        kVar.h0(i10, 4);
    }
}
