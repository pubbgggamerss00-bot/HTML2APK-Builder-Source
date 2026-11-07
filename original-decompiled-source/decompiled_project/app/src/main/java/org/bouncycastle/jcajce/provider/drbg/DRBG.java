package org.bouncycastle.jcajce.provider.drbg;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.SecureRandomSpi;
import java.security.Security;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.prng.EntropySource;
import org.bouncycastle.crypto.prng.EntropySourceProvider;
import org.bouncycastle.crypto.prng.SP800SecureRandom;
import org.bouncycastle.crypto.prng.SP800SecureRandomBuilder;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.ClassUtil;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;
import org.bouncycastle.util.Properties;
import org.bouncycastle.util.Strings;

/* loaded from: classes.dex */
public class DRBG {
    private static final String PREFIX = "org.bouncycastle.jcajce.provider.drbg.DRBG";
    private static EntropyDaemon entropyDaemon;
    private static final String[][] initialEntropySourceNames = {new String[]{"sun.security.provider.Sun", "sun.security.provider.SecureRandom"}, new String[]{"org.apache.harmony.security.provider.crypto.CryptoProvider", "org.apache.harmony.security.provider.crypto.SHA1PRNG_SecureRandomImpl"}, new String[]{"com.android.org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLRandom"}, new String[]{"org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLRandom"}};
    private static Thread entropyThread = null;

    public static class CoreSecureRandom extends SecureRandom {
        public CoreSecureRandom(Object[] objArr) {
            super((SecureRandomSpi) objArr[1], (Provider) objArr[0]);
        }
    }

    public static class Default extends SecureRandomSpi {
        private static final SecureRandom random = DRBG.createBaseRandom(true);

        @Override // java.security.SecureRandomSpi
        public byte[] engineGenerateSeed(int i10) {
            return random.generateSeed(i10);
        }

        @Override // java.security.SecureRandomSpi
        public void engineNextBytes(byte[] bArr) {
            random.nextBytes(bArr);
        }

        @Override // java.security.SecureRandomSpi
        public void engineSetSeed(byte[] bArr) {
            random.setSeed(bArr);
        }
    }

    public static class HybridEntropySource implements EntropySource {
        private final byte[] additionalInput;
        private final int bytesRequired;
        private final SP800SecureRandom drbg;
        private final SignallingEntropySource entropySource;
        private final AtomicInteger samples;
        private final AtomicBoolean seedAvailable;

        public static class SignallingEntropySource implements IncrementalEntropySource {
            private final int byteLength;
            private final EntropyDaemon entropyDaemon;
            private final IncrementalEntropySource entropySource;
            private final AtomicBoolean seedAvailable;
            private final AtomicReference entropy = new AtomicReference();
            private final AtomicBoolean scheduled = new AtomicBoolean(false);

            public SignallingEntropySource(EntropyDaemon entropyDaemon, AtomicBoolean atomicBoolean, EntropySourceProvider entropySourceProvider, int i10) {
                this.entropyDaemon = entropyDaemon;
                this.seedAvailable = atomicBoolean;
                this.entropySource = (IncrementalEntropySource) entropySourceProvider.get(i10);
                this.byteLength = (i10 + 7) / 8;
            }

            @Override // org.bouncycastle.crypto.prng.EntropySource
            public int entropySize() {
                return this.byteLength * 8;
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
                return true;
            }

            public void schedule() {
                if (this.scheduled.getAndSet(true)) {
                    return;
                }
                this.entropyDaemon.addTask(new EntropyGatherer(this.entropySource, this.seedAvailable, this.entropy));
            }

            @Override // org.bouncycastle.jcajce.provider.drbg.IncrementalEntropySource
            public byte[] getEntropy(long j10) throws InterruptedException {
                byte[] bArr = (byte[]) this.entropy.getAndSet(null);
                if (bArr == null || bArr.length != this.byteLength) {
                    return this.entropySource.getEntropy(j10);
                }
                this.scheduled.set(false);
                return bArr;
            }
        }

        public HybridEntropySource(EntropyDaemon entropyDaemon, int i10) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            this.seedAvailable = atomicBoolean;
            this.samples = new AtomicInteger(0);
            this.additionalInput = Pack.longToBigEndian(System.currentTimeMillis());
            EntropySourceProvider entropySourceProviderCreateCoreEntropySourceProvider = DRBG.createCoreEntropySourceProvider();
            this.bytesRequired = (i10 + 7) / 8;
            SignallingEntropySource signallingEntropySource = new SignallingEntropySource(entropyDaemon, atomicBoolean, entropySourceProviderCreateCoreEntropySourceProvider, 256);
            this.entropySource = signallingEntropySource;
            this.drbg = new SP800SecureRandomBuilder(new EntropySourceProvider() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.HybridEntropySource.1
                @Override // org.bouncycastle.crypto.prng.EntropySourceProvider
                public EntropySource get(int i11) {
                    return HybridEntropySource.this.entropySource;
                }
            }).setPersonalizationString(Strings.toByteArray("Bouncy Castle Hybrid Entropy Source")).buildHMAC(new HMac(new SHA512Digest()), signallingEntropySource.getEntropy(), false);
        }

        @Override // org.bouncycastle.crypto.prng.EntropySource
        public int entropySize() {
            return this.bytesRequired * 8;
        }

        @Override // org.bouncycastle.crypto.prng.EntropySource
        public byte[] getEntropy() {
            byte[] bArr = new byte[this.bytesRequired];
            if (this.samples.getAndIncrement() > 128) {
                if (this.seedAvailable.getAndSet(false)) {
                    this.samples.set(0);
                    this.drbg.reseed(this.additionalInput);
                } else {
                    this.entropySource.schedule();
                }
            }
            this.drbg.nextBytes(bArr);
            return bArr;
        }

        @Override // org.bouncycastle.crypto.prng.EntropySource
        public boolean isPredictionResistant() {
            return true;
        }
    }

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("SecureRandom.DEFAULT", DRBG.PREFIX + "$Default");
            configurableProvider.addAlgorithm("SecureRandom.NONCEANDIV", DRBG.PREFIX + "$NonceAndIV");
        }
    }

    public static class NonceAndIV extends SecureRandomSpi {
        private static final SecureRandom random = DRBG.createBaseRandom(false);

        @Override // java.security.SecureRandomSpi
        public byte[] engineGenerateSeed(int i10) {
            return random.generateSeed(i10);
        }

        @Override // java.security.SecureRandomSpi
        public void engineNextBytes(byte[] bArr) {
            random.nextBytes(bArr);
        }

        @Override // java.security.SecureRandomSpi
        public void engineSetSeed(byte[] bArr) {
            random.setSeed(bArr);
        }
    }

    public static class OneShotHybridEntropySource implements EntropySource {
        private final byte[] additionalInput;
        private final int bytesRequired;
        private final SP800SecureRandom drbg;
        private final OneShotSignallingEntropySource entropySource;
        private final AtomicInteger samples;
        private final AtomicBoolean seedAvailable;

        public static class OneShotSignallingEntropySource implements IncrementalEntropySource {
            private final int byteLength;
            private final IncrementalEntropySource entropySource;
            private final AtomicBoolean seedAvailable;
            private final AtomicReference entropy = new AtomicReference();
            private final AtomicBoolean scheduled = new AtomicBoolean(false);

            public OneShotSignallingEntropySource(AtomicBoolean atomicBoolean, EntropySourceProvider entropySourceProvider, int i10) {
                this.seedAvailable = atomicBoolean;
                this.entropySource = (IncrementalEntropySource) entropySourceProvider.get(i10);
                this.byteLength = (i10 + 7) / 8;
            }

            @Override // org.bouncycastle.crypto.prng.EntropySource
            public int entropySize() {
                return this.byteLength * 8;
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
                return true;
            }

            public void schedule() {
                if (this.scheduled.getAndSet(true)) {
                    return;
                }
                Thread thread = new Thread(new EntropyGatherer(this.entropySource, this.seedAvailable, this.entropy));
                thread.setDaemon(true);
                thread.start();
            }

            @Override // org.bouncycastle.jcajce.provider.drbg.IncrementalEntropySource
            public byte[] getEntropy(long j10) throws InterruptedException {
                byte[] bArr = (byte[]) this.entropy.getAndSet(null);
                if (bArr == null || bArr.length != this.byteLength) {
                    return this.entropySource.getEntropy(j10);
                }
                this.scheduled.set(false);
                return bArr;
            }
        }

        public OneShotHybridEntropySource(int i10) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            this.seedAvailable = atomicBoolean;
            this.samples = new AtomicInteger(0);
            this.additionalInput = Pack.longToBigEndian(System.currentTimeMillis());
            EntropySourceProvider entropySourceProviderCreateCoreEntropySourceProvider = DRBG.createCoreEntropySourceProvider();
            this.bytesRequired = (i10 + 7) / 8;
            OneShotSignallingEntropySource oneShotSignallingEntropySource = new OneShotSignallingEntropySource(atomicBoolean, entropySourceProviderCreateCoreEntropySourceProvider, 256);
            this.entropySource = oneShotSignallingEntropySource;
            this.drbg = new SP800SecureRandomBuilder(new EntropySourceProvider() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.OneShotHybridEntropySource.1
                @Override // org.bouncycastle.crypto.prng.EntropySourceProvider
                public EntropySource get(int i11) {
                    return OneShotHybridEntropySource.this.entropySource;
                }
            }).setPersonalizationString(Strings.toByteArray("Bouncy Castle Hybrid Entropy Source")).buildHMAC(new HMac(new SHA512Digest()), oneShotSignallingEntropySource.getEntropy(), false);
        }

        @Override // org.bouncycastle.crypto.prng.EntropySource
        public int entropySize() {
            return this.bytesRequired * 8;
        }

        @Override // org.bouncycastle.crypto.prng.EntropySource
        public byte[] getEntropy() {
            byte[] bArr = new byte[this.bytesRequired];
            if (this.samples.getAndIncrement() > 1024) {
                if (this.seedAvailable.getAndSet(false)) {
                    this.samples.set(0);
                    this.drbg.reseed(this.additionalInput);
                } else {
                    this.entropySource.schedule();
                }
            }
            this.drbg.nextBytes(bArr);
            return bArr;
        }

        @Override // org.bouncycastle.crypto.prng.EntropySource
        public boolean isPredictionResistant() {
            return true;
        }
    }

    public static class URLSeededEntropySourceProvider implements EntropySourceProvider {
        private final InputStream seedStream;

        public URLSeededEntropySourceProvider(final URL url) {
            this.seedStream = (InputStream) AccessController.doPrivileged(new PrivilegedAction<InputStream>() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.URLSeededEntropySourceProvider.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.security.PrivilegedAction
                public InputStream run() {
                    try {
                        return url.openStream();
                    } catch (IOException unused) {
                        throw new IllegalStateException("unable to open random source");
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int privilegedRead(final byte[] bArr, final int i10, final int i11) {
            return ((Integer) AccessController.doPrivileged(new PrivilegedAction<Integer>() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.URLSeededEntropySourceProvider.2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.security.PrivilegedAction
                public Integer run() {
                    try {
                        return Integer.valueOf(URLSeededEntropySourceProvider.this.seedStream.read(bArr, i10, i11));
                    } catch (IOException unused) {
                        throw new InternalError("unable to read random source");
                    }
                }
            })).intValue();
        }

        @Override // org.bouncycastle.crypto.prng.EntropySourceProvider
        public EntropySource get(int i10) {
            return new IncrementalEntropySource(i10) { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.URLSeededEntropySourceProvider.3
                private final int numBytes;
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
                    return true;
                }

                @Override // org.bouncycastle.jcajce.provider.drbg.IncrementalEntropySource
                public byte[] getEntropy(long j10) throws InterruptedException {
                    int i11 = this.numBytes;
                    byte[] bArr = new byte[i11];
                    int i12 = 0;
                    while (i12 != i11) {
                        int iPrivilegedRead = URLSeededEntropySourceProvider.this.privilegedRead(bArr, i12, i11 - i12);
                        if (iPrivilegedRead <= -1) {
                            break;
                        }
                        i12 += iPrivilegedRead;
                        DRBG.sleep(j10);
                    }
                    if (i12 == i11) {
                        return bArr;
                    }
                    throw new InternalError("unable to fully read random source");
                }
            };
        }
    }

    static {
        entropyDaemon = null;
        entropyDaemon = new EntropyDaemon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SecureRandom createBaseRandom(boolean z10) {
        if (Properties.getPropertyValue("org.bouncycastle.drbg.entropysource") != null) {
            EntropySourceProvider entropySourceProviderCreateEntropySource = createEntropySource();
            EntropySource entropySource = entropySourceProviderCreateEntropySource.get(128);
            byte[] entropy = entropySource.getEntropy();
            return new SP800SecureRandomBuilder(entropySourceProviderCreateEntropySource).setPersonalizationString(z10 ? generateDefaultPersonalizationString(entropy) : generateNonceIVPersonalizationString(entropy)).buildHash(new SHA512Digest(), entropySource.getEntropy(), z10);
        }
        if (!Properties.isOverrideSet("org.bouncycastle.drbg.entropy_thread")) {
            OneShotHybridEntropySource oneShotHybridEntropySource = new OneShotHybridEntropySource(256);
            byte[] entropy2 = oneShotHybridEntropySource.getEntropy();
            return new SP800SecureRandomBuilder(new EntropySourceProvider() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.2
                @Override // org.bouncycastle.crypto.prng.EntropySourceProvider
                public EntropySource get(int i10) {
                    return new OneShotHybridEntropySource(i10);
                }
            }).setPersonalizationString(z10 ? generateDefaultPersonalizationString(entropy2) : generateNonceIVPersonalizationString(entropy2)).buildHash(new SHA512Digest(), oneShotHybridEntropySource.getEntropy(), z10);
        }
        synchronized (entropyDaemon) {
            try {
                if (entropyThread == null) {
                    Thread thread = new Thread(entropyDaemon, "BC Entropy Daemon");
                    entropyThread = thread;
                    thread.setDaemon(true);
                    entropyThread.start();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        HybridEntropySource hybridEntropySource = new HybridEntropySource(entropyDaemon, 256);
        byte[] entropy3 = hybridEntropySource.getEntropy();
        return new SP800SecureRandomBuilder(new EntropySourceProvider() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.1
            @Override // org.bouncycastle.crypto.prng.EntropySourceProvider
            public EntropySource get(int i10) {
                return new HybridEntropySource(DRBG.entropyDaemon, i10);
            }
        }).setPersonalizationString(z10 ? generateDefaultPersonalizationString(entropy3) : generateNonceIVPersonalizationString(entropy3)).buildHash(new SHA512Digest(), hybridEntropySource.getEntropy(), z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static EntropySourceProvider createCoreEntropySourceProvider() {
        String str = (String) AccessController.doPrivileged(new PrivilegedAction<String>() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.5
            @Override // java.security.PrivilegedAction
            public String run() {
                return Security.getProperty("securerandom.source");
            }
        });
        if (str == null) {
            return createInitialEntropySource();
        }
        try {
            return new URLSeededEntropySourceProvider(new URL(str));
        } catch (Exception unused) {
            return createInitialEntropySource();
        }
    }

    private static EntropySourceProvider createEntropySource() {
        final String propertyValue = Properties.getPropertyValue("org.bouncycastle.drbg.entropysource");
        return (EntropySourceProvider) AccessController.doPrivileged(new PrivilegedAction<EntropySourceProvider>() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.6
            @Override // java.security.PrivilegedAction
            public EntropySourceProvider run() {
                try {
                    return (EntropySourceProvider) ClassUtil.loadClass(DRBG.class, propertyValue).newInstance();
                } catch (Exception e10) {
                    throw new IllegalStateException("entropy source " + propertyValue + " not created: " + e10.getMessage(), e10);
                }
            }
        });
    }

    private static EntropySourceProvider createInitialEntropySource() {
        return ((Boolean) AccessController.doPrivileged(new PrivilegedAction<Boolean>() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.security.PrivilegedAction
            public Boolean run() {
                try {
                    return Boolean.valueOf(SecureRandom.class.getMethod("getInstanceStrong", null) != null);
                } catch (Exception unused) {
                    return Boolean.FALSE;
                }
            }
        })).booleanValue() ? new IncrementalEntropySourceProvider((SecureRandom) AccessController.doPrivileged(new PrivilegedAction<SecureRandom>() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.4
            @Override // java.security.PrivilegedAction
            public SecureRandom run() {
                try {
                    return (SecureRandom) SecureRandom.class.getMethod("getInstanceStrong", null).invoke(null, null);
                } catch (Exception unused) {
                    return new CoreSecureRandom(DRBG.findSource());
                }
            }
        }), true) : new IncrementalEntropySourceProvider(new CoreSecureRandom(findSource()), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] findSource() {
        char c10 = 0;
        int i10 = 0;
        while (true) {
            String[][] strArr = initialEntropySourceNames;
            if (i10 >= strArr.length) {
                return null;
            }
            String[] strArr2 = strArr[i10];
            try {
                return new Object[]{Class.forName(strArr2[c10]).newInstance(), Class.forName(strArr2[1]).newInstance()};
            } catch (Throwable unused) {
                i10++;
            }
        }
    }

    private static byte[] generateDefaultPersonalizationString(byte[] bArr) {
        return Arrays.concatenate(Strings.toByteArray("Default"), bArr, Pack.longToBigEndian(Thread.currentThread().getId()), Pack.longToBigEndian(System.currentTimeMillis()));
    }

    private static byte[] generateNonceIVPersonalizationString(byte[] bArr) {
        return Arrays.concatenate(Strings.toByteArray("Nonce"), bArr, Pack.longToLittleEndian(Thread.currentThread().getId()), Pack.longToLittleEndian(System.currentTimeMillis()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sleep(long j10) throws InterruptedException {
        if (j10 != 0) {
            Thread.sleep(j10);
        }
    }
}
