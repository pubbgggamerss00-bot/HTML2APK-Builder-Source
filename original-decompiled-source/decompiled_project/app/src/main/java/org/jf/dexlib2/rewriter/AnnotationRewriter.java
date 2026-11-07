package org.jf.dexlib2.rewriter;

import java.util.Set;
import org.jf.dexlib2.base.BaseAnnotation;
import org.jf.dexlib2.iface.Annotation;
import org.jf.dexlib2.iface.AnnotationElement;

/* loaded from: classes3.dex */
public class AnnotationRewriter implements Rewriter<Annotation> {
    protected final Rewriters rewriters;

    public class RewrittenAnnotation extends BaseAnnotation {
        protected Annotation annotation;

        public RewrittenAnnotation(Annotation annotation) {
            this.annotation = annotation;
        }

        @Override // org.jf.dexlib2.iface.Annotation, org.jf.dexlib2.iface.BasicAnnotation
        public Set<? extends AnnotationElement> getElements() {
            return RewriterUtils.rewriteSet(AnnotationRewriter.this.rewriters.getAnnotationElementRewriter(), this.annotation.getElements());
        }

        @Override // org.jf.dexlib2.iface.Annotation, org.jf.dexlib2.iface.BasicAnnotation
        public String getType() {
            return AnnotationRewriter.this.rewriters.getTypeRewriter().rewrite(this.annotation.getType());
        }

        @Override // org.jf.dexlib2.iface.Annotation
        public int getVisibility() {
            return this.annotation.getVisibility();
        }
    }

    public AnnotationRewriter(Rewriters rewriters) {
        this.rewriters = rewriters;
    }

    @Override // org.jf.dexlib2.rewriter.Rewriter
    public Annotation rewrite(Annotation annotation) {
        return new RewrittenAnnotation(annotation);
    }
}
