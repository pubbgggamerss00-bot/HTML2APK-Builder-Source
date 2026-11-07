package ed;

import com.google.crypto.tink.shaded.protobuf.y;

/* loaded from: classes2.dex */
public enum o0 implements y.a {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f8697a;

    o0(int i10) {
        this.f8697a = i10;
    }

    public static o0 a(int i10) {
        if (i10 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i10 == 1) {
            return TINK;
        }
        if (i10 == 2) {
            return LEGACY;
        }
        if (i10 == 3) {
            return RAW;
        }
        if (i10 != 4) {
            return null;
        }
        return CRUNCHY;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y.a
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f8697a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
