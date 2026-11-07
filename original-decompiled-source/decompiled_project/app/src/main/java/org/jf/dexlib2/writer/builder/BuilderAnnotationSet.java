package org.jf.dexlib2.writer.builder;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;
import nc.w0;

/* loaded from: classes3.dex */
public class BuilderAnnotationSet extends AbstractSet<BuilderAnnotation> {
    public static final BuilderAnnotationSet EMPTY = new BuilderAnnotationSet(w0.f18781j);
    final Set<BuilderAnnotation> annotations;
    int offset = 0;

    public BuilderAnnotationSet(Set<BuilderAnnotation> set) {
        this.annotations = set;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<BuilderAnnotation> iterator() {
        return this.annotations.iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.annotations.size();
    }
}
