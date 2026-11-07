package org.jf.dexlib2.writer.util;

import i0.u2;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import lc.e;
import lc.l;
import nc.d0;
import nc.k;
import org.jf.dexlib2.base.value.BaseArrayEncodedValue;
import org.jf.dexlib2.iface.Field;
import org.jf.dexlib2.iface.value.ArrayEncodedValue;
import org.jf.dexlib2.iface.value.EncodedValue;
import org.jf.dexlib2.immutable.value.ImmutableEncodedValueFactory;
import org.jf.dexlib2.util.EncodedValueUtils;
import org.jf.util.AbstractForwardSequentialList;
import org.jf.util.CollectionUtils;

/* loaded from: classes3.dex */
public class StaticInitializerUtil {
    private static final l<Field> HAS_INITIALIZER = new l<Field>() { // from class: org.jf.dexlib2.writer.util.StaticInitializerUtil.2
        @Override // lc.l
        public boolean apply(Field field) {
            EncodedValue initialValue = field.getInitialValue();
            return (initialValue == null || EncodedValueUtils.isDefaultValue(initialValue)) ? false : true;
        }
    };
    private static final e<Field, EncodedValue> GET_INITIAL_VALUE = new e<Field, EncodedValue>() { // from class: org.jf.dexlib2.writer.util.StaticInitializerUtil.3
        @Override // lc.e
        public EncodedValue apply(Field field) {
            EncodedValue initialValue = field.getInitialValue();
            return initialValue == null ? ImmutableEncodedValueFactory.defaultValueForType(field.getType()) : initialValue;
        }
    };

    public static ArrayEncodedValue getStaticInitializers(final SortedSet<? extends Field> sortedSet) {
        final int iLastIndexOf = CollectionUtils.lastIndexOf(sortedSet, HAS_INITIALIZER);
        if (iLastIndexOf > -1) {
            return new BaseArrayEncodedValue() { // from class: org.jf.dexlib2.writer.util.StaticInitializerUtil.1
                @Override // org.jf.dexlib2.iface.value.ArrayEncodedValue
                public List<? extends EncodedValue> getValue() {
                    return new AbstractForwardSequentialList<EncodedValue>() { // from class: org.jf.dexlib2.writer.util.StaticInitializerUtil.1.1
                        @Override // org.jf.util.AbstractForwardSequentialList, java.util.AbstractSequentialList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
                        public Iterator<EncodedValue> iterator() {
                            k kVarA = k.a(sortedSet);
                            int i10 = iLastIndexOf + 1;
                            Iterable iterable = (Iterable) kVarA.f18706a.a(kVarA);
                            iterable.getClass();
                            if (!(i10 >= 0)) {
                                throw new IllegalArgumentException("limit is negative");
                            }
                            k kVarA2 = k.a(new d0(iterable, i10));
                            return k.a(u2.j((Iterable) kVarA2.f18706a.a(kVarA2), StaticInitializerUtil.GET_INITIAL_VALUE)).iterator();
                        }

                        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                        public int size() {
                            return iLastIndexOf + 1;
                        }
                    };
                }
            };
        }
        return null;
    }
}
