package org.bouncycastle.crypto.prng;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Arrays;

/* loaded from: classes2.dex */
public class DigestRandomGenerator implements RandomGenerator {
    private static long CYCLE_COUNT = 10;
    private Digest digest;
    private byte[] seed;
    private byte[] state;
    private long seedCounter = 1;
    private long stateCounter = 1;

    public DigestRandomGenerator(Digest digest) {
        this.digest = digest;
        this.seed = new byte[digest.getDigestSize()];
        this.state = new byte[digest.getDigestSize()];
    }

    private void cycleSeed() {
        digestUpdate(this.seed);
        long j10 = this.seedCounter;
        this.seedCounter = 1 + j10;
        digestAddCounter(j10);
        digestDoFinal(this.seed);
    }

    private void digestAddCounter(long j10) {
        for (int i10 = 0; i10 != 8; i10++) {
            this.digest.update((byte) j10);
            j10 >>>= 8;
        }
    }

    private void digestDoFinal(byte[] bArr) {
        this.digest.doFinal(bArr, 0);
    }

    private void digestUpdate(byte[] bArr) {
        this.digest.update(bArr, 0, bArr.length);
    }

    private void generateState() {
        long j10 = this.stateCounter;
        this.stateCounter = 1 + j10;
        digestAddCounter(j10);
        digestUpdate(this.state);
        digestUpdate(this.seed);
        digestDoFinal(this.state);
        if (this.stateCounter % CYCLE_COUNT == 0) {
            cycleSeed();
        }
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(long j10) {
        synchronized (this) {
            digestAddCounter(j10);
            digestUpdate(this.seed);
            digestDoFinal(this.seed);
        }
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr) {
        nextBytes(bArr, 0, bArr.length);
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(byte[] bArr) {
        synchronized (this) {
            try {
                if (!Arrays.isNullOrEmpty(bArr)) {
                    digestUpdate(bArr);
                }
                digestUpdate(this.seed);
                digestDoFinal(this.seed);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr, int i10, int i11) {
        synchronized (this) {
            try {
                generateState();
                int i12 = i11 + i10;
                int i13 = 0;
                while (i10 != i12) {
                    if (i13 == this.state.length) {
                        generateState();
                        i13 = 0;
                    }
                    bArr[i10] = this.state[i13];
                    i10++;
                    i13++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
