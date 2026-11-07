package org.bouncycastle.asn1;

import java.io.IOException;
import java.math.BigInteger;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Properties;
import p.i0;

/* loaded from: classes2.dex */
public class ASN1Integer extends ASN1Primitive {
    static final int SIGN_EXT_SIGNED = -1;
    static final int SIGN_EXT_UNSIGNED = 255;
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1Integer.class, 2) { // from class: org.bouncycastle.asn1.ASN1Integer.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1Integer.createPrimitive(dEROctetString.getOctets());
        }
    };
    private final byte[] bytes;
    private final int start;

    public ASN1Integer(long j10) {
        this.bytes = BigInteger.valueOf(j10).toByteArray();
        this.start = 0;
    }

    public static ASN1Integer createPrimitive(byte[] bArr) {
        return new ASN1Integer(bArr, false);
    }

    public static ASN1Integer getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1Integer)) {
            return (ASN1Integer) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(i0.a(obj, "illegal object in getInstance: "));
        }
        try {
            return (ASN1Integer) TYPE.fromByteArray((byte[]) obj);
        } catch (Exception e10) {
            throw new IllegalArgumentException(a.a(e10, new StringBuilder("encoding error in getInstance: ")));
        }
    }

    public static int intValue(byte[] bArr, int i10, int i11) {
        int length = bArr.length;
        int iMax = Math.max(i10, length - 4);
        int i12 = i11 & bArr[iMax];
        while (true) {
            iMax++;
            if (iMax >= length) {
                return i12;
            }
            i12 = (i12 << 8) | (bArr[iMax] & 255);
        }
    }

    public static boolean isMalformed(byte[] bArr) {
        int length = bArr.length;
        if (length != 0) {
            return (length == 1 || bArr[0] != (bArr[1] >> 7) || Properties.isOverrideSet("org.bouncycastle.asn1.allow_unsafe_integer")) ? false : true;
        }
        return true;
    }

    public static long longValue(byte[] bArr, int i10, int i11) {
        int length = bArr.length;
        int iMax = Math.max(i10, length - 8);
        long j10 = i11 & bArr[iMax];
        while (true) {
            iMax++;
            if (iMax >= length) {
                return j10;
            }
            j10 = (j10 << 8) | (bArr[iMax] & 255);
        }
    }

    public static int signBytesToSkip(byte[] bArr) {
        int length = bArr.length - 1;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            if (bArr[i10] != (bArr[i11] >> 7)) {
                break;
            }
            i10 = i11;
        }
        return i10;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1Integer) {
            return Arrays.areEqual(this.bytes, ((ASN1Integer) aSN1Primitive).bytes);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z10) throws IOException {
        aSN1OutputStream.writeEncodingDL(z10, 2, this.bytes);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z10) {
        return ASN1OutputStream.getLengthOfEncodingDL(z10, this.bytes.length);
    }

    public BigInteger getPositiveValue() {
        return new BigInteger(1, this.bytes);
    }

    public BigInteger getValue() {
        return new BigInteger(this.bytes);
    }

    public boolean hasValue(int i10) {
        byte[] bArr = this.bytes;
        int length = bArr.length;
        int i11 = this.start;
        return length - i11 <= 4 && intValue(bArr, i11, -1) == i10;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return Arrays.hashCode(this.bytes);
    }

    public int intPositiveValueExact() {
        byte[] bArr = this.bytes;
        int length = bArr.length;
        int i10 = this.start;
        int i11 = length - i10;
        if (i11 > 4 || (i11 == 4 && (bArr[i10] & 128) != 0)) {
            throw new ArithmeticException("ASN.1 Integer out of positive int range");
        }
        return intValue(bArr, i10, 255);
    }

    public int intValueExact() {
        byte[] bArr = this.bytes;
        int length = bArr.length;
        int i10 = this.start;
        if (length - i10 <= 4) {
            return intValue(bArr, i10, -1);
        }
        throw new ArithmeticException("ASN.1 Integer out of int range");
    }

    public long longValueExact() {
        byte[] bArr = this.bytes;
        int length = bArr.length;
        int i10 = this.start;
        if (length - i10 <= 8) {
            return longValue(bArr, i10, -1);
        }
        throw new ArithmeticException("ASN.1 Integer out of long range");
    }

    public String toString() {
        return getValue().toString();
    }

    public ASN1Integer(BigInteger bigInteger) {
        this.bytes = bigInteger.toByteArray();
        this.start = 0;
    }

    public boolean hasValue(long j10) {
        byte[] bArr = this.bytes;
        int length = bArr.length;
        int i10 = this.start;
        return length - i10 <= 8 && longValue(bArr, i10, -1) == j10;
    }

    public ASN1Integer(byte[] bArr) {
        this(bArr, true);
    }

    public boolean hasValue(BigInteger bigInteger) {
        return bigInteger != null && intValue(this.bytes, this.start, -1) == bigInteger.intValue() && getValue().equals(bigInteger);
    }

    public ASN1Integer(byte[] bArr, boolean z10) {
        if (isMalformed(bArr)) {
            throw new IllegalArgumentException("malformed integer");
        }
        this.bytes = z10 ? Arrays.clone(bArr) : bArr;
        this.start = signBytesToSkip(bArr);
    }

    public static ASN1Integer getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return (ASN1Integer) TYPE.getContextInstance(aSN1TaggedObject, z10);
    }
}
