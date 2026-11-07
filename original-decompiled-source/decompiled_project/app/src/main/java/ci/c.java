package ci;

import bi.f;
import kotlin.jvm.internal.r;
import zh.i;

/* loaded from: classes2.dex */
public interface c {
    void B(f fVar, int i10, byte b10);

    void D(f fVar, int i10, float f10);

    e I(f fVar, int i10);

    void L(f fVar, int i10, boolean z10);

    void M(f fVar, int i10, String str);

    void O(int i10, int i11, f fVar);

    void b(f fVar);

    void e(f fVar, int i10, long j10);

    <T> void g(f fVar, int i10, i<? super T> iVar, T t3);

    default boolean i(f descriptor) {
        r.e(descriptor, "descriptor");
        return true;
    }

    void p(f fVar, int i10, double d10);

    void q(f fVar, int i10, short s10);

    <T> void y(f fVar, int i10, i<? super T> iVar, T t3);

    void z(f fVar, int i10, char c10);
}
