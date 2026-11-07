package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.o;
import com.google.crypto.tink.shaded.protobuf.w;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes2.dex */
public final class q extends p<w.d> {
    @Override // com.google.crypto.tink.shaded.protobuf.p
    public final void a(Map.Entry entry) {
        ((w.d) entry.getKey()).getClass();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.p
    public final w.e b(o oVar, p0 p0Var, int i10) {
        return oVar.f6734a.get(new o.a(i10, p0Var));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.p
    public final s<w.d> c(Object obj) {
        return ((w.c) obj).extensions;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.p
    public final s<w.d> d(Object obj) {
        w.c cVar = (w.c) obj;
        s<w.d> sVar = cVar.extensions;
        if (sVar.f6759b) {
            cVar.extensions = sVar.clone();
        }
        return cVar.extensions;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.p
    public final boolean e(p0 p0Var) {
        return p0Var instanceof w.c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.p
    public final void f(Object obj) {
        ((w.c) obj).extensions.g();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.p
    public final Object g(Object obj) throws IOException {
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.p
    public final void h(Object obj) throws IOException {
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.p
    public final void i(Object obj) throws IOException {
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.p
    public final void j(Map.Entry entry) throws IOException {
        ((w.d) entry.getKey()).getClass();
        throw null;
    }
}
