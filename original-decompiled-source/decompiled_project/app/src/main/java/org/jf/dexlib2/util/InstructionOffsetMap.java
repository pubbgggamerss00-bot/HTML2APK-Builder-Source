package org.jf.dexlib2.util;

import java.util.Arrays;
import java.util.List;
import org.jf.dexlib2.iface.instruction.Instruction;
import org.jf.util.ExceptionWithContext;

/* loaded from: classes3.dex */
public class InstructionOffsetMap {
    private final int[] instructionCodeOffsets;

    public static class InvalidInstructionIndex extends ExceptionWithContext {
        private final int instructionIndex;

        public InvalidInstructionIndex(int i10) {
            super("Instruction index out of bounds: %d", Integer.valueOf(i10));
            this.instructionIndex = i10;
        }

        public int getInstructionIndex() {
            return this.instructionIndex;
        }
    }

    public static class InvalidInstructionOffset extends ExceptionWithContext {
        private final int instructionOffset;

        public InvalidInstructionOffset(int i10) {
            super("No instruction at offset %d", Integer.valueOf(i10));
            this.instructionOffset = i10;
        }

        public int getInstructionOffset() {
            return this.instructionOffset;
        }
    }

    public InstructionOffsetMap(List<? extends Instruction> list) {
        this.instructionCodeOffsets = new int[list.size()];
        int codeUnits = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.instructionCodeOffsets[i10] = codeUnits;
            codeUnits += list.get(i10).getCodeUnits();
        }
    }

    public int getInstructionCodeOffset(int i10) {
        if (i10 >= 0) {
            int[] iArr = this.instructionCodeOffsets;
            if (i10 < iArr.length) {
                return iArr[i10];
            }
        }
        throw new InvalidInstructionIndex(i10);
    }

    public int getInstructionIndexAtCodeOffset(int i10) {
        return getInstructionIndexAtCodeOffset(i10, true);
    }

    public int getInstructionIndexAtCodeOffset(int i10, boolean z10) {
        int iBinarySearch = Arrays.binarySearch(this.instructionCodeOffsets, i10);
        if (iBinarySearch >= 0) {
            return iBinarySearch;
        }
        if (z10) {
            throw new InvalidInstructionOffset(i10);
        }
        return (~iBinarySearch) - 1;
    }
}
