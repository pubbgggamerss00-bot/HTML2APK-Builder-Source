package org.bouncycastle.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.util.RadixConverter;
import org.bouncycastle.util.Arrays;

/* loaded from: classes.dex */
public class FPEParameterSpec implements AlgorithmParameterSpec {
    private final RadixConverter radixConverter;
    private final byte[] tweak;
    private final boolean useInverse;

    public FPEParameterSpec(int i10, byte[] bArr) {
        this(i10, bArr, false);
    }

    public int getRadix() {
        return this.radixConverter.getRadix();
    }

    public RadixConverter getRadixConverter() {
        return this.radixConverter;
    }

    public byte[] getTweak() {
        return Arrays.clone(this.tweak);
    }

    public boolean isUsingInverseFunction() {
        return this.useInverse;
    }

    public FPEParameterSpec(int i10, byte[] bArr, boolean z10) {
        this(new RadixConverter(i10), bArr, z10);
    }

    public FPEParameterSpec(RadixConverter radixConverter, byte[] bArr, boolean z10) {
        this.radixConverter = radixConverter;
        this.tweak = Arrays.clone(bArr);
        this.useInverse = z10;
    }
}
