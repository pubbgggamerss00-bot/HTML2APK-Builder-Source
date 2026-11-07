package org.jf.dexlib2.writer.pool;

import org.jf.dexlib2.iface.reference.MethodProtoReference;
import org.jf.dexlib2.iface.reference.MethodReference;
import org.jf.dexlib2.writer.MethodSection;

/* loaded from: classes3.dex */
public class MethodPool extends BaseIndexPool<MethodReference> implements MethodSection<CharSequence, CharSequence, MethodProtoReference, MethodReference, PoolMethod> {
    public MethodPool(DexPool dexPool) {
        super(dexPool);
    }

    @Override // org.jf.dexlib2.writer.MethodSection
    public MethodReference getMethodReference(PoolMethod poolMethod) {
        return poolMethod;
    }

    public void intern(MethodReference methodReference) {
        if (((Integer) this.internedItems.put(methodReference, 0)) == null) {
            ((TypePool) this.dexPool.typeSection).intern(methodReference.getDefiningClass());
            ((ProtoPool) this.dexPool.protoSection).intern(new PoolMethodProto(methodReference));
            ((StringPool) this.dexPool.stringSection).intern(methodReference.getName());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.jf.dexlib2.writer.MethodSection
    public CharSequence getDefiningClass(MethodReference methodReference) {
        return methodReference.getDefiningClass();
    }

    @Override // org.jf.dexlib2.writer.MethodSection
    public int getMethodIndex(PoolMethod poolMethod) {
        return getItemIndex(poolMethod);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.jf.dexlib2.writer.MethodSection
    public CharSequence getName(MethodReference methodReference) {
        return methodReference.getName();
    }

    @Override // org.jf.dexlib2.writer.MethodSection
    public MethodProtoReference getPrototype(MethodReference methodReference) {
        return new PoolMethodProto(methodReference);
    }

    @Override // org.jf.dexlib2.writer.MethodSection
    public MethodProtoReference getPrototype(PoolMethod poolMethod) {
        return new PoolMethodProto(poolMethod);
    }
}
