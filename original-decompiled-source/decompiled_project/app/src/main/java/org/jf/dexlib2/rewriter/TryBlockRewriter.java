package org.jf.dexlib2.rewriter;

import java.util.List;
import org.jf.dexlib2.base.BaseTryBlock;
import org.jf.dexlib2.iface.ExceptionHandler;
import org.jf.dexlib2.iface.TryBlock;

/* loaded from: classes3.dex */
public class TryBlockRewriter implements Rewriter<TryBlock<? extends ExceptionHandler>> {
    protected final Rewriters rewriters;

    public class RewrittenTryBlock extends BaseTryBlock<ExceptionHandler> {
        protected TryBlock<? extends ExceptionHandler> tryBlock;

        public RewrittenTryBlock(TryBlock<? extends ExceptionHandler> tryBlock) {
            this.tryBlock = tryBlock;
        }

        @Override // org.jf.dexlib2.iface.TryBlock
        public int getCodeUnitCount() {
            return this.tryBlock.getCodeUnitCount();
        }

        @Override // org.jf.dexlib2.iface.TryBlock
        public List<? extends ExceptionHandler> getExceptionHandlers() {
            return RewriterUtils.rewriteList(TryBlockRewriter.this.rewriters.getExceptionHandlerRewriter(), this.tryBlock.getExceptionHandlers());
        }

        @Override // org.jf.dexlib2.iface.TryBlock
        public int getStartCodeAddress() {
            return this.tryBlock.getStartCodeAddress();
        }
    }

    public TryBlockRewriter(Rewriters rewriters) {
        this.rewriters = rewriters;
    }

    @Override // org.jf.dexlib2.rewriter.Rewriter
    public TryBlock<? extends ExceptionHandler> rewrite(TryBlock<? extends ExceptionHandler> tryBlock) {
        return new RewrittenTryBlock(tryBlock);
    }
}
