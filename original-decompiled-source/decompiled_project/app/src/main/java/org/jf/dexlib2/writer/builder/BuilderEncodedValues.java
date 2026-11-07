package org.jf.dexlib2.writer.builder;

import com.yalantis.ucrop.view.CropImageView;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.eac.EACTags;
import org.jf.dexlib2.base.value.BaseAnnotationEncodedValue;
import org.jf.dexlib2.base.value.BaseArrayEncodedValue;
import org.jf.dexlib2.base.value.BaseBooleanEncodedValue;
import org.jf.dexlib2.base.value.BaseEnumEncodedValue;
import org.jf.dexlib2.base.value.BaseFieldEncodedValue;
import org.jf.dexlib2.base.value.BaseMethodEncodedValue;
import org.jf.dexlib2.base.value.BaseMethodHandleEncodedValue;
import org.jf.dexlib2.base.value.BaseMethodTypeEncodedValue;
import org.jf.dexlib2.base.value.BaseNullEncodedValue;
import org.jf.dexlib2.base.value.BaseStringEncodedValue;
import org.jf.dexlib2.base.value.BaseTypeEncodedValue;
import org.jf.dexlib2.iface.value.EncodedValue;
import org.jf.dexlib2.immutable.value.ImmutableByteEncodedValue;
import org.jf.dexlib2.immutable.value.ImmutableCharEncodedValue;
import org.jf.dexlib2.immutable.value.ImmutableDoubleEncodedValue;
import org.jf.dexlib2.immutable.value.ImmutableFloatEncodedValue;
import org.jf.dexlib2.immutable.value.ImmutableIntEncodedValue;
import org.jf.dexlib2.immutable.value.ImmutableLongEncodedValue;
import org.jf.dexlib2.immutable.value.ImmutableShortEncodedValue;
import org.jf.util.ExceptionWithContext;

/* loaded from: classes3.dex */
public abstract class BuilderEncodedValues {

    public static class BuilderAnnotationEncodedValue extends BaseAnnotationEncodedValue implements BuilderEncodedValue {
        final Set<? extends BuilderAnnotationElement> elements;
        final BuilderTypeReference typeReference;

        public BuilderAnnotationEncodedValue(BuilderTypeReference builderTypeReference, Set<? extends BuilderAnnotationElement> set) {
            this.typeReference = builderTypeReference;
            this.elements = set;
        }

        @Override // org.jf.dexlib2.iface.value.AnnotationEncodedValue, org.jf.dexlib2.iface.BasicAnnotation
        public Set<? extends BuilderAnnotationElement> getElements() {
            return this.elements;
        }

        @Override // org.jf.dexlib2.iface.value.AnnotationEncodedValue, org.jf.dexlib2.iface.BasicAnnotation
        public String getType() {
            return this.typeReference.getType();
        }
    }

    public static class BuilderArrayEncodedValue extends BaseArrayEncodedValue implements BuilderEncodedValue {
        final List<? extends BuilderEncodedValue> elements;
        int offset = 0;

        public BuilderArrayEncodedValue(List<? extends BuilderEncodedValue> list) {
            this.elements = list;
        }

        @Override // org.jf.dexlib2.iface.value.ArrayEncodedValue
        public List<? extends EncodedValue> getValue() {
            return this.elements;
        }
    }

    public static class BuilderBooleanEncodedValue extends BaseBooleanEncodedValue implements BuilderEncodedValue {
        private final boolean value;
        public static final BuilderBooleanEncodedValue TRUE_VALUE = new BuilderBooleanEncodedValue(true);
        public static final BuilderBooleanEncodedValue FALSE_VALUE = new BuilderBooleanEncodedValue(false);

        private BuilderBooleanEncodedValue(boolean z10) {
            this.value = z10;
        }

        @Override // org.jf.dexlib2.iface.value.BooleanEncodedValue
        public boolean getValue() {
            return this.value;
        }
    }

    public static class BuilderByteEncodedValue extends ImmutableByteEncodedValue implements BuilderEncodedValue {
        public BuilderByteEncodedValue(byte b10) {
            super(b10);
        }
    }

    public static class BuilderCharEncodedValue extends ImmutableCharEncodedValue implements BuilderEncodedValue {
        public BuilderCharEncodedValue(char c10) {
            super(c10);
        }
    }

    public static class BuilderDoubleEncodedValue extends ImmutableDoubleEncodedValue implements BuilderEncodedValue {
        public BuilderDoubleEncodedValue(double d10) {
            super(d10);
        }
    }

    public interface BuilderEncodedValue extends EncodedValue {
    }

    public static class BuilderEnumEncodedValue extends BaseEnumEncodedValue implements BuilderEncodedValue {
        final BuilderFieldReference enumReference;

        public BuilderEnumEncodedValue(BuilderFieldReference builderFieldReference) {
            this.enumReference = builderFieldReference;
        }

        @Override // org.jf.dexlib2.iface.value.EnumEncodedValue
        public BuilderFieldReference getValue() {
            return this.enumReference;
        }
    }

    public static class BuilderFieldEncodedValue extends BaseFieldEncodedValue implements BuilderEncodedValue {
        final BuilderFieldReference fieldReference;

        public BuilderFieldEncodedValue(BuilderFieldReference builderFieldReference) {
            this.fieldReference = builderFieldReference;
        }

        @Override // org.jf.dexlib2.iface.value.FieldEncodedValue
        public BuilderFieldReference getValue() {
            return this.fieldReference;
        }
    }

    public static class BuilderFloatEncodedValue extends ImmutableFloatEncodedValue implements BuilderEncodedValue {
        public BuilderFloatEncodedValue(float f10) {
            super(f10);
        }
    }

    public static class BuilderIntEncodedValue extends ImmutableIntEncodedValue implements BuilderEncodedValue {
        public BuilderIntEncodedValue(int i10) {
            super(i10);
        }
    }

    public static class BuilderLongEncodedValue extends ImmutableLongEncodedValue implements BuilderEncodedValue {
        public BuilderLongEncodedValue(long j10) {
            super(j10);
        }
    }

    public static class BuilderMethodEncodedValue extends BaseMethodEncodedValue implements BuilderEncodedValue {
        final BuilderMethodReference methodReference;

        public BuilderMethodEncodedValue(BuilderMethodReference builderMethodReference) {
            this.methodReference = builderMethodReference;
        }

        @Override // org.jf.dexlib2.iface.value.MethodEncodedValue
        public BuilderMethodReference getValue() {
            return this.methodReference;
        }
    }

    public static class BuilderMethodHandleEncodedValue extends BaseMethodHandleEncodedValue implements BuilderEncodedValue {
        final BuilderMethodHandleReference methodHandleReference;

        public BuilderMethodHandleEncodedValue(BuilderMethodHandleReference builderMethodHandleReference) {
            this.methodHandleReference = builderMethodHandleReference;
        }

        @Override // org.jf.dexlib2.iface.value.MethodHandleEncodedValue
        public BuilderMethodHandleReference getValue() {
            return this.methodHandleReference;
        }
    }

    public static class BuilderMethodTypeEncodedValue extends BaseMethodTypeEncodedValue implements BuilderEncodedValue {
        final BuilderMethodProtoReference methodProtoReference;

        public BuilderMethodTypeEncodedValue(BuilderMethodProtoReference builderMethodProtoReference) {
            this.methodProtoReference = builderMethodProtoReference;
        }

        @Override // org.jf.dexlib2.iface.value.MethodTypeEncodedValue
        public BuilderMethodProtoReference getValue() {
            return this.methodProtoReference;
        }
    }

    public static class BuilderNullEncodedValue extends BaseNullEncodedValue implements BuilderEncodedValue {
        public static final BuilderNullEncodedValue INSTANCE = new BuilderNullEncodedValue();

        private BuilderNullEncodedValue() {
        }
    }

    public static class BuilderShortEncodedValue extends ImmutableShortEncodedValue implements BuilderEncodedValue {
        public BuilderShortEncodedValue(short s10) {
            super(s10);
        }
    }

    public static class BuilderStringEncodedValue extends BaseStringEncodedValue implements BuilderEncodedValue {
        final BuilderStringReference stringReference;

        public BuilderStringEncodedValue(BuilderStringReference builderStringReference) {
            this.stringReference = builderStringReference;
        }

        @Override // org.jf.dexlib2.iface.value.StringEncodedValue
        public String getValue() {
            return this.stringReference.getString();
        }
    }

    public static class BuilderTypeEncodedValue extends BaseTypeEncodedValue implements BuilderEncodedValue {
        final BuilderTypeReference typeReference;

        public BuilderTypeEncodedValue(BuilderTypeReference builderTypeReference) {
            this.typeReference = builderTypeReference;
        }

        @Override // org.jf.dexlib2.iface.value.TypeEncodedValue
        public String getValue() {
            return this.typeReference.getType();
        }
    }

    public static BuilderEncodedValue defaultValueForType(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == 'F') {
            return new BuilderFloatEncodedValue(CropImageView.DEFAULT_ASPECT_RATIO);
        }
        if (cCharAt != 'L') {
            if (cCharAt == 'S') {
                return new BuilderShortEncodedValue((short) 0);
            }
            if (cCharAt == 'I') {
                return new BuilderIntEncodedValue(0);
            }
            if (cCharAt == 'J') {
                return new BuilderLongEncodedValue(0L);
            }
            if (cCharAt == 'Z') {
                return BuilderBooleanEncodedValue.FALSE_VALUE;
            }
            if (cCharAt != '[') {
                switch (cCharAt) {
                    case EACTags.ADDRESS /* 66 */:
                        return new BuilderByteEncodedValue((byte) 0);
                    case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                        return new BuilderCharEncodedValue((char) 0);
                    case 'D':
                        return new BuilderDoubleEncodedValue(0.0d);
                    default:
                        throw new ExceptionWithContext("Unrecognized type: %s", str);
                }
            }
        }
        return BuilderNullEncodedValue.INSTANCE;
    }
}
