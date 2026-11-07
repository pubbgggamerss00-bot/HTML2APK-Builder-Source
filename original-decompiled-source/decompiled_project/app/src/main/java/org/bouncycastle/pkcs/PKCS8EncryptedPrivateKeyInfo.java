package org.bouncycastle.pkcs;

import i8.n;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import k4.i;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.operator.InputDecryptorProvider;
import org.bouncycastle.util.io.Streams;

/* loaded from: classes3.dex */
public class PKCS8EncryptedPrivateKeyInfo {
    private EncryptedPrivateKeyInfo encryptedPrivateKeyInfo;

    public PKCS8EncryptedPrivateKeyInfo(EncryptedPrivateKeyInfo encryptedPrivateKeyInfo) {
        this.encryptedPrivateKeyInfo = encryptedPrivateKeyInfo;
    }

    private static EncryptedPrivateKeyInfo parseBytes(byte[] bArr) throws IOException {
        try {
            return EncryptedPrivateKeyInfo.getInstance(ASN1Primitive.fromByteArray(bArr));
        } catch (ClassCastException e10) {
            throw new PKCSIOException("malformed data: " + e10.getMessage(), e10);
        } catch (IllegalArgumentException e11) {
            throw new PKCSIOException(n.c(e11, new StringBuilder("malformed data: ")), e11);
        }
    }

    public PrivateKeyInfo decryptPrivateKeyInfo(InputDecryptorProvider inputDecryptorProvider) throws PKCSException {
        try {
            return PrivateKeyInfo.getInstance(Streams.readAll(inputDecryptorProvider.get(this.encryptedPrivateKeyInfo.getEncryptionAlgorithm()).getInputStream(new ByteArrayInputStream(this.encryptedPrivateKeyInfo.getEncryptedData()))));
        } catch (Exception e10) {
            throw new PKCSException(i.a(e10, new StringBuilder("unable to read encrypted data: ")), e10);
        }
    }

    public byte[] getEncoded() throws IOException {
        return this.encryptedPrivateKeyInfo.getEncoded();
    }

    public byte[] getEncryptedData() {
        return this.encryptedPrivateKeyInfo.getEncryptedData();
    }

    public AlgorithmIdentifier getEncryptionAlgorithm() {
        return this.encryptedPrivateKeyInfo.getEncryptionAlgorithm();
    }

    public EncryptedPrivateKeyInfo toASN1Structure() {
        return this.encryptedPrivateKeyInfo;
    }

    public PKCS8EncryptedPrivateKeyInfo(byte[] bArr) throws IOException {
        this(parseBytes(bArr));
    }
}
