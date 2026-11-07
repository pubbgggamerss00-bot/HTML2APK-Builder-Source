package org.bouncycastle.jcajce.provider.drbg;

import java.security.SecureRandom;
import org.bouncycastle.crypto.prng.EntropySource;
import org.bouncycastle.crypto.prng.EntropySourceProvider;

/* loaded from: classes.dex */
class IncrementalEntropySourceProvider implements EntropySourceProvider {
    private final boolean predictionResistant;
    private final SecureRandom random;

    public IncrementalEntropySourceProvider(SecureRandom secureRandom, boolean z10) {
        this.random = secureRandom;
        this.predictionResistant = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sleep(long j10) throws InterruptedException {
        if (j10 != 0) {
            Thread.sleep(j10);
        }
    }

    @Override // org.bouncycastle.crypto.prng.EntropySourceProvider
    public EntropySource get(int i10) {
        return new IncrementalEntropySource(i10) { // from class: org.bouncycastle.jcajce.provider.drbg.IncrementalEntropySourceProvider.1
            final int numBytes;
            final /* synthetic */ int val$bitsRequired;

            {
                this.val$bitsRequired = i10;
                this.numBytes = (i10 + 7) / 8;
            }

            @Override // org.bouncycastle.crypto.prng.EntropySource
            public int entropySize() {
                return this.val$bitsRequired;
            }

            @Override // org.bouncycastle.crypto.prng.EntropySource
            public byte[] getEntropy() {
                try {
                    return getEntropy(0L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new IllegalStateException("initial entropy fetch interrupted");
                }
            }

            @Override // org.bouncycastle.crypto.prng.EntropySource
            public boolean isPredictionResistant() {
                return IncrementalEntropySourceProvider.this.predictionResistant;
            }

            @Override // org.bouncycastle.jcajce.provider.drbg.IncrementalEntropySource
            public byte[] getEntropy(long j10) throws InterruptedException {
                int i11;
                int i12 = this.numBytes;
                byte[] bArr = new byte[i12];
                int i13 = 0;
                while (true) {
                    i11 = this.numBytes;
                    if (i13 >= i11 / 8) {
                        break;
                    }
                    IncrementalEntropySourceProvider.sleep(j10);
                    byte[] bArrGenerateSeed = IncrementalEntropySourceProvider.this.random.generateSeed(8);
                    System.arraycopy(bArrGenerateSeed, 0, bArr, i13 * 8, bArrGenerateSeed.length);
                    i13++;
                }
                int i14 = i11 - ((i11 / 8) * 8);
                if (i14 != 0) {
                    IncrementalEntropySourceProvider.sleep(j10);
                    byte[] bArrGenerateSeed2 = IncrementalEntropySourceProvider.this.random.generateSeed(i14);
                    System.arraycopy(bArrGenerateSeed2, 0, bArr, i12 - bArrGenerateSeed2.length, bArrGenerateSeed2.length);
                }
                return bArr;
            }
        };
    }
}
