package org.jf.dexlib2.rewriter;

import java.util.Set;
import org.jf.dexlib2.base.BaseMethodParameter;
import org.jf.dexlib2.iface.Annotation;
import org.jf.dexlib2.iface.MethodParameter;

/* loaded from: classes3.dex */
public class MethodParameterRewriter implements Rewriter<MethodParameter> {
    protected final Rewriters rewriters;

    public class RewrittenMethodParameter extends BaseMethodParameter {
        protected MethodParameter methodParameter;

        public RewrittenMethodParameter(MethodParameter methodParameter) {
            this.methodParameter = methodParameter;
        }

        @Override // org.jf.dexlib2.iface.MethodParameter
        public Set<? extends Annotation> getAnnotations() {
            return RewriterUtils.rewriteSet(MethodParameterRewriter.this.rewriters.getAnnotationRewriter(), this.methodParameter.getAnnotations());
        }

        @Override // org.jf.dexlib2.iface.MethodParameter, org.jf.dexlib2.iface.debug.LocalInfo
        public String getName() {
            return this.methodParameter.getName();
        }

        @Override // org.jf.dexlib2.base.BaseMethodParameter, org.jf.dexlib2.iface.MethodParameter, org.jf.dexlib2.iface.debug.LocalInfo
        public String getSignature() {
            return this.methodParameter.getSignature();
        }

        @Override // org.jf.dexlib2.iface.reference.TypeReference, org.jf.dexlib2.iface.ClassDef
        public String getType() {
            return MethodParameterRewriter.this.rewriters.getTypeRewriter().rewrite(this.methodParameter.getType());
        }
    }

    public MethodParameterRewriter(Rewriters rewriters) {
        this.rewriters = rewriters;
    }

    @Override // org.jf.dexlib2.rewriter.Rewriter
    public MethodParameter rewrite(MethodParameter methodParameter) {
        return new RewrittenMethodParameter(methodParameter);
    }
}
