package org.jf.dexlib2.analysis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import lc.i;
import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.iface.instruction.FiveRegisterInstruction;
import org.jf.dexlib2.iface.instruction.Instruction;
import org.jf.dexlib2.iface.instruction.OneRegisterInstruction;
import org.jf.dexlib2.iface.instruction.ReferenceInstruction;
import org.jf.dexlib2.iface.instruction.RegisterRangeInstruction;
import org.jf.dexlib2.iface.instruction.TwoRegisterInstruction;
import org.jf.dexlib2.iface.instruction.formats.Instruction22c;
import org.jf.dexlib2.iface.reference.MethodReference;
import org.jf.dexlib2.iface.reference.Reference;
import org.jf.dexlib2.iface.reference.TypeReference;
import org.jf.util.ExceptionWithContext;

/* loaded from: classes3.dex */
public class AnalyzedInstruction implements Comparable<AnalyzedInstruction> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected Instruction instruction;
    protected final int instructionIndex;
    protected final MethodAnalyzer methodAnalyzer;
    protected final Instruction originalInstruction;
    protected final RegisterType[] postRegisterMap;
    protected final RegisterType[] preRegisterMap;
    protected final TreeSet<AnalyzedInstruction> predecessors = new TreeSet<>();
    protected final LinkedList<AnalyzedInstruction> successors = new LinkedList<>();
    protected Map<PredecessorOverrideKey, RegisterType> predecessorRegisterOverrides = null;

    public static class PredecessorOverrideKey {
        public final AnalyzedInstruction analyzedInstruction;
        public final int registerNumber;

        public PredecessorOverrideKey(AnalyzedInstruction analyzedInstruction, int i10) {
            this.analyzedInstruction = analyzedInstruction;
            this.registerNumber = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                PredecessorOverrideKey predecessorOverrideKey = (PredecessorOverrideKey) obj;
                if (i.a(Integer.valueOf(this.registerNumber), Integer.valueOf(predecessorOverrideKey.registerNumber)) && i.a(this.analyzedInstruction, predecessorOverrideKey.analyzedInstruction)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.analyzedInstruction, Integer.valueOf(this.registerNumber)});
        }
    }

    public AnalyzedInstruction(MethodAnalyzer methodAnalyzer, Instruction instruction, int i10, int i11) {
        this.methodAnalyzer = methodAnalyzer;
        this.instruction = instruction;
        this.originalInstruction = instruction;
        this.instructionIndex = i10;
        this.postRegisterMap = new RegisterType[i11];
        this.preRegisterMap = new RegisterType[i11];
        RegisterType registerType = RegisterType.getRegisterType((byte) 0, (TypeProto) null);
        for (int i12 = 0; i12 < i11; i12++) {
            this.preRegisterMap[i12] = registerType;
            this.postRegisterMap[i12] = registerType;
        }
    }

    public boolean addPredecessor(AnalyzedInstruction analyzedInstruction) {
        return this.predecessors.add(analyzedInstruction);
    }

    public void addSuccessor(AnalyzedInstruction analyzedInstruction) {
        this.successors.add(analyzedInstruction);
    }

    public int getDestinationRegister() {
        if (this.instruction.getOpcode().setsRegister()) {
            return ((OneRegisterInstruction) this.instruction).getRegisterA();
        }
        throw new ExceptionWithContext("Cannot call getDestinationRegister() for an instruction that doesn't store a value", new Object[0]);
    }

    public Instruction getInstruction() {
        return this.instruction;
    }

    public int getInstructionIndex() {
        return this.instructionIndex;
    }

    public RegisterType getMergedPreRegisterTypeFromPredecessors(int i10) {
        Iterator<AnalyzedInstruction> it = this.predecessors.iterator();
        RegisterType registerTypeMerge = null;
        while (it.hasNext()) {
            RegisterType predecessorRegisterType = getPredecessorRegisterType(it.next(), i10);
            if (predecessorRegisterType != null) {
                registerTypeMerge = registerTypeMerge == null ? predecessorRegisterType : predecessorRegisterType.merge(registerTypeMerge);
            }
        }
        if (registerTypeMerge != null) {
            return registerTypeMerge;
        }
        throw new IllegalStateException();
    }

    public Instruction getOriginalInstruction() {
        return this.originalInstruction;
    }

    public RegisterType getPostInstructionRegisterType(int i10) {
        return this.postRegisterMap[i10];
    }

    public RegisterType getPreInstructionRegisterType(int i10) {
        return this.preRegisterMap[i10];
    }

    public int getPredecessorCount() {
        return this.predecessors.size();
    }

    public RegisterType getPredecessorRegisterType(AnalyzedInstruction analyzedInstruction, int i10) {
        RegisterType registerType;
        Map<PredecessorOverrideKey, RegisterType> map = this.predecessorRegisterOverrides;
        return (map == null || (registerType = map.get(new PredecessorOverrideKey(analyzedInstruction, i10))) == null) ? analyzedInstruction.postRegisterMap[i10] : registerType;
    }

    public SortedSet<AnalyzedInstruction> getPredecessors() {
        return Collections.unmodifiableSortedSet(this.predecessors);
    }

    public int getRegisterCount() {
        return this.postRegisterMap.length;
    }

    public List<Integer> getSetRegisters() {
        ArrayList arrayList = new ArrayList();
        if (this.instruction.getOpcode().setsRegister()) {
            arrayList.add(Integer.valueOf(getDestinationRegister()));
        }
        if (this.instruction.getOpcode().setsWideRegister()) {
            arrayList.add(Integer.valueOf(getDestinationRegister() + 1));
        }
        if (isInvokeInit()) {
            Instruction instruction = this.instruction;
            int registerC = instruction instanceof FiveRegisterInstruction ? ((FiveRegisterInstruction) instruction).getRegisterC() : ((RegisterRangeInstruction) instruction).getStartRegister();
            byte b10 = getPreInstructionRegisterType(registerC).category;
            int i10 = 0;
            if (b10 == 16 || b10 == 17) {
                arrayList.add(Integer.valueOf(registerC));
                RegisterType registerType = this.preRegisterMap[registerC];
                while (true) {
                    RegisterType[] registerTypeArr = this.preRegisterMap;
                    if (i10 >= registerTypeArr.length) {
                        break;
                    }
                    if (i10 != registerC) {
                        RegisterType registerType2 = registerTypeArr[i10];
                        if (registerType2.equals(registerType)) {
                            arrayList.add(Integer.valueOf(i10));
                        } else {
                            byte b11 = registerType2.category;
                            if ((b11 == 16 || b11 == 17) && this.postRegisterMap[i10].category == 0) {
                                arrayList.add(Integer.valueOf(i10));
                            }
                        }
                    }
                    i10++;
                }
            } else if (b10 == 0) {
                while (true) {
                    RegisterType[] registerTypeArr2 = this.preRegisterMap;
                    if (i10 >= registerTypeArr2.length) {
                        break;
                    }
                    byte b12 = registerTypeArr2[i10].category;
                    if (b12 == 16 || b12 == 17) {
                        arrayList.add(Integer.valueOf(i10));
                    }
                    i10++;
                }
            }
        }
        if (this.instructionIndex > 0 && this.methodAnalyzer.getClassPath().isArt() && getPredecessorCount() == 1 && (this.instruction.getOpcode() == Opcode.IF_EQZ || this.instruction.getOpcode() == Opcode.IF_NEZ)) {
            AnalyzedInstruction analyzedInstructionFirst = this.predecessors.first();
            if (analyzedInstructionFirst.instruction.getOpcode() == Opcode.INSTANCE_OF && MethodAnalyzer.canPropagateTypeAfterInstanceOf(analyzedInstructionFirst, this, this.methodAnalyzer.getClassPath())) {
                Instruction22c instruction22c = (Instruction22c) analyzedInstructionFirst.instruction;
                arrayList.add(Integer.valueOf(instruction22c.getRegisterB()));
                if (this.instructionIndex > 1) {
                    Iterator<AnalyzedInstruction> it = analyzedInstructionFirst.predecessors.iterator();
                    RegisterType registerType3 = null;
                    int registerB = -1;
                    while (it.hasNext()) {
                        AnalyzedInstruction next = it.next();
                        Opcode opcode = next.instruction.getOpcode();
                        if (opcode == Opcode.MOVE_OBJECT || opcode == Opcode.MOVE_OBJECT_16 || opcode == Opcode.MOVE_OBJECT_FROM16) {
                            TwoRegisterInstruction twoRegisterInstruction = (TwoRegisterInstruction) next.instruction;
                            RegisterType postInstructionRegisterType = next.getPostInstructionRegisterType(twoRegisterInstruction.getRegisterB());
                            if (twoRegisterInstruction.getRegisterA() == instruction22c.getRegisterB() && postInstructionRegisterType.type != null) {
                                if (registerType3 == null) {
                                    registerType3 = RegisterType.getRegisterType(this.methodAnalyzer.getClassPath(), (TypeReference) instruction22c.getReference());
                                }
                                if (MethodAnalyzer.isNotWideningConversion(postInstructionRegisterType, registerType3)) {
                                    if (registerB == -1) {
                                        registerB = twoRegisterInstruction.getRegisterB();
                                    } else if (registerB != twoRegisterInstruction.getRegisterB()) {
                                    }
                                }
                            }
                        }
                        registerB = -1;
                    }
                    if (registerB != -1) {
                        arrayList.add(Integer.valueOf(registerB));
                    }
                }
            }
        }
        return arrayList;
    }

    public List<AnalyzedInstruction> getSuccessors() {
        return Collections.unmodifiableList(this.successors);
    }

    public boolean isBeginningInstruction() {
        return this.predecessors.size() != 0 && this.predecessors.first().instructionIndex == -1;
    }

    public boolean isInvokeInit() {
        if (!this.instruction.getOpcode().canInitializeReference()) {
            return false;
        }
        Reference reference = ((ReferenceInstruction) this.instruction).getReference();
        if (reference instanceof MethodReference) {
            return ((MethodReference) reference).getName().equals("<init>");
        }
        return false;
    }

    public boolean mergeRegister(int i10, RegisterType registerType, BitSet bitSet, boolean z10) {
        RegisterType registerType2 = this.preRegisterMap[i10];
        RegisterType mergedPreRegisterTypeFromPredecessors = z10 ? getMergedPreRegisterTypeFromPredecessors(i10) : registerType2.merge(registerType);
        if (mergedPreRegisterTypeFromPredecessors.equals(registerType2)) {
            return false;
        }
        this.preRegisterMap[i10] = mergedPreRegisterTypeFromPredecessors;
        bitSet.clear(this.instructionIndex);
        if (setsRegister(i10)) {
            return false;
        }
        this.postRegisterMap[i10] = mergedPreRegisterTypeFromPredecessors;
        return true;
    }

    public boolean overridePredecessorRegisterType(AnalyzedInstruction analyzedInstruction, int i10, RegisterType registerType, BitSet bitSet) {
        if (this.predecessorRegisterOverrides == null) {
            this.predecessorRegisterOverrides = new HashMap();
        }
        this.predecessorRegisterOverrides.put(new PredecessorOverrideKey(analyzedInstruction, i10), registerType);
        RegisterType mergedPreRegisterTypeFromPredecessors = getMergedPreRegisterTypeFromPredecessors(i10);
        if (this.preRegisterMap[i10].equals(mergedPreRegisterTypeFromPredecessors)) {
            return false;
        }
        this.preRegisterMap[i10] = mergedPreRegisterTypeFromPredecessors;
        bitSet.clear(this.instructionIndex);
        if (setsRegister(i10) || this.postRegisterMap[i10].equals(mergedPreRegisterTypeFromPredecessors)) {
            return false;
        }
        this.postRegisterMap[i10] = mergedPreRegisterTypeFromPredecessors;
        return true;
    }

    public void restoreOdexedInstruction() {
        this.instruction = this.originalInstruction;
    }

    public void setDeodexedInstruction(Instruction instruction) {
        this.instruction = instruction;
    }

    public boolean setPostRegisterType(int i10, RegisterType registerType) {
        if (this.postRegisterMap[i10].equals(registerType)) {
            return false;
        }
        this.postRegisterMap[i10] = registerType;
        return true;
    }

    public boolean setsRegister(int i10) {
        byte b10;
        if (isInvokeInit()) {
            Instruction instruction = this.instruction;
            int registerC = instruction instanceof FiveRegisterInstruction ? ((FiveRegisterInstruction) instruction).getRegisterC() : ((RegisterRangeInstruction) instruction).getStartRegister();
            RegisterType preInstructionRegisterType = getPreInstructionRegisterType(registerC);
            if (preInstructionRegisterType.category == 0 && ((b10 = getPreInstructionRegisterType(i10).category) == 16 || b10 == 17)) {
                return true;
            }
            byte b11 = preInstructionRegisterType.category;
            if (b11 != 16 && b11 != 17) {
                return false;
            }
            if (i10 == registerC) {
                return true;
            }
            return preInstructionRegisterType.equals(getPreInstructionRegisterType(i10));
        }
        if (this.instructionIndex > 0 && this.methodAnalyzer.getClassPath().isArt() && getPredecessorCount() == 1 && (this.instruction.getOpcode() == Opcode.IF_EQZ || this.instruction.getOpcode() == Opcode.IF_NEZ)) {
            AnalyzedInstruction analyzedInstructionFirst = this.predecessors.first();
            if (analyzedInstructionFirst.instruction.getOpcode() == Opcode.INSTANCE_OF && MethodAnalyzer.canPropagateTypeAfterInstanceOf(analyzedInstructionFirst, this, this.methodAnalyzer.getClassPath())) {
                Instruction22c instruction22c = (Instruction22c) analyzedInstructionFirst.instruction;
                if (i10 == instruction22c.getRegisterB()) {
                    return true;
                }
                if (this.instructionIndex > 1) {
                    Iterator<AnalyzedInstruction> it = analyzedInstructionFirst.predecessors.iterator();
                    RegisterType registerType = null;
                    int registerB = -1;
                    while (it.hasNext()) {
                        AnalyzedInstruction next = it.next();
                        Opcode opcode = next.instruction.getOpcode();
                        if (opcode == Opcode.MOVE_OBJECT || opcode == Opcode.MOVE_OBJECT_16 || opcode == Opcode.MOVE_OBJECT_FROM16) {
                            TwoRegisterInstruction twoRegisterInstruction = (TwoRegisterInstruction) next.instruction;
                            RegisterType postInstructionRegisterType = next.getPostInstructionRegisterType(twoRegisterInstruction.getRegisterB());
                            if (twoRegisterInstruction.getRegisterA() == instruction22c.getRegisterB() && postInstructionRegisterType.type != null) {
                                if (registerType == null) {
                                    registerType = RegisterType.getRegisterType(this.methodAnalyzer.getClassPath(), (TypeReference) instruction22c.getReference());
                                }
                                if (MethodAnalyzer.isNotWideningConversion(postInstructionRegisterType, registerType)) {
                                    if (registerB == -1) {
                                        registerB = twoRegisterInstruction.getRegisterB();
                                    } else if (registerB != twoRegisterInstruction.getRegisterB()) {
                                    }
                                }
                            }
                        }
                        registerB = -1;
                    }
                    if (registerB != -1 && i10 == registerB) {
                        return true;
                    }
                }
            }
        }
        if (!this.instruction.getOpcode().setsRegister()) {
            return false;
        }
        int destinationRegister = getDestinationRegister();
        if (i10 == destinationRegister) {
            return true;
        }
        return this.instruction.getOpcode().setsWideRegister() && i10 == destinationRegister + 1;
    }

    @Override // java.lang.Comparable
    public int compareTo(AnalyzedInstruction analyzedInstruction) {
        int i10 = this.instructionIndex;
        int i11 = analyzedInstruction.instructionIndex;
        if (i10 < i11) {
            return -1;
        }
        return i10 == i11 ? 0 : 1;
    }
}
