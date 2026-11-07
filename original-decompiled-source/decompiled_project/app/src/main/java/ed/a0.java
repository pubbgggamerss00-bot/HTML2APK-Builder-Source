package ed;

import com.google.crypto.tink.shaded.protobuf.y;

/* loaded from: classes2.dex */
public enum a0 implements y.a {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f8674a;

    a0(int i10) {
        this.f8674a = i10;
    }

    public static a0 a(int i10) {
        if (i10 == 0) {
            return UNKNOWN_HASH;
        }
        if (i10 == 1) {
            return SHA1;
        }
        if (i10 == 2) {
            return SHA384;
        }
        if (i10 == 3) {
            return SHA256;
        }
        if (i10 == 4) {
            return SHA512;
        }
        if (i10 != 5) {
            return null;
        }
        return SHA224;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y.a
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f8674a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
