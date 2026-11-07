package org.bouncycastle.asn1.util;

import k1.q;
import k3.a;
import org.bouncycastle.asn1.ASN1BMPString;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1External;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1GraphicString;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1NumericString;
import org.bouncycastle.asn1.ASN1ObjectDescriptor;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1PrintableString;
import org.bouncycastle.asn1.ASN1RelativeOID;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1T61String;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1UTCTime;
import org.bouncycastle.asn1.ASN1UTF8String;
import org.bouncycastle.asn1.ASN1Util;
import org.bouncycastle.asn1.ASN1VideotexString;
import org.bouncycastle.asn1.ASN1VisibleString;
import org.bouncycastle.asn1.BEROctetString;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.BERSet;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.DLBitString;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;
import v5.b;

/* loaded from: classes2.dex */
public class ASN1Dump {
    private static final int SAMPLE_SIZE = 32;
    private static final String TAB = "    ";

    public static void _dumpAsString(String str, boolean z10, ASN1Primitive aSN1Primitive, StringBuffer stringBuffer) {
        StringBuilder sbA;
        int length;
        String strLineSeparator = Strings.lineSeparator();
        if (aSN1Primitive instanceof ASN1Null) {
            stringBuffer.append(str);
            stringBuffer.append("NULL");
            stringBuffer.append(strLineSeparator);
            return;
        }
        int i10 = 0;
        if (aSN1Primitive instanceof ASN1Sequence) {
            stringBuffer.append(str);
            stringBuffer.append(aSN1Primitive instanceof BERSequence ? "BER Sequence" : aSN1Primitive instanceof DERSequence ? "DER Sequence" : "Sequence");
            stringBuffer.append(strLineSeparator);
            ASN1Sequence aSN1Sequence = (ASN1Sequence) aSN1Primitive;
            String strA = a.a(str, TAB);
            int size = aSN1Sequence.size();
            while (i10 < size) {
                _dumpAsString(strA, z10, aSN1Sequence.getObjectAt(i10).toASN1Primitive(), stringBuffer);
                i10++;
            }
            return;
        }
        if (aSN1Primitive instanceof ASN1Set) {
            stringBuffer.append(str);
            stringBuffer.append(aSN1Primitive instanceof BERSet ? "BER Set" : aSN1Primitive instanceof DERSet ? "DER Set" : "Set");
            stringBuffer.append(strLineSeparator);
            ASN1Set aSN1Set = (ASN1Set) aSN1Primitive;
            String strA2 = a.a(str, TAB);
            int size2 = aSN1Set.size();
            while (i10 < size2) {
                _dumpAsString(strA2, z10, aSN1Set.getObjectAt(i10).toASN1Primitive(), stringBuffer);
                i10++;
            }
            return;
        }
        if (aSN1Primitive instanceof ASN1TaggedObject) {
            stringBuffer.append(str);
            stringBuffer.append(aSN1Primitive instanceof BERTaggedObject ? "BER Tagged " : aSN1Primitive instanceof DERTaggedObject ? "DER Tagged " : "Tagged ");
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Primitive;
            stringBuffer.append(ASN1Util.getTagText(aSN1TaggedObject));
            if (!aSN1TaggedObject.isExplicit()) {
                stringBuffer.append(" IMPLICIT ");
            }
            stringBuffer.append(strLineSeparator);
            _dumpAsString(str + TAB, z10, aSN1TaggedObject.getBaseObject().toASN1Primitive(), stringBuffer);
            return;
        }
        if (aSN1Primitive instanceof ASN1OctetString) {
            ASN1OctetString aSN1OctetString = (ASN1OctetString) aSN1Primitive;
            if (aSN1Primitive instanceof BEROctetString) {
                sbA = b.a(str, "BER Constructed Octet String[");
                length = aSN1OctetString.getOctets().length;
            } else {
                sbA = b.a(str, "DER Octet String[");
                length = aSN1OctetString.getOctets().length;
            }
            sbA.append(length);
            sbA.append("] ");
            stringBuffer.append(sbA.toString());
            if (z10) {
                stringBuffer.append(dumpBinaryDataAsString(str, aSN1OctetString.getOctets()));
                return;
            } else {
                stringBuffer.append(strLineSeparator);
                return;
            }
        }
        if (aSN1Primitive instanceof ASN1ObjectIdentifier) {
            StringBuilder sbA2 = b.a(str, "ObjectIdentifier(");
            sbA2.append(((ASN1ObjectIdentifier) aSN1Primitive).getId());
            sbA2.append(")");
            sbA2.append(strLineSeparator);
            stringBuffer.append(sbA2.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1RelativeOID) {
            StringBuilder sbA3 = b.a(str, "RelativeOID(");
            sbA3.append(((ASN1RelativeOID) aSN1Primitive).getId());
            sbA3.append(")");
            sbA3.append(strLineSeparator);
            stringBuffer.append(sbA3.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1Boolean) {
            StringBuilder sbA4 = b.a(str, "Boolean(");
            sbA4.append(((ASN1Boolean) aSN1Primitive).isTrue());
            sbA4.append(")");
            sbA4.append(strLineSeparator);
            stringBuffer.append(sbA4.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1Integer) {
            StringBuilder sbA5 = b.a(str, "Integer(");
            sbA5.append(((ASN1Integer) aSN1Primitive).getValue());
            sbA5.append(")");
            sbA5.append(strLineSeparator);
            stringBuffer.append(sbA5.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1BitString) {
            ASN1BitString aSN1BitString = (ASN1BitString) aSN1Primitive;
            byte[] bytes = aSN1BitString.getBytes();
            int padBits = aSN1BitString.getPadBits();
            StringBuilder sbA6 = b.a(str, aSN1BitString instanceof DERBitString ? "DER Bit String[" : aSN1BitString instanceof DLBitString ? "DL Bit String[" : "BER Bit String[");
            sbA6.append(bytes.length);
            sbA6.append(", ");
            sbA6.append(padBits);
            sbA6.append("] ");
            stringBuffer.append(sbA6.toString());
            if (z10) {
                stringBuffer.append(dumpBinaryDataAsString(str, bytes));
                return;
            } else {
                stringBuffer.append(strLineSeparator);
                return;
            }
        }
        if (aSN1Primitive instanceof ASN1IA5String) {
            StringBuilder sbA7 = b.a(str, "IA5String(");
            sbA7.append(((ASN1IA5String) aSN1Primitive).getString());
            sbA7.append(") ");
            sbA7.append(strLineSeparator);
            stringBuffer.append(sbA7.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1UTF8String) {
            StringBuilder sbA8 = b.a(str, "UTF8String(");
            sbA8.append(((ASN1UTF8String) aSN1Primitive).getString());
            sbA8.append(") ");
            sbA8.append(strLineSeparator);
            stringBuffer.append(sbA8.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1NumericString) {
            StringBuilder sbA9 = b.a(str, "NumericString(");
            sbA9.append(((ASN1NumericString) aSN1Primitive).getString());
            sbA9.append(") ");
            sbA9.append(strLineSeparator);
            stringBuffer.append(sbA9.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1PrintableString) {
            StringBuilder sbA10 = b.a(str, "PrintableString(");
            sbA10.append(((ASN1PrintableString) aSN1Primitive).getString());
            sbA10.append(") ");
            sbA10.append(strLineSeparator);
            stringBuffer.append(sbA10.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1VisibleString) {
            StringBuilder sbA11 = b.a(str, "VisibleString(");
            sbA11.append(((ASN1VisibleString) aSN1Primitive).getString());
            sbA11.append(") ");
            sbA11.append(strLineSeparator);
            stringBuffer.append(sbA11.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1BMPString) {
            StringBuilder sbA12 = b.a(str, "BMPString(");
            sbA12.append(((ASN1BMPString) aSN1Primitive).getString());
            sbA12.append(") ");
            sbA12.append(strLineSeparator);
            stringBuffer.append(sbA12.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1T61String) {
            StringBuilder sbA13 = b.a(str, "T61String(");
            sbA13.append(((ASN1T61String) aSN1Primitive).getString());
            sbA13.append(") ");
            sbA13.append(strLineSeparator);
            stringBuffer.append(sbA13.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1GraphicString) {
            StringBuilder sbA14 = b.a(str, "GraphicString(");
            sbA14.append(((ASN1GraphicString) aSN1Primitive).getString());
            sbA14.append(") ");
            sbA14.append(strLineSeparator);
            stringBuffer.append(sbA14.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1VideotexString) {
            StringBuilder sbA15 = b.a(str, "VideotexString(");
            sbA15.append(((ASN1VideotexString) aSN1Primitive).getString());
            sbA15.append(") ");
            sbA15.append(strLineSeparator);
            stringBuffer.append(sbA15.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1UTCTime) {
            StringBuilder sbA16 = b.a(str, "UTCTime(");
            sbA16.append(((ASN1UTCTime) aSN1Primitive).getTime());
            sbA16.append(") ");
            sbA16.append(strLineSeparator);
            stringBuffer.append(sbA16.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1GeneralizedTime) {
            StringBuilder sbA17 = b.a(str, "GeneralizedTime(");
            sbA17.append(((ASN1GeneralizedTime) aSN1Primitive).getTime());
            sbA17.append(") ");
            sbA17.append(strLineSeparator);
            stringBuffer.append(sbA17.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1Enumerated) {
            StringBuilder sbA18 = b.a(str, "DER Enumerated(");
            sbA18.append(((ASN1Enumerated) aSN1Primitive).getValue());
            sbA18.append(")");
            sbA18.append(strLineSeparator);
            stringBuffer.append(sbA18.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1ObjectDescriptor) {
            StringBuilder sbA19 = b.a(str, "ObjectDescriptor(");
            sbA19.append(((ASN1ObjectDescriptor) aSN1Primitive).getBaseGraphicString().getString());
            sbA19.append(") ");
            sbA19.append(strLineSeparator);
            stringBuffer.append(sbA19.toString());
            return;
        }
        if (!(aSN1Primitive instanceof ASN1External)) {
            StringBuilder sbA20 = q.a(str);
            sbA20.append(aSN1Primitive.toString());
            sbA20.append(strLineSeparator);
            stringBuffer.append(sbA20.toString());
            return;
        }
        ASN1External aSN1External = (ASN1External) aSN1Primitive;
        stringBuffer.append(str + "External " + strLineSeparator);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(TAB);
        String string = sb.toString();
        if (aSN1External.getDirectReference() != null) {
            StringBuilder sbA21 = b.a(string, "Direct Reference: ");
            sbA21.append(aSN1External.getDirectReference().getId());
            sbA21.append(strLineSeparator);
            stringBuffer.append(sbA21.toString());
        }
        if (aSN1External.getIndirectReference() != null) {
            StringBuilder sbA22 = b.a(string, "Indirect Reference: ");
            sbA22.append(aSN1External.getIndirectReference().toString());
            sbA22.append(strLineSeparator);
            stringBuffer.append(sbA22.toString());
        }
        if (aSN1External.getDataValueDescriptor() != null) {
            _dumpAsString(string, z10, aSN1External.getDataValueDescriptor(), stringBuffer);
        }
        StringBuilder sbA23 = b.a(string, "Encoding: ");
        sbA23.append(aSN1External.getEncoding());
        sbA23.append(strLineSeparator);
        stringBuffer.append(sbA23.toString());
        _dumpAsString(string, z10, aSN1External.getExternalContent(), stringBuffer);
    }

    private static String calculateAscString(byte[] bArr, int i10, int i11) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i12 = i10; i12 != i10 + i11; i12++) {
            byte b10 = bArr[i12];
            if (b10 >= 32 && b10 <= 126) {
                stringBuffer.append((char) b10);
            }
        }
        return stringBuffer.toString();
    }

    public static String dumpAsString(Object obj) {
        return dumpAsString(obj, false);
    }

    private static String dumpBinaryDataAsString(String str, byte[] bArr) {
        String strCalculateAscString;
        String strLineSeparator = Strings.lineSeparator();
        StringBuffer stringBuffer = new StringBuffer();
        String str2 = str + TAB;
        stringBuffer.append(strLineSeparator);
        for (int i10 = 0; i10 < bArr.length; i10 += 32) {
            int length = bArr.length - i10;
            stringBuffer.append(str2);
            if (length > 32) {
                stringBuffer.append(Strings.fromByteArray(Hex.encode(bArr, i10, 32)));
                stringBuffer.append(TAB);
                strCalculateAscString = calculateAscString(bArr, i10, 32);
            } else {
                stringBuffer.append(Strings.fromByteArray(Hex.encode(bArr, i10, bArr.length - i10)));
                for (int length2 = bArr.length - i10; length2 != 32; length2++) {
                    stringBuffer.append("  ");
                }
                stringBuffer.append(TAB);
                strCalculateAscString = calculateAscString(bArr, i10, bArr.length - i10);
            }
            stringBuffer.append(strCalculateAscString);
            stringBuffer.append(strLineSeparator);
        }
        return stringBuffer.toString();
    }

    public static String dumpAsString(Object obj, boolean z10) {
        ASN1Primitive aSN1Primitive;
        if (obj instanceof ASN1Primitive) {
            aSN1Primitive = (ASN1Primitive) obj;
        } else {
            if (!(obj instanceof ASN1Encodable)) {
                return "unknown object type " + obj.toString();
            }
            aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
        }
        StringBuffer stringBuffer = new StringBuffer();
        _dumpAsString("", z10, aSN1Primitive, stringBuffer);
        return stringBuffer.toString();
    }
}
