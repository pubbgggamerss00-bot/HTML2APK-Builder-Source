package org.jf.dexlib2.rewriter;

import org.jf.dexlib2.Format;
import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.iface.instruction.Instruction;
import org.jf.dexlib2.iface.instruction.ReferenceInstruction;
import org.jf.dexlib2.iface.instruction.formats.Instruction20bc;
import org.jf.dexlib2.iface.instruction.formats.Instruction21c;
import org.jf.dexlib2.iface.instruction.formats.Instruction22c;
import org.jf.dexlib2.iface.instruction.formats.Instruction31c;
import org.jf.dexlib2.iface.instruction.formats.Instruction35c;
import org.jf.dexlib2.iface.instruction.formats.Instruction3rc;
import org.jf.dexlib2.iface.reference.FieldReference;
import org.jf.dexlib2.iface.reference.MethodReference;
import org.jf.dexlib2.iface.reference.Reference;
import org.jf.dexlib2.iface.reference.TypeReference;

/* loaded from: classes3.dex */
public class InstructionRewriter implements Rewriter<Instruction> {
    protected final Rewriters rewriters;

    /* renamed from: org.jf.dexlib2.rewriter.InstructionRewriter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$jf$dexlib2$Format;

        static {
            int[] iArr = new int[Format.values().length];
            $SwitchMap$org$jf$dexlib2$Format = iArr;
            try {
                iArr[Format.Format20bc.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format21c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format22c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format31c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format35c.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format3rc.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public class BaseRewrittenReferenceInstruction<T extends ReferenceInstruction> implements ReferenceInstruction {
        protected T instruction;

        public BaseRewrittenReferenceInstruction(T t3) {
            this.instruction = t3;
        }

        @Override // org.jf.dexlib2.iface.instruction.Instruction
        public int getCodeUnits() {
            return this.instruction.getCodeUnits();
        }

        @Override // org.jf.dexlib2.iface.instruction.Instruction
        public Opcode getOpcode() {
            return this.instruction.getOpcode();
        }

        @Override // org.jf.dexlib2.iface.instruction.ReferenceInstruction
        public Reference getReference() {
            int referenceType = this.instruction.getReferenceType();
            if (referenceType == 0) {
                return this.instruction.getReference();
            }
            if (referenceType == 1) {
                return RewriterUtils.rewriteTypeReference(InstructionRewriter.this.rewriters.getTypeRewriter(), (TypeReference) this.instruction.getReference());
            }
            if (referenceType == 2) {
                return InstructionRewriter.this.rewriters.getFieldReferenceRewriter().rewrite((FieldReference) this.instruction.getReference());
            }
            if (referenceType == 3) {
                return InstructionRewriter.this.rewriters.getMethodReferenceRewriter().rewrite((MethodReference) this.instruction.getReference());
            }
            throw new IllegalArgumentException();
        }

        @Override // org.jf.dexlib2.iface.instruction.ReferenceInstruction
        public int getReferenceType() {
            return this.instruction.getReferenceType();
        }
    }

    public class RewrittenInstruction20bc extends BaseRewrittenReferenceInstruction<Instruction20bc> implements Instruction20bc {
        public RewrittenInstruction20bc(Instruction20bc instruction20bc) {
            super(instruction20bc);
        }

        @Override // org.jf.dexlib2.iface.instruction.VerificationErrorInstruction
        public int getVerificationError() {
            return ((Instruction20bc) this.instruction).getVerificationError();
        }
    }

    public class RewrittenInstruction21c extends BaseRewrittenReferenceInstruction<Instruction21c> implements Instruction21c {
        public RewrittenInstruction21c(Instruction21c instruction21c) {
            super(instruction21c);
        }

        @Override // org.jf.dexlib2.iface.instruction.OneRegisterInstruction
        public int getRegisterA() {
            return ((Instruction21c) this.instruction).getRegisterA();
        }
    }

    public class RewrittenInstruction22c extends BaseRewrittenReferenceInstruction<Instruction22c> implements Instruction22c {
        public RewrittenInstruction22c(Instruction22c instruction22c) {
            super(instruction22c);
        }

        @Override // org.jf.dexlib2.iface.instruction.OneRegisterInstruction
        public int getRegisterA() {
            return ((Instruction22c) this.instruction).getRegisterA();
        }

        @Override // org.jf.dexlib2.iface.instruction.TwoRegisterInstruction
        public int getRegisterB() {
            return ((Instruction22c) this.instruction).getRegisterB();
        }
    }

    public class RewrittenInstruction31c extends BaseRewrittenReferenceInstruction<Instruction31c> implements Instruction31c {
        public RewrittenInstruction31c(Instruction31c instruction31c) {
            super(instruction31c);
        }

        @Override // org.jf.dexlib2.iface.instruction.OneRegisterInstruction
        public int getRegisterA() {
            return ((Instruction31c) this.instruction).getRegisterA();
        }
    }

    public class RewrittenInstruction35c extends BaseRewrittenReferenceInstruction<Instruction35c> implements Instruction35c {
        public RewrittenInstruction35c(Instruction35c instruction35c) {
            super(instruction35c);
        }

        @Override // org.jf.dexlib2.iface.instruction.FiveRegisterInstruction
        public int getRegisterC() {
            return ((Instruction35c) this.instruction).getRegisterC();
        }

        @Override // org.jf.dexlib2.iface.instruction.VariableRegisterInstruction
        public int getRegisterCount() {
            return ((Instruction35c) this.instruction).getRegisterCount();
        }

        @Override // org.jf.dexlib2.iface.instruction.FiveRegisterInstruction
        public int getRegisterD() {
            return ((Instruction35c) this.instruction).getRegisterD();
        }

        @Override // org.jf.dexlib2.iface.instruction.FiveRegisterInstruction
        public int getRegisterE() {
            return ((Instruction35c) this.instruction).getRegisterE();
        }

        @Override // org.jf.dexlib2.iface.instruction.FiveRegisterInstruction
        public int getRegisterF() {
            return ((Instruction35c) this.instruction).getRegisterF();
        }

        @Override // org.jf.dexlib2.iface.instruction.FiveRegisterInstruction
        public int getRegisterG() {
            return ((Instruction35c) this.instruction).getRegisterG();
        }
    }

    public class RewrittenInstruction3rc extends BaseRewrittenReferenceInstruction<Instruction3rc> implements Instruction3rc {
        public RewrittenInstruction3rc(Instruction3rc instruction3rc) {
            super(instruction3rc);
        }

        @Override // org.jf.dexlib2.iface.instruction.VariableRegisterInstruction
        public int getRegisterCount() {
            return ((Instruction3rc) this.instruction).getRegisterCount();
        }

        @Override // org.jf.dexlib2.iface.instruction.RegisterRangeInstruction
        public int getStartRegister() {
            return ((Instruction3rc) this.instruction).getStartRegister();
        }
    }

    public InstructionRewriter(Rewriters rewriters) {
        this.rewriters = rewriters;
    }

    @Override // org.jf.dexlib2.rewriter.Rewriter
    public Instruction rewrite(Instruction instruction) {
        if (!(instruction instanceof ReferenceInstruction)) {
            return instruction;
        }
        switch (AnonymousClass1.$SwitchMap$org$jf$dexlib2$Format[instruction.getOpcode().format.ordinal()]) {
            case 1:
                return new RewrittenInstruction20bc((Instruction20bc) instruction);
            case 2:
                return new RewrittenInstruction21c((Instruction21c) instruction);
            case 3:
                return new RewrittenInstruction22c((Instruction22c) instruction);
            case 4:
                return new RewrittenInstruction31c((Instruction31c) instruction);
            case 5:
                return new RewrittenInstruction35c((Instruction35c) instruction);
            case 6:
                return new RewrittenInstruction3rc((Instruction3rc) instruction);
            default:
                throw new IllegalArgumentException();
        }
    }
}
