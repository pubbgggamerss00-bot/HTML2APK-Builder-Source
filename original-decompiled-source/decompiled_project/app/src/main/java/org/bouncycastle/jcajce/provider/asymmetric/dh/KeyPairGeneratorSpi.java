package org.bouncycastle.jcajce.provider.asymmetric.dh;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Hashtable;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.generators.DHBasicKeyPairGenerator;
import org.bouncycastle.crypto.generators.DHParametersGenerator;
import org.bouncycastle.crypto.params.DHKeyGenerationParameters;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPrivateKeyParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;
import org.bouncycastle.jcajce.spec.DHDomainParameterSpec;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.Integers;

/* loaded from: classes.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {
    DHBasicKeyPairGenerator engine;
    boolean initialised;
    DHKeyGenerationParameters param;
    SecureRandom random;
    int strength;
    private static Hashtable params = new Hashtable();
    private static Object lock = new Object();

    public KeyPairGeneratorSpi() {
        super("DH");
        this.engine = new DHBasicKeyPairGenerator();
        this.strength = 2048;
        this.random = CryptoServicesRegistrar.getSecureRandom();
        this.initialised = false;
    }

    private DHKeyGenerationParameters convertParams(SecureRandom secureRandom, DHParameterSpec dHParameterSpec) {
        return dHParameterSpec instanceof DHDomainParameterSpec ? new DHKeyGenerationParameters(secureRandom, ((DHDomainParameterSpec) dHParameterSpec).getDomainParameters()) : new DHKeyGenerationParameters(secureRandom, new DHParameters(dHParameterSpec.getP(), dHParameterSpec.getG(), null, dHParameterSpec.getL()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        DHKeyGenerationParameters dHKeyGenerationParametersConvertParams;
        if (!this.initialised) {
            Integer numValueOf = Integers.valueOf(this.strength);
            if (params.containsKey(numValueOf)) {
                dHKeyGenerationParametersConvertParams = (DHKeyGenerationParameters) params.get(numValueOf);
            } else {
                DHParameterSpec dHDefaultParameters = BouncyCastleProvider.CONFIGURATION.getDHDefaultParameters(this.strength);
                if (dHDefaultParameters != null) {
                    dHKeyGenerationParametersConvertParams = convertParams(this.random, dHDefaultParameters);
                } else {
                    synchronized (lock) {
                        try {
                            if (params.containsKey(numValueOf)) {
                                this.param = (DHKeyGenerationParameters) params.get(numValueOf);
                            } else {
                                DHParametersGenerator dHParametersGenerator = new DHParametersGenerator();
                                int i10 = this.strength;
                                dHParametersGenerator.init(i10, PrimeCertaintyCalculator.getDefaultCertainty(i10), this.random);
                                DHKeyGenerationParameters dHKeyGenerationParameters = new DHKeyGenerationParameters(this.random, dHParametersGenerator.generateParameters());
                                this.param = dHKeyGenerationParameters;
                                params.put(numValueOf, dHKeyGenerationParameters);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    this.engine.init(this.param);
                    this.initialised = true;
                }
            }
            this.param = dHKeyGenerationParametersConvertParams;
            this.engine.init(this.param);
            this.initialised = true;
        }
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = this.engine.generateKeyPair();
        return new KeyPair(new BCDHPublicKey((DHPublicKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic()), new BCDHPrivateKey((DHPrivateKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i10, SecureRandom secureRandom) {
        this.strength = i10;
        this.random = secureRandom;
        this.initialised = false;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof DHParameterSpec)) {
            throw new InvalidAlgorithmParameterException("parameter object not a DHParameterSpec");
        }
        try {
            DHKeyGenerationParameters dHKeyGenerationParametersConvertParams = convertParams(secureRandom, (DHParameterSpec) algorithmParameterSpec);
            this.param = dHKeyGenerationParametersConvertParams;
            this.engine.init(dHKeyGenerationParametersConvertParams);
            this.initialised = true;
        } catch (IllegalArgumentException e10) {
            throw new InvalidAlgorithmParameterException(e10.getMessage(), e10);
        }
    }
}
