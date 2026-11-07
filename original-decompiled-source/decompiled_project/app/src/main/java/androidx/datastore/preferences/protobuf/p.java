package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.d0;
import com.google.protobuf.DescriptorProtos;

/* loaded from: classes.dex */
public enum p implements d0.c {
    EDITION_UNKNOWN(0),
    EDITION_LEGACY(900),
    EDITION_PROTO2(DescriptorProtos.Edition.EDITION_PROTO2_VALUE),
    EDITION_PROTO3(999),
    EDITION_2023(DescriptorProtos.Edition.EDITION_2023_VALUE),
    EDITION_2024(1001),
    EDITION_1_TEST_ONLY(1),
    EDITION_2_TEST_ONLY(2),
    EDITION_99997_TEST_ONLY(DescriptorProtos.Edition.EDITION_99997_TEST_ONLY_VALUE),
    EDITION_99998_TEST_ONLY(DescriptorProtos.Edition.EDITION_99998_TEST_ONLY_VALUE),
    EDITION_99999_TEST_ONLY(DescriptorProtos.Edition.EDITION_99999_TEST_ONLY_VALUE),
    EDITION_MAX(Integer.MAX_VALUE);


    /* renamed from: a, reason: collision with root package name */
    public final int f2121a;

    public static final class a implements d0.e {

        /* renamed from: a, reason: collision with root package name */
        public static final a f2122a = new a();

        @Override // androidx.datastore.preferences.protobuf.d0.e
        public final boolean isInRange(int i10) {
            return p.a(i10) != null;
        }
    }

    p(int i10) {
        this.f2121a = i10;
    }

    public static p a(int i10) {
        if (i10 == 0) {
            return EDITION_UNKNOWN;
        }
        if (i10 == 1) {
            return EDITION_1_TEST_ONLY;
        }
        if (i10 == 2) {
            return EDITION_2_TEST_ONLY;
        }
        if (i10 == 900) {
            return EDITION_LEGACY;
        }
        if (i10 == Integer.MAX_VALUE) {
            return EDITION_MAX;
        }
        switch (i10) {
            case EDITION_PROTO2_VALUE:
                return EDITION_PROTO2;
            case 999:
                return EDITION_PROTO3;
            case EDITION_2023_VALUE:
                return EDITION_2023;
            case 1001:
                return EDITION_2024;
            default:
                switch (i10) {
                    case EDITION_99997_TEST_ONLY_VALUE:
                        return EDITION_99997_TEST_ONLY;
                    case EDITION_99998_TEST_ONLY_VALUE:
                        return EDITION_99998_TEST_ONLY;
                    case EDITION_99999_TEST_ONLY_VALUE:
                        return EDITION_99999_TEST_ONLY;
                    default:
                        return null;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.d0.c
    public final int getNumber() {
        return this.f2121a;
    }
}
