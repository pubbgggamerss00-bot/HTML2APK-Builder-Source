package org.bouncycastle.operator.jcajce;

import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Provider;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.operator.DigestCalculatorProvider;
import org.bouncycastle.operator.OperatorCreationException;

/* loaded from: classes3.dex */
public class JcaDigestCalculatorProviderBuilder {
    private OperatorHelper helper = new OperatorHelper(new DefaultJcaJceHelper());

    public static class DigestOutputStream extends OutputStream {
        private MessageDigest dig;

        public DigestOutputStream(MessageDigest messageDigest) {
            this.dig = messageDigest;
        }

        public byte[] getDigest() {
            return this.dig.digest();
        }

        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
            this.dig.update((byte) i10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.dig.update(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            this.dig.update(bArr, i10, i11);
        }
    }

    public DigestCalculatorProvider build() throws OperatorCreationException {
        return new DigestCalculatorProvider() { // from class: org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder.1
            @Override // org.bouncycastle.operator.DigestCalculatorProvider
            public DigestCalculator get(final AlgorithmIdentifier algorithmIdentifier) throws OperatorCreationException {
                try {
                    final DigestOutputStream digestOutputStream = new DigestOutputStream(JcaDigestCalculatorProviderBuilder.this.helper.createDigest(algorithmIdentifier));
                    return new DigestCalculator() { // from class: org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder.1.1
                        @Override // org.bouncycastle.operator.DigestCalculator
                        public AlgorithmIdentifier getAlgorithmIdentifier() {
                            return algorithmIdentifier;
                        }

                        @Override // org.bouncycastle.operator.DigestCalculator
                        public byte[] getDigest() {
                            return digestOutputStream.getDigest();
                        }

                        @Override // org.bouncycastle.operator.DigestCalculator
                        public OutputStream getOutputStream() {
                            return digestOutputStream;
                        }
                    };
                } catch (GeneralSecurityException e10) {
                    throw new OperatorCreationException("exception on setup: " + e10, e10);
                }
            }
        };
    }

    public JcaDigestCalculatorProviderBuilder setHelper(JcaJceHelper jcaJceHelper) {
        this.helper = new OperatorHelper(jcaJceHelper);
        return this;
    }

    public JcaDigestCalculatorProviderBuilder setProvider(String str) {
        this.helper = new OperatorHelper(new NamedJcaJceHelper(str));
        return this;
    }

    public JcaDigestCalculatorProviderBuilder setProvider(Provider provider) {
        this.helper = new OperatorHelper(new ProviderJcaJceHelper(provider));
        return this;
    }
}
