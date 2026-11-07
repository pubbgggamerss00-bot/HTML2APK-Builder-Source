package org.jf.dexlib2.rewriter;

import java.util.Set;
import org.jf.dexlib2.HiddenApiRestriction;
import org.jf.dexlib2.base.reference.BaseFieldReference;
import org.jf.dexlib2.iface.Annotation;
import org.jf.dexlib2.iface.Field;
import org.jf.dexlib2.iface.value.EncodedValue;

/* loaded from: classes3.dex */
public class FieldRewriter implements Rewriter<Field> {
    protected final Rewriters rewriters;

    public class RewrittenField extends BaseFieldReference implements Field {
        protected Field field;

        public RewrittenField(Field field) {
            this.field = field;
        }

        @Override // org.jf.dexlib2.iface.Field, org.jf.dexlib2.iface.Member
        public int getAccessFlags() {
            return this.field.getAccessFlags();
        }

        @Override // org.jf.dexlib2.iface.Field, org.jf.dexlib2.iface.Annotatable
        public Set<? extends Annotation> getAnnotations() {
            return RewriterUtils.rewriteSet(FieldRewriter.this.rewriters.getAnnotationRewriter(), this.field.getAnnotations());
        }

        @Override // org.jf.dexlib2.iface.reference.FieldReference, org.jf.dexlib2.iface.Field, org.jf.dexlib2.iface.Member
        public String getDefiningClass() {
            return FieldRewriter.this.rewriters.getFieldReferenceRewriter().rewrite(this.field).getDefiningClass();
        }

        @Override // org.jf.dexlib2.iface.Field, org.jf.dexlib2.iface.Member
        public Set<HiddenApiRestriction> getHiddenApiRestrictions() {
            return this.field.getHiddenApiRestrictions();
        }

        @Override // org.jf.dexlib2.iface.Field
        public EncodedValue getInitialValue() {
            return (EncodedValue) RewriterUtils.rewriteNullable(FieldRewriter.this.rewriters.getEncodedValueRewriter(), this.field.getInitialValue());
        }

        @Override // org.jf.dexlib2.iface.reference.FieldReference, org.jf.dexlib2.iface.Field, org.jf.dexlib2.iface.Member
        public String getName() {
            return FieldRewriter.this.rewriters.getFieldReferenceRewriter().rewrite(this.field).getName();
        }

        @Override // org.jf.dexlib2.iface.reference.FieldReference, org.jf.dexlib2.iface.Field
        public String getType() {
            return FieldRewriter.this.rewriters.getFieldReferenceRewriter().rewrite(this.field).getType();
        }
    }

    public FieldRewriter(Rewriters rewriters) {
        this.rewriters = rewriters;
    }

    @Override // org.jf.dexlib2.rewriter.Rewriter
    public Field rewrite(Field field) {
        return new RewrittenField(field);
    }
}
