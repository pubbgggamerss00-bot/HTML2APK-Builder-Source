package com.android.apksig.internal.util;

import android.util.Base64;
import com.android.apksig.internal.asn1.Asn1BerParser;
import com.android.apksig.internal.asn1.Asn1DecodingException;
import com.android.apksig.internal.asn1.Asn1DerEncoder;
import com.android.apksig.internal.asn1.Asn1EncodingException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
public class X509CertificateUtils {
    public static final byte[] BEGIN_CERT_HEADER = "-----BEGIN CERTIFICATE-----".getBytes();
    public static final byte[] END_CERT_FOOTER = "-----END CERTIFICATE-----".getBytes();
    private static CertificateFactory sCertFactory;

    private static void buildCertFactory() {
        if (sCertFactory != null) {
            return;
        }
        try {
            sCertFactory = CertificateFactory.getInstance("X.509");
        } catch (CertificateException e10) {
            throw new RuntimeException("Failed to create X.509 CertificateFactory", e10);
        }
    }

    public static X509Certificate generateCertificate(InputStream inputStream) throws CertificateException {
        try {
            return generateCertificate(ByteStreams.toByteArray(inputStream));
        } catch (IOException e10) {
            throw new CertificateException("Failed to parse certificate", e10);
        }
    }

    public static Collection<? extends Certificate> generateCertificates(InputStream inputStream) throws CertificateException {
        if (sCertFactory == null) {
            buildCertFactory();
        }
        return generateCertificates(inputStream, sCertFactory);
    }

    private static ByteBuffer getNextDEREncodedCertificateBlock(ByteBuffer byteBuffer) throws CertificateException {
        char c10;
        if (byteBuffer == null) {
            throw new NullPointerException("The certificateBuffer cannot be null");
        }
        if (byteBuffer.remaining() < BEGIN_CERT_HEADER.length) {
            return byteBuffer;
        }
        byteBuffer.mark();
        int i10 = 0;
        while (true) {
            byte[] bArr = BEGIN_CERT_HEADER;
            if (i10 >= bArr.length) {
                StringBuilder sb = new StringBuilder();
                while (byteBuffer.hasRemaining() && (c10 = (char) byteBuffer.get()) != '-') {
                    if (!Character.isWhitespace(c10)) {
                        sb.append(c10);
                    }
                }
                int i11 = 1;
                while (true) {
                    byte[] bArr2 = END_CERT_FOOTER;
                    if (i11 >= bArr2.length) {
                        byte[] bArrDecode = Base64.decode(sb.toString(), 2);
                        int iPosition = byteBuffer.position();
                        while (byteBuffer.hasRemaining() && Character.isWhitespace((char) byteBuffer.get())) {
                            iPosition++;
                        }
                        byteBuffer.position(iPosition);
                        return ByteBuffer.wrap(bArrDecode);
                    }
                    if (!byteBuffer.hasRemaining()) {
                        throw new CertificateException("The provided input contains the PEM certificate header but does not contain sufficient data for the footer");
                    }
                    if (byteBuffer.get() != bArr2[i11]) {
                        throw new CertificateException("The provided input contains the PEM certificate header without a valid certificate footer");
                    }
                    i11++;
                }
            } else {
                if (byteBuffer.get() != bArr[i10]) {
                    byteBuffer.reset();
                    return byteBuffer;
                }
                i10++;
            }
        }
    }

    public static X509Certificate generateCertificate(byte[] bArr) throws CertificateException {
        if (sCertFactory == null) {
            buildCertFactory();
        }
        return generateCertificate(bArr, sCertFactory);
    }

    public static Collection<? extends Certificate> generateCertificates(InputStream inputStream, CertificateFactory certificateFactory) throws CertificateException {
        try {
            byte[] byteArray = ByteStreams.toByteArray(inputStream);
            try {
                try {
                    return certificateFactory.generateCertificates(new ByteArrayInputStream(byteArray));
                } catch (Asn1DecodingException | Asn1EncodingException e10) {
                    throw new CertificateException("Failed to parse certificates", e10);
                }
            } catch (CertificateException unused) {
                ArrayList arrayList = new ArrayList(1);
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(byteArray);
                while (byteBufferWrap.hasRemaining()) {
                    ByteBuffer nextDEREncodedCertificateBlock = getNextDEREncodedCertificateBlock(byteBufferWrap);
                    int iPosition = nextDEREncodedCertificateBlock.position();
                    X509Certificate x509Certificate = (X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(Asn1DerEncoder.encode((com.android.apksig.internal.x509.Certificate) Asn1BerParser.parse(nextDEREncodedCertificateBlock, com.android.apksig.internal.x509.Certificate.class))));
                    byte[] bArr = new byte[nextDEREncodedCertificateBlock.position() - iPosition];
                    nextDEREncodedCertificateBlock.position(iPosition);
                    nextDEREncodedCertificateBlock.get(bArr);
                    arrayList.add(new GuaranteedEncodedFormX509Certificate(x509Certificate, bArr));
                }
                return arrayList;
            }
        } catch (IOException e11) {
            throw new CertificateException("Failed to read the input stream", e11);
        }
    }

    public static X509Certificate generateCertificate(byte[] bArr, CertificateFactory certificateFactory) throws CertificateException {
        try {
            try {
                return (X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArr));
            } catch (Asn1DecodingException | Asn1EncodingException | CertificateException e10) {
                throw new CertificateException("Failed to parse certificate", e10);
            }
        } catch (CertificateException unused) {
            ByteBuffer nextDEREncodedCertificateBlock = getNextDEREncodedCertificateBlock(ByteBuffer.wrap(bArr));
            int iPosition = nextDEREncodedCertificateBlock.position();
            X509Certificate x509Certificate = (X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(Asn1DerEncoder.encode((com.android.apksig.internal.x509.Certificate) Asn1BerParser.parse(nextDEREncodedCertificateBlock, com.android.apksig.internal.x509.Certificate.class))));
            byte[] bArr2 = new byte[nextDEREncodedCertificateBlock.position() - iPosition];
            nextDEREncodedCertificateBlock.position(iPosition);
            nextDEREncodedCertificateBlock.get(bArr2);
            return new GuaranteedEncodedFormX509Certificate(x509Certificate, bArr2);
        }
    }
}
