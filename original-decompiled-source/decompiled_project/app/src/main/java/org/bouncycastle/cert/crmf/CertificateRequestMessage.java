package org.bouncycastle.cert.crmf;

import i8.n;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1UTF8String;
import org.bouncycastle.asn1.crmf.AttributeTypeAndValue;
import org.bouncycastle.asn1.crmf.CRMFObjectIdentifiers;
import org.bouncycastle.asn1.crmf.CertReqMsg;
import org.bouncycastle.asn1.crmf.CertTemplate;
import org.bouncycastle.asn1.crmf.Controls;
import org.bouncycastle.asn1.crmf.PKIArchiveOptions;
import org.bouncycastle.asn1.crmf.POPOSigningKey;
import org.bouncycastle.asn1.crmf.ProofOfPossession;
import org.bouncycastle.cert.CertIOException;
import org.bouncycastle.operator.ContentVerifier;
import org.bouncycastle.operator.ContentVerifierProvider;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.util.Encodable;

/* loaded from: classes2.dex */
public class CertificateRequestMessage implements Encodable {
    public static final int popKeyAgreement = 3;
    public static final int popKeyEncipherment = 2;
    public static final int popRaVerified = 0;
    public static final int popSigningKey = 1;
    private final CertReqMsg certReqMsg;
    private final Controls controls;

    public CertificateRequestMessage(CertReqMsg certReqMsg) {
        this.certReqMsg = certReqMsg;
        this.controls = certReqMsg.getCertReq().getControls();
    }

    private AttributeTypeAndValue findControl(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        Controls controls = this.controls;
        if (controls == null) {
            return null;
        }
        AttributeTypeAndValue[] attributeTypeAndValueArray = controls.toAttributeTypeAndValueArray();
        for (int i10 = 0; i10 != attributeTypeAndValueArray.length; i10++) {
            if (attributeTypeAndValueArray[i10].getType().equals((ASN1Primitive) aSN1ObjectIdentifier)) {
                return attributeTypeAndValueArray[i10];
            }
        }
        return null;
    }

    private static CertReqMsg parseBytes(byte[] bArr) throws IOException {
        try {
            return CertReqMsg.getInstance(bArr);
        } catch (ClassCastException e10) {
            throw new CertIOException("malformed data: " + e10.getMessage(), e10);
        } catch (IllegalArgumentException e11) {
            throw new CertIOException(n.c(e11, new StringBuilder("malformed data: ")), e11);
        }
    }

    private boolean verifySignature(ContentVerifierProvider contentVerifierProvider, POPOSigningKey pOPOSigningKey) throws CRMFException, IOException {
        try {
            ContentVerifier contentVerifier = contentVerifierProvider.get(pOPOSigningKey.getAlgorithmIdentifier());
            ASN1Object poposkInput = pOPOSigningKey.getPoposkInput();
            if (poposkInput == null) {
                poposkInput = this.certReqMsg.getCertReq();
            }
            CRMFUtil.derEncodeToStream(poposkInput, contentVerifier.getOutputStream());
            return contentVerifier.verify(pOPOSigningKey.getSignature().getOctets());
        } catch (OperatorCreationException e10) {
            throw new CRMFException("unable to create verifier: " + e10.getMessage(), e10);
        }
    }

    public ASN1Integer getCertReqId() {
        return this.certReqMsg.getCertReq().getCertReqId();
    }

    public CertTemplate getCertTemplate() {
        return this.certReqMsg.getCertReq().getCertTemplate();
    }

    public Control getControl(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        AttributeTypeAndValue attributeTypeAndValueFindControl = findControl(aSN1ObjectIdentifier);
        if (attributeTypeAndValueFindControl == null) {
            return null;
        }
        if (attributeTypeAndValueFindControl.getType().equals((ASN1Primitive) CRMFObjectIdentifiers.id_regCtrl_pkiArchiveOptions)) {
            return new PKIArchiveControl(PKIArchiveOptions.getInstance(attributeTypeAndValueFindControl.getValue()));
        }
        if (attributeTypeAndValueFindControl.getType().equals((ASN1Primitive) CRMFObjectIdentifiers.id_regCtrl_regToken)) {
            return new RegTokenControl(ASN1UTF8String.getInstance(attributeTypeAndValueFindControl.getValue()));
        }
        if (attributeTypeAndValueFindControl.getType().equals((ASN1Primitive) CRMFObjectIdentifiers.id_regCtrl_authenticator)) {
            return new AuthenticatorControl(ASN1UTF8String.getInstance(attributeTypeAndValueFindControl.getValue()));
        }
        return null;
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws IOException {
        return this.certReqMsg.getEncoded();
    }

    public int getProofOfPossessionType() {
        return this.certReqMsg.getPop().getType();
    }

    public boolean hasControl(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return findControl(aSN1ObjectIdentifier) != null;
    }

    public boolean hasControls() {
        return this.controls != null;
    }

    public boolean hasProofOfPossession() {
        return this.certReqMsg.getPop() != null;
    }

    public boolean hasSigningKeyProofOfPossessionWithPKMAC() {
        ProofOfPossession pop = this.certReqMsg.getPop();
        return pop.getType() == 1 && POPOSigningKey.getInstance(pop.getObject()).getPoposkInput().getPublicKeyMAC() != null;
    }

    public boolean isValidSigningKeyPOP(ContentVerifierProvider contentVerifierProvider) throws CRMFException, IllegalStateException {
        ProofOfPossession pop = this.certReqMsg.getPop();
        if (pop.getType() != 1) {
            throw new IllegalStateException("not Signing Key type of proof of possession");
        }
        POPOSigningKey pOPOSigningKey = POPOSigningKey.getInstance(pop.getObject());
        if (pOPOSigningKey.getPoposkInput() == null || pOPOSigningKey.getPoposkInput().getPublicKeyMAC() == null) {
            return verifySignature(contentVerifierProvider, pOPOSigningKey);
        }
        throw new IllegalStateException("verification requires password check");
    }

    public CertReqMsg toASN1Structure() {
        return this.certReqMsg;
    }

    public CertificateRequestMessage(byte[] bArr) throws IOException {
        this(parseBytes(bArr));
    }

    public boolean isValidSigningKeyPOP(ContentVerifierProvider contentVerifierProvider, PKMACBuilder pKMACBuilder, char[] cArr) throws CRMFException, IllegalStateException {
        ProofOfPossession pop = this.certReqMsg.getPop();
        if (pop.getType() != 1) {
            throw new IllegalStateException("not Signing Key type of proof of possession");
        }
        POPOSigningKey pOPOSigningKey = POPOSigningKey.getInstance(pop.getObject());
        if (pOPOSigningKey.getPoposkInput() == null || pOPOSigningKey.getPoposkInput().getSender() != null) {
            throw new IllegalStateException("no PKMAC present in proof of possession");
        }
        return new PKMACValueVerifier(pKMACBuilder).isValid(pOPOSigningKey.getPoposkInput().getPublicKeyMAC(), cArr, getCertTemplate().getPublicKey()) && verifySignature(contentVerifierProvider, pOPOSigningKey);
    }
}
