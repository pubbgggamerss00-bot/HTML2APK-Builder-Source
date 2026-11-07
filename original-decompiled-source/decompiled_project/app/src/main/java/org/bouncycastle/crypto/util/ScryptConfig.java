package org.bouncycastle.crypto.util;

import org.bouncycastle.internal.asn1.misc.MiscObjectIdentifiers;

/* loaded from: classes2.dex */
public class ScryptConfig extends PBKDFConfig {
    private final int blockSize;
    private final int costParameter;
    private final int parallelizationParameter;
    private final int saltLength;

    public static class Builder {
        private final int blockSize;
        private final int costParameter;
        private final int parallelizationParameter;
        private int saltLength = 16;

        public Builder(int i10, int i11, int i12) {
            if (i10 <= 1 || !isPowerOf2(i10)) {
                throw new IllegalArgumentException("Cost parameter N must be > 1 and a power of 2");
            }
            this.costParameter = i10;
            this.blockSize = i11;
            this.parallelizationParameter = i12;
        }

        private static boolean isPowerOf2(int i10) {
            return (i10 & (i10 + (-1))) == 0;
        }

        public ScryptConfig build() {
            return new ScryptConfig(this);
        }

        public Builder withSaltLength(int i10) {
            this.saltLength = i10;
            return this;
        }
    }

    private ScryptConfig(Builder builder) {
        super(MiscObjectIdentifiers.id_scrypt);
        this.costParameter = builder.costParameter;
        this.blockSize = builder.blockSize;
        this.parallelizationParameter = builder.parallelizationParameter;
        this.saltLength = builder.saltLength;
    }

    public int getBlockSize() {
        return this.blockSize;
    }

    public int getCostParameter() {
        return this.costParameter;
    }

    public int getParallelizationParameter() {
        return this.parallelizationParameter;
    }

    public int getSaltLength() {
        return this.saltLength;
    }
}
