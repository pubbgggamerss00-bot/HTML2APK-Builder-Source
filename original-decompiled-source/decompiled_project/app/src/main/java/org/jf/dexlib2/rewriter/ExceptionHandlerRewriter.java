package org.jf.dexlib2.rewriter;

import org.jf.dexlib2.base.BaseExceptionHandler;
import org.jf.dexlib2.iface.ExceptionHandler;

/* loaded from: classes3.dex */
public class ExceptionHandlerRewriter implements Rewriter<ExceptionHandler> {
    protected final Rewriters rewriters;

    public class RewrittenExceptionHandler extends BaseExceptionHandler {
        protected ExceptionHandler exceptionHandler;

        public RewrittenExceptionHandler(ExceptionHandler exceptionHandler) {
            this.exceptionHandler = exceptionHandler;
        }

        @Override // org.jf.dexlib2.iface.ExceptionHandler
        public String getExceptionType() {
            return (String) RewriterUtils.rewriteNullable(ExceptionHandlerRewriter.this.rewriters.getTypeRewriter(), this.exceptionHandler.getExceptionType());
        }

        @Override // org.jf.dexlib2.iface.ExceptionHandler
        public int getHandlerCodeAddress() {
            return this.exceptionHandler.getHandlerCodeAddress();
        }
    }

    public ExceptionHandlerRewriter(Rewriters rewriters) {
        this.rewriters = rewriters;
    }

    @Override // org.jf.dexlib2.rewriter.Rewriter
    public ExceptionHandler rewrite(ExceptionHandler exceptionHandler) {
        return new RewrittenExceptionHandler(exceptionHandler);
    }
}
