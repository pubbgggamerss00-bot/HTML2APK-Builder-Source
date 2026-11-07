package org.jf.dexlib2.immutable;

import java.util.Collection;
import nc.v;
import org.jf.dexlib2.base.BaseAnnotation;
import org.jf.dexlib2.iface.Annotation;
import org.jf.dexlib2.iface.AnnotationElement;
import org.jf.util.ImmutableConverter;
import org.jf.util.ImmutableUtils;

/* loaded from: classes3.dex */
public class ImmutableAnnotation extends BaseAnnotation {
    private static final ImmutableConverter<ImmutableAnnotation, Annotation> CONVERTER = new ImmutableConverter<ImmutableAnnotation, Annotation>() { // from class: org.jf.dexlib2.immutable.ImmutableAnnotation.1
        @Override // org.jf.util.ImmutableConverter
        public boolean isImmutable(Annotation annotation) {
            return annotation instanceof ImmutableAnnotation;
        }

        @Override // org.jf.util.ImmutableConverter
        public ImmutableAnnotation makeImmutable(Annotation annotation) {
            return ImmutableAnnotation.of(annotation);
        }
    };
    protected final v<? extends ImmutableAnnotationElement> elements;
    protected final String type;
    protected final int visibility;

    public ImmutableAnnotation(int i10, String str, Collection<? extends AnnotationElement> collection) {
        this.visibility = i10;
        this.type = str;
        this.elements = ImmutableAnnotationElement.immutableSetOf(collection);
    }

    public static v<ImmutableAnnotation> immutableSetOf(Iterable<? extends Annotation> iterable) {
        return CONVERTER.toSet(iterable);
    }

    public static ImmutableAnnotation of(Annotation annotation) {
        return annotation instanceof ImmutableAnnotation ? (ImmutableAnnotation) annotation : new ImmutableAnnotation(annotation.getVisibility(), annotation.getType(), annotation.getElements());
    }

    @Override // org.jf.dexlib2.iface.Annotation, org.jf.dexlib2.iface.BasicAnnotation
    public String getType() {
        return this.type;
    }

    @Override // org.jf.dexlib2.iface.Annotation
    public int getVisibility() {
        return this.visibility;
    }

    @Override // org.jf.dexlib2.iface.Annotation, org.jf.dexlib2.iface.BasicAnnotation
    public v<? extends ImmutableAnnotationElement> getElements() {
        return this.elements;
    }

    public ImmutableAnnotation(int i10, String str, v<? extends ImmutableAnnotationElement> vVar) {
        this.visibility = i10;
        this.type = str;
        this.elements = ImmutableUtils.nullToEmptySet(vVar);
    }
}
