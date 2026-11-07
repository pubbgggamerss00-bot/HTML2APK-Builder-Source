package org.bouncycastle.crypto.prng;

/* loaded from: classes2.dex */
public class ReversedWindowGenerator implements RandomGenerator {
    private final RandomGenerator generator;
    private byte[] window;
    private int windowCount;

    public ReversedWindowGenerator(RandomGenerator randomGenerator, int i10) {
        if (randomGenerator == null) {
            throw new IllegalArgumentException("generator cannot be null");
        }
        if (i10 < 2) {
            throw new IllegalArgumentException("windowSize must be at least 2");
        }
        this.generator = randomGenerator;
        this.window = new byte[i10];
    }

    private void doNextBytes(byte[] bArr, int i10, int i11) {
        synchronized (this) {
            for (int i12 = 0; i12 < i11; i12++) {
                try {
                    if (this.windowCount < 1) {
                        RandomGenerator randomGenerator = this.generator;
                        byte[] bArr2 = this.window;
                        randomGenerator.nextBytes(bArr2, 0, bArr2.length);
                        this.windowCount = this.window.length;
                    }
                    byte[] bArr3 = this.window;
                    int i13 = this.windowCount - 1;
                    this.windowCount = i13;
                    bArr[i12 + i10] = bArr3[i13];
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(long j10) {
        synchronized (this) {
            this.windowCount = 0;
            this.generator.addSeedMaterial(j10);
        }
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr) {
        doNextBytes(bArr, 0, bArr.length);
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(byte[] bArr) {
        synchronized (this) {
            this.windowCount = 0;
            this.generator.addSeedMaterial(bArr);
        }
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr, int i10, int i11) {
        doNextBytes(bArr, i10, i11);
    }
}
