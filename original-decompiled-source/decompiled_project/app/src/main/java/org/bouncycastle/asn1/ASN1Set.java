package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Iterable;
import p.i0;

/* loaded from: classes2.dex */
public abstract class ASN1Set extends ASN1Primitive implements Iterable<ASN1Encodable> {
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1Set.class, 17) { // from class: org.bouncycastle.asn1.ASN1Set.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitConstructed(ASN1Sequence aSN1Sequence) {
            return aSN1Sequence.toASN1Set();
        }
    };
    protected final ASN1Encodable[] elements;
    protected ASN1Encodable[] sortedElements;

    public ASN1Set() {
        ASN1Encodable[] aSN1EncodableArr = ASN1EncodableVector.EMPTY_ELEMENTS;
        this.elements = aSN1EncodableArr;
        this.sortedElements = aSN1EncodableArr;
    }

    private static byte[] getDEREncoded(ASN1Encodable aSN1Encodable) {
        try {
            return aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER);
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    public static ASN1Set getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1Set)) {
            return (ASN1Set) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1Set) {
                return (ASN1Set) aSN1Primitive;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (ASN1Set) TYPE.fromByteArray((byte[]) obj);
            } catch (IOException e10) {
                throw new IllegalArgumentException(b.a(e10, new StringBuilder("failed to construct set from byte[]: ")));
            }
        }
        throw new IllegalArgumentException(i0.a(obj, "unknown object in getInstance: "));
    }

    private static boolean lessThanOrEqual(byte[] bArr, byte[] bArr2) {
        int i10 = bArr[0] & 223;
        int i11 = bArr2[0] & 223;
        if (i10 != i11) {
            return i10 < i11;
        }
        int iMin = Math.min(bArr.length, bArr2.length) - 1;
        for (int i12 = 1; i12 < iMin; i12++) {
            byte b10 = bArr[i12];
            byte b11 = bArr2[i12];
            if (b10 != b11) {
                return (b10 & 255) < (b11 & 255);
            }
        }
        return (bArr[iMin] & 255) <= (bArr2[iMin] & 255);
    }

    private static void sort(ASN1Encodable[] aSN1EncodableArr) {
        int i10;
        int length = aSN1EncodableArr.length;
        if (length < 2) {
            return;
        }
        ASN1Encodable aSN1Encodable = aSN1EncodableArr[0];
        ASN1Encodable aSN1Encodable2 = aSN1EncodableArr[1];
        byte[] dEREncoded = getDEREncoded(aSN1Encodable);
        byte[] dEREncoded2 = getDEREncoded(aSN1Encodable2);
        if (lessThanOrEqual(dEREncoded2, dEREncoded)) {
            aSN1Encodable2 = aSN1Encodable;
            aSN1Encodable = aSN1Encodable2;
            dEREncoded2 = dEREncoded;
            dEREncoded = dEREncoded2;
        }
        for (int i11 = 2; i11 < length; i11++) {
            ASN1Encodable aSN1Encodable3 = aSN1EncodableArr[i11];
            byte[] dEREncoded3 = getDEREncoded(aSN1Encodable3);
            if (lessThanOrEqual(dEREncoded2, dEREncoded3)) {
                aSN1EncodableArr[i11 - 2] = aSN1Encodable;
                aSN1Encodable = aSN1Encodable2;
                dEREncoded = dEREncoded2;
                aSN1Encodable2 = aSN1Encodable3;
                dEREncoded2 = dEREncoded3;
            } else if (lessThanOrEqual(dEREncoded, dEREncoded3)) {
                aSN1EncodableArr[i11 - 2] = aSN1Encodable;
                aSN1Encodable = aSN1Encodable3;
                dEREncoded = dEREncoded3;
            } else {
                int i12 = i11 - 1;
                while (true) {
                    i10 = i12 - 1;
                    if (i10 <= 0) {
                        break;
                    }
                    ASN1Encodable aSN1Encodable4 = aSN1EncodableArr[i12 - 2];
                    if (lessThanOrEqual(getDEREncoded(aSN1Encodable4), dEREncoded3)) {
                        break;
                    }
                    aSN1EncodableArr[i10] = aSN1Encodable4;
                    i12 = i10;
                }
                aSN1EncodableArr[i10] = aSN1Encodable3;
            }
        }
        aSN1EncodableArr[length - 2] = aSN1Encodable;
        aSN1EncodableArr[length - 1] = aSN1Encodable2;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1Set)) {
            return false;
        }
        ASN1Set aSN1Set = (ASN1Set) aSN1Primitive;
        int size = size();
        if (aSN1Set.size() != size) {
            return false;
        }
        DERSet dERSet = (DERSet) toDERObject();
        DERSet dERSet2 = (DERSet) aSN1Set.toDERObject();
        for (int i10 = 0; i10 < size; i10++) {
            ASN1Primitive aSN1Primitive2 = dERSet.elements[i10].toASN1Primitive();
            ASN1Primitive aSN1Primitive3 = dERSet2.elements[i10].toASN1Primitive();
            if (aSN1Primitive2 != aSN1Primitive3 && !aSN1Primitive2.asn1Equals(aSN1Primitive3)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return true;
    }

    public ASN1Encodable getObjectAt(int i10) {
        return this.elements[i10];
    }

    public Enumeration getObjects() {
        return new Enumeration() { // from class: org.bouncycastle.asn1.ASN1Set.2
            private int pos = 0;

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.pos < ASN1Set.this.elements.length;
            }

            @Override // java.util.Enumeration
            public Object nextElement() {
                int i10 = this.pos;
                ASN1Encodable[] aSN1EncodableArr = ASN1Set.this.elements;
                if (i10 >= aSN1EncodableArr.length) {
                    throw new NoSuchElementException();
                }
                this.pos = i10 + 1;
                return aSN1EncodableArr[i10];
            }
        };
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        int length = this.elements.length;
        int iHashCode = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return iHashCode;
            }
            iHashCode += this.elements[length].toASN1Primitive().hashCode();
        }
    }

    @Override // org.bouncycastle.util.Iterable, java.lang.Iterable
    public Iterator<ASN1Encodable> iterator() {
        return new Arrays.Iterator(toArray());
    }

    public ASN1SetParser parser() {
        final int size = size();
        return new ASN1SetParser() { // from class: org.bouncycastle.asn1.ASN1Set.3
            private int pos = 0;

            @Override // org.bouncycastle.asn1.InMemoryRepresentable
            public ASN1Primitive getLoadedObject() {
                return ASN1Set.this;
            }

            @Override // org.bouncycastle.asn1.ASN1SetParser
            public ASN1Encodable readObject() throws IOException {
                int i10 = size;
                int i11 = this.pos;
                if (i10 == i11) {
                    return null;
                }
                ASN1Encodable[] aSN1EncodableArr = ASN1Set.this.elements;
                this.pos = i11 + 1;
                ASN1Encodable aSN1Encodable = aSN1EncodableArr[i11];
                return aSN1Encodable instanceof ASN1Sequence ? ((ASN1Sequence) aSN1Encodable).parser() : aSN1Encodable instanceof ASN1Set ? ((ASN1Set) aSN1Encodable).parser() : aSN1Encodable;
            }

            @Override // org.bouncycastle.asn1.ASN1Encodable
            public ASN1Primitive toASN1Primitive() {
                return ASN1Set.this;
            }
        };
    }

    public int size() {
        return this.elements.length;
    }

    public ASN1Encodable[] toArray() {
        return ASN1EncodableVector.cloneElements(this.elements);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDERObject() {
        if (this.sortedElements == null) {
            ASN1Encodable[] aSN1EncodableArr = (ASN1Encodable[]) this.elements.clone();
            this.sortedElements = aSN1EncodableArr;
            sort(aSN1EncodableArr);
        }
        return new DERSet(true, this.sortedElements);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        return new DLSet(this.elements, this.sortedElements);
    }

    public String toString() {
        int size = size();
        if (size == 0) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer("[");
        int i10 = 0;
        while (true) {
            stringBuffer.append(this.elements[i10]);
            i10++;
            if (i10 >= size) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    public ASN1Set(ASN1Encodable aSN1Encodable) {
        if (aSN1Encodable == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        ASN1Encodable[] aSN1EncodableArr = {aSN1Encodable};
        this.elements = aSN1EncodableArr;
        this.sortedElements = aSN1EncodableArr;
    }

    public ASN1Set(ASN1EncodableVector aSN1EncodableVector, boolean z10) {
        ASN1Encodable[] aSN1EncodableArrTakeElements;
        if (aSN1EncodableVector == null) {
            throw new NullPointerException("'elementVector' cannot be null");
        }
        if (!z10 || aSN1EncodableVector.size() < 2) {
            aSN1EncodableArrTakeElements = aSN1EncodableVector.takeElements();
        } else {
            aSN1EncodableArrTakeElements = aSN1EncodableVector.copyElements();
            sort(aSN1EncodableArrTakeElements);
        }
        this.elements = aSN1EncodableArrTakeElements;
        if (!z10 && aSN1EncodableArrTakeElements.length >= 2) {
            aSN1EncodableArrTakeElements = null;
        }
        this.sortedElements = aSN1EncodableArrTakeElements;
    }

    public ASN1Set(boolean z10, ASN1Encodable[] aSN1EncodableArr) {
        this.elements = aSN1EncodableArr;
        if (!z10 && aSN1EncodableArr.length >= 2) {
            aSN1EncodableArr = null;
        }
        this.sortedElements = aSN1EncodableArr;
    }

    public ASN1Set(ASN1Encodable[] aSN1EncodableArr, boolean z10) {
        if (Arrays.isNullOrContainsNull(aSN1EncodableArr)) {
            throw new NullPointerException("'elements' cannot be null, or contain null");
        }
        ASN1Encodable[] aSN1EncodableArrCloneElements = ASN1EncodableVector.cloneElements(aSN1EncodableArr);
        if (z10 && aSN1EncodableArrCloneElements.length >= 2) {
            sort(aSN1EncodableArrCloneElements);
        }
        this.elements = aSN1EncodableArrCloneElements;
        if (!z10 && aSN1EncodableArrCloneElements.length >= 2) {
            aSN1EncodableArr = null;
        }
        this.sortedElements = aSN1EncodableArr;
    }

    public ASN1Set(ASN1Encodable[] aSN1EncodableArr, ASN1Encodable[] aSN1EncodableArr2) {
        this.elements = aSN1EncodableArr;
        this.sortedElements = aSN1EncodableArr2;
    }

    public static ASN1Set getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return (ASN1Set) TYPE.getContextInstance(aSN1TaggedObject, z10);
    }
}
