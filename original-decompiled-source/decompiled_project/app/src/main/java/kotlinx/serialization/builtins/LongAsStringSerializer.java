package kotlinx.serialization.builtins;

import bi.e;
import bi.f;
import bi.k;
import ci.d;
import kotlin.jvm.internal.r;
import zh.b;

/* loaded from: classes2.dex */
public final class LongAsStringSerializer implements b<Long> {
    public static final LongAsStringSerializer INSTANCE = new LongAsStringSerializer();
    private static final f descriptor = k.a("kotlinx.serialization.LongAsStringSerializer", e.i.f4260a);

    private LongAsStringSerializer() {
    }

    @Override // zh.i, zh.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // zh.i
    public /* bridge */ /* synthetic */ void serialize(ci.e eVar, Object obj) {
        serialize(eVar, ((Number) obj).longValue());
    }

    @Override // zh.a
    public Long deserialize(d decoder) {
        r.e(decoder, "decoder");
        return Long.valueOf(Long.parseLong(decoder.r()));
    }

    public void serialize(ci.e encoder, long j10) {
        r.e(encoder, "encoder");
        encoder.N(String.valueOf(j10));
    }
}
