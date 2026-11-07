package org.jf.dexlib2.immutable.reference;

import java.util.List;
import nc.r;
import org.jf.dexlib2.base.reference.BaseTypeReference;
import org.jf.dexlib2.iface.reference.TypeReference;
import org.jf.util.ImmutableConverter;

/* loaded from: classes3.dex */
public class ImmutableTypeReference extends BaseTypeReference implements ImmutableReference {
    private static final ImmutableConverter<ImmutableTypeReference, TypeReference> CONVERTER = new ImmutableConverter<ImmutableTypeReference, TypeReference>() { // from class: org.jf.dexlib2.immutable.reference.ImmutableTypeReference.1
        @Override // org.jf.util.ImmutableConverter
        public boolean isImmutable(TypeReference typeReference) {
            return typeReference instanceof ImmutableTypeReference;
        }

        @Override // org.jf.util.ImmutableConverter
        public ImmutableTypeReference makeImmutable(TypeReference typeReference) {
            return ImmutableTypeReference.of(typeReference);
        }
    };
    protected final String type;

    public ImmutableTypeReference(String str) {
        this.type = str;
    }

    public static r<ImmutableTypeReference> immutableListOf(List<? extends TypeReference> list) {
        return CONVERTER.toList(list);
    }

    public static ImmutableTypeReference of(TypeReference typeReference) {
        return typeReference instanceof ImmutableTypeReference ? (ImmutableTypeReference) typeReference : new ImmutableTypeReference(typeReference.getType());
    }

    @Override // org.jf.dexlib2.iface.reference.TypeReference, org.jf.dexlib2.iface.ClassDef
    public String getType() {
        return this.type;
    }
}
