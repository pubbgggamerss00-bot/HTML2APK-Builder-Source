package org.jf.dexlib2.base.reference;

import org.jf.dexlib2.iface.reference.StringReference;

/* loaded from: classes3.dex */
public abstract class BaseStringReference extends BaseReference implements StringReference {
    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return getString().charAt(i10);
    }

    @Override // org.jf.dexlib2.iface.reference.StringReference
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof StringReference)) {
            return false;
        }
        return getString().equals(((StringReference) obj).getString());
    }

    @Override // org.jf.dexlib2.iface.reference.StringReference
    public int hashCode() {
        return getString().hashCode();
    }

    @Override // java.lang.CharSequence
    public int length() {
        return getString().length();
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return getString().subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return getString();
    }

    @Override // org.jf.dexlib2.iface.reference.StringReference, java.lang.Comparable
    public int compareTo(CharSequence charSequence) {
        return getString().compareTo(charSequence.toString());
    }
}
