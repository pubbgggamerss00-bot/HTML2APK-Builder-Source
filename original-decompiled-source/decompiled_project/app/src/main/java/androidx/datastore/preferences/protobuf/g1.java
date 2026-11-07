package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.d0;

/* loaded from: classes.dex */
public enum g1 implements d0.c {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f2030a;

    g1(int i10) {
        this.f2030a = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.d0.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f2030a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
