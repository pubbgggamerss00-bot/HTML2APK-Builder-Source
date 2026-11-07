package org.bouncycastle.asn1.tsp;

import i8.e;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.cmc.b;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* loaded from: classes2.dex */
public class EvidenceRecord extends ASN1Object {
    private static final ASN1ObjectIdentifier OID = new ASN1ObjectIdentifier("1.3.6.1.5.5.11.0.2.1");
    private ArchiveTimeStampSequence archiveTimeStampSequence;
    private CryptoInfos cryptoInfos;
    private ASN1Sequence digestAlgorithms;
    private EncryptionInfo encryptionInfo;
    private ASN1Integer version;

    private EvidenceRecord(ASN1Sequence aSN1Sequence) {
        this.version = new ASN1Integer(1L);
        if (aSN1Sequence.size() < 3 && aSN1Sequence.size() > 5) {
            throw new IllegalArgumentException(e.b(aSN1Sequence, new StringBuilder("wrong sequence size in constructor: ")));
        }
        ASN1Integer aSN1Integer = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        if (!aSN1Integer.hasValue(1)) {
            throw new IllegalArgumentException("incompatible version");
        }
        this.version = aSN1Integer;
        this.digestAlgorithms = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
        for (int i10 = 2; i10 != aSN1Sequence.size() - 1; i10++) {
            ASN1Encodable objectAt = aSN1Sequence.getObjectAt(i10);
            if (!(objectAt instanceof ASN1TaggedObject)) {
                throw new IllegalArgumentException("unknown object in getInstance: ".concat(objectAt.getClass().getName()));
            }
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) objectAt;
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 0) {
                this.cryptoInfos = CryptoInfos.getInstance(aSN1TaggedObject, false);
            } else {
                if (tagNo != 1) {
                    throw new IllegalArgumentException(b.a(aSN1TaggedObject, new StringBuilder("unknown tag in getInstance: ")));
                }
                this.encryptionInfo = EncryptionInfo.getInstance(aSN1TaggedObject, false);
            }
        }
        this.archiveTimeStampSequence = ArchiveTimeStampSequence.getInstance(aSN1Sequence.getObjectAt(aSN1Sequence.size() - 1));
    }

    public static EvidenceRecord getInstance(Object obj) {
        if (obj instanceof EvidenceRecord) {
            return (EvidenceRecord) obj;
        }
        if (obj != null) {
            return new EvidenceRecord(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public EvidenceRecord addArchiveTimeStamp(ArchiveTimeStamp archiveTimeStamp, boolean z10) {
        if (z10) {
            return new EvidenceRecord(this, this.archiveTimeStampSequence.append(new ArchiveTimeStampChain(archiveTimeStamp)), archiveTimeStamp);
        }
        ArchiveTimeStampChain[] archiveTimeStampChains = this.archiveTimeStampSequence.getArchiveTimeStampChains();
        if (!archiveTimeStampChains[archiveTimeStampChains.length - 1].getArchiveTimestamps()[0].getDigestAlgorithmIdentifier().equals(archiveTimeStamp.getDigestAlgorithmIdentifier())) {
            throw new IllegalArgumentException("mismatch of digest algorithm in addArchiveTimeStamp");
        }
        archiveTimeStampChains[archiveTimeStampChains.length - 1] = archiveTimeStampChains[archiveTimeStampChains.length - 1].append(archiveTimeStamp);
        return new EvidenceRecord(this, new ArchiveTimeStampSequence(archiveTimeStampChains), (ArchiveTimeStamp) null);
    }

    public ArchiveTimeStampSequence getArchiveTimeStampSequence() {
        return this.archiveTimeStampSequence;
    }

    public AlgorithmIdentifier[] getDigestAlgorithms() {
        int size = this.digestAlgorithms.size();
        AlgorithmIdentifier[] algorithmIdentifierArr = new AlgorithmIdentifier[size];
        for (int i10 = 0; i10 != size; i10++) {
            algorithmIdentifierArr[i10] = AlgorithmIdentifier.getInstance(this.digestAlgorithms.getObjectAt(i10));
        }
        return algorithmIdentifierArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(5);
        aSN1EncodableVector.add(this.version);
        aSN1EncodableVector.add(this.digestAlgorithms);
        CryptoInfos cryptoInfos = this.cryptoInfos;
        if (cryptoInfos != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, (ASN1Encodable) cryptoInfos));
        }
        EncryptionInfo encryptionInfo = this.encryptionInfo;
        if (encryptionInfo != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, (ASN1Encodable) encryptionInfo));
        }
        aSN1EncodableVector.add(this.archiveTimeStampSequence);
        return new DERSequence(aSN1EncodableVector);
    }

    public String toString() {
        return "EvidenceRecord: Oid(" + OID + ")";
    }

    public static EvidenceRecord getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }

    public EvidenceRecord(CryptoInfos cryptoInfos, EncryptionInfo encryptionInfo, ArchiveTimeStamp archiveTimeStamp) {
        this.version = new ASN1Integer(1L);
        this.digestAlgorithms = new DERSequence(archiveTimeStamp.getDigestAlgorithmIdentifier());
        this.cryptoInfos = cryptoInfos;
        this.encryptionInfo = encryptionInfo;
        this.archiveTimeStampSequence = new ArchiveTimeStampSequence(new ArchiveTimeStampChain(archiveTimeStamp));
    }

    private EvidenceRecord(EvidenceRecord evidenceRecord, ArchiveTimeStampSequence archiveTimeStampSequence, ArchiveTimeStamp archiveTimeStamp) {
        ASN1Sequence dERSequence;
        this.version = new ASN1Integer(1L);
        this.version = evidenceRecord.version;
        if (archiveTimeStamp == null) {
            dERSequence = evidenceRecord.digestAlgorithms;
            break;
        }
        AlgorithmIdentifier digestAlgorithmIdentifier = archiveTimeStamp.getDigestAlgorithmIdentifier();
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        Enumeration objects = evidenceRecord.digestAlgorithms.getObjects();
        while (objects.hasMoreElements()) {
            AlgorithmIdentifier algorithmIdentifier = AlgorithmIdentifier.getInstance(objects.nextElement());
            aSN1EncodableVector.add(algorithmIdentifier);
            if (algorithmIdentifier.equals(digestAlgorithmIdentifier)) {
                dERSequence = evidenceRecord.digestAlgorithms;
                break;
            }
        }
        aSN1EncodableVector.add(digestAlgorithmIdentifier);
        dERSequence = new DERSequence(aSN1EncodableVector);
        this.digestAlgorithms = dERSequence;
        this.cryptoInfos = evidenceRecord.cryptoInfos;
        this.encryptionInfo = evidenceRecord.encryptionInfo;
        this.archiveTimeStampSequence = archiveTimeStampSequence;
    }

    public EvidenceRecord(AlgorithmIdentifier[] algorithmIdentifierArr, CryptoInfos cryptoInfos, EncryptionInfo encryptionInfo, ArchiveTimeStampSequence archiveTimeStampSequence) {
        this.version = new ASN1Integer(1L);
        this.digestAlgorithms = new DERSequence(algorithmIdentifierArr);
        this.cryptoInfos = cryptoInfos;
        this.encryptionInfo = encryptionInfo;
        this.archiveTimeStampSequence = archiveTimeStampSequence;
    }
}
