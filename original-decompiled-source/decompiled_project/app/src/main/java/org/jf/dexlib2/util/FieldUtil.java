package org.jf.dexlib2.util;

import lc.l;
import org.jf.dexlib2.AccessFlags;
import org.jf.dexlib2.iface.Field;

/* loaded from: classes3.dex */
public final class FieldUtil {
    public static l<Field> FIELD_IS_STATIC = new l<Field>() { // from class: org.jf.dexlib2.util.FieldUtil.1
        @Override // lc.l
        public boolean apply(Field field) {
            return field != null && FieldUtil.isStatic(field);
        }
    };
    public static l<Field> FIELD_IS_INSTANCE = new l<Field>() { // from class: org.jf.dexlib2.util.FieldUtil.2
        @Override // lc.l
        public boolean apply(Field field) {
            return (field == null || FieldUtil.isStatic(field)) ? false : true;
        }
    };

    private FieldUtil() {
    }

    public static boolean isStatic(Field field) {
        return AccessFlags.STATIC.isSet(field.getAccessFlags());
    }
}
