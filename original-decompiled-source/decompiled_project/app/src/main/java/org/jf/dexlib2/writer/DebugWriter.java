package org.jf.dexlib2.writer;

import java.io.IOException;
import java.lang.CharSequence;
import org.jf.util.ExceptionWithContext;

/* loaded from: classes3.dex */
public class DebugWriter<StringKey extends CharSequence, TypeKey extends CharSequence> {
    private static final int FIRST_SPECIAL = 10;
    private static final int LINE_BASE = -4;
    private static final int LINE_RANGE = 15;
    private int currentAddress;
    private int currentLine;
    private final StringSection<StringKey, ?> stringSection;
    private final TypeSection<StringKey, TypeKey, ?> typeSection;
    private final DexDataWriter writer;

    public DebugWriter(StringSection<StringKey, ?> stringSection, TypeSection<StringKey, TypeKey, ?> typeSection, DexDataWriter dexDataWriter) {
        this.stringSection = stringSection;
        this.typeSection = typeSection;
        this.writer = dexDataWriter;
    }

    private void writeAdvanceLine(int i10) throws IOException {
        int i11 = i10 - this.currentLine;
        if (i11 != 0) {
            this.writer.write(2);
            this.writer.writeSleb128(i11);
            this.currentLine = i10;
        }
    }

    private void writeAdvancePC(int i10) throws IOException {
        int i11 = i10 - this.currentAddress;
        if (i11 > 0) {
            this.writer.write(1);
            this.writer.writeUleb128(i11);
            this.currentAddress = i10;
        }
    }

    private void writeSpecialOpcode(int i10, int i11) throws IOException {
        this.writer.write((byte) (i10 + 4 + (i11 * 15) + 10));
        this.currentLine += i10;
        this.currentAddress += i11;
    }

    public void reset(int i10) {
        this.currentAddress = 0;
        this.currentLine = i10;
    }

    public void writeEndLocal(int i10, int i11) throws IOException {
        writeAdvancePC(i10);
        this.writer.write(5);
        this.writer.writeUleb128(i11);
    }

    public void writeEpilogueBegin(int i10) throws IOException {
        writeAdvancePC(i10);
        this.writer.write(8);
    }

    public void writeLineNumber(int i10, int i11) throws IOException {
        int i12 = i11 - this.currentLine;
        int i13 = i10 - this.currentAddress;
        if (i13 < 0) {
            throw new ExceptionWithContext("debug info items must have non-decreasing code addresses", new Object[0]);
        }
        if (i12 < -4 || i12 > 10) {
            writeAdvanceLine(i11);
            i12 = 0;
        }
        if ((i12 < 2 && i13 > 16) || (i12 > 1 && i13 > 15)) {
            writeAdvancePC(i10);
            i13 = 0;
        }
        writeSpecialOpcode(i12, i13);
    }

    public void writePrologueEnd(int i10) throws IOException {
        writeAdvancePC(i10);
        this.writer.write(7);
    }

    public void writeRestartLocal(int i10, int i11) throws IOException {
        writeAdvancePC(i10);
        this.writer.write(6);
        this.writer.writeUleb128(i11);
    }

    public void writeSetSourceFile(int i10, StringKey stringkey) throws IOException {
        writeAdvancePC(i10);
        this.writer.write(9);
        this.writer.writeUleb128(this.stringSection.getNullableItemIndex(stringkey) + 1);
    }

    public void writeStartLocal(int i10, int i11, StringKey stringkey, TypeKey typekey, StringKey stringkey2) throws IOException {
        int nullableItemIndex = this.stringSection.getNullableItemIndex(stringkey);
        int nullableItemIndex2 = this.typeSection.getNullableItemIndex(typekey);
        int nullableItemIndex3 = this.stringSection.getNullableItemIndex(stringkey2);
        writeAdvancePC(i10);
        if (nullableItemIndex3 == -1) {
            this.writer.write(3);
            this.writer.writeUleb128(i11);
            this.writer.writeUleb128(nullableItemIndex + 1);
            this.writer.writeUleb128(nullableItemIndex2 + 1);
            return;
        }
        this.writer.write(4);
        this.writer.writeUleb128(i11);
        this.writer.writeUleb128(nullableItemIndex + 1);
        this.writer.writeUleb128(nullableItemIndex2 + 1);
        this.writer.writeUleb128(nullableItemIndex3 + 1);
    }
}
