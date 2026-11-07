package org.jf.dexlib2.rewriter;

import java.util.List;
import org.jf.dexlib2.iface.ExceptionHandler;
import org.jf.dexlib2.iface.MethodImplementation;
import org.jf.dexlib2.iface.TryBlock;
import org.jf.dexlib2.iface.debug.DebugItem;
import org.jf.dexlib2.iface.instruction.Instruction;

/* loaded from: classes3.dex */
public class MethodImplementationRewriter implements Rewriter<MethodImplementation> {
    protected final Rewriters rewriters;

    public class RewrittenMethodImplementation implements MethodImplementation {
        protected MethodImplementation methodImplementation;

        public RewrittenMethodImplementation(MethodImplementation methodImplementation) {
            this.methodImplementation = methodImplementation;
        }

        @Override // org.jf.dexlib2.iface.MethodImplementation
        public Iterable<? extends DebugItem> getDebugItems() {
            return RewriterUtils.rewriteIterable(MethodImplementationRewriter.this.rewriters.getDebugItemRewriter(), this.methodImplementation.getDebugItems());
        }

        @Override // org.jf.dexlib2.iface.MethodImplementation
        public Iterable<? extends Instruction> getInstructions() {
            return RewriterUtils.rewriteIterable(MethodImplementationRewriter.this.rewriters.getInstructionRewriter(), this.methodImplementation.getInstructions());
        }

        @Override // org.jf.dexlib2.iface.MethodImplementation
        public int getRegisterCount() {
            return this.methodImplementation.getRegisterCount();
        }

        @Override // org.jf.dexlib2.iface.MethodImplementation
        public List<? extends TryBlock<? extends ExceptionHandler>> getTryBlocks() {
            return RewriterUtils.rewriteList(MethodImplementationRewriter.this.rewriters.getTryBlockRewriter(), this.methodImplementation.getTryBlocks());
        }
    }

    public MethodImplementationRewriter(Rewriters rewriters) {
        this.rewriters = rewriters;
    }

    @Override // org.jf.dexlib2.rewriter.Rewriter
    public MethodImplementation rewrite(MethodImplementation methodImplementation) {
        return new RewrittenMethodImplementation(methodImplementation);
    }
}
