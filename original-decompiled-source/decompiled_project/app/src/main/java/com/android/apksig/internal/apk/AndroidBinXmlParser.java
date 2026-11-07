package com.android.apksig.internal.apk;

import h1.y;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m0.r;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.crypto.hpke.HPKE;
import p.i0;

/* loaded from: classes.dex */
public class AndroidBinXmlParser {
    public static final int EVENT_END_DOCUMENT = 2;
    public static final int EVENT_END_ELEMENT = 4;
    public static final int EVENT_START_DOCUMENT = 1;
    public static final int EVENT_START_ELEMENT = 3;
    private static final long NO_NAMESPACE = 4294967295L;
    public static final int VALUE_TYPE_BOOLEAN = 4;
    public static final int VALUE_TYPE_INT = 2;
    public static final int VALUE_TYPE_REFERENCE = 3;
    public static final int VALUE_TYPE_STRING = 1;
    public static final int VALUE_TYPE_UNSUPPORTED = 0;
    private int mCurrentElementAttrSizeBytes;
    private int mCurrentElementAttributeCount;
    private List<Attribute> mCurrentElementAttributes;
    private ByteBuffer mCurrentElementAttributesContents;
    private String mCurrentElementName;
    private String mCurrentElementNamespace;
    private int mCurrentEvent = 1;
    private int mDepth;
    private ResourceMap mResourceMap;
    private StringPool mStringPool;
    private final ByteBuffer mXml;

    public static class Attribute {
        private static final int TYPE_INT_BOOLEAN = 18;
        private static final int TYPE_INT_DEC = 16;
        private static final int TYPE_INT_HEX = 17;
        private static final int TYPE_REFERENCE = 1;
        private static final int TYPE_STRING = 3;
        private final long mNameId;
        private final long mNsId;
        private final ResourceMap mResourceMap;
        private final StringPool mStringPool;
        private final int mValueData;
        private final int mValueType;

        public boolean getBooleanValue() throws XmlParserException {
            if (this.mValueType == 18) {
                return this.mValueData != 0;
            }
            throw new XmlParserException("Cannot coerce to boolean: value type " + this.mValueType);
        }

        public int getIntValue() throws XmlParserException {
            int i10 = this.mValueType;
            if (i10 != 1) {
                switch (i10) {
                    case 16:
                    case 17:
                    case 18:
                        break;
                    default:
                        throw new XmlParserException("Cannot coerce to int: value type " + this.mValueType);
                }
            }
            return this.mValueData;
        }

        public String getName() throws XmlParserException {
            return this.mStringPool.getString(this.mNameId);
        }

        public int getNameResourceId() {
            ResourceMap resourceMap = this.mResourceMap;
            if (resourceMap != null) {
                return resourceMap.getResourceId(this.mNameId);
            }
            return 0;
        }

        public String getNamespace() throws XmlParserException {
            long j10 = this.mNsId;
            return j10 != 4294967295L ? this.mStringPool.getString(j10) : "";
        }

        public String getStringValue() throws XmlParserException {
            int i10 = this.mValueType;
            if (i10 == 1) {
                return "@" + Integer.toHexString(this.mValueData);
            }
            if (i10 == 3) {
                return this.mStringPool.getString(this.mValueData & 4294967295L);
            }
            switch (i10) {
                case 16:
                    return Integer.toString(this.mValueData);
                case 17:
                    return "0x" + Integer.toHexString(this.mValueData);
                case 18:
                    return Boolean.toString(this.mValueData != 0);
                default:
                    throw new XmlParserException("Cannot coerce to string: value type " + this.mValueType);
            }
        }

        public int getValueType() {
            return this.mValueType;
        }

        private Attribute(long j10, long j11, int i10, int i11, StringPool stringPool, ResourceMap resourceMap) {
            this.mNsId = j10;
            this.mNameId = j11;
            this.mValueType = i10;
            this.mValueData = i11;
            this.mStringPool = stringPool;
            this.mResourceMap = resourceMap;
        }
    }

    public static class Chunk {
        static final int HEADER_MIN_SIZE_BYTES = 8;
        public static final int RES_XML_TYPE_END_ELEMENT = 259;
        public static final int RES_XML_TYPE_RESOURCE_MAP = 384;
        public static final int RES_XML_TYPE_START_ELEMENT = 258;
        public static final int TYPE_RES_XML = 3;
        public static final int TYPE_STRING_POOL = 1;
        private final ByteBuffer mContents;
        private final ByteBuffer mHeader;
        private final int mType;

        public Chunk(int i10, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
            this.mType = i10;
            this.mHeader = byteBuffer;
            this.mContents = byteBuffer2;
        }

        public static Chunk get(ByteBuffer byteBuffer) throws XmlParserException {
            if (byteBuffer.remaining() < 8) {
                byteBuffer.position(byteBuffer.limit());
                return null;
            }
            int iPosition = byteBuffer.position();
            int unsignedInt16 = AndroidBinXmlParser.getUnsignedInt16(byteBuffer);
            int unsignedInt162 = AndroidBinXmlParser.getUnsignedInt16(byteBuffer);
            long unsignedInt32 = AndroidBinXmlParser.getUnsignedInt32(byteBuffer);
            if (unsignedInt32 - 8 > byteBuffer.remaining()) {
                byteBuffer.position(byteBuffer.limit());
                return null;
            }
            if (unsignedInt162 < 8) {
                throw new XmlParserException(ad.b.b(unsignedInt162, "Malformed chunk: header too short: ", " bytes"));
            }
            if (unsignedInt162 <= unsignedInt32) {
                int i10 = unsignedInt162 + iPosition;
                long j10 = iPosition + unsignedInt32;
                Chunk chunk = new Chunk(unsignedInt16, AndroidBinXmlParser.sliceFromTo(byteBuffer, iPosition, i10), AndroidBinXmlParser.sliceFromTo(byteBuffer, i10, j10));
                byteBuffer.position((int) j10);
                return chunk;
            }
            throw new XmlParserException("Malformed chunk: header too long: " + unsignedInt162 + " bytes. Chunk size: " + unsignedInt32 + " bytes");
        }

        public ByteBuffer getContents() {
            ByteBuffer byteBufferSlice = this.mContents.slice();
            byteBufferSlice.order(this.mContents.order());
            return byteBufferSlice;
        }

        public ByteBuffer getHeader() {
            ByteBuffer byteBufferSlice = this.mHeader.slice();
            byteBufferSlice.order(this.mHeader.order());
            return byteBufferSlice;
        }

        public int getType() {
            return this.mType;
        }
    }

    public static class ResourceMap {
        private final ByteBuffer mChunkContents;
        private final int mEntryCount;

        public ResourceMap(Chunk chunk) throws XmlParserException {
            ByteBuffer byteBufferSlice = chunk.getContents().slice();
            this.mChunkContents = byteBufferSlice;
            byteBufferSlice.order(chunk.getContents().order());
            this.mEntryCount = byteBufferSlice.remaining() / 4;
        }

        public int getResourceId(long j10) {
            if (j10 < 0 || j10 >= this.mEntryCount) {
                return 0;
            }
            return this.mChunkContents.getInt(((int) j10) * 4);
        }
    }

    public static class StringPool {
        private static final int FLAG_UTF8 = 256;
        private final Map<Integer, String> mCachedStrings = new HashMap();
        private final ByteBuffer mChunkContents;
        private final int mStringCount;
        private final ByteBuffer mStringsSection;
        private final boolean mUtf8Encoded;

        public StringPool(Chunk chunk) throws XmlParserException {
            long j10;
            int iRemaining;
            ByteBuffer header = chunk.getHeader();
            int iRemaining2 = header.remaining();
            header.position(8);
            if (header.remaining() < 20) {
                throw new XmlParserException("XML chunk's header too short. Required at least 20 bytes. Available: " + header.remaining() + " bytes");
            }
            long unsignedInt32 = AndroidBinXmlParser.getUnsignedInt32(header);
            if (unsignedInt32 > 2147483647L) {
                throw new XmlParserException(r.a("Too many strings: ", unsignedInt32));
            }
            int i10 = (int) unsignedInt32;
            this.mStringCount = i10;
            long unsignedInt322 = AndroidBinXmlParser.getUnsignedInt32(header);
            if (unsignedInt322 > 2147483647L) {
                throw new XmlParserException(r.a("Too many styles: ", unsignedInt322));
            }
            long unsignedInt323 = AndroidBinXmlParser.getUnsignedInt32(header);
            long unsignedInt324 = AndroidBinXmlParser.getUnsignedInt32(header);
            long unsignedInt325 = AndroidBinXmlParser.getUnsignedInt32(header);
            ByteBuffer contents = chunk.getContents();
            if (i10 > 0) {
                long j11 = iRemaining2;
                j10 = 0;
                int i11 = (int) (unsignedInt324 - j11);
                if (unsignedInt322 <= 0) {
                    iRemaining = contents.remaining();
                } else {
                    if (unsignedInt325 < unsignedInt324) {
                        throw new XmlParserException(a.a(unsignedInt324, ")", y.a("Styles offset (", ") < strings offset (", unsignedInt325)));
                    }
                    iRemaining = (int) (unsignedInt325 - j11);
                }
                this.mStringsSection = AndroidBinXmlParser.sliceFromTo(contents, i11, iRemaining);
            } else {
                j10 = 0;
                this.mStringsSection = ByteBuffer.allocate(0);
            }
            this.mUtf8Encoded = (256 & unsignedInt323) != j10;
            this.mChunkContents = contents;
        }

        private static String getLengthPrefixedUtf16EncodedString(ByteBuffer byteBuffer) throws XmlParserException {
            byte[] bArrArray;
            int iPosition;
            int unsignedInt16 = AndroidBinXmlParser.getUnsignedInt16(byteBuffer);
            if ((32768 & unsignedInt16) != 0) {
                unsignedInt16 = ((unsignedInt16 & 32767) << 16) | AndroidBinXmlParser.getUnsignedInt16(byteBuffer);
            }
            if (unsignedInt16 > 1073741823) {
                throw new XmlParserException(ad.b.b(unsignedInt16, "String too long: ", " uint16s"));
            }
            int i10 = unsignedInt16 * 2;
            if (byteBuffer.hasArray()) {
                bArrArray = byteBuffer.array();
                iPosition = byteBuffer.position() + byteBuffer.arrayOffset();
                byteBuffer.position(byteBuffer.position() + i10);
            } else {
                bArrArray = new byte[i10];
                byteBuffer.get(bArrArray);
                iPosition = 0;
            }
            int i11 = iPosition + i10;
            if (bArrArray[i11] != 0 || bArrArray[i11 + 1] != 0) {
                throw new XmlParserException("UTF-16 encoded form of string not NULL terminated");
            }
            try {
                return new String(bArrArray, iPosition, i10, "UTF-16LE");
            } catch (UnsupportedEncodingException e10) {
                throw new RuntimeException("UTF-16LE character encoding not supported", e10);
            }
        }

        private static String getLengthPrefixedUtf8EncodedString(ByteBuffer byteBuffer) throws XmlParserException {
            byte[] bArrArray;
            int iPosition;
            if ((AndroidBinXmlParser.getUnsignedInt8(byteBuffer) & 128) != 0) {
                AndroidBinXmlParser.getUnsignedInt8(byteBuffer);
            }
            int unsignedInt8 = AndroidBinXmlParser.getUnsignedInt8(byteBuffer);
            if ((unsignedInt8 & 128) != 0) {
                unsignedInt8 = ((unsignedInt8 & CertificateBody.profileType) << 8) | AndroidBinXmlParser.getUnsignedInt8(byteBuffer);
            }
            if (byteBuffer.hasArray()) {
                bArrArray = byteBuffer.array();
                iPosition = byteBuffer.position() + byteBuffer.arrayOffset();
                byteBuffer.position(byteBuffer.position() + unsignedInt8);
            } else {
                bArrArray = new byte[unsignedInt8];
                byteBuffer.get(bArrArray);
                iPosition = 0;
            }
            if (bArrArray[iPosition + unsignedInt8] != 0) {
                throw new XmlParserException("UTF-8 encoded form of string not NULL terminated");
            }
            try {
                return new String(bArrArray, iPosition, unsignedInt8, "UTF-8");
            } catch (UnsupportedEncodingException e10) {
                throw new RuntimeException("UTF-8 character encoding not supported", e10);
            }
        }

        public String getString(long j10) throws XmlParserException {
            if (j10 < 0) {
                throw new XmlParserException(r.a("Unsuported string index: ", j10));
            }
            if (j10 >= this.mStringCount) {
                StringBuilder sbA = y.a("Unsuported string index: ", ", max: ", j10);
                sbA.append(this.mStringCount - 1);
                throw new XmlParserException(sbA.toString());
            }
            int i10 = (int) j10;
            String str = this.mCachedStrings.get(Integer.valueOf(i10));
            if (str != null) {
                return str;
            }
            long unsignedInt32 = AndroidBinXmlParser.getUnsignedInt32(this.mChunkContents, i10 * 4);
            if (unsignedInt32 < this.mStringsSection.capacity()) {
                this.mStringsSection.position((int) unsignedInt32);
                String lengthPrefixedUtf8EncodedString = this.mUtf8Encoded ? getLengthPrefixedUtf8EncodedString(this.mStringsSection) : getLengthPrefixedUtf16EncodedString(this.mStringsSection);
                this.mCachedStrings.put(Integer.valueOf(i10), lengthPrefixedUtf8EncodedString);
                return lengthPrefixedUtf8EncodedString;
            }
            StringBuilder sb = new StringBuilder("Offset of string idx ");
            sb.append(i10);
            sb.append(" out of bounds: ");
            sb.append(unsignedInt32);
            sb.append(", max: ");
            sb.append(this.mStringsSection.capacity() - 1);
            throw new XmlParserException(sb.toString());
        }
    }

    public static class XmlParserException extends Exception {
        private static final long serialVersionUID = 1;

        public XmlParserException(String str) {
            super(str);
        }

        public XmlParserException(String str, Throwable th2) {
            super(str, th2);
        }
    }

    public AndroidBinXmlParser(ByteBuffer byteBuffer) throws XmlParserException {
        Chunk chunk;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        while (byteBuffer.hasRemaining() && (chunk = Chunk.get(byteBuffer)) != null) {
            if (chunk.getType() == 3) {
                break;
            }
        }
        chunk = null;
        if (chunk == null) {
            throw new XmlParserException("No XML chunk in file");
        }
        this.mXml = chunk.getContents();
    }

    private Attribute getAttribute(int i10) {
        if (this.mCurrentEvent != 3) {
            throw new IndexOutOfBoundsException("Current event not a START_ELEMENT");
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("index must be >= 0");
        }
        if (i10 >= this.mCurrentElementAttributeCount) {
            throw new IndexOutOfBoundsException(x0.a.a(new StringBuilder("index must be <= attr count ("), this.mCurrentElementAttributeCount, ")"));
        }
        parseCurrentElementAttributesIfNotParsed();
        return this.mCurrentElementAttributes.get(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getUnsignedInt16(ByteBuffer byteBuffer) {
        return byteBuffer.getShort() & HPKE.aead_EXPORT_ONLY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getUnsignedInt32(ByteBuffer byteBuffer) {
        return byteBuffer.getInt() & 4294967295L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getUnsignedInt8(ByteBuffer byteBuffer) {
        return byteBuffer.get() & 255;
    }

    private void parseCurrentElementAttributesIfNotParsed() {
        if (this.mCurrentElementAttributes != null) {
            return;
        }
        this.mCurrentElementAttributes = new ArrayList(this.mCurrentElementAttributeCount);
        for (int i10 = 0; i10 < this.mCurrentElementAttributeCount; i10++) {
            int i11 = this.mCurrentElementAttrSizeBytes;
            int i12 = i10 * i11;
            ByteBuffer byteBufferSliceFromTo = sliceFromTo(this.mCurrentElementAttributesContents, i12, i11 + i12);
            long unsignedInt32 = getUnsignedInt32(byteBufferSliceFromTo);
            long unsignedInt322 = getUnsignedInt32(byteBufferSliceFromTo);
            byteBufferSliceFromTo.position(byteBufferSliceFromTo.position() + 7);
            this.mCurrentElementAttributes.add(new Attribute(unsignedInt32, unsignedInt322, getUnsignedInt8(byteBufferSliceFromTo), (int) getUnsignedInt32(byteBufferSliceFromTo), this.mStringPool, this.mResourceMap));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ByteBuffer sliceFromTo(ByteBuffer byteBuffer, long j10, long j11) {
        if (j10 < 0) {
            throw new IllegalArgumentException(r.a("start: ", j10));
        }
        if (j11 < j10) {
            StringBuilder sbA = y.a("end < start: ", " < ", j11);
            sbA.append(j10);
            throw new IllegalArgumentException(sbA.toString());
        }
        int iCapacity = byteBuffer.capacity();
        if (j11 <= byteBuffer.capacity()) {
            return sliceFromTo(byteBuffer, (int) j10, (int) j11);
        }
        throw new IllegalArgumentException("end > capacity: " + j11 + " > " + iCapacity);
    }

    public boolean getAttributeBooleanValue(int i10) throws XmlParserException {
        return getAttribute(i10).getBooleanValue();
    }

    public int getAttributeCount() {
        if (this.mCurrentEvent != 3) {
            return -1;
        }
        return this.mCurrentElementAttributeCount;
    }

    public int getAttributeIntValue(int i10) throws XmlParserException {
        return getAttribute(i10).getIntValue();
    }

    public String getAttributeName(int i10) throws XmlParserException {
        return getAttribute(i10).getName();
    }

    public int getAttributeNameResourceId(int i10) throws XmlParserException {
        return getAttribute(i10).getNameResourceId();
    }

    public String getAttributeNamespace(int i10) throws XmlParserException {
        return getAttribute(i10).getNamespace();
    }

    public String getAttributeStringValue(int i10) throws XmlParserException {
        return getAttribute(i10).getStringValue();
    }

    public int getAttributeValueType(int i10) throws XmlParserException {
        int valueType = getAttribute(i10).getValueType();
        if (valueType == 1) {
            return 3;
        }
        if (valueType == 3) {
            return 1;
        }
        switch (valueType) {
            case 16:
            case 17:
                return 2;
            case 18:
                return 4;
            default:
                return 0;
        }
    }

    public int getDepth() {
        return this.mDepth;
    }

    public int getEventType() {
        return this.mCurrentEvent;
    }

    public String getName() {
        int i10 = this.mCurrentEvent;
        if (i10 == 3 || i10 == 4) {
            return this.mCurrentElementName;
        }
        return null;
    }

    public String getNamespace() {
        int i10 = this.mCurrentEvent;
        if (i10 == 3 || i10 == 4) {
            return this.mCurrentElementNamespace;
        }
        return null;
    }

    public int next() throws XmlParserException {
        Chunk chunk;
        int i10;
        int i11 = 1;
        if (this.mCurrentEvent == 4) {
            this.mDepth--;
        }
        while (this.mXml.hasRemaining() && (chunk = Chunk.get(this.mXml)) != null) {
            int type = chunk.getType();
            if (type == i11) {
                i10 = i11;
                if (this.mStringPool != null) {
                    throw new XmlParserException("Multiple string pools not supported");
                }
                this.mStringPool = new StringPool(chunk);
            } else if (type != 384) {
                if (type == 258) {
                    if (this.mStringPool == null) {
                        throw new XmlParserException("Named element encountered before string pool");
                    }
                    ByteBuffer contents = chunk.getContents();
                    if (contents.remaining() < 20) {
                        throw new XmlParserException("Start element chunk too short. Need at least 20 bytes. Available: " + contents.remaining() + " bytes");
                    }
                    long unsignedInt32 = getUnsignedInt32(contents);
                    long unsignedInt322 = getUnsignedInt32(contents);
                    int unsignedInt16 = getUnsignedInt16(contents);
                    int unsignedInt162 = getUnsignedInt16(contents);
                    int unsignedInt163 = getUnsignedInt16(contents);
                    long j10 = unsignedInt16;
                    long j11 = (unsignedInt163 * unsignedInt162) + j10;
                    contents.position(0);
                    if (unsignedInt16 > contents.remaining()) {
                        StringBuilder sbB = i0.b(unsignedInt16, "Attributes start offset out of bounds: ", ", max: ");
                        sbB.append(contents.remaining());
                        throw new XmlParserException(sbB.toString());
                    }
                    if (j11 > contents.remaining()) {
                        StringBuilder sbA = y.a("Attributes end offset out of bounds: ", ", max: ", j11);
                        sbA.append(contents.remaining());
                        throw new XmlParserException(sbA.toString());
                    }
                    this.mCurrentElementName = this.mStringPool.getString(unsignedInt322);
                    this.mCurrentElementNamespace = unsignedInt32 != 4294967295L ? this.mStringPool.getString(unsignedInt32) : "";
                    this.mCurrentElementAttributeCount = unsignedInt163;
                    this.mCurrentElementAttributes = null;
                    this.mCurrentElementAttrSizeBytes = unsignedInt162;
                    this.mCurrentElementAttributesContents = sliceFromTo(contents, j10, j11);
                    this.mDepth++;
                    this.mCurrentEvent = 3;
                    return 3;
                }
                if (type == 259) {
                    if (this.mStringPool == null) {
                        throw new XmlParserException("Named element encountered before string pool");
                    }
                    ByteBuffer contents2 = chunk.getContents();
                    if (contents2.remaining() < 8) {
                        throw new XmlParserException("End element chunk too short. Need at least 8 bytes. Available: " + contents2.remaining() + " bytes");
                    }
                    long unsignedInt323 = getUnsignedInt32(contents2);
                    this.mCurrentElementName = this.mStringPool.getString(getUnsignedInt32(contents2));
                    this.mCurrentElementNamespace = unsignedInt323 != 4294967295L ? this.mStringPool.getString(unsignedInt323) : "";
                    this.mCurrentEvent = 4;
                    this.mCurrentElementAttributes = null;
                    this.mCurrentElementAttributesContents = null;
                    return 4;
                }
                i10 = i11;
            } else {
                i10 = i11;
                if (this.mResourceMap != null) {
                    throw new XmlParserException("Multiple resource maps not supported");
                }
                this.mResourceMap = new ResourceMap(chunk);
            }
            i11 = i10;
        }
        this.mCurrentEvent = 2;
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getUnsignedInt32(ByteBuffer byteBuffer, int i10) {
        return byteBuffer.getInt(i10) & 4294967295L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ByteBuffer sliceFromTo(ByteBuffer byteBuffer, int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException(j2.y.a(i10, "start: "));
        }
        if (i11 >= i10) {
            int iCapacity = byteBuffer.capacity();
            if (i11 <= byteBuffer.capacity()) {
                int iLimit = byteBuffer.limit();
                int iPosition = byteBuffer.position();
                try {
                    byteBuffer.position(0);
                    byteBuffer.limit(i11);
                    byteBuffer.position(i10);
                    ByteBuffer byteBufferSlice = byteBuffer.slice();
                    byteBufferSlice.order(byteBuffer.order());
                    return byteBufferSlice;
                } finally {
                    byteBuffer.position(0);
                    byteBuffer.limit(iLimit);
                    byteBuffer.position(iPosition);
                }
            }
            throw new IllegalArgumentException(e1.c.a(i11, iCapacity, "end > capacity: ", " > "));
        }
        throw new IllegalArgumentException(e1.c.a(i11, i10, "end < start: ", " < "));
    }
}
