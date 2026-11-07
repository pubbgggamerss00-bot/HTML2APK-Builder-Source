package org.jf.dexlib2.immutable;

import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
import nc.n0;
import nc.v;
import nc.w0;
import nc.y;
import org.jf.dexlib2.HiddenApiRestriction;
import org.jf.dexlib2.base.reference.BaseFieldReference;
import org.jf.dexlib2.iface.Annotation;
import org.jf.dexlib2.iface.Field;
import org.jf.dexlib2.iface.value.EncodedValue;
import org.jf.dexlib2.immutable.value.ImmutableEncodedValue;
import org.jf.dexlib2.immutable.value.ImmutableEncodedValueFactory;
import org.jf.util.ImmutableConverter;
import org.jf.util.ImmutableUtils;

/* loaded from: classes3.dex */
public class ImmutableField extends BaseFieldReference implements Field {
    private static final ImmutableConverter<ImmutableField, Field> CONVERTER = new ImmutableConverter<ImmutableField, Field>() { // from class: org.jf.dexlib2.immutable.ImmutableField.1
        @Override // org.jf.util.ImmutableConverter
        public boolean isImmutable(Field field) {
            return field instanceof ImmutableField;
        }

        @Override // org.jf.util.ImmutableConverter
        public ImmutableField makeImmutable(Field field) {
            return ImmutableField.of(field);
        }
    };
    protected final int accessFlags;
    protected final v<? extends ImmutableAnnotation> annotations;
    protected final String definingClass;
    protected final v<HiddenApiRestriction> hiddenApiRestrictions;
    protected final ImmutableEncodedValue initialValue;
    protected final String name;
    protected final String type;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ImmutableField(String str, String str2, String str3, int i10, EncodedValue encodedValue, Collection<? extends Annotation> collection, Set<HiddenApiRestriction> set) {
        v<HiddenApiRestriction> vVarJ;
        this.definingClass = str;
        this.name = str2;
        this.type = str3;
        this.accessFlags = i10;
        this.initialValue = ImmutableEncodedValueFactory.ofNullable(encodedValue);
        this.annotations = ImmutableAnnotation.immutableSetOf(collection);
        if (set == null) {
            int i11 = v.f18759c;
            vVarJ = w0.f18781j;
        } else {
            Set<HiddenApiRestriction> set2 = set;
            int i12 = v.f18759c;
            if (!(set2 instanceof v) || (set2 instanceof SortedSet)) {
                Object[] array = set2.toArray();
                vVarJ = v.j(array.length, array);
            } else {
                vVarJ = (v) set2;
                if (vVarJ.f()) {
                }
            }
        }
        this.hiddenApiRestrictions = vVarJ;
    }

    public static y<ImmutableField> immutableSetOf(Iterable<? extends Field> iterable) {
        return CONVERTER.toSortedSet(n0.f18723a, iterable);
    }

    public static ImmutableField of(Field field) {
        return field instanceof ImmutableField ? (ImmutableField) field : new ImmutableField(field.getDefiningClass(), field.getName(), field.getType(), field.getAccessFlags(), field.getInitialValue(), field.getAnnotations(), field.getHiddenApiRestrictions());
    }

    @Override // org.jf.dexlib2.iface.Field, org.jf.dexlib2.iface.Member
    public int getAccessFlags() {
        return this.accessFlags;
    }

    @Override // org.jf.dexlib2.iface.reference.FieldReference, org.jf.dexlib2.iface.Field, org.jf.dexlib2.iface.Member
    public String getDefiningClass() {
        return this.definingClass;
    }

    @Override // org.jf.dexlib2.iface.Field, org.jf.dexlib2.iface.Member
    public Set<HiddenApiRestriction> getHiddenApiRestrictions() {
        return this.hiddenApiRestrictions;
    }

    @Override // org.jf.dexlib2.iface.Field
    public EncodedValue getInitialValue() {
        return this.initialValue;
    }

    @Override // org.jf.dexlib2.iface.reference.FieldReference, org.jf.dexlib2.iface.Field, org.jf.dexlib2.iface.Member
    public String getName() {
        return this.name;
    }

    @Override // org.jf.dexlib2.iface.reference.FieldReference, org.jf.dexlib2.iface.Field
    public String getType() {
        return this.type;
    }

    @Override // org.jf.dexlib2.iface.Field, org.jf.dexlib2.iface.Annotatable
    public v<? extends ImmutableAnnotation> getAnnotations() {
        return this.annotations;
    }

    public ImmutableField(String str, String str2, String str3, int i10, ImmutableEncodedValue immutableEncodedValue, v<? extends ImmutableAnnotation> vVar, v<HiddenApiRestriction> vVar2) {
        this.definingClass = str;
        this.name = str2;
        this.type = str3;
        this.accessFlags = i10;
        this.initialValue = immutableEncodedValue;
        this.annotations = ImmutableUtils.nullToEmptySet(vVar);
        this.hiddenApiRestrictions = ImmutableUtils.nullToEmptySet(vVar2);
    }
}
