package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class h0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f6671b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final b f6672a;

    public class a implements o0 {
        @Override // com.google.crypto.tink.shaded.protobuf.o0
        public final boolean isSupported(Class<?> cls) {
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0
        public final n0 messageInfoFor(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    public static class b implements o0 {

        /* renamed from: a, reason: collision with root package name */
        public o0[] f6673a;

        @Override // com.google.crypto.tink.shaded.protobuf.o0
        public final boolean isSupported(Class<?> cls) {
            for (o0 o0Var : this.f6673a) {
                if (o0Var.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0
        public final n0 messageInfoFor(Class<?> cls) {
            for (o0 o0Var : this.f6673a) {
                if (o0Var.isSupported(cls)) {
                    return o0Var.messageInfoFor(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
        }
    }

    public h0() {
        o0 o0Var;
        try {
            o0Var = (o0) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            o0Var = f6671b;
        }
        o0[] o0VarArr = {v.f6802a, o0Var};
        b bVar = new b();
        bVar.f6673a = o0VarArr;
        Charset charset = y.f6818a;
        this.f6672a = bVar;
    }
}
