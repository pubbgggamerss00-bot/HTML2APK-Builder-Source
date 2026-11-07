package ci;

import bi.f;
import kotlin.jvm.internal.r;
import zh.i;

/* loaded from: classes2.dex */
public interface e {
    default c A(f descriptor) {
        r.e(descriptor, "descriptor");
        return c(descriptor);
    }

    void C(f fVar, int i10);

    void H(int i10);

    /* JADX WARN: Multi-variable type inference failed */
    default <T> void J(i<? super T> serializer, T t3) {
        r.e(serializer, "serializer");
        serializer.serialize(this, t3);
    }

    void K(long j10);

    void N(String str);

    ei.b a();

    c c(f fVar);

    e f(f fVar);

    void h();

    void k(double d10);

    void l(short s10);

    default <T> void m(i<? super T> serializer, T t3) {
        r.e(serializer, "serializer");
        if (serializer.getDescriptor().c()) {
            J(serializer, t3);
        } else if (t3 == null) {
            h();
        } else {
            v();
            J(serializer, t3);
        }
    }

    void n(byte b10);

    void o(boolean z10);

    void r(float f10);

    void t(char c10);

    default void v() {
    }
}
