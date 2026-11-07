package ci;

import bi.f;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public interface d {
    byte B();

    short C();

    float D();

    double E();

    ei.b a();

    b c(f fVar);

    d e(f fVar);

    boolean f();

    char h();

    int i(f fVar);

    int m();

    default <T> T q(zh.a<? extends T> deserializer) {
        r.e(deserializer, "deserializer");
        return deserializer.deserialize(this);
    }

    String r();

    long v();

    boolean x();
}
