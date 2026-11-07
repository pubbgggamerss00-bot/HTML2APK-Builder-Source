package org.jf.dexlib2.rewriter;

import java.util.List;
import java.util.Set;
import org.jf.dexlib2.base.value.BaseAnnotationEncodedValue;
import org.jf.dexlib2.base.value.BaseArrayEncodedValue;
import org.jf.dexlib2.base.value.BaseEnumEncodedValue;
import org.jf.dexlib2.base.value.BaseFieldEncodedValue;
import org.jf.dexlib2.base.value.BaseMethodEncodedValue;
import org.jf.dexlib2.base.value.BaseTypeEncodedValue;
import org.jf.dexlib2.iface.AnnotationElement;
import org.jf.dexlib2.iface.reference.FieldReference;
import org.jf.dexlib2.iface.reference.MethodReference;
import org.jf.dexlib2.iface.value.AnnotationEncodedValue;
import org.jf.dexlib2.iface.value.ArrayEncodedValue;
import org.jf.dexlib2.iface.value.EncodedValue;
import org.jf.dexlib2.iface.value.EnumEncodedValue;
import org.jf.dexlib2.iface.value.FieldEncodedValue;
import org.jf.dexlib2.iface.value.MethodEncodedValue;
import org.jf.dexlib2.iface.value.TypeEncodedValue;

/* loaded from: classes3.dex */
public class EncodedValueRewriter implements Rewriter<EncodedValue> {
    protected final Rewriters rewriters;

    public class RewrittenAnnotationEncodedValue extends BaseAnnotationEncodedValue {
        protected AnnotationEncodedValue annotationEncodedValue;

        public RewrittenAnnotationEncodedValue(AnnotationEncodedValue annotationEncodedValue) {
            this.annotationEncodedValue = annotationEncodedValue;
        }

        @Override // org.jf.dexlib2.iface.value.AnnotationEncodedValue, org.jf.dexlib2.iface.BasicAnnotation
        public Set<? extends AnnotationElement> getElements() {
            return RewriterUtils.rewriteSet(EncodedValueRewriter.this.rewriters.getAnnotationElementRewriter(), this.annotationEncodedValue.getElements());
        }

        @Override // org.jf.dexlib2.iface.value.AnnotationEncodedValue, org.jf.dexlib2.iface.BasicAnnotation
        public String getType() {
            return EncodedValueRewriter.this.rewriters.getTypeRewriter().rewrite(this.annotationEncodedValue.getType());
        }
    }

    public class RewrittenArrayEncodedValue extends BaseArrayEncodedValue {
        protected ArrayEncodedValue arrayEncodedValue;

        public RewrittenArrayEncodedValue(ArrayEncodedValue arrayEncodedValue) {
            this.arrayEncodedValue = arrayEncodedValue;
        }

        @Override // org.jf.dexlib2.iface.value.ArrayEncodedValue
        public List<? extends EncodedValue> getValue() {
            return RewriterUtils.rewriteList(EncodedValueRewriter.this.rewriters.getEncodedValueRewriter(), this.arrayEncodedValue.getValue());
        }
    }

    public class RewrittenEnumEncodedValue extends BaseEnumEncodedValue {
        protected EnumEncodedValue enumEncodedValue;

        public RewrittenEnumEncodedValue(EnumEncodedValue enumEncodedValue) {
            this.enumEncodedValue = enumEncodedValue;
        }

        @Override // org.jf.dexlib2.iface.value.EnumEncodedValue
        public FieldReference getValue() {
            return EncodedValueRewriter.this.rewriters.getFieldReferenceRewriter().rewrite(this.enumEncodedValue.getValue());
        }
    }

    public class RewrittenFieldEncodedValue extends BaseFieldEncodedValue {
        protected FieldEncodedValue fieldEncodedValue;

        public RewrittenFieldEncodedValue(FieldEncodedValue fieldEncodedValue) {
            this.fieldEncodedValue = fieldEncodedValue;
        }

        @Override // org.jf.dexlib2.iface.value.FieldEncodedValue
        public FieldReference getValue() {
            return EncodedValueRewriter.this.rewriters.getFieldReferenceRewriter().rewrite(this.fieldEncodedValue.getValue());
        }
    }

    public class RewrittenMethodEncodedValue extends BaseMethodEncodedValue {
        protected MethodEncodedValue methodEncodedValue;

        public RewrittenMethodEncodedValue(MethodEncodedValue methodEncodedValue) {
            this.methodEncodedValue = methodEncodedValue;
        }

        @Override // org.jf.dexlib2.iface.value.MethodEncodedValue
        public MethodReference getValue() {
            return EncodedValueRewriter.this.rewriters.getMethodReferenceRewriter().rewrite(this.methodEncodedValue.getValue());
        }
    }

    public class RewrittenTypeEncodedValue extends BaseTypeEncodedValue {
        protected TypeEncodedValue typeEncodedValue;

        public RewrittenTypeEncodedValue(TypeEncodedValue typeEncodedValue) {
            this.typeEncodedValue = typeEncodedValue;
        }

        @Override // org.jf.dexlib2.iface.value.TypeEncodedValue
        public String getValue() {
            return EncodedValueRewriter.this.rewriters.getTypeRewriter().rewrite(this.typeEncodedValue.getValue());
        }
    }

    public EncodedValueRewriter(Rewriters rewriters) {
        this.rewriters = rewriters;
    }

    @Override // org.jf.dexlib2.rewriter.Rewriter
    public EncodedValue rewrite(EncodedValue encodedValue) {
        switch (encodedValue.getValueType()) {
            case 24:
                return new RewrittenTypeEncodedValue((TypeEncodedValue) encodedValue);
            case 25:
                return new RewrittenFieldEncodedValue((FieldEncodedValue) encodedValue);
            case 26:
                return new RewrittenMethodEncodedValue((MethodEncodedValue) encodedValue);
            case 27:
                return new RewrittenEnumEncodedValue((EnumEncodedValue) encodedValue);
            case 28:
                return new RewrittenArrayEncodedValue((ArrayEncodedValue) encodedValue);
            case 29:
                return new RewrittenAnnotationEncodedValue((AnnotationEncodedValue) encodedValue);
            default:
                return encodedValue;
        }
    }
}
