package org.bouncycastle.asn1.eac;

import java.util.Enumeration;
import java.util.Hashtable;

/* loaded from: classes2.dex */
public class Flags {
    int value;

    public static class StringJoiner {
        boolean First = true;

        /* renamed from: b, reason: collision with root package name */
        StringBuffer f19831b = new StringBuffer();
        String mSeparator;

        public StringJoiner(String str) {
            this.mSeparator = str;
        }

        public void add(String str) {
            if (this.First) {
                this.First = false;
            } else {
                this.f19831b.append(this.mSeparator);
            }
            this.f19831b.append(str);
        }

        public String toString() {
            return this.f19831b.toString();
        }
    }

    public Flags() {
        this.value = 0;
    }

    public String decode(Hashtable hashtable) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        Enumeration enumerationKeys = hashtable.keys();
        while (enumerationKeys.hasMoreElements()) {
            Integer num = (Integer) enumerationKeys.nextElement();
            if (isSet(num.intValue())) {
                stringJoiner.add((String) hashtable.get(num));
            }
        }
        return stringJoiner.toString();
    }

    public int getFlags() {
        return this.value;
    }

    public boolean isSet(int i10) {
        return (i10 & this.value) != 0;
    }

    public void set(int i10) {
        this.value = i10 | this.value;
    }

    public Flags(int i10) {
        this.value = i10;
    }
}
