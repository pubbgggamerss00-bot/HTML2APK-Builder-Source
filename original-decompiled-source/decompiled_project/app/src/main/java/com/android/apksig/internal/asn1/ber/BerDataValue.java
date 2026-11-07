package com.android.apksig.internal.asn1.ber;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class BerDataValue {
    private final boolean mConstructed;
    private final ByteBuffer mEncoded;
    private final ByteBuffer mEncodedContents;
    private final int mTagClass;
    private final int mTagNumber;

    public static final class ParsedValueReader implements BerDataValueReader {
        private final BerDataValue mValue;
        private boolean mValueOutput;

        public ParsedValueReader(BerDataValue berDataValue) {
            this.mValue = berDataValue;
        }

        @Override // com.android.apksig.internal.asn1.ber.BerDataValueReader
        public BerDataValue readDataValue() throws BerDataValueFormatException {
            if (this.mValueOutput) {
                return null;
            }
            this.mValueOutput = true;
            return this.mValue;
        }
    }

    public BerDataValue(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i10, boolean z10, int i11) {
        this.mEncoded = byteBuffer;
        this.mEncodedContents = byteBuffer2;
        this.mTagClass = i10;
        this.mConstructed = z10;
        this.mTagNumber = i11;
    }

    public BerDataValueReader contentsReader() {
        return new ByteBufferBerDataValueReader(getEncodedContents());
    }

    public BerDataValueReader dataValueReader() {
        return new ParsedValueReader(this);
    }

    public ByteBuffer getEncoded() {
        return this.mEncoded.slice();
    }

    public ByteBuffer getEncodedContents() {
        return this.mEncodedContents.slice();
    }

    public int getTagClass() {
        return this.mTagClass;
    }

    public int getTagNumber() {
        return this.mTagNumber;
    }

    public boolean isConstructed() {
        return this.mConstructed;
    }
}
