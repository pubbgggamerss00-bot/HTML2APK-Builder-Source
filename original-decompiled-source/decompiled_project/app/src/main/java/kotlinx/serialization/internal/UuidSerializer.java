package kotlinx.serialization.internal;

import bi.e;

/* loaded from: classes2.dex */
public final class UuidSerializer implements zh.b<oh.a> {
    public static final UuidSerializer INSTANCE = new UuidSerializer();
    private static final bi.f descriptor = new s0("kotlin.uuid.Uuid", e.i.f4260a);

    private UuidSerializer() {
    }

    @Override // zh.i, zh.a
    public bi.f getDescriptor() {
        return descriptor;
    }

    @Override // zh.a
    public oh.a deserialize(ci.d decoder) {
        String strConcat;
        kotlin.jvm.internal.r.e(decoder, "decoder");
        String uuidString = decoder.r();
        kotlin.jvm.internal.r.e(uuidString, "uuidString");
        int length = uuidString.length();
        if (length == 32) {
            long jB = mh.d.b(0, 16, uuidString);
            long jB2 = mh.d.b(16, 32, uuidString);
            if (jB != 0 || jB2 != 0) {
                return new oh.a(jB, jB2);
            }
        } else {
            if (length != 36) {
                StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                if (uuidString.length() <= 64) {
                    strConcat = uuidString;
                } else {
                    String strSubstring = uuidString.substring(0, 64);
                    kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
                    strConcat = strSubstring.concat("...");
                }
                sb.append(strConcat);
                sb.append("\" of length ");
                sb.append(uuidString.length());
                throw new IllegalArgumentException(sb.toString());
            }
            long jB3 = mh.d.b(0, 8, uuidString);
            oh.c.b(8, uuidString);
            long jB4 = mh.d.b(9, 13, uuidString);
            oh.c.b(13, uuidString);
            long jB5 = mh.d.b(14, 18, uuidString);
            oh.c.b(18, uuidString);
            long jB6 = mh.d.b(19, 23, uuidString);
            oh.c.b(23, uuidString);
            long j10 = (jB4 << 16) | (jB3 << 32) | jB5;
            long jB7 = mh.d.b(24, 36, uuidString) | (jB6 << 48);
            if (j10 != 0 || jB7 != 0) {
                return new oh.a(j10, jB7);
            }
        }
        return oh.a.f19147d;
    }

    @Override // zh.i
    public void serialize(ci.e encoder, oh.a value) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        kotlin.jvm.internal.r.e(value, "value");
        encoder.N(value.toString());
    }
}
