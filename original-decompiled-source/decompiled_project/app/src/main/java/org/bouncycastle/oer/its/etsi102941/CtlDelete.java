package org.bouncycastle.oer.its.etsi102941;

import j2.y;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.HashedId8;

/* loaded from: classes3.dex */
public class CtlDelete extends ASN1Object implements ASN1Choice {
    public static final int cert = 0;

    /* renamed from: dc, reason: collision with root package name */
    public static final int f20256dc = 1;
    private final int choice;
    private final ASN1Encodable ctlDelete;

    public CtlDelete(int i10, ASN1Encodable aSN1Encodable) {
        this.choice = i10;
        if (i10 == 0) {
            this.ctlDelete = HashedId8.getInstance(aSN1Encodable);
        } else {
            if (i10 != 1) {
                throw new IllegalArgumentException(y.a(i10, "invalid choice value "));
            }
            this.ctlDelete = DcDelete.getInstance(aSN1Encodable);
        }
    }

    public static CtlDelete cert(HashedId8 hashedId8) {
        return new CtlDelete(0, hashedId8);
    }

    public static CtlDelete dc(DcDelete dcDelete) {
        return new CtlDelete(1, dcDelete);
    }

    public static CtlDelete getInstance(Object obj) {
        if (obj instanceof CtlDelete) {
            return (CtlDelete) obj;
        }
        if (obj != null) {
            return new CtlDelete(ASN1TaggedObject.getInstance(obj, 128));
        }
        return null;
    }

    public int getChoice() {
        return this.choice;
    }

    public ASN1Encodable getCtlDelete() {
        return this.ctlDelete;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERTaggedObject(this.choice, this.ctlDelete);
    }

    private CtlDelete(ASN1TaggedObject aSN1TaggedObject) {
        this(aSN1TaggedObject.getTagNo(), aSN1TaggedObject.getExplicitBaseObject());
    }
}
