package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class r0 implements Iterator {
    public String s;

    /* renamed from: u, reason: collision with root package name */
    public final String f11877u;

    /* renamed from: t, reason: collision with root package name */
    public int f11876t = 2;

    /* renamed from: v, reason: collision with root package name */
    public int f11878v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f11879w = Integer.MAX_VALUE;

    public r0(String str) {
        this.f11877u = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i6;
        int i7 = this.f11876t;
        if (i7 == 4) {
            throw new IllegalStateException();
        }
        int i8 = i7 - 1;
        String string = null;
        if (i7 == 0) {
            throw null;
        }
        if (i8 == 0) {
            return true;
        }
        if (i8 != 2) {
            this.f11876t = 4;
            int i9 = this.f11878v;
            while (true) {
                int length = this.f11878v;
                if (length == -1) {
                    this.f11876t = 3;
                    break;
                }
                String str = this.f11877u;
                int length2 = str.length();
                q0.b(length, length2);
                while (true) {
                    if (length >= length2) {
                        length = -1;
                        break;
                    }
                    if (str.charAt(length) == ',') {
                        break;
                    }
                    length++;
                }
                if (length == -1) {
                    length = str.length();
                    this.f11878v = -1;
                    i6 = -1;
                } else {
                    i6 = length + 1;
                    this.f11878v = i6;
                }
                if (i6 == i9) {
                    int i10 = i6 + 1;
                    this.f11878v = i10;
                    if (i10 > str.length()) {
                        this.f11878v = -1;
                    }
                } else {
                    if (i9 < length) {
                        str.charAt(i9);
                    }
                    if (i9 < length) {
                        str.charAt(length - 1);
                    }
                    int i11 = this.f11879w;
                    if (i11 == 1) {
                        length = str.length();
                        this.f11878v = -1;
                        if (length > i9) {
                            str.charAt(length - 1);
                        }
                    } else {
                        this.f11879w = i11 - 1;
                    }
                    string = str.subSequence(i9, length).toString();
                }
            }
            this.s = string;
            if (this.f11876t != 3) {
                this.f11876t = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f11876t = 2;
        String str = this.s;
        this.s = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
