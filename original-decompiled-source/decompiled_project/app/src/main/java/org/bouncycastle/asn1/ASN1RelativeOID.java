package org.bouncycastle.asn1;

import i8.n;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.util.Arrays;
import p.i0;

/* loaded from: classes2.dex */
public class ASN1RelativeOID extends ASN1Primitive {
    private static final long LONG_LIMIT = 72057594037927808L;
    private static final int MAX_CONTENTS_LENGTH = 4096;
    private static final int MAX_IDENTIFIER_LENGTH = 16383;
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1RelativeOID.class, 13) { // from class: org.bouncycastle.asn1.ASN1RelativeOID.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1RelativeOID.createPrimitive(dEROctetString.getOctets(), false);
        }
    };
    private static final ConcurrentMap<ASN1ObjectIdentifier.OidHandle, ASN1RelativeOID> pool = new ConcurrentHashMap();
    private final byte[] contents;
    private String identifier;

    public ASN1RelativeOID(String str) {
        checkIdentifier(str);
        byte[] identifier = parseIdentifier(str);
        checkContentsLength(identifier.length);
        this.contents = identifier;
        this.identifier = str;
    }

    public static void checkContentsLength(int i10) {
        if (i10 > 4096) {
            throw new IllegalArgumentException("exceeded relative OID contents length limit");
        }
    }

    public static void checkIdentifier(String str) {
        if (str == null) {
            throw new NullPointerException("'identifier' cannot be null");
        }
        if (str.length() > MAX_IDENTIFIER_LENGTH) {
            throw new IllegalArgumentException("exceeded relative OID contents length limit");
        }
        if (!isValidIdentifier(str, 0)) {
            throw new IllegalArgumentException(n.d("string ", str, " not a valid relative OID"));
        }
    }

    public static ASN1RelativeOID createPrimitive(byte[] bArr, boolean z10) {
        checkContentsLength(bArr.length);
        ASN1RelativeOID aSN1RelativeOID = pool.get(new ASN1ObjectIdentifier.OidHandle(bArr));
        if (aSN1RelativeOID != null) {
            return aSN1RelativeOID;
        }
        if (!isValidContents(bArr)) {
            throw new IllegalArgumentException("invalid relative OID contents");
        }
        if (z10) {
            bArr = Arrays.clone(bArr);
        }
        return new ASN1RelativeOID(bArr, null);
    }

    public static ASN1RelativeOID fromContents(byte[] bArr) {
        if (bArr != null) {
            return createPrimitive(bArr, true);
        }
        throw new NullPointerException("'contents' cannot be null");
    }

    public static ASN1RelativeOID getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1RelativeOID)) {
            return (ASN1RelativeOID) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1RelativeOID) {
                return (ASN1RelativeOID) aSN1Primitive;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (ASN1RelativeOID) TYPE.fromByteArray((byte[]) obj);
            } catch (IOException e10) {
                throw new IllegalArgumentException(b.a(e10, new StringBuilder("failed to construct relative OID from byte[]: ")));
            }
        }
        throw new IllegalArgumentException(i0.a(obj, "illegal object in getInstance: "));
    }

    public static boolean isValidContents(byte[] bArr) {
        if (bArr.length < 1) {
            return false;
        }
        boolean z10 = true;
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (z10 && (bArr[i10] & 255) == 128) {
                return false;
            }
            z10 = (bArr[i10] & 128) == 0;
        }
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean isValidIdentifier(String str, int i10) {
        int length = str.length();
        int i11 = 0;
        while (true) {
            int i12 = length - 1;
            if (i12 < i10) {
                return i11 != 0 && (i11 <= 1 || str.charAt(length) != '0');
            }
            char cCharAt = str.charAt(i12);
            if (cCharAt == '.') {
                if (i11 == 0 || (i11 > 1 && str.charAt(length) == '0')) {
                    break;
                }
                i11 = 0;
            } else {
                if ('0' > cCharAt || cCharAt > '9') {
                    break;
                }
                i11++;
            }
            length = i12;
        }
        return false;
    }

    public static String parseContents(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z10 = true;
        BigInteger bigIntegerShiftLeft = null;
        long j10 = 0;
        for (int i10 = 0; i10 != bArr.length; i10++) {
            byte b10 = bArr[i10];
            if (j10 <= LONG_LIMIT) {
                long j11 = j10 + (b10 & Byte.MAX_VALUE);
                if ((b10 & 128) == 0) {
                    if (z10) {
                        z10 = false;
                    } else {
                        stringBuffer.append('.');
                    }
                    stringBuffer.append(j11);
                    j10 = 0;
                } else {
                    j10 = j11 << 7;
                }
            } else {
                if (bigIntegerShiftLeft == null) {
                    bigIntegerShiftLeft = BigInteger.valueOf(j10);
                }
                BigInteger bigIntegerOr = bigIntegerShiftLeft.or(BigInteger.valueOf(b10 & Byte.MAX_VALUE));
                if ((b10 & 128) == 0) {
                    if (z10) {
                        z10 = false;
                    } else {
                        stringBuffer.append('.');
                    }
                    stringBuffer.append(bigIntegerOr);
                    bigIntegerShiftLeft = null;
                    j10 = 0;
                } else {
                    bigIntegerShiftLeft = bigIntegerOr.shiftLeft(7);
                }
            }
        }
        return stringBuffer.toString();
    }

    public static byte[] parseIdentifier(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OIDTokenizer oIDTokenizer = new OIDTokenizer(str);
        while (oIDTokenizer.hasMoreTokens()) {
            String strNextToken = oIDTokenizer.nextToken();
            if (strNextToken.length() <= 18) {
                writeField(byteArrayOutputStream, Long.parseLong(strNextToken));
            } else {
                writeField(byteArrayOutputStream, new BigInteger(strNextToken));
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static ASN1RelativeOID tryFromID(String str) {
        if (str == null) {
            throw new NullPointerException("'identifier' cannot be null");
        }
        if (str.length() > MAX_IDENTIFIER_LENGTH || !isValidIdentifier(str, 0)) {
            return null;
        }
        byte[] identifier = parseIdentifier(str);
        if (identifier.length <= 4096) {
            return new ASN1RelativeOID(identifier, str);
        }
        return null;
    }

    public static void writeField(ByteArrayOutputStream byteArrayOutputStream, long j10) {
        byte[] bArr = new byte[9];
        int i10 = 8;
        bArr[8] = (byte) (((int) j10) & CertificateBody.profileType);
        while (j10 >= 128) {
            j10 >>= 7;
            i10--;
            bArr[i10] = (byte) (((int) j10) | 128);
        }
        byteArrayOutputStream.write(bArr, i10, 9 - i10);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (this == aSN1Primitive) {
            return true;
        }
        if (aSN1Primitive instanceof ASN1RelativeOID) {
            return Arrays.areEqual(this.contents, ((ASN1RelativeOID) aSN1Primitive).contents);
        }
        return false;
    }

    public ASN1RelativeOID branch(String str) {
        checkIdentifier(str);
        byte[] identifier = parseIdentifier(str);
        checkContentsLength(this.contents.length + identifier.length);
        return new ASN1RelativeOID(Arrays.concatenate(this.contents, identifier), getId() + "." + str);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z10) throws IOException {
        aSN1OutputStream.writeEncodingDL(z10, 13, this.contents);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z10) {
        return ASN1OutputStream.getLengthOfEncodingDL(z10, this.contents.length);
    }

    public synchronized String getId() {
        try {
            if (this.identifier == null) {
                this.identifier = parseContents(this.contents);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.identifier;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return Arrays.hashCode(this.contents);
    }

    public String toString() {
        return getId();
    }

    private ASN1RelativeOID(byte[] bArr, String str) {
        this.contents = bArr;
        this.identifier = str;
    }

    public static void writeField(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int iBitLength = (bigInteger.bitLength() + 6) / 7;
        if (iBitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[iBitLength];
        int i10 = iBitLength - 1;
        for (int i11 = i10; i11 >= 0; i11--) {
            bArr[i11] = (byte) (bigInteger.intValue() | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i10] = (byte) (bArr[i10] & Byte.MAX_VALUE);
        byteArrayOutputStream.write(bArr, 0, iBitLength);
    }

    public static ASN1RelativeOID getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return (ASN1RelativeOID) TYPE.getContextInstance(aSN1TaggedObject, z10);
    }
}
