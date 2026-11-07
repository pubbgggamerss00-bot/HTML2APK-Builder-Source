package org.jf.dexlib2.builder;

import i0.u2;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import l.b;
import lc.e;
import nc.k0;
import nc.l;
import org.jf.dexlib2.Format;
import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.builder.debug.BuilderEndLocal;
import org.jf.dexlib2.builder.debug.BuilderEpilogueBegin;
import org.jf.dexlib2.builder.debug.BuilderLineNumber;
import org.jf.dexlib2.builder.debug.BuilderPrologueEnd;
import org.jf.dexlib2.builder.debug.BuilderRestartLocal;
import org.jf.dexlib2.builder.debug.BuilderSetSourceFile;
import org.jf.dexlib2.builder.debug.BuilderStartLocal;
import org.jf.dexlib2.builder.instruction.BuilderArrayPayload;
import org.jf.dexlib2.builder.instruction.BuilderInstruction10t;
import org.jf.dexlib2.builder.instruction.BuilderInstruction10x;
import org.jf.dexlib2.builder.instruction.BuilderInstruction11n;
import org.jf.dexlib2.builder.instruction.BuilderInstruction11x;
import org.jf.dexlib2.builder.instruction.BuilderInstruction12x;
import org.jf.dexlib2.builder.instruction.BuilderInstruction20bc;
import org.jf.dexlib2.builder.instruction.BuilderInstruction20t;
import org.jf.dexlib2.builder.instruction.BuilderInstruction21c;
import org.jf.dexlib2.builder.instruction.BuilderInstruction21ih;
import org.jf.dexlib2.builder.instruction.BuilderInstruction21lh;
import org.jf.dexlib2.builder.instruction.BuilderInstruction21s;
import org.jf.dexlib2.builder.instruction.BuilderInstruction21t;
import org.jf.dexlib2.builder.instruction.BuilderInstruction22b;
import org.jf.dexlib2.builder.instruction.BuilderInstruction22c;
import org.jf.dexlib2.builder.instruction.BuilderInstruction22cs;
import org.jf.dexlib2.builder.instruction.BuilderInstruction22s;
import org.jf.dexlib2.builder.instruction.BuilderInstruction22t;
import org.jf.dexlib2.builder.instruction.BuilderInstruction22x;
import org.jf.dexlib2.builder.instruction.BuilderInstruction23x;
import org.jf.dexlib2.builder.instruction.BuilderInstruction30t;
import org.jf.dexlib2.builder.instruction.BuilderInstruction31c;
import org.jf.dexlib2.builder.instruction.BuilderInstruction31i;
import org.jf.dexlib2.builder.instruction.BuilderInstruction31t;
import org.jf.dexlib2.builder.instruction.BuilderInstruction32x;
import org.jf.dexlib2.builder.instruction.BuilderInstruction35c;
import org.jf.dexlib2.builder.instruction.BuilderInstruction35mi;
import org.jf.dexlib2.builder.instruction.BuilderInstruction35ms;
import org.jf.dexlib2.builder.instruction.BuilderInstruction3rc;
import org.jf.dexlib2.builder.instruction.BuilderInstruction3rmi;
import org.jf.dexlib2.builder.instruction.BuilderInstruction3rms;
import org.jf.dexlib2.builder.instruction.BuilderInstruction51l;
import org.jf.dexlib2.builder.instruction.BuilderPackedSwitchPayload;
import org.jf.dexlib2.builder.instruction.BuilderSparseSwitchPayload;
import org.jf.dexlib2.iface.ExceptionHandler;
import org.jf.dexlib2.iface.MethodImplementation;
import org.jf.dexlib2.iface.TryBlock;
import org.jf.dexlib2.iface.debug.DebugItem;
import org.jf.dexlib2.iface.debug.EndLocal;
import org.jf.dexlib2.iface.debug.LineNumber;
import org.jf.dexlib2.iface.debug.RestartLocal;
import org.jf.dexlib2.iface.debug.SetSourceFile;
import org.jf.dexlib2.iface.debug.StartLocal;
import org.jf.dexlib2.iface.instruction.Instruction;
import org.jf.dexlib2.iface.instruction.SwitchElement;
import org.jf.dexlib2.iface.instruction.formats.ArrayPayload;
import org.jf.dexlib2.iface.instruction.formats.Instruction10t;
import org.jf.dexlib2.iface.instruction.formats.Instruction10x;
import org.jf.dexlib2.iface.instruction.formats.Instruction11n;
import org.jf.dexlib2.iface.instruction.formats.Instruction11x;
import org.jf.dexlib2.iface.instruction.formats.Instruction12x;
import org.jf.dexlib2.iface.instruction.formats.Instruction20bc;
import org.jf.dexlib2.iface.instruction.formats.Instruction20t;
import org.jf.dexlib2.iface.instruction.formats.Instruction21c;
import org.jf.dexlib2.iface.instruction.formats.Instruction21ih;
import org.jf.dexlib2.iface.instruction.formats.Instruction21lh;
import org.jf.dexlib2.iface.instruction.formats.Instruction21s;
import org.jf.dexlib2.iface.instruction.formats.Instruction21t;
import org.jf.dexlib2.iface.instruction.formats.Instruction22b;
import org.jf.dexlib2.iface.instruction.formats.Instruction22c;
import org.jf.dexlib2.iface.instruction.formats.Instruction22cs;
import org.jf.dexlib2.iface.instruction.formats.Instruction22s;
import org.jf.dexlib2.iface.instruction.formats.Instruction22t;
import org.jf.dexlib2.iface.instruction.formats.Instruction22x;
import org.jf.dexlib2.iface.instruction.formats.Instruction23x;
import org.jf.dexlib2.iface.instruction.formats.Instruction30t;
import org.jf.dexlib2.iface.instruction.formats.Instruction31c;
import org.jf.dexlib2.iface.instruction.formats.Instruction31i;
import org.jf.dexlib2.iface.instruction.formats.Instruction31t;
import org.jf.dexlib2.iface.instruction.formats.Instruction32x;
import org.jf.dexlib2.iface.instruction.formats.Instruction35c;
import org.jf.dexlib2.iface.instruction.formats.Instruction35mi;
import org.jf.dexlib2.iface.instruction.formats.Instruction35ms;
import org.jf.dexlib2.iface.instruction.formats.Instruction3rc;
import org.jf.dexlib2.iface.instruction.formats.Instruction3rmi;
import org.jf.dexlib2.iface.instruction.formats.Instruction3rms;
import org.jf.dexlib2.iface.instruction.formats.Instruction51l;
import org.jf.dexlib2.iface.instruction.formats.PackedSwitchPayload;
import org.jf.dexlib2.iface.instruction.formats.SparseSwitchPayload;
import org.jf.dexlib2.iface.reference.TypeReference;
import org.jf.util.ExceptionWithContext;

/* loaded from: classes3.dex */
public class MutableMethodImplementation implements MethodImplementation {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private boolean fixInstructions;
    final ArrayList<MethodLocation> instructionList;
    private final int registerCount;
    private final ArrayList<BuilderTryBlock> tryBlocks;

    /* renamed from: org.jf.dexlib2.builder.MutableMethodImplementation$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$org$jf$dexlib2$Format;
        static final /* synthetic */ int[] $SwitchMap$org$jf$dexlib2$Opcode;

        static {
            int[] iArr = new int[Format.values().length];
            $SwitchMap$org$jf$dexlib2$Format = iArr;
            try {
                iArr[Format.Format10t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format10x.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format11n.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format11x.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format12x.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format20bc.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format20t.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format21c.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format21ih.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format21lh.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format21s.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format21t.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format22b.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format22c.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format22cs.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format22s.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format22t.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format22x.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format23x.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format30t.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format31c.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format31i.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format31t.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format32x.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format35c.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format35mi.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format35ms.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format3rc.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format3rmi.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format3rms.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format51l.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.PackedSwitchPayload.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.SparseSwitchPayload.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.ArrayPayload.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            int[] iArr2 = new int[Opcode.values().length];
            $SwitchMap$org$jf$dexlib2$Opcode = iArr2;
            try {
                iArr2[Opcode.SPARSE_SWITCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Opcode[Opcode.PACKED_SWITCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Opcode[Opcode.GOTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Opcode[Opcode.GOTO_16.ordinal()] = 4;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Opcode[Opcode.SPARSE_SWITCH_PAYLOAD.ordinal()] = 5;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Opcode[Opcode.PACKED_SWITCH_PAYLOAD.ordinal()] = 6;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Opcode[Opcode.ARRAY_PAYLOAD.ordinal()] = 7;
            } catch (NoSuchFieldError unused41) {
            }
        }
    }

    public static class SwitchPayloadReferenceLabel extends Label {
        public MethodLocation switchLocation;

        private SwitchPayloadReferenceLabel() {
        }
    }

    public interface Task {
        void perform();
    }

    public MutableMethodImplementation(MethodImplementation methodImplementation) {
        int i10 = 0;
        this.instructionList = k0.b(new MethodLocation(null, 0, 0));
        this.tryBlocks = new ArrayList<>();
        this.fixInstructions = true;
        this.registerCount = methodImplementation.getRegisterCount();
        Iterator<? extends Instruction> it = methodImplementation.getInstructions().iterator();
        int codeUnits = 0;
        int i11 = 0;
        while (it.hasNext()) {
            codeUnits += it.next().getCodeUnits();
            i11++;
            this.instructionList.add(new MethodLocation(null, codeUnits, i11));
        }
        final int[] iArr = new int[codeUnits + 1];
        Arrays.fill(iArr, -1);
        for (int i12 = 0; i12 < this.instructionList.size(); i12++) {
            iArr[this.instructionList.get(i12).codeAddress] = i12;
        }
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        for (final Instruction instruction : methodImplementation.getInstructions()) {
            final MethodLocation methodLocation = this.instructionList.get(i13);
            Opcode opcode = instruction.getOpcode();
            if (opcode == Opcode.PACKED_SWITCH_PAYLOAD || opcode == Opcode.SPARSE_SWITCH_PAYLOAD) {
                arrayList.add(new Task() { // from class: org.jf.dexlib2.builder.MutableMethodImplementation.1
                    @Override // org.jf.dexlib2.builder.MutableMethodImplementation.Task
                    public void perform() {
                        MutableMethodImplementation.this.convertAndSetInstruction(methodLocation, iArr, instruction);
                    }
                });
            } else {
                convertAndSetInstruction(methodLocation, iArr, instruction);
            }
            i13++;
        }
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Task) obj).perform();
        }
        for (DebugItem debugItem : methodImplementation.getDebugItems()) {
            MethodLocation methodLocation2 = this.instructionList.get(mapCodeAddressToIndex(iArr, debugItem.getCodeAddress()));
            BuilderDebugItem builderDebugItemConvertDebugItem = convertDebugItem(debugItem);
            methodLocation2.getDebugItems().add(builderDebugItemConvertDebugItem);
            builderDebugItemConvertDebugItem.location = methodLocation2;
        }
        for (TryBlock<? extends ExceptionHandler> tryBlock : methodImplementation.getTryBlocks()) {
            Label labelNewLabel = newLabel(iArr, tryBlock.getStartCodeAddress());
            Label labelNewLabel2 = newLabel(iArr, tryBlock.getCodeUnitCount() + tryBlock.getStartCodeAddress());
            Iterator it2 = tryBlock.getExceptionHandlers().iterator();
            while (it2.hasNext()) {
                ExceptionHandler exceptionHandler = (ExceptionHandler) it2.next();
                this.tryBlocks.add(new BuilderTryBlock(labelNewLabel, labelNewLabel2, exceptionHandler.getExceptionTypeReference(), newLabel(iArr, exceptionHandler.getHandlerCodeAddress())));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void convertAndSetInstruction(MethodLocation methodLocation, int[] iArr, Instruction instruction) {
        switch (AnonymousClass4.$SwitchMap$org$jf$dexlib2$Format[instruction.getOpcode().format.ordinal()]) {
            case 1:
                setInstruction(methodLocation, newBuilderInstruction10t(methodLocation.codeAddress, iArr, (Instruction10t) instruction));
                return;
            case 2:
                setInstruction(methodLocation, newBuilderInstruction10x((Instruction10x) instruction));
                return;
            case 3:
                setInstruction(methodLocation, newBuilderInstruction11n((Instruction11n) instruction));
                return;
            case 4:
                setInstruction(methodLocation, newBuilderInstruction11x((Instruction11x) instruction));
                return;
            case 5:
                setInstruction(methodLocation, newBuilderInstruction12x((Instruction12x) instruction));
                return;
            case 6:
                setInstruction(methodLocation, newBuilderInstruction20bc((Instruction20bc) instruction));
                return;
            case 7:
                setInstruction(methodLocation, newBuilderInstruction20t(methodLocation.codeAddress, iArr, (Instruction20t) instruction));
                return;
            case 8:
                setInstruction(methodLocation, newBuilderInstruction21c((Instruction21c) instruction));
                return;
            case 9:
                setInstruction(methodLocation, newBuilderInstruction21ih((Instruction21ih) instruction));
                return;
            case 10:
                setInstruction(methodLocation, newBuilderInstruction21lh((Instruction21lh) instruction));
                return;
            case 11:
                setInstruction(methodLocation, newBuilderInstruction21s((Instruction21s) instruction));
                return;
            case 12:
                setInstruction(methodLocation, newBuilderInstruction21t(methodLocation.codeAddress, iArr, (Instruction21t) instruction));
                return;
            case 13:
                setInstruction(methodLocation, newBuilderInstruction22b((Instruction22b) instruction));
                return;
            case 14:
                setInstruction(methodLocation, newBuilderInstruction22c((Instruction22c) instruction));
                return;
            case 15:
                setInstruction(methodLocation, newBuilderInstruction22cs((Instruction22cs) instruction));
                return;
            case 16:
                setInstruction(methodLocation, newBuilderInstruction22s((Instruction22s) instruction));
                return;
            case 17:
                setInstruction(methodLocation, newBuilderInstruction22t(methodLocation.codeAddress, iArr, (Instruction22t) instruction));
                return;
            case 18:
                setInstruction(methodLocation, newBuilderInstruction22x((Instruction22x) instruction));
                return;
            case 19:
                setInstruction(methodLocation, newBuilderInstruction23x((Instruction23x) instruction));
                return;
            case 20:
                setInstruction(methodLocation, newBuilderInstruction30t(methodLocation.codeAddress, iArr, (Instruction30t) instruction));
                return;
            case 21:
                setInstruction(methodLocation, newBuilderInstruction31c((Instruction31c) instruction));
                return;
            case 22:
                setInstruction(methodLocation, newBuilderInstruction31i((Instruction31i) instruction));
                return;
            case 23:
                setInstruction(methodLocation, newBuilderInstruction31t(methodLocation, iArr, (Instruction31t) instruction));
                return;
            case 24:
                setInstruction(methodLocation, newBuilderInstruction32x((Instruction32x) instruction));
                return;
            case 25:
                setInstruction(methodLocation, newBuilderInstruction35c((Instruction35c) instruction));
                return;
            case 26:
                setInstruction(methodLocation, newBuilderInstruction35mi((Instruction35mi) instruction));
                return;
            case 27:
                setInstruction(methodLocation, newBuilderInstruction35ms((Instruction35ms) instruction));
                return;
            case 28:
                setInstruction(methodLocation, newBuilderInstruction3rc((Instruction3rc) instruction));
                return;
            case 29:
                setInstruction(methodLocation, newBuilderInstruction3rmi((Instruction3rmi) instruction));
                return;
            case 30:
                setInstruction(methodLocation, newBuilderInstruction3rms((Instruction3rms) instruction));
                return;
            case 31:
                setInstruction(methodLocation, newBuilderInstruction51l((Instruction51l) instruction));
                return;
            case 32:
                setInstruction(methodLocation, newBuilderPackedSwitchPayload(methodLocation, iArr, (PackedSwitchPayload) instruction));
                return;
            case 33:
                setInstruction(methodLocation, newBuilderSparseSwitchPayload(methodLocation, iArr, (SparseSwitchPayload) instruction));
                return;
            case 34:
                setInstruction(methodLocation, newBuilderArrayPayload((ArrayPayload) instruction));
                return;
            default:
                throw new ExceptionWithContext("Instruction format %s not supported", instruction.getOpcode().format);
        }
    }

    private BuilderDebugItem convertDebugItem(DebugItem debugItem) {
        switch (debugItem.getDebugItemType()) {
            case 3:
                StartLocal startLocal = (StartLocal) debugItem;
                return new BuilderStartLocal(startLocal.getRegister(), startLocal.getNameReference(), startLocal.getTypeReference(), startLocal.getSignatureReference());
            case 4:
            default:
                throw new ExceptionWithContext("Invalid debug item type: " + debugItem.getDebugItemType(), new Object[0]);
            case 5:
                return new BuilderEndLocal(((EndLocal) debugItem).getRegister());
            case 6:
                return new BuilderRestartLocal(((RestartLocal) debugItem).getRegister());
            case 7:
                return new BuilderPrologueEnd();
            case 8:
                return new BuilderEpilogueBegin();
            case 9:
                return new BuilderSetSourceFile(((SetSourceFile) debugItem).getSourceFileReference());
            case 10:
                return new BuilderLineNumber(((LineNumber) debugItem).getLineNumber());
        }
    }

    private MethodLocation findSwitchForPayload(MethodLocation methodLocation) {
        BuilderInstruction builderInstruction;
        MethodLocation methodLocation2 = null;
        do {
            for (Label label : methodLocation.getLabels()) {
                if (label instanceof SwitchPayloadReferenceLabel) {
                    if (methodLocation2 != null) {
                        throw new IllegalStateException("Multiple switch instructions refer to the same payload. This is not currently supported. Please file a bug :)");
                    }
                    methodLocation2 = ((SwitchPayloadReferenceLabel) label).switchLocation;
                }
            }
            int i10 = methodLocation.index;
            if (i10 == 0 || (builderInstruction = (methodLocation = this.instructionList.get(i10 - 1)).instruction) == null) {
                break;
            }
        } while (builderInstruction.getOpcode() == Opcode.NOP);
        return methodLocation2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fixInstructions() {
        boolean z10;
        int i10;
        HashSet hashSet = new HashSet();
        ArrayList<MethodLocation> arrayList = this.instructionList;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            MethodLocation methodLocation = arrayList.get(i11);
            i11++;
            MethodLocation methodLocation2 = methodLocation;
            BuilderInstruction builderInstruction = methodLocation2.instruction;
            if (builderInstruction != null && ((i10 = AnonymousClass4.$SwitchMap$org$jf$dexlib2$Opcode[builderInstruction.getOpcode().ordinal()]) == 1 || i10 == 2)) {
                MethodLocation location = ((BuilderOffsetInstruction) builderInstruction).getTarget().getLocation();
                BuilderInstruction firstNonNop = location.instruction;
                if (firstNonNop == null) {
                    throw new IllegalStateException(String.format("Switch instruction at address/index 0x%x/%d points to the end of the method.", Integer.valueOf(methodLocation2.codeAddress), Integer.valueOf(methodLocation2.index)));
                }
                if (firstNonNop.getOpcode() == Opcode.NOP) {
                    firstNonNop = getFirstNonNop(location.index + 1);
                }
                if (firstNonNop == null || !(firstNonNop instanceof BuilderSwitchPayload)) {
                    throw new IllegalStateException(String.format("Switch instruction at address/index 0x%x/%d does not refer to a payload instruction.", Integer.valueOf(methodLocation2.codeAddress), Integer.valueOf(methodLocation2.index)));
                }
                if ((builderInstruction.opcode == Opcode.PACKED_SWITCH && firstNonNop.getOpcode() != Opcode.PACKED_SWITCH_PAYLOAD) || (builderInstruction.opcode == Opcode.SPARSE_SWITCH && firstNonNop.getOpcode() != Opcode.SPARSE_SWITCH_PAYLOAD)) {
                    throw new IllegalStateException(String.format("Switch instruction at address/index 0x%x/%d refers to the wrong type of payload instruction.", Integer.valueOf(methodLocation2.codeAddress), Integer.valueOf(methodLocation2.index)));
                }
                if (!hashSet.add(location)) {
                    throw new IllegalStateException("Multiple switch instructions refer to the same payload. This is not currently supported. Please file a bug :)");
                }
                ((BuilderSwitchPayload) firstNonNop).referrer = methodLocation2;
            }
        }
        do {
            int i12 = 0;
            z10 = false;
            while (i12 < this.instructionList.size()) {
                MethodLocation methodLocation3 = this.instructionList.get(i12);
                BuilderInstruction builderInstruction2 = methodLocation3.instruction;
                if (builderInstruction2 != null) {
                    int i13 = AnonymousClass4.$SwitchMap$org$jf$dexlib2$Opcode[builderInstruction2.getOpcode().ordinal()];
                    if (i13 == 3) {
                        BuilderOffsetInstruction builderOffsetInstruction = (BuilderOffsetInstruction) builderInstruction2;
                        int iInternalGetCodeOffset = builderOffsetInstruction.internalGetCodeOffset();
                        if (iInternalGetCodeOffset < -128 || iInternalGetCodeOffset > 127) {
                            replaceInstruction(methodLocation3.index, (iInternalGetCodeOffset < -32768 || iInternalGetCodeOffset > 32767) ? new BuilderInstruction30t(Opcode.GOTO_32, builderOffsetInstruction.getTarget()) : new BuilderInstruction20t(Opcode.GOTO_16, builderOffsetInstruction.getTarget()));
                            z10 = true;
                        }
                    } else if (i13 != 4) {
                        if (i13 == 5 || i13 == 6) {
                            if (((BuilderSwitchPayload) builderInstruction2).referrer == null) {
                                removeInstruction(i12);
                            }
                            i12--;
                            z10 = true;
                        } else if (i13 != 7) {
                        }
                        if ((methodLocation3.codeAddress & 1) != 0) {
                            int i14 = methodLocation3.index - 1;
                            Opcode opcode = this.instructionList.get(i14).instruction.getOpcode();
                            Opcode opcode2 = Opcode.NOP;
                            if (opcode == opcode2) {
                                removeInstruction(i14);
                                i12--;
                                z10 = true;
                            } else {
                                addInstruction(methodLocation3.index, new BuilderInstruction10x(opcode2));
                                i12++;
                                z10 = true;
                            }
                        }
                    } else {
                        BuilderOffsetInstruction builderOffsetInstruction2 = (BuilderOffsetInstruction) builderInstruction2;
                        int iInternalGetCodeOffset2 = builderOffsetInstruction2.internalGetCodeOffset();
                        if (iInternalGetCodeOffset2 < -32768 || iInternalGetCodeOffset2 > 32767) {
                            replaceInstruction(methodLocation3.index, new BuilderInstruction30t(Opcode.GOTO_32, builderOffsetInstruction2.getTarget()));
                            z10 = true;
                        }
                    }
                }
                i12++;
            }
        } while (z10);
        this.fixInstructions = false;
    }

    private BuilderInstruction getFirstNonNop(int i10) {
        while (i10 < this.instructionList.size() - 1) {
            BuilderInstruction builderInstruction = this.instructionList.get(i10).instruction;
            if (builderInstruction.getOpcode() != Opcode.NOP) {
                return builderInstruction;
            }
            i10++;
        }
        return null;
    }

    private int mapCodeAddressToIndex(int[] iArr, int i10) {
        while (true) {
            if (i10 >= iArr.length) {
                i10 = iArr.length - 1;
            }
            int i11 = iArr[i10];
            if (i11 >= 0) {
                return i11;
            }
            i10--;
        }
    }

    private BuilderArrayPayload newBuilderArrayPayload(ArrayPayload arrayPayload) {
        return new BuilderArrayPayload(arrayPayload.getElementWidth(), arrayPayload.getArrayElements());
    }

    private BuilderInstruction10t newBuilderInstruction10t(int i10, int[] iArr, Instruction10t instruction10t) {
        return new BuilderInstruction10t(instruction10t.getOpcode(), newLabel(iArr, instruction10t.getCodeOffset() + i10));
    }

    private BuilderInstruction10x newBuilderInstruction10x(Instruction10x instruction10x) {
        return new BuilderInstruction10x(instruction10x.getOpcode());
    }

    private BuilderInstruction11n newBuilderInstruction11n(Instruction11n instruction11n) {
        return new BuilderInstruction11n(instruction11n.getOpcode(), instruction11n.getRegisterA(), instruction11n.getNarrowLiteral());
    }

    private BuilderInstruction11x newBuilderInstruction11x(Instruction11x instruction11x) {
        return new BuilderInstruction11x(instruction11x.getOpcode(), instruction11x.getRegisterA());
    }

    private BuilderInstruction12x newBuilderInstruction12x(Instruction12x instruction12x) {
        return new BuilderInstruction12x(instruction12x.getOpcode(), instruction12x.getRegisterA(), instruction12x.getRegisterB());
    }

    private BuilderInstruction20bc newBuilderInstruction20bc(Instruction20bc instruction20bc) {
        return new BuilderInstruction20bc(instruction20bc.getOpcode(), instruction20bc.getVerificationError(), instruction20bc.getReference());
    }

    private BuilderInstruction20t newBuilderInstruction20t(int i10, int[] iArr, Instruction20t instruction20t) {
        return new BuilderInstruction20t(instruction20t.getOpcode(), newLabel(iArr, instruction20t.getCodeOffset() + i10));
    }

    private BuilderInstruction21c newBuilderInstruction21c(Instruction21c instruction21c) {
        return new BuilderInstruction21c(instruction21c.getOpcode(), instruction21c.getRegisterA(), instruction21c.getReference());
    }

    private BuilderInstruction21ih newBuilderInstruction21ih(Instruction21ih instruction21ih) {
        return new BuilderInstruction21ih(instruction21ih.getOpcode(), instruction21ih.getRegisterA(), instruction21ih.getNarrowLiteral());
    }

    private BuilderInstruction21lh newBuilderInstruction21lh(Instruction21lh instruction21lh) {
        return new BuilderInstruction21lh(instruction21lh.getOpcode(), instruction21lh.getRegisterA(), instruction21lh.getWideLiteral());
    }

    private BuilderInstruction21s newBuilderInstruction21s(Instruction21s instruction21s) {
        return new BuilderInstruction21s(instruction21s.getOpcode(), instruction21s.getRegisterA(), instruction21s.getNarrowLiteral());
    }

    private BuilderInstruction21t newBuilderInstruction21t(int i10, int[] iArr, Instruction21t instruction21t) {
        return new BuilderInstruction21t(instruction21t.getOpcode(), instruction21t.getRegisterA(), newLabel(iArr, instruction21t.getCodeOffset() + i10));
    }

    private BuilderInstruction22b newBuilderInstruction22b(Instruction22b instruction22b) {
        return new BuilderInstruction22b(instruction22b.getOpcode(), instruction22b.getRegisterA(), instruction22b.getRegisterB(), instruction22b.getNarrowLiteral());
    }

    private BuilderInstruction22c newBuilderInstruction22c(Instruction22c instruction22c) {
        return new BuilderInstruction22c(instruction22c.getOpcode(), instruction22c.getRegisterA(), instruction22c.getRegisterB(), instruction22c.getReference());
    }

    private BuilderInstruction22cs newBuilderInstruction22cs(Instruction22cs instruction22cs) {
        return new BuilderInstruction22cs(instruction22cs.getOpcode(), instruction22cs.getRegisterA(), instruction22cs.getRegisterB(), instruction22cs.getFieldOffset());
    }

    private BuilderInstruction22s newBuilderInstruction22s(Instruction22s instruction22s) {
        return new BuilderInstruction22s(instruction22s.getOpcode(), instruction22s.getRegisterA(), instruction22s.getRegisterB(), instruction22s.getNarrowLiteral());
    }

    private BuilderInstruction22t newBuilderInstruction22t(int i10, int[] iArr, Instruction22t instruction22t) {
        return new BuilderInstruction22t(instruction22t.getOpcode(), instruction22t.getRegisterA(), instruction22t.getRegisterB(), newLabel(iArr, instruction22t.getCodeOffset() + i10));
    }

    private BuilderInstruction22x newBuilderInstruction22x(Instruction22x instruction22x) {
        return new BuilderInstruction22x(instruction22x.getOpcode(), instruction22x.getRegisterA(), instruction22x.getRegisterB());
    }

    private BuilderInstruction23x newBuilderInstruction23x(Instruction23x instruction23x) {
        return new BuilderInstruction23x(instruction23x.getOpcode(), instruction23x.getRegisterA(), instruction23x.getRegisterB(), instruction23x.getRegisterC());
    }

    private BuilderInstruction30t newBuilderInstruction30t(int i10, int[] iArr, Instruction30t instruction30t) {
        return new BuilderInstruction30t(instruction30t.getOpcode(), newLabel(iArr, instruction30t.getCodeOffset() + i10));
    }

    private BuilderInstruction31c newBuilderInstruction31c(Instruction31c instruction31c) {
        return new BuilderInstruction31c(instruction31c.getOpcode(), instruction31c.getRegisterA(), instruction31c.getReference());
    }

    private BuilderInstruction31i newBuilderInstruction31i(Instruction31i instruction31i) {
        return new BuilderInstruction31i(instruction31i.getOpcode(), instruction31i.getRegisterA(), instruction31i.getNarrowLiteral());
    }

    private BuilderInstruction31t newBuilderInstruction31t(MethodLocation methodLocation, int[] iArr, Instruction31t instruction31t) {
        int codeAddress = methodLocation.getCodeAddress();
        return new BuilderInstruction31t(instruction31t.getOpcode(), instruction31t.getRegisterA(), instruction31t.getOpcode() != Opcode.FILL_ARRAY_DATA ? newSwitchPayloadReferenceLabel(methodLocation, iArr, instruction31t.getCodeOffset() + codeAddress) : newLabel(iArr, instruction31t.getCodeOffset() + codeAddress));
    }

    private BuilderInstruction32x newBuilderInstruction32x(Instruction32x instruction32x) {
        return new BuilderInstruction32x(instruction32x.getOpcode(), instruction32x.getRegisterA(), instruction32x.getRegisterB());
    }

    private BuilderInstruction35c newBuilderInstruction35c(Instruction35c instruction35c) {
        return new BuilderInstruction35c(instruction35c.getOpcode(), instruction35c.getRegisterCount(), instruction35c.getRegisterC(), instruction35c.getRegisterD(), instruction35c.getRegisterE(), instruction35c.getRegisterF(), instruction35c.getRegisterG(), instruction35c.getReference());
    }

    private BuilderInstruction35mi newBuilderInstruction35mi(Instruction35mi instruction35mi) {
        return new BuilderInstruction35mi(instruction35mi.getOpcode(), instruction35mi.getRegisterCount(), instruction35mi.getRegisterC(), instruction35mi.getRegisterD(), instruction35mi.getRegisterE(), instruction35mi.getRegisterF(), instruction35mi.getRegisterG(), instruction35mi.getInlineIndex());
    }

    private BuilderInstruction35ms newBuilderInstruction35ms(Instruction35ms instruction35ms) {
        return new BuilderInstruction35ms(instruction35ms.getOpcode(), instruction35ms.getRegisterCount(), instruction35ms.getRegisterC(), instruction35ms.getRegisterD(), instruction35ms.getRegisterE(), instruction35ms.getRegisterF(), instruction35ms.getRegisterG(), instruction35ms.getVtableIndex());
    }

    private BuilderInstruction3rc newBuilderInstruction3rc(Instruction3rc instruction3rc) {
        return new BuilderInstruction3rc(instruction3rc.getOpcode(), instruction3rc.getStartRegister(), instruction3rc.getRegisterCount(), instruction3rc.getReference());
    }

    private BuilderInstruction3rmi newBuilderInstruction3rmi(Instruction3rmi instruction3rmi) {
        return new BuilderInstruction3rmi(instruction3rmi.getOpcode(), instruction3rmi.getStartRegister(), instruction3rmi.getRegisterCount(), instruction3rmi.getInlineIndex());
    }

    private BuilderInstruction3rms newBuilderInstruction3rms(Instruction3rms instruction3rms) {
        return new BuilderInstruction3rms(instruction3rms.getOpcode(), instruction3rms.getStartRegister(), instruction3rms.getRegisterCount(), instruction3rms.getVtableIndex());
    }

    private BuilderInstruction51l newBuilderInstruction51l(Instruction51l instruction51l) {
        return new BuilderInstruction51l(instruction51l.getOpcode(), instruction51l.getRegisterA(), instruction51l.getWideLiteral());
    }

    private BuilderPackedSwitchPayload newBuilderPackedSwitchPayload(MethodLocation methodLocation, int[] iArr, PackedSwitchPayload packedSwitchPayload) {
        List<? extends SwitchElement> switchElements = packedSwitchPayload.getSwitchElements();
        if (switchElements.size() == 0) {
            return new BuilderPackedSwitchPayload(0, null);
        }
        MethodLocation methodLocationFindSwitchForPayload = findSwitchForPayload(methodLocation);
        int i10 = methodLocationFindSwitchForPayload == null ? 0 : methodLocationFindSwitchForPayload.codeAddress;
        ArrayList arrayList = new ArrayList();
        Iterator<? extends SwitchElement> it = switchElements.iterator();
        while (it.hasNext()) {
            arrayList.add(newLabel(iArr, it.next().getOffset() + i10));
        }
        return new BuilderPackedSwitchPayload(switchElements.get(0).getKey(), arrayList);
    }

    private BuilderSparseSwitchPayload newBuilderSparseSwitchPayload(MethodLocation methodLocation, int[] iArr, SparseSwitchPayload sparseSwitchPayload) {
        List<? extends SwitchElement> switchElements = sparseSwitchPayload.getSwitchElements();
        if (switchElements.size() == 0) {
            return new BuilderSparseSwitchPayload(null);
        }
        MethodLocation methodLocationFindSwitchForPayload = findSwitchForPayload(methodLocation);
        int i10 = methodLocationFindSwitchForPayload == null ? 0 : methodLocationFindSwitchForPayload.codeAddress;
        ArrayList arrayList = new ArrayList();
        for (SwitchElement switchElement : switchElements) {
            arrayList.add(new SwitchLabelElement(switchElement.getKey(), newLabel(iArr, switchElement.getOffset() + i10)));
        }
        return new BuilderSparseSwitchPayload(arrayList);
    }

    private Label newLabel(int[] iArr, int i10) {
        return this.instructionList.get(mapCodeAddressToIndex(iArr, i10)).addNewLabel();
    }

    private void setInstruction(MethodLocation methodLocation, BuilderInstruction builderInstruction) {
        methodLocation.instruction = builderInstruction;
        builderInstruction.location = methodLocation;
    }

    public void addCatch(TypeReference typeReference, Label label, Label label2, Label label3) {
        this.tryBlocks.add(new BuilderTryBlock(label, label2, typeReference, label3));
    }

    public void addInstruction(int i10, BuilderInstruction builderInstruction) {
        if (i10 >= this.instructionList.size()) {
            throw new IndexOutOfBoundsException();
        }
        if (i10 == this.instructionList.size() - 1) {
            addInstruction(builderInstruction);
            return;
        }
        int codeAddress = this.instructionList.get(i10).getCodeAddress();
        MethodLocation methodLocation = new MethodLocation(builderInstruction, codeAddress, i10);
        this.instructionList.add(i10, methodLocation);
        builderInstruction.location = methodLocation;
        int codeUnits = builderInstruction.getCodeUnits() + codeAddress;
        for (int i11 = i10 + 1; i11 < this.instructionList.size(); i11++) {
            MethodLocation methodLocation2 = this.instructionList.get(i11);
            methodLocation2.index++;
            methodLocation2.codeAddress = codeUnits;
            BuilderInstruction builderInstruction2 = methodLocation2.instruction;
            if (builderInstruction2 != null) {
                codeUnits = builderInstruction2.getCodeUnits() + codeUnits;
            }
        }
        this.fixInstructions = true;
    }

    @Override // org.jf.dexlib2.iface.MethodImplementation
    public Iterable<? extends DebugItem> getDebugItems() {
        if (this.fixInstructions) {
            fixInstructions();
        }
        return new l(u2.j(this.instructionList, new e<MethodLocation, Iterable<? extends DebugItem>>() { // from class: org.jf.dexlib2.builder.MutableMethodImplementation.3
            static final /* synthetic */ boolean $assertionsDisabled = false;

            @Override // lc.e
            public Iterable<? extends DebugItem> apply(MethodLocation methodLocation) {
                if (MutableMethodImplementation.this.fixInstructions) {
                    throw new IllegalStateException("This iterator was invalidated by a change to this MutableMethodImplementation.");
                }
                return methodLocation.getDebugItems();
            }
        }));
    }

    @Override // org.jf.dexlib2.iface.MethodImplementation
    public int getRegisterCount() {
        return this.registerCount;
    }

    @Override // org.jf.dexlib2.iface.MethodImplementation
    public List<BuilderTryBlock> getTryBlocks() {
        if (this.fixInstructions) {
            fixInstructions();
        }
        return Collections.unmodifiableList(this.tryBlocks);
    }

    public Label newLabelForAddress(int i10) {
        if (i10 < 0 || i10 > ((MethodLocation) b.b(this.instructionList, 1)).codeAddress) {
            throw new IndexOutOfBoundsException(String.format("codeAddress %d out of bounds", Integer.valueOf(i10)));
        }
        return this.instructionList.get(mapCodeAddressToIndex(i10)).addNewLabel();
    }

    public Label newLabelForIndex(int i10) {
        if (i10 < 0 || i10 >= this.instructionList.size()) {
            throw new IndexOutOfBoundsException(String.format("instruction index %d out of bounds", Integer.valueOf(i10)));
        }
        return this.instructionList.get(i10).addNewLabel();
    }

    public Label newSwitchPayloadReferenceLabel(MethodLocation methodLocation, int[] iArr, int i10) {
        MethodLocation methodLocation2 = this.instructionList.get(mapCodeAddressToIndex(iArr, i10));
        SwitchPayloadReferenceLabel switchPayloadReferenceLabel = new SwitchPayloadReferenceLabel();
        switchPayloadReferenceLabel.switchLocation = methodLocation;
        methodLocation2.getLabels().add(switchPayloadReferenceLabel);
        return switchPayloadReferenceLabel;
    }

    public void removeInstruction(int i10) {
        if (i10 >= this.instructionList.size() - 1) {
            throw new IndexOutOfBoundsException();
        }
        MethodLocation methodLocation = this.instructionList.get(i10);
        methodLocation.instruction = null;
        methodLocation.mergeInto(this.instructionList.get(i10 + 1));
        this.instructionList.remove(i10);
        int codeUnits = methodLocation.codeAddress;
        while (i10 < this.instructionList.size()) {
            MethodLocation methodLocation2 = this.instructionList.get(i10);
            methodLocation2.index = i10;
            methodLocation2.codeAddress = codeUnits;
            Instruction instruction = methodLocation2.getInstruction();
            if (instruction != null) {
                codeUnits = instruction.getCodeUnits() + codeUnits;
            }
            i10++;
        }
        this.fixInstructions = true;
    }

    public void replaceInstruction(int i10, BuilderInstruction builderInstruction) {
        if (i10 >= this.instructionList.size() - 1) {
            throw new IndexOutOfBoundsException();
        }
        MethodLocation methodLocation = this.instructionList.get(i10);
        builderInstruction.location = methodLocation;
        methodLocation.instruction.location = null;
        methodLocation.instruction = builderInstruction;
        int codeUnits = builderInstruction.getCodeUnits() + methodLocation.codeAddress;
        for (int i11 = i10 + 1; i11 < this.instructionList.size(); i11++) {
            MethodLocation methodLocation2 = this.instructionList.get(i11);
            methodLocation2.codeAddress = codeUnits;
            Instruction instruction = methodLocation2.getInstruction();
            if (instruction != null) {
                codeUnits = instruction.getCodeUnits() + codeUnits;
            }
        }
        this.fixInstructions = true;
    }

    public void swapInstructions(int i10, int i11) {
        if (i10 >= this.instructionList.size() - 1 || i11 >= this.instructionList.size() - 1) {
            throw new IndexOutOfBoundsException();
        }
        MethodLocation methodLocation = this.instructionList.get(i10);
        MethodLocation methodLocation2 = this.instructionList.get(i11);
        BuilderInstruction builderInstruction = methodLocation.instruction;
        builderInstruction.location = methodLocation2;
        BuilderInstruction builderInstruction2 = methodLocation2.instruction;
        builderInstruction2.location = methodLocation;
        methodLocation2.instruction = builderInstruction;
        methodLocation.instruction = builderInstruction2;
        if (i11 < i10) {
            i11 = i10;
            i10 = i11;
        }
        int codeUnits = builderInstruction2.getCodeUnits() + methodLocation.codeAddress;
        for (int i12 = i10 + 1; i12 <= i11; i12++) {
            MethodLocation methodLocation3 = this.instructionList.get(i12);
            methodLocation3.codeAddress = codeUnits;
            codeUnits += methodLocation3.instruction.getCodeUnits();
        }
        this.fixInstructions = true;
    }

    public void addCatch(String str, Label label, Label label2, Label label3) {
        this.tryBlocks.add(new BuilderTryBlock(label, label2, str, label3));
    }

    @Override // org.jf.dexlib2.iface.MethodImplementation
    public List<BuilderInstruction> getInstructions() {
        if (this.fixInstructions) {
            fixInstructions();
        }
        return new AbstractList<BuilderInstruction>() { // from class: org.jf.dexlib2.builder.MutableMethodImplementation.2
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                if (MutableMethodImplementation.this.fixInstructions) {
                    MutableMethodImplementation.this.fixInstructions();
                }
                return MutableMethodImplementation.this.instructionList.size() - 1;
            }

            @Override // java.util.AbstractList, java.util.List
            public BuilderInstruction get(int i10) {
                if (i10 >= size()) {
                    throw new IndexOutOfBoundsException();
                }
                if (MutableMethodImplementation.this.fixInstructions) {
                    MutableMethodImplementation.this.fixInstructions();
                }
                return MutableMethodImplementation.this.instructionList.get(i10).instruction;
            }
        };
    }

    public void addCatch(Label label, Label label2, Label label3) {
        this.tryBlocks.add(new BuilderTryBlock(label, label2, label3));
    }

    private int mapCodeAddressToIndex(int i10) {
        int size = (int) (i10 / 1.9f);
        if (size >= this.instructionList.size()) {
            size = this.instructionList.size() - 1;
        }
        int i11 = this.instructionList.get(size).codeAddress;
        if (i11 == i10) {
            return size;
        }
        if (i11 > i10) {
            do {
                size--;
            } while (this.instructionList.get(size).codeAddress > i10);
            return size;
        }
        while (true) {
            int i12 = size + 1;
            if (i12 >= this.instructionList.size() || this.instructionList.get(i12).codeAddress > i10) {
                break;
            }
            size = i12;
        }
        return size;
    }

    public void addInstruction(BuilderInstruction builderInstruction) {
        MethodLocation methodLocation = (MethodLocation) b.b(this.instructionList, 1);
        methodLocation.instruction = builderInstruction;
        builderInstruction.location = methodLocation;
        int codeUnits = builderInstruction.getCodeUnits() + methodLocation.codeAddress;
        ArrayList<MethodLocation> arrayList = this.instructionList;
        arrayList.add(new MethodLocation(null, codeUnits, arrayList.size()));
        this.fixInstructions = true;
    }

    public MutableMethodImplementation(int i10) {
        this.instructionList = k0.b(new MethodLocation(null, 0, 0));
        this.tryBlocks = new ArrayList<>();
        this.fixInstructions = true;
        this.registerCount = i10;
    }
}
