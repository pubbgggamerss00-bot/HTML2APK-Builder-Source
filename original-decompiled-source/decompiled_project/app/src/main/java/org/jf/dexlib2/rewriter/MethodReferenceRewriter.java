package org.jf.dexlib2.rewriter;

import java.util.List;
import lc.e;
import nc.k0;
import org.jf.dexlib2.base.reference.BaseMethodReference;
import org.jf.dexlib2.iface.reference.MethodReference;

/* loaded from: classes3.dex */
public class MethodReferenceRewriter implements Rewriter<MethodReference> {
    protected final Rewriters rewriters;

    public class RewrittenMethodReference extends BaseMethodReference {
        protected MethodReference methodReference;

        public RewrittenMethodReference(MethodReference methodReference) {
            this.methodReference = methodReference;
        }

        @Override // org.jf.dexlib2.iface.reference.MethodReference, org.jf.dexlib2.iface.Method, org.jf.dexlib2.iface.Member
        public String getDefiningClass() {
            return MethodReferenceRewriter.this.rewriters.getTypeRewriter().rewrite(this.methodReference.getDefiningClass());
        }

        @Override // org.jf.dexlib2.iface.reference.MethodReference, org.jf.dexlib2.iface.Method, org.jf.dexlib2.iface.Member
        public String getName() {
            return this.methodReference.getName();
        }

        @Override // org.jf.dexlib2.iface.reference.MethodReference
        public List<? extends CharSequence> getParameterTypes() {
            return RewriterUtils.rewriteList(MethodReferenceRewriter.this.rewriters.getTypeRewriter(), k0.d(this.methodReference.getParameterTypes(), new e<CharSequence, String>() { // from class: org.jf.dexlib2.rewriter.MethodReferenceRewriter.RewrittenMethodReference.1
                @Override // lc.e
                public String apply(CharSequence charSequence) {
                    return charSequence.toString();
                }
            }));
        }

        @Override // org.jf.dexlib2.iface.reference.MethodReference, org.jf.dexlib2.iface.Method
        public String getReturnType() {
            return MethodReferenceRewriter.this.rewriters.getTypeRewriter().rewrite(this.methodReference.getReturnType());
        }
    }

    public MethodReferenceRewriter(Rewriters rewriters) {
        this.rewriters = rewriters;
    }

    @Override // org.jf.dexlib2.rewriter.Rewriter
    public MethodReference rewrite(MethodReference methodReference) {
        return new RewrittenMethodReference(methodReference);
    }
}
