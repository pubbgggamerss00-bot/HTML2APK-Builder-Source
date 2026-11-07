package com.android.apksig.internal.jar;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.jar.Attributes;

/* loaded from: classes.dex */
public class ManifestParser {
    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    private byte[] mBufferedLine;
    private int mEndOffset;
    private final byte[] mManifest;
    private int mOffset;

    public static class Attribute {
        private final String mName;
        private final String mValue;

        public Attribute(String str, String str2) {
            this.mName = str;
            this.mValue = str2;
        }

        public String getName() {
            return this.mName;
        }

        public String getValue() {
            return this.mValue;
        }
    }

    public static class Section {
        private final List<Attribute> mAttributes;
        private final String mName;
        private final int mSizeBytes;
        private final int mStartOffset;

        /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Section(int i10, int i11, List<Attribute> list) {
            String value;
            this.mStartOffset = i10;
            this.mSizeBytes = i11;
            if (!list.isEmpty()) {
                Attribute attribute = list.get(0);
                value = "Name".equalsIgnoreCase(attribute.getName()) ? attribute.getValue() : null;
            }
            this.mName = value;
            this.mAttributes = Collections.unmodifiableList(new ArrayList(list));
        }

        public String getAttributeValue(Attributes.Name name) {
            return getAttributeValue(name.toString());
        }

        public List<Attribute> getAttributes() {
            return this.mAttributes;
        }

        public String getName() {
            return this.mName;
        }

        public int getSizeBytes() {
            return this.mSizeBytes;
        }

        public int getStartOffset() {
            return this.mStartOffset;
        }

        public String getAttributeValue(String str) {
            for (Attribute attribute : this.mAttributes) {
                if (attribute.getName().equalsIgnoreCase(str)) {
                    return attribute.getValue();
                }
            }
            return null;
        }
    }

    public ManifestParser(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    private static byte[] concat(byte[] bArr, byte[] bArr2, int i10, int i11) {
        byte[] bArr3 = new byte[bArr.length + i11];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, i10, bArr3, bArr.length, i11);
        return bArr3;
    }

    private static Attribute parseAttr(String str) {
        int iIndexOf = str.indexOf(": ");
        return iIndexOf == -1 ? new Attribute(str, "") : new Attribute(str.substring(0, iIndexOf), str.substring(iIndexOf + 2));
    }

    private String readAttribute() {
        byte[] attributeBytes = readAttributeBytes();
        if (attributeBytes == null) {
            return null;
        }
        return attributeBytes.length == 0 ? "" : new String(attributeBytes, StandardCharsets.UTF_8);
    }

    private byte[] readAttributeBytes() {
        byte[] bArr = this.mBufferedLine;
        if (bArr != null && bArr.length == 0) {
            this.mBufferedLine = null;
            return EMPTY_BYTE_ARRAY;
        }
        byte[] line = readLine();
        if (line == null) {
            byte[] bArr2 = this.mBufferedLine;
            if (bArr2 == null) {
                return null;
            }
            this.mBufferedLine = null;
            return bArr2;
        }
        if (line.length == 0) {
            byte[] bArr3 = this.mBufferedLine;
            if (bArr3 == null) {
                return EMPTY_BYTE_ARRAY;
            }
            this.mBufferedLine = EMPTY_BYTE_ARRAY;
            return bArr3;
        }
        byte[] bArr4 = this.mBufferedLine;
        if (bArr4 != null) {
            if (line.length == 0 || line[0] != 32) {
                this.mBufferedLine = line;
                return bArr4;
            }
            this.mBufferedLine = null;
            line = concat(bArr4, line, 1, line.length - 1);
        }
        while (true) {
            byte[] line2 = readLine();
            if (line2 == null) {
                return line;
            }
            if (line2.length == 0) {
                this.mBufferedLine = EMPTY_BYTE_ARRAY;
                return line;
            }
            if (line2[0] != 32) {
                this.mBufferedLine = line2;
                return line;
            }
            line = concat(line, line2, 1, line2.length - 1);
        }
    }

    private byte[] readLine() {
        int i10;
        int i11;
        int i12 = this.mOffset;
        if (i12 >= this.mEndOffset) {
            return null;
        }
        int i13 = i12;
        while (true) {
            i10 = this.mEndOffset;
            if (i13 >= i10) {
                i13 = -1;
                i11 = -1;
                break;
            }
            byte[] bArr = this.mManifest;
            byte b10 = bArr[i13];
            if (b10 == 13) {
                i11 = i13 + 1;
                if (i11 < i10 && bArr[i11] == 10) {
                    i11 = i13 + 2;
                }
            } else {
                if (b10 == 10) {
                    i11 = i13 + 1;
                    break;
                }
                i13++;
            }
        }
        if (i13 == -1) {
            i13 = i10;
        } else {
            i10 = i11;
        }
        this.mOffset = i10;
        return i13 == i12 ? EMPTY_BYTE_ARRAY : Arrays.copyOfRange(this.mManifest, i12, i13);
    }

    public List<Section> readAllSections() {
        ArrayList arrayList = new ArrayList();
        while (true) {
            Section section = readSection();
            if (section == null) {
                return arrayList;
            }
            arrayList.add(section);
        }
    }

    public Section readSection() {
        int i10;
        String attribute;
        do {
            i10 = this.mOffset;
            attribute = readAttribute();
            if (attribute == null) {
                return null;
            }
        } while (attribute.length() == 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(parseAttr(attribute));
        while (true) {
            String attribute2 = readAttribute();
            if (attribute2 == null || attribute2.length() == 0) {
                break;
            }
            arrayList.add(parseAttr(attribute2));
        }
        return new Section(i10, this.mOffset - i10, arrayList);
    }

    public ManifestParser(byte[] bArr, int i10, int i11) {
        this.mManifest = bArr;
        this.mOffset = i10;
        this.mEndOffset = i10 + i11;
    }
}
