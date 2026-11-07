package ed;

import com.google.crypto.tink.shaded.protobuf.y;

/* loaded from: classes2.dex */
public enum f0 implements y.a {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f8689a;

    f0(int i10) {
        this.f8689a = i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y.a
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f8689a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
