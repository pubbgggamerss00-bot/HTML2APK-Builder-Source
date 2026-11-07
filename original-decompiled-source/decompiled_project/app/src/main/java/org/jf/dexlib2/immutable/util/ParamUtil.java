package org.jf.dexlib2.immutable.util;

import b6.a;
import java.util.Iterator;
import nc.v;
import org.bouncycastle.asn1.eac.EACTags;
import org.jf.dexlib2.immutable.ImmutableAnnotation;
import org.jf.dexlib2.immutable.ImmutableMethodParameter;

/* loaded from: classes3.dex */
public class ParamUtil {
    /* JADX INFO: Access modifiers changed from: private */
    public static int findTypeEnd(String str, int i10) {
        char cCharAt = str.charAt(i10);
        if (cCharAt != 'F') {
            if (cCharAt == 'L') {
                while (true) {
                    int i11 = i10 + 1;
                    if (str.charAt(i10) == ';') {
                        return i11;
                    }
                    i10 = i11;
                }
            } else if (cCharAt != 'S' && cCharAt != 'I' && cCharAt != 'J' && cCharAt != 'Z') {
                if (cCharAt != '[') {
                    switch (cCharAt) {
                        case EACTags.ADDRESS /* 66 */:
                        case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                        case 'D':
                            break;
                        default:
                            throw new IllegalArgumentException(a.b("Param string \"", str, "\" contains invalid type prefix: ", Character.toString(cCharAt)));
                    }
                } else {
                    while (true) {
                        int i12 = i10 + 1;
                        if (str.charAt(i10) == '[') {
                            return findTypeEnd(str, i12);
                        }
                        i10 = i12;
                    }
                }
            }
        }
        return i10 + 1;
    }

    public static Iterable<ImmutableMethodParameter> parseParamString(final String str) {
        return new Iterable<ImmutableMethodParameter>() { // from class: org.jf.dexlib2.immutable.util.ParamUtil.1
            @Override // java.lang.Iterable
            public Iterator<ImmutableMethodParameter> iterator() {
                return new Iterator<ImmutableMethodParameter>() { // from class: org.jf.dexlib2.immutable.util.ParamUtil.1.1
                    private int index = 0;

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return this.index < str.length();
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }

                    @Override // java.util.Iterator
                    public ImmutableMethodParameter next() {
                        int iFindTypeEnd = ParamUtil.findTypeEnd(str, this.index);
                        String strSubstring = str.substring(this.index, iFindTypeEnd);
                        this.index = iFindTypeEnd;
                        return new ImmutableMethodParameter(strSubstring, (v<? extends ImmutableAnnotation>) null, (String) null);
                    }
                };
            }
        };
    }
}
