package org.bouncycastle.asn1;

import j2.y;
import java.io.IOException;
import org.bouncycastle.util.Arrays;
import p.i0;

/* loaded from: classes2.dex */
public abstract class ASN1TaggedObject extends ASN1Primitive implements ASN1TaggedObjectParser {
    private static final int DECLARED_EXPLICIT = 1;
    private static final int DECLARED_IMPLICIT = 2;
    private static final int PARSED_EXPLICIT = 3;
    private static final int PARSED_IMPLICIT = 4;
    final int explicitness;
    final ASN1Encodable obj;
    final int tagClass;
    final int tagNo;

    public ASN1TaggedObject(int i10, int i11, int i12, ASN1Encodable aSN1Encodable) {
        if (aSN1Encodable == null) {
            throw new NullPointerException("'obj' cannot be null");
        }
        if (i11 == 0 || (i11 & 192) != i11) {
            throw new IllegalArgumentException(y.a(i11, "invalid tag class: "));
        }
        this.explicitness = aSN1Encodable instanceof ASN1Choice ? 1 : i10;
        this.tagClass = i11;
        this.tagNo = i12;
        this.obj = aSN1Encodable;
    }

    private static ASN1TaggedObject checkInstance(Object obj) {
        if (obj != null) {
            return getInstance(obj);
        }
        throw new NullPointerException("'obj' cannot be null");
    }

    private static ASN1TaggedObject checkedCast(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1TaggedObject) {
            return (ASN1TaggedObject) aSN1Primitive;
        }
        throw new IllegalStateException("unexpected object: ".concat(aSN1Primitive.getClass().getName()));
    }

    public static ASN1Primitive createConstructedDL(int i10, int i11, ASN1EncodableVector aSN1EncodableVector) {
        return aSN1EncodableVector.size() == 1 ? new DLTaggedObject(3, i10, i11, aSN1EncodableVector.get(0)) : new DLTaggedObject(4, i10, i11, DLFactory.createSequence(aSN1EncodableVector));
    }

    public static ASN1Primitive createConstructedIL(int i10, int i11, ASN1EncodableVector aSN1EncodableVector) {
        return aSN1EncodableVector.size() == 1 ? new BERTaggedObject(3, i10, i11, aSN1EncodableVector.get(0)) : new BERTaggedObject(4, i10, i11, BERFactory.createSequence(aSN1EncodableVector));
    }

    public static ASN1Primitive createPrimitive(int i10, int i11, byte[] bArr) {
        return new DLTaggedObject(4, i10, i11, new DEROctetString(bArr));
    }

    public static ASN1TaggedObject getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1TaggedObject)) {
            return (ASN1TaggedObject) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1TaggedObject) {
                return (ASN1TaggedObject) aSN1Primitive;
            }
        } else if (obj instanceof byte[]) {
            try {
                return checkedCast(ASN1Primitive.fromByteArray((byte[]) obj));
            } catch (IOException e10) {
                throw new IllegalArgumentException(b.a(e10, new StringBuilder("failed to construct tagged object from byte[]: ")));
            }
        }
        throw new IllegalArgumentException(i0.a(obj, "unknown object in getInstance: "));
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1TaggedObject)) {
            return false;
        }
        ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Primitive;
        if (this.tagNo != aSN1TaggedObject.tagNo || this.tagClass != aSN1TaggedObject.tagClass) {
            return false;
        }
        if (this.explicitness != aSN1TaggedObject.explicitness && isExplicit() != aSN1TaggedObject.isExplicit()) {
            return false;
        }
        ASN1Primitive aSN1Primitive2 = this.obj.toASN1Primitive();
        ASN1Primitive aSN1Primitive3 = aSN1TaggedObject.obj.toASN1Primitive();
        if (aSN1Primitive2 == aSN1Primitive3) {
            return true;
        }
        if (isExplicit()) {
            return aSN1Primitive2.asn1Equals(aSN1Primitive3);
        }
        try {
            return Arrays.areEqual(getEncoded(), aSN1TaggedObject.getEncoded());
        } catch (IOException unused) {
            return false;
        }
    }

    public ASN1Object getBaseObject() {
        ASN1Encodable aSN1Encodable = this.obj;
        return aSN1Encodable instanceof ASN1Object ? (ASN1Object) aSN1Encodable : aSN1Encodable.toASN1Primitive();
    }

    public ASN1Primitive getBaseUniversal(boolean z10, int i10) {
        ASN1UniversalType aSN1UniversalType = ASN1UniversalTypes.get(i10);
        if (aSN1UniversalType != null) {
            return getBaseUniversal(z10, aSN1UniversalType);
        }
        throw new IllegalArgumentException(y.a(i10, "unsupported UNIVERSAL tag number: "));
    }

    public ASN1Object getExplicitBaseObject() {
        if (!isExplicit()) {
            throw new IllegalStateException("object implicit - explicit expected.");
        }
        ASN1Encodable aSN1Encodable = this.obj;
        return aSN1Encodable instanceof ASN1Object ? (ASN1Object) aSN1Encodable : aSN1Encodable.toASN1Primitive();
    }

    public ASN1TaggedObject getExplicitBaseTagged() {
        if (isExplicit()) {
            return checkedCast(this.obj.toASN1Primitive());
        }
        throw new IllegalStateException("object implicit - explicit expected.");
    }

    public ASN1TaggedObject getImplicitBaseTagged(int i10, int i11) {
        if (i10 == 0 || (i10 & 192) != i10) {
            throw new IllegalArgumentException(y.a(i10, "invalid base tag class: "));
        }
        int i12 = this.explicitness;
        if (i12 != 1) {
            return i12 != 2 ? replaceTag(i10, i11) : ASN1Util.checkTag(checkedCast(this.obj.toASN1Primitive()), i10, i11);
        }
        throw new IllegalStateException("object explicit - implicit expected.");
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public final ASN1Primitive getLoadedObject() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public int getTagClass() {
        return this.tagClass;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public int getTagNo() {
        return this.tagNo;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public boolean hasContextTag() {
        return this.tagClass == 128;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public boolean hasTag(int i10, int i11) {
        return this.tagClass == i10 && this.tagNo == i11;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public boolean hasTagClass(int i10) {
        return this.tagClass == i10;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return (((this.tagClass * 7919) ^ this.tagNo) ^ (isExplicit() ? 15 : 240)) ^ this.obj.toASN1Primitive().hashCode();
    }

    public boolean isExplicit() {
        int i10 = this.explicitness;
        return i10 == 1 || i10 == 3;
    }

    public boolean isParsed() {
        int i10 = this.explicitness;
        return i10 == 3 || i10 == 4;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public ASN1Encodable parseBaseUniversal(boolean z10, int i10) throws IOException {
        ASN1Primitive baseUniversal = getBaseUniversal(z10, i10);
        return i10 != 3 ? i10 != 4 ? i10 != 16 ? i10 != 17 ? baseUniversal : ((ASN1Set) baseUniversal).parser() : ((ASN1Sequence) baseUniversal).parser() : ((ASN1OctetString) baseUniversal).parser() : ((ASN1BitString) baseUniversal).parser();
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public ASN1Encodable parseExplicitBaseObject() throws IOException {
        return getExplicitBaseObject();
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public ASN1TaggedObjectParser parseExplicitBaseTagged() throws IOException {
        return getExplicitBaseTagged();
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public ASN1TaggedObjectParser parseImplicitBaseTagged(int i10, int i11) throws IOException {
        return getImplicitBaseTagged(i10, i11);
    }

    public abstract ASN1Sequence rebuildConstructed(ASN1Primitive aSN1Primitive);

    public abstract ASN1TaggedObject replaceTag(int i10, int i11);

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDERObject() {
        return new DERTaggedObject(this.explicitness, this.tagClass, this.tagNo, this.obj);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        return new DLTaggedObject(this.explicitness, this.tagClass, this.tagNo, this.obj);
    }

    public String toString() {
        return ASN1Util.getTagText(this.tagClass, this.tagNo) + this.obj;
    }

    private static ASN1TaggedObject checkInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException("this method not valid for implicitly tagged tagged objects");
        }
        if (aSN1TaggedObject != null) {
            return aSN1TaggedObject;
        }
        throw new NullPointerException("'taggedObject' cannot be null");
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public boolean hasContextTag(int i10) {
        return this.tagClass == 128 && this.tagNo == i10;
    }

    public ASN1TaggedObject(boolean z10, int i10, int i11, ASN1Encodable aSN1Encodable) {
        this(z10 ? 1 : 2, i10, i11, aSN1Encodable);
    }

    public ASN1Primitive getBaseUniversal(boolean z10, ASN1UniversalType aSN1UniversalType) {
        if (z10) {
            if (isExplicit()) {
                return aSN1UniversalType.checkedCast(this.obj.toASN1Primitive());
            }
            throw new IllegalStateException("object explicit - implicit expected.");
        }
        if (1 == this.explicitness) {
            throw new IllegalStateException("object explicit - implicit expected.");
        }
        ASN1Primitive aSN1Primitive = this.obj.toASN1Primitive();
        int i10 = this.explicitness;
        return i10 != 3 ? i10 != 4 ? aSN1UniversalType.checkedCast(aSN1Primitive) : aSN1Primitive instanceof ASN1Sequence ? aSN1UniversalType.fromImplicitConstructed((ASN1Sequence) aSN1Primitive) : aSN1UniversalType.fromImplicitPrimitive((DEROctetString) aSN1Primitive) : aSN1UniversalType.fromImplicitConstructed(rebuildConstructed(aSN1Primitive));
    }

    public ASN1TaggedObject(boolean z10, int i10, ASN1Encodable aSN1Encodable) {
        this(z10, 128, i10, aSN1Encodable);
    }

    public static ASN1TaggedObject getInstance(Object obj, int i10) {
        return ASN1Util.checkTagClass(checkInstance(obj), i10);
    }

    public static ASN1TaggedObject getInstance(Object obj, int i10, int i11) {
        return ASN1Util.checkTag(checkInstance(obj), i10, i11);
    }

    public static ASN1TaggedObject getInstance(ASN1TaggedObject aSN1TaggedObject, int i10, int i11, boolean z10) {
        return ASN1Util.getExplicitBaseTagged(checkInstance(aSN1TaggedObject, z10), i10, i11);
    }

    public static ASN1TaggedObject getInstance(ASN1TaggedObject aSN1TaggedObject, int i10, boolean z10) {
        return ASN1Util.getExplicitBaseTagged(checkInstance(aSN1TaggedObject, z10), i10);
    }

    public static ASN1TaggedObject getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return ASN1Util.getExplicitContextBaseTagged(checkInstance(aSN1TaggedObject, z10));
    }
}
