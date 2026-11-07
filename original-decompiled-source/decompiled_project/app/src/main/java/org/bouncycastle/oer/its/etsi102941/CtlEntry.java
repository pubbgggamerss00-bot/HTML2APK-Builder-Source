package org.bouncycastle.oer.its.etsi102941;

import j2.y;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;

/* loaded from: classes3.dex */
public class CtlEntry extends ASN1Object implements ASN1Choice {

    /* renamed from: aa, reason: collision with root package name */
    public static final int f20257aa = 2;

    /* renamed from: dc, reason: collision with root package name */
    public static final int f20258dc = 3;

    /* renamed from: ea, reason: collision with root package name */
    public static final int f20259ea = 1;
    public static final int rca = 0;
    public static final int tlm = 4;
    private final int choice;
    private final ASN1Encodable ctlEntry;

    public CtlEntry(int i10, ASN1Encodable aSN1Encodable) {
        this.choice = i10;
        this.ctlEntry = aSN1Encodable;
    }

    public static CtlEntry aa(AaEntry aaEntry) {
        return new CtlEntry(2, aaEntry);
    }

    public static CtlEntry dc(DcEntry dcEntry) {
        return new CtlEntry(3, dcEntry);
    }

    public static CtlEntry ea(EaEntry eaEntry) {
        return new CtlEntry(1, eaEntry);
    }

    public static CtlEntry getInstance(Object obj) {
        if (obj instanceof CtlEntry) {
            return (CtlEntry) obj;
        }
        if (obj != null) {
            return new CtlEntry(ASN1TaggedObject.getInstance(obj, 128));
        }
        return null;
    }

    public static CtlEntry rca(RootCaEntry rootCaEntry) {
        return new CtlEntry(0, rootCaEntry);
    }

    public static CtlEntry tlm(TlmEntry tlmEntry) {
        return new CtlEntry(4, tlmEntry);
    }

    public int getChoice() {
        return this.choice;
    }

    public ASN1Encodable getCtlEntry() {
        return this.ctlEntry;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERTaggedObject(this.choice, this.ctlEntry);
    }

    private CtlEntry(ASN1TaggedObject aSN1TaggedObject) {
        int tagNo = aSN1TaggedObject.getTagNo();
        this.choice = tagNo;
        if (tagNo == 0) {
            this.ctlEntry = RootCaEntry.getInstance(aSN1TaggedObject.getExplicitBaseObject());
            return;
        }
        if (tagNo == 1) {
            this.ctlEntry = EaEntry.getInstance(aSN1TaggedObject.getExplicitBaseObject());
            return;
        }
        if (tagNo == 2) {
            this.ctlEntry = AaEntry.getInstance(aSN1TaggedObject.getExplicitBaseObject());
        } else if (tagNo == 3) {
            this.ctlEntry = DcEntry.getInstance(aSN1TaggedObject.getExplicitBaseObject());
        } else {
            if (tagNo != 4) {
                throw new IllegalArgumentException(y.a(tagNo, "invalid choice value "));
            }
            this.ctlEntry = TlmEntry.getInstance(aSN1TaggedObject.getExplicitBaseObject());
        }
    }
}
