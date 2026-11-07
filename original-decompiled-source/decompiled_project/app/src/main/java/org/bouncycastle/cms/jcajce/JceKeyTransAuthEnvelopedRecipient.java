package org.bouncycastle.cms.jcajce;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.Cipher;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.cms.InputStreamWithMAC;
import org.bouncycastle.cms.RecipientOperator;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.jcajce.io.CipherInputStream;
import org.bouncycastle.operator.InputAEADDecryptor;

/* loaded from: classes2.dex */
public class JceKeyTransAuthEnvelopedRecipient extends JceKeyTransRecipient {

    public static class AADStream extends OutputStream {
        private Cipher cipher;
        private byte[] oneByte = new byte[1];

        public AADStream(Cipher cipher) {
            this.cipher = cipher;
        }

        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
            byte[] bArr = this.oneByte;
            bArr[0] = (byte) i10;
            this.cipher.updateAAD(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            this.cipher.updateAAD(bArr, i10, i11);
        }
    }

    public JceKeyTransAuthEnvelopedRecipient(PrivateKey privateKey) {
        super(privateKey);
    }

    @Override // org.bouncycastle.cms.KeyTransRecipient
    public RecipientOperator getRecipientOperator(AlgorithmIdentifier algorithmIdentifier, final AlgorithmIdentifier algorithmIdentifier2, byte[] bArr) throws IllegalStateException, DataLengthException, InvalidKeySpecException, CMSException, NoSuchAlgorithmException, InvalidKeyException, IllegalArgumentException, InvalidAlgorithmParameterException {
        final Cipher cipherCreateContentCipher = this.contentHelper.createContentCipher(extractSecretKey(algorithmIdentifier, algorithmIdentifier2, bArr), algorithmIdentifier2);
        return new RecipientOperator(new InputAEADDecryptor() { // from class: org.bouncycastle.cms.jcajce.JceKeyTransAuthEnvelopedRecipient.1
            private InputStream inputStream;

            @Override // org.bouncycastle.operator.AADProcessor
            public OutputStream getAADStream() {
                return new AADStream(cipherCreateContentCipher);
            }

            @Override // org.bouncycastle.operator.InputDecryptor
            public AlgorithmIdentifier getAlgorithmIdentifier() {
                return algorithmIdentifier2;
            }

            @Override // org.bouncycastle.operator.InputDecryptor
            public InputStream getInputStream(InputStream inputStream) {
                this.inputStream = inputStream;
                return new CipherInputStream(inputStream, cipherCreateContentCipher);
            }

            @Override // org.bouncycastle.operator.AADProcessor
            public byte[] getMAC() {
                InputStream inputStream = this.inputStream;
                if (inputStream instanceof InputStreamWithMAC) {
                    return ((InputStreamWithMAC) inputStream).getMAC();
                }
                return null;
            }
        });
    }
}
