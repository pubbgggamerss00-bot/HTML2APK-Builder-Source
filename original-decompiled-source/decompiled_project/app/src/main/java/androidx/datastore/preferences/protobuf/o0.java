package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f2105b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final b f2106a;

    public class a implements v0 {
        @Override // androidx.datastore.preferences.protobuf.v0
        public final boolean isSupported(Class<?> cls) {
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.v0
        public final u0 messageInfoFor(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    public static class b implements v0 {

        /* renamed from: a, reason: collision with root package name */
        public v0[] f2107a;

        @Override // androidx.datastore.preferences.protobuf.v0
        public final boolean isSupported(Class<?> cls) {
            for (v0 v0Var : this.f2107a) {
                if (v0Var.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.v0
        public final u0 messageInfoFor(Class<?> cls) {
            for (v0 v0Var : this.f2107a) {
                if (v0Var.isSupported(cls)) {
                    return v0Var.messageInfoFor(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
        }
    }

    public o0() {
        v0 v0Var;
        k1 k1Var = k1.f2075c;
        try {
            v0Var = (v0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            v0Var = f2105b;
        }
        v0[] v0VarArr = {b0.f1953a, v0Var};
        b bVar = new b();
        bVar.f2107a = v0VarArr;
        Charset charset = d0.f2005a;
        this.f2106a = bVar;
    }
}
