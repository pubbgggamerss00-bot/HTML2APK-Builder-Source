package org.bouncycastle.asn1.cmp;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* loaded from: classes2.dex */
public class PollReqContent extends ASN1Object {
    private final ASN1Sequence content;

    public PollReqContent(BigInteger bigInteger) {
        this(new ASN1Integer(bigInteger));
    }

    public static PollReqContent getInstance(Object obj) {
        if (obj instanceof PollReqContent) {
            return (PollReqContent) obj;
        }
        if (obj != null) {
            return new PollReqContent(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private static ASN1Integer[] intsToASN1(BigInteger[] bigIntegerArr) {
        int length = bigIntegerArr.length;
        ASN1Integer[] aSN1IntegerArr = new ASN1Integer[length];
        for (int i10 = 0; i10 != length; i10++) {
            aSN1IntegerArr[i10] = new ASN1Integer(bigIntegerArr[i10]);
        }
        return aSN1IntegerArr;
    }

    private static DERSequence[] intsToSequence(ASN1Integer[] aSN1IntegerArr) {
        int length = aSN1IntegerArr.length;
        DERSequence[] dERSequenceArr = new DERSequence[length];
        for (int i10 = 0; i10 != length; i10++) {
            dERSequenceArr[i10] = new DERSequence(aSN1IntegerArr[i10]);
        }
        return dERSequenceArr;
    }

    private static ASN1Integer[] sequenceToASN1IntegerArray(ASN1Sequence aSN1Sequence) {
        int size = aSN1Sequence.size();
        ASN1Integer[] aSN1IntegerArr = new ASN1Integer[size];
        for (int i10 = 0; i10 != size; i10++) {
            aSN1IntegerArr[i10] = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return aSN1IntegerArr;
    }

    public BigInteger[] getCertReqIdValues() {
        int size = this.content.size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i10 = 0; i10 != size; i10++) {
            bigIntegerArr[i10] = ASN1Integer.getInstance(ASN1Sequence.getInstance(this.content.getObjectAt(i10)).getObjectAt(0)).getValue();
        }
        return bigIntegerArr;
    }

    public ASN1Integer[][] getCertReqIds() {
        int size = this.content.size();
        ASN1Integer[][] aSN1IntegerArr = new ASN1Integer[size][];
        for (int i10 = 0; i10 != size; i10++) {
            aSN1IntegerArr[i10] = sequenceToASN1IntegerArray((ASN1Sequence) this.content.getObjectAt(i10));
        }
        return aSN1IntegerArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.content;
    }

    public PollReqContent(ASN1Integer aSN1Integer) {
        this(new DERSequence(new DERSequence(aSN1Integer)));
    }

    private PollReqContent(ASN1Sequence aSN1Sequence) {
        this.content = aSN1Sequence;
    }

    public PollReqContent(BigInteger[] bigIntegerArr) {
        this(intsToASN1(bigIntegerArr));
    }

    public PollReqContent(ASN1Integer[] aSN1IntegerArr) {
        this(new DERSequence(intsToSequence(aSN1IntegerArr)));
    }
}
