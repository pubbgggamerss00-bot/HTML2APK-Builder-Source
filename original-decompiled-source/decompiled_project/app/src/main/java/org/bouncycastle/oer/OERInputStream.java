package org.bouncycastle.oer;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.DERUTF8String;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.oer.OERDefinition;
import org.bouncycastle.oer.SwitchIndexer;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;
import org.bouncycastle.util.io.Streams;
import p.i0;

/* loaded from: classes3.dex */
public class OERInputStream extends FilterInputStream {
    private static final int[] bits = {1, 2, 4, 8, 16, 32, 64, 128};
    private static final int[] bitsR = {128, 64, 32, 16, 8, 4, 2, 1};
    protected PrintWriter debugOutput;
    protected PrintWriter debugStream;
    private int maxByteAllocation;

    /* renamed from: org.bouncycastle.oer.OERInputStream$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType;

        static {
            int[] iArr = new int[OERDefinition.BaseType.values().length];
            $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType = iArr;
            try {
                iArr[OERDefinition.BaseType.OPAQUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.Switch.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.Supplier.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.SEQ_OF.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.SEQ.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.CHOICE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.ENUM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.INT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.OCTET_STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.IA5String.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.UTF8_STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.BIT_STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.NULL.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.EXTENSION.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.BOOLEAN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public static class Choice extends OERInputStream {
        final int preamble;
        final int tag;
        final int tagClass;

        public Choice(InputStream inputStream) throws IOException {
            int i10;
            super(inputStream);
            int i11 = read();
            this.preamble = i11;
            if (i11 < 0) {
                throw new EOFException("expecting preamble byte of choice");
            }
            this.tagClass = i11 & 192;
            int i12 = i11 & 63;
            if (i12 >= 63) {
                i12 = 0;
                do {
                    i10 = inputStream.read();
                    if (i10 < 0) {
                        throw new EOFException("expecting further tag bytes");
                    }
                    i12 = (i12 << 7) | (i10 & CertificateBody.profileType);
                } while ((i10 & 128) != 0);
            }
            this.tag = i12;
        }

        public int getTag() {
            return this.tag;
        }

        public int getTagClass() {
            return this.tagClass;
        }

        public boolean isApplicationTagClass() {
            return this.tagClass == 64;
        }

        public boolean isContextSpecific() {
            return this.tagClass == 128;
        }

        public boolean isPrivateTagClass() {
            return this.tagClass == 192;
        }

        public boolean isUniversalTagClass() {
            return this.tagClass == 0;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder("CHOICE(");
            int i10 = this.tagClass;
            if (i10 == 0) {
                str = "Universal ";
            } else if (i10 == 64) {
                str = "Application ";
            } else {
                if (i10 != 128) {
                    if (i10 == 192) {
                        str = "Private ";
                    }
                    sb.append("Tag = " + this.tag);
                    sb.append(")");
                    return sb.toString();
                }
                str = "ContextSpecific ";
            }
            sb.append(str);
            sb.append("Tag = " + this.tag);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class LengthInfo {
        private final BigInteger length;
        private final boolean shortForm;

        public LengthInfo(BigInteger bigInteger, boolean z10) {
            this.length = bigInteger;
            this.shortForm = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int intLength() {
            return BigIntegers.intValueExact(this.length);
        }
    }

    public static class Sequence extends OERInputStream {
        private final boolean extensionFlagSet;
        private final int preamble;
        private final boolean[] valuePresent;

        public Sequence(InputStream inputStream, Element element) throws IOException {
            int i10;
            super(inputStream);
            if (!element.hasPopulatedExtension() && element.getOptionals() <= 0 && !element.hasDefaultChildren()) {
                this.preamble = 0;
                this.extensionFlagSet = false;
                this.valuePresent = null;
                return;
            }
            int i11 = ((FilterInputStream) this).in.read();
            this.preamble = i11;
            if (i11 < 0) {
                throw new EOFException("expecting preamble byte of sequence");
            }
            this.extensionFlagSet = element.hasPopulatedExtension() && (i11 & 128) == 128;
            this.valuePresent = new boolean[element.getChildren().size()];
            int i12 = element.hasPopulatedExtension() ? 6 : 7;
            int i13 = 0;
            for (Element element2 : element.getChildren()) {
                if (element2.getBaseType() != OERDefinition.BaseType.EXTENSION) {
                    if (element2.getBlock() != 0) {
                        return;
                    }
                    if (element2.isExplicit()) {
                        i10 = i13 + 1;
                        this.valuePresent[i13] = true;
                    } else {
                        if (i12 < 0) {
                            i11 = inputStream.read();
                            if (i11 < 0) {
                                throw new EOFException("expecting mask byte sequence");
                            }
                            i12 = 7;
                        }
                        i10 = i13 + 1;
                        this.valuePresent[i13] = (OERInputStream.bits[i12] & i11) > 0;
                        i12--;
                    }
                    i13 = i10;
                }
            }
        }

        public boolean hasExtension() {
            return this.extensionFlagSet;
        }

        public boolean hasOptional(int i10) {
            return this.valuePresent[i10];
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("SEQ(");
            sb.append(hasExtension() ? "Ext " : "");
            if (this.valuePresent != null) {
                int i10 = 0;
                while (true) {
                    boolean[] zArr = this.valuePresent;
                    if (i10 >= zArr.length) {
                        break;
                    }
                    sb.append(zArr[i10] ? "1" : d.L0);
                    i10++;
                }
            } else {
                sb.append("*");
            }
            sb.append(")");
            return sb.toString();
        }
    }

    public OERInputStream(InputStream inputStream) {
        super(inputStream);
        this.debugOutput = null;
        this.maxByteAllocation = PKIFailureInfo.badCertTemplate;
        this.debugStream = null;
    }

    private ASN1Encodable absent(Element element) {
        debugPrint(element + "Absent");
        return OEROptional.ABSENT;
    }

    private byte[] allocateArray(int i10) {
        if (i10 <= this.maxByteAllocation) {
            return new byte[i10];
        }
        StringBuilder sbB = i0.b(i10, "required byte array size ", " was greater than ");
        sbB.append(this.maxByteAllocation);
        throw new IllegalArgumentException(sbB.toString());
    }

    private int countOptionalChildTypes(Element element) {
        Iterator<Element> it = element.getChildren().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += !it.next().isExplicit() ? 1 : 0;
        }
        return i10;
    }

    public static ASN1Encodable parse(byte[] bArr, Element element) throws IOException {
        return new OERInputStream(new ByteArrayInputStream(bArr)).parse(element);
    }

    public Choice choice() throws IOException {
        return new Choice(this);
    }

    public void debugPrint(String str) {
        if (this.debugOutput == null) {
            return;
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int i10 = -1;
        for (int i11 = 0; i11 != stackTrace.length; i11++) {
            StackTraceElement stackTraceElement = stackTrace[i11];
            if (stackTraceElement.getMethodName().equals("debugPrint")) {
                i10 = 0;
            } else if (stackTraceElement.getClassName().contains("OERInput")) {
                i10++;
            }
        }
        while (true) {
            PrintWriter printWriter = this.debugOutput;
            if (i10 <= 0) {
                printWriter.append((CharSequence) str).append((CharSequence) "\n");
                this.debugOutput.flush();
                return;
            } else {
                printWriter.append((CharSequence) "    ");
                i10--;
            }
        }
    }

    public BigInteger enumeration() throws IOException {
        int i10 = read();
        if (i10 == -1) {
            throw new EOFException("expecting prefix of enumeration");
        }
        if ((i10 & 128) != 128) {
            return BigInteger.valueOf(i10);
        }
        int i11 = i10 & CertificateBody.profileType;
        if (i11 == 0) {
            return BigInteger.ZERO;
        }
        byte[] bArr = new byte[i11];
        if (Streams.readFully(this, bArr) == i11) {
            return new BigInteger(1, bArr);
        }
        throw new EOFException("unable to fully read integer component of enumeration");
    }

    public BigInteger int16() throws Exception {
        return parseInt(false, 2);
    }

    public BigInteger int32() throws Exception {
        return parseInt(false, 4);
    }

    public BigInteger int64() throws Exception {
        return parseInt(false, 8);
    }

    public BigInteger int8() throws Exception {
        return parseInt(false, 1);
    }

    public BigInteger parseInt(boolean z10, int i10) throws Exception {
        byte[] bArr = new byte[i10];
        if (Streams.readFully(this, bArr) == i10) {
            return z10 ? new BigInteger(1, bArr) : new BigInteger(bArr);
        }
        throw new IllegalStateException("integer not fully read");
    }

    public ASN1Encodable parseOpenType(Element element) throws Throwable {
        byte[] bArrAllocateArray = allocateArray(readLength().intLength());
        if (Streams.readFully(((FilterInputStream) this).in, bArrAllocateArray) != bArrAllocateArray.length) {
            throw new IOException("did not fully read open type as raw bytes");
        }
        OERInputStream oERInputStream = null;
        try {
            OERInputStream oERInputStream2 = new OERInputStream(new ByteArrayInputStream(bArrAllocateArray));
            try {
                ASN1Object aSN1Object = oERInputStream2.parse(element);
                oERInputStream2.close();
                return aSN1Object;
            } catch (Throwable th2) {
                th = th2;
                oERInputStream = oERInputStream2;
                if (oERInputStream != null) {
                    oERInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public LengthInfo readLength() throws IOException {
        int i10 = read();
        if (i10 == -1) {
            throw new EOFException("expecting length");
        }
        if ((i10 & 128) == 0) {
            StringBuilder sb = new StringBuilder("Len (Short form): ");
            int i11 = i10 & CertificateBody.profileType;
            sb.append(i11);
            debugPrint(sb.toString());
            return new LengthInfo(BigInteger.valueOf(i11), true);
        }
        int i12 = i10 & CertificateBody.profileType;
        byte[] bArr = new byte[i12];
        if (Streams.readFully(this, bArr) != i12) {
            throw new EOFException("did not read all bytes of length definition");
        }
        StringBuilder sbB = i0.b(i12, "Len (Long Form): ", " actual len: ");
        sbB.append(Hex.toHexString(bArr));
        debugPrint(sbB.toString());
        return new LengthInfo(BigIntegers.fromUnsignedByteArray(bArr), false);
    }

    public BigInteger uint16() throws Exception {
        return parseInt(true, 2);
    }

    public BigInteger uint32() throws Exception {
        return parseInt(true, 4);
    }

    public BigInteger uint64() throws Exception {
        return parseInt(false, 8);
    }

    public BigInteger uint8() throws Exception {
        return parseInt(true, 1);
    }

    public OERInputStream(InputStream inputStream, int i10) {
        super(inputStream);
        this.debugOutput = null;
        this.debugStream = null;
        this.maxByteAllocation = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0299 A[PHI: r2
      0x0299: PHI (r2v19 byte[]) = (r2v18 byte[]), (r2v20 byte[]) binds: [B:99:0x0297, B:95:0x027d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0457  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ASN1Object parse(Element element) throws Throwable {
        ASN1Encodable openType;
        Element elementResult;
        byte[] bArrAllocateArray;
        BigInteger bigInteger;
        int i10 = 8;
        switch (AnonymousClass1.$SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[element.getBaseType().ordinal()]) {
            case 1:
                return parse(new Element(element.resolveSupplier().build(), element));
            case 2:
                throw new IllegalStateException("A switch element should only be found within a sequence.");
            case 3:
                return parse(new Element(element.getElementSupplier().build(), element));
            case 4:
                byte[] bArrAllocateArray2 = allocateArray(readLength().intLength());
                if (Streams.readFully(this, bArrAllocateArray2) != bArrAllocateArray2.length) {
                    throw new IOException("could not read all of count of seq-of values");
                }
                int iIntValue = BigIntegers.fromUnsignedByteArray(bArrAllocateArray2).intValue();
                debugPrint(element + "(len = " + iIntValue + ")");
                ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
                if (element.getChildren().get(0).getaSwitch() != null) {
                    throw new IllegalStateException("element def for item in SEQ OF has a switch, switches only supported in sequences");
                }
                for (int i11 = 0; i11 < iIntValue; i11++) {
                    aSN1EncodableVector.add(parse(Element.expandDeferredDefinition(element.getChildren().get(0), element)));
                }
                return new DERSequence(aSN1EncodableVector);
            case 5:
                Sequence sequence = new Sequence(((FilterInputStream) this).in, element);
                debugPrint(element + sequence.toString());
                ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
                List<Element> children = element.getChildren();
                int i12 = 0;
                while (i12 < children.size()) {
                    Element element2 = children.get(i12);
                    if (element2.getBaseType() != OERDefinition.BaseType.EXTENSION) {
                        if (element2.getBlock() > 0) {
                            if (sequence.extensionFlagSet) {
                                byte[] bArrAllocateArray3 = allocateArray(readLength().intLength());
                                if (Streams.readFully(((FilterInputStream) this).in, bArrAllocateArray3) != bArrAllocateArray3.length) {
                                    throw new IOException("did not fully read presence list.");
                                }
                                int length = (bArrAllocateArray3.length * 8) - bArrAllocateArray3[0];
                                while (true) {
                                    if (i12 < children.size() || i10 < length) {
                                        Element element3 = i12 < children.size() ? children.get(i12) : null;
                                        if (element3 != null) {
                                            if (i10 < length && (bArrAllocateArray3[i10 / 8] & bitsR[i10 % 8]) != 0) {
                                                openType = parseOpenType(element3);
                                            } else {
                                                if (element3.isExplicit()) {
                                                    throw new IOException("extension is marked as explicit but is not defined in presence list");
                                                }
                                                openType = OEROptional.ABSENT;
                                            }
                                            aSN1EncodableVector2.add(openType);
                                        } else if ((bArrAllocateArray3[i10 / 8] & bitsR[i10 % 8]) != 0) {
                                            int iIntLength = readLength().intLength();
                                            while (true) {
                                                iIntLength--;
                                                if (iIntLength >= 0) {
                                                    ((FilterInputStream) this).in.read();
                                                }
                                            }
                                        }
                                        i10++;
                                        i12++;
                                    }
                                }
                            }
                            return new DERSequence(aSN1EncodableVector2);
                        }
                        Element elementExpandDeferredDefinition = Element.expandDeferredDefinition(element2, element);
                        if (elementExpandDeferredDefinition.getaSwitch() != null) {
                            elementResult = elementExpandDeferredDefinition.getaSwitch().result(new SwitchIndexer.Asn1EncodableVectorIndexer(aSN1EncodableVector2));
                            if (elementResult.getParent() != element) {
                                elementResult = new Element(elementResult, element);
                            }
                        } else {
                            elementResult = elementExpandDeferredDefinition;
                        }
                        if (sequence.valuePresent != null) {
                            ASN1Encodable oEROptional = sequence.valuePresent[i12] ? elementResult.isExplicit() ? parse(elementResult) : OEROptional.getInstance(parse(elementResult)) : elementResult.getDefaultValue() != null ? elementExpandDeferredDefinition.getDefaultValue() : absent(elementExpandDeferredDefinition);
                            aSN1EncodableVector2.add(oEROptional);
                        }
                    }
                    i12++;
                }
                if (sequence.extensionFlagSet) {
                }
                return new DERSequence(aSN1EncodableVector2);
            case 6:
                Choice choice = choice();
                debugPrint(choice.toString() + " " + choice.tag);
                if (!choice.isContextSpecific()) {
                    if (choice.isApplicationTagClass()) {
                        throw new IllegalStateException("Unimplemented tag type");
                    }
                    if (choice.isPrivateTagClass()) {
                        throw new IllegalStateException("Unimplemented tag type");
                    }
                    if (choice.isUniversalTagClass()) {
                        throw new IllegalStateException("Unimplemented tag type");
                    }
                    throw new IllegalStateException("Unimplemented tag type");
                }
                Element elementExpandDeferredDefinition2 = Element.expandDeferredDefinition(element.getChildren().get(choice.getTag()), element);
                if (elementExpandDeferredDefinition2.getBlock() > 0) {
                    debugPrint("Chosen (Ext): " + elementExpandDeferredDefinition2);
                    return new DERTaggedObject(choice.tag, parseOpenType(elementExpandDeferredDefinition2));
                }
                debugPrint("Chosen: " + elementExpandDeferredDefinition2);
                return new DERTaggedObject(choice.tag, parse(elementExpandDeferredDefinition2));
            case 7:
                BigInteger bigIntegerEnumeration = enumeration();
                debugPrint(element + "ENUM(" + bigIntegerEnumeration + ") = " + element.getChildren().get(bigIntegerEnumeration.intValue()).getLabel());
                return new ASN1Enumerated(bigIntegerEnumeration);
            case 8:
                int iIntBytesForRange = element.intBytesForRange();
                if (iIntBytesForRange != 0) {
                    bArrAllocateArray = allocateArray(Math.abs(iIntBytesForRange));
                    Streams.readFully(this, bArrAllocateArray);
                    bigInteger = iIntBytesForRange < 0 ? new BigInteger(bArrAllocateArray) : BigIntegers.fromUnsignedByteArray(bArrAllocateArray);
                } else if (element.isLowerRangeZero()) {
                    bArrAllocateArray = allocateArray(readLength().intLength());
                    Streams.readFully(this, bArrAllocateArray);
                    bigInteger = bArrAllocateArray.length == 0 ? BigInteger.ZERO : new BigInteger(1, bArrAllocateArray);
                } else {
                    bArrAllocateArray = allocateArray(readLength().intLength());
                    Streams.readFully(this, bArrAllocateArray);
                    if (bArrAllocateArray.length != 0) {
                        bigInteger = new BigInteger(bArrAllocateArray);
                    }
                }
                if (this.debugOutput != null) {
                    debugPrint(element + "INTEGER byteLen= " + bArrAllocateArray.length + " hex= " + bigInteger.toString(16) + ")");
                }
                return new ASN1Integer(bigInteger);
            case 9:
                int iIntLength2 = (element.getUpperBound() == null || !element.getUpperBound().equals(element.getLowerBound())) ? readLength().intLength() : element.getUpperBound().intValue();
                byte[] bArrAllocateArray4 = allocateArray(iIntLength2);
                if (Streams.readFully(this, bArrAllocateArray4) != iIntLength2) {
                    throw new IOException("did not read all of " + element.getLabel());
                }
                if (this.debugOutput != null) {
                    int iMin = Math.min(bArrAllocateArray4.length, 32);
                    StringBuilder sb = new StringBuilder();
                    sb.append(element);
                    sb.append("OCTET STRING (");
                    sb.append(bArrAllocateArray4.length);
                    sb.append(") = ");
                    sb.append(Hex.toHexString(bArrAllocateArray4, 0, iMin));
                    sb.append(" ");
                    sb.append(bArrAllocateArray4.length > 32 ? "..." : "");
                    debugPrint(sb.toString());
                }
                return new DEROctetString(bArrAllocateArray4);
            case 10:
                byte[] bArrAllocateArray5 = allocateArray(element.isFixedLength() ? element.getUpperBound().intValue() : readLength().intLength());
                if (Streams.readFully(this, bArrAllocateArray5) != bArrAllocateArray5.length) {
                    throw new IOException("could not read all of IA5 string");
                }
                String strFromByteArray = Strings.fromByteArray(bArrAllocateArray5);
                if (this.debugOutput != null) {
                    debugPrint(element.appendLabel("IA5 String (" + bArrAllocateArray5.length + ") = " + strFromByteArray));
                }
                return new DERIA5String(strFromByteArray);
            case 11:
                byte[] bArrAllocateArray6 = allocateArray(readLength().intLength());
                if (Streams.readFully(this, bArrAllocateArray6) != bArrAllocateArray6.length) {
                    throw new IOException("could not read all of utf 8 string");
                }
                String strFromUTF8ByteArray = Strings.fromUTF8ByteArray(bArrAllocateArray6);
                if (this.debugOutput != null) {
                    debugPrint(element + "UTF8 String (" + bArrAllocateArray6.length + ") = " + strFromUTF8ByteArray);
                }
                return new DERUTF8String(strFromUTF8ByteArray);
            case 12:
                byte[] bArrAllocateArray7 = element.isFixedLength() ? new byte[element.getLowerBound().intValue() / 8] : allocateArray((BigInteger.ZERO.compareTo(element.getUpperBound()) > 0 ? element.getUpperBound().intValue() : readLength().intLength()) / 8);
                Streams.readFully(this, bArrAllocateArray7);
                if (this.debugOutput != null) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("BIT STRING(" + (bArrAllocateArray7.length * 8) + ") = ");
                    for (int i13 = 0; i13 != bArrAllocateArray7.length; i13++) {
                        byte b10 = bArrAllocateArray7[i13];
                        for (int i14 = 0; i14 < 8; i14++) {
                            stringBuffer.append((b10 & 128) > 0 ? "1" : d.L0);
                            b10 = (byte) (b10 << 1);
                        }
                    }
                    debugPrint(element + stringBuffer.toString());
                }
                return new DERBitString(bArrAllocateArray7);
            case 13:
                debugPrint(element + "NULL");
                return DERNull.INSTANCE;
            case 14:
                LengthInfo length2 = readLength();
                byte[] bArr = new byte[length2.intLength()];
                if (Streams.readFully(this, bArr) != length2.intLength()) {
                    throw new IOException("could not read all of count of open value in choice (...) ");
                }
                debugPrint("ext " + length2.intLength() + " " + Hex.toHexString(bArr));
                return new DEROctetString(bArr);
            case 15:
                return read() == 0 ? ASN1Boolean.FALSE : ASN1Boolean.TRUE;
            default:
                throw new IllegalStateException("Unhandled type " + element.getBaseType());
        }
    }
}
