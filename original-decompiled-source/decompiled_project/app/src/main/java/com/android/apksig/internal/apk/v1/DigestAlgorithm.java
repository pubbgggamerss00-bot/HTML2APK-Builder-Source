package com.android.apksig.internal.apk.v1;

import java.util.Comparator;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes.dex */
public enum DigestAlgorithm {
    SHA1(McElieceCCA2KeyGenParameterSpec.SHA1),
    SHA256("SHA-256");

    public static Comparator<DigestAlgorithm> BY_STRENGTH_COMPARATOR = new StrengthComparator(null);
    private final String mJcaMessageDigestAlgorithm;

    /* renamed from: com.android.apksig.internal.apk.v1.DigestAlgorithm$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$android$apksig$internal$apk$v1$DigestAlgorithm;

        static {
            int[] iArr = new int[DigestAlgorithm.values().length];
            $SwitchMap$com$android$apksig$internal$apk$v1$DigestAlgorithm = iArr;
            try {
                iArr[DigestAlgorithm.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$android$apksig$internal$apk$v1$DigestAlgorithm[DigestAlgorithm.SHA256.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class StrengthComparator implements Comparator<DigestAlgorithm> {
        private StrengthComparator() {
        }

        public /* synthetic */ StrengthComparator(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // java.util.Comparator
        public int compare(DigestAlgorithm digestAlgorithm, DigestAlgorithm digestAlgorithm2) {
            int[] iArr = AnonymousClass1.$SwitchMap$com$android$apksig$internal$apk$v1$DigestAlgorithm;
            int i10 = iArr[digestAlgorithm.ordinal()];
            if (i10 == 1) {
                int i11 = iArr[digestAlgorithm2.ordinal()];
                if (i11 == 1) {
                    return 0;
                }
                if (i11 == 2) {
                    return -1;
                }
                throw new RuntimeException("Unsupported algorithm: " + digestAlgorithm2);
            }
            if (i10 != 2) {
                throw new RuntimeException("Unsupported algorithm: " + digestAlgorithm);
            }
            int i12 = iArr[digestAlgorithm2.ordinal()];
            if (i12 == 1) {
                return 1;
            }
            if (i12 == 2) {
                return 0;
            }
            throw new RuntimeException("Unsupported algorithm: " + digestAlgorithm2);
        }
    }

    DigestAlgorithm(String str) {
        this.mJcaMessageDigestAlgorithm = str;
    }

    public String getJcaMessageDigestAlgorithm() {
        return this.mJcaMessageDigestAlgorithm;
    }
}
