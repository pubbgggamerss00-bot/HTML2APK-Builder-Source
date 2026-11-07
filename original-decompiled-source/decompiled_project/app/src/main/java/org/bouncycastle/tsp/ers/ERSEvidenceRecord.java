package org.bouncycastle.tsp.ers;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import k4.i;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.cms.SignedData;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.tsp.ArchiveTimeStamp;
import org.bouncycastle.asn1.tsp.ArchiveTimeStampChain;
import org.bouncycastle.asn1.tsp.EvidenceRecord;
import org.bouncycastle.asn1.tsp.TSTInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cms.SignerInformationVerifier;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.operator.DigestCalculatorProvider;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.tsp.TSPException;
import org.bouncycastle.tsp.TimeStampRequest;
import org.bouncycastle.tsp.TimeStampRequestGenerator;
import org.bouncycastle.tsp.TimeStampResponse;
import org.bouncycastle.util.io.Streams;

/* loaded from: classes3.dex */
public class ERSEvidenceRecord {
    private final DigestCalculator digCalc;
    private final DigestCalculatorProvider digestCalculatorProvider;
    private final EvidenceRecord evidenceRecord;
    private final ERSArchiveTimeStamp firstArchiveTimeStamp;
    private final ERSArchiveTimeStamp lastArchiveTimeStamp;
    private final byte[] previousChainsDigest;
    private final ArchiveTimeStamp primaryArchiveTimeStamp;

    public ERSEvidenceRecord(InputStream inputStream, DigestCalculatorProvider digestCalculatorProvider) throws ERSException, TSPException, IOException {
        this(EvidenceRecord.getInstance(Streams.readAll(inputStream)), digestCalculatorProvider);
    }

    private ERSArchiveTimeStampGenerator buildTspRenewalGenerator() throws ERSException {
        try {
            DigestCalculator digestCalculator = this.digestCalculatorProvider.get(this.lastArchiveTimeStamp.getDigestAlgorithmIdentifier());
            ArchiveTimeStamp[] archiveTimeStamps = getArchiveTimeStamps();
            if (!digestCalculator.getAlgorithmIdentifier().equals(archiveTimeStamps[0].getDigestAlgorithmIdentifier())) {
                throw new ERSException("digest mismatch for timestamp renewal");
            }
            ERSArchiveTimeStampGenerator eRSArchiveTimeStampGenerator = new ERSArchiveTimeStampGenerator(digestCalculator);
            ArrayList arrayList = new ArrayList(archiveTimeStamps.length);
            for (int i10 = 0; i10 != archiveTimeStamps.length; i10++) {
                try {
                    arrayList.add(new ERSByteData(archiveTimeStamps[i10].getTimeStamp().getEncoded(ASN1Encoding.DER)));
                } catch (IOException e10) {
                    throw new ERSException("unable to process previous ArchiveTimeStamps", e10);
                }
            }
            eRSArchiveTimeStampGenerator.addData(new ERSDataGroup(arrayList));
            return eRSArchiveTimeStampGenerator;
        } catch (OperatorCreationException e11) {
            throw new ERSException(e11.getMessage(), e11);
        }
    }

    private TSTInfo extractTimeStamp(ContentInfo contentInfo) throws TSPException {
        SignedData signedData = SignedData.getInstance(contentInfo.getContent());
        if (signedData.getEncapContentInfo().getContentType().equals((ASN1Primitive) PKCSObjectIdentifiers.id_ct_TSTInfo)) {
            return TSTInfo.getInstance(ASN1OctetString.getInstance(signedData.getEncapContentInfo().getContent()).getOctets());
        }
        throw new TSPException("cannot parse time stamp");
    }

    private void validateChains(ArchiveTimeStampChain[] archiveTimeStampChainArr) throws ERSException, TSPException {
        for (int i10 = 0; i10 != archiveTimeStampChainArr.length; i10++) {
            ArchiveTimeStamp[] archiveTimestamps = archiveTimeStampChainArr[i10].getArchiveTimestamps();
            ArchiveTimeStamp archiveTimeStamp = archiveTimestamps[0];
            AlgorithmIdentifier digestAlgorithmIdentifier = archiveTimeStamp.getDigestAlgorithmIdentifier();
            int i11 = 1;
            while (i11 != archiveTimestamps.length) {
                ArchiveTimeStamp archiveTimeStamp2 = archiveTimestamps[i11];
                if (!digestAlgorithmIdentifier.equals(archiveTimeStamp2.getDigestAlgorithmIdentifier())) {
                    throw new ERSException("invalid digest algorithm in chain");
                }
                ContentInfo timeStamp = archiveTimeStamp2.getTimeStamp();
                if (!timeStamp.getContentType().equals((ASN1Primitive) CMSObjectIdentifiers.signedData)) {
                    throw new TSPException("cannot identify TSTInfo");
                }
                try {
                    new ERSArchiveTimeStamp(archiveTimeStamp2, this.digestCalculatorProvider.get(digestAlgorithmIdentifier)).validatePresent(new ERSByteData(archiveTimeStamp.getTimeStamp().getEncoded(ASN1Encoding.DER)), extractTimeStamp(timeStamp).getGenTime().getDate());
                    i11++;
                    archiveTimeStamp = archiveTimeStamp2;
                } catch (Exception e10) {
                    throw new ERSException(i.a(e10, new StringBuilder("invalid timestamp renewal found: ")), e10);
                }
            }
        }
    }

    public TimeStampRequest generateHashRenewalRequest(DigestCalculator digestCalculator, ERSData eRSData, TimeStampRequestGenerator timeStampRequestGenerator) throws ERSException, TSPException, IOException {
        return generateHashRenewalRequest(digestCalculator, eRSData, timeStampRequestGenerator, null);
    }

    public TimeStampRequest generateTimeStampRenewalRequest(TimeStampRequestGenerator timeStampRequestGenerator) throws ERSException, TSPException {
        return generateTimeStampRenewalRequest(timeStampRequestGenerator, null);
    }

    public ArchiveTimeStamp[] getArchiveTimeStamps() {
        return this.evidenceRecord.getArchiveTimeStampSequence().getArchiveTimeStampChains()[r0.length - 1].getArchiveTimestamps();
    }

    public DigestCalculatorProvider getDigestAlgorithmProvider() {
        return this.digestCalculatorProvider;
    }

    public byte[] getEncoded() throws IOException {
        return this.evidenceRecord.getEncoded();
    }

    public byte[] getPrimaryRootHash() throws ERSException, TSPException {
        ContentInfo timeStamp = this.primaryArchiveTimeStamp.getTimeStamp();
        if (timeStamp.getContentType().equals((ASN1Primitive) CMSObjectIdentifiers.signedData)) {
            return extractTimeStamp(timeStamp).getMessageImprint().getHashedMessage();
        }
        throw new ERSException("cannot identify TSTInfo for digest");
    }

    public X509CertificateHolder getSigningCertificate() {
        return this.lastArchiveTimeStamp.getSigningCertificate();
    }

    public boolean isContaining(ERSData eRSData, Date date) throws ERSException {
        return this.firstArchiveTimeStamp.isContaining(eRSData, date);
    }

    public boolean isRelatedTo(ERSEvidenceRecord eRSEvidenceRecord) {
        return this.primaryArchiveTimeStamp.getTimeStamp().equals(eRSEvidenceRecord.primaryArchiveTimeStamp.getTimeStamp());
    }

    public ERSEvidenceRecord renewHash(DigestCalculator digestCalculator, ERSData eRSData, TimeStampResponse timeStampResponse) throws ERSException, TSPException {
        try {
            this.firstArchiveTimeStamp.validatePresent(eRSData, new Date());
            try {
                ERSArchiveTimeStampGenerator eRSArchiveTimeStampGenerator = new ERSArchiveTimeStampGenerator(digestCalculator);
                eRSArchiveTimeStampGenerator.addData(eRSData);
                eRSArchiveTimeStampGenerator.addPreviousChains(this.evidenceRecord.getArchiveTimeStampSequence());
                return new ERSEvidenceRecord(this.evidenceRecord.addArchiveTimeStamp(eRSArchiveTimeStampGenerator.generateArchiveTimeStamp(timeStampResponse).toASN1Structure(), true), this.digestCalculatorProvider);
            } catch (IOException e10) {
                throw new ERSException(e10.getMessage(), e10);
            } catch (IllegalArgumentException e11) {
                throw new ERSException(e11.getMessage(), e11);
            }
        } catch (Exception unused) {
            throw new ERSException("attempt to hash renew on invalid data");
        }
    }

    public ERSEvidenceRecord renewTimeStamp(TimeStampResponse timeStampResponse) throws ERSException, TSPException {
        try {
            return new ERSEvidenceRecord(this.evidenceRecord.addArchiveTimeStamp(buildTspRenewalGenerator().generateArchiveTimeStamp(timeStampResponse).toASN1Structure(), false), this.digestCalculatorProvider);
        } catch (IllegalArgumentException e10) {
            throw new ERSException(e10.getMessage(), e10);
        }
    }

    public EvidenceRecord toASN1Structure() {
        return this.evidenceRecord;
    }

    public void validate(SignerInformationVerifier signerInformationVerifier) throws TSPException {
        if (this.firstArchiveTimeStamp != this.lastArchiveTimeStamp) {
            ArchiveTimeStamp[] archiveTimeStamps = getArchiveTimeStamps();
            for (int i10 = 0; i10 != archiveTimeStamps.length - 1; i10++) {
                try {
                    this.lastArchiveTimeStamp.validatePresent(new ERSByteData(archiveTimeStamps[i10].getTimeStamp().getEncoded(ASN1Encoding.DER)), this.lastArchiveTimeStamp.getGenTime());
                } catch (Exception e10) {
                    throw new TSPException("unable to process previous ArchiveTimeStamps", e10);
                }
            }
        }
        this.lastArchiveTimeStamp.validate(signerInformationVerifier);
    }

    public void validatePresent(ERSData eRSData, Date date) throws ERSException {
        this.firstArchiveTimeStamp.validatePresent(eRSData, date);
    }

    public ERSEvidenceRecord(EvidenceRecord evidenceRecord, DigestCalculatorProvider digestCalculatorProvider) throws ERSException, TSPException, IOException {
        this.evidenceRecord = evidenceRecord;
        this.digestCalculatorProvider = digestCalculatorProvider;
        ArchiveTimeStampChain[] archiveTimeStampChains = evidenceRecord.getArchiveTimeStampSequence().getArchiveTimeStampChains();
        this.primaryArchiveTimeStamp = archiveTimeStampChains[0].getArchiveTimestamps()[0];
        validateChains(archiveTimeStampChains);
        ArchiveTimeStamp[] archiveTimestamps = archiveTimeStampChains[archiveTimeStampChains.length - 1].getArchiveTimestamps();
        this.lastArchiveTimeStamp = new ERSArchiveTimeStamp(archiveTimestamps[archiveTimestamps.length - 1], digestCalculatorProvider);
        if (archiveTimeStampChains.length > 1) {
            try {
                ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
                for (int i10 = 0; i10 != archiveTimeStampChains.length - 1; i10++) {
                    aSN1EncodableVector.add(archiveTimeStampChains[i10]);
                }
                DigestCalculator digestCalculator = digestCalculatorProvider.get(this.lastArchiveTimeStamp.getDigestAlgorithmIdentifier());
                this.digCalc = digestCalculator;
                OutputStream outputStream = digestCalculator.getOutputStream();
                outputStream.write(new DERSequence(aSN1EncodableVector).getEncoded(ASN1Encoding.DER));
                outputStream.close();
                this.previousChainsDigest = digestCalculator.getDigest();
            } catch (Exception e10) {
                throw new ERSException(e10.getMessage(), e10);
            }
        } else {
            this.digCalc = null;
            this.previousChainsDigest = null;
        }
        this.firstArchiveTimeStamp = new ERSArchiveTimeStamp(this.previousChainsDigest, archiveTimestamps[0], digestCalculatorProvider);
    }

    public TimeStampRequest generateHashRenewalRequest(DigestCalculator digestCalculator, ERSData eRSData, TimeStampRequestGenerator timeStampRequestGenerator, BigInteger bigInteger) throws ERSException, TSPException, IOException {
        try {
            this.firstArchiveTimeStamp.validatePresent(eRSData, new Date());
            ERSArchiveTimeStampGenerator eRSArchiveTimeStampGenerator = new ERSArchiveTimeStampGenerator(digestCalculator);
            eRSArchiveTimeStampGenerator.addData(eRSData);
            eRSArchiveTimeStampGenerator.addPreviousChains(this.evidenceRecord.getArchiveTimeStampSequence());
            return eRSArchiveTimeStampGenerator.generateTimeStampRequest(timeStampRequestGenerator, bigInteger);
        } catch (Exception unused) {
            throw new ERSException("attempt to hash renew on invalid data");
        }
    }

    public TimeStampRequest generateTimeStampRenewalRequest(TimeStampRequestGenerator timeStampRequestGenerator, BigInteger bigInteger) throws ERSException, TSPException {
        try {
            return buildTspRenewalGenerator().generateTimeStampRequest(timeStampRequestGenerator, bigInteger);
        } catch (IOException e10) {
            throw new ERSException(e10.getMessage(), e10);
        }
    }

    public void validatePresent(boolean z10, byte[] bArr, Date date) throws ERSException {
        this.firstArchiveTimeStamp.validatePresent(z10, bArr, date);
    }

    public ERSEvidenceRecord(byte[] bArr, DigestCalculatorProvider digestCalculatorProvider) throws ERSException, TSPException {
        this(EvidenceRecord.getInstance(bArr), digestCalculatorProvider);
    }
}
