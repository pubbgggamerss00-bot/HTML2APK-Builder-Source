package org.bouncycastle.jcajce.provider.drbg;

import org.bouncycastle.crypto.prng.EntropySource;

/* loaded from: classes.dex */
interface IncrementalEntropySource extends EntropySource {
    byte[] getEntropy(long j10) throws InterruptedException;
}
