package org.jf.dexlib2.writer.builder;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import lc.e;
import nc.g0;
import nc.v;
import org.jf.dexlib2.iface.Annotation;
import org.jf.dexlib2.writer.AnnotationSetSection;

/* loaded from: classes3.dex */
class BuilderAnnotationSetPool extends BaseBuilderPool implements AnnotationSetSection<BuilderAnnotation, BuilderAnnotationSet> {
    private final ConcurrentMap<Set<? extends Annotation>, BuilderAnnotationSet> internedItems;

    public BuilderAnnotationSetPool(DexBuilder dexBuilder) {
        super(dexBuilder);
        this.internedItems = new ConcurrentHashMap();
    }

    @Override // org.jf.dexlib2.writer.OffsetSection
    public Collection<? extends Map.Entry<? extends BuilderAnnotationSet, Integer>> getItems() {
        return new BuilderMapEntryCollection<BuilderAnnotationSet>(this.internedItems.values()) { // from class: org.jf.dexlib2.writer.builder.BuilderAnnotationSetPool.2
            @Override // org.jf.dexlib2.writer.builder.BuilderMapEntryCollection
            public int getValue(BuilderAnnotationSet builderAnnotationSet) {
                return builderAnnotationSet.offset;
            }

            @Override // org.jf.dexlib2.writer.builder.BuilderMapEntryCollection
            public int setValue(BuilderAnnotationSet builderAnnotationSet, int i10) {
                int i11 = builderAnnotationSet.offset;
                builderAnnotationSet.offset = i10;
                return i11;
            }
        };
    }

    public BuilderAnnotationSet internAnnotationSet(Set<? extends Annotation> set) {
        if (set == null) {
            return BuilderAnnotationSet.EMPTY;
        }
        BuilderAnnotationSet builderAnnotationSet = this.internedItems.get(set);
        if (builderAnnotationSet != null) {
            return builderAnnotationSet;
        }
        BuilderAnnotationSet builderAnnotationSet2 = new BuilderAnnotationSet(v.k(new g0(set.iterator(), new e<Annotation, BuilderAnnotation>() { // from class: org.jf.dexlib2.writer.builder.BuilderAnnotationSetPool.1
            @Override // lc.e
            public BuilderAnnotation apply(Annotation annotation) {
                return ((BuilderAnnotationPool) BuilderAnnotationSetPool.this.dexBuilder.annotationSection).internAnnotation(annotation);
            }
        })));
        BuilderAnnotationSet builderAnnotationSetPutIfAbsent = this.internedItems.putIfAbsent(builderAnnotationSet2, builderAnnotationSet2);
        return builderAnnotationSetPutIfAbsent == null ? builderAnnotationSet2 : builderAnnotationSetPutIfAbsent;
    }

    @Override // org.jf.dexlib2.writer.AnnotationSetSection
    public Collection<? extends BuilderAnnotation> getAnnotations(BuilderAnnotationSet builderAnnotationSet) {
        return builderAnnotationSet.annotations;
    }

    @Override // org.jf.dexlib2.writer.OffsetSection
    public int getItemOffset(BuilderAnnotationSet builderAnnotationSet) {
        return builderAnnotationSet.offset;
    }

    @Override // org.jf.dexlib2.writer.NullableOffsetSection
    public int getNullableItemOffset(BuilderAnnotationSet builderAnnotationSet) {
        if (builderAnnotationSet == null) {
            return 0;
        }
        return builderAnnotationSet.offset;
    }
}
