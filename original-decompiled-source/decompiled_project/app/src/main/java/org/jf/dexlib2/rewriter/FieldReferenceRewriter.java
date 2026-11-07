package org.jf.dexlib2.rewriter;

import org.jf.dexlib2.base.reference.BaseFieldReference;
import org.jf.dexlib2.iface.reference.FieldReference;

/* loaded from: classes3.dex */
public class FieldReferenceRewriter implements Rewriter<FieldReference> {
    protected final Rewriters rewriters;

    public class RewrittenFieldReference extends BaseFieldReference {
        protected FieldReference fieldReference;

        public RewrittenFieldReference(FieldReference fieldReference) {
            this.fieldReference = fieldReference;
        }

        @Override // org.jf.dexlib2.iface.reference.FieldReference, org.jf.dexlib2.iface.Field, org.jf.dexlib2.iface.Member
        public String getDefiningClass() {
            return FieldReferenceRewriter.this.rewriters.getTypeRewriter().rewrite(this.fieldReference.getDefiningClass());
        }

        @Override // org.jf.dexlib2.iface.reference.FieldReference, org.jf.dexlib2.iface.Field, org.jf.dexlib2.iface.Member
        public String getName() {
            return this.fieldReference.getName();
        }

        @Override // org.jf.dexlib2.iface.reference.FieldReference, org.jf.dexlib2.iface.Field
        public String getType() {
            return FieldReferenceRewriter.this.rewriters.getTypeRewriter().rewrite(this.fieldReference.getType());
        }
    }

    public FieldReferenceRewriter(Rewriters rewriters) {
        this.rewriters = rewriters;
    }

    @Override // org.jf.dexlib2.rewriter.Rewriter
    public FieldReference rewrite(FieldReference fieldReference) {
        return new RewrittenFieldReference(fieldReference);
    }
}
