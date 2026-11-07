package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;
import java.util.Hashtable;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.generators.DSAKeyPairGenerator;
import org.bouncycastle.crypto.generators.DSAParametersGenerator;
import org.bouncycastle.crypto.params.DSAKeyGenerationParameters;
import org.bouncycastle.crypto.params.DSAParameterGenerationParameters;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAPrivateKeyParameters;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Properties;

/* loaded from: classes.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {
    DSAKeyPairGenerator engine;
    boolean initialised;
    DSAKeyGenerationParameters param;
    SecureRandom random;
    int strength;
    private static Hashtable params = new Hashtable();
    private static Object lock = new Object();

    public KeyPairGeneratorSpi() {
        super("DSA");
        this.engine = new DSAKeyPairGenerator();
        this.strength = 2048;
        this.random = CryptoServicesRegistrar.getSecureRandom();
        this.initialised = false;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        DSAParametersGenerator dSAParametersGenerator;
        int i10;
        if (!this.initialised) {
            Integer numValueOf = Integers.valueOf(this.strength);
            if (params.containsKey(numValueOf)) {
                this.param = (DSAKeyGenerationParameters) params.get(numValueOf);
            } else {
                synchronized (lock) {
                    try {
                        if (params.containsKey(numValueOf)) {
                            this.param = (DSAKeyGenerationParameters) params.get(numValueOf);
                        } else {
                            int defaultCertainty = PrimeCertaintyCalculator.getDefaultCertainty(this.strength);
                            int i11 = this.strength;
                            if (i11 == 1024) {
                                dSAParametersGenerator = new DSAParametersGenerator();
                                if (Properties.isOverrideSet("org.bouncycastle.dsa.FIPS186-2for1024bits")) {
                                    i10 = this.strength;
                                    dSAParametersGenerator.init(i10, defaultCertainty, this.random);
                                    DSAKeyGenerationParameters dSAKeyGenerationParameters = new DSAKeyGenerationParameters(this.random, dSAParametersGenerator.generateParameters());
                                    this.param = dSAKeyGenerationParameters;
                                    params.put(numValueOf, dSAKeyGenerationParameters);
                                } else {
                                    dSAParametersGenerator.init(new DSAParameterGenerationParameters(1024, 160, defaultCertainty, this.random));
                                    DSAKeyGenerationParameters dSAKeyGenerationParameters2 = new DSAKeyGenerationParameters(this.random, dSAParametersGenerator.generateParameters());
                                    this.param = dSAKeyGenerationParameters2;
                                    params.put(numValueOf, dSAKeyGenerationParameters2);
                                }
                            } else if (i11 > 1024) {
                                DSAParameterGenerationParameters dSAParameterGenerationParameters = new DSAParameterGenerationParameters(i11, 256, defaultCertainty, this.random);
                                dSAParametersGenerator = new DSAParametersGenerator(SHA256Digest.newInstance());
                                dSAParametersGenerator.init(dSAParameterGenerationParameters);
                                DSAKeyGenerationParameters dSAKeyGenerationParameters22 = new DSAKeyGenerationParameters(this.random, dSAParametersGenerator.generateParameters());
                                this.param = dSAKeyGenerationParameters22;
                                params.put(numValueOf, dSAKeyGenerationParameters22);
                            } else {
                                dSAParametersGenerator = new DSAParametersGenerator();
                                i10 = this.strength;
                                dSAParametersGenerator.init(i10, defaultCertainty, this.random);
                                DSAKeyGenerationParameters dSAKeyGenerationParameters222 = new DSAKeyGenerationParameters(this.random, dSAParametersGenerator.generateParameters());
                                this.param = dSAKeyGenerationParameters222;
                                params.put(numValueOf, dSAKeyGenerationParameters222);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            this.engine.init(this.param);
            this.initialised = true;
        }
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = this.engine.generateKeyPair();
        return new KeyPair(new BCDSAPublicKey((DSAPublicKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic()), new BCDSAPrivateKey((DSAPrivateKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i10, SecureRandom secureRandom) {
        boolean z10;
        if (i10 < 512 || i10 > 4096 || ((i10 < 1024 && i10 % 64 != 0) || (i10 >= 1024 && i10 % 1024 != 0))) {
            throw new InvalidParameterException("strength must be from 512 - 4096 and a multiple of 1024 above 1024");
        }
        DSAParameterSpec dSADefaultParameters = BouncyCastleProvider.CONFIGURATION.getDSADefaultParameters(i10);
        if (dSADefaultParameters != null) {
            DSAKeyGenerationParameters dSAKeyGenerationParameters = new DSAKeyGenerationParameters(secureRandom, new DSAParameters(dSADefaultParameters.getP(), dSADefaultParameters.getQ(), dSADefaultParameters.getG()));
            this.param = dSAKeyGenerationParameters;
            this.engine.init(dSAKeyGenerationParameters);
            z10 = true;
        } else {
            this.strength = i10;
            this.random = secureRandom;
            z10 = false;
        }
        this.initialised = z10;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof DSAParameterSpec)) {
            throw new InvalidAlgorithmParameterException("parameter object not a DSAParameterSpec");
        }
        DSAParameterSpec dSAParameterSpec = (DSAParameterSpec) algorithmParameterSpec;
        DSAKeyGenerationParameters dSAKeyGenerationParameters = new DSAKeyGenerationParameters(secureRandom, new DSAParameters(dSAParameterSpec.getP(), dSAParameterSpec.getQ(), dSAParameterSpec.getG()));
        this.param = dSAKeyGenerationParameters;
        this.engine.init(dSAKeyGenerationParameters);
        this.initialised = true;
    }
}
