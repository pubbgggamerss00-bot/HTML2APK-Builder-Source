package com.google.android.recaptcha.internal;

/* loaded from: classes2.dex */
final class zzlp implements zznh {
    static final zznh zza = new zzlp();

    private zzlp() {
    }

    @Override // com.google.android.recaptcha.internal.zznh
    public final boolean zza(int i10) {
        zzlq zzlqVar;
        zzlq zzlqVar2 = zzlq.EDITION_UNKNOWN;
        if (i10 == 0) {
            zzlqVar = zzlq.EDITION_UNKNOWN;
        } else if (i10 == 1) {
            zzlqVar = zzlq.EDITION_1_TEST_ONLY;
        } else if (i10 == 2) {
            zzlqVar = zzlq.EDITION_2_TEST_ONLY;
        } else if (i10 == 900) {
            zzlqVar = zzlq.EDITION_LEGACY;
        } else if (i10 != Integer.MAX_VALUE) {
            switch (i10) {
                case EDITION_PROTO2_VALUE:
                    zzlqVar = zzlq.EDITION_PROTO2;
                    break;
                case 999:
                    zzlqVar = zzlq.EDITION_PROTO3;
                    break;
                case EDITION_2023_VALUE:
                    zzlqVar = zzlq.EDITION_2023;
                    break;
                case 1001:
                    zzlqVar = zzlq.EDITION_2024;
                    break;
                default:
                    switch (i10) {
                        case EDITION_99997_TEST_ONLY_VALUE:
                            zzlqVar = zzlq.EDITION_99997_TEST_ONLY;
                            break;
                        case EDITION_99998_TEST_ONLY_VALUE:
                            zzlqVar = zzlq.EDITION_99998_TEST_ONLY;
                            break;
                        case EDITION_99999_TEST_ONLY_VALUE:
                            zzlqVar = zzlq.EDITION_99999_TEST_ONLY;
                            break;
                        default:
                            zzlqVar = null;
                            break;
                    }
            }
        } else {
            zzlqVar = zzlq.EDITION_MAX;
        }
        return zzlqVar != null;
    }
}
