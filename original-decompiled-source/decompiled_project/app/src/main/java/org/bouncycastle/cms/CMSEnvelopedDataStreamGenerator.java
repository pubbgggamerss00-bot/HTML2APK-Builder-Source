package org.bouncycastle.cms;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.BERSequenceGenerator;
import org.bouncycastle.asn1.DLSet;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.cms.EnvelopedData;
import org.bouncycastle.operator.OutputAEADEncryptor;
import org.bouncycastle.operator.OutputEncryptor;

/* loaded from: classes2.dex */
public class CMSEnvelopedDataStreamGenerator extends CMSEnvelopedGenerator {
    private boolean _berEncodeRecipientSet;
    private int _bufferSize;

    public class CmsEnvelopedDataOutputStream extends OutputStream {
        private BERSequenceGenerator _cGen;
        private final OutputStream _cOut;
        private BERSequenceGenerator _eiGen;
        private final OutputEncryptor _encryptor;
        private BERSequenceGenerator _envGen;
        private OutputStream _octetStream;

        public CmsEnvelopedDataOutputStream(OutputEncryptor outputEncryptor, OutputStream outputStream, BERSequenceGenerator bERSequenceGenerator, BERSequenceGenerator bERSequenceGenerator2, BERSequenceGenerator bERSequenceGenerator3) {
            this._encryptor = outputEncryptor;
            this._octetStream = outputStream;
            this._cOut = outputEncryptor.getOutputStream(outputStream);
            this._cGen = bERSequenceGenerator;
            this._envGen = bERSequenceGenerator2;
            this._eiGen = bERSequenceGenerator3;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this._cOut.close();
            OutputEncryptor outputEncryptor = this._encryptor;
            if (outputEncryptor instanceof OutputAEADEncryptor) {
                this._octetStream.write(((OutputAEADEncryptor) outputEncryptor).getMAC());
                this._octetStream.close();
            }
            this._eiGen.close();
            CMSUtils.addAttriSetToGenerator(this._envGen, CMSEnvelopedDataStreamGenerator.this.unprotectedAttributeGenerator, 1, Collections.EMPTY_MAP);
            this._envGen.close();
            this._cGen.close();
        }

        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
            this._cOut.write(i10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this._cOut.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            this._cOut.write(bArr, i10, i11);
        }
    }

    private OutputStream doOpen(ASN1ObjectIdentifier aSN1ObjectIdentifier, OutputStream outputStream, OutputEncryptor outputEncryptor) throws CMSException, IOException {
        return open(aSN1ObjectIdentifier, outputStream, CMSUtils.getRecipentInfos(outputEncryptor.getKey(), this.recipientInfoGenerators), outputEncryptor);
    }

    private ASN1Integer getVersion(ASN1EncodableVector aSN1EncodableVector) {
        return this.unprotectedAttributeGenerator != null ? new ASN1Integer(EnvelopedData.calculateVersion(this.originatorInfo, new DLSet(aSN1EncodableVector), new DLSet())) : new ASN1Integer(EnvelopedData.calculateVersion(this.originatorInfo, new DLSet(aSN1EncodableVector), null));
    }

    public OutputStream open(OutputStream outputStream, ASN1EncodableVector aSN1EncodableVector, OutputEncryptor outputEncryptor) throws CMSException {
        try {
            return open(CMSObjectIdentifiers.data, outputStream, aSN1EncodableVector, outputEncryptor);
        } catch (IOException e10) {
            throw new CMSException("exception decoding algorithm parameters.", e10);
        }
    }

    public void setBEREncodeRecipients(boolean z10) {
        this._berEncodeRecipientSet = z10;
    }

    public void setBufferSize(int i10) {
        this._bufferSize = i10;
    }

    public OutputStream open(OutputStream outputStream, OutputEncryptor outputEncryptor) throws CMSException, IOException {
        return doOpen(new ASN1ObjectIdentifier(CMSObjectIdentifiers.data.getId()), outputStream, outputEncryptor);
    }

    public OutputStream open(ASN1ObjectIdentifier aSN1ObjectIdentifier, OutputStream outputStream, ASN1EncodableVector aSN1EncodableVector, OutputEncryptor outputEncryptor) throws IOException {
        BERSequenceGenerator bERSequenceGenerator = new BERSequenceGenerator(outputStream);
        bERSequenceGenerator.addObject((ASN1Primitive) CMSObjectIdentifiers.envelopedData);
        BERSequenceGenerator bERSequenceGenerator2 = new BERSequenceGenerator(bERSequenceGenerator.getRawOutputStream(), 0, true);
        bERSequenceGenerator2.addObject((ASN1Primitive) getVersion(aSN1EncodableVector));
        CMSUtils.addOriginatorInfoToGenerator(bERSequenceGenerator2, this.originatorInfo);
        CMSUtils.addRecipientInfosToGenerator(aSN1EncodableVector, bERSequenceGenerator2, this._berEncodeRecipientSet);
        BERSequenceGenerator bERSequenceGenerator3 = new BERSequenceGenerator(bERSequenceGenerator2.getRawOutputStream());
        bERSequenceGenerator3.addObject((ASN1Primitive) aSN1ObjectIdentifier);
        bERSequenceGenerator3.getRawOutputStream().write(outputEncryptor.getAlgorithmIdentifier().getEncoded());
        return new CmsEnvelopedDataOutputStream(outputEncryptor, CMSUtils.createBEROctetOutputStream(bERSequenceGenerator3.getRawOutputStream(), 0, false, this._bufferSize), bERSequenceGenerator, bERSequenceGenerator2, bERSequenceGenerator3);
    }

    public OutputStream open(ASN1ObjectIdentifier aSN1ObjectIdentifier, OutputStream outputStream, OutputEncryptor outputEncryptor) throws CMSException, IOException {
        return doOpen(aSN1ObjectIdentifier, outputStream, outputEncryptor);
    }
}
