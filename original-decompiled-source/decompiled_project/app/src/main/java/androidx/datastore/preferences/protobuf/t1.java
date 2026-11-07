package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.d0;

/* loaded from: classes.dex */
public enum t1 implements d0.c {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    SYNTAX_EDITIONS(2),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f2162a;

    t1(int i10) {
        this.f2162a = i10;
    }

    public static t1 a(int i10) {
        if (i10 == 0) {
            return SYNTAX_PROTO2;
        }
        if (i10 == 1) {
            return SYNTAX_PROTO3;
        }
        if (i10 != 2) {
            return null;
        }
        return SYNTAX_EDITIONS;
    }

    @Override // androidx.datastore.preferences.protobuf.d0.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f2162a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
