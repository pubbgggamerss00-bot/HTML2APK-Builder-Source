package org.bouncycastle.cms;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.BEROctetString;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.b;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.cms.SignedData;
import org.bouncycastle.asn1.cms.SignerInfo;
import org.bouncycastle.operator.DigestAlgorithmIdentifierFinder;

/* loaded from: classes2.dex */
public class CMSSignedDataGenerator extends CMSSignedGenerator {
    private boolean isDefiniteLength;
    private List signerInfs;

    public CMSSignedDataGenerator() {
        this.signerInfs = new ArrayList();
        this.isDefiniteLength = false;
    }

    private static ASN1Set createSetFromList(List list, boolean z10) {
        if (list.size() != 0) {
            return z10 ? CMSUtils.createDlSetFromList(list) : CMSUtils.createBerSetFromList(list);
        }
        return null;
    }

    public CMSSignedData generate(CMSTypedData cMSTypedData) throws CMSException {
        return generate(cMSTypedData, false);
    }

    public SignerInformationStore generateCounterSigners(SignerInformation signerInformation) throws CMSException {
        return generate(new CMSProcessableByteArray(null, signerInformation.getSignature()), false).getSignerInfos();
    }

    public void setDefiniteLengthEncoding(boolean z10) {
        this.isDefiniteLength = z10;
    }

    public CMSSignedDataGenerator(DigestAlgorithmIdentifierFinder digestAlgorithmIdentifierFinder) {
        super(digestAlgorithmIdentifierFinder);
        this.signerInfs = new ArrayList();
        this.isDefiniteLength = false;
    }

    public CMSSignedData generate(CMSTypedData cMSTypedData, boolean z10) throws CMSException, IOException {
        if (!this.signerInfs.isEmpty()) {
            throw new IllegalStateException("this method can only be used with SignerInfoGenerator");
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        this.digests.clear();
        for (SignerInformation signerInformation : this._signers) {
            CMSUtils.addDigestAlgs(linkedHashSet, signerInformation, this.digestAlgIdFinder);
            aSN1EncodableVector.add(signerInformation.toASN1Structure());
        }
        ASN1ObjectIdentifier contentType = cMSTypedData.getContentType();
        ASN1Encodable dEROctetString = null;
        if (cMSTypedData.getContent() != null) {
            ByteArrayOutputStream byteArrayOutputStream = z10 ? new ByteArrayOutputStream() : null;
            OutputStream safeOutputStream = CMSUtils.getSafeOutputStream(CMSUtils.attachSignersToOutputStream(this.signerGens, byteArrayOutputStream));
            try {
                cMSTypedData.write(safeOutputStream);
                safeOutputStream.close();
                if (z10) {
                    dEROctetString = this.isDefiniteLength ? new DEROctetString(byteArrayOutputStream.toByteArray()) : new BEROctetString(byteArrayOutputStream.toByteArray());
                }
            } catch (IOException e10) {
                throw new CMSException(b.a(e10, new StringBuilder("data processing exception: ")), e10);
            }
        }
        for (SignerInfoGenerator signerInfoGenerator : this.signerGens) {
            SignerInfo signerInfoGenerate = signerInfoGenerator.generate(contentType);
            linkedHashSet.add(signerInfoGenerate.getDigestAlgorithm());
            aSN1EncodableVector.add(signerInfoGenerate);
            byte[] calculatedDigest = signerInfoGenerator.getCalculatedDigest();
            if (calculatedDigest != null) {
                this.digests.put(signerInfoGenerate.getDigestAlgorithm().getAlgorithm().getId(), calculatedDigest);
            }
        }
        return new CMSSignedData(cMSTypedData, new ContentInfo(CMSObjectIdentifiers.signedData, new SignedData(CMSUtils.convertToDlSet(linkedHashSet), new ContentInfo(contentType, dEROctetString), createSetFromList(this.certs, this.isDefiniteLength), createSetFromList(this.crls, this.isDefiniteLength), new DERSet(aSN1EncodableVector))));
    }
}
